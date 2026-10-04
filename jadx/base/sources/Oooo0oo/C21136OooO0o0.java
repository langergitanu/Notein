package Oooo0oo;

import Oooo0oO.EnumC21071Ooooo0o;
import Oooo0oO.InterfaceC21055Oooo0OO;
import Oooo0oO.InterfaceC21090o0000Ooo;
import Oooo0oO.o00000OO;
import Oooo0oO.o00Oo0;
import java.util.Collection;
import oO00ooO.C32443OooOOO;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: Oooo0oo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21136OooO0o0 implements InterfaceC21090o0000Ooo {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ o00Oo0 f61319OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC21055Oooo0OO f61320OooOo0o;

    public C21136OooO0o0(InterfaceC21055Oooo0OO interfaceC21055Oooo0OO, o00Oo0 o00oo02) {
        this.f61320OooOo0o = interfaceC21055Oooo0OO;
        this.f61319OooOo = o00oo02;
    }

    @Override // Oooo0oO.InterfaceC21090o0000Ooo
    public final void OooO() {
    }

    @Override // Oooo0oO.InterfaceC21090o0000Ooo
    public final void OooO00o(Object obj) {
    }

    @Override // Oooo0oO.InterfaceC21090o0000Ooo
    public final EnumC21071Ooooo0o OooO0oo(o00000OO o00000oo2, Object obj) {
        EnumC21071Ooooo0o enumC21071Ooooo0oOooO0oo;
        InterfaceC21055Oooo0OO interfaceC21055Oooo0OO = this.f61320OooOo0o;
        InterfaceC21090o0000Ooo interfaceC21090o0000Ooo = interfaceC21055Oooo0OO instanceof InterfaceC21090o0000Ooo ? (InterfaceC21090o0000Ooo) interfaceC21055Oooo0OO : null;
        EnumC21071Ooooo0o enumC21071Ooooo0o = EnumC21071Ooooo0o.f61030OooOo0o;
        if (interfaceC21090o0000Ooo == null || (enumC21071Ooooo0oOooO0oo = interfaceC21090o0000Ooo.OooO0oo(o00000oo2, obj)) == null) {
            enumC21071Ooooo0oOooO0oo = enumC21071Ooooo0o;
        }
        if (enumC21071Ooooo0oOooO0oo != enumC21071Ooooo0o) {
            return enumC21071Ooooo0oOooO0oo;
        }
        o00Oo0 o00oo02 = this.f61319OooOo;
        o00oo02.f61253OooO0o = OooOo.OooooOo((Collection) o00oo02.f61253OooO0o, new C32443OooOOO(o00000oo2, obj));
        return EnumC21071Ooooo0o.f61029OooOo;
    }
}
