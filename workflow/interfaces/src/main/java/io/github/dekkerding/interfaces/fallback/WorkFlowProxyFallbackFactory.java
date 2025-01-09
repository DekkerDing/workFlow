package io.github.dekkerding.interfaces.fallback;

import org.springframework.cloud.openfeign.FallbackFactory;

public class WorkFlowProxyFallbackFactory implements FallbackFactory<Object> {
    /**
     * Returns an instance of the fallback appropriate for the given cause.
     *
     * @param cause cause of an exception.
     * @return fallback
     */
    @Override
    public Object create(Throwable cause) {
        return null;
    }
}
