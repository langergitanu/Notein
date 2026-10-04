package oOo00O0O;

import kotlin.jvm.internal.C24035Oooo00o;
import oO0oO00.C33962Oooo;
import oO0oO00.o00000OO;
import ooOOoOO0.C35124OooOOOo;
import ooOOoOO0.C35143Oooo0o0;

/* JADX INFO: renamed from: oOo00O0O.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34462OooOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C33962Oooo f123521OooO00o = Oooo0.OooOo00.OooO0oo("kotlinx.serialization.json.JsonUnquotedLiteral", o00000OO.f122230OooO00o);

    public static final void OooO00o(OooOO0O oooOO0O, String str) {
        throw new IllegalArgumentException("Element " + C24035Oooo00o.f80943OooO00o.OooO0O0(oooOO0O.getClass()) + " is not a " + str);
    }

    public static final int OooO0O0(AbstractC34475OooOooO abstractC34475OooOooO) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(abstractC34475OooOooO, "<this>");
        try {
            long jOooO = new C35143Oooo0o0(abstractC34475OooOooO.OooO0O0()).OooO();
            if (-2147483648L <= jOooO && jOooO <= 2147483647L) {
                return (int) jOooO;
            }
            throw new NumberFormatException(abstractC34475OooOooO.OooO0O0() + " is not an Int");
        } catch (C35124OooOOOo e) {
            throw new NumberFormatException(e.getMessage());
        }
    }

    public static final AbstractC34475OooOooO OooO0OO(OooOO0O oooOO0O) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(oooOO0O, "<this>");
        AbstractC34475OooOooO abstractC34475OooOooO = oooOO0O instanceof AbstractC34475OooOooO ? (AbstractC34475OooOooO) oooOO0O : null;
        if (abstractC34475OooOooO != null) {
            return abstractC34475OooOooO;
        }
        OooO00o(oooOO0O, "JsonPrimitive");
        throw null;
    }
}
