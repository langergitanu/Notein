package oO0O0oo0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O0OO.InterfaceC32632OoooOO0;
import oO0O0oOo.C32776OooO0o0;
import oO0O0ooO.InterfaceC32831OooOOo0;
import oO0Ooo0.C33361OooO0Oo;
import oO0OooO0.C33479OooO0o;

/* JADX INFO: renamed from: oO0O0oo0.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32800OooOOoo extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<C33479OooO0o, Collection<? extends InterfaceC32632OoooOO0>> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ AbstractC32796OooOOOO f117865OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32800OooOOoo(AbstractC32796OooOOOO abstractC32796OooOOOO) {
        super(1);
        this.f117865OooOo0o = abstractC32796OooOOOO;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Collection<? extends InterfaceC32632OoooOO0> invoke(C33479OooO0o c33479OooO0o) {
        C33479OooO0o name = c33479OooO0o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        AbstractC32796OooOOOO abstractC32796OooOOOO = this.f117865OooOo0o;
        C32789OooOO0O c32789OooOO0O = abstractC32796OooOOOO.f117847OooO0OO;
        if (c32789OooOO0O != null) {
            return (Collection) ((C33361OooO0Oo.OooOO0O) c32789OooOO0O.f117849OooO0o).invoke(name);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<InterfaceC32831OooOOo0> it = abstractC32796OooOOOO.f117850OooO0o0.invoke().OooO0Oo(name).iterator();
        while (it.hasNext()) {
            C32776OooO0o0 c32776OooO0o0OooOo00 = abstractC32796OooOOOO.OooOo00(it.next());
            if (abstractC32796OooOOOO.OooOOo(c32776OooO0o0OooOo00)) {
                abstractC32796OooOOOO.f117846OooO0O0.f123639OooO00o.f123612OooO0oO.getClass();
                arrayList.add(c32776OooO0o0OooOo00);
            }
        }
        abstractC32796OooOOOO.OooOO0(arrayList, name);
        return arrayList;
    }
}
