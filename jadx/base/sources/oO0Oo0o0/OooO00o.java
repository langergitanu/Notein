package oO0Oo0o0;

import java.util.Collection;
import java.util.Set;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O0OO.InterfaceC32598OooO0oo;
import oO0O0OO.InterfaceC32632OoooOO0;
import oO0OooO0.C33479OooO0o;

/* JADX INFO: loaded from: classes10.dex */
public abstract class OooO00o implements OooOO0 {
    public abstract OooOO0 OooO();

    @Override // oO0Oo0o0.OooOO0
    public final Set<C33479OooO0o> OooO00o() {
        return OooO().OooO00o();
    }

    @Override // oO0Oo0o0.OooOO0
    public Collection OooO0O0(C33479OooO0o name, oOo0o0oO.OooO0O0 oooO0O0) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        return OooO().OooO0O0(name, oooO0O0);
    }

    @Override // oO0Oo0o0.OooOO0
    public final Set<C33479OooO0o> OooO0OO() {
        return OooO().OooO0OO();
    }

    @Override // oO0Oo0o0.OooOO0
    public final Set<C33479OooO0o> OooO0Oo() {
        return OooO().OooO0Oo();
    }

    @Override // oO0Oo0o0.OooOO0
    public Collection<InterfaceC32632OoooOO0> OooO0o(C33479OooO0o name, oOo0o0oO.OooO0O0 oooO0O0) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        return OooO().OooO0o(name, oooO0O0);
    }

    @Override // oO0Oo0o0.OooOOO0
    public Collection<oO0O0OO.OooOO0O> OooO0o0(C33216OooO0Oo kindFilter, InterfaceC32507OooOO0o<? super C33479OooO0o, Boolean> nameFilter) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(kindFilter, "kindFilter");
        kotlin.jvm.internal.OooOOO0.OooO0oO(nameFilter, "nameFilter");
        return OooO().OooO0o0(kindFilter, nameFilter);
    }

    @Override // oO0Oo0o0.OooOOO0
    public final InterfaceC32598OooO0oo OooO0oO(C33479OooO0o name, oOo0o0oO.OooO0O0 location) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        kotlin.jvm.internal.OooOOO0.OooO0oO(location, "location");
        return OooO().OooO0oO(name, location);
    }

    public final OooOO0 OooO0oo() {
        if (!(OooO() instanceof OooO00o)) {
            return OooO();
        }
        OooOO0 oooOO0OooO = OooO();
        kotlin.jvm.internal.OooOOO0.OooO0o0(oooOO0OooO, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter");
        return ((OooO00o) oooOO0OooO).OooO0oo();
    }
}
