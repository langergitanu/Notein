package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.firebase.inappmessaging.dagger.Module;
import com.google.firebase.inappmessaging.dagger.Provides;
import oO0OO00O.OooO00o;
import oO0OoOo0.C33288OooO00o;
import oO0OoOo0.C33289OooO0O0;
import oO0OooOO.AbstractC33500OooOOOo;

/* JADX INFO: loaded from: classes8.dex */
@Module
public class SchedulerModule {
    @Provides
    public AbstractC33500OooOOOo providesComputeScheduler() {
        return OooO00o.f118536OooO00o;
    }

    @Provides
    public AbstractC33500OooOOOo providesIOScheduler() {
        return OooO00o.f118537OooO0O0;
    }

    @Provides
    public AbstractC33500OooOOOo providesMainThreadScheduler() {
        C33289OooO0O0 c33289OooO0O0 = C33288OooO00o.f120508OooO00o;
        if (c33289OooO0O0 != null) {
            return c33289OooO0O0;
        }
        throw new NullPointerException("scheduler == null");
    }
}
