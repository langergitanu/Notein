package com.huawei.cloud.client.util;

import OooO0o.C20424OooO0Oo;
import android.content.Context;
import android.text.TextUtils;
import com.aspose.slides.C22226Oooo0oo;
import com.huawei.cloud.client.exception.DriveException;
import com.huawei.cloud.client.task.Task;
import com.huawei.cloud.client.task.TaskManager;
import com.huawei.hms.drive.C17798bh;
import com.huawei.hms.drive.C17800bj;
import com.huawei.hms.drive.C17877l;
import com.huawei.hms.drive.C17878m;
import com.huawei.hms.drive.C17884s;
import com.huawei.hms.drive.InterfaceC17775al;
import com.huawei.hms.drive.InterfaceC17776am;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.network.embedded.C18241k5;
import com.huawei.hms.network.embedded.C18385v2;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.BindException;
import java.net.ConnectException;
import java.net.HttpRetryException;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class DnsKprUtil {
    public static final int INDEX_BEGINF_RETRY_IP = 2;
    public static final int MAX_RETRY_TIME = 3;

    /* JADX INFO: renamed from: a */
    private static final Map<String, String> f52326a = new HashMap<String, String>() { // from class: com.huawei.cloud.client.util.DnsKprUtil.1
        {
            put(SocketException.class.toString(), "1");
            put(PortUnreachableException.class.toString(), "2");
            put(ConnectException.class.toString(), "3");
            put(BindException.class.toString(), "3");
            put(HttpRetryException.class.toString(), "3");
            put(SocketTimeoutException.class.toString(), "4");
            put(UnknownHostException.class.toString(), "5");
            put(NoRouteToHostException.class.toString(), "6");
            put(UnknownServiceException.class.toString(), "7");
        }
    };

    /* JADX INFO: renamed from: b */
    private static boolean f52327b = true;

    /* JADX INFO: renamed from: c */
    private static Map<String, HostInfo> f52328c = new HashMap();

    /* JADX INFO: renamed from: d */
    private static long f52329d = 300000;

    public interface Connection {
        void onInitHttpConnection(HttpURLConnection httpURLConnection) throws DriveException, IOException;
    }

    public static class HostInfo {

        /* JADX INFO: renamed from: a */
        String f52332a;

        /* JADX INFO: renamed from: b */
        long f52333b;

        public HostInfo(String str, long j) {
            this.f52332a = str;
            this.f52333b = j;
        }

        public String getIpAddr() {
            return this.f52332a;
        }

        public long getTimestamp() {
            return this.f52333b;
        }

        public void setIpAddr(String str) {
            this.f52332a = str;
        }

        public void setTimestamp(long j) {
            this.f52333b = j;
        }
    }

    public static class OkHttpDNSRetryClient {

        /* JADX INFO: renamed from: a */
        List<String> f52334a;

        /* JADX INFO: renamed from: b */
        C17798bh.a f52335b;

        /* JADX INFO: renamed from: c */
        OkHttpRetryCallBack f52336c;

        /* JADX INFO: renamed from: d */
        InterfaceC17776am f52337d;

        /* JADX INFO: renamed from: e */
        private String f52338e;

        /* JADX INFO: renamed from: f */
        private String f52339f;

        /* JADX INFO: renamed from: g */
        private String f52340g;

        /* JADX INFO: renamed from: h */
        private String f52341h;

        /* JADX INFO: renamed from: j */
        private int f52343j = 2;

        /* JADX INFO: renamed from: i */
        private int f52342i = 0 - 2;

        public OkHttpDNSRetryClient(String str, String str2, String str3, C17798bh.a aVar, OkHttpRetryCallBack okHttpRetryCallBack, InterfaceC17776am interfaceC17776am) {
            this.f52338e = str;
            this.f52339f = str2;
            this.f52336c = okHttpRetryCallBack;
            this.f52337d = interfaceC17776am;
            this.f52341h = str3;
            this.f52335b = aVar;
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ int m75707d(OkHttpDNSRetryClient okHttpDNSRetryClient) {
            int i = okHttpDNSRetryClient.f52342i;
            okHttpDNSRetryClient.f52342i = i + 1;
            return i;
        }

        /* JADX INFO: renamed from: a */
        public void m75709a() {
            this.f52340g = "";
            if (this.f52342i == 0) {
                if (this.f52334a == null) {
                    this.f52334a = DnsKprUtil.getAvailableIpList(this.f52339f, this.f52341h);
                    Logger.m76963i("DnsKprUtil", "get " + this.f52339f + " dnskpr available ip:" + this.f52334a.toString());
                }
                int size = this.f52334a.size();
                int i = this.f52342i;
                if (size > i) {
                    this.f52340g = this.f52334a.get(i);
                }
            }
            DnsKprUtil.ipOkHttpBuild(this.f52338e, this.f52339f, this.f52340g, this.f52335b);
            this.f52336c.run(this.f52335b, new InterfaceC17776am() { // from class: com.huawei.cloud.client.util.DnsKprUtil.OkHttpDNSRetryClient.1
                @Override // com.huawei.hms.drive.InterfaceC17776am
                public void onFailure(InterfaceC17775al interfaceC17775al, IOException iOException) {
                    Logger.m76960e("DnsKprUtil", OkHttpDNSRetryClient.this.f52340g + " ipOkHttpBuild IOException url " + OkHttpDNSRetryClient.this.f52338e + " enqueueRun:" + iOException.getClass().toString() + C18241k5.f55433h + iOException.getMessage());
                    OkHttpDNSRetryClient.this.f52341h = DnsKprUtil.errorCode2DnsKpr(iOException);
                    OkHttpDNSRetryClient okHttpDNSRetryClient = OkHttpDNSRetryClient.this;
                    if (okHttpDNSRetryClient.f52334a != null && okHttpDNSRetryClient.f52342i >= OkHttpDNSRetryClient.this.f52334a.size() - 1) {
                        OkHttpDNSRetryClient.this.f52337d.onFailure(interfaceC17775al, iOException);
                    } else {
                        OkHttpDNSRetryClient.m75707d(OkHttpDNSRetryClient.this);
                        OkHttpDNSRetryClient.this.m75709a();
                    }
                }

                @Override // com.huawei.hms.drive.InterfaceC17776am
                public void onResponse(InterfaceC17775al interfaceC17775al, C17800bj c17800bj) throws IOException {
                    if (!TextUtils.isEmpty(OkHttpDNSRetryClient.this.f52340g)) {
                        DnsKprUtil.setHostCachedIp(OkHttpDNSRetryClient.this.f52339f, OkHttpDNSRetryClient.this.f52340g);
                    }
                    OkHttpDNSRetryClient.this.f52337d.onResponse(interfaceC17775al, c17800bj);
                }
            });
        }
    }

    public interface OkHttpRetryCallBack {
        C17800bj run(C17798bh.a aVar) throws IOException;

        void run(C17798bh.a aVar, InterfaceC17776am interfaceC17776am);
    }

    public static String errorCode2DnsKpr(Exception exc) {
        if (exc == null) {
            return "9";
        }
        String string = exc.getClass().toString();
        Map<String, String> map = f52326a;
        return map.containsKey(exc.getClass().toString()) ? map.get(string) : "9";
    }

    public static String errorCode404() {
        return "8";
    }

    public static IOException errorCodeException(String str) {
        if (!TextUtils.isEmpty(str) && !str.equals("1")) {
            return str.equals("2") ? new PortUnreachableException() : str.equals("3") ? new ConnectException() : str.equals("4") ? new SocketTimeoutException() : str.equals("5") ? new UnknownHostException() : str.equals("6") ? new NoRouteToHostException() : str.equals("7") ? new UnknownServiceException() : new SocketException();
        }
        return new SocketException();
    }

    public static List<String> getAvailableIpList(String str, String str2) {
        C17884s c17884sM76808a;
        List<C17884s.a> listM76852a;
        C17877l c17877lM76793a;
        ArrayList arrayList = new ArrayList();
        try {
            c17877lM76793a = C17877l.m76793a();
        } catch (Exception e) {
            Logger.m76960e("DnsKprUtil", "getAvailableIpList error: " + e.toString());
            c17884sM76808a = null;
        }
        if (!c17877lM76793a.m76812b()) {
            return arrayList;
        }
        C17878m c17878m = new C17878m(str);
        c17878m.m76820b(str2);
        c17878m.m76816a(10000L);
        c17884sM76808a = c17877lM76793a.m76808a(c17878m);
        if (c17884sM76808a != null && (listM76852a = c17884sM76808a.m76852a()) != null && !listM76852a.isEmpty()) {
            for (int i = 0; i < listM76852a.size(); i++) {
                C17884s.a aVar = listM76852a.get(i);
                if (C18385v2.f56336h.equals(aVar.m76861a())) {
                    arrayList.add(aVar.m76862b());
                }
            }
        }
        return arrayList;
    }

    public static String getHostCachedIp(String str) {
        if (!f52328c.containsKey(str)) {
            return "";
        }
        String ipAddr = f52328c.get(str).getIpAddr();
        if (System.currentTimeMillis() - f52328c.get(str).getTimestamp() <= f52329d) {
            return ipAddr;
        }
        if (C17877l.m76793a().m76812b()) {
            C17877l.m76793a().m76811a(str);
        }
        return "";
    }

    public static void init(final Context context) {
        TaskManager.getInstance().execute(new Task() { // from class: com.huawei.cloud.client.util.DnsKprUtil.3
            @Override // com.huawei.cloud.client.task.Task
            public void call() {
                C17877l.m76793a().m76809a(context);
            }
        });
    }

    public static C17798bh.a ipOkHttpBuild(String str, String str2, String str3, C17798bh.a aVar) {
        if (!TextUtils.isEmpty(str3)) {
            Logger.m76963i("DnsKprUtil", "ipOkHttpBuild host:" + str2 + " ip:" + str3);
            aVar.m76274a(str.replace(str2, str3));
            aVar.m76276a("Host", str2);
        }
        return aVar;
    }

    public static HttpURLConnection ipOpenConnect(URL url, String str, String str2) throws IOException {
        Logger.m76963i("DnsKprUtil", "ipOpenConnect host:" + str + " ip:" + str2);
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(url.getProtocol(), str2, url.getPort(), url.getFile()).openConnection();
        httpURLConnection.setRequestProperty("Host", str);
        return httpURLConnection;
    }

    public static boolean isNeedDNSKpr(String str, String str2, int i) {
        if (!f52327b) {
            return false;
        }
        if (TextUtils.isEmpty(getHostCachedIp(str))) {
            return i >= 2 && !TextUtils.isEmpty(str2);
        }
        return true;
    }

    public static void setHostCachedIp(String str, String str2) {
        f52328c.put(str, new HostInfo(str2, System.currentTimeMillis()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0097, code lost:
    
        r2 = r12.run(ipOkHttpBuild(r7, r8, r3, r11));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C17800bj tryConnectByDNSKpr(String str, String str2, String str3, IOException e, C17798bh.a aVar, OkHttpRetryCallBack okHttpRetryCallBack) throws IOException {
        C17800bj c17800bjRun;
        String next;
        Logger.m76958d("DnsKprUtil", "tryConnectByDNSKpr hostString:" + str2 + " errorCode:" + str3);
        String hostCachedIp = getHostCachedIp(str2);
        if (e == null) {
            e = errorCodeException(str3);
        }
        if (TextUtils.isEmpty(hostCachedIp)) {
            c17800bjRun = null;
        } else {
            ipOkHttpBuild(str, str2, hostCachedIp, aVar);
            c17800bjRun = okHttpRetryCallBack.run(aVar);
        }
        if (c17800bjRun != null) {
            Logger.m76963i("DnsKprUtil", hostCachedIp + "(cached) ipOkHttpBuild success.");
            return c17800bjRun;
        }
        List<String> availableIpList = getAvailableIpList(str2, str3);
        StringBuilder sbOooO0o0 = C20424OooO0Oo.OooO0o0("get ", str2, " dnskpr available ip:");
        sbOooO0o0.append(availableIpList.toString());
        Logger.m76963i("DnsKprUtil", sbOooO0o0.toString());
        Iterator<String> it = availableIpList.iterator();
        loop0: while (true) {
            next = "";
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                next = it.next();
                Logger.m76958d("DnsKprUtil", "begin connet to " + str2 + " with ip:" + next);
                if (!TextUtils.isEmpty(next)) {
                    try {
                        break;
                    } catch (IOException e2) {
                        e = e2;
                        String message = e.getMessage();
                        StringBuilder sbOooO0OO = C22226Oooo0oo.OooO0OO(next, " ipOkHttpBuild IOException error: ");
                        sbOooO0OO.append(e.getClass().toString());
                        sbOooO0OO.append(C18241k5.f55433h);
                        sbOooO0OO.append(message);
                        Logger.m76960e("DnsKprUtil", sbOooO0OO.toString());
                        if (((e instanceof InterruptedIOException) && !(e instanceof SocketTimeoutException)) || (!TextUtils.isEmpty(message) && message.contains("Canceled"))) {
                            break;
                        }
                    }
                }
            }
        }
        if (TextUtils.isEmpty(next)) {
            Logger.m76967w("DnsKprUtil", "tryConnectByDNSKpr run failed");
            throw e;
        }
        setHostCachedIp(str2, next);
        Logger.m76963i("DnsKprUtil", next + "ipConnect success.");
        return c17800bjRun;
    }

    public static void tryConnectByDNSKpr(String str, String str2, String str3, C17798bh.a aVar, OkHttpRetryCallBack okHttpRetryCallBack, final InterfaceC17776am interfaceC17776am) {
        Logger.m76958d("DnsKprUtil", "tryConnectByDNSKpr hostString:" + str2 + " errorCode:" + str3);
        String hostCachedIp = getHostCachedIp(str2);
        if (!TextUtils.isEmpty(hostCachedIp)) {
            okHttpRetryCallBack.run(ipOkHttpBuild(str, str2, hostCachedIp, aVar), new InterfaceC17776am() { // from class: com.huawei.cloud.client.util.DnsKprUtil.2
                @Override // com.huawei.hms.drive.InterfaceC17776am
                public void onFailure(InterfaceC17775al interfaceC17775al, IOException iOException) {
                    interfaceC17776am.onFailure(interfaceC17775al, iOException);
                }

                @Override // com.huawei.hms.drive.InterfaceC17776am
                public void onResponse(InterfaceC17775al interfaceC17775al, C17800bj c17800bj) throws IOException {
                    interfaceC17776am.onResponse(interfaceC17775al, c17800bj);
                }
            });
        } else {
            new OkHttpDNSRetryClient(str, str2, str3, aVar, okHttpRetryCallBack, interfaceC17776am).m75709a();
        }
    }
}
