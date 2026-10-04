package com.huawei.hms.network.embedded;

import android.net.NetworkInfo;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.r */
/* JADX INFO: loaded from: classes9.dex */
public class C18330r implements InterfaceC18343s {

    /* JADX INFO: renamed from: a */
    public int f55984a;

    /* JADX INFO: renamed from: b */
    public NetworkInfo.DetailedState f55985b;

    /* JADX INFO: renamed from: c */
    public long f55986c;

    @Override // com.huawei.hms.network.embedded.InterfaceC18343s
    /* JADX INFO: renamed from: a */
    public NetworkInfo.DetailedState mo79436a() {
        return this.f55985b;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18343s
    /* JADX INFO: renamed from: b */
    public long mo79440b() {
        return this.f55986c;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18343s
    /* JADX INFO: renamed from: c */
    public int mo79441c() {
        return this.f55984a;
    }

    public String toString() {
        return "NetworkInfoImpl{networkType=" + this.f55984a + ", networkDetailState=" + this.f55985b + ", networkTimeStamp=" + this.f55986c + '}';
    }

    /* JADX INFO: renamed from: a */
    public void m79437a(int i) {
        this.f55984a = i;
    }

    /* JADX INFO: renamed from: a */
    public void m79438a(long j) {
        this.f55986c = j;
    }

    /* JADX INFO: renamed from: a */
    public void m79439a(NetworkInfo.DetailedState detailedState) {
        this.f55985b = detailedState;
    }
}
