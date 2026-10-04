package com.google.firebase.sessions;

import android.util.Log;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.TransportFactory;
import com.google.firebase.firestore.C22592OooOo0o;
import com.google.firebase.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO0o0O0o.C33580OooO00o;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0017\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010¨\u0006\u0012"}, m80612d2 = {"Lcom/google/firebase/sessions/EventGDTLogger;", "Lcom/google/firebase/sessions/EventGDTLoggerInterface;", "Lcom/google/firebase/inject/Provider;", "Lcom/google/android/datatransport/TransportFactory;", "transportFactoryProvider", "<init>", "(Lcom/google/firebase/inject/Provider;)V", "Lcom/google/firebase/sessions/SessionEvent;", "value", "", "encode", "(Lcom/google/firebase/sessions/SessionEvent;)[B", "sessionEvent", "LoO00ooO/OooOooO;", "log", "(Lcom/google/firebase/sessions/SessionEvent;)V", "Lcom/google/firebase/inject/Provider;", "Companion", "com.google.firebase-firebase-sessions"}, m80613k = 1, m80614mv = {2, 0, 0}, m80616xi = 48)
public final class EventGDTLogger implements EventGDTLoggerInterface {
    private static final String AQS_LOG_SOURCE = "FIREBASE_APPQUALITY_SESSION";
    private final Provider<TransportFactory> transportFactoryProvider;

    public EventGDTLogger(Provider<TransportFactory> transportFactoryProvider) {
        OooOOO0.OooO0oO(transportFactoryProvider, "transportFactoryProvider");
        this.transportFactoryProvider = transportFactoryProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] encode(SessionEvent value) {
        String strEncode = SessionEvents.INSTANCE.getSESSION_EVENT_ENCODER$com_google_firebase_firebase_sessions().encode(value);
        OooOOO0.OooO0o(strEncode, "encode(...)");
        Log.d(FirebaseSessions.TAG, "Session Event Type: " + value.getEventType().name());
        byte[] bytes = strEncode.getBytes(C33580OooO00o.f121231OooO0O0);
        OooOOO0.OooO0o(bytes, "getBytes(...)");
        return bytes;
    }

    @Override // com.google.firebase.sessions.EventGDTLoggerInterface
    public void log(SessionEvent sessionEvent) {
        OooOOO0.OooO0oO(sessionEvent, "sessionEvent");
        this.transportFactoryProvider.get().getTransport(AQS_LOG_SOURCE, SessionEvent.class, Encoding.m74894of("json"), new C22592OooOo0o(this)).send(Event.ofData(sessionEvent));
    }
}
