package o0ooo0;

import android.graphics.Path;
import android.graphics.PointF;
import android.util.Log;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import o0oo0o0O.InterfaceC31322OooO0O0;
import o0oo0oO0.AbstractC31337OooO0oO;
import o0oo0oO0.C31331OooO00o;
import o0oo0oO0.C31339OooOO0;
import o0oo0oO0.C31348OooOOO0;
import o0oo0oO0.C31355OooOo00;
import o0oo0oo.C31392OooOooO;
import o0oo0ooo.C31412OooO00o;
import o0ooO00.C31416OooO00o;
import o0ooO0Oo.C31436OooO0Oo;
import o0ooOoo.C31668OooO;
import o0ooOoo.C31676OooO0oo;
import o0oooOO0.C31837OooO0OO;

/* JADX INFO: renamed from: o0ooo0.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31716OooOO0o extends AbstractC31715OooOO0O {

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final C31331OooO00o f113283OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final C31416OooO00o f113284Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final InterfaceC31322OooO0O0 f113285Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final boolean f113286Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public C31837OooO0OO f113287Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public C31412OooO00o f113288Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public final int[] f113289Oooo0OO;

    /* JADX INFO: renamed from: o0ooo0.OooOO0o$OooO00o */
    public class OooO00o implements C31339OooOO0.OooO00o {
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C31716OooOO0o(C31436OooO0Oo c31436OooO0Oo, OooOo oooOo) throws IOException {
        AbstractC31337OooO0oO abstractC31337OooO0oO;
        InterfaceC31322OooO0O0 interfaceC31322OooO0O0;
        C31668OooO c31668OooOOooO0O0;
        super(c31436OooO0Oo, oooOo);
        new HashMap();
        this.f113289Oooo0OO = null;
        C31722OooOOo0 c31722OooOOo0OooOO0 = OooOO0();
        byte[] bArrOooO00o = (c31722OooOOo0OooOO0 == null || (c31668OooOOooO0O0 = c31722OooOOo0OooOO0.OooO0O0()) == null) ? null : c31668OooOOooO0O0.OooO00o();
        if (bArrOooO00o == null || bArrOooO00o.length <= 0 || (bArrOooO00o[0] & 255) != 37) {
            if (bArrOooO00o != null) {
                try {
                    abstractC31337OooO0oO = (AbstractC31337OooO0oO) new C31339OooOO0().OooO0O0(bArrOooO00o, new OooO00o()).get(0);
                } catch (IOException e) {
                    Log.e("PdfBox-Android", "Can't read the embedded CFF font " + c31722OooOOo0OooOO0.OooO0OO(), e);
                    abstractC31337OooO0oO = null;
                }
            }
            if (abstractC31337OooO0oO == null) {
                if (abstractC31337OooO0oO instanceof C31331OooO00o) {
                    this.f113283OooOooo = (C31331OooO00o) abstractC31337OooO0oO;
                    this.f113285Oooo000 = null;
                } else {
                    this.f113283OooOooo = null;
                    this.f113285Oooo000 = abstractC31337OooO0oO;
                }
                this.f113289Oooo0OO = OooOO0O();
                this.f113286Oooo00O = true;
            } else {
                C31706OooO00o c31706OooO00oOooO0Oo = ((C31713OooO0oo) C31705OooO.OooO00o()).OooO0Oo(OooO0oo(), OooOO0(), OooO());
                T t = c31706OooO00oOooO0Oo.f113273OooO00o;
                if (t != 0) {
                    AbstractC31337OooO0oO abstractC31337OooO0oO2 = ((C31392OooOooO) t).o0000ooO().f111972OooO0o;
                    if (abstractC31337OooO0oO2 instanceof C31331OooO00o) {
                        C31331OooO00o c31331OooO00o = (C31331OooO00o) abstractC31337OooO0oO2;
                        this.f113283OooOooo = c31331OooO00o;
                        this.f113285Oooo000 = null;
                        interfaceC31322OooO0O0 = c31331OooO00o;
                    } else {
                        C31348OooOOO0 c31348OooOOO0 = (C31348OooOOO0) abstractC31337OooO0oO2;
                        this.f113283OooOooo = null;
                        this.f113285Oooo000 = c31348OooOOO0;
                        interfaceC31322OooO0O0 = c31348OooOOO0;
                    }
                } else {
                    this.f113283OooOooo = null;
                    InterfaceC31322OooO0O0 interfaceC31322OooO0O02 = c31706OooO00oOooO0Oo.f113243OooO0OO;
                    this.f113285Oooo000 = interfaceC31322OooO0O02;
                    interfaceC31322OooO0O0 = interfaceC31322OooO0O02;
                }
                if (c31706OooO00oOooO0Oo.f113274OooO0O0) {
                    Log.w("PdfBox-Android", "Using fallback " + interfaceC31322OooO0O0.getName() + " for CID-keyed font " + OooO0oo());
                }
                this.f113286Oooo00O = false;
            }
            C31416OooO00o c31416OooO00oOooO00o = OooO00o().OooO00o();
            this.f113284Oooo0 = c31416OooO00oOooO00o;
            c31416OooO00oOooO00o.OooO00o();
        }
        Log.w("PdfBox-Android", "Found PFB but expected embedded CFF font " + c31722OooOOo0OooOO0.OooO0OO());
        abstractC31337OooO0oO = null;
        if (abstractC31337OooO0oO == null) {
        }
        C31416OooO00o c31416OooO00oOooO00o2 = OooO00o().OooO00o();
        this.f113284Oooo0 = c31416OooO00oOooO00o2;
        c31416OooO00oOooO00o2.OooO00o();
    }

    @Override // o0ooo0.InterfaceC31721OooOOo
    public final C31837OooO0OO OooO00o() {
        List<Number> listOooO00o;
        if (this.f113287Oooo00o == null) {
            C31331OooO00o c31331OooO00o = this.f113283OooOooo;
            if (c31331OooO00o != null) {
                listOooO00o = c31331OooO00o.OooO00o();
            } else {
                try {
                    listOooO00o = this.f113285Oooo000.OooO00o();
                } catch (IOException unused) {
                    return new C31837OooO0OO(0.001f, 0.0f, 0.0f, 0.001f, 0.0f, 0.0f);
                }
            }
            if (listOooO00o == null || listOooO00o.size() != 6) {
                this.f113287Oooo00o = new C31837OooO0OO(0.001f, 0.0f, 0.0f, 0.001f, 0.0f, 0.0f);
            } else {
                this.f113287Oooo00o = new C31837OooO0OO(listOooO00o.get(0).floatValue(), listOooO00o.get(1).floatValue(), listOooO00o.get(2).floatValue(), listOooO00o.get(3).floatValue(), listOooO00o.get(4).floatValue(), listOooO00o.get(5).floatValue());
            }
        }
        return this.f113287Oooo00o;
    }

    @Override // o0ooo0.InterfaceC31721OooOOo
    public final float OooO0O0(int i) throws IOException {
        float fOooOOoo;
        int iOooO0O0;
        int iOooO0o0 = OooO0o0(i);
        InterfaceC31322OooO0O0 interfaceC31322OooO0O0 = this.f113285Oooo000;
        C31331OooO00o c31331OooO00o = this.f113283OooOooo;
        if (c31331OooO00o != null) {
            iOooO0O0 = (c31331OooO00o != null ? c31331OooO00o.OooO0o0(iOooO0o0) : interfaceC31322OooO0O0 instanceof C31348OooOOO0 ? ((C31348OooOOO0) interfaceC31322OooO0O0).OooO0o0(iOooO0o0) : null).OooO0O0();
        } else {
            if (!this.f113286Oooo00O || !(interfaceC31322OooO0O0 instanceof C31348OooOOO0)) {
                String strOooOo0 = this.f113276OooOo0o.OooOo0(i);
                fOooOOoo = interfaceC31322OooO0O0.OooOOoo(strOooOo0 == null ? ".notdef" : OooO0O0.OooO0O0.OooO0Oo(strOooOo0.codePointAt(0)));
                PointF pointF = new PointF(fOooOOoo, 0.0f);
                C31416OooO00o c31416OooO00o = this.f113284Oooo0;
                c31416OooO00o.getClass();
                double d = pointF.x;
                double d2 = c31416OooO00o.f112181OooOo0o * d;
                double d3 = pointF.y;
                pointF.set((float) ((c31416OooO00o.f112183OooOoO0 * d3) + d2 + c31416OooO00o.f112184OooOoOO), (float) ((d3 * c31416OooO00o.f112182OooOoO) + (d * c31416OooO00o.f112180OooOo) + c31416OooO00o.f112186OooOoo0));
                return pointF.x;
            }
            iOooO0O0 = ((C31348OooOOO0) interfaceC31322OooO0O0).OooO0o0(iOooO0o0).OooO0O0();
        }
        fOooOOoo = iOooO0O0;
        PointF pointF2 = new PointF(fOooOOoo, 0.0f);
        C31416OooO00o c31416OooO00o2 = this.f113284Oooo0;
        c31416OooO00o2.getClass();
        double d4 = pointF2.x;
        double d22 = c31416OooO00o2.f112181OooOo0o * d4;
        double d32 = pointF2.y;
        pointF2.set((float) ((c31416OooO00o2.f112183OooOoO0 * d32) + d22 + c31416OooO00o2.f112184OooOoOO), (float) ((d32 * c31416OooO00o2.f112182OooOoO) + (d4 * c31416OooO00o2.f112180OooOo) + c31416OooO00o2.f112186OooOoo0));
        return pointF2.x;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    @Override // o0ooo0.InterfaceC31721OooOOo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C31412OooO00o OooO0OO() {
        C31412OooO00o c31412OooO00o;
        if (this.f113288Oooo0O0 == null) {
            if (OooOO0() != null) {
                C31676OooO0oo c31676OooO0ooOooO00o = OooOO0().OooO00o();
                if (c31676OooO0ooOooO00o.OooO0O0() == 0.0f && c31676OooO0ooOooO00o.OooO0OO() == 0.0f && c31676OooO0ooOooO00o.OooO0Oo() == 0.0f && c31676OooO0ooOooO00o.OooO0o0() == 0.0f) {
                    C31331OooO00o c31331OooO00o = this.f113283OooOooo;
                    if (c31331OooO00o != null) {
                        c31412OooO00o = c31331OooO00o.OooO0OO();
                    } else {
                        try {
                            c31412OooO00o = this.f113285Oooo000.OooO0OO();
                        } catch (IOException unused) {
                            c31412OooO00o = new C31412OooO00o();
                        }
                    }
                } else {
                    c31412OooO00o = new C31412OooO00o(c31676OooO0ooOooO00o.OooO0O0(), c31676OooO0ooOooO00o.OooO0OO(), c31676OooO0ooOooO00o.OooO0Oo(), c31676OooO0ooOooO00o.OooO0o0());
                }
                this.f113288Oooo0O0 = c31412OooO00o;
            }
        }
        return this.f113288Oooo0O0;
    }

    @Override // o0ooo0.InterfaceC31721OooOOo
    public final boolean OooO0Oo() {
        return this.f113286Oooo00O;
    }

    @Override // o0ooo0.AbstractC31715OooOO0O
    public final int OooO0o(int i) {
        int iOooO0o0 = OooO0o0(i);
        C31331OooO00o c31331OooO00o = this.f113283OooOooo;
        return c31331OooO00o != null ? c31331OooO00o.f111898OooOoO0.OooO0Oo(iOooO0o0) : iOooO0o0;
    }

    @Override // o0ooo0.AbstractC31715OooOO0O
    public final int OooO0o0(int i) {
        return this.f113276OooOo0o.f113318OooOooo.OooO0O0(i);
    }

    @Override // o0ooo0.AbstractC31715OooOO0O
    public final byte[] OooO0oO(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // o0ooo0.InterfaceC31731OooOoo
    public final Path getPath(int i) throws IOException {
        int iOooO0o0 = OooO0o0(i);
        int[] iArr = this.f113289Oooo0OO;
        boolean z = this.f113286Oooo00O;
        if (iArr != null && z) {
            iOooO0o0 = iArr[iOooO0o0];
        }
        InterfaceC31322OooO0O0 interfaceC31322OooO0O0 = this.f113285Oooo000;
        C31331OooO00o c31331OooO00o = this.f113283OooOooo;
        C31355OooOo00 c31355OooOo00OooO0o0 = c31331OooO00o != null ? c31331OooO00o.OooO0o0(iOooO0o0) : interfaceC31322OooO0O0 instanceof C31348OooOOO0 ? ((C31348OooOOO0) interfaceC31322OooO0O0).OooO0o0(iOooO0o0) : null;
        if (c31355OooOo00OooO0o0 != null) {
            return c31355OooOo00OooO0o0.OooO00o();
        }
        if (z && (interfaceC31322OooO0O0 instanceof C31348OooOOO0)) {
            return ((C31348OooOOO0) interfaceC31322OooO0O0).OooO0o0(iOooO0o0).OooO00o();
        }
        String strOooOo0 = this.f113276OooOo0o.OooOo0(i);
        return interfaceC31322OooO0O0.OooOOO0(strOooOo0 == null ? ".notdef" : OooO0O0.OooO0O0.OooO0Oo(strOooOo0.codePointAt(0)));
    }
}
