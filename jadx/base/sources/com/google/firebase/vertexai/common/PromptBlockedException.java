package com.google.firebase.vertexai.common;

import com.google.firebase.vertexai.type.BlockReason;
import com.google.firebase.vertexai.type.GenerateContentResponse;
import com.google.firebase.vertexai.type.PromptFeedback;
import com.microsoft.identity.common.java.constants.FidoConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006B)\b\u0000\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m80612d2 = {"Lcom/google/firebase/vertexai/common/PromptBlockedException;", "Lcom/google/firebase/vertexai/common/FirebaseCommonAIException;", "message", "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", FidoConstants.WEBAUTHN_AUTHENTICATION_ASSERTION_RESPONSE_JSON_KEY, "Lcom/google/firebase/vertexai/type/GenerateContentResponse$Internal;", "(Lcom/google/firebase/vertexai/type/GenerateContentResponse$Internal;Ljava/lang/Throwable;Ljava/lang/String;)V", "getResponse", "()Lcom/google/firebase/vertexai/type/GenerateContentResponse$Internal;", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class PromptBlockedException extends FirebaseCommonAIException {
    private final GenerateContentResponse.Internal response;

    public /* synthetic */ PromptBlockedException(GenerateContentResponse.Internal internal, Throwable th, String str, int i, C24018OooO0oo c24018OooO0oo) {
        this(internal, (i & 2) != 0 ? null : th, (i & 4) != 0 ? null : str);
    }

    public final GenerateContentResponse.Internal getResponse() {
        return this.response;
    }

    public PromptBlockedException(GenerateContentResponse.Internal internal, Throwable th, String str) {
        PromptFeedback.Internal promptFeedback;
        BlockReason.Internal blockReason;
        String strName;
        StringBuilder sb = new StringBuilder("Prompt was blocked: ");
        if (internal != null && (promptFeedback = internal.getPromptFeedback()) != null && (blockReason = promptFeedback.getBlockReason()) != null && (strName = blockReason.name()) != null) {
            str = strName;
        }
        sb.append(str);
        super(sb.toString(), th, null);
        this.response = internal;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PromptBlockedException(String message, Throwable th) {
        this(null, th, message);
        OooOOO0.OooO0oO(message, "message");
    }

    public /* synthetic */ PromptBlockedException(String str, Throwable th, int i, C24018OooO0oo c24018OooO0oo) {
        this(str, (i & 2) != 0 ? null : th);
    }
}
