package com.orion.notein.p607ui.creative_library.purchase;

import OooOoOO.C20519OooO0Oo;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.BundleKt;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.fragment.app.C21904OooOoo0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00Oo0;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.creative_library.purchase.OooO00o;
import kotlin.Metadata;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import kotlin.jvm.internal.Oooo0;
import o000o00.AbstractC24555OooO00o;
import o0O0oooO.C26320o0000OoO;
import o0Oo0Oo.C28085OooO;
import oO00ooO.C32443OooOOO;
import oO00ooO.EnumC32441OooOO0O;
import oO00ooO.InterfaceC32440OooOO0;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/creative_library/purchase/MaterialPurchaseBottomSheet;", "Lcom/orion/notein/ui/RoundBottomSheetDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class MaterialPurchaseBottomSheet extends Hilt_MaterialPurchaseBottomSheet {

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final C22026ooOO f71301OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final C22026ooOO f71302OooOooo;

    public static final class OooO extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f71303OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f71303OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f71303OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? MaterialPurchaseBottomSheet.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class OooO00o implements OooO00o.InterfaceC19187OooO00o {
        public OooO00o() {
        }

        @Override // com.orion.notein.p607ui.creative_library.purchase.OooO00o.InterfaceC19187OooO00o
        public final Context OooO00o() {
            Context contextRequireContext = MaterialPurchaseBottomSheet.this.requireContext();
            OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
            return contextRequireContext;
        }

        @Override // com.orion.notein.p607ui.creative_library.purchase.OooO00o.InterfaceC19187OooO00o
        public final void OooO0O0() {
            ActivityC21897OooOo0 activityC21897OooOo0RequireActivity = MaterialPurchaseBottomSheet.this.requireActivity();
            OooOOO0.OooO0o(activityC21897OooOo0RequireActivity, "requireActivity(...)");
            C28085OooO.OooO00o(activityC21897OooOo0RequireActivity, false);
        }

        @Override // com.orion.notein.p607ui.creative_library.purchase.OooO00o.InterfaceC19187OooO00o
        public final boolean OooO0OO() {
            return ((C26320o0000OoO) MaterialPurchaseBottomSheet.this.f71302OooOooo.getValue()).f90227OooOoOO.f121747OooOo0o.getValue() != 0;
        }

        @Override // com.orion.notein.p607ui.creative_library.purchase.OooO00o.InterfaceC19187OooO00o
        public final ActivityC21897OooOo0 OooO0Oo() {
            return MaterialPurchaseBottomSheet.this.requireActivity();
        }

        @Override // com.orion.notein.p607ui.creative_library.purchase.OooO00o.InterfaceC19187OooO00o
        public final void OooO0o0() {
            Bundle bundleBundleOf = BundleKt.bundleOf(new C32443OooOOO(FirebaseAnalytics.Param.SUCCESS, Boolean.TRUE));
            MaterialPurchaseBottomSheet materialPurchaseBottomSheet = MaterialPurchaseBottomSheet.this;
            C21904OooOoo0.OooO0o(bundleBundleOf, materialPurchaseBottomSheet, "material_purchase_result");
            materialPurchaseBottomSheet.dismiss();
        }

        @Override // com.orion.notein.p607ui.creative_library.purchase.OooO00o.InterfaceC19187OooO00o
        public final void onDismiss() {
            MaterialPurchaseBottomSheet.this.dismiss();
        }
    }

    public static final class OooO0O0 extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public OooO0O0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return MaterialPurchaseBottomSheet.this.requireActivity().getViewModelStore();
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public OooO0OO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return MaterialPurchaseBottomSheet.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.creative_library.purchase.MaterialPurchaseBottomSheet$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23060OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public C23060OooO0Oo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return MaterialPurchaseBottomSheet.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C23061OooO0o0 f71309OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(C23061OooO0o0 c23061OooO0o0) {
            super(0);
            this.f71309OooOo0o = c23061OooO0o0;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f71309OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.creative_library.purchase.MaterialPurchaseBottomSheet$OooO0o0, reason: case insensitive filesystem */
    public static final class C23061OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public C23061OooO0o0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return MaterialPurchaseBottomSheet.this;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.creative_library.purchase.MaterialPurchaseBottomSheet$OooO0oO, reason: case insensitive filesystem */
    public static final class C23062OooO0oO extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f71311OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23062OooO0oO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f71311OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f71311OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.creative_library.purchase.MaterialPurchaseBottomSheet$OooO0oo, reason: case insensitive filesystem */
    public static final class C23063OooO0oo extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f71312OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23063OooO0oo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f71312OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f71312OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    public MaterialPurchaseBottomSheet() {
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, new OooO0o(new C23061OooO0o0()));
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f71301OooOooO = new C22026ooOO(oooo0.OooO0O0(com.orion.notein.p607ui.creative_library.purchase.OooO0o.class), new C23062OooO0oO(interfaceC32440OooOO0OooO0O0), new OooO(interfaceC32440OooOO0OooO0O0), new C23063OooO0oo(interfaceC32440OooOO0OooO0O0));
        this.f71302OooOooo = new C22026ooOO(oooo0.OooO0O0(C26320o0000OoO.class), new OooO0O0(), new C23060OooO0Oo(), new OooO0OO());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.material_purchase_bottom_sheet_host, viewGroup, false);
        OooOOO0.OooO0o(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.orion.notein.p607ui.RoundBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        OooOOO0.OooO0oO(dialog, "dialog");
        super.onDismiss(dialog);
        ((com.orion.notein.p607ui.creative_library.purchase.OooO0o) this.f71301OooOooO.getValue()).OooO0o0();
    }

    @Override // com.orion.notein.p607ui.RoundBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        this.f70451OooOo0o = -2;
        super.onStart();
    }

    @Override // com.orion.notein.p607ui.RoundBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("MaterialPurchaseSheet");
        c20358OooO00o.OooO00o("MaterialPurchaseBottomSheet#onViewCreated invoked", new Object[0]);
        Bundle arguments = getArguments();
        C22026ooOO c22026ooOO = this.f71301OooOooO;
        if (arguments != null) {
            String string = arguments.getString("materialId");
            if (string == null) {
                string = "";
            }
            String string2 = arguments.getString("materialTitle");
            ((com.orion.notein.p607ui.creative_library.purchase.OooO0o) c22026ooOO.getValue()).OooO0oO(arguments.getInt("priceCents", 0), string, string2 != null ? string2 : "");
        }
        OooO00o oooO00o = new OooO00o();
        com.orion.notein.p607ui.creative_library.purchase.OooO0o oooO0o = (com.orion.notein.p607ui.creative_library.purchase.OooO0o) c22026ooOO.getValue();
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        new com.orion.notein.p607ui.creative_library.purchase.OooO00o(view, oooO00o, oooO0o, C21989OooOooO.OooO00o(viewLifecycleOwner)).OooO00o();
    }
}
