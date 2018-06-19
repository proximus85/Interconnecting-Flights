package org.interconnection.serviceimpl;

import lombok.Getter;
import org.interconnection.dao.RouteRepository;
import org.interconnection.domain.Route;
import org.interconnection.service.RoutesService;
import org.interconnection.utils.RestTemplateProviderUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import java.util.Collection;

@Service
@Getter
public class RoutesServiceImpl implements RoutesService {

    public static final HttpEntity<?> REQUEST_ENTITY = null;
    private Collection<Route> routes;
    @Value("${routes.url}")
    private String routesURL;
    @Autowired
    private RouteRepository routeRepository;

    @PostConstruct
    @Transactional
    public void initializeRoutes() {

        RestTemplateProviderUtils.restTemplate.exchange(
                routesURL,
                HttpMethod.GET,
                REQUEST_ENTITY,
                new ParameterizedTypeReference<Collection<Route>>() {
                });

        routes = routeRepository.save(routes);
    }
}
