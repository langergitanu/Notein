package o0O0oooO;

import Oooo0oO.C21030OooOO0o;
import android.view.View;
import android.widget.EditText;
import androidx.core.os.BundleKt;
import com.orion.notein.MainActivity;
import com.orion.notein.domain.models.note.Note;
import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.export.ExportBottomSheetFragment;
import com.orion.notein.p607ui.noteeditor.addtext.textstylebox.OooO00o;
import com.orion.notein.p607ui.noteeditor.propertypanel.preview.EditorPreviewFragment;
import com.orion.notein.p607ui.notelist.PdfPasswordDialogFragment;
import com.orion.notein.p607ui.paperconfig.PaperConfigTemplateFragment;
import o0Oo00o.C28026OooO0OO;
import o0o00O0O.C29874OooO0o0;
import o0oOoOo.C31087Oooooo0;
import oO00ooO.C32443OooOOO;
import oO0o0Oo.C33781o00o0O;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class o0OoOo0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f90450OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f90451OooOo0o;

    public /* synthetic */ o0OoOo0(Object obj, int i) {
        this.f90451OooOo0o = i;
        this.f90450OooOo = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        OooO00o.InterfaceC19278OooO00o interfaceC19278OooO00o;
        switch (this.f90451OooOo0o) {
            case 0:
                ((MainActivity) this.f90450OooOo).goBrowserToDownloadLatestNoteIn();
                return;
            case 1:
                ((ExportBottomSheetFragment) this.f90450OooOo).dismissAllowingStateLoss();
                return;
            case 2:
                int id = view.getId();
                com.orion.notein.p607ui.noteeditor.addtext.textstylebox.OooO00o oooO00o = (com.orion.notein.p607ui.noteeditor.addtext.textstylebox.OooO00o) this.f90450OooOo;
                if (id != R.id.btn_delete) {
                    Object tag = view.getTag();
                    C31087Oooooo0 c31087Oooooo0 = tag instanceof C31087Oooooo0 ? (C31087Oooooo0) tag : null;
                    if (c31087Oooooo0 == null || ((Boolean) oooO00o.OooO0OO().f103125OooO0Oo.getValue()).booleanValue() || (interfaceC19278OooO00o = oooO00o.f74088OooO0O0) == null) {
                        return;
                    }
                    interfaceC19278OooO00o.OooO0Oo(c31087Oooooo0);
                    return;
                }
                Object tag2 = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag2, "null cannot be cast to non-null type com.orion.notein.ui.vo.TextFontVO");
                C31087Oooooo0 c31087Oooooo02 = (C31087Oooooo0) tag2;
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("TextFontPopupWindow");
                c20358OooO00o.OooO00o("Delete font, vo : " + c31087Oooooo02 + ".", new Object[0]);
                OooO00o.InterfaceC19278OooO00o interfaceC19278OooO00o2 = oooO00o.f74088OooO0O0;
                if (interfaceC19278OooO00o2 != null) {
                    interfaceC19278OooO00o2.OooO0OO(c31087Oooooo02.f110946OooO00o);
                    return;
                }
                return;
            case 3:
                EditorPreviewFragment editorPreviewFragment = (EditorPreviewFragment) this.f90450OooOo;
                EditText editText = editorPreviewFragment.f75903Oooo0;
                if (editText == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("searchView");
                    throw null;
                }
                editText.setText("");
                NoteContent noteContent = (NoteContent) editorPreviewFragment.OooOoo0().f73396OoooOoO.f121747OooOo0o.getValue();
                if (noteContent == null) {
                    return;
                }
                C28026OooO0OO.OooO00o(C21030OooOO0o.OooO0OO(editorPreviewFragment), R.id.tiledPageEditorFragment, BundleKt.bundleOf(new C32443OooOOO(NoteMeta.PROPERTY_NOTE_ID, noteContent.getId()), new C32443OooOOO(Note.KEY_INITIAL_PAGE_INDEX, Integer.valueOf(noteContent.getSavedPageIndex())), new C32443OooOOO("pageIndex", Integer.valueOf(editorPreviewFragment.f75913OoooO))));
                editorPreviewFragment.OooOoo0().Oooo0o(1);
                return;
            case 4:
                C29874OooO0o0.OooO00o oooO00o2 = ((C29874OooO0o0) this.f90450OooOo).f106007OooO0O0;
                if (oooO00o2 != null) {
                    oooO00o2.OooO00o();
                    return;
                }
                return;
            case 5:
                EditText editText2 = ((PdfPasswordDialogFragment) this.f90450OooOo).f77291Oooo0O0;
                if (editText2 != null) {
                    editText2.setText("");
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("inputPassword");
                    throw null;
                }
            default:
                C33781o00o0O c33781o00o0O = ((PaperConfigTemplateFragment) this.f90450OooOo).OooOooo().f109023OooOoo0;
                c33781o00o0O.getClass();
                c33781o00o0O.OooOO0(null, 1);
                return;
        }
    }
}
