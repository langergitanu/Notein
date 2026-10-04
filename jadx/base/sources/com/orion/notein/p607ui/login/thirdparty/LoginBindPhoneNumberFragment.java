package com.orion.notein.p607ui.login.thirdparty;

import OooOoOO.C20519OooO0Oo;
import Oooo0oO.C21030OooOO0o;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00Oo0;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.login.BaseGetPhoneVerificationFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import kotlin.jvm.internal.Oooo0;
import o000o00.AbstractC24555OooO00o;
import o000o0O0.C24564OooO00o;
import o000o0O0.C24568OooO0oO;
import o0Oo00o.C28026OooO0OO;
import o0Oo0O0.C28050OooO0OO;
import o0OoO0OO.C28604OooO0O0;
import o0OoO0OO.C28605OooO0OO;
import o0OoO0OO.C28606OooO0Oo;
import o0OoO0OO.C28625OooOo0o;
import o0OoO0OO.ViewOnClickListenerC28603OooO00o;
import oO00ooO.C32460OooOooO;
import oO00ooO.EnumC32441OooOO0O;
import oO00ooO.InterfaceC32440OooOO0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.C33633Oooo0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/login/thirdparty/LoginBindPhoneNumberFragment;", "Lcom/orion/notein/ui/login/BaseGetPhoneVerificationFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class LoginBindPhoneNumberFragment extends Hilt_LoginBindPhoneNumberFragment {

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public TextView f72567Oooo0;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final C24568OooO0oO f72568Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final C22026ooOO f72569Oooo00o;

    public static final class OooO00o extends OooOOOO implements oO0O000o.OooO00o<Bundle> {
        public OooO00o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Bundle invoke() {
            LoginBindPhoneNumberFragment loginBindPhoneNumberFragment = LoginBindPhoneNumberFragment.this;
            Bundle arguments = loginBindPhoneNumberFragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + loginBindPhoneNumberFragment + " has null arguments");
        }
    }

    public static final class OooO0O0 extends OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public OooO0O0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return LoginBindPhoneNumberFragment.this;
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ OooO0O0 f72572OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(OooO0O0 oooO0O0) {
            super(0);
            this.f72572OooOo0o = oooO0O0;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f72572OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.login.thirdparty.LoginBindPhoneNumberFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23187OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f72573OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23187OooO0Oo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f72573OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f72573OooOo0o.getValue()).getViewModelStore();
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f72574OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f72574OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f72574OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? LoginBindPhoneNumberFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.login.thirdparty.LoginBindPhoneNumberFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23188OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f72576OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23188OooO0o0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f72576OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f72576OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    public LoginBindPhoneNumberFragment() {
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f72568Oooo00O = new C24568OooO0oO(oooo0.OooO0O0(C28605OooO0OO.class), new OooO00o());
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, new OooO0OO(new OooO0O0()));
        this.f72569Oooo00o = new C22026ooOO(oooo0.OooO0O0(C28625OooOo0o.class), new C23187OooO0Oo(interfaceC32440OooOO0OooO0O0), new OooO0o(interfaceC32440OooOO0OooO0O0), new C23188OooO0o0(interfaceC32440OooOO0OooO0O0));
    }

    @Override // com.orion.notein.p607ui.login.BaseGetPhoneVerificationFragment
    public final void OooOoo() {
        C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(this), new C24564OooO00o(R.id.action_to_countryCodeSelectFragment));
    }

    @Override // com.orion.notein.p607ui.login.BaseGetPhoneVerificationFragment
    public final Object OooOoo0(BaseGetPhoneVerificationFragment.OooO00o.C19215OooO00o.C23143OooO0o0 c23143OooO0o0) {
        Object objOooO0o0 = C33633Oooo0.OooO0o0(new C28604OooO0O0(this, null), c23143OooO0o0);
        return objOooO0o0 == EnumC32485OooO00o.f116726OooOo0o ? objOooO0o0 : C32460OooOooO.f116667OooO00o;
    }

    @Override // com.orion.notein.p607ui.login.BaseGetPhoneVerificationFragment
    public final void OooOooO(String country, String phone) {
        OooOOO0.OooO0oO(country, "country");
        OooOOO0.OooO0oO(phone, "phone");
        C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(this), new C28606OooO0Oo(Oooo00o().f101392OooO00o, country, phone, Oooo00o().f101393OooO0O0, Oooo00o().f101394OooO0OO));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C28605OooO0OO Oooo00o() {
        return (C28605OooO0OO) this.f72568Oooo00O.getValue();
    }

    @Override // com.orion.notein.p607ui.login.BaseGetPhoneVerificationFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) view.findViewById(R.id.tv_skip);
        OooOOO0.OooO0Oo(textView);
        textView.setVisibility(0);
        C28050OooO0OO.OooO00o(textView, 1500L, new ViewOnClickListenerC28603OooO00o(this, 0));
        this.f72567Oooo0 = textView;
    }
}
