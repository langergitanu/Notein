package com.orion.notein.data.repo.transactions;

import com.android.billingclient.api.Purchase;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import o0000oOO.AbstractC24338OooO0o0;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: com.orion.notein.data.repo.transactions.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.transactions.GoogleBillingDataSource", m80623f = "GoogleBillingDataSource.kt", m80624l = {456}, m80625m = "queryInAppPurchasesFromServer")
public final class C22929OooOOo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public List f70096OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public GoogleBillingDataSource f70097OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Purchase f70098OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Iterator f70099OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public Collection f70100OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public /* synthetic */ Object f70101OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public Iterator f70102OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ GoogleBillingDataSource f70103OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public int f70104OooOooo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22929OooOOo(GoogleBillingDataSource googleBillingDataSource, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f70103OooOooO = googleBillingDataSource;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f70101OooOoo = obj;
        this.f70104OooOooo |= Integer.MIN_VALUE;
        AbstractC24338OooO0o0.OooO00o<Long> oooO00o = GoogleBillingDataSource.f70016OooOoO0;
        return this.f70103OooOooO.OooOO0O(null, this);
    }
}
