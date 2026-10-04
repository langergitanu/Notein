package oO0OoO;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.OooOOO0;
import oO0O0OO.InterfaceC32615OooOoo;
import oO0OO00.C32888OooOO0o;
import oO0OO0O.OooO00o;
import oO0OOOO0.C32951OooO0Oo;
import oO0OOOO0.InterfaceC32958OooOOOo;
import oO0OOOO0.OooO0o;
import oO0OOOO0.OooOO0;
import oO0Oo00.C33194OooO0O0;
import oO0OoO0.AbstractC33240OooOOOo;
import oO0Ooo0.C33361OooO0Oo;
import oO0OooO0.C33477OooO0OO;

/* JADX INFO: renamed from: oO0OoO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33230OooO0Oo extends AbstractC33240OooOOOo implements oO0O0O0o.OooO0O0 {

    /* JADX INFO: renamed from: oO0OoO.OooO0Oo$OooO00o */
    public static final class OooO00o {
        public static C33230OooO0Oo OooO00o(C33477OooO0OO fqName, C33361OooO0Oo c33361OooO0Oo, InterfaceC32615OooOoo module, InputStream inputStream) throws IOException {
            C32888OooOO0o c32888OooOO0o;
            InterfaceC32958OooOOOo interfaceC32958OooOOOo;
            OooOOO0.OooO0oO(fqName, "fqName");
            OooOOO0.OooO0oO(module, "module");
            try {
                oO0OO0O.OooO00o oooO00o = oO0OO0O.OooO00o.f118556OooO0o;
                oO0OO0O.OooO00o OooO00o2 = OooO00o.C20272OooO00o.OooO00o(inputStream);
                oO0OO0O.OooO00o ourVersion = oO0OO0O.OooO00o.f118556OooO0o;
                OooOOO0.OooO0oO(ourVersion, "ourVersion");
                int i = OooO00o2.f118754OooO0OO;
                int i2 = ourVersion.f118754OooO0OO;
                int i3 = ourVersion.f118753OooO0O0;
                int i4 = OooO00o2.f118753OooO0O0;
                if (i4 == 0) {
                    if (i3 == 0 && i == i2) {
                        OooO0o oooO0o = new OooO0o();
                        oO0OO0O.OooO0O0.OooO00o(oooO0o);
                        C32888OooOO0o.OooO00o oooO00o2 = C32888OooOO0o.f118279Oooo00O;
                        oooO00o2.getClass();
                        C32951OooO0Oo c32951OooO0Oo = new C32951OooO0Oo(inputStream);
                        interfaceC32958OooOOOo = (InterfaceC32958OooOOOo) oooO00o2.OooO00o(c32951OooO0Oo, oooO0o);
                        try {
                            c32951OooO0Oo.OooO00o(0);
                            oO0OOOO0.OooO0O0.OooO0O0(interfaceC32958OooOOOo);
                            c32888OooOO0o = (C32888OooOO0o) interfaceC32958OooOOOo;
                        } catch (OooOO0 e) {
                            e.f119095OooOo0o = interfaceC32958OooOOOo;
                            throw e;
                        }
                    }
                    c32888OooOO0o = null;
                } else if (i4 != i3 || i > i2) {
                    c32888OooOO0o = null;
                } else {
                    OooO0o oooO0o2 = new OooO0o();
                    oO0OO0O.OooO0O0.OooO00o(oooO0o2);
                    C32888OooOO0o.OooO00o oooO00o22 = C32888OooOO0o.f118279Oooo00O;
                    oooO00o22.getClass();
                    C32951OooO0Oo c32951OooO0Oo2 = new C32951OooO0Oo(inputStream);
                    interfaceC32958OooOOOo = (InterfaceC32958OooOOOo) oooO00o22.OooO00o(c32951OooO0Oo2, oooO0o2);
                    c32951OooO0Oo2.OooO00o(0);
                    oO0OOOO0.OooO0O0.OooO0O0(interfaceC32958OooOOOo);
                    c32888OooOO0o = (C32888OooOO0o) interfaceC32958OooOOOo;
                }
                C32888OooOO0o c32888OooOO0o2 = c32888OooOO0o;
                inputStream.close();
                if (c32888OooOO0o2 != null) {
                    return new C33230OooO0Oo(fqName, c33361OooO0Oo, module, c32888OooOO0o2, OooO00o2);
                }
                throw new UnsupportedOperationException("Kotlin built-in definition format version is not supported: expected " + ourVersion + ", actual " + OooO00o2 + ". Please update Kotlin");
            } finally {
            }
        }
    }

    @Override // oO0O0Oo0.AbstractC32693Oooo0oO, oO0O0Oo0.AbstractC32673OooOOo
    public final String toString() {
        return "builtins package fragment for " + this.f117533OooOoOO + " from " + C33194OooO0O0.OooOO0(this);
    }
}
