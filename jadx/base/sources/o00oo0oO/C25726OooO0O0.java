package o00oo0oO;

import android.graphics.ColorSpace;
import java.io.IOException;
import java.io.InputStream;
import o00O0oo0.C24969OooOO0;
import o00o0Ooo.C25433OooOO0O;
import o00o0o.AbstractC25434OooO00o;
import o00oOoOo.C25622OooO0O0;
import o00oOoOo.C25623OooO0OO;
import o00oOoOo.C25624OooO0Oo;
import o00oo.C25638OooO0oO;
import o00oo.InterfaceC25636OooO0Oo;
import o00oo.InterfaceC25640OooOO0o;
import o00oo.OooOO0O;
import o00oo0O.C25651OooO00o;
import o00ooO0O.InterfaceC25762OooO0OO;

/* JADX INFO: renamed from: o00oo0oO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25726OooO0O0 implements InterfaceC25727OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC25727OooO0OO f87809OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC25727OooO0OO f87810OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC25762OooO0OO f87811OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final C25433OooOO0O.OooO0O0 f87812OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO00o f87813OooO0o0;

    /* JADX INFO: renamed from: o00oo0oO.OooO0O0$OooO00o */
    public class OooO00o implements InterfaceC25727OooO0OO {
        public OooO00o() {
        }

        @Override // o00oo0oO.InterfaceC25727OooO0OO
        public final InterfaceC25636OooO0Oo OooO00o(C25638OooO0oO c25638OooO0oO, int i, InterfaceC25640OooOO0o interfaceC25640OooOO0o, C25651OooO00o c25651OooO00o) {
            ColorSpace colorSpace;
            c25638OooO0oO.ooOO();
            C25623OooO0OO c25623OooO0OO = c25638OooO0oO.f87501OooOo;
            C25726OooO0O0 c25726OooO0O0 = C25726OooO0O0.this;
            c25726OooO0O0.f87812OooO0Oo.getClass();
            Boolean bool = Boolean.FALSE;
            if (bool.booleanValue()) {
                c25651OooO00o.getClass();
                c25638OooO0oO.ooOO();
                colorSpace = c25638OooO0oO.f87509OooOooo;
            } else {
                c25651OooO00o.getClass();
                colorSpace = null;
            }
            if (c25623OooO0OO == C25622OooO0O0.f87441OooO00o) {
                AbstractC25434OooO00o abstractC25434OooO00oOooO00o = c25726OooO0O0.f87811OooO0OO.OooO00o(c25638OooO0oO, c25651OooO00o.f87563OooO00o, i, colorSpace);
                try {
                    abstractC25434OooO00oOooO00o.getClass();
                    c25638OooO0oO.ooOO();
                    int i2 = c25638OooO0oO.f87504OooOoO0;
                    c25638OooO0oO.ooOO();
                    int i3 = c25638OooO0oO.f87503OooOoO;
                    int i4 = o00oo.OooO0o.f87495OooOooo;
                    o00oo.OooO0o oooO0o = new o00oo.OooO0o(abstractC25434OooO00oOooO00o, interfaceC25640OooOO0o, i2, i3);
                    oooO0o.Oooo000(bool, "is_rounded");
                    abstractC25434OooO00oOooO00o.close();
                    return oooO0o;
                } catch (Throwable th) {
                    AbstractC25434OooO00o.OooOooo(abstractC25434OooO00oOooO00o);
                    throw th;
                }
            }
            if (c25623OooO0OO == C25622OooO0O0.f87443OooO0OO) {
                c25638OooO0oO.ooOO();
                if (c25638OooO0oO.f87505OooOoOO != -1) {
                    c25638OooO0oO.ooOO();
                    if (c25638OooO0oO.f87507OooOoo0 != -1) {
                        c25651OooO00o.getClass();
                        InterfaceC25727OooO0OO interfaceC25727OooO0OO = c25726OooO0O0.f87809OooO00o;
                        return interfaceC25727OooO0OO != null ? interfaceC25727OooO0OO.OooO00o(c25638OooO0oO, i, interfaceC25640OooOO0o, c25651OooO00o) : c25726OooO0O0.OooO0O0(c25638OooO0oO, c25651OooO00o);
                    }
                }
                throw new C25725OooO00o("image width or height is incorrect", c25638OooO0oO);
            }
            if (c25623OooO0OO == C25622OooO0O0.f87449OooOO0) {
                c25651OooO00o.getClass();
                InterfaceC25727OooO0OO interfaceC25727OooO0OO2 = c25726OooO0O0.f87810OooO0O0;
                return interfaceC25727OooO0OO2 != null ? interfaceC25727OooO0OO2.OooO00o(c25638OooO0oO, i, interfaceC25640OooOO0o, c25651OooO00o) : c25726OooO0O0.OooO0O0(c25638OooO0oO, c25651OooO00o);
            }
            if (c25623OooO0OO == C25622OooO0O0.f87453OooOOO0) {
                return null;
            }
            if (c25623OooO0OO != C25623OooO0OO.f87455OooO0OO) {
                return c25726OooO0O0.OooO0O0(c25638OooO0oO, c25651OooO00o);
            }
            throw new C25725OooO00o("unknown image format", c25638OooO0oO);
        }
    }

    public C25726OooO0O0(InterfaceC25727OooO0OO interfaceC25727OooO0OO, InterfaceC25727OooO0OO interfaceC25727OooO0OO2, InterfaceC25762OooO0OO interfaceC25762OooO0OO) {
        C25433OooOO0O.OooO0O0 oooO0O0 = C25433OooOO0O.f86709OooO0O0;
        this.f87813OooO0o0 = new OooO00o();
        this.f87809OooO00o = interfaceC25727OooO0OO;
        this.f87810OooO0O0 = interfaceC25727OooO0OO2;
        this.f87811OooO0OO = interfaceC25762OooO0OO;
        this.f87812OooO0Oo = oooO0O0;
    }

    @Override // o00oo0oO.InterfaceC25727OooO0OO
    public final InterfaceC25636OooO0Oo OooO00o(C25638OooO0oO c25638OooO0oO, int i, InterfaceC25640OooOO0o interfaceC25640OooOO0o, C25651OooO00o c25651OooO00o) {
        InputStream inputStreamOooOOoo;
        c25651OooO00o.getClass();
        c25638OooO0oO.ooOO();
        C25623OooO0OO c25623OooO0OO = c25638OooO0oO.f87501OooOo;
        if ((c25623OooO0OO == null || c25623OooO0OO == C25623OooO0OO.f87455OooO0OO) && (inputStreamOooOOoo = c25638OooO0oO.OooOOoo()) != null) {
            Object obj = C25624OooO0Oo.f87458OooO0OO;
            try {
                c25638OooO0oO.f87501OooOo = C25624OooO0Oo.OooO00o.OooO00o(inputStreamOooOOoo);
            } catch (IOException e) {
                C24969OooOO0.OooO0o(e);
                throw null;
            }
        }
        return this.f87813OooO0o0.OooO00o(c25638OooO0oO, i, interfaceC25640OooOO0o, c25651OooO00o);
    }

    public final o00oo.OooO0o OooO0O0(C25638OooO0oO c25638OooO0oO, C25651OooO00o c25651OooO00o) {
        AbstractC25434OooO00o abstractC25434OooO00oOooO0O0 = this.f87811OooO0OO.OooO0O0(c25638OooO0oO, c25651OooO00o.f87563OooO00o);
        try {
            abstractC25434OooO00oOooO0O0.getClass();
            OooOO0O oooOO0O = OooOO0O.f87512OooO0Oo;
            c25638OooO0oO.ooOO();
            int i = c25638OooO0oO.f87504OooOoO0;
            c25638OooO0oO.ooOO();
            int i2 = c25638OooO0oO.f87503OooOoO;
            int i3 = o00oo.OooO0o.f87495OooOooo;
            o00oo.OooO0o oooO0o = new o00oo.OooO0o(abstractC25434OooO00oOooO0O0, oooOO0O, i, i2);
            oooO0o.Oooo000(Boolean.FALSE, "is_rounded");
            abstractC25434OooO00oOooO0O0.close();
            return oooO0o;
        } catch (Throwable th) {
            AbstractC25434OooO00o.OooOooo(abstractC25434OooO00oOooO0O0);
            throw th;
        }
    }
}
