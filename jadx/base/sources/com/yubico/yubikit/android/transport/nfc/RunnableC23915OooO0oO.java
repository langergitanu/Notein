package com.yubico.yubikit.android.transport.nfc;

import android.nfc.tech.IsoDep;
import java.io.IOException;

/* JADX INFO: renamed from: com.yubico.yubikit.android.transport.nfc.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class RunnableC23915OooO0oO implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Runnable f80232OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ OooO f80233OooOo0o;

    public /* synthetic */ RunnableC23915OooO0oO(OooO oooO, Runnable runnable) {
        this.f80233OooOo0o = oooO;
        this.f80232OooOo = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OooO oooO = this.f80233OooOo0o;
        oooO.getClass();
        try {
            IsoDep isoDep = IsoDep.get(oooO.f80225OooOoO0);
            isoDep.connect();
            while (isoDep.isConnected()) {
                Thread.sleep(250L);
            }
        } catch (IOException | InterruptedException | SecurityException unused) {
        }
        this.f80232OooOo.run();
    }
}
