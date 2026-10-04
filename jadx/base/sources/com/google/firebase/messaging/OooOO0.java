package com.google.firebase.messaging;

import android.content.Context;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o0000OO0.OooO;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class OooOO0 implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f68591OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f68592OooOo0o;

    public /* synthetic */ OooOO0(Object obj, int i) {
        this.f68592OooOo0o = i;
        this.f68591OooOo = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f68592OooOo0o) {
            case 0:
                ((FirebaseMessaging) this.f68591OooOo).lambda$new$4();
                break;
            default:
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
                final Context context = (Context) this.f68591OooOo;
                threadPoolExecutor.execute(new Runnable() { // from class: o000oOoo.OooO0o0
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.profileinstaller.OooO0OO.OooO0O0(context, new OooO(), androidx.profileinstaller.OooO0OO.f65742OooO00o, false);
                    }
                });
                break;
        }
    }
}
