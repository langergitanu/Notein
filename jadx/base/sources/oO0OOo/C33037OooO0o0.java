package oO0OOo;

import com.microsoft.identity.client.internal.MsalUtils;
import java.util.Arrays;
import oO0O0OO.InterfaceC32615OooOoo;
import oO0Ooo.AbstractC33320OooOoo;

/* JADX INFO: renamed from: oO0OOo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33037OooO0o0 extends AbstractC33043OooOOo0<Character> {
    @Override // oO0OOo.AbstractC33038OooO0oO
    public final AbstractC33320OooOoo OooO00o(InterfaceC32615OooOoo module) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(module, "module");
        oO0O0O0o.OooOO0 oooOO0OooOO0O = module.OooOO0O();
        oooOO0OooOO0O.getClass();
        return oooOO0OooOO0O.OooOOo(oO0O0O0o.OooOO0O.CHAR);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO0OOo.AbstractC33038OooO0oO
    public final String toString() {
        String strValueOf;
        T t = this.f119483OooO00o;
        Integer numValueOf = Integer.valueOf(((Character) t).charValue());
        char cCharValue = ((Character) t).charValue();
        if (cCharValue == '\b') {
            strValueOf = "\\b";
        } else if (cCharValue == '\t') {
            strValueOf = "\\t";
        } else if (cCharValue == '\n') {
            strValueOf = "\\n";
        } else if (cCharValue == '\f') {
            strValueOf = "\\f";
        } else if (cCharValue == '\r') {
            strValueOf = "\\r";
        } else {
            byte type = (byte) Character.getType(cCharValue);
            strValueOf = (type == 0 || type == 13 || type == 14 || type == 15 || type == 16 || type == 18 || type == 19) ? MsalUtils.QUERY_STRING_SYMBOL : String.valueOf(cCharValue);
        }
        return String.format("\\u%04X ('%s')", Arrays.copyOf(new Object[]{numValueOf, strValueOf}, 2));
    }
}
