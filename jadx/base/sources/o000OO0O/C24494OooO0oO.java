package o000OO0O;

import android.hardware.SyncFence;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o000OO0O.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24494OooO0oO implements InterfaceC24492OooO0Oo {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final SyncFence f82812OooOo0o;

    public C24494OooO0oO(SyncFence syncFence) {
        OooOOO0.OooO0oO(syncFence, "syncFence");
        this.f82812OooOo0o = syncFence;
    }

    @Override // o000OO0O.InterfaceC24492OooO0Oo
    public final long OooO00o() {
        return this.f82812OooOo0o.getSignalTime();
    }

    @Override // o000OO0O.InterfaceC24492OooO0Oo
    public final boolean OooO0OO() {
        return this.f82812OooOo0o.awaitForever();
    }

    @Override // o000OO0O.InterfaceC24492OooO0Oo
    public final void close() {
        this.f82812OooOo0o.close();
    }
}
