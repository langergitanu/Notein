package o0ooOO0;

import Oooo0.C20857Oooooo;
import OooooO0.C21284OooO;
import OooooO0.C21285OooO00o;
import OooooO0.C21286OooO0O0;
import OooooO0.C21289OooO0o;
import OooooO0.C21290OooO0o0;
import OooooO0.C21291OooO0oO;
import OooooO0.C21293OooOO0;
import OooooO0.C21294OooOO0O;
import OooooOO.AbstractC21365o0OoOo0;
import OooooOO.C21334Oooo0o0;
import OooooOO.C21335Oooo0oO;
import OooooOO.C21359o00Ooo;
import OooooOO.InterfaceC21342OoooOOO;
import OooooOO.InterfaceC21361o00oO0O;
import OooooOO.InterfaceC21370ooOO;
import android.graphics.Outline;
import android.os.Build;
import o0000Ooo.EnumC24238OooOOO;
import o0000Ooo.InterfaceC24229OooO0OO;
import oO00ooO.C32442OooOO0o;

/* JADX INFO: loaded from: classes.dex */
public final class oo0o0Oo {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f112937OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public InterfaceC24229OooO0OO f112938OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f112939OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Outline f112940OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f112941OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public C21334Oooo0o0 f112942OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public InterfaceC21361o00oO0O f112943OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public InterfaceC21370ooOO f112944OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f112945OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public InterfaceC21370ooOO f112946OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public C21284OooO f112947OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public float f112948OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public long f112949OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public long f112950OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f112951OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public EnumC24238OooOOO f112952OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public AbstractC21365o0OoOo0 f112953OooOOo0;

    public oo0o0Oo(InterfaceC24229OooO0OO density) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(density, "density");
        this.f112938OooO00o = density;
        this.f112939OooO0O0 = true;
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.f112940OooO0OO = outline;
        long j = C21293OooOO0.f61728OooO0O0;
        this.f112941OooO0Oo = j;
        this.f112943OooO0o0 = C21359o00Ooo.f61779OooO00o;
        this.f112950OooOOO0 = C21290OooO0o0.f61718OooO0O0;
        this.f112949OooOOO = j;
        this.f112952OooOOOo = EnumC24238OooOOO.f81494OooOo0o;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO00o(InterfaceC21342OoooOOO canvas) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(canvas, "canvas");
        OooO0o0();
        InterfaceC21370ooOO interfaceC21370ooOO = this.f112944OooO0oO;
        if (interfaceC21370ooOO != null) {
            canvas.OooOOOo(interfaceC21370ooOO);
            return;
        }
        float f = this.f112948OooOO0o;
        if (f <= 0.0f) {
            canvas.OooO0O0(C21290OooO0o0.OooO0OO(this.f112950OooOOO0), C21290OooO0o0.OooO0Oo(this.f112950OooOOO0), C21290OooO0o0.OooO0OO(this.f112950OooOOO0) + C21293OooOO0.OooO0Oo(this.f112949OooOOO), C21290OooO0o0.OooO0Oo(this.f112950OooOOO0) + C21293OooOO0.OooO0O0(this.f112949OooOOO), 1);
            return;
        }
        InterfaceC21370ooOO interfaceC21370ooOOOooO00o = this.f112946OooOO0;
        C21284OooO c21284OooO = this.f112947OooOO0O;
        if (interfaceC21370ooOOOooO00o != null) {
            long j = this.f112950OooOOO0;
            long j2 = this.f112949OooOOO;
            if (c21284OooO == null || !C20857Oooooo.OooO0OO(c21284OooO)) {
                float fOooO0OO = C21290OooO0o0.OooO0OO(this.f112950OooOOO0);
                float fOooO0Oo = C21290OooO0o0.OooO0Oo(this.f112950OooOOO0);
                float fOooO0Oo2 = C21293OooOO0.OooO0Oo(this.f112949OooOOO) + C21290OooO0o0.OooO0OO(this.f112950OooOOO0);
                float fOooO0O0 = C21293OooOO0.OooO0O0(this.f112949OooOOO) + C21290OooO0o0.OooO0Oo(this.f112950OooOOO0);
                float f2 = this.f112948OooOO0o;
                long jOooO00o = C21286OooO0O0.OooO00o(f2, f2);
                long jOooO00o2 = C21286OooO0O0.OooO00o(C21285OooO00o.OooO0O0(jOooO00o), C21285OooO00o.OooO0OO(jOooO00o));
                C21284OooO c21284OooO2 = new C21284OooO(fOooO0OO, fOooO0Oo, fOooO0Oo2, fOooO0O0, jOooO00o2, jOooO00o2, jOooO00o2, jOooO00o2);
                if (interfaceC21370ooOOOooO00o == null) {
                    interfaceC21370ooOOOooO00o = C21335Oooo0oO.OooO00o();
                } else {
                    interfaceC21370ooOOOooO00o.reset();
                }
                interfaceC21370ooOOOooO00o.OooO0o(c21284OooO2);
                this.f112947OooOO0O = c21284OooO2;
                this.f112946OooOO0 = interfaceC21370ooOOOooO00o;
            } else {
                if (c21284OooO.f61702OooO00o == C21290OooO0o0.OooO0OO(j)) {
                    if (c21284OooO.f61703OooO0O0 == C21290OooO0o0.OooO0Oo(j)) {
                        if (c21284OooO.f61704OooO0OO == C21293OooOO0.OooO0Oo(j2) + C21290OooO0o0.OooO0OO(j)) {
                            if (c21284OooO.f61705OooO0Oo != C21293OooOO0.OooO0O0(j2) + C21290OooO0o0.OooO0Oo(j) || C21285OooO00o.OooO0O0(c21284OooO.f61707OooO0o0) != f) {
                            }
                        }
                    }
                }
            }
        }
        canvas.OooOOOo(interfaceC21370ooOOOooO00o);
    }

    public final Outline OooO0O0() {
        OooO0o0();
        if (this.f112951OooOOOO && this.f112939OooO0O0) {
            return this.f112940OooO0OO;
        }
        return null;
    }

    public final boolean OooO0OO(long j) {
        AbstractC21365o0OoOo0 abstractC21365o0OoOo0;
        if (!this.f112951OooOOOO || (abstractC21365o0OoOo0 = this.f112953OooOOo0) == null) {
            return true;
        }
        float fOooO0OO = C21290OooO0o0.OooO0OO(j);
        float fOooO0Oo = C21290OooO0o0.OooO0Oo(j);
        if (abstractC21365o0OoOo0 instanceof AbstractC21365o0OoOo0.OooO0O0) {
            C21291OooO0oO c21291OooO0oO = ((AbstractC21365o0OoOo0.OooO0O0) abstractC21365o0OoOo0).f61801OooO00o;
            return c21291OooO0oO.f61724OooO00o <= fOooO0OO && fOooO0OO < c21291OooO0oO.f61726OooO0OO && c21291OooO0oO.f61725OooO0O0 <= fOooO0Oo && fOooO0Oo < c21291OooO0oO.f61727OooO0Oo;
        }
        if (!(abstractC21365o0OoOo0 instanceof AbstractC21365o0OoOo0.OooO0OO)) {
            if (abstractC21365o0OoOo0 instanceof AbstractC21365o0OoOo0.OooO00o) {
                return C31577o0000o0o.OooO00o(null, fOooO0OO, fOooO0Oo);
            }
            throw new C32442OooOO0o();
        }
        C21284OooO c21284OooO = ((AbstractC21365o0OoOo0.OooO0OO) abstractC21365o0OoOo0).f61802OooO00o;
        if (fOooO0OO < c21284OooO.f61702OooO00o) {
            return false;
        }
        float f = c21284OooO.f61704OooO0OO;
        if (fOooO0OO >= f) {
            return false;
        }
        float f2 = c21284OooO.f61703OooO0O0;
        if (fOooO0Oo < f2) {
            return false;
        }
        float f3 = c21284OooO.f61705OooO0Oo;
        if (fOooO0Oo >= f3) {
            return false;
        }
        long j2 = c21284OooO.f61707OooO0o0;
        float fOooO0O0 = C21285OooO00o.OooO0O0(j2);
        long j3 = c21284OooO.f61706OooO0o;
        if (C21285OooO00o.OooO0O0(j3) + fOooO0O0 <= c21284OooO.OooO0O0()) {
            long j4 = c21284OooO.f61709OooO0oo;
            float fOooO0O02 = C21285OooO00o.OooO0O0(j4);
            long j5 = c21284OooO.f61708OooO0oO;
            if (C21285OooO00o.OooO0O0(j5) + fOooO0O02 <= c21284OooO.OooO0O0()) {
                if (C21285OooO00o.OooO0OO(j4) + C21285OooO00o.OooO0OO(j2) <= c21284OooO.OooO00o()) {
                    if (C21285OooO00o.OooO0OO(j5) + C21285OooO00o.OooO0OO(j3) <= c21284OooO.OooO00o()) {
                        float fOooO0O03 = C21285OooO00o.OooO0O0(j2);
                        float f4 = c21284OooO.f61702OooO00o;
                        float f5 = fOooO0O03 + f4;
                        float fOooO0OO2 = C21285OooO00o.OooO0OO(j2) + f2;
                        float fOooO0O04 = f - C21285OooO00o.OooO0O0(j3);
                        float fOooO0OO3 = f2 + C21285OooO00o.OooO0OO(j3);
                        float fOooO0O05 = f - C21285OooO00o.OooO0O0(j5);
                        float fOooO0OO4 = f3 - C21285OooO00o.OooO0OO(j5);
                        float fOooO0OO5 = f3 - C21285OooO00o.OooO0OO(j4);
                        float fOooO0O06 = C21285OooO00o.OooO0O0(j4) + f4;
                        if (fOooO0OO < f5 && fOooO0Oo < fOooO0OO2) {
                            return C31577o0000o0o.OooO0O0(fOooO0OO, fOooO0Oo, f5, fOooO0OO2, c21284OooO.f61707OooO0o0);
                        }
                        if (fOooO0OO < fOooO0O06 && fOooO0Oo > fOooO0OO5) {
                            return C31577o0000o0o.OooO0O0(fOooO0OO, fOooO0Oo, fOooO0O06, fOooO0OO5, c21284OooO.f61709OooO0oo);
                        }
                        if (fOooO0OO > fOooO0O04 && fOooO0Oo < fOooO0OO3) {
                            return C31577o0000o0o.OooO0O0(fOooO0OO, fOooO0Oo, fOooO0O04, fOooO0OO3, c21284OooO.f61706OooO0o);
                        }
                        if (fOooO0OO <= fOooO0O05 || fOooO0Oo <= fOooO0OO4) {
                            return true;
                        }
                        return C31577o0000o0o.OooO0O0(fOooO0OO, fOooO0Oo, fOooO0O05, fOooO0OO4, c21284OooO.f61708OooO0oO);
                    }
                }
            }
        }
        C21334Oooo0o0 c21334Oooo0o0OooO00o = C21335Oooo0oO.OooO00o();
        c21334Oooo0o0OooO00o.OooO0o(c21284OooO);
        return C31577o0000o0o.OooO00o(c21334Oooo0o0OooO00o, fOooO0OO, fOooO0Oo);
    }

    public final boolean OooO0Oo(InterfaceC21361o00oO0O shape, float f, boolean z, float f2, EnumC24238OooOOO layoutDirection, InterfaceC24229OooO0OO density) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(shape, "shape");
        kotlin.jvm.internal.OooOOO0.OooO0oO(layoutDirection, "layoutDirection");
        kotlin.jvm.internal.OooOOO0.OooO0oO(density, "density");
        this.f112940OooO0OO.setAlpha(f);
        boolean zOooO0O0 = kotlin.jvm.internal.OooOOO0.OooO0O0(this.f112943OooO0o0, shape);
        boolean z2 = !zOooO0O0;
        if (!zOooO0O0) {
            this.f112943OooO0o0 = shape;
            this.f112945OooO0oo = true;
        }
        boolean z3 = z || f2 > 0.0f;
        if (this.f112951OooOOOO != z3) {
            this.f112951OooOOOO = z3;
            this.f112945OooO0oo = true;
        }
        if (this.f112952OooOOOo != layoutDirection) {
            this.f112952OooOOOo = layoutDirection;
            this.f112945OooO0oo = true;
        }
        if (!kotlin.jvm.internal.OooOOO0.OooO0O0(this.f112938OooO00o, density)) {
            this.f112938OooO00o = density;
            this.f112945OooO0oo = true;
        }
        return z2;
    }

    public final void OooO0o(InterfaceC21370ooOO interfaceC21370ooOO) {
        int i = Build.VERSION.SDK_INT;
        Outline outline = this.f112940OooO0OO;
        if (i <= 28 && !interfaceC21370ooOO.OooO0o0()) {
            this.f112939OooO0O0 = false;
            outline.setEmpty();
            this.f112937OooO = true;
        } else {
            if (!(interfaceC21370ooOO instanceof C21334Oooo0o0)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            outline.setConvexPath(((C21334Oooo0o0) interfaceC21370ooOO).f61747OooO00o);
            this.f112937OooO = !outline.canClip();
        }
        this.f112944OooO0oO = interfaceC21370ooOO;
    }

    public final void OooO0o0() {
        if (this.f112945OooO0oo) {
            this.f112950OooOOO0 = C21290OooO0o0.f61718OooO0O0;
            long j = this.f112941OooO0Oo;
            this.f112949OooOOO = j;
            this.f112948OooOO0o = 0.0f;
            this.f112944OooO0oO = null;
            this.f112945OooO0oo = false;
            this.f112937OooO = false;
            boolean z = this.f112951OooOOOO;
            Outline outline = this.f112940OooO0OO;
            if (!z || C21293OooOO0.OooO0Oo(j) <= 0.0f || C21293OooOO0.OooO0O0(this.f112941OooO0Oo) <= 0.0f) {
                outline.setEmpty();
                return;
            }
            this.f112939OooO0O0 = true;
            AbstractC21365o0OoOo0 abstractC21365o0OoOo0OooO00o = this.f112943OooO0o0.OooO00o(this.f112941OooO0Oo, this.f112952OooOOOo, this.f112938OooO00o);
            this.f112953OooOOo0 = abstractC21365o0OoOo0OooO00o;
            if (abstractC21365o0OoOo0OooO00o instanceof AbstractC21365o0OoOo0.OooO0O0) {
                C21291OooO0oO c21291OooO0oO = ((AbstractC21365o0OoOo0.OooO0O0) abstractC21365o0OoOo0OooO00o).f61801OooO00o;
                float f = c21291OooO0oO.f61724OooO00o;
                float f2 = c21291OooO0oO.f61725OooO0O0;
                this.f112950OooOOO0 = C21289OooO0o.OooO00o(f, f2);
                this.f112949OooOOO = C21294OooOO0O.OooO00o(c21291OooO0oO.OooO0OO(), c21291OooO0oO.OooO0O0());
                outline.setRect(oO0O00O.OooO00o.OooO0O0(c21291OooO0oO.f61724OooO00o), oO0O00O.OooO00o.OooO0O0(f2), oO0O00O.OooO00o.OooO0O0(c21291OooO0oO.f61726OooO0OO), oO0O00O.OooO00o.OooO0O0(c21291OooO0oO.f61727OooO0Oo));
                return;
            }
            if (!(abstractC21365o0OoOo0OooO00o instanceof AbstractC21365o0OoOo0.OooO0OO)) {
                if (abstractC21365o0OoOo0OooO00o instanceof AbstractC21365o0OoOo0.OooO00o) {
                    ((AbstractC21365o0OoOo0.OooO00o) abstractC21365o0OoOo0OooO00o).getClass();
                    OooO0o(null);
                    return;
                }
                return;
            }
            C21284OooO c21284OooO = ((AbstractC21365o0OoOo0.OooO0OO) abstractC21365o0OoOo0OooO00o).f61802OooO00o;
            float fOooO0O0 = C21285OooO00o.OooO0O0(c21284OooO.f61707OooO0o0);
            float f3 = c21284OooO.f61702OooO00o;
            float f4 = c21284OooO.f61703OooO0O0;
            this.f112950OooOOO0 = C21289OooO0o.OooO00o(f3, f4);
            this.f112949OooOOO = C21294OooOO0O.OooO00o(c21284OooO.OooO0O0(), c21284OooO.OooO00o());
            if (C20857Oooooo.OooO0OO(c21284OooO)) {
                this.f112940OooO0OO.setRoundRect(oO0O00O.OooO00o.OooO0O0(f3), oO0O00O.OooO00o.OooO0O0(f4), oO0O00O.OooO00o.OooO0O0(c21284OooO.f61704OooO0OO), oO0O00O.OooO00o.OooO0O0(c21284OooO.f61705OooO0Oo), fOooO0O0);
                this.f112948OooOO0o = fOooO0O0;
                return;
            }
            C21334Oooo0o0 c21334Oooo0o0OooO00o = this.f112942OooO0o;
            if (c21334Oooo0o0OooO00o == null) {
                c21334Oooo0o0OooO00o = C21335Oooo0oO.OooO00o();
                this.f112942OooO0o = c21334Oooo0o0OooO00o;
            }
            c21334Oooo0o0OooO00o.reset();
            c21334Oooo0o0OooO00o.OooO0o(c21284OooO);
            OooO0o(c21334Oooo0o0OooO00o);
        }
    }
}
