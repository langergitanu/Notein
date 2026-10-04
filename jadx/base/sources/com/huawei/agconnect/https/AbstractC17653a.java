package com.huawei.agconnect.https;

import com.huawei.agconnect.https.annotation.Header;
import com.huawei.agconnect.https.annotation.HeaderMap;
import com.huawei.agconnect.https.annotation.Query;
import com.huawei.agconnect.https.annotation.Url;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.InvalidParameterException;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Map;
import okhttp3.HttpUrl;
import okhttp3.Request;

/* JADX INFO: renamed from: com.huawei.agconnect.https.a */
/* JADX INFO: loaded from: classes8.dex */
abstract class AbstractC17653a<Annotation, Builder> {

    /* JADX INFO: renamed from: a */
    private static c f52226a = new c();

    /* JADX INFO: renamed from: b */
    private static b f52227b = new b();

    /* JADX INFO: renamed from: c */
    private static a f52228c = new a();

    /* JADX INFO: renamed from: com.huawei.agconnect.https.a$a */
    public static class a extends AbstractC17653a<Header, Request.Builder> {
        @Override // com.huawei.agconnect.https.AbstractC17653a
        /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public <RequestBean> Request.Builder mo75631a(Field field, RequestBean requestbean, Request.Builder builder) {
            if (builder == null) {
                throw new IllegalArgumentException("builder cannot be null");
            }
            try {
                AbstractC17653a.m75630b(field);
                Object obj = field.get(requestbean);
                String strValue = ((Header) field.getAnnotation(Header.class)).value();
                if (strValue.isEmpty()) {
                    strValue = field.getName();
                }
                if (!String.class.equals(field.getType())) {
                    throw new InvalidParameterException("Header should be the annotation of String type");
                }
                String str = (String) obj;
                if (!C17667h.m75652a(str)) {
                    builder.OooO00o(strValue, str);
                }
                return builder;
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX INFO: renamed from: com.huawei.agconnect.https.a$b */
    public static class b extends AbstractC17653a<HeaderMap, Request.Builder> {
        @Override // com.huawei.agconnect.https.AbstractC17653a
        /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public <RequestBean> Request.Builder mo75631a(Field field, RequestBean requestbean, Request.Builder builder) {
            if (builder == null) {
                throw new IllegalArgumentException("builder cannot be null");
            }
            try {
                AbstractC17653a.m75630b(field);
                Object obj = field.get(requestbean);
                if (!Map.class.isAssignableFrom(field.getType())) {
                    throw new InvalidParameterException("HeaderMap should be the annotation of Map type");
                }
                Map map = (Map) obj;
                if (map != null && !map.isEmpty()) {
                    for (Map.Entry entry : map.entrySet()) {
                        builder.OooO00o((String) entry.getKey(), String.valueOf(entry.getValue()));
                    }
                }
                return builder;
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX INFO: renamed from: com.huawei.agconnect.https.a$c */
    public static final class c extends AbstractC17653a<Query, HttpUrl.Builder> {
        @Override // com.huawei.agconnect.https.AbstractC17653a
        /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public <RequestBean> HttpUrl.Builder mo75631a(Field field, RequestBean requestbean, HttpUrl.Builder builder) {
            if (builder == null) {
                throw new IllegalArgumentException("builder cannot be null");
            }
            try {
                AbstractC17653a.m75630b(field);
                Object obj = field.get(requestbean);
                if (!String.class.equals(field.getType())) {
                    throw new InvalidParameterException("QueryHandler should be the annotation of String");
                }
                Query query = (Query) field.getAnnotation(Query.class);
                String strValue = query.value();
                boolean zEncoded = query.encoded();
                if (strValue == null || strValue.isEmpty()) {
                    strValue = field.getName();
                }
                if (obj == null) {
                    obj = "";
                }
                if (zEncoded) {
                    builder.OooO00o(strValue, String.valueOf(obj));
                    return builder;
                }
                builder.OooO0O0(strValue, String.valueOf(obj));
                return builder;
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX INFO: renamed from: com.huawei.agconnect.https.a$d */
    public static final class d extends AbstractC17653a<Url, HttpUrl.Builder> {
        @Override // com.huawei.agconnect.https.AbstractC17653a
        /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public <RequestBean> HttpUrl.Builder mo75631a(Field field, RequestBean requestbean, HttpUrl.Builder builder) {
            HttpUrl httpUrlOooO0OO;
            try {
                if (!field.isAnnotationPresent(Url.class)) {
                    throw new IllegalArgumentException("field is not Url annotation");
                }
                AbstractC17653a.m75630b(field);
                Object obj = field.get(requestbean);
                if (!String.class.equals(field.getType())) {
                    throw new InvalidParameterException("Url should be the annotation of String");
                }
                String str = (String) obj;
                if (str == null || str.isEmpty()) {
                    throw new IllegalArgumentException("url cannot be null or empty");
                }
                HttpUrl.f124126OooOO0O.getClass();
                try {
                    httpUrlOooO0OO = HttpUrl.Companion.OooO0OO(str);
                } catch (IllegalArgumentException unused) {
                    httpUrlOooO0OO = null;
                }
                return httpUrlOooO0OO.OooO0o();
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private static <RequestBean> HttpUrl.Builder m75629b(RequestBean requestbean) {
        ArrayList arrayList = new ArrayList(1);
        Class<?> superclass = requestbean.getClass();
        do {
            Field[] declaredFields = superclass.getDeclaredFields();
            if (declaredFields.length > 0) {
                for (Field field : declaredFields) {
                    if (field.isAnnotationPresent(Url.class)) {
                        arrayList.add(field);
                    }
                }
            }
            superclass = superclass.getSuperclass();
        } while (superclass != Object.class);
        if (arrayList.size() == 1) {
            return new d().mo75631a((Field) arrayList.get(0), (Object) requestbean, (HttpUrl.Builder) null);
        }
        throw new IllegalArgumentException("ONLY ONE String Field can be annotated as Url");
    }

    /* JADX INFO: renamed from: a */
    public abstract <RequestBean> Builder mo75631a(Field field, RequestBean requestbean, Builder builder);

    /* JADX INFO: renamed from: a */
    public static <RequestBean> Request.Builder m75627a(RequestBean requestbean) {
        HttpUrl.Builder builderM75629b = m75629b(requestbean);
        Request.Builder builder = new Request.Builder();
        Class<?> superclass = requestbean.getClass();
        do {
            Field[] declaredFields = superclass.getDeclaredFields();
            if (declaredFields.length > 0) {
                for (Field field : declaredFields) {
                    m75630b(field);
                    for (Annotation annotation : field.getDeclaredAnnotations()) {
                        Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
                        if (Query.class.equals(clsAnnotationType)) {
                            f52226a.mo75631a(field, (Object) requestbean, builderM75629b);
                        } else if (HeaderMap.class.equals(clsAnnotationType)) {
                            f52227b.mo75631a(field, (Object) requestbean, builder);
                        } else if (Header.class.equals(clsAnnotationType)) {
                            f52228c.mo75631a(field, (Object) requestbean, builder);
                        }
                    }
                }
            }
            superclass = superclass.getSuperclass();
        } while (superclass != Object.class);
        builder.f124244OooO00o = builderM75629b.OooO0OO();
        return builder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static void m75630b(final Field field) {
        if (field.isAccessible()) {
            return;
        }
        AccessController.doPrivileged(new PrivilegedAction() { // from class: com.huawei.agconnect.https.a.1
            @Override // java.security.PrivilegedAction
            public Object run() {
                field.setAccessible(true);
                return null;
            }
        });
    }
}
