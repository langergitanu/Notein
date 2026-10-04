package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.dagger.internal.Preconditions;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes8.dex */
public final class ExecutorsModule_ProvidesBackgroundExecutorFactory implements Factory<Executor> {
    private final ExecutorsModule module;

    public ExecutorsModule_ProvidesBackgroundExecutorFactory(ExecutorsModule executorsModule) {
        this.module = executorsModule;
    }

    public static ExecutorsModule_ProvidesBackgroundExecutorFactory create(ExecutorsModule executorsModule) {
        return new ExecutorsModule_ProvidesBackgroundExecutorFactory(executorsModule);
    }

    public static Executor providesBackgroundExecutor(ExecutorsModule executorsModule) {
        return (Executor) Preconditions.checkNotNullFromProvides(executorsModule.providesBackgroundExecutor());
    }

    @Override // com.google.firebase.inappmessaging.dagger.internal.Factory, com.google.firebase.inappmessaging.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
    public Executor get() {
        return providesBackgroundExecutor(this.module);
    }
}
