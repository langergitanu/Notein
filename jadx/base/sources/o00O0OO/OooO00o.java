package o00O0OO;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import androidx.work.impl.WorkDatabase;
import com.aspose.slides.C22212OooOoO0;
import o00O0O0o.OooOO0O;
import o00O0OoO.C24874OooO0oO;
import o00O0OoO.OooOO0;
import o00O0Ooo.C24901OooO0oo;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final String f84290OooO00o = OooOO0O.OooO0o0("Alarms");

    public static void OooO00o(Context context, int i, String str) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        PendingIntent service = PendingIntent.getService(context, i, OooO0O0.OooO00o(context, str), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        OooOO0O.OooO0OO().OooO00o(f84290OooO00o, C22212OooOoO0.OooO0OO(i, "Cancelling existing alarm with (workSpecId, systemId) (", str, ", ", ")"), new Throwable[0]);
        alarmManager.cancel(service);
    }

    public static void OooO0O0(Context context, o00O0OO0.OooOO0O oooOO0O, String str, long j) {
        int iOooO00o;
        WorkDatabase workDatabase = oooOO0O.f84362OooO0OO;
        OooOO0 oooOO0OooOo0o = workDatabase.OooOo0o();
        C24874OooO0oO c24874OooO0oOOooO00o = oooOO0OooOo0o.OooO00o(str);
        if (c24874OooO0oOOooO00o != null) {
            OooO00o(context, c24874OooO0oOOooO00o.f84443OooO0O0, str);
            int i = c24874OooO0oOOooO00o.f84443OooO0O0;
            AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
            PendingIntent service = PendingIntent.getService(context, i, OooO0O0.OooO00o(context, str), 201326592);
            if (alarmManager != null) {
                alarmManager.setExact(0, j, service);
                return;
            }
            return;
        }
        C24901OooO0oo c24901OooO0oo = new C24901OooO0oo(workDatabase);
        synchronized (C24901OooO0oo.class) {
            iOooO00o = c24901OooO0oo.OooO00o("next_alarm_manager_id");
        }
        oooOO0OooOo0o.OooO0O0(new C24874OooO0oO(str, iOooO00o));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        PendingIntent service2 = PendingIntent.getService(context, iOooO00o, OooO0O0.OooO00o(context, str), 201326592);
        if (alarmManager2 != null) {
            alarmManager2.setExact(0, j, service2);
        }
    }
}
