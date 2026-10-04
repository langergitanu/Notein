package com.orion.notein.p607ui.creative_library;

import OooOoOO.C20519OooO0Oo;
import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00Oo0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.aspose.words.StyleIdentifier;
import com.google.android.material.tabs.TabLayout;
import com.orion.notein.domain.models.material.MaterialCategory;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.creative_library.C23033OooOO0o;
import com.orion.notein.p607ui.creative_library.CreativeLibraryListFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o0000OOo.C24217OooO0O0;
import o000o00.AbstractC24555OooO00o;
import o0Oo.ViewOnClickListenerC28012OooO0O0;
import o0Oo0oOo.C28329OooOoO;
import o0Oo0oOo.C28333OooOoo0;
import o0Oo0oOo.C28335OooOooo;
import o0Oo0oOo.C28338Oooo000;
import o0Oo0oOo.ViewOnClickListenerC28324OooOo;
import o0Oo0oOo.ViewOnClickListenerC28330OooOoO0;
import o0o00Oo.C29895OooO0O0;
import oO00ooO.C32460OooOooO;
import oO00ooO.EnumC32441OooOO0O;
import oO00ooO.InterfaceC32440OooOO0;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O00oo.OooO;
import oO0o0OO.C33609OooO0oo;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m80612d2 = {"Lcom/orion/notein/ui/creative_library/CreativeLibraryListFragment;", "Lcom/orion/notein/ui/widget/EdgeFragment;", "<init>", "()V", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class CreativeLibraryListFragment extends Hilt_CreativeLibraryListFragment {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final C22026ooOO f70857OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public o0OOOoO.OooO0OO f70858OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public com.orion.notein.p607ui.creative_library.OooO00o f70859OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public C29895OooO0O0 f70860OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public GridLayoutManager f70861Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public int f70862Oooo00O;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final OooO00o f70863OooOoO;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public static final OooO00o f70864OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public static final OooO00o f70865OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public static final OooO00o f70866OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public static final /* synthetic */ OooO00o[] f70867OooOooO;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final int f70868OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final int f70869OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final OooO f70870OooOoO0;

        /*  JADX ERROR: IllegalArgumentException in pass: ConstructorVisitor
            java.lang.IllegalArgumentException: Illegal Capacity: -1
            	at java.base/java.util.ArrayList.<init>(ArrayList.java:160)
            	at jadx.core.dex.nodes.InsnNode.<init>(InsnNode.java:36)
            	at jadx.core.dex.instructions.BaseInvokeNode.<init>(BaseInvokeNode.java:11)
            	at jadx.core.dex.instructions.mods.ConstructorInsn.<init>(ConstructorInsn.java:32)
            	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:76)
            	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
            	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
            */
        static {
            /*
                com.orion.notein.ui.creative_library.CreativeLibraryListFragment$OooO00o r0 = new com.orion.notein.ui.creative_library.CreativeLibraryListFragment$OooO00o
                oO0O00oo.OooO r5 = new oO0O00oo.OooO
                r6 = 16
                r7 = 1
                r5.<init>(r6, r6, r7)
                r3 = 1
                r4 = 16
                java.lang.String r1 = "XS"
                r2 = 0
                r0.<init>(r1, r2, r3, r4, r5)
                com.orion.notein.ui.creative_library.CreativeLibraryListFragment.OooO00o.f70863OooOoO = r0
                com.orion.notein.ui.creative_library.CreativeLibraryListFragment$OooO00o r8 = new com.orion.notein.ui.creative_library.CreativeLibraryListFragment$OooO00o
                oO0O00oo.OooO r13 = new oO0O00oo.OooO
                r1 = 24
                r13.<init>(r6, r1, r7)
                r11 = 2
                r12 = 16
                java.lang.String r9 = "S"
                r10 = 1
                r8.<init>(r9, r10, r11, r12, r13)
                com.orion.notein.ui.creative_library.CreativeLibraryListFragment.OooO00o.f70864OooOoOO = r8
                com.orion.notein.ui.creative_library.CreativeLibraryListFragment$OooO00o r9 = new com.orion.notein.ui.creative_library.CreativeLibraryListFragment$OooO00o
                oO0O00oo.OooO r14 = new oO0O00oo.OooO
                r2 = 32
                r14.<init>(r1, r2, r7)
                r12 = 3
                r13 = 16
                java.lang.String r10 = "M"
                r11 = 2
                r9.<init>(r10, r11, r12, r13, r14)
                com.orion.notein.ui.creative_library.CreativeLibraryListFragment.OooO00o.f70866OooOoo0 = r9
                com.orion.notein.ui.creative_library.CreativeLibraryListFragment$OooO00o r10 = new com.orion.notein.ui.creative_library.CreativeLibraryListFragment$OooO00o
                oO0O00oo.OooO r15 = new oO0O00oo.OooO
                r1 = 40
                r15.<init>(r2, r1, r7)
                r13 = 4
                r14 = 24
                java.lang.String r11 = "L"
                r12 = 3
                r10.<init>(r11, r12, r13, r14, r15)
                com.orion.notein.ui.creative_library.CreativeLibraryListFragment.OooO00o.f70865OooOoo = r10
                com.orion.notein.ui.creative_library.CreativeLibraryListFragment$OooO00o[] r0 = new com.orion.notein.ui.creative_library.CreativeLibraryListFragment.OooO00o[]{r0, r8, r9, r10}
                com.orion.notein.ui.creative_library.CreativeLibraryListFragment.OooO00o.f70867OooOooO = r0
                java.lang.Object.<init>()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.orion.notein.ui.creative_library.CreativeLibraryListFragment.OooO00o.<clinit>():void");
        }

        public OooO00o(String str, int i, int i2, int i3, OooO oooO) {
            this.f70869OooOo0o = i2;
            this.f70868OooOo = i3;
            this.f70870OooOoO0 = oooO;
        }

        public static OooO00o valueOf(String str) {
            return (OooO00o) Enum.valueOf(OooO00o.class, str);
        }

        public static OooO00o[] values() {
            return (OooO00o[]) f70867OooOooO.clone();
        }
    }

    public static final class OooO0O0 extends OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public OooO0O0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return CreativeLibraryListFragment.this;
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ OooO0O0 f70872OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(OooO0O0 oooO0O0) {
            super(0);
            this.f70872OooOo0o = oooO0O0;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f70872OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.creative_library.CreativeLibraryListFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23018OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f70873OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23018OooO0Oo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f70873OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f70873OooOo0o.getValue()).getViewModelStore();
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f70874OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f70874OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f70874OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? CreativeLibraryListFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.creative_library.CreativeLibraryListFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23019OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f70876OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23019OooO0o0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f70876OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f70876OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    public CreativeLibraryListFragment() {
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, new OooO0OO(new OooO0O0()));
        this.f70857OooOoo = new C22026ooOO(C24035Oooo00o.f80943OooO00o.OooO0O0(C23033OooOO0o.class), new C23018OooO0Oo(interfaceC32440OooOO0OooO0O0), new OooO0o(interfaceC32440OooOO0OooO0O0), new C23019OooO0o0(interfaceC32440OooOO0OooO0O0));
        this.f70862Oooo00O = -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final MaterialCategory OooOoOO(CreativeLibraryListFragment creativeLibraryListFragment, TabLayout.Tab tab) {
        if (tab != null) {
            return (MaterialCategory) OooOo.OoooO00(tab.getPosition(), ((C23033OooOO0o.OooO0OO) creativeLibraryListFragment.OooOoo().f71085OooOOO.f121747OooOo0o.getValue()).f71104OooO00o);
        }
        return null;
    }

    public static final int OooOoo0(int i, int i2, int i3, int i4) {
        return ((i - (i4 * 2)) - ((i3 - 1) * i2)) / i3;
    }

    public static void OooOooO(TabLayout.Tab tab, boolean z) {
        View customView;
        TextView textView;
        if (tab == null || (customView = tab.getCustomView()) == null || (textView = (TextView) customView.findViewById(R.id.tabTitle)) == null) {
            return;
        }
        Context context = textView.getContext();
        int color = context.getColor(R.color.notein_accent_blue);
        int color2 = context.getColor(R.color.item_text_name_color);
        if (!z) {
            color = color2;
        }
        textView.setTextColor(color);
    }

    public final C23033OooOO0o OooOoo() {
        return (C23033OooOO0o) this.f70857OooOoo.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_creative_library_list, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f70860OooOooo = null;
        this.f70862Oooo00O = -1;
        this.f70858OooOoo0 = null;
    }

    @Override // com.orion.notein.p607ui.widget.EdgeFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        int i = R.id.back_button;
        ImageView imageView = (ImageView) C24217OooO0O0.OooO0O0(R.id.back_button, view);
        if (imageView != null) {
            i = R.id.categoryTabs;
            TabLayout tabLayout = (TabLayout) C24217OooO0O0.OooO0O0(R.id.categoryTabs, view);
            if (tabLayout != null) {
                i = R.id.creativeRecyclerView;
                RecyclerView recyclerView = (RecyclerView) C24217OooO0O0.OooO0O0(R.id.creativeRecyclerView, view);
                if (recyclerView != null) {
                    i = R.id.download_button;
                    ImageView imageView2 = (ImageView) C24217OooO0O0.OooO0O0(R.id.download_button, view);
                    if (imageView2 != null) {
                        i = R.id.search_button;
                        ImageView imageView3 = (ImageView) C24217OooO0O0.OooO0O0(R.id.search_button, view);
                        if (imageView3 != null) {
                            i = R.id.swipeRefresh;
                            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) C24217OooO0O0.OooO0O0(R.id.swipeRefresh, view);
                            if (swipeRefreshLayout != null) {
                                i = R.id.title;
                                if (((TextView) C24217OooO0O0.OooO0O0(R.id.title, view)) != null) {
                                    i = R.id.toolbar_container;
                                    if (((ConstraintLayout) C24217OooO0O0.OooO0O0(R.id.toolbar_container, view)) != null) {
                                        this.f70858OooOoo0 = new o0OOOoO.OooO0OO(imageView, tabLayout, recyclerView, imageView2, imageView3, swipeRefreshLayout);
                                        imageView.setOnClickListener(new ViewOnClickListenerC28324OooOo(this, 0));
                                        o0OOOoO.OooO0OO oooO0OO = this.f70858OooOoo0;
                                        OooOOO0.OooO0Oo(oooO0OO);
                                        oooO0OO.f94938OooO0OO.setOnClickListener(new ViewOnClickListenerC28330OooOoO0(this, 0));
                                        o0OOOoO.OooO0OO oooO0OO2 = this.f70858OooOoo0;
                                        OooOOO0.OooO0Oo(oooO0OO2);
                                        oooO0OO2.f94939OooO0Oo.setOnClickListener(new ViewOnClickListenerC28012OooO0O0(this, 1));
                                        o0OOOoO.OooO0OO oooO0OO3 = this.f70858OooOoo0;
                                        OooOOO0.OooO0Oo(oooO0OO3);
                                        oooO0OO3.f94936OooO00o.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C28338Oooo000(this));
                                        this.f70859OooOooO = new com.orion.notein.p607ui.creative_library.OooO00o(new InterfaceC32507OooOO0o() { // from class: o0Oo0oOo.OooOoOO
                                            @Override // oO0O000o.InterfaceC32507OooOO0o
                                            public final Object invoke(Object obj) {
                                                C23033OooOO0o.OooO00o item = (C23033OooOO0o.OooO00o) obj;
                                                kotlin.jvm.internal.OooOOO0.OooO0oO(item, "item");
                                                String materialId = item.f71088OooO00o;
                                                kotlin.jvm.internal.OooOOO0.OooO0oO(materialId, "materialId");
                                                C21030OooOO0o.OooO0OO(this.f100466OooOo0o).OooOOOO(new C28339Oooo00O(materialId));
                                                return C32460OooOooO.f116667OooO00o;
                                            }
                                        }, new C28333OooOoo0(this, 0));
                                        this.f70861Oooo000 = new GridLayoutManager(requireContext(), 3);
                                        o0OOOoO.OooO0OO oooO0OO4 = this.f70858OooOoo0;
                                        OooOOO0.OooO0Oo(oooO0OO4);
                                        GridLayoutManager gridLayoutManager = this.f70861Oooo000;
                                        if (gridLayoutManager == null) {
                                            OooOOO0.OooOOOO("gridLayoutManager");
                                            throw null;
                                        }
                                        oooO0OO4.f94937OooO0O0.setLayoutManager(gridLayoutManager);
                                        o0OOOoO.OooO0OO oooO0OO5 = this.f70858OooOoo0;
                                        OooOOO0.OooO0Oo(oooO0OO5);
                                        com.orion.notein.p607ui.creative_library.OooO00o oooO00o = this.f70859OooOooO;
                                        if (oooO00o == null) {
                                            OooOOO0.OooOOOO("adapter");
                                            throw null;
                                        }
                                        oooO0OO5.f94937OooO0O0.setAdapter(oooO00o);
                                        o0OOOoO.OooO0OO oooO0OO6 = this.f70858OooOoo0;
                                        OooOOO0.OooO0Oo(oooO0OO6);
                                        oooO0OO6.f94937OooO0O0.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: o0Oo0oOo.OooOoo
                                            @Override // android.view.View.OnLayoutChangeListener
                                            public final void onLayoutChange(View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                                                int i10 = i4 - i2;
                                                if (i10 > 0) {
                                                    CreativeLibraryListFragment creativeLibraryListFragment = this.f100467OooOo0o;
                                                    if (i10 != creativeLibraryListFragment.f70862Oooo00O || creativeLibraryListFragment.f70860OooOooo == null) {
                                                        creativeLibraryListFragment.f70862Oooo00O = i10;
                                                        float f = creativeLibraryListFragment.getResources().getDisplayMetrics().density;
                                                        int i11 = (int) (StyleIdentifier.SUBTLE_EMPHASIS * f);
                                                        int i12 = (int) (420 * f);
                                                        CreativeLibraryListFragment.OooO00o oooO00o2 = i10 < ((int) (((float) 480) * f)) ? CreativeLibraryListFragment.OooO00o.f70863OooOoO : i10 < ((int) (((float) 840) * f)) ? CreativeLibraryListFragment.OooO00o.f70864OooOoOO : i10 < ((int) (((float) 1200) * f)) ? CreativeLibraryListFragment.OooO00o.f70866OooOoo0 : CreativeLibraryListFragment.OooO00o.f70865OooOoo;
                                                        int i13 = oooO00o2.f70869OooOo0o;
                                                        int i14 = (int) (oooO00o2.f70868OooOo * f);
                                                        int i15 = oooO00o2.f70870OooOoO0.f116812OooOo0o;
                                                        int i16 = (int) (i15 * f);
                                                        int iOooOoo0 = CreativeLibraryListFragment.OooOoo0(i10, i14, i13, i16);
                                                        while (iOooOoo0 < i11 && i13 > 1) {
                                                            i13--;
                                                            iOooOoo0 = CreativeLibraryListFragment.OooOoo0(i10, i14, i13, i16);
                                                        }
                                                        if (iOooOoo0 > i12) {
                                                            i16 = (int) (r9.f116811OooOo * f);
                                                            iOooOoo0 = CreativeLibraryListFragment.OooOoo0(i10, i14, i13, i16);
                                                        }
                                                        if (iOooOoo0 > i12 && i13 < 4) {
                                                            i13++;
                                                            i16 = (int) (i15 * f);
                                                            CreativeLibraryListFragment.OooOoo0(i10, i14, i13, i16);
                                                        }
                                                        o0OOOoO.OooO0OO oooO0OO7 = creativeLibraryListFragment.f70858OooOoo0;
                                                        kotlin.jvm.internal.OooOOO0.OooO0Oo(oooO0OO7);
                                                        oooO0OO7.f94937OooO0O0.setPadding(i16, i14, i16, i14);
                                                        GridLayoutManager gridLayoutManager2 = creativeLibraryListFragment.f70861Oooo000;
                                                        if (gridLayoutManager2 == null) {
                                                            kotlin.jvm.internal.OooOOO0.OooOOOO("gridLayoutManager");
                                                            throw null;
                                                        }
                                                        if (gridLayoutManager2.f65751OooOo != i13) {
                                                            gridLayoutManager2.OooO0oo(i13);
                                                        }
                                                        C29895OooO0O0 c29895OooO0O0 = creativeLibraryListFragment.f70860OooOooo;
                                                        if (c29895OooO0O0 != null) {
                                                            o0OOOoO.OooO0OO oooO0OO8 = creativeLibraryListFragment.f70858OooOoo0;
                                                            kotlin.jvm.internal.OooOOO0.OooO0Oo(oooO0OO8);
                                                            oooO0OO8.f94937OooO0O0.removeItemDecoration(c29895OooO0O0);
                                                        }
                                                        creativeLibraryListFragment.f70860OooOooo = new C29895OooO0O0(i13, i14);
                                                        o0OOOoO.OooO0OO oooO0OO9 = creativeLibraryListFragment.f70858OooOoo0;
                                                        kotlin.jvm.internal.OooOOO0.OooO0Oo(oooO0OO9);
                                                        C29895OooO0O0 c29895OooO0O02 = creativeLibraryListFragment.f70860OooOooo;
                                                        kotlin.jvm.internal.OooOOO0.OooO0Oo(c29895OooO0O02);
                                                        oooO0OO9.f94937OooO0O0.addItemDecoration(c29895OooO0O02);
                                                    }
                                                }
                                            }
                                        });
                                        o0OOOoO.OooO0OO oooO0OO7 = this.f70858OooOoo0;
                                        OooOOO0.OooO0Oo(oooO0OO7);
                                        oooO0OO7.f94937OooO0O0.addOnScrollListener(new C28335OooOooo(this));
                                        o0OOOoO.OooO0OO oooO0OO8 = this.f70858OooOoo0;
                                        OooOOO0.OooO0Oo(oooO0OO8);
                                        oooO0OO8.f94940OooO0o0.setOnRefreshListener(new C28329OooOoO(this));
                                        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
                                        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                                        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooOO0(this, null), 3);
                                        InterfaceC21987OooOoo viewLifecycleOwner2 = getViewLifecycleOwner();
                                        OooOOO0.OooO0o(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
                                        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner2), null, null, new OooOO0O(this, null), 3);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
