package com.google.firebase.vertexai.type;

import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0013\b\u0000\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/UnsupportedUserLocationException;", "Lcom/google/firebase/vertexai/type/FirebaseVertexAIException;", "cause", "", "(Ljava/lang/Throwable;)V", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class UnsupportedUserLocationException extends FirebaseVertexAIException {
    /* JADX WARN: Multi-variable type inference failed */
    public UnsupportedUserLocationException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ UnsupportedUserLocationException(Throwable th, int i, C24018OooO0oo c24018OooO0oo) {
        this((i & 1) != 0 ? null : th);
    }

    public UnsupportedUserLocationException(Throwable th) {
        super("User location is not supported for the API use.", th);
    }
}
