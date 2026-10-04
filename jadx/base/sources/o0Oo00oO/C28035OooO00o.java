package o0Oo00oO;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o0Oo00oO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C28035OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f99396OooO00o = 0;

    public static final CancellationException OooO00o(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public static final boolean OooO0O0(Context context, String str) {
        Object next;
        List<PackageInfo> installedPackages = context.getPackageManager().getInstalledPackages(0);
        OooOOO0.OooO0Oo(installedPackages);
        Iterator<T> it = installedPackages.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((PackageInfo) next).packageName.equals(str)) {
                break;
            }
        }
        return next != null;
    }

    public static final void OooO0OO(View view, float f, float f2, float f3, float f4) {
        OooOOO0.OooO0oO(view, "<this>");
        long jUptimeMillis = SystemClock.uptimeMillis();
        long jUptimeMillis2 = SystemClock.uptimeMillis();
        view.dispatchTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis2, 0, f, f2, 0));
        view.dispatchTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis2, 2, f + f3, f2 + f4, 0));
        view.dispatchTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis2, 1, f, f2, 0));
    }
}
