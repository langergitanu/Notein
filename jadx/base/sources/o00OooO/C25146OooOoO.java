package o00OooO;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: renamed from: o00OooO.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25146OooOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f85589OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Handler f85590OooO0O0 = new Handler(Looper.getMainLooper(), new OooO00o());

    /* JADX INFO: renamed from: o00OooO.OooOoO$OooO00o */
    public static final class OooO00o implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((InterfaceC25145OooOo0o) message.obj).recycle();
            return true;
        }
    }

    public final synchronized void OooO00o(InterfaceC25145OooOo0o<?> interfaceC25145OooOo0o, boolean z) {
        try {
            if (this.f85589OooO00o || z) {
                this.f85590OooO0O0.obtainMessage(1, interfaceC25145OooOo0o).sendToTarget();
            } else {
                this.f85589OooO00o = true;
                interfaceC25145OooOo0o.recycle();
                this.f85589OooO00o = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
