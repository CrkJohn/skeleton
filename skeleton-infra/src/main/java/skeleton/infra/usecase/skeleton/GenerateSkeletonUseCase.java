package skeleton.infra.usecase.skeleton;

import domian.skeleton.Request;
import domian.skeleton.Response;
import ports.out.GetSkeletonRepositoryExample;
import usecase.skeleton.GenerateSkeletonPort;

public class GenerateSkeletonUseCase implements GenerateSkeletonPort {

    private final GetSkeletonRepositoryExample getSkeletonRepositoryExample;

    public GenerateSkeletonUseCase(GetSkeletonRepositoryExample getSkeletonRepositoryExample) {

        this.getSkeletonRepositoryExample = getSkeletonRepositoryExample;
    }

    @Override
    public Response execute(Request command) {
        return null;
    }

}
