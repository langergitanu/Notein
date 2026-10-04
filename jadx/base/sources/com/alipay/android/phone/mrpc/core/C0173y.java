package com.alipay.android.phone.mrpc.core;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.alipay.android.phone.mrpc.core.y */
/* JADX INFO: loaded from: classes.dex */
public final class C0173y implements InvocationHandler {

    /* JADX INFO: renamed from: a */
    public InterfaceC0155g f118a;

    /* JADX INFO: renamed from: b */
    public Class<?> f119b;

    /* JADX INFO: renamed from: c */
    public C0174z f120c;

    public C0173y(InterfaceC0155g interfaceC0155g, Class<?> cls, C0174z c0174z) {
        this.f118a = interfaceC0155g;
        this.f119b = cls;
        this.f120c = c0174z;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        return this.f120c.m121a(method, objArr);
    }
}
