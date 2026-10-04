package o0O0o0oO;

import Oooo0oO.C21030OooOO0o;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import com.orion.editor.AbstractC22830OooO0Oo;
import com.orion.editor.PDFView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.TipsDialogFragment;
import com.orion.notein.p607ui.noteeditor.addtext.textstylebox.C23383OooO0Oo;
import com.orion.notein.p607ui.noteeditor.propertypanel.preview.C23558OooO0oo;
import com.orion.notein.p607ui.noteeditor.propertypanel.preview.EditorPreviewFragment;
import com.orion.notein.p607ui.noteeditor.propertypanel.preview.PagePreviewVO;
import com.orion.notein.p607ui.notelist.documents.NoteListContainerFragment;
import com.orion.notein.p607ui.ocr.dialog.ScannedPageSelectDialogFragment;
import com.orion.penkit.models.LassoParams;
import java.util.Collections;
import java.util.List;
import o0O0o00.EnumC25982o0000oO;
import o0O0oooo.C26395Oooo0o0;
import o0OooooO.C29718OooO0O0;
import o0o000oo.C29825OooOoO0;
import o0o00OOo.C29891OooO0o0;
import o0o0O0o.C30294OooO0OO;
import o0oo0o.InterfaceC31284OooO0O0;

/* JADX INFO: renamed from: o0O0o0oO.Ooooo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class ViewOnClickListenerC26055Ooooo00 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f88946OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f88947OooOo0o;

    public /* synthetic */ ViewOnClickListenerC26055Ooooo00(Object obj, int i) {
        this.f88947OooOo0o = i;
        this.f88946OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f88947OooOo0o) {
            case 0:
                C26061Oooooo0 c26061Oooooo0 = (C26061Oooooo0) this.f88946OooOo;
                LassoParams lassoParams = c26061Oooooo0.f88960OooO0O0;
                if (lassoParams != null) {
                    C26062OoooooO c26062OoooooO = c26061Oooooo0.f88961OooO0OO;
                    PDFView pDFView = c26062OoooooO.f88962OooO00o;
                    AbstractC22830OooO0Oo abstractC22830OooO0Oo = pDFView.f69170OooOooO;
                    List<InterfaceC31284OooO0O0> selectRecords = lassoParams.getSelectedItems();
                    C26395Oooo0o0 c26395Oooo0o0 = abstractC22830OooO0Oo.f69109OooO0O0;
                    c26395Oooo0o0.getClass();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(selectRecords, "selectRecords");
                    c26395Oooo0o0.f90558OooO0oO.OooO(selectRecords);
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
                ((C23383OooO0Oo) this.f88946OooOo).f74119OooO0o.setProgress(r6.getProgress() - 1);
                return;
            case 2:
                EditorPreviewFragment.OooOOO oooOOO = ((C23558OooO0oo) this.f88946OooOo).f76123OooO0O0;
                if (oooOOO != null) {
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(view);
                    Object tag = view.getTag();
                    kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.noteeditor.propertypanel.preview.PagePreviewVO");
                    PagePreviewVO pagePreviewVO = (PagePreviewVO) tag;
                    EditorPreviewFragment editorPreviewFragment = EditorPreviewFragment.this;
                    EditText editText = editorPreviewFragment.f75903Oooo0;
                    if (editText == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("searchView");
                        throw null;
                    }
                    editText.clearFocus();
                    C29718OooO0O0 c29718OooO0O0 = editorPreviewFragment.f75916OoooO0O;
                    if (c29718OooO0O0 != null) {
                        c29718OooO0O0.OooO0O0(view, pagePreviewVO);
                        return;
                    } else {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("morePopupWindow");
                        throw null;
                    }
                }
                return;
            case 3:
                C29825OooOoO0 c29825OooOoO0 = ((C29891OooO0o0) this.f88946OooOo).f106037OooO0O0;
                if (c29825OooOoO0 != null) {
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(view);
                    c29825OooOoO0.OooO00o(view);
                    return;
                }
                return;
            case 4:
                C30294OooO0OO c30294OooO0OO = ((NoteListContainerFragment) this.f88946OooOo).f77364OooooOo;
                if (c30294OooO0OO == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("sortPopupWindow");
                    throw null;
                }
                kotlin.jvm.internal.OooOOO0.OooO0Oo(view);
                C30294OooO0OO.OooO0O0(c30294OooO0OO, view, 0, 6);
                return;
            case 5:
                TipsDialogFragment tipsDialogFragment = (TipsDialogFragment) this.f88946OooOo;
                boolean z = tipsDialogFragment.f70463Oooo0OO;
                tipsDialogFragment.f70463Oooo0OO = !z;
                ImageView imageView = tipsDialogFragment.f70458Oooo0;
                if (imageView != null) {
                    imageView.setImageResource(!z ? R.drawable.ic_tri_state_checkbox_checked : R.drawable.ic_tri_state_checkbox_unchecked);
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("checkboxIcon");
                    throw null;
                }
            default:
                C21030OooOO0o.OooO0OO((ScannedPageSelectDialogFragment) this.f88946OooOo).OooOOo0();
                return;
        }
    }
}
