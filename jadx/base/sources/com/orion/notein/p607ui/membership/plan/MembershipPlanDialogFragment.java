package com.orion.notein.p607ui.membership.plan;

import OooOoOO.C20519OooO0Oo;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00Oo0;
import com.android.billingclient.api.C22172OooOoO;
import com.google.android.material.search.OooOO0O;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.membership.plan.OooO00o;
import com.orion.notein.p607ui.membership.purchase.MembershipPurchaseDialogFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import kotlin.jvm.internal.Oooo0;
import o000o00.AbstractC24555OooO00o;
import o0O0oooO.C26320o0000OoO;
import o0OoO0Oo.C28639OooOOO0;
import oO00ooO.EnumC32441OooOO0O;
import oO00ooO.InterfaceC32440OooOO0;
import oO0o0O0o.C33599OooOo0O;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/membership/plan/MembershipPlanDialogFragment;", "Lcom/orion/notein/ui/BaseDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class MembershipPlanDialogFragment extends Hilt_MembershipPlanDialogFragment {

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final C22026ooOO f72728Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final C22026ooOO f72729Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public String f72730Oooo00o;

    public static final class OooO extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f72731OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f72731OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f72731OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? MembershipPlanDialogFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class OooO00o implements OooO00o.InterfaceC19252OooO00o {
        public OooO00o() {
        }

        @Override // com.orion.notein.p607ui.membership.plan.OooO00o.InterfaceC19252OooO00o
        public final Context OooO00o() {
            Context contextRequireContext = MembershipPlanDialogFragment.this.requireContext();
            OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
            return contextRequireContext;
        }

        @Override // com.orion.notein.p607ui.membership.plan.OooO00o.InterfaceC19252OooO00o
        public final int OooO0O0() {
            return MembershipPlanDialogFragment.this.getResources().getDimensionPixelSize(R.dimen.membership_item_spacing);
        }

        @Override // com.orion.notein.p607ui.membership.plan.OooO00o.InterfaceC19252OooO00o
        public final void OooO0OO(String str, String str2) {
            MembershipPlanDialogFragment membershipPlanDialogFragment = MembershipPlanDialogFragment.this;
            MembershipPurchaseDialogFragment membershipPurchaseDialogFragment = new MembershipPurchaseDialogFragment();
            Bundle bundleOooO00o = C22172OooOoO.OooO00o("product_code", str);
            if (str2 != null) {
                if (C33599OooOo0O.Oooo0o0(str2)) {
                    str2 = null;
                }
                if (str2 != null) {
                    bundleOooO00o.putString("coupon_id", str2);
                }
            }
            membershipPurchaseDialogFragment.setArguments(bundleOooO00o);
            membershipPurchaseDialogFragment.show(membershipPlanDialogFragment.getParentFragmentManager(), "PayDialogFragment");
        }
    }

    public static final class OooO0O0 extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public OooO0O0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return MembershipPlanDialogFragment.this.requireActivity().getViewModelStore();
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public OooO0OO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return MembershipPlanDialogFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.membership.plan.MembershipPlanDialogFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23207OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public C23207OooO0Oo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return MembershipPlanDialogFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C23208OooO0o0 f72737OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(C23208OooO0o0 c23208OooO0o0) {
            super(0);
            this.f72737OooOo0o = c23208OooO0o0;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f72737OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.membership.plan.MembershipPlanDialogFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23208OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public C23208OooO0o0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return MembershipPlanDialogFragment.this;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.membership.plan.MembershipPlanDialogFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class C23209OooO0oO extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f72739OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23209OooO0oO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f72739OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f72739OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.membership.plan.MembershipPlanDialogFragment$OooO0oo, reason: case insensitive filesystem */
    public static final class C23210OooO0oo extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f72740OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23210OooO0oo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f72740OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f72740OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    public MembershipPlanDialogFragment() {
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, new OooO0o(new C23208OooO0o0()));
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f72728Oooo000 = new C22026ooOO(oooo0.OooO0O0(C28639OooOOO0.class), new C23209OooO0oO(interfaceC32440OooOO0OooO0O0), new OooO(interfaceC32440OooOO0OooO0O0), new C23210OooO0oo(interfaceC32440OooOO0OooO0O0));
        this.f72729Oooo00O = new C22026ooOO(oooo0.OooO0O0(C26320o0000OoO.class), new OooO0O0(), new C23207OooO0Oo(), new OooO0OO());
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final Integer OooOoO() {
        return Integer.valueOf(R.id.dialog_card);
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final int OooOoo() {
        return R.layout.membership_plan_dialog_host;
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final boolean OooOoo0() {
        return false;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.getString("product_code");
            this.f72730Oooo00o = arguments.getString("coupon_id");
        }
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        view.findViewById(R.id.btn_close).setOnClickListener(new OooOO0O(this, 2));
        OooO00o oooO00o = new OooO00o();
        C28639OooOOO0 c28639OooOOO0 = (C28639OooOOO0) this.f72728Oooo000.getValue();
        C26320o0000OoO c26320o0000OoO = (C26320o0000OoO) this.f72729Oooo00O.getValue();
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        new com.orion.notein.p607ui.membership.plan.OooO00o(view, oooO00o, c28639OooOOO0, c26320o0000OoO, C21989OooOooO.OooO00o(viewLifecycleOwner), this.f72730Oooo00o).OooO00o();
    }
}
