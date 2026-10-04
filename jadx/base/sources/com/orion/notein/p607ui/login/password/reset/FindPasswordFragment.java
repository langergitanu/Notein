package com.orion.notein.p607ui.login.password.reset;

import Oooo0oO.C21030OooOO0o;
import android.os.Bundle;
import android.view.View;
import com.orion.notein.global.R;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import o000o0O0.C24564OooO00o;
import o0Oo00o.C28026OooO0OO;
import o0oO0O00.C30771OooO00o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/login/password/reset/FindPasswordFragment;", "Lcom/orion/notein/ui/login/BaseGetPhoneVerificationFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class FindPasswordFragment extends Hilt_FindPasswordFragment {
    @Override // com.orion.notein.p607ui.login.BaseGetPhoneVerificationFragment
    public final void OooOoo() {
        C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(this), new C24564OooO00o(R.id.action_findPasswordFragment_to_countryCodeSelectFragment));
    }

    @Override // com.orion.notein.p607ui.login.BaseGetPhoneVerificationFragment
    public final void OooOooO(String country, String phone) {
        OooOOO0.OooO0oO(country, "country");
        OooOOO0.OooO0oO(phone, "phone");
        C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(this), new C30771OooO00o(country, phone));
    }

    @Override // com.orion.notein.p607ui.login.BaseGetPhoneVerificationFragment
    public final int Oooo000() {
        return R.string.find_password_message;
    }

    @Override // com.orion.notein.p607ui.login.BaseGetPhoneVerificationFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.cl_header);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
        View viewFindViewById2 = view.findViewById(R.id.tv_skip);
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
    }
}
