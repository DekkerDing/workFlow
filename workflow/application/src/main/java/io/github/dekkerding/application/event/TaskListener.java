package io.github.dekkerding.application.event;

import org.camunda.bpm.spring.boot.starter.event.TaskEvent;
import org.springframework.context.event.EventListener;

public class TaskListener {

    @EventListener
    public void onTaskEvent(TaskEvent taskEvent) {
        // handle immutable task event
    }

}
