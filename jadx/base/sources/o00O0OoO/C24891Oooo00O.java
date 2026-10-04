package o00O0OoO;

import o000oo0.AbstractC24658OooO0Oo;
import o000oooO.InterfaceC24759OooO0o;

/* JADX INFO: renamed from: o00O0OoO.Oooo00O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24891Oooo00O extends AbstractC24658OooO0Oo<Oooo000> {
    @Override // Oooo0oO.AbstractC21020OooO00o
    public final String OooOO0() {
        return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
    }

    @Override // o000oo0.AbstractC24658OooO0Oo
    public final void OooOOO0(InterfaceC24759OooO0o interfaceC24759OooO0o, Oooo000 oooo000) {
        Oooo000 oooo0002 = oooo000;
        String str = oooo0002.f84493OooO00o;
        if (str == null) {
            interfaceC24759OooO0o.OooO0oO(1);
        } else {
            interfaceC24759OooO0o.OoooOO0(1, str);
        }
        String str2 = oooo0002.f84494OooO0O0;
        if (str2 == null) {
            interfaceC24759OooO0o.OooO0oO(2);
        } else {
            interfaceC24759OooO0o.OoooOO0(2, str2);
        }
    }
}
