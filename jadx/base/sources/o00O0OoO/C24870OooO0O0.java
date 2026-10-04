package o00O0OoO;

import o000oo0.AbstractC24658OooO0Oo;
import o000oooO.InterfaceC24759OooO0o;

/* JADX INFO: renamed from: o00O0OoO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24870OooO0O0 extends AbstractC24658OooO0Oo<C24869OooO00o> {
    @Override // Oooo0oO.AbstractC21020OooO00o
    public final String OooOO0() {
        return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
    }

    @Override // o000oo0.AbstractC24658OooO0Oo
    public final void OooOOO0(InterfaceC24759OooO0o interfaceC24759OooO0o, C24869OooO00o c24869OooO00o) {
        C24869OooO00o c24869OooO00o2 = c24869OooO00o;
        String str = c24869OooO00o2.f84434OooO00o;
        if (str == null) {
            interfaceC24759OooO0o.OooO0oO(1);
        } else {
            interfaceC24759OooO0o.OoooOO0(1, str);
        }
        String str2 = c24869OooO00o2.f84435OooO0O0;
        if (str2 == null) {
            interfaceC24759OooO0o.OooO0oO(2);
        } else {
            interfaceC24759OooO0o.OoooOO0(2, str2);
        }
    }
}
