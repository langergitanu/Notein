package o0O0o0oO;

import android.app.Dialog;
import android.view.View;
import android.widget.EditText;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.editor.PDFView;
import com.orion.notein.p607ui.TipsDialogFragment;
import com.orion.notein.p607ui.label.ItemData;
import com.orion.notein.p607ui.noteeditor.propertypanel.preview.C23558OooO0oo;
import com.orion.notein.p607ui.noteeditor.propertypanel.preview.EditorPreviewFragment;
import com.orion.notein.p607ui.noteeditor.propertypanel.preview.PagePreviewVO;
import com.orion.notein.p607ui.notelist.documents.NoteListContainerFragment;
import com.orion.notein.p607ui.ocr.dialog.ScannedPageSelectDialogFragment;
import com.orion.notein.p607ui.p609vo.ItemLabelVO;
import com.orion.penkit.models.LassoParams;
import java.util.Collections;
import java.util.List;
import o0O0o00.EnumC25982o0000oO;
import o0o000oo.C29825OooOoO0;
import o0o00OOo.C29891OooO0o0;
import o0o0O0o.C30294OooO0OO;
import o0oo0o.InterfaceC31284OooO0O0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0OO.C33609OooO0oo;

/* JADX INFO: renamed from: o0O0o0oO.Ooooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class ViewOnClickListenerC26056Ooooo0o implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f88948OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f88949OooOo0o;

    public /* synthetic */ ViewOnClickListenerC26056Ooooo0o(Object obj, int i) {
        this.f88949OooOo0o = i;
        this.f88948OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC32507OooOO0o<? super Boolean, C32460OooOooO> interfaceC32507OooOO0o;
        switch (this.f88949OooOo0o) {
            case 0:
                C26061Oooooo0 c26061Oooooo0 = (C26061Oooooo0) this.f88948OooOo;
                LassoParams lassoParams = c26061Oooooo0.f88960OooO0O0;
                if (lassoParams != null) {
                    C26062OoooooO c26062OoooooO = c26061Oooooo0.f88961OooO0OO;
                    PDFView pDFView = c26062OoooooO.f88962OooO00o;
                    pDFView.f69170OooOooO.f69109OooO0O0.f90558OooO0oO.OooOoo();
                    InterfaceC31284OooO0O0.OooO00o oooO00o = InterfaceC31284OooO0O0.f111702OooO0O0;
                    List<InterfaceC31284OooO0O0> selectedItems = lassoParams.getSelectedItems();
                    float zoomLevel = pDFView.getZoomLevel();
                    oooO00o.getClass();
                    if (InterfaceC31284OooO0O0.OooO00o.OooO00o(zoomLevel, selectedItems) == null) {
                        return;
                    }
                    c26062OoooooO.f88962OooO00o.OooOO0O(lassoParams.getSelectedItems(), Collections.EMPTY_LIST, EnumC25982o0000oO.f88734OooOo);
                    pDFView.getTool().OooOO0O();
                    pDFView.OooOoo0();
                    pDFView.invalidate();
                    return;
                }
                return;
            case 1:
                EditorPreviewFragment.OooOOO oooOOO = ((C23558OooO0oo) this.f88948OooOo).f76123OooO0O0;
                if (oooOOO != null) {
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(view);
                    EditorPreviewFragment editorPreviewFragment = EditorPreviewFragment.this;
                    EditText editText = editorPreviewFragment.f75903Oooo0;
                    if (editText == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("searchView");
                        throw null;
                    }
                    editText.clearFocus();
                    Object tag = view.getTag();
                    kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.noteeditor.propertypanel.preview.PagePreviewVO");
                    PagePreviewVO pagePreviewVO = (PagePreviewVO) tag;
                    List<ItemLabelVO> labelList = pagePreviewVO.getLabelList();
                    if (labelList.isEmpty()) {
                        InterfaceC21987OooOoo viewLifecycleOwner = editorPreviewFragment.getViewLifecycleOwner();
                        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new com.orion.notein.p607ui.noteeditor.propertypanel.preview.OooO0O0(editorPreviewFragment, pagePreviewVO, null), 3);
                        return;
                    } else {
                        ItemData itemData = new ItemData(null, pagePreviewVO.getNoteId(), pagePreviewVO.getId(), 2, 1);
                        com.orion.notein.p607ui.notelist.OooO00o oooO00o2 = editorPreviewFragment.f75911Oooo0oO;
                        if (oooO00o2 != null) {
                            oooO00o2.OooO0o0(view, labelList, itemData, 0);
                            return;
                        } else {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("itemLabelListPopupWindow");
                            throw null;
                        }
                    }
                }
                return;
            case 2:
                C29825OooOoO0 c29825OooOoO0 = ((C29891OooO0o0) this.f88948OooOo).f106037OooO0O0;
                if (c29825OooOoO0 != null) {
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(view);
                    c29825OooOoO0.OooO00o(view);
                    return;
                }
                return;
            case 3:
                NoteListContainerFragment noteListContainerFragment = (NoteListContainerFragment) this.f88948OooOo;
                C30294OooO0OO c30294OooO0OO = noteListContainerFragment.f77364OooooOo;
                if (c30294OooO0OO == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("sortPopupWindow");
                    throw null;
                }
                c30294OooO0OO.OooO00o();
                InterfaceC21987OooOoo viewLifecycleOwner2 = noteListContainerFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner2), null, null, new NoteListContainerFragment.OooOOO(view, noteListContainerFragment, null), 3);
                return;
            case 4:
                TipsDialogFragment tipsDialogFragment = (TipsDialogFragment) this.f88948OooOo;
                if (tipsDialogFragment.f70464Oooo0o && tipsDialogFragment.f70463Oooo0OO && (interfaceC32507OooOO0o = tipsDialogFragment.f70465Oooo0o0) != null) {
                    interfaceC32507OooOO0o.invoke(Boolean.TRUE);
                }
                View.OnClickListener onClickListener = tipsDialogFragment.f70460Oooo00O;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                Dialog dialog = tipsDialogFragment.getDialog();
                if (dialog != null) {
                    dialog.dismiss();
                    return;
                }
                return;
            default:
                ((ScannedPageSelectDialogFragment) this.f88948OooOo).Oooo0(false);
                return;
        }
    }
}
