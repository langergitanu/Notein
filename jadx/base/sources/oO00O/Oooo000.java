package oO00O;

import o0Oo00oO.C28035OooO00o;
import oO00Oo0.C32266OooO0Oo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0Ooo0O.C33413Oooo0o;
import oO0o0OO.C33664o00000Oo;

/* JADX INFO: loaded from: classes10.dex */
public final class Oooo000 extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f115363OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f115364OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Oooo000(Object obj, int i) {
        super(1);
        this.f115364OooOo0o = i;
        this.f115363OooOo = obj;
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        switch (this.f115364OooOo0o) {
            case 0:
                oO00Oo0.OooO0OO sendHandshakeRecord = (oO00Oo0.OooO0OO) obj;
                kotlin.jvm.internal.OooOOO0.OooO0oO(sendHandshakeRecord, "$this$sendHandshakeRecord");
                sendHandshakeRecord.o0000oO((C32266OooO0Oo) this.f115363OooOo);
                break;
            default:
                Throwable th = (Throwable) obj;
                C33664o00000Oo c33664o00000Oo = (C33664o00000Oo) this.f115363OooOo;
                if (th != null) {
                    C33413Oooo0o.f120798OooO00o.OooO0oo("Cancelling request because engine Job failed with error: " + th);
                    c33664o00000Oo.cancel(C28035OooO00o.OooO00o("Engine failed", th));
                } else {
                    C33413Oooo0o.f120798OooO00o.OooO0oo("Cancelling request because engine Job completed");
                    c33664o00000Oo.complete();
                }
                break;
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
