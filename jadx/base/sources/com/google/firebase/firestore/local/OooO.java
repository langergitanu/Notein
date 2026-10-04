package com.google.firebase.firestore.local;

import com.orion.notein.p607ui.creative_library.C23059Oooo0oO;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class OooO implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f68188OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f68189OooOo0o;

    public /* synthetic */ OooO(Object obj, int i) {
        this.f68189OooOo0o = i;
        this.f68188OooOo = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f68189OooOo0o) {
            case 0:
                ((LocalStore) this.f68188OooOo).lambda$startIndexManager$0();
                break;
            default:
                ((C23059Oooo0oO.OooO0O0) this.f68188OooOo).OooO00o();
                break;
        }
    }
}
