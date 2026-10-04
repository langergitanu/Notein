package o00O0OoO;

import o000oo0.AbstractC24658OooO0Oo;
import o000oooO.InterfaceC24759OooO0o;

/* JADX INFO: renamed from: o00O0OoO.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24876OooOO0o extends AbstractC24658OooO0Oo<OooOO0O> {
    @Override // Oooo0oO.AbstractC21020OooO00o
    public final String OooOO0() {
        return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
    }

    @Override // o000oo0.AbstractC24658OooO0Oo
    public final void OooOOO0(InterfaceC24759OooO0o interfaceC24759OooO0o, OooOO0O oooOO0O) {
        OooOO0O oooOO0O2 = oooOO0O;
        String str = oooOO0O2.f84447OooO00o;
        if (str == null) {
            interfaceC24759OooO0o.OooO0oO(1);
        } else {
            interfaceC24759OooO0o.OoooOO0(1, str);
        }
        String str2 = oooOO0O2.f84448OooO0O0;
        if (str2 == null) {
            interfaceC24759OooO0o.OooO0oO(2);
        } else {
            interfaceC24759OooO0o.OoooOO0(2, str2);
        }
    }
}
