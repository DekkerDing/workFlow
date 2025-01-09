package io.github.dekkerding.infrastructure.event;

import org.camunda.bpm.spring.boot.starter.event.TaskEvent;
import org.springframework.context.event.EventListener;

public class TaskListener {

    @EventListener
    public void onTaskEvent(TaskEvent taskEvent) {
        // handle immutable task event
    }

}
