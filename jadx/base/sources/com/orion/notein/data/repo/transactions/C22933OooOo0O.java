package com.orion.notein.data.repo.transactions;

import com.android.billingclient.api.C22159OooO0Oo;
import com.android.billingclient.api.C22160OooO0o0;
import com.android.billingclient.api.C22162OooO0oo;
import com.android.billingclient.api.C22164OooOO0o;
import com.android.billingclient.api.CallableC22173OooOoO0;
import com.android.billingclient.api.Purchase;
import com.aspose.slides.internal.p332p7.C22237OooO0o0;
import com.google.android.gms.internal.play_billing.zzbt;
import com.google.android.gms.internal.play_billing.zzie;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import o00OooO0.C25150OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33621OooOo0;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: com.orion.notein.data.repo.transactions.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.transactions.GoogleBillingDataSource$queryPurchasesFromPlayCache$2", m80623f = "GoogleBillingDataSource.kt", m80624l = {381, 386, 398, 411}, m80625m = "invokeSuspend")
public final class C22933OooOo0O extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super List<? extends Purchase>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ GoogleBillingDataSource f70129OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f70130OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ String f70131OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22933OooOo0O(GoogleBillingDataSource googleBillingDataSource, String str, Continuation continuation) {
        super(2, continuation);
        this.f70129OooOo = googleBillingDataSource;
        this.f70131OooOoO0 = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new C22933OooOo0O(this.f70129OooOo, this.f70131OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super List<? extends Purchase>> continuation) {
        return ((C22933OooOo0O) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) throws Throwable {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f70130OooOo0o;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            if (!this.f70129OooOo.f70039OooOo0.OooOOOo()) {
                C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                c20358OooO00o.OooOOO0("GoogleBillingDataSource");
                c20358OooO00o.OooO0OO("queryPurchases: BillingClient is not ready", new Object[0]);
                return null;
            }
            String str = this.f70131OooOoO0;
            if (str == null) {
                throw new IllegalArgumentException("Product type must be set");
            }
            final C22159OooO0Oo c22159OooO0Oo = this.f70129OooOo.f70039OooOo0;
            this.f70130OooOo0o = 3;
            C33621OooOo0 c33621OooOo0OooO0Oo = C25150OooO00o.OooO0Oo();
            final C22160OooO0o0 c22160OooO0o0 = new C22160OooO0o0();
            c22160OooO0o0.f66920OooO00o = c33621OooOo0OooO0Oo;
            c22159OooO0Oo.getClass();
            if (C22159OooO0Oo.OooO0oO(new CallableC22173OooOoO0(c22159OooO0Oo, c22160OooO0o0, str), 30000L, new Runnable() { // from class: com.android.billingclient.api.OooOo0o
                @Override // java.lang.Runnable
                public final void run() {
                    zzie zzieVar = zzie.EXECUTE_ASYNC_TIMEOUT;
                    C22162OooO0oo c22162OooO0oo = C22179Oooo.f67029OooOO0O;
                    c22159OooO0Oo.OooOoO(9, c22162OooO0oo, zzieVar);
                    c22160OooO0o0.OooO00o(c22162OooO0oo, zzbt.zzk());
                }
            }, c22159OooO0Oo.OooOOo(), c22159OooO0Oo.OooO0o()) == null) {
                C22162OooO0oo c22162OooO0ooOooOo0 = c22159OooO0Oo.OooOo0();
                c22159OooO0Oo.OooOoO(9, c22162OooO0ooOooOo0, zzie.MISSING_RESULT_FROM_EXECUTE_ASYNC);
                c22160OooO0o0.OooO00o(c22162OooO0ooOooOo0, zzbt.zzk());
            }
            obj = c33621OooOo0OooO0Oo.OooOo00(this);
            if (obj == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i == 1) {
                C32446OooOOOo.OooO0O0(obj);
                return null;
            }
            if (i == 2) {
                C32446OooOOOo.OooO0O0(obj);
                return null;
            }
            if (i != 3) {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
                return null;
            }
            C32446OooOOOo.OooO0O0(obj);
        }
        C22164OooOO0o c22164OooOO0o = (C22164OooOO0o) obj;
        if (c22164OooOO0o.f66972OooO00o.f66936OooO00o != 0) {
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("GoogleBillingDataSource");
            c20358OooO00o2.OooO0OO(C22237OooO0o0.OooO00o("queryPurchases failed. productType: ", this.f70131OooOoO0, ", ", c22164OooOO0o.f66972OooO00o.f66938OooO0OO), new Object[0]);
            return null;
        }
        AbstractCollection abstractCollection = c22164OooOO0o.f66973OooO0O0;
        kotlin.jvm.internal.OooOOO0.OooO0oO(abstractCollection, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : abstractCollection) {
            if (((Purchase) obj2).OooO0O0() == 1) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }
}
