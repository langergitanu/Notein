package com.orion.notein.data.repo.transactions;

import java.util.Iterator;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: com.orion.notein.data.repo.transactions.Oooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.transactions.GoogleBillingRepoImpl", m80623f = "GoogleBillingRepoImpl.kt", m80624l = {208, 213, 217, 222}, m80625m = "checkPendingPurchases")
public final class C22947Oooo0o extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f70187OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C22949Oooo0oO f70188OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ Object f70189OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Iterator f70190OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C22949Oooo0oO f70191OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f70192OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22947Oooo0o(C22949Oooo0oO c22949Oooo0oO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f70191OooOoOO = c22949Oooo0oO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f70189OooOoO = obj;
        this.f70192OooOoo0 |= Integer.MIN_VALUE;
        return this.f70191OooOoOO.OooOOOO(null, this);
    }
}
