package com.google.firebase.vertexai.common;

import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m80612d2 = {"Lcom/google/firebase/vertexai/common/SerializationException;", "Lcom/google/firebase/vertexai/common/FirebaseCommonAIException;", "message", "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class SerializationException extends FirebaseCommonAIException {
    public /* synthetic */ SerializationException(String str, Throwable th, int i, C24018OooO0oo c24018OooO0oo) {
        this(str, (i & 2) != 0 ? null : th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SerializationException(String message, Throwable th) {
        super(message, th, null);
        OooOOO0.OooO0oO(message, "message");
    }
}
