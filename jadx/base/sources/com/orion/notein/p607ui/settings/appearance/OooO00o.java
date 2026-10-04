package com.orion.notein.p607ui.settings.appearance;

import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.C22005OoooOO0;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.niui.components.button.SelectableSymbolButtonView;
import com.orion.niui.components.listitems.SwitchListItemView;
import com.orion.notein.p607ui.settings.appearance.AppearanceSettingsFragment;
import java.util.Locale;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o00o00O0.C25252OooO0Oo;
import o0o0Oo0O.C30623OooOOOO;
import o0o0Oo0o.C30656OooO0oO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.appearance.AppearanceSettingsFragment$bindState$1", m80623f = "AppearanceSettingsFragment.kt", m80624l = {95}, m80625m = "invokeSuspend")
public final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ AppearanceSettingsFragment f78945OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f78946OooOo0o;

    /* JADX INFO: renamed from: com.orion.notein.ui.settings.appearance.OooO00o$OooO00o, reason: collision with other inner class name */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.appearance.AppearanceSettingsFragment$bindState$1$1", m80623f = "AppearanceSettingsFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class C19473OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ AppearanceSettingsFragment f78947OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f78948OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.settings.appearance.OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.appearance.AppearanceSettingsFragment$bindState$1$1$1", m80623f = "AppearanceSettingsFragment.kt", m80624l = {97}, m80625m = "invokeSuspend")
        public static final class C19474OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ AppearanceSettingsFragment f78949OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f78950OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.settings.appearance.OooO00o$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.appearance.AppearanceSettingsFragment$bindState$1$1$1$1", m80623f = "AppearanceSettingsFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class C19475OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ AppearanceSettingsFragment f78951OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ boolean f78952OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C19475OooO00o(AppearanceSettingsFragment appearanceSettingsFragment, Continuation<? super C19475OooO00o> continuation) {
                    super(2, continuation);
                    this.f78951OooOo = appearanceSettingsFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    C19475OooO00o c19475OooO00o = new C19475OooO00o(this.f78951OooOo, continuation);
                    c19475OooO00o.f78952OooOo0o = ((Boolean) obj).booleanValue();
                    return c19475OooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(Boolean bool, Continuation<? super C32460OooOooO> continuation) {
                    Boolean bool2 = bool;
                    bool2.booleanValue();
                    return ((C19475OooO00o) create(bool2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    boolean z = this.f78952OooOo0o;
                    AppearanceSettingsFragment appearanceSettingsFragment = this.f78951OooOo;
                    SwitchListItemView switchListItemView = appearanceSettingsFragment.f78910Oooo00O;
                    if (switchListItemView == null) {
                        OooOOO0.OooOOOO("keepScreenOnToggle");
                        throw null;
                    }
                    if (switchListItemView.OooO() != z) {
                        SwitchListItemView switchListItemView2 = appearanceSettingsFragment.f78910Oooo00O;
                        if (switchListItemView2 == null) {
                            OooOOO0.OooOOOO("keepScreenOnToggle");
                            throw null;
                        }
                        switchListItemView2.setChecked(z);
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19474OooO00o(AppearanceSettingsFragment appearanceSettingsFragment, Continuation<? super C19474OooO00o> continuation) {
                super(2, continuation);
                this.f78949OooOo = appearanceSettingsFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19474OooO00o(this.f78949OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C19474OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f78950OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    AppearanceSettingsFragment appearanceSettingsFragment = this.f78949OooOo;
                    C30623OooOOOO c30623OooOOOOOooOoO = appearanceSettingsFragment.OooOoO();
                    C19475OooO00o c19475OooO00o = new C19475OooO00o(appearanceSettingsFragment, null);
                    this.f78950OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c30623OooOOOOOooOoO.f109584OooOOo, c19475OooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.settings.appearance.OooO00o$OooO00o$OooO0O0 */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.appearance.AppearanceSettingsFragment$bindState$1$1$2", m80623f = "AppearanceSettingsFragment.kt", m80624l = {104}, m80625m = "invokeSuspend")
        public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ AppearanceSettingsFragment f78953OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f78954OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.settings.appearance.OooO00o$OooO00o$OooO0O0$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.appearance.AppearanceSettingsFragment$bindState$1$1$2$1", m80623f = "AppearanceSettingsFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class C19476OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Boolean, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ AppearanceSettingsFragment f78955OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ boolean f78956OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C19476OooO00o(AppearanceSettingsFragment appearanceSettingsFragment, Continuation<? super C19476OooO00o> continuation) {
                    super(2, continuation);
                    this.f78955OooOo = appearanceSettingsFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    C19476OooO00o c19476OooO00o = new C19476OooO00o(this.f78955OooOo, continuation);
                    c19476OooO00o.f78956OooOo0o = ((Boolean) obj).booleanValue();
                    return c19476OooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(Boolean bool, Continuation<? super C32460OooOooO> continuation) {
                    Boolean bool2 = bool;
                    bool2.booleanValue();
                    return ((C19476OooO00o) create(bool2, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    boolean z = this.f78956OooOo0o;
                    AppearanceSettingsFragment appearanceSettingsFragment = this.f78955OooOo;
                    SwitchListItemView switchListItemView = appearanceSettingsFragment.f78911Oooo00o;
                    if (switchListItemView == null) {
                        OooOOO0.OooOOOO("colorInversionToggle");
                        throw null;
                    }
                    if (switchListItemView.OooO() != z) {
                        SwitchListItemView switchListItemView2 = appearanceSettingsFragment.f78911Oooo00o;
                        if (switchListItemView2 == null) {
                            OooOOO0.OooOOOO("colorInversionToggle");
                            throw null;
                        }
                        switchListItemView2.setChecked(z);
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(AppearanceSettingsFragment appearanceSettingsFragment, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f78953OooOo = appearanceSettingsFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0O0(this.f78953OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f78954OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    AppearanceSettingsFragment appearanceSettingsFragment = this.f78953OooOo;
                    C30623OooOOOO c30623OooOOOOOooOoO = appearanceSettingsFragment.OooOoO();
                    C19476OooO00o c19476OooO00o = new C19476OooO00o(appearanceSettingsFragment, null);
                    this.f78954OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c30623OooOOOOOooOoO.f109591OooOo0o, c19476OooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.settings.appearance.OooO00o$OooO00o$OooO0OO */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.appearance.AppearanceSettingsFragment$bindState$1$1$3", m80623f = "AppearanceSettingsFragment.kt", m80624l = {111}, m80625m = "invokeSuspend")
        public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ AppearanceSettingsFragment f78957OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f78958OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.settings.appearance.OooO00o$OooO00o$OooO0OO$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.appearance.AppearanceSettingsFragment$bindState$1$1$3$1", m80623f = "AppearanceSettingsFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class C19477OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<Integer, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ AppearanceSettingsFragment f78959OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ int f78960OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C19477OooO00o(AppearanceSettingsFragment appearanceSettingsFragment, Continuation<? super C19477OooO00o> continuation) {
                    super(2, continuation);
                    this.f78959OooOo = appearanceSettingsFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    C19477OooO00o c19477OooO00o = new C19477OooO00o(this.f78959OooOo, continuation);
                    c19477OooO00o.f78960OooOo0o = ((Number) obj).intValue();
                    return c19477OooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(Integer num, Continuation<? super C32460OooOooO> continuation) {
                    return ((C19477OooO00o) create(Integer.valueOf(num.intValue()), continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    int i = this.f78960OooOo0o;
                    AppearanceSettingsFragment appearanceSettingsFragment = this.f78959OooOo;
                    SelectableSymbolButtonView selectableSymbolButtonView = appearanceSettingsFragment.f78906OooOooO;
                    if (selectableSymbolButtonView == null) {
                        OooOOO0.OooOOOO("ivDayMode");
                        throw null;
                    }
                    selectableSymbolButtonView.setSelected(i == 1);
                    SelectableSymbolButtonView selectableSymbolButtonView2 = appearanceSettingsFragment.f78907OooOooo;
                    if (selectableSymbolButtonView2 == null) {
                        OooOOO0.OooOOOO("ivNightMode");
                        throw null;
                    }
                    selectableSymbolButtonView2.setSelected(i == 2);
                    SelectableSymbolButtonView selectableSymbolButtonView3 = appearanceSettingsFragment.f78909Oooo000;
                    if (selectableSymbolButtonView3 != null) {
                        selectableSymbolButtonView3.setSelected(i == -1);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    OooOOO0.OooOOOO("ivAutoMode");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0OO(AppearanceSettingsFragment appearanceSettingsFragment, Continuation<? super OooO0OO> continuation) {
                super(2, continuation);
                this.f78957OooOo = appearanceSettingsFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0OO(this.f78957OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f78958OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    AppearanceSettingsFragment appearanceSettingsFragment = this.f78957OooOo;
                    C30623OooOOOO c30623OooOOOOOooOoO = appearanceSettingsFragment.OooOoO();
                    C19477OooO00o c19477OooO00o = new C19477OooO00o(appearanceSettingsFragment, null);
                    this.f78958OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c30623OooOOOOOooOoO.f109593OooOoO0, c19477OooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.settings.appearance.OooO00o$OooO00o$OooO0Oo, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.appearance.AppearanceSettingsFragment$bindState$1$1$4", m80623f = "AppearanceSettingsFragment.kt", m80624l = {118}, m80625m = "invokeSuspend")
        public static final class C23799OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ AppearanceSettingsFragment f78961OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f78962OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.settings.appearance.OooO00o$OooO00o$OooO0Oo$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.appearance.AppearanceSettingsFragment$bindState$1$1$4$1", m80623f = "AppearanceSettingsFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class C19478OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<String, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ AppearanceSettingsFragment f78963OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f78964OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C19478OooO00o(AppearanceSettingsFragment appearanceSettingsFragment, Continuation<? super C19478OooO00o> continuation) {
                    super(2, continuation);
                    this.f78963OooOo = appearanceSettingsFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    C19478OooO00o c19478OooO00o = new C19478OooO00o(this.f78963OooOo, continuation);
                    c19478OooO00o.f78964OooOo0o = obj;
                    return c19478OooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(String str, Continuation<? super C32460OooOooO> continuation) {
                    return ((C19478OooO00o) create(str, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    String str = (String) this.f78964OooOo0o;
                    AppearanceSettingsFragment.OooO00o oooO00o = this.f78963OooOo.f78908Oooo0;
                    if (oooO00o == null) {
                        OooOOO0.OooOOOO("dateFormatRow");
                        throw null;
                    }
                    String upperCase = str.toUpperCase(Locale.ROOT);
                    OooOOO0.OooO0o(upperCase, "toUpperCase(...)");
                    oooO00o.f78916OooO0OO.setText(upperCase);
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23799OooO0Oo(AppearanceSettingsFragment appearanceSettingsFragment, Continuation<? super C23799OooO0Oo> continuation) {
                super(2, continuation);
                this.f78961OooOo = appearanceSettingsFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23799OooO0Oo(this.f78961OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C23799OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f78962OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    AppearanceSettingsFragment appearanceSettingsFragment = this.f78961OooOo;
                    C30656OooO0oO c30656OooO0oO = (C30656OooO0oO) appearanceSettingsFragment.f78904OooOoo.getValue();
                    C19478OooO00o c19478OooO00o = new C19478OooO00o(appearanceSettingsFragment, null);
                    this.f78962OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c30656OooO0oO.f109697OooO0o0, c19478OooO00o, this) == enumC32485OooO00o) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19473OooO00o(AppearanceSettingsFragment appearanceSettingsFragment, Continuation<? super C19473OooO00o> continuation) {
            super(2, continuation);
            this.f78947OooOo = appearanceSettingsFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            C19473OooO00o c19473OooO00o = new C19473OooO00o(this.f78947OooOo, continuation);
            c19473OooO00o.f78948OooOo0o = obj;
            return c19473OooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C19473OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f78948OooOo0o;
            AppearanceSettingsFragment appearanceSettingsFragment = this.f78947OooOo;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C19474OooO00o(appearanceSettingsFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(appearanceSettingsFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0OO(appearanceSettingsFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23799OooO0Oo(appearanceSettingsFragment, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(AppearanceSettingsFragment appearanceSettingsFragment, Continuation<? super OooO00o> continuation) {
        super(2, continuation);
        this.f78945OooOo = appearanceSettingsFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooO00o(this.f78945OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f78946OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            AppearanceSettingsFragment appearanceSettingsFragment = this.f78945OooOo;
            InterfaceC21987OooOoo viewLifecycleOwner = appearanceSettingsFragment.getViewLifecycleOwner();
            OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            AbstractC21979OooOOo0.OooO0O0 oooO0O0 = AbstractC21979OooOOo0.OooO0O0.f65539OooOoO;
            C19473OooO00o c19473OooO00o = new C19473OooO00o(appearanceSettingsFragment, null);
            this.f78946OooOo0o = 1;
            if (C22005OoooOO0.OooO00o(viewLifecycleOwner, oooO0O0, c19473OooO00o, this) == enumC32485OooO00o) {
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
