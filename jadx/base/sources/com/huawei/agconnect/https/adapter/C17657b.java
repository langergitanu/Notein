package com.huawei.agconnect.https.adapter;

import com.huawei.agconnect.https.Adapter;
import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.json.JSONException;

/* JADX INFO: renamed from: com.huawei.agconnect.https.adapter.b */
/* JADX INFO: loaded from: classes8.dex */
public class C17657b<Request> implements Adapter<Request, RequestBody> {

    /* JADX INFO: renamed from: a */
    private static final MediaType f52236a;

    static {
        MediaType.f124148OooO0o0.getClass();
        f52236a = MediaType.Companion.OooO0O0("application/json; charset=UTF-8");
    }

    @Override // com.huawei.agconnect.https.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public RequestBody adapter(Request request) throws IOException {
        try {
            return RequestBody.create(f52236a, new JSONEncodeUtil().toJson(request));
        } catch (JSONException e) {
            throw new IOException(e);
        }
    }
}
