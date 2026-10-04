package o0OoO000;

import Oooo0oO.C21030OooOO0o;
import android.graphics.Point;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.core.os.BundleKt;
import androidx.fragment.app.C21904OooOoo0;
import androidx.fragment.app.Fragment;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.login.firebase.FirebaseCreateUserPasswordFragment;
import com.orion.notein.p607ui.noteeditor.NoteEditorContainerFragment;
import com.orion.notein.p607ui.noteeditor.propertypanel.outline.EditorOutlineFragment;
import com.orion.notein.p607ui.noteeditor.propertypanel.outline.OutlineVO;
import com.orion.notein.p607ui.notelist.documents.NoteListContainerFragment;
import com.orion.notein.p607ui.p609vo.NoteVO;
import java.util.Iterator;
import o0Oo00o.C28026OooO0OO;
import o0OoooOo.C29661OooOoo0;
import o0Ooooo0.C29705OooOO0;
import oO00ooO.C32443OooOOO;
import oO0o0Oo.C33781o00o0O;

/* JADX INFO: renamed from: o0OoO000.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28523OooO00o implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Fragment f101123OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f101124OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28523OooO00o(Fragment fragment, int i) {
        this.f101124OooOo0o = i;
        this.f101123OooOo = fragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f101124OooOo0o) {
            case 0:
                Bundle bundle = new Bundle();
                FirebaseCreateUserPasswordFragment firebaseCreateUserPasswordFragment = (FirebaseCreateUserPasswordFragment) this.f101123OooOo;
                C21904OooOoo0.OooO0o(bundle, firebaseCreateUserPasswordFragment, "key_firebase_login");
                C21030OooOO0o.OooO0OO(firebaseCreateUserPasswordFragment).OooOOo(R.id.firebaseUserAuthFragment, true);
                return;
            case 1:
                EditorOutlineFragment editorOutlineFragment = (EditorOutlineFragment) this.f101123OooOo;
                EditText editText = editorOutlineFragment.f75799Oooo000;
                if (editText == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("searchView");
                    throw null;
                }
                editText.clearFocus();
                Object tag = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.noteeditor.propertypanel.outline.OutlineVO");
                OutlineVO outlineVO = (OutlineVO) tag;
                int id = view.getId();
                if (id == R.id.btn_more) {
                    EditText editText2 = editorOutlineFragment.f75799Oooo000;
                    if (editText2 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("searchView");
                        throw null;
                    }
                    editText2.clearFocus();
                    C29661OooOoo0 c29661OooOoo0 = editorOutlineFragment.f75806Oooo0oO;
                    if (c29661OooOoo0 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("morePopupWindow");
                        throw null;
                    }
                    synchronized (c29661OooOoo0) {
                        try {
                            Iterator it = c29661OooOoo0.f105176OooO0OO.iterator();
                            while (it.hasNext()) {
                                ((View) it.next()).setTag(outlineVO);
                            }
                            c29661OooOoo0.OooO00o(view);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                }
                if (id == R.id.expand_icon) {
                    editorOutlineFragment.OooOooO().OooO0oO(outlineVO);
                    return;
                }
                if (outlineVO.getId().length() > 0) {
                    C29705OooOO0 c29705OooOO0OooOooO = editorOutlineFragment.OooOooO();
                    String id2 = outlineVO.getId();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(id2, "id");
                    C33781o00o0O c33781o00o0O = c29705OooOO0OooOooO.f105294OooOO0;
                    c33781o00o0O.getClass();
                    c33781o00o0O.OooOO0(null, id2);
                    int pageIndex = outlineVO.getPageIndex();
                    Point point = new Point(0, 0);
                    Fragment parentFragment = editorOutlineFragment.getParentFragment();
                    Fragment parentFragment2 = parentFragment != null ? parentFragment.getParentFragment() : null;
                    NoteEditorContainerFragment noteEditorContainerFragment = parentFragment2 instanceof NoteEditorContainerFragment ? (NoteEditorContainerFragment) parentFragment2 : null;
                    if (noteEditorContainerFragment == null) {
                        return;
                    }
                    noteEditorContainerFragment.Oooo0o0(BundleKt.bundleOf(new C32443OooOOO("page_index", Integer.valueOf(pageIndex)), new C32443OooOOO("offset_x", Integer.valueOf(point.x)), new C32443OooOOO("offset_y", Integer.valueOf(point.y)), new C32443OooOOO("isCenter", Boolean.FALSE)));
                    return;
                }
                return;
            default:
                NoteListContainerFragment noteListContainerFragment = (NoteListContainerFragment) this.f101123OooOo;
                C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(noteListContainerFragment), new o0o00oo.Oooo0((NoteVO) ((C32443OooOOO) noteListContainerFragment.OooOoo().f77161OoooO00.getValue()).f116638OooOo0o));
                return;
        }
    }
}
