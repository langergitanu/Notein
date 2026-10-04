package com.huawei.hms.network.embedded;

import com.huawei.hms.framework.common.CheckParamUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.network.embedded.C18298o6;
import com.huawei.hms.network.embedded.C18389v6;
import com.huawei.hms.network.httpclient.HttpClient;
import com.huawei.hms.network.httpclient.RequestBody;
import com.huawei.hms.network.httpclient.ResponseBody;
import com.huawei.hms.network.inner.api.PolicyNetworkService;
import com.huawei.hms.network.restclient.Converter;
import com.huawei.hms.network.restclient.RestClient;
import com.huawei.hms.network.restclient.SubmitAdapter;
import com.huawei.hms.network.restclient.internal.IRestClientBuilder;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.s6 */
/* JADX INFO: loaded from: classes9.dex */
public class C18350s6 extends RestClient {

    /* JADX INFO: renamed from: h */
    public static final String f56109h = "RealRestClient";

    /* JADX INFO: renamed from: a */
    public final C18185g5 f56110a;

    /* JADX INFO: renamed from: b */
    public final List<Converter.Factory> f56111b;

    /* JADX INFO: renamed from: c */
    public final List<SubmitAdapter.Factory> f56112c;

    /* JADX INFO: renamed from: d */
    public final Executor f56113d;

    /* JADX INFO: renamed from: e */
    public final boolean f56114e;

    /* JADX INFO: renamed from: f */
    public HttpClient f56115f;

    /* JADX INFO: renamed from: g */
    public final Map<Method, C18389v6<?, ?>> f56116g;

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.s6$a */
    public class a implements InvocationHandler {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Class f56117a;

        public a(Class cls) {
            this.f56117a = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            C18389v6 c18389v6M79490a = C18350s6.this.m79490a(method, this.f56117a);
            return c18389v6M79490a.m79699a(new C18363t6(C18350s6.this.f56115f, c18389v6M79490a, objArr));
        }
    }

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.s6$b */
    public static final class b extends IRestClientBuilder {

        /* JADX INFO: renamed from: a */
        public final List<Converter.Factory> f56119a;

        /* JADX INFO: renamed from: b */
        public final List<SubmitAdapter.Factory> f56120b;

        /* JADX INFO: renamed from: c */
        public HttpClient f56121c;

        /* JADX INFO: renamed from: d */
        public C18185g5 f56122d;

        /* JADX INFO: renamed from: e */
        public Executor f56123e;

        /* JADX INFO: renamed from: f */
        public boolean f56124f;

        public b() {
            this.f56119a = new ArrayList();
            this.f56120b = new ArrayList();
        }

        /* JADX INFO: renamed from: a */
        private SubmitAdapter.Factory m79498a(Executor executor) {
            return executor != null ? new C18324q6(executor) : C18311p6.f55880a;
        }

        @Override // com.huawei.hms.network.restclient.internal.IRestClientBuilder
        public b addConverterFactory(Converter.Factory factory) {
            this.f56119a.add((Converter.Factory) CheckParamUtils.checkNotNull(factory, "factory == null"));
            return this;
        }

        @Override // com.huawei.hms.network.restclient.internal.IRestClientBuilder
        public b addSubmitAdapterFactory(SubmitAdapter.Factory factory) {
            this.f56120b.add((SubmitAdapter.Factory) CheckParamUtils.checkNotNull(factory, "factory == null"));
            return this;
        }

        public b baseUrl(C18185g5 c18185g5) {
            CheckParamUtils.checkNotNull(c18185g5, "baseUrl == null");
            this.f56122d = c18185g5;
            return this;
        }

        @Override // com.huawei.hms.network.restclient.internal.IRestClientBuilder
        public RestClient build() {
            if (this.f56122d == null) {
                Logger.m76967w(C18350s6.f56109h, "may be you need a baseUrl");
            }
            Executor executor = this.f56123e;
            ArrayList arrayList = new ArrayList(this.f56120b);
            arrayList.add(m79498a(executor));
            ArrayList arrayList2 = new ArrayList(this.f56119a.size() + 2);
            arrayList2.add(new C18298o6());
            arrayList2.add(new C18402w6());
            arrayList2.addAll(this.f56119a);
            Logger.m76958d(C18350s6.f56109h, "build time = " + C18347s3.getBuildTime());
            return new C18350s6(this.f56122d, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), executor, this.f56124f, this.f56121c, null);
        }

        @Override // com.huawei.hms.network.restclient.internal.IRestClientBuilder
        public b callbackExecutor(Executor executor) {
            this.f56123e = (Executor) CheckParamUtils.checkNotNull(executor, "executor == null");
            return this;
        }

        @Override // com.huawei.hms.network.restclient.internal.IRestClientBuilder
        public b httpClient(HttpClient httpClient) {
            this.f56121c = (HttpClient) CheckParamUtils.checkNotNull(httpClient, "client == null");
            return this;
        }

        @Override // com.huawei.hms.network.restclient.internal.IRestClientBuilder
        public b validateEagerly(boolean z) {
            this.f56124f = z;
            return this;
        }

        public b(C18350s6 c18350s6) {
            ArrayList arrayList = new ArrayList();
            this.f56119a = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f56120b = arrayList2;
            this.f56122d = c18350s6.f56110a;
            arrayList.addAll(c18350s6.f56111b);
            arrayList.remove(1);
            arrayList.remove(0);
            arrayList2.addAll(c18350s6.f56112c);
            arrayList2.remove(arrayList2.size() - 1);
            this.f56123e = c18350s6.f56113d;
            this.f56124f = c18350s6.f56114e;
            this.f56121c = c18350s6.f56115f;
        }

        @Override // com.huawei.hms.network.restclient.internal.IRestClientBuilder
        public b baseUrl(String str) {
            this.f56122d = new C18185g5(str);
            return this;
        }
    }

    public C18350s6(C18185g5 c18185g5, List<Converter.Factory> list, List<SubmitAdapter.Factory> list2, Executor executor, boolean z, HttpClient httpClient) {
        this.f56116g = new ConcurrentHashMap();
        this.f56110a = c18185g5;
        this.f56111b = list;
        this.f56112c = list2;
        this.f56113d = executor;
        this.f56114e = z;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(PolicyNetworkService.ProfileConstants.SCENE_TYPE_OPTION_KEY, PolicyNetworkService.ProfileConstants.RESTFUL);
        } catch (JSONException e) {
            Logger.m76967w(f56109h, "Init httpclient occurs JSONException " + e.getMessage());
        }
        this.f56115f = httpClient != null ? httpClient.newBuilder().options(jSONObject.toString()).build() : new HttpClient.Builder().options(jSONObject.toString()).build();
    }

    @Override // com.huawei.hms.network.restclient.RestClient
    public <T> T create(Class<T> cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        if (cls.getInterfaces().length > 0) {
            throw new IllegalArgumentException("API interfaces must not extend other interfaces.");
        }
        if (this.f56114e) {
            m79492a((Class<?>) cls);
        }
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
    }

    public C18185g5 getBaseUrl() {
        return this.f56110a;
    }

    public Executor getCallbackExecutor() {
        return this.f56113d;
    }

    public List<Converter.Factory> getConverterFactories() {
        return this.f56111b;
    }

    public HttpClient getHttpClient() {
        return this.f56115f;
    }

    public List<SubmitAdapter.Factory> getSubmitAdapterFactories() {
        return this.f56112c;
    }

    @Override // com.huawei.hms.network.restclient.RestClient
    public IRestClientBuilder newBuilder() {
        return new b(this);
    }

    public <T> Converter<T, RequestBody> nextRequestBodyConverter(Converter.Factory factory, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        CheckParamUtils.checkNotNull(type, "type == null");
        CheckParamUtils.checkNotNull(annotationArr, "parameterAnnotations == null");
        CheckParamUtils.checkNotNull(annotationArr2, "methodAnnotations == null");
        int size = this.f56111b.size();
        for (int iIndexOf = this.f56111b.indexOf(factory) + 1; iIndexOf < size; iIndexOf++) {
            Converter<T, RequestBody> converter = (Converter<T, RequestBody>) this.f56111b.get(iIndexOf).requestBodyConverter(type, annotationArr, annotationArr2, this);
            if (converter != null) {
                return converter;
            }
        }
        throw new IllegalArgumentException("Could not locate RequestBody converter for " + type + ".\n");
    }

    public <T> Converter<ResponseBody, T> nextResponseBodyConverter(Converter.Factory factory, Type type, Annotation[] annotationArr) {
        CheckParamUtils.checkNotNull(type, "type == null");
        CheckParamUtils.checkNotNull(annotationArr, "annotations == null");
        int size = this.f56111b.size();
        for (int iIndexOf = this.f56111b.indexOf(factory) + 1; iIndexOf < size; iIndexOf++) {
            Converter<ResponseBody, T> converter = (Converter<ResponseBody, T>) this.f56111b.get(iIndexOf).responseBodyConverter(type, annotationArr, this);
            if (converter != null) {
                return converter;
            }
        }
        throw new IllegalArgumentException("Could not locate ResponseBody converter for " + type + ".\n");
    }

    public SubmitAdapter<?, ?> nextSubmitAdapter(SubmitAdapter.Factory factory, Type type, Annotation[] annotationArr) {
        CheckParamUtils.checkNotNull(type, "returnType == null");
        CheckParamUtils.checkNotNull(annotationArr, "annotations == null");
        int size = this.f56112c.size();
        for (int iIndexOf = this.f56112c.indexOf(factory) + 1; iIndexOf < size; iIndexOf++) {
            SubmitAdapter<?, ?> submitAdapter = this.f56112c.get(iIndexOf).get(type, annotationArr, this);
            if (submitAdapter != null) {
                return submitAdapter;
            }
        }
        throw new IllegalArgumentException("Could not locate submit adapter for " + type + ".\n");
    }

    public <T> Converter<T, RequestBody> requestBodyConverter(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return nextRequestBodyConverter(null, type, annotationArr, annotationArr2);
    }

    public <T> Converter<ResponseBody, T> responseBodyConverter(Type type, Annotation[] annotationArr) {
        return nextResponseBodyConverter(null, type, annotationArr);
    }

    public <T> Converter<T, String> stringConverter(Type type, Annotation[] annotationArr) {
        CheckParamUtils.checkNotNull(type, "type == null");
        CheckParamUtils.checkNotNull(annotationArr, "annotations == null");
        int size = this.f56111b.size();
        for (int i = 0; i < size; i++) {
            Converter<T, String> converter = (Converter<T, String>) this.f56111b.get(i).stringConverter(type, annotationArr, this);
            if (converter != null) {
                return converter;
            }
        }
        return C18298o6.c.f55836a;
    }

    public SubmitAdapter<?, ?> submitAdapter(Type type, Annotation[] annotationArr) {
        return nextSubmitAdapter(null, type, annotationArr);
    }

    public /* synthetic */ C18350s6(C18185g5 c18185g5, List list, List list2, Executor executor, boolean z, HttpClient httpClient, a aVar) {
        this(c18185g5, list, list2, executor, z, httpClient);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public C18389v6<?, ?> m79490a(Method method, Class cls) {
        C18389v6 c18389v6Build;
        C18389v6<?, ?> c18389v6 = this.f56116g.get(method);
        if (c18389v6 != null) {
            return c18389v6;
        }
        synchronized (this.f56116g) {
            try {
                c18389v6Build = this.f56116g.get(method);
                if (c18389v6Build == null) {
                    c18389v6Build = new C18389v6.b(this, method, cls).build();
                    this.f56116g.put(method, c18389v6Build);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c18389v6Build;
    }

    /* JADX INFO: renamed from: a */
    private void m79492a(Class<?> cls) {
        for (Method method : cls.getDeclaredMethods()) {
            m79490a(method, cls);
        }
    }
}
