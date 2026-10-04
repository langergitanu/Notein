package o0OoO0;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.orion.notein.p607ui.login.password.PasswordLoginFragment;
import com.orion.notein.p607ui.noteeditor.NoteEditorContainerFragment;
import o0OoO0oo.C28757o00000oo;
import o0OoO0oo.C28982oo0o0Oo;
import o0oOoOoO.C31097OooO0Oo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;

/* JADX INFO: renamed from: o0OoO0.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C28511OooO0o implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Fragment f101077OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f101078OooOo0o;

    public /* synthetic */ C28511OooO0o(Fragment fragment, int i) {
        this.f101078OooOo0o = i;
        this.f101077OooOo = fragment;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        switch (this.f101078OooOo0o) {
            case 0:
                kotlin.jvm.internal.OooOOO0.OooO0oO((View) obj, "it");
                Context contextRequireContext = ((PasswordLoginFragment) this.f101077OooOo).requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                C33609OooO0oo.OooO0OO(C33633Oooo0.OooO0O0(), null, null, new C31097OooO0Oo(contextRequireContext, null), 3);
                break;
            default:
                Fragment it = (Fragment) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
                NoteEditorContainerFragment noteEditorContainerFragment = (NoteEditorContainerFragment) this.f101077OooOo;
                C33609OooO0oo.OooO0OO(C28982oo0o0Oo.OooO00o(noteEditorContainerFragment, "getViewLifecycleOwner(...)"), null, null, new C28757o00000oo(it, noteEditorContainerFragment, null), 3);
                break;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
