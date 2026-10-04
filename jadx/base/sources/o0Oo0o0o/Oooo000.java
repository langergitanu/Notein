package o0Oo0o0o;

import Oooo0oO.C21030OooOO0o;
import android.view.View;
import android.widget.EditText;
import androidx.core.os.BundleKt;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.domain.models.note.Note;
import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.export.ExportDialogFragment;
import com.orion.notein.p607ui.noteeditor.addtext.textstylebox.TextStyleBox;
import com.orion.notein.p607ui.noteeditor.propertypanel.outline.EditorOutlineFragment;
import com.orion.notein.p607ui.notelist.documents.NoteListContainerFragment;
import com.orion.notein.p607ui.notelist.pdf.ImportBatchPdfDialogFragment;
import com.orion.notein.p607ui.paperconfig.StandardTemplateFragment;
import java.util.Set;
import o0Oo00o.C28026OooO0OO;
import o0o000oo.C29825OooOoO0;
import o0o00OOo.C29891OooO0o0;
import o0oOoOo.C31039OooOO0O;
import oO00ooO.C32443OooOOO;
import oO0o0OO.C33609OooO0oo;
import oO0o0Oo.C33781o00o0O;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class Oooo000 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f100113OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f100114OooOo0o;

    public /* synthetic */ Oooo000(Object obj, int i) {
        this.f100114OooOo0o = i;
        this.f100113OooOo = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f100114OooOo0o) {
            case 0:
                ExportDialogFragment exportDialogFragment = (ExportDialogFragment) this.f100113OooOo;
                InterfaceC21987OooOoo viewLifecycleOwner = exportDialogFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new ExportDialogFragment.OooO0O0(exportDialogFragment, null), 3);
                return;
            case 1:
                TextStyleBox.OooO0OO((TextStyleBox) this.f100113OooOo, view);
                return;
            case 2:
                EditorOutlineFragment editorOutlineFragment = (EditorOutlineFragment) this.f100113OooOo;
                EditText editText = editorOutlineFragment.f75799Oooo000;
                if (editText == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("searchView");
                    throw null;
                }
                editText.setText("");
                NoteContent noteContent = (NoteContent) editorOutlineFragment.OooOoo().f73396OoooOoO.f121747OooOo0o.getValue();
                if (noteContent == null) {
                    return;
                }
                C28026OooO0OO.OooO00o(C21030OooOO0o.OooO0OO(editorOutlineFragment), R.id.tiledPageEditorFragment, BundleKt.bundleOf(new C32443OooOOO(NoteMeta.PROPERTY_NOTE_ID, noteContent.getId()), new C32443OooOOO(Note.KEY_INITIAL_PAGE_INDEX, Integer.valueOf(noteContent.getSavedPageIndex())), new C32443OooOOO("pageIndex", Integer.valueOf(noteContent.getSavedPageIndex()))));
                editorOutlineFragment.OooOoo().Oooo0o(1);
                return;
            case 3:
                C29825OooOoO0 c29825OooOoO0 = ((C29891OooO0o0) this.f100113OooOo).f106037OooO0O0;
                if (c29825OooOoO0 != null) {
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(view);
                    c29825OooOoO0.OooO00o(view);
                    return;
                }
                return;
            case 4:
                NoteListContainerFragment noteListContainerFragment = (NoteListContainerFragment) this.f100113OooOo;
                com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo = noteListContainerFragment.OooOoo();
                if (noteListContainerFragment.f77378ooOO != null) {
                    oooO0OOOooOoo.Oooo0(!r6.isActivated());
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnListLayout");
                    throw null;
                }
            case 5:
                Object tag = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.FileTreeNodeVO");
                C31039OooOO0O c31039OooOO0O = (C31039OooOO0O) tag;
                o0o0O0O0.OooOOO0 oooOOO0OooOooo = ((ImportBatchPdfDialogFragment) this.f100113OooOo).OooOooo();
                String str = c31039OooOO0O.f110816OooO00o;
                if (c31039OooOO0O.f110818OooO0OO) {
                    oooOOO0OooOooo.OooO0o0(str);
                    return;
                }
                boolean zBooleanValue = ((Boolean) oooOOO0OooOooo.f107900OooO0o0.getValue()).booleanValue();
                C33781o00o0O c33781o00o0O = oooOOO0OooOooo.f107897OooO;
                Set setO0Oo0oo = oOo000Oo.OooOo.o0Oo0oo((Iterable) c33781o00o0O.getValue());
                if (!zBooleanValue) {
                    setO0Oo0oo.clear();
                    setO0Oo0oo.add(str);
                } else if (setO0Oo0oo.contains(str)) {
                    setO0Oo0oo.remove(str);
                } else {
                    setO0Oo0oo.add(str);
                }
                c33781o00o0O.OooOO0(null, setO0Oo0oo);
                return;
            default:
                ((StandardTemplateFragment) this.f100113OooOo).OooOooo().OooOoO(false);
                return;
        }
    }
}
