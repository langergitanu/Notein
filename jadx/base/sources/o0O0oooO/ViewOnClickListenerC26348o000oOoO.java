package o0O0oooO;

import Oooo0oO.C21030OooOO0o;
import android.view.View;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.MainActivity;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.login.verificationcode.PhoneVerificationRequestFragment;
import com.orion.notein.p607ui.noteeditor.audio.OooO0OO;
import com.orion.notein.p607ui.noteeditor.toolbar.ImmersiveToolbarChildFragment;
import com.orion.notein.p607ui.notelist.label.LabelContainerFragment;
import com.orion.notein.p607ui.paperconfig.PaperConfigDialogFragment;
import com.orion.notein.p607ui.user.firebase.FirebaseUserInfoFragment;
import o000o0O0.C24564OooO00o;
import o0Oo00o.C28026OooO0OO;
import o0oOo0OO.C30960OooO0O0;
import oO0o0OO.C33609OooO0oo;

/* JADX INFO: renamed from: o0O0oooO.o000oOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class ViewOnClickListenerC26348o000oOoO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f90425OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f90426OooOo0o;

    public /* synthetic */ ViewOnClickListenerC26348o000oOoO(Object obj, int i) {
        this.f90426OooOo0o = i;
        this.f90425OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f90426OooOo0o) {
            case 0:
                MainActivity.onCreate$lambda$9$lambda$6((MainActivity) this.f90425OooOo, view);
                return;
            case 1:
                ImmersiveToolbarChildFragment immersiveToolbarChildFragment = (ImmersiveToolbarChildFragment) this.f90425OooOo;
                if (immersiveToolbarChildFragment.Oooo000().f74227OooOO0.getValue() instanceof OooO0OO.C23396OooO0oo) {
                    immersiveToolbarChildFragment.Oooo000().OooOOoo();
                } else {
                    com.orion.notein.p607ui.noteeditor.audio.OooO0o.Oooo00O(immersiveToolbarChildFragment.Oooo000(), null, 3);
                }
                immersiveToolbarChildFragment.Oooo0OO().OooOooo(true);
                return;
            case 2:
                LabelContainerFragment labelContainerFragment = (LabelContainerFragment) this.f90425OooOo;
                com.orion.notein.p607ui.notelist.OooO0OO oooO0OOOooOoo = labelContainerFragment.OooOoo();
                if (labelContainerFragment.f77714Oooo0o != null) {
                    oooO0OOOooOoo.Oooo0(!r4.isActivated());
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnListLayout");
                    throw null;
                }
            case 3:
                ((PaperConfigDialogFragment) this.f90425OooOo).dismiss();
                return;
            case 4:
                FirebaseUserInfoFragment firebaseUserInfoFragment = (FirebaseUserInfoFragment) this.f90425OooOo;
                InterfaceC21987OooOoo viewLifecycleOwner = firebaseUserInfoFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C30960OooO0O0(firebaseUserInfoFragment, null), 3);
                return;
            default:
                C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO((PhoneVerificationRequestFragment) this.f90425OooOo), new C24564OooO00o(R.id.action_phoneVerificationRequestFragment_to_passwordLogin));
                return;
        }
    }
}
