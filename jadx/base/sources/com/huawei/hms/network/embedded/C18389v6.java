package com.huawei.hms.network.embedded;

import OooO0O0.OooO0o;
import Oooo0oO.C21023OooO0Oo;
import com.aspose.slides.C22226Oooo0oo;
import com.aspose.slides.internal.p097e0.OooO0O0;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.restclient.hwhttp.ClientConfiguration;
import com.huawei.hms.network.base.common.Headers;
import com.huawei.hms.network.base.util.TypeUtils;
import com.huawei.hms.network.embedded.AbstractC18337r6;
import com.huawei.hms.network.httpclient.HttpClient;
import com.huawei.hms.network.httpclient.Request;
import com.huawei.hms.network.httpclient.RequestBody;
import com.huawei.hms.network.httpclient.ResponseBody;
import com.huawei.hms.network.httpclient.Submit;
import com.huawei.hms.network.restclient.Converter;
import com.huawei.hms.network.restclient.SubmitAdapter;
import com.huawei.hms.network.restclient.anno.NetworkParameters;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.huawei.hms.network.embedded.v6 */
/* JADX INFO: loaded from: classes9.dex */
public final class C18389v6<R, T> {

    /* JADX INFO: renamed from: o */
    public static final String f56375o = "SubmitMethod";

    /* JADX INFO: renamed from: a */
    public final SubmitAdapter<R, T> f56376a;

    /* JADX INFO: renamed from: b */
    public final Converter<ResponseBody, R> f56377b;

    /* JADX INFO: renamed from: c */
    public final String f56378c;

    /* JADX INFO: renamed from: d */
    public final String f56379d;

    /* JADX INFO: renamed from: e */
    public final Headers f56380e;

    /* JADX INFO: renamed from: f */
    public final String f56381f;

    /* JADX INFO: renamed from: g */
    public final boolean f56382g;

    /* JADX INFO: renamed from: h */
    public final boolean f56383h;

    /* JADX INFO: renamed from: i */
    public final AbstractC18337r6<?>[] f56384i;

    /* JADX INFO: renamed from: j */
    public final C18185g5 f56385j;

    /* JADX INFO: renamed from: k */
    public boolean f56386k;

    /* JADX INFO: renamed from: m */
    public static final Pattern f56373m = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

    /* JADX INFO: renamed from: l */
    public static final String f56372l = "[a-zA-Z][a-zA-Z0-9_-]*";

    /* JADX INFO: renamed from: n */
    public static final Pattern f56374n = Pattern.compile(f56372l);

    /* JADX INFO: renamed from: com.huawei.hms.network.embedded.v6$b */
    public static final class b<R, T> {

        /* JADX INFO: renamed from: a */
        public final C18350s6 f56387a;

        /* JADX INFO: renamed from: b */
        public final Method f56388b;

        /* JADX INFO: renamed from: c */
        public final Annotation[] f56389c;

        /* JADX INFO: renamed from: d */
        public final Annotation[][] f56390d;

        /* JADX INFO: renamed from: e */
        public final Type[] f56391e;

        /* JADX INFO: renamed from: f */
        public Type f56392f;

        /* JADX INFO: renamed from: g */
        public boolean f56393g;

        /* JADX INFO: renamed from: h */
        public boolean f56394h;

        /* JADX INFO: renamed from: i */
        public boolean f56395i;

        /* JADX INFO: renamed from: j */
        public boolean f56396j;

        /* JADX INFO: renamed from: k */
        public boolean f56397k;

        /* JADX INFO: renamed from: l */
        public String f56398l;

        /* JADX INFO: renamed from: m */
        public boolean f56399m;

        /* JADX INFO: renamed from: n */
        public boolean f56400n;

        /* JADX INFO: renamed from: o */
        public String f56401o;

        /* JADX INFO: renamed from: p */
        public Headers f56402p;

        /* JADX INFO: renamed from: q */
        public String f56403q;

        /* JADX INFO: renamed from: r */
        public Set<String> f56404r;

        /* JADX INFO: renamed from: s */
        public AbstractC18337r6<?>[] f56405s;

        /* JADX INFO: renamed from: t */
        public Converter<ResponseBody, R> f56406t;

        /* JADX INFO: renamed from: u */
        public SubmitAdapter<R, T> f56407u;

        /* JADX INFO: renamed from: v */
        public Annotation[] f56408v;

        /* JADX INFO: renamed from: w */
        public boolean f56409w;

        public b(C18350s6 c18350s6, Method method, Class cls) {
            this.f56387a = c18350s6;
            this.f56388b = method;
            this.f56389c = method.getAnnotations();
            this.f56391e = method.getGenericParameterTypes();
            this.f56390d = method.getParameterAnnotations();
            this.f56408v = cls.getAnnotations();
        }

        /* JADX INFO: renamed from: a */
        private Headers m79700a(String[] strArr) {
            Headers headers = this.f56402p;
            Headers.Builder builder = headers == null ? new Headers.Builder() : headers.newBuilder();
            for (String str : strArr) {
                int iIndexOf = str.indexOf(58);
                if (iIndexOf == -1 || iIndexOf == 0 || iIndexOf == str.length() - 1) {
                    throw m79707a("@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String strSubstring = str.substring(0, iIndexOf);
                String strTrim = str.substring(iIndexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(strSubstring)) {
                    this.f56403q = strTrim;
                } else {
                    builder.add(strSubstring, strTrim);
                }
            }
            return builder.build();
        }

        /* JADX INFO: renamed from: b */
        private AbstractC18337r6<?> m79714b(int i, Type type) {
            if (type == String.class) {
                return new AbstractC18337r6.i();
            }
            throw m79706a(i, "@NetworkParameters must be of type String.");
        }

        /* JADX INFO: renamed from: c */
        private AbstractC18337r6<?> m79720c(int i, Type type) {
            if (this.f56397k) {
                throw m79706a(i, "Multiple @Url method annotations found.");
            }
            if (this.f56395i) {
                throw m79706a(i, "@Path parameters may not be used with @Url.");
            }
            if (this.f56396j) {
                throw m79706a(i, "A @Url parameter must not come after a @Query");
            }
            if (this.f56401o != null) {
                throw m79706a(i, "@Url cannot be used with " + this.f56398l);
            }
            this.f56397k = true;
            if (type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                return new AbstractC18337r6.n();
            }
            throw m79706a(i, "@Url must be String, java.net.URI, or android.net.Uri type.");
        }

        /* JADX INFO: renamed from: d */
        private AbstractC18337r6<?> m79724d(int i, Type type, Annotation[] annotationArr) {
            AbstractC18337r6<?> abstractC18337r6 = null;
            for (Annotation annotation : annotationArr) {
                AbstractC18337r6<?> abstractC18337r6M79722c = m79722c(i, type, annotationArr, annotation);
                if (abstractC18337r6M79722c != null) {
                    if (abstractC18337r6 != null) {
                        throw m79706a(i, "Multiple RestClient annotations found, only one allowed.");
                    }
                    abstractC18337r6 = abstractC18337r6M79722c;
                }
            }
            if (abstractC18337r6 != null) {
                return abstractC18337r6;
            }
            throw m79706a(i, "No RestClient annotation found.");
        }

        /* JADX INFO: renamed from: e */
        private AbstractC18337r6<?> m79726e(int i, Type type, Annotation[] annotationArr) {
            Class<?> rawType = TypeUtils.getRawType(type);
            if (!Map.class.isAssignableFrom(rawType)) {
                throw m79706a(i, "@QueryMap parameter type must be Map.");
            }
            Type supertype = TypeUtils.getSupertype(type, rawType, Map.class);
            if (!(supertype instanceof ParameterizedType)) {
                throw m79706a(i, "Map must include generic types (e.g., Map<String, String>)");
            }
            ParameterizedType parameterizedType = (ParameterizedType) supertype;
            Type parameterUpperBound = TypeUtils.getParameterUpperBound(0, parameterizedType);
            if (String.class != parameterUpperBound) {
                throw m79706a(i, OooO0O0.OooO0O0("@QueryMap keys must be of type String: ", parameterUpperBound));
            }
            return new AbstractC18337r6.k(this.f56387a.stringConverter(TypeUtils.getParameterUpperBound(1, parameterizedType), annotationArr));
        }

        /* JADX INFO: renamed from: f */
        private AbstractC18337r6<?> m79728f(int i, Type type, Annotation[] annotationArr) {
            Class<?> rawType = TypeUtils.getRawType(type);
            if (!Map.class.isAssignableFrom(rawType)) {
                throw m79706a(i, "@RecordMap parameter type must be Map.");
            }
            Type supertype = TypeUtils.getSupertype(type, rawType, Map.class);
            if (!(supertype instanceof ParameterizedType)) {
                throw m79706a(i, "Map must include generic types (e.g., Map<String, String>)");
            }
            ParameterizedType parameterizedType = (ParameterizedType) supertype;
            Type parameterUpperBound = TypeUtils.getParameterUpperBound(0, parameterizedType);
            if (String.class != parameterUpperBound) {
                throw m79706a(i, OooO0O0.OooO0O0("@RecordMap keys must be of type String: ", parameterUpperBound));
            }
            return new AbstractC18337r6.m(this.f56387a.stringConverter(TypeUtils.getParameterUpperBound(1, parameterizedType), annotationArr));
        }

        public C18389v6 build() {
            SubmitAdapter<R, T> submitAdapterM79704a = m79704a(this.f56388b);
            this.f56407u = submitAdapterM79704a;
            this.f56392f = submitAdapterM79704a.responseType();
            this.f56406t = m79717b();
            for (Annotation annotation : this.f56408v) {
                m79719b(annotation);
            }
            for (Annotation annotation2 : this.f56389c) {
                m79723c(annotation2);
            }
            if (this.f56398l == null) {
                throw m79707a("HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
            if (!this.f56399m && this.f56400n) {
                throw m79707a("FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
            }
            int length = this.f56390d.length;
            this.f56405s = new AbstractC18337r6[length];
            for (int i = 0; i < length; i++) {
                Type type = this.f56391e[i];
                if (TypeUtils.hasUnresolvableType(type)) {
                    throw m79706a(i, OooO0O0.OooO0O0("Parameter type must not include a type variable or wildcard: ", type));
                }
                Annotation[] annotationArr = this.f56390d[i];
                if (annotationArr == null) {
                    throw m79706a(i, "No RestClient annotation found.");
                }
                this.f56405s[i] = m79724d(i, type, annotationArr);
            }
            m79710a();
            return new C18389v6(this);
        }

        /* JADX INFO: renamed from: a */
        private AbstractC18337r6<?> m79701a(int i, Type type) {
            if (type == ClientConfiguration.class) {
                return new AbstractC18337r6.d();
            }
            throw m79706a(i, "@ClientConfig must be com.huawei.hms.framework.network.rest.hwhttp.ClientConfiguration .");
        }

        /* JADX INFO: renamed from: b */
        private AbstractC18337r6<?> m79715b(int i, Type type, Annotation[] annotationArr) {
            if (!this.f56400n) {
                throw m79706a(i, "@FieldMap parameters can only be used with form encoding.");
            }
            Class<?> rawType = TypeUtils.getRawType(type);
            if (!Map.class.isAssignableFrom(rawType)) {
                throw m79706a(i, "@FieldMap parameter type must be Map.");
            }
            Type supertype = TypeUtils.getSupertype(type, rawType, Map.class);
            if (!(supertype instanceof ParameterizedType)) {
                throw m79706a(i, "Map must include generic types (e.g., Map<String, String>)");
            }
            ParameterizedType parameterizedType = (ParameterizedType) supertype;
            Type parameterUpperBound = TypeUtils.getParameterUpperBound(0, parameterizedType);
            if (String.class != parameterUpperBound) {
                throw m79706a(i, OooO0O0.OooO0O0("@FieldMap keys must be of type String: ", parameterUpperBound));
            }
            Converter<T, String> converterStringConverter = this.f56387a.stringConverter(TypeUtils.getParameterUpperBound(1, parameterizedType), annotationArr);
            this.f56393g = true;
            return new AbstractC18337r6.e(converterStringConverter);
        }

        /* JADX INFO: renamed from: c */
        private AbstractC18337r6<?> m79721c(int i, Type type, Annotation[] annotationArr) {
            Class<?> rawType = TypeUtils.getRawType(type);
            if (!Map.class.isAssignableFrom(rawType)) {
                throw m79706a(i, "@HeaderMap parameter type must be Map.");
            }
            Type supertype = TypeUtils.getSupertype(type, rawType, Map.class);
            if (!(supertype instanceof ParameterizedType)) {
                throw m79706a(i, "Map must include generic types (e.g., Map<String, String>)");
            }
            ParameterizedType parameterizedType = (ParameterizedType) supertype;
            Type parameterUpperBound = TypeUtils.getParameterUpperBound(0, parameterizedType);
            if (String.class != parameterUpperBound) {
                throw m79706a(i, OooO0O0.OooO0O0("@HeaderMap keys must be of type String: ", parameterUpperBound));
            }
            return new AbstractC18337r6.h(this.f56387a.stringConverter(TypeUtils.getParameterUpperBound(1, parameterizedType), annotationArr));
        }

        /* JADX INFO: renamed from: d */
        private AbstractC18337r6<?> m79725d(int i, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (this.f56396j) {
                throw m79706a(i, "A @Path parameter must not come after a @Query.");
            }
            if (this.f56397k) {
                throw m79706a(i, "@Path parameters may not be used with @Url.");
            }
            if (this.f56401o == null) {
                throw m79706a(i, "@Path can only be used with relative url on @" + this.f56398l);
            }
            this.f56395i = true;
            String str = (String) m79705a(annotation);
            m79718b(i, str);
            return new AbstractC18337r6.j(str, this.f56387a.stringConverter(type, annotationArr));
        }

        /* JADX INFO: renamed from: a */
        private AbstractC18337r6<?> m79702a(int i, Type type, Annotation[] annotationArr) {
            if (this.f56400n) {
                throw m79706a(i, "@Body parameters cannot be used with form or multi-part encoding.");
            }
            if (this.f56394h) {
                throw m79706a(i, "Multiple @Body method annotations found.");
            }
            try {
                Converter<T, RequestBody> converterRequestBodyConverter = this.f56387a.requestBodyConverter(type, annotationArr, this.f56389c);
                this.f56394h = true;
                return new AbstractC18337r6.c(converterRequestBodyConverter);
            } catch (RuntimeException e) {
                throw m79708a(e, i, OooO0O0.OooO0O0("Unable to create @Body converter for ", type));
            }
        }

        /* JADX INFO: renamed from: e */
        private AbstractC18337r6<?> m79727e(int i, Type type, Annotation[] annotationArr, Annotation annotation) {
            String str = (String) m79705a(annotation);
            Class<?> rawType = TypeUtils.getRawType(type);
            this.f56396j = true;
            if (!Iterable.class.isAssignableFrom(rawType)) {
                if (!rawType.isArray()) {
                    return new AbstractC18337r6.l(str, this.f56387a.stringConverter(type, annotationArr));
                }
                return new AbstractC18337r6.l(str, this.f56387a.stringConverter(TypeUtils.boxIfPrimitive(rawType.getComponentType()), annotationArr)).m79447a();
            }
            if (type instanceof ParameterizedType) {
                return new AbstractC18337r6.l(str, this.f56387a.stringConverter(TypeUtils.getParameterUpperBound(0, (ParameterizedType) type), annotationArr)).m79449b();
            }
            throw m79706a(i, rawType.getSimpleName() + " must include generic type (e.g., " + rawType.getSimpleName() + "<String>)");
        }

        /* JADX INFO: renamed from: b */
        private AbstractC18337r6<?> m79716b(int i, Type type, Annotation[] annotationArr, Annotation annotation) {
            String str = (String) m79705a(annotation);
            Class<?> rawType = TypeUtils.getRawType(type);
            if (!Iterable.class.isAssignableFrom(rawType)) {
                if (!rawType.isArray()) {
                    return new AbstractC18337r6.g(str, this.f56387a.stringConverter(type, annotationArr));
                }
                return new AbstractC18337r6.g(str, this.f56387a.stringConverter(TypeUtils.boxIfPrimitive(rawType.getComponentType()), annotationArr)).m79447a();
            }
            if (type instanceof ParameterizedType) {
                return new AbstractC18337r6.g(str, this.f56387a.stringConverter(TypeUtils.getParameterUpperBound(0, (ParameterizedType) type), annotationArr)).m79449b();
            }
            throw m79706a(i, rawType.getSimpleName() + " must include generic type (e.g., " + rawType.getSimpleName() + "<String>)");
        }

        /* JADX INFO: renamed from: c */
        private AbstractC18337r6<?> m79722c(int i, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (m79713a(annotation, "Url")) {
                return m79720c(i, type);
            }
            if (m79713a(annotation, "Path")) {
                return m79725d(i, type, annotationArr, annotation);
            }
            if (m79713a(annotation, "Query")) {
                return m79727e(i, type, annotationArr, annotation);
            }
            if (m79713a(annotation, "QueryMap")) {
                return m79726e(i, type, annotationArr);
            }
            if (m79713a(annotation, "Header")) {
                return m79716b(i, type, annotationArr, annotation);
            }
            if (m79713a(annotation, "HeaderMap")) {
                return m79721c(i, type, annotationArr);
            }
            if (m79713a(annotation, "Field")) {
                return m79703a(i, type, annotationArr, annotation);
            }
            if (m79713a(annotation, "FieldMap")) {
                return m79715b(i, type, annotationArr);
            }
            if (m79713a(annotation, "Body")) {
                return m79702a(i, type, annotationArr);
            }
            if (m79713a(annotation, "ClientConfig")) {
                return m79701a(i, type);
            }
            if (annotation instanceof NetworkParameters) {
                return m79714b(i, type);
            }
            if (m79713a(annotation, "RecordMap")) {
                return m79728f(i, type, annotationArr);
            }
            return null;
        }

        /* JADX INFO: renamed from: a */
        private AbstractC18337r6<?> m79703a(int i, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (!this.f56400n) {
                throw m79706a(i, "@Field parameters can only be used with form encoding.");
            }
            String str = (String) m79705a(annotation);
            this.f56393g = true;
            Class<?> rawType = TypeUtils.getRawType(type);
            if (!Iterable.class.isAssignableFrom(rawType)) {
                if (!rawType.isArray()) {
                    return new AbstractC18337r6.f(str, this.f56387a.stringConverter(type, annotationArr));
                }
                return new AbstractC18337r6.f(str, this.f56387a.stringConverter(TypeUtils.boxIfPrimitive(rawType.getComponentType()), annotationArr)).m79447a();
            }
            if (type instanceof ParameterizedType) {
                return new AbstractC18337r6.f(str, this.f56387a.stringConverter(TypeUtils.getParameterUpperBound(0, (ParameterizedType) type), annotationArr)).m79449b();
            }
            throw m79706a(i, rawType.getSimpleName() + " must include generic type (e.g., " + rawType.getSimpleName() + "<String>)");
        }

        /* JADX INFO: renamed from: b */
        private Converter<ResponseBody, R> m79717b() {
            try {
                return this.f56387a.responseBodyConverter(this.f56392f, this.f56389c);
            } catch (RuntimeException e) {
                throw m79709a(e, "Unable to create converter for " + this.f56392f, new Object[0]);
            }
        }

        /* JADX INFO: renamed from: c */
        private void m79723c(Annotation annotation) {
            if (m79713a(annotation, "GET")) {
                m79711a("GET", (String) m79705a(annotation), false);
                return;
            }
            if (m79713a(annotation, "DELETE")) {
                m79711a("DELETE", (String) m79705a(annotation), false);
                return;
            }
            if (m79713a(annotation, "PUT")) {
                m79711a("PUT", (String) m79705a(annotation), true);
                return;
            }
            if (m79713a(annotation, "POST")) {
                m79711a("POST", (String) m79705a(annotation), true);
                return;
            }
            if (m79713a(annotation, "HEAD")) {
                m79711a("HEAD", (String) m79705a(annotation), false);
                if (!Void.class.equals(this.f56392f)) {
                    throw m79707a("HEAD method must use Void as response type.", new Object[0]);
                }
            } else {
                if (m79713a(annotation, "Headers")) {
                    String[] strArr = (String[]) m79705a(annotation);
                    if (strArr.length == 0) {
                        throw m79707a("@Headers annotation is empty.", new Object[0]);
                    }
                    this.f56402p = m79700a(strArr);
                    return;
                }
                if (m79713a(annotation, "FormUrlEncoded")) {
                    this.f56400n = true;
                } else if (m79713a(annotation, "OnlyConnect")) {
                    this.f56409w = true;
                }
            }
        }

        /* JADX INFO: renamed from: a */
        private SubmitAdapter<R, T> m79704a(Method method) {
            Type genericReturnType = method.getGenericReturnType();
            if (TypeUtils.hasUnresolvableType(genericReturnType)) {
                throw m79707a(OooO0O0.OooO0O0("Method return type must not include a type variable or wildcard: ", genericReturnType), new Object[0]);
            }
            if (genericReturnType == Void.TYPE) {
                throw m79707a("Service methods cannot return void.", new Object[0]);
            }
            try {
                return (SubmitAdapter<R, T>) this.f56387a.submitAdapter(genericReturnType, this.f56389c);
            } catch (RuntimeException e) {
                throw m79709a(e, OooO0O0.OooO0O0("Unable to create submit adapter for ", genericReturnType), new Object[0]);
            }
        }

        /* JADX INFO: renamed from: b */
        private void m79718b(int i, String str) {
            if (!C18389v6.f56374n.matcher(str).matches()) {
                throw m79706a(i, StringUtils.format("@Path parameter name must match %s. Found: %s", C18389v6.f56373m.pattern(), str));
            }
            if (!this.f56404r.contains(str)) {
                throw m79706a(i, StringUtils.format("URL \"%s\" does not contain \"{%s}\".", this.f56401o, str));
            }
        }

        /* JADX INFO: renamed from: b */
        private void m79719b(Annotation annotation) {
            if (m79713a(annotation, "Headers")) {
                String[] strArr = (String[]) m79705a(annotation);
                if (strArr.length == 0) {
                    throw m79707a("@Headers annotation is empty.", new Object[0]);
                }
                this.f56402p = m79700a(strArr);
            }
        }

        /* JADX INFO: renamed from: a */
        private Object m79705a(Annotation annotation) {
            String str;
            try {
                return annotation.annotationType().getMethod("value", new Class[0]).invoke(annotation, new Object[0]);
            } catch (IllegalAccessException unused) {
                str = "IllegalAccessException";
                Logger.m76967w(C18389v6.f56375o, str);
                throw new IllegalStateException("get annotation value error:".concat(annotation.getClass().getSimpleName()));
            } catch (NoSuchMethodException unused2) {
                str = "NoSuchMethodException";
                Logger.m76967w(C18389v6.f56375o, str);
                throw new IllegalStateException("get annotation value error:".concat(annotation.getClass().getSimpleName()));
            } catch (InvocationTargetException unused3) {
                str = "InvocationTargetException";
                Logger.m76967w(C18389v6.f56375o, str);
                throw new IllegalStateException("get annotation value error:".concat(annotation.getClass().getSimpleName()));
            }
        }

        /* JADX INFO: renamed from: a */
        private RuntimeException m79706a(int i, String str) {
            StringBuilder sbOooO0OO = C22226Oooo0oo.OooO0OO(str, " (parameter #");
            sbOooO0OO.append(i + 1);
            sbOooO0OO.append(")");
            return m79707a(sbOooO0OO.toString(), new Object[0]);
        }

        /* JADX INFO: renamed from: a */
        private RuntimeException m79707a(String str, Object... objArr) {
            return m79709a((Throwable) null, str, objArr);
        }

        /* JADX INFO: renamed from: a */
        private RuntimeException m79708a(Throwable th, int i, String str) {
            StringBuilder sbOooO0OO = C22226Oooo0oo.OooO0OO(str, " (parameter #");
            sbOooO0OO.append(i + 1);
            sbOooO0OO.append(")");
            return m79709a(th, sbOooO0OO.toString(), new Object[0]);
        }

        /* JADX INFO: renamed from: a */
        private RuntimeException m79709a(Throwable th, String str, Object... objArr) {
            StringBuilder sbOooO0OO = C22226Oooo0oo.OooO0OO(StringUtils.format(str, objArr), "\n    for method ");
            sbOooO0OO.append(this.f56388b.getDeclaringClass().getSimpleName());
            sbOooO0OO.append(".");
            sbOooO0OO.append(this.f56388b.getName());
            return new IllegalArgumentException(sbOooO0OO.toString(), th);
        }

        /* JADX INFO: renamed from: a */
        private void m79710a() {
            if (this.f56401o == null && !this.f56397k) {
                throw m79707a("Missing either @%s URL or @Url parameter.", this.f56398l);
            }
            boolean z = this.f56400n;
            if (!z && !this.f56399m && this.f56394h) {
                throw m79707a("Non-body HTTP method cannot contain @Body.", new Object[0]);
            }
            if (z && !this.f56393g) {
                throw m79707a("Form-encoded method must contain at least one @Field.", new Object[0]);
            }
        }

        /* JADX INFO: renamed from: a */
        private void m79711a(String str, String str2, boolean z) {
            String str3 = this.f56398l;
            if (str3 != null) {
                throw m79707a("Only one HTTP method is allowed. Found: %s and %s.", str3, str);
            }
            this.f56398l = str;
            this.f56399m = z;
            if (str2.isEmpty()) {
                return;
            }
            int iIndexOf = str2.indexOf(63);
            if (iIndexOf != -1 && iIndexOf < str2.length() - 1) {
                String strSubstring = str2.substring(iIndexOf + 1);
                if (C18389v6.f56373m.matcher(strSubstring).find()) {
                    throw m79707a("URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", strSubstring);
                }
            }
            this.f56401o = str2;
            this.f56404r = C18389v6.m79695b(str2);
        }

        /* JADX INFO: renamed from: a */
        private boolean m79713a(Annotation annotation, String str) {
            return annotation.annotationType().getSimpleName().equals(str);
        }
    }

    public C18389v6(b<R, T> bVar) {
        this.f56376a = bVar.f56407u;
        this.f56385j = bVar.f56387a.getBaseUrl();
        this.f56377b = bVar.f56406t;
        this.f56378c = bVar.f56398l;
        this.f56379d = bVar.f56401o;
        this.f56380e = bVar.f56402p;
        this.f56381f = bVar.f56403q;
        this.f56382g = bVar.f56399m;
        this.f56383h = bVar.f56400n;
        this.f56384i = bVar.f56405s;
        this.f56386k = bVar.f56409w;
    }

    /* JADX INFO: renamed from: b */
    public static Set<String> m79695b(String str) {
        Matcher matcher = f56373m.matcher(str);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (matcher.find()) {
            linkedHashSet.add(matcher.group(1));
        }
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: a */
    public Request m79697a(HttpClient httpClient, Object... objArr) throws IOException {
        C18376u6 c18376u6 = new C18376u6(httpClient, this.f56378c, this.f56385j, this.f56379d, this.f56380e, this.f56381f, this.f56382g, this.f56383h, this.f56386k);
        AbstractC18337r6<?>[] abstractC18337r6Arr = this.f56384i;
        int length = objArr != null ? objArr.length : 0;
        if (abstractC18337r6Arr == null) {
            throw new IllegalArgumentException("parameterHandlers is null");
        }
        if (length != abstractC18337r6Arr.length) {
            throw new IllegalArgumentException(C21023OooO0Oo.OooO0OO(")", abstractC18337r6Arr.length, OooO0o.OooO0OO(length, "Argument count (", ") doesn't match expected count (")));
        }
        for (int i = 0; i < length; i++) {
            abstractC18337r6Arr[i].mo79448a(c18376u6, objArr[i]);
        }
        return c18376u6.m79599a();
    }

    /* JADX INFO: renamed from: a */
    public R m79698a(ResponseBody responseBody) throws IOException {
        return this.f56377b.convert(responseBody);
    }

    /* JADX INFO: renamed from: a */
    public T m79699a(Submit<R> submit) {
        return this.f56376a.adapt2(submit);
    }
}
