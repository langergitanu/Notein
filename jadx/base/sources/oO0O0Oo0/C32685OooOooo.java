package oO0O0Oo0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oO0O0OO.InterfaceC32620Oooo00O;
import oO0Oo0o0.OooO0O0;
import oO0Oo0o0.OooOO0;
import oO0OooO0.C33477OooO0OO;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: oO0O0Oo0.OooOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32685OooOooo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<oO0Oo0o0.OooOO0> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ Oooo000 f117493OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32685OooOooo(Oooo000 oooo000) {
        super(0);
        this.f117493OooOo0o = oooo000;
    }

    @Override // oO0O000o.OooO00o
    public final oO0Oo0o0.OooOO0 invoke() {
        Oooo000 oooo000 = this.f117493OooOo0o;
        if (oooo000.isEmpty()) {
            return OooOO0.OooO0O0.f120222OooO0O0;
        }
        List<InterfaceC32620Oooo00O> listOooo0 = oooo000.Oooo0();
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(listOooo0, 10));
        Iterator<T> it = listOooo0.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC32620Oooo00O) it.next()).OooOOO0());
        }
        C32692Oooo0o0 c32692Oooo0o0 = oooo000.f117505OooOoO0;
        C33477OooO0OO c33477OooO0OO = oooo000.f117504OooOoO;
        return OooO0O0.OooO00o.OooO00o("package view scope for " + c33477OooO0OO + " in " + c32692Oooo0o0.getName(), oOo000Oo.OooOo.OooooOo(arrayList, new o000oOoO(c32692Oooo0o0, c33477OooO0OO)));
    }
}
