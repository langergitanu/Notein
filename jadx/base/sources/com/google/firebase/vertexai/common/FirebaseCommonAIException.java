package com.google.firebase.vertexai.common;

import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import oO00OO.C32230OooO0oO;
import oO0o0OO.o0000;
import oO0o0ooO.C33917OooOO0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \b2\u00060\u0001j\u0002`\u0002:\u0001\bB\u001b\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007\u0082\u0001\f\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, m80612d2 = {"Lcom/google/firebase/vertexai/common/FirebaseCommonAIException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "message", "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "Companion", "Lcom/google/firebase/vertexai/common/ContentBlockedException;", "Lcom/google/firebase/vertexai/common/InvalidAPIKeyException;", "Lcom/google/firebase/vertexai/common/InvalidStateException;", "Lcom/google/firebase/vertexai/common/PromptBlockedException;", "Lcom/google/firebase/vertexai/common/QuotaExceededException;", "Lcom/google/firebase/vertexai/common/RequestTimeoutException;", "Lcom/google/firebase/vertexai/common/ResponseStoppedException;", "Lcom/google/firebase/vertexai/common/SerializationException;", "Lcom/google/firebase/vertexai/common/ServerException;", "Lcom/google/firebase/vertexai/common/ServiceDisabledException;", "Lcom/google/firebase/vertexai/common/UnknownException;", "Lcom/google/firebase/vertexai/common/UnsupportedUserLocationException;", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public abstract class FirebaseCommonAIException extends RuntimeException {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m80612d2 = {"Lcom/google/firebase/vertexai/common/FirebaseCommonAIException$Companion;", "", "()V", Constants.MessagePayloadKeys.FROM, "Lcom/google/firebase/vertexai/common/FirebaseCommonAIException;", "cause", "", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final FirebaseCommonAIException from(Throwable cause) {
            OooOOO0.OooO0oO(cause, "cause");
            if (cause instanceof FirebaseCommonAIException) {
                return (FirebaseCommonAIException) cause;
            }
            if (cause instanceof C32230OooO0oO ? true : cause instanceof C33917OooOO0) {
                return new SerializationException("Something went wrong while trying to deserialize a response from the server.", cause);
            }
            if (cause instanceof o0000) {
                return new RequestTimeoutException("The request failed to complete in the allotted time.", null, 2, 0 == true ? 1 : 0);
            }
            return new UnknownException("Something unexpected happened.", cause);
        }

        private Companion() {
        }
    }

    public /* synthetic */ FirebaseCommonAIException(String str, Throwable th, C24018OooO0oo c24018OooO0oo) {
        this(str, th);
    }

    public /* synthetic */ FirebaseCommonAIException(String str, Throwable th, int i, C24018OooO0oo c24018OooO0oo) {
        this(str, (i & 2) != 0 ? null : th, null);
    }

    private FirebaseCommonAIException(String str, Throwable th) {
        super(str, th);
    }
}
