package com.huawei.hms.network.embedded;

import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.network.httpclient.Callback;
import com.huawei.hms.network.httpclient.Response;
import com.huawei.hms.network.httpclient.Submit;
import com.huawei.hms.network.inner.api.DnsNetworkService;
import com.huawei.hms.network.inner.api.NetworkKitInnerImpl;
import com.huawei.hms.network.inner.api.RequestContext;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.l1 */
/* JADX INFO: loaded from: classes9.dex */
public class C18251l1 implements InterfaceC18111b1 {

    /* JADX INFO: renamed from: c */
    public long f55538c;

    /* JADX INFO: renamed from: d */
    public long f55539d;

    /* JADX INFO: renamed from: k */
    public float f55546k;

    /* JADX INFO: renamed from: l */
    public float f55547l;

    /* JADX INFO: renamed from: m */
    public float f55548m;

    /* JADX INFO: renamed from: n */
    public float f55549n;

    /* JADX INFO: renamed from: o */
    public float f55550o;

    /* JADX INFO: renamed from: p */
    public float f55551p;

    /* JADX INFO: renamed from: q */
    public float f55552q;

    /* JADX INFO: renamed from: r */
    public int f55553r;

    /* JADX INFO: renamed from: s */
    public int f55554s;

    /* JADX INFO: renamed from: a */
    public String f55536a = "InitModel";

    /* JADX INFO: renamed from: b */
    public boolean f55537b = false;

    /* JADX INFO: renamed from: e */
    public int f55540e = 50;

    /* JADX INFO: renamed from: f */
    public float f55541f = 0.75f;

    /* JADX INFO: renamed from: g */
    public int f55542g = 0;

    /* JADX INFO: renamed from: h */
    public int f55543h = 1;

    /* JADX INFO: renamed from: i */
    public int f55544i = 0;

    /* JADX INFO: renamed from: j */
    public int f55545j = 1;

    /* JADX INFO: renamed from: t */
    public int f55555t = 0;

    /* JADX INFO: renamed from: u */
    public int f55556u = 0;

    /* JADX INFO: renamed from: v */
    public HashMap<String, long[]> f55557v = new HashMap<>();

    /* JADX INFO: renamed from: w */
    public Map<String, Boolean> f55558w = new LinkedHashMap();

    /* JADX INFO: renamed from: x */
    public Map<String, Boolean> f55559x = new HashMap();

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.l1$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C18251l1.this.m79021d();
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.l1$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RequestContext f55561a;

        public b(RequestContext requestContext) {
            this.f55561a = requestContext;
        }

        @Override // java.lang.Runnable
        public void run() {
            C18251l1.this.m79016b(this.f55561a);
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.l1$c */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C18153e1 f55563a;

        public c(C18153e1 c18153e1) {
            this.f55563a = c18153e1;
        }

        @Override // java.lang.Runnable
        public void run() {
            C18251l1.this.m79017c(this.f55563a);
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.l1$d */
    public static class d extends Callback {
        @Override // com.huawei.hms.network.httpclient.Callback
        public void onFailure(Submit submit, Throwable th) {
        }

        @Override // com.huawei.hms.network.httpclient.Callback
        public void onResponse(Submit submit, Response response) throws IOException {
            response.close();
        }
    }

    /* JADX INFO: renamed from: a */
    private float m79009a(String str) {
        return this.f55550o * this.f55546k * (Math.min(this.f55551p, this.f55557v.get(str)[this.f55544i]) / this.f55551p);
    }

    /* JADX INFO: renamed from: b */
    private float m79013b(String str) {
        return this.f55550o * this.f55547l * (1.0f - ((this.f55557v.get(str)[this.f55545j] / 1000) / (this.f55539d / 1000)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m79017c(C18153e1 c18153e1) {
        if (m79020c()) {
            Logger.m76958d(this.f55536a, "Initmodel train finished");
            return;
        }
        if (c18153e1.m78288b() - this.f55538c >= this.f55539d) {
            Logger.m76958d(this.f55536a, "update train data");
            this.f55537b = true;
            m79019h();
            m79023f();
            return;
        }
        this.f55555t++;
        m79015b(c18153e1);
        Logger.m76958d(this.f55536a, "add a train url " + c18153e1.m78287a());
        long j = this.f55557v.containsKey(c18153e1.m78287a()) ? 1 + this.f55557v.get(c18153e1.m78287a())[this.f55544i] : 1L;
        if (this.f55557v.containsKey(c18153e1.m78287a())) {
            this.f55557v.put(c18153e1.m78287a(), new long[]{j, this.f55557v.get(c18153e1.m78287a())[this.f55545j]});
        } else {
            this.f55557v.put(c18153e1.m78287a(), new long[]{j, c18153e1.m78288b() - this.f55538c});
        }
    }

    /* JADX INFO: renamed from: g */
    private float[] m79018g() {
        int iMin = Math.min(this.f55558w.size(), this.f55554s);
        Iterator<Map.Entry<String, Boolean>> it = this.f55558w.entrySet().iterator();
        float f = 0.0f;
        float f2 = 0.0f;
        int i = 0;
        while (it.hasNext()) {
            if (it.next().getValue().booleanValue()) {
                f += 1.0f;
                if (i < iMin) {
                    f2 += 1.0f;
                }
            }
            i++;
        }
        Iterator<Map.Entry<String, Boolean>> it2 = this.f55559x.entrySet().iterator();
        float f3 = 0.0f;
        while (it2.hasNext()) {
            if (it2.next().getValue().booleanValue()) {
                f3 += 1.0f;
            }
        }
        return new float[]{iMin > 0 ? Math.round((f2 / iMin) * 100.0f) / 100.0f : 0.0f, this.f55558w.size() > 0 ? Math.round((f / this.f55558w.size()) * 100.0f) / 100.0f : 0.0f, this.f55559x.size() > 0 ? Math.round((f3 / this.f55559x.size()) * 100.0f) / 100.0f : 0.0f};
    }

    /* JADX INFO: renamed from: h */
    private void m79019h() {
        if (this.f55558w.size() != 0) {
            float[] fArrM79018g = m79018g();
            HashMap map = new HashMap();
            map.put(C18125c1.f54363h, C18357t0.f56141a);
            map.put(C18125c1.f54359d, String.valueOf(fArrM79018g[0]));
            map.put(C18125c1.f54360e, String.valueOf(fArrM79018g[1]));
            map.put(C18125c1.f54367l, String.valueOf(fArrM79018g[2]));
            map.put(C18125c1.f54361f, String.valueOf(Math.min(this.f55558w.size(), this.f55554s)));
            map.put(C18125c1.f54362g, String.valueOf(this.f55558w.size()));
            map.put(C18125c1.f54366k, this.f55555t == 0 ? "0" : String.valueOf(Math.round((this.f55556u / r0) * 100.0f) / 100.0f));
            C18125c1.m78041a(map);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m79021d() {
        Logger.m76963i(this.f55536a, "InitModule start execute");
        ArrayList arrayList = (ArrayList) C18383v0.m79659a().m79664b(C18357t0.f56141a).mo78665b();
        if (arrayList.isEmpty()) {
            return;
        }
        DnsNetworkService dnsNetworkService = (DnsNetworkService) NetworkKitInnerImpl.getInstance().getService("dns");
        for (int i = 0; i < Math.min(arrayList.size(), this.f55553r); i++) {
            if (!TextUtils.isEmpty((CharSequence) arrayList.get(i))) {
                if (i < Math.min(arrayList.size(), this.f55554s)) {
                    Logger.m76965v(this.f55536a, "Pre Connect : https://" + ((String) arrayList.get(i)));
                    C18435z0.m80017b().m80020a((String) arrayList.get(i), 1, new d());
                } else {
                    Logger.m76965v(this.f55536a, "Pre DNS : https://" + ((String) arrayList.get(i)));
                    if (dnsNetworkService != null) {
                        dnsNetworkService.dnsPrefetch((String) arrayList.get(i));
                    }
                }
                this.f55558w.put((String) arrayList.get(i), Boolean.FALSE);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m79022e() {
        this.f55538c = System.currentTimeMillis();
        this.f55539d = 300000L;
        this.f55540e = 50;
        this.f55541f = 0.7f;
        this.f55546k = 0.4f;
        this.f55547l = 0.2f;
        this.f55548m = 0.4f;
        this.f55549n = 50.0f;
        this.f55551p = 30.0f;
        this.f55552q = 10.0f;
        this.f55550o = 50.0f;
        this.f55553r = 10;
        this.f55554s = 5;
    }

    /* JADX INFO: renamed from: f */
    public void m79023f() {
        InterfaceC18422y0 interfaceC18422y0M79664b = C18383v0.m79659a().m79664b(C18357t0.f56141a);
        Map<String, int[]> map = (Map) interfaceC18422y0M79664b.mo78661a();
        for (Map.Entry<String, int[]> entry : map.entrySet()) {
            String key = entry.getKey();
            boolean zContainsKey = this.f55557v.containsKey(key);
            int[] value = entry.getValue();
            if (zContainsKey) {
                int i = this.f55543h;
                value[i] = value[i] + 1;
            } else {
                value[this.f55543h] = 0;
            }
            float fM79014b = this.f55557v.containsKey(key) ? m79014b(map, key) : 0.0f;
            int i2 = map.get(key)[this.f55542g];
            int[] iArr = map.get(key);
            int i3 = this.f55542g;
            float f = this.f55541f;
            iArr[i3] = (int) ((f * i2) + ((1.0f - f) * fM79014b));
        }
        for (String str : this.f55557v.keySet()) {
            if (!map.containsKey(str)) {
                float fM79014b2 = m79014b(map, str);
                float f2 = this.f55541f;
                map.put(str, new int[]{(int) ((f2 * this.f55540e) + ((1.0f - f2) * fM79014b2)), 1});
            }
        }
        interfaceC18422y0M79664b.mo78664a(map);
    }

    /* JADX INFO: renamed from: a */
    private float m79010a(Map<String, int[]> map, String str) {
        if (map.get(str) == null) {
            return 0.0f;
        }
        return this.f55550o * this.f55548m * (Math.min(this.f55552q, map.get(str)[this.f55543h]) / this.f55552q);
    }

    /* JADX INFO: renamed from: b */
    private float m79014b(Map<String, int[]> map, String str) {
        return m79009a(str) + m79013b(str) + m79010a(map, str) + this.f55549n;
    }

    /* JADX INFO: renamed from: c */
    public boolean m79020c() {
        return this.f55537b;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18111b1
    /* JADX INFO: renamed from: a */
    public void mo77919a() {
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18111b1
    /* JADX INFO: renamed from: b */
    public void mo77922b() {
        m79022e();
        C18396w0.m79812a().m79814b(new a());
    }

    /* JADX INFO: renamed from: b */
    private void m79015b(C18153e1 c18153e1) {
        if (this.f55558w.containsKey(c18153e1.m78287a())) {
            this.f55558w.put(c18153e1.m78287a(), Boolean.TRUE);
        }
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18111b1
    /* JADX INFO: renamed from: a */
    public void mo77920a(C18153e1 c18153e1) {
        C18396w0.m79812a().m79813a(new c(c18153e1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m79016b(RequestContext requestContext) {
        if (m79020c()) {
            Logger.m76958d(this.f55536a, "Initmodel train finished");
            return;
        }
        if (requestContext.requestFinishedInfo().getMetricsRealTime().getConnectEndTime() - requestContext.requestFinishedInfo().getMetricsRealTime().getConnectStartTime() != 0) {
            if (this.f55559x.containsKey(requestContext.request().getUrl())) {
                return;
            }
            this.f55559x.put(requestContext.request().getUrl(), Boolean.FALSE);
        } else {
            this.f55556u++;
            if (this.f55559x.containsKey(requestContext.request().getUrl())) {
                return;
            }
            this.f55559x.put(requestContext.request().getUrl(), Boolean.TRUE);
        }
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18111b1
    /* JADX INFO: renamed from: a */
    public void mo77921a(RequestContext requestContext) {
        C18396w0.m79812a().m79813a(new b(requestContext));
    }
}
