package o0o00oo;

import android.app.Dialog;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import androidx.lifecycle.o0OoOo0;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.notelist.documents.NoteListContainerFragment;
import com.orion.notein.p607ui.notelist.search.NoteSearchView;
import com.orion.notein.p607ui.ocr.dialog.SessionRenameDialogFragment;
import com.orion.notein.p607ui.user.settings.home.UserSettingFragment;
import o00o00.C25206OooO0Oo;
import o0o0OO0.C30394OooOOOO;
import o0o0OO0.C30414Oooo00o;
import o0ooo.C31701OooOo0;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0o00oo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC30097OooO0Oo implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f107164OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f107165OooOo0o;

    public /* synthetic */ ViewOnClickListenerC30097OooO0Oo(Object obj, int i) {
        this.f107165OooOo0o = i;
        this.f107164OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f107164OooOo;
        switch (this.f107165OooOo0o) {
            case 0:
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("NoteListContainerFragment");
                c20358OooO00o.OooO0o0("select button clicked: select start", new Object[0]);
                ((NoteListContainerFragment) obj).OooOoo().Oooo000(1);
                return;
            case 1:
                NoteSearchView.OooO00o oooO00o = ((NoteSearchView) obj).f77983OooOoo0;
                if (oooO00o != null) {
                    oooO00o.onDismiss();
                    return;
                }
                return;
            case 2:
                ((UserSettingFragment) obj).OooOoo0();
                return;
            default:
                SessionRenameDialogFragment sessionRenameDialogFragment = (SessionRenameDialogFragment) obj;
                EditText editText = sessionRenameDialogFragment.f78404Oooo0OO;
                if (editText == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("inputName");
                    throw null;
                }
                Editable text = editText.getText();
                kotlin.jvm.internal.OooOOO0.OooO0Oo(text);
                if (text.length() == 0) {
                    Context contextRequireContext = sessionRenameDialogFragment.requireContext();
                    kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                    String string = sessionRenameDialogFragment.getString(R.string.toast_enter_a_filename);
                    kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                    C25206OooO0Oo.OooO0Oo(contextRequireContext, string);
                    return;
                }
                C30394OooOOOO c30394OooOOOO = (C30394OooOOOO) sessionRenameDialogFragment.f78401Oooo00O.getValue();
                String str = ((C31701OooOo0) sessionRenameDialogFragment.f78400Oooo000.getValue()).f113239OooO00o;
                String title = text.toString();
                kotlin.jvm.internal.OooOOO0.OooO0oO(title, "title");
                InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(c30394OooOOOO);
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C30414Oooo00o(c30394OooOOOO, str, title, null), 2);
                Dialog dialog = sessionRenameDialogFragment.getDialog();
                if (dialog != null) {
                    dialog.dismiss();
                    return;
                }
                return;
        }
    }
}
