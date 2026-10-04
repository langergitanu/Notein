package com.orion.notein.data.repo.transactions;

import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: com.orion.notein.data.repo.transactions.Oooooo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.transactions.GoogleBillingRepoImpl", m80623f = "GoogleBillingRepoImpl.kt", m80624l = {562, 568, 586, 609, 610}, m80625m = "restorePurchases")
public final class C22967Oooooo0 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f70318OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f70319OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C22949Oooo0oO f70320OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f70321OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f70322OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22967Oooooo0(C22949Oooo0oO c22949Oooo0oO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f70320OooOoO = c22949Oooo0oO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f70321OooOoO0 = obj;
        this.f70322OooOoOO |= Integer.MIN_VALUE;
        return this.f70320OooOoO.OooO0o(null, null, null, this);
    }
}
