package com.google.firebase.firestore.core;

import com.google.firebase.firestore.EventListener;
import com.google.firebase.inappmessaging.ExperimentPayloadProto;
import com.google.firebase.inappmessaging.internal.AbtIntegrationHelper;

/* JADX INFO: renamed from: com.google.firebase.firestore.core.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class RunnableC22620OooO0oo implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f68143OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f68144OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f68145OooOoO0;

    public /* synthetic */ RunnableC22620OooO0oo(int i, Object obj, Object obj2) {
        this.f68144OooOo0o = i;
        this.f68143OooOo = obj;
        this.f68145OooOoO0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f68144OooOo0o) {
            case 0:
                ((FirestoreClient) this.f68143OooOo).lambda$addSnapshotsInSyncListener$18((EventListener) this.f68145OooOoO0);
                break;
            default:
                ((AbtIntegrationHelper) this.f68143OooOo).lambda$setExperimentActive$1((ExperimentPayloadProto.ExperimentPayload) this.f68145OooOoO0);
                break;
        }
    }
}
