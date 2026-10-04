package o000OO0O;

import android.hardware.SyncFence;
import androidx.hardware.SyncFenceV19;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO implements AutoCloseable {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InterfaceC24492OooO0Oo f82811OooOo0o;

    public OooO0OO(SyncFenceV19 syncFenceV19) {
        this.f82811OooOo0o = syncFenceV19;
    }

    public final void OooO00o() {
        this.f82811OooOo0o.OooO0OO();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f82811OooOo0o.close();
    }

    public OooO0OO(SyncFence syncFence) {
        OooOOO0.OooO0oO(syncFence, "syncFence");
        this.f82811OooOo0o = new C24494OooO0oO(syncFence);
    }
}
