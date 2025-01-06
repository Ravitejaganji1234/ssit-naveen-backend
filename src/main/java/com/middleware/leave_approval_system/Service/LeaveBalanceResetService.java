package com.middleware.leave_approval_system.Service;

import com.middleware.leave_approval_system.Repository.LeaveRequestRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class LeaveBalanceResetService {

    @Autowired
    private LeaveRequestRepo leaveRequestRepo;

    @Scheduled(cron = "0 0 0 1 1 *")
    public void resetLeaveBalances(){
        int currentYear = LocalDate.now().getYear();
        leaveRequestRepo.resetLeaveBalancesForAllEmployees(currentYear);
    }
}
