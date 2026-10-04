package com.orion.notein.data.repo.transactions;

import java.util.ArrayList;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;

/* JADX INFO: renamed from: com.orion.notein.data.repo.transactions.OooooOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.data.repo.transactions.GoogleBillingRepoImpl", m80623f = "GoogleBillingRepoImpl.kt", m80624l = {193, 195}, m80625m = "getUserMembershipSync")
public final class C22964OooooOO extends AbstractC32479OooO0OO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f70304OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public C22949Oooo0oO f70305OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public /* synthetic */ Object f70306OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public ArrayList f70307OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C22949Oooo0oO f70308OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f70309OooOoo0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22964OooooOO(C22949Oooo0oO c22949Oooo0oO, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        super(abstractC32479OooO0OO);
        this.f70308OooOoOO = c22949Oooo0oO;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        this.f70306OooOoO = obj;
        this.f70309OooOoo0 |= Integer.MIN_VALUE;
        return this.f70308OooOoOO.OooOOO0(null, this);
    }
}
