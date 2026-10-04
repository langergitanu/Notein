package com.google.firebase.vertexai.type;

import com.microsoft.identity.common.java.constants.FidoConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import oOo000Oo.OooOo;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/ResponseStoppedException;", "Lcom/google/firebase/vertexai/type/FirebaseVertexAIException;", FidoConstants.WEBAUTHN_AUTHENTICATION_ASSERTION_RESPONSE_JSON_KEY, "Lcom/google/firebase/vertexai/type/GenerateContentResponse;", "cause", "", "(Lcom/google/firebase/vertexai/type/GenerateContentResponse;Ljava/lang/Throwable;)V", "getResponse", "()Lcom/google/firebase/vertexai/type/GenerateContentResponse;", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class ResponseStoppedException extends FirebaseVertexAIException {
    private final GenerateContentResponse response;

    public /* synthetic */ ResponseStoppedException(GenerateContentResponse generateContentResponse, Throwable th, int i, C24018OooO0oo c24018OooO0oo) {
        this(generateContentResponse, (i & 2) != 0 ? null : th);
    }

    public final GenerateContentResponse getResponse() {
        return this.response;
    }

    public ResponseStoppedException(GenerateContentResponse response, Throwable th) {
        OooOOO0.OooO0oO(response, "response");
        StringBuilder sb = new StringBuilder("Content generation stopped. Reason: ");
        FinishReason finishReason = ((Candidate) OooOo.Oooo0oO(response.getCandidates())).getFinishReason();
        sb.append(finishReason != null ? finishReason.getName() : null);
        super(sb.toString(), th);
        this.response = response;
    }
}
