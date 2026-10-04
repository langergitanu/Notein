package o0OoO0oo;

import OooOoo.C20593OooO0Oo;
import Oooo0oO.C21030OooOO0o;
import Oooo0oO.C21111o0ooOoO;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import androidx.core.content.FileProvider;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import com.orion.editor.PDFView;
import com.orion.notein.domain.models.note.Note;
import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.image.ImportImagesFragment;
import com.orion.notein.p607ui.noteeditor.NavEditorLayoutInfo;
import com.orion.notein.p607ui.noteeditor.NoteEditorContainerFragment;
import com.orion.notein.p607ui.noteeditor.NoteEditorFragment;
import com.orion.notein.p607ui.noteeditor.view.NoteEditorContainer;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import o000o0O0.C24572OooOO0o;
import o000o0O0.C24583OooOo0o;
import oO00ooO.C32443OooOOO;
import oO0OOooo.C33163OooO0oO;
import oO0o0OO.C33609OooO0oo;

/* JADX INFO: renamed from: o0OoO0oo.o00000o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C28755o00000o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ NoteEditorContainerFragment f101844OooO00o;

    public C28755o00000o0(NoteEditorContainerFragment noteEditorContainerFragment) {
        this.f101844OooO00o = noteEditorContainerFragment;
    }

    public final void OooO00o(int i) {
        NoteEditorContainerFragment noteEditorContainerFragment = this.f101844OooO00o;
        Context context = noteEditorContainerFragment.getContext();
        if (context == null) {
            return;
        }
        C33609OooO0oo.OooO0OO(C28982oo0o0Oo.OooO00o(noteEditorContainerFragment, "getViewLifecycleOwner(...)"), null, null, new C28748o000000(i, noteEditorContainerFragment, (C33163OooO0oO) context, null), 3);
    }

    public final void OooO0O0() {
        Uri uriForFile;
        NoteEditorContainerFragment noteEditorContainerFragment = this.f101844OooO00o;
        ImportImagesFragment importImagesFragment = noteEditorContainerFragment.f72825OoooO0O;
        if (importImagesFragment != null) {
            importImagesFragment.f71860OooOooo = new C28918o00o0O(noteEditorContainerFragment, 0);
            String strOooO0O0 = C20593OooO0Oo.OooO0O0("photo-", new SimpleDateFormat("YYMMDDhhmmss").format(Long.valueOf(System.currentTimeMillis())), ".jpg");
            String packageName = importImagesFragment.requireActivity().getPackageName();
            if (Build.VERSION.SDK_INT >= 29) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("_display_name", strOooO0O0);
                contentValues.put("relative_path", Environment.DIRECTORY_PICTURES);
                uriForFile = importImagesFragment.requireActivity().getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
            } else {
                Context contextRequireContext = importImagesFragment.requireContext();
                String strOooO0Oo = C21111o0ooOoO.OooO0Oo(packageName, ".fileProvider");
                File externalCacheDir = importImagesFragment.requireActivity().getExternalCacheDir();
                kotlin.jvm.internal.OooOOO0.OooO0Oo(externalCacheDir);
                uriForFile = FileProvider.getUriForFile(contextRequireContext, strOooO0Oo, new File(externalCacheDir.getAbsolutePath(), strOooO0O0));
            }
            importImagesFragment.f71857OooOoo = uriForFile;
            if (uriForFile != null) {
                importImagesFragment.f71861Oooo000.OooO00o(uriForFile);
            }
        }
    }

    public final void OooO0OO() {
        NoteEditorContainerFragment noteEditorContainerFragment = this.f101844OooO00o;
        C33609OooO0oo.OooO0OO(C28982oo0o0Oo.OooO00o(noteEditorContainerFragment, "getViewLifecycleOwner(...)"), null, null, new C28750o000000o(noteEditorContainerFragment, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO0Oo() {
        NoteContent noteContent;
        NoteEditorFragment noteEditorFragment;
        int currentPage;
        NoteEditorContainerFragment noteEditorContainerFragment = this.f101844OooO00o;
        if (noteEditorContainerFragment.OooOooO()) {
            noteEditorContainerFragment.Oooo00O().Oooo0o(1);
            C24572OooOO0o c24572OooOO0oOooO0OO = C21030OooOO0o.OooO0OO(noteEditorContainerFragment);
            C24583OooOo0o c24583OooOo0oOooO0oO = c24572OooOO0oOooO0OO.OooO0oO();
            if (c24583OooOo0oOooO0oO == null || c24583OooOo0oOooO0oO.f83302OooOooO != R.id.noteEditorContainerFragment || (noteContent = (NoteContent) noteEditorContainerFragment.Oooo00O().f73396OoooOoO.f121747OooOo0o.getValue()) == null) {
                return;
            }
            ArrayList arrayListOooOOO0 = noteEditorContainerFragment.Oooo00O().OooOOO0();
            int iIntValue = ((Number) ((C32443OooOOO) noteEditorContainerFragment.Oooo00O().f73387Oooo0oo.getValue()).f116638OooOo0o).intValue();
            NoteEditorContainer noteEditorContainer = noteEditorContainerFragment.f72831OoooOoo;
            if (noteEditorContainer == null) {
                kotlin.jvm.internal.OooOOO0.OooOOOO("editorContainer");
                throw null;
            }
            NavEditorLayoutInfo navEditorLayoutInfo = new NavEditorLayoutInfo(arrayListOooOOO0, iIntValue, noteEditorContainer.getScreenIndicatorBias(), ((Number) noteEditorContainerFragment.Oooo00O().f73393OoooOOO.getValue()).intValue());
            int iIntValue2 = ((Number) noteEditorContainerFragment.Oooo00O().f73394OoooOOo.f121747OooOo0o.getValue()).intValue();
            if (iIntValue2 != -1) {
                Fragment fragmentOooOooO = noteEditorContainerFragment.getChildFragmentManager().OooOooO(iIntValue2);
                noteEditorFragment = fragmentOooOooO instanceof NoteEditorFragment ? (NoteEditorFragment) fragmentOooOooO : null;
            }
            if (noteEditorFragment != null) {
                PDFView pDFView = noteEditorFragment.f73015OoooO0;
                if (pDFView == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("editor");
                    throw null;
                }
                currentPage = pDFView.getCurrentPage();
            } else {
                currentPage = 0;
            }
            c24572OooOO0oOooO0OO.OooOOO0(R.id.tiledPageEditorFragment, BundleKt.bundleOf(new C32443OooOOO(NoteMeta.PROPERTY_NOTE_ID, noteContent.getId()), new C32443OooOOO("editor_layout", navEditorLayoutInfo), new C32443OooOOO("pageIndex", Integer.valueOf(currentPage)), new C32443OooOOO(Note.KEY_INITIAL_PAGE_INDEX, Integer.valueOf(noteContent.getSavedPageIndex()))), null);
        }
    }
}
