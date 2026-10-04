package o0ooOO0;

import OooOo.C20496Oooo0o0;
import OooooO0.C21288OooO0Oo;
import OooooO0.C21290OooO0o0;
import OooooO0.C21293OooOO0;
import OooooO0.C21294OooOO0O;
import OooooOO.C21325OooOooo;
import OooooOO.C21328Oooo000;
import OooooOO.C21331Oooo0O0;
import OooooOO.C21332Oooo0OO;
import OooooOO.C21343OoooOOo;
import OooooOO.C21355Ooooooo;
import OooooOO.C21359o00Ooo;
import OooooOO.InterfaceC21342OoooOOO;
import OooooOO.InterfaceC21361o00oO0O;
import OooooOO.InterfaceC21370ooOO;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.os.Build;
import androidx.compose.p002ui.platform.AndroidComposeView;
import o0000Ooo.C24226OooO;
import o0000Ooo.EnumC24238OooOOO;
import o0000Ooo.InterfaceC24229OooO0OO;
import o00oO0O.AbstractC25521OoooO;
import o00oO0O.InterfaceC25540Oooooo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: o0ooOO0.o0000Oo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C31571o0000Oo0 implements InterfaceC25540Oooooo {

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public static final OooO00o f112813Oooo0 = OooO00o.f112826OooOo0o;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public AbstractC25521OoooO f112814OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final AndroidComposeView f112815OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f112816OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public AbstractC25521OoooO.OooO0o f112817OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final oo0o0Oo f112818OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public boolean f112819OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f112820OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public C21331Oooo0O0 f112821OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final o0Oo0oo<InterfaceC31563Ooooooo> f112822OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final C21343OoooOOo f112823Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public long f112824Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final InterfaceC31563Ooooooo f112825Oooo00o;

    /* JADX INFO: renamed from: o0ooOO0.o0000Oo0$OooO00o */
    public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements InterfaceC32508OooOOOo<InterfaceC31563Ooooooo, Matrix, C32460OooOooO> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f112826OooOo0o = new OooO00o(2);

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final C32460OooOooO invoke(InterfaceC31563Ooooooo interfaceC31563Ooooooo, Matrix matrix) {
            InterfaceC31563Ooooooo rn = interfaceC31563Ooooooo;
            Matrix matrix2 = matrix;
            kotlin.jvm.internal.OooOOO0.OooO0oO(rn, "rn");
            kotlin.jvm.internal.OooOOO0.OooO0oO(matrix2, "matrix");
            rn.OooOOOO(matrix2);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public C31571o0000Oo0(AndroidComposeView ownerView, AbstractC25521OoooO abstractC25521OoooO, AbstractC25521OoooO.OooO0o invalidateParentLayer) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(ownerView, "ownerView");
        kotlin.jvm.internal.OooOOO0.OooO0oO(invalidateParentLayer, "invalidateParentLayer");
        this.f112815OooOo0o = ownerView;
        this.f112814OooOo = abstractC25521OoooO;
        this.f112817OooOoO0 = invalidateParentLayer;
        this.f112818OooOoOO = new oo0o0Oo(ownerView.getDensity());
        this.f112822OooOooo = new o0Oo0oo<>(f112813Oooo0);
        this.f112823Oooo000 = new C21343OoooOOo();
        this.f112824Oooo00O = OooooOO.o0OO00O.f61796OooO0O0;
        InterfaceC31563Ooooooo o0000oo2 = Build.VERSION.SDK_INT >= 29 ? new o0000OO(ownerView) : new o0O0O00(ownerView);
        o0000oo2.OooO0oO();
        this.f112825Oooo00o = o0000oo2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    @Override // o00oO0O.InterfaceC25540Oooooo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO() {
        InterfaceC21370ooOO interfaceC21370ooOO;
        boolean z = this.f112816OooOoO;
        InterfaceC31563Ooooooo interfaceC31563Ooooooo = this.f112825Oooo00o;
        if (z || !interfaceC31563Ooooooo.OooO0o()) {
            OooOO0(false);
            if (interfaceC31563Ooooooo.OooOOO0()) {
                oo0o0Oo oo0o0oo = this.f112818OooOoOO;
                if (oo0o0oo.f112937OooO) {
                    oo0o0oo.OooO0o0();
                    interfaceC21370ooOO = oo0o0oo.f112944OooO0oO;
                } else {
                    interfaceC21370ooOO = null;
                }
            }
            AbstractC25521OoooO abstractC25521OoooO = this.f112814OooOo;
            if (abstractC25521OoooO != null) {
                interfaceC31563Ooooooo.OooO0o0(this.f112823Oooo000, interfaceC21370ooOO, abstractC25521OoooO);
            }
        }
    }

    @Override // o00oO0O.InterfaceC25540Oooooo
    public final void OooO00o(float f, float f2, float f3, float f4, float f5, long j, InterfaceC21361o00oO0O shape, boolean z, long j2, long j3, EnumC24238OooOOO layoutDirection, InterfaceC24229OooO0OO density) {
        AbstractC25521OoooO.OooO0o oooO0o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(shape, "shape");
        kotlin.jvm.internal.OooOOO0.OooO0oO(layoutDirection, "layoutDirection");
        kotlin.jvm.internal.OooOOO0.OooO0oO(density, "density");
        this.f112824Oooo00O = j;
        InterfaceC31563Ooooooo interfaceC31563Ooooooo = this.f112825Oooo00o;
        boolean zOooOOO0 = interfaceC31563Ooooooo.OooOOO0();
        oo0o0Oo oo0o0oo = this.f112818OooOoOO;
        boolean z2 = false;
        boolean z3 = zOooOOO0 && oo0o0oo.f112937OooO;
        interfaceC31563Ooooooo.OooOo0(f);
        interfaceC31563Ooooooo.OooOo0O(f2);
        interfaceC31563Ooooooo.OooOOO(f3);
        interfaceC31563Ooooooo.OooOooO();
        interfaceC31563Ooooooo.OooOoo0();
        interfaceC31563Ooooooo.OooO0OO(f4);
        interfaceC31563Ooooooo.OooOoo(C20496Oooo0o0.OooO0oo(j2));
        interfaceC31563Ooooooo.OooOooo(C20496Oooo0o0.OooO0oo(j3));
        interfaceC31563Ooooooo.OooOO0O();
        interfaceC31563Ooooooo.OooO0oo();
        interfaceC31563Ooooooo.OooO();
        interfaceC31563Ooooooo.OooOO0o(f5);
        int i = OooooOO.o0OO00O.f61797OooO0OO;
        interfaceC31563Ooooooo.OooOOo(Float.intBitsToFloat((int) (j >> 32)) * interfaceC31563Ooooooo.getWidth());
        interfaceC31563Ooooooo.OooOOoo(Float.intBitsToFloat((int) (4294967295L & j)) * interfaceC31563Ooooooo.getHeight());
        C21359o00Ooo.OooO00o oooO00o = C21359o00Ooo.f61779OooO00o;
        interfaceC31563Ooooooo.OooOo0o(z && shape != oooO00o);
        interfaceC31563Ooooooo.OooO0O0(z && shape == oooO00o);
        interfaceC31563Ooooooo.OooOOo0();
        interfaceC31563Ooooooo.OooOO0();
        boolean zOooO0Oo = this.f112818OooOoOO.OooO0Oo(shape, interfaceC31563Ooooooo.getAlpha(), interfaceC31563Ooooooo.OooOOO0(), interfaceC31563Ooooooo.Oooo000(), layoutDirection, density);
        interfaceC31563Ooooooo.OooOo00(oo0o0oo.OooO0O0());
        if (interfaceC31563Ooooooo.OooOOO0() && oo0o0oo.f112937OooO) {
            z2 = true;
        }
        AndroidComposeView androidComposeView = this.f112815OooOo0o;
        if (z3 == z2 && (!z2 || !zOooO0Oo)) {
            C31593o000Oo0O.f112896OooO00o.OooO00o(androidComposeView);
        } else if (!this.f112816OooOoO && !this.f112820OooOoo0) {
            androidComposeView.invalidate();
            OooOO0(true);
        }
        if (!this.f112819OooOoo && interfaceC31563Ooooooo.Oooo000() > 0.0f && (oooO0o = this.f112817OooOoO0) != null) {
            oooO0o.invoke();
        }
        this.f112822OooOooo.OooO0OO();
    }

    @Override // o00oO0O.InterfaceC25540Oooooo
    public final void OooO0O0(InterfaceC21342OoooOOO canvas) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(canvas, "canvas");
        Canvas canvas2 = C21328Oooo000.f61738OooO00o;
        Canvas canvas3 = ((C21325OooOooo) canvas).f61733OooO00o;
        boolean zIsHardwareAccelerated = canvas3.isHardwareAccelerated();
        InterfaceC31563Ooooooo interfaceC31563Ooooooo = this.f112825Oooo00o;
        if (zIsHardwareAccelerated) {
            OooO();
            boolean z = interfaceC31563Ooooooo.Oooo000() > 0.0f;
            this.f112819OooOoo = z;
            if (z) {
                canvas.OooOOOO();
            }
            interfaceC31563Ooooooo.OooO00o(canvas3);
            if (this.f112819OooOoo) {
                canvas.OooO0o0();
                return;
            }
            return;
        }
        float left = interfaceC31563Ooooooo.getLeft();
        float fOooOoOO = interfaceC31563Ooooooo.OooOoOO();
        float right = interfaceC31563Ooooooo.getRight();
        float bottom = interfaceC31563Ooooooo.getBottom();
        if (interfaceC31563Ooooooo.getAlpha() < 1.0f) {
            C21331Oooo0O0 c21331Oooo0O0OooO00o = this.f112821OooOooO;
            if (c21331Oooo0O0OooO00o == null) {
                c21331Oooo0O0OooO00o = C21332Oooo0OO.OooO00o();
                this.f112821OooOooO = c21331Oooo0O0OooO00o;
            }
            c21331Oooo0O0OooO00o.OooOO0(interfaceC31563Ooooooo.getAlpha());
            canvas3.saveLayer(left, fOooOoOO, right, bottom, c21331Oooo0O0OooO00o.f61740OooO00o);
        } else {
            canvas.OooOOo0();
        }
        canvas.OooO0OO(left, fOooOoOO);
        canvas.OooOOo(this.f112822OooOooo.OooO0O0(interfaceC31563Ooooooo));
        if (interfaceC31563Ooooooo.OooOOO0() || interfaceC31563Ooooooo.OooOoO()) {
            this.f112818OooOoOO.OooO00o(canvas);
        }
        AbstractC25521OoooO abstractC25521OoooO = this.f112814OooOo;
        if (abstractC25521OoooO != null) {
            abstractC25521OoooO.invoke(canvas);
        }
        canvas.OooOO0o();
        OooOO0(false);
    }

    @Override // o00oO0O.InterfaceC25540Oooooo
    public final long OooO0OO(long j, boolean z) {
        InterfaceC31563Ooooooo interfaceC31563Ooooooo = this.f112825Oooo00o;
        o0Oo0oo<InterfaceC31563Ooooooo> o0oo0oo2 = this.f112822OooOooo;
        if (!z) {
            return C21355Ooooooo.OooO0OO(o0oo0oo2.OooO0O0(interfaceC31563Ooooooo), j);
        }
        float[] fArrOooO00o = o0oo0oo2.OooO00o(interfaceC31563Ooooooo);
        return fArrOooO00o != null ? C21355Ooooooo.OooO0OO(fArrOooO00o, j) : C21290OooO0o0.f61719OooO0OO;
    }

    @Override // o00oO0O.InterfaceC25540Oooooo
    public final void OooO0Oo(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        long j2 = this.f112824Oooo00O;
        int i3 = OooooOO.o0OO00O.f61797OooO0OO;
        float f = i;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * f;
        InterfaceC31563Ooooooo interfaceC31563Ooooooo = this.f112825Oooo00o;
        interfaceC31563Ooooooo.OooOOo(fIntBitsToFloat);
        float f2 = i2;
        interfaceC31563Ooooooo.OooOOoo(Float.intBitsToFloat((int) (4294967295L & this.f112824Oooo00O)) * f2);
        if (interfaceC31563Ooooooo.OooOo(interfaceC31563Ooooooo.getLeft(), interfaceC31563Ooooooo.OooOoOO(), interfaceC31563Ooooooo.getLeft() + i, interfaceC31563Ooooooo.OooOoOO() + i2)) {
            long jOooO00o = C21294OooOO0O.OooO00o(f, f2);
            oo0o0Oo oo0o0oo = this.f112818OooOoOO;
            if (!C21293OooOO0.OooO00o(oo0o0oo.f112941OooO0Oo, jOooO00o)) {
                oo0o0oo.f112941OooO0Oo = jOooO00o;
                oo0o0oo.f112945OooO0oo = true;
            }
            interfaceC31563Ooooooo.OooOo00(oo0o0oo.OooO0O0());
            if (!this.f112816OooOoO && !this.f112820OooOoo0) {
                this.f112815OooOo0o.invalidate();
                OooOO0(true);
            }
            this.f112822OooOooo.OooO0OO();
        }
    }

    @Override // o00oO0O.InterfaceC25540Oooooo
    public final void OooO0o(AbstractC25521OoooO abstractC25521OoooO, AbstractC25521OoooO.OooO0o invalidateParentLayer) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(invalidateParentLayer, "invalidateParentLayer");
        OooOO0(false);
        this.f112820OooOoo0 = false;
        this.f112819OooOoo = false;
        this.f112824Oooo00O = OooooOO.o0OO00O.f61796OooO0O0;
        this.f112814OooOo = abstractC25521OoooO;
        this.f112817OooOoO0 = invalidateParentLayer;
    }

    @Override // o00oO0O.InterfaceC25540Oooooo
    public final void OooO0o0(C21288OooO0Oo c21288OooO0Oo, boolean z) {
        InterfaceC31563Ooooooo interfaceC31563Ooooooo = this.f112825Oooo00o;
        o0Oo0oo<InterfaceC31563Ooooooo> o0oo0oo2 = this.f112822OooOooo;
        if (!z) {
            C21355Ooooooo.OooO0Oo(o0oo0oo2.OooO0O0(interfaceC31563Ooooooo), c21288OooO0Oo);
            return;
        }
        float[] fArrOooO00o = o0oo0oo2.OooO00o(interfaceC31563Ooooooo);
        if (fArrOooO00o != null) {
            C21355Ooooooo.OooO0Oo(fArrOooO00o, c21288OooO0Oo);
            return;
        }
        c21288OooO0Oo.f61714OooO00o = 0.0f;
        c21288OooO0Oo.f61715OooO0O0 = 0.0f;
        c21288OooO0Oo.f61716OooO0OO = 0.0f;
        c21288OooO0Oo.f61717OooO0Oo = 0.0f;
    }

    @Override // o00oO0O.InterfaceC25540Oooooo
    public final boolean OooO0oO(long j) {
        float fOooO0OO = C21290OooO0o0.OooO0OO(j);
        float fOooO0Oo = C21290OooO0o0.OooO0Oo(j);
        InterfaceC31563Ooooooo interfaceC31563Ooooooo = this.f112825Oooo00o;
        if (interfaceC31563Ooooooo.OooOoO()) {
            return 0.0f <= fOooO0OO && fOooO0OO < ((float) interfaceC31563Ooooooo.getWidth()) && 0.0f <= fOooO0Oo && fOooO0Oo < ((float) interfaceC31563Ooooooo.getHeight());
        }
        if (interfaceC31563Ooooooo.OooOOO0()) {
            return this.f112818OooOoOO.OooO0OO(j);
        }
        return true;
    }

    @Override // o00oO0O.InterfaceC25540Oooooo
    public final void OooO0oo(long j) {
        InterfaceC31563Ooooooo interfaceC31563Ooooooo = this.f112825Oooo00o;
        int left = interfaceC31563Ooooooo.getLeft();
        int iOooOoOO = interfaceC31563Ooooooo.OooOoOO();
        int i = C24226OooO.f81469OooO0OO;
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        if (left == i2 && iOooOoOO == i3) {
            return;
        }
        interfaceC31563Ooooooo.OooOOOo(i2 - left);
        interfaceC31563Ooooooo.OooO0Oo(i3 - iOooOoOO);
        C31593o000Oo0O.f112896OooO00o.OooO00o(this.f112815OooOo0o);
        this.f112822OooOooo.OooO0OO();
    }

    public final void OooOO0(boolean z) {
        if (z != this.f112816OooOoO) {
            this.f112816OooOoO = z;
            this.f112815OooOo0o.OooOO0o(this, z);
        }
    }

    @Override // o00oO0O.InterfaceC25540Oooooo
    public final void destroy() {
        InterfaceC31563Ooooooo interfaceC31563Ooooooo = this.f112825Oooo00o;
        if (interfaceC31563Ooooooo.OooO0o()) {
            interfaceC31563Ooooooo.OooOoO0();
        }
        this.f112814OooOo = null;
        this.f112817OooOoO0 = null;
        this.f112820OooOoo0 = true;
        OooOO0(false);
        AndroidComposeView androidComposeView = this.f112815OooOo0o;
        androidComposeView.f63388OoooO00 = true;
        androidComposeView.OooOo00(this);
    }

    @Override // o00oO0O.InterfaceC25540Oooooo
    public final void invalidate() {
        if (this.f112816OooOoO || this.f112820OooOoo0) {
            return;
        }
        this.f112815OooOo0o.invalidate();
        OooOO0(true);
    }
}
