package o0Oo0Oo;

import android.content.Intent;
import androidx.core.os.BundleKt;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.fragment.app.FragmentManager;
import com.orion.notein.LoginActivity;
import com.orion.notein.p607ui.login.entry.LoginDialogFragment;
import kotlin.jvm.internal.OooOOO0;
import o0oo000O.OooOO0O;
import oO00ooO.C32443OooOOO;

/* JADX INFO: renamed from: o0Oo0Oo.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28085OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f99548OooO00o = 0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ int f99549OooO0O0 = 0;

    public static void OooO00o(ActivityC21897OooOo0 activityC21897OooOo0, boolean z) {
        if (!OooOO0O.OooO0OO(activityC21897OooOo0)) {
            Intent intent = new Intent(activityC21897OooOo0, (Class<?>) LoginActivity.class);
            intent.putExtra("show_forbidden_tip", z);
            activityC21897OooOo0.startActivity(intent);
            return;
        }
        FragmentManager supportFragmentManager = activityC21897OooOo0.getSupportFragmentManager();
        OooOOO0.OooO0o(supportFragmentManager, "getSupportFragmentManager(...)");
        if (supportFragmentManager.OooOooo("LoginDialogFragment") == null) {
            LoginDialogFragment loginDialogFragment = new LoginDialogFragment();
            loginDialogFragment.setArguments(BundleKt.bundleOf(new C32443OooOOO("show_forbidden_tip", Boolean.valueOf(z))));
            loginDialogFragment.show(supportFragmentManager, "LoginDialogFragment");
        }
    }
}
