package com.huawei.hms.hatool;

import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: renamed from: com.huawei.hms.hatool.l0 */
/* JADX INFO: loaded from: classes8.dex */
public class C18001l0 implements InterfaceRunnableC18007n0 {

    /* JADX INFO: renamed from: a */
    public String f53866a;

    /* JADX INFO: renamed from: b */
    public String f53867b;

    /* JADX INFO: renamed from: c */
    public String f53868c;

    /* JADX INFO: renamed from: d */
    public List<C18014q> f53869d;

    public C18001l0(List<C18014q> list, String str, String str2, String str3) {
        this.f53866a = str;
        this.f53867b = str2;
        this.f53868c = str3;
        this.f53869d = list;
    }

    /* JADX INFO: renamed from: a */
    public final void m77457a() {
        C17986g0.m77331a(AbstractC17970b.m77230i(), "backup_event", AbstractC18023u0.m77548a(this.f53866a, this.f53868c, this.f53867b));
    }

    @Override // java.lang.Runnable
    public void run() {
        List<C18014q> list = this.f53869d;
        if (list == null || list.size() == 0) {
            C18030y.m77588d("hmsSdk", "failed events is empty");
            return;
        }
        if (C18015q0.m77513a(AbstractC17970b.m77230i(), "cached_v2_1", AbstractC17970b.m77232k() * 1048576)) {
            C18030y.m77590e("hmsSdk", "The cacheFile is full,Can not writing data! reqID:" + this.f53867b);
            return;
        }
        String strM77547a = AbstractC18023u0.m77547a(this.f53866a, this.f53868c);
        List<C18014q> list2 = C18026w.m77564b(AbstractC17970b.m77230i(), "cached_v2_1", strM77547a).get(strM77547a);
        if (list2 != null && list2.size() != 0) {
            this.f53869d.addAll(list2);
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<C18014q> it = this.f53869d.iterator();
        while (it.hasNext()) {
            try {
                jSONArray.put(it.next().m77507d());
            } catch (JSONException unused) {
                C18030y.m77590e("hmsSdk", "event to json error");
            }
        }
        String string = jSONArray.toString();
        if (string.length() > AbstractC17970b.m77228h() * 1048576) {
            C18030y.m77590e("hmsSdk", "this failed data is too long,can not writing it");
            this.f53869d = null;
            return;
        }
        C18030y.m77588d("hmsSdk", "data send failed, write to cache file...reqID:" + this.f53867b);
        C17986g0.m77334b(AbstractC17970b.m77230i(), "cached_v2_1", strM77547a, string);
        m77457a();
    }
}
