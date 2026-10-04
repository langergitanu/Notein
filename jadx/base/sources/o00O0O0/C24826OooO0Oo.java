package o00O0O0;

import android.content.Context;
import android.view.WindowInsets;
import android.view.WindowManager;
import androidx.core.view.WindowInsetsCompat;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o00O0O0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24826OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C24826OooO0Oo f84206OooO00o = new C24826OooO0Oo();

    public final WindowInsetsCompat OooO00o(Context context) {
        OooOOO0.OooO0oO(context, "context");
        WindowInsets windowInsets = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getWindowInsets();
        OooOOO0.OooO0o(windowInsets, "context.getSystemService…indowMetrics.windowInsets");
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(windowInsets);
        OooOOO0.OooO0o(windowInsetsCompat, "toWindowInsetsCompat(platformInsets)");
        return windowInsetsCompat;
    }
}
