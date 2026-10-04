package o0o00oo0;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.o0OoOo0;
import com.orion.notein.p607ui.notelist.about.UserAboutDialogFragment;
import com.orion.notein.p607ui.notelist.trashbin.TrashBinContainerFragment;
import kotlin.jvm.internal.OooOOO0;
import o0o0O0oO.C30351Oooo0oO;
import o0o0O0oO.C30358OoooOOO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0o00oo0.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC30136OooO0OO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Fragment f107276OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f107277OooOo0o;

    public /* synthetic */ ViewOnClickListenerC30136OooO0OO(Fragment fragment, int i) {
        this.f107277OooOo0o = i;
        this.f107276OooOo = fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Fragment fragment = this.f107276OooOo;
        switch (this.f107277OooOo0o) {
            case 0:
                ((UserAboutDialogFragment) fragment).dismiss();
                return;
            default:
                TrashBinContainerFragment trashBinContainerFragment = (TrashBinContainerFragment) fragment;
                C30351Oooo0oO c30351Oooo0oOOooOoOO = trashBinContainerFragment.OooOoOO();
                View view2 = trashBinContainerFragment.f78088o000oOoO;
                if (view2 == null) {
                    OooOOO0.OooOOOO("btnListLayout");
                    throw null;
                }
                boolean z = !view2.isActivated();
                InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(c30351Oooo0oOOooOoOO);
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C30358OoooOOO(c30351Oooo0oOOooOoOO, z, null), 2);
                return;
        }
    }
}
