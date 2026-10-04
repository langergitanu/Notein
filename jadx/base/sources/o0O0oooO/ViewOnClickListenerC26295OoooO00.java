package o0O0oooO;

import android.graphics.Point;
import android.view.View;
import android.widget.EditText;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.MainActivity;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.login.BaseGetPhoneVerificationFragment;
import com.orion.notein.p607ui.noteeditor.NoteEditorContainerFragment;
import com.orion.notein.p607ui.noteeditor.propertypanel.comment.CommentVO;
import com.orion.notein.p607ui.noteeditor.propertypanel.comment.EditorCommentFragment;
import com.orion.notein.p607ui.notelist.folder.MoveToFolderFragment;
import com.orion.notein.p607ui.user.settings.phone.change.RequestNewPhoneCodeFragment;
import java.util.Iterator;
import o0Oo.C28022OooOOO0;
import o0Oo0ooo.C28472OooO0oo;
import o0Oo0ooo.C28489OooOoO0;
import o0OoOOO0.C29048OooO0oo;
import o0OoooOo.C29652OooOOoo;
import o0OoooOo.C29661OooOoo0;
import oO00ooO.C32443OooOOO;
import oO0o0OO.C33609OooO0oo;
import oO0o0Oo.C33781o00o0O;

/* JADX INFO: renamed from: o0O0oooO.OoooO00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class ViewOnClickListenerC26295OoooO00 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f90130OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f90131OooOo0o;

    public /* synthetic */ ViewOnClickListenerC26295OoooO00(Object obj, int i) {
        this.f90131OooOo0o = i;
        this.f90130OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f90131OooOo0o) {
            case 0:
                ((MainActivity) this.f90130OooOo).closeDrawerAndNavigateToAccountSettingsFragment();
                return;
            case 1:
                BaseGetPhoneVerificationFragment baseGetPhoneVerificationFragment = (BaseGetPhoneVerificationFragment) this.f90130OooOo;
                boolean z = baseGetPhoneVerificationFragment instanceof RequestNewPhoneCodeFragment;
                C22026ooOO c22026ooOO = baseGetPhoneVerificationFragment.f72105OooOoOO;
                if (!z) {
                    C28489OooOoO0.OooO0oo(baseGetPhoneVerificationFragment.OooOoOO(), (String) ((C28022OooOOO0) c22026ooOO.getValue()).f99369OooO0o.getValue(), BaseGetPhoneVerificationFragment.OooOooo(baseGetPhoneVerificationFragment.OooOoO().getText()), 4);
                    return;
                }
                String str = (String) ((C28022OooOOO0) c22026ooOO.getValue()).f99369OooO0o.getValue();
                String strOooOooo = BaseGetPhoneVerificationFragment.OooOooo(baseGetPhoneVerificationFragment.OooOoO().getText());
                InterfaceC21987OooOoo viewLifecycleOwner = baseGetPhoneVerificationFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C28472OooO0oo(baseGetPhoneVerificationFragment, str, strOooOooo, null), 3);
                return;
            case 2:
                ((C29048OooO0oo) this.f90130OooOo).getClass();
                return;
            case 3:
                EditorCommentFragment editorCommentFragment = (EditorCommentFragment) this.f90130OooOo;
                EditText editText = editorCommentFragment.f75722Oooo000;
                if (editText == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("searchView");
                    throw null;
                }
                editText.clearFocus();
                Object tag = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.noteeditor.propertypanel.comment.CommentVO");
                CommentVO commentVO = (CommentVO) tag;
                if (view.getId() != R.id.btn_more) {
                    C29652OooOOoo c29652OooOOooOooOoo = editorCommentFragment.OooOoo();
                    String id = commentVO.getId();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(id, "id");
                    C33781o00o0O c33781o00o0O = c29652OooOOooOooOoo.f105137OooOO0O;
                    c33781o00o0O.getClass();
                    c33781o00o0O.OooOO0(null, id);
                    int pageIndex = commentVO.getPageIndex();
                    Point offset = commentVO.getOffset();
                    Fragment parentFragment = editorCommentFragment.getParentFragment();
                    Fragment parentFragment2 = parentFragment != null ? parentFragment.getParentFragment() : null;
                    NoteEditorContainerFragment noteEditorContainerFragment = parentFragment2 instanceof NoteEditorContainerFragment ? (NoteEditorContainerFragment) parentFragment2 : null;
                    if (noteEditorContainerFragment == null) {
                        return;
                    }
                    noteEditorContainerFragment.Oooo0o0(BundleKt.bundleOf(new C32443OooOOO("page_index", Integer.valueOf(pageIndex)), new C32443OooOOO("offset_x", Integer.valueOf(offset.x)), new C32443OooOOO("offset_y", Integer.valueOf(offset.y))));
                    return;
                }
                EditText editText2 = editorCommentFragment.f75722Oooo000;
                if (editText2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("searchView");
                    throw null;
                }
                editText2.clearFocus();
                C29661OooOoo0 c29661OooOoo0 = editorCommentFragment.f75729Oooo0oO;
                if (c29661OooOoo0 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("morePopupWindow");
                    throw null;
                }
                synchronized (c29661OooOoo0) {
                    try {
                        Iterator it = c29661OooOoo0.f105176OooO0OO.iterator();
                        while (it.hasNext()) {
                            ((View) it.next()).setTag(commentVO);
                        }
                        c29661OooOoo0.OooO00o(view);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                ((MoveToFolderFragment) this.f90130OooOo).OooOoo();
                return;
        }
    }
}
