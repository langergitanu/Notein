package o0ooOO0;

import OooooOO.C21327Oooo0;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: o0ooOO0.OooooOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C31550OooooOO implements InterfaceC31549OooooO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Matrix f112765OooO00o = new Matrix();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int[] f112766OooO0O0 = new int[2];

    @Override // o0ooOO0.InterfaceC31549OooooO0
    public void OooO00o(View view, float[] matrix) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(view, "view");
        kotlin.jvm.internal.OooOOO0.OooO0oO(matrix, "matrix");
        Matrix matrix2 = this.f112765OooO00o;
        matrix2.reset();
        view.transformMatrixToGlobal(matrix2);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.f112766OooO0O0;
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix2.postTranslate(iArr[0] - i, iArr[1] - i2);
        C21327Oooo0.OooO0O0(matrix, matrix2);
    }
}
