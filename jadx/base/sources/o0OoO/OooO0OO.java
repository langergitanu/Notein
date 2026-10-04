package o0OoO;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.View;
import com.google.firebase.auth.FirebaseUser;
import com.huawei.hms.support.feature.result.CommonConstant;
import com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment;
import com.orion.notein.p607ui.user.firebase.FirebaseUserSettingsFragment;
import java.util.Set;
import o000O00O.C24397OooOo0;
import o0OoO0oo.C28720Oooo0O0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34438OooOoo0;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class OooO0OO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f101026OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f101027OooOo0o;

    public /* synthetic */ OooO0OO(Object obj, int i) {
        this.f101027OooOo0o = i;
        this.f101026OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f101027OooOo0o) {
            case 0:
                BaseToolbarChildFragment baseToolbarChildFragment = ((OooO0o) this.f101026OooOo).f101031OooO00o.f105794OooO00o;
                Set set = (Set) baseToolbarChildFragment.Oooo0o0().f101690OooO.getValue();
                if (!set.isEmpty()) {
                    baseToolbarChildFragment.OoooOo0(C34438OooOoo0.f123458OooOo0o);
                    baseToolbarChildFragment.OooooOO(25, OooOo.o0ooOO0(set));
                }
                break;
            case 1:
                C24397OooOo0 c24397OooOo0 = ((C28720Oooo0O0) this.f101026OooOo).f101752OooOo;
                if (c24397OooOo0 != null) {
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(view);
                    c24397OooOo0.OooO00o(view);
                }
                break;
            default:
                FirebaseUserSettingsFragment firebaseUserSettingsFragment = (FirebaseUserSettingsFragment) this.f101026OooOo;
                FirebaseUser currentUser = firebaseUserSettingsFragment.f79749Oooo0oo.getCurrentUser();
                if (currentUser != null) {
                    Context context = firebaseUserSettingsFragment.getContext();
                    Object systemService = context != null ? context.getSystemService("clipboard") : null;
                    kotlin.jvm.internal.OooOOO0.OooO0o0(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                    ((ClipboardManager) systemService).setPrimaryClip(new ClipData(new ClipDescription(CommonConstant.KEY_UID, new String[]{"text/plain"}), new ClipData.Item(currentUser.getUid())));
                } else {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooOOO0("FirebaseUserSettingsFragment");
                    c20358OooO00o.OooO0OO("firebase user is null!", new Object[0]);
                }
                break;
        }
    }
}
