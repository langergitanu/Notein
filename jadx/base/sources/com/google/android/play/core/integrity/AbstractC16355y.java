package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.integrity.internal.C16408s;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.y */
/* JADX INFO: loaded from: classes7.dex */
abstract class AbstractC16355y {

    /* JADX INFO: renamed from: b */
    private final String f51528b;

    /* JADX INFO: renamed from: c */
    private final long f51529c;

    /* JADX INFO: renamed from: e */
    private boolean f51531e;

    /* JADX INFO: renamed from: a */
    private final C16408s f51527a = new C16408s("IntegrityDialogWrapper");

    /* JADX INFO: renamed from: d */
    private final Object f51530d = new Object();

    public AbstractC16355y(String str, long j) {
        this.f51528b = str;
        this.f51529c = j;
    }

    /* JADX INFO: renamed from: a */
    public final Task m74987a(Activity activity, int i) {
        synchronized (this.f51530d) {
            try {
                if (this.f51531e) {
                    return Tasks.forResult(0);
                }
                this.f51531e = true;
                this.f51527a.m75058a("checkAndShowDialog(%s)", Integer.valueOf(i));
                Bundle bundle = new Bundle();
                bundle.putInt("dialog.intent.type", i);
                bundle.putString("package.name", this.f51528b);
                bundle.putInt("playcore.integrity.version.major", 1);
                bundle.putInt("playcore.integrity.version.minor", 4);
                bundle.putInt("playcore.integrity.version.patch", 0);
                bundle.putLong("request.token.sid", this.f51529c);
                return mo74938b(activity, bundle);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract Task mo74938b(Activity activity, Bundle bundle);
}
