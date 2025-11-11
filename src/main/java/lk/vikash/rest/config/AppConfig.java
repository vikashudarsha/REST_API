package lk.vikash.rest.config;

import org.glassfish.jersey.server.ResourceConfig;


public class AppConfig  extends ResourceConfig {
    public AppConfig(){
        packages("lk.vikash.rest.controller");
        register(JspMvcFeature.class);
        property(JspMvcFeature.TEMPLATE_BASE_PATH,"WEB-INF/views");

    }
}
