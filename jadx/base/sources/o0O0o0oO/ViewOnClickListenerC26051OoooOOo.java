package o0O0o0oO;

import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.widget.PopupWindow;
import androidx.fragment.app.C21929Ooooo0o;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.editor.PDFView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.export.ExportDialogFragment;
import com.orion.notein.p607ui.label.ItemData;
import com.orion.notein.p607ui.noteeditor.LockNoteFragment;
import com.orion.notein.p607ui.noteeditor.pagelayereditor.LayerRenameDialogFragment;
import com.orion.notein.p607ui.noteeditor.pagelayereditor.PageLayerEditor;
import com.orion.notein.p607ui.noteeditor.pagelayereditor.popup.LayerMoreActionsBottomSheetDialog;
import com.orion.notein.p607ui.noteeditor.propertypanel.preview.NoteTnNavigatorView;
import com.orion.notein.p607ui.noteeditor.propertypanel.preview.PagePreviewVO;
import com.orion.notein.p607ui.notelist.recent.RecentFragment;
import com.orion.notein.p607ui.p609vo.NoteVO;
import com.orion.penkit.models.LassoParams;
import com.orion.penkit.models.LayerInfo;
import java.util.List;
import o00o00.C25206OooO0Oo;
import o0O0O0o.C25871OooO00o;
import o0Oo00o.C28026OooO0OO;
import o0Ooo0O0.C29390OooOOO0;
import o0Ooo0O0.ViewOnClickListenerC29384OooO0oO;
import o0OoooO0.C29632OooO0OO;
import o0oOOOoo.C30837OooO00o;
import o0oo0o.InterfaceC31284OooO0O0;
import oO00ooO.C32460OooOooO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0O0o0oO.OoooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class ViewOnClickListenerC26051OoooOOo implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f88938OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f88939OooOo0o;

    public /* synthetic */ ViewOnClickListenerC26051OoooOOo(Object obj, int i) {
        this.f88939OooOo0o = i;
        this.f88938OooOo = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [o0Ooo0O0.OooOO0] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        NoteTnNavigatorView.OooO00o oooO00o;
        ItemData itemData;
        Object obj = this.f88938OooOo;
        switch (this.f88939OooOo0o) {
            case 0:
                C26061Oooooo0 c26061Oooooo0 = (C26061Oooooo0) obj;
                LassoParams lassoParams = c26061Oooooo0.f88960OooO0O0;
                if (lassoParams != null) {
                    C26062OoooooO c26062OoooooO = c26061Oooooo0.f88961OooO0OO;
                    PDFView pDFView = c26062OoooooO.f88962OooO00o;
                    pDFView.f69170OooOooO.f69109OooO0O0.f90558OooO0oO.OooO0Oo();
                    InterfaceC31284OooO0O0.OooO00o oooO00o2 = InterfaceC31284OooO0O0.f111702OooO0O0;
                    List<InterfaceC31284OooO0O0> selectedItems = lassoParams.getSelectedItems();
                    float zoomLevel = pDFView.getZoomLevel();
                    oooO00o2.getClass();
                    RectF rectFOooO00o = InterfaceC31284OooO0O0.OooO00o.OooO00o(zoomLevel, selectedItems);
                    if (rectFOooO00o == null) {
                        return;
                    }
                    c26062OoooooO.OooO00o(lassoParams.getSelectedItems(), rectFOooO00o);
                    pDFView.getTool().OooOO0O();
                    pDFView.OooOoo0();
                    return;
                }
                return;
            case 1:
                ((ExportDialogFragment) obj).Oooo0OO().OooO0oo(1);
                return;
            case 2:
                final PageLayerEditor pageLayerEditor = (PageLayerEditor) obj;
                C29632OooO0OO c29632OooO0OO = pageLayerEditor.f74872OooOoo0;
                if (c29632OooO0OO == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("morePopupWindow");
                    throw null;
                }
                LayerMoreActionsBottomSheetDialog layerMoreActionsBottomSheetDialog = c29632OooO0OO.f105067OooO0OO;
                if (layerMoreActionsBottomSheetDialog != null) {
                    layerMoreActionsBottomSheetDialog.dismissAllowingStateLoss();
                } else {
                    PopupWindow popupWindow = c29632OooO0OO.f105070OooO0o0;
                    if (popupWindow != null) {
                        popupWindow.dismiss();
                    }
                }
                switch (view.getId()) {
                    case R.id.item_delete_layer /* 2131297866 */:
                        Object tag = view.getTag();
                        kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.noteeditor.pagelayereditor.model.PageLayerTnVO");
                        final C30837OooO00o c30837OooO00o = (C30837OooO00o) tag;
                        String str = c30837OooO00o.f110196OooO00o;
                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(str, LayerInfo.PAPER_THEME_LAYER_ID) || kotlin.jvm.internal.OooOOO0.OooO0O0(str, "default")) {
                            Context context = pageLayerEditor.getContext();
                            kotlin.jvm.internal.OooOOO0.OooO0o(context, "getContext(...)");
                            String string = pageLayerEditor.getContext().getString(R.string.toast_can_not_delete_this_paper);
                            kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                            C25206OooO0Oo.OooO0oO(context, string);
                            return;
                        }
                        FragmentManager childFragmentManager = C21929Ooooo0o.OooO0Oo(pageLayerEditor).getChildFragmentManager();
                        kotlin.jvm.internal.OooOOO0.OooO0o(childFragmentManager, "getChildFragmentManager(...)");
                        if (childFragmentManager.OooOooo("TipsDialogFragment") != null) {
                            return;
                        }
                        ViewOnClickListenerC29384OooO0oO viewOnClickListenerC29384OooO0oO = new ViewOnClickListenerC29384OooO0oO();
                        ?? r7 = new View.OnClickListener() { // from class: o0Ooo0O0.OooOO0
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                int i = PageLayerEditor.f74865Oooo0o0;
                                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o.OooOOO0("PageLayerEditor");
                                C30837OooO00o c30837OooO00o2 = c30837OooO00o;
                                StringBuilder sb = new StringBuilder("onDeleteLayerButtonClicked, confirm delete layer, layerId is ");
                                String str2 = c30837OooO00o2.f110196OooO00o;
                                sb.append(str2);
                                sb.append(", noteId is: ");
                                String str3 = c30837OooO00o2.f110197OooO0O0;
                                sb.append(str3);
                                c20358OooO00o.OooO0o0(sb.toString(), new Object[0]);
                                com.orion.notein.p607ui.noteeditor.pagelayereditor.OooO0OO oooO0OO = pageLayerEditor.f74867OooOo0o;
                                if (oooO0OO != null) {
                                    oooO0OO.OooO(str2, str3, true);
                                } else {
                                    kotlin.jvm.internal.OooOOO0.OooOOOO("viewModel");
                                    throw null;
                                }
                            }
                        };
                        androidx.lifecycle.OooOo oooOo = pageLayerEditor.f74866OooOo;
                        if (oooOo != null) {
                            C33609OooO0oo.OooO0OO(oooOo, null, null, new C29390OooOOO0(pageLayerEditor, c30837OooO00o, viewOnClickListenerC29384OooO0oO, r7, childFragmentManager, null), 3);
                            return;
                        } else {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("viewScope");
                            throw null;
                        }
                    case R.id.item_merge_layers /* 2131297885 */:
                        Object tag2 = view.getTag();
                        kotlin.jvm.internal.OooOOO0.OooO0o0(tag2, "null cannot be cast to non-null type com.orion.notein.ui.noteeditor.pagelayereditor.model.PageLayerTnVO");
                        pageLayerEditor.OooO0OO((C30837OooO00o) tag2, false);
                        return;
                    case R.id.item_merge_visible_layers /* 2131297886 */:
                        Object tag3 = view.getTag();
                        kotlin.jvm.internal.OooOOO0.OooO0o0(tag3, "null cannot be cast to non-null type com.orion.notein.ui.noteeditor.pagelayereditor.model.PageLayerTnVO");
                        pageLayerEditor.OooO0OO((C30837OooO00o) tag3, true);
                        return;
                    case R.id.item_rename_layer /* 2131297900 */:
                        Object tag4 = view.getTag();
                        kotlin.jvm.internal.OooOOO0.OooO0o0(tag4, "null cannot be cast to non-null type com.orion.notein.ui.noteeditor.pagelayereditor.model.PageLayerTnVO");
                        C30837OooO00o c30837OooO00o2 = (C30837OooO00o) tag4;
                        FragmentManager childFragmentManager2 = C21929Ooooo0o.OooO0Oo(pageLayerEditor).getChildFragmentManager();
                        kotlin.jvm.internal.OooOOO0.OooO0o(childFragmentManager2, "getChildFragmentManager(...)");
                        if (childFragmentManager2.OooOooo("LayerRenameDialogFragment") == null) {
                            LayerRenameDialogFragment layerRenameDialogFragment = new LayerRenameDialogFragment();
                            String str2 = c30837OooO00o2.f110201OooO0o0;
                            if (str2 == null) {
                                str2 = "";
                            }
                            layerRenameDialogFragment.f74745Oooo0O0 = str2;
                            layerRenameDialogFragment.f74746Oooo0OO = new C25871OooO00o(pageLayerEditor, c30837OooO00o2);
                            layerRenameDialogFragment.show(childFragmentManager2, "LayerRenameDialogFragment");
                            return;
                        }
                        return;
                    default:
                        return;
                }
            case 3:
                int i = NoteTnNavigatorView.f76040Oooo0o0;
                NoteTnNavigatorView noteTnNavigatorView = (NoteTnNavigatorView) obj;
                PagePreviewVO pagePreviewVO = noteTnNavigatorView.getPagePreviewVO();
                if (pagePreviewVO == null || (oooO00o = noteTnNavigatorView.f76054Oooo0O0) == null) {
                    return;
                }
                View view2 = noteTnNavigatorView.f76043OooOoO;
                if (view2 != null) {
                    oooO00o.OooO00o(view2, pagePreviewVO);
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnMore");
                    throw null;
                }
            default:
                Object tag5 = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag5, "null cannot be cast to non-null type com.orion.notein.ui.vo.NoteVO");
                final NoteVO noteVO = (NoteVO) tag5;
                int id = view.getId();
                final RecentFragment recentFragment = (RecentFragment) obj;
                if (id == R.id.is_favorite) {
                    InterfaceC21987OooOoo viewLifecycleOwner = recentFragment.getViewLifecycleOwner();
                    kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    androidx.lifecycle.OooOo oooOoOooO00o = C21989OooOooO.OooO00o(viewLifecycleOwner);
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    C33609OooO0oo.OooO0OO(oooOoOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new o0o0O0O.OooO0o(recentFragment, noteVO, null), 2);
                    return;
                }
                if (id != R.id.label_list_section) {
                    if (id == R.id.more) {
                        o0o0O0.OooO oooO = recentFragment.f77875Oooo0O0;
                        if (oooO != null) {
                            oooO.OooO0OO(view, noteVO);
                            return;
                        } else {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("noteItemMoreMenu");
                            throw null;
                        }
                    }
                    if (noteVO.getType() != 0) {
                        return;
                    }
                    LockNoteFragment lockNoteFragmentOooOoo = recentFragment.OooOoo();
                    InterfaceC21987OooOoo viewLifecycleOwner2 = recentFragment.getViewLifecycleOwner();
                    kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
                    LockNoteFragment.OooOoo(lockNoteFragmentOooOoo, C21989OooOooO.OooO00o(viewLifecycleOwner2), com.facebook.soloader.OooOo.OooO0oO(noteVO.getId()), new oO0O000o.OooO00o() { // from class: o0o0O0O.OooO0o0
                        @Override // oO0O000o.OooO00o
                        public final Object invoke() {
                            String noteId = noteVO.getId();
                            kotlin.jvm.internal.OooOOO0.OooO0oO(noteId, "noteId");
                            C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(recentFragment), new OooOO0(noteId));
                            return C32460OooOooO.f116667OooO00o;
                        }
                    });
                    return;
                }
                if (noteVO.getLabelList().isEmpty() || (itemData = noteVO.getItemData()) == null) {
                    return;
                }
                Boolean bool = (Boolean) recentFragment.OooOooO().f77164OoooOOO.f121747OooOo0o.getValue();
                if (bool != null ? bool.booleanValue() : false) {
                    com.orion.notein.p607ui.notelist.OooO00o oooO00o3 = recentFragment.f77871Oooo0;
                    if (oooO00o3 != null) {
                        oooO00o3.OooO0o0(view, noteVO.getLabelList(), itemData, 1);
                        return;
                    } else {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("itemLabelListPopupWindow");
                        throw null;
                    }
                }
                com.orion.notein.p607ui.notelist.OooO00o oooO00o4 = recentFragment.f77871Oooo0;
                if (oooO00o4 != null) {
                    oooO00o4.OooO0o0(view, noteVO.getLabelList(), itemData, 0);
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("itemLabelListPopupWindow");
                    throw null;
                }
        }
    }
}
