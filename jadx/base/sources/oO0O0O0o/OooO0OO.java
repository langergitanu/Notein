package oO0O0O0o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import oO0O0O0o.OooOOO;
import oO0OooO0.C33476OooO0O0;
import oO0OooO0.C33477OooO0OO;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final LinkedHashSet f117101OooO00o;

    static {
        Set<OooOO0O> set = OooOO0O.f117112OooOoOO;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(set, 10));
        for (OooOO0O primitiveType : set) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(primitiveType, "primitiveType");
            arrayList.add(OooOOO.f117143OooOO0O.OooO0OO(primitiveType.f117123OooOo0o));
        }
        C33477OooO0OO c33477OooO0OOOooO0oO = OooOOO.OooO00o.f117154OooO0o.OooO0oO();
        kotlin.jvm.internal.OooOOO0.OooO0o(c33477OooO0OOOooO0oO, "string.toSafe()");
        ArrayList arrayListOooooOo = OooOo.OooooOo(arrayList, c33477OooO0OOOooO0oO);
        C33477OooO0OO c33477OooO0OOOooO0oO2 = OooOOO.OooO00o.f117157OooO0oo.OooO0oO();
        kotlin.jvm.internal.OooOOO0.OooO0o(c33477OooO0OOOooO0oO2, "_boolean.toSafe()");
        ArrayList arrayListOooooOo2 = OooOo.OooooOo(arrayListOooooOo, c33477OooO0OOOooO0oO2);
        C33477OooO0OO c33477OooO0OOOooO0oO3 = OooOOO.OooO00o.f117158OooOO0.OooO0oO();
        kotlin.jvm.internal.OooOOO0.OooO0o(c33477OooO0OOOooO0oO3, "_enum.toSafe()");
        ArrayList arrayListOooooOo3 = OooOo.OooooOo(arrayListOooooOo2, c33477OooO0OOOooO0oO3);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = arrayListOooooOo3.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(C33476OooO0O0.OooOO0((C33477OooO0OO) it.next()));
        }
        f117101OooO00o = linkedHashSet;
    }
}
