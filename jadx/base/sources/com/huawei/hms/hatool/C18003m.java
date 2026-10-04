package com.huawei.hms.hatool;

/* JADX INFO: renamed from: com.huawei.hms.hatool.m */
/* JADX INFO: loaded from: classes8.dex */
public class C18003m {

    /* JADX INFO: renamed from: a */
    public C17997k f53871a;

    /* JADX INFO: renamed from: b */
    public C17997k f53872b;

    /* JADX INFO: renamed from: c */
    public C17997k f53873c;

    /* JADX INFO: renamed from: d */
    public C17997k f53874d;

    public C18003m(String str) {
    }

    /* JADX INFO: renamed from: a */
    public C17997k m77463a() {
        return this.f53873c;
    }

    /* JADX INFO: renamed from: b */
    public C17997k m77466b() {
        return this.f53871a;
    }

    /* JADX INFO: renamed from: c */
    public C17997k m77468c() {
        return this.f53872b;
    }

    /* JADX INFO: renamed from: d */
    public C17997k m77469d() {
        return this.f53874d;
    }

    /* JADX INFO: renamed from: a */
    public C17997k m77464a(String str) {
        if (str.equals("oper")) {
            return m77468c();
        }
        if (str.equals("maint")) {
            return m77466b();
        }
        if (str.equals("diffprivacy")) {
            return m77463a();
        }
        if (str.equals("preins")) {
            return m77469d();
        }
        C18030y.m77591f("hmsSdk", "HiAnalyticsInstData.getConfig(type): wrong type: ".concat(str));
        return null;
    }

    /* JADX INFO: renamed from: b */
    public void m77467b(C17997k c17997k) {
        this.f53872b = c17997k;
    }

    /* JADX INFO: renamed from: a */
    public void m77465a(C17997k c17997k) {
        this.f53871a = c17997k;
    }
}
