package com.huawei.agconnect.https.adapter;

import com.huawei.agconnect.https.Adapter;
import com.huawei.agconnect.https.annotation.Body;
import java.io.IOException;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedAction;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.json.JSONException;

/* JADX INFO: renamed from: com.huawei.agconnect.https.adapter.a */
/* JADX INFO: loaded from: classes8.dex */
public class C17656a<Request> implements Adapter<Request, RequestBody> {

    /* JADX INFO: renamed from: a */
    private static final MediaType f52233a;

    static {
        MediaType.f124148OooO0o0.getClass();
        f52233a = MediaType.Companion.OooO0O0("application/json; charset=UTF-8");
    }

    /* JADX INFO: renamed from: a */
    private String m75632a(final Field field, Request request) throws IllegalAccessException, JSONException {
        if (!field.isAccessible()) {
            AccessController.doPrivileged(new PrivilegedAction() { // from class: com.huawei.agconnect.https.adapter.a.1
                @Override // java.security.PrivilegedAction
                public Object run() {
                    field.setAccessible(true);
                    return null;
                }
            });
        }
        Object obj = field.get(request);
        if (obj == null) {
            return null;
        }
        return new JSONEncodeUtil(false).toJson(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002c A[Catch: JSONException -> 0x0022, IllegalAccessException -> 0x0024, PHI: r1 r3
      0x002c: PHI (r1v4 java.lang.String) = (r1v3 java.lang.String), (r1v8 java.lang.String) binds: [B:4:0x000c, B:15:0x0029] A[DONT_GENERATE, DONT_INLINE]
      0x002c: PHI (r3v2 boolean) = (r3v1 boolean), (r3v3 boolean) binds: [B:4:0x000c, B:15:0x0029] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #2 {IllegalAccessException -> 0x0024, JSONException -> 0x0022, blocks: (B:2:0x0000, B:3:0x0007, B:5:0x000e, B:7:0x0012, B:9:0x001c, B:14:0x0026, B:17:0x002c), top: B:28:0x0000 }] */
    @Override // com.huawei.agconnect.https.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RequestBody adapter(Request request) throws IOException {
        try {
            Class<?> superclass = request.getClass();
            String strM75632a = null;
            boolean z = false;
            do {
                Field[] declaredFields = superclass.getDeclaredFields();
                if (declaredFields.length > 0) {
                    int length = declaredFields.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        Field field = declaredFields[i];
                        if (field.isAnnotationPresent(Body.class)) {
                            strM75632a = m75632a(field, request);
                            z = true;
                            break;
                        }
                        i++;
                    }
                    if (z) {
                        break;
                    }
                    superclass = superclass.getSuperclass();
                }
            } while (superclass != Object.class);
            MediaType mediaType = f52233a;
            if (strM75632a == null) {
                strM75632a = "{}";
            }
            return RequestBody.create(mediaType, strM75632a);
        } catch (IllegalAccessException e) {
            throw new IOException("catch IllegalAccessException:" + e.getMessage());
        } catch (JSONException e2) {
            throw new IOException("catch JSONException:" + e2.getMessage());
        }
    }
}
