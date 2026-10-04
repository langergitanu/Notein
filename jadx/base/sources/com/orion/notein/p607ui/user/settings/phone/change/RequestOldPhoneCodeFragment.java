package com.orion.notein.p607ui.user.settings.phone.change;

import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.o00Oo0;
import com.orion.niui.components.textinput.LabeledTextFieldView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.login.BaseGetPhoneVerificationFragment;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o000o00.AbstractC24555OooO00o;
import o00o00.C25206OooO0Oo;
import o0O0ooo0.EnumC26248OooOo0;
import o0O0oooO.C26320o0000OoO;
import o0Oo00o.C28026OooO0OO;
import o0Oo0ooo.C28480OooOOo;
import o0oOo0o0.InterfaceC30981OooO0OO;
import o0oOoO.C30990OooO0OO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m80612d2 = {"Lcom/orion/notein/ui/user/settings/phone/change/RequestOldPhoneCodeFragment;", "Lcom/orion/notein/ui/login/BaseGetPhoneVerificationFragment;", "Lo0oOo0o0/OooO0OO;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class RequestOldPhoneCodeFragment extends Hilt_RequestOldPhoneCodeFragment implements InterfaceC30981OooO0OO {

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.settings.phone.change.RequestOldPhoneCodeFragment$onVerificationCodeSent$1", m80623f = "RequestOldPhoneCodeFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ String f79977OooOo;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ String f79979OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(String str, String str2, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f79977OooOo = str;
            this.f79979OooOoO0 = str2;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return RequestOldPhoneCodeFragment.this.new OooO00o(this.f79977OooOo, this.f79979OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            RequestOldPhoneCodeFragment requestOldPhoneCodeFragment = RequestOldPhoneCodeFragment.this;
            Context contextRequireContext = requestOldPhoneCodeFragment.requireContext();
            OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
            String string = requestOldPhoneCodeFragment.getString(R.string.verification_code_sent);
            OooOOO0.OooO0o(string, "getString(...)");
            C25206OooO0Oo.OooO0oO(contextRequireContext, string);
            String country = this.f79977OooOo;
            OooOOO0.OooO0oO(country, "country");
            String phone = this.f79979OooOoO0;
            OooOOO0.OooO0oO(phone, "phone");
            C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(requestOldPhoneCodeFragment), new C30990OooO0OO(country, phone));
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public static final class OooO0O0 extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public OooO0O0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return RequestOldPhoneCodeFragment.this.requireActivity().getViewModelStore();
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public OooO0OO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return RequestOldPhoneCodeFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.user.settings.phone.change.RequestOldPhoneCodeFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23898OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public C23898OooO0Oo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return RequestOldPhoneCodeFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public RequestOldPhoneCodeFragment() {
        new C22026ooOO(C24035Oooo00o.f80943OooO00o.OooO0O0(C26320o0000OoO.class), new OooO0O0(), new C23898OooO0Oo(), new OooO0OO());
    }

    @Override // o0oOo0o0.InterfaceC30981OooO0OO
    public final Integer OooO0o() {
        return Integer.valueOf(R.color.notein_backgrounds_grouped_secondary);
    }

    @Override // o0oOo0o0.InterfaceC30981OooO0OO
    public final Integer OooOO0() {
        return Integer.valueOf(R.string.change_phone);
    }

    @Override // com.orion.notein.p607ui.login.BaseGetPhoneVerificationFragment
    public final EnumC26248OooOo0 OooOoO0(EnumC26248OooOo0 enumC26248OooOo0, C28480OooOOo requestState) {
        OooOOO0.OooO0oO(requestState, "requestState");
        return EnumC26248OooOo0.f89695OooOoO;
    }

    @Override // com.orion.notein.p607ui.login.BaseGetPhoneVerificationFragment
    public final void OooOoo() {
    }

    @Override // com.orion.notein.p607ui.login.BaseGetPhoneVerificationFragment
    public final Object OooOoo0(BaseGetPhoneVerificationFragment.OooO00o.C19215OooO00o.C23143OooO0o0 c23143OooO0o0) {
        return C32460OooOooO.f116667OooO00o;
    }

    @Override // com.orion.notein.p607ui.login.BaseGetPhoneVerificationFragment
    public final void OooOooO(String country, String phone) {
        OooOOO0.OooO0oO(country, "country");
        OooOOO0.OooO0oO(phone, "phone");
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooO00o(country, phone, null), 3);
    }

    @Override // com.orion.notein.p607ui.login.BaseGetPhoneVerificationFragment
    public final int Oooo000() {
        return R.string.tips_change_phone_number;
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
        LabeledTextFieldView labeledTextFieldViewOooOoO = OooOoO();
        labeledTextFieldViewOooOoO.setState(EnumC26248OooOo0.f89695OooOoO);
        labeledTextFieldViewOooOoO.setOnCountryCodeClickListener(null);
    }
}
