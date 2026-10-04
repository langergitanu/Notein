package com.orion.notein.p607ui.noteeditor.hyperlinkeditor.dialog;

import OooOoOO.C20519OooO0Oo;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00Oo0;
import androidx.recyclerview.widget.RecyclerView;
import com.aspose.slides.C22201OooO0oO;
import com.orion.notein.global.R;
import kotlin.Metadata;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import kotlin.jvm.internal.Oooo0;
import o000o00.AbstractC24555OooO00o;
import o000o0O0.C24568OooO0oO;
import o00o00O0.C25252OooO0Oo;
import o0O0oooO.ViewOnClickListenerC26282Oooo;
import o0O0oooO.ViewOnClickListenerC26292Oooo0oo;
import o0OO00o0.o000Oo0;
import o0Ooo000.C29328OooO;
import o0Ooo000.C29337OooOO0;
import o0Ooo000.C29339OooOO0o;
import o0Ooo000.C29340OooOOO;
import o0Ooo000.C29341OooOOO0;
import o0Ooo000.C29343OooOOOo;
import o0Ooo000.C29355OooOoo;
import o0Ooo000.C29363Oooo0O0;
import oO00ooO.EnumC32441OooOO0O;
import oO00ooO.InterfaceC32440OooOO0;
import oO0o0OO.C33649OoooOOo;
import oO0o0Ooo.C33833OooOOOO;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/noteeditor/hyperlinkeditor/dialog/NoteTreeSelectionFragment;", "Lcom/orion/notein/ui/RoundBottomSheetDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class NoteTreeSelectionFragment extends Hilt_NoteTreeSelectionFragment {

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final C22026ooOO f74652OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final C24568OooO0oO f74653OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public View f74654Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public RecyclerView f74655Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public SearchView f74656Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public View f74657Oooo00o;

    public static final class OooO00o extends OooOOOO implements oO0O000o.OooO00o<Bundle> {
        public OooO00o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Bundle invoke() {
            NoteTreeSelectionFragment noteTreeSelectionFragment = NoteTreeSelectionFragment.this;
            Bundle arguments = noteTreeSelectionFragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + noteTreeSelectionFragment + " has null arguments");
        }
    }

    public static final class OooO0O0 extends OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public OooO0O0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return NoteTreeSelectionFragment.this;
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ OooO0O0 f74660OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(OooO0O0 oooO0O0) {
            super(0);
            this.f74660OooOo0o = oooO0O0;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f74660OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.hyperlinkeditor.dialog.NoteTreeSelectionFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23432OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f74661OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23432OooO0Oo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f74661OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f74661OooOo0o.getValue()).getViewModelStore();
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f74662OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f74662OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f74662OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? NoteTreeSelectionFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.noteeditor.hyperlinkeditor.dialog.NoteTreeSelectionFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23433OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f74664OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23433OooO0o0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f74664OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f74664OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    public NoteTreeSelectionFragment() {
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, new OooO0OO(new OooO0O0()));
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f74652OooOooO = new C22026ooOO(oooo0.OooO0O0(C29355OooOoo.class), new C23432OooO0Oo(interfaceC32440OooOO0OooO0O0), new OooO0o(interfaceC32440OooOO0OooO0O0), new C23433OooO0o0(interfaceC32440OooOO0OooO0O0));
        this.f74653OooOooo = new C24568OooO0oO(oooo0.OooO0O0(C29340OooOOO.class), new OooO00o());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_note_tree_selection, viewGroup, false);
    }

    @Override // com.orion.notein.p607ui.RoundBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i = 1;
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        C29343OooOOOo.OooO00o("NoteTreeSelectionFragment.init, hash: " + hashCode() + ".");
        this.f74655Oooo000 = (RecyclerView) view.findViewById(R.id.rv_note_tree_selection);
        this.f74656Oooo00O = (SearchView) view.findViewById(R.id.search_box_note_tree_selection);
        this.f74657Oooo00o = view.findViewById(R.id.btn_cancel_note_tree_selection);
        this.f74654Oooo0 = view.findViewById(R.id.btn_confirm_note_tree_selection);
        View view2 = this.f74657Oooo00o;
        if (view2 == null) {
            OooOOO0.OooOOOO("cancelBt");
            throw null;
        }
        view2.setOnClickListener(new ViewOnClickListenerC26292Oooo0oo(this, 2));
        View view3 = this.f74654Oooo0;
        if (view3 == null) {
            OooOOO0.OooOOOO("confirmBt");
            throw null;
        }
        view3.setOnClickListener(new ViewOnClickListenerC26282Oooo(this, i));
        SearchView searchView = this.f74656Oooo00O;
        if (searchView == null) {
            OooOOO0.OooOOOO("searchView");
            throw null;
        }
        searchView.setOnQueryTextListener(new C29341OooOOO0(this));
        String str = ((C29340OooOOO) this.f74653OooOooo.getValue()).f104065OooO00o;
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooO0o0(C22201OooO0oO.OooO0O0(c20358OooO00o, "NoteTreeSelection", "NoteTreeSelection excludeNoteId: ", str, "."), new Object[0]);
        C29328OooO c29328OooO = new C29328OooO(C29328OooO.OooO00o.f104039OooO00o);
        RecyclerView recyclerView = this.f74655Oooo000;
        if (recyclerView == null) {
            OooOOO0.OooOOOO("noteTree");
            throw null;
        }
        recyclerView.setAdapter(c29328OooO);
        C29355OooOoo c29355OooOoo = (C29355OooOoo) this.f74652OooOooO.getValue();
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C25252OooO0Oo.OooOo0o(C25252OooO0Oo.OooOo0O(new o000Oo0(C25252OooO0Oo.OooOo0O(c29355OooOoo.f104108OooO, ExecutorC33873OooO0O0.f122045OooOoO0), new C29339OooOO0o(c29328OooO, str, null), 1), C33833OooOOOO.f121946OooO00o), C21989OooOooO.OooO00o(this));
        RecyclerView recyclerView2 = this.f74655Oooo000;
        if (recyclerView2 == null) {
            OooOOO0.OooOOOO("noteTree");
            throw null;
        }
        C29337OooOO0 c29337OooOO0 = new C29337OooOO0(0, c29328OooO, this);
        Context context = recyclerView2.getContext();
        OooOOO0.OooO0o(context, "getContext(...)");
        recyclerView2.addOnItemTouchListener(new C29363Oooo0O0(context, c29337OooOO0));
    }
}
