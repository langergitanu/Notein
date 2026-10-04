package com.orion.notein.data.repo.transactions;

import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.transactions.GoogleBillingDataSource", m80623f = "GoogleBillingDataSource.kt", m80624l = {610, 625}, m80625m = "queryAndUpdatePurchasesServerLocked")
public final class OooOOO extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f70084OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public GoogleBillingDataSource f70085OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f70086OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ GoogleBillingDataSource f70087OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO(GoogleBillingDataSource googleBillingDataSource, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f70087OooOoO0 = googleBillingDataSource;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f70084OooOo = obj;
        this.f70086OooOoO |= Integer.MIN_VALUE;
        return GoogleBillingDataSource.OooO00o(this.f70087OooOoO0, this);
    }
}
