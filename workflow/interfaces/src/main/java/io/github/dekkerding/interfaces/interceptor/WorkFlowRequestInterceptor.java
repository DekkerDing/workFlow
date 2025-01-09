package io.github.dekkerding.interfaces.interceptor;

import feign.RequestInterceptor;
import feign.RequestTemplate;

public class WorkFlowRequestInterceptor implements RequestInterceptor {
    /**
     * Called for every request. Add data using methods on the supplied {@link RequestTemplate}.
     *
     * @param template
     */
    @Override
    public void apply(RequestTemplate template) {

    }
}
