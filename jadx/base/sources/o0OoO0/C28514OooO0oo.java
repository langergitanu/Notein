package o0OoO0;

import android.content.Context;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.C22005OoooOO0;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.niui.components.button.TextButtonView;
import com.orion.niui.components.textinput.LabeledTextFieldView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.login.password.OooO00o;
import com.orion.notein.p607ui.login.password.OooO0O0;
import com.orion.notein.p607ui.login.password.PasswordLoginFragment;
import java.util.Arrays;
import kotlin.coroutines.Continuation;
import o00o00.C25206OooO0Oo;
import o0O0ooo0.EnumC26248OooOo0;
import o0Oo.C28022OooOOO0;
import oO00ooO.C32438OooO0oO;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: renamed from: o0OoO0.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.password.PasswordLoginFragment$collectState$1", m80623f = "PasswordLoginFragment.kt", m80624l = {138}, m80625m = "invokeSuspend")
public final class C28514OooO0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ PasswordLoginFragment f101080OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f101081OooOo0o;

    /* JADX INFO: renamed from: o0OoO0.OooO0oo$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.password.PasswordLoginFragment$collectState$1$1", m80623f = "PasswordLoginFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ PasswordLoginFragment f101082OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f101083OooOo0o;

        /* JADX INFO: renamed from: o0OoO0.OooO0oo$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.password.PasswordLoginFragment$collectState$1$1$1", m80623f = "PasswordLoginFragment.kt", m80624l = {140}, m80625m = "invokeSuspend")
        public static final class C19912OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PasswordLoginFragment f101084OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f101085OooOo0o;

            /* JADX INFO: renamed from: o0OoO0.OooO0oo$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
            public static final class C19913OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ PasswordLoginFragment f101086OooOo0o;

                public C19913OooO00o(PasswordLoginFragment passwordLoginFragment) {
                    this.f101086OooOo0o = passwordLoginFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    String code = (String) obj;
                    C28522OooOo0O c28522OooOo0OOooOooo = this.f101086OooOo0o.OooOooo();
                    kotlin.jvm.internal.OooOOO0.OooO0oO(code, "code");
                    String strOoooO0 = C33599OooOo0O.OoooO0(code, "+");
                    if (C33599OooOo0O.Oooo0o0(strOoooO0)) {
                        strOoooO0 = "86";
                    }
                    c28522OooOo0OOooOooo.OooO0o0(new OooOOOO(strOoooO0, 0));
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19912OooO00o(PasswordLoginFragment passwordLoginFragment, Continuation<? super C19912OooO00o> continuation) {
                super(2, continuation);
                this.f101084OooOo = passwordLoginFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19912OooO00o(this.f101084OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C19912OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f101085OooOo0o;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw androidx.transition.OooOOOO.OooO0O0(obj);
                }
                C32446OooOOOo.OooO0O0(obj);
                PasswordLoginFragment passwordLoginFragment = this.f101084OooOo;
                C28022OooOOO0 c28022OooOOO0 = (C28022OooOOO0) passwordLoginFragment.f72486OooOooO.getValue();
                C19913OooO00o c19913OooO00o = new C19913OooO00o(passwordLoginFragment);
                this.f101085OooOo0o = 1;
                c28022OooOOO0.f99369OooO0o.collect(c19913OooO00o, this);
                return enumC32485OooO00o;
            }
        }

        /* JADX INFO: renamed from: o0OoO0.OooO0oo$OooO00o$OooO0O0 */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.password.PasswordLoginFragment$collectState$1$1$2", m80623f = "PasswordLoginFragment.kt", m80624l = {145}, m80625m = "invokeSuspend")
        public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PasswordLoginFragment f101087OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f101088OooOo0o;

            /* JADX INFO: renamed from: o0OoO0.OooO0oo$OooO00o$OooO0O0$OooO00o, reason: collision with other inner class name */
            public static final class C19914OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ PasswordLoginFragment f101089OooOo0o;

                public C19914OooO00o(PasswordLoginFragment passwordLoginFragment) {
                    this.f101089OooOo0o = passwordLoginFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    OooOO0O oooOO0O = (OooOO0O) obj;
                    final PasswordLoginFragment passwordLoginFragment = this.f101089OooOo0o;
                    String strOooO00o = com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("+", oooOO0O.f101094OooO00o);
                    LabeledTextFieldView labeledTextFieldView = passwordLoginFragment.f72487OooOooo;
                    if (labeledTextFieldView == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("phoneField");
                        throw null;
                    }
                    String text = labeledTextFieldView.getText();
                    String str = oooOO0O.f101095OooO0O0;
                    if (!kotlin.jvm.internal.OooOOO0.OooO0O0(text, str)) {
                        LabeledTextFieldView labeledTextFieldView2 = passwordLoginFragment.f72487OooOooo;
                        if (labeledTextFieldView2 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("phoneField");
                            throw null;
                        }
                        labeledTextFieldView2.setText(str);
                    }
                    LabeledTextFieldView labeledTextFieldView3 = passwordLoginFragment.f72487OooOooo;
                    if (labeledTextFieldView3 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("phoneField");
                        throw null;
                    }
                    labeledTextFieldView3.setCountryCode(strOooO00o);
                    OooO00o.OooO0O0 oooO0O0 = OooO00o.OooO0O0.f72472OooO00o;
                    com.orion.notein.p607ui.login.password.OooO00o oooO00o = oooOO0O.f101096OooO0OO;
                    EnumC26248OooOo0 enumC26248OooOo0 = kotlin.jvm.internal.OooOOO0.OooO0O0(oooO00o, oooO0O0) ? EnumC26248OooOo0.f89696OooOoO0 : EnumC26248OooOo0.f89694OooOo0o;
                    LabeledTextFieldView labeledTextFieldView4 = passwordLoginFragment.f72487OooOooo;
                    if (labeledTextFieldView4 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("phoneField");
                        throw null;
                    }
                    if (labeledTextFieldView4.getState() != enumC26248OooOo0) {
                        LabeledTextFieldView labeledTextFieldView5 = passwordLoginFragment.f72487OooOooo;
                        if (labeledTextFieldView5 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("phoneField");
                            throw null;
                        }
                        labeledTextFieldView5.setState(enumC26248OooOo0);
                    }
                    boolean zOooO0O0 = kotlin.jvm.internal.OooOOO0.OooO0O0(oooO00o, oooO0O0);
                    String string = "";
                    String string2 = zOooO0O0 ? passwordLoginFragment.getString(R.string.phone_number_is_wrong) : "";
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(string2);
                    LabeledTextFieldView labeledTextFieldView6 = passwordLoginFragment.f72487OooOooo;
                    if (labeledTextFieldView6 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("phoneField");
                        throw null;
                    }
                    labeledTextFieldView6.setSupportingText(string2);
                    LabeledTextFieldView labeledTextFieldView7 = passwordLoginFragment.f72488Oooo000;
                    if (labeledTextFieldView7 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("passwordField");
                        throw null;
                    }
                    String text2 = labeledTextFieldView7.getText();
                    String str2 = oooOO0O.f101097OooO0Oo;
                    if (!kotlin.jvm.internal.OooOOO0.OooO0O0(text2, str2)) {
                        LabeledTextFieldView labeledTextFieldView8 = passwordLoginFragment.f72488Oooo000;
                        if (labeledTextFieldView8 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("passwordField");
                            throw null;
                        }
                        labeledTextFieldView8.setText(str2);
                    }
                    com.orion.notein.p607ui.login.password.OooO00o oooO00o2 = oooOO0O.f101098OooO0o;
                    EnumC26248OooOo0 enumC26248OooOo02 = oooO00o2 != null ? EnumC26248OooOo0.f89696OooOoO0 : EnumC26248OooOo0.f89694OooOo0o;
                    LabeledTextFieldView labeledTextFieldView9 = passwordLoginFragment.f72488Oooo000;
                    if (labeledTextFieldView9 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("passwordField");
                        throw null;
                    }
                    if (labeledTextFieldView9.getState() != enumC26248OooOo02) {
                        LabeledTextFieldView labeledTextFieldView10 = passwordLoginFragment.f72488Oooo000;
                        if (labeledTextFieldView10 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("passwordField");
                            throw null;
                        }
                        labeledTextFieldView10.setState(enumC26248OooOo02);
                    }
                    if (oooO00o2 instanceof OooO00o.C19224OooO00o) {
                        string = passwordLoginFragment.getString(R.string.username_password_does_not_match);
                    } else if (oooO00o2 instanceof OooO00o.OooO0OO) {
                        string = passwordLoginFragment.getString(R.string.retry_login_after_a_few_minutes, String.valueOf(((OooO00o.OooO0OO) oooO00o2).f72473OooO00o));
                    }
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(string);
                    LabeledTextFieldView labeledTextFieldView11 = passwordLoginFragment.f72488Oooo000;
                    if (labeledTextFieldView11 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("passwordField");
                        throw null;
                    }
                    labeledTextFieldView11.setSupportingText(string);
                    TextButtonView textButtonView = passwordLoginFragment.f72489Oooo00O;
                    if (textButtonView == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("loginButton");
                        throw null;
                    }
                    boolean z = oooOO0O.f101093OooO;
                    textButtonView.setEnabled(z);
                    TextButtonView textButtonView2 = passwordLoginFragment.f72489Oooo00O;
                    if (textButtonView2 == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("loginButton");
                        throw null;
                    }
                    textButtonView2.setClickable(z);
                    CheckBox checkBox = passwordLoginFragment.f72490Oooo00o;
                    if (checkBox == null) {
                        kotlin.jvm.internal.OooOOO0.OooOOOO("agreeCheckBox");
                        throw null;
                    }
                    boolean zIsChecked = checkBox.isChecked();
                    boolean z2 = oooOO0O.f101100OooO0oO;
                    if (zIsChecked != z2) {
                        CheckBox checkBox2 = passwordLoginFragment.f72490Oooo00o;
                        if (checkBox2 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("agreeCheckBox");
                            throw null;
                        }
                        checkBox2.setOnCheckedChangeListener(null);
                        CheckBox checkBox3 = passwordLoginFragment.f72490Oooo00o;
                        if (checkBox3 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("agreeCheckBox");
                            throw null;
                        }
                        checkBox3.setChecked(z2);
                        CheckBox checkBox4 = passwordLoginFragment.f72490Oooo00o;
                        if (checkBox4 == null) {
                            kotlin.jvm.internal.OooOOO0.OooOOOO("agreeCheckBox");
                            throw null;
                        }
                        checkBox4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o0OoO0.OooO00o
                            @Override // android.widget.CompoundButton.OnCheckedChangeListener
                            public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
                                kotlin.jvm.internal.OooOOO0.OooO0oO(compoundButton, "<unused var>");
                                passwordLoginFragment.OooOooo().OooO0o0(new C28516OooOO0o(z3));
                            }
                        });
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(PasswordLoginFragment passwordLoginFragment, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f101087OooOo = passwordLoginFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0O0(this.f101087OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f101088OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    PasswordLoginFragment passwordLoginFragment = this.f101087OooOo;
                    C28522OooOo0O c28522OooOo0OOooOooo = passwordLoginFragment.OooOooo();
                    C19914OooO00o c19914OooO00o = new C19914OooO00o(passwordLoginFragment);
                    this.f101088OooOo0o = 1;
                    if (c28522OooOo0OOooOooo.f101114OooO.f121747OooOo0o.collect(c19914OooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: o0OoO0.OooO0oo$OooO00o$OooO0OO */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.password.PasswordLoginFragment$collectState$1$1$3", m80623f = "PasswordLoginFragment.kt", m80624l = {150}, m80625m = "invokeSuspend")
        public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ PasswordLoginFragment f101090OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f101091OooOo0o;

            /* JADX INFO: renamed from: o0OoO0.OooO0oo$OooO00o$OooO0OO$OooO00o, reason: collision with other inner class name */
            public static final class C19915OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ PasswordLoginFragment f101092OooOo0o;

                public C19915OooO00o(PasswordLoginFragment passwordLoginFragment) {
                    this.f101092OooOo0o = passwordLoginFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    com.orion.notein.p607ui.login.password.OooO0O0 oooO0O0 = (com.orion.notein.p607ui.login.password.OooO0O0) obj;
                    PasswordLoginFragment passwordLoginFragment = this.f101092OooOo0o;
                    if (oooO0O0 instanceof OooO0O0.C19225OooO0O0) {
                        OooO0O0.C19225OooO0O0 c19225OooO0O0 = (OooO0O0.C19225OooO0O0) oooO0O0;
                        String[] strArr = (String[]) c19225OooO0O0.f72476OooO0O0.toArray(new String[0]);
                        Context context = passwordLoginFragment.getContext();
                        if (context != null) {
                            String string = context.getString(c19225OooO0O0.f72475OooO00o, Arrays.copyOf(strArr, strArr.length));
                            kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                            C25206OooO0Oo.OooO0oO(context, string);
                        }
                    } else if (!kotlin.jvm.internal.OooOOO0.OooO0O0(oooO0O0, OooO0O0.OooO00o.f72474OooO00o)) {
                        throw new C32442OooOO0o();
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0OO(PasswordLoginFragment passwordLoginFragment, Continuation<? super OooO0OO> continuation) {
                super(2, continuation);
                this.f101090OooOo = passwordLoginFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0OO(this.f101090OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f101091OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    PasswordLoginFragment passwordLoginFragment = this.f101090OooOo;
                    C28522OooOo0O c28522OooOo0OOooOooo = passwordLoginFragment.OooOooo();
                    C19915OooO00o c19915OooO00o = new C19915OooO00o(passwordLoginFragment);
                    this.f101091OooOo0o = 1;
                    if (c28522OooOo0OOooOooo.f101121OooOO0O.f121746OooOo0o.collect(c19915OooO00o, this) == enumC32485OooO00o) {
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
        public OooO00o(PasswordLoginFragment passwordLoginFragment, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f101082OooOo = passwordLoginFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f101082OooOo, continuation);
            oooO00o.f101083OooOo0o = obj;
            return oooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f101083OooOo0o;
            PasswordLoginFragment passwordLoginFragment = this.f101082OooOo;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C19912OooO00o(passwordLoginFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(passwordLoginFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0OO(passwordLoginFragment, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28514OooO0oo(PasswordLoginFragment passwordLoginFragment, Continuation<? super C28514OooO0oo> continuation) {
        super(2, continuation);
        this.f101080OooOo = passwordLoginFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C28514OooO0oo(this.f101080OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C28514OooO0oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f101081OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            PasswordLoginFragment passwordLoginFragment = this.f101080OooOo;
            InterfaceC21987OooOoo viewLifecycleOwner = passwordLoginFragment.getViewLifecycleOwner();
            kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            AbstractC21979OooOOo0.OooO0O0 oooO0O0 = AbstractC21979OooOOo0.OooO0O0.f65539OooOoO;
            OooO00o oooO00o = new OooO00o(passwordLoginFragment, null);
            this.f101081OooOo0o = 1;
            if (C22005OoooOO0.OooO00o(viewLifecycleOwner, oooO0O0, oooO00o, this) == enumC32485OooO00o) {
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
