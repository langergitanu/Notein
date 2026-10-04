package o0Oo0o00;

import OooOoo.C20593OooO0Oo;
import Oooo0oO.C21030OooOO0o;
import android.view.View;
import androidx.core.os.BundleKt;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.MainActivity;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.datasync.CloudSyncFragment;
import com.orion.notein.p607ui.label.ItemData;
import com.orion.notein.p607ui.noteeditor.LockNoteFragment;
import com.orion.notein.p607ui.notelist.NoteListFragment;
import com.orion.notein.p607ui.notelist.NoteListFragment.C23627OooO0oO;
import com.orion.notein.p607ui.notelist.NoteListFragment.C23628OooO0oo;
import com.orion.notein.p607ui.notelist.OooO0OO;
import com.orion.notein.p607ui.notelist.folder.MoveToFolderFragment;
import com.orion.notein.p607ui.p609vo.NoteVO;
import com.orion.notein.ui.notelist.NoteListFragment.OooO0o;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import o0Oo00o.C28026OooO0OO;
import o0Oo00oO.C28035OooO00o;
import o0OoO0oO.C28680OooOO0;
import o0o00oOo.C30038OooOO0o;
import o0o00oOo.C30044OooOo0O;
import o0o00oOo.C30082o00000Oo;
import o0o00oo.C30132Oooo0oO;
import o0o0O000.InterfaceC30233OooOoo0;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32460OooOooO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33642Oooo0oo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;
import oOo000Oo.C34444Oooo0O0;

/* JADX INFO: renamed from: o0Oo0o00.Oooo00O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28181Oooo00O implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f99869OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f99870OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28181Oooo00O(Object obj, int i) {
        this.f99870OooOo0o = i;
        this.f99869OooOo = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ItemData itemData;
        int i = 1;
        Object obj = this.f99869OooOo;
        switch (this.f99870OooOo0o) {
            case 0:
                ActivityC21897OooOo0 activity = ((CloudSyncFragment) obj).getActivity();
                MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
                if (mainActivity != null) {
                    mainActivity.showGuideVideo(10);
                    return;
                }
                return;
            case 1:
                View.OnClickListener onClickListener = ((C28680OooOO0) obj).f101627OooO0O0;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    return;
                }
                return;
            case 2:
                Object tag = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.NoteVO");
                final NoteVO noteVO = (NoteVO) tag;
                final NoteListFragment noteListFragment = (NoteListFragment) obj;
                switch (view.getId()) {
                    case R.id.is_favorite /* 2131297840 */:
                        InterfaceC21987OooOoo viewLifecycleOwner = noteListFragment.getViewLifecycleOwner();
                        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                        androidx.lifecycle.OooOo oooOoOooO00o = C21989OooOooO.OooO00o(viewLifecycleOwner);
                        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                        C33609OooO0oo.OooO0OO(oooOoOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, noteListFragment.new OooO0o(noteVO, null), 2);
                        return;
                    case R.id.iv_update_from_cloud /* 2131298098 */:
                        return;
                    case R.id.label_list_section /* 2131298128 */:
                        if (noteVO.getLabelList().isEmpty() || (itemData = noteVO.getItemData()) == null) {
                            return;
                        }
                        Boolean bool = (Boolean) noteListFragment.OooOoo().f77164OoooOOO.f121747OooOo0o.getValue();
                        if (bool != null ? bool.booleanValue() : false) {
                            com.orion.notein.p607ui.notelist.OooO00o oooO00o = noteListFragment.f77020Oooo0O0;
                            if (oooO00o != null) {
                                oooO00o.OooO0o0(view, noteVO.getLabelList(), itemData, 1);
                                return;
                            } else {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("itemLabelListPopupWindow");
                                throw null;
                            }
                        }
                        com.orion.notein.p607ui.notelist.OooO00o oooO00o2 = noteListFragment.f77020Oooo0O0;
                        if (oooO00o2 != null) {
                            oooO00o2.OooO0o0(view, noteVO.getLabelList(), itemData, 0);
                            return;
                        } else {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("itemLabelListPopupWindow");
                            throw null;
                        }
                    case R.id.more /* 2131298276 */:
                        if (noteVO.getType() == 3) {
                            C30082o00000Oo c30082o00000Oo = noteListFragment.f77023Oooo0o0;
                            if (c30082o00000Oo == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("notePlaceholderItemMoreMenu");
                                throw null;
                            }
                            if (c30082o00000Oo.OooO0OO()) {
                                C30082o00000Oo c30082o00000Oo2 = noteListFragment.f77023Oooo0o0;
                                if (c30082o00000Oo2 != null) {
                                    c30082o00000Oo2.OooO00o();
                                    return;
                                } else {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("notePlaceholderItemMoreMenu");
                                    throw null;
                                }
                            }
                            C30082o00000Oo c30082o00000Oo3 = noteListFragment.f77023Oooo0o0;
                            if (c30082o00000Oo3 != null) {
                                c30082o00000Oo3.OooO0Oo(view, noteVO);
                                return;
                            } else {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("notePlaceholderItemMoreMenu");
                                throw null;
                            }
                        }
                        o0o0O0.OooO oooO = noteListFragment.f77021Oooo0OO;
                        if (oooO == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("noteItemMoreMenu");
                            throw null;
                        }
                        if (oooO.OooO0O0()) {
                            o0o0O0.OooO oooO2 = noteListFragment.f77021Oooo0OO;
                            if (oooO2 != null) {
                                oooO2.OooO00o();
                                return;
                            } else {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("noteItemMoreMenu");
                                throw null;
                            }
                        }
                        o0o0O0.OooO oooO3 = noteListFragment.f77021Oooo0OO;
                        if (oooO3 != null) {
                            oooO3.OooO0OO(view, noteVO);
                            return;
                        } else {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("noteItemMoreMenu");
                            throw null;
                        }
                    case R.id.remove_placeholder /* 2131298565 */:
                        Integer placeHolderState = noteVO.getPlaceHolderState();
                        boolean z = placeHolderState != null && placeHolderState.intValue() == 0;
                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o.OooOOO0("NoteListFragment");
                        c20358OooO00o.OooO00o("NoteListFragment.onDelete, isInImporting: " + z + ".", new Object[0]);
                        if (!z) {
                            InterfaceC21987OooOoo viewLifecycleOwner2 = noteListFragment.getViewLifecycleOwner();
                            kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
                            androidx.lifecycle.OooOo oooOoOooO00o2 = C21989OooOooO.OooO00o(viewLifecycleOwner2);
                            C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                            C33609OooO0oo.OooO0OO(oooOoOooO00o2, ExecutorC33873OooO0O0.f122045OooOoO0, null, noteListFragment.new C23627OooO0oO(noteVO, null), 2);
                            return;
                        }
                        com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo = noteListFragment.OooOoo();
                        String noteId = noteVO.getId();
                        kotlin.jvm.internal.OooOOO0.OooO0oO(noteId, "noteId");
                        c20358OooO00o.OooOOO0("NoteListViewModel");
                        c20358OooO00o.OooO00o(C20593OooO0Oo.OooO0O0("NoteListVm.cancelImportingJob, noteId:", noteId, "."), new Object[0]);
                        ConcurrentHashMap<String, InterfaceC33642Oooo0oo<C32460OooOooO>> concurrentHashMap = oooO0OOOooOoo.f77174Oooooo0;
                        InterfaceC33642Oooo0oo<C32460OooOooO> interfaceC33642Oooo0oo = concurrentHashMap.get(noteId);
                        if (interfaceC33642Oooo0oo != null) {
                            interfaceC33642Oooo0oo.cancel(C28035OooO00o.OooO00o("Job (" + noteId + ") cancelled by user manually.", null));
                        }
                        LinkedHashMap linkedHashMapOooOOOO = C34444Oooo0O0.OooOOOO(concurrentHashMap);
                        linkedHashMapOooOOOO.remove(noteId);
                        int size = linkedHashMapOooOOOO.size();
                        if (size != 0 && size == 1) {
                            oOo000Oo.Oooo0.OooO0o(linkedHashMapOooOOOO);
                        }
                        InterfaceC21987OooOoo viewLifecycleOwner3 = noteListFragment.getViewLifecycleOwner();
                        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
                        androidx.lifecycle.OooOo oooOoOooO00o3 = C21989OooOooO.OooO00o(viewLifecycleOwner3);
                        C33874OooO0OO c33874OooO0OO3 = C33649OoooOOo.f121328OooO00o;
                        C33609OooO0oo.OooO0OO(oooOoOooO00o3, ExecutorC33873OooO0O0.f122045OooOoO0, null, new o0o00oOo.OooOo00(noteListFragment, noteVO, null), 2);
                        return;
                    default:
                        if (noteVO.getInSelectMode()) {
                            noteListFragment.OooOoo().OooOo(noteVO.getType(), noteVO.getId());
                            return;
                        }
                        int type = noteVO.getType();
                        if (type == 0) {
                            String id = noteVO.getId();
                            C30038OooOO0o c30038OooOO0o = new C30038OooOO0o(noteListFragment, id);
                            LockNoteFragment lockNoteFragmentOooOoo0 = noteListFragment.OooOoo0();
                            InterfaceC21987OooOoo viewLifecycleOwner4 = noteListFragment.getViewLifecycleOwner();
                            kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
                            LockNoteFragment.OooOoo(lockNoteFragmentOooOoo0, C21989OooOooO.OooO00o(viewLifecycleOwner4), com.facebook.soloader.OooOo.OooO0oO(id), new androidx.ink.strokes.OooOO0O(c30038OooOO0o, i));
                            return;
                        }
                        if (type != 1) {
                            if (type == 2) {
                                final String pageNoteId = noteVO.getPageNoteId();
                                if (pageNoteId != null) {
                                    LockNoteFragment lockNoteFragmentOooOoo02 = noteListFragment.OooOoo0();
                                    InterfaceC21987OooOoo viewLifecycleOwner5 = noteListFragment.getViewLifecycleOwner();
                                    kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner5, "getViewLifecycleOwner(...)");
                                    LockNoteFragment.OooOoo(lockNoteFragmentOooOoo02, C21989OooOooO.OooO00o(viewLifecycleOwner5), com.facebook.soloader.OooOo.OooO0oO(pageNoteId), new oO0O000o.OooO00o() { // from class: o0o00oOo.OooOOO0
                                        @Override // oO0O000o.OooO00o
                                        public final Object invoke() {
                                            C28026OooO0OO.OooO00o(C21030OooOO0o.OooO0OO(noteListFragment), R.id.noteEditorContainerFragment, BundleKt.bundleOf(new C32443OooOOO(NoteMeta.PROPERTY_NOTE_ID, pageNoteId), new C32443OooOOO("page_id_string", noteVO.getId())));
                                            return C32460OooOooO.f116667OooO00o;
                                        }
                                    });
                                    return;
                                }
                                return;
                            }
                            if (type != 3) {
                                return;
                            }
                            Integer placeHolderState2 = noteVO.getPlaceHolderState();
                            if (placeHolderState2 != null && placeHolderState2.intValue() == 1) {
                                InterfaceC21987OooOoo viewLifecycleOwner6 = noteListFragment.getViewLifecycleOwner();
                                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner6, "getViewLifecycleOwner(...)");
                                androidx.lifecycle.OooOo oooOoOooO00o4 = C21989OooOooO.OooO00o(viewLifecycleOwner6);
                                C33874OooO0OO c33874OooO0OO4 = C33649OoooOOo.f121328OooO00o;
                                C33609OooO0oo.OooO0OO(oooOoOooO00o4, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C30044OooOo0O(noteListFragment, noteVO, null), 2);
                                return;
                            }
                            if ((placeHolderState2 != null && placeHolderState2.intValue() == 2) || placeHolderState2 == null || placeHolderState2.intValue() != 5) {
                                return;
                            }
                            C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(noteListFragment), new C30132Oooo0oO(noteVO.getId()));
                            return;
                        }
                        OooO0OO.OooO0o oooO0oOooOooO = noteListFragment.OooOooO();
                        com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo2 = noteListFragment.OooOoo();
                        NoteVO noteVO2 = (NoteVO) ((C32443OooOOO) oooO0OOOooOoo2.f77161OoooO00.getValue()).f116638OooOo0o;
                        String id2 = noteVO2 != null ? noteVO2.getId() : null;
                        LinkedHashMap linkedHashMap = oooO0OOOooOoo2.f77143OooOoOO;
                        if (oooO0oOooOooO != null) {
                            linkedHashMap.put(id2, oooO0oOooOooO);
                            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o2.OooOOO0("NoteListViewModel");
                            c20358OooO00o2.OooO00o("ScrollPos: saved " + oooO0oOooOooO + " for folder: " + id2, new Object[0]);
                        } else {
                            linkedHashMap.remove(id2);
                            C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o3.OooO00o(androidx.core.app.OooO.OooO0O0(c20358OooO00o3, "NoteListViewModel", "ScrollPos: removed position for folder: ", id2), new Object[0]);
                        }
                        C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                        c20358OooO00o4.OooOOO0("NoteListFragment");
                        c20358OooO00o4.OooO00o("ScrollPos: entering " + noteVO.getName() + ", saved " + oooO0oOooOooO, new Object[0]);
                        InterfaceC21987OooOoo viewLifecycleOwner7 = noteListFragment.getViewLifecycleOwner();
                        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner7, "getViewLifecycleOwner(...)");
                        androidx.lifecycle.OooOo oooOoOooO00o5 = C21989OooOooO.OooO00o(viewLifecycleOwner7);
                        C33874OooO0OO c33874OooO0OO5 = C33649OoooOOo.f121328OooO00o;
                        C33609OooO0oo.OooO0OO(oooOoOooO00o5, ExecutorC33873OooO0O0.f122045OooOoO0, null, noteListFragment.new C23628OooO0oo(noteVO, null), 2);
                        return;
                }
            default:
                Fragment parentFragment = ((MoveToFolderFragment) obj).getParentFragment();
                InterfaceC30233OooOoo0 interfaceC30233OooOoo0 = parentFragment instanceof InterfaceC30233OooOoo0 ? (InterfaceC30233OooOoo0) parentFragment : null;
                if (interfaceC30233OooOoo0 != null) {
                    interfaceC30233OooOoo0.OooO0oO();
                    return;
                }
                return;
        }
    }
}
