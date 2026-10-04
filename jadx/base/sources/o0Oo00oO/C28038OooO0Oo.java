package o0Oo00oO;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import androidx.core.hardware.display.DisplayManagerCompat;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32443OooOOO;

/* JADX INFO: renamed from: o0Oo00oO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C28038OooO0Oo {
    public static final C32443OooOOO<Integer, Integer> OooO00o(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            Display display = DisplayManagerCompat.getInstance(context).getDisplay(0);
            OooOOO0.OooO0Oo(display);
            Context contextCreateDisplayContext = context.createDisplayContext(display);
            return new C32443OooOOO<>(Integer.valueOf(contextCreateDisplayContext.getResources().getDisplayMetrics().widthPixels), Integer.valueOf(contextCreateDisplayContext.getResources().getDisplayMetrics().heightPixels));
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Object systemService = context.getSystemService("window");
        OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
        return new C32443OooOOO<>(Integer.valueOf(displayMetrics.widthPixels), Integer.valueOf(displayMetrics.heightPixels));
    }

    public static final boolean OooO0O0(Context context) {
        OooOOO0.OooO0oO(context, "<this>");
        return Math.min(context.getResources().getConfiguration().screenHeightDp, context.getResources().getConfiguration().screenWidthDp) <= 480;
    }
}
