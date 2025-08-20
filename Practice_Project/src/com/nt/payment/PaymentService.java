package com.nt.payment;

import java.time.LocalDateTime;

public class PaymentService {

    // Method to simulate a payment
    public String processPayment(String userId, double amount, String mode) {
        if (amount <= 0) {
            return "❌ Payment failed: Invalid amount!";
        }

        // Simulating payment logic
        String transactionId = "TXN" + System.currentTimeMillis();

        return "✅ Payment Successful!\n" +
               "User ID: " + userId + "\n" +
               "Amount: " + amount + "\n" +
               "Mode: " + mode + "\n" +
               "Transaction ID: " + transactionId + "\n" +
               "Date: " + LocalDateTime.now();
    }

    // Method to simulate refund
    public String refundPayment(String transactionId, double amount) {
        return "🔄 Refund of " + amount + " initiated for Transaction ID: " + transactionId;
    }

    // Test main method
    public static void main(String[] args) {
        PaymentService service = new PaymentService();

        // Process a payment
        String result = service.processPayment("User101", 2500.75, "UPI");
        System.out.println(result);
    }
}
