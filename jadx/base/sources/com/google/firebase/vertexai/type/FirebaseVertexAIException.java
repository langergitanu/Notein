package com.google.firebase.vertexai.type;

import com.google.firebase.messaging.Constants;
import com.google.firebase.vertexai.common.FirebaseCommonAIException;
import com.google.firebase.vertexai.type.GenerateContentResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import oO0o0OO.o0000;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\b&\u0018\u0000 \b2\u00060\u0001j\u0002`\u0002:\u0001\bB\u001b\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007¨\u0006\t"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/FirebaseVertexAIException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "message", "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "Companion", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public abstract class FirebaseVertexAIException extends RuntimeException {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m80611d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0007¨\u0006\b"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/FirebaseVertexAIException$Companion;", "", "()V", Constants.MessagePayloadKeys.FROM, "Lcom/google/firebase/vertexai/type/FirebaseVertexAIException;", "cause", "", "from$com_google_firebase_firebase_vertexai", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(C24018OooO0oo c24018OooO0oo) {
            this();
        }

        public final FirebaseVertexAIException from$com_google_firebase_firebase_vertexai(Throwable cause) {
            OooOOO0.OooO0oO(cause, "cause");
            if (cause instanceof FirebaseVertexAIException) {
                return (FirebaseVertexAIException) cause;
            }
            if (!(cause instanceof FirebaseCommonAIException)) {
                return cause instanceof o0000 ? new RequestTimeoutException("The request failed to complete in the allotted time.", null, 2, null) : new UnknownException("Something unexpected happened.", cause);
            }
            FirebaseCommonAIException firebaseCommonAIException = (FirebaseCommonAIException) cause;
            if (firebaseCommonAIException instanceof com.google.firebase.vertexai.common.SerializationException) {
                String message = cause.getMessage();
                return new SerializationException(message != null ? message : "", cause.getCause());
            }
            if (firebaseCommonAIException instanceof com.google.firebase.vertexai.common.ServerException) {
                String message2 = cause.getMessage();
                return new ServerException(message2 != null ? message2 : "", cause.getCause());
            }
            if (firebaseCommonAIException instanceof com.google.firebase.vertexai.common.InvalidAPIKeyException) {
                String message3 = cause.getMessage();
                return new InvalidAPIKeyException(message3 != null ? message3 : "", null, 2, null);
            }
            if (firebaseCommonAIException instanceof com.google.firebase.vertexai.common.PromptBlockedException) {
                GenerateContentResponse.Internal response = ((com.google.firebase.vertexai.common.PromptBlockedException) cause).getResponse();
                return new PromptBlockedException(response != null ? response.toPublic$com_google_firebase_firebase_vertexai() : null, cause.getCause(), null, 4, null);
            }
            if (firebaseCommonAIException instanceof com.google.firebase.vertexai.common.UnsupportedUserLocationException) {
                return new UnsupportedUserLocationException(cause.getCause());
            }
            if (firebaseCommonAIException instanceof com.google.firebase.vertexai.common.InvalidStateException) {
                String message4 = cause.getMessage();
                return new InvalidStateException(message4 != null ? message4 : "", cause);
            }
            if (firebaseCommonAIException instanceof com.google.firebase.vertexai.common.ResponseStoppedException) {
                return new ResponseStoppedException(((com.google.firebase.vertexai.common.ResponseStoppedException) cause).getResponse().toPublic$com_google_firebase_firebase_vertexai(), cause.getCause());
            }
            if (firebaseCommonAIException instanceof com.google.firebase.vertexai.common.RequestTimeoutException) {
                String message5 = cause.getMessage();
                return new RequestTimeoutException(message5 != null ? message5 : "", cause.getCause());
            }
            if (firebaseCommonAIException instanceof com.google.firebase.vertexai.common.ServiceDisabledException) {
                String message6 = cause.getMessage();
                return new ServiceDisabledException(message6 != null ? message6 : "", cause.getCause());
            }
            if (firebaseCommonAIException instanceof com.google.firebase.vertexai.common.UnknownException) {
                String message7 = cause.getMessage();
                return new UnknownException(message7 != null ? message7 : "", cause.getCause());
            }
            if (firebaseCommonAIException instanceof com.google.firebase.vertexai.common.ContentBlockedException) {
                String message8 = cause.getMessage();
                return new ContentBlockedException(message8 != null ? message8 : "", cause.getCause());
            }
            String message9 = cause.getMessage();
            return new UnknownException(message9 != null ? message9 : "", cause);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseVertexAIException(String message, Throwable th) {
        super(message, th);
        OooOOO0.OooO0oO(message, "message");
    }

    public /* synthetic */ FirebaseVertexAIException(String str, Throwable th, int i, C24018OooO0oo c24018OooO0oo) {
        this(str, (i & 2) != 0 ? null : th);
    }
}
