package com.orion.notein.p607ui.user.coupon;

import OooOoOO.C20519OooO0Oo;
import Oooo0.o000000O;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.InterfaceC22023o00ooo;
import androidx.lifecycle.o00Oo0;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.global.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import o000o00.AbstractC24555OooO00o;
import o0O0oooO.ViewOnClickListenerC26311Ooooooo;
import o0Oo0o00.ViewOnClickListenerC28179Oooo0;
import o0Oo0o00.ViewOnClickListenerC28182Oooo00o;
import o0o00Oo.C29899OooO0o0;
import o0oOo0O.C30946OooO00o;
import o0oOo0O.C30950OooO0o;
import oO00ooO.C32438OooO0oO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooO.EnumC32441OooOO0O;
import oO00ooO.InterfaceC32440OooOO0;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.InterfaceC33723OooO0oO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/user/coupon/UserCouponsDialogFragment;", "Lcom/orion/notein/ui/BaseDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class UserCouponsDialogFragment extends Hilt_UserCouponsDialogFragment {

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public C30946OooO00o f79680Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final C22026ooOO f79681Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public RecyclerView f79682Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public View f79683Oooo00o;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.user.coupon.UserCouponsDialogFragment$onViewCreated$5", m80623f = "UserCouponsDialogFragment.kt", m80624l = {78}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f79685OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.user.coupon.UserCouponsDialogFragment$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C19544OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ UserCouponsDialogFragment f79686OooOo0o;

            public C19544OooO00o(UserCouponsDialogFragment userCouponsDialogFragment) {
                this.f79686OooOo0o = userCouponsDialogFragment;
            }

            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public final Object emit(Object obj, Continuation continuation) {
                List<T> list = (List) obj;
                boolean zIsEmpty = list.isEmpty();
                UserCouponsDialogFragment userCouponsDialogFragment = this.f79686OooOo0o;
                if (zIsEmpty) {
                    RecyclerView recyclerView = userCouponsDialogFragment.f79682Oooo00O;
                    if (recyclerView == null) {
                        OooOOO0.OooOOOO("couponList");
                        throw null;
                    }
                    recyclerView.setVisibility(8);
                    View view = userCouponsDialogFragment.f79683Oooo00o;
                    if (view == null) {
                        OooOOO0.OooOOOO("emptyWrapper");
                        throw null;
                    }
                    view.setVisibility(0);
                } else {
                    RecyclerView recyclerView2 = userCouponsDialogFragment.f79682Oooo00O;
                    if (recyclerView2 == null) {
                        OooOOO0.OooOOOO("couponList");
                        throw null;
                    }
                    recyclerView2.setVisibility(0);
                    View view2 = userCouponsDialogFragment.f79683Oooo00o;
                    if (view2 == null) {
                        OooOOO0.OooOOOO("emptyWrapper");
                        throw null;
                    }
                    view2.setVisibility(8);
                }
                C30946OooO00o c30946OooO00o = userCouponsDialogFragment.f79680Oooo0;
                if (c30946OooO00o != null) {
                    c30946OooO00o.OooO0Oo(list);
                    return C32460OooOooO.f116667OooO00o;
                }
                OooOOO0.OooOOOO("couponAdapter");
                throw null;
            }
        }

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return UserCouponsDialogFragment.this.new OooO00o(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            return EnumC32485OooO00o.f116726OooOo0o;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f79685OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                UserCouponsDialogFragment userCouponsDialogFragment = UserCouponsDialogFragment.this;
                C30950OooO0o c30950OooO0o = (C30950OooO0o) userCouponsDialogFragment.f79681Oooo000.getValue();
                C19544OooO00o c19544OooO00o = new C19544OooO00o(userCouponsDialogFragment);
                this.f79685OooOo0o = 1;
                if (c30950OooO0o.f110610OooO0o.f121747OooOo0o.collect(c19544OooO00o, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            throw new C32438OooO0oO();
        }
    }

    public static final class OooO0O0 extends OooOOOO implements oO0O000o.OooO00o<Fragment> {
        public OooO0O0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Fragment invoke() {
            return UserCouponsDialogFragment.this;
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<InterfaceC22023o00ooo> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ OooO0O0 f79688OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(OooO0O0 oooO0O0) {
            super(0);
            this.f79688OooOo0o = oooO0O0;
        }

        @Override // oO0O000o.OooO00o
        public final InterfaceC22023o00ooo invoke() {
            return (InterfaceC22023o00ooo) this.f79688OooOo0o.invoke();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.user.coupon.UserCouponsDialogFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23866OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f79689OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23866OooO0Oo(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f79689OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((InterfaceC22023o00ooo) this.f79689OooOo0o.getValue()).getViewModelStore();
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Object f79690OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f79690OooOo = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            o00Oo0.OooO0O0 defaultViewModelProviderFactory;
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f79690OooOo.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return (oooOOOO == null || (defaultViewModelProviderFactory = oooOOOO.getDefaultViewModelProviderFactory()) == null) ? UserCouponsDialogFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.user.coupon.UserCouponsDialogFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23867OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f79692OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23867OooO0o0(InterfaceC32440OooOO0 interfaceC32440OooOO0) {
            super(0);
            this.f79692OooOo0o = interfaceC32440OooOO0;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            InterfaceC22023o00ooo interfaceC22023o00ooo = (InterfaceC22023o00ooo) this.f79692OooOo0o.getValue();
            androidx.lifecycle.OooOOOO oooOOOO = interfaceC22023o00ooo instanceof androidx.lifecycle.OooOOOO ? (androidx.lifecycle.OooOOOO) interfaceC22023o00ooo : null;
            return oooOOOO != null ? oooOOOO.getDefaultViewModelCreationExtras() : AbstractC24555OooO00o.C19630OooO00o.f83136OooO0O0;
        }
    }

    public UserCouponsDialogFragment() {
        InterfaceC32440OooOO0 interfaceC32440OooOO0OooO0O0 = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, new OooO0OO(new OooO0O0()));
        this.f79681Oooo000 = new C22026ooOO(C24035Oooo00o.f80943OooO00o.OooO0O0(C30950OooO0o.class), new C23866OooO0Oo(interfaceC32440OooOO0OooO0O0), new OooO0o(interfaceC32440OooOO0OooO0O0), new C23867OooO0o0(interfaceC32440OooOO0OooO0O0));
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final Integer OooOoO() {
        return Integer.valueOf(R.id.dialog_card);
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final int OooOoo() {
        return R.layout.dialog_user_coupons_container;
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        view.setClickable(true);
        view.setFocusableInTouchMode(true);
        View viewFindViewById = view.findViewById(R.id.dialog_card);
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(new ViewOnClickListenerC26311Ooooooo());
        }
        View viewFindViewById2 = view.findViewById(R.id.handle);
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
            Object parent = viewFindViewById2.getParent();
            View view2 = parent instanceof View ? (View) parent : null;
            if (view2 != null) {
                view2.setBackgroundColor(0);
            }
        }
        View viewFindViewById3 = view.findViewById(R.id.btn_close);
        if (viewFindViewById3 == null) {
            viewFindViewById3 = view.findViewById(R.id.btn_close_right);
            OooOOO0.OooO0o(viewFindViewById3, "findViewById(...)");
        }
        viewFindViewById3.setOnClickListener(new ViewOnClickListenerC28182Oooo00o(this, 5));
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rv_coupon);
        this.f79682Oooo00O = recyclerView;
        if (recyclerView == null) {
            OooOOO0.OooOOOO("couponList");
            throw null;
        }
        recyclerView.setItemAnimator(null);
        RecyclerView recyclerView2 = this.f79682Oooo00O;
        if (recyclerView2 == null) {
            OooOOO0.OooOOOO("couponList");
            throw null;
        }
        recyclerView2.setOverScrollMode(2);
        RecyclerView recyclerView3 = this.f79682Oooo00O;
        if (recyclerView3 == null) {
            OooOOO0.OooOOOO("couponList");
            throw null;
        }
        recyclerView3.setNestedScrollingEnabled(true);
        RecyclerView recyclerView4 = this.f79682Oooo00O;
        if (recyclerView4 == null) {
            OooOOO0.OooOOOO("couponList");
            throw null;
        }
        recyclerView4.addItemDecoration(new C29899OooO0o0(o000000O.OooO0o(16), 6));
        this.f79683Oooo00o = view.findViewById(R.id.empty_bg_wrapper);
        C30946OooO00o c30946OooO00o = new C30946OooO00o(C30946OooO00o.OooO0O0.f110600OooO00o);
        this.f79680Oooo0 = c30946OooO00o;
        RecyclerView recyclerView5 = this.f79682Oooo00O;
        if (recyclerView5 == null) {
            OooOOO0.OooOOOO("couponList");
            throw null;
        }
        recyclerView5.setAdapter(c30946OooO00o);
        C30946OooO00o c30946OooO00o2 = this.f79680Oooo0;
        if (c30946OooO00o2 == null) {
            OooOOO0.OooOOOO("couponAdapter");
            throw null;
        }
        c30946OooO00o2.f110595OooO0O0 = new ViewOnClickListenerC28179Oooo0(this, 4);
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooO00o(null), 3);
    }
}
