package oO0Oo0o0;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O0OO.InterfaceC32598OooO0oo;
import oO0O0OO.InterfaceC32632OoooOO0;
import oO0OooO0.C33479OooO0o;
import oO0o0O0.C33555OooO0O0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: loaded from: classes10.dex */
public abstract class OooOO0O implements OooOO0 {
    @Override // oO0Oo0o0.OooOO0
    public Set<C33479OooO0o> OooO00o() {
        Collection<oO0O0OO.OooOO0O> collectionOooO0o0 = OooO0o0(C33216OooO0Oo.f120203OooOOOo, C33555OooO0O0.f121162OooO00o);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionOooO0o0) {
            if (obj instanceof InterfaceC32632OoooOO0) {
                C33479OooO0o name = ((InterfaceC32632OoooOO0) obj).getName();
                kotlin.jvm.internal.OooOOO0.OooO0o(name, "it.name");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // oO0Oo0o0.OooOO0
    public Collection OooO0O0(C33479OooO0o name, oOo0o0oO.OooO0O0 oooO0O0) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        return C34434OooOoO.f123453OooOo0o;
    }

    @Override // oO0Oo0o0.OooOO0
    public Set<C33479OooO0o> OooO0OO() {
        Collection<oO0O0OO.OooOO0O> collectionOooO0o0 = OooO0o0(C33216OooO0Oo.f120205OooOOo0, C33555OooO0O0.f121162OooO00o);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionOooO0o0) {
            if (obj instanceof InterfaceC32632OoooOO0) {
                C33479OooO0o name = ((InterfaceC32632OoooOO0) obj).getName();
                kotlin.jvm.internal.OooOOO0.OooO0o(name, "it.name");
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // oO0Oo0o0.OooOO0
    public Set<C33479OooO0o> OooO0Oo() {
        return null;
    }

    @Override // oO0Oo0o0.OooOO0
    public Collection<? extends InterfaceC32632OoooOO0> OooO0o(C33479OooO0o name, oOo0o0oO.OooO0O0 oooO0O0) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        return C34434OooOoO.f123453OooOo0o;
    }

    @Override // oO0Oo0o0.OooOOO0
    public Collection<oO0O0OO.OooOO0O> OooO0o0(C33216OooO0Oo kindFilter, InterfaceC32507OooOO0o<? super C33479OooO0o, Boolean> nameFilter) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(kindFilter, "kindFilter");
        kotlin.jvm.internal.OooOOO0.OooO0oO(nameFilter, "nameFilter");
        return C34434OooOoO.f123453OooOo0o;
    }

    @Override // oO0Oo0o0.OooOOO0
    public InterfaceC32598OooO0oo OooO0oO(C33479OooO0o name, oOo0o0oO.OooO0O0 location) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        kotlin.jvm.internal.OooOOO0.OooO0oO(location, "location");
        return null;
    }
}
