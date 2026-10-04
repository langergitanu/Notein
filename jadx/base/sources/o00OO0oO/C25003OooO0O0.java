package o00OO0oO;

import com.alipay.tscenter.biz.rpc.deviceFp.BugTrackMessageService;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.network.embedded.C18437z2;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import o0000OoO.C24224OooO00o;
import o00OO0oo.C25006OooO0O0;
import org.json.JSONObject;

/* JADX INFO: renamed from: o00OO0oO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25003OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Object f84821OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public Object f84822OooO0O0;

    /* JADX WARN: Removed duplicated region for block: B:33:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void OooO00o(C25003OooO0O0 c25003OooO0O0) {
        String string;
        BugTrackMessageService bugTrackMessageService;
        String strLogCollect;
        boolean zBooleanValue;
        synchronized (c25003OooO0O0) {
            try {
                File file = (File) c25003OooO0O0.f84821OooO00o;
                if (file == null) {
                    return;
                }
                if (file.exists() && ((File) c25003OooO0O0.f84821OooO00o).isDirectory() && ((File) c25003OooO0O0.f84821OooO00o).list().length != 0) {
                    ArrayList arrayList = new ArrayList();
                    for (String str : ((File) c25003OooO0O0.f84821OooO00o).list()) {
                        arrayList.add(str);
                    }
                    Collections.sort(arrayList);
                    String str2 = (String) arrayList.get(arrayList.size() - 1);
                    int size = arrayList.size();
                    if (str2.equals(new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime()) + ".log")) {
                        if (arrayList.size() < 2) {
                            return;
                        }
                        str2 = (String) arrayList.get(arrayList.size() - 2);
                        size--;
                    }
                    String strOooO0OO = OooO0O0.OooO0O0.OooO0OO(((File) c25003OooO0O0.f84821OooO00o).getAbsolutePath(), str2);
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put(C18437z2.f56754h, "id");
                        jSONObject.put("error", strOooO0OO);
                        string = jSONObject.toString();
                    } catch (Exception unused) {
                        string = "";
                    }
                    ((o00OOO0O.OooO00o) c25003OooO0O0.f84822OooO0O0).getClass();
                    C25006OooO0O0 c25006OooO0O0 = o00OOO0O.OooO00o.f84874OooO0O0;
                    c25006OooO0O0.getClass();
                    if (!C24224OooO00o.OooO0O0(string) && (bugTrackMessageService = c25006OooO0O0.f84832OooO00o) != null) {
                        try {
                            strLogCollect = bugTrackMessageService.logCollect(C24224OooO00o.OooO0o(string));
                        } catch (Throwable unused2) {
                            strLogCollect = null;
                        }
                        zBooleanValue = !C24224OooO00o.OooO0O0(strLogCollect) ? ((Boolean) new JSONObject(strLogCollect).get(FirebaseAnalytics.Param.SUCCESS)).booleanValue() : false;
                    }
                    if (!zBooleanValue) {
                        size--;
                    }
                    for (int i = 0; i < size; i++) {
                        new File((File) c25003OooO0O0.f84821OooO00o, (String) arrayList.get(i)).delete();
                    }
                }
            } finally {
            }
        }
    }
}
