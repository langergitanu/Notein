package o00OO0o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Parcel;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: o00OO0o.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24992OooO0O0 implements o00OO0OO.OooO00o {

    /* JADX INFO: renamed from: o00OO0o.OooO0O0$OooO00o */
    public static final class OooO00o implements ServiceConnection {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public boolean f84800OooOo0o = false;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final LinkedBlockingQueue<IBinder> f84799OooOo = new LinkedBlockingQueue<>();

        public final IBinder OooO00o() throws InterruptedException {
            if (this.f84800OooOo0o) {
                throw new IllegalStateException();
            }
            this.f84800OooOo0o = true;
            return this.f84799OooOo.poll(5L, TimeUnit.SECONDS);
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f84799OooOo.put(iBinder);
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
        Intent intent = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
        intent.setPackage("com.huawei.hwid");
        if (context.bindService(intent, oooO00o, 1)) {
            try {
                IBinder iBinderOooO00o = oooO00o.OooO00o();
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                    iBinderOooO00o.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            } catch (Exception unused) {
            } finally {
                context.unbindService(oooO00o);
            }
        }
        return null;
    }
}
