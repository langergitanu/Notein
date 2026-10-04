package com.google.firebase.inappmessaging.internal.injection.modules;

import com.google.firebase.inappmessaging.dagger.internal.Factory;
import com.google.firebase.inappmessaging.dagger.internal.Preconditions;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes8.dex */
public final class ExecutorsModule_ProvidesBlockingExecutorFactory implements Factory<Executor> {
    private final ExecutorsModule module;

    public ExecutorsModule_ProvidesBlockingExecutorFactory(ExecutorsModule executorsModule) {
        this.module = executorsModule;
    }

    public static ExecutorsModule_ProvidesBlockingExecutorFactory create(ExecutorsModule executorsModule) {
        return new ExecutorsModule_ProvidesBlockingExecutorFactory(executorsModule);
    }

    public static Executor providesBlockingExecutor(ExecutorsModule executorsModule) {
        return (Executor) Preconditions.checkNotNullFromProvides(executorsModule.providesBlockingExecutor());
    }

    @Override // com.google.firebase.inappmessaging.dagger.internal.Factory, com.google.firebase.inappmessaging.dagger.internal.Provider, oO00ooO0.InterfaceC32462OooO00o
    public Executor get() {
        return providesBlockingExecutor(this.module);
    }
}
