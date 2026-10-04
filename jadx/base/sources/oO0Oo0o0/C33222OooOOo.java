package oO0Oo0o0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O0OO.InterfaceC32632OoooOO0;
import oO0OOOo.C32998OooOOo;
import oO0Oo0o0.OooOO0;
import oO0Ooo.AbstractC33320OooOoo;
import oO0OooO0.C33479OooO0o;
import oO0o0O0.C33557OooO0OO;
import oO0o0O00.C33560OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: oO0Oo0o0.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33222OooOOo extends oO0Oo0o0.OooO00o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOO0 f120229OooO0O0;

    /* JADX INFO: renamed from: oO0Oo0o0.OooOOo$OooO00o */
    public static final class OooO00o {
        public static OooOO0 OooO00o(String message, Collection types) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(message, "message");
            kotlin.jvm.internal.OooOOO0.OooO0oO(types, "types");
            Collection collection = types;
            ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(collection, 10));
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(((AbstractC33320OooOoo) it.next()).OooOOO0());
            }
            C33557OooO0OO c33557OooO0OOOooO0O0 = C33560OooO00o.OooO0O0(arrayList);
            int i = c33557OooO0OOOooO0O0.f121171OooOo0o;
            OooOO0 oooO0O0 = i != 0 ? i != 1 ? new oO0Oo0o0.OooO0O0(message, (OooOO0[]) c33557OooO0OOOooO0O0.toArray(new OooOO0[0])) : (OooOO0) c33557OooO0OOOooO0O0.get(0) : OooOO0.OooO0O0.f120222OooO0O0;
            return c33557OooO0OOOooO0O0.f121171OooOo0o <= 1 ? oooO0O0 : new C33222OooOOo(oooO0O0);
        }
    }

    /* JADX INFO: renamed from: oO0Oo0o0.OooOOo$OooO0O0 */
    public static final class OooO0O0 extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<oO0O0OO.OooO00o, oO0O0OO.OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO0O0 f120230OooOo0o = new OooO0O0(1);

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final oO0O0OO.OooO00o invoke(oO0O0OO.OooO00o oooO00o) {
            oO0O0OO.OooO00o selectMostSpecificInEachOverridableGroup = oooO00o;
            kotlin.jvm.internal.OooOOO0.OooO0oO(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
            return selectMostSpecificInEachOverridableGroup;
        }
    }

    /* JADX INFO: renamed from: oO0Oo0o0.OooOOo$OooO0OO */
    public static final class OooO0OO extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<InterfaceC32632OoooOO0, oO0O0OO.OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO0OO f120231OooOo0o = new OooO0OO(1);

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final oO0O0OO.OooO00o invoke(InterfaceC32632OoooOO0 interfaceC32632OoooOO0) {
            InterfaceC32632OoooOO0 selectMostSpecificInEachOverridableGroup = interfaceC32632OoooOO0;
            kotlin.jvm.internal.OooOOO0.OooO0oO(selectMostSpecificInEachOverridableGroup, "$this$selectMostSpecificInEachOverridableGroup");
            return selectMostSpecificInEachOverridableGroup;
        }
    }

    public C33222OooOOo(OooOO0 oooOO02) {
        this.f120229OooO0O0 = oooOO02;
    }

    @Override // oO0Oo0o0.OooO00o
    public final OooOO0 OooO() {
        return this.f120229OooO0O0;
    }

    @Override // oO0Oo0o0.OooO00o, oO0Oo0o0.OooOO0
    public final Collection OooO0O0(C33479OooO0o name, oOo0o0oO.OooO0O0 oooO0O0) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        return C32998OooOOo.OooO00o(super.OooO0O0(name, oooO0O0), C33224OooOOoo.f120238OooOo0o);
    }

    @Override // oO0Oo0o0.OooO00o, oO0Oo0o0.OooOO0
    public final Collection<InterfaceC32632OoooOO0> OooO0o(C33479OooO0o name, oOo0o0oO.OooO0O0 oooO0O0) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        return C32998OooOOo.OooO00o(super.OooO0o(name, oooO0O0), OooO0OO.f120231OooOo0o);
    }

    @Override // oO0Oo0o0.OooO00o, oO0Oo0o0.OooOOO0
    public final Collection<oO0O0OO.OooOO0O> OooO0o0(C33216OooO0Oo kindFilter, InterfaceC32507OooOO0o<? super C33479OooO0o, Boolean> nameFilter) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(kindFilter, "kindFilter");
        kotlin.jvm.internal.OooOOO0.OooO0oO(nameFilter, "nameFilter");
        Collection<oO0O0OO.OooOO0O> collectionOooO0o0 = super.OooO0o0(kindFilter, nameFilter);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : collectionOooO0o0) {
            if (((oO0O0OO.OooOO0O) obj) instanceof oO0O0OO.OooO00o) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        return OooOo.OooooOO(C32998OooOOo.OooO00o(arrayList, OooO0O0.f120230OooOo0o), arrayList2);
    }
}
