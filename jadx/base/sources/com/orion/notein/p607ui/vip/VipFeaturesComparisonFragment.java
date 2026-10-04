package com.orion.notein.p607ui.vip;

import OooO0Oo.AbstractC20413OooOo0O;
import Oooo0oO.C21030OooOO0o;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AbstractC21486OooOO0o;
import androidx.core.os.LocaleListCompat;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.OooOo;
import androidx.lifecycle.o00Oo0;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.orion.notein.domain.models.transactions.google.FirebaseUserMembership;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.vip.VipFeaturesComparisonFragment;
import com.orion.notein.p607ui.widget.EdgeFragment;
import com.orion.notein.p607ui.widget.webview.jsbridge.BridgeWebView;
import com.orion.notein.ui.vip.VipFeaturesComparisonFragment.OooO0O0;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o000o00.AbstractC24555OooO00o;
import o000o0O0.C24572OooOO0o;
import o000o0O0.C24583OooOo0o;
import o000o0O0.C24587OooOoo;
import o000o0O0.OooOO0;
import o0O0oooO.C26320o0000OoO;
import o0o00Ooo.ViewOnClickListenerC29918OooO0o0;
import o0oOoOOo.C31028OooO0OO;
import o0oOoooO.InterfaceC31171OooO00o;
import o0oOoooO.InterfaceC31173OooO0OO;
import o0oo000O.C31183OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/vip/VipFeaturesComparisonFragment;", "Lcom/orion/notein/ui/widget/EdgeFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class VipFeaturesComparisonFragment extends EdgeFragment {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public BridgeWebView f80073OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C22026ooOO f80074OooOo0o = new C22026ooOO(C24035Oooo00o.f80943OooO00o.OooO0O0(C26320o0000OoO.class), new OooO0OO(), new C23908OooO0o0(), new C23907OooO0Oo());

    public static final class OooO00o extends AbstractC20413OooOo0O {
        public OooO00o() {
            super(true);
        }

        @Override // OooO0Oo.AbstractC20413OooOo0O
        public final void handleOnBackPressed() {
            VipFeaturesComparisonFragment vipFeaturesComparisonFragment = VipFeaturesComparisonFragment.this;
            BridgeWebView bridgeWebView = vipFeaturesComparisonFragment.f80073OooOo;
            if (bridgeWebView == null) {
                OooOOO0.OooOOOO("webView");
                throw null;
            }
            if (!bridgeWebView.canGoBack()) {
                C21030OooOO0o.OooO0OO(vipFeaturesComparisonFragment).OooOOo0();
                return;
            }
            BridgeWebView bridgeWebView2 = vipFeaturesComparisonFragment.f80073OooOo;
            if (bridgeWebView2 != null) {
                bridgeWebView2.goBack();
            } else {
                OooOOO0.OooOOOO("webView");
                throw null;
            }
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.vip.VipFeaturesComparisonFragment$onViewCreated$3$1", m80623f = "VipFeaturesComparisonFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {
        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return VipFeaturesComparisonFragment.this.new OooO0O0(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            C24583OooOo0o c24583OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            C24572OooOO0o c24572OooOO0oOooO0OO = C21030OooOO0o.OooO0OO(VipFeaturesComparisonFragment.this);
            OooOO0 oooOO0OooOO0O = c24572OooOO0oOooO0OO.OooOO0O();
            Integer num = (oooOO0OooOO0O == null || (c24583OooOo0o = oooOO0OooOO0O.f83189OooOo) == null) ? null : new Integer(c24583OooOo0o.f83302OooOooO);
            int i = C31183OooO00o.f111223OooO0OO;
            if (num != null && num.intValue() == i) {
                c24572OooOO0oOooO0OO.OooOOo0();
            } else {
                c24572OooOO0oOooO0OO.OooOOO0(i, null, new C24587OooOoo(false, false, R.id.vipFeaturesComparisonFragment, true, false, -1, -1, -1, -1));
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public OooO0OO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return VipFeaturesComparisonFragment.this.requireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.vip.VipFeaturesComparisonFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23907OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public C23907OooO0Oo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return VipFeaturesComparisonFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.vip.VipFeaturesComparisonFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23908OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public C23908OooO0o0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return VipFeaturesComparisonFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requireActivity().getOnBackPressedDispatcher().OooO00o(this, new OooO00o());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_vip_feature_comparison, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.orion.notein.p607ui.widget.EdgeFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        view.findViewById(R.id.btn_back).setOnClickListener(new ViewOnClickListenerC29918OooO0o0(this, 3));
        ((TextView) view.findViewById(R.id.tv_title)).setText(getString(R.string.vip_features_comparison));
        BridgeWebView bridgeWebView = (BridgeWebView) view.findViewById(R.id.webview);
        this.f80073OooOo = bridgeWebView;
        if (bridgeWebView == null) {
            OooOOO0.OooOOOO("webView");
            throw null;
        }
        bridgeWebView.f80175OooOo.put("onVipButtonClicked", new InterfaceC31171OooO00o() { // from class: o0oOoOOo.OooO0O0
            @Override // o0oOoooO.InterfaceC31171OooO00o
            public final void OooO00o(InterfaceC31173OooO0OO interfaceC31173OooO0OO) {
                VipFeaturesComparisonFragment vipFeaturesComparisonFragment = this.f110764OooO00o;
                InterfaceC21987OooOoo viewLifecycleOwner = vipFeaturesComparisonFragment.getViewLifecycleOwner();
                OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, vipFeaturesComparisonFragment.new OooO0O0(null), 3);
            }
        });
        LocaleListCompat localeListCompatOooO0o = AbstractC21486OooOO0o.OooO0o();
        OooOOO0.OooO0o(localeListCompatOooO0o, "getApplicationLocales(...)");
        boolean z = false;
        Locale locale = !localeListCompatOooO0o.isEmpty() ? localeListCompatOooO0o.get(0) : Locale.getDefault();
        String str = OooOOO0.OooO0O0(locale != null ? locale.getLanguage() : null, TranslateLanguage.CHINESE) ? (OooOOO0.OooO0O0(locale.getScript(), "Hant") || OooOOO0.OooO0O0(locale.getCountry(), "TW")) ? "zh-TW" : "zh-CN" : "en-US";
        FirebaseUserMembership firebaseUserMembership = (FirebaseUserMembership) ((C26320o0000OoO) this.f80074OooOo0o.getValue()).f90255o000oOoO.f121747OooOo0o.getValue();
        if (firebaseUserMembership != null && firebaseUserMembership.getMembershipType() != FirebaseUserMembership.MembershipType.FREE) {
            z = true;
        }
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        OooOo oooOoOooO00o = C21989OooOooO.OooO00o(viewLifecycleOwner);
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(oooOoOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C31028OooO0OO(z, str, this, null), 2);
    }
}
