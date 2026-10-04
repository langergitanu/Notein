package o0OoOOo0;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.p607ui.noteeditor.penbar.PenBarChildFragment;
import com.orion.notein.p607ui.noteeditor.toolbox.favorite.FavoriteToolBox;
import com.orion.notein.p607ui.notelist.about.UserAboutDialogFragment;
import kotlin.jvm.internal.OooOOO0;
import o0O0o0oO.ViewOnClickListenerC26053OoooOoO;
import o0Ooo0oo.C29481OoooO0;
import o0oOoOoO.C31099OooO0o0;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;

/* JADX INFO: renamed from: o0OoOOo0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC29184OooO0Oo implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f103508OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f103509OooOo0o;

    public /* synthetic */ ViewOnClickListenerC29184OooO0Oo(Object obj, int i) {
        this.f103509OooOo0o = i;
        this.f103508OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f103509OooOo0o) {
            case 0:
                ViewOnClickListenerC26053OoooOoO viewOnClickListenerC26053OoooOoO = ((C29186OooO0o0) this.f103508OooOo).f103514OooO0O0;
                if (viewOnClickListenerC26053OoooOoO != null) {
                    viewOnClickListenerC26053OoooOoO.onClick(view);
                    return;
                }
                return;
            case 1:
                PenBarChildFragment penBarChildFragment = (PenBarChildFragment) this.f103508OooOo;
                InterfaceC21987OooOoo interfaceC21987OooOoo = penBarChildFragment.f75247OooOooO;
                if (interfaceC21987OooOoo != null) {
                    C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(interfaceC21987OooOoo), null, null, new C29481OoooO0(penBarChildFragment, null), 3);
                    return;
                } else {
                    OooOOO0.OooOOOO("containerViewLifecycleOwner");
                    throw null;
                }
            case 2:
                FavoriteToolBox favoriteToolBox = (FavoriteToolBox) this.f103508OooOo;
                View view2 = favoriteToolBox.f76892OooOoOO;
                if (view2 == null) {
                    OooOOO0.OooOOOO("btnBottom");
                    throw null;
                }
                if (view2.isActivated()) {
                    favoriteToolBox.OooO0OO(false);
                    return;
                }
                FavoriteToolBox.OooO0O0 oooO0O0 = favoriteToolBox.toolBoxListener;
                if (oooO0O0 != null) {
                    oooO0O0.OooO0o();
                    return;
                }
                return;
            default:
                UserAboutDialogFragment userAboutDialogFragment = (UserAboutDialogFragment) this.f103508OooOo;
                Context contextRequireContext = userAboutDialogFragment.requireContext();
                OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                C33609OooO0oo.OooO0OO(C33633Oooo0.OooO0O0(), null, null, new C31099OooO0o0(contextRequireContext, null), 3);
                userAboutDialogFragment.dismissAllowingStateLoss();
                return;
        }
    }
}
