package com.huawei.hms.network.embedded;

import com.huawei.hms.network.httpclient.Interceptor;
import com.huawei.hms.network.httpclient.Response;
import com.huawei.hms.network.httpclient.ResponseBody;
import java.io.IOException;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.i5 */
/* JADX INFO: loaded from: classes9.dex */
public class C18213i5 extends Interceptor {
    @Override // com.huawei.hms.network.httpclient.Interceptor
    public Response<ResponseBody> intercept(Interceptor.Chain chain) throws IOException {
        AbstractC18151e.m78274c().mo78280b();
        try {
            Response<ResponseBody> responseProceed = chain.proceed(chain.request());
            AbstractC18151e.m78274c().mo78281b(true);
            return responseProceed;
        } catch (Throwable th) {
            AbstractC18151e.m78274c().mo78281b(false);
            throw th;
        }
    }
}
