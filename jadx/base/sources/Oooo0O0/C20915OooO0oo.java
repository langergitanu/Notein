package Oooo0O0;

import Oooo0oO.InterfaceC21033OooOOOO;
import OoooOoO.InterfaceC21233OooO0o;
import OooooOO.C21348Ooooo0o;
import o00000o0.EnumC24118OooO0oO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32510OooOOo0;

/* JADX INFO: renamed from: Oooo0O0.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20915OooO0oo extends kotlin.jvm.internal.OooOOOO implements InterfaceC32510OooOOo0<InterfaceC21233OooO0o, InterfaceC21033OooOOOO, Integer, InterfaceC21233OooO0o> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ EnumC24118OooO0oO f60339OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ boolean f60340OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ boolean f60341OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20915OooO0oo(boolean z, EnumC24118OooO0oO enumC24118OooO0oO, boolean z2) {
        super(3);
        this.f60340OooOo0o = z;
        this.f60339OooOo = enumC24118OooO0oO;
        this.f60341OooOoO0 = z2;
    }

    @Override // oO0O000o.InterfaceC32510OooOOo0
    public final InterfaceC21233OooO0o invoke(InterfaceC21233OooO0o interfaceC21233OooO0o, InterfaceC21033OooOOOO interfaceC21033OooOOOO, Integer num) {
        InterfaceC21233OooO0o interfaceC21233OooO0o2 = interfaceC21233OooO0o;
        InterfaceC21033OooOOOO interfaceC21033OooOOOO2 = interfaceC21033OooOOOO;
        OooOoo0.OooOO0.OooO0OO(num, interfaceC21233OooO0o2, "$this$composed", interfaceC21033OooOOOO2, -1538687176);
        long j = ((C20944Oooo0oo) interfaceC21033OooOOOO2.OooO0o0(C20933Oooo.f60389OooO00o)).f60433OooO00o;
        Object[] objArr = {new C21348Ooooo0o(j), Boolean.valueOf(this.f60340OooOo0o), this.f60339OooOo, Boolean.valueOf(this.f60341OooOoO0)};
        interfaceC21033OooOOOO2.OooOo00(-568225417);
        boolean zOooO0oo = false;
        for (int i = 0; i < 4; i++) {
            zOooO0oo |= interfaceC21033OooOOOO2.OooO0oo(objArr[i]);
        }
        Object objOooOo0 = interfaceC21033OooOOOO2.OooOo0();
        if (zOooO0oo || objOooOo0 == InterfaceC21033OooOOOO.OooO00o.f60894OooO00o) {
            C20914OooO0oO c20914OooO0oO = new C20914OooO0oO(j, this.f60340OooOo0o, this.f60339OooOo, this.f60341OooOoO0);
            interfaceC21033OooOOOO2.OooOOo0(c20914OooO0oO);
            objOooOo0 = c20914OooO0oO;
        }
        interfaceC21033OooOOOO2.OooOoo();
        InterfaceC21233OooO0o interfaceC21233OooO0oO00ooo = interfaceC21233OooO0o2.o00ooo(androidx.compose.p002ui.draw.OooO00o.OooO0O0((InterfaceC32507OooOO0o) objOooOo0));
        interfaceC21033OooOOOO2.OooOoo();
        return interfaceC21233OooO0oO00ooo;
    }
}
