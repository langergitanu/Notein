package o0Oo0Ooo;

import Oooo0oO.C21030OooOO0o;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import androidx.lifecycle.o0OoOo0;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.creative_library.purchase.OooO0o;
import com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.EditorChatFragment;
import com.orion.notein.p607ui.settings.debug.DebugFragment;
import com.orion.notein.p607ui.user.UserInfoFragment;
import java.util.concurrent.CancellationException;
import o0000oOO.AbstractC24338OooO0o0;
import o000o0O0.C24564OooO00o;
import o0Oo00o.C28026OooO0OO;
import o0Oo0ooO.ViewOnClickListenerC28413OooO0oO;
import o0OoO0OO.AlertDialogC28626OooOoO0;
import o0Oooo.C29599OooOO0O;
import o0o0O00.C30185OooO00o;
import o0o0OO0o.C30455OooO0Oo;
import oO00ooO.C32443OooOOO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.o00000OO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0Oo0Ooo.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28139OooO0o implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f99749OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f99750OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28139OooO0o(Object obj, int i) {
        this.f99750OooOo0o = i;
        this.f99749OooOo = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f99749OooOo;
        switch (this.f99750OooOo0o) {
            case 0:
                com.orion.notein.p607ui.creative_library.purchase.OooO00o oooO00o = (com.orion.notein.p607ui.creative_library.purchase.OooO00o) obj;
                if (kotlin.jvm.internal.OooOOO0.OooO0O0(((OooO0o.OooO0OO) oooO00o.f71333OooO0OO.f71373OooO0o.f121747OooOo0o.getValue()).f71394OooO0Oo, OooO0o.OooO00o.C23069OooO0Oo.f71381OooO00o)) {
                    return;
                }
                oooO00o.f71356OooOoOO = 1;
                oooO00o.OooO0Oo(1);
                o00000OO o00000oo2 = oooO00o.f71354OooOoO;
                if (o00000oo2 != null) {
                    o00000oo2.cancel((CancellationException) null);
                    return;
                }
                return;
            case 1:
                ((AlertDialogC28626OooOoO0) obj).dismiss();
                return;
            case 2:
                EditorChatFragment editorChatFragment = (EditorChatFragment) obj;
                EditText editText = editorChatFragment.f75502OooOooo;
                if (editText == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("inputText");
                    throw null;
                }
                String message = editText.getText().toString();
                if (TextUtils.isEmpty(message)) {
                    return;
                }
                if (((Number) ((C32443OooOOO) editorChatFragment.OooOoO().f75603OooOOOo.f121747OooOo0o.getValue()).f116638OooOo0o).intValue() <= 0) {
                    if (editorChatFragment.OooOoO().f75616OooOoo0.get()) {
                        C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(editorChatFragment), new C24564OooO00o(R.id.action_noteEditorContainerFragment_to_aiQuotaPayDialogFragment));
                        return;
                    }
                    return;
                }
                com.orion.notein.p607ui.noteeditor.propertypanel.p608ai.OooO00o oooO00oOooOoO = editorChatFragment.OooOoO();
                kotlin.jvm.internal.OooOOO0.OooO0oO(message, "message");
                InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(oooO00oOooOoO);
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C29599OooOO0O(oooO00oOooOoO, message, null), 2);
                EditText editText2 = editorChatFragment.f75502OooOooo;
                if (editText2 != null) {
                    editText2.getText().clear();
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("inputText");
                    throw null;
                }
            case 3:
                ((C30185OooO00o) obj).f107468OooO0O0.f107496OooO0O0.Oooo000(1);
                return;
            case 4:
                ViewOnClickListenerC28413OooO0oO viewOnClickListenerC28413OooO0oO = ((C30455OooO0Oo) obj).f108752OooO0OO;
                if (viewOnClickListenerC28413OooO0oO != null) {
                    viewOnClickListenerC28413OooO0oO.onClick(view);
                    return;
                }
                return;
            case 5:
                AbstractC24338OooO0o0.OooO00o<Boolean> oooO00o2 = DebugFragment.f79020Oooo0OO;
                C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO((DebugFragment) obj), new C24564OooO00o(R.id.action_to_debugImportedImageListFragment));
                return;
            default:
                C21030OooOO0o.OooO0OO((UserInfoFragment) obj).OooOOo0();
                return;
        }
    }
}
