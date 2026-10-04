package com.orion.notein.p607ui.creative_library;

import OooOoOO.C20519OooO0Oo;
import Oooo0oO.C21030OooOO0o;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
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
import com.aspose.words.StyleIdentifier;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.creative_library.C23033OooOO0o;
import com.orion.notein.p607ui.creative_library.CreatorProfileFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import kotlin.jvm.internal.Oooo0;
import o0000OOo.C24217OooO0O0;
import o000o00.AbstractC24555OooO00o;
import o000o0O0.C24568OooO0oO;
import o0OOOoO.C27188OooO0Oo;
import o0Oo0oOo.C28361OooooOo;
import o0Oo0oOo.C28362Oooooo;
import o0Oo0oOo.C28364OoooooO;
import o0Oo0oOo.ViewOnClickListenerC28359OooooO0;
import o0o00Oo.C29895OooO0O0;
import oO00ooO.C32460OooOooO;
import oO00ooO.EnumC32441OooOO0O;
import oO00ooO.InterfaceC32440OooOO0;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O00oo.OooO;
import oO0o0OO.C33609OooO0oo;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m80612d2 = {"Lcom/orion/notein/ui/creative_library/CreatorProfileFragment;", "Lcom/orion/notein/ui/widget/EdgeFragment;", "<init>", "()V", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class CreatorProfileFragment extends Hilt_CreatorProfileFragment {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final C24568OooO0oO f70898OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public C27188OooO0Oo f70899OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final C22026ooOO f70900OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public com.orion.notein.p607ui.creative_library.OooO00o f70901OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public GridLayoutManager f70902Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public C29895OooO0O0 f70903Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public int f70904Oooo00o;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final OooO00o f70905OooOoO;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public static final OooO00o f70906OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public static final OooO00o f70907OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public static final OooO00o f70908OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public static final /* synthetic */ OooO00o[] f70909OooOooO;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final int f70910OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final int f70911OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final OooO f70912OooOoO0;

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
                com.orion.notein.ui.creative_library.CreatorProfileFragment$OooO00o r0 = new com.orion.notein.ui.creative_library.CreatorProfileFragment$OooO00o
                oO0O00oo.OooO r5 = new oO0O00oo.OooO
                r6 = 16
                r7 = 1
                r5.<init>(r6, r6, r7)
                r3 = 1
                r4 = 16
                java.lang.String r1 = "XS"
                r2 = 0
                r0.<init>(r1, r2, r3, r4, r5)
                com.orion.notein.ui.creative_library.CreatorProfileFragment.OooO00o.f70905OooOoO = r0
                com.orion.notein.ui.creative_library.CreatorProfileFragment$OooO00o r8 = new com.orion.notein.ui.creative_library.CreatorProfileFragment$OooO00o
                oO0O00oo.OooO r13 = new oO0O00oo.OooO
                r1 = 24
                r13.<init>(r6, r1, r7)
                r11 = 2
                r12 = 16
                java.lang.String r9 = "S"
                r10 = 1
                r8.<init>(r9, r10, r11, r12, r13)
                com.orion.notein.ui.creative_library.CreatorProfileFragment.OooO00o.f70906OooOoOO = r8
                com.orion.notein.ui.creative_library.CreatorProfileFragment$OooO00o r9 = new com.orion.notein.ui.creative_library.CreatorProfileFragment$OooO00o
                oO0O00oo.OooO r14 = new oO0O00oo.OooO
                r2 = 32
                r14.<init>(r1, r2, r7)
                r12 = 3
                r13 = 16
                java.lang.String r10 = "M"
                r11 = 2
                r9.<init>(r10, r11, r12, r13, r14)
                com.orion.notein.ui.creative_library.CreatorProfileFragment.OooO00o.f70908OooOoo0 = r9
                com.orion.notein.ui.creative_library.CreatorProfileFragment$OooO00o r10 = new com.orion.notein.ui.creative_library.CreatorProfileFragment$OooO00o
                oO0O00oo.OooO r15 = new oO0O00oo.OooO
                r1 = 40
                r15.<init>(r2, r1, r7)
                r13 = 4
                r14 = 24
                java.lang.String r11 = "L"
                r12 = 3
                r10.<init>(r11, r12, r13, r14, r15)
                com.orion.notein.ui.creative_library.CreatorProfileFragment.OooO00o.f70907OooOoo = r10
                com.orion.notein.ui.creative_library.CreatorProfileFragment$OooO00o[] r0 = new com.orion.notein.ui.creative_library.CreatorProfileFragment.OooO00o[]{r0, r8, r9, r10}
                com.orion.notein.ui.creative_library.CreatorProfileFragment.OooO00o.f70909OooOooO = r0
                java.lang.Object.<init>()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.orion.notein.ui.creative_library.CreatorProfileFragment.OooO00o.<clinit>():void");
        }

        public OooO00o(String str, int i, int i2, int i3, OooO oooO) {
            this.f70911OooOo0o = i2;
            this.f70910OooOo = i3;
            this.f70912OooOoO0 = oooO;
        }

        public static OooO00o valueOf(String str) {
            return (OooO00o) Enum.valueOf(OooO00o.class, str);
        }

        public static OooO00o[] values() {
            return (OooO00o[]) f70909OooOooO.clone();
        }
    }

    public static final class OooO0O0 extends OooOOOO implements oO0O000o.OooO00o<Bundle> {
        public OooO0O0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Bundle invoke() {
            CreatorProfileFragment creatorProfileFragment = CreatorProfileFragment.this;
            Bundle arguments = creatorProfileFragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + creatorProfileFragment + " has null arguments");
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public OooO0OO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return CreatorProfileFragment.this;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.creative_library.CreatorProfileFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23023OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ OooO0OO f70915OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23023OooO0Oo(OooO0OO oooO0OO) {
            super(0);
            this.f70915OooOo0o = oooO0OO;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f70915OooOo0o.invoke();
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f70916OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f70916OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f70916OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.creative_library.CreatorProfileFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23024OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f70917OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23024OooO0o0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f70917OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f70917OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.creative_library.CreatorProfileFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class C23025OooO0oO extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f70918OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23025OooO0oO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f70918OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f70918OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? CreatorProfileFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public CreatorProfileFragment() {
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f70898OooOoo = new C24568OooO0oO(oooo0.OooO0O0(C28364OoooooO.class), new OooO0O0());
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, new C23023OooO0Oo(new OooO0OO()));
        this.f70900OooOooO = new C22026ooOO(oooo0.OooO0O0(C23047OooOoOO.class), new C23024OooO0o0(interfaceC32440OooOO0OooO0O0), new C23025OooO0oO(interfaceC32440OooOO0OooO0O0), new OooO0o(interfaceC32440OooOO0OooO0O0));
        this.f70904Oooo00o = -1;
    }

    public final C23047OooOoOO OooOoOO() {
        return (C23047OooOoOO) this.f70900OooOooO.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_creator_profile, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f70903Oooo00O = null;
        this.f70904Oooo00o = -1;
        this.f70899OooOoo0 = null;
    }

    @Override // com.orion.notein.p607ui.widget.EdgeFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        int i = R.id.btn_back;
        ImageView imageView = (ImageView) C24217OooO0O0.OooO0O0(R.id.btn_back, view);
        if (imageView != null) {
            i = R.id.divider;
            View viewOooO0O0 = C24217OooO0O0.OooO0O0(R.id.divider, view);
            if (viewOooO0O0 != null) {
                i = R.id.header_container;
                if (((ConstraintLayout) C24217OooO0O0.OooO0O0(R.id.header_container, view)) != null) {
                    i = R.id.iv_avatar;
                    if (((ImageView) C24217OooO0O0.OooO0O0(R.id.iv_avatar, view)) != null) {
                        i = R.id.materials_recycler_view;
                        RecyclerView recyclerView = (RecyclerView) C24217OooO0O0.OooO0O0(R.id.materials_recycler_view, view);
                        if (recyclerView != null) {
                            i = R.id.progress_bar;
                            if (((ProgressBar) C24217OooO0O0.OooO0O0(R.id.progress_bar, view)) != null) {
                                i = R.id.top_bar;
                                if (((ConstraintLayout) C24217OooO0O0.OooO0O0(R.id.top_bar, view)) != null) {
                                    i = R.id.tv_creator_desc;
                                    TextView textView = (TextView) C24217OooO0O0.OooO0O0(R.id.tv_creator_desc, view);
                                    if (textView != null) {
                                        i = R.id.tv_creator_name;
                                        TextView textView2 = (TextView) C24217OooO0O0.OooO0O0(R.id.tv_creator_name, view);
                                        if (textView2 != null) {
                                            i = R.id.tv_empty;
                                            if (((TextView) C24217OooO0O0.OooO0O0(R.id.tv_empty, view)) != null) {
                                                i = R.id.tv_material_count;
                                                TextView textView3 = (TextView) C24217OooO0O0.OooO0O0(R.id.tv_material_count, view);
                                                if (textView3 != null) {
                                                    i = R.id.tv_title;
                                                    if (((TextView) C24217OooO0O0.OooO0O0(R.id.tv_title, view)) != null) {
                                                        this.f70899OooOoo0 = new C27188OooO0Oo(imageView, viewOooO0O0, recyclerView, textView, textView2, textView3);
                                                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                                                        c20358OooO00o.OooOOO0("CreatorProfileFragment");
                                                        c20358OooO00o.OooO00o("onViewCreated: creatorId=".concat(((C28364OoooooO) this.f70898OooOoo.getValue()).f100545OooO00o), new Object[0]);
                                                        C27188OooO0Oo c27188OooO0Oo = this.f70899OooOoo0;
                                                        OooOOO0.OooO0Oo(c27188OooO0Oo);
                                                        c27188OooO0Oo.f94941OooO00o.setOnClickListener(new ViewOnClickListenerC28359OooooO0(this, 0));
                                                        this.f70901OooOooo = new com.orion.notein.p607ui.creative_library.OooO00o(new InterfaceC32507OooOO0o() { // from class: o0Oo0oOo.OooooOO
                                                            @Override // oO0O000o.InterfaceC32507OooOO0o
                                                            public final Object invoke(Object obj) {
                                                                C23033OooOO0o.OooO00o item = (C23033OooOO0o.OooO00o) obj;
                                                                kotlin.jvm.internal.OooOOO0.OooO0oO(item, "item");
                                                                String materialId = item.f71088OooO00o;
                                                                kotlin.jvm.internal.OooOOO0.OooO0oO(materialId, "materialId");
                                                                C21030OooOO0o.OooO0OO(this.f100540OooOo0o).OooOOOO(new C28365Ooooooo(materialId));
                                                                return C32460OooOooO.f116667OooO00o;
                                                            }
                                                        }, new C28361OooooOo(this, 0));
                                                        this.f70902Oooo000 = new GridLayoutManager(requireContext(), 3);
                                                        C27188OooO0Oo c27188OooO0Oo2 = this.f70899OooOoo0;
                                                        OooOOO0.OooO0Oo(c27188OooO0Oo2);
                                                        GridLayoutManager gridLayoutManager = this.f70902Oooo000;
                                                        if (gridLayoutManager == null) {
                                                            OooOOO0.OooOOOO("gridLayoutManager");
                                                            throw null;
                                                        }
                                                        c27188OooO0Oo2.f94943OooO0OO.setLayoutManager(gridLayoutManager);
                                                        C27188OooO0Oo c27188OooO0Oo3 = this.f70899OooOoo0;
                                                        OooOOO0.OooO0Oo(c27188OooO0Oo3);
                                                        com.orion.notein.p607ui.creative_library.OooO00o oooO00o = this.f70901OooOooo;
                                                        if (oooO00o == null) {
                                                            OooOOO0.OooOOOO("adapter");
                                                            throw null;
                                                        }
                                                        c27188OooO0Oo3.f94943OooO0OO.setAdapter(oooO00o);
                                                        C27188OooO0Oo c27188OooO0Oo4 = this.f70899OooOoo0;
                                                        OooOOO0.OooO0Oo(c27188OooO0Oo4);
                                                        c27188OooO0Oo4.f94943OooO0OO.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: o0Oo0oOo.Oooooo0
                                                            @Override // android.view.View.OnLayoutChangeListener
                                                            public final void onLayoutChange(View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                                                                int i10 = i4 - i2;
                                                                if (i10 > 0) {
                                                                    CreatorProfileFragment creatorProfileFragment = this.f100544OooOo0o;
                                                                    if (i10 != creatorProfileFragment.f70904Oooo00o || creatorProfileFragment.f70903Oooo00O == null) {
                                                                        creatorProfileFragment.f70904Oooo00o = i10;
                                                                        float f = creatorProfileFragment.getResources().getDisplayMetrics().density;
                                                                        int i11 = (int) (StyleIdentifier.SUBTLE_EMPHASIS * f);
                                                                        int i12 = (int) (420 * f);
                                                                        CreatorProfileFragment.OooO00o oooO00o2 = i10 < ((int) (((float) 480) * f)) ? CreatorProfileFragment.OooO00o.f70905OooOoO : i10 < ((int) (((float) 840) * f)) ? CreatorProfileFragment.OooO00o.f70906OooOoOO : i10 < ((int) (((float) 1200) * f)) ? CreatorProfileFragment.OooO00o.f70908OooOoo0 : CreatorProfileFragment.OooO00o.f70907OooOoo;
                                                                        int i13 = oooO00o2.f70911OooOo0o;
                                                                        int i14 = (int) (oooO00o2.f70910OooOo * f);
                                                                        int i15 = oooO00o2.f70912OooOoO0.f116812OooOo0o;
                                                                        int i16 = (int) (i15 * f);
                                                                        int i17 = i10 - (i16 * 2);
                                                                        int i18 = (i17 - ((i13 - 1) * i14)) / i13;
                                                                        while (i18 < i11 && i13 > 1) {
                                                                            int i19 = i13 - 1;
                                                                            i18 = (i17 - ((i13 - 2) * i14)) / i19;
                                                                            i13 = i19;
                                                                        }
                                                                        if (i18 > i12) {
                                                                            i16 = (int) (r11.f116811OooOo * f);
                                                                            i18 = ((i10 - (i16 * 2)) - ((i13 - 1) * i14)) / i13;
                                                                        }
                                                                        if (i18 > i12 && i13 < 4) {
                                                                            i13++;
                                                                            i16 = (int) (i15 * f);
                                                                        }
                                                                        C27188OooO0Oo c27188OooO0Oo5 = creatorProfileFragment.f70899OooOoo0;
                                                                        kotlin.jvm.internal.OooOOO0.OooO0Oo(c27188OooO0Oo5);
                                                                        c27188OooO0Oo5.f94943OooO0OO.setPadding(i16, i14, i16, i14);
                                                                        GridLayoutManager gridLayoutManager2 = creatorProfileFragment.f70902Oooo000;
                                                                        if (gridLayoutManager2 == null) {
                                                                            kotlin.jvm.internal.OooOOO0.OooOOOO("gridLayoutManager");
                                                                            throw null;
                                                                        }
                                                                        if (gridLayoutManager2.f65751OooOo != i13) {
                                                                            gridLayoutManager2.OooO0oo(i13);
                                                                        }
                                                                        C29895OooO0O0 c29895OooO0O0 = creatorProfileFragment.f70903Oooo00O;
                                                                        if (c29895OooO0O0 != null) {
                                                                            C27188OooO0Oo c27188OooO0Oo6 = creatorProfileFragment.f70899OooOoo0;
                                                                            kotlin.jvm.internal.OooOOO0.OooO0Oo(c27188OooO0Oo6);
                                                                            c27188OooO0Oo6.f94943OooO0OO.removeItemDecoration(c29895OooO0O0);
                                                                        }
                                                                        creatorProfileFragment.f70903Oooo00O = new C29895OooO0O0(i13, i14);
                                                                        C27188OooO0Oo c27188OooO0Oo7 = creatorProfileFragment.f70899OooOoo0;
                                                                        kotlin.jvm.internal.OooOOO0.OooO0Oo(c27188OooO0Oo7);
                                                                        C29895OooO0O0 c29895OooO0O02 = creatorProfileFragment.f70903Oooo00O;
                                                                        kotlin.jvm.internal.OooOOO0.OooO0Oo(c29895OooO0O02);
                                                                        c27188OooO0Oo7.f94943OooO0OO.addItemDecoration(c29895OooO0O02);
                                                                    }
                                                                }
                                                            }
                                                        });
                                                        C27188OooO0Oo c27188OooO0Oo5 = this.f70899OooOoo0;
                                                        OooOOO0.OooO0Oo(c27188OooO0Oo5);
                                                        c27188OooO0Oo5.f94943OooO0OO.addOnScrollListener(new C28362Oooooo(this));
                                                        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
                                                        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                                                        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C23046OooOoO0(this, null), 3);
                                                        InterfaceC21987OooOoo viewLifecycleOwner2 = getViewLifecycleOwner();
                                                        OooOOO0.OooO0o(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
                                                        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner2), null, null, new C23045OooOoO(this, null), 3);
                                                        return;
                                                    }
                                                }
                                            }
                                        }
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
