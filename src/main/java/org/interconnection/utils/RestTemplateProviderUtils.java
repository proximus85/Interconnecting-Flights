package org.interconnection.utils;

import lombok.Getter;
import org.springframework.web.client.RestTemplate;

@Getter
public class RestTemplateProviderUtils {
    public static RestTemplate restTemplate = new RestTemplate();
}
