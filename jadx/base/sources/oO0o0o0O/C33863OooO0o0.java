package oO0o0o0O;

import java.util.concurrent.CancellationException;
import oO00oO00.InterfaceC32401OooO00o;

/* JADX INFO: renamed from: oO0o0o0O.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33863OooO0o0 implements InterfaceC32401OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C33867OooOO0O f122001OooO00o;

    public C33863OooO0o0(C33867OooOO0O c33867OooOO0O) {
        this.f122001OooO00o = c33867OooOO0O;
    }

    @Override // oO00oO00.InterfaceC32401OooO00o
    public final void cancel() {
        this.f122001OooO00o.cancel((CancellationException) null);
    }
}
