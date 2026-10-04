package o0OoO000;

import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.label.ItemData;
import com.orion.notein.p607ui.login.firebase.FirebaseUserLoginFragment;
import com.orion.notein.p607ui.noteeditor.LockNoteFragment;
import com.orion.notein.p607ui.notelist.documents.NoteListContainerFragment;
import com.orion.notein.p607ui.notelist.favorite.FavoriteListFragment;
import com.orion.notein.p607ui.notelist.favorite.FavoriteListFragment.C23666OooO0o0;
import com.orion.notein.p607ui.notelist.favorite.FavoriteListFragment.C23667OooO0oO;
import com.orion.notein.p607ui.p609vo.NoteVO;
import com.orion.notein.p607ui.settings.GlobalSettingsFragment;
import com.orion.notein.ui.notelist.favorite.FavoriteListFragment.OooO0o;
import io.ktor.utils.p616io.C23968Oooo00o;
import o0Oo00o.C28026OooO0OO;
import o0Oo00oO.C28037OooO0OO;
import o0o00oO0.C29990OooO0oO;
import o0o00oOo.C30082o00000Oo;
import o0o00oo.C30132Oooo0oO;
import o0o00ooo.C30153OooOO0o;
import o0o00ooo.C30167OooOoO0;
import o0o0Oo0O.C30617OooO0oo;
import o0oOoOoO.C31099OooO0o0;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32460OooOooO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class o0Oo0oo implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f101362OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f101363OooOo0o;

    public /* synthetic */ o0Oo0oo(Object obj, int i) {
        this.f101363OooOo0o = i;
        this.f101362OooOo = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ItemData itemData;
        Object obj = this.f101362OooOo;
        switch (this.f101363OooOo0o) {
            case 0:
                Context contextRequireContext = ((FirebaseUserLoginFragment) obj).requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                C33609OooO0oo.OooO0OO(C33633Oooo0.OooO0O0(), null, null, new C31099OooO0o0(contextRequireContext, null), 3);
                return;
            case 1:
                ((C29990OooO0oO) obj).OooO0o0(0);
                return;
            case 2:
                Object tag = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.NoteVO");
                final NoteVO noteVO = (NoteVO) tag;
                final FavoriteListFragment favoriteListFragment = (FavoriteListFragment) obj;
                switch (view.getId()) {
                    case R.id.is_favorite /* 2131297840 */:
                        InterfaceC21987OooOoo viewLifecycleOwner = favoriteListFragment.getViewLifecycleOwner();
                        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                        androidx.lifecycle.OooOo oooOoOooO00o = C21989OooOooO.OooO00o(viewLifecycleOwner);
                        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                        C33609OooO0oo.OooO0OO(oooOoOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, favoriteListFragment.new C23666OooO0o0(noteVO, null), 2);
                        return;
                    case R.id.iv_update_from_cloud /* 2131298098 */:
                        return;
                    case R.id.label_list_section /* 2131298128 */:
                        if (noteVO.getLabelList().isEmpty() || (itemData = noteVO.getItemData()) == null) {
                            return;
                        }
                        Boolean bool = (Boolean) favoriteListFragment.OooOoo().f77164OoooOOO.f121747OooOo0o.getValue();
                        if (bool != null ? bool.booleanValue() : false) {
                            com.orion.notein.p607ui.notelist.OooO00o oooO00o = favoriteListFragment.f77525Oooo0;
                            if (oooO00o != null) {
                                oooO00o.OooO0o0(view, noteVO.getLabelList(), itemData, 1);
                                return;
                            } else {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("itemLabelListPopupWindow");
                                throw null;
                            }
                        }
                        com.orion.notein.p607ui.notelist.OooO00o oooO00o2 = favoriteListFragment.f77525Oooo0;
                        if (oooO00o2 != null) {
                            oooO00o2.OooO0o0(view, noteVO.getLabelList(), itemData, 0);
                            return;
                        } else {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("itemLabelListPopupWindow");
                            throw null;
                        }
                    case R.id.more /* 2131298276 */:
                        if (noteVO.getType() == 3) {
                            C30082o00000Oo c30082o00000Oo = favoriteListFragment.f77530Oooo0OO;
                            if (c30082o00000Oo != null) {
                                c30082o00000Oo.OooO0Oo(view, noteVO);
                                return;
                            } else {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("notePlaceholderItemMoreMenu");
                                throw null;
                            }
                        }
                        o0o0O0.OooO oooO = favoriteListFragment.f77529Oooo0O0;
                        if (oooO != null) {
                            oooO.OooO0OO(view, noteVO);
                            return;
                        } else {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("noteItemMoreMenu");
                            throw null;
                        }
                    case R.id.remove_placeholder /* 2131298565 */:
                        InterfaceC21987OooOoo viewLifecycleOwner2 = favoriteListFragment.getViewLifecycleOwner();
                        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
                        androidx.lifecycle.OooOo oooOoOooO00o2 = C21989OooOooO.OooO00o(viewLifecycleOwner2);
                        C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                        C33609OooO0oo.OooO0OO(oooOoOooO00o2, ExecutorC33873OooO0O0.f122045OooOoO0, null, favoriteListFragment.new OooO0o(noteVO, null), 2);
                        return;
                    default:
                        if (noteVO.getInSelectMode()) {
                            favoriteListFragment.OooOoo().OooOo(noteVO.getType(), noteVO.getId());
                            return;
                        }
                        int type = noteVO.getType();
                        if (type == 0) {
                            LockNoteFragment lockNoteFragmentOooOoo0 = favoriteListFragment.OooOoo0();
                            InterfaceC21987OooOoo viewLifecycleOwner3 = favoriteListFragment.getViewLifecycleOwner();
                            kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
                            LockNoteFragment.OooOoo(lockNoteFragmentOooOoo0, C21989OooOooO.OooO00o(viewLifecycleOwner3), com.facebook.soloader.OooOo.OooO0oO(noteVO.getId()), new oO0O000o.OooO00o() { // from class: o0o00ooo.OooOOoo
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // oO0O000o.OooO00o
                                public final Object invoke() {
                                    o000o0O0.OooOo oooOoOooO00o3;
                                    FavoriteListFragment favoriteListFragment2 = favoriteListFragment;
                                    boolean z = favoriteListFragment2.getParentFragment() instanceof NoteListContainerFragment;
                                    NoteVO noteVO2 = noteVO;
                                    if (z) {
                                        String id = noteVO2.getId();
                                        NoteVO noteVO3 = (NoteVO) ((C32443OooOOO) favoriteListFragment2.OooOoo().f77161OoooO00.getValue()).f116638OooOo0o;
                                        oooOoOooO00o3 = C23968Oooo00o.OooO0o0(28, id, noteVO3 != null ? noteVO3.getId() : null, null);
                                    } else {
                                        String id2 = noteVO2.getId();
                                        NoteVO noteVO4 = (NoteVO) ((C32443OooOOO) favoriteListFragment2.OooOoo().f77161OoooO00.getValue()).f116638OooOo0o;
                                        oooOoOooO00o3 = C28037OooO0OO.OooO00o(id2, noteVO4 != null ? noteVO4.getId() : null);
                                    }
                                    C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(favoriteListFragment2), oooOoOooO00o3);
                                    return C32460OooOooO.f116667OooO00o;
                                }
                            });
                            return;
                        }
                        if (type == 1) {
                            InterfaceC21987OooOoo viewLifecycleOwner4 = favoriteListFragment.getViewLifecycleOwner();
                            kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
                            androidx.lifecycle.OooOo oooOoOooO00o3 = C21989OooOooO.OooO00o(viewLifecycleOwner4);
                            C33874OooO0OO c33874OooO0OO3 = C33649OoooOOo.f121328OooO00o;
                            C33609OooO0oo.OooO0OO(oooOoOooO00o3, ExecutorC33873OooO0O0.f122045OooOoO0, null, favoriteListFragment.new C23667OooO0oO(noteVO, null), 2);
                            return;
                        }
                        if (type != 3) {
                            return;
                        }
                        Integer placeHolderState = noteVO.getPlaceHolderState();
                        if (placeHolderState != null && placeHolderState.intValue() == 1) {
                            InterfaceC21987OooOoo viewLifecycleOwner5 = favoriteListFragment.getViewLifecycleOwner();
                            kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner5, "getViewLifecycleOwner(...)");
                            androidx.lifecycle.OooOo oooOoOooO00o4 = C21989OooOooO.OooO00o(viewLifecycleOwner5);
                            C33874OooO0OO c33874OooO0OO4 = C33649OoooOOo.f121328OooO00o;
                            C33609OooO0oo.OooO0OO(oooOoOooO00o4, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C30167OooOoO0(favoriteListFragment, noteVO, null), 2);
                            return;
                        }
                        if ((placeHolderState != null && placeHolderState.intValue() == 2) || placeHolderState == null || placeHolderState.intValue() != 5) {
                            return;
                        }
                        C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(favoriteListFragment), favoriteListFragment.getParentFragment() instanceof NoteListContainerFragment ? new C30132Oooo0oO(noteVO.getId()) : new C30153OooOO0o(noteVO.getId()));
                        return;
                }
            default:
                GlobalSettingsFragment globalSettingsFragment = (GlobalSettingsFragment) obj;
                InterfaceC21987OooOoo viewLifecycleOwner6 = globalSettingsFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner6, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner6), null, null, new C30617OooO0oo(globalSettingsFragment, null), 3);
                return;
        }
    }
}
