package o0OoO0oo;

import Oooo0oO.C21030OooOO0o;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.fragment.app.Fragment;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.login.verificationcode.PhoneVerificationRequestFragment;
import com.orion.notein.p607ui.noteeditor.LockNoteFragment;
import o000o0O0.C24564OooO00o;
import o0Oo00o.C28026OooO0OO;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: o0OoO0oo.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C28706OooOo0O implements oO0O000o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Fragment f101706OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f101707OooOo0o;

    public /* synthetic */ C28706OooOo0O(Fragment fragment, int i) {
        this.f101707OooOo0o = i;
        this.f101706OooOo = fragment;
    }

    @Override // oO0O000o.OooO00o
    public final Object invoke() {
        switch (this.f101707OooOo0o) {
            case 0:
                ActivityC21897OooOo0 activityC21897OooOo0RequireActivity = ((LockNoteFragment) this.f101706OooOo).requireActivity();
                kotlin.jvm.internal.OooOOO0.OooO0o(activityC21897OooOo0RequireActivity, "requireActivity(...)");
                return activityC21897OooOo0RequireActivity;
            default:
                PhoneVerificationRequestFragment phoneVerificationRequestFragment = (PhoneVerificationRequestFragment) this.f101706OooOo;
                phoneVerificationRequestFragment.OooOooo().OooO();
                C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(phoneVerificationRequestFragment), new C24564OooO00o(R.id.f57974x592b476b));
                return C32460OooOooO.f116667OooO00o;
        }
    }
}
