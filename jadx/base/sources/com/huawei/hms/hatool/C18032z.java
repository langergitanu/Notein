package com.huawei.hms.hatool;

import Oooo0oO.o0Oo0oo;
import android.util.Log;

/* JADX INFO: renamed from: com.huawei.hms.hatool.z */
/* JADX INFO: loaded from: classes8.dex */
public class C18032z {

    /* JADX INFO: renamed from: a */
    public boolean f53945a = false;

    /* JADX INFO: renamed from: b */
    public int f53946b = 4;

    /* JADX INFO: renamed from: a */
    public static String m77592a() {
        return "FormalHASDK_2.2.0.313" + C17999k1.m77421a();
    }

    /* JADX INFO: renamed from: b */
    public void m77595b(int i, String str, String str2) {
        m77594a(i, "FormalHASDK", o0Oo0oo.OooO0Oo(str, "=> ", str2));
    }

    /* JADX INFO: renamed from: a */
    public void m77593a(int i) {
        Log.i("FormalHASDK", System.lineSeparator() + "======================================= " + System.lineSeparator() + m77592a() + "" + System.lineSeparator() + "=======================================");
        this.f53946b = i;
        this.f53945a = true;
    }

    /* JADX INFO: renamed from: a */
    public void m77594a(int i, String str, String str2) {
        if (i == 3) {
            Log.d(str, str2);
            return;
        }
        if (i == 5) {
            Log.w(str, str2);
        } else if (i != 6) {
            Log.i(str, str2);
        } else {
            Log.e(str, str2);
        }
    }

    /* JADX INFO: renamed from: b */
    public boolean m77596b(int i) {
        return this.f53945a && i >= this.f53946b;
    }
}
