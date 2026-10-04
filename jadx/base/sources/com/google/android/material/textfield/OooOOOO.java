package com.google.android.material.textfield;

import com.orion.notein.p607ui.notelist.folder.MoveToFolderFragment;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class OooOOOO implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f67772OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f67773OooOo0o;

    public /* synthetic */ OooOOOO(Object obj, int i) {
        this.f67773OooOo0o = i;
        this.f67772OooOo = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f67773OooOo0o) {
            case 0:
                ((TextInputLayout) this.f67772OooOo).lambda$onGlobalLayout$1();
                break;
            default:
                ((MoveToFolderFragment) this.f67772OooOo).Oooo000();
                break;
        }
    }
}
