package o0OoO000;

import Oooo0oO.C21030OooOO0o;
import android.view.View;
import androidx.appcompat.widget.C21532OooOOo;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.login.firebase.FirebaseUserAuthFragment;
import com.orion.notein.p607ui.noteeditor.LockNoteFragment;
import com.orion.notein.p607ui.notelist.fabbottomsheet.FabDocumentsFragment;
import com.orion.notein.p607ui.notelist.trashbin.TrashBinListFragment;
import com.orion.notein.p607ui.p609vo.NoteVO;
import o0Oo00o.C28026OooO0OO;
import o0o0O00.C30207OooOo;
import o0o0O0oO.C30325OooOOOO;
import o0o0O0oo.C30360OooO00o;
import oO00ooO.C32460OooOooO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0OoO000.Ooooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28566Ooooo0o implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Fragment f101247OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f101248OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28566Ooooo0o(Fragment fragment, int i) {
        this.f101248OooOo0o = i;
        this.f101247OooOo = fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        LockNoteFragment lockNoteFragment;
        Fragment fragment = this.f101247OooOo;
        switch (this.f101248OooOo0o) {
            case 0:
                ((FirebaseUserAuthFragment) fragment).Oooo0oO(true);
                return;
            case 1:
                C30207OooOo.OooO00o oooO00o = ((FabDocumentsFragment) fragment).f77466OooOo0o;
                if (oooO00o != null) {
                    oooO00o.OooO0oo();
                    return;
                }
                return;
            default:
                final TrashBinListFragment trashBinListFragment = (TrashBinListFragment) fragment;
                C30360OooO00o c30360OooO00o = trashBinListFragment.f78122Oooo00O;
                if (c30360OooO00o == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("noteItemMoreMenu");
                    throw null;
                }
                c30360OooO00o.OooO00o();
                Object tag = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.NoteVO");
                final NoteVO noteVO = (NoteVO) tag;
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("TrashBinListFragment");
                c20358OooO00o.OooO0o0("MoreMenuPopupWindow click: " + noteVO, new Object[0]);
                int id = view.getId();
                if (id != R.id.item_delete) {
                    if (id != R.id.item_recover) {
                        return;
                    }
                    c20358OooO00o.OooOOO0("TrashBinListFragment");
                    c20358OooO00o.OooO0o0(C21532OooOOo.OooO0OO(noteVO.getType(), "MoreMenuPopupWindow recover, type is "), new Object[0]);
                    InterfaceC21987OooOoo viewLifecycleOwner = trashBinListFragment.getViewLifecycleOwner();
                    kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    androidx.lifecycle.OooOo oooOoOooO00o = C21989OooOooO.OooO00o(viewLifecycleOwner);
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    C33609OooO0oo.OooO0OO(oooOoOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C30325OooOOOO(trashBinListFragment, noteVO, null), 2);
                    return;
                }
                c20358OooO00o.OooOOO0("TrashBinListFragment");
                c20358OooO00o.OooO0o0("MoreMenuPopupWindow onDeleteClicked.", new Object[0]);
                Fragment fragmentOooOooo = trashBinListFragment.getChildFragmentManager().OooOooo("LockNoteFragment");
                if (fragmentOooOooo != null) {
                    lockNoteFragment = (LockNoteFragment) fragmentOooOooo;
                } else {
                    lockNoteFragment = new LockNoteFragment();
                    FragmentManager childFragmentManager = trashBinListFragment.getChildFragmentManager();
                    androidx.fragment.app.OooO00o oooO00oOooO0OO = OooOOOo.OooOOO0.OooO0OO(childFragmentManager, childFragmentManager);
                    oooO00oOooO0OO.OooO0Oo(0, lockNoteFragment, "LockNoteFragment", 1);
                    oooO00oOooO0OO.OooOO0O();
                }
                InterfaceC21987OooOoo viewLifecycleOwner2 = trashBinListFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
                LockNoteFragment.OooOoo(lockNoteFragment, C21989OooOooO.OooO00o(viewLifecycleOwner2), com.facebook.soloader.OooOo.OooO0oO(noteVO.getId()), new oO0O000o.OooO00o() { // from class: o0o0O0oO.OooOOO
                    @Override // oO0O000o.OooO00o
                    public final Object invoke() {
                        C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(trashBinListFragment), new C30320OooOO0(noteVO));
                        return C32460OooOooO.f116667OooO00o;
                    }
                });
                return;
        }
    }
}
