package com.orion.notein.data.repo.transactions;

import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: com.orion.notein.data.repo.transactions.Oooo0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.transactions.GoogleBillingRepoImpl", m80623f = "GoogleBillingRepoImpl.kt", m80624l = {704, 709, 718}, m80625m = "fetchGoogleDeveloperOffers")
public final class C22950Oooo0oo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f70228OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C22949Oooo0oO f70229OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C22949Oooo0oO f70230OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public /* synthetic */ Object f70231OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f70232OooOoOO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22950Oooo0oo(C22949Oooo0oO c22949Oooo0oO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f70230OooOoO = c22949Oooo0oO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f70231OooOoO0 = obj;
        this.f70232OooOoOO |= Integer.MIN_VALUE;
        return this.f70230OooOoO.OooO0o0(null, this);
    }
}
