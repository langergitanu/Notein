package OooOoo0;

import Oooo0oO.InterfaceC21063OoooO0O;
import oo000o.InterfaceC34654Oooo0OO;

/* JADX INFO: renamed from: OooOoo0.OoooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20684OoooO implements InterfaceC21063OoooO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Oooo0oO.o00oO0O f59375OooO00o;

    public C20684OoooO(Oooo0oO.o00oO0O o00oo0o) {
        this.f59375OooO00o = o00oo0o;
    }

    @Override // Oooo0oO.InterfaceC21063OoooO0O
    public final void dispose() {
        Oooo0oO.o00oO0O o00oo0o = this.f59375OooO00o;
        InterfaceC34654Oooo0OO.OooO00o oooO00o = (InterfaceC34654Oooo0OO.OooO00o) o00oo0o.getValue();
        if (oooO00o != null) {
            oooO00o.release();
        }
        o00oo0o.setValue(null);
    }
}
