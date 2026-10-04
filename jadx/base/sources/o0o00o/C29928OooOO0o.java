package o0o00o;

import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.lifecycle.o0OoOo0;
import com.orion.notein.MainActivity;
import com.orion.notein.p607ui.noteeditor.toolbox.PenBox;
import o0Ooo0oo.C29521o0000Oo0;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0o00o.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29928OooOO0o implements PenBox.OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 f106247OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final ActivityC21897OooOo0 f106248OooO0O0;

    public C29928OooOO0o(com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 viewModel, ActivityC21897OooOo0 activityC21897OooOo0) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(viewModel, "viewModel");
        this.f106247OooO00o = viewModel;
        this.f106248OooO0O0 = activityC21897OooOo0;
    }

    @Override // com.orion.notein.ui.noteeditor.toolbox.PenBox.OooOOO0
    public final void OooO00o() {
        ActivityC21897OooOo0 activityC21897OooOo0 = this.f106248OooO0O0;
        MainActivity mainActivity = activityC21897OooOo0 instanceof MainActivity ? (MainActivity) activityC21897OooOo0 : null;
        if (mainActivity != null) {
            mainActivity.showGuideVideo(16);
        }
    }

    @Override // com.orion.notein.ui.noteeditor.toolbox.PenBox.OooOOO0
    public final void OooO0O0(boolean z) {
        com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0 = this.f106247OooO00o;
        oooO0O0.getClass();
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(oooO0O0);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C29521o0000Oo0(oooO0O0, z, null), 2);
    }
}
