package com.google.android.play.integrity.internal;

import OooO0O0.OooO00o;
import Oooo0.C20856OooooOo;
import Oooo0oO.o0Oo0oo;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.util.IllegalFormatException;
import java.util.Locale;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.s */
/* JADX INFO: loaded from: classes7.dex */
public final class C16408s {

    /* JADX INFO: renamed from: a */
    private final String f51577a;

    public C16408s(String str) {
        this.f51577a = C20856OooooOo.OooO0O0("UID: [", Process.myUid(), "]  PID: [", "] ", Process.myPid()).concat(str);
    }

    /* JADX INFO: renamed from: f */
    private static String m75057f(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                Log.e("PlayCore", "Unable to format ".concat(String.valueOf(str2)), e);
                str2 = OooO00o.OooO0O0(str2, " [", TextUtils.join(", ", objArr), "]");
            }
        }
        return o0Oo0oo.OooO0Oo(str, " : ", str2);
    }

    /* JADX INFO: renamed from: a */
    public final int m75058a(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            return Log.d("PlayCore", m75057f(this.f51577a, str, objArr));
        }
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public final int m75059b(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", m75057f(this.f51577a, str, objArr));
        }
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public final int m75060c(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            return Log.e("PlayCore", m75057f(this.f51577a, str, objArr), th);
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public final int m75061d(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            return Log.i("PlayCore", m75057f(this.f51577a, str, objArr));
        }
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public final int m75062e(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            return Log.w("PlayCore", m75057f(this.f51577a, str, objArr));
        }
        return 0;
    }
}
