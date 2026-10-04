package com.orion.notein.p607ui.membership.plan;

import OooOoOO.C20519OooO0Oo;
import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00Oo0;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.membership.plan.OooO00o;
import kotlin.Metadata;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import kotlin.jvm.internal.Oooo0;
import o000o00.AbstractC24555OooO00o;
import o0O0oooO.C26320o0000OoO;
import o0Oo00o.C28026OooO0OO;
import o0OoO0Oo.C28630OooO0OO;
import o0OoO0Oo.C28639OooOOO0;
import oO00ooO.EnumC32441OooOO0O;
import oO00ooO.InterfaceC32440OooOO0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/membership/plan/MembershipPlanBottomSheet;", "Lcom/orion/notein/ui/RoundBottomSheetDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class MembershipPlanBottomSheet extends Hilt_MembershipPlanBottomSheet {

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final C22026ooOO f72715OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final C22026ooOO f72716OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public String f72717Oooo000;

    public static final class OooO extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f72718OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f72718OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f72718OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? MembershipPlanBottomSheet.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public static final class OooO00o implements OooO00o.InterfaceC19252OooO00o {
        public OooO00o() {
        }

        @Override // com.orion.notein.p607ui.membership.plan.OooO00o.InterfaceC19252OooO00o
        public final Context OooO00o() {
            Context contextRequireContext = MembershipPlanBottomSheet.this.requireContext();
            OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
            return contextRequireContext;
        }

        @Override // com.orion.notein.p607ui.membership.plan.OooO00o.InterfaceC19252OooO00o
        public final int OooO0O0() {
            Context contextRequireContext = MembershipPlanBottomSheet.this.requireContext();
            OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
            return oO0O00O.OooO00o.OooO0O0(TypedValue.applyDimension(1, 12.0f, contextRequireContext.getResources().getDisplayMetrics()));
        }

        @Override // com.orion.notein.p607ui.membership.plan.OooO00o.InterfaceC19252OooO00o
        public final void OooO0OO(String str, String str2) {
            MembershipPlanBottomSheet membershipPlanBottomSheet = MembershipPlanBottomSheet.this;
            C28026OooO0OO.OooO0O0(C21030OooOO0o.OooO0OO(membershipPlanBottomSheet), new C28630OooO0OO(str, str2));
        }
    }

    public static final class OooO0O0 extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public OooO0O0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return MembershipPlanBottomSheet.this.requireActivity().getViewModelStore();
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public OooO0OO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return MembershipPlanBottomSheet.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.membership.plan.MembershipPlanBottomSheet$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23203OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public C23203OooO0Oo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return MembershipPlanBottomSheet.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C23204OooO0o0 f72724OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(C23204OooO0o0 c23204OooO0o0) {
            super(0);
            this.f72724OooOo0o = c23204OooO0o0;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f72724OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.membership.plan.MembershipPlanBottomSheet$OooO0o0, reason: case insensitive filesystem */
    public static final class C23204OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public C23204OooO0o0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return MembershipPlanBottomSheet.this;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.membership.plan.MembershipPlanBottomSheet$OooO0oO, reason: case insensitive filesystem */
    public static final class C23205OooO0oO extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f72726OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23205OooO0oO(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f72726OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f72726OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.membership.plan.MembershipPlanBottomSheet$OooO0oo, reason: case insensitive filesystem */
    public static final class C23206OooO0oo extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f72727OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23206OooO0oo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f72727OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f72727OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    public MembershipPlanBottomSheet() {
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, new OooO0o(new C23204OooO0o0()));
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f72715OooOooO = new C22026ooOO(oooo0.OooO0O0(C28639OooOOO0.class), new C23205OooO0oO(interfaceC32440OooOO0OooO0O0), new OooO(interfaceC32440OooOO0OooO0O0), new C23206OooO0oo(interfaceC32440OooOO0OooO0O0));
        this.f72716OooOooo = new C22026ooOO(oooo0.OooO0O0(C26320o0000OoO.class), new OooO0O0(), new C23203OooO0Oo(), new OooO0OO());
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            arguments.getString("product_code");
            this.f72717Oooo000 = arguments.getString("coupon_id");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        OooOOO0.OooO0oO(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.membership_plan_bottom_sheet_host, viewGroup, false);
        OooOOO0.OooO0o(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.orion.notein.p607ui.RoundBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        int iValueOf;
        if (getResources().getConfiguration().orientation == 2) {
            Context contextRequireContext = requireContext();
            OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
            iValueOf = Integer.valueOf(Math.min(getResources().getDisplayMetrics().widthPixels, oO0O00O.OooO00o.OooO0O0(TypedValue.applyDimension(1, 500.0f, contextRequireContext.getResources().getDisplayMetrics()))));
        } else {
            iValueOf = -1;
        }
        this.f70450OooOo = iValueOf;
        this.f70451OooOo0o = -2;
        super.onStart();
    }

    @Override // com.orion.notein.p607ui.RoundBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        OooO00o oooO00o = new OooO00o();
        C28639OooOOO0 c28639OooOOO0 = (C28639OooOOO0) this.f72715OooOooO.getValue();
        C26320o0000OoO c26320o0000OoO = (C26320o0000OoO) this.f72716OooOooo.getValue();
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        new com.orion.notein.p607ui.membership.plan.OooO00o(view, oooO00o, c28639OooOOO0, c26320o0000OoO, C21989OooOooO.OooO00o(viewLifecycleOwner), this.f72717Oooo000).OooO00o();
    }
}
