package com.huawei.hms.network.restclient;

import com.huawei.hms.network.httpclient.Submit;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes9.dex */
public abstract class SubmitAdapter<R, T> {

    public static abstract class Factory {
        public abstract SubmitAdapter<?, ?> get(Type type, Annotation[] annotationArr, RestClient restClient);
    }

    public abstract T adapt(Submit<R> submit);

    public abstract Type responseType();
}
