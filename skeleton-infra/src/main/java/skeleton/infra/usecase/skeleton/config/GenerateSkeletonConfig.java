package skeleton.infra.usecase.skeleton.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ports.out.GetSkeletonRepositoryExample;
import skeleton.infra.usecase.skeleton.GenerateSkeletonUseCase;
import usecase.skeleton.GenerateSkeletonPort;

@Configuration
public class GenerateSkeletonConfig {

    @Bean
    public GenerateSkeletonPort getSkeletonExample(GetSkeletonRepositoryExample getSkeletonExample){

        return new GenerateSkeletonUseCase(getSkeletonExample);
    }

}
