package o0OoO;

import Oooo0oO.C21030OooOO0o;
import android.view.View;
import androidx.lifecycle.C21989OooOooO;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment;
import com.orion.notein.p607ui.user.firebase.FirebaseUserSettingsFragment;
import o000O00O.C24397OooOo0;
import o000o0O0.C24564OooO00o;
import o0Oo00o.C28026OooO0OO;
import o0OoO0oo.C28720Oooo0O0;
import o0o000oo.C29815OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oOo000Oo.C34438OooOoo0;

/* JADX INFO: renamed from: o0OoO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28501OooO0Oo implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f101028OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f101029OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28501OooO0Oo(Object obj, int i) {
        this.f101029OooOo0o = i;
        this.f101028OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f101029OooOo0o) {
            case 0:
                BaseToolbarChildFragment baseToolbarChildFragment = ((OooO0o) this.f101028OooOo).f101031OooO00o.f105794OooO00o;
                baseToolbarChildFragment.OoooOo0(C34438OooOoo0.f123458OooOo0o);
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(baseToolbarChildFragment.Oooo0O0()), null, null, new C29815OooOOOo(baseToolbarChildFragment, null), 3);
                break;
            case 1:
                C24397OooOo0 c24397OooOo0 = ((C28720Oooo0O0) this.f101028OooOo).f101752OooOo;
                if (c24397OooOo0 != null) {
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(view);
                    c24397OooOo0.OooO00o(view);
                }
                break;
            default:
                C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO((FirebaseUserSettingsFragment) this.f101028OooOo), new C24564OooO00o(R.id.f57942x612bda6b));
                break;
        }
    }
}
