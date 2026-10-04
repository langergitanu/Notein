package com.orion.notein.data.repo.transactions;

import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.C33649OoooOOo;
import oO0o0o0o.C33874OooO0OO;
import oO0o0o0o.ExecutorC33873OooO0O0;

/* JADX INFO: renamed from: com.orion.notein.data.repo.transactions.OooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class RunnableC22938OooOoo implements Runnable {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ GoogleBillingDataSource f70150OooOo0o;

    public RunnableC22938OooOoo(GoogleBillingDataSource googleBillingDataSource) {
        this.f70150OooOo0o = googleBillingDataSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C33874OooO0OO c33874OooO0OO = C33649OoooOOo.f121328OooO00o;
        C33609OooO0oo.OooO0OO(C33633Oooo0.OooO00o(ExecutorC33873OooO0O0.f122045OooOoO0), null, null, new OooOo00(this.f70150OooOo0o, null), 3);
    }
}
