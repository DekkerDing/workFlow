package io.github.dekkerding.interfaces.interior;

import io.github.dekkerding.interfaces.fallback.WorkFlowProxyFallbackFactory;
import io.github.dekkerding.interfaces.interceptor.WorkFlowRequestInterceptor;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "workflow", url = "http://localhost:8080",fallbackFactory = WorkFlowProxyFallbackFactory.class, configuration = WorkFlowRequestInterceptor.class)
public interface workflow {
}
