package com.google.firebase.vertexai.type;

import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0001\u0007B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/StringFormat;", "", "value", "", "(Ljava/lang/String;)V", "getValue$com_google_firebase_firebase_vertexai", "()Ljava/lang/String;", "Custom", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public abstract class StringFormat {
    private final String value;

    @Metadata(m80611d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/StringFormat$Custom;", "Lcom/google/firebase/vertexai/type/StringFormat;", "value", "", "(Ljava/lang/String;)V", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
    public static final class Custom extends StringFormat {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Custom(String value) {
            super(value, null);
            OooOOO0.OooO0oO(value, "value");
        }
    }

    public /* synthetic */ StringFormat(String str, C24018OooO0oo c24018OooO0oo) {
        this(str);
    }

    /* JADX INFO: renamed from: getValue$com_google_firebase_firebase_vertexai, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    private StringFormat(String str) {
        this.value = str;
    }
}
