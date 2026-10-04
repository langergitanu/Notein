package com.google.android.play.integrity.internal;

import android.os.IBinder;
import android.os.IInterface;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.aa */
/* JADX INFO: loaded from: classes7.dex */
final class C16361aa extends AbstractRunnableC16409t {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ IBinder f51535a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ ServiceConnectionC16364ad f51536b;

    public C16361aa(ServiceConnectionC16364ad serviceConnectionC16364ad, IBinder iBinder) {
        this.f51535a = iBinder;
        this.f51536b = serviceConnectionC16364ad;
    }

    @Override // com.google.android.play.integrity.internal.AbstractRunnableC16409t
    /* JADX INFO: renamed from: b */
    public final void mo74937b() {
        this.f51536b.f51538a.f51553o = (IInterface) this.f51536b.f51538a.f51548j.mo74935a(this.f51535a);
        C16365ae.m75006r(this.f51536b.f51538a);
        this.f51536b.f51538a.f51546h = false;
        Iterator it = this.f51536b.f51538a.f51543e.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f51536b.f51538a.f51543e.clear();
    }
}
