package com.huawei.hms.network.embedded;

import android.text.TextUtils;
import com.aspose.slides.OooOOOO;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.network.httpclient.Callback;
import com.huawei.hms.network.httpclient.Response;
import com.huawei.hms.network.httpclient.Submit;
import com.huawei.hms.network.inner.api.RequestContext;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.g1 */
/* JADX INFO: loaded from: classes9.dex */
public class C18181g1 implements InterfaceC18111b1 {

    /* JADX INFO: renamed from: b */
    public long f54876b;

    /* JADX INFO: renamed from: c */
    public int f54877c;

    /* JADX INFO: renamed from: k */
    public Map<String, List<Map.Entry<String, Integer>>> f54885k;

    /* JADX INFO: renamed from: l */
    public Map<String, Map<String, Integer>> f54886l;

    /* JADX INFO: renamed from: q */
    public Timer f54891q;

    /* JADX INFO: renamed from: a */
    public String f54875a = "DomainRelationModel";

    /* JADX INFO: renamed from: d */
    public int f54878d = 50;

    /* JADX INFO: renamed from: e */
    public float f54879e = 0.75f;

    /* JADX INFO: renamed from: f */
    public float f54880f = 0.8f;

    /* JADX INFO: renamed from: g */
    public float f54881g = 0.2f;

    /* JADX INFO: renamed from: h */
    public int f54882h = 10;

    /* JADX INFO: renamed from: i */
    public int f54883i = 50;

    /* JADX INFO: renamed from: j */
    public int f54884j = 600000;

    /* JADX INFO: renamed from: m */
    public List<C18223j1> f54887m = new ArrayList();

    /* JADX INFO: renamed from: n */
    public List<C18209i1> f54888n = new ArrayList();

    /* JADX INFO: renamed from: o */
    public int f54889o = 0;

    /* JADX INFO: renamed from: p */
    public int f54890p = 0;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.g1$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C18181g1.this.m78546f();
            C18181g1.this.m78543e();
            C18181g1.this.m78540d();
            C18181g1.this.m78549h();
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.g1$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C18181g1.this.m78536c();
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.g1$c */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RequestContext f54894a;

        public c(RequestContext requestContext) {
            this.f54894a = requestContext;
        }

        @Override // java.lang.Runnable
        public void run() {
            C18181g1.this.m78534b(this.f54894a);
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.g1$d */
    public class d implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C18153e1 f54896a;

        public d(C18153e1 c18153e1) {
            this.f54896a = c18153e1;
        }

        @Override // java.lang.Runnable
        public void run() {
            C18181g1.this.m78541d(this.f54896a);
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.g1$e */
    public class e implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C18153e1 f54898a;

        public e(C18153e1 c18153e1) {
            this.f54898a = c18153e1;
        }

        @Override // java.lang.Runnable
        public void run() {
            C18181g1.this.m78544e(this.f54898a);
            C18181g1.this.m78537c(this.f54898a);
            C18181g1.m78553k(C18181g1.this);
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.g1$f */
    public class f implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Map.Entry f54900a;

        public f(Map.Entry entry) {
            this.f54900a = entry;
        }

        @Override // java.lang.Runnable
        public void run() {
            C18181g1.this.f54888n.add(new C18209i1((String) this.f54900a.getKey(), System.currentTimeMillis(), false));
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.g1$g */
    public class g extends TimerTask {

        /* JADX INFO: renamed from: com.huawei.hms.network.embedded.g1$g$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                InterfaceC18422y0 interfaceC18422y0M79664b = C18383v0.m79659a().m79664b(C18357t0.f56142b);
                long jCurrentTimeMillis = System.currentTimeMillis();
                for (int size = C18181g1.this.f54887m.size() - 1; size >= 0; size--) {
                    if (jCurrentTimeMillis - ((C18223j1) C18181g1.this.f54887m.get(size)).m78839b() > C18181g1.this.f54876b) {
                        C18181g1 c18181g1 = C18181g1.this;
                        c18181g1.m78529a((C18223j1) c18181g1.f54887m.get(size));
                        C18181g1.this.f54887m.remove(size);
                    }
                }
                interfaceC18422y0M79664b.mo78664a(C18181g1.this.f54886l);
                C18181g1.this.m78547g();
            }
        }

        public g() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            C18396w0.m79812a().m79813a(new a());
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.g1$h */
    public static class h extends Callback {
        @Override // com.huawei.hms.network.httpclient.Callback
        public void onFailure(Submit submit, Throwable th) {
        }

        @Override // com.huawei.hms.network.httpclient.Callback
        public void onResponse(Submit submit, Response response) throws IOException {
            response.close();
        }
    }

    /* JADX INFO: renamed from: a */
    private float m78524a(C18223j1 c18223j1, String str) {
        float f2 = this.f54878d;
        long jLongValue = c18223j1.f55299a.get(str).getKey().longValue() - c18223j1.m78839b();
        float f3 = 100 - this.f54878d;
        float f4 = this.f54880f * f3;
        return (((f3 * this.f54881g) * Math.min(c18223j1.f55299a.get(str).getValue().intValue(), this.f54882h)) / this.f54882h) + OooOOOO.OooO00o(r5 - jLongValue, this.f54876b, f4, f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public void m78547g() {
        if (this.f54888n.isEmpty()) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i = 0;
        int i2 = 0;
        for (C18209i1 c18209i1 : this.f54888n) {
            if (jCurrentTimeMillis - c18209i1.m78752c() > this.f54876b) {
                i++;
                if (c18209i1.m78751b()) {
                    i2++;
                }
            }
        }
        List<C18209i1> list = this.f54888n;
        this.f54888n = list.subList(i, list.size());
        HashMap map = new HashMap();
        map.put(C18125c1.f54363h, C18357t0.f56142b);
        float f2 = (i2 / i) * 100.0f;
        map.put(C18125c1.f54359d, String.valueOf(Math.round(f2) / 100.0f));
        map.put(C18125c1.f54361f, String.valueOf(i));
        map.put(C18125c1.f54360e, String.valueOf(Math.round(f2) / 100.0f));
        map.put(C18125c1.f54362g, String.valueOf(i));
        map.put(C18125c1.f54366k, this.f54889o == 0 ? "0" : String.valueOf(Math.round((this.f54890p / r1) * 100.0f) / 100.0f));
        C18125c1.m78041a(map);
        this.f54890p = 0;
        this.f54889o = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public void m78549h() {
        this.f54891q = new Timer("NetworkKit_AIModel_DomainRelationModel_Timer");
        g gVar = new g();
        Timer timer = this.f54891q;
        long j = this.f54884j;
        timer.schedule(gVar, j, j);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ int m78553k(C18181g1 c18181g1) {
        int i = c18181g1.f54889o;
        c18181g1.f54889o = i + 1;
        return i;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18111b1
    /* JADX INFO: renamed from: b */
    public void mo77922b() {
        C18396w0.m79812a().m79813a(new a());
    }

    /* JADX INFO: renamed from: b */
    private void m78531b(C18153e1 c18153e1) {
        this.f54887m.add(0, new C18223j1(c18153e1.m78287a(), c18153e1.m78288b()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m78536c() {
        Timer timer = this.f54891q;
        if (timer != null) {
            timer.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m78540d() {
        InterfaceC18422y0 interfaceC18422y0M79664b = C18383v0.m79659a().m79664b(C18357t0.f56142b);
        if (interfaceC18422y0M79664b != null && (interfaceC18422y0M79664b.mo78665b() instanceof Map)) {
            this.f54885k = (Map) interfaceC18422y0M79664b.mo78665b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m78543e() {
        InterfaceC18422y0 interfaceC18422y0M79664b = C18383v0.m79659a().m79664b(C18357t0.f56142b);
        if (interfaceC18422y0M79664b != null && (interfaceC18422y0M79664b.mo78661a() instanceof Map)) {
            this.f54886l = (Map) interfaceC18422y0M79664b.mo78661a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public void m78546f() {
        this.f54876b = 60000L;
        this.f54877c = 2;
        this.f54878d = 50;
        this.f54882h = 10;
        this.f54880f = 0.8f;
        this.f54881g = 0.2f;
        this.f54884j = 600000;
        this.f54883i = 50;
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18111b1
    /* JADX INFO: renamed from: a */
    public void mo77919a() {
        C18396w0.m79812a().m79813a(new b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m78537c(C18153e1 c18153e1) {
        if (this.f54888n.isEmpty()) {
            return;
        }
        for (int size = this.f54888n.size() - 1; size >= 0; size--) {
            C18209i1 c18209i1 = this.f54888n.get(size);
            if (c18153e1.m78288b() - c18209i1.m78752c() >= this.f54876b) {
                return;
            }
            if (c18209i1.m78749a().equals(c18153e1.m78287a())) {
                c18209i1.m78750a(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m78541d(C18153e1 c18153e1) {
        if (this.f54885k == null) {
            m78540d();
        }
        if (this.f54885k.containsKey(c18153e1.m78287a())) {
            for (Map.Entry<String, Integer> entry : this.f54885k.get(c18153e1.m78287a()).subList(0, Math.min(this.f54885k.get(c18153e1.m78287a()).size(), this.f54877c))) {
                if (!TextUtils.isEmpty(entry.getKey()) && entry.getValue().intValue() >= this.f54883i) {
                    Logger.m76958d(this.f54875a, "prefetch domain : " + entry.getKey());
                    C18435z0.m80017b().m80020a(entry.getKey(), 1, new h());
                    C18396w0.m79812a().m79813a(new f(entry));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m78544e(C18153e1 c18153e1) {
        int size = this.f54887m.size();
        if (this.f54887m.size() <= 0 || !this.f54887m.get(0).m78838a().equals(c18153e1.m78287a()) || m78530a(c18153e1.m78288b(), this.f54887m.get(0).m78839b())) {
            int i = -1;
            int i2 = 0;
            while (true) {
                if (i2 >= this.f54887m.size()) {
                    break;
                }
                C18223j1 c18223j1 = this.f54887m.get(i2);
                if (m78530a(c18153e1.m78288b(), c18223j1.m78839b())) {
                    size = i2;
                    break;
                }
                if (c18153e1.m78287a().equals(c18223j1.m78838a())) {
                    i = i2;
                } else {
                    if (!c18223j1.f55299a.containsKey(c18153e1.m78287a())) {
                        c18223j1.f55299a.put(c18153e1.m78287a(), new AbstractMap.SimpleEntry(Long.valueOf(c18153e1.m78288b()), 0));
                    }
                    c18223j1.f55299a.get(c18153e1.m78287a()).setValue(Integer.valueOf(c18223j1.f55299a.get(c18153e1.m78287a()).getValue().intValue() + 1));
                }
                i2++;
            }
            for (int i3 = size; i3 < this.f54887m.size(); i3++) {
                m78529a(this.f54887m.get(i3));
            }
            if (size < this.f54887m.size()) {
                this.f54887m = this.f54887m.subList(0, size);
            }
            if (i > 0) {
                m78529a(this.f54887m.get(i));
                this.f54887m.remove(i);
            }
            m78531b(c18153e1);
        }
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18111b1
    /* JADX INFO: renamed from: a */
    public void mo77920a(C18153e1 c18153e1) {
        C18396w0.m79812a().m79814b(new d(c18153e1));
        C18396w0.m79812a().m79813a(new e(c18153e1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m78534b(RequestContext requestContext) {
        if (requestContext.requestFinishedInfo().getMetricsRealTime().getConnectEndTime() - requestContext.requestFinishedInfo().getMetricsRealTime().getConnectStartTime() == 0) {
            this.f54890p++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m78529a(C18223j1 c18223j1) {
        if (this.f54886l == null) {
            m78543e();
        }
        if (c18223j1.f55299a.isEmpty()) {
            return;
        }
        if (this.f54886l.get(c18223j1.m78838a()) != null) {
            for (Map.Entry<String, Integer> entry : this.f54886l.get(c18223j1.m78838a()).entrySet()) {
                entry.setValue(Integer.valueOf((int) ((entry.getValue().intValue() * this.f54879e) + ((1.0f - this.f54879e) * (c18223j1.f55299a.containsKey(entry.getKey()) ? m78524a(c18223j1, entry.getKey()) : 0.0f)))));
            }
        }
        for (Map.Entry<String, Map.Entry<Long, Integer>> entry2 : c18223j1.f55299a.entrySet()) {
            if (this.f54886l.get(c18223j1.m78838a()) == null) {
                HashMap map = new HashMap();
                float fM78524a = m78524a(c18223j1, entry2.getKey());
                float f2 = this.f54879e;
                map.put(entry2.getKey(), Integer.valueOf((int) ((this.f54878d * f2) + ((1.0f - f2) * fM78524a))));
                this.f54886l.put(c18223j1.m78838a(), map);
            } else if (!this.f54886l.get(c18223j1.m78838a()).containsKey(entry2.getKey())) {
                float fM78524a2 = m78524a(c18223j1, entry2.getKey());
                float f3 = this.f54879e;
                this.f54886l.get(c18223j1.m78838a()).put(entry2.getKey(), Integer.valueOf((int) ((this.f54878d * f3) + ((1.0f - f3) * fM78524a2))));
            }
        }
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18111b1
    /* JADX INFO: renamed from: a */
    public void mo77921a(RequestContext requestContext) {
        C18396w0.m79812a().m79813a(new c(requestContext));
    }

    /* JADX INFO: renamed from: a */
    private boolean m78530a(long j, long j2) {
        return j - j2 > this.f54876b;
    }
}
