package com.foodordering.orderservice.dto.event;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NotificationEvent {
    private String type;
    private String title;
    private String message;
    private Long recipientId;
    private String recipientType; // USER, RESTAURANT, DRIVER
    private Long referenceId; // orderId
    private String referenceType; // ORDER
    private LocalDateTime timestamp;
}
