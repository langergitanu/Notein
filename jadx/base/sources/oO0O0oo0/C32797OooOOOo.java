package oO0O0oo0;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import oO0Oo0o0.C33216OooO0Oo;
import oO0Oo0o0.OooO0OO;
import oO0Oo0o0.OooOO0;
import oO0OooO0.C33479OooO0o;

/* JADX INFO: renamed from: oO0O0oo0.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32797OooOOOo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<Collection<? extends oO0O0OO.OooOO0O>> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ AbstractC32796OooOOOO f117862OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32797OooOOOo(AbstractC32796OooOOOO abstractC32796OooOOOO) {
        super(0);
        this.f117862OooOo0o = abstractC32796OooOOOO;
    }

    @Override // oO0O000o.OooO00o
    public final Collection<? extends oO0O0OO.OooOO0O> invoke() {
        C33216OooO0Oo kindFilter = C33216OooO0Oo.f120201OooOOO0;
        oO0Oo0o0.OooOO0.f120218OooO00o.getClass();
        OooOO0.OooO00o.C20305OooO00o nameFilter = OooOO0.OooO00o.f120220OooO0O0;
        AbstractC32796OooOOOO abstractC32796OooOOOO = this.f117862OooOo0o;
        abstractC32796OooOOOO.getClass();
        kotlin.jvm.internal.OooOOO0.OooO0oO(kindFilter, "kindFilter");
        kotlin.jvm.internal.OooOOO0.OooO0oO(nameFilter, "nameFilter");
        oOo0o0oO.OooO0O0 oooO0O0 = oOo0o0oO.OooO0O0.f123887OooOoO;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (kindFilter.OooO00o(C33216OooO0Oo.f120199OooOO0o)) {
            for (C33479OooO0o c33479OooO0o : abstractC32796OooOOOO.OooO0oo(kindFilter, nameFilter)) {
                nameFilter.invoke(c33479OooO0o);
                Oooo0.OooOo00.OooOO0(linkedHashSet, abstractC32796OooOOOO.OooO0oO(c33479OooO0o, oooO0O0));
            }
        }
        boolean zOooO00o = kindFilter.OooO00o(C33216OooO0Oo.f120190OooO);
        List<oO0Oo0o0.OooO0OO> list = kindFilter.f120207OooO00o;
        if (zOooO00o && !list.contains(OooO0OO.OooO00o.f120187OooO00o)) {
            for (C33479OooO0o c33479OooO0o2 : abstractC32796OooOOOO.OooO(kindFilter, nameFilter)) {
                nameFilter.invoke(c33479OooO0o2);
                linkedHashSet.addAll(abstractC32796OooOOOO.OooO0o(c33479OooO0o2, oooO0O0));
            }
        }
        if (kindFilter.OooO00o(C33216OooO0Oo.f120197OooOO0) && !list.contains(OooO0OO.OooO00o.f120187OooO00o)) {
            for (C33479OooO0o c33479OooO0o3 : abstractC32796OooOOOO.OooOOOO(kindFilter)) {
                nameFilter.invoke(c33479OooO0o3);
                linkedHashSet.addAll(abstractC32796OooOOOO.OooO0O0(c33479OooO0o3, oooO0O0));
            }
        }
        return oOo000Oo.OooOo.o0ooOO0(linkedHashSet);
    }
}
