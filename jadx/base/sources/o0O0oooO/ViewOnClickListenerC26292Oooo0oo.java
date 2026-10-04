package o0O0oooO;

import Oooo0oO.C21030OooOO0o;
import android.view.View;
import android.widget.EditText;
import com.orion.notein.MainActivity;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.datasync.CloudSyncLoginDialogFragment;
import com.orion.notein.p607ui.login.verificationcode.PhoneCodeLoginFragment;
import com.orion.notein.p607ui.noteeditor.hyperlinkeditor.dialog.NoteTreeSelectionFragment;
import com.orion.notein.p607ui.noteeditor.propertypanel.comment.EditorCommentFragment;
import o000o0O0.C24564OooO00o;
import o0Oo00o.C28026OooO0OO;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0O0oooO.Oooo0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class ViewOnClickListenerC26292Oooo0oo implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f90127OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f90128OooOo0o;

    public /* synthetic */ ViewOnClickListenerC26292Oooo0oo(Object obj, int i) {
        this.f90128OooOo0o = i;
        this.f90127OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f90128OooOo0o) {
            case 0:
                ((MainActivity) this.f90127OooOo).closeDrawerAndNavigateToPayFragment();
                return;
            case 1:
                ((CloudSyncLoginDialogFragment) this.f90127OooOo).dismissAllowingStateLoss();
                return;
            case 2:
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("NoteTreeSelection");
                c20358OooO00o.OooO0o0("NoteTreeSelectionFragment cancel.", new Object[0]);
                ((NoteTreeSelectionFragment) this.f90127OooOo).dismiss();
                return;
            case 3:
                EditText editText = ((EditorCommentFragment) this.f90127OooOo).f75722Oooo000;
                if (editText != null) {
                    editText.setText("");
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("searchView");
                    throw null;
                }
            default:
                C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO((PhoneCodeLoginFragment) this.f90127OooOo), new C24564OooO00o(R.id.action_phoneCodeLoginFragment_to_passwordLogin));
                return;
        }
    }
}
