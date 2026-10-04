package com.google.firebase.firestore.remote;

import com.google.firebase.remoteconfig.ConfigUpdate;
import o00ooO0.C25749OooOoO0;
import o0O0O0oo.C25875OooO0O0;
import o0O0O0oo.C25876OooO0Oo;
import oO0OOo0o.AbstractC33093Oooo0oo;
import oO0o0OOo.InterfaceC33712OooOo0O;

/* JADX INFO: renamed from: com.google.firebase.firestore.remote.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class RunnableC22702OooOOo0 implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f68388OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f68389OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f68390OooOoO0;

    public /* synthetic */ RunnableC22702OooOOo0(int i, Object obj, Object obj2) {
        this.f68389OooOo0o = i;
        this.f68388OooOo = obj;
        this.f68390OooOoO0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f68389OooOo0o) {
            case 0:
                ((GrpcCallProvider) this.f68388OooOo).lambda$onConnectivityStateChange$3((AbstractC33093Oooo0oo) this.f68390OooOoO0);
                break;
            case 1:
                C25749OooOoO0.OooO0o0((InterfaceC33712OooOo0O) this.f68388OooOo, (ConfigUpdate) this.f68390OooOoO0);
                break;
            default:
                ((C25876OooO0Oo) this.f68388OooOo).OooO00o(((C25875OooO0O0) this.f68390OooOoO0).OooO0O0());
                break;
        }
    }
}
