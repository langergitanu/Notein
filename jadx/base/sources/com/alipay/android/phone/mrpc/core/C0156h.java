package com.alipay.android.phone.mrpc.core;

import android.content.Context;

/* JADX INFO: renamed from: com.alipay.android.phone.mrpc.core.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0156h extends AbstractC0171w {

    /* JADX INFO: renamed from: a */
    public Context f61a;

    public C0156h(Context context) {
        this.f61a = context;
    }

    @Override // com.alipay.android.phone.mrpc.core.AbstractC0171w
    /* JADX INFO: renamed from: a */
    public final <T> T mo69a(Class<T> cls, C0146aa c0146aa) {
        return (T) new C0172x(new C0157i(this, c0146aa)).m120a(cls);
    }
}
