package com.orion.notein.p607ui.settings.gesture;

import OooOoOO.C20519OooO0Oo;
import Oooo0oO.C21030OooOO0o;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22005OoooOO0;
import androidx.lifecycle.C22015OooooOo;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00Oo0;
import androidx.lifecycle.o0OoOo0;
import com.orion.niui.components.listitems.SwitchListItemView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.settings.gesture.GlobalGestureSettingsFragment;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import kotlin.jvm.internal.Oooo0;
import o000o00.AbstractC24555OooO00o;
import o0O0oooO.ViewOnClickListenerC26302OoooOoo;
import o0Oo0o0o.ViewOnClickListenerC28223OooO;
import o0o0Oo0O.C30623OooOOOO;
import o0o0Oo0O.C30630OooOo00;
import o0o0Oo0O.C30637OooOoo0;
import o0o0Ooo0.C30758OooO0o;
import oO00ooO.C32438OooO0oO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32447OooOOo;
import oO00ooO.C32460OooOooO;
import oO00ooO.EnumC32441OooOO0O;
import oO00ooO.InterfaceC32440OooOO0;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/settings/gesture/GlobalGestureSettingsFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class GlobalGestureSettingsFragment extends Hilt_GlobalGestureSettingsFragment {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final C22026ooOO f79126OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C22026ooOO f79127OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public SwitchListItemView f79128OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public SwitchListItemView f79129OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public TextView f79130Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public boolean f79131Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public boolean f79132Oooo00o;

    public static final class OooO extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f79133OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f79133OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f79133OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.gesture.GlobalGestureSettingsFragment$onViewCreated$5", m80623f = "GlobalGestureSettingsFragment.kt", m80624l = {71}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f79135OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.settings.gesture.GlobalGestureSettingsFragment$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.gesture.GlobalGestureSettingsFragment$onViewCreated$5$1", m80623f = "GlobalGestureSettingsFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class C19489OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ GlobalGestureSettingsFragment f79136OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f79137OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.settings.gesture.GlobalGestureSettingsFragment$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.gesture.GlobalGestureSettingsFragment$onViewCreated$5$1$1", m80623f = "GlobalGestureSettingsFragment.kt", m80624l = {73}, m80625m = "invokeSuspend")
            public static final class C19490OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ GlobalGestureSettingsFragment f79138OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public int f79139OooOo0o;

                /* JADX INFO: renamed from: com.orion.notein.ui.settings.gesture.GlobalGestureSettingsFragment$OooO00o$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
                public static final class C19491OooO00o<T> implements InterfaceC33723OooO0oO {

                    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                    public final /* synthetic */ GlobalGestureSettingsFragment f79140OooOo0o;

                    public C19491OooO00o(GlobalGestureSettingsFragment globalGestureSettingsFragment) {
                        this.f79140OooOo0o = globalGestureSettingsFragment;
                    }

                    @Override // oO0o0Oo.InterfaceC33723OooO0oO
                    public final Object emit(Object obj, Continuation continuation) {
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        GlobalGestureSettingsFragment globalGestureSettingsFragment = this.f79140OooOo0o;
                        SwitchListItemView switchListItemView = globalGestureSettingsFragment.f79128OooOooO;
                        if (switchListItemView == null) {
                            OooOOO0.OooOOOO("undoRedoToggle");
                            throw null;
                        }
                        if (switchListItemView.OooO() != zBooleanValue) {
                            globalGestureSettingsFragment.f79131Oooo00O = true;
                            SwitchListItemView switchListItemView2 = globalGestureSettingsFragment.f79128OooOooO;
                            if (switchListItemView2 == null) {
                                OooOOO0.OooOOOO("undoRedoToggle");
                                throw null;
                            }
                            switchListItemView2.setChecked(zBooleanValue);
                            globalGestureSettingsFragment.f79131Oooo00O = false;
                        }
                        return C32460OooOooO.f116667OooO00o;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C19490OooO00o(GlobalGestureSettingsFragment globalGestureSettingsFragment, Continuation<? super C19490OooO00o> continuation) {
                    super(2, continuation);
                    this.f79138OooOo = globalGestureSettingsFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    return new C19490OooO00o(this.f79138OooOo, continuation);
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                    ((C19490OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                    return EnumC32485OooO00o.f116726OooOo0o;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    int i = this.f79139OooOo0o;
                    if (i == 0) {
                        C32446OooOOOo.OooO0O0(obj);
                        GlobalGestureSettingsFragment globalGestureSettingsFragment = this.f79138OooOo;
                        C30623OooOOOO c30623OooOOOO = (C30623OooOOOO) globalGestureSettingsFragment.f79127OooOoo0.getValue();
                        C19491OooO00o c19491OooO00o = new C19491OooO00o(globalGestureSettingsFragment);
                        this.f79139OooOo0o = 1;
                        if (c30623OooOOOO.f109589OooOo00.f121747OooOo0o.collect(c19491OooO00o, this) == enumC32485OooO00o) {
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

            /* JADX INFO: renamed from: com.orion.notein.ui.settings.gesture.GlobalGestureSettingsFragment$OooO00o$OooO00o$OooO0O0 */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.gesture.GlobalGestureSettingsFragment$onViewCreated$5$1$2", m80623f = "GlobalGestureSettingsFragment.kt", m80624l = {83}, m80625m = "invokeSuspend")
            public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ GlobalGestureSettingsFragment f79141OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public int f79142OooOo0o;

                /* JADX INFO: renamed from: com.orion.notein.ui.settings.gesture.GlobalGestureSettingsFragment$OooO00o$OooO00o$OooO0O0$OooO00o, reason: collision with other inner class name */
                public static final class C19492OooO00o<T> implements InterfaceC33723OooO0oO {

                    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                    public final /* synthetic */ GlobalGestureSettingsFragment f79143OooOo0o;

                    public C19492OooO00o(GlobalGestureSettingsFragment globalGestureSettingsFragment) {
                        this.f79143OooOo0o = globalGestureSettingsFragment;
                    }

                    @Override // oO0o0Oo.InterfaceC33723OooO0oO
                    public final Object emit(Object obj, Continuation continuation) {
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        GlobalGestureSettingsFragment globalGestureSettingsFragment = this.f79143OooOo0o;
                        SwitchListItemView switchListItemView = globalGestureSettingsFragment.f79129OooOooo;
                        if (switchListItemView == null) {
                            OooOOO0.OooOOOO("multiFingerScrollToggle");
                            throw null;
                        }
                        if (switchListItemView.OooO() != zBooleanValue) {
                            globalGestureSettingsFragment.f79132Oooo00o = true;
                            SwitchListItemView switchListItemView2 = globalGestureSettingsFragment.f79129OooOooo;
                            if (switchListItemView2 == null) {
                                OooOOO0.OooOOOO("multiFingerScrollToggle");
                                throw null;
                            }
                            switchListItemView2.setChecked(zBooleanValue);
                            globalGestureSettingsFragment.f79132Oooo00o = false;
                        }
                        return C32460OooOooO.f116667OooO00o;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO0O0(GlobalGestureSettingsFragment globalGestureSettingsFragment, Continuation<? super OooO0O0> continuation) {
                    super(2, continuation);
                    this.f79141OooOo = globalGestureSettingsFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    return new OooO0O0(this.f79141OooOo, continuation);
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                    ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                    return EnumC32485OooO00o.f116726OooOo0o;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    int i = this.f79142OooOo0o;
                    if (i == 0) {
                        C32446OooOOOo.OooO0O0(obj);
                        GlobalGestureSettingsFragment globalGestureSettingsFragment = this.f79141OooOo;
                        C30623OooOOOO c30623OooOOOO = (C30623OooOOOO) globalGestureSettingsFragment.f79127OooOoo0.getValue();
                        C19492OooO00o c19492OooO00o = new C19492OooO00o(globalGestureSettingsFragment);
                        this.f79142OooOo0o = 1;
                        if (c30623OooOOOO.f109571OooO.f121747OooOo0o.collect(c19492OooO00o, this) == enumC32485OooO00o) {
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

            /* JADX INFO: renamed from: com.orion.notein.ui.settings.gesture.GlobalGestureSettingsFragment$OooO00o$OooO00o$OooO0OO */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.gesture.GlobalGestureSettingsFragment$onViewCreated$5$1$3", m80623f = "GlobalGestureSettingsFragment.kt", m80624l = {93}, m80625m = "invokeSuspend")
            public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ GlobalGestureSettingsFragment f79144OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public int f79145OooOo0o;

                /* JADX INFO: renamed from: com.orion.notein.ui.settings.gesture.GlobalGestureSettingsFragment$OooO00o$OooO00o$OooO0OO$OooO00o, reason: collision with other inner class name */
                public static final class C19493OooO00o<T> implements InterfaceC33723OooO0oO {

                    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                    public final /* synthetic */ GlobalGestureSettingsFragment f79146OooOo0o;

                    public C19493OooO00o(GlobalGestureSettingsFragment globalGestureSettingsFragment) {
                        this.f79146OooOo0o = globalGestureSettingsFragment;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x0024  */
                    @Override // oO0o0Oo.InterfaceC33723OooO0oO
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        int i;
                        int iIntValue = ((Number) obj).intValue();
                        TextView textView = this.f79146OooOo0o.f79130Oooo000;
                        if (textView == null) {
                            OooOOO0.OooOOOO("doubleTapValue");
                            throw null;
                        }
                        if (iIntValue == 0) {
                            i = R.string.double_tap_mode_disable;
                        } else if (iIntValue == 1) {
                            i = R.string.double_tap_mode_horizontal;
                        } else if (iIntValue == 2) {
                            i = R.string.double_tap_mode_vertical;
                        } else if (iIntValue == 3) {
                            i = R.string.double_tap_mode_both;
                        }
                        textView.setText(i);
                        return C32460OooOooO.f116667OooO00o;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OooO0OO(GlobalGestureSettingsFragment globalGestureSettingsFragment, Continuation<? super OooO0OO> continuation) {
                    super(2, continuation);
                    this.f79144OooOo = globalGestureSettingsFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    return new OooO0OO(this.f79144OooOo, continuation);
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                    ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                    return EnumC32485OooO00o.f116726OooOo0o;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    int i = this.f79145OooOo0o;
                    if (i == 0) {
                        C32446OooOOOo.OooO0O0(obj);
                        GlobalGestureSettingsFragment globalGestureSettingsFragment = this.f79144OooOo;
                        C30758OooO0o c30758OooO0o = (C30758OooO0o) globalGestureSettingsFragment.f79126OooOoo.getValue();
                        C19493OooO00o c19493OooO00o = new C19493OooO00o(globalGestureSettingsFragment);
                        this.f79145OooOo0o = 1;
                        if (c30758OooO0o.f110001OooO0Oo.f121747OooOo0o.collect(c19493OooO00o, this) == enumC32485OooO00o) {
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
            public C19489OooO00o(GlobalGestureSettingsFragment globalGestureSettingsFragment, Continuation<? super C19489OooO00o> continuation) {
                super(2, continuation);
                this.f79136OooOo = globalGestureSettingsFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                C19489OooO00o c19489OooO00o = new C19489OooO00o(this.f79136OooOo, continuation);
                c19489OooO00o.f79137OooOo0o = obj;
                return c19489OooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C19489OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f79137OooOo0o;
                GlobalGestureSettingsFragment globalGestureSettingsFragment = this.f79136OooOo;
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C19490OooO00o(globalGestureSettingsFragment, null), 3);
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(globalGestureSettingsFragment, null), 3);
                C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0OO(globalGestureSettingsFragment, null), 3);
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return GlobalGestureSettingsFragment.this.new OooO00o(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f79135OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                GlobalGestureSettingsFragment globalGestureSettingsFragment = GlobalGestureSettingsFragment.this;
                InterfaceC21987OooOoo viewLifecycleOwner = globalGestureSettingsFragment.getViewLifecycleOwner();
                OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                AbstractC21979OooOOo0.OooO0O0 oooO0O0 = AbstractC21979OooOOo0.OooO0O0.f65539OooOoO;
                C19489OooO00o c19489OooO00o = new C19489OooO00o(globalGestureSettingsFragment, null);
                this.f79135OooOo0o = 1;
                if (C22005OoooOO0.OooO00o(viewLifecycleOwner, oooO0O0, c19489OooO00o, this) == enumC32485OooO00o) {
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

    public static final class OooO0O0 extends OooOOOO implements oO0O000o.OooO00o<o000o0O0.OooOO0> {
        public OooO0O0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o000o0O0.OooOO0 invoke() {
            return C21030OooOO0o.OooO0OO(GlobalGestureSettingsFragment.this).OooO0o(R.id.nav_graph_global_settings);
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f79148OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f79148OooOo0o = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((o000o0O0.OooOO0) this.f79148OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.settings.gesture.GlobalGestureSettingsFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23819OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f79149OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23819OooO0Oo(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f79149OooOo0o = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return ((o000o0O0.OooOO0) this.f79149OooOo0o.getValue()).getDefaultViewModelCreationExtras();
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public OooO0o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return GlobalGestureSettingsFragment.this;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.settings.gesture.GlobalGestureSettingsFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23820OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f79151OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23820OooO0o0(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f79151OooOo = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            ActivityC21897OooOo0 activityC21897OooOo0RequireActivity = GlobalGestureSettingsFragment.this.requireActivity();
            OooOOO0.OooO0o(activityC21897OooOo0RequireActivity, "requireActivity()");
            return o000O0O0.OooO00o.OooO00o(activityC21897OooOo0RequireActivity, (C22015OooooOo) ((o000o0O0.OooOO0) this.f79151OooOo.getValue()).getDefaultViewModelProviderFactory());
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.settings.gesture.GlobalGestureSettingsFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class C23821OooO0oO extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ OooO0o f79153OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23821OooO0oO(OooO0o oooO0o) {
            super(0);
            this.f79153OooOo0o = oooO0o;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f79153OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.settings.gesture.GlobalGestureSettingsFragment$OooO0oo, reason: case insensitive filesystem */
    public static final class C23822OooO0oo extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f79154OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23822OooO0oo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f79154OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f79154OooOo0o.getValue()).getViewModelStore();
        }
    }

    public static final class OooOO0 extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f79155OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f79155OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f79155OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? GlobalGestureSettingsFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public GlobalGestureSettingsFragment() {
        C32447OooOOo c32447OooOOoOooO0OO = C20519OooO0Oo.OooO0OO(new OooO0O0());
        OooO0OO oooO0OO = new OooO0OO(c32447OooOOoOooO0OO);
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f79127OooOoo0 = new C22026ooOO(oooo0.OooO0O0(C30623OooOOOO.class), oooO0OO, new C23820OooO0o0(c32447OooOOoOooO0OO), new C23819OooO0Oo(c32447OooOOoOooO0OO));
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, new C23821OooO0oO(new OooO0o()));
        this.f79126OooOoo = new C22026ooOO(oooo0.OooO0O0(C30758OooO0o.class), new C23822OooO0oo(interfaceC32440OooOO0OooO0O0), new OooOO0(interfaceC32440OooOO0OooO0O0), new OooO(interfaceC32440OooOO0OooO0O0));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_global_gesture_settings, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.btn_back);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new ViewOnClickListenerC26302OoooOoo(this, 3));
        }
        SwitchListItemView switchListItemView = (SwitchListItemView) view.findViewById(R.id.toggle_list_item_gesture_undo_redo);
        this.f79128OooOooO = switchListItemView;
        if (switchListItemView == null) {
            OooOOO0.OooOOOO("undoRedoToggle");
            throw null;
        }
        switchListItemView.setOnCheckedChangeListener(new InterfaceC32510OooOOo0() { // from class: o0o0Ooo0.OooO0O0
            @Override // oO0O000o.InterfaceC32510OooOOo0
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                OooOOO0.OooO0oO((SwitchListItemView) obj, "<unused var>");
                if (zBooleanValue2) {
                    GlobalGestureSettingsFragment globalGestureSettingsFragment = this.f109999OooOo0o;
                    if (!globalGestureSettingsFragment.f79131Oooo00O) {
                        C30623OooOOOO c30623OooOOOO = (C30623OooOOOO) globalGestureSettingsFragment.f79127OooOoo0.getValue();
                        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(c30623OooOOOO);
                        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C30630OooOo00(c30623OooOOOO, zBooleanValue, null), 2);
                        return C32460OooOooO.f116667OooO00o;
                    }
                }
                return C32460OooOooO.f116667OooO00o;
            }
        });
        SwitchListItemView switchListItemView2 = (SwitchListItemView) view.findViewById(R.id.toggle_list_item_gesture_two_finger_move);
        this.f79129OooOooo = switchListItemView2;
        if (switchListItemView2 == null) {
            OooOOO0.OooOOOO("multiFingerScrollToggle");
            throw null;
        }
        switchListItemView2.setOnCheckedChangeListener(new InterfaceC32510OooOOo0() { // from class: o0o0Ooo0.OooO0OO
            @Override // oO0O000o.InterfaceC32510OooOOo0
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                OooOOO0.OooO0oO((SwitchListItemView) obj, "<unused var>");
                if (zBooleanValue2) {
                    GlobalGestureSettingsFragment globalGestureSettingsFragment = this.f110000OooOo0o;
                    if (!globalGestureSettingsFragment.f79132Oooo00o) {
                        C30623OooOOOO c30623OooOOOO = (C30623OooOOOO) globalGestureSettingsFragment.f79127OooOoo0.getValue();
                        InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(c30623OooOOOO);
                        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                        C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C30637OooOoo0(c30623OooOOOO, zBooleanValue, null), 2);
                        return C32460OooOooO.f116667OooO00o;
                    }
                }
                return C32460OooOooO.f116667OooO00o;
            }
        });
        View viewFindViewById2 = view.findViewById(R.id.double_tap_zoom);
        this.f79130Oooo000 = (TextView) viewFindViewById2.findViewById(R.id.tv_value);
        ((TextView) viewFindViewById2.findViewById(R.id.tv_title)).setText(R.string.gesture_double_tap_zoom);
        viewFindViewById2.setOnClickListener(new ViewOnClickListenerC28223OooO(this, 3));
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooO00o(null), 3);
    }
}
