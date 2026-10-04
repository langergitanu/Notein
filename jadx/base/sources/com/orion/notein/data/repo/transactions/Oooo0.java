package com.orion.notein.data.repo.transactions;

import com.orion.notein.data.repo.transactions.GoogleBillingDataSource;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import o0000oOO.C24334OooO0O0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.transactions.GoogleBillingDataSource$updateLocalPurchases$2", m80623f = "GoogleBillingDataSource.kt", m80624l = {}, m80625m = "invokeSuspend")
public final class Oooo0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<C24334OooO0O0, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ AbstractList f70166OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f70167OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ GoogleBillingDataSource f70168OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oooo0(AbstractList abstractList, GoogleBillingDataSource googleBillingDataSource, Continuation continuation) {
        super(2, continuation);
        this.f70166OooOo = abstractList;
        this.f70168OooOoO0 = googleBillingDataSource;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        Oooo0 oooo0 = new Oooo0(this.f70166OooOo, this.f70168OooOoO0, continuation);
        oooo0.f70167OooOo0o = obj;
        return oooo0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(C24334OooO0O0 c24334OooO0O0, Continuation<? super C32460OooOooO> continuation) {
        return ((Oooo0) create(c24334OooO0O0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        C24334OooO0O0 c24334OooO0O0 = (C24334OooO0O0) this.f70167OooOo0o;
        AbstractList abstractList = this.f70166OooOo;
        ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(abstractList, 10));
        Iterator it = abstractList.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f70168OooOoO0.f70034OooOOOo.toJson((GoogleBillingDataSource.TinyPurchase) it.next()));
        }
        c24334OooO0O0.OooO0oO(GoogleBillingDataSource.f70017OooOoOO, oOo000Oo.OooOo.o0OO00O(arrayList));
        return C32460OooOooO.f116667OooO00o;
    }
}
