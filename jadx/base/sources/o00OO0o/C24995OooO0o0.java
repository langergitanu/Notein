package o00OO0o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Looper;
import android.os.RemoteException;
import o00OO0O0.C24990OooO0Oo;

/* JADX INFO: renamed from: o00OO0o.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24995OooO0o0 implements o00OO0OO.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f84808OooO00o;

    @Override // o00OO0OO.OooO00o
    /* JADX INFO: renamed from: a */
    public final String mo1a(Context context) {
        if (context == null) {
            return null;
        }
        if (!this.f84808OooO00o) {
            C24990OooO0Oo c24990OooO0Oo = C24990OooO0Oo.OooO0O0.f84793OooO00o;
            Context applicationContext = context.getApplicationContext();
            c24990OooO0Oo.getClass();
            boolean z = false;
            try {
                PackageInfo packageInfo = applicationContext.getPackageManager().getPackageInfo("com.heytap.openid", 0);
                if (Build.VERSION.SDK_INT < 28 ? !(packageInfo == null || packageInfo.versionCode < 1) : !(packageInfo == null || packageInfo.getLongVersionCode() < 1)) {
                    z = true;
                }
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
            }
            o00OO0O0.OooO0O0.f84784OooO0O0 = z;
            o00OO0O0.OooO0O0.f84783OooO00o = true;
            this.f84808OooO00o = true;
        }
        boolean z2 = o00OO0O0.OooO0O0.f84783OooO00o;
        if (!z2) {
            throw new RuntimeException("SDK Need Init First!");
        }
        if (!o00OO0O0.OooO0O0.f84784OooO0O0) {
            return null;
        }
        if (!z2) {
            throw new RuntimeException("SDK Need Init First!");
        }
        C24990OooO0Oo c24990OooO0Oo2 = C24990OooO0Oo.OooO0O0.f84793OooO00o;
        Context applicationContext2 = context.getApplicationContext();
        synchronized (c24990OooO0Oo2) {
            try {
            } finally {
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                throw new IllegalStateException("Cannot run on MainThread");
            }
            if (c24990OooO0Oo2.f84787OooO00o != null) {
                try {
                    return c24990OooO0Oo2.OooO00o(applicationContext2);
                } catch (RemoteException e2) {
                    e2.printStackTrace();
                    return "";
                }
            }
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("com.heytap.openid", "com.heytap.openid.IdentifyService"));
            intent.setAction("action.com.heytap.openid.OPEN_ID_SERVICE");
            if (applicationContext2.bindService(intent, c24990OooO0Oo2.f84791OooO0o0, 1)) {
                synchronized (c24990OooO0Oo2.f84790OooO0Oo) {
                    try {
                        c24990OooO0Oo2.f84790OooO0Oo.wait(3000L);
                    } catch (InterruptedException e3) {
                        e3.printStackTrace();
                    }
                }
            }
            if (c24990OooO0Oo2.f84787OooO00o == null) {
                return "";
            }
            try {
                return c24990OooO0Oo2.OooO00o(applicationContext2);
            } catch (RemoteException e4) {
                e4.printStackTrace();
                return "";
            }
        }
    }
}
