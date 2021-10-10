package solid.icon.dagger2_example.di.modules;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import solid.icon.dagger2_example.services.NetworkService;
import solid.icon.dagger2_example.services.implementation.NetworkServiceImpl;

@Module(includes = AppModule.class)
public class NetworkModule {

    @Provides
    @Singleton
    NetworkService provideNetworkService(Context context){
        return new NetworkServiceImpl(context);
    }
}
