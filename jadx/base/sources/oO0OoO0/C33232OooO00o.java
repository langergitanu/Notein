package oO0OoO0;

import java.io.IOException;
import java.io.InputStream;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O0O.C32531OooOo0O;
import oO0O0OO.InterfaceC32620Oooo00O;
import oO0O0o0O.C32721OooO0o;
import oO0OoO.C33227OooO00o;
import oO0OoO.C33230OooO0Oo;
import oO0OoO.C33231OooO0o0;
import oO0OooO0.C33477OooO0OO;

/* JADX INFO: renamed from: oO0OoO0.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33232OooO00o extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<C33477OooO0OO, InterfaceC32620Oooo00O> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ AbstractC33233OooO0O0 f120241OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33232OooO00o(AbstractC33233OooO0O0 abstractC33233OooO0O0) {
        super(1);
        this.f120241OooOo0o = abstractC33233OooO0O0;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final InterfaceC32620Oooo00O invoke(C33477OooO0OO c33477OooO0OO) throws IOException {
        InputStream inputStreamOooO00o;
        C33477OooO0OO fqName = c33477OooO0OO;
        kotlin.jvm.internal.OooOOO0.OooO0oO(fqName, "fqName");
        AbstractC33233OooO0O0 abstractC33233OooO0O0 = this.f120241OooOo0o;
        C32531OooOo0O c32531OooOo0O = (C32531OooOo0O) abstractC33233OooO0O0;
        c32531OooOo0O.getClass();
        C32721OooO0o c32721OooO0o = c32531OooOo0O.f120243OooO0O0;
        if (fqName.OooO0oo(oO0O0O0o.OooOOO.f117142OooOO0)) {
            C33227OooO00o.f120239OooOOO0.getClass();
            String strOooO00o = C33227OooO00o.OooO00o(fqName);
            c32721OooO0o.f117647OooO0O0.getClass();
            inputStreamOooO00o = C33231OooO0o0.OooO00o(strOooO00o);
        } else {
            inputStreamOooO00o = null;
        }
        C33230OooO0Oo c33230OooO0OoOooO00o = inputStreamOooO00o != null ? C33230OooO0Oo.OooO00o.OooO00o(fqName, c32531OooOo0O.f120242OooO00o, c32531OooOo0O.f120244OooO0OO, inputStreamOooO00o) : null;
        if (c33230OooO0OoOooO00o == null) {
            return null;
        }
        C33239OooOO0o c33239OooOO0o = abstractC33233OooO0O0.f120245OooO0Oo;
        if (c33239OooOO0o != null) {
            c33230OooO0OoOooO00o.o000000o(c33239OooOO0o);
            return c33230OooO0OoOooO00o;
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("components");
        throw null;
    }
}
