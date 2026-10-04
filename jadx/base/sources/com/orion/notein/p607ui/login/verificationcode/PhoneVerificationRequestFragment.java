package com.orion.notein.p607ui.login.verificationcode;

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
import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22005OoooOO0;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00Oo0;
import com.orion.niui.components.textinput.LabeledTextFieldView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.login.verificationcode.AbstractC23191OooO0Oo;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOOO;
import kotlin.jvm.internal.Oooo0;
import o000o00.AbstractC24555OooO00o;
import o00o00.C25206OooO0Oo;
import o0O0OoOo.C25900OooO00o;
import o0O0ooo0.EnumC26248OooOo0;
import o0O0oooO.ViewOnClickListenerC26348o000oOoO;
import o0Oo.C28022OooOOO0;
import o0Oo00o.C28026OooO0OO;
import o0Oo00oo.C28039OooO00o;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0ooo.AbstractC28485OooOo00;
import o0Oo0ooo.C28480OooOOo;
import o0Oo0ooo.C28489OooOoO0;
import o0Oo0ooo.EnumC28481OooOOo0;
import o0OoO0.C28513OooO0oO;
import o0OoO0oo.C28706OooOo0O;
import o0o000oo.o000oOoO;
import o0oOoOoO.C31097OooO0Oo;
import o0ooOOO0.C31633OooOOO0;
import o0ooOOO0.C31635OooOOOo;
import o0ooOOO0.C31636OooOOo;
import o0ooOOO0.C31637OooOOo0;
import o0ooOOO0.C31639OooOo0;
import o0ooOOO0.C31640OooOo00;
import oO00ooO.C32438OooO0oO;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooO.EnumC32441OooOO0O;
import oO00ooO.InterfaceC32440OooOO0;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0O0o.C33595OooOOo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33764OoooOOo;
import oO0o0Oo.C33765OoooOo0;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0OoO.C33801OooOOO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/login/verificationcode/PhoneVerificationRequestFragment;", "Lcom/orion/notein/ui/login/thirdparty/LoginFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class PhoneVerificationRequestFragment extends Hilt_PhoneVerificationRequestFragment {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final C22026ooOO f72662OooOoo;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final C22026ooOO f72663OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final C22026ooOO f72664OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public LabeledTextFieldView f72665Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public View f72666Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public CheckBox f72667Oooo00o;

    public static final class OooO extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f72668OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f72668OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f72668OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.verificationcode.PhoneVerificationRequestFragment$onViewCreated$10", m80623f = "PhoneVerificationRequestFragment.kt", m80624l = {119}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f72670OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.login.verificationcode.PhoneVerificationRequestFragment$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.verificationcode.PhoneVerificationRequestFragment$onViewCreated$10$1", m80623f = "PhoneVerificationRequestFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C19243OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PhoneVerificationRequestFragment f72671OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f72672OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.login.verificationcode.PhoneVerificationRequestFragment$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.verificationcode.PhoneVerificationRequestFragment$onViewCreated$10$1$1", m80623f = "PhoneVerificationRequestFragment.kt", m80624l = {121}, m80625m = "invokeSuspend")
            public static final class C19244OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ PhoneVerificationRequestFragment f72673OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public int f72674OooOo0o;

                /* JADX INFO: renamed from: com.orion.notein.ui.login.verificationcode.PhoneVerificationRequestFragment$OooO00o$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
                public static final class C19245OooO00o<T> implements InterfaceC33723OooO0oO {

                    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                    public final /* synthetic */ PhoneVerificationRequestFragment f72675OooOo0o;

                    public C19245OooO00o(PhoneVerificationRequestFragment phoneVerificationRequestFragment) {
                        this.f72675OooOo0o = phoneVerificationRequestFragment;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // oO0o0Oo.InterfaceC33723OooO0oO
                    public final Object emit(Object obj, Continuation continuation) {
                        C33781o00o0O c33781o00o0O;
                        Object value;
                        String code = (String) obj;
                        PhoneVerificationRequestFragment phoneVerificationRequestFragment = this.f72675OooOo0o;
                        LabeledTextFieldView labeledTextFieldView = phoneVerificationRequestFragment.f72665Oooo000;
                        if (labeledTextFieldView == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("phoneNumberTextField");
                            throw null;
                        }
                        labeledTextFieldView.setCountryCode("+" + code);
                        C31639OooOo0 c31639OooOo0Oooo000 = phoneVerificationRequestFragment.Oooo000();
                        kotlin.jvm.internal.OooOOO0.OooO0oO(code, "code");
                        do {
                            c33781o00o0O = c31639OooOo0Oooo000.f113094OooO0Oo;
                            value = c33781o00o0O.getValue();
                        } while (!c33781o00o0O.OooO(value, C31640OooOo00.OooO00o((C31640OooOo00) value, C33599OooOo0O.Oooo0o0(code) ? "86" : code, null, false, 6)));
                        return C32460OooOooO.f116667OooO00o;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C19244OooO00o(PhoneVerificationRequestFragment phoneVerificationRequestFragment, Continuation<? super C19244OooO00o> continuation) {
                    super(2, continuation);
                    this.f72673OooOo = phoneVerificationRequestFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    return new C19244OooO00o(this.f72673OooOo, continuation);
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                    ((C19244OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                    return EnumC32485OooO00o.f116726OooOo0o;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    int i = this.f72674OooOo0o;
                    if (i != 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        throw androidx.transition.OooOOOO.OooO0O0(obj);
                    }
                    C32446OooOOOo.OooO0O0(obj);
                    PhoneVerificationRequestFragment phoneVerificationRequestFragment = this.f72673OooOo;
                    C28022OooOOO0 c28022OooOOO0 = (C28022OooOOO0) phoneVerificationRequestFragment.f72664OooOooo.getValue();
                    C19245OooO00o c19245OooO00o = new C19245OooO00o(phoneVerificationRequestFragment);
                    this.f72674OooOo0o = 1;
                    c28022OooOOO0.f99369OooO0o.collect(c19245OooO00o, this);
                    return enumC32485OooO00o;
                }
            }

            /* JADX INFO: renamed from: com.orion.notein.ui.login.verificationcode.PhoneVerificationRequestFragment$OooO00o$OooO00o$OooO0O0 */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.verificationcode.PhoneVerificationRequestFragment$onViewCreated$10$1$2", m80623f = "PhoneVerificationRequestFragment.kt", m80624l = {133}, m80625m = "invokeSuspend")
            public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ PhoneVerificationRequestFragment f72676OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public int f72677OooOo0o;

                /* JADX INFO: renamed from: com.orion.notein.ui.login.verificationcode.PhoneVerificationRequestFragment$OooO00o$OooO00o$OooO0O0$OooO00o, reason: collision with other inner class name */
                @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.verificationcode.PhoneVerificationRequestFragment$onViewCreated$10$1$2$1", m80623f = "PhoneVerificationRequestFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
                public static final class C19246OooO00o extends AbstractC32476OooO implements InterfaceC32510OooOOo0<C31640OooOo00, C28480OooOOo, Continuation<? super Boolean>, Object> {

                    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                    public /* synthetic */ C28480OooOOo f72678OooOo;

                    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                    public /* synthetic */ C31640OooOo00 f72679OooOo0o;

                    @Override // oO0O000o.InterfaceC32510OooOOo0
                    public final Object invoke(C31640OooOo00 c31640OooOo00, C28480OooOOo c28480OooOOo, Continuation<? super Boolean> continuation) {
                        C19246OooO00o c19246OooO00o = new C19246OooO00o(3, continuation);
                        c19246OooO00o.f72679OooOo0o = c31640OooOo00;
                        c19246OooO00o.f72678OooOo = c28480OooOOo;
                        return c19246OooO00o.invokeSuspend(C32460OooOooO.f116667OooO00o);
                    }

                    @Override // oO00ooo.AbstractC32477OooO00o
                    public final Object invokeSuspend(Object obj) {
                        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                        C32446OooOOOo.OooO0O0(obj);
                        return Boolean.valueOf(this.f72679OooOo0o.f113100OooO0OO && !this.f72678OooOo.f100912OooO0OO);
                    }
                }

                /* JADX INFO: renamed from: com.orion.notein.ui.login.verificationcode.PhoneVerificationRequestFragment$OooO00o$OooO00o$OooO0O0$OooO0O0, reason: collision with other inner class name */
                public static final class C19247OooO0O0<T> implements InterfaceC33723OooO0oO {

                    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                    public final /* synthetic */ PhoneVerificationRequestFragment f72680OooOo0o;

                    public C19247OooO0O0(PhoneVerificationRequestFragment phoneVerificationRequestFragment) {
                        this.f72680OooOo0o = phoneVerificationRequestFragment;
                    }

                    @Override // oO0o0Oo.InterfaceC33723OooO0oO
                    public final Object emit(Object obj, Continuation continuation) {
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        View view = this.f72680OooOo0o.f72666Oooo00O;
                        if (view != null) {
                            view.setEnabled(zBooleanValue);
                            return C32460OooOooO.f116667OooO00o;
                        }
                        kotlin.jvm.internal.OooOOO0.OooOOOO("btnGetVerificationCode");
                        throw null;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO0O0(PhoneVerificationRequestFragment phoneVerificationRequestFragment, Continuation<? super OooO0O0> continuation) {
                    super(2, continuation);
                    this.f72676OooOo = phoneVerificationRequestFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    return new OooO0O0(this.f72676OooOo, continuation);
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                    return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
                    int i = this.f72677OooOo0o;
                    if (i == 0) {
                        C32446OooOOOo.OooO0O0(obj);
                        PhoneVerificationRequestFragment phoneVerificationRequestFragment = this.f72676OooOo;
                        C31639OooOo0 c31639OooOo0Oooo000 = phoneVerificationRequestFragment.Oooo000();
                        C28489OooOoO0 c28489OooOoO0OooOooo = phoneVerificationRequestFragment.OooOooo();
                        C19246OooO00o c19246OooO00o = new C19246OooO00o(3, null);
                        C19247OooO0O0 c19247OooO0O0 = new C19247OooO0O0(phoneVerificationRequestFragment);
                        this.f72677OooOo0o = 1;
                        Object objOooO00o = C33801OooOOO.OooO00o(this, C33765OoooOo0.f121745OooOo0o, new C33764OoooOOo(c19246OooO00o, null), c19247OooO0O0, new InterfaceC33721OooO0o[]{c31639OooOo0Oooo000.f113096OooO0o0, c28489OooOoO0OooOooo.f100958OooO0oO});
                        if (objOooO00o != obj2) {
                            objOooO00o = C32460OooOooO.f116667OooO00o;
                        }
                        if (objOooO00o == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C32446OooOOOo.OooO0O0(obj);
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX INFO: renamed from: com.orion.notein.ui.login.verificationcode.PhoneVerificationRequestFragment$OooO00o$OooO00o$OooO0OO */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.verificationcode.PhoneVerificationRequestFragment$onViewCreated$10$1$3", m80623f = "PhoneVerificationRequestFragment.kt", m80624l = {138}, m80625m = "invokeSuspend")
            public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ PhoneVerificationRequestFragment f72681OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public int f72682OooOo0o;

                /* JADX INFO: renamed from: com.orion.notein.ui.login.verificationcode.PhoneVerificationRequestFragment$OooO00o$OooO00o$OooO0OO$OooO00o, reason: collision with other inner class name */
                public static final class C19248OooO00o<T> implements InterfaceC33723OooO0oO {

                    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                    public final /* synthetic */ PhoneVerificationRequestFragment f72683OooOo0o;

                    /* JADX INFO: renamed from: com.orion.notein.ui.login.verificationcode.PhoneVerificationRequestFragment$OooO00o$OooO00o$OooO0OO$OooO00o$OooO00o, reason: collision with other inner class name */
                    public /* synthetic */ class C19249OooO00o {

                        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
                        public static final /* synthetic */ int[] f72684OooO00o;

                        static {
                            int[] iArr = new int[EnumC28481OooOOo0.values().length];
                            try {
                                EnumC28481OooOOo0 enumC28481OooOOo0 = EnumC28481OooOOo0.f100917OooOo0o;
                                iArr[0] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                EnumC28481OooOOo0 enumC28481OooOOo02 = EnumC28481OooOOo0.f100917OooOo0o;
                                iArr[1] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                EnumC28481OooOOo0 enumC28481OooOOo03 = EnumC28481OooOOo0.f100917OooOo0o;
                                iArr[2] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            f72684OooO00o = iArr;
                        }
                    }

                    public C19248OooO00o(PhoneVerificationRequestFragment phoneVerificationRequestFragment) {
                        this.f72683OooOo0o = phoneVerificationRequestFragment;
                    }

                    @Override // oO0o0Oo.InterfaceC33723OooO0oO
                    public final Object emit(Object obj, Continuation continuation) {
                        String string;
                        C28480OooOOo c28480OooOOo = (C28480OooOOo) obj;
                        EnumC26248OooOo0 enumC26248OooOo0 = c28480OooOOo.f100913OooO0Oo != null ? EnumC26248OooOo0.f89696OooOoO0 : EnumC26248OooOo0.f89694OooOo0o;
                        PhoneVerificationRequestFragment phoneVerificationRequestFragment = this.f72683OooOo0o;
                        LabeledTextFieldView labeledTextFieldView = phoneVerificationRequestFragment.f72665Oooo000;
                        if (labeledTextFieldView == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("phoneNumberTextField");
                            throw null;
                        }
                        if (labeledTextFieldView.getState() != enumC26248OooOo0) {
                            LabeledTextFieldView labeledTextFieldView2 = phoneVerificationRequestFragment.f72665Oooo000;
                            if (labeledTextFieldView2 == null) {
                                kotlin.jvm.internal.OooOOO0.OooOOOO("phoneNumberTextField");
                                throw null;
                            }
                            labeledTextFieldView2.setState(enumC26248OooOo0);
                        }
                        EnumC28481OooOOo0 enumC28481OooOOo0 = c28480OooOOo.f100913OooO0Oo;
                        int i = enumC28481OooOOo0 == null ? -1 : C19249OooO00o.f72684OooO00o[enumC28481OooOOo0.ordinal()];
                        if (i == -1) {
                            string = phoneVerificationRequestFragment.getString(R.string.tips_phone_number_registration);
                        } else if (i == 1) {
                            string = phoneVerificationRequestFragment.getString(R.string.phone_number_is_wrong);
                        } else if (i == 2) {
                            string = phoneVerificationRequestFragment.getString(R.string.network_error);
                        } else {
                            if (i != 3) {
                                throw new C32442OooOO0o();
                            }
                            string = phoneVerificationRequestFragment.getString(R.string.phone_is_bounded);
                        }
                        kotlin.jvm.internal.OooOOO0.OooO0Oo(string);
                        LabeledTextFieldView labeledTextFieldView3 = phoneVerificationRequestFragment.f72665Oooo000;
                        if (labeledTextFieldView3 != null) {
                            labeledTextFieldView3.setSupportingText(string);
                            return C32460OooOooO.f116667OooO00o;
                        }
                        kotlin.jvm.internal.OooOOO0.OooOOOO("phoneNumberTextField");
                        throw null;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO0OO(PhoneVerificationRequestFragment phoneVerificationRequestFragment, Continuation<? super OooO0OO> continuation) {
                    super(2, continuation);
                    this.f72681OooOo = phoneVerificationRequestFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    return new OooO0OO(this.f72681OooOo, continuation);
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                    ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                    return EnumC32485OooO00o.f116726OooOo0o;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    int i = this.f72682OooOo0o;
                    if (i == 0) {
                        C32446OooOOOo.OooO0O0(obj);
                        PhoneVerificationRequestFragment phoneVerificationRequestFragment = this.f72681OooOo;
                        C28489OooOoO0 c28489OooOoO0OooOooo = phoneVerificationRequestFragment.OooOooo();
                        C19248OooO00o c19248OooO00o = new C19248OooO00o(phoneVerificationRequestFragment);
                        this.f72682OooOo0o = 1;
                        if (c28489OooOoO0OooOooo.f100958OooO0oO.f121747OooOo0o.collect(c19248OooO00o, this) == enumC32485OooO00o) {
                            return enumC32485OooO00o;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C32446OooOOOo.OooO0O0(obj);
                    }
                    throw new C32438OooO0oO();
                }
            }

            /* JADX INFO: renamed from: com.orion.notein.ui.login.verificationcode.PhoneVerificationRequestFragment$OooO00o$OooO00o$OooO0Oo, reason: case insensitive filesystem */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.verificationcode.PhoneVerificationRequestFragment$onViewCreated$10$1$4", m80623f = "PhoneVerificationRequestFragment.kt", m80624l = {159}, m80625m = "invokeSuspend")
            public static final class C23196OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ PhoneVerificationRequestFragment f72685OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public int f72686OooOo0o;

                /* JADX INFO: renamed from: com.orion.notein.ui.login.verificationcode.PhoneVerificationRequestFragment$OooO00o$OooO00o$OooO0Oo$OooO00o, reason: collision with other inner class name */
                public static final class C19250OooO00o<T> implements InterfaceC33723OooO0oO {

                    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                    public final /* synthetic */ PhoneVerificationRequestFragment f72687OooOo0o;

                    public C19250OooO00o(PhoneVerificationRequestFragment phoneVerificationRequestFragment) {
                        this.f72687OooOo0o = phoneVerificationRequestFragment;
                    }

                    @Override // oO0o0Oo.InterfaceC33723OooO0oO
                    public final Object emit(Object obj, Continuation continuation) {
                        if (!kotlin.jvm.internal.OooOOO0.OooO0O0((AbstractC23191OooO0Oo) obj, AbstractC23191OooO0Oo.OooO00o.f72639OooO00o)) {
                            throw new C32442OooOO0o();
                        }
                        PhoneVerificationRequestFragment phoneVerificationRequestFragment = this.f72687OooOo0o;
                        Context contextRequireContext = phoneVerificationRequestFragment.requireContext();
                        kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                        String string = phoneVerificationRequestFragment.getString(R.string.read_and_agree_privacy_and_service_first);
                        kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                        C25206OooO0Oo.OooO0oO(contextRequireContext, string);
                        return C32460OooOooO.f116667OooO00o;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C23196OooO0Oo(PhoneVerificationRequestFragment phoneVerificationRequestFragment, Continuation<? super C23196OooO0Oo> continuation) {
                    super(2, continuation);
                    this.f72685OooOo = phoneVerificationRequestFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    return new C23196OooO0Oo(this.f72685OooOo, continuation);
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                    ((C23196OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                    return EnumC32485OooO00o.f116726OooOo0o;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    int i = this.f72686OooOo0o;
                    if (i == 0) {
                        C32446OooOOOo.OooO0O0(obj);
                        PhoneVerificationRequestFragment phoneVerificationRequestFragment = this.f72685OooOo;
                        C31639OooOo0 c31639OooOo0Oooo000 = phoneVerificationRequestFragment.Oooo000();
                        C19250OooO00o c19250OooO00o = new C19250OooO00o(phoneVerificationRequestFragment);
                        this.f72686OooOo0o = 1;
                        if (c31639OooOo0Oooo000.f113097OooO0oO.f121746OooOo0o.collect(c19250OooO00o, this) == enumC32485OooO00o) {
                            return enumC32485OooO00o;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C32446OooOOOo.OooO0O0(obj);
                    }
                    throw new C32438OooO0oO();
                }
            }

            /* JADX INFO: renamed from: com.orion.notein.ui.login.verificationcode.PhoneVerificationRequestFragment$OooO00o$OooO00o$OooO0o0, reason: case insensitive filesystem */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.verificationcode.PhoneVerificationRequestFragment$onViewCreated$10$1$5", m80623f = "PhoneVerificationRequestFragment.kt", m80624l = {170}, m80625m = "invokeSuspend")
            public static final class C23197OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ PhoneVerificationRequestFragment f72688OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public int f72689OooOo0o;

                /* JADX INFO: renamed from: com.orion.notein.ui.login.verificationcode.PhoneVerificationRequestFragment$OooO00o$OooO00o$OooO0o0$OooO00o, reason: collision with other inner class name */
                public static final class C19251OooO00o<T> implements InterfaceC33723OooO0oO {

                    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                    public final /* synthetic */ PhoneVerificationRequestFragment f72690OooOo0o;

                    public C19251OooO00o(PhoneVerificationRequestFragment phoneVerificationRequestFragment) {
                        this.f72690OooOo0o = phoneVerificationRequestFragment;
                    }

                    @Override // oO0o0Oo.InterfaceC33723OooO0oO
                    public final Object emit(Object obj, Continuation continuation) {
                        AbstractC28485OooOo00 abstractC28485OooOo00 = (AbstractC28485OooOo00) obj;
                        boolean z = abstractC28485OooOo00 instanceof AbstractC28485OooOo00.OooO0O0;
                        PhoneVerificationRequestFragment phoneVerificationRequestFragment = this.f72690OooOo0o;
                        if (z) {
                            Context contextRequireContext = phoneVerificationRequestFragment.requireContext();
                            kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                            String string = phoneVerificationRequestFragment.getString(R.string.verification_code_sent);
                            kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                            C25206OooO0Oo.OooO0oO(contextRequireContext, string);
                            AbstractC28485OooOo00.OooO0O0 oooO0O0 = (AbstractC28485OooOo00.OooO0O0) abstractC28485OooOo00;
                            String country = oooO0O0.f100931OooO00o;
                            kotlin.jvm.internal.OooOOO0.OooO0oO(country, "country");
                            String phone = oooO0O0.f100932OooO0O0;
                            kotlin.jvm.internal.OooOOO0.OooO0oO(phone, "phone");
                            C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(phoneVerificationRequestFragment), new C31636OooOOo(country, phone, ""));
                        } else {
                            if (!kotlin.jvm.internal.OooOOO0.OooO0O0(abstractC28485OooOo00, AbstractC28485OooOo00.OooO00o.f100930OooO00o)) {
                                throw new C32442OooOO0o();
                            }
                            Context contextRequireContext2 = phoneVerificationRequestFragment.requireContext();
                            kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext2, "requireContext(...)");
                            String string2 = phoneVerificationRequestFragment.getString(R.string.network_error);
                            kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
                            C25206OooO0Oo.OooO0oO(contextRequireContext2, string2);
                        }
                        return C32460OooOooO.f116667OooO00o;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C23197OooO0o0(PhoneVerificationRequestFragment phoneVerificationRequestFragment, Continuation<? super C23197OooO0o0> continuation) {
                    super(2, continuation);
                    this.f72688OooOo = phoneVerificationRequestFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    return new C23197OooO0o0(this.f72688OooOo, continuation);
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                    ((C23197OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                    return EnumC32485OooO00o.f116726OooOo0o;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    int i = this.f72689OooOo0o;
                    if (i == 0) {
                        C32446OooOOOo.OooO0O0(obj);
                        PhoneVerificationRequestFragment phoneVerificationRequestFragment = this.f72688OooOo;
                        C28489OooOoO0 c28489OooOoO0OooOooo = phoneVerificationRequestFragment.OooOooo();
                        C19251OooO00o c19251OooO00o = new C19251OooO00o(phoneVerificationRequestFragment);
                        this.f72689OooOo0o = 1;
                        if (c28489OooOoO0OooOooo.f100954OooO.f121746OooOo0o.collect(c19251OooO00o, this) == enumC32485OooO00o) {
                            return enumC32485OooO00o;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C32446OooOOOo.OooO0O0(obj);
                    }
                    throw new C32438OooO0oO();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19243OooO00o(PhoneVerificationRequestFragment phoneVerificationRequestFragment, Continuation<? super C19243OooO00o> continuation) {
                super(2, continuation);
                this.f72671OooOo = phoneVerificationRequestFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                C19243OooO00o c19243OooO00o = new C19243OooO00o(this.f72671OooOo, continuation);
                c19243OooO00o.f72672OooOo0o = obj;
                return c19243OooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C19243OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f72672OooOo0o;
                PhoneVerificationRequestFragment phoneVerificationRequestFragment = this.f72671OooOo;
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C19244OooO00o(phoneVerificationRequestFragment, null), 3);
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(phoneVerificationRequestFragment, null), 3);
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0OO(phoneVerificationRequestFragment, null), 3);
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23196OooO0Oo(phoneVerificationRequestFragment, null), 3);
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23197OooO0o0(phoneVerificationRequestFragment, null), 3);
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return PhoneVerificationRequestFragment.this.new OooO00o(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f72670OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                PhoneVerificationRequestFragment phoneVerificationRequestFragment = PhoneVerificationRequestFragment.this;
                InterfaceC21987OooOoo viewLifecycleOwner = phoneVerificationRequestFragment.getViewLifecycleOwner();
                kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                AbstractC21979OooOOo0.OooO0O0 oooO0O0 = AbstractC21979OooOOo0.OooO0O0.f65539OooOoO;
                C19243OooO00o c19243OooO00o = new C19243OooO00o(phoneVerificationRequestFragment, null);
                this.f72670OooOo0o = 1;
                if (C22005OoooOO0.OooO00o(viewLifecycleOwner, oooO0O0, c19243OooO00o, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public static final class OooO0O0 extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public OooO0O0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return PhoneVerificationRequestFragment.this.requireActivity().getViewModelStore();
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public OooO0OO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return PhoneVerificationRequestFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.login.verificationcode.PhoneVerificationRequestFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23198OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public C23198OooO0Oo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return PhoneVerificationRequestFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public OooO0o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return PhoneVerificationRequestFragment.this;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.login.verificationcode.PhoneVerificationRequestFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23199OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f72695OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23199OooO0o0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f72695OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f72695OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? PhoneVerificationRequestFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.login.verificationcode.PhoneVerificationRequestFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class C23200OooO0oO extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ OooO0o f72697OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23200OooO0oO(OooO0o oooO0o) {
            super(0);
            this.f72697OooOo0o = oooO0o;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f72697OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.login.verificationcode.PhoneVerificationRequestFragment$OooO0oo, reason: case insensitive filesystem */
    public static final class C23201OooO0oo extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f72698OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23201OooO0oo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f72698OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f72698OooOo0o.getValue()).getViewModelStore();
        }
    }

    public static final class OooOO0 extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f72699OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f72699OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f72699OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? PhoneVerificationRequestFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class OooOO0O extends OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public OooOO0O() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return PhoneVerificationRequestFragment.this;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.login.verificationcode.PhoneVerificationRequestFragment$OooOO0o, reason: case insensitive filesystem */
    public static final class C23202OooOO0o extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ OooOO0O f72702OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23202OooOO0o(OooOO0O oooOO0O) {
            super(0);
            this.f72702OooOo0o = oooOO0O;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f72702OooOo0o.invoke();
        }
    }

    public static final class OooOOO extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f72703OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f72703OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f72703OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    public static final class OooOOO0 extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f72704OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f72704OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f72704OooOo0o.getValue()).getViewModelStore();
        }
    }

    public PhoneVerificationRequestFragment() {
        OooO0o oooO0o = new OooO0o();
        EnumC32441OooOO0O enumC32441OooOO0O = EnumC32441OooOO0O.f116636OooOoO0;
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new C23200OooO0oO(oooO0o));
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f72662OooOoo = new C22026ooOO(oooo0.OooO0O0(C31639OooOo0.class), new C23201OooO0oo(interfaceC32440OooOO0OooO0O0), new OooOO0(interfaceC32440OooOO0OooO0O0), new OooO(interfaceC32440OooOO0OooO0O0));
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O02 = C20519OooO0Oo.OooO0O0(enumC32441OooOO0O, new C23202OooOO0o(new OooOO0O()));
        this.f72663OooOooO = new C22026ooOO(oooo0.OooO0O0(C28489OooOoO0.class), new OooOOO0(interfaceC32440OooOO0OooO0O02), new C23199OooO0o0(interfaceC32440OooOO0OooO0O02), new OooOOO(interfaceC32440OooOO0OooO0O02));
        this.f72664OooOooo = new C22026ooOO(oooo0.OooO0O0(C28022OooOOO0.class), new OooO0O0(), new C23198OooO0Oo(), new OooO0OO());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o0OoO0OO.InterfaceC28621OooOo
    public final boolean OooO0OO() {
        Context context;
        boolean z = ((C31640OooOo00) Oooo000().f113096OooO0o0.f121747OooOo0o.getValue()).f113100OooO0OO;
        if (!z && (context = getContext()) != null) {
            C28513OooO0oO.OooO00o(context, R.string.read_and_agree_privacy_and_service_first, "getString(...)", context);
        }
        return z;
    }

    @Override // o0OoO0OO.InterfaceC28618OooOOo
    public final void OooOOoo(int i, String accessToken, String openID) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(accessToken, "accessToken");
        kotlin.jvm.internal.OooOOO0.OooO0oO(openID, "openID");
        C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(this), new C31637OooOOo0(i, accessToken, openID));
    }

    public final C28489OooOoO0 OooOooo() {
        return (C28489OooOoO0) this.f72663OooOooO.getValue();
    }

    public final C31639OooOo0 Oooo000() {
        return (C31639OooOo0) this.f72662OooOoo.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_phone_verification_request, viewGroup, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00c8  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        C33781o00o0O c33781o00o0O;
        Object value;
        boolean z;
        kotlin.jvm.internal.OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        LabeledTextFieldView labeledTextFieldView = (LabeledTextFieldView) view.findViewById(R.id.phone_number_field);
        labeledTextFieldView.setOnCountryCodeClickListener(new C28706OooOo0O(this, 1));
        labeledTextFieldView.setOnValueChangeListener(new C31633OooOOO0(this, 0));
        this.f72665Oooo000 = labeledTextFieldView;
        CheckBox checkBox = (CheckBox) view.findViewById(R.id.agree);
        this.f72667Oooo00o = checkBox;
        if (checkBox == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("agree");
            throw null;
        }
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o0ooOOO0.OooOOO
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                C33781o00o0O c33781o00o0O2;
                Object value2;
                kotlin.jvm.internal.OooOOO0.OooO0oO(compoundButton, "<unused var>");
                C31639OooOo0 c31639OooOo0Oooo000 = this.f113082OooO00o.Oooo000();
                do {
                    c33781o00o0O2 = c31639OooOo0Oooo000.f113094OooO0Oo;
                    value2 = c33781o00o0O2.getValue();
                } while (!c33781o00o0O2.OooO(value2, C31640OooOo00.OooO00o((C31640OooOo00) value2, null, null, z2, 3)));
            }
        });
        C31639OooOo0 c31639OooOo0Oooo000 = Oooo000();
        CheckBox checkBox2 = this.f72667Oooo00o;
        if (checkBox2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("agree");
            throw null;
        }
        boolean zIsChecked = checkBox2.isChecked();
        do {
            c33781o00o0O = c31639OooOo0Oooo000.f113094OooO0Oo;
            value = c33781o00o0O.getValue();
        } while (!c33781o00o0O.OooO(value, C31640OooOo00.OooO00o((C31640OooOo00) value, null, null, zIsChecked, 3)));
        TextView textView = (TextView) view.findViewById(R.id.privacy_and_service);
        if (textView == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("privacyAndService");
            throw null;
        }
        o0O0OoOo.OooO0OO.OooO00o(textView, R.string.read_privacy_and_service, new C25900OooO00o(R.string.privacy_policy, new InterfaceC32507OooOO0o() { // from class: o0ooOOO0.OooOOOO
            @Override // oO0O000o.InterfaceC32507OooOO0o
            public final Object invoke(Object obj) {
                View it = (View) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(it, "it");
                Context contextRequireContext = this.f113085OooOo0o.requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                C33609OooO0oo.OooO0OO(C33633Oooo0.OooO0O0(), null, null, new C31097OooO0Oo(contextRequireContext, null), 3);
                return C32460OooOooO.f116667OooO00o;
            }
        }), new C25900OooO00o(R.string.service_agreement, new C31635OooOOOo(this, 0)));
        View viewFindViewById = view.findViewById(R.id.btn_get_verification_code);
        this.f72666Oooo00O = viewFindViewById;
        if (viewFindViewById == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("btnGetVerificationCode");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewFindViewById, 500L, new o000oOoO(this, 4));
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_huawei);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(imageView);
        if (!C28039OooO00o.OooO0O0()) {
            String BRAND = Build.BRAND;
            kotlin.jvm.internal.OooOOO0.OooO0o(BRAND, "BRAND");
            z = !C33599OooOo0O.OooOoOO(BRAND, "Lenovo", true);
        }
        imageView.setVisibility(z ? 0 : 8);
        View viewFindViewById2 = view.findViewById(R.id.iv_progress_huawei);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(viewFindViewById2);
        OooOoO(imageView, viewFindViewById2);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.iv_wechat);
        View viewFindViewById3 = view.findViewById(R.id.iv_progress_wechat);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(imageView2);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(viewFindViewById3);
        OooOoo0(imageView2, viewFindViewById3);
        ImageView imageView3 = (ImageView) view.findViewById(R.id.iv_xiaomi);
        View viewFindViewById4 = view.findViewById(R.id.iv_progress_xiaomi);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(imageView3);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(viewFindViewById4);
        OooOoo(imageView3, viewFindViewById4);
        ImageView imageView4 = (ImageView) view.findViewById(R.id.iv_honor);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(imageView4);
        imageView4.setVisibility(C33595OooOOo.OooOOo(Build.MANUFACTURER, "HONOR", true) ? 0 : 8);
        View viewFindViewById5 = view.findViewById(R.id.iv_progress_honor);
        kotlin.jvm.internal.OooOOO0.OooO0Oo(viewFindViewById5);
        OooOoOO(imageView4, viewFindViewById5);
        view.findViewById(R.id.tv_password_login).setOnClickListener(new ViewOnClickListenerC26348o000oOoO(this, 5));
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooO00o(null), 3);
    }
}
