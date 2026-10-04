package com.huawei.hms.network.embedded;

import android.text.TextUtils;
import android.util.LruCache;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.network.base.common.Headers;
import com.huawei.hms.network.embedded.C18321q3;
import com.huawei.hms.network.httpclient.Interceptor;
import com.huawei.hms.network.httpclient.Request;
import com.huawei.hms.network.httpclient.Response;
import com.huawei.hms.network.httpclient.ResponseBody;
import java.net.URL;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.k5 */
/* JADX INFO: loaded from: classes9.dex */
public class C18241k5 extends Interceptor {

    /* JADX INFO: renamed from: a */
    public static final String f55426a = "MultiHostChange";

    /* JADX INFO: renamed from: b */
    public static final int f55427b = 256;

    /* JADX INFO: renamed from: c */
    public static final LruCache<String, C18199h5> f55428c = new LruCache<>(256);

    /* JADX INFO: renamed from: d */
    public static final String f55429d = "Multi-Cloud-Svc";

    /* JADX INFO: renamed from: e */
    public static final String f55430e = "host";

    /* JADX INFO: renamed from: f */
    public static final String f55431f = ";";

    /* JADX INFO: renamed from: g */
    public static final String f55432g = "=";

    /* JADX INFO: renamed from: h */
    public static final String f55433h = ":";

    /* JADX INFO: renamed from: i */
    public static final int f55434i = -1;

    /* JADX INFO: renamed from: a */
    private String m78972a(String str, String str2) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        for (String str3 : str.split(";")) {
            String[] strArrSplit = str3.split("=");
            if (strArrSplit.length == 2 && str2.equals(strArrSplit[0].trim())) {
                return strArrSplit[1].trim();
            }
        }
        return "";
    }

    @Override // com.huawei.hms.network.httpclient.Interceptor
    public Response<ResponseBody> intercept(Interceptor.Chain chain) throws Exception {
        Request request = chain.request();
        String url = request.getUrl();
        URL url2 = new URL(url);
        String host = url2.getHost();
        int port = url2.getPort();
        LruCache<String, C18199h5> lruCache = f55428c;
        C18199h5 c18199h5 = lruCache.get(host);
        boolean zIsHealthy = c18199h5 != null ? c18199h5.isHealthy(!request.getMethod().equals("GET")) : false;
        Logger.m76966v(f55426a, "whether the connection is OK ? %s", Boolean.valueOf(zIsHealthy));
        Logger.m76966v(f55426a, "Before the MultiHostChange,the request is = %s", request);
        if (zIsHealthy) {
            String host2 = c18199h5.getHost();
            if (host2 != null) {
                if (port != -1) {
                    host = host + f55433h + port;
                }
                request = request.newBuilder().url(new C18185g5(url.replaceFirst(host, host2)).getUrl()).build();
            }
        } else {
            lruCache.remove(host);
        }
        Logger.m76966v(f55426a, "after the MultiHost,the request is = %s", request);
        try {
            Response<ResponseBody> responseProceed = chain.proceed(request);
            if (responseProceed != null) {
                String str = Headers.m77737of(responseProceed.getHeaders()).get(f55429d);
                Logger.m76966v(f55426a, "the headers that you need is : %s", str);
                String strM78972a = m78972a(str, "host");
                if (TextUtils.isEmpty(strM78972a)) {
                    return responseProceed;
                }
                InterfaceC18267m3 requestTask = ((C18321q3.b) chain).getRequestTask();
                if (requestTask != null) {
                    C18199h5 connectionInfo = requestTask.getConnectionInfo();
                    if (connectionInfo != null) {
                        lruCache.put(strM78972a, connectionInfo);
                    } else {
                        Logger.m76967w(f55426a, "cacheMapFailed,because the message is null!");
                    }
                }
                Logger.m76966v(f55426a, "the cache size is %d \n %s", Integer.valueOf(lruCache.size()), lruCache.snapshot());
            }
            return responseProceed;
        } catch (Exception e) {
            f55428c.remove(host);
            throw e;
        }
    }
}
