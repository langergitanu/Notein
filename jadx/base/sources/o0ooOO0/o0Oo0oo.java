package o0ooOO0;

import Oooo000.C20901OooOOo0;
import OooooOO.C21327Oooo0;
import OooooOO.C21355Ooooooo;
import android.graphics.Matrix;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: loaded from: classes.dex */
public final class o0Oo0oo<T> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final kotlin.jvm.internal.OooOOOO f112919OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Matrix f112920OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Matrix f112921OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public float[] f112922OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f112923OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public float[] f112924OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f112925OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f112926OooO0oo;

    /* JADX WARN: Multi-variable type inference failed */
    public o0Oo0oo(InterfaceC32508OooOOOo<? super T, ? super Matrix, C32460OooOooO> getMatrix) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(getMatrix, "getMatrix");
        this.f112919OooO00o = (kotlin.jvm.internal.OooOOOO) getMatrix;
        this.f112923OooO0o = true;
        this.f112925OooO0oO = true;
        this.f112926OooO0oo = true;
    }

    public final float[] OooO00o(T t) {
        float[] fArrOooO00o = this.f112924OooO0o0;
        if (fArrOooO00o == null) {
            fArrOooO00o = C21355Ooooooo.OooO00o();
            this.f112924OooO0o0 = fArrOooO00o;
        }
        if (this.f112925OooO0oO) {
            this.f112926OooO0oo = C20901OooOOo0.OooO0O0(OooO0O0(t), fArrOooO00o);
            this.f112925OooO0oO = false;
        }
        if (this.f112926OooO0oo) {
            return fArrOooO00o;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.internal.OooOOOO, oO0O000o.OooOOOo] */
    public final float[] OooO0O0(T t) {
        float[] fArrOooO00o = this.f112922OooO0Oo;
        if (fArrOooO00o == null) {
            fArrOooO00o = C21355Ooooooo.OooO00o();
            this.f112922OooO0Oo = fArrOooO00o;
        }
        if (!this.f112923OooO0o) {
            return fArrOooO00o;
        }
        Matrix matrix = this.f112920OooO0O0;
        if (matrix == null) {
            matrix = new Matrix();
            this.f112920OooO0O0 = matrix;
        }
        this.f112919OooO00o.invoke(t, matrix);
        Matrix matrix2 = this.f112921OooO0OO;
        if (matrix2 == null || !matrix.equals(matrix2)) {
            C21327Oooo0.OooO0O0(fArrOooO00o, matrix);
            this.f112920OooO0O0 = matrix2;
            this.f112921OooO0OO = matrix;
        }
        this.f112923OooO0o = false;
        return fArrOooO00o;
    }

    public final void OooO0OO() {
        this.f112923OooO0o = true;
        this.f112925OooO0oO = true;
    }
}
