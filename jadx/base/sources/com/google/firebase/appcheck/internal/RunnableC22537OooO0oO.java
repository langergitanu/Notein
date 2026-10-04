package com.google.firebase.appcheck.internal;

import com.orion.notein.p607ui.noteeditor.penbar.PenBarChildFragment;

/* JADX INFO: renamed from: com.google.firebase.appcheck.internal.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class RunnableC22537OooO0oO implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f67898OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f67899OooOo0o;

    public /* synthetic */ RunnableC22537OooO0oO(Object obj, int i) {
        this.f67899OooOo0o = i;
        this.f67898OooOo = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f67898OooOo;
        switch (this.f67899OooOo0o) {
            case 0:
                ((DefaultTokenRefresher) obj).onRefresh();
                break;
            default:
                int i = PenBarChildFragment.f75240o0000OOo;
                ((PenBarChildFragment) obj).Oooo000();
                break;
        }
    }
}
