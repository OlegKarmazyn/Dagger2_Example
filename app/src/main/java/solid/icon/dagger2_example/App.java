package solid.icon.dagger2_example;

import android.app.Application;

import solid.icon.dagger2_example.di.component.AppComponent;
import solid.icon.dagger2_example.di.component.DaggerAppComponent;
import solid.icon.dagger2_example.di.modules.AppModule;

public class App extends Application{

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
