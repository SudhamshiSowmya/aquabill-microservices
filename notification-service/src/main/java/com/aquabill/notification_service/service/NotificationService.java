package com.aquabill.notification_service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aquabill.notification_service.model.Notification;
import com.aquabill.notification_service.repository.NotificationRepository;

@Service
public class NotificationService {

    @Autowired
    private NotificationRepository notificationRepository;


    // CREATE notification
    public Notification createNotification(Notification notification) {
        return notificationRepository.save(notification);
    }


    // GET all notifications
    public List<Notification> getAllNotifications() {
        return notificationRepository.findAll();
    }


    // GET notification by ID
    public Notification getNotificationById(Long id) {
        return notificationRepository.findById(id).orElse(null);
    }
    
    // UPDATE notification
    public Notification updateNotification(Long id, Notification notification) {

    Notification existingNotification = notificationRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Notification not found"));

    existingNotification.setUserId(notification.getUserId());
    existingNotification.setMessage(notification.getMessage());
    existingNotification.setType(notification.getType());
    existingNotification.setStatus(notification.getStatus());

    return notificationRepository.save(existingNotification);
}
    
    // DELETE notification
    public String deleteNotification(Long id) {
        notificationRepository.deleteById(id);
        return "Notification deleted successfully";
    }
}
