package o0oO0O0o;

import OooOOO0.AbstractC20449OooO0Oo;
import android.content.Context;
import android.os.AsyncTask;
import java.io.FileInputStream;
import o0O0oooO.o00oO0O;

/* JADX INFO: renamed from: o0oO0O0o.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class AsyncTaskC30783OooO0O0 extends AsyncTask<Context, Integer, Boolean> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static volatile boolean f110066OooO00o = false;

    public static void OooO00o() {
        if (f110066OooO00o) {
            return;
        }
        f110066OooO00o = true;
        long j = C30785OooO0Oo.OooO00o(o00oO0O.f90432OooO0OO).getLong("lastCheckTime", 0L);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - j <= 432000000) {
            o00OOOo.OooO0OO.OooO0Oo("OooO0O0", "checkUpgradeBks, ignore");
            return;
        }
        C30785OooO0Oo.OooO00o(o00oO0O.f90432OooO0OO).edit().putLong("lastCheckTime", jCurrentTimeMillis).apply();
        o00OOOo.OooO0OO.OooO0Oo("OooO0O0", "checkUpgradeBks, execute check task");
        new AsyncTaskC30783OooO0O0().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, o00oO0O.f90432OooO0OO);
    }

    @Override // android.os.AsyncTask
    public final Boolean doInBackground(Context[] contextArr) {
        FileInputStream fileInputStreamOooO;
        Context[] contextArr2 = contextArr;
        System.currentTimeMillis();
        try {
            fileInputStreamOooO = C30782OooO00o.OooO(contextArr2[0]);
        } catch (Exception e) {
            o00OOOo.OooO0OO.OooO0OO("OooO0O0", "doInBackground: exception : " + e.getMessage());
            fileInputStreamOooO = null;
        }
        System.currentTimeMillis();
        if (fileInputStreamOooO == null) {
            return Boolean.FALSE;
        }
        AbstractC20449OooO0Oo.OooO0o(fileInputStreamOooO);
        return Boolean.TRUE;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Boolean bool) {
        if (bool.booleanValue()) {
            o00OOOo.OooO0OO.OooO0Oo("OooO0O0", "onPostExecute: upate done");
        } else {
            o00OOOo.OooO0OO.OooO0OO("OooO0O0", "onPostExecute: upate failed");
        }
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
    }

    @Override // android.os.AsyncTask
    public final void onProgressUpdate(Integer[] numArr) {
        o00OOOo.OooO0OO.OooO0Oo("OooO0O0", "onProgressUpdate");
    }
}
