package oO0O0oo0;

import OoooOOo.C21201OooOOOO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import oO0O0OO.InterfaceC32598OooO0oo;
import oO0O0OO.InterfaceC32627Oooo0oo;
import oO0O0OO.OooO0O0;
import oO0O0ooO.InterfaceC32821OooO0oO;
import oO0OOOo.C32990OooO0oo;
import oO0Oo0o0.C33216OooO0Oo;
import oO0Oo0o0.OooOO0;
import oO0OooO0.C33479OooO0o;
import oO0o0O0.C33552OooO00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34431OooOo0;
import oOo000Oo.C34438OooOoo0;
import oOo00OOo.C34495OooO0OO;
import oOo00OOo.C34499OooO0oO;

/* JADX INFO: renamed from: oO0O0oo0.OooOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32811OooOooO extends AbstractC32812OooOooo {

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final /* synthetic */ int f117881OooOOOo = 0;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final InterfaceC32821OooO0oO f117882OooOOO;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final C32784OooO0o0 f117883OooOOOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32811OooOooO(C34499OooO0oO c34499OooO0oO, InterfaceC32821OooO0oO jClass, C32784OooO0o0 c32784OooO0o0) {
        super(null, c34499OooO0oO);
        kotlin.jvm.internal.OooOOO0.OooO0oO(jClass, "jClass");
        this.f117882OooOOO = jClass;
        this.f117883OooOOOO = c32784OooO0o0;
    }

    public static InterfaceC32627Oooo0oo OooOo0O(InterfaceC32627Oooo0oo interfaceC32627Oooo0oo) {
        OooO0O0.OooO00o kind = interfaceC32627Oooo0oo.getKind();
        kind.getClass();
        if (kind != OooO0O0.OooO00o.f117221OooOo) {
            return interfaceC32627Oooo0oo;
        }
        Collection<? extends oO0O0OO.OooO0O0> collectionOooOO0o = interfaceC32627Oooo0oo.OooOO0o();
        kotlin.jvm.internal.OooOOO0.OooO0o(collectionOooOO0o, "this.overriddenDescriptors");
        Collection<? extends oO0O0OO.OooO0O0> collection = collectionOooOO0o;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            InterfaceC32627Oooo0oo it2 = (InterfaceC32627Oooo0oo) it.next();
            kotlin.jvm.internal.OooOOO0.OooO0o(it2, "it");
            arrayList.add(OooOo0O(it2));
        }
        return (InterfaceC32627Oooo0oo) oOo000Oo.OooOo.OoooooO(oOo000Oo.OooOo.Oooo0(arrayList));
    }

    @Override // oO0O0oo0.AbstractC32796OooOOOO
    public final Set OooO(C33216OooO0Oo kindFilter, OooOO0.OooO00o.C20305OooO00o c20305OooO00o) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(kindFilter, "kindFilter");
        Set setO0Oo0oo = oOo000Oo.OooOo.o0Oo0oo(this.f117850OooO0o0.invoke().OooO00o());
        C32784OooO0o0 c32784OooO0o0 = this.f117883OooOOOO;
        C32811OooOooO c32811OooOooOOooO0Oo = com.android.billingclient.api.OooOO0.OooO0Oo(c32784OooO0o0);
        Set<C33479OooO0o> setOooO00o = c32811OooOooOOooO0Oo != null ? c32811OooOooOOooO0Oo.OooO00o() : null;
        if (setOooO00o == null) {
            setOooO00o = C34438OooOoo0.f123458OooOo0o;
        }
        setO0Oo0oo.addAll(setOooO00o);
        if (this.f117882OooOOO.OooOo()) {
            setO0Oo0oo.addAll(C34429OooOOo0.OooOO0o(oO0O0O0o.OooOOO.f117136OooO0OO, oO0O0O0o.OooOOO.f117134OooO00o));
        }
        C34499OooO0oO c34499OooO0oO = this.f117846OooO0O0;
        setO0Oo0oo.addAll(c34499OooO0oO.f123639OooO00o.f123624OooOo.OooO0o0(c34499OooO0oO, c32784OooO0o0));
        return setO0Oo0oo;
    }

    @Override // oO0Oo0o0.OooOO0O, oO0Oo0o0.OooOOO0
    public final InterfaceC32598OooO0oo OooO0oO(C33479OooO0o name, oOo0o0oO.OooO0O0 location) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        kotlin.jvm.internal.OooOOO0.OooO0oO(location, "location");
        return null;
    }

    @Override // oO0O0oo0.AbstractC32796OooOOOO
    public final Set OooO0oo(C33216OooO0Oo kindFilter, OooOO0.OooO00o.C20305OooO00o c20305OooO00o) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(kindFilter, "kindFilter");
        return C34438OooOoo0.f123458OooOo0o;
    }

    @Override // oO0O0oo0.AbstractC32796OooOOOO
    public final void OooOO0(ArrayList arrayList, C33479OooO0o name) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        C34499OooO0oO c34499OooO0oO = this.f117846OooO0O0;
        C34495OooO0OO c34495OooO0OO = c34499OooO0oO.f123639OooO00o;
        c34495OooO0OO.f123624OooOo.OooO0oO(c34499OooO0oO, this.f117883OooOOOO, name, arrayList);
    }

    @Override // oO0O0oo0.AbstractC32796OooOOOO
    public final InterfaceC32780OooO0O0 OooOO0O() {
        return new C32779OooO00o(this.f117882OooOOO, C32806OooOoO.f117874OooOo0o);
    }

    @Override // oO0O0oo0.AbstractC32812OooOooo, oO0O0oo0.AbstractC32796OooOOOO
    public final void OooOOO(ArrayList arrayList, C33479OooO0o name) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C21201OooOOOO c21201OooOOOO = new C21201OooOOOO(name, 3);
        C32784OooO0o0 c32784OooO0o0 = this.f117883OooOOOO;
        C33552OooO00o.OooO0O0(com.facebook.soloader.OooOo.OooO0oO(c32784OooO0o0), C32807OooOoO0.f117875OooO00o, new C32809OooOoo(c32784OooO0o0, linkedHashSet, c21201OooOOOO));
        boolean zIsEmpty = arrayList.isEmpty();
        C34499OooO0oO c34499OooO0oO = this.f117846OooO0O0;
        if (zIsEmpty) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : linkedHashSet) {
                InterfaceC32627Oooo0oo interfaceC32627Oooo0ooOooOo0O = OooOo0O((InterfaceC32627Oooo0oo) obj);
                Object arrayList2 = linkedHashMap.get(interfaceC32627Oooo0ooOooOo0O);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    linkedHashMap.put(interfaceC32627Oooo0ooOooOo0O, arrayList2);
                }
                ((List) arrayList2).add(obj);
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                Collection collection = (Collection) ((Map.Entry) it.next()).getValue();
                C34495OooO0OO c34495OooO0OO = c34499OooO0oO.f123639OooO00o;
                C34431OooOo0.OooOo0o(arrayList3, Oooo.OooO0OO.OooOo0O(name, collection, arrayList, this.f117883OooOOOO, c34495OooO0OO.f123610OooO0o, c34495OooO0OO.f123625OooOo0.f120930OooO0o0));
            }
            arrayList.addAll(arrayList3);
        } else {
            C34495OooO0OO c34495OooO0OO2 = c34499OooO0oO.f123639OooO00o;
            arrayList.addAll(Oooo.OooO0OO.OooOo0O(name, linkedHashSet, arrayList, this.f117883OooOOOO, c34495OooO0OO2.f123610OooO0o, c34495OooO0OO2.f123625OooOo0.f120930OooO0o0));
        }
        if (this.f117882OooOOO.OooOo() && name.equals(oO0O0O0o.OooOOO.f117135OooO0O0)) {
            Oooo0.OooOo00.OooOO0(arrayList, C32990OooO0oo.OooO0o0(c32784OooO0o0));
        }
    }

    @Override // oO0O0oo0.AbstractC32796OooOOOO
    public final void OooOOO0(LinkedHashSet linkedHashSet, C33479OooO0o name) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        C32784OooO0o0 c32784OooO0o0 = this.f117883OooOOOO;
        C32811OooOooO c32811OooOooOOooO0Oo = com.android.billingclient.api.OooOO0.OooO0Oo(c32784OooO0o0);
        Collection collectionO0OO00O = c32811OooOooOOooO0Oo == null ? C34438OooOoo0.f123458OooOo0o : oOo000Oo.OooOo.o0OO00O(c32811OooOooOOooO0Oo.OooO0o(name, oOo0o0oO.OooO0O0.f123889OooOoOO));
        C34495OooO0OO c34495OooO0OO = this.f117846OooO0O0.f123639OooO00o;
        linkedHashSet.addAll(Oooo.OooO0OO.OooOo0O(name, collectionO0OO00O, linkedHashSet, this.f117883OooOOOO, c34495OooO0OO.f123610OooO0o, c34495OooO0OO.f123625OooOo0.f120930OooO0o0));
        if (this.f117882OooOOO.OooOo()) {
            if (name.equals(oO0O0O0o.OooOOO.f117136OooO0OO)) {
                linkedHashSet.add(C32990OooO0oo.OooO0o(c32784OooO0o0));
            } else if (name.equals(oO0O0O0o.OooOOO.f117134OooO00o)) {
                linkedHashSet.add(C32990OooO0oo.OooO0oO(c32784OooO0o0));
            }
        }
    }

    @Override // oO0O0oo0.AbstractC32796OooOOOO
    public final Set OooOOOO(C33216OooO0Oo kindFilter) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(kindFilter, "kindFilter");
        Set setO0Oo0oo = oOo000Oo.OooOo.o0Oo0oo(this.f117850OooO0o0.invoke().getFieldNames());
        C32808OooOoOO c32808OooOoOO = C32808OooOoOO.f117876OooOo0o;
        C32784OooO0o0 c32784OooO0o0 = this.f117883OooOOOO;
        C33552OooO00o.OooO0O0(com.facebook.soloader.OooOo.OooO0oO(c32784OooO0o0), C32807OooOoO0.f117875OooO00o, new C32809OooOoo(c32784OooO0o0, setO0Oo0oo, c32808OooOoOO));
        if (this.f117882OooOOO.OooOo()) {
            setO0Oo0oo.add(oO0O0O0o.OooOOO.f117135OooO0O0);
        }
        return setO0Oo0oo;
    }

    @Override // oO0O0oo0.AbstractC32796OooOOOO
    public final oO0O0OO.OooOO0O OooOOo0() {
        return this.f117883OooOOOO;
    }
}
