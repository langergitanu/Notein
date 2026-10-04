package o0Ooo0oo;

import Oooo0oO.C21030OooOO0o;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.penbar.PenBarChildFragment;
import com.orion.notein.p607ui.notelist.favorite.FavoriteContainerFragment;
import com.orion.notein.p607ui.p609vo.SortKeyVO;
import com.orion.notein.p607ui.settings.GlobalSettingsFragment;
import com.orion.notein.p607ui.stickers.AddToStickerCollectionDialogFragment;
import com.orion.notein.ui.stickers.AddToStickerCollectionDialogFragment.OooO00o;
import com.orion.penkit.tools.DrawToolFactory;
import o000o0O0.C24564OooO00o;
import o0Oo00o.C28026OooO0OO;
import o0o0O0o.C30294OooO0OO;
import oO0o0OO.C33609OooO0oo;

/* JADX INFO: renamed from: o0Ooo0oo.OooOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC29467OooOooO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Fragment f104541OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f104542OooOo0o;

    public /* synthetic */ ViewOnClickListenerC29467OooOooO(Fragment fragment, int i) {
        this.f104542OooOo0o = i;
        this.f104541OooOo = fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Fragment fragment = this.f104541OooOo;
        switch (this.f104542OooOo0o) {
            case 0:
                int i = PenBarChildFragment.f75240o0000OOo;
                ((PenBarChildFragment) fragment).Oooo0oO().OooOO0O(DrawToolFactory.ERASER_TYPE_LASSO);
                return;
            case 1:
                FavoriteContainerFragment favoriteContainerFragment = (FavoriteContainerFragment) fragment;
                C30294OooO0OO c30294OooO0OO = favoriteContainerFragment.f77478Oooo0OO;
                if (c30294OooO0OO == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("sortPopupWindow");
                    throw null;
                }
                c30294OooO0OO.OooO00o();
                Object tag = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.SortKeyVO");
                favoriteContainerFragment.OooOoo0().OooOooo(((SortKeyVO) tag).getKey());
                return;
            case 2:
                C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO((GlobalSettingsFragment) fragment), new C24564OooO00o(R.id.action_globalSettingsFragment_to_cloudBackupFragment));
                return;
            default:
                AddToStickerCollectionDialogFragment addToStickerCollectionDialogFragment = (AddToStickerCollectionDialogFragment) fragment;
                InterfaceC21987OooOoo viewLifecycleOwner = addToStickerCollectionDialogFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, addToStickerCollectionDialogFragment.new OooO00o(null), 3);
                return;
        }
    }
}
