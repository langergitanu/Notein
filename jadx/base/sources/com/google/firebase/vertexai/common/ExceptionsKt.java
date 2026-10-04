package com.google.firebase.vertexai.common;

import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO0o0O0o.C33591OooOOO;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¨\u0006\u0006"}, m80612d2 = {"makeMissingCaseException", "Lcom/google/firebase/vertexai/type/SerializationException;", "source", "", "ordinal", "", "com.google.firebase-firebase-vertexai"}, m80613k = 2, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class ExceptionsKt {
    public static final com.google.firebase.vertexai.type.SerializationException makeMissingCaseException(String source, int i) {
        OooOOO0.OooO0oO(source, "source");
        return new com.google.firebase.vertexai.type.SerializationException(C33591OooOOO.OooO("\n    |Missing case for a " + source + ": " + i + "\n    |This error indicates that one of the `toInternal` conversions needs updating.\n    |If you're a developer seeing this exception, please file an issue on our GitHub repo:\n    |https://github.com/firebase/firebase-android-sdk\n  "), null, 2, null);
    }
}
