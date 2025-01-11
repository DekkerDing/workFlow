package io.github.dekkerding.infrastructure.event;

import org.camunda.bpm.engine.delegate.DelegateTask;
import org.springframework.context.event.EventListener;

public class DelegateTaskListener {
    @EventListener
    public void onTaskEvent(DelegateTask taskEvent) {
        // handle immutable task event
    }
}
