package com.huawei.agconnect.https.adapter;

import com.huawei.agconnect.https.Adapter;
import java.io.IOException;
import okhttp3.ResponseBody;
import org.json.JSONException;

/* JADX INFO: renamed from: com.huawei.agconnect.https.adapter.c */
/* JADX INFO: loaded from: classes8.dex */
public class C17658c<T> implements Adapter<ResponseBody, T> {

    /* JADX INFO: renamed from: a */
    private final Class<T> f52237a;

    public C17658c(Class<T> cls) {
        this.f52237a = cls;
    }

    @Override // com.huawei.agconnect.https.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public T adapter(ResponseBody responseBody) throws IOException {
        if (responseBody == null) {
            throw new IOException("responseBody is null");
        }
        try {
            return (T) JSONDecodeUtil.getObject(responseBody.string(), this.f52237a);
        } catch (IllegalAccessException e) {
            throw new IOException("IllegalAccessException:", e);
        } catch (InstantiationException e2) {
            throw new IOException("InstantiationException", e2);
        } catch (JSONException unused) {
            throw new IOException("the response is not json");
        }
    }
}
