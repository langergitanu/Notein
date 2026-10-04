package ooo0o;

import oO0OO0Oo.C32921OooO0o0;
import oO0OO0Oo.C32922OooO0oO;
import oO0OO0Oo.InterfaceC32918OooO0OO;
import oO0OOO.AbstractC32933OooO0Oo;
import oO0OOO.C32936OooO0oo;
import oO0OOO0.OooO00o;
import oO0OOOO0.AbstractC32954OooO0oo;
import ooo0o.C35197OooOOoo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0o {
    public static final C35197OooOOoo OooO00o(oO0OO00.OooOOO0 proto, InterfaceC32918OooO0OO nameResolver, C32922OooO0oO c32922OooO0oO, boolean z, boolean z2, boolean z3) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(proto, "proto");
        kotlin.jvm.internal.OooOOO0.OooO0oO(nameResolver, "nameResolver");
        AbstractC32954OooO0oo.C32956OooO0o0<oO0OO00.OooOOO0, OooO00o.OooO0OO> propertySignature = oO0OOO0.OooO00o.f118832OooO0Oo;
        kotlin.jvm.internal.OooOOO0.OooO0o(propertySignature, "propertySignature");
        OooO00o.OooO0OO oooO0OO = (OooO00o.OooO0OO) C32921OooO0o0.OooO00o(proto, propertySignature);
        if (oooO0OO != null) {
            if (z) {
                oO0OOOO0.OooO0o oooO0o = C32936OooO0oo.f118827OooO00o;
                AbstractC32933OooO0Oo.OooO00o oooO00oOooO0O0 = C32936OooO0oo.OooO0O0(proto, nameResolver, c32922OooO0oO, z3);
                if (oooO00oOooO0O0 != null) {
                    return C35197OooOOoo.OooO00o.OooO00o(oooO00oOooO0O0);
                }
            } else if (z2 && (oooO0OO.f118866OooOo & 2) == 2) {
                OooO00o.OooO0O0 oooO0O0 = oooO0OO.f118868OooOoO;
                kotlin.jvm.internal.OooOOO0.OooO0o(oooO0O0, "signature.syntheticMethod");
                return new C35197OooOOoo(nameResolver.getString(oooO0O0.f118858OooOoO0).concat(nameResolver.getString(oooO0O0.f118857OooOoO)));
            }
        }
        return null;
    }
}
