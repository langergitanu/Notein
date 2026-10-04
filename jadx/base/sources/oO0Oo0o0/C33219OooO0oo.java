package oO0Oo0o0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O0OO.InterfaceC32596OooO0o0;
import oO0O0OO.InterfaceC32598OooO0oo;
import oO0O0OO.InterfaceC32636OoooOoO;
import oO0OooO0.C33479OooO0o;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: oO0Oo0o0.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33219OooO0oo extends OooOO0O {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooOO0 f120217OooO0O0;

    public C33219OooO0oo(OooOO0 workerScope) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(workerScope, "workerScope");
        this.f120217OooO0O0 = workerScope;
    }

    @Override // oO0Oo0o0.OooOO0O, oO0Oo0o0.OooOO0
    public final Set<C33479OooO0o> OooO00o() {
        return this.f120217OooO0O0.OooO00o();
    }

    @Override // oO0Oo0o0.OooOO0O, oO0Oo0o0.OooOO0
    public final Set<C33479OooO0o> OooO0OO() {
        return this.f120217OooO0O0.OooO0OO();
    }

    @Override // oO0Oo0o0.OooOO0O, oO0Oo0o0.OooOO0
    public final Set<C33479OooO0o> OooO0Oo() {
        return this.f120217OooO0O0.OooO0Oo();
    }

    @Override // oO0Oo0o0.OooOO0O, oO0Oo0o0.OooOOO0
    public final Collection OooO0o0(C33216OooO0Oo kindFilter, InterfaceC32507OooOO0o nameFilter) {
        Collection collection;
        kotlin.jvm.internal.OooOOO0.OooO0oO(kindFilter, "kindFilter");
        kotlin.jvm.internal.OooOOO0.OooO0oO(nameFilter, "nameFilter");
        int i = C33216OooO0Oo.f120199OooOO0o & kindFilter.f120208OooO0O0;
        C33216OooO0Oo c33216OooO0Oo = i == 0 ? null : new C33216OooO0Oo(i, kindFilter.f120207OooO00o);
        if (c33216OooO0Oo == null) {
            collection = C34434OooOoO.f123453OooOo0o;
        } else {
            Collection<oO0O0OO.OooOO0O> collectionOooO0o0 = this.f120217OooO0O0.OooO0o0(c33216OooO0Oo, nameFilter);
            ArrayList arrayList = new ArrayList();
            for (Object obj : collectionOooO0o0) {
                if (obj instanceof oO0O0OO.OooO) {
                    arrayList.add(obj);
                }
            }
            collection = arrayList;
        }
        return collection;
    }

    @Override // oO0Oo0o0.OooOO0O, oO0Oo0o0.OooOOO0
    public final InterfaceC32598OooO0oo OooO0oO(C33479OooO0o name, oOo0o0oO.OooO0O0 location) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        kotlin.jvm.internal.OooOOO0.OooO0oO(location, "location");
        InterfaceC32598OooO0oo interfaceC32598OooO0ooOooO0oO = this.f120217OooO0O0.OooO0oO(name, location);
        if (interfaceC32598OooO0ooOooO0oO != null) {
            InterfaceC32596OooO0o0 interfaceC32596OooO0o0 = interfaceC32598OooO0ooOooO0oO instanceof InterfaceC32596OooO0o0 ? (InterfaceC32596OooO0o0) interfaceC32598OooO0ooOooO0oO : null;
            if (interfaceC32596OooO0o0 != null) {
                return interfaceC32596OooO0o0;
            }
            if (interfaceC32598OooO0ooOooO0oO instanceof InterfaceC32636OoooOoO) {
                return (InterfaceC32636OoooOoO) interfaceC32598OooO0ooOooO0oO;
            }
        }
        return null;
    }

    public final String toString() {
        return "Classes from " + this.f120217OooO0O0;
    }
}
