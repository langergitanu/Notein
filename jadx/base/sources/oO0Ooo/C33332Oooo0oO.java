package oO0Ooo;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import o0Oo0o00.o0OOO0o;
import oO0Ooo.C33310OooOOo0;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: oO0Ooo.Oooo0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33332Oooo0oO {
    public static final AbstractC33354o00o0O OooO00o(AbstractC33354o00o0O abstractC33354o00o0O, boolean z) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(abstractC33354o00o0O, "<this>");
        C33310OooOOo0 c33310OooOOo0OooO00o = C33310OooOOo0.OooO00o.OooO00o(abstractC33354o00o0O, z);
        if (c33310OooOOo0OooO00o != null) {
            return c33310OooOOo0OooO00o;
        }
        AbstractC33328Oooo0O0 abstractC33328Oooo0O0OooO0O0 = OooO0O0(abstractC33354o00o0O);
        return abstractC33328Oooo0O0OooO0O0 != null ? abstractC33328Oooo0O0OooO0O0 : abstractC33354o00o0O.o00000Oo(false);
    }

    public static final AbstractC33328Oooo0O0 OooO0O0(AbstractC33354o00o0O abstractC33354o00o0O) {
        C33319OooOoOO c33319OooOoOO;
        InterfaceC33342OoooOo0 interfaceC33342OoooOo0O00000 = abstractC33354o00o0O.o00000();
        C33319OooOoOO c33319OooOoOO2 = interfaceC33342OoooOo0O00000 instanceof C33319OooOoOO ? (C33319OooOoOO) interfaceC33342OoooOo0O00000 : null;
        if (c33319OooOoOO2 != null) {
            LinkedHashSet<AbstractC33320OooOoo> linkedHashSet = c33319OooOoOO2.f120562OooO0O0;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(linkedHashSet, 10));
            boolean z = false;
            for (AbstractC33320OooOoo abstractC33320OooOooOooO00o : linkedHashSet) {
                if (o00Oo0.OooO0o(abstractC33320OooOooOooO00o)) {
                    abstractC33320OooOooOooO00o = OooO00o(abstractC33320OooOooOooO00o.o00000OO(), false);
                    z = true;
                }
                arrayList.add(abstractC33320OooOooOooO00o);
            }
            if (z) {
                AbstractC33320OooOoo abstractC33320OooOooOooO00o2 = c33319OooOoOO2.f120561OooO00o;
                if (abstractC33320OooOooOooO00o2 == null) {
                    abstractC33320OooOooOooO00o2 = null;
                } else if (o00Oo0.OooO0o(abstractC33320OooOooOooO00o2)) {
                    abstractC33320OooOooOooO00o2 = OooO00o(abstractC33320OooOooOooO00o2.o00000OO(), false);
                }
                arrayList.isEmpty();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList);
                linkedHashSet2.hashCode();
                c33319OooOoOO = new C33319OooOoOO(linkedHashSet2);
                c33319OooOoOO.f120561OooO00o = abstractC33320OooOooOooO00o2;
            } else {
                c33319OooOoOO = null;
            }
            if (c33319OooOoOO != null) {
                return c33319OooOoOO.OooO0o();
            }
        }
        return null;
    }

    public static final AbstractC33328Oooo0O0 OooO0OO(AbstractC33328Oooo0O0 abstractC33328Oooo0O0, AbstractC33328Oooo0O0 abbreviatedType) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(abstractC33328Oooo0O0, "<this>");
        kotlin.jvm.internal.OooOOO0.OooO0oO(abbreviatedType, "abbreviatedType");
        return o0OOO0o.OooO0O0(abstractC33328Oooo0O0) ? abstractC33328Oooo0O0 : new C33293OooO00o(abstractC33328Oooo0O0, abbreviatedType);
    }
}
