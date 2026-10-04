package com.orion.notein.data.repo.transactions;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.orion.notein.data.service.responsebody.transactions.PurchaseHintsResponse;
import com.orion.notein.data.service.responsebody.transactions.TransactionsProductResponse;
import com.orion.notein.domain.models.transactions.TransactionsConstants;
import java.util.List;
import oO00ooO.C32446OooOOOo;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oOO00oo.C34406OooO00o;
import ooooOOo0.C35238OooOoO;

/* JADX INFO: loaded from: classes9.dex */
public final class o0O0O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0OOOOO0.OooOO0O f70364OooO00o;

    public o0O0O00(o0OOOOO0.OooOO0O transactionsService) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(transactionsService, "transactionsService");
        this.f70364OooO00o = transactionsService;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o0OO00O o0oo00o2;
        List list;
        if (abstractC32479OooO0OO instanceof o0OO00O) {
            o0oo00o2 = (o0OO00O) abstractC32479OooO0OO;
            int i = o0oo00o2.f70367OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                o0oo00o2.f70367OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                o0oo00o2 = new o0OO00O(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO00o = o0oo00o2.f70366OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = o0oo00o2.f70367OooOoO0;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooO00o);
                o0OOOOO0.OooOO0O oooOO0O = this.f70364OooO00o;
                o0oo00o2.f70367OooOoO0 = 1;
                objOooO00o = oooOO0O.OooO00o(o0oo00o2);
                if (objOooO00o == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(objOooO00o);
            }
            list = (List) ((C35238OooOoO) objOooO00o).f126542OooO0O0;
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("TransactionsDataSource");
            c20358OooO00o.OooO0Oo(e, "getAllProducts error.", new Object[0]);
            list = null;
        }
        if (list == null) {
            return null;
        }
        return new TransactionsProductResponse(list, TransactionsConstants.API_RESULT_SUCCESS, FirebaseAnalytics.Param.SUCCESS);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0O0(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        oo0o0Oo oo0o0oo;
        if (abstractC32479OooO0OO instanceof oo0o0Oo) {
            oo0o0oo = (oo0o0Oo) abstractC32479OooO0OO;
            int i = oo0o0oo.f70387OooOoO0;
            if ((i & Integer.MIN_VALUE) != 0) {
                oo0o0oo.f70387OooOoO0 = i - Integer.MIN_VALUE;
            } else {
                oo0o0oo = new oo0o0Oo(this, abstractC32479OooO0OO);
            }
        }
        Object objOooO0O0 = oo0o0oo.f70386OooOo0o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = oo0o0oo.f70387OooOoO0;
        try {
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(objOooO0O0);
                o0OOOOO0.OooOO0O oooOO0O = this.f70364OooO00o;
                oo0o0oo.f70387OooOoO0 = 1;
                objOooO0O0 = oooOO0O.OooO0O0(oo0o0oo);
                if (objOooO0O0 == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(objOooO0O0);
            }
            return (PurchaseHintsResponse) ((C35238OooOoO) objOooO0O0).f126542OooO0O0;
        } catch (Exception e) {
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("TransactionsDataSource");
            c20358OooO00o.OooO0Oo(e, "getPurchaseHintsRaw error.", new Object[0]);
            return null;
        }
    }
}
