package o0OoO000;

import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.notein.MainActivity;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.login.firebase.FirebaseLoginConfirmFragment;
import com.orion.notein.p607ui.noteeditor.pagepadding.PagePaddingFragment;
import com.orion.notein.p607ui.noteeditor.screenshot.ScreenshotPanel;
import com.orion.notein.p607ui.noteeditor.toolbox.colorpicker.ColorSetRenameDialogFragment;
import com.orion.notein.p607ui.notelist.about.AboutFragment;
import com.orion.notein.p607ui.notelist.trashbin.TrashBinContainerFragment;
import com.orion.notein.p607ui.pay.google.GooglePayDialogFragment;
import com.orion.notein.p607ui.vip.VipAdvertisementDialogFragment;
import o0O0oooO.C26320o0000OoO;
import o0O0oooO.C26351o00ooo;
import o0Oo00o.C28026OooO0OO;
import o0Ooo0oO.C29422OooO;
import o0Ooo0oO.C29423OooO00o;
import o0o0OOoo.C30580OooOO0o;
import o0oOoOoO.C31099OooO0o0;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0OoO000.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28542OooOoo0 implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f101173OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f101174OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28542OooOoo0(Object obj, int i) {
        this.f101174OooOo0o = i;
        this.f101173OooOo = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f101173OooOo;
        switch (this.f101174OooOo0o) {
            case 0:
                Context contextRequireContext = ((FirebaseLoginConfirmFragment) obj).requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                C33609OooO0oo.OooO0OO(C33633Oooo0.OooO0O0(), null, null, new C31099OooO0o0(contextRequireContext, null), 3);
                return;
            case 1:
                ScreenshotPanel.OooO00o oooO00o = ((ScreenshotPanel) obj).eventListener;
                if (oooO00o != null) {
                    oooO00o.OooO00o();
                    return;
                }
                return;
            case 2:
                EditText editText = ((ColorSetRenameDialogFragment) obj).f76850Oooo0O0;
                if (editText != null) {
                    editText.setText("");
                    return;
                } else {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("inputName");
                    throw null;
                }
            case 3:
                C21030OooOO0o.OooO0OO((AboutFragment) obj).OooOOo0();
                return;
            case 4:
                ((TrashBinContainerFragment) obj).OooOoOO().OooOOo0(0);
                return;
            case 5:
                GooglePayDialogFragment googlePayDialogFragment = (GooglePayDialogFragment) obj;
                if (((C26320o0000OoO) googlePayDialogFragment.f78790Oooo00o.getValue()).f90227OooOoOO.f121747OooOo0o.getValue() == 0) {
                    String string = googlePayDialogFragment.getString(R.string.content_require_to_login);
                    kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                    C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(googlePayDialogFragment), new C26351o00ooo(string));
                    return;
                } else {
                    InterfaceC21987OooOoo viewLifecycleOwner = googlePayDialogFragment.getViewLifecycleOwner();
                    kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                    C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C30580OooOO0o(googlePayDialogFragment, null), 3);
                    return;
                }
            case 6:
                PagePaddingFragment pagePaddingFragment = (PagePaddingFragment) obj;
                C29423OooO00o c29423OooO00oOooOooO = pagePaddingFragment.OooOooO();
                View view2 = pagePaddingFragment.f74939OoooOoo;
                if (view2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("btnApplyToFirstPage");
                    throw null;
                }
                boolean z = !view2.isActivated();
                InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = androidx.lifecycle.o0OoOo0.OooO00o(c29423OooO00oOooOooO);
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C29422OooO(c29423OooO00oOooOooO, z, null), 2);
                return;
            default:
                ActivityC21897OooOo0 activity = ((VipAdvertisementDialogFragment) obj).getActivity();
                MainActivity mainActivity = activity instanceof MainActivity ? (MainActivity) activity : null;
                if (mainActivity != null) {
                    mainActivity.openMembershipPlans();
                    return;
                }
                return;
        }
    }
}
