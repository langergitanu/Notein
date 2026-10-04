package com.orion.notein.p607ui.settings.debug;

import OooOoOO.C20519OooO0Oo;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00Oo0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import kotlin.jvm.internal.Oooo0;
import o000o00.AbstractC24555OooO00o;
import o000o0O0.C24568OooO0oO;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0o00.ViewOnClickListenerC28179Oooo0;
import o0Oo0o00.ViewOnClickListenerC28182Oooo00o;
import o0Oo0o00.ViewOnClickListenerC28183Oooo0O0;
import o0o0OO0o.C30452OooO00o;
import o0o0OOO0.C30544OooO0O0;
import o0o0OoOO.C30718Oooo0o;
import o0o0OoOo.C30753Oooo00O;
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
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/settings/debug/SelectNoteDialogFragment;", "Lcom/orion/notein/ui/RoundBottomSheetDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class SelectNoteDialogFragment extends Hilt_SelectNoteDialogFragment {

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final C22026ooOO f79105OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final C24568OooO0oO f79106OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public C30452OooO00o f79107Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public TextView f79108Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public TextView f79109Oooo00o;

    public static final class OooO00o implements SearchView.OooOOO0 {
        public OooO00o() {
        }

        @Override // androidx.appcompat.widget.SearchView.OooOOO0
        public final boolean OooO00o(String str) {
            C30753Oooo00O c30753Oooo00OOooOoo0 = SelectNoteDialogFragment.this.OooOoo0();
            String strValueOf = String.valueOf(str);
            C33781o00o0O c33781o00o0O = c30753Oooo00OOooOoo0.f109997OooO0oO;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, strValueOf);
            c30753Oooo00OOooOoo0.f109995OooO0o.setValue(null);
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.OooOOO0
        public final boolean OooO0O0() {
            return false;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.debug.SelectNoteDialogFragment$onViewCreated$6", m80623f = "SelectNoteDialogFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f79112OooOo0o;

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.debug.SelectNoteDialogFragment$onViewCreated$6$1", m80623f = "SelectNoteDialogFragment.kt", m80624l = {89}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ SelectNoteDialogFragment f79113OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f79114OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.settings.debug.SelectNoteDialogFragment$OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
            public static final class C19487OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ SelectNoteDialogFragment f79115OooOo0o;

                public C19487OooO00o(SelectNoteDialogFragment selectNoteDialogFragment) {
                    this.f79115OooOo0o = selectNoteDialogFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    List<T> list = (List) obj;
                    C30452OooO00o c30452OooO00o = this.f79115OooOo0o.f79107Oooo000;
                    if (c30452OooO00o != null) {
                        c30452OooO00o.OooO0Oo(list);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    OooOOO0.OooOOOO("noteAdapter");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(SelectNoteDialogFragment selectNoteDialogFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f79113OooOo = selectNoteDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f79113OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f79114OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    SelectNoteDialogFragment selectNoteDialogFragment = this.f79113OooOo;
                    C30753Oooo00O c30753Oooo00OOooOoo0 = selectNoteDialogFragment.OooOoo0();
                    C19487OooO00o c19487OooO00o = new C19487OooO00o(selectNoteDialogFragment);
                    this.f79114OooOo0o = 1;
                    if (c30753Oooo00OOooOoo0.f109998OooO0oo.f121747OooOo0o.collect(c19487OooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.settings.debug.SelectNoteDialogFragment$OooO0O0$OooO0O0, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.debug.SelectNoteDialogFragment$onViewCreated$6$2", m80623f = "SelectNoteDialogFragment.kt", m80624l = {91}, m80625m = "invokeSuspend")
        public static final class C19488OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ SelectNoteDialogFragment f79116OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f79117OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.settings.debug.SelectNoteDialogFragment$OooO0O0$OooO0O0$OooO00o */
            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ SelectNoteDialogFragment f79118OooOo0o;

                public OooO00o(SelectNoteDialogFragment selectNoteDialogFragment) {
                    this.f79118OooOo0o = selectNoteDialogFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    boolean z = ((C30544OooO0O0) obj) != null;
                    SelectNoteDialogFragment selectNoteDialogFragment = this.f79118OooOo0o;
                    TextView textView = selectNoteDialogFragment.f79109Oooo00o;
                    if (textView == null) {
                        OooOOO0.OooOOOO("btnConfirm");
                        throw null;
                    }
                    textView.setEnabled(z);
                    if (z) {
                        TextView textView2 = selectNoteDialogFragment.f79108Oooo00O;
                        if (textView2 == null) {
                            OooOOO0.OooOOOO("btnComposite");
                            throw null;
                        }
                        textView2.setText(selectNoteDialogFragment.getString(R.string.unselect));
                    } else {
                        TextView textView3 = selectNoteDialogFragment.f79108Oooo00O;
                        if (textView3 == null) {
                            OooOOO0.OooOOOO("btnComposite");
                            throw null;
                        }
                        textView3.setText(selectNoteDialogFragment.getString(R.string.cancel));
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19488OooO0O0(SelectNoteDialogFragment selectNoteDialogFragment, Continuation<? super C19488OooO0O0> continuation) {
                super(2, continuation);
                this.f79116OooOo = selectNoteDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19488OooO0O0(this.f79116OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C19488OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f79117OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    SelectNoteDialogFragment selectNoteDialogFragment = this.f79116OooOo;
                    C30753Oooo00O c30753Oooo00OOooOoo0 = selectNoteDialogFragment.OooOoo0();
                    OooO00o oooO00o = new OooO00o(selectNoteDialogFragment);
                    this.f79117OooOo0o = 1;
                    if (c30753Oooo00OOooOoo0.f109993OooO.f121747OooOo0o.collect(oooO00o, this) == enumC32485OooO00o) {
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
            OooO0O0 oooO0O0 = SelectNoteDialogFragment.this.new OooO0O0(continuation);
            oooO0O0.f79112OooOo0o = obj;
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
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f79112OooOo0o;
            SelectNoteDialogFragment selectNoteDialogFragment = SelectNoteDialogFragment.this;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO00o(selectNoteDialogFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C19488OooO0O0(selectNoteDialogFragment, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<Bundle> {
        public OooO0OO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Bundle invoke() {
            SelectNoteDialogFragment selectNoteDialogFragment = SelectNoteDialogFragment.this;
            Bundle arguments = selectNoteDialogFragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + selectNoteDialogFragment + " has null arguments");
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.settings.debug.SelectNoteDialogFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23815OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public C23815OooO0Oo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return SelectNoteDialogFragment.this;
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f79121OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f79121OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f79121OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.settings.debug.SelectNoteDialogFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23816OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C23815OooO0Oo f79122OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23816OooO0o0(C23815OooO0Oo c23815OooO0Oo) {
            super(0);
            this.f79122OooOo0o = c23815OooO0Oo;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f79122OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.settings.debug.SelectNoteDialogFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class C23817OooO0oO extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f79123OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23817OooO0oO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f79123OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f79123OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.settings.debug.SelectNoteDialogFragment$OooO0oo, reason: case insensitive filesystem */
    public static final class C23818OooO0oo extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f79124OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23818OooO0oo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f79124OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f79124OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? SelectNoteDialogFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public SelectNoteDialogFragment() {
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, new C23816OooO0o0(new C23815OooO0Oo()));
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f79105OooOooO = new C22026ooOO(oooo0.OooO0O0(C30753Oooo00O.class), new OooO0o(interfaceC32440OooOO0OooO0O0), new C23818OooO0oo(interfaceC32440OooOO0OooO0O0), new C23817OooO0oO(interfaceC32440OooOO0OooO0O0));
        this.f79106OooOooo = new C24568OooO0oO(oooo0.OooO0O0(C30718Oooo0o.class), new OooO0OO());
    }

    public final C30753Oooo00O OooOoo0() {
        return (C30753Oooo00O) this.f79105OooOooO.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_import_batch_pdf_dialog, viewGroup, false);
    }

    @Override // com.orion.notein.p607ui.RoundBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        OooOOO0.OooO0oO(dialog, "dialog");
        super.onDismiss(dialog);
        C30753Oooo00O c30753Oooo00OOooOoo0 = OooOoo0();
        C33781o00o0O c33781o00o0O = c30753Oooo00OOooOoo0.f109997OooO0oO;
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, "");
        c30753Oooo00OOooOoo0.f109995OooO0o.setValue(null);
    }

    @Override // com.orion.notein.p607ui.RoundBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        ((TextView) view.findViewById(R.id.title)).setText(getString(R.string.select_target_note));
        ((SearchView) view.findViewById(R.id.search_box)).setOnQueryTextListener(new OooO00o());
        TextView textView = (TextView) view.findViewById(R.id.btn_cancel);
        this.f79108Oooo00O = textView;
        if (textView == null) {
            OooOOO0.OooOOOO("btnComposite");
            throw null;
        }
        textView.setOnClickListener(new ViewOnClickListenerC28182Oooo00o(this, 4));
        TextView textView2 = (TextView) view.findViewById(R.id.btn_confirm);
        this.f79109Oooo00o = textView2;
        if (textView2 == null) {
            OooOOO0.OooOOOO("btnConfirm");
            throw null;
        }
        textView2.setText(getString(R.string.select));
        TextView textView3 = this.f79109Oooo00o;
        if (textView3 == null) {
            OooOOO0.OooOOOO("btnConfirm");
            throw null;
        }
        C28050OooO0OO.OooO00o(textView3, 500L, new ViewOnClickListenerC28179Oooo0(this, 3));
        C30452OooO00o c30452OooO00o = new C30452OooO00o();
        this.f79107Oooo000 = c30452OooO00o;
        c30452OooO00o.f108739OooO0O0 = new ViewOnClickListenerC28183Oooo0O0(this, 3);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_notein_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
        C30452OooO00o c30452OooO00o2 = this.f79107Oooo000;
        if (c30452OooO00o2 == null) {
            OooOOO0.OooOOOO("noteAdapter");
            throw null;
        }
        recyclerView.setAdapter(c30452OooO00o2);
        recyclerView.setItemAnimator(null);
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooO0O0(null), 3);
    }
}
