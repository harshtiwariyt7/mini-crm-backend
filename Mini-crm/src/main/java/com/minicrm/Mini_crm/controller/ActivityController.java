package com.minicrm.Mini_crm.controller;

import com.minicrm.Mini_crm.entity.Activity;
import com.minicrm.Mini_crm.service.ActivityService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController

@RequestMapping("/api/activities")
public class ActivityController {
    private final ActivityService activityService;

    public ActivityController(ActivityService activityService) {
        this.activityService = activityService;
    }

    @GetMapping
    public List<Activity> getAllActivities() {
        return activityService.getAllActivities();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Activity> getActivityById(@PathVariable Integer id) {
        return ResponseEntity.ok(activityService.getActivityById(id));
    }

    @PostMapping
    public ResponseEntity<Activity> createActivity(@RequestBody Activity activity) {
        return ResponseEntity.ok(activityService.createActivity(activity));
    }
}