package com.orion.notein.p607ui.creative_library;

import OooOoOO.C20519OooO0Oo;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
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
import com.orion.notein.p607ui.creative_library.DownloadedMaterialListFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.C24038Oooo0o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o0000OOo.C24217OooO0O0;
import o000o00.AbstractC24555OooO00o;
import o0OOOoO.C27189OooO0o0;
import o0Oo0oOo.C28374o00ooo;
import o0Oo0oOo.C28376o0ooOoO;
import o0Oo0oOo.ViewOnClickListenerC28375o0ooOO0;
import o0Oo0oOo.o00oO0O;
import o0Oo0oOo.o0ooOOo;
import o0Oo0oOo.oo000o;
import o0o00Oo.C29895OooO0O0;
import oO00ooO.C32443OooOOO;
import oO00ooO.EnumC32441OooOO0O;
import oO00ooO.InterfaceC32440OooOO0;
import oO0O00oo.OooO;
import oO0o0OO.C33609OooO0oo;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m80612d2 = {"Lcom/orion/notein/ui/creative_library/DownloadedMaterialListFragment;", "Lcom/orion/notein/ui/widget/EdgeFragment;", "<init>", "()V", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class DownloadedMaterialListFragment extends Hilt_DownloadedMaterialListFragment {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final C22026ooOO f70920OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public C27189OooO0o0 f70921OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public com.orion.notein.p607ui.creative_library.OooO00o f70922OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public GridLayoutManager f70923OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public C29895OooO0O0 f70924Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public int f70925Oooo00O;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final OooO00o f70926OooOoO;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public static final OooO00o f70927OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public static final OooO00o f70928OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public static final OooO00o f70929OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public static final /* synthetic */ OooO00o[] f70930OooOooO;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final int f70931OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final int f70932OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final OooO f70933OooOoO0;

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
                com.orion.notein.ui.creative_library.DownloadedMaterialListFragment$OooO00o r0 = new com.orion.notein.ui.creative_library.DownloadedMaterialListFragment$OooO00o
                oO0O00oo.OooO r5 = new oO0O00oo.OooO
                r6 = 16
                r7 = 1
                r5.<init>(r6, r6, r7)
                r3 = 1
                r4 = 16
                java.lang.String r1 = "XS"
                r2 = 0
                r0.<init>(r1, r2, r3, r4, r5)
                com.orion.notein.ui.creative_library.DownloadedMaterialListFragment.OooO00o.f70926OooOoO = r0
                com.orion.notein.ui.creative_library.DownloadedMaterialListFragment$OooO00o r8 = new com.orion.notein.ui.creative_library.DownloadedMaterialListFragment$OooO00o
                oO0O00oo.OooO r13 = new oO0O00oo.OooO
                r1 = 24
                r13.<init>(r6, r1, r7)
                r11 = 2
                r12 = 16
                java.lang.String r9 = "S"
                r10 = 1
                r8.<init>(r9, r10, r11, r12, r13)
                com.orion.notein.ui.creative_library.DownloadedMaterialListFragment.OooO00o.f70927OooOoOO = r8
                com.orion.notein.ui.creative_library.DownloadedMaterialListFragment$OooO00o r9 = new com.orion.notein.ui.creative_library.DownloadedMaterialListFragment$OooO00o
                oO0O00oo.OooO r14 = new oO0O00oo.OooO
                r2 = 32
                r14.<init>(r1, r2, r7)
                r12 = 3
                r13 = 16
                java.lang.String r10 = "M"
                r11 = 2
                r9.<init>(r10, r11, r12, r13, r14)
                com.orion.notein.ui.creative_library.DownloadedMaterialListFragment.OooO00o.f70929OooOoo0 = r9
                com.orion.notein.ui.creative_library.DownloadedMaterialListFragment$OooO00o r10 = new com.orion.notein.ui.creative_library.DownloadedMaterialListFragment$OooO00o
                oO0O00oo.OooO r15 = new oO0O00oo.OooO
                r1 = 40
                r15.<init>(r2, r1, r7)
                r13 = 4
                r14 = 24
                java.lang.String r11 = "L"
                r12 = 3
                r10.<init>(r11, r12, r13, r14, r15)
                com.orion.notein.ui.creative_library.DownloadedMaterialListFragment.OooO00o.f70928OooOoo = r10
                com.orion.notein.ui.creative_library.DownloadedMaterialListFragment$OooO00o[] r0 = new com.orion.notein.ui.creative_library.DownloadedMaterialListFragment.OooO00o[]{r0, r8, r9, r10}
                com.orion.notein.ui.creative_library.DownloadedMaterialListFragment.OooO00o.f70930OooOooO = r0
                java.lang.Object.<init>()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.orion.notein.ui.creative_library.DownloadedMaterialListFragment.OooO00o.<clinit>():void");
        }

        public OooO00o(String str, int i, int i2, int i3, OooO oooO) {
            this.f70932OooOo0o = i2;
            this.f70931OooOo = i3;
            this.f70933OooOoO0 = oooO;
        }

        public static OooO00o valueOf(String str) {
            return (OooO00o) Enum.valueOf(OooO00o.class, str);
        }

        public static OooO00o[] values() {
            return (OooO00o[]) f70930OooOooO.clone();
        }
    }

    public static final class OooO0O0 extends OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public OooO0O0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return DownloadedMaterialListFragment.this;
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ OooO0O0 f70935OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(OooO0O0 oooO0O0) {
            super(0);
            this.f70935OooOo0o = oooO0O0;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f70935OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.creative_library.DownloadedMaterialListFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23026OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f70936OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23026OooO0Oo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f70936OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f70936OooOo0o.getValue()).getViewModelStore();
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f70937OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f70937OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f70937OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? DownloadedMaterialListFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.creative_library.DownloadedMaterialListFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23027OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f70939OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23027OooO0o0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f70939OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f70939OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    public DownloadedMaterialListFragment() {
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, new OooO0OO(new OooO0O0()));
        this.f70920OooOoo = new C22026ooOO(C24035Oooo00o.f80943OooO00o.OooO0O0(Oooo0.class), new C23026OooO0Oo(interfaceC32440OooOO0OooO0O0), new OooO0o(interfaceC32440OooOO0OooO0O0), new C23027OooO0o0(interfaceC32440OooOO0OooO0O0));
        this.f70925Oooo00O = -1;
    }

    public final void OooOoOO(String materialId, String materialTitle) {
        OooOOO0.OooO0oO(materialId, "materialId");
        OooOOO0.OooO0oO(materialTitle, "materialTitle");
        DeleteMaterialConfirmDialogFragment deleteMaterialConfirmDialogFragment = new DeleteMaterialConfirmDialogFragment();
        deleteMaterialConfirmDialogFragment.setArguments(BundleKt.bundleOf(new C32443OooOOO("arg_material_id", materialId), new C32443OooOOO("arg_material_title", materialTitle)));
        deleteMaterialConfirmDialogFragment.show(getChildFragmentManager(), "DeleteMaterialConfirmDialog");
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_downloaded_material_list, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f70924Oooo000 = null;
        this.f70925Oooo00O = -1;
        this.f70921OooOoo0 = null;
    }

    @Override // com.orion.notein.p607ui.widget.EdgeFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        int i = R.id.back_button;
        ImageView imageView = (ImageView) C24217OooO0O0.OooO0O0(R.id.back_button, view);
        if (imageView != null) {
            i = R.id.recycler_view;
            RecyclerView recyclerView = (RecyclerView) C24217OooO0O0.OooO0O0(R.id.recycler_view, view);
            if (recyclerView != null) {
                i = R.id.search_button;
                ImageView imageView2 = (ImageView) C24217OooO0O0.OooO0O0(R.id.search_button, view);
                if (imageView2 != null) {
                    i = R.id.title;
                    if (((TextView) C24217OooO0O0.OooO0O0(R.id.title, view)) != null) {
                        i = R.id.toolbar_container;
                        if (((ConstraintLayout) C24217OooO0O0.OooO0O0(R.id.toolbar_container, view)) != null) {
                            this.f70921OooOoo0 = new C27189OooO0o0(imageView, recyclerView, imageView2);
                            imageView.setOnClickListener(new o00oO0O(this, 0));
                            C27189OooO0o0 c27189OooO0o0 = this.f70921OooOoo0;
                            OooOOO0.OooO0Oo(c27189OooO0o0);
                            c27189OooO0o0.f94956OooO0O0.setOnClickListener(new ViewOnClickListenerC28375o0ooOO0(this, 0));
                            com.orion.notein.p607ui.creative_library.OooO00o oooO00o = new com.orion.notein.p607ui.creative_library.OooO00o(new C24038Oooo0o(this, 1), new C28374o00ooo(this, 0));
                            this.f70922OooOooO = oooO00o;
                            oooO00o.f70984OooO0Oo = new oo000o(this);
                            this.f70923OooOooo = new GridLayoutManager(requireContext(), 3);
                            C27189OooO0o0 c27189OooO0o02 = this.f70921OooOoo0;
                            OooOOO0.OooO0Oo(c27189OooO0o02);
                            GridLayoutManager gridLayoutManager = this.f70923OooOooo;
                            if (gridLayoutManager == null) {
                                OooOOO0.OooOOOO("gridLayoutManager");
                                throw null;
                            }
                            c27189OooO0o02.f94955OooO00o.setLayoutManager(gridLayoutManager);
                            C27189OooO0o0 c27189OooO0o03 = this.f70921OooOoo0;
                            OooOOO0.OooO0Oo(c27189OooO0o03);
                            com.orion.notein.p607ui.creative_library.OooO00o oooO00o2 = this.f70922OooOooO;
                            if (oooO00o2 == null) {
                                OooOOO0.OooOOOO("adapter");
                                throw null;
                            }
                            c27189OooO0o03.f94955OooO00o.setAdapter(oooO00o2);
                            C27189OooO0o0 c27189OooO0o04 = this.f70921OooOoo0;
                            OooOOO0.OooO0Oo(c27189OooO0o04);
                            c27189OooO0o04.f94955OooO00o.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: o0Oo0oOo.o00oO0o
                                @Override // android.view.View.OnLayoutChangeListener
                                public final void onLayoutChange(View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                                    int i10 = i4 - i2;
                                    if (i10 > 0) {
                                        DownloadedMaterialListFragment downloadedMaterialListFragment = this.f100597OooOo0o;
                                        if (i10 != downloadedMaterialListFragment.f70925Oooo00O || downloadedMaterialListFragment.f70924Oooo000 == null) {
                                            downloadedMaterialListFragment.f70925Oooo00O = i10;
                                            float f = downloadedMaterialListFragment.getResources().getDisplayMetrics().density;
                                            int i11 = (int) (StyleIdentifier.SUBTLE_EMPHASIS * f);
                                            int i12 = (int) (420 * f);
                                            DownloadedMaterialListFragment.OooO00o oooO00o3 = i10 < ((int) (((float) 480) * f)) ? DownloadedMaterialListFragment.OooO00o.f70926OooOoO : i10 < ((int) (((float) 840) * f)) ? DownloadedMaterialListFragment.OooO00o.f70927OooOoOO : i10 < ((int) (((float) 1200) * f)) ? DownloadedMaterialListFragment.OooO00o.f70929OooOoo0 : DownloadedMaterialListFragment.OooO00o.f70928OooOoo;
                                            int i13 = oooO00o3.f70932OooOo0o;
                                            int i14 = (int) (oooO00o3.f70931OooOo * f);
                                            int i15 = oooO00o3.f70933OooOoO0.f116812OooOo0o;
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
                                            C27189OooO0o0 c27189OooO0o05 = downloadedMaterialListFragment.f70921OooOoo0;
                                            kotlin.jvm.internal.OooOOO0.OooO0Oo(c27189OooO0o05);
                                            c27189OooO0o05.f94955OooO00o.setPadding(i16, i14, i16, i14);
                                            GridLayoutManager gridLayoutManager2 = downloadedMaterialListFragment.f70923OooOooo;
                                            if (gridLayoutManager2 == null) {
                                                kotlin.jvm.internal.OooOOO0.OooOOOO("gridLayoutManager");
                                                throw null;
                                            }
                                            if (gridLayoutManager2.f65751OooOo != i13) {
                                                gridLayoutManager2.OooO0oo(i13);
                                            }
                                            C29895OooO0O0 c29895OooO0O0 = downloadedMaterialListFragment.f70924Oooo000;
                                            if (c29895OooO0O0 != null) {
                                                C27189OooO0o0 c27189OooO0o06 = downloadedMaterialListFragment.f70921OooOoo0;
                                                kotlin.jvm.internal.OooOOO0.OooO0Oo(c27189OooO0o06);
                                                c27189OooO0o06.f94955OooO00o.removeItemDecoration(c29895OooO0O0);
                                            }
                                            downloadedMaterialListFragment.f70924Oooo000 = new C29895OooO0O0(i13, i14);
                                            C27189OooO0o0 c27189OooO0o07 = downloadedMaterialListFragment.f70921OooOoo0;
                                            kotlin.jvm.internal.OooOOO0.OooO0Oo(c27189OooO0o07);
                                            C29895OooO0O0 c29895OooO0O02 = downloadedMaterialListFragment.f70924Oooo000;
                                            kotlin.jvm.internal.OooOOO0.OooO0Oo(c29895OooO0O02);
                                            c27189OooO0o07.f94955OooO00o.addItemDecoration(c29895OooO0O02);
                                        }
                                    }
                                }
                            });
                            getChildFragmentManager().Oooooo0("delete_material", getViewLifecycleOwner(), new o0ooOOo(this));
                            getChildFragmentManager().Oooooo0("show_delete_confirm", getViewLifecycleOwner(), new C28376o0ooOoO(this, 0));
                            InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
                            OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                            C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C23053Oooo00O(this, null), 3);
                            InterfaceC21987OooOoo viewLifecycleOwner2 = getViewLifecycleOwner();
                            OooOOO0.OooO0o(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
                            C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner2), null, null, new C23054Oooo00o(this, null), 3);
                            return;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
