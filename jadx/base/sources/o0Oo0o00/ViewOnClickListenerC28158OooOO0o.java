package o0Oo0o00;

import android.view.View;
import android.widget.EditText;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.NoteEditorContainerFragment;
import com.orion.notein.p607ui.noteeditor.addpage.C23365OooO0Oo;
import com.orion.notein.p607ui.noteeditor.addpage.PDFPageSelectorDialogFragment;
import com.orion.notein.p607ui.noteeditor.toolbar.BaseToolbarChildFragment;
import com.orion.notein.p607ui.noteeditor.view.NoteEditorContainer;
import com.orion.notein.p607ui.notelist.folder.FolderCreationDialogFragment;
import com.orion.notein.p607ui.paperconfig.StandardTemplateFragment;
import o000oooO.C24755OooO00o;
import o0OoO0oo.C28755o00000o0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0OO.C33609OooO0oo;
import oO0o0Oo.C33781o00o0O;

/* JADX INFO: renamed from: o0Oo0o00.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28158OooOO0o implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f99784OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f99785OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28158OooOO0o(Object obj, int i) {
        this.f99785OooOo0o = i;
        this.f99784OooOo = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f99785OooOo0o) {
            case 0:
                ((InterfaceC32507OooOO0o) this.f99784OooOo).invoke(Boolean.FALSE);
                return;
            case 1:
                final StandardTemplateFragment standardTemplateFragment = (StandardTemplateFragment) ((C24755OooO00o) this.f99784OooOo).f83961OooOo0o;
                standardTemplateFragment.OooOoO0(1, new oO0O000o.OooO00o() { // from class: o0o0OOO.o000OO
                    @Override // oO0O000o.OooO00o
                    public final Object invoke() {
                        StandardTemplateFragment standardTemplateFragment2 = standardTemplateFragment;
                        InterfaceC21987OooOoo viewLifecycleOwner = standardTemplateFragment2.getViewLifecycleOwner();
                        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C30525o0000OOo(standardTemplateFragment2, null), 3);
                        return C32460OooOooO.f116667OooO00o;
                    }
                });
                return;
            case 2:
                int id = view.getId();
                PDFPageSelectorDialogFragment pDFPageSelectorDialogFragment = (PDFPageSelectorDialogFragment) this.f99784OooOo;
                switch (id) {
                    case R.id.btn_page_backward /* 2131296898 */:
                        C23365OooO0Oo c23365OooO0OoOooo00o = pDFPageSelectorDialogFragment.Oooo00o();
                        int iIntValue = ((Number) c23365OooO0OoOooo00o.f73889OooOO0.getValue()).intValue();
                        if (iIntValue > 1) {
                            Integer numValueOf = Integer.valueOf(iIntValue - 1);
                            C33781o00o0O c33781o00o0O = c23365OooO0OoOooo00o.f73883OooO;
                            c33781o00o0O.getClass();
                            c33781o00o0O.OooOO0(null, numValueOf);
                            return;
                        }
                        return;
                    case R.id.btn_page_backward_to_start /* 2131296899 */:
                        C33781o00o0O c33781o00o0O2 = pDFPageSelectorDialogFragment.Oooo00o().f73883OooO;
                        c33781o00o0O2.getClass();
                        c33781o00o0O2.OooOO0(null, 1);
                        return;
                    case R.id.btn_page_forward /* 2131296900 */:
                        C23365OooO0Oo c23365OooO0OoOooo00o2 = pDFPageSelectorDialogFragment.Oooo00o();
                        int iIntValue2 = ((Number) c23365OooO0OoOooo00o2.f73889OooOO0.getValue()).intValue();
                        if (iIntValue2 < ((Number) c23365OooO0OoOooo00o2.f73892OooOOO.f121747OooOo0o.getValue()).intValue()) {
                            Integer numValueOf2 = Integer.valueOf(iIntValue2 + 1);
                            C33781o00o0O c33781o00o0O3 = c23365OooO0OoOooo00o2.f73883OooO;
                            c33781o00o0O3.getClass();
                            c33781o00o0O3.OooOO0(null, numValueOf2);
                            return;
                        }
                        return;
                    case R.id.btn_page_forward_to_end /* 2131296901 */:
                        C23365OooO0Oo c23365OooO0OoOooo00o3 = pDFPageSelectorDialogFragment.Oooo00o();
                        c23365OooO0OoOooo00o3.f73883OooO.setValue(c23365OooO0OoOooo00o3.f73892OooOOO.f121747OooOo0o.getValue());
                        return;
                    default:
                        return;
                }
            case 3:
                C28755o00000o0 c28755o00000o0 = ((BaseToolbarChildFragment) this.f99784OooOo).f76506o000oOoO;
                if (c28755o00000o0 != null) {
                    NoteEditorContainerFragment noteEditorContainerFragment = c28755o00000o0.f101844OooO00o;
                    NoteEditorContainerFragment.Oooo0(noteEditorContainerFragment);
                    if (((Number) noteEditorContainerFragment.Oooo00O().f73408o000000.getValue()).intValue() == 0) {
                        noteEditorContainerFragment.Oooo00O().Oooo0o(1);
                        return;
                    } else {
                        noteEditorContainerFragment.Oooo00O().Oooo0o(0);
                        return;
                    }
                }
                return;
            case 4:
                NoteEditorContainer.OooO00o oooO00o = ((NoteEditorContainer) this.f99784OooOo).f76983Oooo0OO;
                if (oooO00o != null) {
                    oooO00o.OooO0oO();
                    return;
                }
                return;
            default:
                EditText editText = ((FolderCreationDialogFragment) this.f99784OooOo).f77601Oooo0OO;
                if (editText != null) {
                    editText.setText("");
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("inputName");
                    throw null;
                }
        }
    }
}
