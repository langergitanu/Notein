package com.orion.notein.p607ui.wizard;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.o00Oo0;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.orion.notein.global.R;
import kotlin.Metadata;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o000o00.AbstractC24555OooO00o;
import o0O0oooO.C26320o0000OoO;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0o00.ViewOnClickListenerC28155OooO0oo;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/wizard/WizardFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class WizardFragment extends Fragment {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public TabLayout f80182OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C22026ooOO f80183OooOo0o = new C22026ooOO(C24035Oooo00o.f80943OooO00o.OooO0O0(C26320o0000OoO.class), new OooO00o(), new OooO0OO(), new OooO0O0());

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public o0oo0000.OooO00o f80184OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public ViewPager2 f80185OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public View f80186OooOoOO;

    public static final class OooO00o extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public OooO00o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return WizardFragment.this.requireActivity().getViewModelStore();
        }
    }

    public static final class OooO0O0 extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public OooO0O0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return WizardFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public OooO0OO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return WizardFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        OooOOO0.OooO0oO(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        o0oo0000.OooO00o oooO00o = this.f80184OooOoO;
        if (oooO00o != null) {
            oooO00o.notifyDataSetChanged();
        } else {
            OooOOO0.OooOOOO("adapter");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_wizard, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        this.f80182OooOo = (TabLayout) view.findViewById(R.id.tl_page);
        this.f80185OooOoO0 = (ViewPager2) view.findViewById(R.id.vp_page);
        o0oo0000.OooO00o oooO00o = new o0oo0000.OooO00o(C34429OooOOo0.OooOO0o("write", "sketch", "annotate"));
        this.f80184OooOoO = oooO00o;
        ViewPager2 viewPager2 = this.f80185OooOoO0;
        if (viewPager2 == null) {
            OooOOO0.OooOOOO("viewPager");
            throw null;
        }
        viewPager2.setAdapter(oooO00o);
        TabLayout tabLayout = this.f80182OooOo;
        if (tabLayout == null) {
            OooOOO0.OooOOOO("tabLayout");
            throw null;
        }
        ViewPager2 viewPager22 = this.f80185OooOoO0;
        if (viewPager22 == null) {
            OooOOO0.OooOOOO("viewPager");
            throw null;
        }
        new TabLayoutMediator(tabLayout, viewPager22, new com.aspose.slides.internal.p472w8.OooO00o()).attach();
        View viewFindViewById = view.findViewById(R.id.fab_next);
        this.f80186OooOoOO = viewFindViewById;
        if (viewFindViewById != null) {
            C28050OooO0OO.OooO00o(viewFindViewById, 500L, new ViewOnClickListenerC28155OooO0oo(this, 8));
        } else {
            OooOOO0.OooOOOO("btnNext");
            throw null;
        }
    }
}
