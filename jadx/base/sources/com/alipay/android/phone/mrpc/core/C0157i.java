package com.alipay.android.phone.mrpc.core;

/* JADX INFO: renamed from: com.alipay.android.phone.mrpc.core.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0157i implements InterfaceC0155g {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0146aa f62a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0156h f63b;

    public C0157i(C0156h c0156h, C0146aa c0146aa) {
        this.f63b = c0156h;
        this.f62a = c0146aa;
    }

    @Override // com.alipay.android.phone.mrpc.core.InterfaceC0155g
    /* JADX INFO: renamed from: a */
    public final String mo64a() {
        return this.f62a.m46a();
    }

    @Override // com.alipay.android.phone.mrpc.core.InterfaceC0155g
    /* JADX INFO: renamed from: b */
    public final InterfaceC0147ab mo65b() {
        return C0160l.m76a(this.f63b.f61a.getApplicationContext());
    }

    @Override // com.alipay.android.phone.mrpc.core.InterfaceC0155g
    /* JADX INFO: renamed from: c */
    public final C0146aa mo66c() {
        return this.f62a;
    }

    @Override // com.alipay.android.phone.mrpc.core.InterfaceC0155g
    /* JADX INFO: renamed from: d */
    public final boolean mo67d() {
        return this.f62a.m49c();
    }
}
