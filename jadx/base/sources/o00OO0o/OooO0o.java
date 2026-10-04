package o00OO0o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import oOooo0o.InterfaceC34620OooO00o;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o implements o00OO0OO.OooO00o {

    public static final class OooO00o implements ServiceConnection {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public boolean f84807OooOo0o = false;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final LinkedBlockingQueue<IBinder> f84806OooOo = new LinkedBlockingQueue<>();

        public final IBinder OooO00o() throws InterruptedException {
            if (this.f84807OooOo0o) {
                throw new IllegalStateException();
            }
            this.f84807OooOo0o = true;
            return this.f84806OooOo.poll(5L, TimeUnit.SECONDS);
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f84806OooOo.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
        }
    }

    @Override // o00OO0OO.OooO00o
    /* JADX INFO: renamed from: a */
    public final String mo1a(Context context) {
        OooO00o oooO00o = new OooO00o();
        Intent intent = new Intent();
        intent.setClassName("com.samsung.android.deviceidservice", "com.samsung.android.deviceidservice.DeviceIdService");
        if (context.bindService(intent, oooO00o, 1)) {
            try {
                return InterfaceC34620OooO00o.AbstractBinderC20365OooO00o.OooOo0(oooO00o.OooO00o()).mo80635a();
            } catch (Exception unused) {
            } finally {
                context.unbindService(oooO00o);
            }
        }
        return null;
    }
}
