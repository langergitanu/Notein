package com.huawei.cloud.base.services.json;

import com.google.firebase.messaging.Constants;
import com.huawei.cloud.base.batch.BatchRequest;
import com.huawei.cloud.base.batch.json.JsonBatchCallback;
import com.huawei.cloud.base.http.HttpHeaders;
import com.huawei.cloud.base.http.json.JsonHttpContent;
import com.huawei.cloud.base.json.JsonErrorContainer;
import com.huawei.cloud.base.services.AbstractClientRequest;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractJsonClientRequest<T> extends AbstractClientRequest<T> {
    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractJsonClientRequest(AbstractJsonClient abstractJsonClient, String str, String str2, Object obj, Class<T> cls) {
        JsonHttpContent wrapperKey = null;
        if (obj != null) {
            wrapperKey = new JsonHttpContent(abstractJsonClient.getJsonFactory(), obj).setWrapperKey(abstractJsonClient.getObjectParser().getWrapperKeys().isEmpty() ? null : Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        }
        super(abstractJsonClient, str, str2, wrapperKey, cls);
    }

    public final void queue(BatchRequest batchRequest, JsonBatchCallback<T> jsonBatchCallback) throws IOException {
        queue(batchRequest, JsonErrorContainer.class, jsonBatchCallback);
    }

    @Override // com.huawei.cloud.base.services.AbstractClientRequest
    public AbstractJsonClient getAbstractClient() {
        return (AbstractJsonClient) super.getAbstractClient();
    }

    @Override // com.huawei.cloud.base.services.AbstractClientRequest
    public AbstractJsonClientRequest<T> setDisableGZip(boolean z) {
        return (AbstractJsonClientRequest) super.setDisableGZip(z);
    }

    @Override // com.huawei.cloud.base.services.AbstractClientRequest
    public AbstractJsonClientRequest<T> setHeaders(HttpHeaders httpHeaders) {
        return (AbstractJsonClientRequest) super.setHeaders(httpHeaders);
    }

    @Override // com.huawei.cloud.base.services.AbstractClientRequest, com.huawei.cloud.base.util.GenericData
    public AbstractJsonClientRequest<T> set(String str, Object obj) {
        return (AbstractJsonClientRequest) super.set(str, obj);
    }
}
