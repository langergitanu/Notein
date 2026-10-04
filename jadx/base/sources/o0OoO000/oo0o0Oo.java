package o0OoO000;

import Oooo0oO.C21030OooOO0o;
import android.view.View;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.login.firebase.FirebaseUserLoginFragment;
import com.orion.notein.p607ui.notelist.favorite.FavoriteListFragment;
import com.orion.notein.p607ui.p609vo.NoteVO;
import com.orion.notein.p607ui.settings.GlobalSettingsFragment;
import com.orion.notein.p607ui.stickers.creation.StickerCollectionCreationFragment;
import o0Oo00o.C28026OooO0OO;
import o0Oo0oO0.ViewOnClickListenerC28291OooO0OO;
import o0OoOoo0.C29226OooO00o;
import o0OoOoo0.ViewOnClickListenerC29233OooO0oo;
import o0Ooo0oo.C29554o00Oo0;
import o0o00Ooo.OooOO0;
import o0o00o0.C29935OooO0o0;
import o0o00oO0.C29990OooO0oO;
import o0o00oOo.C30082o00000Oo;
import o0o00ooo.C30161OooOo;
import o0o0Oo0O.C30618OooOO0;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class oo0o0Oo implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f101370OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f101371OooOo0o;

    public /* synthetic */ oo0o0Oo(Object obj, int i) {
        this.f101371OooOo0o = i;
        this.f101370OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        OooOO0.OooO00o oooO00o;
        Object obj = this.f101370OooOo;
        switch (this.f101371OooOo0o) {
            case 0:
                C21030OooOO0o.OooO0OO((FirebaseUserLoginFragment) obj).OooOOo(R.id.firebaseUserAuthFragment, false);
                return;
            case 1:
                ViewOnClickListenerC29233OooO0oo viewOnClickListenerC29233OooO0oo = ((C29226OooO00o) obj).f103627OooO0O0;
                if (viewOnClickListenerC29233OooO0oo != null) {
                    viewOnClickListenerC29233OooO0oo.onClick(view);
                    return;
                }
                return;
            case 2:
                ViewOnClickListenerC28291OooO0OO viewOnClickListenerC28291OooO0OO = ((C29554o00Oo0) obj).f104839OooO0O0;
                if (viewOnClickListenerC28291OooO0OO != null) {
                    viewOnClickListenerC28291OooO0OO.onClick(view);
                    return;
                }
                return;
            case 3:
                C29935OooO0o0 c29935OooO0o0 = ((C29990OooO0oO) obj).f106537Oooo0o;
                if (c29935OooO0o0 == null || (oooO00o = c29935OooO0o0.f106280OooO0OO) == null) {
                    return;
                }
                oooO00o.OooO00o();
                return;
            case 4:
                Object tag = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.NoteVO");
                NoteVO noteVO = (NoteVO) tag;
                FavoriteListFragment favoriteListFragment = (FavoriteListFragment) obj;
                C30082o00000Oo c30082o00000Oo = favoriteListFragment.f77530Oooo0OO;
                if (c30082o00000Oo == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("notePlaceholderItemMoreMenu");
                    throw null;
                }
                c30082o00000Oo.OooO00o();
                if (view.getId() == R.id.item_delete) {
                    InterfaceC21987OooOoo viewLifecycleOwner = favoriteListFragment.getViewLifecycleOwner();
                    kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    androidx.lifecycle.OooOo oooOoOooO00o = C21989OooOooO.OooO00o(viewLifecycleOwner);
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    C33609OooO0oo.OooO0OO(oooOoOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C30161OooOo(favoriteListFragment, noteVO, null), 2);
                    return;
                }
                return;
            case 5:
                C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO((GlobalSettingsFragment) obj), new C30618OooOO0(0));
                return;
            default:
                StickerCollectionCreationFragment stickerCollectionCreationFragment = (StickerCollectionCreationFragment) obj;
                InterfaceC21987OooOoo viewLifecycleOwner2 = stickerCollectionCreationFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner2), null, null, new StickerCollectionCreationFragment.OooO00o(stickerCollectionCreationFragment, null), 3);
                return;
        }
    }
}
