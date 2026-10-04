package com.huawei.hms.base.log;

import android.content.Context;
import android.util.Log;

/* JADX INFO: renamed from: com.huawei.hms.base.log.a */
/* JADX INFO: loaded from: classes6.dex */
public class C17734a {

    /* JADX INFO: renamed from: b */
    public String f52487b;

    /* JADX INFO: renamed from: a */
    public int f52486a = 4;

    /* JADX INFO: renamed from: c */
    public InterfaceC17735b f52488c = new C17738e();

    /* JADX INFO: renamed from: a */
    public void m75824a(Context context, int i, String str) {
        this.f52486a = i;
        this.f52487b = str;
        this.f52488c.mo75829a(context, "HMSCore");
    }

    /* JADX INFO: renamed from: b */
    public void m75828b(int i, String str, String str2, Throwable th) {
        if (m75827a(i)) {
            C17736c c17736cM75822a = m75822a(i, str, str2, th);
            String str3 = c17736cM75822a.m75839c() + c17736cM75822a.m75835a();
            this.f52488c.mo75831a(str3, i, str, str2 + '\n' + Log.getStackTraceString(th));
        }
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC17735b m75821a() {
        return this.f52488c;
    }

    /* JADX INFO: renamed from: a */
    public void m75825a(InterfaceC17735b interfaceC17735b) {
        this.f52488c = interfaceC17735b;
    }

    /* JADX INFO: renamed from: a */
    public boolean m75827a(int i) {
        return i >= this.f52486a;
    }

    /* JADX INFO: renamed from: a */
    public void m75823a(int i, String str, String str2) {
        if (m75827a(i)) {
            C17736c c17736cM75822a = m75822a(i, str, str2, null);
            this.f52488c.mo75831a(c17736cM75822a.m75839c() + c17736cM75822a.m75835a(), i, str, str2);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m75826a(String str, String str2) {
        C17736c c17736cM75822a = m75822a(4, str, str2, null);
        this.f52488c.mo75831a(c17736cM75822a.m75839c() + '\n' + c17736cM75822a.m75835a(), 4, str, str2);
    }

    /* JADX INFO: renamed from: a */
    public final C17736c m75822a(int i, String str, String str2, Throwable th) {
        C17736c c17736c = new C17736c(8, this.f52487b, i, str);
        c17736c.m75833a(str2);
        c17736c.m75834a(th);
        return c17736c;
    }
}
