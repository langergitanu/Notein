package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.firebase.inappmessaging.dagger.Module;
import com.google.firebase.inappmessaging.dagger.Provides;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes8.dex */
@Module
public class ExecutorsModule {
    private final Executor backgroundExecutor;
    private final Executor blockingExecutor;
    private final Executor lightWeightExecutor;

    public ExecutorsModule(Executor executor, Executor executor2, Executor executor3) {
        this.lightWeightExecutor = executor;
        this.backgroundExecutor = executor2;
        this.blockingExecutor = executor3;
    }

    @Provides
    public Executor providesBackgroundExecutor() {
        return this.backgroundExecutor;
    }

    @Provides
    public Executor providesBlockingExecutor() {
        return this.blockingExecutor;
    }

    @Provides
    public Executor providesLightWeightExecutor() {
        return this.lightWeightExecutor;
    }
}
