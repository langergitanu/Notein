package com.google.firebase.vertexai.type;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/ImagenSafetyFilterLevel;", "", "internalVal", "", "(Ljava/lang/String;)V", "getInternalVal$com_google_firebase_firebase_vertexai", "()Ljava/lang/String;", "Companion", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class ImagenSafetyFilterLevel {
    private final String internalVal;
    public static final ImagenSafetyFilterLevel BLOCK_LOW_AND_ABOVE = new ImagenSafetyFilterLevel("block_low_and_above");
    public static final ImagenSafetyFilterLevel BLOCK_MEDIUM_AND_ABOVE = new ImagenSafetyFilterLevel("block_medium_and_above");
    public static final ImagenSafetyFilterLevel BLOCK_ONLY_HIGH = new ImagenSafetyFilterLevel("block_only_high");
    public static final ImagenSafetyFilterLevel BLOCK_NONE = new ImagenSafetyFilterLevel("block_none");

    private ImagenSafetyFilterLevel(String str) {
        this.internalVal = str;
    }

    /* JADX INFO: renamed from: getInternalVal$com_google_firebase_firebase_vertexai, reason: from getter */
    public final String getInternalVal() {
        return this.internalVal;
    }
}
