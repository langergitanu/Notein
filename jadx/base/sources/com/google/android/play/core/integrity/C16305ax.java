package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.C16367ag;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.ax */
/* JADX INFO: loaded from: classes7.dex */
final class C16305ax {

    /* JADX INFO: renamed from: a */
    private static InterfaceC16304aw f51450a;

    /* JADX INFO: renamed from: a */
    public static synchronized InterfaceC16304aw m74953a(Context context) {
        try {
            if (f51450a == null) {
                C16351u c16351u = new C16351u(null);
                c16351u.m74986a(C16367ag.m75015a(context));
                f51450a = c16351u.mo74951b();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f51450a;
    }
}
