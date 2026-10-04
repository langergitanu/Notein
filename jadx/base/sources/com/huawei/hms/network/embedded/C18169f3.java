package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.ContextHolder;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.network.embedded.C18321q3;
import com.huawei.hms.network.httpclient.Interceptor;
import com.huawei.hms.network.httpclient.Response;
import com.huawei.hms.network.httpclient.ResponseBody;
import com.huawei.hms.network.httpclient.websocket.WebSocket;
import java.io.IOException;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.f3 */
/* JADX INFO: loaded from: classes9.dex */
public class C18169f3 extends Interceptor {

    /* JADX INFO: renamed from: a */
    public WebSocket f54732a;

    public C18169f3(WebSocket webSocket) {
        this.f54732a = webSocket;
    }

    /* JADX INFO: renamed from: a */
    private C18321q3.d m78414a(C18321q3.d dVar) {
        for (String str : dVar.getHeaders().keySet()) {
            if (str != null && StringUtils.toLowerCase(str).equals("user-agent")) {
                return dVar;
            }
        }
        return new C18321q3.d(dVar.newBuilder().addHeader("User-Agent", C18347s3.getUserAgent(ContextHolder.getAppContext())).build());
    }

    @Override // com.huawei.hms.network.httpclient.Interceptor
    public Response<ResponseBody> intercept(Interceptor.Chain chain) throws IOException {
        C18321q3.b bVar = (C18321q3.b) chain;
        return bVar.getRequestTask().execute(m78414a(bVar.request()), this.f54732a);
    }
}
