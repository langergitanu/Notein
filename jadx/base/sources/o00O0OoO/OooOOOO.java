package o00O0OoO;

import o000oo0.AbstractC24658OooO0Oo;
import o000oooO.InterfaceC24759OooO0o;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOOO extends AbstractC24658OooO0Oo<OooOOO> {
    @Override // Oooo0oO.AbstractC21020OooO00o
    public final String OooOO0() {
        return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
    }

    @Override // o000oo0.AbstractC24658OooO0Oo
    public final void OooOOO0(InterfaceC24759OooO0o interfaceC24759OooO0o, OooOOO oooOOO) throws Throwable {
        oooOOO.getClass();
        interfaceC24759OooO0o.OooO0oO(1);
        byte[] bArrOooO0OO = androidx.work.OooO0O0.OooO0OO(null);
        if (bArrOooO0OO == null) {
            interfaceC24759OooO0o.OooO0oO(2);
        } else {
            interfaceC24759OooO0o.OooooO0(2, bArrOooO0OO);
        }
    }
}
