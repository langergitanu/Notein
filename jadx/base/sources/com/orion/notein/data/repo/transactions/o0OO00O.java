package com.orion.notein.data.repo.transactions;

import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.transactions.TransactionsRemoteDataSource", m80623f = "TransactionsRemoteDataSource.kt", m80624l = {75}, m80625m = "getAllProducts")
public final class o0OO00O extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ o0O0O00 f70365OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public /* synthetic */ Object f70366OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f70367OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OO00O(o0O0O00 o0o0o00, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f70365OooOo = o0o0o00;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f70366OooOo0o = obj;
        this.f70367OooOoO0 |= Integer.MIN_VALUE;
        return this.f70365OooOo.OooO00o(this);
    }
}
