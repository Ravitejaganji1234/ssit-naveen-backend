package com.middleware.leave_approval_system.Controller;

import com.middleware.leave_approval_system.Entity.LeaveSheet;
import com.middleware.leave_approval_system.Service.LeaveSheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class LeaveSheetController {

    @Autowired
    private LeaveSheetService leaveSheetService;

    @PostMapping("/submitSheet")
    public ResponseEntity<LeaveSheet> submitLeaveSheet(@RequestBody LeaveSheet leaveSheet) {
        LeaveSheet saveSheet = leaveSheetService.createLeaveSheet(leaveSheet);
        return ResponseEntity.ok().body(saveSheet);
    }

    @PutMapping("/updateSheet")
    public ResponseEntity<?> updateLeaveSheet(@RequestParam int id, @RequestBody LeaveSheet leaveSheet) {
        LeaveSheet updateSheet = leaveSheetService.updateLeaveSheet(id, leaveSheet);
        return ResponseEntity.ok().body(updateSheet);
    }

    @GetMapping("/allSheets")
    public ResponseEntity<List<LeaveSheet>> getAllLeaveSheets() {
        List<LeaveSheet> getAllSheets = leaveSheetService.getAllLeaveSheets();
        return ResponseEntity.ok().body(getAllSheets);
    }
}
