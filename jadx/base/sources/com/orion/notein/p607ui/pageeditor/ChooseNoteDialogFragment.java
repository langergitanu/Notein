package com.orion.notein.p607ui.pageeditor;

import OooOoOO.C20519OooO0Oo;
import Oooo0O0.OooOO0;
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
import o0Oo0oOo.ViewOnClickListenerC28375o0ooOO0;
import o0OoO000.ViewOnClickListenerC28589o0000oO;
import o0o00oO0.ViewOnClickListenerC29992OooOO0o;
import o0o0OO.C30365OooO0Oo;
import o0o0OO0O.C30425OooO0OO;
import o0o0OO0o.C30452OooO00o;
import o0o0OOO0.C30544OooO0O0;
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
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/pageeditor/ChooseNoteDialogFragment;", "Lcom/orion/notein/ui/RoundBottomSheetDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class ChooseNoteDialogFragment extends Hilt_ChooseNoteDialogFragment {

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final C22026ooOO f78450OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final C24568OooO0oO f78451OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public C30452OooO00o f78452Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public TextView f78453Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public TextView f78454Oooo00o;

    public static final class OooO00o implements SearchView.OooOOO0 {
        public OooO00o() {
        }

        @Override // androidx.appcompat.widget.SearchView.OooOOO0
        public final boolean OooO00o(String str) {
            ChooseNoteDialogFragment.this.OooOoo0().OooO0o0(String.valueOf(str));
            return false;
        }

        @Override // androidx.appcompat.widget.SearchView.OooOOO0
        public final boolean OooO0O0() {
            return false;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pageeditor.ChooseNoteDialogFragment$onViewCreated$6", m80623f = "ChooseNoteDialogFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f78457OooOo0o;

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pageeditor.ChooseNoteDialogFragment$onViewCreated$6$1", m80623f = "ChooseNoteDialogFragment.kt", m80624l = {122}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ ChooseNoteDialogFragment f78458OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f78459OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.pageeditor.ChooseNoteDialogFragment$OooO0O0$OooO00o$OooO00o, reason: collision with other inner class name */
            public static final class C19451OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ ChooseNoteDialogFragment f78460OooOo0o;

                public C19451OooO00o(ChooseNoteDialogFragment chooseNoteDialogFragment) {
                    this.f78460OooOo0o = chooseNoteDialogFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    List<T> list = (List) obj;
                    C30452OooO00o c30452OooO00o = this.f78460OooOo0o.f78452Oooo000;
                    if (c30452OooO00o != null) {
                        c30452OooO00o.OooO0Oo(list);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    OooOOO0.OooOOOO("noteAdapter");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(ChooseNoteDialogFragment chooseNoteDialogFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f78458OooOo = chooseNoteDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f78458OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f78459OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    ChooseNoteDialogFragment chooseNoteDialogFragment = this.f78458OooOo;
                    C30365OooO0Oo c30365OooO0OoOooOoo0 = chooseNoteDialogFragment.OooOoo0();
                    C19451OooO00o c19451OooO00o = new C19451OooO00o(chooseNoteDialogFragment);
                    this.f78459OooOo0o = 1;
                    if (c30365OooO0OoOooOoo0.f108322OooO0oo.f121747OooOo0o.collect(c19451OooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.pageeditor.ChooseNoteDialogFragment$OooO0O0$OooO0O0, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pageeditor.ChooseNoteDialogFragment$onViewCreated$6$2", m80623f = "ChooseNoteDialogFragment.kt", m80624l = {124}, m80625m = "invokeSuspend")
        public static final class C19452OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ ChooseNoteDialogFragment f78461OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f78462OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.pageeditor.ChooseNoteDialogFragment$OooO0O0$OooO0O0$OooO00o */
            public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ ChooseNoteDialogFragment f78463OooOo0o;

                public OooO00o(ChooseNoteDialogFragment chooseNoteDialogFragment) {
                    this.f78463OooOo0o = chooseNoteDialogFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    boolean z = ((C30544OooO0O0) obj) != null;
                    ChooseNoteDialogFragment chooseNoteDialogFragment = this.f78463OooOo0o;
                    TextView textView = chooseNoteDialogFragment.f78454Oooo00o;
                    if (textView == null) {
                        OooOOO0.OooOOOO("btnConfirm");
                        throw null;
                    }
                    textView.setEnabled(z);
                    if (z) {
                        TextView textView2 = chooseNoteDialogFragment.f78453Oooo00O;
                        if (textView2 == null) {
                            OooOOO0.OooOOOO("btnComposite");
                            throw null;
                        }
                        textView2.setText(chooseNoteDialogFragment.getString(R.string.unselect));
                    } else {
                        TextView textView3 = chooseNoteDialogFragment.f78453Oooo00O;
                        if (textView3 == null) {
                            OooOOO0.OooOOOO("btnComposite");
                            throw null;
                        }
                        textView3.setText(chooseNoteDialogFragment.getString(R.string.cancel));
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19452OooO0O0(ChooseNoteDialogFragment chooseNoteDialogFragment, Continuation<? super C19452OooO0O0> continuation) {
                super(2, continuation);
                this.f78461OooOo = chooseNoteDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19452OooO0O0(this.f78461OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C19452OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f78462OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    ChooseNoteDialogFragment chooseNoteDialogFragment = this.f78461OooOo;
                    C30365OooO0Oo c30365OooO0OoOooOoo0 = chooseNoteDialogFragment.OooOoo0();
                    OooO00o oooO00o = new OooO00o(chooseNoteDialogFragment);
                    this.f78462OooOo0o = 1;
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
            OooO0O0 oooO0O0 = ChooseNoteDialogFragment.this.new OooO0O0(continuation);
            oooO0O0.f78457OooOo0o = obj;
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
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f78457OooOo0o;
            ChooseNoteDialogFragment chooseNoteDialogFragment = ChooseNoteDialogFragment.this;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO00o(chooseNoteDialogFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C19452OooO0O0(chooseNoteDialogFragment, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<Bundle> {
        public OooO0OO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Bundle invoke() {
            ChooseNoteDialogFragment chooseNoteDialogFragment = ChooseNoteDialogFragment.this;
            Bundle arguments = chooseNoteDialogFragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + chooseNoteDialogFragment + " has null arguments");
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.pageeditor.ChooseNoteDialogFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23743OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public C23743OooO0Oo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return ChooseNoteDialogFragment.this;
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f78466OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f78466OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f78466OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.pageeditor.ChooseNoteDialogFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23744OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C23743OooO0Oo f78467OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23744OooO0o0(C23743OooO0Oo c23743OooO0Oo) {
            super(0);
            this.f78467OooOo0o = c23743OooO0Oo;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f78467OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.pageeditor.ChooseNoteDialogFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class C23745OooO0oO extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f78468OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23745OooO0oO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f78468OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f78468OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.pageeditor.ChooseNoteDialogFragment$OooO0oo, reason: case insensitive filesystem */
    public static final class C23746OooO0oo extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f78469OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23746OooO0oo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f78469OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f78469OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? ChooseNoteDialogFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public ChooseNoteDialogFragment() {
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, new C23744OooO0o0(new C23743OooO0Oo()));
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f78450OooOooO = new C22026ooOO(oooo0.OooO0O0(C30365OooO0Oo.class), new OooO0o(interfaceC32440OooOO0OooO0O0), new C23746OooO0oo(interfaceC32440OooOO0OooO0O0), new C23745OooO0oO(interfaceC32440OooOO0OooO0O0));
        this.f78451OooOooo = new C24568OooO0oO(oooo0.OooO0O0(C30425OooO0OO.class), new OooO0OO());
    }

    public final C30365OooO0Oo OooOoo0() {
        return (C30365OooO0Oo) this.f78450OooOooO.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_import_batch_pdf_dialog, viewGroup, false);
    }

    @Override // com.orion.notein.p607ui.RoundBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        OooOO0.OooO00o(this);
    }

    @Override // com.orion.notein.p607ui.RoundBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        OooOOO0.OooO0oO(dialog, "dialog");
        super.onDismiss(dialog);
        OooOoo0().OooO0o0("");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0079  */
    @Override // com.orion.notein.p607ui.RoundBottomSheetDialogFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        ((TextView) view.findViewById(R.id.title)).setText(getString(R.string.select_target_note));
        ((SearchView) view.findViewById(R.id.search_box)).setOnQueryTextListener(new OooO00o());
        TextView textView = (TextView) view.findViewById(R.id.btn_cancel);
        this.f78453Oooo00O = textView;
        if (textView == null) {
            OooOOO0.OooOOOO("btnComposite");
            throw null;
        }
        textView.setOnClickListener(new ViewOnClickListenerC28375o0ooOO0(this, 1));
        this.f78454Oooo00o = (TextView) view.findViewById(R.id.btn_confirm);
        int i = ((C30425OooO0OO) this.f78451OooOooo.getValue()).f108683OooO00o;
        if (i == 0) {
            TextView textView2 = this.f78454Oooo00o;
            if (textView2 == null) {
                OooOOO0.OooOOOO("btnConfirm");
                throw null;
            }
            textView2.setText(getString(R.string.open));
        } else if (i == 1) {
            TextView textView3 = this.f78454Oooo00o;
            if (textView3 == null) {
                OooOOO0.OooOOOO("btnConfirm");
                throw null;
            }
            textView3.setText(getString(R.string.page_move_in));
        } else if (i == 2 || i == 3) {
        }
        TextView textView4 = this.f78454Oooo00o;
        if (textView4 == null) {
            OooOOO0.OooOOOO("btnConfirm");
            throw null;
        }
        C28050OooO0OO.OooO00o(textView4, 500L, new ViewOnClickListenerC28589o0000oO(this, 1));
        C30452OooO00o c30452OooO00o = new C30452OooO00o();
        this.f78452Oooo000 = c30452OooO00o;
        c30452OooO00o.f108739OooO0O0 = new ViewOnClickListenerC29992OooOO0o(this, 1);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_notein_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
        C30452OooO00o c30452OooO00o2 = this.f78452Oooo000;
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
