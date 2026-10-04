package oO0OoO0;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O0O.C32531OooOo0O;
import oO0O0OO.InterfaceC32620Oooo00O;
import oO0O0OO.InterfaceC32622Oooo0O0;
import oO0O0Oo0.C32692Oooo0o0;
import oO0O0o0O.C32721OooO0o;
import oO0OoO.C33227OooO00o;
import oO0OoO.C33230OooO0Oo;
import oO0OoO.C33231OooO0o0;
import oO0Ooo0.C33361OooO0Oo;
import oO0Ooo0.InterfaceC33357OooO;
import oO0OooO0.C33477OooO0OO;
import oO0OooO0.C33479OooO0o;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34438OooOoo0;

/* JADX INFO: renamed from: oO0OoO0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC33233OooO0O0 implements InterfaceC32622Oooo0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C33361OooO0Oo f120242OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C32721OooO0o f120243OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C32692Oooo0o0 f120244OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public C33239OooOO0o f120245OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final InterfaceC33357OooO<C33477OooO0OO, InterfaceC32620Oooo00O> f120246OooO0o0;

    public AbstractC33233OooO0O0(C33361OooO0Oo c33361OooO0Oo, C32721OooO0o c32721OooO0o, C32692Oooo0o0 c32692Oooo0o0) {
        this.f120242OooO00o = c33361OooO0Oo;
        this.f120243OooO0O0 = c32721OooO0o;
        this.f120244OooO0OO = c32692Oooo0o0;
        this.f120246OooO0o0 = c33361OooO0Oo.OooO0o0(new C33232OooO00o(this));
    }

    @Override // oO0O0OO.InterfaceC32622Oooo0O0
    public final void OooO00o(C33477OooO0OO fqName, ArrayList arrayList) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(fqName, "fqName");
        Oooo0.OooOo00.OooOO0(arrayList, this.f120246OooO0o0.invoke(fqName));
    }

    @Override // oO0O0OO.InterfaceC32621Oooo00o
    public final List<InterfaceC32620Oooo00O> OooO0O0(C33477OooO0OO fqName) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(fqName, "fqName");
        return C34429OooOOo0.OooOOO0(this.f120246OooO0o0.invoke(fqName));
    }

    @Override // oO0O0OO.InterfaceC32622Oooo0O0
    public final boolean OooO0OO(C33477OooO0OO fqName) throws IOException {
        InputStream inputStreamOooO00o;
        oO0O0OO.OooOOO oooOOOOooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(fqName, "fqName");
        InterfaceC33357OooO<C33477OooO0OO, InterfaceC32620Oooo00O> interfaceC33357OooO = this.f120246OooO0o0;
        Object obj = ((C33361OooO0Oo.OooOO0) interfaceC33357OooO).f120653OooOo.get(fqName);
        if (obj == null || obj == C33361OooO0Oo.EnumC33365OooOO0o.f120656OooOo) {
            C32531OooOo0O c32531OooOo0O = (C32531OooOo0O) this;
            C32721OooO0o c32721OooO0o = c32531OooOo0O.f120243OooO0O0;
            if (fqName.OooO0oo(oO0O0O0o.OooOOO.f117142OooOO0)) {
                C33227OooO00o.f120239OooOOO0.getClass();
                String strOooO00o = C33227OooO00o.OooO00o(fqName);
                c32721OooO0o.f117647OooO0O0.getClass();
                inputStreamOooO00o = C33231OooO0o0.OooO00o(strOooO00o);
            } else {
                inputStreamOooO00o = null;
            }
            oooOOOOooO00o = inputStreamOooO00o != null ? C33230OooO0Oo.OooO00o.OooO00o(fqName, c32531OooOo0O.f120242OooO00o, c32531OooOo0O.f120244OooO0OO, inputStreamOooO00o) : null;
        } else {
            oooOOOOooO00o = (InterfaceC32620Oooo00O) interfaceC33357OooO.invoke(fqName);
        }
        return oooOOOOooO00o == null;
    }

    @Override // oO0O0OO.InterfaceC32621Oooo00o
    public final Collection<C33477OooO0OO> OooOOOo(C33477OooO0OO fqName, InterfaceC32507OooOO0o<? super C33479OooO0o, Boolean> nameFilter) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(fqName, "fqName");
        kotlin.jvm.internal.OooOOO0.OooO0oO(nameFilter, "nameFilter");
        return C34438OooOoo0.f123458OooOo0o;
    }
}
