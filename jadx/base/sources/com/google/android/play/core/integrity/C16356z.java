package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.C16367ag;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.z */
/* JADX INFO: loaded from: classes7.dex */
final class C16356z {

    /* JADX INFO: renamed from: a */
    private static C16349s f51532a;

    /* JADX INFO: renamed from: a */
    public static synchronized C16349s m74988a(Context context) {
        try {
            if (f51532a == null) {
                C16347q c16347q = new C16347q(null);
                c16347q.m74983a(C16367ag.m75015a(context));
                f51532a = c16347q.mo74984b();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f51532a;
    }
}
