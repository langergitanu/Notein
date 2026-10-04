package o0OoO000;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.orion.notein.p607ui.login.firebase.FirebaseUserAuthFragment;
import com.orion.notein.p607ui.noteeditor.translate.TranslateDialogFragment;
import com.orion.notein.p607ui.notelist.fabbottomsheet.FabNoteTypeFragment;
import com.orion.notein.p607ui.notelist.recover.RecoverNoteFromCloudDialogFragment;
import o0o00oO.C29970OooOOo;
import o0o00oO.C29980OooOoo;
import o0o0O00.C30207OooOo;
import o0o0Oo00.C30603OooO0O0;
import o0oOoOo.C31043OooOOOO;
import o0oOoOoO.C31097OooO0Oo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0OoO000.OooooOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28568OooooOO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Fragment f101250OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f101251OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28568OooooOO(Fragment fragment, int i) {
        this.f101251OooOo0o = i;
        this.f101250OooOo = fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Fragment fragment = this.f101250OooOo;
        switch (this.f101251OooOo0o) {
            case 0:
                Context contextRequireContext = ((FirebaseUserAuthFragment) fragment).requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                C33609OooO0oo.OooO0OO(C33633Oooo0.OooO0O0(), null, null, new C31097OooO0Oo(contextRequireContext, null), 3);
                return;
            case 1:
                TranslateDialogFragment translateDialogFragment = (TranslateDialogFragment) fragment;
                C29970OooOOo c29970OooOOoOooOoo0 = translateDialogFragment.OooOoo0();
                InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = androidx.lifecycle.o0OoOo0.OooO00o(c29970OooOOoOooOoo0);
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C29980OooOoo(c29970OooOOoOooOoo0, null), 2);
                TextView textView = translateDialogFragment.f76918Oooo0;
                if (textView == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("contentSrc");
                    throw null;
                }
                TextView textView2 = translateDialogFragment.f76922Oooo0O0;
                if (textView2 != null) {
                    textView.setText(textView2.getText().toString());
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("contentDst");
                    throw null;
                }
            case 2:
                C30207OooOo.OooO00o oooO00o = ((FabNoteTypeFragment) fragment).f77468OooOo0o;
                if (oooO00o != null) {
                    oooO00o.OooO0Oo();
                    return;
                }
                return;
            default:
                Object tag = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.HistoryVersionVO");
                C30603OooO0O0 c30603OooO0O0OooOoo0 = ((RecoverNoteFromCloudDialogFragment) fragment).OooOoo0();
                String id = ((C31043OooOOOO) tag).f110837OooO00o;
                kotlin.jvm.internal.OooOOO0.OooO0oO(id, "id");
                C33781o00o0O c33781o00o0O = c30603OooO0O0OooOoo0.f109501OooOO0o;
                c33781o00o0O.getClass();
                c33781o00o0O.OooOO0(null, id);
                return;
        }
    }
}
