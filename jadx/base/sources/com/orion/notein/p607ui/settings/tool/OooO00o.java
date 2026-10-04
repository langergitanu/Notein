package com.orion.notein.p607ui.settings.tool;

import android.widget.SeekBar;
import androidx.core.content.C21650OooOoO;
import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.C22005OoooOO0;
import androidx.lifecycle.InterfaceC21987OooOoo;
import com.orion.niui.components.listitems.SwitchListItemView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.settings.tool.ToolSettingsFragment;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o0o0Oo0O.C30623OooOOOO;
import oO00ooO.C32438OooO0oO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.tool.ToolSettingsFragment$bindState$1", m80623f = "ToolSettingsFragment.kt", m80624l = {197}, m80625m = "invokeSuspend")
public final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ ToolSettingsFragment f79323OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f79324OooOo0o;

    /* JADX INFO: renamed from: com.orion.notein.ui.settings.tool.OooO00o$OooO00o, reason: collision with other inner class name */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.tool.ToolSettingsFragment$bindState$1$1", m80623f = "ToolSettingsFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class C19508OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ ToolSettingsFragment f79325OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f79326OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.settings.tool.OooO00o$OooO00o$OooO */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.tool.ToolSettingsFragment$bindState$1$1$7", m80623f = "ToolSettingsFragment.kt", m80624l = {223}, m80625m = "invokeSuspend")
        public static final class OooO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ ToolSettingsFragment f79327OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f79328OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.settings.tool.OooO00o$OooO00o$OooO$OooO00o, reason: collision with other inner class name */
            public static final class C19509OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ ToolSettingsFragment f79329OooOo0o;

                public C19509OooO00o(ToolSettingsFragment toolSettingsFragment) {
                    this.f79329OooOo0o = toolSettingsFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    SwitchListItemView switchListItemView = this.f79329OooOo0o.f79381Oooo0OO;
                    if (switchListItemView != null) {
                        switchListItemView.setChecked(zBooleanValue);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    OooOOO0.OooOOOO("hyperlinkIconToggle");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO(ToolSettingsFragment toolSettingsFragment, Continuation<? super OooO> continuation) {
                super(2, continuation);
                this.f79327OooOo = toolSettingsFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO(this.f79327OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f79328OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    ToolSettingsFragment toolSettingsFragment = this.f79327OooOo;
                    C30623OooOOOO c30623OooOOOOOooOoo0 = toolSettingsFragment.OooOoo0();
                    C19509OooO00o c19509OooO00o = new C19509OooO00o(toolSettingsFragment);
                    this.f79328OooOo0o = 1;
                    if (c30623OooOOOOOooOoo0.f109602Oooo00o.f121747OooOo0o.collect(c19509OooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.settings.tool.OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.tool.ToolSettingsFragment$bindState$1$1$1", m80623f = "ToolSettingsFragment.kt", m80624l = {199}, m80625m = "invokeSuspend")
        public static final class C19510OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ ToolSettingsFragment f79330OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f79331OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.settings.tool.OooO00o$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
            public static final class C19511OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ ToolSettingsFragment f79332OooOo0o;

                public C19511OooO00o(ToolSettingsFragment toolSettingsFragment) {
                    this.f79332OooOo0o = toolSettingsFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    ToolSettingsFragment toolSettingsFragment = this.f79332OooOo0o;
                    ToolSettingsFragment.OooO00o oooO00o = toolSettingsFragment.f79375OooOooo;
                    if (oooO00o != null) {
                        oooO00o.f79388OooO0OO.setText(zBooleanValue ? toolSettingsFragment.getString(R.string.immersive_toolbar) : toolSettingsFragment.getString(R.string.traditional_toolbar));
                        return C32460OooOooO.f116667OooO00o;
                    }
                    OooOOO0.OooOOOO("toolbarModeRow");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19510OooO00o(ToolSettingsFragment toolSettingsFragment, Continuation<? super C19510OooO00o> continuation) {
                super(2, continuation);
                this.f79330OooOo = toolSettingsFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19510OooO00o(this.f79330OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C19510OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f79331OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    ToolSettingsFragment toolSettingsFragment = this.f79330OooOo;
                    C30623OooOOOO c30623OooOOOOOooOoo0 = toolSettingsFragment.OooOoo0();
                    C19511OooO00o c19511OooO00o = new C19511OooO00o(toolSettingsFragment);
                    this.f79331OooOo0o = 1;
                    if (c30623OooOOOOOooOoo0.f109586OooOOoo.f121747OooOo0o.collect(c19511OooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.settings.tool.OooO00o$OooO00o$OooO0O0 */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.tool.ToolSettingsFragment$bindState$1$1$10", m80623f = "ToolSettingsFragment.kt", m80624l = {232}, m80625m = "invokeSuspend")
        public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ ToolSettingsFragment f79333OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f79334OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.settings.tool.OooO00o$OooO00o$OooO0O0$OooO00o, reason: collision with other inner class name */
            public static final class C19512OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ ToolSettingsFragment f79335OooOo0o;

                public C19512OooO00o(ToolSettingsFragment toolSettingsFragment) {
                    this.f79335OooOo0o = toolSettingsFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    ToolSettingsFragment.OooO0O0 oooO0O0 = this.f79335OooOo0o.f79384Oooo0oO;
                    if (oooO0O0 == null) {
                        OooOOO0.OooOOOO("penPressCard");
                        throw null;
                    }
                    SwitchListItemView switchListItemView = oooO0O0.f79391OooO0O0;
                    if (switchListItemView.OooO() != zBooleanValue) {
                        oooO0O0.f79394OooO0o0 = false;
                        switchListItemView.setChecked(zBooleanValue);
                        oooO0O0.f79394OooO0o0 = true;
                    }
                    oooO0O0.f79392OooO0OO.setEnabled(zBooleanValue);
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(ToolSettingsFragment toolSettingsFragment, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f79333OooOo = toolSettingsFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0O0(this.f79333OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f79334OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    ToolSettingsFragment toolSettingsFragment = this.f79333OooOo;
                    C30623OooOOOO c30623OooOOOOOooOoo0 = toolSettingsFragment.OooOoo0();
                    C19512OooO00o c19512OooO00o = new C19512OooO00o(toolSettingsFragment);
                    this.f79334OooOo0o = 1;
                    if (c30623OooOOOOOooOoo0.f109596OooOoo0.f121747OooOo0o.collect(c19512OooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.settings.tool.OooO00o$OooO00o$OooO0OO */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.tool.ToolSettingsFragment$bindState$1$1$11", m80623f = "ToolSettingsFragment.kt", m80624l = {237}, m80625m = "invokeSuspend")
        public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ ToolSettingsFragment f79336OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f79337OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.settings.tool.OooO00o$OooO00o$OooO0OO$OooO00o, reason: collision with other inner class name */
            public static final class C19513OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ ToolSettingsFragment f79338OooOo0o;

                public C19513OooO00o(ToolSettingsFragment toolSettingsFragment) {
                    this.f79338OooOo0o = toolSettingsFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    float fFloatValue = ((Number) obj).floatValue();
                    ToolSettingsFragment toolSettingsFragment = this.f79338OooOo0o;
                    if (!toolSettingsFragment.f79374OooOooO) {
                        ToolSettingsFragment.OooO0O0 oooO0O0 = toolSettingsFragment.f79384Oooo0oO;
                        if (oooO0O0 == null) {
                            OooOOO0.OooOOOO("penPressCard");
                            throw null;
                        }
                        int iOooO0O0 = oO0O00O.OooO00o.OooO0O0(fFloatValue * 100);
                        SeekBar seekBar = oooO0O0.f79392OooO0OO;
                        if (seekBar.getProgress() != iOooO0O0) {
                            seekBar.setProgress(iOooO0O0);
                        }
                        oooO0O0.f79393OooO0Oo.setText(C21650OooOoO.OooO00o(iOooO0O0, "%"));
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0OO(ToolSettingsFragment toolSettingsFragment, Continuation<? super OooO0OO> continuation) {
                super(2, continuation);
                this.f79336OooOo = toolSettingsFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0OO(this.f79336OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f79337OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    ToolSettingsFragment toolSettingsFragment = this.f79336OooOo;
                    C30623OooOOOO c30623OooOOOOOooOoo0 = toolSettingsFragment.OooOoo0();
                    C19513OooO00o c19513OooO00o = new C19513OooO00o(toolSettingsFragment);
                    this.f79337OooOo0o = 1;
                    if (c30623OooOOOOOooOoo0.f109594OooOoOO.f121747OooOo0o.collect(c19513OooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.settings.tool.OooO00o$OooO00o$OooO0Oo, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.tool.ToolSettingsFragment$bindState$1$1$2", m80623f = "ToolSettingsFragment.kt", m80624l = {208}, m80625m = "invokeSuspend")
        public static final class C23836OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ ToolSettingsFragment f79339OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f79340OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.settings.tool.OooO00o$OooO00o$OooO0Oo$OooO00o, reason: collision with other inner class name */
            public static final class C19514OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ ToolSettingsFragment f79341OooOo0o;

                public C19514OooO00o(ToolSettingsFragment toolSettingsFragment) {
                    this.f79341OooOo0o = toolSettingsFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    SwitchListItemView switchListItemView = this.f79341OooOo0o.f79377Oooo000;
                    if (switchListItemView != null) {
                        switchListItemView.setChecked(zBooleanValue);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    OooOOO0.OooOOOO("showTabToggle");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23836OooO0Oo(ToolSettingsFragment toolSettingsFragment, Continuation<? super C23836OooO0Oo> continuation) {
                super(2, continuation);
                this.f79339OooOo = toolSettingsFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23836OooO0Oo(this.f79339OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C23836OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f79340OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    ToolSettingsFragment toolSettingsFragment = this.f79339OooOo;
                    C30623OooOOOO c30623OooOOOOOooOoo0 = toolSettingsFragment.OooOoo0();
                    C19514OooO00o c19514OooO00o = new C19514OooO00o(toolSettingsFragment);
                    this.f79340OooOo0o = 1;
                    if (c30623OooOOOOOooOoo0.f109580OooOOO.f121747OooOo0o.collect(c19514OooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.settings.tool.OooO00o$OooO00o$OooO0o */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.tool.ToolSettingsFragment$bindState$1$1$4", m80623f = "ToolSettingsFragment.kt", m80624l = {214}, m80625m = "invokeSuspend")
        public static final class OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ ToolSettingsFragment f79342OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f79343OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.settings.tool.OooO00o$OooO00o$OooO0o$OooO00o, reason: collision with other inner class name */
            public static final class C19515OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ ToolSettingsFragment f79344OooOo0o;

                public C19515OooO00o(ToolSettingsFragment toolSettingsFragment) {
                    this.f79344OooOo0o = toolSettingsFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    SwitchListItemView switchListItemView = this.f79344OooOo0o.f79379Oooo00o;
                    if (switchListItemView != null) {
                        switchListItemView.setChecked(zBooleanValue);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    OooOOO0.OooOOOO("globalToolboxToggle");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0o(ToolSettingsFragment toolSettingsFragment, Continuation<? super OooO0o> continuation) {
                super(2, continuation);
                this.f79342OooOo = toolSettingsFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0o(this.f79342OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f79343OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    ToolSettingsFragment toolSettingsFragment = this.f79342OooOo;
                    C30623OooOOOO c30623OooOOOOOooOoo0 = toolSettingsFragment.OooOoo0();
                    C19515OooO00o c19515OooO00o = new C19515OooO00o(toolSettingsFragment);
                    this.f79343OooOo0o = 1;
                    if (c30623OooOOOOOooOoo0.f109592OooOoO.f121747OooOo0o.collect(c19515OooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.settings.tool.OooO00o$OooO00o$OooO0o0, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.tool.ToolSettingsFragment$bindState$1$1$3", m80623f = "ToolSettingsFragment.kt", m80624l = {211}, m80625m = "invokeSuspend")
        public static final class C23837OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ ToolSettingsFragment f79345OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f79346OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.settings.tool.OooO00o$OooO00o$OooO0o0$OooO00o, reason: collision with other inner class name */
            public static final class C19516OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ ToolSettingsFragment f79347OooOo0o;

                public C19516OooO00o(ToolSettingsFragment toolSettingsFragment) {
                    this.f79347OooOo0o = toolSettingsFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    SwitchListItemView switchListItemView = this.f79347OooOo0o.f79378Oooo00O;
                    if (switchListItemView != null) {
                        switchListItemView.setChecked(zBooleanValue);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    OooOOO0.OooOOOO("stylusQuickToggle");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23837OooO0o0(ToolSettingsFragment toolSettingsFragment, Continuation<? super C23837OooO0o0> continuation) {
                super(2, continuation);
                this.f79345OooOo = toolSettingsFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23837OooO0o0(this.f79345OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C23837OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f79346OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    ToolSettingsFragment toolSettingsFragment = this.f79345OooOo;
                    C30623OooOOOO c30623OooOOOOOooOoo0 = toolSettingsFragment.OooOoo0();
                    C19516OooO00o c19516OooO00o = new C19516OooO00o(toolSettingsFragment);
                    this.f79346OooOo0o = 1;
                    if (c30623OooOOOOOooOoo0.f109587OooOo.f121747OooOo0o.collect(c19516OooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.settings.tool.OooO00o$OooO00o$OooO0oO, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.tool.ToolSettingsFragment$bindState$1$1$5", m80623f = "ToolSettingsFragment.kt", m80624l = {217}, m80625m = "invokeSuspend")
        public static final class C23838OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ ToolSettingsFragment f79348OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f79349OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.settings.tool.OooO00o$OooO00o$OooO0oO$OooO00o, reason: collision with other inner class name */
            public static final class C19517OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ ToolSettingsFragment f79350OooOo0o;

                public C19517OooO00o(ToolSettingsFragment toolSettingsFragment) {
                    this.f79350OooOo0o = toolSettingsFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    SwitchListItemView switchListItemView = this.f79350OooOo0o.f79376Oooo0;
                    if (switchListItemView != null) {
                        switchListItemView.setChecked(zBooleanValue);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    OooOOO0.OooOOOO("stickyPenBoxToggle");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23838OooO0oO(ToolSettingsFragment toolSettingsFragment, Continuation<? super C23838OooO0oO> continuation) {
                super(2, continuation);
                this.f79348OooOo = toolSettingsFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23838OooO0oO(this.f79348OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C23838OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f79349OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    ToolSettingsFragment toolSettingsFragment = this.f79348OooOo;
                    C30623OooOOOO c30623OooOOOOOooOoo0 = toolSettingsFragment.OooOoo0();
                    C19517OooO00o c19517OooO00o = new C19517OooO00o(toolSettingsFragment);
                    this.f79349OooOo0o = 1;
                    if (c30623OooOOOOOooOoo0.f109590OooOo0O.f121747OooOo0o.collect(c19517OooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.settings.tool.OooO00o$OooO00o$OooO0oo, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.tool.ToolSettingsFragment$bindState$1$1$6", m80623f = "ToolSettingsFragment.kt", m80624l = {220}, m80625m = "invokeSuspend")
        public static final class C23839OooO0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ ToolSettingsFragment f79351OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f79352OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.settings.tool.OooO00o$OooO00o$OooO0oo$OooO00o, reason: collision with other inner class name */
            public static final class C19518OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ ToolSettingsFragment f79353OooOo0o;

                public C19518OooO00o(ToolSettingsFragment toolSettingsFragment) {
                    this.f79353OooOo0o = toolSettingsFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    SwitchListItemView switchListItemView = this.f79353OooOo0o.f79380Oooo0O0;
                    if (switchListItemView != null) {
                        switchListItemView.setChecked(zBooleanValue);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    OooOOO0.OooOOOO("dualLinkIconToggle");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23839OooO0oo(ToolSettingsFragment toolSettingsFragment, Continuation<? super C23839OooO0oo> continuation) {
                super(2, continuation);
                this.f79351OooOo = toolSettingsFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23839OooO0oo(this.f79351OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C23839OooO0oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f79352OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    ToolSettingsFragment toolSettingsFragment = this.f79351OooOo;
                    C30623OooOOOO c30623OooOOOOOooOoo0 = toolSettingsFragment.OooOoo0();
                    C19518OooO00o c19518OooO00o = new C19518OooO00o(toolSettingsFragment);
                    this.f79352OooOo0o = 1;
                    if (c30623OooOOOOOooOoo0.f109599Oooo0.f121747OooOo0o.collect(c19518OooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.settings.tool.OooO00o$OooO00o$OooOO0 */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.tool.ToolSettingsFragment$bindState$1$1$8", m80623f = "ToolSettingsFragment.kt", m80624l = {226}, m80625m = "invokeSuspend")
        public static final class OooOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ ToolSettingsFragment f79354OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f79355OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.settings.tool.OooO00o$OooO00o$OooOO0$OooO00o, reason: collision with other inner class name */
            public static final class C19519OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ ToolSettingsFragment f79356OooOo0o;

                public C19519OooO00o(ToolSettingsFragment toolSettingsFragment) {
                    this.f79356OooOo0o = toolSettingsFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    SwitchListItemView switchListItemView = this.f79356OooOo0o.f79383Oooo0o0;
                    if (switchListItemView != null) {
                        switchListItemView.setChecked(zBooleanValue);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    OooOOO0.OooOOOO("moveLayerIconToggle");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooOO0(ToolSettingsFragment toolSettingsFragment, Continuation<? super OooOO0> continuation) {
                super(2, continuation);
                this.f79354OooOo = toolSettingsFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooOO0(this.f79354OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f79355OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    ToolSettingsFragment toolSettingsFragment = this.f79354OooOo;
                    C30623OooOOOO c30623OooOOOOOooOoo0 = toolSettingsFragment.OooOoo0();
                    C19519OooO00o c19519OooO00o = new C19519OooO00o(toolSettingsFragment);
                    this.f79355OooOo0o = 1;
                    if (c30623OooOOOOOooOoo0.f109576OooO0oo.f121747OooOo0o.collect(c19519OooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.settings.tool.OooO00o$OooO00o$OooOO0O */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.tool.ToolSettingsFragment$bindState$1$1$9", m80623f = "ToolSettingsFragment.kt", m80624l = {229}, m80625m = "invokeSuspend")
        public static final class OooOO0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ ToolSettingsFragment f79357OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f79358OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.settings.tool.OooO00o$OooO00o$OooOO0O$OooO00o, reason: collision with other inner class name */
            public static final class C19520OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ ToolSettingsFragment f79359OooOo0o;

                public C19520OooO00o(ToolSettingsFragment toolSettingsFragment) {
                    this.f79359OooOo0o = toolSettingsFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    SwitchListItemView switchListItemView = this.f79359OooOo0o.f79382Oooo0o;
                    if (switchListItemView != null) {
                        switchListItemView.setChecked(zBooleanValue);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    OooOOO0.OooOOOO("nonStylusToggle");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooOO0O(ToolSettingsFragment toolSettingsFragment, Continuation<? super OooOO0O> continuation) {
                super(2, continuation);
                this.f79357OooOo = toolSettingsFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooOO0O(this.f79357OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooOO0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f79358OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    ToolSettingsFragment toolSettingsFragment = this.f79357OooOo;
                    C30623OooOOOO c30623OooOOOOOooOoo0 = toolSettingsFragment.OooOoo0();
                    C19520OooO00o c19520OooO00o = new C19520OooO00o(toolSettingsFragment);
                    this.f79358OooOo0o = 1;
                    if (c30623OooOOOOOooOoo0.f109575OooO0oO.f121747OooOo0o.collect(c19520OooO00o, this) == enumC32485OooO00o) {
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
        public C19508OooO00o(ToolSettingsFragment toolSettingsFragment, Continuation<? super C19508OooO00o> continuation) {
            super(2, continuation);
            this.f79325OooOo = toolSettingsFragment;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            C19508OooO00o c19508OooO00o = new C19508OooO00o(this.f79325OooOo, continuation);
            c19508OooO00o.f79326OooOo0o = obj;
            return c19508OooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((C19508OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f79326OooOo0o;
            ToolSettingsFragment toolSettingsFragment = this.f79325OooOo;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C19510OooO00o(toolSettingsFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23836OooO0Oo(toolSettingsFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23837OooO0o0(toolSettingsFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0o(toolSettingsFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23838OooO0oO(toolSettingsFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23839OooO0oo(toolSettingsFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO(toolSettingsFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooOO0(toolSettingsFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooOO0O(toolSettingsFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(toolSettingsFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0OO(toolSettingsFragment, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO00o(ToolSettingsFragment toolSettingsFragment, Continuation<? super OooO00o> continuation) {
        super(2, continuation);
        this.f79323OooOo = toolSettingsFragment;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooO00o(this.f79323OooOo, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f79324OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            ToolSettingsFragment toolSettingsFragment = this.f79323OooOo;
            InterfaceC21987OooOoo viewLifecycleOwner = toolSettingsFragment.getViewLifecycleOwner();
            OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            AbstractC21979OooOOo0.OooO0O0 oooO0O0 = AbstractC21979OooOOo0.OooO0O0.f65539OooOoO;
            C19508OooO00o c19508OooO00o = new C19508OooO00o(toolSettingsFragment, null);
            this.f79324OooOo0o = 1;
            if (C22005OoooOO0.OooO00o(viewLifecycleOwner, oooO0O0, c19508OooO00o, this) == enumC32485OooO00o) {
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
