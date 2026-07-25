package com.aquabill.notification_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.aquabill.notification_service.model.Notification;
import com.aquabill.notification_service.service.NotificationService;

@RestController
@RequestMapping("/notifications")
public class NotificationController {

    @Autowired
    private NotificationService notificationService;


    // CREATE notification
    @PostMapping
    public Notification createNotification(@RequestBody Notification notification) {
        return notificationService.createNotification(notification);
    }


    // GET all notifications
    @GetMapping
    public List<Notification> getAllNotifications() {
        return notificationService.getAllNotifications();
    }


    // GET notification by ID
    @GetMapping("/{id}")
    public Notification getNotificationById(@PathVariable Long id) {
        return notificationService.getNotificationById(id);
    }


    // UPDATE notification
    @PutMapping("/{id}")
    public Notification updateNotification(
        @PathVariable Long id,
        @RequestBody Notification notification) {

    return notificationService.updateNotification(id, notification);
}
    // DELETE notification
    @DeleteMapping("/{id}")
    public String deleteNotification(@PathVariable Long id) {
        return notificationService.deleteNotification(id);
    }
}