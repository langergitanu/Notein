package com.huawei.cloud.base.batch;

import com.huawei.cloud.base.http.HttpHeaders;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public interface BatchCallback<T, E> {
    void onFailure(E e, HttpHeaders httpHeaders) throws IOException;

    void onSuccess(T t, HttpHeaders httpHeaders) throws IOException;
}
