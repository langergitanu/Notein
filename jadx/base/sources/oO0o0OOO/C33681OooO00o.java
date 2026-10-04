package oO0o0OOO;

import android.os.Looper;
import oO0o0Ooo.InterfaceC33831OooOOO;

/* JADX INFO: renamed from: oO0o0OOO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33681OooO00o implements InterfaceC33831OooOOO {
    @Override // oO0o0Ooo.InterfaceC33831OooOOO
    public final C33685OooO0o OooO00o() {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new C33685OooO0o(C33688OooO0oo.OooO00o(mainLooper));
        }
        throw new IllegalStateException("The main looper is not available");
    }
}
