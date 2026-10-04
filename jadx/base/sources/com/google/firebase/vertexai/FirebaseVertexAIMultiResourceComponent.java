package com.google.firebase.vertexai;

import com.google.firebase.FirebaseApp;
import com.google.firebase.appcheck.interop.InteropAppCheckTokenProvider;
import com.google.firebase.auth.internal.InternalAuthProvider;
import com.google.firebase.inject.Provider;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\u0010\tJ\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m80612d2 = {"Lcom/google/firebase/vertexai/FirebaseVertexAIMultiResourceComponent;", "", "app", "Lcom/google/firebase/FirebaseApp;", "appCheckProvider", "Lcom/google/firebase/inject/Provider;", "Lcom/google/firebase/appcheck/interop/InteropAppCheckTokenProvider;", "internalAuthProvider", "Lcom/google/firebase/auth/internal/InternalAuthProvider;", "(Lcom/google/firebase/FirebaseApp;Lcom/google/firebase/inject/Provider;Lcom/google/firebase/inject/Provider;)V", "instances", "", "", "Lcom/google/firebase/vertexai/FirebaseVertexAI;", "get", "location", "com.google.firebase-firebase-vertexai"}, m80613k = 1, m80614mv = {1, 8, 0}, m80616xi = 48)
public final class FirebaseVertexAIMultiResourceComponent {
    private final FirebaseApp app;
    private final Provider<InteropAppCheckTokenProvider> appCheckProvider;
    private final Map<String, FirebaseVertexAI> instances;
    private final Provider<InternalAuthProvider> internalAuthProvider;

    public FirebaseVertexAIMultiResourceComponent(FirebaseApp app, Provider<InteropAppCheckTokenProvider> appCheckProvider, Provider<InternalAuthProvider> internalAuthProvider) {
        OooOOO0.OooO0oO(app, "app");
        OooOOO0.OooO0oO(appCheckProvider, "appCheckProvider");
        OooOOO0.OooO0oO(internalAuthProvider, "internalAuthProvider");
        this.app = app;
        this.appCheckProvider = appCheckProvider;
        this.internalAuthProvider = internalAuthProvider;
        this.instances = new LinkedHashMap();
    }

    public final FirebaseVertexAI get(String location) {
        FirebaseVertexAI firebaseVertexAI;
        OooOOO0.OooO0oO(location, "location");
        synchronized (this) {
            firebaseVertexAI = this.instances.get(location);
            if (firebaseVertexAI == null) {
                firebaseVertexAI = new FirebaseVertexAI(this.app, location, this.appCheckProvider, this.internalAuthProvider);
                this.instances.put(location, firebaseVertexAI);
            }
        }
        return firebaseVertexAI;
    }
}
