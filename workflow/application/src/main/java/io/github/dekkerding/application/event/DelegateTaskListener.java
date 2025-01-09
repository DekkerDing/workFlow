package io.github.dekkerding.application.event;

import org.camunda.bpm.engine.delegate.DelegateTask;
import org.springframework.context.event.EventListener;

public class DelegateTaskListener {
    @EventListener
    public void onTaskEvent(DelegateTask taskEvent) {
        // handle immutable task event
    }
}
