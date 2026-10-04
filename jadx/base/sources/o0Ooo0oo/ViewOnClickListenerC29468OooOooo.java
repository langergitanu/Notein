package o0Ooo0oo;

import Oooo0oO.C21030OooOO0o;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.penbar.PenBarChildFragment;
import com.orion.notein.p607ui.noteeditor.toolbox.PenBox;
import com.orion.notein.p607ui.noteeditor.toolbox.VectorVO;
import com.orion.notein.p607ui.notelist.favorite.FavoriteContainerFragment;
import com.orion.notein.p607ui.settings.GlobalSettingsFragment;
import com.orion.notein.p607ui.stickers.AddToStickerCollectionDialogFragment;
import o000o0O0.C24564OooO00o;
import o0Oo00o.C28026OooO0OO;
import o0oOOooO.C30880OooO00o;
import o0oOOooO.C30881OooO0O0;
import o0oOOooO.C30898OooOo00;
import o0oOoOo.C31077OoooOOo;

/* JADX INFO: renamed from: o0Ooo0oo.OooOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC29468OooOooo implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Fragment f104543OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f104544OooOo0o;

    public /* synthetic */ ViewOnClickListenerC29468OooOooo(Fragment fragment, int i) {
        this.f104544OooOo0o = i;
        this.f104543OooOo = fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Fragment fragment = this.f104543OooOo;
        switch (this.f104544OooOo0o) {
            case 0:
                int i = PenBarChildFragment.f75240o0000OOo;
                Object tag = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.noteeditor.toolbox.VectorVO");
                ((PenBox.InterfaceC23609OooOO0o) ((PenBarChildFragment) fragment).f75286o00000OO.getValue()).OooO0O0(String.valueOf(((VectorVO) tag).getType()));
                return;
            case 1:
                FavoriteContainerFragment favoriteContainerFragment = (FavoriteContainerFragment) fragment;
                com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo0 = favoriteContainerFragment.OooOoo0();
                if (favoriteContainerFragment.f77480Oooo0o0 != null) {
                    oooO0OOOooOoo0.Oooo0(!r0.isActivated());
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnListLayout");
                    throw null;
                }
            case 2:
                C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO((GlobalSettingsFragment) fragment), new C24564OooO00o(R.id.action_globalSettingsFragment_to_globalStylusShortcutFragment));
                return;
            default:
                Object tag2 = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag2, "null cannot be cast to non-null type com.orion.notein.ui.vo.StickerCollectionVO");
                C31077OoooOOo c31077OoooOOo = (C31077OoooOOo) tag2;
                AddToStickerCollectionDialogFragment addToStickerCollectionDialogFragment = (AddToStickerCollectionDialogFragment) fragment;
                if (!c31077OoooOOo.f110910OooO0o) {
                    ((C30898OooOo00) addToStickerCollectionDialogFragment.f79401OooOooo.getValue()).OooO0o0(c31077OoooOOo.f110906OooO00o);
                    return;
                } else {
                    C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(addToStickerCollectionDialogFragment), new C30881OooO0O0(((C30880OooO00o) addToStickerCollectionDialogFragment.f79400OooOooO.getValue()).f110362OooO00o));
                    return;
                }
        }
    }
}
