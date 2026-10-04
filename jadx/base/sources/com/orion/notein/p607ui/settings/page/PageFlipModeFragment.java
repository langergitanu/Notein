package com.orion.notein.p607ui.settings.page;

import androidx.lifecycle.o0OoOo0;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.settings.page.BasePageOptionFragment;
import java.util.List;
import kotlin.Metadata;
import o0o0Oo0O.C30623OooOOOO;
import o0o0Oo0O.C30639OooOooo;
import oO00ooO.C32460OooOooO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33769Ooooo0o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m80612d2 = {"Lcom/orion/notein/ui/settings/page/PageFlipModeFragment;", "Lcom/orion/notein/ui/settings/page/BasePageOptionFragment;", "", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class PageFlipModeFragment extends Hilt_PageFlipModeFragment<Boolean> {
    @Override // com.orion.notein.p607ui.settings.page.BasePageOptionFragment
    public final Object OooOoO(Object obj, OooO00o oooO00o) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C30623OooOOOO c30623OooOOOOOooOoO0 = OooOoO0();
        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(c30623OooOOOOOooOoO0);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C30639OooOooo(c30623OooOOOOOooOoO0, zBooleanValue, null), 2);
        return C32460OooOooO.f116667OooO00o;
    }

    @Override // com.orion.notein.p607ui.settings.page.BasePageOptionFragment
    public final List<BasePageOptionFragment.OooO0O0<Boolean>> OooOoOO() {
        return C34429OooOOo0.OooOO0o(new BasePageOptionFragment.OooO0O0(Integer.valueOf(R.string.page_flip_mode_continuous), null, null, Boolean.FALSE, 14), new BasePageOptionFragment.OooO0O0(Integer.valueOf(R.string.page_flip_mode_single), null, null, Boolean.TRUE, 14));
    }

    @Override // com.orion.notein.p607ui.settings.page.BasePageOptionFragment
    public final C33769Ooooo0o OooOoo0() {
        return OooOoO0().f109578OooOO0O;
    }
}
