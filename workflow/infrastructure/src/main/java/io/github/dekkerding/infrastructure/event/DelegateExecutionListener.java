package io.github.dekkerding.infrastructure.event;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.DelegateTask;
import org.springframework.context.event.EventListener;

public class DelegateExecutionListener {
    @EventListener
    public void onTaskEvent(DelegateExecution taskEvent) {
        // handle immutable task event
    }
}
