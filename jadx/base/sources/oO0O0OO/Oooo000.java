package oO0O0OO;

import java.util.List;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O0OO.C32618OooOooo;
import oO0Ooo0.C33361OooO0Oo;
import oO0Ooo0.InterfaceC33369OooO0oo;
import oO0OooO0.C33476OooO0O0;
import oO0OooO0.C33477OooO0OO;
import oO0OooO0.C33479OooO0o;

/* JADX INFO: loaded from: classes10.dex */
public final class Oooo000 extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<C32618OooOooo.OooO00o, InterfaceC32596OooO0o0> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C32618OooOooo f117280OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo000(C32618OooOooo c32618OooOooo) {
        super(1);
        this.f117280OooOo0o = c32618OooOooo;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final InterfaceC32596OooO0o0 invoke(C32618OooOooo.OooO00o oooO00o) {
        InterfaceC32597OooO0oO interfaceC32597OooO0oOOooO00o;
        C32618OooOooo.OooO00o oooO00o2 = oooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(oooO00o2, "<name for destructuring parameter 0>");
        C33476OooO0O0 c33476OooO0O0 = oooO00o2.f117272OooO00o;
        if (c33476OooO0O0.f120969OooO0OO) {
            throw new UnsupportedOperationException("Unresolved local class: " + c33476OooO0O0);
        }
        C33476OooO0O0 c33476OooO0O0OooO0o = c33476OooO0O0.OooO0o();
        List<Integer> list = oooO00o2.f117273OooO0O0;
        C32618OooOooo c32618OooOooo = this.f117280OooOo0o;
        if (c33476OooO0O0OooO0o != null) {
            interfaceC32597OooO0oOOooO00o = c32618OooOooo.OooO00o(c33476OooO0O0OooO0o, oOo000Oo.OooOo.Oooo0O0(list));
        } else {
            InterfaceC33369OooO0oo<C33477OooO0OO, InterfaceC32620Oooo00O> interfaceC33369OooO0oo = c32618OooOooo.f117270OooO0OO;
            C33477OooO0OO c33477OooO0OOOooO0oO = c33476OooO0O0.OooO0oO();
            kotlin.jvm.internal.OooOOO0.OooO0o(c33477OooO0OOOooO0oO, "classId.packageFqName");
            interfaceC32597OooO0oOOooO00o = (InterfaceC32597OooO0oO) ((C33361OooO0Oo.OooOO0O) interfaceC33369OooO0oo).invoke(c33477OooO0OOOooO0oO);
        }
        InterfaceC32597OooO0oO interfaceC32597OooO0oO = interfaceC32597OooO0oOOooO00o;
        boolean z = !c33476OooO0O0.f120968OooO0O0.OooO0o0().OooO0Oo();
        C33361OooO0Oo c33361OooO0Oo = c32618OooOooo.f117268OooO00o;
        C33479OooO0o c33479OooO0oOooO = c33476OooO0O0.OooO();
        kotlin.jvm.internal.OooOOO0.OooO0o(c33479OooO0oOooO, "classId.shortClassName");
        Integer num = (Integer) oOo000Oo.OooOo.Oooo(list);
        return new C32618OooOooo.OooO0O0(c33361OooO0Oo, interfaceC32597OooO0oO, c33479OooO0oOooO, z, num != null ? num.intValue() : 0);
    }
}
