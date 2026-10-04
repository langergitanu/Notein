package com.google.firebase.firestore.remote;

import OooOoOO.C20519OooO0Oo;
import com.yubico.yubikit.android.transport.usb.C23918OooO0o0;
import com.yubico.yubikit.android.transport.usb.C23919OooO0oO;
import java.io.IOException;
import oO00000.C31906OooO0Oo;
import oO0OOo0o.AbstractC33093Oooo0oo;

/* JADX INFO: renamed from: com.google.firebase.firestore.remote.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class RunnableC22704OooOo0 implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f68395OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f68396OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f68397OooOoO0;

    public /* synthetic */ RunnableC22704OooOo0(int i, Object obj, Object obj2) {
        this.f68396OooOo0o = i;
        this.f68395OooOo = obj;
        this.f68397OooOoO0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p617o.OooO00o oooO00o;
        oO00000.OooO00o<C31906OooO0Oo<p617o.OooO00o, IOException>> oooO00oTake;
        switch (this.f68396OooOo0o) {
            case 0:
                ((GrpcCallProvider) this.f68395OooOo).lambda$resetChannel$4((AbstractC33093Oooo0oo) this.f68397OooOoO0);
                return;
            default:
                C23919OooO0oO.OooO00o oooO00o2 = (C23919OooO0oO.OooO00o) this.f68395OooOo;
                oooO00o2.getClass();
                try {
                    oooO00o = (p617o.OooO00o) C23919OooO0oO.this.f80265OooOo.OooO0O0(p617o.OooO00o.class);
                } catch (IOException e) {
                    ((C23918OooO0o0) this.f68397OooOoO0).invoke(C31906OooO0Oo.OooO00o(e));
                    return;
                }
                while (true) {
                    try {
                        try {
                            oooO00oTake = oooO00o2.f80273OooOo0o.take();
                        } catch (InterruptedException e2) {
                            e2.printStackTrace();
                        }
                        if (oooO00oTake == C23919OooO0oO.f80264OooOooo) {
                            C23919OooO0oO.f80263OooOooO.OooOOo("Closing CachedOtpConnection");
                            oooO00o.close();
                            return;
                        } else {
                            try {
                                oooO00oTake.invoke(new C31906OooO0Oo<>(oooO00o, null));
                            } catch (Exception e3) {
                                C20519OooO0Oo.OooO0Oo(1, C23919OooO0oO.f80263OooOooO, "OtpConnection callback threw an exception", e3);
                            }
                        }
                    } finally {
                        try {
                            break;
                        } catch (Throwable th) {
                        }
                    }
                    ((C23918OooO0o0) this.f68397OooOoO0).invoke(C31906OooO0Oo.OooO00o(e));
                    return;
                }
        }
    }
}
