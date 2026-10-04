package com.huawei.hms.network.dns;

import android.content.Context;
import android.os.Bundle;
import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.NetworkUtil;
import com.huawei.hms.network.embedded.C18126c2;
import com.huawei.hms.network.embedded.C18154e2;
import com.huawei.hms.network.embedded.C18196h2;
import com.huawei.hms.network.httpclient.Response;
import com.huawei.hms.network.httpclient.ResponseBody;
import com.huawei.hms.network.inner.api.DnsNetworkService;
import com.huawei.hms.network.inner.api.PolicyNetworkService;
import com.huawei.hms.network.inner.api.RequestContext;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class DNSService extends DnsNetworkService {
    public static final String TAG = "DNSService";

    @Override // com.huawei.hms.network.inner.api.DnsNetworkService
    public void beginEachRequest(RequestContext requestContext) {
        C18126c2.m78048j().m78078g(NetworkUtil.getHost(requestContext.request().getUrl()));
    }

    @Override // com.huawei.hms.network.inner.api.DnsNetworkService
    public void dnsPrefetch(String str) {
        C18126c2.m78047i(str);
    }

    @Override // com.huawei.hms.network.inner.api.DnsNetworkService
    public void endEachRequest(RequestContext requestContext) {
        Response<ResponseBody> response = requestContext.response();
        Throwable thThrowable = requestContext.throwable();
        if (response != null) {
            C18126c2.m78048j().m78061a(NetworkUtil.getHost(requestContext.request().getUrl()), Integer.valueOf(response.getCode()));
        } else {
            C18126c2.m78048j().m78061a(NetworkUtil.getHost(requestContext.request().getUrl()), thThrowable);
        }
    }

    @Override // com.huawei.hms.network.inner.api.DnsNetworkService
    public int getDnsCache() {
        return C18126c2.m78048j().m78072e();
    }

    @Override // com.huawei.hms.network.inner.api.DnsNetworkService
    public String getDnsType() {
        return C18126c2.m78048j().m78054a(C18126c2.m78048j().m78075f());
    }

    @Override // com.huawei.hms.network.inner.api.NetworkService
    public String getServiceName() {
        return "dns";
    }

    @Override // com.huawei.hms.network.inner.api.NetworkService
    public String getServiceType() {
        return null;
    }

    @Override // com.huawei.hms.network.inner.api.NetworkService
    public String getVersion() {
        return "5.0.4.300";
    }

    @Override // com.huawei.hms.network.inner.api.DnsNetworkService
    public List<InetAddress> lookup(String str) throws UnknownHostException {
        List<InetAddress> listM78067c;
        try {
            listM78067c = C18126c2.m78048j().m78067c(str);
        } catch (UnknownHostException e) {
            throw e;
        } catch (Throwable th) {
            Logger.m76961e(TAG, "may be error", th);
            listM78067c = null;
        }
        return (listM78067c == null || listM78067c.isEmpty()) ? C18196h2.m78673b(str) : listM78067c;
    }

    @Override // com.huawei.hms.network.inner.api.NetworkService
    public void onCreate(Context context, Bundle bundle) {
        C18126c2.m78048j().m78055a(ContextHolder.getAppContext(), C18154e2.m78290a(context));
    }

    @Override // com.huawei.hms.network.inner.api.NetworkService
    public void onDestroy(Context context) {
    }

    @Override // com.huawei.hms.network.inner.api.NetworkService
    public void serviceOptions(Map<String, String> map) {
        C18126c2.m78048j().m78062a(Boolean.parseBoolean(map.get(PolicyNetworkService.GlobalConstants.ENABLE_HTTPDNS)));
    }
}
