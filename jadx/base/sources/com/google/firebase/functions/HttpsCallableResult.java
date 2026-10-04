package com.google.firebase.functions;

import com.google.firebase.messaging.Constants;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0013\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m80612d2 = {"Lcom/google/firebase/functions/HttpsCallableResult;", "", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "<init>", "(Ljava/lang/Object;)V", "getData", "com.google.firebase-firebase-functions"}, m80613k = 1, m80614mv = {2, 0, 0}, m80616xi = 48)
public final class HttpsCallableResult {
    public final Object data;

    public HttpsCallableResult(Object obj) {
        this.data = obj;
    }

    public final Object getData() {
        return this.data;
    }
}
