package com.orion.notein.p607ui.login.password;

import OooOoOO.C20519OooO0Oo;
import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00Oo0;
import com.orion.niui.components.button.TextButtonView;
import com.orion.niui.components.textinput.LabeledTextFieldView;
import com.orion.notein.global.R;
import kotlin.Metadata;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import kotlin.jvm.internal.Oooo0;
import o000O0oo.C24427OooOOOo;
import o000o00.AbstractC24555OooO00o;
import o000o0O0.C24564OooO00o;
import o0O0OoOo.C25900OooO00o;
import o0O0ooo0.OooOo00;
import o0O0oooO.o0Oo0oo;
import o0Oo.C28022OooOOO0;
import o0Oo00o.C28026OooO0OO;
import o0Oo00oo.C28039OooO00o;
import o0Oo0o0o.ViewOnClickListenerC28243OooOo0O;
import o0Oo0o0o.ViewOnClickListenerC28244OooOo0o;
import o0OoO0.C28506OooO;
import o0OoO0.C28510OooO0Oo;
import o0OoO0.C28511OooO0o;
import o0OoO0.C28513OooO0oO;
import o0OoO0.C28514OooO0oo;
import o0OoO0.C28522OooOo0O;
import o0OoO0.OooOO0O;
import oO00ooO.C32460OooOooO;
import oO00ooO.EnumC32441OooOO0O;
import oO00ooO.InterfaceC32440OooOO0;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0o0O0o.C33595OooOOo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33609OooO0oo;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/login/password/PasswordLoginFragment;", "Lcom/orion/notein/ui/login/thirdparty/LoginFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class PasswordLoginFragment extends Hilt_PasswordLoginFragment {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final C22026ooOO f72485OooOoo;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final C22026ooOO f72486OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public LabeledTextFieldView f72487OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public LabeledTextFieldView f72488Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public TextButtonView f72489Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public CheckBox f72490Oooo00o;

    public static final class OooO00o extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public OooO00o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return PasswordLoginFragment.this.requireActivity().getViewModelStore();
        }
    }

    public static final class OooO0O0 extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public OooO0O0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return PasswordLoginFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public OooO0OO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return PasswordLoginFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.login.password.PasswordLoginFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23179OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public C23179OooO0Oo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return PasswordLoginFragment.this;
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f72495OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f72495OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f72495OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.login.password.PasswordLoginFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23180OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C23179OooO0Oo f72496OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23180OooO0o0(C23179OooO0Oo c23179OooO0Oo) {
            super(0);
            this.f72496OooOo0o = c23179OooO0Oo;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f72496OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.login.password.PasswordLoginFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class C23181OooO0oO extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f72497OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23181OooO0oO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f72497OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f72497OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.login.password.PasswordLoginFragment$OooO0oo, reason: case insensitive filesystem */
    public static final class C23182OooO0oo extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f72498OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23182OooO0oo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f72498OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f72498OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? PasswordLoginFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public PasswordLoginFragment() {
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, new C23180OooO0o0(new C23179OooO0Oo()));
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f72485OooOoo = new C22026ooOO(oooo0.OooO0O0(C28522OooOo0O.class), new OooO0o(interfaceC32440OooOO0OooO0O0), new C23182OooO0oo(interfaceC32440OooOO0OooO0O0), new C23181OooO0oO(interfaceC32440OooOO0OooO0O0));
        this.f72486OooOooO = new C22026ooOO(oooo0.OooO0O0(C28022OooOOO0.class), new OooO00o(), new OooO0OO(), new OooO0O0());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o0OoO0OO.InterfaceC28621OooOo
    public final boolean OooO0OO() {
        Context context;
        boolean z = ((OooOO0O) OooOooo().f101114OooO.f121747OooOo0o.getValue()).f101100OooO0oO;
        if (!z && (context = getContext()) != null) {
            C28513OooO0oO.OooO00o(context, R.string.read_and_agree_privacy_and_service_first, "getString(...)", context);
        }
        return z;
    }

    @Override // o0OoO0OO.InterfaceC28618OooOOo
    public final void OooOOoo(int i, String accessToken, String openID) {
        OooOOO0.OooO0oO(accessToken, "accessToken");
        OooOOO0.OooO0oO(openID, "openID");
        C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(this), new C28506OooO(i, accessToken, openID));
    }

    public final C28522OooOo0O OooOooo() {
        return (C28522OooOo0O) this.f72485OooOoo.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_password_login, viewGroup, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00f4  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) view.findViewById(R.id.tv_by_code);
        if (textView != null) {
            textView.setOnClickListener(new ViewOnClickListenerC28243OooOo0O(this, 1));
        }
        view.findViewById(R.id.tv_forget_password).setOnClickListener(new ViewOnClickListenerC28244OooOo0o(this, 1));
        LabeledTextFieldView labeledTextFieldView = (LabeledTextFieldView) view.findViewById(R.id.phone_field);
        this.f72487OooOooo = labeledTextFieldView;
        if (labeledTextFieldView == null) {
            OooOOO0.OooOOOO("phoneField");
            throw null;
        }
        labeledTextFieldView.setOnCountryCodeClickListener(new oO0O000o.OooO00o() { // from class: o0OoO0.OooO0O0
            @Override // oO0O000o.OooO00o
            public final Object invoke() {
                C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(this.f101073OooOo0o), new C24564OooO00o(R.id.action_passwordLoginFragment_to_countryCodeSelectFragment));
                return C32460OooOooO.f116667OooO00o;
            }
        });
        LabeledTextFieldView labeledTextFieldView2 = this.f72487OooOooo;
        if (labeledTextFieldView2 == null) {
            OooOOO0.OooOOOO("phoneField");
            throw null;
        }
        labeledTextFieldView2.setOnValueChangeListener(new InterfaceC32507OooOO0o() { // from class: o0OoO0.OooO0OO
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) {
                String value = (String) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
                this.f101074OooOo0o.OooOooo().OooO0o0(new OooOOO0(C33595OooOOo.OooOo0O(value, " ", ""), 0));
                return C32460OooOooO.f116667OooO00o;
            }
        });
        LabeledTextFieldView labeledTextFieldView3 = (LabeledTextFieldView) view.findViewById(R.id.password_field);
        this.f72488Oooo000 = labeledTextFieldView3;
        if (labeledTextFieldView3 == null) {
            OooOOO0.OooOOOO("passwordField");
            throw null;
        }
        labeledTextFieldView3.setOnValueChangeListener(new C28510OooO0Oo(this, 0));
        LabeledTextFieldView labeledTextFieldView4 = this.f72488Oooo000;
        if (labeledTextFieldView4 == null) {
            OooOOO0.OooOOOO("passwordField");
            throw null;
        }
        labeledTextFieldView4.setMode(OooOo00.f89698OooOo);
        TextButtonView textButtonView = (TextButtonView) view.findViewById(R.id.btn_login);
        textButtonView.setOnClickListener(new o0Oo0oo(this, 2));
        this.f72489Oooo00O = textButtonView;
        CheckBox checkBox = (CheckBox) view.findViewById(R.id.agree);
        this.f72490Oooo00o = checkBox;
        if (checkBox == null) {
            OooOOO0.OooOOOO("agreeCheckBox");
            throw null;
        }
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o0OoO0.OooO0o0
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                kotlin.jvm.internal.OooOOO0.OooO0oO(compoundButton, "<unused var>");
                this.f101079OooO00o.OooOooo().OooO0o0(new C28516OooOO0o(z));
            }
        });
        View viewFindViewById = view.findViewById(R.id.privacy_and_service);
        OooOOO0.OooO0o(viewFindViewById, "findViewById(...)");
        o0O0OoOo.OooO0OO.OooO00o((TextView) viewFindViewById, R.string.read_privacy_and_service, new C25900OooO00o(R.string.privacy_policy, new C28511OooO0o(this, 0)), new C25900OooO00o(R.string.service_agreement, new C24427OooOOOo(this, 1)));
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_huawei);
        if (imageView != null) {
            if (!C28039OooO00o.OooO0O0()) {
                String BRAND = Build.BRAND;
                OooOOO0.OooO0o(BRAND, "BRAND");
                int i = !C33599OooOo0O.OooOoOO(BRAND, "Lenovo", true) ? 0 : 8;
                imageView.setVisibility(i);
                View viewFindViewById2 = view.findViewById(R.id.iv_progress_huawei);
                OooOOO0.OooO0Oo(viewFindViewById2);
                OooOoO(imageView, viewFindViewById2);
            }
        }
        ImageView imageView2 = (ImageView) view.findViewById(R.id.iv_wechat);
        if (imageView2 != null) {
            View viewFindViewById3 = view.findViewById(R.id.iv_progress_wechat);
            OooOOO0.OooO0Oo(viewFindViewById3);
            OooOoo0(imageView2, viewFindViewById3);
        }
        ImageView imageView3 = (ImageView) view.findViewById(R.id.iv_xiaomi);
        if (imageView3 != null) {
            View viewFindViewById4 = view.findViewById(R.id.iv_progress_xiaomi);
            OooOOO0.OooO0Oo(viewFindViewById4);
            OooOoo(imageView3, viewFindViewById4);
        }
        ImageView imageView4 = (ImageView) view.findViewById(R.id.iv_honor);
        if (imageView4 != null) {
            imageView4.setVisibility(C33595OooOOo.OooOOo(Build.MANUFACTURER, "HONOR", true) ? 0 : 8);
            View viewFindViewById5 = view.findViewById(R.id.iv_progress_honor);
            OooOOO0.OooO0Oo(viewFindViewById5);
            OooOoOO(imageView4, viewFindViewById5);
        }
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C28514OooO0oo(this, null), 3);
    }
}
