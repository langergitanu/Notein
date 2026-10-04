package oO0o0OoO;

import oO0o0OO.AbstractC33630OooOooO;
import oO0o0OOo.EnumC33692OooO0OO;
import oO0o0Oo.InterfaceC33721OooO0o;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO0o0OoO.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public interface InterfaceC33807OooOOoo<T> extends InterfaceC33721OooO0o<T> {

    /* JADX INFO: renamed from: oO0o0OoO.OooOOoo$OooO00o */
    public static final class OooO00o {
        public static /* synthetic */ InterfaceC33721OooO0o OooO00o(InterfaceC33807OooOOoo interfaceC33807OooOOoo, AbstractC33630OooOooO abstractC33630OooOooO, int i, EnumC33692OooO0OO enumC33692OooO0OO, int i2) {
            InterfaceC34415OooO0oo interfaceC34415OooO0oo = abstractC33630OooOooO;
            if ((i2 & 1) != 0) {
                interfaceC34415OooO0oo = oOo0000O.OooO.f123416OooOo0o;
            }
            if ((i2 & 2) != 0) {
                i = -3;
            }
            if ((i2 & 4) != 0) {
                enumC33692OooO0OO = EnumC33692OooO0OO.f121452OooOo0o;
            }
            return interfaceC33807OooOOoo.OooO00o(interfaceC34415OooO0oo, i, enumC33692OooO0OO);
        }
    }

    InterfaceC33721OooO0o<T> OooO00o(InterfaceC34415OooO0oo interfaceC34415OooO0oo, int i, EnumC33692OooO0OO enumC33692OooO0OO);
}
