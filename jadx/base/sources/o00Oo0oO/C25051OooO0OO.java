package o00Oo0oO;

import Oooo0.o0OoOo0;
import android.content.Context;
import android.net.NetworkInfo;
import android.text.TextUtils;
import android.util.Pair;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import o00Oo0oo.C25057OooO00o;
import o00Oo0oo.C25058OooO0O0;
import o00Oo0oo.C25060OooO0OO;
import o00Oo0oo.CallableC25061OooO0Oo;

/* JADX INFO: renamed from: o00Oo0oO.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25051OooO0OO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static C25051OooO0OO f85052OooO0O0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Object f85053OooO00o;

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C25051OooO0OO OooO00o(Context context) {
        String macAddress;
        if (f85052OooO0O0 == null) {
            C25051OooO0OO c25051OooO0OO = new C25051OooO0OO();
            try {
                try {
                    macAddress = C25058OooO0O0.OooO0OO(context, null).getMacAddress();
                    c25051OooO0OO.f85053OooO00o = macAddress;
                } catch (Exception e) {
                    C25052OooO0Oo.OooO00o(e);
                    if (TextUtils.isEmpty((String) c25051OooO0OO.f85053OooO00o)) {
                    }
                }
                if (TextUtils.isEmpty(macAddress)) {
                    c25051OooO0OO.f85053OooO00o = "00:00:00:00:00:00";
                }
                f85052OooO0O0 = c25051OooO0OO;
            } catch (Throwable th) {
                if (TextUtils.isEmpty((String) c25051OooO0OO.f85053OooO00o)) {
                    c25051OooO0OO.f85053OooO00o = "00:00:00:00:00:00";
                }
                throw th;
            }
        }
        return f85052OooO0O0;
    }

    public static int OooO0O0(Context context) {
        int i;
        try {
            ConcurrentHashMap<Integer, Pair<Long, ?>> concurrentHashMap = C25057OooO00o.f85081OooO00o;
            Context applicationContext = context == null ? null : context.getApplicationContext();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            NetworkInfo networkInfo = (NetworkInfo) C25057OooO00o.OooO0O0(2, 10L, timeUnit, new C25060OooO0OO(), new CallableC25061OooO0Oo(applicationContext), false, 10L, timeUnit, null, false);
            if (networkInfo != null && networkInfo.getType() == 0) {
                int subtype = networkInfo.getSubtype();
                for (int i2 : o0OoOo0.OooO0O0(16)) {
                    switch (i2) {
                        case 1:
                            i = 0;
                            break;
                        case 2:
                            i = 1;
                            break;
                        case 3:
                            i = 2;
                            break;
                        case 4:
                            i = 4;
                            break;
                        case 5:
                            i = 5;
                            break;
                        case 6:
                            i = 6;
                            break;
                        case 7:
                            i = 12;
                            break;
                        case 8:
                            i = 8;
                            break;
                        case 9:
                            i = 3;
                            break;
                        case 10:
                            i = 13;
                            break;
                        case 11:
                            i = 11;
                            break;
                        case 12:
                            i = 9;
                            break;
                        case 13:
                            i = 10;
                            break;
                        case 14:
                            i = 15;
                            break;
                        case 15:
                            i = 20;
                            break;
                        case 16:
                            i = -1;
                            break;
                        default:
                            throw null;
                    }
                    if (i == subtype) {
                        return i2;
                    }
                }
            } else if (networkInfo != null && networkInfo.getType() == 1) {
                return 1;
            }
        } catch (Exception unused) {
        }
        return 16;
    }
}
