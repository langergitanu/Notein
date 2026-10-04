package oO0O0OO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0OooO0.C33477OooO0OO;
import oO0OooO0.C33479OooO0o;
import oO0o0O0O.C33576OooOOOo;

/* JADX INFO: loaded from: classes10.dex */
public final class Oooo0 implements InterfaceC32622Oooo0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f117277OooO00o;

    public static final class OooO00o extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<InterfaceC32620Oooo00O, C33477OooO0OO> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f117278OooOo0o = new OooO00o(1);

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C33477OooO0OO invoke(InterfaceC32620Oooo00O interfaceC32620Oooo00O) {
            InterfaceC32620Oooo00O it = interfaceC32620Oooo00O;
            kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
            return it.OooO0OO();
        }
    }

    public static final class OooO0O0 extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<C33477OooO0OO, Boolean> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C33477OooO0OO f117279OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(C33477OooO0OO c33477OooO0OO) {
            super(1);
            this.f117279OooOo0o = c33477OooO0OO;
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final Boolean invoke(C33477OooO0OO c33477OooO0OO) {
            C33477OooO0OO it = c33477OooO0OO;
            kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
            return Boolean.valueOf(!it.OooO0Oo() && kotlin.jvm.internal.OooOOO0.OooO0O0(it.OooO0o0(), this.f117279OooOo0o));
        }
    }

    public Oooo0(ArrayList arrayList) {
        this.f117277OooO00o = arrayList;
    }

    @Override // oO0O0OO.InterfaceC32622Oooo0O0
    public final void OooO00o(C33477OooO0OO fqName, ArrayList arrayList) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(fqName, "fqName");
        for (Object obj : this.f117277OooO00o) {
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(((InterfaceC32620Oooo00O) obj).OooO0OO(), fqName)) {
                arrayList.add(obj);
            }
        }
    }

    @Override // oO0O0OO.InterfaceC32621Oooo00o
    public final List<InterfaceC32620Oooo00O> OooO0O0(C33477OooO0OO fqName) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(fqName, "fqName");
        ArrayList arrayList = this.f117277OooO00o;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(((InterfaceC32620Oooo00O) obj).OooO0OO(), fqName)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    @Override // oO0O0OO.InterfaceC32622Oooo0O0
    public final boolean OooO0OO(C33477OooO0OO fqName) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(fqName, "fqName");
        ArrayList arrayList = this.f117277OooO00o;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(((InterfaceC32620Oooo00O) it.next()).OooO0OO(), fqName)) {
                return false;
            }
        }
        return true;
    }

    @Override // oO0O0OO.InterfaceC32621Oooo00o
    public final Collection<C33477OooO0OO> OooOOOo(C33477OooO0OO fqName, InterfaceC32507OooOO0o<? super C33479OooO0o, Boolean> nameFilter) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(fqName, "fqName");
        kotlin.jvm.internal.OooOOO0.OooO0oO(nameFilter, "nameFilter");
        return C33576OooOOOo.OooOo0(C33576OooOOOo.OooOOO0(C33576OooOOOo.OooOOoo(oOo000Oo.OooOo.OooOooo(this.f117277OooO00o), OooO00o.f117278OooOo0o), new OooO0O0(fqName)));
    }
}
