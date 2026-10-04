package com.huawei.hms.hatool;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.huawei.hms.hatool.i0 */
/* JADX INFO: loaded from: classes8.dex */
public class C17992i0 implements InterfaceRunnableC18007n0 {

    /* JADX INFO: renamed from: a */
    public byte[] f53800a;

    /* JADX INFO: renamed from: b */
    public String f53801b;

    /* JADX INFO: renamed from: c */
    public String f53802c;

    /* JADX INFO: renamed from: d */
    public String f53803d;

    /* JADX INFO: renamed from: e */
    public String f53804e;

    /* JADX INFO: renamed from: f */
    public List<C18014q> f53805f;

    public C17992i0(byte[] bArr, String str, String str2, String str3, String str4, List<C18014q> list) {
        this.f53800a = (byte[]) bArr.clone();
        this.f53801b = str;
        this.f53802c = str2;
        this.f53804e = str3;
        this.f53803d = str4;
        this.f53805f = list;
    }

    /* JADX INFO: renamed from: a */
    public final C17971b0 m77359a(Map<String, String> map) {
        return AbstractC17968a0.m77199a(this.f53801b, this.f53800a, map);
    }

    /* JADX INFO: renamed from: b */
    public final void m77361b() {
        C18010o0.m77487c().m77488a(new C18001l0(this.f53805f, this.f53802c, this.f53803d, this.f53804e));
    }

    @Override // java.lang.Runnable
    public void run() {
        C18030y.m77586c("hmsSdk", "send data running");
        int iM77238b = m77359a(m77360a()).m77238b();
        if (iM77238b != 200) {
            m77361b();
            return;
        }
        C18030y.m77584b("hmsSdk", "events PostRequest sendevent TYPE : %s, TAG : %s, resultCode: %d ,reqID:" + this.f53803d, this.f53804e, this.f53802c, Integer.valueOf(iM77238b));
    }

    /* JADX INFO: renamed from: a */
    public final Map<String, String> m77360a() {
        return C17978d1.m77287b(this.f53802c, this.f53804e, this.f53803d);
    }
}
