package o0O0oO;

import Oooo0oO.C21030OooOO0o;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.C21904OooOoo0;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.login.firebase.FirebaseLoginConfirmFragment;
import com.orion.notein.p607ui.noteeditor.audio.AudioBarChildFragment;
import com.orion.notein.p607ui.noteeditor.pagepadding.PagePaddingFragment;
import com.orion.notein.p607ui.noteeditor.penbar.PenBarChildFragment;
import com.orion.notein.p607ui.noteeditor.toolbox.PenBox;
import com.orion.notein.p607ui.notelist.trashbin.TrashBinClearAlertDialogFragment;
import com.orion.notein.p607ui.p609vo.PenWidthVO;
import com.orion.notein.p607ui.pay.google.GooglePayDialogFragment;
import kotlin.jvm.internal.OooOOO0;
import o0O0oO0o.OooOOOO;
import o0Ooo0oO.C29423OooO00o;
import o0Ooo0oo.ViewOnClickListenerC29543o000O0o0;
import o0o00o0O.C29952OooO0oo;
import o0oOoOo.C31042OooOOO0;
import o0ooOOoo.InterfaceC31661OooO0oO;
import oO0OO.C32881OooO0oO;
import oO0o0Oo.C33781o00o0O;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0O0oO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class ViewOnClickListenerC26091OooO00o implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f89077OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f89078OooOo0o;

    public /* synthetic */ ViewOnClickListenerC26091OooO00o(Object obj, int i) {
        this.f89078OooOo0o = i;
        this.f89077OooOo = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f89077OooOo;
        switch (this.f89078OooOo0o) {
            case 0:
                OooOOOO oooOOOO = (OooOOOO) obj;
                if (oooOOOO != null) {
                    oooOOOO.onClick(view);
                }
                break;
            case 1:
                FirebaseLoginConfirmFragment firebaseLoginConfirmFragment = (FirebaseLoginConfirmFragment) obj;
                C21904OooOoo0.OooO0o(new Bundle(), firebaseLoginConfirmFragment, "key_firebase_login");
                C21030OooOO0o.OooO0OO(firebaseLoginConfirmFragment).OooOOo(R.id.firebaseUserAuthFragment, true);
                break;
            case 2:
                AudioBarChildFragment audioBarChildFragment = (AudioBarChildFragment) obj;
                InterfaceC31661OooO0oO interfaceC31661OooO0oO = audioBarChildFragment.f74177OoooOO0;
                if (interfaceC31661OooO0oO != null) {
                    interfaceC31661OooO0oO.OooO00o();
                }
                audioBarChildFragment.OooOoOO().OooOooo(false);
                break;
            case 3:
                int i = PenBarChildFragment.f75240o0000OOo;
                Object tag = view.getTag();
                OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.PenWidthVO");
                PenBarChildFragment penBarChildFragment = (PenBarChildFragment) obj;
                if (((PenWidthVO) tag).getType() != 3) {
                    Integer num = (Integer) penBarChildFragment.Oooo0oO().f75160OooOo0o.f121747OooOo0o.getValue();
                    if (num != null) {
                        int iIntValue = num.intValue();
                        if (penBarChildFragment.f75295o0000OO0 == null) {
                            Context contextRequireContext = penBarChildFragment.requireContext();
                            OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                            C29952OooO0oo c29952OooO0oo = new C29952OooO0oo(contextRequireContext);
                            c29952OooO0oo.f106375OooO0o0 = (PenBox.InterfaceC23607OooO0oO) penBarChildFragment.f75287o00000Oo.getValue();
                            penBarChildFragment.f75295o0000OO0 = c29952OooO0oo;
                        }
                        C29952OooO0oo c29952OooO0oo2 = penBarChildFragment.f75295o0000OO0;
                        if (c29952OooO0oo2 != null) {
                            c29952OooO0oo2.OooO0Oo(iIntValue, view);
                        }
                    }
                } else {
                    if (penBarChildFragment.f75294o0000OO == null) {
                        Context contextRequireContext2 = penBarChildFragment.requireContext();
                        OooOOO0.OooO0o(contextRequireContext2, "requireContext(...)");
                        com.orion.notein.p607ui.noteeditor.toolbox.OooO00o oooO00o = new com.orion.notein.p607ui.noteeditor.toolbox.OooO00o(contextRequireContext2);
                        oooO00o.f76733OooO0o0 = (PenBox.InterfaceC23607OooO0oO) penBarChildFragment.f75287o00000Oo.getValue();
                        penBarChildFragment.f75294o0000OO = oooO00o;
                    }
                    com.orion.notein.p607ui.noteeditor.toolbox.OooO00o oooO00o2 = penBarChildFragment.f75294o0000OO;
                    if (oooO00o2 != null) {
                        oooO00o2.OooO0O0(view);
                    }
                }
                break;
            case 4:
                Dialog dialog = ((TrashBinClearAlertDialogFragment) obj).getDialog();
                if (dialog != null) {
                    dialog.dismiss();
                }
                break;
            case 5:
                Object tag2 = view.getTag();
                OooOOO0.OooO0o0(tag2, "null cannot be cast to non-null type com.orion.notein.ui.vo.GoogleProductVO");
                C31042OooOOO0 c31042OooOOO0 = (C31042OooOOO0) tag2;
                C33781o00o0O c33781o00o0O = ((GooglePayDialogFragment) obj).Oooo0().f109413OooOOo0;
                c33781o00o0O.getClass();
                c33781o00o0O.OooOO0(null, c31042OooOOO0);
                C34406OooO00o.f123390OooO00o.OooO00o("product selected: " + c31042OooOOO0, new Object[0]);
                break;
            case 6:
                C29423OooO00o c29423OooO00oOooOooO = ((PagePaddingFragment) obj).OooOooO();
                C29423OooO00o.OooO0O0 oooO0O0OooO0oO = c29423OooO00oOooOooO.OooO0oO(new Rect(0, 0, 0, 0));
                if (oooO0O0OooO0oO != null) {
                    C33781o00o0O c33781o00o0O2 = c29423OooO00oOooOooO.f104368OooOO0o;
                    c33781o00o0O2.getClass();
                    c33781o00o0O2.OooOO0(null, oooO0O0OooO0oO);
                    break;
                }
                break;
            default:
                ViewOnClickListenerC29543o000O0o0 viewOnClickListenerC29543o000O0o0 = ((C32881OooO0oO) obj).f118002OooO0O0;
                if (viewOnClickListenerC29543o000O0o0 != null) {
                    viewOnClickListenerC29543o000O0o0.onClick(view);
                }
                break;
        }
    }
}
