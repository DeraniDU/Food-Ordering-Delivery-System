package com.foodordering.notificationservice.repository;

import com.foodordering.notificationservice.entity.Notification;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {
    Page<Notification> findByRecipientIdAndRecipientTypeOrderByCreatedAtDesc(
            Long recipientId, String recipientType, Pageable pageable);

    List<Notification> findByRecipientIdAndRecipientTypeAndReadOrderByCreatedAtDesc(
            Long recipientId, String recipientType, boolean read);

    long countByRecipientIdAndRecipientTypeAndRead(
            Long recipientId, String recipientType, boolean read);
}
