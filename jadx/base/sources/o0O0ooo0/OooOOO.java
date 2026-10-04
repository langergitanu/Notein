package o0O0ooo0;

import Oooo0oO.InterfaceC21033OooOOOO;
import Oooooo.AbstractC21396OooO0O0;
import com.orion.notein.global.R;
import o0O0oOoo.C26177Oooo0o;
import o0O0oOoo.EnumC26180Oooo0oo;
import o0OOO0o.C27049OooO0Oo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: loaded from: classes9.dex */
public final class OooOOO implements InterfaceC32508OooOOOo<InterfaceC21033OooOOOO, Integer, C32460OooOooO> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC32507OooOO0o<String, C32460OooOooO> f89679OooOo0o;

    /* JADX WARN: Multi-variable type inference failed */
    public OooOOO(InterfaceC32507OooOO0o<? super String, C32460OooOooO> interfaceC32507OooOO0o) {
        this.f89679OooOo0o = interfaceC32507OooOO0o;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final C32460OooOooO invoke(InterfaceC21033OooOOOO interfaceC21033OooOOOO, Integer num) throws Throwable {
        InterfaceC21033OooOOOO interfaceC21033OooOOOO2 = interfaceC21033OooOOOO;
        if ((num.intValue() & 3) == 2 && interfaceC21033OooOOOO2.OooO00o()) {
            interfaceC21033OooOOOO2.OooO0o();
        } else {
            AbstractC21396OooO0O0 abstractC21396OooO0O0OooO00o = C27049OooO0Oo.OooO00o(R.drawable.ni_symbol_cancel, interfaceC21033OooOOOO2);
            EnumC26180Oooo0oo enumC26180Oooo0oo = EnumC26180Oooo0oo.f89375OooOoO0;
            interfaceC21033OooOOOO2.OooOo00(-1215346870);
            InterfaceC32507OooOO0o<String, C32460OooOooO> interfaceC32507OooOO0o = this.f89679OooOo0o;
            boolean zOooO0oo = interfaceC21033OooOOOO2.OooO0oo(interfaceC32507OooOO0o);
            Object objOooOo0 = interfaceC21033OooOOOO2.OooOo0();
            if (zOooO0oo || objOooOo0 == InterfaceC21033OooOOOO.OooO00o.f60894OooO00o) {
                objOooOo0 = new OooOOO0(interfaceC32507OooOO0o, 0);
                interfaceC21033OooOOOO2.OooOOo0(objOooOo0);
            }
            interfaceC21033OooOOOO2.OooOoo();
            C26177Oooo0o.OooO00o(abstractC21396OooO0O0OooO00o, null, null, enumC26180Oooo0oo, false, null, null, 0.0f, (oO0O000o.OooO00o) objOooOo0, interfaceC21033OooOOOO2, 3120, 244);
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
