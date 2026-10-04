package com.orion.notein.data.repo.transactions;

import java.util.Map;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: com.orion.notein.data.repo.transactions.OooooOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.transactions.GoogleBillingRepoImpl", m80623f = "GoogleBillingRepoImpl.kt", m80624l = {446, 450, 486, 505, 523, 538, 539}, m80625m = "restorePurchases")
public final class C22965OooooOo extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f70310OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f70311OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ Object f70312OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Map f70313OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C22949Oooo0oO f70314OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f70315OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22965OooooOo(C22949Oooo0oO c22949Oooo0oO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f70314OooOoOO = c22949Oooo0oO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f70312OooOoO = obj;
        this.f70315OooOoo0 |= Integer.MIN_VALUE;
        return this.f70314OooOoOO.OooO0Oo(null, false, this);
    }
}
