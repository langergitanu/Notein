package com.orion.notein.p607ui.noteeditor.translate;

import OooOoOO.C20519OooO0Oo;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00Oo0;
import androidx.lifecycle.o0OoOo0;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.translate.TranslateDialogFragment;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import kotlin.jvm.internal.Oooo0;
import o000o00.AbstractC24555OooO00o;
import o000o0O0.C24568OooO0oO;
import o00o00.C25206OooO0Oo;
import o0OoO000.ViewOnClickListenerC28568OooooOO;
import o0OoO000.ViewOnClickListenerC28596o00o0O;
import o0OoO000.o00Ooo;
import o0OoOo00.ViewOnTouchListenerC29205OooO0o0;
import o0OoOo0O.ViewOnClickListenerC29207OooO00o;
import o0OoOo0O.ViewOnClickListenerC29208OooO0O0;
import o0o00oO.C29954OooO;
import o0o00oO.C29962OooO0oo;
import o0o00oO.C29967OooOOO0;
import o0o00oO.C29970OooOOo;
import o0o00oO.C29972OooOOoo;
import o0o00oO.C29974OooOo00;
import oO00ooO.C32438OooO0oO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooO.EnumC32441OooOO0O;
import oO00ooO.InterfaceC32440OooOO0;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33595OooOOo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33730OooOOOO;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0OoO.C33804OooOOOo;
import oO0o0OoO.C33805OooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/translate/TranslateDialogFragment;", "Lcom/orion/notein/ui/RoundBottomSheetDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class TranslateDialogFragment extends Hilt_TranslateDialogFragment {

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final C24568OooO0oO f76915OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final C22026ooOO f76916OooOooo;

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public View f76917Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public TextView f76918Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public Spinner f76919Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public Spinner f76920Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public View f76921Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public TextView f76922Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public TextView f76923Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public View f76924Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public View f76925Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public View f76926Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public View f76927Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    public String f76928OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final MediaPlayer f76929OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public View f76930OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public String f76931OoooO0O;

    public static final class OooO extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f76932OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f76932OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f76932OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    public static final class OooO00o implements AdapterView.OnItemSelectedListener {
        public OooO00o() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            C29970OooOOo c29970OooOOoOooOoo0 = TranslateDialogFragment.this.OooOoo0();
            InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(c29970OooOOoOooOoo0);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C29974OooOo00(c29970OooOOoOooOoo0, i, null), 2);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.translate.TranslateDialogFragment$onViewCreated$11", m80623f = "TranslateDialogFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f76935OooOo0o;

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.translate.TranslateDialogFragment$onViewCreated$11$1", m80623f = "TranslateDialogFragment.kt", m80624l = {195}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ TranslateDialogFragment f76936OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f76937OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.translate.TranslateDialogFragment$OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
            public static final class C19399OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ TranslateDialogFragment f76938OooOo0o;

                public C19399OooO00o(TranslateDialogFragment translateDialogFragment) {
                    this.f76938OooOo0o = translateDialogFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    List list = (List) obj;
                    TranslateDialogFragment translateDialogFragment = this.f76938OooOo0o;
                    Spinner spinner = translateDialogFragment.f76919Oooo000;
                    if (spinner == null) {
                        OooOOO0.OooOOOO("spinnerFrom");
                        throw null;
                    }
                    Context contextRequireContext = translateDialogFragment.requireContext();
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
                    Spinner spinner2 = translateDialogFragment.f76919Oooo000;
                    if (spinner2 != null) {
                        spinner2.setSelection(i);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    OooOOO0.OooOOOO("spinnerFrom");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(TranslateDialogFragment translateDialogFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f76936OooOo = translateDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f76936OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f76937OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    TranslateDialogFragment translateDialogFragment = this.f76936OooOo;
                    C29970OooOOo c29970OooOOoOooOoo0 = translateDialogFragment.OooOoo0();
                    C19399OooO00o c19399OooO00o = new C19399OooO00o(translateDialogFragment);
                    this.f76937OooOo0o = 1;
                    if (c29970OooOOoOooOoo0.f106439OooOO0.f121747OooOo0o.collect(c19399OooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.translate.TranslateDialogFragment$OooO0O0$OooO0O0, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.translate.TranslateDialogFragment$onViewCreated$11$2", m80623f = "TranslateDialogFragment.kt", m80624l = {203}, m80625m = "invokeSuspend")
        public static final class C19400OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ TranslateDialogFragment f76939OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f76940OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.translate.TranslateDialogFragment$OooO0O0$OooO0O0$OooO00o */
            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ TranslateDialogFragment f76941OooOo0o;

                public OooO00o(TranslateDialogFragment translateDialogFragment) {
                    this.f76941OooOo0o = translateDialogFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    List list = (List) obj;
                    TranslateDialogFragment translateDialogFragment = this.f76941OooOo0o;
                    Spinner spinner = translateDialogFragment.f76920Oooo00O;
                    if (spinner == null) {
                        OooOOO0.OooOOOO("spinnerTo");
                        throw null;
                    }
                    Context contextRequireContext = translateDialogFragment.requireContext();
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
                    Spinner spinner2 = translateDialogFragment.f76920Oooo00O;
                    if (spinner2 != null) {
                        spinner2.setSelection(i);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    OooOOO0.OooOOOO("spinnerTo");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19400OooO0O0(TranslateDialogFragment translateDialogFragment, Continuation<? super C19400OooO0O0> continuation) {
                super(2, continuation);
                this.f76939OooOo = translateDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19400OooO0O0(this.f76939OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C19400OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f76940OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    TranslateDialogFragment translateDialogFragment = this.f76939OooOo;
                    C29970OooOOo c29970OooOOoOooOoo0 = translateDialogFragment.OooOoo0();
                    OooO00o oooO00o = new OooO00o(translateDialogFragment);
                    this.f76940OooOo0o = 1;
                    if (c29970OooOOoOooOoo0.f106441OooOO0o.f121747OooOo0o.collect(oooO00o, this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.translate.TranslateDialogFragment$onViewCreated$11$3", m80623f = "TranslateDialogFragment.kt", m80624l = {213}, m80625m = "invokeSuspend")
        public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ TranslateDialogFragment f76942OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f76943OooOo0o;

            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ TranslateDialogFragment f76944OooOo0o;

                public OooO00o(TranslateDialogFragment translateDialogFragment) {
                    this.f76944OooOo0o = translateDialogFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    C29970OooOOo c29970OooOOoOooOoo0 = this.f76944OooOo0o.OooOoo0();
                    c29970OooOOoOooOoo0.f106442OooOOO.setValue(c29970OooOOoOooOoo0.f106443OooOOO0.getValue());
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0OO(TranslateDialogFragment translateDialogFragment, Continuation<? super OooO0OO> continuation) {
                super(2, continuation);
                this.f76942OooOo = translateDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0OO(this.f76942OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f76943OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    TranslateDialogFragment translateDialogFragment = this.f76942OooOo;
                    C33730OooOOOO c33730OooOOOO = new C33730OooOOOO(translateDialogFragment.OooOoo0().f106443OooOOO0, null);
                    OooO00o oooO00o = new OooO00o(translateDialogFragment);
                    this.f76943OooOo0o = 1;
                    C33805OooOOo c33805OooOOo = new C33805OooOOo(c33730OooOOOO, oooO00o, null);
                    C33804OooOOOo c33804OooOOOo = new C33804OooOOOo(this, getContext());
                    Object objOooO0o0 = o00OO00O.OooO0O0.OooO0o0(c33804OooOOOo, c33804OooOOOo, c33805OooOOo);
                    if (objOooO0o0 != obj2) {
                        objOooO0o0 = C32460OooOooO.f116667OooO00o;
                    }
                    if (objOooO0o0 == obj2) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.translate.TranslateDialogFragment$OooO0O0$OooO0Oo, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.translate.TranslateDialogFragment$onViewCreated$11$4", m80623f = "TranslateDialogFragment.kt", m80624l = {219}, m80625m = "invokeSuspend")
        public static final class C23615OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ TranslateDialogFragment f76945OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f76946OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.translate.TranslateDialogFragment$OooO0O0$OooO0Oo$OooO00o */
            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ TranslateDialogFragment f76947OooOo0o;

                public OooO00o(TranslateDialogFragment translateDialogFragment) {
                    this.f76947OooOo0o = translateDialogFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    String str = (String) obj;
                    TextView textView = this.f76947OooOo0o.f76922Oooo0O0;
                    if (textView != null) {
                        textView.setText(str);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    OooOOO0.OooOOOO("contentDst");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23615OooO0Oo(TranslateDialogFragment translateDialogFragment, Continuation<? super C23615OooO0Oo> continuation) {
                super(2, continuation);
                this.f76945OooOo = translateDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23615OooO0Oo(this.f76945OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C23615OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f76946OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    TranslateDialogFragment translateDialogFragment = this.f76945OooOo;
                    C29970OooOOo c29970OooOOoOooOoo0 = translateDialogFragment.OooOoo0();
                    OooO00o oooO00o = new OooO00o(translateDialogFragment);
                    this.f76946OooOo0o = 1;
                    if (c29970OooOOoOooOoo0.f106444OooOOOO.f121747OooOo0o.collect(oooO00o, this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.translate.TranslateDialogFragment$onViewCreated$11$6", m80623f = "TranslateDialogFragment.kt", m80624l = {240}, m80625m = "invokeSuspend")
        public static final class OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ TranslateDialogFragment f76948OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f76949OooOo0o;

            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ TranslateDialogFragment f76950OooOo0o;

                public OooO00o(TranslateDialogFragment translateDialogFragment) {
                    this.f76950OooOo0o = translateDialogFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    String str = (String) obj;
                    TranslateDialogFragment translateDialogFragment = this.f76950OooOo0o;
                    translateDialogFragment.f76931OoooO0O = str;
                    if (str == null || str.length() == 0) {
                        View view = translateDialogFragment.f76926Oooo0oO;
                        if (view == null) {
                            OooOOO0.OooOOOO("btnSrcTtsPlay");
                            throw null;
                        }
                        view.setVisibility(8);
                    } else {
                        View view2 = translateDialogFragment.f76926Oooo0oO;
                        if (view2 == null) {
                            OooOOO0.OooOOOO("btnSrcTtsPlay");
                            throw null;
                        }
                        view2.setVisibility(0);
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0o(TranslateDialogFragment translateDialogFragment, Continuation<? super OooO0o> continuation) {
                super(2, continuation);
                this.f76948OooOo = translateDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0o(this.f76948OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f76949OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    TranslateDialogFragment translateDialogFragment = this.f76948OooOo;
                    C29970OooOOo c29970OooOOoOooOoo0 = translateDialogFragment.OooOoo0();
                    OooO00o oooO00o = new OooO00o(translateDialogFragment);
                    this.f76949OooOo0o = 1;
                    if (c29970OooOOoOooOoo0.f106447OooOOo0.f121747OooOo0o.collect(oooO00o, this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.translate.TranslateDialogFragment$onViewCreated$11$5", m80623f = "TranslateDialogFragment.kt", m80624l = {225}, m80625m = "invokeSuspend")
        public static final class OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ TranslateDialogFragment f76951OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f76952OooOo0o;

            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ TranslateDialogFragment f76953OooOo0o;

                public OooO00o(TranslateDialogFragment translateDialogFragment) {
                    this.f76953OooOo0o = translateDialogFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    String str = (String) obj;
                    String string = C33599OooOo0O.Oooooo0(C33595OooOOo.OooOo0O(C33595OooOOo.OooOo0O(str, "\r", ""), IOUtils.LINE_SEPARATOR_UNIX, "")).toString();
                    Log.d("TranslateDialogFragment", "dict: " + (string.length() == 0));
                    int length = string.length();
                    TranslateDialogFragment translateDialogFragment = this.f76953OooOo0o;
                    if (length == 0) {
                        View view = translateDialogFragment.f76925Oooo0o0;
                        if (view == null) {
                            OooOOO0.OooOOOO("sectionDict");
                            throw null;
                        }
                        view.setVisibility(8);
                    } else {
                        View view2 = translateDialogFragment.f76925Oooo0o0;
                        if (view2 == null) {
                            OooOOO0.OooOOOO("sectionDict");
                            throw null;
                        }
                        view2.setVisibility(0);
                        TextView textView = translateDialogFragment.f76923Oooo0OO;
                        if (textView == null) {
                            OooOOO0.OooOOOO("contentDict");
                            throw null;
                        }
                        textView.setText(str);
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0o0(TranslateDialogFragment translateDialogFragment, Continuation<? super OooO0o0> continuation) {
                super(2, continuation);
                this.f76951OooOo = translateDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0o0(this.f76951OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f76952OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    TranslateDialogFragment translateDialogFragment = this.f76951OooOo;
                    C29970OooOOo c29970OooOOoOooOoo0 = translateDialogFragment.OooOoo0();
                    OooO00o oooO00o = new OooO00o(translateDialogFragment);
                    this.f76952OooOo0o = 1;
                    if (c29970OooOOoOooOoo0.f106445OooOOOo.f121747OooOo0o.collect(oooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.translate.TranslateDialogFragment$OooO0O0$OooO0oO, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.translate.TranslateDialogFragment$onViewCreated$11$7", m80623f = "TranslateDialogFragment.kt", m80624l = {StyleIdentifier.MEDIUM_LIST_1_ACCENT_6}, m80625m = "invokeSuspend")
        public static final class C23616OooO0oO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ TranslateDialogFragment f76954OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f76955OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.translate.TranslateDialogFragment$OooO0O0$OooO0oO$OooO00o */
            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ TranslateDialogFragment f76956OooOo0o;

                public OooO00o(TranslateDialogFragment translateDialogFragment) {
                    this.f76956OooOo0o = translateDialogFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    String str = (String) obj;
                    TranslateDialogFragment translateDialogFragment = this.f76956OooOo0o;
                    translateDialogFragment.f76928OoooO = str;
                    if (str == null || str.length() == 0) {
                        View view = translateDialogFragment.f76927Oooo0oo;
                        if (view == null) {
                            OooOOO0.OooOOOO("btnDstTtsPlay");
                            throw null;
                        }
                        view.setVisibility(8);
                    } else {
                        View view2 = translateDialogFragment.f76927Oooo0oo;
                        if (view2 == null) {
                            OooOOO0.OooOOOO("btnDstTtsPlay");
                            throw null;
                        }
                        view2.setVisibility(0);
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23616OooO0oO(TranslateDialogFragment translateDialogFragment, Continuation<? super C23616OooO0oO> continuation) {
                super(2, continuation);
                this.f76954OooOo = translateDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23616OooO0oO(this.f76954OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C23616OooO0oO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f76955OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    TranslateDialogFragment translateDialogFragment = this.f76954OooOo;
                    C29970OooOOo c29970OooOOoOooOoo0 = translateDialogFragment.OooOoo0();
                    OooO00o oooO00o = new OooO00o(translateDialogFragment);
                    this.f76955OooOo0o = 1;
                    if (c29970OooOOoOooOoo0.f106446OooOOo.f121747OooOo0o.collect(oooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.translate.TranslateDialogFragment$OooO0O0$OooO0oo, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.noteeditor.translate.TranslateDialogFragment$onViewCreated$11$8", m80623f = "TranslateDialogFragment.kt", m80624l = {StyleIdentifier.SUBTLE_REFERENCE}, m80625m = "invokeSuspend")
        public static final class C23617OooO0oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ TranslateDialogFragment f76957OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f76958OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.translate.TranslateDialogFragment$OooO0O0$OooO0oo$OooO00o */
            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ TranslateDialogFragment f76959OooOo0o;

                public OooO00o(TranslateDialogFragment translateDialogFragment) {
                    this.f76959OooOo0o = translateDialogFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    TranslateDialogFragment translateDialogFragment = this.f76959OooOo0o;
                    View view = translateDialogFragment.f76921Oooo00o;
                    if (view == null) {
                        OooOOO0.OooOOOO("btnSwitch");
                        throw null;
                    }
                    view.setEnabled(zBooleanValue);
                    if (zBooleanValue) {
                        View view2 = translateDialogFragment.f76921Oooo00o;
                        if (view2 == null) {
                            OooOOO0.OooOOOO("btnSwitch");
                            throw null;
                        }
                        view2.setAlpha(1.0f);
                    } else {
                        View view3 = translateDialogFragment.f76921Oooo00o;
                        if (view3 == null) {
                            OooOOO0.OooOOOO("btnSwitch");
                            throw null;
                        }
                        view3.setAlpha(0.5f);
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23617OooO0oo(TranslateDialogFragment translateDialogFragment, Continuation<? super C23617OooO0oo> continuation) {
                super(2, continuation);
                this.f76957OooOo = translateDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23617OooO0oo(this.f76957OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C23617OooO0oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f76958OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    TranslateDialogFragment translateDialogFragment = this.f76957OooOo;
                    C29970OooOOo c29970OooOOoOooOoo0 = translateDialogFragment.OooOoo0();
                    OooO00o oooO00o = new OooO00o(translateDialogFragment);
                    this.f76958OooOo0o = 1;
                    if (c29970OooOOoOooOoo0.f106448OooOOoo.f121747OooOo0o.collect(oooO00o, this) == enumC32485OooO00o) {
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
            OooO0O0 oooO0O0 = TranslateDialogFragment.this.new OooO0O0(continuation);
            oooO0O0.f76935OooOo0o = obj;
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
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f76935OooOo0o;
            TranslateDialogFragment translateDialogFragment = TranslateDialogFragment.this;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO00o(translateDialogFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C19400OooO0O0(translateDialogFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0OO(translateDialogFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23615OooO0Oo(translateDialogFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0o0(translateDialogFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0o(translateDialogFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23616OooO0oO(translateDialogFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23617OooO0oo(translateDialogFragment, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public static final class OooO0OO implements AdapterView.OnItemSelectedListener {
        public OooO0OO() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            C29970OooOOo c29970OooOOoOooOoo0 = TranslateDialogFragment.this.OooOoo0();
            InterfaceC33636Oooo00o interfaceC33636Oooo00oOooO00o = o0OoOo0.OooO00o(c29970OooOOoOooOoo0);
            C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00oOooO00o, ExecutorC33873OooO0O0.f122045OooOoO0, null, new C29972OooOOoo(c29970OooOOoOooOoo0, i, null), 2);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public final void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.translate.TranslateDialogFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23618OooO0Oo implements TextWatcher {
        public C23618OooO0Oo() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            C29970OooOOo c29970OooOOoOooOoo0 = TranslateDialogFragment.this.OooOoo0();
            c29970OooOOoOooOoo0.f106443OooOOO0.setValue(C33599OooOo0O.Oooooo0(C33595OooOOo.OooOo0O(C33595OooOOo.OooOo0O(String.valueOf(editable), "\r", ""), IOUtils.LINE_SEPARATOR_UNIX, "")).toString());
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public OooO0o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return TranslateDialogFragment.this;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.translate.TranslateDialogFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23619OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<Bundle> {
        public C23619OooO0o0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Bundle invoke() {
            TranslateDialogFragment translateDialogFragment = TranslateDialogFragment.this;
            Bundle arguments = translateDialogFragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + translateDialogFragment + " has null arguments");
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.translate.TranslateDialogFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class C23620OooO0oO extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ OooO0o f76964OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23620OooO0oO(OooO0o oooO0o) {
            super(0);
            this.f76964OooOo0o = oooO0o;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f76964OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.translate.TranslateDialogFragment$OooO0oo, reason: case insensitive filesystem */
    public static final class C23621OooO0oo extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f76965OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23621OooO0oo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f76965OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f76965OooOo0o.getValue()).getViewModelStore();
        }
    }

    public static final class OooOO0 extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f76966OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f76966OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f76966OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? TranslateDialogFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public TranslateDialogFragment() {
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f76915OooOooO = new C24568OooO0oO(oooo0.OooO0O0(C29967OooOOO0.class), new C23619OooO0o0());
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, new C23620OooO0oO(new OooO0o()));
        this.f76916OooOooo = new C22026ooOO(oooo0.OooO0O0(C29970OooOOo.class), new C23621OooO0oo(interfaceC32440OooOO0OooO0O0), new OooOO0(interfaceC32440OooOO0OooO0O0), new OooO(interfaceC32440OooOO0OooO0O0));
        this.f76929OoooO0 = new MediaPlayer();
    }

    public final C29970OooOOo OooOoo0() {
        return (C29970OooOOo) this.f76916OooOooo.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_translate_dialog, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        MediaPlayer mediaPlayer = this.f76929OoooO0;
        if (mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
            mediaPlayer.reset();
        }
    }

    @Override // com.orion.notein.p607ui.RoundBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        String string = C33599OooOo0O.Oooooo0(C33595OooOOo.OooOo0O(C33595OooOOo.OooOo0O(((C29967OooOOO0) this.f76915OooOooO.getValue()).f106428OooO00o, "\r", ""), IOUtils.LINE_SEPARATOR_UNIX, "")).toString();
        TextView textView = (TextView) view.findViewById(R.id.content_src);
        OooOOO0.OooO0Oo(textView);
        textView.addTextChangedListener(new C23618OooO0Oo());
        textView.setText(string);
        this.f76918Oooo0 = textView;
        this.f76922Oooo0O0 = (TextView) view.findViewById(R.id.content_dst);
        ScrollView scrollView = (ScrollView) view.findViewById(R.id.translate_section);
        scrollView.setOnTouchListener(new ViewOnTouchListenerC29205OooO0o0(scrollView, 1));
        this.f76923Oooo0OO = (TextView) view.findViewById(R.id.content_dict);
        this.f76925Oooo0o0 = view.findViewById(R.id.translate_dict_section);
        View viewFindViewById = view.findViewById(R.id.btn_switch);
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC28568OooooOO(this, 1));
        this.f76921Oooo00o = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.btn_src_tts_play);
        this.f76926Oooo0oO = viewFindViewById2;
        if (viewFindViewById2 == null) {
            OooOOO0.OooOOOO("btnSrcTtsPlay");
            throw null;
        }
        viewFindViewById2.setOnClickListener(new ViewOnClickListenerC29207OooO00o(this, 1));
        View viewFindViewById3 = view.findViewById(R.id.btn_dst_tts_play);
        this.f76927Oooo0oo = viewFindViewById3;
        if (viewFindViewById3 == null) {
            OooOOO0.OooOOOO("btnDstTtsPlay");
            throw null;
        }
        viewFindViewById3.setOnClickListener(new ViewOnClickListenerC29208OooO0O0(this, 1));
        final View viewFindViewById4 = view.findViewById(R.id.btn_dict_copy);
        viewFindViewById4.setOnClickListener(new View.OnClickListener() { // from class: o0o00oO.OooOO0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                TranslateDialogFragment translateDialogFragment = this.f106425OooOo0o;
                TextView textView2 = translateDialogFragment.f76923Oooo0OO;
                if (textView2 == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("contentDict");
                    throw null;
                }
                String string2 = textView2.getText().toString();
                C29970OooOOo c29970OooOOoOooOoo0 = translateDialogFragment.OooOoo0();
                Context contextRequireContext = translateDialogFragment.requireContext();
                kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                c29970OooOOoOooOoo0.OooO0o0(contextRequireContext, string2);
                Context context = viewFindViewById4.getContext();
                if (context != null) {
                    String string3 = context.getString(R.string.translation_has_been_copied_to_clipboard);
                    kotlin.jvm.internal.OooOOO0.OooO0o(string3, "getString(...)");
                    C25206OooO0Oo.OooO0Oo(context, string3);
                }
            }
        });
        this.f76917Oooo = viewFindViewById4;
        View viewFindViewById5 = view.findViewById(R.id.btn_dst_copy);
        viewFindViewById5.setOnClickListener(new o00Ooo(this, 1));
        this.f76924Oooo0o = viewFindViewById5;
        View viewFindViewById6 = view.findViewById(R.id.btn_close);
        this.f76930OoooO00 = viewFindViewById6;
        if (viewFindViewById6 == null) {
            OooOOO0.OooOOOO("btnClose");
            throw null;
        }
        viewFindViewById6.setOnClickListener(new ViewOnClickListenerC28596o00o0O(this, 1));
        Spinner spinner = (Spinner) view.findViewById(R.id.spinner_from);
        this.f76919Oooo000 = spinner;
        if (spinner == null) {
            OooOOO0.OooOOOO("spinnerFrom");
            throw null;
        }
        spinner.setOnItemSelectedListener(new OooO0OO());
        Spinner spinner2 = (Spinner) view.findViewById(R.id.spinner_to);
        this.f76920Oooo00O = spinner2;
        if (spinner2 == null) {
            OooOOO0.OooOOOO("spinnerTo");
            throw null;
        }
        spinner2.setOnItemSelectedListener(new OooO00o());
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooO0O0(null), 3);
    }
}
