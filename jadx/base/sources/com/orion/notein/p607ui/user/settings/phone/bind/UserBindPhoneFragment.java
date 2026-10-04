package com.orion.notein.p607ui.user.settings.phone.bind;

import Oooo0oO.C21030OooOO0o;
import android.os.Bundle;
import android.view.View;
import com.orion.notein.global.R;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o000o0O0.C24564OooO00o;
import o0Oo00o.C28026OooO0OO;
import o0oOo0o0.InterfaceC30981OooO0OO;
import o0oOoOo0.C31092OooO00o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m80612d2 = {"Lcom/orion/notein/ui/user/settings/phone/bind/UserBindPhoneFragment;", "Lcom/orion/notein/ui/login/BaseGetPhoneVerificationFragment;", "Lo0oOo0o0/OooO0OO;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class UserBindPhoneFragment extends Hilt_UserBindPhoneFragment implements InterfaceC30981OooO0OO {
    @Override // o0oOo0o0.InterfaceC30981OooO0OO
    public final Integer OooO0o() {
        return Integer.valueOf(R.color.notein_backgrounds_grouped_secondary);
    }

    @Override // o0oOo0o0.InterfaceC30981OooO0OO
    public final Integer OooOO0() {
        return Integer.valueOf(R.string.bind_phone_number_title);
    }

    @Override // com.orion.notein.p607ui.login.BaseGetPhoneVerificationFragment
    public final void OooOoo() {
        C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(this), new C24564OooO00o(R.id.action_userBindPhoneFragment_to_countryCodeSelectFragment));
    }

    @Override // com.orion.notein.p607ui.login.BaseGetPhoneVerificationFragment
    public final void OooOooO(String country, String phone) {
        OooOOO0.OooO0oO(country, "country");
        OooOOO0.OooO0oO(phone, "phone");
        C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(this), new C31092OooO00o(country, phone));
    }

    @Override // com.orion.notein.p607ui.login.BaseGetPhoneVerificationFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.tv_skip);
        OooOOO0.OooO0o(viewFindViewById, "findViewById(...)");
        viewFindViewById.setVisibility(8);
        View viewFindViewById2 = view.findViewById(R.id.cl_header);
        OooOOO0.OooO0o(viewFindViewById2, "findViewById(...)");
        viewFindViewById2.setVisibility(8);
    }
}
