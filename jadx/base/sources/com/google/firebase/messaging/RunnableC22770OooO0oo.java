package com.google.firebase.messaging;

import o0o00oOo.C30051OooOooO;

/* JADX INFO: renamed from: com.google.firebase.messaging.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class RunnableC22770OooO0oo implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f68589OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f68590OooOo0o;

    public /* synthetic */ RunnableC22770OooO0oo(Object obj, int i) {
        this.f68590OooOo0o = i;
        this.f68589OooOo = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f68590OooOo0o) {
            case 0:
                ((FirebaseMessaging) this.f68589OooOo).lambda$new$2();
                break;
            default:
                ((C30051OooOooO) this.f68589OooOo).f106870OooOOo0.compareAndSet(false, true);
                break;
        }
    }
}
