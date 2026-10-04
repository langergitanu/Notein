package androidx.appcompat.widget;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: androidx.appcompat.widget.Ooooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21572Ooooo0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static boolean f63118OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static Method f63119OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final boolean f63120OooO0OO;

    /* JADX INFO: renamed from: androidx.appcompat.widget.Ooooo0o$OooO00o */
    public static class OooO00o {
        public static void OooO00o(View view, Rect rect, Rect rect2) {
            Insets systemWindowInsets = view.computeSystemWindowInsets(new WindowInsets.Builder().setSystemWindowInsets(Insets.of(rect)).build(), rect2).getSystemWindowInsets();
            rect.set(systemWindowInsets.left, systemWindowInsets.top, systemWindowInsets.right, systemWindowInsets.bottom);
        }
    }

    static {
        f63120OooO0OO = Build.VERSION.SDK_INT >= 27;
    }
}
