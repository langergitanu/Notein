package com.orion.notein.data.repo.transactions;

import Oooo.C20813OooO0o0;
import androidx.fragment.app.C21904OooOoo0;
import com.android.billingclient.api.C22162OooO0oo;
import com.android.billingclient.api.Purchase;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: com.orion.notein.data.repo.transactions.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.transactions.GoogleBillingDataSource$acknowledgePurchaseSync$2", m80623f = "GoogleBillingDataSource.kt", m80624l = {946}, m80625m = "invokeSuspend")
public final class C22923OooO0Oo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super Boolean>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Purchase f70056OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f70057OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ GoogleBillingDataSource f70058OooOoO0;

    /* JADX INFO: renamed from: com.orion.notein.data.repo.transactions.OooO0Oo$OooO00o */
    public static final class OooO00o implements com.android.billingclient.api.OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ GoogleBillingDataSource f70059OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ oOo0000O.OooOO0 f70060OooO0O0;

        public OooO00o(GoogleBillingDataSource googleBillingDataSource, oOo0000O.OooOO0 oooOO02) {
            this.f70059OooO00o = googleBillingDataSource;
            this.f70060OooO0O0 = oooOO02;
        }

        @Override // com.android.billingclient.api.OooO00o
        public final void OooO00o(C22162OooO0oo billingResult) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(billingResult, "billingResult");
            int i = billingResult.f66936OooO00o;
            oOo0000O.OooOO0 oooOO02 = this.f70060OooO0O0;
            GoogleBillingDataSource googleBillingDataSource = this.f70059OooO00o;
            if (i == 0) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("GoogleBillingDataSource");
                c20358OooO00o.OooO0o0("acknowledgePurchase success", new Object[0]);
                AbstractC24338OooO0o0.OooO00o<Long> oooO00o = GoogleBillingDataSource.f70016OooOoO0;
                googleBillingDataSource.OooO(1000L);
                oooOO02.resumeWith(Boolean.TRUE);
                return;
            }
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("GoogleBillingDataSource");
            c20358OooO00o2.OooO0o0("acknowledgePurchase error. " + billingResult, new Object[0]);
            oooOO02.resumeWith(Boolean.FALSE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22923OooO0Oo(Purchase purchase, GoogleBillingDataSource googleBillingDataSource, Continuation continuation) {
        super(2, continuation);
        this.f70056OooOo = purchase;
        this.f70058OooOoO0 = googleBillingDataSource;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C22923OooO0Oo(this.f70056OooOo, this.f70058OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super Boolean> continuation) {
        return ((C22923OooO0Oo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f70057OooOo0o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        C32446OooOOOo.OooO0O0(obj);
        Purchase purchase = this.f70056OooOo;
        if (purchase.OooO0O0() != 1 || purchase.OooO0Oo()) {
            return Boolean.FALSE;
        }
        GoogleBillingDataSource googleBillingDataSource = this.f70058OooOoO0;
        if (!googleBillingDataSource.f70025OooO0o0) {
            return Boolean.FALSE;
        }
        String strOooO0OO = purchase.OooO0OO();
        kotlin.jvm.internal.OooOOO0.OooO0o(strOooO0OO, "getPurchaseToken(...)");
        C20813OooO0o0 c20813OooO0o0 = new C20813OooO0o0();
        c20813OooO0o0.f59765OooO00o = strOooO0OO;
        this.f70057OooOo0o = 1;
        oOo0000O.OooOO0 oooOO02 = new oOo0000O.OooOO0(C21904OooOoo0.OooO0o0(this));
        googleBillingDataSource.f70039OooOo0.OooO00o(c20813OooO0o0, new OooO00o(googleBillingDataSource, oooOO02));
        Object objOooO00o = oooOO02.OooO00o();
        return objOooO00o == enumC32485OooO00o ? enumC32485OooO00o : objOooO00o;
    }
}
