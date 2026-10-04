package com.orion.notein.data.repo.transactions;

import java.io.Serializable;
import java.util.Map;
import oO00ooOO.C32466OooO0OO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: com.orion.notein.data.repo.transactions.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.transactions.GoogleBillingDataSource", m80623f = "GoogleBillingDataSource.kt", m80624l = {424, 428}, m80625m = "queryPurchasesByType")
public final class C22932OooOo0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Serializable f70117OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f70118OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public String f70119OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Map f70120OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public C32466OooO0OO f70121OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ GoogleBillingDataSource f70122OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public /* synthetic */ Object f70123OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f70124OooOooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22932OooOo0(GoogleBillingDataSource googleBillingDataSource, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f70122OooOoo = googleBillingDataSource;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f70123OooOoo0 = obj;
        this.f70124OooOooO |= Integer.MIN_VALUE;
        return this.f70122OooOoo.OooOO0o(this);
    }
}
