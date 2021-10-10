package solid.icon.dagger2_example.di.component;

import javax.inject.Singleton;

import dagger.Component;
import solid.icon.dagger2_example.MainActivity;
import solid.icon.dagger2_example.di.modules.AppModule;
import solid.icon.dagger2_example.di.modules.NetworkModule;

@Component(modules = {AppModule.class, NetworkModule.class})
@Singleton
public interface AppComponent {
    void inject(MainActivity mainActivity);
}
