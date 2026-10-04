package o0OoO0oo;

import android.app.Dialog;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.fragment.app.Fragment;
import com.orion.notein.MainActivity;
import com.orion.notein.p607ui.noteeditor.ClearPageAlertDialogFragment;
import com.orion.notein.p607ui.noteeditor.propertypanel.comment.EditorCommentFragment;
import com.orion.notein.p607ui.notelist.folder.MoveToFolderFragment;

/* JADX INFO: renamed from: o0OoO0oo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28688OooO0Oo implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Fragment f101644OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f101645OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28688OooO0Oo(Fragment fragment, int i) {
        this.f101645OooOo0o = i;
        this.f101644OooOo = fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f101645OooOo0o) {
            case 0:
                Dialog dialog = ((ClearPageAlertDialogFragment) this.f101644OooOo).getDialog();
                if (dialog != null) {
                    dialog.dismiss();
                    return;
                }
                return;
            case 1:
                EditorCommentFragment editorCommentFragment = (EditorCommentFragment) this.f101644OooOo;
                EditText editText = editorCommentFragment.f75722Oooo000;
                if (editText == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("searchView");
                    throw null;
                }
                editText.clearFocus();
                ActivityC21897OooOo0 activity = editorCommentFragment.getActivity();
                MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
                if (mainActivity != null) {
                    mainActivity.showGuideVideo(2);
                    return;
                }
                return;
            default:
                MoveToFolderFragment moveToFolderFragment = (MoveToFolderFragment) this.f101644OooOo;
                if (moveToFolderFragment.f77661OooOooo) {
                    moveToFolderFragment.OooOoo0();
                    return;
                }
                moveToFolderFragment.OooOooO();
                EditText editText2 = moveToFolderFragment.f77669Oooo0o;
                if (editText2 != null) {
                    editText2.requestFocus();
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("inputNewFolderName");
                    throw null;
                }
        }
    }
}
