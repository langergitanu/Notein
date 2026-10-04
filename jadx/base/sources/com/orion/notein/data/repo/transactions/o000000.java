package com.orion.notein.data.repo.transactions;

import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.transactions.TransactionsRepoImpl", m80623f = "TransactionsRepoImpl.kt", m80624l = {60}, m80625m = "getPurchaseHintsDetailed")
public final class o000000 extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f70327OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public o000000O f70328OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f70329OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ o000000O f70330OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000000(o000000O o000000o2, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f70330OooOoO0 = o000000o2;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f70327OooOo = obj;
        this.f70329OooOoO |= Integer.MIN_VALUE;
        return this.f70330OooOoO0.OooO0O0(this);
    }
}
