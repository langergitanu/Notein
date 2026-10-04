package com.huawei.agconnect.https.adapter;

import com.huawei.agconnect.https.Adapter;
import com.microsoft.identity.common.java.telemetry.TelemetryEventStrings;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedAction;
import okhttp3.FormBody;
import okhttp3.RequestBody;
import org.json.JSONException;

/* JADX INFO: renamed from: com.huawei.agconnect.https.adapter.d */
/* JADX INFO: loaded from: classes8.dex */
public class C17659d<HttpsRequest> implements Adapter<HttpsRequest, RequestBody> {
    /* JADX INFO: renamed from: a */
    private String m75636a(final Field field, HttpsRequest httpsrequest) throws IllegalAccessException, JSONException {
        if (!field.isAccessible()) {
            AccessController.doPrivileged(new PrivilegedAction() { // from class: com.huawei.agconnect.https.adapter.d.1
                @Override // java.security.PrivilegedAction
                public Object run() {
                    field.setAccessible(true);
                    return null;
                }
            });
        }
        Class<?> type = field.getType();
        Object obj = field.get(httpsrequest);
        return m75641d(type) ? obj == null ? "0" : String.valueOf(obj) : m75640c(type) ? obj == null ? "0" : String.valueOf(obj) : m75639b(type) ? obj == null ? TelemetryEventStrings.Value.FALSE : String.valueOf(obj) : m75638a((Class) type) ? obj == null ? "0" : String.valueOf(obj) : type == String.class ? obj == null ? CloudMetaExtra.DEFINE_NON_PARENT_ID : String.valueOf(obj) : new JSONEncodeUtil().toJson(field.get(httpsrequest));
    }

    /* JADX INFO: renamed from: b */
    private static boolean m75639b(Class cls) {
        return cls == Boolean.TYPE || cls == Boolean.class;
    }

    /* JADX INFO: renamed from: c */
    private static boolean m75640c(Class cls) {
        return cls == Double.TYPE || cls == Double.class || cls == Float.TYPE || cls == Float.class;
    }

    /* JADX INFO: renamed from: d */
    private static boolean m75641d(Class cls) {
        return cls == Integer.TYPE || cls == Integer.class;
    }

    /* JADX INFO: renamed from: a */
    private void m75637a(Field field, FormBody.Builder builder, HttpsRequest httpsrequest) {
        try {
            String strValue = ((com.huawei.agconnect.https.annotation.Field) field.getAnnotation(com.huawei.agconnect.https.annotation.Field.class)).value();
            if (strValue == null || strValue.isEmpty()) {
                strValue = field.getName();
            }
            builder.OooO00o(strValue, m75636a(field, httpsrequest));
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m75638a(Class cls) {
        return cls == Long.TYPE || cls == Long.class;
    }

    @Override // com.huawei.agconnect.https.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public RequestBody adapter(HttpsRequest httpsrequest) {
        FormBody.Builder builder = new FormBody.Builder();
        Class<?> superclass = httpsrequest.getClass();
        do {
            Field[] declaredFields = superclass.getDeclaredFields();
            if (declaredFields.length > 0) {
                for (Field field : declaredFields) {
                    if (field.isAnnotationPresent(com.huawei.agconnect.https.annotation.Field.class)) {
                        m75637a(field, builder, httpsrequest);
                    }
                }
            }
            superclass = superclass.getSuperclass();
        } while (superclass != Object.class);
        return new FormBody(builder.f124114OooO00o, builder.f124115OooO0O0);
    }
}
