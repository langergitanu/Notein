package o0o0OOoo;

import com.orion.notein.domain.models.transactions.google.NoteinGoogleSubscriptionPurchase;
import com.orion.notein.p607ui.pay.google.CancelSubscriptionAlertDialog;
import kotlin.coroutines.Continuation;
import o00o00O0.C25252OooO0Oo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0Oo.C33716OooO;
import oO0o0Oo.InterfaceC33721OooO0o;

/* JADX INFO: renamed from: o0o0OOoo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pay.google.CancelSubscriptionAlertDialog$inspectSubsPurchase$1", m80623f = "CancelSubscriptionAlertDialog.kt", m80624l = {76}, m80625m = "invokeSuspend")
public final class C30570OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ CancelSubscriptionAlertDialog f109373OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f109374OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ NoteinGoogleSubscriptionPurchase f109375OooOoO0;

    /* JADX INFO: renamed from: o0o0OOoo.OooO00o$OooO00o, reason: collision with other inner class name */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.pay.google.CancelSubscriptionAlertDialog$inspectSubsPurchase$1$1", m80623f = "CancelSubscriptionAlertDialog.kt", m80624l = {}, m80625m = "invokeSuspend")
    public static final class C20111OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<NoteinGoogleSubscriptionPurchase, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ CancelSubscriptionAlertDialog f109376OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public /* synthetic */ Object f109377OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20111OooO00o(CancelSubscriptionAlertDialog cancelSubscriptionAlertDialog, Continuation<? super C20111OooO00o> continuation) {
            super(2, continuation);
            this.f109376OooOo = cancelSubscriptionAlertDialog;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            C20111OooO00o c20111OooO00o = new C20111OooO00o(this.f109376OooOo, continuation);
            c20111OooO00o.f109377OooOo0o = obj;
            return c20111OooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(NoteinGoogleSubscriptionPurchase noteinGoogleSubscriptionPurchase, Continuation<? super C32460OooOooO> continuation) {
            return ((C20111OooO00o) create(noteinGoogleSubscriptionPurchase, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            NoteinGoogleSubscriptionPurchase noteinGoogleSubscriptionPurchase = (NoteinGoogleSubscriptionPurchase) this.f109377OooOo0o;
            if (noteinGoogleSubscriptionPurchase == null) {
                return C32460OooOooO.f116667OooO00o;
            }
            if (!noteinGoogleSubscriptionPurchase.isValid() || noteinGoogleSubscriptionPurchase.isCanceled()) {
                CancelSubscriptionAlertDialog cancelSubscriptionAlertDialog = this.f109376OooOo;
                ((C30584OooOOOo) cancelSubscriptionAlertDialog.f78769OooOoo0.getValue()).f109418OooOo0O.set(true);
                cancelSubscriptionAlertDialog.dismiss();
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30570OooO00o(CancelSubscriptionAlertDialog cancelSubscriptionAlertDialog, NoteinGoogleSubscriptionPurchase noteinGoogleSubscriptionPurchase, Continuation<? super C30570OooO00o> continuation) {
        super(2, continuation);
        this.f109373OooOo = cancelSubscriptionAlertDialog;
        this.f109375OooOoO0 = noteinGoogleSubscriptionPurchase;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C30570OooO00o(this.f109373OooOo, this.f109375OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((C30570OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f109374OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            CancelSubscriptionAlertDialog cancelSubscriptionAlertDialog = this.f109373OooOo;
            C30584OooOOOo c30584OooOOOo = (C30584OooOOOo) cancelSubscriptionAlertDialog.f78769OooOoo0.getValue();
            String purchaseToken = this.f109375OooOoO0.getPurchaseToken();
            kotlin.jvm.internal.OooOOO0.OooO0oO(purchaseToken, "purchaseToken");
            String str = (String) c30584OooOOOo.f109399OooO.getValue();
            InterfaceC33721OooO0o<NoteinGoogleSubscriptionPurchase> c33716OooO = str == null ? new C33716OooO(null) : c30584OooOOOo.f109400OooO0Oo.OooO00o(purchaseToken, str);
            C20111OooO00o c20111OooO00o = new C20111OooO00o(cancelSubscriptionAlertDialog, null);
            this.f109374OooOo0o = 1;
            if (C25252OooO0Oo.OooO0oO(c33716OooO, c20111OooO00o, this) == enumC32485OooO00o) {
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
