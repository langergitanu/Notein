package o00O0OoO;

import o000oo0.AbstractC24658OooO0Oo;
import o000oooO.InterfaceC24759OooO0o;

/* JADX INFO: renamed from: o00O0OoO.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24873OooO0o0 extends AbstractC24658OooO0Oo<C24872OooO0Oo> {
    @Override // Oooo0oO.AbstractC21020OooO00o
    public final String OooOO0() {
        return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
    }

    @Override // o000oo0.AbstractC24658OooO0Oo
    public final void OooOOO0(InterfaceC24759OooO0o interfaceC24759OooO0o, C24872OooO0Oo c24872OooO0Oo) {
        C24872OooO0Oo c24872OooO0Oo2 = c24872OooO0Oo;
        String str = c24872OooO0Oo2.f84438OooO00o;
        if (str == null) {
            interfaceC24759OooO0o.OooO0oO(1);
        } else {
            interfaceC24759OooO0o.OoooOO0(1, str);
        }
        Long l = c24872OooO0Oo2.f84439OooO0O0;
        if (l == null) {
            interfaceC24759OooO0o.OooO0oO(2);
        } else {
            interfaceC24759OooO0o.OooO0o(2, l.longValue());
        }
    }
}
