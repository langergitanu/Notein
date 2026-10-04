package com.huawei.hms.network.embedded;

import android.text.TextUtils;
import com.huawei.hms.network.inner.api.RequestContext;
import java.net.InetAddress;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.n1 */
/* JADX INFO: loaded from: classes9.dex */
public class C18279n1 implements InterfaceC18111b1 {

    /* JADX INFO: renamed from: g */
    public static final String f55735g = "ipsort";

    /* JADX INFO: renamed from: h */
    public static final int f55736h = 500;

    /* JADX INFO: renamed from: a */
    public long f55737a;

    /* JADX INFO: renamed from: c */
    public C18293o1 f55739c;

    /* JADX INFO: renamed from: d */
    public Map<String, int[]> f55740d;

    /* JADX INFO: renamed from: b */
    public long f55738b = System.currentTimeMillis();

    /* JADX INFO: renamed from: e */
    public float f55741e = 0.62f;

    /* JADX INFO: renamed from: f */
    public int f55742f = 3;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.n1$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C18279n1 c18279n1 = C18279n1.this;
            c18279n1.f55740d = (Map) c18279n1.f55739c.mo78661a();
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.n1$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RequestContext f55744a;

        public b(RequestContext requestContext) {
            this.f55744a = requestContext;
        }

        @Override // java.lang.Runnable
        public void run() {
            C18279n1.this.m79220b(this.f55744a);
        }
    }

    public C18279n1(C18293o1 c18293o1) {
        this.f55739c = c18293o1;
    }

    /* JADX INFO: renamed from: c */
    private void m79222c() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f55738b < this.f55737a) {
            return;
        }
        this.f55738b = jCurrentTimeMillis;
        this.f55739c.mo78664a(this.f55740d);
    }

    /* JADX INFO: renamed from: a */
    public int m79224a(InetAddress inetAddress, InetAddress inetAddress2) {
        if (this.f55740d.containsKey(inetAddress.getHostAddress()) && this.f55740d.containsKey(inetAddress2.getHostAddress())) {
            return this.f55740d.get(inetAddress.getHostAddress())[0] - this.f55740d.get(inetAddress2.getHostAddress())[0] < 0 ? 1 : 0;
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public List<InetAddress> m79226b(List<InetAddress> list) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        for (InetAddress inetAddress : list) {
            if (!this.f55740d.containsKey(inetAddress.getHostAddress()) || this.f55740d.get(inetAddress.getHostAddress())[1] < this.f55742f) {
                m79219a(inetAddress, linkedList);
            } else {
                m79221b(inetAddress, linkedList2);
            }
        }
        linkedList.addAll(linkedList2);
        return linkedList;
    }

    /* JADX INFO: renamed from: c */
    private void m79223c(RequestContext requestContext) {
        String successIp = requestContext.requestFinishedInfo().getMetrics().getSuccessIp();
        if (TextUtils.isEmpty(successIp)) {
            return;
        }
        List<String> connectIps = requestContext.requestFinishedInfo().getMetrics().getConnectIps();
        if (connectIps.isEmpty()) {
            return;
        }
        long connectEndTime = requestContext.requestFinishedInfo().getMetricsTime().getConnectEndTime() - requestContext.requestFinishedInfo().getMetricsTime().getConnectStartTime();
        if (connectEndTime <= 0 || connectEndTime > 2147483647L) {
            return;
        }
        if (connectIps.get(0).equals(successIp)) {
            m79218a(successIp, connectEndTime);
            return;
        }
        for (String str : connectIps) {
            if (str.equals(successIp) || connectEndTime <= 500) {
                break;
            }
            m79218a(str, connectEndTime);
            connectEndTime -= 500;
        }
        if (connectEndTime > 500) {
            connectEndTime = 500;
        }
        m79218a(successIp, connectEndTime);
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18111b1
    /* JADX INFO: renamed from: b */
    public void mo77922b() {
        this.f55738b = System.currentTimeMillis();
        this.f55737a = 180000L;
        C18396w0.m79812a().m79814b(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m79220b(RequestContext requestContext) {
        m79223c(requestContext);
        m79222c();
    }

    /* JADX INFO: renamed from: a */
    public String m79225a(List<InetAddress> list) {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator<InetAddress> it = list.iterator();
        while (it.hasNext()) {
            stringBuffer.append(it.next().getHostAddress());
            stringBuffer.append(" , ");
        }
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: b */
    private void m79221b(InetAddress inetAddress, List<InetAddress> list) {
        for (int i = 0; i < list.size(); i++) {
            if (this.f55740d.get(inetAddress.getHostAddress())[0] < this.f55740d.get(list.get(i).getHostAddress())[0]) {
                list.add(i, inetAddress);
                return;
            }
        }
        list.add(inetAddress);
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18111b1
    /* JADX INFO: renamed from: a */
    public void mo77919a() {
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18111b1
    /* JADX INFO: renamed from: a */
    public void mo77920a(C18153e1 c18153e1) {
    }

    @Override // com.huawei.hms.network.embedded.InterfaceC18111b1
    /* JADX INFO: renamed from: a */
    public void mo77921a(RequestContext requestContext) {
        C18396w0.m79812a().m79813a(new b(requestContext));
    }

    /* JADX INFO: renamed from: a */
    private void m79218a(String str, long j) {
        if (!this.f55740d.containsKey(str)) {
            this.f55740d.put(str, new int[]{(int) j, 1});
            return;
        }
        this.f55740d.put(str, new int[]{(int) (((1.0f - this.f55741e) * j) + (this.f55741e * this.f55740d.get(str)[0])), this.f55740d.get(str)[1] + 1});
    }

    /* JADX INFO: renamed from: a */
    private void m79219a(InetAddress inetAddress, List<InetAddress> list) {
        for (int i = 0; i < list.size(); i++) {
            int i2 = this.f55740d.containsKey(inetAddress.getHostAddress()) ? this.f55740d.get(inetAddress.getHostAddress())[1] : 0;
            if (this.f55740d.containsKey(list.get(i).getHostAddress()) && i2 < this.f55740d.get(list.get(i).getHostAddress())[1]) {
                list.add(i, inetAddress);
                return;
            }
        }
        list.add(inetAddress);
    }
}
