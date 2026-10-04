package o0O0o0oO;

import android.app.Dialog;
import android.view.View;
import android.widget.EditText;
import android.widget.SeekBar;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.editor.AbstractC22830OooO0Oo;
import com.orion.editor.PDFView;
import com.orion.notein.MainActivity;
import com.orion.notein.domain.models.papertheme.PaperTheme;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.TipsDialogFragment;
import com.orion.notein.p607ui.export.ExportDialogFragment;
import com.orion.notein.p607ui.noteeditor.addtext.textstylebox.C23383OooO0Oo;
import com.orion.notein.p607ui.noteeditor.pagelayereditor.PageLayerEditor;
import com.orion.notein.p607ui.noteeditor.propertypanel.preview.C23558OooO0oo;
import com.orion.notein.p607ui.noteeditor.propertypanel.preview.EditorPreviewFragment;
import com.orion.notein.p607ui.noteeditor.propertypanel.preview.PagePreviewVO;
import com.orion.notein.p607ui.ocr.dialog.ScannedPageSelectDialogFragment;
import com.orion.notein.p607ui.p609vo.ThemeVO;
import com.orion.notein.p607ui.paperconfig.StandardTemplateFragment;
import com.orion.penkit.models.LassoParams;
import java.util.List;
import o000oo0o.C24711OooO0Oo;
import o0O0oooo.C26395Oooo0o0;
import o0o0OO0.C30418Oooo0o0;
import o0oo0o.InterfaceC31284OooO0O0;
import oO00ooO.C32460OooOooO;
import oO0o0OO.C33609OooO0oo;
import oO0o0Oo.C33781o00o0O;

/* JADX INFO: renamed from: o0O0o0oO.OoooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class ViewOnClickListenerC26054OoooOoo implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f88944OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f88945OooOo0o;

    public /* synthetic */ ViewOnClickListenerC26054OoooOoo(Object obj, int i) {
        this.f88945OooOo0o = i;
        this.f88944OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f88945OooOo0o) {
            case 0:
                C26061Oooooo0 c26061Oooooo0 = (C26061Oooooo0) this.f88944OooOo;
                LassoParams lassoParams = c26061Oooooo0.f88960OooO0O0;
                if (lassoParams != null) {
                    PDFView pDFView = c26061Oooooo0.f88961OooO0OO.f88962OooO00o;
                    AbstractC22830OooO0Oo abstractC22830OooO0Oo = pDFView.f69170OooOooO;
                    pDFView.OooOoo0();
                    List<InterfaceC31284OooO0O0> selectRecords = lassoParams.getSelectedItems();
                    C26395Oooo0o0 c26395Oooo0o0 = abstractC22830OooO0Oo.f69109OooO0O0;
                    c26395Oooo0o0.getClass();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(selectRecords, "selectRecords");
                    c26395Oooo0o0.f90558OooO0oO.OooOOoo(selectRecords);
                    return;
                }
                return;
            case 1:
                ActivityC21897OooOo0 activity = ((ExportDialogFragment) this.f88944OooOo).getActivity();
                MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
                if (mainActivity != null) {
                    mainActivity.openMembershipPlans();
                    return;
                }
                return;
            case 2:
                SeekBar seekBar = ((C23383OooO0Oo) this.f88944OooOo).f74119OooO0o;
                seekBar.setProgress(seekBar.getProgress() + 1);
                return;
            case 3:
                PageLayerEditor.OooO00o oooO00o = ((PageLayerEditor) this.f88944OooOo).eventListener;
                if (oooO00o != null) {
                    oooO00o.OooO0OO();
                    return;
                }
                return;
            case 4:
                EditorPreviewFragment.OooOOO oooOOO = ((C23558OooO0oo) this.f88944OooOo).f76123OooO0O0;
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
                    if (pagePreviewVO.getClickTarget() != null) {
                        EditorPreviewFragment.OooOooO(editorPreviewFragment, pagePreviewVO.getIndex(), pagePreviewVO.getClickTarget(), 4);
                        return;
                    } else {
                        EditorPreviewFragment.OooOooO(editorPreviewFragment, pagePreviewVO.getIndex(), null, 2);
                        return;
                    }
                }
                return;
            case 5:
                Object tag2 = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag2, "null cannot be cast to non-null type com.orion.notein.ui.vo.ThemeVO");
                final ThemeVO themeVO = (ThemeVO) tag2;
                int id = view.getId();
                final StandardTemplateFragment standardTemplateFragment = (StandardTemplateFragment) this.f88944OooOo;
                if (id == R.id.iv_star) {
                    standardTemplateFragment.OooOoO0(21, new oO0O000o.OooO00o() { // from class: o0o0OOO.o0000O0O
                        @Override // oO0O000o.OooO00o
                        public final Object invoke() {
                            ThemeVO themeVO2 = themeVO;
                            int id2 = themeVO2.getPaperTheme().getCategory().getId();
                            int id3 = o0OOOO00.OooOO0O.f94361OooOOOO.getId();
                            StandardTemplateFragment standardTemplateFragment2 = standardTemplateFragment;
                            if (id2 == id3 || id2 == o0OOOO00.OooOO0O.f94368OooOo00.getId() || id2 == o0OOOO00.OooOO0O.f94367OooOo0.getId()) {
                                PaperTheme paperTheme = themeVO2.getPaperTheme();
                                InterfaceC21987OooOoo viewLifecycleOwner = standardTemplateFragment2.getViewLifecycleOwner();
                                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C30532o0000OoO(standardTemplateFragment2, paperTheme, null), 3);
                            } else if (themeVO2.getAvailableFromLocal()) {
                                PaperTheme paperTheme2 = themeVO2.getPaperTheme();
                                InterfaceC21987OooOoo viewLifecycleOwner2 = standardTemplateFragment2.getViewLifecycleOwner();
                                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
                                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner2), null, null, new C30532o0000OoO(standardTemplateFragment2, paperTheme2, null), 3);
                            } else {
                                InterfaceC21987OooOoo viewLifecycleOwner3 = standardTemplateFragment2.getViewLifecycleOwner();
                                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
                                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner3), null, null, new o0000OO(standardTemplateFragment2, themeVO2, null), 3);
                            }
                            return C32460OooOooO.f116667OooO00o;
                        }
                    });
                    return;
                }
                int id2 = themeVO.getPaperTheme().getCategory().getId();
                if (id2 == o0OOOO00.OooOO0O.f94361OooOOOO.getId()) {
                    standardTemplateFragment.OooOooo().OooOo0(themeVO.getPaperTheme());
                    return;
                }
                if (id2 == o0OOOO00.OooOO0O.f94368OooOo00.getId() || id2 == o0OOOO00.OooOO0O.f94367OooOo0.getId()) {
                    standardTemplateFragment.OooOoO0(19, new C24711OooO0Oo(1, standardTemplateFragment, themeVO));
                    return;
                } else {
                    if (id2 == o0OOOO00.OooOO0O.f94365OooOOoo.getId() || id2 == o0OOOO00.OooOO0O.f94364OooOOo0.getId() || id2 == o0OOOO00.OooOO0O.f94362OooOOOo.getId()) {
                        standardTemplateFragment.OooOoO0(19, new oO0O000o.OooO00o() { // from class: o0o0OOO.o0000oO
                            @Override // oO0O000o.OooO00o
                            public final Object invoke() {
                                ThemeVO themeVO2 = themeVO;
                                boolean availableFromLocal = themeVO2.getAvailableFromLocal();
                                StandardTemplateFragment standardTemplateFragment2 = standardTemplateFragment;
                                if (availableFromLocal) {
                                    standardTemplateFragment2.OooOooo().OooOo0(themeVO2.getPaperTheme());
                                } else {
                                    InterfaceC21987OooOoo viewLifecycleOwner = standardTemplateFragment2.getViewLifecycleOwner();
                                    kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                                    C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new o0000OO(standardTemplateFragment2, themeVO2, null), 3);
                                }
                                return C32460OooOooO.f116667OooO00o;
                            }
                        });
                        return;
                    }
                    return;
                }
            case 6:
                TipsDialogFragment tipsDialogFragment = (TipsDialogFragment) this.f88944OooOo;
                View.OnClickListener onClickListener = tipsDialogFragment.f70459Oooo000;
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
                int id3 = view.getId();
                ScannedPageSelectDialogFragment scannedPageSelectDialogFragment = (ScannedPageSelectDialogFragment) this.f88944OooOo;
                switch (id3) {
                    case R.id.btn_page_backward /* 2131296898 */:
                        scannedPageSelectDialogFragment.Oooo00o().OooOO0();
                        return;
                    case R.id.btn_page_backward_to_start /* 2131296899 */:
                        C33781o00o0O c33781o00o0O = scannedPageSelectDialogFragment.Oooo00o().f108653OooOO0O;
                        c33781o00o0O.getClass();
                        c33781o00o0O.OooOO0(null, 1);
                        return;
                    case R.id.btn_page_forward /* 2131296900 */:
                        scannedPageSelectDialogFragment.Oooo00o().OooO0oo();
                        return;
                    case R.id.btn_page_forward_to_end /* 2131296901 */:
                        C30418Oooo0o0 c30418Oooo0o0Oooo00o = scannedPageSelectDialogFragment.Oooo00o();
                        c30418Oooo0o0Oooo00o.f108653OooOO0O.setValue(c30418Oooo0o0Oooo00o.f108655OooOOO.getValue());
                        return;
                    default:
                        return;
                }
        }
    }
}
