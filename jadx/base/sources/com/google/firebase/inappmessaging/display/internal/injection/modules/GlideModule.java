package com.google.firebase.inappmessaging.display.internal.injection.modules;

import android.app.Application;
import com.bumptech.glide.OooO0OO;
import com.bumptech.glide.OooOOO0;
import com.google.firebase.inappmessaging.display.dagger.Module;
import com.google.firebase.inappmessaging.display.dagger.Provides;

/* JADX INFO: loaded from: classes8.dex */
@Module
public class GlideModule {
    @Provides
    public OooOOO0 providesGlideRequestManager(Application application) {
        return OooO0OO.OooO0Oo(application);
    }
}
