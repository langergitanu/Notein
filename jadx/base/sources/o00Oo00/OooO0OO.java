package o00Oo00;

import android.content.Context;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.huawei.hms.network.embedded.C18437z2;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static volatile OooO0OO f85000OooO = null;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static Context f85001OooO00o = null;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static boolean f85002OooO0O0 = false;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static C25033OooO0Oo f85003OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Object f85004OooO0Oo = new Object();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static OooO0O0 f85005OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static HandlerThread f85006OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static String f85007OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static String f85008OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static volatile OooO00o f85009OooOO0;

    public static OooO0OO OooO00o(Context context) {
        if (f85000OooO == null) {
            synchronized (OooO0OO.class) {
                f85001OooO00o = context.getApplicationContext();
                f85000OooO = new OooO0OO();
            }
        }
        if (f85009OooOO0 == null) {
            synchronized (OooO0OO.class) {
                f85001OooO00o = context.getApplicationContext();
                HandlerThread handlerThread = new HandlerThread("SqlWorkThread");
                f85006OooO0o0 = handlerThread;
                handlerThread.start();
                f85005OooO0o = new OooO0O0(f85006OooO0o0.getLooper());
                Context context2 = f85001OooO00o;
                OooO00o oooO00o = new OooO00o();
                oooO00o.f84999OooO00o = context2;
                f85009OooOO0 = oooO00o;
                OooO0OO();
            }
        }
        return f85000OooO;
    }

    public static void OooO0O0(int i) {
        Object obj = f85004OooO0Oo;
        synchronized (obj) {
            Message messageObtainMessage = f85005OooO0o.obtainMessage();
            messageObtainMessage.what = 11;
            Bundle bundle = new Bundle();
            bundle.putInt(C18437z2.f56754h, i);
            if (i == 1 || i == 2) {
                bundle.putString(HiAnalyticsConstant.HaKey.BI_KEY_APPID, null);
            }
            messageObtainMessage.setData(bundle);
            f85005OooO0o.sendMessage(messageObtainMessage);
            long jUptimeMillis = SystemClock.uptimeMillis();
            try {
                obj.wait(2000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (SystemClock.uptimeMillis() - jUptimeMillis >= 2000) {
                Log.d("VMS_IDLG_SDK_Client", "query timeout");
            } else if (i == 0) {
                f85008OooO0oo = f85007OooO0oO;
                f85007OooO0oO = null;
            } else if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                    }
                } else if (f85007OooO0oO != null) {
                    f85007OooO0oO = null;
                } else {
                    Log.e("VMS_IDLG_SDK_Client", "get aaid failed");
                }
                f85007OooO0oO = null;
            } else if (f85007OooO0oO != null) {
                f85007OooO0oO = null;
            } else {
                Log.e("VMS_IDLG_SDK_Client", "get vaid failed");
            }
        }
    }

    public static void OooO0OO() {
        String str;
        try {
            try {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                str = (String) cls.getMethod("get", String.class, String.class).invoke(cls, "persist.sys.identifierid.supported", "unknown");
            } catch (Exception e) {
                e.printStackTrace();
                str = "0";
                f85002OooO0O0 = "1".equals(str);
            }
        } catch (Throwable unused) {
            str = "0";
            f85002OooO0O0 = "1".equals(str);
        }
        f85002OooO0O0 = "1".equals(str);
    }
}
