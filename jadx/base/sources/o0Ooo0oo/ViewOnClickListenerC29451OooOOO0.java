package o0Ooo0oo;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.orion.notein.p607ui.noteeditor.penbar.PenBarChildFragment;
import com.orion.notein.p607ui.noteeditor.toolbox.PenBox;
import com.orion.notein.p607ui.notelist.about.UserAboutDialogFragment;
import o0oOoOoO.C31097OooO0Oo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;

/* JADX INFO: renamed from: o0Ooo0oo.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC29451OooOOO0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Fragment f104511OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f104512OooOo0o;

    public /* synthetic */ ViewOnClickListenerC29451OooOOO0(Fragment fragment, int i) {
        this.f104512OooOo0o = i;
        this.f104511OooOo = fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Fragment fragment = this.f104511OooOo;
        switch (this.f104512OooOo0o) {
            case 0:
                int i = PenBarChildFragment.f75240o0000OOo;
                PenBox.OooOOO oooOOOOooo0 = ((PenBarChildFragment) fragment).Oooo0();
                if (oooOOOOooo0 != null) {
                    oooOOOOooo0.OooO0OO();
                }
                break;
            default:
                UserAboutDialogFragment userAboutDialogFragment = (UserAboutDialogFragment) fragment;
                Context contextRequireContext = userAboutDialogFragment.requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                C33609OooO0oo.OooO0OO(C33633Oooo0.OooO0O0(), null, null, new C31097OooO0Oo(contextRequireContext, null), 3);
                userAboutDialogFragment.dismissAllowingStateLoss();
                break;
        }
    }
}
