package com.orion.notein.p607ui.creative_library;

import OooOoOO.C20519OooO0Oo;
import Oooo0oO.C21030OooOO0o;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
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
import com.aspose.slides.internal.p332p7.C22238OooO0oO;
import com.aspose.words.StyleIdentifier;
import com.orion.notein.domain.models.material.DownloadState;
import com.orion.notein.domain.models.material.MaterialActionType;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.creative_library.C23033OooOO0o;
import com.orion.notein.p607ui.creative_library.C23040OooOOoo;
import com.orion.notein.p607ui.creative_library.C23044OooOo0o;
import com.orion.notein.p607ui.creative_library.CreativeLibrarySearchFragment;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import kotlin.jvm.internal.Oooo0;
import o0000OOo.C24217OooO0O0;
import o000o00.AbstractC24555OooO00o;
import o00o00O0.C25252OooO0Oo;
import o00oo0Oo.C25686OooO0O0;
import o0OO00o0.o000Oo0;
import o0Oo0oOo.C28348OoooO0;
import o0Oo0oOo.C28350OoooO0O;
import o0Oo0oOo.ViewOnClickListenerC28343Oooo0o;
import o0o00Oo.C29895OooO0O0;
import oO00ooO.C32460OooOooO;
import oO00ooO.EnumC32441OooOO0O;
import oO00ooO.InterfaceC32440OooOO0;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O00oo.OooO;
import oO0o0OO.C33609OooO0oo;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m80612d2 = {"Lcom/orion/notein/ui/creative_library/CreativeLibrarySearchFragment;", "Lcom/orion/notein/ui/widget/EdgeFragment;", "<init>", "()V", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class CreativeLibrarySearchFragment extends Hilt_CreativeLibrarySearchFragment {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final C22026ooOO f70877OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public C25686OooO0O0 f70878OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public com.orion.notein.p607ui.creative_library.OooO00o f70879OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public GridLayoutManager f70880OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public C29895OooO0O0 f70881Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public int f70882Oooo00O;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public static final OooO00o f70883OooOoO;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public static final OooO00o f70884OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public static final OooO00o f70885OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public static final OooO00o f70886OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public static final /* synthetic */ OooO00o[] f70887OooOooO;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final int f70888OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final int f70889OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final OooO f70890OooOoO0;

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
                com.orion.notein.ui.creative_library.CreativeLibrarySearchFragment$OooO00o r0 = new com.orion.notein.ui.creative_library.CreativeLibrarySearchFragment$OooO00o
                oO0O00oo.OooO r5 = new oO0O00oo.OooO
                r6 = 16
                r7 = 1
                r5.<init>(r6, r6, r7)
                r3 = 1
                r4 = 16
                java.lang.String r1 = "XS"
                r2 = 0
                r0.<init>(r1, r2, r3, r4, r5)
                com.orion.notein.ui.creative_library.CreativeLibrarySearchFragment.OooO00o.f70883OooOoO = r0
                com.orion.notein.ui.creative_library.CreativeLibrarySearchFragment$OooO00o r8 = new com.orion.notein.ui.creative_library.CreativeLibrarySearchFragment$OooO00o
                oO0O00oo.OooO r13 = new oO0O00oo.OooO
                r1 = 24
                r13.<init>(r6, r1, r7)
                r11 = 2
                r12 = 16
                java.lang.String r9 = "S"
                r10 = 1
                r8.<init>(r9, r10, r11, r12, r13)
                com.orion.notein.ui.creative_library.CreativeLibrarySearchFragment.OooO00o.f70884OooOoOO = r8
                com.orion.notein.ui.creative_library.CreativeLibrarySearchFragment$OooO00o r9 = new com.orion.notein.ui.creative_library.CreativeLibrarySearchFragment$OooO00o
                oO0O00oo.OooO r14 = new oO0O00oo.OooO
                r2 = 32
                r14.<init>(r1, r2, r7)
                r12 = 3
                r13 = 16
                java.lang.String r10 = "M"
                r11 = 2
                r9.<init>(r10, r11, r12, r13, r14)
                com.orion.notein.ui.creative_library.CreativeLibrarySearchFragment.OooO00o.f70886OooOoo0 = r9
                com.orion.notein.ui.creative_library.CreativeLibrarySearchFragment$OooO00o r10 = new com.orion.notein.ui.creative_library.CreativeLibrarySearchFragment$OooO00o
                oO0O00oo.OooO r15 = new oO0O00oo.OooO
                r1 = 40
                r15.<init>(r2, r1, r7)
                r13 = 4
                r14 = 24
                java.lang.String r11 = "L"
                r12 = 3
                r10.<init>(r11, r12, r13, r14, r15)
                com.orion.notein.ui.creative_library.CreativeLibrarySearchFragment.OooO00o.f70885OooOoo = r10
                com.orion.notein.ui.creative_library.CreativeLibrarySearchFragment$OooO00o[] r0 = new com.orion.notein.ui.creative_library.CreativeLibrarySearchFragment.OooO00o[]{r0, r8, r9, r10}
                com.orion.notein.ui.creative_library.CreativeLibrarySearchFragment.OooO00o.f70887OooOooO = r0
                java.lang.Object.<init>()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.orion.notein.ui.creative_library.CreativeLibrarySearchFragment.OooO00o.<clinit>():void");
        }

        public OooO00o(String str, int i, int i2, int i3, OooO oooO) {
            this.f70889OooOo0o = i2;
            this.f70888OooOo = i3;
            this.f70890OooOoO0 = oooO;
        }

        public static OooO00o valueOf(String str) {
            return (OooO00o) Enum.valueOf(OooO00o.class, str);
        }

        public static OooO00o[] values() {
            return (OooO00o[]) f70887OooOooO.clone();
        }
    }

    public static final class OooO0O0 extends OooOOOO implements oO0O000o.OooO00o<Bundle> {
        public OooO0O0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Bundle invoke() {
            CreativeLibrarySearchFragment creativeLibrarySearchFragment = CreativeLibrarySearchFragment.this;
            Bundle arguments = creativeLibrarySearchFragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + creativeLibrarySearchFragment + " has null arguments");
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public OooO0OO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return CreativeLibrarySearchFragment.this;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.creative_library.CreativeLibrarySearchFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23020OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ OooO0OO f70893OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23020OooO0Oo(OooO0OO oooO0OO) {
            super(0);
            this.f70893OooOo0o = oooO0OO;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f70893OooOo0o.invoke();
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f70894OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f70894OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f70894OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.creative_library.CreativeLibrarySearchFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23021OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f70895OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23021OooO0o0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f70895OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f70895OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.creative_library.CreativeLibrarySearchFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class C23022OooO0oO extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f70896OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23022OooO0oO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f70896OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f70896OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? CreativeLibrarySearchFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public CreativeLibrarySearchFragment() {
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        oooo0.OooO0O0(C28350OoooO0O.class);
        new OooO0O0();
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, new C23020OooO0Oo(new OooO0OO()));
        this.f70877OooOoo = new C22026ooOO(oooo0.OooO0O0(C23040OooOOoo.class), new C23021OooO0o0(interfaceC32440OooOO0OooO0O0), new C23022OooO0oO(interfaceC32440OooOO0OooO0O0), new OooO0o(interfaceC32440OooOO0OooO0O0));
        this.f70882Oooo00O = -1;
    }

    public final C23040OooOOoo OooOoOO() {
        return (C23040OooOOoo) this.f70877OooOoo.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_creative_library_search, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f70881Oooo000 = null;
        this.f70882Oooo00O = -1;
        this.f70878OooOoo0 = null;
    }

    @Override // com.orion.notein.p607ui.widget.EdgeFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        int i = R.id.btn_cancel;
        TextView textView = (TextView) C24217OooO0O0.OooO0O0(R.id.btn_cancel, view);
        if (textView != null) {
            i = R.id.empty_hint;
            TextView textView2 = (TextView) C24217OooO0O0.OooO0O0(R.id.empty_hint, view);
            if (textView2 != null) {
                i = R.id.progress_bar;
                ProgressBar progressBar = (ProgressBar) C24217OooO0O0.OooO0O0(R.id.progress_bar, view);
                if (progressBar != null) {
                    i = R.id.recycler_view;
                    RecyclerView recyclerView = (RecyclerView) C24217OooO0O0.OooO0O0(R.id.recycler_view, view);
                    if (recyclerView != null) {
                        i = R.id.search_bar;
                        if (((ConstraintLayout) C24217OooO0O0.OooO0O0(R.id.search_bar, view)) != null) {
                            i = R.id.search_view;
                            SearchView searchView = (SearchView) C24217OooO0O0.OooO0O0(R.id.search_view, view);
                            if (searchView != null) {
                                this.f70878OooOoo0 = new C25686OooO0O0(textView, textView2, progressBar, recyclerView, searchView);
                                searchView.setOnQueryTextListener(new C28348OoooO0(this));
                                C25686OooO0O0 c25686OooO0O0 = this.f70878OooOoo0;
                                OooOOO0.OooO0Oo(c25686OooO0O0);
                                ((SearchView) c25686OooO0O0.f87639OooO0o0).requestFocus();
                                C25686OooO0O0 c25686OooO0O02 = this.f70878OooOoo0;
                                OooOOO0.OooO0Oo(c25686OooO0O02);
                                ((TextView) c25686OooO0O02.f87635OooO00o).setOnClickListener(new ViewOnClickListenerC28343Oooo0o(this, 0));
                                this.f70879OooOooO = new com.orion.notein.p607ui.creative_library.OooO00o(new InterfaceC32507OooOO0o() { // from class: o0Oo0oOo.Oooo0oO
                                    @Override // oO0O000o.InterfaceC32507OooOO0o
                                    public final Object invoke(Object obj) {
                                        C23033OooOO0o.OooO00o item = (C23033OooOO0o.OooO00o) obj;
                                        kotlin.jvm.internal.OooOOO0.OooO0oO(item, "item");
                                        String materialId = item.f71088OooO00o;
                                        kotlin.jvm.internal.OooOOO0.OooO0oO(materialId, "materialId");
                                        C21030OooOO0o.OooO0OO(this.f100501OooOo0o).OooOOOO(new C28347OoooO(materialId));
                                        return C32460OooOooO.f116667OooO00o;
                                    }
                                }, new InterfaceC32507OooOO0o() { // from class: o0Oo0oOo.Oooo0oo
                                    @Override // oO0O000o.InterfaceC32507OooOO0o
                                    public final Object invoke(Object obj) {
                                        Object next;
                                        C23033OooOO0o.OooO00o item = (C23033OooOO0o.OooO00o) obj;
                                        kotlin.jvm.internal.OooOOO0.OooO0oO(item, "item");
                                        C23040OooOOoo c23040OooOOooOooOoOO = this.f100502OooOo0o.OooOoOO();
                                        String materialId = item.f71088OooO00o;
                                        kotlin.jvm.internal.OooOOO0.OooO0oO(materialId, "materialId");
                                        Iterator<T> it = ((C23040OooOOoo.OooO0O0) c23040OooOOooOooOoOO.f71150OooOO0o.getValue()).f71159OooO0O0.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                next = null;
                                                break;
                                            }
                                            next = it.next();
                                            if (kotlin.jvm.internal.OooOOO0.OooO0O0(((C23033OooOO0o.OooO00o) next).f71088OooO00o, materialId)) {
                                                break;
                                            }
                                        }
                                        C23033OooOO0o.OooO00o oooO00o = (C23033OooOO0o.OooO00o) next;
                                        if (oooO00o == null) {
                                            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                                            c20358OooO00o.OooOOO0("CreativeLibrarySearchVM");
                                            c20358OooO00o.OooOO0O("Material not found: ".concat(materialId), new Object[0]);
                                        } else {
                                            if (oooO00o.f71094OooO0oO == MaterialActionType.GO_TO_CREATE) {
                                                C33609OooO0oo.OooO0OO(androidx.lifecycle.o0OoOo0.OooO00o(c23040OooOOooOooOoOO), null, null, new C23044OooOo0o(c23040OooOOooOooOoOO, materialId, null), 3);
                                            } else if (oooO00o.f71098OooOO0o) {
                                                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                                                StringBuilder sbOooO0O0 = C22238OooO0oO.OooO0O0(c20358OooO00o2, "CreativeLibrarySearchVM", "Material already applied: ");
                                                sbOooO0O0.append(oooO00o.f71089OooO0O0);
                                                c20358OooO00o2.OooO00o(sbOooO0O0.toString(), new Object[0]);
                                            } else {
                                                if (oooO00o.f71096OooOO0 == DownloadState.DOWNLOADED) {
                                                    C33609OooO0oo.OooO0OO(androidx.lifecycle.o0OoOo0.OooO00o(c23040OooOOooOooOoOO), null, null, new com.orion.notein.p607ui.creative_library.OooOo00(c23040OooOOooOooOoOO, materialId, null), 3);
                                                } else {
                                                    C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                                                    c20358OooO00o3.OooOOO0("CreativeLibrarySearchVM");
                                                    c20358OooO00o3.OooO00o("Downloading material: ".concat(materialId), new Object[0]);
                                                    C25252OooO0Oo.OooOo0o(new o000Oo0(c23040OooOOooOooOoOO.f71146OooO0oO.OooO00o(materialId), new C28352OoooOOO(c23040OooOOooOooOoOO, materialId, null), 1), androidx.lifecycle.o0OoOo0.OooO00o(c23040OooOOooOooOoOO));
                                                }
                                            }
                                        }
                                        return C32460OooOooO.f116667OooO00o;
                                    }
                                });
                                this.f70880OooOooo = new GridLayoutManager(requireContext(), 3);
                                C25686OooO0O0 c25686OooO0O03 = this.f70878OooOoo0;
                                OooOOO0.OooO0Oo(c25686OooO0O03);
                                GridLayoutManager gridLayoutManager = this.f70880OooOooo;
                                if (gridLayoutManager == null) {
                                    OooOOO0.OooOOOO("gridLayoutManager");
                                    throw null;
                                }
                                ((RecyclerView) c25686OooO0O03.f87638OooO0Oo).setLayoutManager(gridLayoutManager);
                                C25686OooO0O0 c25686OooO0O04 = this.f70878OooOoo0;
                                OooOOO0.OooO0Oo(c25686OooO0O04);
                                com.orion.notein.p607ui.creative_library.OooO00o oooO00o = this.f70879OooOooO;
                                if (oooO00o == null) {
                                    OooOOO0.OooOOOO("adapter");
                                    throw null;
                                }
                                ((RecyclerView) c25686OooO0O04.f87638OooO0Oo).setAdapter(oooO00o);
                                C25686OooO0O0 c25686OooO0O05 = this.f70878OooOoo0;
                                OooOOO0.OooO0Oo(c25686OooO0O05);
                                ((RecyclerView) c25686OooO0O05.f87638OooO0Oo).addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: o0Oo0oOo.Oooo
                                    @Override // android.view.View.OnLayoutChangeListener
                                    public final void onLayoutChange(View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                                        int i10 = i4 - i2;
                                        if (i10 > 0) {
                                            CreativeLibrarySearchFragment creativeLibrarySearchFragment = this.f100473OooOo0o;
                                            if (i10 != creativeLibrarySearchFragment.f70882Oooo00O || creativeLibrarySearchFragment.f70881Oooo000 == null) {
                                                creativeLibrarySearchFragment.f70882Oooo00O = i10;
                                                float f = creativeLibrarySearchFragment.getResources().getDisplayMetrics().density;
                                                int i11 = (int) (StyleIdentifier.SUBTLE_EMPHASIS * f);
                                                int i12 = (int) (420 * f);
                                                CreativeLibrarySearchFragment.OooO00o oooO00o2 = i10 < ((int) (((float) 480) * f)) ? CreativeLibrarySearchFragment.OooO00o.f70883OooOoO : i10 < ((int) (((float) 840) * f)) ? CreativeLibrarySearchFragment.OooO00o.f70884OooOoOO : i10 < ((int) (((float) 1200) * f)) ? CreativeLibrarySearchFragment.OooO00o.f70886OooOoo0 : CreativeLibrarySearchFragment.OooO00o.f70885OooOoo;
                                                int i13 = oooO00o2.f70889OooOo0o;
                                                int i14 = (int) (oooO00o2.f70888OooOo * f);
                                                int i15 = oooO00o2.f70890OooOoO0.f116812OooOo0o;
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
                                                C25686OooO0O0 c25686OooO0O06 = creativeLibrarySearchFragment.f70878OooOoo0;
                                                kotlin.jvm.internal.OooOOO0.OooO0Oo(c25686OooO0O06);
                                                ((RecyclerView) c25686OooO0O06.f87638OooO0Oo).setPadding(i16, i14, i16, i14);
                                                GridLayoutManager gridLayoutManager2 = creativeLibrarySearchFragment.f70880OooOooo;
                                                if (gridLayoutManager2 == null) {
                                                    kotlin.jvm.internal.OooOOO0.OooOOOO("gridLayoutManager");
                                                    throw null;
                                                }
                                                if (gridLayoutManager2.f65751OooOo != i13) {
                                                    gridLayoutManager2.OooO0oo(i13);
                                                }
                                                C29895OooO0O0 c29895OooO0O0 = creativeLibrarySearchFragment.f70881Oooo000;
                                                if (c29895OooO0O0 != null) {
                                                    C25686OooO0O0 c25686OooO0O07 = creativeLibrarySearchFragment.f70878OooOoo0;
                                                    kotlin.jvm.internal.OooOOO0.OooO0Oo(c25686OooO0O07);
                                                    ((RecyclerView) c25686OooO0O07.f87638OooO0Oo).removeItemDecoration(c29895OooO0O0);
                                                }
                                                creativeLibrarySearchFragment.f70881Oooo000 = new C29895OooO0O0(i13, i14);
                                                C25686OooO0O0 c25686OooO0O08 = creativeLibrarySearchFragment.f70878OooOoo0;
                                                kotlin.jvm.internal.OooOOO0.OooO0Oo(c25686OooO0O08);
                                                C29895OooO0O0 c29895OooO0O02 = creativeLibrarySearchFragment.f70881Oooo000;
                                                kotlin.jvm.internal.OooOOO0.OooO0Oo(c29895OooO0O02);
                                                ((RecyclerView) c25686OooO0O08.f87638OooO0Oo).addItemDecoration(c29895OooO0O02);
                                            }
                                        }
                                    }
                                });
                                InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
                                OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C23039OooOOo0(this, null), 3);
                                InterfaceC21987OooOoo viewLifecycleOwner2 = getViewLifecycleOwner();
                                OooOOO0.OooO0o(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
                                C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner2), null, null, new C23038OooOOo(this, null), 3);
                                return;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
