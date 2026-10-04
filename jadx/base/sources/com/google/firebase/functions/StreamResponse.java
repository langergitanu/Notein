package com.google.firebase.functions;

import com.microsoft.identity.common.adal.internal.AuthenticationConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m80612d2 = {"Lcom/google/firebase/functions/StreamResponse;", "", "<init>", "()V", AuthenticationConstants.BUNDLE_MESSAGE, "Result", "com.google.firebase-firebase-functions"}, m80613k = 1, m80614mv = {2, 0, 0}, m80616xi = 48)
public abstract class StreamResponse {

    @Metadata(m80611d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/google/firebase/functions/StreamResponse$Message;", "Lcom/google/firebase/functions/StreamResponse;", "message", "Lcom/google/firebase/functions/HttpsCallableResult;", "<init>", "(Lcom/google/firebase/functions/HttpsCallableResult;)V", "getMessage", "()Lcom/google/firebase/functions/HttpsCallableResult;", "com.google.firebase-firebase-functions"}, m80613k = 1, m80614mv = {2, 0, 0}, m80616xi = 48)
    public static final class Message extends StreamResponse {
        private final HttpsCallableResult message;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Message(HttpsCallableResult message) {
            super(null);
            OooOOO0.OooO0oO(message, "message");
            this.message = message;
        }

        public final HttpsCallableResult getMessage() {
            return this.message;
        }
    }

    @Metadata(m80611d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m80612d2 = {"Lcom/google/firebase/functions/StreamResponse$Result;", "Lcom/google/firebase/functions/StreamResponse;", "result", "Lcom/google/firebase/functions/HttpsCallableResult;", "<init>", "(Lcom/google/firebase/functions/HttpsCallableResult;)V", "getResult", "()Lcom/google/firebase/functions/HttpsCallableResult;", "com.google.firebase-firebase-functions"}, m80613k = 1, m80614mv = {2, 0, 0}, m80616xi = 48)
    public static final class Result extends StreamResponse {
        private final HttpsCallableResult result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Result(HttpsCallableResult result) {
            super(null);
            OooOOO0.OooO0oO(result, "result");
            this.result = result;
        }

        public final HttpsCallableResult getResult() {
            return this.result;
        }
    }

    public /* synthetic */ StreamResponse(C24018OooO0oo c24018OooO0oo) {
        this();
    }

    private StreamResponse() {
    }
}
