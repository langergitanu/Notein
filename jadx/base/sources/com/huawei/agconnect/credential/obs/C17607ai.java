package com.huawei.agconnect.credential.obs;

import android.content.Context;
import com.huawei.agconnect.AGConnectInstance;

/* JADX INFO: renamed from: com.huawei.agconnect.credential.obs.ai */
/* JADX INFO: loaded from: classes8.dex */
public class C17607ai {

    /* JADX INFO: renamed from: a */
    public static final String f52115a = "4D5480E9";

    /* JADX INFO: renamed from: b */
    private static final C17607ai f52116b = new C17607ai();

    /* JADX INFO: renamed from: c */
    private Context f52117c;

    private C17607ai() {
    }

    /* JADX INFO: renamed from: a */
    public static C17607ai m75467a() {
        return f52116b;
    }

    /* JADX INFO: renamed from: c */
    public static String m75469c() {
        return "1C4DE4EC";
    }

    /* JADX INFO: renamed from: d */
    public static String m75470d() {
        return "80fedfd8941a368fafdae46750a4d367";
    }

    /* JADX INFO: renamed from: b */
    public Context m75471b() {
        if (this.f52117c == null) {
            this.f52117c = AGConnectInstance.getInstance().getContext();
        }
        return this.f52117c;
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m75468a(Context context) {
        Context applicationContext = context.getApplicationContext();
        C17607ai c17607ai = f52116b;
        if (applicationContext != null) {
            context = applicationContext;
        }
        c17607ai.f52117c = context;
    }
}
