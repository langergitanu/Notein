package com.huawei.agconnect.credential.obs;

import android.content.Context;
import com.huawei.agconnect.common.api.Logger;

/* JADX INFO: renamed from: com.huawei.agconnect.credential.obs.d */
/* JADX INFO: loaded from: classes8.dex */
public class C17626d {

    /* JADX INFO: renamed from: a */
    private static final String f52156a = "HMSInstanceIdWrapper";

    /* JADX INFO: renamed from: b */
    private Object f52157b;

    public C17626d(Context context) {
        try {
            this.f52157b = Class.forName("com.huawei.hms.aaid.HmsInstanceId").getDeclaredMethod("getInstance", Context.class).invoke(null, context);
        } catch (Throwable unused) {
            Logger.m75331w(f52156a, "not find package HmsInstanceId");
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m75529a() {
        return this.f52157b != null;
    }

    /* JADX INFO: renamed from: b */
    public String m75530b() {
        try {
            Logger.m75326d(f52156a, "call hms wrapper : getId");
            return (String) this.f52157b.getClass().getDeclaredMethod("getId", new Class[0]).invoke(this.f52157b, new Object[0]);
        } catch (Throwable unused) {
            Logger.m75327e(f52156a, "get id fail");
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public long m75531c() {
        try {
            Logger.m75326d(f52156a, "call hms wrapper : getCreationTime");
            return ((Long) this.f52157b.getClass().getDeclaredMethod("getCreationTime", new Class[0]).invoke(this.f52157b, new Object[0])).longValue();
        } catch (Throwable unused) {
            Logger.m75327e(f52156a, "get create time fail");
            return 0L;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m75532d() {
        try {
            Logger.m75326d(f52156a, "call hms wrapper : deleteAAID");
            this.f52157b.getClass().getDeclaredMethod("deleteAAID", new Class[0]).invoke(this.f52157b, new Object[0]);
        } catch (Throwable unused) {
            Logger.m75327e(f52156a, "delete aaid fail");
        }
    }
}
