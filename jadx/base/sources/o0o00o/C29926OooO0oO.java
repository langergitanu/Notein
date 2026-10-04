package o0o00o;

import android.os.Bundle;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.o0OoOo0;
import com.orion.notein.MainActivity;
import com.orion.notein.p607ui.noteeditor.toolbox.PenBox;
import java.util.List;
import kotlin.jvm.internal.C24019OooOO0o;
import o0Ooo0oo.C29513o0000O0;
import o0Ooo0oo.C29528o0000oO;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0o00o.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29926OooO0oO implements PenBox.InterfaceC23606OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 f106220OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC21987OooOoo f106221OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C24019OooOO0o f106222OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ActivityC21897OooOo0 f106223OooO0Oo;

    /* JADX WARN: Multi-variable type inference failed */
    public C29926OooO0oO(com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 viewModel, InterfaceC21987OooOoo lifecycleOwner, InterfaceC32508OooOOOo interfaceC32508OooOOOo, ActivityC21897OooOo0 activityC21897OooOo0) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(viewModel, "viewModel");
        kotlin.jvm.internal.OooOOO0.OooO0oO(lifecycleOwner, "lifecycleOwner");
        this.f106220OooO00o = viewModel;
        this.f106221OooO0O0 = lifecycleOwner;
        this.f106222OooO0OO = (C24019OooOO0o) interfaceC32508OooOOOo;
        this.f106223OooO0Oo = activityC21897OooOo0;
    }

    @Override // com.orion.notein.p607ui.noteeditor.toolbox.PenBox.InterfaceC23606OooO0o0
    public final void OooO00o(Bundle extras) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(extras, "extras");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(this.f106221OooO0O0), null, null, new OooO0o(extras, this, null), 3);
    }

    @Override // com.orion.notein.p607ui.noteeditor.toolbox.PenBox.InterfaceC23606OooO0o0
    public final void OooO0O0() {
        ActivityC21897OooOo0 activityC21897OooOo0 = this.f106223OooO0Oo;
        MainActivity mainActivity = activityC21897OooOo0 instanceof MainActivity ? (MainActivity) activityC21897OooOo0 : null;
        if (mainActivity != null) {
            mainActivity.showGuideVideo(12);
        }
    }

    @Override // com.orion.notein.p607ui.noteeditor.toolbox.PenBox.InterfaceC23606OooO0o0
    public final void OooO0OO(List<String> list) {
        com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0 = this.f106220OooO00o;
        oooO0O0.getClass();
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(oooO0O0);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C29528o0000oO(oooO0O0, list, null), 2);
    }

    @Override // com.orion.notein.p607ui.noteeditor.toolbox.PenBox.InterfaceC23606OooO0o0
    public final void OooO0Oo(boolean z) {
        com.orion.notein.p607ui.noteeditor.penbar.OooO0O0 oooO0O0 = this.f106220OooO00o;
        oooO0O0.getClass();
        C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(oooO0O0), null, null, new C29513o0000O0(oooO0O0, z, null), 3);
    }
}
