package o0O0oooO;

import Oooo0oO.C21030OooOO0o;
import android.view.View;
import android.widget.EditText;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.aspose.slides.C22201OooO0oO;
import com.orion.notein.MainActivity;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.login.verificationcode.PhoneCodeLoginFragment;
import com.orion.notein.p607ui.noteeditor.hyperlinkeditor.dialog.NoteTreeSelectionFragment;
import com.orion.notein.p607ui.noteeditor.propertypanel.comment.CommentVO;
import com.orion.notein.p607ui.noteeditor.propertypanel.comment.EditorCommentFragment;
import com.orion.notein.p607ui.notelist.NoteListFragment;
import com.orion.notein.ui.noteeditor.propertypanel.comment.EditorCommentFragment.OooO0O0;
import com.orion.notein.ui.noteeditor.propertypanel.comment.EditorCommentFragment.OooO0OO;
import o000o0O0.C24587OooOoo;
import o0Oo00o.C28026OooO0OO;
import o0Ooo000.C29340OooOOO;
import o0Ooo000.C29342OooOOOO;
import o0Ooo000.C29355OooOoo;
import o0OoooOo.C29661OooOoo0;
import o0ooOOO0.C31626OooO0o0;
import o0ooOOO0.C31630OooOO0O;
import oO0o0OO.C33609OooO0oo;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0O0oooO.Oooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class ViewOnClickListenerC26282Oooo implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f90118OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f90119OooOo0o;

    public /* synthetic */ ViewOnClickListenerC26282Oooo(Object obj, int i) {
        this.f90119OooOo0o = i;
        this.f90118OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f90119OooOo0o) {
            case 0:
                ((MainActivity) this.f90118OooOo).closeDrawerAndNavigateToFirebaseLoginFragment();
                return;
            case 1:
                NoteTreeSelectionFragment noteTreeSelectionFragment = (NoteTreeSelectionFragment) this.f90118OooOo;
                String noteId = (String) ((C29355OooOoo) noteTreeSelectionFragment.f74652OooOooO.getValue()).f104112OooO0oO.getValue();
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooO0o0(C22201OooO0oO.OooO0O0(c20358OooO00o, "NoteTreeSelection", "NoteTreeSelectionFragment confirmed, selectNoteId: ", noteId, "."), new Object[0]);
                String str = ((C29340OooOOO) noteTreeSelectionFragment.f74653OooOooo.getValue()).f104065OooO00o;
                kotlin.jvm.internal.OooOOO0.OooO0oO(noteId, "noteId");
                C28026OooO0OO.OooO0OO(C21030OooOO0o.OooO0OO(noteTreeSelectionFragment), new C29342OooOOOO(noteId, str), new C24587OooOoo(false, false, R.id.noteTreeSelectionFragment, true, false, -1, -1, -1, -1));
                return;
            case 2:
                EditorCommentFragment editorCommentFragment = (EditorCommentFragment) this.f90118OooOo;
                EditText editText = editorCommentFragment.f75722Oooo000;
                if (editText == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("searchView");
                    throw null;
                }
                editText.clearFocus();
                Object tag = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.noteeditor.propertypanel.comment.CommentVO");
                CommentVO commentVO = (CommentVO) tag;
                int id = view.getId();
                if (id == R.id.item_delete) {
                    InterfaceC21987OooOoo viewLifecycleOwner = editorCommentFragment.getViewLifecycleOwner();
                    kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, editorCommentFragment.new OooO0O0(commentVO, null), 3);
                } else if (id == R.id.item_edit) {
                    InterfaceC21987OooOoo viewLifecycleOwner2 = editorCommentFragment.getViewLifecycleOwner();
                    kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
                    C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner2), null, null, editorCommentFragment.new OooO0OO(commentVO, null), 3);
                }
                C29661OooOoo0 c29661OooOoo0 = editorCommentFragment.f75729Oooo0oO;
                if (c29661OooOoo0 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("morePopupWindow");
                    throw null;
                }
                synchronized (c29661OooOoo0) {
                    c29661OooOoo0.f105174OooO00o.dismiss();
                }
                return;
            case 3:
                NoteListFragment noteListFragment = (NoteListFragment) this.f90118OooOo;
                InterfaceC21987OooOoo viewLifecycleOwner3 = noteListFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner3), null, null, new NoteListFragment.C23622OooO0Oo(view, noteListFragment, null), 3);
                return;
            default:
                com.orion.notein.p607ui.login.verificationcode.OooO0OO oooO0OOOooOoO = ((PhoneCodeLoginFragment) this.f90118OooOo).OooOoO();
                C31626OooO0o0 c31626OooO0o0 = (C31626OooO0o0) oooO0OOOooOoO.f72635OooO0oo.getValue();
                if (c31626OooO0o0.f113062OooO0Oo || c31626OooO0o0.f113061OooO0OO.length() < 4) {
                    return;
                }
                C33609OooO0oo.OooO0OO(androidx.lifecycle.o0OoOo0.OooO00o(oooO0OOOooOoO), null, null, new C31630OooOO0O(oooO0OOOooOoO, null), 3);
                return;
        }
    }
}
