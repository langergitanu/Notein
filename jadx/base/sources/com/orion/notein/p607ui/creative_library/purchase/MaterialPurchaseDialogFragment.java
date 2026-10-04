package com.orion.notein.p607ui.creative_library.purchase;

import OooOoOO.C20519OooO0Oo;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.core.os.BundleKt;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.fragment.app.C21904OooOoo0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00Oo0;
import com.aspose.slides.internal.p332p7.C22236OooO0Oo;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.creative_library.purchase.OooO00o;
import com.orion.notein.p607ui.creative_library.purchase.OooO0o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import kotlin.jvm.internal.Oooo0;
import o000o00.AbstractC24555OooO00o;
import o00o00O0.C25252OooO0Oo;
import o0O0oooO.C26320o0000OoO;
import o0Oo0Oo.C28085OooO;
import o0Oo0Ooo.ViewOnClickListenerC28136OooO0O0;
import o0Oo0Ooo.ViewOnClickListenerC28137OooO0OO;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooO.EnumC32441OooOO0O;
import oO00ooO.InterfaceC32440OooOO0;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33644OoooO0;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/creative_library/purchase/MaterialPurchaseDialogFragment;", "Lcom/orion/notein/ui/BaseDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class MaterialPurchaseDialogFragment extends Hilt_MaterialPurchaseDialogFragment {

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final C22026ooOO f71313Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final C22026ooOO f71314Oooo00O;

    public static final class OooO extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f71315OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f71315OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f71315OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    public static final class OooO00o implements OooO00o.InterfaceC19187OooO00o {
        public OooO00o() {
        }

        @Override // com.orion.notein.p607ui.creative_library.purchase.OooO00o.InterfaceC19187OooO00o
        public final Context OooO00o() {
            Context contextRequireContext = MaterialPurchaseDialogFragment.this.requireContext();
            OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
            return contextRequireContext;
        }

        @Override // com.orion.notein.p607ui.creative_library.purchase.OooO00o.InterfaceC19187OooO00o
        public final void OooO0O0() {
            ActivityC21897OooOo0 activityC21897OooOo0RequireActivity = MaterialPurchaseDialogFragment.this.requireActivity();
            OooOOO0.OooO0o(activityC21897OooOo0RequireActivity, "requireActivity(...)");
            C28085OooO.OooO00o(activityC21897OooOo0RequireActivity, false);
        }

        @Override // com.orion.notein.p607ui.creative_library.purchase.OooO00o.InterfaceC19187OooO00o
        public final boolean OooO0OO() {
            return ((C26320o0000OoO) MaterialPurchaseDialogFragment.this.f71314Oooo00O.getValue()).f90227OooOoOO.f121747OooOo0o.getValue() != 0;
        }

        @Override // com.orion.notein.p607ui.creative_library.purchase.OooO00o.InterfaceC19187OooO00o
        public final ActivityC21897OooOo0 OooO0Oo() {
            return MaterialPurchaseDialogFragment.this.requireActivity();
        }

        @Override // com.orion.notein.p607ui.creative_library.purchase.OooO00o.InterfaceC19187OooO00o
        public final void OooO0o0() {
            Bundle bundleBundleOf = BundleKt.bundleOf(new C32443OooOOO(FirebaseAnalytics.Param.SUCCESS, Boolean.TRUE));
            MaterialPurchaseDialogFragment materialPurchaseDialogFragment = MaterialPurchaseDialogFragment.this;
            C21904OooOoo0.OooO0o(bundleBundleOf, materialPurchaseDialogFragment, "material_purchase_result");
            materialPurchaseDialogFragment.dismiss();
        }

        @Override // com.orion.notein.p607ui.creative_library.purchase.OooO00o.InterfaceC19187OooO00o
        public final void onDismiss() {
            MaterialPurchaseDialogFragment.this.dismiss();
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.purchase.MaterialPurchaseDialogFragment$onViewCreated$8", m80623f = "MaterialPurchaseDialogFragment.kt", m80624l = {95}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f71318OooOo0o;

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.creative_library.purchase.MaterialPurchaseDialogFragment$onViewCreated$8$1", m80623f = "MaterialPurchaseDialogFragment.kt", m80624l = {97}, m80625m = "invokeSuspend")
        public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<OooO0o.OooO0OO, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public /* synthetic */ Object f71319OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f71320OooOo0o;

            /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
            public final /* synthetic */ MaterialPurchaseDialogFragment f71321OooOoO0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(MaterialPurchaseDialogFragment materialPurchaseDialogFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f71321OooOoO0 = materialPurchaseDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                OooO00o oooO00o = new OooO00o(this.f71321OooOoO0, continuation);
                oooO00o.f71319OooOo = obj;
                return oooO00o;
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(OooO0o.OooO0OO oooO0OO, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO00o) create(oooO0OO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f71320OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    if (OooOOO0.OooO0O0(((OooO0o.OooO0OO) this.f71319OooOo).f71394OooO0Oo, OooO0o.OooO00o.C23069OooO0Oo.f71381OooO00o)) {
                        this.f71320OooOo0o = 1;
                        if (C33644OoooO0.OooO00o(1000L, this) == enumC32485OooO00o) {
                            return enumC32485OooO00o;
                        }
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                this.f71321OooOoO0.dismiss();
                return C32460OooOooO.f116667OooO00o;
            }
        }

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return MaterialPurchaseDialogFragment.this.new OooO0O0(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f71318OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                MaterialPurchaseDialogFragment materialPurchaseDialogFragment = MaterialPurchaseDialogFragment.this;
                com.orion.notein.p607ui.creative_library.purchase.OooO0o oooO0o = (com.orion.notein.p607ui.creative_library.purchase.OooO0o) materialPurchaseDialogFragment.f71313Oooo000.getValue();
                OooO00o oooO00o = new OooO00o(materialPurchaseDialogFragment, null);
                this.f71318OooOo0o = 1;
                if (C25252OooO0Oo.OooO0oO(oooO0o.f71373OooO0o, oooO00o, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public OooO0OO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return MaterialPurchaseDialogFragment.this.requireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.creative_library.purchase.MaterialPurchaseDialogFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23064OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public C23064OooO0Oo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return MaterialPurchaseDialogFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public OooO0o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return MaterialPurchaseDialogFragment.this;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.creative_library.purchase.MaterialPurchaseDialogFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23065OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public C23065OooO0o0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return MaterialPurchaseDialogFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.creative_library.purchase.MaterialPurchaseDialogFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class C23066OooO0oO extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ OooO0o f71326OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23066OooO0oO(OooO0o oooO0o) {
            super(0);
            this.f71326OooOo0o = oooO0o;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f71326OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.creative_library.purchase.MaterialPurchaseDialogFragment$OooO0oo, reason: case insensitive filesystem */
    public static final class C23067OooO0oo extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f71327OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23067OooO0oo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f71327OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f71327OooOo0o.getValue()).getViewModelStore();
        }
    }

    public static final class OooOO0 extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f71328OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f71328OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f71328OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? MaterialPurchaseDialogFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public MaterialPurchaseDialogFragment() {
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, new C23066OooO0oO(new OooO0o()));
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f71313Oooo000 = new C22026ooOO(oooo0.OooO0O0(com.orion.notein.p607ui.creative_library.purchase.OooO0o.class), new C23067OooO0oo(interfaceC32440OooOO0OooO0O0), new OooOO0(interfaceC32440OooOO0OooO0O0), new OooO(interfaceC32440OooOO0OooO0O0));
        this.f71314Oooo00O = new C22026ooOO(oooo0.OooO0O0(C26320o0000OoO.class), new OooO0OO(), new C23065OooO0o0(), new C23064OooO0Oo());
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final Integer OooOoO() {
        return Integer.valueOf(R.id.dialog_card);
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final int OooOoo() {
        return R.layout.material_purchase_dialog_host;
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final boolean OooOoo0() {
        return false;
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        OooOOO0.OooO0oO(dialog, "dialog");
        ((com.orion.notein.p607ui.creative_library.purchase.OooO0o) this.f71313Oooo000.getValue()).OooO0o0();
        super.onDismiss(dialog);
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Window window;
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
        c20358OooO00o.OooOOO0("MaterialPurchaseDialog");
        c20358OooO00o.OooO00o("MaterialPurchaseDialogFragment#onViewCreated invoked", new Object[0]);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            WindowCompat.setDecorFitsSystemWindows(window, false);
        }
        ViewCompat.setOnApplyWindowInsetsListener(view, new C22236OooO0Oo());
        View viewFindViewById = view.findViewById(R.id.btn_back);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new ViewOnClickListenerC28136OooO0O0(this, 0));
        }
        View viewFindViewById2 = view.findViewById(R.id.btn_close);
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(new ViewOnClickListenerC28137OooO0OO(this, 0));
        }
        Bundle arguments = getArguments();
        C22026ooOO c22026ooOO = this.f71313Oooo000;
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
        InterfaceC21987OooOoo viewLifecycleOwner2 = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner2), null, null, new OooO0O0(null), 3);
    }
}
