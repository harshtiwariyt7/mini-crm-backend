package com.minicrm.Mini_crm.service;

import com.minicrm.Mini_crm.entity.Activity;
import com.minicrm.Mini_crm.repository.ActivityRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ActivityService {
    private final ActivityRepository activityRepository;

    public ActivityService(ActivityRepository activityRepository) {
        this.activityRepository = activityRepository;
    }

    public List<Activity> getAllActivities() {
        return activityRepository.findAll();
    }

    public Activity getActivityById(Integer id) {
        return activityRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Activity not found with id: " + id));
    }

    public Activity createActivity(Activity activity) {
        return activityRepository.save(activity);
    }
}