package com.google.firebase.messaging;

import com.google.android.gms.tasks.TaskCompletionSource;
import o0oooo.C31862OooO00o;
import ooOOOOoo.C35063OooO0OO;
import ooOOOOoo.C35074OooOOo0;
import ooOOOOoo.C35079OooOoO;

/* JADX INFO: renamed from: com.google.firebase.messaging.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class RunnableC22778OooOo0o implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f68609OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f68610OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f68611OooOoO0;

    public /* synthetic */ RunnableC22778OooOo0o(int i, Object obj, Object obj2) {
        this.f68610OooOo0o = i;
        this.f68609OooOo = obj;
        this.f68611OooOoO0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f68610OooOo0o) {
            case 0:
                ((ImageDownload) this.f68609OooOo).lambda$start$0((TaskCompletionSource) this.f68611OooOoO0);
                break;
            default:
                C35063OooO0OO c35063OooO0OO = (C35063OooO0OO) this.f68609OooOo;
                c35063OooO0OO.getClass();
                C31862OooO00o c31862OooO00o = (C31862OooO00o) this.f68611OooOoO0;
                c35063OooO0OO.f125952OooO00o = !C35074OooOOo0.OooO0o(c31862OooO00o.f113561OooO00o) ? null : new ooOOOOoo.OooOO0(c31862OooO00o);
                c35063OooO0OO.f125953OooO0O0 = C35074OooOOo0.OooO0o0(c31862OooO00o.f113561OooO00o) ? new C35079OooOoO(c31862OooO00o) : null;
                break;
        }
    }
}
