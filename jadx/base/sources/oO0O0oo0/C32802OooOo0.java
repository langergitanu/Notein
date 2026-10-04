package oO0O0oo0;

import java.util.ArrayList;
import java.util.List;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O0OO.InterfaceC32627Oooo0oo;
import oO0OOOo.C32982OooO;
import oO0OooO0.C33479OooO0o;
import oOo00OOo.C34499OooO0oO;

/* JADX INFO: renamed from: oO0O0oo0.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32802OooOo0 extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<C33479OooO0o, List<? extends InterfaceC32627Oooo0oo>> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ AbstractC32796OooOOOO f117867OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32802OooOo0(AbstractC32796OooOOOO abstractC32796OooOOOO) {
        super(1);
        this.f117867OooOo0o = abstractC32796OooOOOO;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final List<? extends InterfaceC32627Oooo0oo> invoke(C33479OooO0o c33479OooO0o) {
        C33479OooO0o name = c33479OooO0o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        ArrayList arrayList = new ArrayList();
        AbstractC32796OooOOOO abstractC32796OooOOOO = this.f117867OooOo0o;
        Oooo0.OooOo00.OooOO0(arrayList, abstractC32796OooOOOO.f117851OooO0oO.invoke(name));
        abstractC32796OooOOOO.OooOOO(arrayList, name);
        if (C32982OooO.OooOOO(abstractC32796OooOOOO.OooOOo0(), oO0O0OO.OooO0o.f117233OooOoOO)) {
            return oOo000Oo.OooOo.o0ooOO0(arrayList);
        }
        C34499OooO0oO c34499OooO0oO = abstractC32796OooOOOO.f117846OooO0O0;
        return oOo000Oo.OooOo.o0ooOO0(c34499OooO0oO.f123639OooO00o.f123621OooOOo.OooO0OO(c34499OooO0oO, arrayList));
    }
}
