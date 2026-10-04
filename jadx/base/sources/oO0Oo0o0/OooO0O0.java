package oO0Oo0o0;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O0OO.InterfaceC32598OooO0oo;
import oO0O0OO.InterfaceC32632OoooOO0;
import oO0Oo0o0.OooOO0;
import oO0OooO0.C33479OooO0o;
import oO0o0O0.C33557OooO0OO;
import oO0o0O00.C33560OooO00o;
import oOo000Oo.C34431OooOo0;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34438OooOoo0;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0O0 implements OooOO0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f120185OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooOO0[] f120186OooO0OO;

    public static final class OooO00o {
        public static OooOO0 OooO00o(String debugName, Iterable iterable) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(debugName, "debugName");
            C33557OooO0OO c33557OooO0OO = new C33557OooO0OO();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                OooOO0 oooOO02 = (OooOO0) it.next();
                if (oooOO02 != OooOO0.OooO0O0.f120222OooO0O0) {
                    if (oooOO02 instanceof OooO0O0) {
                        C34431OooOo0.OooOo(c33557OooO0OO, ((OooO0O0) oooOO02).f120186OooO0OO);
                    } else {
                        c33557OooO0OO.add(oooOO02);
                    }
                }
            }
            int i = c33557OooO0OO.f121171OooOo0o;
            return i != 0 ? i != 1 ? new OooO0O0(debugName, (OooOO0[]) c33557OooO0OO.toArray(new OooOO0[0])) : (OooOO0) c33557OooO0OO.get(0) : OooOO0.OooO0O0.f120222OooO0O0;
        }
    }

    public OooO0O0(String str, OooOO0[] oooOO0Arr) {
        this.f120185OooO0O0 = str;
        this.f120186OooO0OO = oooOO0Arr;
    }

    @Override // oO0Oo0o0.OooOO0
    public final Set<C33479OooO0o> OooO00o() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (OooOO0 oooOO02 : this.f120186OooO0OO) {
            C34431OooOo0.OooOo0o(linkedHashSet, oooOO02.OooO00o());
        }
        return linkedHashSet;
    }

    @Override // oO0Oo0o0.OooOO0
    public final Collection OooO0O0(C33479OooO0o name, oOo0o0oO.OooO0O0 oooO0O0) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        OooOO0[] oooOO0Arr = this.f120186OooO0OO;
        int length = oooOO0Arr.length;
        if (length == 0) {
            return C34434OooOoO.f123453OooOo0o;
        }
        if (length == 1) {
            return oooOO0Arr[0].OooO0O0(name, oooO0O0);
        }
        Collection collectionOooO00o = null;
        for (OooOO0 oooOO02 : oooOO0Arr) {
            collectionOooO00o = C33560OooO00o.OooO00o(collectionOooO00o, oooOO02.OooO0O0(name, oooO0O0));
        }
        return collectionOooO00o == null ? C34438OooOoo0.f123458OooOo0o : collectionOooO00o;
    }

    @Override // oO0Oo0o0.OooOO0
    public final Set<C33479OooO0o> OooO0OO() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (OooOO0 oooOO02 : this.f120186OooO0OO) {
            C34431OooOo0.OooOo0o(linkedHashSet, oooOO02.OooO0OO());
        }
        return linkedHashSet;
    }

    @Override // oO0Oo0o0.OooOO0
    public final Set<C33479OooO0o> OooO0Oo() {
        return C33220OooOO0o.OooO00o(oOo000Oo.OooOOO.OooOo0o(this.f120186OooO0OO));
    }

    @Override // oO0Oo0o0.OooOO0
    public final Collection<InterfaceC32632OoooOO0> OooO0o(C33479OooO0o name, oOo0o0oO.OooO0O0 oooO0O0) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        OooOO0[] oooOO0Arr = this.f120186OooO0OO;
        int length = oooOO0Arr.length;
        if (length == 0) {
            return C34434OooOoO.f123453OooOo0o;
        }
        if (length == 1) {
            return oooOO0Arr[0].OooO0o(name, oooO0O0);
        }
        Collection<InterfaceC32632OoooOO0> collectionOooO00o = null;
        for (OooOO0 oooOO02 : oooOO0Arr) {
            collectionOooO00o = C33560OooO00o.OooO00o(collectionOooO00o, oooOO02.OooO0o(name, oooO0O0));
        }
        return collectionOooO00o == null ? C34438OooOoo0.f123458OooOo0o : collectionOooO00o;
    }

    @Override // oO0Oo0o0.OooOOO0
    public final Collection<oO0O0OO.OooOO0O> OooO0o0(C33216OooO0Oo kindFilter, InterfaceC32507OooOO0o<? super C33479OooO0o, Boolean> nameFilter) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(kindFilter, "kindFilter");
        kotlin.jvm.internal.OooOOO0.OooO0oO(nameFilter, "nameFilter");
        OooOO0[] oooOO0Arr = this.f120186OooO0OO;
        int length = oooOO0Arr.length;
        if (length == 0) {
            return C34434OooOoO.f123453OooOo0o;
        }
        if (length == 1) {
            return oooOO0Arr[0].OooO0o0(kindFilter, nameFilter);
        }
        Collection<oO0O0OO.OooOO0O> collectionOooO00o = null;
        for (OooOO0 oooOO02 : oooOO0Arr) {
            collectionOooO00o = C33560OooO00o.OooO00o(collectionOooO00o, oooOO02.OooO0o0(kindFilter, nameFilter));
        }
        return collectionOooO00o == null ? C34438OooOoo0.f123458OooOo0o : collectionOooO00o;
    }

    @Override // oO0Oo0o0.OooOOO0
    public final InterfaceC32598OooO0oo OooO0oO(C33479OooO0o name, oOo0o0oO.OooO0O0 location) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        kotlin.jvm.internal.OooOOO0.OooO0oO(location, "location");
        InterfaceC32598OooO0oo interfaceC32598OooO0oo = null;
        for (OooOO0 oooOO02 : this.f120186OooO0OO) {
            InterfaceC32598OooO0oo interfaceC32598OooO0ooOooO0oO = oooOO02.OooO0oO(name, location);
            if (interfaceC32598OooO0ooOooO0oO != null) {
                if (!(interfaceC32598OooO0ooOooO0oO instanceof oO0O0OO.OooO) || !((oO0O0OO.OooO) interfaceC32598OooO0ooOooO0oO).o00Oo0()) {
                    return interfaceC32598OooO0ooOooO0oO;
                }
                if (interfaceC32598OooO0oo == null) {
                    interfaceC32598OooO0oo = interfaceC32598OooO0ooOooO0oO;
                }
            }
        }
        return interfaceC32598OooO0oo;
    }

    public final String toString() {
        return this.f120185OooO0O0;
    }
}
