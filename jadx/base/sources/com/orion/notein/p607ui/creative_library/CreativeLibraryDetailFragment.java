package com.orion.notein.p607ui.creative_library;

import OooO0Oo.RunnableC20408OooOOOo;
import OooOoOO.C20519OooO0Oo;
import OooOooo.C20785Oooo00o;
import Oooo0oO.C21023OooO0Oo;
import Ooooo00.OooOOO;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00Oo0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.aspose.slides.internal.p332p7.C22238OooO0oO;
import com.orion.niui.components.button.TextButtonView;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.creative_library.C23059Oooo0oO;
import com.orion.notein.p607ui.creative_library.CreativeLibraryDetailFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import kotlin.jvm.internal.Oooo0;
import o0000OOo.C24217OooO0O0;
import o000o00.AbstractC24555OooO00o;
import o000o0O0.C24568OooO0oO;
import o0Oo0oOo.C28313OooO0oo;
import o0Oo0oOo.C28315OooOO0O;
import o0Oo0oOo.C28319OooOOOO;
import o0Oo0oOo.C28320OooOOOo;
import o0Oo0oOo.C28322OooOOo0;
import o0Oo0oOo.ViewOnClickListenerC28305OooO;
import o0Oo0oOo.ViewOnClickListenerC28314OooOO0;
import o0Oo0oOo.ViewOnClickListenerC28316OooOO0o;
import o0Oo0oOo.ViewOnClickListenerC28318OooOOO0;
import o0Oo0oOo.ViewOnLayoutChangeListenerC28310OooO0o;
import oO00ooO.EnumC32441OooOO0O;
import oO00ooO.InterfaceC32440OooOO0;
import oO0o0OO.C33609OooO0oo;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m80612d2 = {"Lcom/orion/notein/ui/creative_library/CreativeLibraryDetailFragment;", "Lcom/orion/notein/ui/widget/EdgeFragment;", "<init>", "()V", "OooO0O0", "OooO00o", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class CreativeLibraryDetailFragment extends Hilt_CreativeLibraryDetailFragment {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final C22026ooOO f70834OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public o0OOOoO.OooO0O0 f70835OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final C24568OooO0oO f70836OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public OooOo f70837OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public OooO0O0 f70838Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public C23059Oooo0oO f70839Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public OooO00o f70840Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public OooO00o f70841Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public boolean f70842Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public final ViewOnLayoutChangeListenerC28310OooO0o f70843Oooo0OO;

    public static final class OooO00o extends RecyclerView.OooOOO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f70844OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f70845OooO0O0;

        public OooO00o(int i, int i2) {
            this.f70844OooO00o = i;
            this.f70845OooO0O0 = i2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OooOOO
        public final void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.C22075OooOoOO state) {
            RecyclerView.AbstractC22062OooO0oO adapter;
            OooOOO0.OooO0oO(outRect, "outRect");
            OooOOO0.OooO0oO(view, "view");
            OooOOO0.OooO0oO(parent, "parent");
            OooOOO0.OooO0oO(state, "state");
            int childAdapterPosition = parent.getChildAdapterPosition(view);
            if (childAdapterPosition == -1 || (adapter = parent.getAdapter()) == null) {
                return;
            }
            int itemCount = adapter.getItemCount();
            int i = this.f70844OooO00o / 2;
            int i2 = this.f70845OooO0O0;
            outRect.left = childAdapterPosition == 0 ? i2 : i;
            if (childAdapterPosition == itemCount - 1) {
                i = i2;
            }
            outRect.right = i;
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f70846OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f70847OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final int f70848OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final int f70849OooO0Oo;

        public OooO0O0(int i, int i2, int i3, int i4) {
            this.f70846OooO00o = i;
            this.f70847OooO0O0 = i2;
            this.f70848OooO0OO = i3;
            this.f70849OooO0Oo = i4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0O0)) {
                return false;
            }
            OooO0O0 oooO0O0 = (OooO0O0) obj;
            return this.f70846OooO00o == oooO0O0.f70846OooO00o && this.f70847OooO0O0 == oooO0O0.f70847OooO0O0 && this.f70848OooO0OO == oooO0O0.f70848OooO0OO && this.f70849OooO0Oo == oooO0O0.f70849OooO0Oo;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f70849OooO0Oo) + C20785Oooo00o.OooO00o(this.f70848OooO0OO, C20785Oooo00o.OooO00o(this.f70847OooO0O0, Integer.hashCode(this.f70846OooO00o) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PreviewLayoutSpec(widthPx=");
            sb.append(this.f70846OooO00o);
            sb.append(", heightPx=");
            sb.append(this.f70847OooO0O0);
            sb.append(", gutterPx=");
            sb.append(this.f70848OooO0OO);
            sb.append(", marginPx=");
            return C21023OooO0Oo.OooO0OO(")", this.f70849OooO0Oo, sb);
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<Bundle> {
        public OooO0OO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Bundle invoke() {
            CreativeLibraryDetailFragment creativeLibraryDetailFragment = CreativeLibraryDetailFragment.this;
            Bundle arguments = creativeLibraryDetailFragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + creativeLibraryDetailFragment + " has null arguments");
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.creative_library.CreativeLibraryDetailFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23014OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public C23014OooO0Oo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return CreativeLibraryDetailFragment.this;
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f70852OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f70852OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f70852OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.creative_library.CreativeLibraryDetailFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23015OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C23014OooO0Oo f70853OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23015OooO0o0(C23014OooO0Oo c23014OooO0Oo) {
            super(0);
            this.f70853OooOo0o = c23014OooO0Oo;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f70853OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.creative_library.CreativeLibraryDetailFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class C23016OooO0oO extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f70854OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23016OooO0oO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f70854OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f70854OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.creative_library.CreativeLibraryDetailFragment$OooO0oo, reason: case insensitive filesystem */
    public static final class C23017OooO0oo extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f70855OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23017OooO0oo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f70855OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f70855OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? CreativeLibraryDetailFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [o0Oo0oOo.OooO0o] */
    public CreativeLibraryDetailFragment() {
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, new C23015OooO0o0(new C23014OooO0Oo()));
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f70834OooOoo = new C22026ooOO(oooo0.OooO0O0(C23028OooO0Oo.class), new OooO0o(interfaceC32440OooOO0OooO0O0), new C23017OooO0oo(interfaceC32440OooOO0OooO0O0), new C23016OooO0oO(interfaceC32440OooOO0OooO0O0));
        this.f70836OooOooO = new C24568OooO0oO(oooo0.OooO0O0(C28322OooOOo0.class), new OooO0OO());
        this.f70843Oooo0OO = new View.OnLayoutChangeListener() { // from class: o0Oo0oOo.OooO0o
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                int i9 = i4 - i2;
                int i10 = i8 - i6;
                if (i3 - i == i7 - i5 && i9 == i10) {
                    return;
                }
                final CreativeLibraryDetailFragment creativeLibraryDetailFragment = this.f100425OooOo0o;
                if (creativeLibraryDetailFragment.f70842Oooo0O0) {
                    return;
                }
                creativeLibraryDetailFragment.f70842Oooo0O0 = true;
                o0OOOoO.OooO0O0 oooO0O0 = creativeLibraryDetailFragment.f70835OooOoo0;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(oooO0O0);
                oooO0O0.f94912OooO00o.post(new Runnable() { // from class: o0Oo0oOo.OooOOO
                    /* JADX WARN: Removed duplicated region for block: B:60:0x0197  */
                    /* JADX WARN: Removed duplicated region for block: B:67:0x01a3  */
                    /* JADX WARN: Removed duplicated region for block: B:68:0x01a5  */
                    /* JADX WARN: Removed duplicated region for block: B:74:0x01d3  */
                    /* JADX WARN: Removed duplicated region for block: B:77:0x01ed  */
                    /* JADX WARN: Removed duplicated region for block: B:80:0x01fd  */
                    /* JADX WARN: Removed duplicated region for block: B:97:0x024b  */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void run() {
                        o0OOOoO.OooO0O0 oooO0O02;
                        int height;
                        CreativeLibraryDetailFragment.OooO0O0 oooO0O03;
                        int i11;
                        int i12;
                        int i13;
                        CreativeLibraryDetailFragment.OooO00o oooO00o;
                        LinearLayout linearLayout;
                        ViewGroup.LayoutParams layoutParams;
                        com.orion.notein.p607ui.creative_library.OooOo oooOo;
                        CreativeLibraryDetailFragment creativeLibraryDetailFragment2 = creativeLibraryDetailFragment;
                        if (!creativeLibraryDetailFragment2.isAdded() || (oooO0O02 = creativeLibraryDetailFragment2.f70835OooOoo0) == null) {
                            return;
                        }
                        creativeLibraryDetailFragment2.f70842Oooo0O0 = false;
                        int width = oooO0O02.f94916OooO0o.getWidth();
                        if (width <= 0) {
                            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                            c20358OooO00o.OooOOO0("CreativeLibraryDetailFragment");
                            c20358OooO00o.OooOO0O("ComputePreviewSpec: recyclerWidth <= 0", new Object[0]);
                        } else {
                            Context contextRequireContext = creativeLibraryDetailFragment2.requireContext();
                            kotlin.jvm.internal.OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                            int iOooO0OO = Ooooo00.OooOOO.OooO0OO(o0oo000O.OooOO0O.OooO00o(contextRequireContext) ? 32 : 16);
                            int iOooO0OO2 = Ooooo00.OooOOO.OooO0OO(16);
                            int i14 = width - (iOooO0OO * 2);
                            if (i14 <= 0) {
                                C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o2.OooOOO0("CreativeLibraryDetailFragment");
                                c20358OooO00o2.OooOO0O("ComputePreviewSpec: availableWidth <= 0", new Object[0]);
                            } else {
                                float f = i14;
                                float f2 = f / creativeLibraryDetailFragment2.getResources().getDisplayMetrics().density;
                                int iOooO0O0 = oO0O00O.OooO00o.OooO0O0(oO0O00oo.OooOO0.OooO0o0(1.0f / (f2 >= 1200.0f ? 2.5f : f2 >= 900.0f ? 2.1f : f2 >= 600.0f ? 1.3f : f2 >= 480.0f ? 1.2f : 1.1f), 0.35f, 0.95f) * f) - iOooO0OO2;
                                int iOooO0OO3 = Ooooo00.OooOOO.OooO0OO(180);
                                int iOooO0OO4 = Ooooo00.OooOOO.OooO0OO(140);
                                int iMax = Math.max(iOooO0O0, iOooO0OO3);
                                o0OOOoO.OooO0O0 oooO0O04 = creativeLibraryDetailFragment2.f70835OooOoo0;
                                kotlin.jvm.internal.OooOOO0.OooO0Oo(oooO0O04);
                                if (oooO0O04.f94915OooO0Oo.getHeight() > 0) {
                                    o0OOOoO.OooO0O0 oooO0O05 = creativeLibraryDetailFragment2.f70835OooOoo0;
                                    kotlin.jvm.internal.OooOOO0.OooO0Oo(oooO0O05);
                                    height = oooO0O05.f94915OooO0Oo.getHeight();
                                } else {
                                    o0OOOoO.OooO0O0 oooO0O06 = creativeLibraryDetailFragment2.f70835OooOoo0;
                                    kotlin.jvm.internal.OooOOO0.OooO0Oo(oooO0O06);
                                    int height2 = oooO0O06.f94912OooO00o.getHeight();
                                    o0OOOoO.OooO0O0 oooO0O07 = creativeLibraryDetailFragment2.f70835OooOoo0;
                                    kotlin.jvm.internal.OooOOO0.OooO0Oo(oooO0O07);
                                    if (height2 > oooO0O07.f94932OooOo00.getHeight()) {
                                        o0OOOoO.OooO0O0 oooO0O08 = creativeLibraryDetailFragment2.f70835OooOoo0;
                                        kotlin.jvm.internal.OooOOO0.OooO0Oo(oooO0O08);
                                        int height3 = oooO0O08.f94912OooO00o.getHeight();
                                        o0OOOoO.OooO0O0 oooO0O09 = creativeLibraryDetailFragment2.f70835OooOoo0;
                                        kotlin.jvm.internal.OooOOO0.OooO0Oo(oooO0O09);
                                        height = height3 - oooO0O09.f94932OooOo00.getHeight();
                                    } else {
                                        height = creativeLibraryDetailFragment2.getResources().getDisplayMetrics().heightPixels;
                                    }
                                }
                                if (height > 0) {
                                    float f3 = iMax;
                                    int iOooO0O02 = oO0O00O.OooO00o.OooO0O0(f3 * 0.75f);
                                    int iOooO0O03 = oO0O00O.OooO00o.OooO0O0(height * 0.5f);
                                    if (iOooO0O03 < iOooO0OO4) {
                                        iOooO0O03 = iOooO0OO4;
                                    }
                                    if (iOooO0O02 > iOooO0O03) {
                                        iMax = oO0O00O.OooO00o.OooO0O0((iOooO0O03 / iOooO0O02) * f3);
                                        iOooO0O02 = iOooO0O03;
                                    }
                                    if (iOooO0O02 < iOooO0OO4) {
                                        iMax = oO0O00O.OooO00o.OooO0O0(iOooO0OO4 / 0.75f);
                                    } else {
                                        iOooO0OO4 = iOooO0O02;
                                    }
                                    if (iMax > i14) {
                                        iOooO0OO4 = oO0O00O.OooO00o.OooO0O0(f * 0.75f);
                                    } else {
                                        i14 = iMax;
                                    }
                                    oooO0O03 = new CreativeLibraryDetailFragment.OooO0O0(i14, iOooO0OO4, iOooO0OO2, iOooO0OO);
                                    if (oooO0O03 == null && !oooO0O03.equals(creativeLibraryDetailFragment2.f70838Oooo0)) {
                                        creativeLibraryDetailFragment2.f70838Oooo0 = oooO0O03;
                                        C34406OooO00o.C20358OooO00o c20358OooO00o3 = C34406OooO00o.f123390OooO00o;
                                        StringBuilder sbOooO0O0 = C22238OooO0oO.OooO0O0(c20358OooO00o3, "CreativeLibraryDetailFragment", "updatePreviewLayoutSpec: widthPx=");
                                        int i15 = oooO0O03.f70846OooO00o;
                                        sbOooO0O0.append(i15);
                                        sbOooO0O0.append(", heightPx=");
                                        i11 = oooO0O03.f70847OooO0O0;
                                        sbOooO0O0.append(i11);
                                        sbOooO0O0.append(", gutterPx=");
                                        i12 = oooO0O03.f70848OooO0OO;
                                        sbOooO0O0.append(i12);
                                        sbOooO0O0.append(", marginPx=");
                                        i13 = oooO0O03.f70849OooO0Oo;
                                        sbOooO0O0.append(i13);
                                        c20358OooO00o3.OooO00o(sbOooO0O0.toString(), new Object[0]);
                                        oooO00o = creativeLibraryDetailFragment2.f70840Oooo00O;
                                        if (oooO00o == null) {
                                            oooO00o = null;
                                        }
                                        if (oooO00o != null || oooO00o.f70844OooO00o != i12 || oooO00o.f70845OooO0O0 != i13) {
                                            if (oooO00o != null) {
                                                o0OOOoO.OooO0O0 oooO0O010 = creativeLibraryDetailFragment2.f70835OooOoo0;
                                                kotlin.jvm.internal.OooOOO0.OooO0Oo(oooO0O010);
                                                oooO0O010.f94916OooO0o.removeItemDecoration(oooO00o);
                                            }
                                            CreativeLibraryDetailFragment.OooO00o oooO00o2 = new CreativeLibraryDetailFragment.OooO00o(i12, i13);
                                            creativeLibraryDetailFragment2.f70840Oooo00O = oooO00o2;
                                            o0OOOoO.OooO0O0 oooO0O011 = creativeLibraryDetailFragment2.f70835OooOoo0;
                                            kotlin.jvm.internal.OooOOO0.OooO0Oo(oooO0O011);
                                            oooO0O011.f94916OooO0o.addItemDecoration(oooO00o2);
                                        }
                                        o0OOOoO.OooO0O0 oooO0O012 = creativeLibraryDetailFragment2.f70835OooOoo0;
                                        kotlin.jvm.internal.OooOOO0.OooO0Oo(oooO0O012);
                                        linearLayout = oooO0O012.f94914OooO0OO;
                                        if (linearLayout.getPaddingStart() == i13 || linearLayout.getPaddingEnd() != i13) {
                                            linearLayout.setPadding(i13, linearLayout.getPaddingTop(), i13, linearLayout.getPaddingBottom());
                                        }
                                        o0OOOoO.OooO0O0 oooO0O013 = creativeLibraryDetailFragment2.f70835OooOoo0;
                                        kotlin.jvm.internal.OooOOO0.OooO0Oo(oooO0O013);
                                        layoutParams = oooO0O013.f94916OooO0o.getLayoutParams();
                                        if (layoutParams.height != i11) {
                                            layoutParams.height = i11;
                                            o0OOOoO.OooO0O0 oooO0O014 = creativeLibraryDetailFragment2.f70835OooOoo0;
                                            kotlin.jvm.internal.OooOOO0.OooO0Oo(oooO0O014);
                                            oooO0O014.f94916OooO0o.setLayoutParams(layoutParams);
                                        }
                                        oooOo = creativeLibraryDetailFragment2.f70837OooOooo;
                                        if (oooOo != null) {
                                            kotlin.jvm.internal.OooOOO0.OooOOOO("previewAdapter");
                                            throw null;
                                        }
                                        int iMax2 = Math.max(i15, 0);
                                        int iMax3 = Math.max(i11, 0);
                                        if (iMax2 != oooOo.f71164OooO0OO || iMax3 != oooOo.f71165OooO0Oo) {
                                            oooOo.f71164OooO0OO = iMax2;
                                            oooOo.f71165OooO0Oo = iMax3;
                                            oooOo.notifyDataSetChanged();
                                        }
                                        int iOooO0O04 = oO0O00O.OooO00o.OooO0O0(i15 * 0.75f);
                                        int iOooO0O05 = oO0O00O.OooO00o.OooO0O0(i11 * 0.75f);
                                        C23059Oooo0oO c23059Oooo0oO = creativeLibraryDetailFragment2.f70839Oooo000;
                                        if (c23059Oooo0oO == null) {
                                            kotlin.jvm.internal.OooOOO0.OooOOOO("recommendationsAdapter");
                                            throw null;
                                        }
                                        if (c23059Oooo0oO.f71284OooO0Oo != iOooO0O04 || c23059Oooo0oO.f71285OooO0o0 != iOooO0O05) {
                                            c23059Oooo0oO.f71284OooO0Oo = iOooO0O04;
                                            c23059Oooo0oO.f71285OooO0o0 = iOooO0O05;
                                            c23059Oooo0oO.notifyDataSetChanged();
                                        }
                                        o0OOOoO.OooO0O0 oooO0O015 = creativeLibraryDetailFragment2.f70835OooOoo0;
                                        kotlin.jvm.internal.OooOOO0.OooO0Oo(oooO0O015);
                                        oooO0O015.f94916OooO0o.post(new RunnableC20408OooOOOo(creativeLibraryDetailFragment2, 2));
                                        return;
                                    }
                                    return;
                                }
                                C34406OooO00o.C20358OooO00o c20358OooO00o4 = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o4.OooOOO0("CreativeLibraryDetailFragment");
                                c20358OooO00o4.OooOO0O("ComputePreviewSpec: containerHeight <= 0", new Object[0]);
                            }
                        }
                        oooO0O03 = null;
                        if (oooO0O03 == null) {
                            return;
                        }
                        creativeLibraryDetailFragment2.f70838Oooo0 = oooO0O03;
                        C34406OooO00o.C20358OooO00o c20358OooO00o32 = C34406OooO00o.f123390OooO00o;
                        StringBuilder sbOooO0O02 = C22238OooO0oO.OooO0O0(c20358OooO00o32, "CreativeLibraryDetailFragment", "updatePreviewLayoutSpec: widthPx=");
                        int i152 = oooO0O03.f70846OooO00o;
                        sbOooO0O02.append(i152);
                        sbOooO0O02.append(", heightPx=");
                        i11 = oooO0O03.f70847OooO0O0;
                        sbOooO0O02.append(i11);
                        sbOooO0O02.append(", gutterPx=");
                        i12 = oooO0O03.f70848OooO0OO;
                        sbOooO0O02.append(i12);
                        sbOooO0O02.append(", marginPx=");
                        i13 = oooO0O03.f70849OooO0Oo;
                        sbOooO0O02.append(i13);
                        c20358OooO00o32.OooO00o(sbOooO0O02.toString(), new Object[0]);
                        oooO00o = creativeLibraryDetailFragment2.f70840Oooo00O;
                        if (oooO00o == null) {
                        }
                        if (oooO00o != null) {
                            if (oooO00o != null) {
                            }
                            CreativeLibraryDetailFragment.OooO00o oooO00o22 = new CreativeLibraryDetailFragment.OooO00o(i12, i13);
                            creativeLibraryDetailFragment2.f70840Oooo00O = oooO00o22;
                            o0OOOoO.OooO0O0 oooO0O0112 = creativeLibraryDetailFragment2.f70835OooOoo0;
                            kotlin.jvm.internal.OooOOO0.OooO0Oo(oooO0O0112);
                            oooO0O0112.f94916OooO0o.addItemDecoration(oooO00o22);
                        }
                        o0OOOoO.OooO0O0 oooO0O0122 = creativeLibraryDetailFragment2.f70835OooOoo0;
                        kotlin.jvm.internal.OooOOO0.OooO0Oo(oooO0O0122);
                        linearLayout = oooO0O0122.f94914OooO0OO;
                        if (linearLayout.getPaddingStart() == i13) {
                            linearLayout.setPadding(i13, linearLayout.getPaddingTop(), i13, linearLayout.getPaddingBottom());
                        }
                        o0OOOoO.OooO0O0 oooO0O0132 = creativeLibraryDetailFragment2.f70835OooOoo0;
                        kotlin.jvm.internal.OooOOO0.OooO0Oo(oooO0O0132);
                        layoutParams = oooO0O0132.f94916OooO0o.getLayoutParams();
                        if (layoutParams.height != i11) {
                        }
                        oooOo = creativeLibraryDetailFragment2.f70837OooOooo;
                        if (oooOo != null) {
                        }
                    }
                });
            }
        };
    }

    public final C23028OooO0Oo OooOoOO() {
        return (C23028OooO0Oo) this.f70834OooOoo.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_creative_library_detail, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        o0OOOoO.OooO0O0 oooO0O0 = this.f70835OooOoo0;
        OooOOO0.OooO0Oo(oooO0O0);
        oooO0O0.f94912OooO00o.removeOnLayoutChangeListener(this.f70843Oooo0OO);
        OooO00o oooO00o = this.f70840Oooo00O;
        if (oooO00o != null) {
            o0OOOoO.OooO0O0 oooO0O02 = this.f70835OooOoo0;
            OooOOO0.OooO0Oo(oooO0O02);
            oooO0O02.f94916OooO0o.removeItemDecoration(oooO00o);
        }
        OooO00o oooO00o2 = this.f70841Oooo00o;
        if (oooO00o2 != null) {
            o0OOOoO.OooO0O0 oooO0O03 = this.f70835OooOoo0;
            OooOOO0.OooO0Oo(oooO0O03);
            oooO0O03.f94919OooO0oo.removeItemDecoration(oooO00o2);
        }
        o0OOOoO.OooO0O0 oooO0O04 = this.f70835OooOoo0;
        OooOOO0.OooO0Oo(oooO0O04);
        oooO0O04.f94916OooO0o.setAdapter(null);
        o0OOOoO.OooO0O0 oooO0O05 = this.f70835OooOoo0;
        OooOOO0.OooO0Oo(oooO0O05);
        oooO0O05.f94919OooO0oo.setAdapter(null);
        this.f70840Oooo00O = null;
        this.f70841Oooo00o = null;
        this.f70838Oooo0 = null;
        this.f70835OooOoo0 = null;
    }

    @Override // com.orion.notein.p607ui.widget.EdgeFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        int i = R.id.btn_action;
        TextButtonView textButtonView = (TextButtonView) C24217OooO0O0.OooO0O0(R.id.btn_action, view);
        if (textButtonView != null) {
            i = R.id.btn_back;
            ImageView imageView = (ImageView) C24217OooO0O0.OooO0O0(R.id.btn_back, view);
            if (imageView != null) {
                i = R.id.content_container;
                LinearLayout linearLayout = (LinearLayout) C24217OooO0O0.OooO0O0(R.id.content_container, view);
                if (linearLayout != null) {
                    i = R.id.content_scroll;
                    ScrollView scrollView = (ScrollView) C24217OooO0O0.OooO0O0(R.id.content_scroll, view);
                    if (scrollView != null) {
                        i = R.id.creator_info_container;
                        if (((LinearLayout) C24217OooO0O0.OooO0O0(R.id.creator_info_container, view)) != null) {
                            i = R.id.iv_creator;
                            ImageView imageView2 = (ImageView) C24217OooO0O0.OooO0O0(R.id.iv_creator, view);
                            if (imageView2 != null) {
                                i = R.id.preview_recycler_view;
                                RecyclerView recyclerView = (RecyclerView) C24217OooO0O0.OooO0O0(R.id.preview_recycler_view, view);
                                if (recyclerView != null) {
                                    i = R.id.recommendations_container;
                                    LinearLayout linearLayout2 = (LinearLayout) C24217OooO0O0.OooO0O0(R.id.recommendations_container, view);
                                    if (linearLayout2 != null) {
                                        i = R.id.recommendations_recycler_view;
                                        RecyclerView recyclerView2 = (RecyclerView) C24217OooO0O0.OooO0O0(R.id.recommendations_recycler_view, view);
                                        if (recyclerView2 != null) {
                                            i = R.id.spec_container;
                                            if (((LinearLayout) C24217OooO0O0.OooO0O0(R.id.spec_container, view)) != null) {
                                                i = R.id.spec_divider_1;
                                                View viewOooO0O0 = C24217OooO0O0.OooO0O0(R.id.spec_divider_1, view);
                                                if (viewOooO0O0 != null) {
                                                    i = R.id.spec_divider_2;
                                                    View viewOooO0O02 = C24217OooO0O0.OooO0O0(R.id.spec_divider_2, view);
                                                    if (viewOooO0O02 != null) {
                                                        i = R.id.spec_param_1_container;
                                                        LinearLayout linearLayout3 = (LinearLayout) C24217OooO0O0.OooO0O0(R.id.spec_param_1_container, view);
                                                        if (linearLayout3 != null) {
                                                            i = R.id.spec_param_1_label;
                                                            TextView textView = (TextView) C24217OooO0O0.OooO0O0(R.id.spec_param_1_label, view);
                                                            if (textView != null) {
                                                                i = R.id.spec_param_1_value;
                                                                TextView textView2 = (TextView) C24217OooO0O0.OooO0O0(R.id.spec_param_1_value, view);
                                                                if (textView2 != null) {
                                                                    i = R.id.spec_param_2_container;
                                                                    LinearLayout linearLayout4 = (LinearLayout) C24217OooO0O0.OooO0O0(R.id.spec_param_2_container, view);
                                                                    if (linearLayout4 != null) {
                                                                        i = R.id.spec_param_2_label;
                                                                        TextView textView3 = (TextView) C24217OooO0O0.OooO0O0(R.id.spec_param_2_label, view);
                                                                        if (textView3 != null) {
                                                                            i = R.id.spec_param_2_value;
                                                                            TextView textView4 = (TextView) C24217OooO0O0.OooO0O0(R.id.spec_param_2_value, view);
                                                                            if (textView4 != null) {
                                                                                i = R.id.spec_param_3_container;
                                                                                LinearLayout linearLayout5 = (LinearLayout) C24217OooO0O0.OooO0O0(R.id.spec_param_3_container, view);
                                                                                if (linearLayout5 != null) {
                                                                                    i = R.id.spec_param_3_label;
                                                                                    TextView textView5 = (TextView) C24217OooO0O0.OooO0O0(R.id.spec_param_3_label, view);
                                                                                    if (textView5 != null) {
                                                                                        i = R.id.spec_param_3_value;
                                                                                        TextView textView6 = (TextView) C24217OooO0O0.OooO0O0(R.id.spec_param_3_value, view);
                                                                                        if (textView6 != null) {
                                                                                            i = R.id.top_bar;
                                                                                            ConstraintLayout constraintLayout = (ConstraintLayout) C24217OooO0O0.OooO0O0(R.id.top_bar, view);
                                                                                            if (constraintLayout != null) {
                                                                                                i = R.id.tv_creator_desc;
                                                                                                TextView textView7 = (TextView) C24217OooO0O0.OooO0O0(R.id.tv_creator_desc, view);
                                                                                                if (textView7 != null) {
                                                                                                    i = R.id.tv_creator_name;
                                                                                                    TextView textView8 = (TextView) C24217OooO0O0.OooO0O0(R.id.tv_creator_name, view);
                                                                                                    if (textView8 != null) {
                                                                                                        i = R.id.tv_desc;
                                                                                                        TextView textView9 = (TextView) C24217OooO0O0.OooO0O0(R.id.tv_desc, view);
                                                                                                        if (textView9 != null) {
                                                                                                            i = R.id.tv_more;
                                                                                                            TextView textView10 = (TextView) C24217OooO0O0.OooO0O0(R.id.tv_more, view);
                                                                                                            if (textView10 != null) {
                                                                                                                i = R.id.tv_recommendations_title;
                                                                                                                if (((TextView) C24217OooO0O0.OooO0O0(R.id.tv_recommendations_title, view)) != null) {
                                                                                                                    i = R.id.tv_title;
                                                                                                                    TextView textView11 = (TextView) C24217OooO0O0.OooO0O0(R.id.tv_title, view);
                                                                                                                    if (textView11 != null) {
                                                                                                                        this.f70835OooOoo0 = new o0OOOoO.OooO0O0((ConstraintLayout) view, textButtonView, imageView, linearLayout, scrollView, imageView2, recyclerView, linearLayout2, recyclerView2, viewOooO0O0, viewOooO0O02, linearLayout3, textView, textView2, linearLayout4, textView3, textView4, linearLayout5, textView5, textView6, constraintLayout, textView7, textView8, textView9, textView10, textView11);
                                                                                                                        imageView.setOnClickListener(new ViewOnClickListenerC28305OooO(this, 0));
                                                                                                                        o0OOOoO.OooO0O0 oooO0O0 = this.f70835OooOoo0;
                                                                                                                        OooOOO0.OooO0Oo(oooO0O0);
                                                                                                                        oooO0O0.f94913OooO0O0.setOnClickListener(new ViewOnClickListenerC28314OooOO0(this, 0));
                                                                                                                        C28315OooOO0O c28315OooOO0O = new C28315OooOO0O(this);
                                                                                                                        o0OOOoO.OooO0O0 oooO0O02 = this.f70835OooOoo0;
                                                                                                                        OooOOO0.OooO0Oo(oooO0O02);
                                                                                                                        oooO0O02.f94930OooOo.setOnClickListener(new ViewOnClickListenerC28316OooOO0o(c28315OooOO0O, 0));
                                                                                                                        o0OOOoO.OooO0O0 oooO0O03 = this.f70835OooOoo0;
                                                                                                                        OooOOO0.OooO0Oo(oooO0O03);
                                                                                                                        oooO0O03.f94917OooO0o0.setOnClickListener(new ViewOnClickListenerC28318OooOOO0(c28315OooOO0O, 0));
                                                                                                                        this.f70837OooOooo = new OooOo(new C28313OooO0oo(this));
                                                                                                                        o0OOOoO.OooO0O0 oooO0O04 = this.f70835OooOoo0;
                                                                                                                        OooOOO0.OooO0Oo(oooO0O04);
                                                                                                                        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext(), 0, false);
                                                                                                                        RecyclerView recyclerView3 = oooO0O04.f94916OooO0o;
                                                                                                                        recyclerView3.setLayoutManager(linearLayoutManager);
                                                                                                                        OooOo oooOo = this.f70837OooOooo;
                                                                                                                        if (oooOo == null) {
                                                                                                                            OooOOO0.OooOOOO("previewAdapter");
                                                                                                                            throw null;
                                                                                                                        }
                                                                                                                        recyclerView3.setAdapter(oooOo);
                                                                                                                        recyclerView3.setClipToPadding(false);
                                                                                                                        recyclerView3.setOverScrollMode(2);
                                                                                                                        recyclerView3.setNestedScrollingEnabled(false);
                                                                                                                        o0OOOoO.OooO0O0 oooO0O05 = this.f70835OooOoo0;
                                                                                                                        OooOOO0.OooO0Oo(oooO0O05);
                                                                                                                        oooO0O05.f94912OooO00o.addOnLayoutChangeListener(this.f70843Oooo0OO);
                                                                                                                        this.f70839Oooo000 = new C23059Oooo0oO(new C28319OooOOOO(this, 0), new C28320OooOOOo(this, 0));
                                                                                                                        o0OOOoO.OooO0O0 oooO0O06 = this.f70835OooOoo0;
                                                                                                                        OooOOO0.OooO0Oo(oooO0O06);
                                                                                                                        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(requireContext(), 0, false);
                                                                                                                        RecyclerView recyclerView4 = oooO0O06.f94919OooO0oo;
                                                                                                                        recyclerView4.setLayoutManager(linearLayoutManager2);
                                                                                                                        C23059Oooo0oO c23059Oooo0oO = this.f70839Oooo000;
                                                                                                                        if (c23059Oooo0oO == null) {
                                                                                                                            OooOOO0.OooOOOO("recommendationsAdapter");
                                                                                                                            throw null;
                                                                                                                        }
                                                                                                                        recyclerView4.setAdapter(c23059Oooo0oO);
                                                                                                                        recyclerView4.setClipToPadding(false);
                                                                                                                        recyclerView4.setClipChildren(false);
                                                                                                                        recyclerView4.setOverScrollMode(2);
                                                                                                                        recyclerView4.setNestedScrollingEnabled(false);
                                                                                                                        this.f70841Oooo00o = new OooO00o(OooOOO.OooO0OO(16), 0);
                                                                                                                        o0OOOoO.OooO0O0 oooO0O07 = this.f70835OooOoo0;
                                                                                                                        OooOOO0.OooO0Oo(oooO0O07);
                                                                                                                        OooO00o oooO00o = this.f70841Oooo00o;
                                                                                                                        OooOOO0.OooO0Oo(oooO00o);
                                                                                                                        oooO0O07.f94919OooO0oo.addItemDecoration(oooO00o);
                                                                                                                        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
                                                                                                                        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                                                                                                                        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new com.orion.notein.p607ui.creative_library.OooO0O0(this, null), 3);
                                                                                                                        InterfaceC21987OooOoo viewLifecycleOwner2 = getViewLifecycleOwner();
                                                                                                                        OooOOO0.OooO0o(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
                                                                                                                        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner2), null, null, new com.orion.notein.p607ui.creative_library.OooO0OO(this, null), 3);
                                                                                                                        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                                                                                                                        c20358OooO00o.OooOOO0("CreativeLibraryDetailFragment");
                                                                                                                        C24568OooO0oO c24568OooO0oO = this.f70836OooOooO;
                                                                                                                        c20358OooO00o.OooO00o("onViewCreated: received materialId=".concat(((C28322OooOOo0) c24568OooO0oO.getValue()).f100444OooO00o), new Object[0]);
                                                                                                                        OooOoOO().OooO0o(((C28322OooOOo0) c24568OooO0oO.getValue()).f100444OooO00o);
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
