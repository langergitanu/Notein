package androidx.transition;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: renamed from: androidx.transition.Oooo00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C22116Oooo00o extends C22115Oooo00O {
    @Override // androidx.transition.C22113OooOooO
    public final float OooO00o(View view) {
        return view.getTransitionAlpha();
    }

    @Override // androidx.transition.C22113OooOooO
    public final void OooO0O0(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // androidx.transition.C22115Oooo00O, androidx.transition.C22113OooOooO
    public final void OooO0OO(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // androidx.transition.C22114OooOooo
    public final void OooO0Oo(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // androidx.transition.Oooo000
    public final void OooO0o(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // androidx.transition.C22114OooOooo
    public final void OooO0o0(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
