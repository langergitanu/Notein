package com.google.firebase.vertexai.type;

import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/ImagenGCSImage;", "", "gcsUri", "", "mimeType", "(Ljava/lang/String;Ljava/lang/String;)V", "getGcsUri", "()Ljava/lang/String;", "getMimeType", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class ImagenGCSImage {
    private final String gcsUri;
    private final String mimeType;

    public ImagenGCSImage(String gcsUri, String mimeType) {
        OooOOO0.OooO0oO(gcsUri, "gcsUri");
        OooOOO0.OooO0oO(mimeType, "mimeType");
        this.gcsUri = gcsUri;
        this.mimeType = mimeType;
    }

    public final String getGcsUri() {
        return this.gcsUri;
    }

    public final String getMimeType() {
        return this.mimeType;
    }
}
