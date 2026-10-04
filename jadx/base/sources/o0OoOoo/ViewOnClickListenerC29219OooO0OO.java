package o0OoOoo;

import Oooo0oO.C21030OooOO0o;
import android.view.View;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.hyperlinkeditor.HyperLinkEditorPanel;
import com.orion.notein.p607ui.noteeditor.penbar.PenBarChildFragment;
import com.orion.notein.p607ui.notelist.favorite.FavoriteContainerFragment;
import com.orion.notein.p607ui.settings.GlobalSettingsFragment;
import com.orion.notein.p607ui.stickers.AddToStickerCollectionDialogFragment;
import com.orion.penkit.tools.DrawToolFactory;
import kotlin.jvm.internal.OooOOO0;
import o000o0O0.C24564OooO00o;
import o0Oo00o.C28026OooO0OO;
import o0o0O0o.C30294OooO0OO;

/* JADX INFO: renamed from: o0OoOoo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC29219OooO0OO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f103610OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f103611OooOo0o;

    public /* synthetic */ ViewOnClickListenerC29219OooO0OO(Object obj, int i) {
        this.f103611OooOo0o = i;
        this.f103610OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f103610OooOo;
        switch (this.f103611OooOo0o) {
            case 0:
                View view2 = ((HyperLinkEditorPanel) obj).f74501OooOooo;
                if (view2 != null) {
                    view2.setActivated(!view2.isActivated());
                    return;
                } else {
                    OooOOO0.OooOOOO("checkBoxNoLongerDisplayed");
                    throw null;
                }
            case 1:
                int i = PenBarChildFragment.f75240o0000OOo;
                ((PenBarChildFragment) obj).Oooo0oO().OooOO0O(DrawToolFactory.ERASER_TYPE_STROKE);
                return;
            case 2:
                C30294OooO0OO c30294OooO0OO = ((FavoriteContainerFragment) obj).f77478Oooo0OO;
                if (c30294OooO0OO == null) {
                    OooOOO0.OooOOOO("sortPopupWindow");
                    throw null;
                }
                OooOOO0.OooO0Oo(view);
                C30294OooO0OO.OooO0O0(c30294OooO0OO, view, 0, 6);
                return;
            case 3:
                GlobalSettingsFragment globalSettingsFragment = (GlobalSettingsFragment) obj;
                if (globalSettingsFragment.f78858Oooo0 == 4) {
                    globalSettingsFragment.f78858Oooo0 = 0;
                    C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(globalSettingsFragment), new C24564OooO00o(R.id.action_globalSettingFragment_to_debugFragment));
                    return;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - globalSettingsFragment.f78862Oooo0O0 < 1500) {
                    globalSettingsFragment.f78862Oooo0O0 = jCurrentTimeMillis;
                    globalSettingsFragment.f78858Oooo0++;
                    return;
                } else {
                    globalSettingsFragment.f78858Oooo0 = 1;
                    globalSettingsFragment.f78862Oooo0O0 = jCurrentTimeMillis;
                    return;
                }
            default:
                C21030OooOO0o.OooO0OO((AddToStickerCollectionDialogFragment) obj).OooOOo0();
                return;
        }
    }
}
