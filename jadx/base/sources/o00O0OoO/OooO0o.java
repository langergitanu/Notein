package o00O0OoO;

import OooooOO.C21327Oooo0;
import OooooOO.C21355Ooooooo;
import android.database.Cursor;
import android.graphics.Matrix;
import android.view.View;
import androidx.work.impl.WorkDatabase_Impl;
import o000oo0.C24681OooOoo0;
import o000ooOO.C24734OooO0O0;
import o0ooOO0.C31534Oooo0o0;
import o0ooOO0.InterfaceC31549OooooO0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o implements InterfaceC31549OooooO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Object f84440OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object f84441OooO0O0;

    public OooO0o(WorkDatabase_Impl workDatabase_Impl) {
        this.f84440OooO00o = workDatabase_Impl;
        this.f84441OooO0O0 = new C24873OooO0o0(workDatabase_Impl);
    }

    @Override // o0ooOO0.InterfaceC31549OooooO0
    public void OooO00o(View view, float[] matrix) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(matrix, "matrix");
        C21355Ooooooo.OooO0o(matrix);
        OooO0o0(view, matrix);
    }

    public Long OooO0O0(String str) {
        C24681OooOoo0 c24681OooOoo0OooOOO0 = C24681OooOoo0.OooOOO0(1, "SELECT long_value FROM Preference where `key`=?");
        c24681OooOoo0OooOOO0.OoooOO0(1, str);
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f84440OooO00o;
        workDatabase_Impl.OooO0O0();
        Cursor cursorOooO = C24734OooO0O0.OooO(workDatabase_Impl, c24681OooOoo0OooOOO0, false);
        try {
            Long lValueOf = null;
            if (cursorOooO.moveToFirst() && !cursorOooO.isNull(0)) {
                lValueOf = Long.valueOf(cursorOooO.getLong(0));
            }
            return lValueOf;
        } finally {
            cursorOooO.close();
            c24681OooOoo0OooOOO0.release();
        }
    }

    public void OooO0OO(C24872OooO0Oo c24872OooO0Oo) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f84440OooO00o;
        workDatabase_Impl.OooO0O0();
        workDatabase_Impl.OooO0OO();
        try {
            ((C24873OooO0o0) this.f84441OooO0O0).OooOOO(c24872OooO0Oo);
            workDatabase_Impl.OooOOoo();
        } finally {
            workDatabase_Impl.OooOOOo();
        }
    }

    public void OooO0Oo(float f, float f2, float[] fArr) {
        float[] fArr2 = (float[]) this.f84441OooO0O0;
        C21355Ooooooo.OooO0o(fArr2);
        C21355Ooooooo.OooO0oo(f, f2, fArr2);
        C31534Oooo0o0.OooO00o(fArr, fArr2);
    }

    public void OooO0o0(View view, float[] fArr) {
        Object parent = view.getParent();
        if (parent instanceof View) {
            OooO0o0((View) parent, fArr);
            OooO0Oo(-view.getScrollX(), -view.getScrollY(), fArr);
            OooO0Oo(view.getLeft(), view.getTop(), fArr);
        } else {
            view.getLocationInWindow((int[]) this.f84440OooO00o);
            OooO0Oo(-view.getScrollX(), -view.getScrollY(), fArr);
            OooO0Oo(r0[0], r0[1], fArr);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        float[] fArr2 = (float[]) this.f84441OooO0O0;
        C21327Oooo0.OooO0O0(fArr2, matrix);
        C31534Oooo0o0.OooO00o(fArr, fArr2);
    }

    public OooO0o() {
        this.f84440OooO00o = new int[2];
        this.f84441OooO0O0 = C21355Ooooooo.OooO00o();
    }
}
