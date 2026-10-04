package com.google.firebase.storage;

import android.content.Context;
import com.miui.penengine.facade.algorithm.JNIPathEstimateInterface;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class OooO implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f68697OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f68698OooOo0o;

    public /* synthetic */ OooO(Object obj, int i) {
        this.f68698OooOo0o = i;
        this.f68697OooOo = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f68698OooOo0o) {
            case 0:
                ((StorageTask) this.f68697OooOo).lambda$getRunnable$7();
                break;
            default:
                JNIPathEstimateInterface.init(((Context) this.f68697OooOo).getAssets(), "predict/estimate.hdb", 0, true);
                break;
        }
    }
}
