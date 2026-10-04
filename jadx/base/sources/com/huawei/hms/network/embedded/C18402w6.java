package com.huawei.hms.network.embedded;

import com.huawei.hms.network.base.common.RequestBodyProviders;
import com.huawei.hms.network.httpclient.RequestBody;
import com.huawei.hms.network.httpclient.ResponseBody;
import com.huawei.hms.network.restclient.Converter;
import com.huawei.hms.network.restclient.RestClient;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.w6 */
/* JADX INFO: loaded from: classes9.dex */
public class C18402w6 extends Converter.Factory {

    /* JADX INFO: renamed from: a */
    public static final String f56541a = "text/plain; charset=UTF-8";

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.w6$a */
    public class a extends Converter<ResponseBody, String> {
        public a() {
        }

        @Override // com.huawei.hms.network.restclient.Converter
        public String convert(ResponseBody responseBody) throws IOException {
            return new String(responseBody.bytes(), "UTF-8");
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.w6$b */
    public class b extends Converter<String, RequestBody> {
        public b() {
        }

        @Override // com.huawei.hms.network.restclient.Converter
        public RequestBody convert(String str) throws IOException {
            return RequestBodyProviders.create("text/plain; charset=UTF-8", str.getBytes("UTF-8"));
        }
    }

    @Override // com.huawei.hms.network.restclient.Converter.Factory
    public Converter<?, RequestBody> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, RestClient restClient) {
        if (String.class.equals(type)) {
            return new b();
        }
        return null;
    }

    @Override // com.huawei.hms.network.restclient.Converter.Factory
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotationArr, RestClient restClient) {
        if (String.class.equals(type)) {
            return new a();
        }
        return null;
    }
}
