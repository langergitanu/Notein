package o0OoO000;

import Oooo0oO.C21030OooOO0o;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import androidx.core.os.BundleKt;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.android.billingclient.api.C22172OooOoO;
import com.huawei.hms.network.embedded.C18437z2;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.login.firebase.FirebaseCreateUserVerificationFragment;
import com.orion.notein.p607ui.noteeditor.penbar.PenBarChildFragment;
import com.orion.notein.p607ui.noteeditor.propertypanel.outline.OutlineDeleteAlertDialogFragment;
import com.orion.notein.p607ui.noteeditor.toolbox.PenBox;
import com.orion.notein.p607ui.p609vo.PenWidthVO;
import com.orion.notein.p607ui.user.settings.profile.NicknameFragment;
import com.orion.penkit.tools.DrawToolFactory;
import o0Ooo0oo.C29477Oooo0o0;
import o0Ooooo0.C29714OooOOo;
import o0o00o0O.C29952OooO0oo;
import o0oOoOO0.C31019OooO0o;
import o0oOoOO0.C31020OooO0o0;
import oO00ooO.C32443OooOOO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: o0OoO000.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28534OooOOoo implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f101155OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f101156OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28534OooOOoo(Object obj, int i) {
        this.f101156OooOo0o = i;
        this.f101155OooOo = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f101155OooOo;
        switch (this.f101156OooOo0o) {
            case 0:
                C21030OooOO0o.OooO0OO((FirebaseCreateUserVerificationFragment) obj).OooOOo(R.id.firebaseUserAuthFragment, false);
                return;
            case 1:
                int i = PenBarChildFragment.f75240o0000OOo;
                Object tag = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.PenWidthVO");
                PenWidthVO penWidthVO = (PenWidthVO) tag;
                PenBarChildFragment penBarChildFragment = (PenBarChildFragment) obj;
                if (!penWidthVO.getSelected()) {
                    InterfaceC21987OooOoo interfaceC21987OooOoo = penBarChildFragment.f75247OooOooO;
                    if (interfaceC21987OooOoo == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("containerViewLifecycleOwner");
                        throw null;
                    }
                    androidx.lifecycle.OooOo oooOoOooO00o = C21989OooOooO.OooO00o(interfaceC21987OooOoo);
                    C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                    C33609OooO0oo.OooO0OO(oooOoOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C29477Oooo0o0(penBarChildFragment, penWidthVO, null), 2);
                    return;
                }
                if (penWidthVO.getType() == 3) {
                    if (penBarChildFragment.f75294o0000OO == null) {
                        Context contextRequireContext = penBarChildFragment.requireContext();
                        kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                        com.orion.notein.p607ui.noteeditor.toolbox.OooO00o oooO00o = new com.orion.notein.p607ui.noteeditor.toolbox.OooO00o(contextRequireContext);
                        oooO00o.f76733OooO0o0 = (PenBox.InterfaceC23607OooO0oO) penBarChildFragment.f75287o00000Oo.getValue();
                        penBarChildFragment.f75294o0000OO = oooO00o;
                    }
                    com.orion.notein.p607ui.noteeditor.toolbox.OooO00o oooO00o2 = penBarChildFragment.f75294o0000OO;
                    if (oooO00o2 != null) {
                        oooO00o2.OooO0O0(view);
                        return;
                    }
                    return;
                }
                Integer num = (Integer) penBarChildFragment.Oooo0oO().f75160OooOo0o.f121747OooOo0o.getValue();
                if (num != null) {
                    int iIntValue = num.intValue();
                    if (penBarChildFragment.f75295o0000OO0 == null) {
                        Context contextRequireContext2 = penBarChildFragment.requireContext();
                        kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext2, "requireContext(...)");
                        C29952OooO0oo c29952OooO0oo = new C29952OooO0oo(contextRequireContext2);
                        c29952OooO0oo.f106375OooO0o0 = (PenBox.InterfaceC23607OooO0oO) penBarChildFragment.f75287o00000Oo.getValue();
                        penBarChildFragment.f75295o0000OO0 = c29952OooO0oo;
                    }
                    C29952OooO0oo c29952OooO0oo2 = penBarChildFragment.f75295o0000OO0;
                    if (c29952OooO0oo2 != null) {
                        c29952OooO0oo2.OooO0Oo(iIntValue, view);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                OutlineDeleteAlertDialogFragment outlineDeleteAlertDialogFragment = (OutlineDeleteAlertDialogFragment) obj;
                outlineDeleteAlertDialogFragment.requireActivity().getSupportFragmentManager().OooooOo(C22172OooOoO.OooO00o("outline_id", ((C29714OooOOo) outlineDeleteAlertDialogFragment.f75886OooOoOO.getValue()).f105358OooO00o), "delete_outline");
                Dialog dialog = outlineDeleteAlertDialogFragment.getDialog();
                if (dialog != null) {
                    dialog.dismiss();
                    return;
                }
                return;
            case 3:
                PenBox.InterfaceC23606OooO0o0 interfaceC23606OooO0o0 = ((PenBox) obj).lassoFilterListener;
                if (interfaceC23606OooO0o0 != null) {
                    interfaceC23606OooO0o0.OooO00o(BundleKt.bundleOf(new C32443OooOOO(C18437z2.f56754h, DrawToolFactory.LASSO_TYPE_RECT)));
                    return;
                }
                return;
            default:
                C31019OooO0o c31019OooO0oOooOoO = ((NicknameFragment) obj).OooOoO();
                InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = androidx.lifecycle.o0OoOo0.OooO00o(c31019OooO0oOooOoO);
                C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C31020OooO0o0(null, c31019OooO0oOooOoO), 2);
                return;
        }
    }
}
