package com.orion.notein.data.repo.transactions;

import java.util.List;
import oO00ooOO.C32465OooO0O0;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: com.orion.notein.data.repo.transactions.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.transactions.GoogleBillingDataSource", m80623f = "GoogleBillingDataSource.kt", m80624l = {753, 761, 788, 809, 820, 878}, m80625m = "restorePurchasesLocked")
public final class C22935OooOoO extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public List f70136OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public GoogleBillingDataSource f70137OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public C32465OooO0O0 f70138OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public List f70139OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public /* synthetic */ Object f70140OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f70141OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ GoogleBillingDataSource f70142OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22935OooOoO(GoogleBillingDataSource googleBillingDataSource, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f70142OooOoo0 = googleBillingDataSource;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f70140OooOoOO = obj;
        this.f70141OooOoo |= Integer.MIN_VALUE;
        return GoogleBillingDataSource.OooO0O0(this.f70142OooOoo0, this);
    }
}
