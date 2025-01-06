package com.middleware.leave_approval_system.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class LeaveSheet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int SICK;
    private int VACATION;
    private int CASUAL;
    private int MARRIAGE;
    private int PATERNITY;
    private int MATERNITY;
    private int OTHERS;

}
