package com.orion.notein.data.repo.transactions;

import com.android.billingclient.api.Purchase;
import com.orion.notein.domain.models.transactions.google.NoteinGoogleInAppPurchase;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OOOOOo.OooO0O0;
import o0OOOo0.C27174OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo000Oo.C34428OooOOo;
import oOo000Oo.C34434OooOoO;
import ooooOOo0.C35238OooOoO;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.transactions.NoteinGoogleBillingRemoteDataSource$submitInAppPurchases$2", m80623f = "NoteinGoogleBillingRemoteDataSource.kt", m80624l = {174}, m80625m = "invokeSuspend")
public final class o0ooOOo extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C27174OooO0O0<List<? extends NoteinGoogleInAppPurchase>>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ List<Purchase> f70377OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f70378OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ o0Oo0oo f70379OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0ooOOo(List<? extends Purchase> list, o0Oo0oo o0oo0oo2, Continuation<? super o0ooOOo> continuation) {
        super(2, continuation);
        this.f70377OooOo = list;
        this.f70379OooOoO0 = o0oo0oo2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new o0ooOOo(this.f70377OooOo, this.f70379OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C27174OooO0O0<List<? extends NoteinGoogleInAppPurchase>>> continuation) {
        return ((o0ooOOo) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f70378OooOo0o;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                List<Purchase> list = this.f70377OooOo;
                if (list.isEmpty()) {
                    return new C27174OooO0O0("0", null, C34434OooOoO.f123453OooOo0o, true);
                }
                List<Purchase> list2 = list;
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list2, 10));
                for (Purchase purchase : list2) {
                    String strOooO0OO = purchase.OooO0OO();
                    kotlin.jvm.internal.OooOOO0.OooO0o(strOooO0OO, "getPurchaseToken(...)");
                    Object obj2 = purchase.OooO00o().get(0);
                    kotlin.jvm.internal.OooOOO0.OooO0o(obj2, "get(...)");
                    arrayList.add(new OooO0O0.OooO.OooO00o(strOooO0OO, (String) obj2));
                }
                o0OOOOOo.OooO0O0 oooO0O0 = this.f70379OooOoO0.f70371OooO00o;
                OooO0O0.OooO oooO = new OooO0O0.OooO(arrayList);
                this.f70378OooOo0o = 1;
                obj = oooO0O0.OooOO0(oooO, this);
                if (obj == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            C35238OooOoO c35238OooOoO = (C35238OooOoO) obj;
            C27174OooO0O0 c27174OooO0O0 = (C27174OooO0O0) c35238OooOoO.f126542OooO0O0;
            if (!c35238OooOoO.f126541OooO00o.OooO0OO() || c27174OooO0O0 == null) {
                return new C27174OooO0O0(c27174OooO0O0 != null ? c27174OooO0O0.getErrorCode() : null, c27174OooO0O0 != null ? c27174OooO0O0.getErrorMsg() : null, null, false);
            }
            OooO0O0.C27156OooO0Oo c27156OooO0Oo = (OooO0O0.C27156OooO0Oo) c27174OooO0O0.OooO0O0();
            return new C27174OooO0O0(c27174OooO0O0.getErrorCode(), c27174OooO0O0.getErrorMsg(), c27156OooO0Oo != null ? c27156OooO0Oo.OooO00o() : null, c27174OooO0O0.f94862OooO00o);
        } catch (Exception e) {
            return new C27174OooO0O0("199999", e.getMessage(), null, false);
        }
    }
}
