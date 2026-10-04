package oOO00o0;

import android.content.Context;
import android.util.Log;
import java.io.File;
import oOO00Ooo.C34364OooO00o;
import oOO00o0.OooO0O0;

/* JADX INFO: renamed from: oOO00o0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34369OooO0Oo extends OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final RunnableC34368OooO00o f123353OooO00o = new RunnableC34368OooO00o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static String f123354OooO0O0 = "";

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static C34369OooO0Oo f123355OooO0OO;

    /* JADX INFO: renamed from: oOO00o0.OooO0Oo$OooO00o */
    public static class OooO00o extends Thread {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public Context f123356OooOo0o;

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            Context context = this.f123356OooOo0o;
            try {
                try {
                    String strOooO0O0 = OooO0O0.OooO00o.OooO0O0(context);
                    OooO0O0.OooO00o.OooO00o(context);
                    Log.i("honorid", "deleteLogFile");
                    File file = new File(strOooO0O0, "apphnid.txt");
                    File file2 = new File(strOooO0O0, "apphnid.txt.bak");
                    C34364OooO00o.OooO0Oo(file);
                    C34364OooO00o.OooO0Oo(file2);
                    RunnableC34368OooO00o runnableC34368OooO00o = C34369OooO0Oo.f123353OooO00o;
                    File file3 = new File(strOooO0O0, "honorid_advanced_log.txt");
                    runnableC34368OooO00o.getClass();
                    File parentFile = file3.getParentFile();
                    if (parentFile == null) {
                        Log.w("FileLogger", "logDir is null");
                    } else {
                        if (!parentFile.mkdirs()) {
                            Log.w("FileLogger", "Failed to create the log dir or has created.");
                        }
                        if (parentFile.isDirectory()) {
                            runnableC34368OooO00o.f123351OooOoO0 = file3;
                            new Thread(runnableC34368OooO00o, "hnid-log-thread").start();
                        } else {
                            Log.w("FileLogger", "Failed to create the log dir.");
                        }
                    }
                    OooO0OO.f123352OooO00o = runnableC34368OooO00o;
                } catch (ArrayIndexOutOfBoundsException e) {
                    Log.e("honorid", "ArrayIndexOutOfBoundsException" + e.getMessage());
                    OooO0O0.OooO00o.OooO00o(context);
                } catch (Exception e2) {
                    Log.e("honorid", "Exception".concat(e2.getClass().getSimpleName()));
                    OooO0O0.OooO00o.OooO00o(context);
                }
            } catch (Throwable th) {
                OooO0O0.OooO00o.OooO00o(context);
                throw th;
            }
        }
    }

    public static synchronized void OooO0O0(int i, String str, String str2) {
        if (Log.isLoggable("honorid", i)) {
            if (str2 == null) {
                str2 = "";
            }
            try {
                Log.println(i, f123354OooO0O0 + str, str2);
            } catch (IllegalArgumentException e) {
                Log.e("honorid", "println IllegalArgumentException" + e.getMessage());
            } catch (Exception e2) {
                Log.e("honorid", "println Exception".concat(e2.getClass().getSimpleName()));
            }
        }
    }

    public static synchronized C34369OooO0Oo OooO0OO(Context context) {
        try {
            if (f123355OooO0OO == null) {
                C34369OooO0Oo c34369OooO0Oo = new C34369OooO0Oo();
                OooO00o oooO00o = new OooO00o();
                oooO00o.f123356OooOo0o = context;
                oooO00o.start();
                f123355OooO0OO = c34369OooO0Oo;
                f123354OooO0O0 = OooO0O0.OooO00o(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f123355OooO0OO;
    }
}
