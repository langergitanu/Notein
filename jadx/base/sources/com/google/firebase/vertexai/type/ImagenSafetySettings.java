package com.google.firebase.vertexai.type;

import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, m80612d2 = {"Lcom/google/firebase/vertexai/type/ImagenSafetySettings;", "", "safetyFilterLevel", "Lcom/google/firebase/vertexai/type/ImagenSafetyFilterLevel;", "personFilterLevel", "Lcom/google/firebase/vertexai/type/ImagenPersonFilterLevel;", "(Lcom/google/firebase/vertexai/type/ImagenSafetyFilterLevel;Lcom/google/firebase/vertexai/type/ImagenPersonFilterLevel;)V", "getPersonFilterLevel$com_google_firebase_firebase_vertexai", "()Lcom/google/firebase/vertexai/type/ImagenPersonFilterLevel;", "getSafetyFilterLevel$com_google_firebase_firebase_vertexai", "()Lcom/google/firebase/vertexai/type/ImagenSafetyFilterLevel;", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class ImagenSafetySettings {
    private final ImagenPersonFilterLevel personFilterLevel;
    private final ImagenSafetyFilterLevel safetyFilterLevel;

    public ImagenSafetySettings(ImagenSafetyFilterLevel safetyFilterLevel, ImagenPersonFilterLevel personFilterLevel) {
        OooOOO0.OooO0oO(safetyFilterLevel, "safetyFilterLevel");
        OooOOO0.OooO0oO(personFilterLevel, "personFilterLevel");
        this.safetyFilterLevel = safetyFilterLevel;
        this.personFilterLevel = personFilterLevel;
    }

    /* JADX INFO: renamed from: getPersonFilterLevel$com_google_firebase_firebase_vertexai, reason: from getter */
    public final ImagenPersonFilterLevel getPersonFilterLevel() {
        return this.personFilterLevel;
    }

    /* JADX INFO: renamed from: getSafetyFilterLevel$com_google_firebase_firebase_vertexai, reason: from getter */
    public final ImagenSafetyFilterLevel getSafetyFilterLevel() {
        return this.safetyFilterLevel;
    }
}
