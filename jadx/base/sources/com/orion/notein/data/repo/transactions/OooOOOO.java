package com.orion.notein.data.repo.transactions;

import o0000oOO.AbstractC24338OooO0o0;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.transactions.GoogleBillingDataSource", m80623f = "GoogleBillingDataSource.kt", m80624l = {633, 635, 646, 648}, m80625m = "queryAndUpdatePurchasesServerLocked")
public final class OooOOOO extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Object f70090OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public GoogleBillingDataSource f70091OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ GoogleBillingDataSource f70092OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f70093OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f70094OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOOO(GoogleBillingDataSource googleBillingDataSource, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f70092OooOoO = googleBillingDataSource;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f70093OooOoO0 = obj;
        this.f70094OooOoOO |= Integer.MIN_VALUE;
        AbstractC24338OooO0o0.OooO00o<Long> oooO00o = GoogleBillingDataSource.f70016OooOoO0;
        return this.f70092OooOoO.OooOO0(null, this);
    }
}
