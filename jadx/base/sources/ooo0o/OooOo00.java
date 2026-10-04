package ooo0o;

import OooooO0.C21286OooO0O0;
import java.util.Iterator;
import oO0O0O0o.OooOOO;
import oO0O0OO.InterfaceC32596OooO0o0;
import oO0O0OO.InterfaceC32609OooOo0;
import oO0O0OO.InterfaceC32619Oooo;
import oO0O0OO.InterfaceC32629OoooO0;
import oO0O0OO.InterfaceC32632OoooOO0;
import oO0O0OO.InterfaceC32641OooooOO;
import oO0OOOo.C32982OooO;
import oO0Ooo.AbstractC33320OooOoo;
import oO0Ooo.o00Oo0;
import oO0OooO0.C33479OooO0o;
import oO0o0O0.C33555OooO0O0;

/* JADX INFO: loaded from: classes10.dex */
public final class OooOo00 {
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String OooO00o(InterfaceC32609OooOo0 interfaceC32609OooOo0, int i) {
        String strOooO0O0;
        boolean z = (i & 1) != 0;
        boolean z2 = (i & 2) != 0;
        kotlin.jvm.internal.OooOOO0.OooO0oO(interfaceC32609OooOo0, "<this>");
        StringBuilder sb = new StringBuilder();
        if (z2) {
            if (interfaceC32609OooOo0 instanceof oO0O0OO.OooOO0) {
                strOooO0O0 = "<init>";
            } else {
                strOooO0O0 = interfaceC32609OooOo0.getName().OooO0O0();
                kotlin.jvm.internal.OooOOO0.OooO0o(strOooO0O0, "name.asString()");
            }
            sb.append(strOooO0O0);
        }
        sb.append("(");
        InterfaceC32629OoooO0 interfaceC32629OoooO0OoooOoo = interfaceC32609OooOo0.OoooOoo();
        if (interfaceC32629OoooO0OoooOoo != null) {
            AbstractC33320OooOoo type = interfaceC32629OoooO0OoooOoo.getType();
            kotlin.jvm.internal.OooOOO0.OooO0o(type, "it.type");
            sb.append((OooOOO0) o00Ooo.OooOOO.OooO0o(type, C35201OooOoO0.f126387OooOO0O, C33555OooO0O0.f121163OooO0O0));
        }
        Iterator<InterfaceC32641OooooOO> it = interfaceC32609OooOo0.OooO0o().iterator();
        while (it.hasNext()) {
            AbstractC33320OooOoo type2 = it.next().getType();
            kotlin.jvm.internal.OooOOO0.OooO0o(type2, "parameter.type");
            sb.append((OooOOO0) o00Ooo.OooOOO.OooO0o(type2, C35201OooOoO0.f126387OooOO0O, C33555OooO0O0.f121163OooO0O0));
        }
        sb.append(")");
        if (z) {
            if (interfaceC32609OooOo0 instanceof oO0O0OO.OooOO0) {
                sb.append("V");
            } else {
                AbstractC33320OooOoo returnType = interfaceC32609OooOo0.getReturnType();
                kotlin.jvm.internal.OooOOO0.OooO0Oo(returnType);
                C33479OooO0o c33479OooO0o = oO0O0O0o.OooOO0.f117105OooO0o0;
                if (oO0O0O0o.OooOO0.OooOoo(returnType, OooOOO.OooO00o.f117153OooO0Oo)) {
                    AbstractC33320OooOoo returnType2 = interfaceC32609OooOo0.getReturnType();
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(returnType2);
                    if (o00Oo0.OooO0o(returnType2) || (interfaceC32609OooOo0 instanceof InterfaceC32619Oooo)) {
                    }
                }
                AbstractC33320OooOoo returnType3 = interfaceC32609OooOo0.getReturnType();
                kotlin.jvm.internal.OooOOO0.OooO0Oo(returnType3);
                sb.append((OooOOO0) o00Ooo.OooOOO.OooO0o(returnType3, C35201OooOoO0.f126387OooOO0O, C33555OooO0O0.f121163OooO0O0));
            }
        }
        String string = sb.toString();
        kotlin.jvm.internal.OooOOO0.OooO0o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static final String OooO0O0(oO0O0OO.OooO00o oooO00o) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(oooO00o, "<this>");
        if (!C32982OooO.OooOOOO(oooO00o)) {
            oO0O0OO.OooOO0O oooOO0OOooO0Oo = oooO00o.OooO0Oo();
            InterfaceC32596OooO0o0 interfaceC32596OooO0o0 = oooOO0OOooO0Oo instanceof InterfaceC32596OooO0o0 ? (InterfaceC32596OooO0o0) oooOO0OOooO0Oo : null;
            if (interfaceC32596OooO0o0 != null && !interfaceC32596OooO0o0.getName().f120980OooOo) {
                oO0O0OO.OooO00o oooO00oO000OOo = oooO00o.o000OOo();
                InterfaceC32632OoooOO0 interfaceC32632OoooOO0 = oooO00oO000OOo instanceof InterfaceC32632OoooOO0 ? (InterfaceC32632OoooOO0) oooO00oO000OOo : null;
                if (interfaceC32632OoooOO0 != null) {
                    return C21286OooO0O0.OooO0o(interfaceC32596OooO0o0, OooO00o(interfaceC32632OoooOO0, 3));
                }
            }
        }
        return null;
    }
}
