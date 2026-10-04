package oO0O0Oo0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import o00OO0o.C24991OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O0OO.InterfaceC32620Oooo00O;
import oO0O0OO.InterfaceC32621Oooo00o;
import oO0O0OO.InterfaceC32622Oooo0O0;
import oO0OooO0.C33477OooO0OO;
import oO0OooO0.C33479OooO0o;

/* JADX INFO: renamed from: oO0O0Oo0.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32674OooOOo0 implements InterfaceC32622Oooo0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<InterfaceC32621Oooo00o> f117422OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f117423OooO0O0;

    /* JADX WARN: Multi-variable type inference failed */
    public C32674OooOOo0(List<? extends InterfaceC32621Oooo00o> list, String debugName) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(debugName, "debugName");
        this.f117422OooO00o = list;
        this.f117423OooO0O0 = debugName;
        list.size();
        oOo000Oo.OooOo.o0OO00O(list).size();
    }

    @Override // oO0O0OO.InterfaceC32622Oooo0O0
    public final void OooO00o(C33477OooO0OO fqName, ArrayList arrayList) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(fqName, "fqName");
        Iterator<InterfaceC32621Oooo00o> it = this.f117422OooO00o.iterator();
        while (it.hasNext()) {
            C24991OooO00o.OooO0OO(it.next(), fqName, arrayList);
        }
    }

    @Override // oO0O0OO.InterfaceC32621Oooo00o
    public final List<InterfaceC32620Oooo00O> OooO0O0(C33477OooO0OO fqName) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(fqName, "fqName");
        ArrayList arrayList = new ArrayList();
        Iterator<InterfaceC32621Oooo00o> it = this.f117422OooO00o.iterator();
        while (it.hasNext()) {
            C24991OooO00o.OooO0OO(it.next(), fqName, arrayList);
        }
        return oOo000Oo.OooOo.o0ooOO0(arrayList);
    }

    @Override // oO0O0OO.InterfaceC32622Oooo0O0
    public final boolean OooO0OO(C33477OooO0OO fqName) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(fqName, "fqName");
        List<InterfaceC32621Oooo00o> list = this.f117422OooO00o;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!C24991OooO00o.OooO0Oo((InterfaceC32621Oooo00o) it.next(), fqName)) {
                return false;
            }
        }
        return true;
    }

    @Override // oO0O0OO.InterfaceC32621Oooo00o
    public final Collection<C33477OooO0OO> OooOOOo(C33477OooO0OO fqName, InterfaceC32507OooOO0o<? super C33479OooO0o, Boolean> nameFilter) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(fqName, "fqName");
        kotlin.jvm.internal.OooOOO0.OooO0oO(nameFilter, "nameFilter");
        HashSet hashSet = new HashSet();
        Iterator<InterfaceC32621Oooo00o> it = this.f117422OooO00o.iterator();
        while (it.hasNext()) {
            hashSet.addAll(it.next().OooOOOo(fqName, nameFilter));
        }
        return hashSet;
    }

    public final String toString() {
        return this.f117423OooO0O0;
    }
}
