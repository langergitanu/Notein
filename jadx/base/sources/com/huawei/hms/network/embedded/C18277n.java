package com.huawei.hms.network.embedded;

import Oooo0oO.C21111o0ooOoO;
import android.text.TextUtils;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.n */
/* JADX INFO: loaded from: classes9.dex */
public class C18277n implements InterfaceC18291o {

    /* JADX INFO: renamed from: a */
    public int f55723a;

    /* JADX INFO: renamed from: b */
    public int f55724b;

    /* JADX INFO: renamed from: c */
    public long f55725c;

    /* JADX INFO: renamed from: d */
    public long f55726d;

    /* JADX INFO: renamed from: e */
    public String f55727e;

    public C18277n() {
        this.f55727e = "unknown";
        this.f55723a = -1;
        this.f55726d = System.currentTimeMillis();
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18291o
    /* JADX INFO: renamed from: a */
    public String mo79206a() {
        return this.f55727e;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18291o
    /* JADX INFO: renamed from: b */
    public long mo79210b() {
        return this.f55726d;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18291o
    /* JADX INFO: renamed from: c */
    public int mo79212c() {
        return this.f55724b;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18291o
    /* JADX INFO: renamed from: d */
    public int mo79213d() {
        return this.f55723a;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18291o
    /* JADX INFO: renamed from: e */
    public long mo79214e() {
        return this.f55725c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DetectImpl{detectType=");
        sb.append(this.f55723a);
        sb.append(", statusCode=");
        sb.append(this.f55724b);
        sb.append(", totalTime=");
        sb.append(this.f55725c);
        sb.append(", detectStartTime=");
        sb.append(this.f55726d);
        sb.append(", domain=");
        return C21111o0ooOoO.OooO0OO(this.f55727e, '}', sb);
    }

    public C18277n(int i) {
        this.f55727e = "unknown";
        this.f55723a = i;
        this.f55726d = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: a */
    public void m79207a(int i) {
        this.f55723a = i;
    }

    /* JADX INFO: renamed from: b */
    public void m79211b(int i) {
        this.f55724b = i;
    }

    /* JADX INFO: renamed from: a */
    public void m79208a(long j) {
        this.f55725c = j;
    }

    /* JADX INFO: renamed from: a */
    public void m79209a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f55727e = str;
    }
}
