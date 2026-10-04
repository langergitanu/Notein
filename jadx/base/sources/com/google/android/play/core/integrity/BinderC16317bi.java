package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.AbstractBinderC16399j;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.bi */
/* JADX INFO: loaded from: classes7.dex */
class BinderC16317bi extends AbstractBinderC16399j {

    /* JADX INFO: renamed from: a */
    final TaskCompletionSource f51475a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C16322bn f51476b;

    public BinderC16317bi(C16322bn c16322bn, TaskCompletionSource taskCompletionSource) {
        this.f51476b = c16322bn;
        this.f51475a = taskCompletionSource;
    }

    @Override // com.google.android.play.integrity.internal.InterfaceC16400k
    /* JADX INFO: renamed from: b */
    public final void mo74959b(Bundle bundle) throws RemoteException {
        this.f51476b.f51484a.m75014v(this.f51475a);
    }

    @Override // com.google.android.play.integrity.internal.InterfaceC16400k
    /* JADX INFO: renamed from: c */
    public void mo74960c(Bundle bundle) throws RemoteException {
        this.f51476b.f51484a.m75014v(this.f51475a);
    }

    @Override // com.google.android.play.integrity.internal.InterfaceC16400k
    /* JADX INFO: renamed from: d */
    public final void mo74961d(Bundle bundle) throws RemoteException {
        this.f51476b.f51484a.m75014v(this.f51475a);
    }

    @Override // com.google.android.play.integrity.internal.InterfaceC16400k
    /* JADX INFO: renamed from: e */
    public void mo74962e(Bundle bundle) throws RemoteException {
        this.f51476b.f51484a.m75014v(this.f51475a);
    }
}
