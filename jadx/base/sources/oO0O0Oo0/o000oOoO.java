package oO0O0Oo0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O0OO.InterfaceC32615OooOoo;
import oO0O0OO.InterfaceC32623Oooo0OO;
import oO0Oo0o0.C33216OooO0Oo;
import oO0OooO0.C33477OooO0OO;
import oO0OooO0.C33479OooO0o;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.C34438OooOoo0;

/* JADX INFO: loaded from: classes10.dex */
public final class o000oOoO extends oO0Oo0o0.OooOO0O {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC32615OooOoo f117596OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C33477OooO0OO f117597OooO0OO;

    public o000oOoO(InterfaceC32615OooOoo moduleDescriptor, C33477OooO0OO fqName) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(moduleDescriptor, "moduleDescriptor");
        kotlin.jvm.internal.OooOOO0.OooO0oO(fqName, "fqName");
        this.f117596OooO0O0 = moduleDescriptor;
        this.f117597OooO0OO = fqName;
    }

    @Override // oO0Oo0o0.OooOO0O, oO0Oo0o0.OooOO0
    public final Set<C33479OooO0o> OooO0Oo() {
        return C34438OooOoo0.f123458OooOo0o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r7.f120207OooO00o.contains(oO0Oo0o0.OooO0OO.OooO0O0.f120189OooO00o) != false) goto L9;
     */
    @Override // oO0Oo0o0.OooOO0O, oO0Oo0o0.OooOOO0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Collection<oO0O0OO.OooOO0O> OooO0o0(C33216OooO0Oo kindFilter, InterfaceC32507OooOO0o<? super C33479OooO0o, Boolean> nameFilter) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(kindFilter, "kindFilter");
        kotlin.jvm.internal.OooOOO0.OooO0oO(nameFilter, "nameFilter");
        boolean zOooO00o = kindFilter.OooO00o(C33216OooO0Oo.f120196OooO0oo);
        C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
        if (zOooO00o) {
            C33477OooO0OO c33477OooO0OO = this.f117597OooO0OO;
            if (c33477OooO0OO.OooO0Oo()) {
            }
            InterfaceC32615OooOoo interfaceC32615OooOoo = this.f117596OooO0O0;
            Collection<C33477OooO0OO> collectionOooOOOo = interfaceC32615OooOoo.OooOOOo(c33477OooO0OO, nameFilter);
            ArrayList arrayList = new ArrayList(collectionOooOOOo.size());
            Iterator<C33477OooO0OO> it = collectionOooOOOo.iterator();
            while (it.hasNext()) {
                C33479OooO0o c33479OooO0oOooO0o = it.next().OooO0o();
                kotlin.jvm.internal.OooOOO0.OooO0o(c33479OooO0oOooO0o, "subFqName.shortName()");
                if (nameFilter.invoke(c33479OooO0oOooO0o).booleanValue()) {
                    InterfaceC32623Oooo0OO interfaceC32623Oooo0OO = null;
                    if (!c33479OooO0oOooO0o.f120980OooOo) {
                        InterfaceC32623Oooo0OO interfaceC32623Oooo0OOO00oO0o = interfaceC32615OooOoo.o00oO0o(c33477OooO0OO.OooO0OO(c33479OooO0oOooO0o));
                        if (!interfaceC32623Oooo0OOO00oO0o.isEmpty()) {
                            interfaceC32623Oooo0OO = interfaceC32623Oooo0OOO00oO0o;
                        }
                    }
                    Oooo0.OooOo00.OooOO0(arrayList, interfaceC32623Oooo0OO);
                }
            }
            return arrayList;
        }
        return c34434OooOoO;
    }

    public final String toString() {
        return "subpackages of " + this.f117597OooO0OO + " from " + this.f117596OooO0O0;
    }
}
