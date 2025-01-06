package com.middleware.leave_approval_system.Service;

import com.middleware.leave_approval_system.Entity.LeaveSheet;
import com.middleware.leave_approval_system.Exception.ResourceNotFoundException;
import com.middleware.leave_approval_system.Repository.LeaveSheetRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeaveSheetService {

    @Autowired
    private LeaveSheetRepo leaveSheetRepo;

    public LeaveSheet createLeaveSheet(LeaveSheet leaveSheet) {
        return leaveSheetRepo.save(leaveSheet);
    }

    public LeaveSheet updateLeaveSheet(int id,LeaveSheet leaveSheet) {
        LeaveSheet updateSheet = leaveSheetRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Leave Sheet Not Found"));
        updateSheet.setSICK(leaveSheet.getSICK());
        updateSheet.setCASUAL(leaveSheet.getCASUAL());
        updateSheet.setVACATION(leaveSheet.getVACATION());
        updateSheet.setMARRIAGE(leaveSheet.getMARRIAGE());
        updateSheet.setMATERNITY(leaveSheet.getMATERNITY());
        updateSheet.setPATERNITY(leaveSheet.getPATERNITY());
        updateSheet.setOTHERS(leaveSheet.getOTHERS());
        return leaveSheetRepo.save(updateSheet);
    }

    public List<LeaveSheet> getAllLeaveSheets() {
        return leaveSheetRepo.findAll();
    }

}
