package com.huawei.hms.hatool;

import android.text.TextUtils;
import com.huawei.hms.network.embedded.C18385v2;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: renamed from: com.huawei.hms.hatool.t */
/* JADX INFO: loaded from: classes8.dex */
public class C18020t {

    /* JADX INFO: renamed from: a */
    public List<C18014q> f53918a;

    /* JADX INFO: renamed from: b */
    public String f53919b;

    /* JADX INFO: renamed from: c */
    public String f53920c;

    /* JADX INFO: renamed from: d */
    public String f53921d;

    public C18020t(List<C18014q> list, String str, String str2, String str3) {
        this.f53918a = list;
        this.f53919b = str;
        this.f53920c = str2;
        this.f53921d = str3;
    }

    /* JADX INFO: renamed from: a */
    public void m77529a() {
        if (!"_default_config_tag".equals(this.f53920c)) {
            m77530a(this.f53918a, this.f53920c, this.f53919b);
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (C18014q c18014q : this.f53918a) {
            String strM77505c = c18014q.m77505c();
            if (TextUtils.isEmpty(strM77505c) || "oper".equals(strM77505c)) {
                arrayList4.add(c18014q);
            } else if ("maint".equals(strM77505c)) {
                arrayList.add(c18014q);
            } else if ("preins".equals(strM77505c)) {
                arrayList2.add(c18014q);
            } else if ("diffprivacy".equals(strM77505c)) {
                arrayList3.add(c18014q);
            }
        }
        m77530a(arrayList4, "oper", "_default_config_tag");
        m77530a(arrayList, "maint", "_default_config_tag");
        m77530a(arrayList2, "preins", "_default_config_tag");
        m77530a(arrayList3, "diffprivacy", "_default_config_tag");
    }

    /* JADX INFO: renamed from: a */
    public final void m77530a(List<C18014q> list, String str, String str2) {
        String str3;
        String str4;
        if (list.isEmpty()) {
            return;
        }
        int size = (list.size() / 500) + 1;
        int i = 0;
        while (i < size) {
            int i2 = i * 500;
            List<C18014q> listSubList = list.subList(i2, Math.min(list.size(), i2 + 500));
            String strReplace = UUID.randomUUID().toString().replace(CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR, "");
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jM77243b = ((long) AbstractC17973c.m77243b(str2, str)) * C18385v2.f56338j;
            ArrayList arrayList = new ArrayList();
            for (C18014q c18014q : listSubList) {
                if (!C18015q0.m77514a(c18014q.m77503b(), jCurrentTimeMillis, jM77243b)) {
                    arrayList.add(c18014q);
                }
            }
            if (arrayList.size() > 0) {
                str3 = str;
                str4 = str2;
                new C18022u(str4, str3, this.f53921d, arrayList, strReplace).m77539a();
            } else {
                str3 = str;
                str4 = str2;
                C18030y.m77590e("hmsSdk", "No data to report handler");
            }
            i++;
            str2 = str4;
            str = str3;
        }
    }
}
