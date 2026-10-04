package com.orion.notein.p607ui.pay.google;

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
import androidx.core.content.C21650OooOoO;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.fragment.app.C21904OooOoo0;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22015OooooOo;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.o00Oo0;
import androidx.recyclerview.widget.RecyclerView;
import com.android.billingclient.api.C22161OooO0oO;
import com.android.billingclient.api.C22162OooO0oo;
import com.android.billingclient.api.OooOO0O;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.orion.notein.domain.models.NoteinFirebaseUser;
import com.orion.notein.domain.models.transactions.google.NoteinGoogleSubscriptionPurchase;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.pay.Event;
import com.orion.notein.p607ui.pay.State;
import com.orion.notein.p607ui.pay.google.GooglePayDialogFragment;
import java.time.Period;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import kotlin.jvm.internal.Oooo0;
import o000o00.AbstractC24555OooO00o;
import o000o0O0.C24568OooO0oO;
import o000o0O0.OooOO0;
import o00o00.C25206OooO0Oo;
import o00o00O0.C25252OooO0Oo;
import o0O0oO.ViewOnClickListenerC26091OooO00o;
import o0O0oooO.C26320o0000OoO;
import o0Oo0O0.C28050OooO0OO;
import o0OoO000.ViewOnClickListenerC28540OooOoOO;
import o0OoO000.ViewOnClickListenerC28542OooOoo0;
import o0OoOOo.ViewOnClickListenerC29131OooO0o;
import o0OoOOo.ViewOnClickListenerC29133OooO0oO;
import o0o0OOo0.C30549OooO0OO;
import o0o0OOoo.C30569OooO;
import o0o0OOoo.C30577OooO0oo;
import o0o0OOoo.C30578OooOO0;
import o0o0OOoo.C30582OooOOO0;
import o0o0OOoo.C30584OooOOOo;
import o0oOoOo.C31042OooOOO0;
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

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/pay/google/GooglePayDialogFragment;", "Lcom/orion/notein/ui/BaseDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class GooglePayDialogFragment extends Hilt_GooglePayDialogFragment {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public CheckBox f78786Oooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public TextView f78787Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final C24568OooO0oO f78788Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final C22026ooOO f78789Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final C22026ooOO f78790Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public TextView f78791Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public ViewGroup f78792Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public C30549OooO0OO f78793Oooo0o;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public RecyclerView f78794Oooo0o0;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public TextView f78795Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public TextView f78796Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public CircularProgressIndicator f78797OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public TextView f78798OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public CircularProgressIndicator f78799OoooO0O;

    public static final class OooO extends OooOOOO implements oO0O000o.OooO00o<Bundle> {
        public OooO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Bundle invoke() {
            GooglePayDialogFragment googlePayDialogFragment = GooglePayDialogFragment.this;
            Bundle arguments = googlePayDialogFragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + googlePayDialogFragment + " has null arguments");
        }
    }

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pay.google.GooglePayDialogFragment$onViewCreated$7", m80623f = "GooglePayDialogFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f78802OooOo0o;

        /* JADX INFO: renamed from: com.orion.notein.ui.pay.google.GooglePayDialogFragment$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pay.google.GooglePayDialogFragment$onViewCreated$7$1", m80623f = "GooglePayDialogFragment.kt", m80624l = {162}, m80625m = "invokeSuspend")
        public static final class C19463OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ GooglePayDialogFragment f78803OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f78804OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.pay.google.GooglePayDialogFragment$OooO00o$OooO00o$OooO00o, reason: collision with other inner class name */
            public static final class C19464OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ GooglePayDialogFragment f78805OooOo0o;

                public C19464OooO00o(GooglePayDialogFragment googlePayDialogFragment) {
                    this.f78805OooOo0o = googlePayDialogFragment;
                }

                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    State state = (State) obj;
                    GooglePayDialogFragment googlePayDialogFragment = this.f78805OooOo0o;
                    googlePayDialogFragment.Oooo00o();
                    if (OooOOO0.OooO0O0(state, State.OooO0O0.f78711OooO00o) || OooOOO0.OooO0O0(state, State.C23768OooO0o0.f78715OooO00o)) {
                        googlePayDialogFragment.Oooo0O0();
                        RecyclerView recyclerView = googlePayDialogFragment.f78794Oooo0o0;
                        if (recyclerView == null) {
                            OooOOO0.OooOOOO("productList");
                            throw null;
                        }
                        recyclerView.setEnabled(true);
                    } else if (OooOOO0.OooO0O0(state, State.OooO0o.f78714OooO00o) || OooOOO0.OooO0O0(state, State.C23769OooO0oO.f78716OooO00o) || OooOOO0.OooO0O0(state, State.C23770OooO0oo.f78717OooO00o)) {
                        CircularProgressIndicator circularProgressIndicator = googlePayDialogFragment.f78797OoooO0;
                        if (circularProgressIndicator == null) {
                            OooOOO0.OooOOOO("cpiBtnPay");
                            throw null;
                        }
                        if (circularProgressIndicator.getVisibility() != 0) {
                            ViewGroup viewGroup = googlePayDialogFragment.f78792Oooo0OO;
                            if (viewGroup == null) {
                                OooOOO0.OooOOOO("btnCreateOrderWrapper");
                                throw null;
                            }
                            viewGroup.setClickable(false);
                            TextView textView = googlePayDialogFragment.f78791Oooo0O0;
                            if (textView == null) {
                                OooOOO0.OooOOOO("txtCreateOrder");
                                throw null;
                            }
                            textView.setTextColor(0);
                            CircularProgressIndicator circularProgressIndicator2 = googlePayDialogFragment.f78797OoooO0;
                            if (circularProgressIndicator2 == null) {
                                OooOOO0.OooOOOO("cpiBtnPay");
                                throw null;
                            }
                            circularProgressIndicator2.setVisibility(0);
                            AnimationUtils.loadAnimation(googlePayDialogFragment.getContext(), R.anim.rotate_loop).setInterpolator(new LinearInterpolator());
                        }
                        RecyclerView recyclerView2 = googlePayDialogFragment.f78794Oooo0o0;
                        if (recyclerView2 == null) {
                            OooOOO0.OooOOOO("productList");
                            throw null;
                        }
                        recyclerView2.setEnabled(false);
                    } else {
                        if (!OooOOO0.OooO0O0(state, State.OooO0OO.f78712OooO00o) && !OooOOO0.OooO0O0(state, State.C23767OooO0Oo.f78713OooO00o)) {
                            throw new C32442OooOO0o();
                        }
                        googlePayDialogFragment.Oooo0O0();
                        RecyclerView recyclerView3 = googlePayDialogFragment.f78794Oooo0o0;
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
            public C19463OooO00o(GooglePayDialogFragment googlePayDialogFragment, Continuation<? super C19463OooO00o> continuation) {
                super(2, continuation);
                this.f78803OooOo = googlePayDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C19463OooO00o(this.f78803OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((C19463OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f78804OooOo0o;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw androidx.transition.OooOOOO.OooO0O0(obj);
                }
                C32446OooOOOo.OooO0O0(obj);
                GooglePayDialogFragment googlePayDialogFragment = this.f78803OooOo;
                C30584OooOOOo c30584OooOOOoOooo0 = googlePayDialogFragment.Oooo0();
                C19464OooO00o c19464OooO00o = new C19464OooO00o(googlePayDialogFragment);
                this.f78804OooOo0o = 1;
                c30584OooOOOoOooo0.f109409OooOOO0.collect(c19464OooO00o, this);
                return enumC32485OooO00o;
            }
        }

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pay.google.GooglePayDialogFragment$onViewCreated$7$2", m80623f = "GooglePayDialogFragment.kt", m80624l = {168}, m80625m = "invokeSuspend")
        public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ GooglePayDialogFragment f78806OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f78807OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.pay.google.GooglePayDialogFragment$OooO00o$OooO0O0$OooO00o, reason: collision with other inner class name */
            public static final class C19465OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ GooglePayDialogFragment f78808OooOo0o;

                public C19465OooO00o(GooglePayDialogFragment googlePayDialogFragment) {
                    this.f78808OooOo0o = googlePayDialogFragment;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                public final Object emit(Object obj, Continuation continuation) {
                    C32443OooOOO c32443OooOOO = (C32443OooOOO) obj;
                    State state = (State) c32443OooOOO.f116638OooOo0o;
                    boolean zOooO0O0 = OooOOO0.OooO0O0(state, State.C23769OooO0oO.f78716OooO00o);
                    GooglePayDialogFragment googlePayDialogFragment = this.f78808OooOo0o;
                    if (zOooO0O0) {
                        B b = c32443OooOOO.f116637OooOo;
                        OooOOO0.OooO0o0(b, "null cannot be cast to non-null type kotlin.Pair<com.orion.notein.ui.vo.GoogleProductVO, com.android.billingclient.api.BillingFlowParams>");
                        C22161OooO0oO billingFlowParams = (C22161OooO0oO) ((C32443OooOOO) b).f116637OooOo;
                        ActivityC21897OooOo0 activity = googlePayDialogFragment.getActivity();
                        if (activity != null) {
                            C30584OooOOOo c30584OooOOOoOooo0 = googlePayDialogFragment.Oooo0();
                            OooOOO0.OooO0oO(billingFlowParams, "billingFlowParams");
                            C22162OooO0oo c22162OooO0ooOooO0OO = c30584OooOOOoOooo0.f109420OooOoO.OooO0OO(activity, billingFlowParams);
                            OooOOO0.OooO0o(c22162OooO0ooOooO0OO, "launchBillingFlow(...)");
                            if (c22162OooO0ooOooO0OO.f66936OooO00o != 0) {
                                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                                c20358OooO00o.OooOOO0("PayViewModel");
                                c20358OooO00o.OooO0OO(androidx.core.app.OooO.OooO00o(c22162OooO0ooOooO0OO.f66936OooO00o, "launchBillingFlow responseCode: ", ", error: ", c22162OooO0ooOooO0OO.f66938OooO0OO), new Object[0]);
                                c30584OooOOOoOooo0.OooO0oo(Event.OooO0O0.f78704OooO00o, null);
                            }
                        }
                    } else if (OooOOO0.OooO0O0(state, State.OooO0OO.f78712OooO00o)) {
                        InterfaceC21987OooOoo viewLifecycleOwner = googlePayDialogFragment.getViewLifecycleOwner();
                        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                        C21989OooOooO.OooO00o(viewLifecycleOwner).OooO0O0(new C30569OooO(googlePayDialogFragment, null));
                    } else if (OooOOO0.OooO0O0(state, State.C23767OooO0Oo.f78713OooO00o)) {
                        InterfaceC21987OooOoo viewLifecycleOwner2 = googlePayDialogFragment.getViewLifecycleOwner();
                        OooOOO0.OooO0o(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
                        C21989OooOooO.OooO00o(viewLifecycleOwner2).OooO0O0(new C30578OooOO0(googlePayDialogFragment, null));
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO0O0(GooglePayDialogFragment googlePayDialogFragment, Continuation<? super OooO0O0> continuation) {
                super(2, continuation);
                this.f78806OooOo = googlePayDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0O0(this.f78806OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f78807OooOo0o;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    throw androidx.transition.OooOOOO.OooO0O0(obj);
                }
                C32446OooOOOo.OooO0O0(obj);
                GooglePayDialogFragment googlePayDialogFragment = this.f78806OooOo;
                C33772OooooOo c33772OooooOo = googlePayDialogFragment.Oooo0().f109410OooOOOO;
                C19465OooO00o c19465OooO00o = new C19465OooO00o(googlePayDialogFragment);
                this.f78807OooOo0o = 1;
                c33772OooooOo.getClass();
                C33772OooooOo.OooOO0O(c33772OooooOo, c19465OooO00o, this);
                return enumC32485OooO00o;
            }
        }

        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pay.google.GooglePayDialogFragment$onViewCreated$7$3", m80623f = "GooglePayDialogFragment.kt", m80624l = {188}, m80625m = "invokeSuspend")
        public static final class OooO0OO extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ GooglePayDialogFragment f78809OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f78810OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.pay.google.GooglePayDialogFragment$OooO00o$OooO0OO$OooO00o, reason: collision with other inner class name */
            public static final class C19466OooO00o<T> implements InterfaceC33723OooO0oO {

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public final /* synthetic */ GooglePayDialogFragment f78811OooOo0o;

                public C19466OooO00o(GooglePayDialogFragment googlePayDialogFragment) {
                    this.f78811OooOo0o = googlePayDialogFragment;
                }

                /* JADX WARN: Removed duplicated region for block: B:59:0x011f  */
                @Override // oO0o0Oo.InterfaceC33723OooO0oO
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    T next;
                    String string;
                    String strOooO00o;
                    OooOO0O.C22163OooO0Oo c22163OooO0Oo;
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
                    C31042OooOOO0 c31042OooOOO0 = next;
                    final GooglePayDialogFragment googlePayDialogFragment = this.f78811OooOo0o;
                    if (c31042OooOOO0 == null) {
                        TextView textView = googlePayDialogFragment.f78791Oooo0O0;
                        if (textView == null) {
                            OooOOO0.OooOOOO("txtCreateOrder");
                            throw null;
                        }
                        textView.setText(googlePayDialogFragment.getString(R.string.btn_confirm_and_pay));
                        TextView textView2 = googlePayDialogFragment.f78795Oooo0oO;
                        if (textView2 == null) {
                            OooOOO0.OooOOOO("autoRenameHint");
                            throw null;
                        }
                        textView2.setVisibility(4);
                        TextView textView3 = googlePayDialogFragment.f78787Oooo0;
                        if (textView3 == null) {
                            OooOOO0.OooOOOO("productTips");
                            throw null;
                        }
                        textView3.setText(googlePayDialogFragment.getString(R.string.upgrade_to_premium));
                    } else {
                        C32447OooOOo c32447OooOOo = c31042OooOOO0.f110834OooOO0;
                        if (((Boolean) c32447OooOOo.getValue()).booleanValue()) {
                            TextView textView4 = googlePayDialogFragment.f78787Oooo0;
                            if (textView4 == null) {
                                OooOOO0.OooOOOO("productTips");
                                throw null;
                            }
                            textView4.setText(googlePayDialogFragment.getString(R.string.try_vip_for_free));
                        } else {
                            TextView textView5 = googlePayDialogFragment.f78787Oooo0;
                            if (textView5 == null) {
                                OooOOO0.OooOOOO("productTips");
                                throw null;
                            }
                            textView5.setText(googlePayDialogFragment.getString(R.string.upgrade_to_premium));
                        }
                        TextView textView6 = googlePayDialogFragment.f78791Oooo0O0;
                        if (textView6 == null) {
                            OooOOO0.OooOOOO("txtCreateOrder");
                            throw null;
                        }
                        NoteinGoogleSubscriptionPurchase noteinGoogleSubscriptionPurchase = ((C30582OooOOO0) googlePayDialogFragment.f78788Oooo000.getValue()).f109398OooO00o;
                        OooOO0O.OooO00o oooO00o = c31042OooOOO0.f110827OooO0O0;
                        if (noteinGoogleSubscriptionPurchase != null) {
                            string = googlePayDialogFragment.getString(R.string.upgrade_now);
                        } else if (((Boolean) c32447OooOOo.getValue()).booleanValue()) {
                            Context contextRequireContext = googlePayDialogFragment.requireContext();
                            OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
                            if (!((Boolean) c32447OooOOo.getValue()).booleanValue() || (c22163OooO0Oo = c31042OooOOO0.f110828OooO0OO) == null) {
                                strOooO00o = null;
                                string = googlePayDialogFragment.getString(R.string.btn_start_free_trial_2, strOooO00o);
                            } else {
                                Period period = Period.parse(((OooOO0O.OooO0O0) c22163OooO0Oo.f66970OooO0Oo.f66966OooO00o.get(0)).f66964OooO0Oo);
                                if (period.getYears() > 0) {
                                    strOooO00o = C21650OooOoO.OooO00o(period.getYears() * 12, contextRequireContext.getString(R.string._month));
                                } else if (period.getMonths() > 0) {
                                    strOooO00o = C21650OooOoO.OooO00o(period.getMonths(), contextRequireContext.getString(R.string._month));
                                } else if (period.getDays() > 0) {
                                    strOooO00o = C21650OooOoO.OooO00o(period.getDays(), contextRequireContext.getString(R.string._day));
                                }
                                string = googlePayDialogFragment.getString(R.string.btn_start_free_trial_2, strOooO00o);
                            }
                        } else {
                            string = oooO00o != null ? googlePayDialogFragment.getString(R.string.btn_confirm_and_pay) : googlePayDialogFragment.getString(R.string.btn_subscribe);
                        }
                        textView6.setText(string);
                        if (oooO00o == null && ((Boolean) c31042OooOOO0.f110836OooOO0o.getValue()).booleanValue()) {
                            TextView textView7 = googlePayDialogFragment.f78795Oooo0oO;
                            if (textView7 == null) {
                                OooOOO0.OooOOOO("autoRenameHint");
                                throw null;
                            }
                            textView7.setVisibility(0);
                        } else {
                            TextView textView8 = googlePayDialogFragment.f78795Oooo0oO;
                            if (textView8 == null) {
                                OooOOO0.OooOOOO("autoRenameHint");
                                throw null;
                            }
                            textView8.setVisibility(4);
                        }
                    }
                    C30549OooO0OO c30549OooO0OO = googlePayDialogFragment.f78793Oooo0o;
                    if (c30549OooO0OO == null) {
                        OooOOO0.OooOOOO("productAdapter");
                        throw null;
                    }
                    final int itemCount = c30549OooO0OO.getItemCount();
                    C30549OooO0OO c30549OooO0OO2 = googlePayDialogFragment.f78793Oooo0o;
                    if (c30549OooO0OO2 != null) {
                        c30549OooO0OO2.OooO0o0(list, new Runnable() { // from class: o0o0OOoo.OooOO0O
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
                                C30584OooOOOo c30584OooOOOoOooo0 = googlePayDialogFragment.Oooo0();
                                C31042OooOOO0 vo = (C31042OooOOO0) oOo000Oo.OooOo.Oooo0oO(list2);
                                kotlin.jvm.internal.OooOOO0.OooO0oO(vo, "vo");
                                C33781o00o0O c33781o00o0O = c30584OooOOOoOooo0.f109413OooOOo0;
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
            public OooO0OO(GooglePayDialogFragment googlePayDialogFragment, Continuation<? super OooO0OO> continuation) {
                super(2, continuation);
                this.f78809OooOo = googlePayDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new OooO0OO(this.f78809OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                ((OooO0OO) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                return EnumC32485OooO00o.f116726OooOo0o;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f78810OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    GooglePayDialogFragment googlePayDialogFragment = this.f78809OooOo;
                    C30584OooOOOo c30584OooOOOoOooo0 = googlePayDialogFragment.Oooo0();
                    C19466OooO00o c19466OooO00o = new C19466OooO00o(googlePayDialogFragment);
                    this.f78810OooOo0o = 1;
                    if (c30584OooOOOoOooo0.f109419OooOo0o.f121747OooOo0o.collect(c19466OooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.pay.google.GooglePayDialogFragment$OooO00o$OooO0Oo, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pay.google.GooglePayDialogFragment$onViewCreated$7$4", m80623f = "GooglePayDialogFragment.kt", m80624l = {211}, m80625m = "invokeSuspend")
        public static final class C23779OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ GooglePayDialogFragment f78812OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f78813OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.pay.google.GooglePayDialogFragment$OooO00o$OooO0Oo$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pay.google.GooglePayDialogFragment$onViewCreated$7$4$1", m80623f = "GooglePayDialogFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class C19467OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C32443OooOOO<? extends Integer, ? extends String>, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ GooglePayDialogFragment f78814OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f78815OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C19467OooO00o(GooglePayDialogFragment googlePayDialogFragment, Continuation<? super C19467OooO00o> continuation) {
                    super(2, continuation);
                    this.f78814OooOo = googlePayDialogFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    C19467OooO00o c19467OooO00o = new C19467OooO00o(this.f78814OooOo, continuation);
                    c19467OooO00o.f78815OooOo0o = obj;
                    return c19467OooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(C32443OooOOO<? extends Integer, ? extends String> c32443OooOOO, Continuation<? super C32460OooOooO> continuation) {
                    return ((C19467OooO00o) create(c32443OooOOO, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    C32443OooOOO c32443OooOOO = (C32443OooOOO) this.f78815OooOo0o;
                    int iIntValue = ((Number) c32443OooOOO.f116638OooOo0o).intValue();
                    String string = (String) c32443OooOOO.f116637OooOo;
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    StringBuilder sbOooO00o = com.aspose.slides.internal.p332p7.OooOOOO.OooO00o(c20358OooO00o, "GooglePayDialogFragment", "pbl error: ", iIntValue, ", ");
                    sbOooO00o.append(string);
                    c20358OooO00o.OooO0o0(sbOooO00o.toString(), new Object[0]);
                    GooglePayDialogFragment googlePayDialogFragment = this.f78814OooOo;
                    switch (iIntValue) {
                        case 100:
                            string = googlePayDialogFragment.getString(R.string.error_client_not_ready);
                            break;
                        case 101:
                            string = googlePayDialogFragment.getString(R.string.error_no_purchases);
                            break;
                        case 102:
                            string = googlePayDialogFragment.getString(R.string.error_order_no_purchased);
                            break;
                        case 103:
                            string = googlePayDialogFragment.getString(R.string.error_order_no_ack);
                            break;
                        case 104:
                            string = googlePayDialogFragment.getString(R.string.error_no_purchase_history);
                            break;
                    }
                    OooOOO0.OooO0Oo(string);
                    String string2 = googlePayDialogFragment.getString(R.string.pbl_error, new Integer(iIntValue), string);
                    OooOOO0.OooO0o(string2, "getString(...)");
                    Context context = googlePayDialogFragment.getContext();
                    if (context != null) {
                        C25206OooO0Oo.OooO0OO((ContextWrapper) context, string2);
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23779OooO0Oo(GooglePayDialogFragment googlePayDialogFragment, Continuation<? super C23779OooO0Oo> continuation) {
                super(2, continuation);
                this.f78812OooOo = googlePayDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23779OooO0Oo(this.f78812OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C23779OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f78813OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    GooglePayDialogFragment googlePayDialogFragment = this.f78812OooOo;
                    C33772OooooOo c33772OooooOo = googlePayDialogFragment.Oooo0().f109414OooOOoo;
                    C19467OooO00o c19467OooO00o = new C19467OooO00o(googlePayDialogFragment, null);
                    this.f78813OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c33772OooooOo, c19467OooO00o, this) == enumC32485OooO00o) {
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

        /* JADX INFO: renamed from: com.orion.notein.ui.pay.google.GooglePayDialogFragment$OooO00o$OooO0o0, reason: case insensitive filesystem */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pay.google.GooglePayDialogFragment$onViewCreated$7$5", m80623f = "GooglePayDialogFragment.kt", m80624l = {240}, m80625m = "invokeSuspend")
        public static final class C23780OooO0o0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ GooglePayDialogFragment f78816OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public int f78817OooOo0o;

            /* JADX INFO: renamed from: com.orion.notein.ui.pay.google.GooglePayDialogFragment$OooO00o$OooO0o0$OooO00o, reason: collision with other inner class name */
            @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pay.google.GooglePayDialogFragment$onViewCreated$7$5$1", m80623f = "GooglePayDialogFragment.kt", m80624l = {}, m80625m = "invokeSuspend")
            public static final class C19468OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<NoteinFirebaseUser, Continuation<? super C32460OooOooO>, Object> {

                /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
                public final /* synthetic */ GooglePayDialogFragment f78818OooOo;

                /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
                public /* synthetic */ Object f78819OooOo0o;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C19468OooO00o(GooglePayDialogFragment googlePayDialogFragment, Continuation<? super C19468OooO00o> continuation) {
                    super(2, continuation);
                    this.f78818OooOo = googlePayDialogFragment;
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                    C19468OooO00o c19468OooO00o = new C19468OooO00o(this.f78818OooOo, continuation);
                    c19468OooO00o.f78819OooOo0o = obj;
                    return c19468OooO00o;
                }

                @Override // oO0O000o.InterfaceC32508OooOOOo
                public final Object invoke(NoteinFirebaseUser noteinFirebaseUser, Continuation<? super C32460OooOooO> continuation) {
                    return ((C19468OooO00o) create(noteinFirebaseUser, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
                }

                @Override // oO00ooo.AbstractC32477OooO00o
                public final Object invokeSuspend(Object obj) {
                    EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                    C32446OooOOOo.OooO0O0(obj);
                    NoteinFirebaseUser noteinFirebaseUser = (NoteinFirebaseUser) this.f78819OooOo0o;
                    this.f78818OooOo.Oooo0().f109399OooO.setValue(noteinFirebaseUser != null ? noteinFirebaseUser.getId() : null);
                    return C32460OooOooO.f116667OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C23780OooO0o0(GooglePayDialogFragment googlePayDialogFragment, Continuation<? super C23780OooO0o0> continuation) {
                super(2, continuation);
                this.f78816OooOo = googlePayDialogFragment;
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
                return new C23780OooO0o0(this.f78816OooOo, continuation);
            }

            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
                return ((C23780OooO0o0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
                int i = this.f78817OooOo0o;
                if (i == 0) {
                    C32446OooOOOo.OooO0O0(obj);
                    GooglePayDialogFragment googlePayDialogFragment = this.f78816OooOo;
                    C26320o0000OoO c26320o0000OoO = (C26320o0000OoO) googlePayDialogFragment.f78790Oooo00o.getValue();
                    C19468OooO00o c19468OooO00o = new C19468OooO00o(googlePayDialogFragment, null);
                    this.f78817OooOo0o = 1;
                    if (C25252OooO0Oo.OooO0oO(c26320o0000OoO.f90227OooOoOO, c19468OooO00o, this) == enumC32485OooO00o) {
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
            OooO00o oooO00o = GooglePayDialogFragment.this.new OooO00o(continuation);
            oooO00o.f78802OooOo0o = obj;
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
            InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f78802OooOo0o;
            GooglePayDialogFragment googlePayDialogFragment = GooglePayDialogFragment.this;
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C19463OooO00o(googlePayDialogFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(googlePayDialogFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0OO(googlePayDialogFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23779OooO0Oo(googlePayDialogFragment, null), 3);
            C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new C23780OooO0o0(googlePayDialogFragment, null), 3);
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public static final class OooO0O0 extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {
        public OooO0O0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return GooglePayDialogFragment.this.requireActivity().getViewModelStore();
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {
        public OooO0OO() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return GooglePayDialogFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.pay.google.GooglePayDialogFragment$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23781OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {
        public C23781OooO0Oo() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            return GooglePayDialogFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f78823OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f78823OooOo0o = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((OooOO0) this.f78823OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.pay.google.GooglePayDialogFragment$OooO0o0, reason: case insensitive filesystem */
    public static final class C23782OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<OooOO0> {
        public C23782OooO0o0() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final OooOO0 invoke() {
            return C21030OooOO0o.OooO0OO(GooglePayDialogFragment.this).OooO0o(R.id.googlePayDialogFragment);
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.pay.google.GooglePayDialogFragment$OooO0oO, reason: case insensitive filesystem */
    public static final class C23783OooO0oO extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f78825OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23783OooO0oO(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f78825OooOo0o = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return ((OooOO0) this.f78825OooOo0o.getValue()).getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.pay.google.GooglePayDialogFragment$OooO0oo, reason: case insensitive filesystem */
    public static final class C23784OooO0oo extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f78826OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23784OooO0oo(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f78826OooOo = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            ActivityC21897OooOo0 activityC21897OooOo0RequireActivity = GooglePayDialogFragment.this.requireActivity();
            OooOOO0.OooO0o(activityC21897OooOo0RequireActivity, "requireActivity()");
            return o000O0O0.OooO00o.OooO00o(activityC21897OooOo0RequireActivity, (C22015OooooOo) ((OooOO0) this.f78826OooOo.getValue()).getDefaultViewModelProviderFactory());
        }
    }

    public GooglePayDialogFragment() {
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f78788Oooo000 = new C24568OooO0oO(oooo0.OooO0O0(C30582OooOOO0.class), new OooO());
        C32447OooOOo c32447OooOOoOooO0OO = C20519OooO0Oo.OooO0OO(new C23782OooO0o0());
        OooO0o oooO0o = new OooO0o(c32447OooOOoOooO0OO);
        this.f78789Oooo00O = new C22026ooOO(oooo0.OooO0O0(C30584OooOOOo.class), oooO0o, new C23784OooO0oo(c32447OooOOoOooO0OO), new C23783OooO0oO(c32447OooOOoOooO0OO));
        this.f78790Oooo00o = new C22026ooOO(oooo0.OooO0O0(C26320o0000OoO.class), new OooO0O0(), new C23781OooO0Oo(), new OooO0OO());
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final int OooOoo() {
        return R.layout.dialog_fragment_pay_google;
    }

    public final C30584OooOOOo Oooo0() {
        return (C30584OooOOOo) this.f78789Oooo00O.getValue();
    }

    public final void Oooo00o() {
        ViewGroup viewGroup = this.f78792Oooo0OO;
        if (viewGroup == null) {
            OooOOO0.OooOOOO("btnCreateOrderWrapper");
            throw null;
        }
        CheckBox checkBox = this.f78786Oooo;
        if (checkBox != null) {
            viewGroup.setActivated((!checkBox.isChecked() || OooOOO0.OooO0O0(Oooo0().f109409OooOOO0.getValue(), State.OooO0O0.f78711OooO00o) || OooOOO0.OooO0O0(Oooo0().f109409OooOOO0.getValue(), State.C23767OooO0Oo.f78713OooO00o)) ? false : true);
        } else {
            OooOOO0.OooOOOO("btnAgree");
            throw null;
        }
    }

    public final void Oooo0O0() {
        ViewGroup viewGroup = this.f78792Oooo0OO;
        if (viewGroup == null) {
            OooOOO0.OooOOOO("btnCreateOrderWrapper");
            throw null;
        }
        viewGroup.setClickable(true);
        TextView textView = this.f78791Oooo0O0;
        if (textView == null) {
            OooOOO0.OooOOOO("txtCreateOrder");
            throw null;
        }
        textView.setTextColor(-1);
        CircularProgressIndicator circularProgressIndicator = this.f78797OoooO0;
        if (circularProgressIndicator != null) {
            circularProgressIndicator.setVisibility(8);
        } else {
            OooOOO0.OooOOOO("cpiBtnPay");
            throw null;
        }
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C21904OooOoo0.OooO0oO(this, "LoginTipsDialogFragment", new InterfaceC32508OooOOOo() { // from class: o0o0OOoo.OooO0o0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // oO0O000o.InterfaceC32508OooOOOo
            public final Object invoke(Object obj, Object obj2) {
                Bundle bundle = (Bundle) obj2;
                kotlin.jvm.internal.OooOOO0.OooO0oO((String) obj, "<unused var>");
                kotlin.jvm.internal.OooOOO0.OooO0oO(bundle, "bundle");
                if (bundle.getBoolean("login_successfully")) {
                    GooglePayDialogFragment googlePayDialogFragment = this.f109385OooOo0o;
                    NoteinFirebaseUser noteinFirebaseUser = (NoteinFirebaseUser) ((C26320o0000OoO) googlePayDialogFragment.f78790Oooo00o.getValue()).f90227OooOoOO.f121747OooOo0o.getValue();
                    if (noteinFirebaseUser != null) {
                        String id = noteinFirebaseUser.getId();
                        InterfaceC21987OooOoo viewLifecycleOwner = googlePayDialogFragment.getViewLifecycleOwner();
                        kotlin.jvm.internal.OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C30576OooO0oO(id, googlePayDialogFragment, null), 3);
                    }
                }
                return C32460OooOooO.f116667OooO00o;
            }
        });
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        view.findViewById(R.id.iv_back).setOnClickListener(new ViewOnClickListenerC29131OooO0o(this, 3));
        this.f78797OoooO0 = (CircularProgressIndicator) view.findViewById(R.id.cpi_btn_pay);
        this.f78799OoooO0O = (CircularProgressIndicator) view.findViewById(R.id.cpi_btn_restore_purchase);
        this.f78787Oooo0 = (TextView) view.findViewById(R.id.tv_product_tips);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.btn_create_order_wrapper);
        this.f78792Oooo0OO = viewGroup;
        if (viewGroup == null) {
            OooOOO0.OooOOOO("btnCreateOrderWrapper");
            throw null;
        }
        C28050OooO0OO.OooO00o(viewGroup, 1000L, new ViewOnClickListenerC29133OooO0oO(this, 2));
        this.f78791Oooo0O0 = (TextView) view.findViewById(R.id.btn_create_order);
        this.f78794Oooo0o0 = (RecyclerView) view.findViewById(R.id.product_list);
        C30549OooO0OO c30549OooO0OO = new C30549OooO0OO(C30549OooO0OO.OooO00o.f109276OooO00o);
        this.f78793Oooo0o = c30549OooO0OO;
        RecyclerView recyclerView = this.f78794Oooo0o0;
        if (recyclerView == null) {
            OooOOO0.OooOOOO("productList");
            throw null;
        }
        recyclerView.setAdapter(c30549OooO0OO);
        c30549OooO0OO.f109275OooO0O0 = new ViewOnClickListenerC26091OooO00o(this, 5);
        TextView textView = (TextView) view.findViewById(R.id.tv_auto_renew_hint);
        this.f78795Oooo0oO = textView;
        if (textView == null) {
            OooOOO0.OooOOOO("autoRenameHint");
            throw null;
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        CheckBox checkBox = (CheckBox) view.findViewById(R.id.agree);
        this.f78786Oooo = checkBox;
        if (checkBox == null) {
            OooOOO0.OooOOOO("btnAgree");
            throw null;
        }
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o0o0OOoo.OooO0Oo
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton buttonView, boolean z) {
                kotlin.jvm.internal.OooOOO0.OooO0oO(buttonView, "buttonView");
                this.f109380OooO00o.Oooo00o();
            }
        });
        TextView textView2 = (TextView) view.findViewById(R.id.tv_agreement);
        this.f78796Oooo0oo = textView2;
        if (textView2 == null) {
            OooOOO0.OooOOOO("btnAgreementLink");
            throw null;
        }
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        TextView textView3 = this.f78796Oooo0oo;
        if (textView3 == null) {
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
        C30577OooO0oo c30577OooO0oo = new C30577OooO0oo(this);
        int iOooo0O0 = C33599OooOo0O.Oooo0O0(string2, string, 0, false, 6);
        CharSequence charSequence = string2;
        if (iOooo0O0 != -1) {
            spannableString.setSpan(c30577OooO0oo, iOooo0O0, string2.length(), 33);
            charSequence = spannableString;
        }
        textView3.setText(charSequence);
        TextView textView4 = (TextView) view.findViewById(R.id.btn_vip_permission);
        if (textView4 == null) {
            OooOOO0.OooOOOO("btnVipPermission");
            throw null;
        }
        C28050OooO0OO.OooO00o(textView4, 500L, new ViewOnClickListenerC28540OooOoOO(this, 5));
        TextView textView5 = (TextView) view.findViewById(R.id.btn_restore_purchase);
        this.f78798OoooO00 = textView5;
        if (textView5 == null) {
            OooOOO0.OooOOOO("btnRestorePurchase");
            throw null;
        }
        C28050OooO0OO.OooO00o(textView5, 500L, new ViewOnClickListenerC28542OooOoo0(this, 5));
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooO00o(null), 3);
        NoteinGoogleSubscriptionPurchase noteinGoogleSubscriptionPurchase = ((C30582OooOOO0) this.f78788Oooo000.getValue()).f109398OooO00o;
        if (noteinGoogleSubscriptionPurchase != null) {
            C33781o00o0O c33781o00o0O = Oooo0().f109417OooOo00;
            c33781o00o0O.getClass();
            c33781o00o0O.OooOO0(null, noteinGoogleSubscriptionPurchase);
        }
    }
}
