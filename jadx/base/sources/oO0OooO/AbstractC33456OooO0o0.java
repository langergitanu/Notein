package oO0OooO;

import Oooo0oO.C21091o0000o;
import Oooo0oo.AbstractC21138OooO0oo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import oO00ooO.C32442OooOO0o;
import oO0O0OO.InterfaceC32637OoooOoo;
import oO0OOo.C33042OooOOo;
import oO0Ooo.AbstractC33316OooOo0o;
import oO0Ooo.AbstractC33320OooOoo;
import oO0Ooo.AbstractC33328Oooo0O0;
import oO0Ooo.AbstractC33354o00o0O;
import oO0Ooo.C33319OooOoOO;
import oO0Ooo.C33322OooOooO;
import oO0Ooo.InterfaceC33342OoooOo0;
import oO0Ooo.InterfaceC33348OooooOO;
import oO0o000.C33538OooO0OO;
import oO0o0000.InterfaceC33541OooO0oO;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: oO0OooO.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC33456OooO0o0 extends AbstractC21138OooO0oo {

    /* JADX INFO: renamed from: oO0OooO.OooO0o0$OooO00o */
    public static final class OooO00o extends AbstractC33456OooO0o0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO00o f120915OooO00o = new OooO00o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [oO0Ooo.OooOoOO] */
    /* JADX WARN: Type inference failed for: r0v3, types: [oO0Ooo.OooOoOO] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r3v0, types: [oO0O0OO.OoooOoo] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3 */
    public static AbstractC33328Oooo0O0 Ooooooo(AbstractC33328Oooo0O0 abstractC33328Oooo0O0) {
        AbstractC33320OooOoo type;
        InterfaceC33342OoooOo0 interfaceC33342OoooOo0O00000 = abstractC33328Oooo0O0.o00000();
        ?? r3 = 0;
        if (interfaceC33342OoooOo0O00000 instanceof oO0OOo0.OooO0OO) {
            oO0OOo0.OooO0OO oooO0OO = (oO0OOo0.OooO0OO) interfaceC33342OoooOo0O00000;
            InterfaceC33348OooooOO interfaceC33348OooooOO = oooO0OO.f119500OooO00o;
            if (interfaceC33348OooooOO.OooO0OO() != 2) {
                interfaceC33348OooooOO = null;
            }
            AbstractC33354o00o0O abstractC33354o00o0OO00000OO = (interfaceC33348OooooOO == null || (type = interfaceC33348OooooOO.getType()) == null) ? null : type.o00000OO();
            if (oooO0OO.f119501OooO0O0 == null) {
                Collection<AbstractC33320OooOoo> collectionOooO0Oo = oooO0OO.OooO0Oo();
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(collectionOooO0Oo, 10));
                Iterator it = collectionOooO0Oo.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AbstractC33320OooOoo) it.next()).o00000OO());
                }
                InterfaceC33348OooooOO projection = oooO0OO.f119500OooO00o;
                kotlin.jvm.internal.OooOOO0.OooO0oO(projection, "projection");
                oooO0OO.f119501OooO0O0 = new C33460OooOO0O(projection, new C33459OooOO0(arrayList), (InterfaceC32637OoooOoo) r3, 8);
            }
            oO0o0000.OooO0O0 oooO0O0 = oO0o0000.OooO0O0.f121139OooOo0o;
            C33460OooOO0O c33460OooOO0O = oooO0OO.f119501OooO0O0;
            kotlin.jvm.internal.OooOOO0.OooO0Oo(c33460OooOO0O);
            return new C33450OooO(oooO0O0, c33460OooOO0O, abstractC33354o00o0OO00000OO, abstractC33328Oooo0O0.o000000o(), abstractC33328Oooo0O0.o00000O0(), 32);
        }
        if (interfaceC33342OoooOo0O00000 instanceof C33042OooOOo) {
            ((C33042OooOOo) interfaceC33342OoooOo0O00000).getClass();
            C34428OooOOo.OooOOoo(null, 10);
            throw null;
        }
        if (!(interfaceC33342OoooOo0O00000 instanceof C33319OooOoOO) || !abstractC33328Oooo0O0.o00000O0()) {
            return abstractC33328Oooo0O0;
        }
        ?? r0 = (C33319OooOoOO) interfaceC33342OoooOo0O00000;
        LinkedHashSet<AbstractC33320OooOoo> linkedHashSet = r0.f120562OooO0O0;
        ArrayList arrayList2 = new ArrayList(C34428OooOOo.OooOOoo(linkedHashSet, 10));
        Iterator it2 = linkedHashSet.iterator();
        boolean z = false;
        while (it2.hasNext()) {
            arrayList2.add(C33538OooO0OO.OooO((AbstractC33320OooOoo) it2.next()));
            z = true;
        }
        if (z) {
            AbstractC33320OooOoo abstractC33320OooOoo = r0.f120561OooO00o;
            AbstractC33354o00o0O abstractC33354o00o0OOooO = abstractC33320OooOoo != null ? C33538OooO0OO.OooO(abstractC33320OooOoo) : null;
            arrayList2.isEmpty();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(arrayList2);
            linkedHashSet2.hashCode();
            C33319OooOoOO c33319OooOoOO = new C33319OooOoOO(linkedHashSet2);
            c33319OooOoOO.f120561OooO00o = abstractC33354o00o0OOooO;
            r3 = c33319OooOoOO;
        }
        if (r3 != 0) {
            r0 = r3;
        }
        return r0.OooO0o();
    }

    public final AbstractC33354o00o0O OoooooO(InterfaceC33541OooO0oO type) {
        AbstractC33354o00o0O abstractC33354o00o0OOooO0OO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(type, "type");
        if (!(type instanceof AbstractC33320OooOoo)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        AbstractC33354o00o0O abstractC33354o00o0OO00000OO = ((AbstractC33320OooOoo) type).o00000OO();
        if (abstractC33354o00o0OO00000OO instanceof AbstractC33328Oooo0O0) {
            abstractC33354o00o0OOooO0OO = Ooooooo((AbstractC33328Oooo0O0) abstractC33354o00o0OO00000OO);
        } else {
            if (!(abstractC33354o00o0OO00000OO instanceof AbstractC33316OooOo0o)) {
                throw new C32442OooOO0o();
            }
            AbstractC33316OooOo0o abstractC33316OooOo0o = (AbstractC33316OooOo0o) abstractC33354o00o0OO00000OO;
            AbstractC33328Oooo0O0 abstractC33328Oooo0O0 = abstractC33316OooOo0o.f120554OooOo;
            AbstractC33328Oooo0O0 abstractC33328Oooo0O0Ooooooo = Ooooooo(abstractC33328Oooo0O0);
            AbstractC33328Oooo0O0 abstractC33328Oooo0O02 = abstractC33316OooOo0o.f120555OooOoO0;
            AbstractC33328Oooo0O0 abstractC33328Oooo0O0Ooooooo2 = Ooooooo(abstractC33328Oooo0O02);
            abstractC33354o00o0OOooO0OO = (abstractC33328Oooo0O0Ooooooo == abstractC33328Oooo0O0 && abstractC33328Oooo0O0Ooooooo2 == abstractC33328Oooo0O02) ? abstractC33354o00o0OO00000OO : C33322OooOooO.OooO0OO(abstractC33328Oooo0O0Ooooooo, abstractC33328Oooo0O0Ooooooo2);
        }
        C33455OooO0o c33455OooO0o = new C33455OooO0o(1, this);
        AbstractC33320OooOoo abstractC33320OooOooOooOOO = C21091o0000o.OooOOO(abstractC33354o00o0OO00000OO);
        return C21091o0000o.OooOOo(abstractC33354o00o0OOooO0OO, abstractC33320OooOooOooOOO != null ? (AbstractC33320OooOoo) c33455OooO0o.invoke(abstractC33320OooOooOooOOO) : null);
    }
}
