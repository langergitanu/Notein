package com.orion.notein.data.repo.transactions;

import com.android.billingclient.api.Purchase;
import java.util.List;
import java.util.ListIterator;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooOO.C32465OooO0O0;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOO00oo.C34406OooO00o;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.transactions.GoogleBillingDataSource$checkPendingPurchases$1", m80623f = "GoogleBillingDataSource.kt", m80624l = {675, 678}, m80625m = "invokeSuspend")
public final class OooO0o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f70061OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public List f70062OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ GoogleBillingDataSource f70063OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0o(GoogleBillingDataSource googleBillingDataSource, Continuation<? super OooO0o> continuation) {
        super(2, continuation);
        this.f70063OooOoO0 = googleBillingDataSource;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        return new OooO0o(this.f70063OooOoO0, continuation);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
        return ((OooO0o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0090 A[LOOP:0: B:23:0x0087->B:25:0x0090, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009a A[SYNTHETIC] */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List list;
        List list2;
        ListIterator listIterator;
        C32465OooO0O0.C20232OooO0O0 c20232OooO0O0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f70061OooOo;
        GoogleBillingDataSource googleBillingDataSource = this.f70063OooOoO0;
        if (i == 0) {
            C32446OooOOOo.OooO0O0(obj);
            this.f70061OooOo = 1;
            AbstractC24338OooO0o0.OooO00o<Long> oooO00o = GoogleBillingDataSource.f70016OooOoO0;
            obj = googleBillingDataSource.OooOOO0("subs", this);
            if (obj != enumC32485OooO00o) {
            }
            return enumC32485OooO00o;
        }
        if (i == 1) {
            C32446OooOOOo.OooO0O0(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = this.f70062OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
            list2 = (List) obj;
            C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
            c20358OooO00o.OooOOO0("GoogleBillingDataSource");
            c20358OooO00o.OooO0o0("checkPendingPurchases: sub = " + list + ", in-app = " + list2, new Object[0]);
            C32465OooO0O0 c32465OooO0O0OooO0Oo = com.facebook.soloader.OooOo.OooO0Oo();
            if (list != null) {
                c32465OooO0O0OooO0Oo.addAll(list);
            }
            if (list2 != null) {
                c32465OooO0O0OooO0Oo.addAll(list2);
            }
            listIterator = com.facebook.soloader.OooOo.OooO0O0(c32465OooO0O0OooO0Oo).listIterator(0);
            while (true) {
                c20232OooO0O0 = (C32465OooO0O0.C20232OooO0O0) listIterator;
                if (c20232OooO0O0.hasNext()) {
                    return C32460OooOooO.f116667OooO00o;
                }
                googleBillingDataSource.OooO0o0((Purchase) c20232OooO0O0.next(), false);
            }
        }
        List list3 = (List) obj;
        this.f70062OooOo0o = list3;
        this.f70061OooOo = 2;
        AbstractC24338OooO0o0.OooO00o<Long> oooO00o2 = GoogleBillingDataSource.f70016OooOoO0;
        Object objOooOOO0 = googleBillingDataSource.OooOOO0("inapp", this);
        if (objOooOOO0 != enumC32485OooO00o) {
            list = list3;
            obj = objOooOOO0;
            list2 = (List) obj;
            C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
            c20358OooO00o2.OooOOO0("GoogleBillingDataSource");
            c20358OooO00o2.OooO0o0("checkPendingPurchases: sub = " + list + ", in-app = " + list2, new Object[0]);
            C32465OooO0O0 c32465OooO0O0OooO0Oo2 = com.facebook.soloader.OooOo.OooO0Oo();
            if (list != null) {
            }
            if (list2 != null) {
            }
            listIterator = com.facebook.soloader.OooOo.OooO0O0(c32465OooO0O0OooO0Oo2).listIterator(0);
            while (true) {
                c20232OooO0O0 = (C32465OooO0O0.C20232OooO0O0) listIterator;
                if (c20232OooO0O0.hasNext()) {
                }
                googleBillingDataSource.OooO0o0((Purchase) c20232OooO0O0.next(), false);
            }
        }
        return enumC32485OooO00o;
    }
}
