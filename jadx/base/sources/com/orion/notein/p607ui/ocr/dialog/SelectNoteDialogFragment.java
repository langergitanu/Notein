package com.orion.notein.p607ui.ocr.dialog;

import OooOoOO.C20519OooO0Oo;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00Oo0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.noteeditor.LockNoteFragment;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import kotlin.jvm.internal.Oooo0;
import o000o00.AbstractC24555OooO00o;
import o000o0O0.C24568OooO0oO;
import o0O0o0oO.o00O0O;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0o0o.ViewOnClickListenerC28253Oooo00O;
import o0OoOOOo.ViewOnClickListenerC29113OooOo0O;
import o0o0OO.C30365OooO0Oo;
import o0o0OO0o.C30452OooO00o;
import o0o0OOO0.C30544OooO0O0;
import o0ooo.C31699OooOOo0;
import o0ooo.C31700OooOOoo;
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
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/ocr/dialog/SelectNoteDialogFragment;", "Lcom/orion/notein/ui/RoundBottomSheetDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class SelectNoteDialogFragment extends Hilt_SelectNoteDialogFragment {

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final C24568OooO0oO f78377OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final C22026ooOO f78378OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public TextView f78379Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final C32447OooOOo f78380Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public C30452OooO00o f78381Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public TextView f78382Oooo00o;

    public static final class OooO00o implements SearchView.OooOOO0 {
        public OooO00o() {
        }

        @Override // androidx.appcompat.widget.SearchView.OooOOO0
        public final boolean OooO00o(String str) {
            SelectNoteDialogFragment.this.OooOoo0().OooO0o0(String.valueOf(str));
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.OooOOO0
        public final boolean OooO0O0() {
            return false;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.dialog.SelectNoteDialogFragment$onViewCreated$6", m80623f = "SelectNoteDialogFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f78385OooOo0o;

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.dialog.SelectNoteDialogFragment$onViewCreated$6$1", m80623f = "SelectNoteDialogFragment.kt", m80624l = {107}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ SelectNoteDialogFragment f78386OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f78387OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.ocr.dialog.SelectNoteDialogFragment$OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
            public static final class C19449OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ SelectNoteDialogFragment f78388OooOo0o;

                public C19449OooO00o(SelectNoteDialogFragment selectNoteDialogFragment) {
                    this.f78388OooOo0o = selectNoteDialogFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    List<T> list = (List) obj;
                    C30452OooO00o c30452OooO00o = this.f78388OooOo0o.f78381Oooo00O;
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
                this.f78386OooOo = selectNoteDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f78386OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f78387OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    SelectNoteDialogFragment selectNoteDialogFragment = this.f78386OooOo;
                    C30365OooO0Oo c30365OooO0OoOooOoo0 = selectNoteDialogFragment.OooOoo0();
                    C19449OooO00o c19449OooO00o = new C19449OooO00o(selectNoteDialogFragment);
                    this.f78387OooOo0o = 1;
                    if (c30365OooO0OoOooOoo0.f108322OooO0oo.f121747OooOo0o.collect(c19449OooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.ocr.dialog.SelectNoteDialogFragment$OooO0O0$OooO0O0, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.ocr.dialog.SelectNoteDialogFragment$onViewCreated$6$2", m80623f = "SelectNoteDialogFragment.kt", m80624l = {109}, m80625m = "invokeSuspend")
        public static final class C19450OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ SelectNoteDialogFragment f78389OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f78390OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.ocr.dialog.SelectNoteDialogFragment$OooO0O0$OooO0O0$OooO00o */
            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ SelectNoteDialogFragment f78391OooOo0o;

                public OooO00o(SelectNoteDialogFragment selectNoteDialogFragment) {
                    this.f78391OooOo0o = selectNoteDialogFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    boolean z = ((C30544OooO0O0) obj) != null;
                    SelectNoteDialogFragment selectNoteDialogFragment = this.f78391OooOo0o;
                    TextView textView = selectNoteDialogFragment.f78379Oooo0;
                    if (textView == null) {
                        OooOOO0.OooOOOO("btnConfirm");
                        throw null;
                    }
                    textView.setEnabled(z);
                    if (z) {
                        TextView textView2 = selectNoteDialogFragment.f78382Oooo00o;
                        if (textView2 == null) {
                            OooOOO0.OooOOOO("btnComposite");
                            throw null;
                        }
                        textView2.setText(selectNoteDialogFragment.getString(R.string.unselect));
                    } else {
                        TextView textView3 = selectNoteDialogFragment.f78382Oooo00o;
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
            public C19450OooO0O0(SelectNoteDialogFragment selectNoteDialogFragment, Continuation<? super C19450OooO0O0> continuation) {
                super(2, continuation);
                this.f78389OooOo = selectNoteDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19450OooO0O0(this.f78389OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C19450OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f78390OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    SelectNoteDialogFragment selectNoteDialogFragment = this.f78389OooOo;
                    C30365OooO0Oo c30365OooO0OoOooOoo0 = selectNoteDialogFragment.OooOoo0();
                    OooO00o oooO00o = new OooO00o(selectNoteDialogFragment);
                    this.f78390OooOo0o = 1;
                    if (c30365OooO0OoOooOoo0.f108317OooO.f121747OooOo0o.collect(oooO00o, this) == enumC32485OooO00o) {
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
            oooO0O0.f78385OooOo0o = obj;
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
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f78385OooOo0o;
            SelectNoteDialogFragment selectNoteDialogFragment = SelectNoteDialogFragment.this;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO00o(selectNoteDialogFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C19450OooO0O0(selectNoteDialogFragment, null), 3);
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

    /* JADX INFO: renamed from: com.orion.notein.ui.ocr.dialog.SelectNoteDialogFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23736OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public C23736OooO0Oo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return SelectNoteDialogFragment.this;
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f78394OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f78394OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f78394OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.ocr.dialog.SelectNoteDialogFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23737OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C23736OooO0Oo f78395OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23737OooO0o0(C23736OooO0Oo c23736OooO0Oo) {
            super(0);
            this.f78395OooOo0o = c23736OooO0Oo;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f78395OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.ocr.dialog.SelectNoteDialogFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class C23738OooO0oO extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f78396OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23738OooO0oO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f78396OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f78396OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.ocr.dialog.SelectNoteDialogFragment$OooO0oo, reason: case insensitive filesystem */
    public static final class C23739OooO0oo extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f78397OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23739OooO0oo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f78397OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f78397OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? SelectNoteDialogFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public SelectNoteDialogFragment() {
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f78377OooOooO = new C24568OooO0oO(oooo0.OooO0O0(C31700OooOOoo.class), new OooO0OO());
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, new C23737OooO0o0(new C23736OooO0Oo()));
        this.f78378OooOooo = new C22026ooOO(oooo0.OooO0O0(C30365OooO0Oo.class), new OooO0o(interfaceC32440OooOO0OooO0O0), new C23739OooO0oo(interfaceC32440OooOO0OooO0O0), new C23738OooO0oO(interfaceC32440OooOO0OooO0O0));
        this.f78380Oooo000 = C20519OooO0Oo.OooO0OO(new C31699OooOOo0());
    }

    public final C30365OooO0Oo OooOoo0() {
        return (C30365OooO0Oo) this.f78378OooOooo.getValue();
    }

    @Override // com.orion.notein.p607ui.ocr.dialog.Hilt_SelectNoteDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        OooOOO0.OooO0oO(context, "context");
        super.onAttach(context);
        FragmentManager childFragmentManager = getChildFragmentManager();
        androidx.fragment.app.OooO00o oooO00oOooO0OO = OooOOOo.OooOOO0.OooO0OO(childFragmentManager, childFragmentManager);
        C32447OooOOo c32447OooOOo = this.f78380Oooo000;
        oooO00oOooO0OO.OooO0Oo(0, (LockNoteFragment) c32447OooOOo.getValue(), ((LockNoteFragment) c32447OooOOo.getValue()).getClass().getSimpleName(), 1);
        oooO00oOooO0OO.OooO(true, true);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_import_batch_pdf_dialog, viewGroup, false);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        FragmentManager childFragmentManager = getChildFragmentManager();
        androidx.fragment.app.OooO00o oooO00oOooO0OO = OooOOOo.OooOOO0.OooO0OO(childFragmentManager, childFragmentManager);
        oooO00oOooO0OO.OooOOO0((LockNoteFragment) this.f78380Oooo000.getValue());
        oooO00oOooO0OO.OooO(true, true);
    }

    @Override // com.orion.notein.p607ui.RoundBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        OooOOO0.OooO0oO(dialog, "dialog");
        super.onDismiss(dialog);
        OooOoo0().OooO0o0("");
    }

    @Override // com.orion.notein.p607ui.RoundBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        ((TextView) view.findViewById(R.id.title)).setText(getString(R.string.select_target_note));
        ((SearchView) view.findViewById(R.id.search_box)).setOnQueryTextListener(new OooO00o());
        TextView textView = (TextView) view.findViewById(R.id.btn_cancel);
        this.f78382Oooo00o = textView;
        if (textView == null) {
            OooOOO0.OooOOOO("btnComposite");
            throw null;
        }
        textView.setOnClickListener(new ViewOnClickListenerC29113OooOo0O(this, 6));
        TextView textView2 = (TextView) view.findViewById(R.id.btn_confirm);
        this.f78379Oooo0 = textView2;
        if (textView2 == null) {
            OooOOO0.OooOOOO("btnConfirm");
            throw null;
        }
        C28050OooO0OO.OooO00o(textView2, 500L, new ViewOnClickListenerC28253Oooo00O(this, 4));
        C30452OooO00o c30452OooO00o = new C30452OooO00o();
        this.f78381Oooo00O = c30452OooO00o;
        c30452OooO00o.f108739OooO0O0 = new o00O0O(this, 6);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_notein_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
        C30452OooO00o c30452OooO00o2 = this.f78381Oooo00O;
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
