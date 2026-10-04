package oO000Oo;

import oO000Oo.C32044o0000o0;

/* JADX INFO: renamed from: oO000Oo.o0000o0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class RunnableC32045o0000o0O implements Runnable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C32044o0000o0.OooO0OO f114562OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C32044o0000o0.OooO0O0 f114563OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C32044o0000o0 f114564OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f114565OooOoO0;

    public RunnableC32045o0000o0O(C32044o0000o0 c32044o0000o0, C32044o0000o0.OooO0O0 oooO0O0, C32044o0000o0.OooO0OO oooO0OO, Object obj) {
        this.f114564OooOoO = c32044o0000o0;
        this.f114563OooOo0o = oooO0O0;
        this.f114562OooOo = oooO0OO;
        this.f114565OooOoO0 = obj;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f114564OooOoO) {
            try {
                if (this.f114563OooOo0o.f114560OooO0O0 == 0) {
                    try {
                        this.f114562OooOo.OooO0O0(this.f114565OooOoO0);
                        this.f114564OooOoO.f114556OooO00o.remove(this.f114562OooOo);
                        if (this.f114564OooOoO.f114556OooO00o.isEmpty()) {
                            this.f114564OooOoO.f114558OooO0OO.shutdown();
                            this.f114564OooOoO.f114558OooO0OO = null;
                        }
                    } catch (Throwable th) {
                        this.f114564OooOoO.f114556OooO00o.remove(this.f114562OooOo);
                        if (this.f114564OooOoO.f114556OooO00o.isEmpty()) {
                            this.f114564OooOoO.f114558OooO0OO.shutdown();
                            this.f114564OooOoO.f114558OooO0OO = null;
                        }
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
