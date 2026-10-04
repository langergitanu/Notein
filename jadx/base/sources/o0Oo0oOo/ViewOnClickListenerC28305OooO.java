package o0Oo0oOo;

import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.ActivityC21897OooOo0;
import com.orion.notein.MainActivity;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.creative_library.CreativeLibraryDetailFragment;
import com.orion.notein.p607ui.noteeditor.ruler.SetRulerAngleDialogFragment;
import com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment;
import com.orion.notein.p607ui.noteeditor.toolbox.favorite.FavoriteToolBox;
import com.orion.notein.p607ui.notelist.about.UserAboutDialogFragment;
import com.orion.notein.p607ui.notelist.trashbin.TrashBinContainerFragment;
import com.orion.notein.p607ui.p609vo.FavoritePenVO;
import java.util.List;
import java.util.Set;
import o0OoO0.C28513OooO0oO;
import o0OoOOoO.C29192OooO0o0;
import o0oOOooO.C30897OooOOoo;
import o0oOOooO.C30898OooOo00;
import o0oOoOo.C31079OoooOoO;
import o0oOoOoO.C31098OooO0o;
import oO00ooO.C32460OooOooO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0Oo0oOo.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28305OooO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f100416OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f100417OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28305OooO(Object obj, int i) {
        this.f100417OooOo0o = i;
        this.f100416OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f100416OooOo;
        switch (this.f100417OooOo0o) {
            case 0:
                C21030OooOO0o.OooO0OO((CreativeLibraryDetailFragment) obj).OooOOOo();
                return;
            case 1:
                Object tag = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.StickerVO");
                C31079OoooOoO c31079OoooOoO = (C31079OoooOoO) tag;
                BaseToolbarChildFragment baseToolbarChildFragment = (BaseToolbarChildFragment) ((C29192OooO0o0) obj).f103527OooO0O0.f88129OooO00o;
                if (!((Boolean) baseToolbarChildFragment.Oooo0oO().f110439OooOO0O.getValue()).booleanValue()) {
                    C30898OooOo00 c30898OooOo00Oooo0oO = baseToolbarChildFragment.Oooo0oO();
                    List listOooO0oO = com.facebook.soloader.OooOo.OooO0oO(c31079OoooOoO);
                    InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = androidx.lifecycle.o0OoOo0.OooO00o(c30898OooOo00Oooo0oO);
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C30897OooOOoo(c30898OooOo00Oooo0oO, listOooO0oO, null), 2);
                    baseToolbarChildFragment.OooooOO(26, com.facebook.soloader.OooOo.OooO0oO(c31079OoooOoO));
                    return;
                }
                boolean z = c31079OoooOoO.f110921OooO0o;
                String id = c31079OoooOoO.f110917OooO00o;
                if (z) {
                    C30898OooOo00 c30898OooOo00Oooo0oO2 = baseToolbarChildFragment.Oooo0oO();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(id, "id");
                    C33781o00o0O c33781o00o0O = c30898OooOo00Oooo0oO2.f110440OooOO0o;
                    Set setO0Oo0oo = oOo000Oo.OooOo.o0Oo0oo((Iterable) c33781o00o0O.getValue());
                    setO0Oo0oo.remove(id);
                    c33781o00o0O.OooOO0(null, setO0Oo0oo);
                    return;
                }
                if (((Set) baseToolbarChildFragment.Oooo0oO().f110442OooOOO0.getValue()).size() >= 9) {
                    Context context = baseToolbarChildFragment.getContext();
                    if (context != null) {
                        C28513OooO0oO.OooO00o(context, R.string.popup_add_pic_reach_max_count, "getString(...)", context);
                        return;
                    }
                    return;
                }
                C30898OooOo00 c30898OooOo00Oooo0oO3 = baseToolbarChildFragment.Oooo0oO();
                kotlin.jvm.internal.OooOOO0.OooO0oO(id, "id");
                C33781o00o0O c33781o00o0O2 = c30898OooOo00Oooo0oO3.f110440OooOO0o;
                Set setO0Oo0oo2 = oOo000Oo.OooOo.o0Oo0oo((Iterable) c33781o00o0O2.getValue());
                setO0Oo0oo2.add(id);
                c33781o00o0O2.OooOO0(null, setO0Oo0oo2);
                return;
            case 2:
                EditText editText = ((SetRulerAngleDialogFragment) obj).f76225Oooo0;
                if (editText != null) {
                    editText.setText("");
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("inputField");
                    throw null;
                }
            case 3:
                int i = FavoriteToolBox.f76887Oooo0OO;
                Object tag2 = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag2, "null cannot be cast to non-null type com.orion.notein.ui.vo.FavoritePenVO");
                final FavoritePenVO favoritePenVO = (FavoritePenVO) tag2;
                final FavoriteToolBox favoriteToolBox = (FavoriteToolBox) obj;
                if (view.getId() == R.id.btn_remove) {
                    favoriteToolBox.f76900Oooo00o.invoke(new oO0O000o.OooO00o() { // from class: o0o00o00.OooO0o0
                        @Override // oO0O000o.OooO00o
                        public final Object invoke() {
                            FavoriteToolBox.OooO0O0 oooO0O0 = favoriteToolBox.toolBoxListener;
                            if (oooO0O0 != null) {
                                oooO0O0.OooO0O0(favoritePenVO);
                            }
                            return C32460OooOooO.f116667OooO00o;
                        }
                    });
                    return;
                } else {
                    favoriteToolBox.f76897Oooo0.invoke(new oO0O000o.OooO00o() { // from class: o0o00o00.OooO0o
                        @Override // oO0O000o.OooO00o
                        public final Object invoke() {
                            FavoriteToolBox.OooO0O0 oooO0O0;
                            int i2 = FavoriteToolBox.f76887Oooo0OO;
                            FavoritePenVO favoritePenVO2 = favoritePenVO;
                            if (!favoritePenVO2.getSelected() && !favoritePenVO2.getEditable() && (oooO0O0 = favoriteToolBox.toolBoxListener) != null) {
                                oooO0O0.OooO00o(favoritePenVO2);
                            }
                            return C32460OooOooO.f116667OooO00o;
                        }
                    });
                    return;
                }
            case 4:
                Context contextRequireContext = ((UserAboutDialogFragment) obj).requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                C33609OooO0oo.OooO0OO(C33633Oooo0.OooO0O0(), null, null, new C31098OooO0o(contextRequireContext, null), 3);
                return;
            default:
                ActivityC21897OooOo0 activityC21897OooOo0RequireActivity = ((TrashBinContainerFragment) obj).requireActivity();
                kotlin.jvm.internal.OooOOO0.OooO0o0(activityC21897OooOo0RequireActivity, "null cannot be cast to non-null type com.orion.notein.MainActivity");
                ((MainActivity) activityC21897OooOo0RequireActivity).openDrawer();
                return;
        }
    }
}
