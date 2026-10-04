package o00O0OoO;

import o000oo0.AbstractC24658OooO0Oo;
import o000oooO.InterfaceC24759OooO0o;

/* JADX INFO: renamed from: o00O0OoO.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24875OooO0oo extends AbstractC24658OooO0Oo<C24874OooO0oO> {
    @Override // Oooo0oO.AbstractC21020OooO00o
    public final String OooOO0() {
        return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
    }

    @Override // o000oo0.AbstractC24658OooO0Oo
    public final void OooOOO0(InterfaceC24759OooO0o interfaceC24759OooO0o, C24874OooO0oO c24874OooO0oO) {
        String str = c24874OooO0oO.f84442OooO00o;
        if (str == null) {
            interfaceC24759OooO0o.OooO0oO(1);
        } else {
            interfaceC24759OooO0o.OoooOO0(1, str);
        }
        interfaceC24759OooO0o.OooO0o(2, r4.f84443OooO0O0);
    }
}
