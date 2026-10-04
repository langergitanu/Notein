package com.orion.notein.p607ui.settings.page;

import com.orion.notein.global.R;
import com.orion.notein.p607ui.settings.page.BasePageOptionFragment;
import java.util.List;
import kotlin.Metadata;
import o0o0Oo0O.C30623OooOOOO;
import o0o0Oo0O.C30643Oooo00o;
import oO00ooO.C32460OooOooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0Oo.C33769Ooooo0o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m80612d2 = {"Lcom/orion/notein/ui/settings/page/GlobalPdfQuoteSettingFragment;", "Lcom/orion/notein/ui/settings/page/BasePageOptionFragment;", "", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class GlobalPdfQuoteSettingFragment extends Hilt_GlobalPdfQuoteSettingFragment<Integer> {
    @Override // com.orion.notein.p607ui.settings.page.BasePageOptionFragment
    public final Object OooOoO(Object obj, OooO00o oooO00o) throws Throwable {
        int iIntValue = ((Number) obj).intValue();
        C30623OooOOOO c30623OooOOOOOooOoO0 = OooOoO0();
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        Object objOooO0o = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C30643Oooo00o(c30623OooOOOOOooOoO0, iIntValue, null), oooO00o);
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        if (objOooO0o != enumC32485OooO00o) {
            objOooO0o = C32460OooOooO.f116667OooO00o;
        }
        return objOooO0o == enumC32485OooO00o ? objOooO0o : C32460OooOooO.f116667OooO00o;
    }

    @Override // com.orion.notein.p607ui.settings.page.BasePageOptionFragment
    public final List<BasePageOptionFragment.OooO0O0<Integer>> OooOoOO() {
        return C34429OooOOo0.OooOO0o(new BasePageOptionFragment.OooO0O0(Integer.valueOf(R.string.pdf_selection_mode_disable), null, null, 0, 14), new BasePageOptionFragment.OooO0O0(Integer.valueOf(R.string.pdf_selection_mode_enable), null, null, 1, 14), new BasePageOptionFragment.OooO0O0(Integer.valueOf(R.string.pdf_selection_mode_finger_only), null, null, 2, 14));
    }

    @Override // com.orion.notein.p607ui.settings.page.BasePageOptionFragment
    public final C33769Ooooo0o OooOoo0() {
        return OooOoO0().f109573OooO0o;
    }
}
