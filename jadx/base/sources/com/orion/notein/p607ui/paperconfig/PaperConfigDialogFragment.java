package com.orion.notein.p607ui.paperconfig;

import OooOoOO.C20519OooO0Oo;
import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.C21904OooOoo0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC21979OooOOo0;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00Oo0;
import androidx.lifecycle.o0OoOo0;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.paperconfig.OooO00o;
import com.orion.notein.p607ui.paperconfig.PaperConfigDialogFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import kotlin.jvm.internal.Oooo0;
import o000o00.AbstractC24555OooO00o;
import o000o0O0.C24568OooO0oO;
import o0O0o0oO.ViewOnClickListenerC26024OooOOo0;
import o0O0oooO.ViewOnClickListenerC26348o000oOoO;
import o0Oo0O0.C28048OooO00o;
import o0Oo0o0o.C28225OooO0O0;
import o0o000oo.o000oOoO;
import o0o0OOO.C30459OooO0O0;
import o0o0OOO.C30461OooO0Oo;
import o0o0OOO.C30464OooO0oO;
import o0o0OOO.C30493Oooo00O;
import o0o0OOO.C30495Oooo0O0;
import o0o0OOO.C30497Oooo0o;
import o0o0OOO.C30498Oooo0o0;
import o0o0OOO.C30500Oooo0oo;
import o0o0OOO.C30520o000000o;
import o0o0OOO.C30523o00000oO;
import o0o0OOO.C30537o00o0O;
import o0o0OOO.ViewTreeObserverOnGlobalLayoutListenerC30499Oooo0oO;
import o0o0OOO.o0O0O00;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32460OooOooO;
import oO00ooO.EnumC32441OooOO0O;
import oO00ooO.InterfaceC32440OooOO0;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0Oo.C33781o00o0O;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/paperconfig/PaperConfigDialogFragment;", "Lcom/orion/notein/ui/RoundBottomSheetDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class PaperConfigDialogFragment extends Hilt_PaperConfigDialogFragment {

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final C24568OooO0oO f78655OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final C22026ooOO f78656OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public C30523o00000oO f78657Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public com.orion.notein.p607ui.paperconfig.OooO00o f78658Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public TabLayout f78659Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public ViewPager2 f78660Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public TabLayoutMediator f78661Oooo0O0;

    public static final class OooO00o extends OooOOOO implements oO0O000o.OooO00o<Bundle> {
        public OooO00o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Bundle invoke() {
            PaperConfigDialogFragment paperConfigDialogFragment = PaperConfigDialogFragment.this;
            Bundle arguments = paperConfigDialogFragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + paperConfigDialogFragment + " has null arguments");
        }
    }

    public static final class OooO0O0 extends OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public OooO0O0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return PaperConfigDialogFragment.this;
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ OooO0O0 f78664OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(OooO0O0 oooO0O0) {
            super(0);
            this.f78664OooOo0o = oooO0O0;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f78664OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.paperconfig.PaperConfigDialogFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23761OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f78665OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23761OooO0Oo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f78665OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f78665OooOo0o.getValue()).getViewModelStore();
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f78666OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f78666OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f78666OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? PaperConfigDialogFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.paperconfig.PaperConfigDialogFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23762OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f78668OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23762OooO0o0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f78668OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f78668OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    public PaperConfigDialogFragment() {
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f78655OooOooO = new C24568OooO0oO(oooo0.OooO0O0(C30500Oooo0oo.class), new OooO00o());
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, new OooO0OO(new OooO0O0()));
        this.f78656OooOooo = new C22026ooOO(oooo0.OooO0O0(C30520o000000o.class), new C23761OooO0Oo(interfaceC32440OooOO0OooO0O0), new OooO0o(interfaceC32440OooOO0OooO0O0), new C23762OooO0o0(interfaceC32440OooOO0OooO0O0));
    }

    public final C30520o000000o OooOoo() {
        return (C30520o000000o) this.f78656OooOooo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C30500Oooo0oo OooOoo0() {
        return (C30500Oooo0oo) this.f78655OooOooO.getValue();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        com.orion.notein.p607ui.paperconfig.OooO00o oooO00o;
        super.onCreate(bundle);
        int iOrdinal = OooO00o.EnumC19455OooO00o.valueOf(OooOoo0().f108928OooO00o).ordinal();
        if (iOrdinal == 0) {
            oooO00o = C30464OooO0oO.f108785OooO00o;
        } else if (iOrdinal == 1) {
            oooO00o = C30461OooO0Oo.f108777OooO00o;
        } else {
            if (iOrdinal != 2) {
                throw new C32442OooOO0o();
            }
            oooO00o = C30459OooO0O0.f108769OooO00o;
        }
        this.f78658Oooo000 = oooO00o;
        if (oooO00o == null) {
            OooOOO0.OooOOOO("strategy");
            throw null;
        }
        if (oooO00o instanceof C30461OooO0Oo) {
            String str = OooOoo0().f108931OooO0Oo;
            String str2 = OooOoo0().f108930OooO0OO;
            if (str != null && str2 != null) {
                C30520o000000o c30520o000000oOooOoo = OooOoo();
                C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(c30520o000000oOooOoo), null, null, new C30537o00o0O(c30520o000000oOooOoo, str, str2, null), 3);
            }
        }
        OooOoo().OooOoO(OooOoo0().f108933OooO0o0);
        String str3 = OooOoo0().f108932OooO0o;
        if (str3 == null || str3.length() == 0) {
            return;
        }
        C33781o00o0O c33781o00o0O = OooOoo().f109041OoooOO0;
        c33781o00o0O.getClass();
        c33781o00o0O.OooOO0(null, 1);
        C30520o000000o c30520o000000oOooOoo2 = OooOoo();
        C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(c30520o000000oOooOoo2), null, null, new o0O0O00(str3, null, c30520o000000oOooOoo2), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_paper_config_dialog, viewGroup, false);
    }

    @Override // com.orion.notein.p607ui.RoundBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        TabLayoutMediator tabLayoutMediator = this.f78661Oooo0O0;
        if (tabLayoutMediator != null) {
            if (tabLayoutMediator == null) {
                OooOOO0.OooOOOO("tabMediator");
                throw null;
            }
            tabLayoutMediator.detach();
        }
        super.onDestroyView();
    }

    @Override // com.orion.notein.p607ui.RoundBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ViewTreeObserver viewTreeObserver;
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        this.f78659Oooo00O = (TabLayout) view.findViewById(R.id.tab_layout);
        this.f78660Oooo00o = (ViewPager2) view.findViewById(R.id.view_pager);
        FragmentManager childFragmentManager = getChildFragmentManager();
        OooOOO0.OooO0o(childFragmentManager, "getChildFragmentManager(...)");
        AbstractC21979OooOOo0 lifecycle = getLifecycle();
        OooOOO0.OooO0o(lifecycle, "<get-lifecycle>(...)");
        C30523o00000oO c30523o00000oO = new C30523o00000oO(childFragmentManager, lifecycle);
        c30523o00000oO.f109091OooO = true;
        this.f78657Oooo0 = c30523o00000oO;
        ViewPager2 viewPager2 = this.f78660Oooo00o;
        if (viewPager2 == null) {
            OooOOO0.OooOOOO("viewPager");
            throw null;
        }
        viewPager2.setAdapter(c30523o00000oO);
        ViewPager2 viewPager22 = this.f78660Oooo00o;
        if (viewPager22 == null) {
            OooOOO0.OooOOOO("viewPager");
            throw null;
        }
        viewPager22.setUserInputEnabled(false);
        TabLayout tabLayout = this.f78659Oooo00O;
        if (tabLayout == null) {
            OooOOO0.OooOOOO("tabLayout");
            throw null;
        }
        ViewPager2 viewPager23 = this.f78660Oooo00o;
        if (viewPager23 == null) {
            OooOOO0.OooOOOO("viewPager");
            throw null;
        }
        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayout, viewPager23, new TabLayoutMediator.TabConfigurationStrategy() { // from class: o0o0OOO.Oooo000
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                kotlin.jvm.internal.OooOOO0.OooO0oO(tab, "tab");
                PaperConfigDialogFragment paperConfigDialogFragment = this.f108885OooOo0o;
                if (i == 0) {
                    tab.setText(paperConfigDialogFragment.getString(R.string.standard_template));
                } else {
                    if (i != 1) {
                        return;
                    }
                    tab.setText(paperConfigDialogFragment.getString(R.string.my_template));
                }
            }
        });
        this.f78661Oooo0O0 = tabLayoutMediator;
        tabLayoutMediator.attach();
        ViewPager2 viewPager24 = this.f78660Oooo00o;
        if (viewPager24 == null) {
            OooOOO0.OooOOOO("viewPager");
            throw null;
        }
        viewPager24.OooO00o(new C30495Oooo0O0(this));
        TextView textView = (TextView) view.findViewById(R.id.toolbar_title);
        View viewFindViewById = view.findViewById(R.id.cl_title_input_container);
        com.orion.notein.p607ui.paperconfig.OooO00o oooO00o = this.f78658Oooo000;
        if (oooO00o == null) {
            OooOOO0.OooOOOO("strategy");
            throw null;
        }
        if (oooO00o.OooO0o0()) {
            if (textView != null) {
                textView.setVisibility(8);
            }
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(0);
            }
            View viewFindViewById2 = view.findViewById(R.id.cl_title_input_container);
            final EditText editText = (EditText) view.findViewById(R.id.toolbar_title_input);
            TextView textView2 = (TextView) view.findViewById(R.id.toolbar_title_text);
            View view2 = getView();
            if (view2 != null && (viewTreeObserver = view2.getViewTreeObserver()) != null) {
                viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC30499Oooo0oO(this));
            }
            if (editText != null) {
                if (viewFindViewById2 != null) {
                    viewFindViewById2.setOnClickListener(new ViewOnClickListenerC26024OooOOo0(2, this, editText));
                }
                editText.addTextChangedListener(new C30497Oooo0o(this));
                editText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: o0o0OOO.OooOoo
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view3, boolean z) {
                        C30520o000000o c30520o000000oOooOoo = this.f108873OooO00o.OooOoo();
                        Boolean boolValueOf = Boolean.valueOf(z);
                        C33781o00o0O c33781o00o0O = c30520o000000oOooOoo.f109039OoooO00;
                        c33781o00o0O.getClass();
                        c33781o00o0O.OooOO0(null, boolValueOf);
                        if (z) {
                            return;
                        }
                        editText.setSelection(0);
                    }
                });
                editText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: o0o0OOO.OooOooO
                    @Override // android.widget.TextView.OnEditorActionListener
                    public final boolean onEditorAction(TextView textView3, int i, KeyEvent keyEvent) {
                        if (i != 6) {
                            return false;
                        }
                        EditText editText2 = editText;
                        editText2.clearFocus();
                        C28048OooO00o.OooO00o(editText2);
                        return true;
                    }
                });
                InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
                OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C30498Oooo0o0(this, editText, textView2, null), 3);
            }
        } else {
            if (textView != null) {
                com.orion.notein.p607ui.paperconfig.OooO00o oooO00o2 = this.f78658Oooo000;
                if (oooO00o2 == null) {
                    OooOOO0.OooOOOO("strategy");
                    throw null;
                }
                Context contextRequireContext = requireContext();
                OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                textView.setText(oooO00o2.OooO0o(contextRequireContext));
            }
            if (textView != null) {
                textView.setVisibility(0);
            }
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(8);
            }
        }
        com.orion.notein.p607ui.paperconfig.OooO00o oooO00o3 = this.f78658Oooo000;
        if (oooO00o3 == null) {
            OooOOO0.OooOOOO("strategy");
            throw null;
        }
        oooO00o3.OooO00o(view);
        View viewFindViewById3 = view.findViewById(R.id.btn_confirm);
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(new o000oOoO(this, 2));
        }
        View viewFindViewById4 = view.findViewById(R.id.btn_close);
        if (viewFindViewById4 != null) {
            viewFindViewById4.setOnClickListener(new ViewOnClickListenerC26348o000oOoO(this, 3));
        }
        InterfaceC21987OooOoo viewLifecycleOwner2 = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner2), null, null, new o0o0OOO.Oooo0(this, viewFindViewById3, null), 3);
        C21904OooOoo0.OooO0oO(this, "get_pdf_path", new InterfaceC32508OooOOOo() { // from class: o0o0OOO.OooOooo
            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(Object obj, Object obj2) {
                Bundle bundle2 = (Bundle) obj2;
                kotlin.jvm.internal.OooOOO0.OooO0oO((String) obj, "<unused var>");
                kotlin.jvm.internal.OooOOO0.OooO0oO(bundle2, "bundle");
                this.f108877OooOo0o.getChildFragmentManager().OooooOo(bundle2, "pdf_path_selected");
                return C32460OooOooO.f116667OooO00o;
            }
        });
        C21904OooOoo0.OooO0oO(this, "add_pdf_page", new C28225OooO0O0(this, 1));
        InterfaceC21987OooOoo viewLifecycleOwner3 = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner3), null, null, new C30493Oooo00O(this, null), 3);
    }
}
