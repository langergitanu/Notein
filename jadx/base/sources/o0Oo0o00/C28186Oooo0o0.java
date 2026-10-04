package o0Oo0o00;

import Oooo0.C20860Ooooooo;
import Oooo0oO.C21030OooOO0o;
import androidx.activity.result.ActivityResult;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.tasks.Task;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.datasync.CloudSyncFragment;
import com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment;
import o0Oo00o.C28026OooO0OO;
import o0OoO0oo.C28783o000O000;
import oO00ooO.C32460OooOooO;
import oO0o0OO.C33609OooO0oo;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34438OooOoo0;

/* JADX INFO: renamed from: o0Oo0o00.Oooo0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C28186Oooo0o0 implements OooO0o.OooO00o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Fragment f99879OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f99880OooOo0o;

    public /* synthetic */ C28186Oooo0o0(Fragment fragment, int i) {
        this.f99880OooOo0o = i;
        this.f99879OooOo = fragment;
    }

    @Override // OooO0o.OooO00o
    public final void OooO0O0(Object obj) {
        Fragment fragment = this.f99879OooOo;
        switch (this.f99880OooOo0o) {
            case 0:
                ActivityResult activityResult = (ActivityResult) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(activityResult, "activityResult");
                CloudSyncFragment cloudSyncFragment = (CloudSyncFragment) fragment;
                int i = activityResult.f62240OooOo0o;
                if (i != -1) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooO0o0(C20860Ooooooo.OooO0OO(c20358OooO00o, "CloudSyncFragment", "Google sign-in cancelled or failed with code ", i), new Object[0]);
                    SwitchMaterial switchMaterial = cloudSyncFragment.f71441OooOooo;
                    if (switchMaterial != null) {
                        switchMaterial.setChecked(false);
                        return;
                    } else {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("googleDriveSwitch");
                        throw null;
                    }
                }
                Task<GoogleSignInAccount> signedInAccountFromIntent = GoogleSignIn.getSignedInAccountFromIntent(activityResult.f62239OooOo);
                kotlin.jvm.internal.OooOOO0.OooO0o(signedInAccountFromIntent, "getSignedInAccountFromIntent(...)");
                if (signedInAccountFromIntent.isSuccessful()) {
                    C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(cloudSyncFragment), null, null, new C28185Oooo0o(cloudSyncFragment, null), 3);
                    return;
                }
                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                c20358OooO00o2.OooOOO0("CloudSyncFragment");
                c20358OooO00o2.OooO0OO("Google sign-in task failed", new Object[0]);
                SwitchMaterial switchMaterial2 = cloudSyncFragment.f71441OooOooo;
                if (switchMaterial2 != null) {
                    switchMaterial2.setChecked(false);
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("googleDriveSwitch");
                    throw null;
                }
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                BaseToolbarChildFragment baseToolbarChildFragment = (BaseToolbarChildFragment) fragment;
                baseToolbarChildFragment.OoooOo0(C34438OooOoo0.f123458OooOo0o);
                if (zBooleanValue) {
                    BaseToolbarChildFragment.OooO0O0 oooO0O0 = baseToolbarChildFragment.f76498OoooOOo;
                    if (oooO0O0 != null) {
                        oooO0O0.run();
                        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    }
                } else {
                    String string = baseToolbarChildFragment.getString(R.string.request_permission_title_insert_image);
                    kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                    String string2 = baseToolbarChildFragment.getString(R.string.request_permission_content_insert_image);
                    kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
                    C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(baseToolbarChildFragment), new C28783o000O000(string, string2));
                    C32460OooOooO c32460OooOooO2 = C32460OooOooO.f116667OooO00o;
                }
                baseToolbarChildFragment.f76498OoooOOo = null;
                return;
        }
    }
}
