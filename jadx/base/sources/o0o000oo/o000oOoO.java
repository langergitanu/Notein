package o0o000oo;

import Oooo0oO.C21030OooOO0o;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.login.verificationcode.C23192OooO0o0;
import com.orion.notein.p607ui.login.verificationcode.PhoneVerificationRequestFragment;
import com.orion.notein.p607ui.noteeditor.toolbar.ImmersiveToolbarChildFragment;
import com.orion.notein.p607ui.notelist.label.LabelContainerFragment;
import com.orion.notein.p607ui.p609vo.SortKeyVO;
import com.orion.notein.p607ui.paperconfig.PaperConfigDialogFragment;
import com.orion.notein.p607ui.user.firebase.FirebaseUserInfoFragment;
import o000o0O0.C24564OooO00o;
import o0Oo00o.C28026OooO0OO;
import o0Oo0ooo.C28489OooOoO0;
import o0o0O0o.C30294OooO0OO;
import o0o0OOO.C30494Oooo00o;
import o0o0OOO.C30520o000000o;
import o0ooOOO0.C31639OooOo0;
import o0ooOOO0.C31640OooOo00;
import oO0o0O0o.C33595OooOOo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33609OooO0oo;
import oO0o0Oo.C33781o00o0O;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class o000oOoO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Fragment f105909OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f105910OooOo0o;

    public /* synthetic */ o000oOoO(Fragment fragment, int i) {
        this.f105910OooOo0o = i;
        this.f105909OooOo = fragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f105910OooOo0o) {
            case 0:
                ((ImmersiveToolbarChildFragment) this.f105909OooOo).Oooo0OO().Oooo00O(true);
                return;
            case 1:
                LabelContainerFragment labelContainerFragment = (LabelContainerFragment) this.f105909OooOo;
                C30294OooO0OO c30294OooO0OO = labelContainerFragment.f77715Oooo0o0;
                if (c30294OooO0OO == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("sortPopupWindow");
                    throw null;
                }
                c30294OooO0OO.OooO00o();
                Object tag = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.SortKeyVO");
                labelContainerFragment.OooOoo().OooOooo(((SortKeyVO) tag).getKey());
                return;
            case 2:
                PaperConfigDialogFragment paperConfigDialogFragment = (PaperConfigDialogFragment) this.f105909OooOo;
                if (((Boolean) paperConfigDialogFragment.OooOoo().f109025OooOooo.getValue()).booleanValue()) {
                    return;
                }
                C30520o000000o c30520o000000oOooOoo = paperConfigDialogFragment.OooOoo();
                Boolean bool = Boolean.TRUE;
                C33781o00o0O c33781o00o0O = c30520o000000oOooOoo.f109024OooOooO;
                c33781o00o0O.getClass();
                c33781o00o0O.OooOO0(null, bool);
                InterfaceC21987OooOoo viewLifecycleOwner = paperConfigDialogFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C30494Oooo00o(paperConfigDialogFragment, null), 3);
                return;
            case 3:
                C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO((FirebaseUserInfoFragment) this.f105909OooOo), new C24564OooO00o(R.id.action_firebaseUserInfoFragment_to_firebaseUserSettingsFragment));
                return;
            default:
                PhoneVerificationRequestFragment phoneVerificationRequestFragment = (PhoneVerificationRequestFragment) this.f105909OooOo;
                C31639OooOo0 c31639OooOo0Oooo000 = phoneVerificationRequestFragment.Oooo000();
                if (!((C31640OooOo00) c31639OooOo0Oooo000.f113094OooO0Oo.getValue()).f113100OooO0OO) {
                    C33609OooO0oo.OooO0OO(androidx.lifecycle.o0OoOo0.OooO00o(c31639OooOo0Oooo000), null, null, new C23192OooO0o0(c31639OooOo0Oooo000, null), 3);
                    return;
                }
                C28489OooOoO0 c28489OooOoO0OooOooo = phoneVerificationRequestFragment.OooOooo();
                String str = ((C31640OooOo00) phoneVerificationRequestFragment.Oooo000().f113094OooO0Oo.getValue()).f113098OooO00o;
                if (C33599OooOo0O.Oooo0o0(str)) {
                    str = "86";
                }
                C28489OooOoO0.OooO0oo(c28489OooOoO0OooOooo, str, C33595OooOOo.OooOo0O(((C31640OooOo00) phoneVerificationRequestFragment.Oooo000().f113094OooO0Oo.getValue()).f113099OooO0O0, " ", ""), 4);
                return;
        }
    }
}
