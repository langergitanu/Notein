package oO0o0Oo;

import oO0o0OOo.EnumC33692OooO0OO;
import oO0o0OOo.InterfaceC33699OooOO0;
import oO0o0OoO.AbstractC33796OooO0oO;

/* JADX INFO: renamed from: oO0o0Oo.Oooo0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C33757Oooo0oo {
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> C33785o0OoOo0<T> OooO00o(InterfaceC33721OooO0o<? extends T> interfaceC33721OooO0o, int i) {
        AbstractC33796OooO0oO abstractC33796OooO0oO;
        InterfaceC33721OooO0o<T> interfaceC33721OooO0oOooO0oO;
        InterfaceC33699OooOO0.f121479OooO0OO.getClass();
        int i2 = InterfaceC33699OooOO0.OooO00o.f121481OooO0O0;
        if (i >= i2) {
            i2 = i;
        }
        int i3 = i2 - i;
        if (!(interfaceC33721OooO0o instanceof AbstractC33796OooO0oO) || (interfaceC33721OooO0oOooO0oO = (abstractC33796OooO0oO = (AbstractC33796OooO0oO) interfaceC33721OooO0o).OooO0oO()) == null) {
            return new C33785o0OoOo0<>(i3, EnumC33692OooO0OO.f121452OooOo0o, interfaceC33721OooO0o, oOo0000O.OooO.f123416OooOo0o);
        }
        EnumC33692OooO0OO enumC33692OooO0OO = abstractC33796OooO0oO.f121836OooOoO0;
        int i4 = abstractC33796OooO0oO.f121834OooOo;
        if (i4 != -3 && i4 != -2 && i4 != 0) {
            i3 = i4;
        } else if (enumC33692OooO0OO == EnumC33692OooO0OO.f121452OooOo0o) {
            if (i4 == 0) {
                i3 = 0;
            }
        } else if (i == 0) {
            i3 = 1;
        }
        return new C33785o0OoOo0<>(i3, enumC33692OooO0OO, interfaceC33721OooO0oOooO0oO, abstractC33796OooO0oO.f121835OooOo0o);
    }
}
