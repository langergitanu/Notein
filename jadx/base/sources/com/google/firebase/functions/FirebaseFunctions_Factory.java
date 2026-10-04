package com.google.firebase.functions;

import android.content.Context;
import java.util.concurrent.Executor;
import oO00ooO0.InterfaceC32462OooO00o;

/* JADX INFO: loaded from: classes8.dex */
public final class FirebaseFunctions_Factory {
    private final InterfaceC32462OooO00o<Context> contextProvider;
    private final InterfaceC32462OooO00o<ContextProvider> contextProvider2;
    private final InterfaceC32462OooO00o<Executor> executorProvider;
    private final InterfaceC32462OooO00o<String> projectIdProvider;
    private final InterfaceC32462OooO00o<Executor> uiExecutorProvider;

    public FirebaseFunctions_Factory(InterfaceC32462OooO00o<Context> interfaceC32462OooO00o, InterfaceC32462OooO00o<String> interfaceC32462OooO00o2, InterfaceC32462OooO00o<ContextProvider> interfaceC32462OooO00o3, InterfaceC32462OooO00o<Executor> interfaceC32462OooO00o4, InterfaceC32462OooO00o<Executor> interfaceC32462OooO00o5) {
        this.contextProvider = interfaceC32462OooO00o;
        this.projectIdProvider = interfaceC32462OooO00o2;
        this.contextProvider2 = interfaceC32462OooO00o3;
        this.executorProvider = interfaceC32462OooO00o4;
        this.uiExecutorProvider = interfaceC32462OooO00o5;
    }

    public static FirebaseFunctions_Factory create(InterfaceC32462OooO00o<Context> interfaceC32462OooO00o, InterfaceC32462OooO00o<String> interfaceC32462OooO00o2, InterfaceC32462OooO00o<ContextProvider> interfaceC32462OooO00o3, InterfaceC32462OooO00o<Executor> interfaceC32462OooO00o4, InterfaceC32462OooO00o<Executor> interfaceC32462OooO00o5) {
        return new FirebaseFunctions_Factory(interfaceC32462OooO00o, interfaceC32462OooO00o2, interfaceC32462OooO00o3, interfaceC32462OooO00o4, interfaceC32462OooO00o5);
    }

    public static FirebaseFunctions newInstance(Context context, String str, String str2, ContextProvider contextProvider, Executor executor, Executor executor2) {
        return new FirebaseFunctions(context, str, str2, contextProvider, executor, executor2);
    }

    public FirebaseFunctions get(String str) {
        return newInstance(this.contextProvider.get(), this.projectIdProvider.get(), str, this.contextProvider2.get(), this.executorProvider.get(), this.uiExecutorProvider.get());
    }
}
