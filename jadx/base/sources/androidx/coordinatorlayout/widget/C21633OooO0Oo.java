package androidx.coordinatorlayout.widget;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;

/* JADX INFO: renamed from: androidx.coordinatorlayout.widget.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21633OooO0Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final ThreadLocal<Matrix> f64198OooO00o = new ThreadLocal<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final ThreadLocal<RectF> f64199OooO0O0 = new ThreadLocal<>();

    public static void OooO00o(CoordinatorLayout coordinatorLayout, View view, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != coordinatorLayout) {
            OooO00o(coordinatorLayout, (View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }
}
