package o0Oo0o00;

import Oooo0oO.C21030OooOO0o;
import android.view.View;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.orion.notein.p607ui.datasync.CloudSyncDetailsFragment;
import com.orion.notein.p607ui.noteeditor.NoteEditorContainerFragment;
import com.orion.notein.p607ui.noteeditor.propertypanel.EditorPropertyFragment;
import com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment;
import com.orion.notein.p607ui.p609vo.ThemeVO;
import com.orion.notein.p607ui.paperconfig.MyTemplateFragment;
import com.orion.notein.p607ui.settings.debug.DebugFragment;
import com.orion.notein.p607ui.stickers.edit.StickerCollectionEditFragment;
import com.orion.notein.p607ui.wizard.WizardFragment;
import com.orion.notein.ui.noteeditor.propertypanel.EditorPropertyFragment.OooO0O0;
import o0000oOO.AbstractC24338OooO0o0;
import o0O0oooO.ViewOnClickListenerC26311Ooooooo;
import o0Oo00o.C28026OooO0OO;
import o0OoO0oo.C28755o00000o0;
import o0o00o0.C29936OooO0oO;
import o0o00oO0.C30025OoooOoo;
import o0o0O00.C30191OooO0oO;
import o0o0O00.C30191OooO0oO.OooO0OO;
import o0o0O00.C30207OooOo;
import o0o0OoOO.C30710OooOooO;
import o0oOo00.C30934OooO0oO;
import o0oOoooo.C31176OooO00o;
import oO0o0OO.C33609OooO0oo;
import oO0o0Oo.C33781o00o0O;

/* JADX INFO: renamed from: o0Oo0o00.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28155OooO0oo implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f99778OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f99779OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28155OooO0oo(Object obj, int i) {
        this.f99779OooOo0o = i;
        this.f99778OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 3;
        Object obj = this.f99778OooOo;
        switch (this.f99779OooOo0o) {
            case 0:
                CloudSyncDetailsFragment cloudSyncDetailsFragment = (CloudSyncDetailsFragment) obj;
                RecyclerView recyclerView = cloudSyncDetailsFragment.f71428Oooo0o;
                if (recyclerView == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("rvDownloadingQueue");
                    throw null;
                }
                boolean z = recyclerView.getVisibility() == 0;
                RecyclerView recyclerView2 = cloudSyncDetailsFragment.f71428Oooo0o;
                if (recyclerView2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("rvDownloadingQueue");
                    throw null;
                }
                recyclerView2.setVisibility(z ? 8 : 0);
                View view2 = cloudSyncDetailsFragment.f71429Oooo0o0;
                if (view2 != null) {
                    view2.setActivated(!z);
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnDownloadingQueueDetails");
                    throw null;
                }
            case 1:
                EditorPropertyFragment editorPropertyFragment = (EditorPropertyFragment) obj;
                InterfaceC21987OooOoo viewLifecycleOwner = editorPropertyFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, editorPropertyFragment.new OooO0O0(view, null), 3);
                return;
            case 2:
                C28755o00000o0 c28755o00000o0 = ((BaseToolbarChildFragment) obj).f76506o000oOoO;
                if (c28755o00000o0 != null) {
                    NoteEditorContainerFragment noteEditorContainerFragment = c28755o00000o0.f101844OooO00o;
                    if (noteEditorContainerFragment.OooOooO()) {
                        NoteEditorContainerFragment.Oooo0(noteEditorContainerFragment);
                        com.orion.notein.p607ui.noteeditor.OooO0OO oooO0OOOooo00O = noteEditorContainerFragment.Oooo00O();
                        Boolean boolValueOf = Boolean.valueOf(!((Boolean) noteEditorContainerFragment.Oooo00O().f73420o00O0O.getValue()).booleanValue());
                        C33781o00o0O c33781o00o0O = oooO0OOOooo00O.f73437ooOO;
                        c33781o00o0O.getClass();
                        c33781o00o0O.OooOO0(null, boolValueOf);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                C30025OoooOoo c30025OoooOoo = (C30025OoooOoo) obj;
                if (view.isActivated()) {
                    C29936OooO0oO c29936OooO0oO = c30025OoooOoo.f106730Oooo00O;
                    if (c29936OooO0oO != null) {
                        c29936OooO0oO.OooO0oo(8);
                        return;
                    }
                    return;
                }
                C29936OooO0oO c29936OooO0oO2 = c30025OoooOoo.f106730Oooo00O;
                if (c29936OooO0oO2 != null) {
                    c29936OooO0oO2.OooO0OO(8);
                    return;
                }
                return;
            case 4:
                C30191OooO0oO c30191OooO0oO = ((C30207OooOo) obj).f107584OooO0O0;
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(c30191OooO0oO.OooOOO()), null, null, c30191OooO0oO.new OooO0OO(null), 3);
                return;
            case 5:
                Object tag = view.getTag();
                ThemeVO themeVO = tag instanceof ThemeVO ? (ThemeVO) tag : null;
                if (themeVO == null) {
                    return;
                }
                ((MyTemplateFragment) obj).Oooo0(themeVO);
                return;
            case 6:
                AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o = DebugFragment.f79020Oooo0OO;
                C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO((DebugFragment) obj), new C30710OooOooO("key_select_note_for_home_load_trace"));
                return;
            case 7:
                ViewOnClickListenerC26311Ooooooo viewOnClickListenerC26311Ooooooo = new ViewOnClickListenerC26311Ooooooo();
                StickerCollectionEditFragment stickerCollectionEditFragment = (StickerCollectionEditFragment) obj;
                ViewOnClickListenerC28151OooO0Oo viewOnClickListenerC28151OooO0Oo = new ViewOnClickListenerC28151OooO0Oo(stickerCollectionEditFragment, i);
                InterfaceC21987OooOoo viewLifecycleOwner2 = stickerCollectionEditFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
                C21989OooOooO.OooO00o(viewLifecycleOwner2).OooO0O0(new C30934OooO0oO(stickerCollectionEditFragment, viewOnClickListenerC26311Ooooooo, viewOnClickListenerC28151OooO0Oo, null));
                return;
            default:
                WizardFragment wizardFragment = (WizardFragment) obj;
                ViewPager2 viewPager2 = wizardFragment.f80185OooOoO0;
                if (viewPager2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("viewPager");
                    throw null;
                }
                int currentItem = viewPager2.getCurrentItem() + 1;
                o0oo0000.OooO00o oooO00o2 = wizardFragment.f80184OooOoO;
                if (oooO00o2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("adapter");
                    throw null;
                }
                if (currentItem >= oooO00o2.f111217OooO00o.size()) {
                    InterfaceC21987OooOoo viewLifecycleOwner3 = wizardFragment.getViewLifecycleOwner();
                    kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
                    C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner3), null, null, new C31176OooO00o(wizardFragment, null), 3);
                    return;
                } else {
                    ViewPager2 viewPager22 = wizardFragment.f80185OooOoO0;
                    if (viewPager22 != null) {
                        viewPager22.OooO0OO(currentItem, true);
                        return;
                    } else {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("viewPager");
                        throw null;
                    }
                }
        }
    }
}
