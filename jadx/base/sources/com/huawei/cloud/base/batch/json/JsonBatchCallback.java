package com.huawei.cloud.base.batch.json;

import com.huawei.cloud.base.batch.BatchCallback;
import com.huawei.cloud.base.http.HttpHeaders;
import com.huawei.cloud.base.json.JsonError;
import com.huawei.cloud.base.json.JsonErrorContainer;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public abstract class JsonBatchCallback<T> implements BatchCallback<T, JsonErrorContainer> {
    public abstract void onFailure(JsonError jsonError, HttpHeaders httpHeaders) throws IOException;

    @Override // com.huawei.cloud.base.batch.BatchCallback
    public final void onFailure(JsonErrorContainer jsonErrorContainer, HttpHeaders httpHeaders) throws IOException {
        onFailure(jsonErrorContainer.getError(), httpHeaders);
    }
}
