package solid.icon.dagger2_example.services.implementation;

import android.content.Context;

import solid.icon.dagger2_example.services.NetworkService;

public class NetworkServiceImpl implements NetworkService {

    Context context;

    public NetworkServiceImpl(Context context) {
        this.context = context;
    }

    @Override
    public String getHello() {
        return context.getClass().getSimpleName();
    }
}
