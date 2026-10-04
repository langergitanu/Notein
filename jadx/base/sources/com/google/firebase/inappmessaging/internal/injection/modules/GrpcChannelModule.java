package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.firebase.inappmessaging.dagger.Module;
import com.google.firebase.inappmessaging.dagger.Provides;
import oO0OOo0o.AbstractC33060OooO0Oo;
import oO0OOo0o.AbstractC33081Oooo;

/* JADX INFO: loaded from: classes8.dex */
@Module
public class GrpcChannelModule {
    @Provides
    public AbstractC33060OooO0Oo providesGrpcChannel(String str) {
        return AbstractC33081Oooo.OooO0O0(str).OooO00o();
    }

    @Provides
    public String providesServiceHost() {
        return "firebaseinappmessaging.googleapis.com";
    }
}
