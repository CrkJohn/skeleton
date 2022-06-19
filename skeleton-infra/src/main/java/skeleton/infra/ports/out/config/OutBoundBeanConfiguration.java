package skeleton.infra.ports.out.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ports.out.GetSkeletonRepositoryExample;
import skeleton.infra.ports.out.skeleton.GetSkeletonExamplePort;


@Configuration
public class OutBoundBeanConfiguration {

    @Bean
    public GetSkeletonRepositoryExample getSkeletonExample(){

        return new GetSkeletonExamplePort();
    }

}
