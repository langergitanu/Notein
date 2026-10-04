package com.alipay.android.phone.mrpc.core;

import java.lang.reflect.Proxy;

/* JADX INFO: renamed from: com.alipay.android.phone.mrpc.core.x */
/* JADX INFO: loaded from: classes.dex */
public final class C0172x {

    /* JADX INFO: renamed from: a */
    public InterfaceC0155g f116a;

    /* JADX INFO: renamed from: b */
    public C0174z f117b = new C0174z(this);

    public C0172x(InterfaceC0155g interfaceC0155g) {
        this.f116a = interfaceC0155g;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC0155g m119a() {
        return this.f116a;
    }

    /* JADX INFO: renamed from: a */
    public final <T> T m120a(Class<T> cls) {
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C0173y(this.f116a, cls, this.f117b));
    }
}
