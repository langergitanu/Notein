package com.huawei.hms.hatool;

import android.content.Context;
import android.util.Pair;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.huawei.hms.hatool.k0 */
/* JADX INFO: loaded from: classes8.dex */
public class C17998k0 implements InterfaceRunnableC18007n0 {

    /* JADX INFO: renamed from: a */
    public Context f53844a = AbstractC17970b.m77230i();

    /* JADX INFO: renamed from: b */
    public String f53845b;

    /* JADX INFO: renamed from: c */
    public String f53846c;

    /* JADX INFO: renamed from: d */
    public String f53847d;

    public C17998k0(String str, String str2, String str3) {
        this.f53845b = str;
        this.f53846c = str2;
        this.f53847d = str3;
    }

    /* JADX INFO: renamed from: a */
    public final void m77420a(String str, List<C18014q> list) {
        Pair<String, String> pairM77545a = AbstractC18023u0.m77545a(str);
        new C18020t(list, (String) pairM77545a.first, (String) pairM77545a.second, this.f53847d).m77529a();
    }

    @Override // java.lang.Runnable
    public void run() {
        Map<String, List<C18014q>> mapM77560a;
        C18030y.m77586c("hmsSdk", "eventReportTask is running");
        boolean zM77511a = C18015q0.m77511a(this.f53844a);
        if (zM77511a) {
            C18030y.m77586c("hmsSdk", "workKey is refresh,begin report all data");
            this.f53846c = "alltype";
        }
        try {
            try {
                mapM77560a = C18026w.m77560a(this.f53844a, this.f53845b, this.f53846c);
            } catch (IllegalArgumentException e) {
                C18030y.m77590e("hmsSdk", "readEventRecords handData IllegalArgumentException:" + e.getMessage());
                if ("alltype".equals(this.f53846c)) {
                    C17986g0.m77331a(this.f53844a, "stat_v2_1", new String[0]);
                    C17986g0.m77331a(this.f53844a, "cached_v2_1", new String[0]);
                } else {
                    String strM77547a = AbstractC18023u0.m77547a(this.f53845b, this.f53846c);
                    C17986g0.m77331a(this.f53844a, "stat_v2_1", strM77547a);
                    C17986g0.m77331a(this.f53844a, "cached_v2_1", strM77547a);
                }
            } catch (Exception e2) {
                C18030y.m77590e("hmsSdk", "readEventRecords handData Exception:" + e2.getMessage());
                if ("alltype".equals(this.f53846c)) {
                    C17986g0.m77331a(this.f53844a, "stat_v2_1", new String[0]);
                    C17986g0.m77331a(this.f53844a, "cached_v2_1", new String[0]);
                } else {
                    String strM77547a2 = AbstractC18023u0.m77547a(this.f53845b, this.f53846c);
                    C17986g0.m77331a(this.f53844a, "stat_v2_1", strM77547a2);
                    C17986g0.m77331a(this.f53844a, "cached_v2_1", strM77547a2);
                }
            }
            if (mapM77560a.size() == 0) {
                C18030y.m77584b("hmsSdk", "no have events to report: tag:%s : type:%s", this.f53845b, this.f53846c);
                if ("alltype".equals(this.f53846c)) {
                    C17986g0.m77331a(this.f53844a, "stat_v2_1", new String[0]);
                    C17986g0.m77331a(this.f53844a, "cached_v2_1", new String[0]);
                    return;
                } else {
                    String strM77547a3 = AbstractC18023u0.m77547a(this.f53845b, this.f53846c);
                    C17986g0.m77331a(this.f53844a, "stat_v2_1", strM77547a3);
                    C17986g0.m77331a(this.f53844a, "cached_v2_1", strM77547a3);
                    return;
                }
            }
            for (Map.Entry<String, List<C18014q>> entry : mapM77560a.entrySet()) {
                m77420a(entry.getKey(), entry.getValue());
            }
            if ("alltype".equals(this.f53846c)) {
                C17986g0.m77331a(this.f53844a, "stat_v2_1", new String[0]);
                C17986g0.m77331a(this.f53844a, "cached_v2_1", new String[0]);
            } else {
                String strM77547a4 = AbstractC18023u0.m77547a(this.f53845b, this.f53846c);
                C17986g0.m77331a(this.f53844a, "stat_v2_1", strM77547a4);
                C17986g0.m77331a(this.f53844a, "cached_v2_1", strM77547a4);
            }
            if (zM77511a) {
                C18030y.m77586c("hmsSdk", "refresh local key");
                C17977d0.m77273f().m77278b();
            }
        } catch (Throwable th) {
            if ("alltype".equals(this.f53846c)) {
                C17986g0.m77331a(this.f53844a, "stat_v2_1", new String[0]);
                C17986g0.m77331a(this.f53844a, "cached_v2_1", new String[0]);
            } else {
                String strM77547a5 = AbstractC18023u0.m77547a(this.f53845b, this.f53846c);
                C17986g0.m77331a(this.f53844a, "stat_v2_1", strM77547a5);
                C17986g0.m77331a(this.f53844a, "cached_v2_1", strM77547a5);
            }
            throw th;
        }
    }
}
