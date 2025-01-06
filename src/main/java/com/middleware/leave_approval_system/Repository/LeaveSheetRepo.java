package com.middleware.leave_approval_system.Repository;

import com.middleware.leave_approval_system.Entity.LeaveRequest;
import com.middleware.leave_approval_system.Entity.LeaveSheet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface LeaveSheetRepo extends JpaRepository<LeaveSheet, Integer> {

}
