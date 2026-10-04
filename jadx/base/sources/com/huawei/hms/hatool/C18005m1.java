package com.huawei.hms.hatool;

import android.content.Context;

/* JADX INFO: renamed from: com.huawei.hms.hatool.m1 */
/* JADX INFO: loaded from: classes8.dex */
public class C18005m1 {

    /* JADX INFO: renamed from: a */
    public C17997k f53877a;

    /* JADX INFO: renamed from: b */
    public C17997k f53878b;

    /* JADX INFO: renamed from: c */
    public Context f53879c;

    /* JADX INFO: renamed from: d */
    public String f53880d;

    public C18005m1(Context context) {
        if (context != null) {
            this.f53879c = context.getApplicationContext();
        }
        this.f53877a = new C17997k();
        this.f53878b = new C17997k();
    }

    /* JADX INFO: renamed from: a */
    public C18005m1 m77470a(int i, String str) {
        C18030y.m77586c("hmsSdk", "Builder.setCollectURL(int type,String collectURL) is execute.TYPE : " + i);
        if (!C18025v0.m77558b(str)) {
            str = "";
        }
        if (i == 0) {
            this.f53877a.m77395b(str);
            return this;
        }
        if (i != 1) {
            C18030y.m77591f("hmsSdk", "Builder.setCollectURL(int type,String collectURL): invalid type!");
            return this;
        }
        this.f53878b.m77395b(str);
        return this;
    }

    @Deprecated
    /* JADX INFO: renamed from: b */
    public C18005m1 m77474b(boolean z) {
        C18030y.m77586c("hmsSdk", "Builder.setEnableSN(boolean isReportSN) is execute.");
        this.f53877a.m77412j().m77372b(z);
        this.f53878b.m77412j().m77372b(z);
        return this;
    }

    @Deprecated
    /* JADX INFO: renamed from: c */
    public C18005m1 m77475c(boolean z) {
        C18030y.m77586c("hmsSdk", "Builder.setEnableUDID(boolean isReportUDID) is execute.");
        this.f53877a.m77412j().m77374c(z);
        this.f53878b.m77412j().m77374c(z);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C18005m1 m77471a(String str) {
        C18030y.m77586c("hmsSdk", "Builder.setAppID is execute");
        this.f53880d = str;
        return this;
    }

    @Deprecated
    /* JADX INFO: renamed from: a */
    public C18005m1 m77472a(boolean z) {
        C18030y.m77586c("hmsSdk", "Builder.setEnableImei(boolean isReportAndroidImei) is execute.");
        this.f53877a.m77412j().m77370a(z);
        this.f53878b.m77412j().m77370a(z);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public void m77473a() {
        if (this.f53879c == null) {
            C18030y.m77583b("hmsSdk", "analyticsConf create(): context is null,create failed!");
            return;
        }
        C18030y.m77586c("hmsSdk", "Builder.create() is execute.");
        C17996j1 c17996j1 = new C17996j1("_hms_config_tag");
        c17996j1.m77385b(new C17997k(this.f53877a));
        c17996j1.m77383a(new C17997k(this.f53878b));
        C17990h1.m77349a().m77351a(this.f53879c);
        C17993i1.m77362a().m77365a(this.f53879c);
        C18011o1.m77489c().m77490a(c17996j1);
        C17990h1.m77349a().m77352a(this.f53880d);
    }
}
