package oO00O0o0;

import OooO0Oo.C20398OooO0O0;
import OooO0o.C20424OooO0Oo;
import java.util.List;
import oO0o0O0o.C33599OooOo0O;

/* JADX INFO: renamed from: oO00O0o0.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32187OooOO0o extends oOo00Oo0.OooOo {
    @Override // oOo00Oo0.OooOo
    public final void OooO0oO(String name) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        List<String> list = C32190OooOOo0.f115537OooO00o;
        int i = 0;
        int i2 = 0;
        while (i < name.length()) {
            char cCharAt = name.charAt(i);
            int i3 = i2 + 1;
            if (kotlin.jvm.internal.OooOOO0.OooO(cCharAt, 32) <= 0 || C33599OooOo0O.OooOoo0("\"(),/:;<=>?@[\\]{}", cCharAt)) {
                StringBuilder sbOooO0o0 = C20424OooO0Oo.OooO0o0("Header name '", name, "' contains illegal character '");
                sbOooO0o0.append(name.charAt(i2));
                sbOooO0o0.append("' (code ");
                throw new OooOo(C20398OooO0O0.OooO00o(')', sbOooO0o0, name.charAt(i2) & 255));
            }
            i++;
            i2 = i3;
        }
    }

    @Override // oOo00Oo0.OooOo
    public final void OooO0oo(String value) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
        List<String> list = C32190OooOOo0.f115537OooO00o;
        int i = 0;
        int i2 = 0;
        while (i < value.length()) {
            char cCharAt = value.charAt(i);
            int i3 = i2 + 1;
            if (kotlin.jvm.internal.OooOOO0.OooO(cCharAt, 32) < 0 && cCharAt != '\t') {
                StringBuilder sbOooO0o0 = C20424OooO0Oo.OooO0o0("Header value '", value, "' contains illegal character '");
                sbOooO0o0.append(value.charAt(i2));
                sbOooO0o0.append("' (code ");
                throw new C32196OooOoO0(C20398OooO0O0.OooO00o(')', sbOooO0o0, value.charAt(i2) & 255));
            }
            i++;
            i2 = i3;
        }
    }
}
