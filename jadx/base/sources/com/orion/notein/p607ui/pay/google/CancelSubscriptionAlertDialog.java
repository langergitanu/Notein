package com.orion.notein.p607ui.pay.google;

import OooOoOO.C20519OooO0Oo;
import Oooo0oO.C21030OooOO0o;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.ActivityC21897OooOo0;
import androidx.lifecycle.C21989OooOooO;
import androidx.lifecycle.C22015OooooOo;
import androidx.lifecycle.C22021o00o0O;
import androidx.lifecycle.C22026ooOO;
import androidx.lifecycle.InterfaceC21987OooOoo;
import androidx.lifecycle.o00Oo0;
import androidx.lifecycle.o0OoOo0;
import com.aspose.slides.internal.p332p7.C22237OooO0o0;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.sessions.C22797OooO0Oo;
import com.orion.notein.domain.models.transactions.google.NoteinGoogleSubscriptionPurchase;
import com.orion.notein.global.R;
import com.orion.notein.p607ui.BaseDialogFragment;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import kotlin.jvm.internal.OooOOOO;
import kotlin.jvm.internal.Oooo0;
import o000o00.AbstractC24555OooO00o;
import o000o0O0.C24568OooO0oO;
import o000o0O0.OooOO0;
import o0Oo0oO0.ViewOnClickListenerC28288OooO;
import o0OoO000.OooOo00;
import o0o0OOoo.C30570OooO00o;
import o0o0OOoo.C30571OooO0O0;
import o0o0OOoo.C30572OooO0OO;
import o0o0OOoo.C30584OooOOOo;
import o0o0OOoo.C30595OooOo0o;
import o0oOoOoO.C31101OooO0oo;
import o0oo000O.C31183OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32447OooOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0o.C33599OooOo0O;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33644OoooO0;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.o00000OO;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/ui/pay/google/CancelSubscriptionAlertDialog;", "Lcom/orion/notein/ui/BaseDialogFragment;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final class CancelSubscriptionAlertDialog extends BaseDialogFragment {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final C24568OooO0oO f78767OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public TextView f78768OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final C22026ooOO f78769OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public View f78770OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public View f78771OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public CircularProgressIndicator f78772Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public o00000OO f78773Oooo00O;

    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pay.google.CancelSubscriptionAlertDialog$onResume$1", m80623f = "CancelSubscriptionAlertDialog.kt", m80624l = {147}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f78774OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f78775OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public int f78776OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public CancelSubscriptionAlertDialog f78777OooOoO0;

        public OooO00o(Continuation<? super OooO00o> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return CancelSubscriptionAlertDialog.this.new OooO00o(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0034 -> B:13:0x0037). Please report as a decompilation issue!!! */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i;
            CancelSubscriptionAlertDialog cancelSubscriptionAlertDialog;
            int i2;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i3 = this.f78776OooOoO;
            if (i3 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                i = 0;
                cancelSubscriptionAlertDialog = CancelSubscriptionAlertDialog.this;
                i2 = 3;
                if (i < i2) {
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.f78774OooOo;
                i2 = this.f78775OooOo0o;
                cancelSubscriptionAlertDialog = this.f78777OooOoO0;
                C32446OooOOOo.OooO0O0(obj);
                C30584OooOOOo c30584OooOOOo = (C30584OooOOOo) cancelSubscriptionAlertDialog.f78769OooOoo0.getValue();
                C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(c30584OooOOOo), null, null, new C30595OooOo0o(c30584OooOOOo, null), 3);
                i++;
                if (i < i2) {
                    this.f78777OooOoO0 = cancelSubscriptionAlertDialog;
                    this.f78775OooOo0o = i2;
                    this.f78774OooOo = i;
                    this.f78776OooOoO = 1;
                    if (C33644OoooO0.OooO00o(3000L, this) == enumC32485OooO00o) {
                        return enumC32485OooO00o;
                    }
                    C30584OooOOOo c30584OooOOOo2 = (C30584OooOOOo) cancelSubscriptionAlertDialog.f78769OooOoo0.getValue();
                    C33609OooO0oo.OooO0OO(o0OoOo0.OooO00o(c30584OooOOOo2), null, null, new C30595OooOo0o(c30584OooOOOo2, null), 3);
                    i++;
                    if (i < i2) {
                        return C32460OooOooO.f116667OooO00o;
                    }
                }
            }
        }
    }

    public static final class OooO0O0 extends OooOOOO implements oO0O000o.OooO00o<OooOO0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ int f78779OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(int i) {
            super(0);
            this.f78779OooOo = i;
        }

        @Override // oO0O000o.OooO00o
        public final OooOO0 invoke() {
            return C21030OooOO0o.OooO0OO(CancelSubscriptionAlertDialog.this).OooO0o(this.f78779OooOo);
        }
    }

    public static final class OooO0OO extends OooOOOO implements oO0O000o.OooO00o<C22021o00o0O> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f78781OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f78781OooOo0o = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final C22021o00o0O invoke() {
            return ((OooOO0) this.f78781OooOo0o.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.pay.google.CancelSubscriptionAlertDialog$OooO0Oo, reason: case insensitive filesystem */
    public static final class C23777OooO0Oo extends OooOOOO implements oO0O000o.OooO00o<AbstractC24555OooO00o> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f78782OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23777OooO0Oo(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f78782OooOo0o = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final AbstractC24555OooO00o invoke() {
            return ((OooOO0) this.f78782OooOo0o.getValue()).getDefaultViewModelCreationExtras();
        }
    }

    public static final class OooO0o extends OooOOOO implements oO0O000o.OooO00o<Bundle> {
        public OooO0o() {
            super(0);
        }

        @Override // oO0O000o.OooO00o
        public final Bundle invoke() {
            CancelSubscriptionAlertDialog cancelSubscriptionAlertDialog = CancelSubscriptionAlertDialog.this;
            Bundle arguments = cancelSubscriptionAlertDialog.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + cancelSubscriptionAlertDialog + " has null arguments");
        }
    }

    /* JADX INFO: renamed from: com.orion.notein.ui.pay.google.CancelSubscriptionAlertDialog$OooO0o0, reason: case insensitive filesystem */
    public static final class C23778OooO0o0 extends OooOOOO implements oO0O000o.OooO00o<o00Oo0.OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ C32447OooOOo f78784OooOo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23778OooO0o0(C32447OooOOo c32447OooOOo) {
            super(0);
            this.f78784OooOo = c32447OooOOo;
        }

        @Override // oO0O000o.OooO00o
        public final o00Oo0.OooO0O0 invoke() {
            ActivityC21897OooOo0 activityC21897OooOo0RequireActivity = CancelSubscriptionAlertDialog.this.requireActivity();
            OooOOO0.OooO0o(activityC21897OooOo0RequireActivity, "requireActivity()");
            return o000O0O0.OooO00o.OooO00o(activityC21897OooOo0RequireActivity, (C22015OooooOo) ((OooOO0) this.f78784OooOo.getValue()).getDefaultViewModelProviderFactory());
        }
    }

    public CancelSubscriptionAlertDialog() {
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        this.f78767OooOoOO = new C24568OooO0oO(oooo0.OooO0O0(C30572OooO0OO.class), new OooO0o());
        C32447OooOOo c32447OooOOoOooO0OO = C20519OooO0Oo.OooO0OO(new OooO0O0(C31183OooO00o.f111223OooO0OO));
        OooO0OO oooO0OO = new OooO0OO(c32447OooOOoOooO0OO);
        this.f78769OooOoo0 = new C22026ooOO(oooo0.OooO0O0(C30584OooOOOo.class), oooO0OO, new C23778OooO0o0(c32447OooOOoOooO0OO), new C23777OooO0Oo(c32447OooOOoOooO0OO));
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment
    public final int OooOoo() {
        return R.layout.fragment_cancel_subscription_dialog;
    }

    public final void Oooo00O() {
        o00000OO o00000oo2 = this.f78773Oooo00O;
        if (o00000oo2 != null) {
            o00000oo2.cancel((CancellationException) null);
        }
        CircularProgressIndicator circularProgressIndicator = this.f78772Oooo000;
        if (circularProgressIndicator == null) {
            OooOOO0.OooOOOO("cpiCancelSubscription");
            throw null;
        }
        circularProgressIndicator.setVisibility(0);
        View view = this.f78770OooOooO;
        if (view == null) {
            OooOOO0.OooOOOO("btnConfirm");
            throw null;
        }
        view.setVisibility(4);
        Context contextRequireContext = requireContext();
        OooOOO0.OooO0o(contextRequireContext, "requireContext(...)");
        String packageName = contextRequireContext.getPackageName();
        String str = ((C30572OooO0OO) this.f78767OooOoOO.getValue()).f109379OooO00o;
        C31101OooO0oo.OooO00o(contextRequireContext, str == null ? "https://play.google.com/store/account/subscriptions" : C22237OooO0o0.OooO00o("https://play.google.com/store/account/subscriptions?sku=", str, "&package=", packageName));
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        o00000OO o00000ooOooO0OO = C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new OooO00o(null), 3);
        this.f78773Oooo00O = o00000ooOooO0OO;
        o00000ooOooO0OO.invokeOnCompletion(new C22797OooO0Oo(this, 3));
    }

    @Override // com.orion.notein.p607ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        OooOOO0.OooO0oO(view, "view");
        super.onViewCreated(view, bundle);
        setCancelable(false);
        this.f78772Oooo000 = (CircularProgressIndicator) view.findViewById(R.id.cpi_cancel_subscription);
        TextView textView = (TextView) view.findViewById(R.id.alert_info);
        this.f78768OooOoo = textView;
        if (textView == null) {
            OooOOO0.OooOOOO(FirebaseAnalytics.Param.CONTENT);
            throw null;
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        TextView textView2 = this.f78768OooOoo;
        if (textView2 == null) {
            OooOOO0.OooOOOO(FirebaseAnalytics.Param.CONTENT);
            throw null;
        }
        String string = getString(R.string.subscriptions_center);
        OooOOO0.OooO0o(string, "getString(...)");
        CharSequence string2 = getString(R.string.content_cancel_subscription_for_upgrade, string);
        OooOOO0.OooO0o(string2, "getString(...)");
        SpannableString spannableString = new SpannableString(string2);
        C30571OooO0O0 c30571OooO0O0 = new C30571OooO0O0(this);
        int iOooo0O0 = C33599OooOo0O.Oooo0O0(string2, string, 0, false, 6);
        if (iOooo0O0 != -1) {
            spannableString.setSpan(c30571OooO0O0, iOooo0O0, string.length() + iOooo0O0, 33);
            string2 = spannableString;
        }
        textView2.setText(string2);
        View viewFindViewById = view.findViewById(R.id.btn_confirm);
        this.f78770OooOooO = viewFindViewById;
        if (viewFindViewById == null) {
            OooOOO0.OooOOOO("btnConfirm");
            throw null;
        }
        viewFindViewById.setOnClickListener(new OooOo00(this, 3));
        View viewFindViewById2 = view.findViewById(R.id.btn_cancel);
        this.f78771OooOooo = viewFindViewById2;
        if (viewFindViewById2 == null) {
            OooOOO0.OooOOOO("btnCancel");
            throw null;
        }
        viewFindViewById2.setOnClickListener(new ViewOnClickListenerC28288OooO(this, 5));
        NoteinGoogleSubscriptionPurchase noteinGoogleSubscriptionPurchase = (NoteinGoogleSubscriptionPurchase) ((C30584OooOOOo) this.f78769OooOoo0.getValue()).f109416OooOo0.getValue();
        if (noteinGoogleSubscriptionPurchase == null) {
            dismiss();
            return;
        }
        InterfaceC21987OooOoo viewLifecycleOwner = getViewLifecycleOwner();
        OooOOO0.OooO0o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C33609OooO0oo.OooO0OO(C21989OooOooO.OooO00o(viewLifecycleOwner), null, null, new C30570OooO00o(this, noteinGoogleSubscriptionPurchase, null), 3);
    }
}
