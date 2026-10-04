package OooOOoo;

import android.os.Looper;
import androidx.core.util.Preconditions;

/* JADX INFO: renamed from: OooOOoo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20469OooO00o {
    public static void OooO00o() {
        Preconditions.checkState(Looper.getMainLooper().getThread() == Thread.currentThread(), "Not in application's main thread");
    }
}
