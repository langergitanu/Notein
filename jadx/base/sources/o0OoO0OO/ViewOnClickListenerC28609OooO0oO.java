package o0OoO0OO;

import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.C21989OooOooO;
import com.orion.notein.domain.models.ocr.AiOcrSession;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.login.thirdparty.LoginByThirdPartyChildFragment;
import com.orion.notein.p607ui.noteeditor.addtext.textstylebox.OooO0OO;
import com.orion.notein.p607ui.noteeditor.textstylebar.TextStyleBarChildFragment;
import com.orion.notein.p607ui.ocr.TextRecognizeFragment;
import com.orion.notein.p607ui.p609vo.PenColorVO;
import com.orion.notein.p607ui.user.UserInfoFragment;
import com.orion.notein.p607ui.user.settings.entry.UserSettingsDialogFragment;
import java.util.concurrent.CancellationException;
import o000o0O0.C24564OooO00o;
import o00O0oo0.C24969OooOO0;
import o0Oo00o.C28026OooO0OO;
import o0o000oO.C29786OooOO0O;
import o0o00o0.C29936OooO0oO;
import o0o00oO0.Oooo0;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.o00000OO;

/* JADX INFO: renamed from: o0OoO0OO.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ViewOnClickListenerC28609OooO0oO implements View.OnClickListener {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f101401OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f101402OooOo0o;

    public /* synthetic */ ViewOnClickListenerC28609OooO0oO(Object obj, int i) {
        this.f101402OooOo0o = i;
        this.f101401OooOo = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f101402OooOo0o) {
            case 0:
                LoginByThirdPartyChildFragment loginByThirdPartyChildFragment = (LoginByThirdPartyChildFragment) this.f101401OooOo;
                if (loginByThirdPartyChildFragment.f72578OooOo0o.OooO0OO()) {
                    o00000OO o00000oo2 = loginByThirdPartyChildFragment.f72583OooOoo0;
                    if (o00000oo2 != null) {
                        o00000oo2.cancel((CancellationException) null);
                    }
                    loginByThirdPartyChildFragment.f72583OooOoo0 = C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(loginByThirdPartyChildFragment), null, null, new C28616OooOOOO(loginByThirdPartyChildFragment, null), 3);
                    break;
                }
                break;
            case 1:
                TextStyleBarChildFragment textStyleBarChildFragment = (TextStyleBarChildFragment) this.f101401OooOo;
                float fFloatValue = ((Number) textStyleBarChildFragment.OooOoOO().f102907OooOOo.f121747OooOo0o.getValue()).floatValue();
                if (textStyleBarChildFragment.f76454Ooooo00 == null) {
                    Context contextRequireContext = textStyleBarChildFragment.requireContext();
                    kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                    com.orion.notein.p607ui.noteeditor.addtext.textstylebox.OooO0OO oooO0OO = new com.orion.notein.p607ui.noteeditor.addtext.textstylebox.OooO0OO(contextRequireContext);
                    oooO0OO.f74111OooO0OO = new C29786OooOO0O(textStyleBarChildFragment);
                    textStyleBarChildFragment.f76454Ooooo00 = oooO0OO;
                }
                com.orion.notein.p607ui.noteeditor.addtext.textstylebox.OooO0OO oooO0OO2 = textStyleBarChildFragment.f76454Ooooo00;
                if (oooO0OO2 != null) {
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(view);
                    oooO0OO2.OooO0O0(fFloatValue, false);
                    oooO0OO2.f74109OooO00o.showAsDropDown(view);
                    OooO0OO.OooO00o oooO00o = oooO0OO2.f74111OooO0OO;
                    if (oooO00o != null) {
                        oooO00o.OooO00o(0);
                    }
                }
                break;
            case 2:
                Object tag = view.getTag();
                kotlin.jvm.internal.OooOOO0.OooO0o0(tag, "null cannot be cast to non-null type com.orion.notein.ui.vo.PenColorVO");
                PenColorVO penColorVO = (PenColorVO) tag;
                int color = penColorVO.getColor();
                Oooo0 oooo0 = (Oooo0) this.f101401OooOo;
                oooo0.f106636OooOoO.setColorFilter(C24969OooOO0.OooO0OO(color));
                oooo0.f106634OooOo.setColorFilter(C24969OooOO0.OooO0OO(color));
                C29936OooO0oO c29936OooO0oO = oooo0.f106644Oooo00O;
                if (c29936OooO0oO != null) {
                    c29936OooO0oO.OooO0Oo(penColorVO, view, oooo0.f106640OooOoo0);
                }
                break;
            case 3:
                UserInfoFragment userInfoFragment = (UserInfoFragment) this.f101401OooOo;
                Context contextRequireContext2 = userInfoFragment.requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext2, "requireContext(...)");
                if (!o0oo000O.OooOO0O.OooO00o(contextRequireContext2)) {
                    C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(userInfoFragment), new C24564OooO00o(R.id.action_to_userSettingsContainerFragment));
                } else {
                    new UserSettingsDialogFragment().show(userInfoFragment.getParentFragmentManager(), "UserSettingsDialogFragment");
                }
                break;
            default:
                TextRecognizeFragment textRecognizeFragment = (TextRecognizeFragment) this.f101401OooOo;
                AiOcrSession aiOcrSession = (AiOcrSession) textRecognizeFragment.Oooo00O().f108506OooOOo0.f121747OooOo0o.getValue();
                if (aiOcrSession != null) {
                    textRecognizeFragment.Oooo00O().OooOO0(aiOcrSession.getId());
                    break;
                }
                break;
        }
    }
}
