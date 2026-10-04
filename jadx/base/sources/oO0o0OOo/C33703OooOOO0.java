package oO0o0OOo;

import oO0o0OOo.InterfaceC33699OooOO0;

/* JADX INFO: renamed from: oO0o0OOo.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33703OooOOO0 {
    public static C33695OooO0o0 OooO00o(int i, int i2, EnumC33692OooO0OO enumC33692OooO0OO) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            enumC33692OooO0OO = EnumC33692OooO0OO.f121452OooOo0o;
        }
        if (i == -2) {
            if (enumC33692OooO0OO != EnumC33692OooO0OO.f121452OooOo0o) {
                return new C33708OooOOoo(1, enumC33692OooO0OO);
            }
            InterfaceC33699OooOO0.f121479OooO0OO.getClass();
            return new C33695OooO0o0(InterfaceC33699OooOO0.OooO00o.f121481OooO0O0);
        }
        if (i != -1) {
            return i != 0 ? i != Integer.MAX_VALUE ? enumC33692OooO0OO == EnumC33692OooO0OO.f121452OooOo0o ? new C33695OooO0o0(i) : new C33708OooOOoo(i, enumC33692OooO0OO) : new C33695OooO0o0(Integer.MAX_VALUE) : enumC33692OooO0OO == EnumC33692OooO0OO.f121452OooOo0o ? new C33695OooO0o0(0) : new C33708OooOOoo(1, enumC33692OooO0OO);
        }
        if (enumC33692OooO0OO == EnumC33692OooO0OO.f121452OooOo0o) {
            return new C33708OooOOoo(1, EnumC33692OooO0OO.f121451OooOo);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
    }
}
