package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.network.base.util.TypeUtils;
import com.huawei.hms.network.httpclient.RequestBody;
import com.huawei.hms.network.httpclient.ResponseBody;
import com.huawei.hms.network.restclient.Converter;
import com.huawei.hms.network.restclient.RestClient;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.o6 */
/* JADX INFO: loaded from: classes9.dex */
public final class C18298o6 extends Converter.Factory {

    /* JADX INFO: renamed from: a */
    public static final String f55833a = "BuiltInConverters";

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.o6$a */
    public static final class a extends Converter<RequestBody, RequestBody> {

        /* JADX INFO: renamed from: a */
        public static final a f55834a = new a();

        @Override // com.huawei.hms.network.restclient.Converter
        public RequestBody convert(RequestBody requestBody) {
            return requestBody;
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.o6$b */
    public static final class b extends Converter<ResponseBody, ResponseBody> {

        /* JADX INFO: renamed from: a */
        public static final b f55835a = new b();

        @Override // com.huawei.hms.network.restclient.Converter
        public ResponseBody convert(ResponseBody responseBody) {
            return responseBody;
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.o6$c */
    public static final class c extends Converter<Object, String> {

        /* JADX INFO: renamed from: a */
        public static final c f55836a = new c();

        @Override // com.huawei.hms.network.restclient.Converter
        public String convert(Object obj) {
            return obj.toString();
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.o6$d */
    public static final class d extends Converter<ResponseBody, Void> {

        /* JADX INFO: renamed from: a */
        public static final d f55837a = new d();

        @Override // com.huawei.hms.network.restclient.Converter
        public Void convert(ResponseBody responseBody) {
            try {
                responseBody.close();
                return null;
            } catch (IOException unused) {
                Logger.m76963i(C18298o6.f55833a, "VoidResponseBodyConverter iOException");
                return null;
            }
        }
    }

    @Override // com.huawei.hms.network.restclient.Converter.Factory
    public Converter<?, RequestBody> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, RestClient restClient) {
        if (RequestBody.class.isAssignableFrom(TypeUtils.getRawType(type))) {
            return a.f55834a;
        }
        return null;
    }

    @Override // com.huawei.hms.network.restclient.Converter.Factory
    public Converter<ResponseBody, ?> responseBodyConverter(Type type, Annotation[] annotationArr, RestClient restClient) {
        if (type == ResponseBody.class) {
            return b.f55835a;
        }
        if (type == Void.class) {
            return d.f55837a;
        }
        return null;
    }
}
