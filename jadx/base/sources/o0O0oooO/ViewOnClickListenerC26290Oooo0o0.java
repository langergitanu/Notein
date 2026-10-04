package o0O0oooO;

import Oooo0oO.C21030OooOO0o;
import android.content.Intent;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.core.os.BundleKt;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.MainActivity;
import com.orion.notein.domain.models.note.Note;
import com.orion.notein.domain.models.note.NoteContent;
import com.orion.notein.domain.models.note.NoteMeta;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.ClearPageAlertDialogFragment;
import com.orion.notein.p607ui.noteeditor.addtext.ImportFontDialogFragment;
import com.orion.notein.p607ui.noteeditor.hyperlinkeditor.dialog.HyperlinkTiledPagesFragment;
import com.orion.notein.p607ui.noteeditor.propertypanel.comment.EditorCommentFragment;
import com.orion.notein.p607ui.notelist.folder.MoveToFolderFragment;
import com.orion.notein.p607ui.p609vo.TiledPagePreviewVO;
import o0Oo00o.C28026OooO0OO;
import o0Ooo00.C29327OooO0Oo;
import o0o0O000.C30229OooOo0o;
import o0oOoOo.C31040OooOO0o;
import oO00ooO.C32443OooOOO;
import oO0o0OO.C33609OooO0oo;
import oO0o0Oo.C33781o00o0O;

/* JADX INFO: renamed from: o0O0oooO.Oooo0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class ViewOnClickListenerC26290Oooo0o0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f90125OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f90126OooOo0o;

    public /* synthetic */ ViewOnClickListenerC26290Oooo0o0(Object obj, int i) {
        this.f90126OooOo0o = i;
        this.f90125OooOo = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f90126OooOo0o) {
            case 0:
                ((MainActivity) this.f90125OooOo).navigateToCloudSyncLoginFragment();
                return;
            case 1:
                ImageView imageView = ((ClearPageAlertDialogFragment) this.f90125OooOo).f72767OooOooO;
                if (imageView != null) {
                    imageView.setActivated(!imageView.isActivated());
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("clearQuotes");
                    throw null;
                }
            case 2:
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.addCategory("android.intent.category.OPENABLE");
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                MimeTypeMap singleton = MimeTypeMap.getSingleton();
                intent.setType((singleton.hasExtension("ttf") && singleton.hasExtension("otf")) ? "font/ttf" : "application/octet-stream");
                ((ImportFontDialogFragment) this.f90125OooOo).f73988Oooo0OO.OooO00o(intent);
                return;
            case 3:
                Object tag = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.TiledPagePreviewVO");
                TiledPagePreviewVO tiledPagePreviewVO = (TiledPagePreviewVO) tag;
                if (tiledPagePreviewVO.getSelectable()) {
                    boolean zIsSelected = tiledPagePreviewVO.isSelected();
                    HyperlinkTiledPagesFragment hyperlinkTiledPagesFragment = (HyperlinkTiledPagesFragment) this.f90125OooOo;
                    if (zIsSelected) {
                        C33781o00o0O c33781o00o0O = hyperlinkTiledPagesFragment.OooOoo0().f104023OooO0oo;
                        c33781o00o0O.getClass();
                        c33781o00o0O.OooOO0(null, "");
                        return;
                    } else {
                        C29327OooO0Oo c29327OooO0OoOooOoo0 = hyperlinkTiledPagesFragment.OooOoo0();
                        String pageId = tiledPagePreviewVO.getId();
                        kotlin.jvm.internal.OooOOO0.OooO0oO(pageId, "pageId");
                        C33781o00o0O c33781o00o0O2 = c29327OooO0OoOooOoo0.f104023OooO0oo;
                        c33781o00o0O2.getClass();
                        c33781o00o0O2.OooOO0(null, pageId);
                        return;
                    }
                }
                return;
            case 4:
                EditorCommentFragment editorCommentFragment = (EditorCommentFragment) this.f90125OooOo;
                EditText editText = editorCommentFragment.f75722Oooo000;
                if (editText == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("searchView");
                    throw null;
                }
                editText.setText("");
                NoteContent noteContent = (NoteContent) editorCommentFragment.OooOoo0().f73396OoooOoO.f121747OooOo0o.getValue();
                if (noteContent == null) {
                    return;
                }
                C28026OooO0OO.OooO00o(C21030OooOO0o.OooO0OO(editorCommentFragment), R.id.tiledPageEditorFragment, BundleKt.bundleOf(new C32443OooOOO(NoteMeta.PROPERTY_NOTE_ID, noteContent.getId()), new C32443OooOOO(Note.KEY_INITIAL_PAGE_INDEX, Integer.valueOf(noteContent.getSavedPageIndex())), new C32443OooOOO("pageIndex", Integer.valueOf(noteContent.getSavedPageIndex()))));
                editorCommentFragment.OooOoo0().Oooo0o(1);
                return;
            default:
                Object tag2 = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag2, "null cannot be cast to non-null type com.orion.notein.ui.vo.FolderColorVO");
                MoveToFolderFragment moveToFolderFragment = (MoveToFolderFragment) this.f90125OooOo;
                InterfaceC21987OooOoo viewLifecycleOwner = moveToFolderFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C30229OooOo0o(((C31040OooOO0o) tag2).f110821OooO00o, moveToFolderFragment, null), 3);
                return;
        }
    }
}
