package com.orion.notein.p607ui.pay.aiquota;

import OooOoOO.C20519OooO0Oo;
import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.core.app.OooO;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22015OooooOo;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.o00Oo0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.OooOOOO;
import com.android.billingclient.api.C22161OooO0oO;
import com.android.billingclient.api.C22162OooO0oo;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.orion.notein.domain.models.NoteinFirebaseUser;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.pay.Event;
import com.orion.notein.p607ui.pay.State;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.Oooo0;
import o000o00.AbstractC24555OooO00o;
import o000o0O0.OooOO0;
import o00o00.C25206OooO0Oo;
import o00o00O0.C25252OooO0Oo;
import o0O0o0oO.o0OOO0o;
import o0O0o0oO.o0Oo0oo;
import o0O0o0oO.oo0o0Oo;
import o0O0oooO.C26320o0000OoO;
import o0Oo0O0.C28050OooO0OO;
import o0Oo0o0o.oo000o;
import o0o0OOo0.C30547OooO00o;
import o0o0OOo0.C30548OooO0O0;
import o0o0OOoO.C30552OooO0O0;
import o0o0OOoO.C30553OooO0OO;
import o0o0OOoO.C30554OooO0Oo;
import o0o0OOoO.C30558OooO0oo;
import o0oOoOo.C31042OooOOO0;
import o0oOoOo.C31058OooOooO;
import oO00ooO.C32438OooO0oO;
import oO00ooO.C32442OooOO0o;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32447OooOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33772OooooOo;
import oO0o0Oo.C33781o00o0O;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oOO00oo.C34406OooO00o;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/pay/aiquota/AiQuotaPayDialogFragment;", "Lcom/orion/notein/ui/BaseDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class AiQuotaPayDialogFragment extends Hilt_AiQuotaPayDialogFragment {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public TextView f78718Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public ViewGroup f78719Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final C22026ooOO f78720Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final C22026ooOO f78721Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public TextView f78722Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public RecyclerView f78723Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public C30547OooO00o f78724Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public C30548OooO0O0 f78725Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public RecyclerView f78726Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public TextView f78727Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public CheckBox f78728Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public CircularProgressIndicator f78729OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public CircularProgressIndicator f78730OoooO00;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pay.aiquota.AiQuotaPayDialogFragment$onViewCreated$7", m80623f = "AiQuotaPayDialogFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f78732OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.pay.aiquota.AiQuotaPayDialogFragment$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pay.aiquota.AiQuotaPayDialogFragment$onViewCreated$7$1", m80623f = "AiQuotaPayDialogFragment.kt", m80624l = {137}, m80625m = "invokeSuspend")
        public static final class C19456OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ AiQuotaPayDialogFragment f78733OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f78734OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.pay.aiquota.AiQuotaPayDialogFragment$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
            public static final class C19457OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ AiQuotaPayDialogFragment f78735OooOo0o;

                public C19457OooO00o(AiQuotaPayDialogFragment aiQuotaPayDialogFragment) {
                    this.f78735OooOo0o = aiQuotaPayDialogFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    State state = (State) obj;
                    AiQuotaPayDialogFragment aiQuotaPayDialogFragment = this.f78735OooOo0o;
                    aiQuotaPayDialogFragment.Oooo00o();
                    if (OooOOO0.OooO0O0(state, State.OooO0O0.f78711OooO00o) || OooOOO0.OooO0O0(state, State.C23768OooO0o0.f78715OooO00o)) {
                        aiQuotaPayDialogFragment.Oooo0O0();
                        RecyclerView recyclerView = aiQuotaPayDialogFragment.f78726Oooo0o0;
                        if (recyclerView == null) {
                            OooOOO0.OooOOOO("productList");
                            throw null;
                        }
                        recyclerView.setEnabled(true);
                    } else if (OooOOO0.OooO0O0(state, State.OooO0o.f78714OooO00o) || OooOOO0.OooO0O0(state, State.C23769OooO0oO.f78716OooO00o) || OooOOO0.OooO0O0(state, State.C23770OooO0oo.f78717OooO00o)) {
                        CircularProgressIndicator circularProgressIndicator = aiQuotaPayDialogFragment.f78730OoooO00;
                        if (circularProgressIndicator == null) {
                            OooOOO0.OooOOOO("cpiBtnPay");
                            throw null;
                        }
                        if (circularProgressIndicator.getVisibility() != 0) {
                            ViewGroup viewGroup = aiQuotaPayDialogFragment.f78719Oooo0;
                            if (viewGroup == null) {
                                OooOOO0.OooOOOO("btnCreateOrderWrapper");
                                throw null;
                            }
                            viewGroup.setClickable(false);
                            TextView textView = aiQuotaPayDialogFragment.f78722Oooo00o;
                            if (textView == null) {
                                OooOOO0.OooOOOO("txtCreateOrder");
                                throw null;
                            }
                            textView.setTextColor(0);
                            CircularProgressIndicator circularProgressIndicator2 = aiQuotaPayDialogFragment.f78730OoooO00;
                            if (circularProgressIndicator2 == null) {
                                OooOOO0.OooOOOO("cpiBtnPay");
                                throw null;
                            }
                            circularProgressIndicator2.setVisibility(0);
                            AnimationUtils.loadAnimation(aiQuotaPayDialogFragment.getContext(), R.anim.rotate_loop).setInterpolator(new LinearInterpolator());
                        }
                        RecyclerView recyclerView2 = aiQuotaPayDialogFragment.f78726Oooo0o0;
                        if (recyclerView2 == null) {
                            OooOOO0.OooOOOO("productList");
                            throw null;
                        }
                        recyclerView2.setEnabled(false);
                    } else {
                        if (!OooOOO0.OooO0O0(state, State.OooO0OO.f78712OooO00o) && !OooOOO0.OooO0O0(state, State.C23767OooO0Oo.f78713OooO00o)) {
                            throw new C32442OooOO0o();
                        }
                        aiQuotaPayDialogFragment.Oooo0O0();
                        RecyclerView recyclerView3 = aiQuotaPayDialogFragment.f78726Oooo0o0;
                        if (recyclerView3 == null) {
                            OooOOO0.OooOOOO("productList");
                            throw null;
                        }
                        recyclerView3.setEnabled(true);
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C19456OooO00o(AiQuotaPayDialogFragment aiQuotaPayDialogFragment, Continuation<? super C19456OooO00o> continuation) {
                super(2, continuation);
                this.f78733OooOo = aiQuotaPayDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19456OooO00o(this.f78733OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C19456OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f78734OooOo0o;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw OooOOOO.OooO0O0(obj);
                }
                C32446OooOOOo.OooO0O0(obj);
                AiQuotaPayDialogFragment aiQuotaPayDialogFragment = this.f78733OooOo;
                C30558OooO0oo c30558OooO0ooOooo0 = aiQuotaPayDialogFragment.Oooo0();
                C19457OooO00o c19457OooO00o = new C19457OooO00o(aiQuotaPayDialogFragment);
                this.f78734OooOo0o = 1;
                c30558OooO0ooOooo0.f109306OooOOO0.collect(c19457OooO00o, this);
                return enumC32485OooO00o;
            }
        }

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pay.aiquota.AiQuotaPayDialogFragment$onViewCreated$7$2", m80623f = "AiQuotaPayDialogFragment.kt", m80624l = {143}, m80625m = "invokeSuspend")
        public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ AiQuotaPayDialogFragment f78736OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f78737OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.pay.aiquota.AiQuotaPayDialogFragment$OooO00o$OooO0O0$OooO00o, reason: collision with other inner class name */
            public static final class C19458OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ AiQuotaPayDialogFragment f78738OooOo0o;

                public C19458OooO00o(AiQuotaPayDialogFragment aiQuotaPayDialogFragment) {
                    this.f78738OooOo0o = aiQuotaPayDialogFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    C32443OooOOO c32443OooOOO = (C32443OooOOO) obj;
                    State state = (State) c32443OooOOO.f116638OooOo0o;
                    boolean zOooO0O0 = OooOOO0.OooO0O0(state, State.C23769OooO0oO.f78716OooO00o);
                    AiQuotaPayDialogFragment aiQuotaPayDialogFragment = this.f78738OooOo0o;
                    if (zOooO0O0) {
                        B b = c32443OooOOO.f116637OooOo;
                        OooOOO0.OooO0o0(b, "null cannot be cast to non-null type kotlin.Pair<com.orion.notein.ui.vo.GoogleProductVO, com.android.billingclient.api.BillingFlowParams>");
                        C22161OooO0oO billingFlowParams = (C22161OooO0oO) ((C32443OooOOO) b).f116637OooOo;
                        ActivityC21897OooOo0 activity = aiQuotaPayDialogFragment.getActivity();
                        if (activity != null) {
                            C30558OooO0oo c30558OooO0ooOooo0 = aiQuotaPayDialogFragment.Oooo0();
                            OooOOO0.OooO0oO(billingFlowParams, "billingFlowParams");
                            C22162OooO0oo c22162OooO0ooOooO0OO = c30558OooO0ooOooo0.f109312OooOo.OooO0OO(activity, billingFlowParams);
                            OooOOO0.OooO0o(c22162OooO0ooOooO0OO, "launchBillingFlow(...)");
                            if (c22162OooO0ooOooO0OO.f66936OooO00o != 0) {
                                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o.OooOOO0("AiQuotaPayViewModel");
                                c20358OooO00o.OooO0OO(OooO.OooO00o(c22162OooO0ooOooO0OO.f66936OooO00o, "launchBillingFlow responseCode: ", ", error: ", c22162OooO0ooOooO0OO.f66938OooO0OO), new Object[0]);
                                c30558OooO0ooOooo0.OooO0oO(Event.OooO0O0.f78704OooO00o, null);
                            }
                        }
                    } else if (OooOOO0.OooO0O0(state, State.OooO0OO.f78712OooO00o)) {
                        InterfaceC21987OooOoo viewLifecycleOwner = aiQuotaPayDialogFragment.getViewLifecycleOwner();
                        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                        C21989OooOooO.OooO00o(viewLifecycleOwner).OooO0O0(new C30553OooO0OO(aiQuotaPayDialogFragment, null));
                    } else if (OooOOO0.OooO0O0(state, State.C23767OooO0Oo.f78713OooO00o)) {
                        InterfaceC21987OooOoo viewLifecycleOwner2 = aiQuotaPayDialogFragment.getViewLifecycleOwner();
                        OooOOO0.OooO0o(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
                        C21989OooOooO.OooO00o(viewLifecycleOwner2).OooO0O0(new C30554OooO0Oo(aiQuotaPayDialogFragment, null));
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(AiQuotaPayDialogFragment aiQuotaPayDialogFragment, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f78736OooOo = aiQuotaPayDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0O0(this.f78736OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f78737OooOo0o;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw OooOOOO.OooO0O0(obj);
                }
                C32446OooOOOo.OooO0O0(obj);
                AiQuotaPayDialogFragment aiQuotaPayDialogFragment = this.f78736OooOo;
                C33772OooooOo c33772OooooOo = aiQuotaPayDialogFragment.Oooo0().f109307OooOOOO;
                C19458OooO00o c19458OooO00o = new C19458OooO00o(aiQuotaPayDialogFragment);
                this.f78737OooOo0o = 1;
                c33772OooooOo.getClass();
                C33772OooooOo.OooOO0O(c33772OooooOo, c19458OooO00o, this);
                return enumC32485OooO00o;
            }
        }

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pay.aiquota.AiQuotaPayDialogFragment$onViewCreated$7$3", m80623f = "AiQuotaPayDialogFragment.kt", m80624l = {163}, m80625m = "invokeSuspend")
        public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ AiQuotaPayDialogFragment f78739OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f78740OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.pay.aiquota.AiQuotaPayDialogFragment$OooO00o$OooO0OO$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pay.aiquota.AiQuotaPayDialogFragment$onViewCreated$7$3$1", m80623f = "AiQuotaPayDialogFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class C19459OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<List<? extends C31058OooOooO>, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ AiQuotaPayDialogFragment f78741OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f78742OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C19459OooO00o(AiQuotaPayDialogFragment aiQuotaPayDialogFragment, Continuation<? super C19459OooO00o> continuation) {
                    super(2, continuation);
                    this.f78741OooOo = aiQuotaPayDialogFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    C19459OooO00o c19459OooO00o = new C19459OooO00o(this.f78741OooOo, continuation);
                    c19459OooO00o.f78742OooOo0o = obj;
                    return c19459OooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(List<? extends C31058OooOooO> list, Continuation<? super C32460OooOooO> continuation) {
                    return ((C19459OooO00o) create(list, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    List list = (List) this.f78742OooOo0o;
                    C30547OooO00o c30547OooO00o = this.f78741OooOo.f78724Oooo0OO;
                    if (c30547OooO00o != null) {
                        c30547OooO00o.OooO0Oo(list);
                        return C32460OooOooO.f116667OooO00o;
                    }
                    OooOOO0.OooOOOO("privilegeAdapter");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0OO(AiQuotaPayDialogFragment aiQuotaPayDialogFragment, Continuation<? super OooO0OO> continuation) {
                super(2, continuation);
                this.f78739OooOo = aiQuotaPayDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0OO(this.f78739OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f78740OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    AiQuotaPayDialogFragment aiQuotaPayDialogFragment = this.f78739OooOo;
                    C30558OooO0oo c30558OooO0ooOooo0 = aiQuotaPayDialogFragment.Oooo0();
                    C19459OooO00o c19459OooO00o = new C19459OooO00o(aiQuotaPayDialogFragment, null);
                    this.f78740OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c30558OooO0ooOooo0.f109316OooOo0o, c19459OooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.pay.aiquota.AiQuotaPayDialogFragment$OooO00o$OooO0Oo, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pay.aiquota.AiQuotaPayDialogFragment$onViewCreated$7$4", m80623f = "AiQuotaPayDialogFragment.kt", m80624l = {169}, m80625m = "invokeSuspend")
        public static final class C23771OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ AiQuotaPayDialogFragment f78743OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f78744OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.pay.aiquota.AiQuotaPayDialogFragment$OooO00o$OooO0Oo$OooO00o, reason: collision with other inner class name */
            public static final class C19460OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ AiQuotaPayDialogFragment f78745OooOo0o;

                public C19460OooO00o(AiQuotaPayDialogFragment aiQuotaPayDialogFragment) {
                    this.f78745OooOo0o = aiQuotaPayDialogFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    T next;
                    final List<T> list = (List) obj;
                    if (list == null) {
                        return C32460OooOooO.f116667OooO00o;
                    }
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = (T) null;
                            break;
                        }
                        next = it.next();
                        if (((C31042OooOOO0) next).f110833OooO0oo) {
                            break;
                        }
                    }
                    final AiQuotaPayDialogFragment aiQuotaPayDialogFragment = this.f78745OooOo0o;
                    C30548OooO0O0 c30548OooO0O0 = aiQuotaPayDialogFragment.f78725Oooo0o;
                    if (c30548OooO0O0 == null) {
                        OooOOO0.OooOOOO("productAdapter");
                        throw null;
                    }
                    final int itemCount = c30548OooO0O0.getItemCount();
                    C30548OooO0O0 c30548OooO0O02 = aiQuotaPayDialogFragment.f78725Oooo0o;
                    if (c30548OooO0O02 != null) {
                        c30548OooO0O02.OooO0o0(list, new Runnable() { // from class: o0o0OOoO.OooO0o0
                            @Override // java.lang.Runnable
                            public final void run() {
                                if (itemCount != 0) {
                                    return;
                                }
                                List list2 = list;
                                List list3 = list2;
                                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                                    Iterator it2 = list3.iterator();
                                    while (it2.hasNext()) {
                                        if (((C31042OooOOO0) it2.next()).f110833OooO0oo) {
                                            return;
                                        }
                                    }
                                }
                                if (list2.isEmpty()) {
                                    return;
                                }
                                C30558OooO0oo c30558OooO0ooOooo0 = aiQuotaPayDialogFragment.Oooo0();
                                C31042OooOOO0 vo = (C31042OooOOO0) OooOo.Oooo0oO(list2);
                                kotlin.jvm.internal.OooOOO0.OooO0oO(vo, "vo");
                                C33781o00o0O c33781o00o0O = c30558OooO0ooOooo0.f109310OooOOo0;
                                c33781o00o0O.getClass();
                                c33781o00o0O.OooOO0(null, vo);
                            }
                        });
                        return C32460OooOooO.f116667OooO00o;
                    }
                    OooOOO0.OooOOOO("productAdapter");
                    throw null;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23771OooO0Oo(AiQuotaPayDialogFragment aiQuotaPayDialogFragment, Continuation<? super C23771OooO0Oo> continuation) {
                super(2, continuation);
                this.f78743OooOo = aiQuotaPayDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23771OooO0Oo(this.f78743OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C23771OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f78744OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    AiQuotaPayDialogFragment aiQuotaPayDialogFragment = this.f78743OooOo;
                    C30558OooO0oo c30558OooO0ooOooo0 = aiQuotaPayDialogFragment.Oooo0();
                    C19460OooO00o c19460OooO00o = new C19460OooO00o(aiQuotaPayDialogFragment);
                    this.f78744OooOo0o = 1;
                    if (c30558OooO0ooOooo0.f109314OooOo00.f121747OooOo0o.collect(c19460OooO00o, this) == enumC32485OooO00o) {
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

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pay.aiquota.AiQuotaPayDialogFragment$onViewCreated$7$6", m80623f = "AiQuotaPayDialogFragment.kt", m80624l = {221}, m80625m = "invokeSuspend")
        public static final class OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ AiQuotaPayDialogFragment f78746OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f78747OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.pay.aiquota.AiQuotaPayDialogFragment$OooO00o$OooO0o$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pay.aiquota.AiQuotaPayDialogFragment$onViewCreated$7$6$1", m80623f = "AiQuotaPayDialogFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class C19461OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<NoteinFirebaseUser, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ AiQuotaPayDialogFragment f78748OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f78749OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C19461OooO00o(AiQuotaPayDialogFragment aiQuotaPayDialogFragment, Continuation<? super C19461OooO00o> continuation) {
                    super(2, continuation);
                    this.f78748OooOo = aiQuotaPayDialogFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    C19461OooO00o c19461OooO00o = new C19461OooO00o(this.f78748OooOo, continuation);
                    c19461OooO00o.f78749OooOo0o = obj;
                    return c19461OooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(NoteinFirebaseUser noteinFirebaseUser, Continuation<? super C32460OooOooO> continuation) {
                    return ((C19461OooO00o) create(noteinFirebaseUser, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    NoteinFirebaseUser noteinFirebaseUser = (NoteinFirebaseUser) this.f78749OooOo0o;
                    this.f78748OooOo.Oooo0().f109296OooO.setValue(noteinFirebaseUser != null ? noteinFirebaseUser.getId() : null);
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0o(AiQuotaPayDialogFragment aiQuotaPayDialogFragment, Continuation<? super OooO0o> continuation) {
                super(2, continuation);
                this.f78746OooOo = aiQuotaPayDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0o(this.f78746OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f78747OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    AiQuotaPayDialogFragment aiQuotaPayDialogFragment = this.f78746OooOo;
                    C26320o0000OoO c26320o0000OoO = (C26320o0000OoO) aiQuotaPayDialogFragment.f78721Oooo00O.getValue();
                    C19461OooO00o c19461OooO00o = new C19461OooO00o(aiQuotaPayDialogFragment, null);
                    this.f78747OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c26320o0000OoO.f90227OooOoOO, c19461OooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.pay.aiquota.AiQuotaPayDialogFragment$OooO00o$OooO0o0, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pay.aiquota.AiQuotaPayDialogFragment$onViewCreated$7$5", m80623f = "AiQuotaPayDialogFragment.kt", m80624l = {192}, m80625m = "invokeSuspend")
        public static final class C23772OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ AiQuotaPayDialogFragment f78750OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f78751OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.pay.aiquota.AiQuotaPayDialogFragment$OooO00o$OooO0o0$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pay.aiquota.AiQuotaPayDialogFragment$onViewCreated$7$5$1", m80623f = "AiQuotaPayDialogFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class C19462OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C32443OooOOO<? extends Integer, ? extends String>, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ AiQuotaPayDialogFragment f78752OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f78753OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C19462OooO00o(AiQuotaPayDialogFragment aiQuotaPayDialogFragment, Continuation<? super C19462OooO00o> continuation) {
                    super(2, continuation);
                    this.f78752OooOo = aiQuotaPayDialogFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    C19462OooO00o c19462OooO00o = new C19462OooO00o(this.f78752OooOo, continuation);
                    c19462OooO00o.f78753OooOo0o = obj;
                    return c19462OooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(C32443OooOOO<? extends Integer, ? extends String> c32443OooOOO, Continuation<? super C32460OooOooO> continuation) {
                    return ((C19462OooO00o) create(c32443OooOOO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    C32443OooOOO c32443OooOOO = (C32443OooOOO) this.f78753OooOo0o;
                    int iIntValue = ((Number) c32443OooOOO.f116638OooOo0o).intValue();
                    String string = (String) c32443OooOOO.f116637OooOo;
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    StringBuilder sbOooO00o = com.aspose.slides.internal.p332p7.OooOOOO.OooO00o(c20358OooO00o, "GooglePayDialogFragment", "pbl error: ", iIntValue, ", ");
                    sbOooO00o.append(string);
                    c20358OooO00o.OooO0o0(sbOooO00o.toString(), new Object[0]);
                    AiQuotaPayDialogFragment aiQuotaPayDialogFragment = this.f78752OooOo;
                    switch (iIntValue) {
                        case 100:
                            string = aiQuotaPayDialogFragment.getString(R.string.error_client_not_ready);
                            break;
                        case 101:
                            string = aiQuotaPayDialogFragment.getString(R.string.error_no_purchases);
                            break;
                        case 102:
                            string = aiQuotaPayDialogFragment.getString(R.string.error_order_no_purchased);
                            break;
                        case 103:
                            string = aiQuotaPayDialogFragment.getString(R.string.error_order_no_ack);
                            break;
                        case 104:
                            string = aiQuotaPayDialogFragment.getString(R.string.error_no_purchase_history);
                            break;
                    }
                    OooOOO0.OooO0Oo(string);
                    String string2 = aiQuotaPayDialogFragment.getString(R.string.pbl_error, new Integer(iIntValue), string);
                    OooOOO0.OooO0o(string2, "getString(...)");
                    Context context = aiQuotaPayDialogFragment.getContext();
                    if (context != null) {
                        C25206OooO0Oo.OooO0OO((ContextWrapper) context, string2);
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23772OooO0o0(AiQuotaPayDialogFragment aiQuotaPayDialogFragment, Continuation<? super C23772OooO0o0> continuation) {
                super(2, continuation);
                this.f78750OooOo = aiQuotaPayDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23772OooO0o0(this.f78750OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C23772OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f78751OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    AiQuotaPayDialogFragment aiQuotaPayDialogFragment = this.f78750OooOo;
                    C33772OooooOo c33772OooooOo = aiQuotaPayDialogFragment.Oooo0().f109311OooOOoo;
                    C19462OooO00o c19462OooO00o = new C19462OooO00o(aiQuotaPayDialogFragment, null);
                    this.f78751OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c33772OooooOo, c19462OooO00o, this) == enumC32485OooO00o) {
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

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = AiQuotaPayDialogFragment.this.new OooO00o(continuation);
            oooO00o.f78732OooOo0o = obj;
            return oooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f78732OooOo0o;
            AiQuotaPayDialogFragment aiQuotaPayDialogFragment = AiQuotaPayDialogFragment.this;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C19456OooO00o(aiQuotaPayDialogFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(aiQuotaPayDialogFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0OO(aiQuotaPayDialogFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23771OooO0Oo(aiQuotaPayDialogFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23772OooO0o0(aiQuotaPayDialogFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0o(aiQuotaPayDialogFragment, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public static final class OooO0O0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public OooO0O0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return AiQuotaPayDialogFragment.this.requireActivity().getViewModelStore();
        }
    }

    public static final class OooO0OO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public OooO0OO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return AiQuotaPayDialogFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.pay.aiquota.AiQuotaPayDialogFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23773OooO0Oo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public C23773OooO0Oo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return AiQuotaPayDialogFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class OooO0o extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f78757OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f78757OooOo0o = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((OooOO0) this.f78757OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.pay.aiquota.AiQuotaPayDialogFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23774OooO0o0 extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<OooOO0> {
        public C23774OooO0o0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final OooOO0 invoke() {
            return C21030OooOO0o.OooO0OO(AiQuotaPayDialogFragment.this).OooO0o(R.id.aiQuotaPayDialogFragment);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.pay.aiquota.AiQuotaPayDialogFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class C23775OooO0oO extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f78759OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23775OooO0oO(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f78759OooOo0o = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return ((OooOO0) this.f78759OooOo0o.getValue()).getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.pay.aiquota.AiQuotaPayDialogFragment$OooO0oo, reason: case insensitive filesystem */
    public static final class C23776OooO0oo extends kotlin.jvm.internal.OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f78760OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23776OooO0oo(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f78760OooOo = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            ActivityC21897OooOo0 activityC21897OooOo0RequireActivity = AiQuotaPayDialogFragment.this.requireActivity();
            OooOOO0.OooO0o(activityC21897OooOo0RequireActivity, "requireActivity()");
            return o000O0O0.OooO00o.OooO00o(activityC21897OooOo0RequireActivity, (C22015OooooOo) ((OooOO0) this.f78760OooOo.getValue()).getDefaultViewModelProviderFactory());
        }
    }

    public AiQuotaPayDialogFragment() {
        C32447OooOOo c32447OooOOoOooO0OO = C20519OooO0Oo.OooO0OO(new C23774OooO0o0());
        OooO0o oooO0o = new OooO0o(c32447OooOOoOooO0OO);
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f78720Oooo000 = new C22026ooOO(oooo0.OooO0O0(C30558OooO0oo.class), oooO0o, new C23776OooO0oo(c32447OooOOoOooO0OO), new C23775OooO0oO(c32447OooOOoOooO0OO));
        this.f78721Oooo00O = new C22026ooOO(oooo0.OooO0O0(C26320o0000OoO.class), new OooO0O0(), new C23773OooO0Oo(), new OooO0OO());
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final int OooOoo() {
        return R.layout.dialog_fragment_pay_google_ai_quota;
    }

    public final C30558OooO0oo Oooo0() {
        return (C30558OooO0oo) this.f78720Oooo000.getValue();
    }

    public final void Oooo00o() {
        ViewGroup viewGroup = this.f78719Oooo0;
        if (viewGroup == null) {
            OooOOO0.OooOOOO("btnCreateOrderWrapper");
            throw null;
        }
        CheckBox checkBox = this.f78728Oooo0oo;
        if (checkBox != null) {
            viewGroup.setActivated((!checkBox.isChecked() || OooOOO0.OooO0O0(Oooo0().f109306OooOOO0.getValue(), State.OooO0O0.f78711OooO00o) || OooOOO0.OooO0O0(Oooo0().f109306OooOOO0.getValue(), State.C23767OooO0Oo.f78713OooO00o)) ? false : true);
        } else {
            OooOOO0.OooOOOO("btnAgree");
            throw null;
        }
    }

    public final void Oooo0O0() {
        ViewGroup viewGroup = this.f78719Oooo0;
        if (viewGroup == null) {
            OooOOO0.OooOOOO("btnCreateOrderWrapper");
            throw null;
        }
        viewGroup.setClickable(true);
        TextView textView = this.f78722Oooo00o;
        if (textView == null) {
            OooOOO0.OooOOOO("txtCreateOrder");
            throw null;
        }
        textView.setTextColor(-1);
        CircularProgressIndicator circularProgressIndicator = this.f78730OoooO00;
        if (circularProgressIndicator != null) {
            circularProgressIndicator.setVisibility(8);
        } else {
            OooOOO0.OooOOOO("cpiBtnPay");
            throw null;
        }
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        view.findViewById(R.id.iv_back).setOnClickListener(new oo000o(this, 6));
        this.f78730OoooO00 = (CircularProgressIndicator) view.findViewById(R.id.cpi_btn_pay);
        this.f78729OoooO0 = (CircularProgressIndicator) view.findViewById(R.id.cpi_btn_restore_purchase);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.btn_create_order_wrapper);
        this.f78719Oooo0 = viewGroup;
        if (viewGroup == null) {
            OooOOO0.OooOOOO("btnCreateOrderWrapper");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewGroup, 1000L, new o0OOO0o(this, 5));
        this.f78722Oooo00o = (TextView) view.findViewById(R.id.btn_create_order);
        this.f78723Oooo0O0 = (RecyclerView) view.findViewById(R.id.rv_feature_list);
        C30547OooO00o c30547OooO00o = new C30547OooO00o();
        this.f78724Oooo0OO = c30547OooO00o;
        RecyclerView recyclerView = this.f78723Oooo0O0;
        if (recyclerView == null) {
            OooOOO0.OooOOOO("privilegeList");
            throw null;
        }
        recyclerView.setAdapter(c30547OooO00o);
        this.f78726Oooo0o0 = (RecyclerView) view.findViewById(R.id.product_list);
        C30548OooO0O0 c30548OooO0O0 = new C30548OooO0O0(C30548OooO0O0.OooO00o.f109270OooO00o);
        this.f78725Oooo0o = c30548OooO0O0;
        RecyclerView recyclerView2 = this.f78726Oooo0o0;
        if (recyclerView2 == null) {
            OooOOO0.OooOOOO("productList");
            throw null;
        }
        recyclerView2.setAdapter(c30548OooO0O0);
        c30548OooO0O0.f109269OooO0O0 = new o0Oo0oo(this, 5);
        CheckBox checkBox = (CheckBox) view.findViewById(R.id.agree);
        this.f78728Oooo0oo = checkBox;
        if (checkBox == null) {
            OooOOO0.OooOOOO("btnAgree");
            throw null;
        }
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o0o0OOoO.OooO00o
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton buttonView, boolean z) {
                kotlin.jvm.internal.OooOOO0.OooO0oO(buttonView, "buttonView");
                this.f109286OooO00o.Oooo00o();
            }
        });
        TextView textView = (TextView) view.findViewById(R.id.tv_agreement);
        this.f78727Oooo0oO = textView;
        if (textView == null) {
            OooOOO0.OooOOOO("btnAgreementLink");
            throw null;
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        TextView textView2 = this.f78727Oooo0oO;
        if (textView2 == null) {
            OooOOO0.OooOOOO("btnAgreementLink");
            throw null;
        }
        Context contextRequireContext = requireContext();
        OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
        String string = contextRequireContext.getString(R.string.vip_service_agreement);
        OooOOO0.OooO0o(string, "getString(...)");
        String string2 = contextRequireContext.getString(R.string.request_user_to_agree_something, string);
        OooOOO0.OooO0o(string2, "getString(...)");
        SpannableString spannableString = new SpannableString(string2);
        C30552OooO0O0 c30552OooO0O0 = new C30552OooO0O0(this);
        int iOooo0O0 = C33599OooOo0O.Oooo0O0(string2, string, 0, false, 6);
        CharSequence charSequence = string2;
        if (iOooo0O0 != -1) {
            spannableString.setSpan(c30552OooO0O0, iOooo0O0, string2.length(), 33);
            charSequence = spannableString;
        }
        textView2.setText(charSequence);
        TextView textView3 = (TextView) view.findViewById(R.id.btn_restore_purchase);
        this.f78718Oooo = textView3;
        if (textView3 == null) {
            OooOOO0.OooOOOO("btnRestorePurchase");
            throw null;
        }
        C28050OooO0OO.OooO00o(textView3, 500L, new oo0o0Oo(this, 3));
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooO00o(null), 3);
    }
}
