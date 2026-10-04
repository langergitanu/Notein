package com.orion.notein.p607ui.login.countrycode;

import OooOoOO.C20519OooO0Oo;
import android.app.Dialog;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.o00Oo0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.widget.NoteInSidebar;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o000o00.AbstractC24555OooO00o;
import o0Oo.C28010OooO;
import o0Oo.C28011OooO00o;
import o0Oo.C28014OooO0Oo;
import o0Oo.C28016OooO0o0;
import o0Oo.C28019OooOO0;
import o0Oo.C28021OooOO0o;
import o0Oo.C28022OooOOO0;
import o0Oo.ViewOnClickListenerC28013OooO0OO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32447OooOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33649OoooOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OOO.AbstractC33687OooO0oO;
import oO0o0Ooo.C33833OooOOOO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/login/countrycode/CountryCodeSelectDialogFragment;", "Lcom/orion/notein/ui/RoundBottomSheetDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class CountryCodeSelectDialogFragment extends Hilt_CountryCodeSelectDialogFragment {

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final C22026ooOO f72135OooOooO = new C22026ooOO(C24035Oooo00o.f80943OooO00o.OooO0O0(C28022OooOOO0.class), new C23150OooO0o0(), new C23151OooO0oO(), new OooO0o());

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final C32447OooOOo f72136OooOooo = C20519OooO0Oo.OooO0OO(new C28016OooO0o0(this, 0));

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public RecyclerView f72137Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public C28011OooO00o f72138Oooo00O;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.countrycode.CountryCodeSelectDialogFragment$onViewCreated$1$1$1", m80623f = "CountryCodeSelectDialogFragment.kt", m80624l = {56}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f72140OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ Editable f72141OooOoO0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Editable editable, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f72141OooOoO0 = editable;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return CountryCodeSelectDialogFragment.this.new OooO00o(this.f72141OooOoO0, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f72140OooOo0o;
            CountryCodeSelectDialogFragment countryCodeSelectDialogFragment = CountryCodeSelectDialogFragment.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C28022OooOOO0 c28022OooOOO0 = (C28022OooOOO0) countryCodeSelectDialogFragment.f72135OooOooO.getValue();
                String strValueOf = String.valueOf(this.f72141OooOoO0);
                Object value = countryCodeSelectDialogFragment.f72136OooOooo.getValue();
                OooOOO0.OooO0o(value, "getValue(...)");
                this.f72140OooOo0o = 1;
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C28021OooOO0o(c28022OooOOO0, strValueOf, (Locale) value, null), this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            List list = (List) obj;
            C28011OooO00o c28011OooO00o = countryCodeSelectDialogFragment.f72138Oooo00O;
            if (c28011OooO00o != null) {
                c28011OooO00o.OooO0Oo(list);
                return C32460OooOooO.f116667OooO00o;
            }
            OooOOO0.OooOOOO("adapter");
            throw null;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.countrycode.CountryCodeSelectDialogFragment$onViewCreated$3", m80623f = "CountryCodeSelectDialogFragment.kt", m80624l = {89, 90}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f72142OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public Object f72143OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ NoteInSidebar f72144OooOoO;

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.countrycode.CountryCodeSelectDialogFragment$onViewCreated$3$1$1", m80623f = "CountryCodeSelectDialogFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ List<String> f72146OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ NoteInSidebar f72147OooOo0o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(NoteInSidebar noteInSidebar, List<String> list, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f72147OooOo0o = noteInSidebar;
                this.f72146OooOo = list;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO00o(this.f72147OooOo0o, this.f72146OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                C32446OooOOOo.OooO0O0(obj);
                NoteInSidebar noteInSidebar = this.f72147OooOo0o;
                noteInSidebar.getClass();
                List<String> letters = this.f72146OooOo;
                OooOOO0.OooO0oO(letters, "letters");
                ArrayList arrayList = noteInSidebar.f80105OooOo;
                arrayList.clear();
                arrayList.addAll(letters);
                noteInSidebar.requestLayout();
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(NoteInSidebar noteInSidebar, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f72144OooOoO = noteInSidebar;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return CountryCodeSelectDialogFragment.this.new OooO0O0(this.f72144OooOoO, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x005f, code lost:
        
            if (oO0o0OO.C33609OooO0oo.OooO0o(r4, r5, r7) == r0) goto L15;
         */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f72142OooOo;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                CountryCodeSelectDialogFragment countryCodeSelectDialogFragment = CountryCodeSelectDialogFragment.this;
                C28022OooOOO0 c28022OooOOO0 = (C28022OooOOO0) countryCodeSelectDialogFragment.f72135OooOooO.getValue();
                Object value = countryCodeSelectDialogFragment.f72136OooOooo.getValue();
                OooOOO0.OooO0o(value, "getValue(...)");
                this.f72142OooOo = 1;
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C28010OooO(c28022OooOOO0, (Locale) value, null), this);
                if (obj != enumC32485OooO00o) {
                }
                return enumC32485OooO00o;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return C32460OooOooO.f116667OooO00o;
            }
            C32446OooOOOo.OooO0O0(obj);
            C33874OooO0OO c33874OooO0OO2 = C33649OoooOOo.f121328OooO00o;
            AbstractC33687OooO0oO abstractC33687OooO0oO = C33833OooOOOO.f121946OooO00o;
            OooO00o oooO00o = new OooO00o(this.f72144OooOoO, (List) obj, null);
            this.f72143OooOo0o = obj;
            this.f72142OooOo = 2;
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.login.countrycode.CountryCodeSelectDialogFragment$onViewCreated$4", m80623f = "CountryCodeSelectDialogFragment.kt", m80624l = {97}, m80625m = "invokeSuspend")
    public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f72149OooOo0o;

        public OooO0OO(Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return CountryCodeSelectDialogFragment.this.new OooO0OO(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) throws Throwable {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f72149OooOo0o;
            CountryCodeSelectDialogFragment countryCodeSelectDialogFragment = CountryCodeSelectDialogFragment.this;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C28022OooOOO0 c28022OooOOO0 = (C28022OooOOO0) countryCodeSelectDialogFragment.f72135OooOooO.getValue();
                Object value = countryCodeSelectDialogFragment.f72136OooOooo.getValue();
                OooOOO0.OooO0o(value, "getValue(...)");
                this.f72149OooOo0o = 1;
                C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
                obj = C33609OooO0oo.OooO0o(ExecutorC33873OooO0O0.f122045OooOoO0, new C28019OooOO0(c28022OooOOO0, (Locale) value, null), this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            List list = (List) obj;
            C28011OooO00o c28011OooO00o = countryCodeSelectDialogFragment.f72138Oooo00O;
            if (c28011OooO00o != null) {
                c28011OooO00o.OooO0Oo(list);
                return C32460OooOooO.f116667OooO00o;
            }
            OooOOO0.OooOOOO("adapter");
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.login.countrycode.CountryCodeSelectDialogFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23149OooO0Oo implements TextWatcher {
        public C23149OooO0Oo() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            CountryCodeSelectDialogFragment countryCodeSelectDialogFragment = CountryCodeSelectDialogFragment.this;
            InterfaceC21987OooOoo viewLifecycleOwner = countryCodeSelectDialogFragment.getViewLifecycleOwner();
            OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, countryCodeSelectDialogFragment.new OooO00o(editable, null), 3);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public OooO0o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return CountryCodeSelectDialogFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.login.countrycode.CountryCodeSelectDialogFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23150OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public C23150OooO0o0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return CountryCodeSelectDialogFragment.this.requireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.login.countrycode.CountryCodeSelectDialogFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class C23151OooO0oO extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public C23151OooO0oO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return CountryCodeSelectDialogFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Override // com.orion.notein.p607ui.RoundBottomSheetDialogFragment, com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        dialogOnCreateDialog.setCanceledOnTouchOutside(true);
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_country_code_dialog, viewGroup, false);
    }

    @Override // com.orion.notein.p607ui.RoundBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        EditText editText = (EditText) view.findViewById(R.id.et_search);
        OooOOO0.OooO0Oo(editText);
        editText.addTextChangedListener(new C23149OooO0Oo());
        this.f72138Oooo00O = new C28011OooO00o(C28011OooO00o.C19885OooO00o.f99344OooO00o);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_country_code);
        this.f72137Oooo000 = recyclerView;
        if (recyclerView == null) {
            OooOOO0.OooOOOO("rvCountryCode");
            throw null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
        RecyclerView recyclerView2 = this.f72137Oooo000;
        if (recyclerView2 == null) {
            OooOOO0.OooOOOO("rvCountryCode");
            throw null;
        }
        C28011OooO00o c28011OooO00o = this.f72138Oooo00O;
        if (c28011OooO00o == null) {
            OooOOO0.OooOOOO("adapter");
            throw null;
        }
        recyclerView2.setAdapter(c28011OooO00o);
        C28011OooO00o c28011OooO00o2 = this.f72138Oooo00O;
        if (c28011OooO00o2 == null) {
            OooOOO0.OooOOOO("adapter");
            throw null;
        }
        c28011OooO00o2.f99343OooO0O0 = new ViewOnClickListenerC28013OooO0OO(this, 0);
        NoteInSidebar noteInSidebar = (NoteInSidebar) view.findViewById(R.id.sidebar);
        noteInSidebar.setOnTouchLetterChangeListener(new C28014OooO0Oo(this, 0));
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooO0O0(noteInSidebar, null), 3);
        InterfaceC21987OooOoo viewLifecycleOwner2 = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner2), null, null, new OooO0OO(null), 3);
    }
}
