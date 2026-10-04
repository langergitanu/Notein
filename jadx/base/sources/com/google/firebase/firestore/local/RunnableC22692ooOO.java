package com.google.firebase.firestore.local;

import android.widget.ScrollView;

/* JADX INFO: renamed from: com.google.firebase.firestore.local.ooOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class RunnableC22692ooOO implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f68351OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f68352OooOo0o;

    public /* synthetic */ RunnableC22692ooOO(Object obj, int i) {
        this.f68352OooOo0o = i;
        this.f68351OooOo = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f68352OooOo0o) {
            case 0:
                ((SQLiteOverlayMigrationManager) this.f68351OooOo).lambda$buildOverlays$0();
                break;
            default:
                ((ScrollView) this.f68351OooOo).fullScroll(130);
                break;
        }
    }
}
