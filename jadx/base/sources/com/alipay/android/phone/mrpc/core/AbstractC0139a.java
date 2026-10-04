package com.alipay.android.phone.mrpc.core;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.alipay.android.phone.mrpc.core.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0139a implements InterfaceC0170v {

    /* JADX INFO: renamed from: a */
    public Method f32a;

    /* JADX INFO: renamed from: b */
    public byte[] f33b;

    /* JADX INFO: renamed from: c */
    public String f34c;

    /* JADX INFO: renamed from: d */
    public int f35d;

    /* JADX INFO: renamed from: e */
    public String f36e;

    /* JADX INFO: renamed from: f */
    public boolean f37f;

    public AbstractC0139a(Method method, int i, String str, byte[] bArr, String str2, boolean z) {
        this.f32a = method;
        this.f35d = i;
        this.f34c = str;
        this.f33b = bArr;
        this.f36e = str2;
        this.f37f = z;
    }
}
