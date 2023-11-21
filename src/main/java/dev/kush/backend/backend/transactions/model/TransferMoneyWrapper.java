package dev.kush.backend.backend.transactions.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TransferMoneyWrapper {
    private Long senderId;
    private Long receiverId;
    private Long amount;
}