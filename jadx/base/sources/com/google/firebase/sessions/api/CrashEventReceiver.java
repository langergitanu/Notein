package com.google.firebase.sessions.api;

import com.google.firebase.sessions.SharedSessionRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003R(\u0010\u0007\u001a\u00020\u00068\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0004\b\u0007\u0010\b\u0012\u0004\b\r\u0010\u0003\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m80612d2 = {"Lcom/google/firebase/sessions/api/CrashEventReceiver;", "", "<init>", "()V", "LoO00ooO/OooOooO;", "notifyCrashOccurred", "Lcom/google/firebase/sessions/SharedSessionRepository;", "sharedSessionRepository", "Lcom/google/firebase/sessions/SharedSessionRepository;", "getSharedSessionRepository$com_google_firebase_firebase_sessions", "()Lcom/google/firebase/sessions/SharedSessionRepository;", "setSharedSessionRepository$com_google_firebase_firebase_sessions", "(Lcom/google/firebase/sessions/SharedSessionRepository;)V", "getSharedSessionRepository$com_google_firebase_firebase_sessions$annotations", "com.google.firebase-firebase-sessions"}, m80613k = 1, m80614mv = {2, 0, 0}, m80616xi = 48)
public final class CrashEventReceiver {
    public static final CrashEventReceiver INSTANCE = new CrashEventReceiver();
    public static SharedSessionRepository sharedSessionRepository;

    private CrashEventReceiver() {
    }

    /* JADX INFO: renamed from: getSharedSessionRepository$com_google_firebase_firebase_sessions$annotations */
    public static /* synthetic */ void m75293x9ea6c4a6() {
    }

    public static final void notifyCrashOccurred() {
        try {
            if (sharedSessionRepository == null) {
                INSTANCE.setSharedSessionRepository$com_google_firebase_firebase_sessions(SharedSessionRepository.INSTANCE.getInstance());
            }
            CrashEventReceiver crashEventReceiver = INSTANCE;
            if (crashEventReceiver.getSharedSessionRepository$com_google_firebase_firebase_sessions().isInForeground()) {
                crashEventReceiver.getSharedSessionRepository$com_google_firebase_firebase_sessions().appBackground();
            }
        } catch (Exception unused) {
        }
    }

    public final SharedSessionRepository getSharedSessionRepository$com_google_firebase_firebase_sessions() {
        SharedSessionRepository sharedSessionRepository2 = sharedSessionRepository;
        if (sharedSessionRepository2 != null) {
            return sharedSessionRepository2;
        }
        OooOOO0.OooOOOO("sharedSessionRepository");
        throw null;
    }

    public final void setSharedSessionRepository$com_google_firebase_firebase_sessions(SharedSessionRepository sharedSessionRepository2) {
        OooOOO0.OooO0oO(sharedSessionRepository2, "<set-?>");
        sharedSessionRepository = sharedSessionRepository2;
    }
}
