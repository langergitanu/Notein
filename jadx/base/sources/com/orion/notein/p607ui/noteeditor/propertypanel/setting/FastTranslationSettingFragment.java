package com.orion.notein.p607ui.noteeditor.propertypanel.setting;

import OooOoOO.C20519OooO0Oo;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00Oo0;
import androidx.lifecycle.o0OoOo0;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.propertypanel.setting.FastTranslationSettingFragment;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o000o00.AbstractC24555OooO00o;
import o0o00oO.C29954OooO;
import o0o00oO.C29962OooO0oo;
import o0oOOoo.C30857OooO00o;
import o0oOOoo.C30858OooO0O0;
import o0oOOoo.C30861OooO0o0;
import oO00ooO.C32438OooO0oO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooO.EnumC32441OooOO0O;
import oO00ooO.InterfaceC32440OooOO0;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/propertypanel/setting/FastTranslationSettingFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class FastTranslationSettingFragment extends Hilt_FastTranslationSettingFragment {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public View f76133OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C22026ooOO f76134OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public ViewGroup f76135OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public Spinner f76136OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public SwitchMaterial f76137Oooo000;

    public static final class OooO00o implements AdapterView.OnItemSelectedListener {
        public OooO00o() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            C30861OooO0o0 c30861OooO0o0OooOoO = FastTranslationSettingFragment.this.OooOoO();
            InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(c30861OooO0o0OooOoO);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C30857OooO00o(c30861OooO0o0OooOoO, i, null), 2);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.setting.FastTranslationSettingFragment$onViewCreated$4", m80623f = "FastTranslationSettingFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f76140OooOo0o;

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.setting.FastTranslationSettingFragment$onViewCreated$4$1", m80623f = "FastTranslationSettingFragment.kt", m80624l = {73}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ FastTranslationSettingFragment f76141OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f76142OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.setting.FastTranslationSettingFragment$OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
            public static final class C19374OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ FastTranslationSettingFragment f76143OooOo0o;

                public C19374OooO00o(FastTranslationSettingFragment fastTranslationSettingFragment) {
                    this.f76143OooOo0o = fastTranslationSettingFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    FastTranslationSettingFragment fastTranslationSettingFragment = this.f76143OooOo0o;
                    SwitchMaterial switchMaterial = fastTranslationSettingFragment.f76137Oooo000;
                    if (switchMaterial == null) {
                        OooOOO0.OooOOOO("fastTranslate");
                        throw null;
                    }
                    if (zBooleanValue != switchMaterial.isChecked()) {
                        SwitchMaterial switchMaterial2 = fastTranslationSettingFragment.f76137Oooo000;
                        if (switchMaterial2 == null) {
                            OooOOO0.OooOOOO("fastTranslate");
                            throw null;
                        }
                        switchMaterial2.setChecked(zBooleanValue);
                    }
                    ViewGroup viewGroup = fastTranslationSettingFragment.f76135OooOooO;
                    if (viewGroup == null) {
                        OooOOO0.OooOOOO("targetLanguageViewGroup");
                        throw null;
                    }
                    viewGroup.setAlpha(zBooleanValue ? 1.0f : 0.5f);
                    Spinner spinner = fastTranslationSettingFragment.f76136OooOooo;
                    if (spinner != null) {
                        spinner.setEnabled(zBooleanValue);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    OooOOO0.OooOOOO("languageTo");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(FastTranslationSettingFragment fastTranslationSettingFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f76141OooOo = fastTranslationSettingFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f76141OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f76142OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    FastTranslationSettingFragment fastTranslationSettingFragment = this.f76141OooOo;
                    C30861OooO0o0 c30861OooO0o0OooOoO = fastTranslationSettingFragment.OooOoO();
                    C19374OooO00o c19374OooO00o = new C19374OooO00o(fastTranslationSettingFragment);
                    this.f76142OooOo0o = 1;
                    if (c30861OooO0o0OooOoO.f110331OooOO0.f121747OooOo0o.collect(c19374OooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.setting.FastTranslationSettingFragment$OooO0O0$OooO0O0, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.propertypanel.setting.FastTranslationSettingFragment$onViewCreated$4$2", m80623f = "FastTranslationSettingFragment.kt", m80624l = {84}, m80625m = "invokeSuspend")
        public static final class C19375OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ FastTranslationSettingFragment f76144OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f76145OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.setting.FastTranslationSettingFragment$OooO0O0$OooO0O0$OooO00o */
            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ FastTranslationSettingFragment f76146OooOo0o;

                public OooO00o(FastTranslationSettingFragment fastTranslationSettingFragment) {
                    this.f76146OooOo0o = fastTranslationSettingFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    List list = (List) obj;
                    FastTranslationSettingFragment fastTranslationSettingFragment = this.f76146OooOo0o;
                    Spinner spinner = fastTranslationSettingFragment.f76136OooOooo;
                    if (spinner == null) {
                        OooOOO0.OooOOOO("languageTo");
                        throw null;
                    }
                    Context contextRequireContext = fastTranslationSettingFragment.requireContext();
                    OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                    spinner.setAdapter((SpinnerAdapter) new C29962OooO0oo(contextRequireContext, list));
                    Iterator it = list.iterator();
                    int i = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i = -1;
                            break;
                        }
                        if (((C29954OooO) it.next()).f106401OooO0O0) {
                            break;
                        }
                        i++;
                    }
                    Spinner spinner2 = fastTranslationSettingFragment.f76136OooOooo;
                    if (spinner2 != null) {
                        spinner2.setSelection(i);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    OooOOO0.OooOOOO("languageTo");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19375OooO0O0(FastTranslationSettingFragment fastTranslationSettingFragment, Continuation<? super C19375OooO0O0> continuation) {
                super(2, continuation);
                this.f76144OooOo = fastTranslationSettingFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19375OooO0O0(this.f76144OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C19375OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f76145OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    FastTranslationSettingFragment fastTranslationSettingFragment = this.f76144OooOo;
                    C30861OooO0o0 c30861OooO0o0OooOoO = fastTranslationSettingFragment.OooOoO();
                    OooO00o oooO00o = new OooO00o(fastTranslationSettingFragment);
                    this.f76145OooOo0o = 1;
                    if (c30861OooO0o0OooOoO.f110325OooO.f121747OooOo0o.collect(oooO00o, this) == enumC32485OooO00o) {
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

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO0O0 oooO0O0 = FastTranslationSettingFragment.this.new OooO0O0(continuation);
            oooO0O0.f76140OooOo0o = obj;
            return oooO0O0;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f76140OooOo0o;
            FastTranslationSettingFragment fastTranslationSettingFragment = FastTranslationSettingFragment.this;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO00o(fastTranslationSettingFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C19375OooO0O0(fastTranslationSettingFragment, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public OooO0OO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return FastTranslationSettingFragment.this;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.setting.FastTranslationSettingFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23559OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ OooO0OO f76148OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23559OooO0Oo(OooO0OO oooO0OO) {
            super(0);
            this.f76148OooOo0o = oooO0OO;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f76148OooOo0o.invoke();
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f76149OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f76149OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f76149OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.setting.FastTranslationSettingFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23560OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f76150OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23560OooO0o0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f76150OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f76150OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.propertypanel.setting.FastTranslationSettingFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class C23561OooO0oO extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f76151OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23561OooO0oO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f76151OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f76151OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? FastTranslationSettingFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public FastTranslationSettingFragment() {
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, new C23559OooO0Oo(new OooO0OO()));
        this.f76134OooOoo0 = new C22026ooOO(C24035Oooo00o.f80943OooO00o.OooO0O0(C30861OooO0o0.class), new C23560OooO0o0(interfaceC32440OooOO0OooO0O0), new C23561OooO0oO(interfaceC32440OooOO0OooO0O0), new OooO0o(interfaceC32440OooOO0OooO0O0));
    }

    public final C30861OooO0o0 OooOoO() {
        return (C30861OooO0o0) this.f76134OooOoo0.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_property_setting_fast_translation, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.btn_back);
        this.f76133OooOoo = viewFindViewById;
        if (viewFindViewById == null) {
            OooOOO0.OooOOOO("backBtn");
            throw null;
        }
        viewFindViewById.setOnClickListener(new o0o0000.OooO00o(this, 0));
        SwitchMaterial switchMaterial = (SwitchMaterial) view.findViewById(R.id.fast_translate);
        this.f76137Oooo000 = switchMaterial;
        if (switchMaterial == null) {
            OooOOO0.OooOOOO("fastTranslate");
            throw null;
        }
        switchMaterial.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o0o0000.OooO0O0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                OooOOO0.OooO0oO(compoundButton, "<unused var>");
                FastTranslationSettingFragment fastTranslationSettingFragment = this.f105410OooO00o;
                if (((Boolean) fastTranslationSettingFragment.OooOoO().f110331OooOO0.f121747OooOo0o.getValue()).booleanValue() != z) {
                    C30861OooO0o0 c30861OooO0o0OooOoO = fastTranslationSettingFragment.OooOoO();
                    C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(c30861OooO0o0OooOoO), null, null, new C30858OooO0O0(c30861OooO0o0OooOoO, z, null), 3);
                }
            }
        });
        this.f76135OooOooO = (ViewGroup) view.findViewById(R.id.cl_target_language);
        Spinner spinner = (Spinner) view.findViewById(R.id.spinner_to);
        this.f76136OooOooo = spinner;
        if (spinner == null) {
            OooOOO0.OooOOOO("languageTo");
            throw null;
        }
        spinner.setOnItemSelectedListener(new OooO00o());
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooO0O0(null), 3);
    }
}
