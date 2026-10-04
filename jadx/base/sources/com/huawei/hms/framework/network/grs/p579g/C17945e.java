package com.huawei.hms.framework.network.grs.p579g;

import android.content.Context;
import androidx.appcompat.view.menu.C21505OooO0Oo;
import com.huawei.hms.framework.common.ExceptionCode;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.common.hianalytics.HianalyticsHelper;
import com.huawei.hms.framework.common.hianalytics.LinkedHashMapPack;
import com.huawei.hms.framework.network.grs.p579g.p581k.C17951a;
import com.huawei.hms.network.embedded.C18115b5;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.huawei.hms.framework.network.grs.g.e */
/* JADX INFO: loaded from: classes7.dex */
public class C17945e {

    /* JADX INFO: renamed from: com.huawei.hms.framework.network.grs.g.e$a */
    public static class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ long f53719a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ArrayList f53720b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ JSONArray f53721c;

        public a(long j, ArrayList arrayList, JSONArray jSONArray) {
            this.f53719a = j;
            this.f53720b = arrayList;
            this.f53721c = jSONArray;
        }

        @Override // java.lang.Runnable
        public void run() {
            C17951a c17951a = new C17951a();
            c17951a.put(C18115b5.TOTAL_TIME, this.f53719a);
            Iterator it = this.f53720b.iterator();
            while (it.hasNext()) {
                C17944d c17944d = (C17944d) it.next();
                if (c17944d.m77115o() || c17944d.m77113m()) {
                    c17951a.put(C17945e.m77118b(c17944d));
                    it.remove();
                    break;
                }
            }
            if (this.f53720b.size() > 0) {
                C17944d c17944d2 = (C17944d) C21505OooO0Oo.OooO00o(1, this.f53720b);
                c17951a.put(C17945e.m77118b(c17944d2));
                this.f53720b.remove(c17944d2);
            }
            if (this.f53720b.size() > 0) {
                Iterator it2 = this.f53720b.iterator();
                while (it2.hasNext()) {
                    this.f53721c.put(new JSONObject(C17945e.m77118b((C17944d) it2.next())));
                }
            }
            if (this.f53721c.length() > 0) {
                c17951a.put(C18115b5.FAILED_INFO, this.f53721c.toString());
            }
            Logger.m76959d("HaReportHelper", "grssdk report data to aiops is: %s", new JSONObject(c17951a.get()));
            HianalyticsHelper.getInstance().onEvent(c17951a.get(), "grs_request");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static LinkedHashMap<String, String> m77118b(C17944d c17944d) {
        LinkedHashMapPack linkedHashMapPack = new LinkedHashMapPack();
        Exception excM77104d = c17944d.m77104d();
        if (excM77104d != null) {
            linkedHashMapPack.put("error_code", ExceptionCode.getErrorCodeFromException(excM77104d));
            linkedHashMapPack.put("exception_name", excM77104d.getClass().getSimpleName());
            linkedHashMapPack.put("message", StringUtils.anonymizeMessage(excM77104d.getMessage()));
        } else {
            linkedHashMapPack.put("error_code", c17944d.m77100b());
            linkedHashMapPack.put("exception_name", c17944d.m77103c());
        }
        try {
            linkedHashMapPack.put("domain", new URL(c17944d.m77112l()).getHost());
        } catch (MalformedURLException e) {
            Logger.m76968w("HaReportHelper", "report host MalformedURLException", e);
        }
        linkedHashMapPack.put("req_start_time", c17944d.m77108h());
        linkedHashMapPack.put("req_end_time", c17944d.m77107g());
        linkedHashMapPack.put("req_total_time", c17944d.m77109i());
        return linkedHashMapPack.getAll();
    }

    /* JADX INFO: renamed from: a */
    public static void m77117a(ArrayList<C17944d> arrayList, long j, JSONArray jSONArray, Context context) {
        if (context == null || arrayList == null || arrayList.size() <= 0 || !HianalyticsHelper.getInstance().isEnableReportNoSeed(context)) {
            return;
        }
        HianalyticsHelper.getInstance().getReportExecutor().submit(new a(j, arrayList, jSONArray));
    }
}
