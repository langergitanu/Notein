package com.huawei.hms.network.embedded;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.q4 */
/* JADX INFO: loaded from: classes9.dex */
public class C18322q4 {

    /* JADX INFO: renamed from: a */
    public String f55942a;

    /* JADX INFO: renamed from: b */
    public int f55943b = 443;

    /* JADX INFO: renamed from: c */
    public int f55944c = 443;

    /* JADX INFO: renamed from: d */
    public boolean f55945d;

    public int getAlternatePort() {
        return this.f55944c;
    }

    public boolean getEnableQuic() {
        return this.f55945d;
    }

    public String getHost() {
        return this.f55942a;
    }

    public int getPort() {
        return this.f55943b;
    }

    public void setAlternatePort(int i) {
        this.f55944c = i;
    }

    public void setEnableQuic(boolean z) {
        this.f55945d = z;
    }

    public void setHost(String str) {
        this.f55942a = str;
    }

    public void setPort(int i) {
        this.f55943b = i;
    }

    public String toString() {
        return "Host:" + this.f55942a + ", Port:" + this.f55943b + ", AlternatePort:" + this.f55944c + ", Enable:" + this.f55945d;
    }
}
