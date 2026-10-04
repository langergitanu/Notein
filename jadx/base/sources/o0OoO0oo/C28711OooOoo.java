package o0OoO0oo;

import androidx.biometric.C21590OooO0o0;
import com.orion.notein.p607ui.noteeditor.LockNoteFragment;
import oO00ooO.C32460OooOooO;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OoO0oo.OooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28711OooOoo extends C21590OooO0o0.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ LockNoteFragment f101724OooO00o;

    public C28711OooOoo(LockNoteFragment lockNoteFragment) {
        this.f101724OooO00o = lockNoteFragment;
    }

    @Override // androidx.biometric.C21590OooO0o0.OooO00o
    public final void OooO00o(int i, CharSequence errString) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(errString, "errString");
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        StringBuilder sbOooO00o = com.aspose.slides.internal.p332p7.OooOOOO.OooO00o(c20358OooO00o, "LockNoteFragment", "onAuthenticationError: ", i, ", ");
        sbOooO00o.append((Object) errString);
        c20358OooO00o.OooO0OO(sbOooO00o.toString(), new Object[0]);
        oO0O000o.OooO00o<C32460OooOooO> oooO00o = this.f101724OooO00o.f72801Oooo00O;
        if (oooO00o != null) {
            oooO00o.invoke();
        }
    }

    @Override // androidx.biometric.C21590OooO0o0.OooO00o
    public final void OooO0O0() {
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("LockNoteFragment");
        c20358OooO00o.OooO0o0("onAuthenticationFailed", new Object[0]);
        oO0O000o.OooO00o<C32460OooOooO> oooO00o = this.f101724OooO00o.f72801Oooo00O;
        if (oooO00o != null) {
            oooO00o.invoke();
        }
    }

    @Override // androidx.biometric.C21590OooO0o0.OooO00o
    public final void OooO0OO(C21590OooO0o0.OooO0O0 result) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(result, "result");
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("LockNoteFragment");
        c20358OooO00o.OooO0o0("onAuthenticationSucceeded", new Object[0]);
        C28709OooOoO0 c28709OooOoO0 = this.f101724OooO00o.f72800Oooo000;
        if (c28709OooOoO0 != null) {
            c28709OooOoO0.invoke();
        }
    }
}
