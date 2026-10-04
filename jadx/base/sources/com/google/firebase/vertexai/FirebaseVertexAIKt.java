package com.google.firebase.vertexai;

import com.google.firebase.Firebase;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseKt;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\t"}, m80612d2 = {"vertexAI", "Lcom/google/firebase/vertexai/FirebaseVertexAI;", "Lcom/google/firebase/Firebase;", "getVertexAI", "(Lcom/google/firebase/Firebase;)Lcom/google/firebase/vertexai/FirebaseVertexAI;", "app", "Lcom/google/firebase/FirebaseApp;", "location", "", "com.google.firebase-firebase-vertexai"}, m80613k = 2, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class FirebaseVertexAIKt {
    public static final FirebaseVertexAI getVertexAI(Firebase firebase) {
        OooOOO0.OooO0oO(firebase, "<this>");
        return FirebaseVertexAI.INSTANCE.getInstance();
    }

    public static final FirebaseVertexAI vertexAI(Firebase firebase, FirebaseApp app, String location) {
        OooOOO0.OooO0oO(firebase, "<this>");
        OooOOO0.OooO0oO(app, "app");
        OooOOO0.OooO0oO(location, "location");
        return FirebaseVertexAI.INSTANCE.getInstance(app, location);
    }

    public static /* synthetic */ FirebaseVertexAI vertexAI$default(Firebase firebase, FirebaseApp firebaseApp, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            firebaseApp = FirebaseKt.getApp(Firebase.INSTANCE);
        }
        if ((i & 2) != 0) {
            str = "us-central1";
        }
        return vertexAI(firebase, firebaseApp, str);
    }
}
