package OooooOO;

import OooooO0.C21284OooO;
import OooooO0.C21285OooO00o;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: renamed from: OooooOO.Oooo0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21334Oooo0o0 implements InterfaceC21370ooOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Path f61747OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final RectF f61748OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final float[] f61749OooO0OO;

    public C21334Oooo0o0() {
        this(0);
    }

    @Override // OooooOO.InterfaceC21370ooOO
    public final void OooO00o(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f61747OooO00o.cubicTo(f, f2, f3, f4, f5, f6);
    }

    @Override // OooooOO.InterfaceC21370ooOO
    public final void OooO0O0(float f, float f2) {
        this.f61747OooO00o.rMoveTo(f, f2);
    }

    @Override // OooooOO.InterfaceC21370ooOO
    public final void OooO0OO(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f61747OooO00o.rCubicTo(f, f2, f3, f4, f5, f6);
    }

    @Override // OooooOO.InterfaceC21370ooOO
    public final void OooO0Oo(float f, float f2, float f3, float f4) {
        this.f61747OooO00o.rQuadTo(f, f2, f3, f4);
    }

    @Override // OooooOO.InterfaceC21370ooOO
    public final void OooO0o(C21284OooO roundRect) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(roundRect, "roundRect");
        RectF rectF = this.f61748OooO0O0;
        rectF.set(roundRect.f61702OooO00o, roundRect.f61703OooO0O0, roundRect.f61704OooO0OO, roundRect.f61705OooO0Oo);
        long j = roundRect.f61707OooO0o0;
        float fOooO0O0 = C21285OooO00o.OooO0O0(j);
        float[] fArr = this.f61749OooO0OO;
        fArr[0] = fOooO0O0;
        fArr[1] = C21285OooO00o.OooO0OO(j);
        long j2 = roundRect.f61706OooO0o;
        fArr[2] = C21285OooO00o.OooO0O0(j2);
        fArr[3] = C21285OooO00o.OooO0OO(j2);
        long j3 = roundRect.f61708OooO0oO;
        fArr[4] = C21285OooO00o.OooO0O0(j3);
        fArr[5] = C21285OooO00o.OooO0OO(j3);
        long j4 = roundRect.f61709OooO0oo;
        fArr[6] = C21285OooO00o.OooO0O0(j4);
        fArr[7] = C21285OooO00o.OooO0OO(j4);
        this.f61747OooO00o.addRoundRect(rectF, fArr, Path.Direction.CCW);
    }

    @Override // OooooOO.InterfaceC21370ooOO
    public final boolean OooO0o0() {
        return this.f61747OooO00o.isConvex();
    }

    @Override // OooooOO.InterfaceC21370ooOO
    public final void OooO0oO(float f, float f2) {
        this.f61747OooO00o.rLineTo(f, f2);
    }

    public final boolean OooO0oo(InterfaceC21370ooOO path1, InterfaceC21370ooOO interfaceC21370ooOO, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(path1, "path1");
        Path.Op op = i == 0 ? Path.Op.DIFFERENCE : i == 1 ? Path.Op.INTERSECT : i == 4 ? Path.Op.REVERSE_DIFFERENCE : i == 2 ? Path.Op.UNION : Path.Op.XOR;
        if (!(path1 instanceof C21334Oooo0o0)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        C21334Oooo0o0 c21334Oooo0o0 = (C21334Oooo0o0) path1;
        if (interfaceC21370ooOO instanceof C21334Oooo0o0) {
            return this.f61747OooO00o.op(c21334Oooo0o0.f61747OooO00o, ((C21334Oooo0o0) interfaceC21370ooOO).f61747OooO00o, op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // OooooOO.InterfaceC21370ooOO
    public final void close() {
        this.f61747OooO00o.close();
    }

    @Override // OooooOO.InterfaceC21370ooOO
    public final void lineTo(float f, float f2) {
        this.f61747OooO00o.lineTo(f, f2);
    }

    @Override // OooooOO.InterfaceC21370ooOO
    public final void moveTo(float f, float f2) {
        this.f61747OooO00o.moveTo(f, f2);
    }

    @Override // OooooOO.InterfaceC21370ooOO
    public final void quadraticBezierTo(float f, float f2, float f3, float f4) {
        this.f61747OooO00o.quadTo(f, f2, f3, f4);
    }

    @Override // OooooOO.InterfaceC21370ooOO
    public final void reset() {
        this.f61747OooO00o.reset();
    }

    public C21334Oooo0o0(int i) {
        this.f61747OooO00o = new Path();
        this.f61748OooO0O0 = new RectF();
        this.f61749OooO0OO = new float[8];
        new Matrix();
    }
}
