package o0OOOoo0;

import com.aspose.slides.C22208OooOo0;
import o000ooO0.AbstractC24732OooO00o;
import o000oooO.InterfaceC24756OooO0O0;

/* JADX INFO: loaded from: classes9.dex */
public final class OooOo extends AbstractC24732OooO00o {
    @Override // o000ooO0.AbstractC24732OooO00o
    public final void OooO00o(InterfaceC24756OooO0O0 interfaceC24756OooO0O0) {
        C22208OooOo0.OooO0O0(interfaceC24756OooO0O0, "database", "ALTER TABLE UserEntity ADD COLUMN offer_free_trial INTEGER DEFAULT(0)", "ALTER TABLE UserEntity ADD COLUMN on_free_trial INTEGER DEFAULT(0)", "ALTER TABLE UserEntity ADD COLUMN free_trial_start_time TEXT DEFAULT NULL");
        interfaceC24756OooO0O0.oo0o0Oo("ALTER TABLE UserEntity ADD COLUMN free_trial_end_time TEXT DEFAULT NULL");
    }
}
