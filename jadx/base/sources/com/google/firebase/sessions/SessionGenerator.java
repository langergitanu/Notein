package com.google.firebase.sessions;

import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oO0o0O0o.C33595OooOOo;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\tJ\b\u0010\u000b\u001a\u00020\fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m80612d2 = {"Lcom/google/firebase/sessions/SessionGenerator;", "", "timeProvider", "Lcom/google/firebase/sessions/TimeProvider;", "uuidGenerator", "Lcom/google/firebase/sessions/UuidGenerator;", "<init>", "(Lcom/google/firebase/sessions/TimeProvider;Lcom/google/firebase/sessions/UuidGenerator;)V", "generateNewSession", "Lcom/google/firebase/sessions/SessionDetails;", "currentSession", "generateSessionId", "", "com.google.firebase-firebase-sessions"}, m80613k = 1, m80614mv = {2, 0, 0}, m80616xi = 48)
public final class SessionGenerator {
    private final TimeProvider timeProvider;
    private final UuidGenerator uuidGenerator;

    public SessionGenerator(TimeProvider timeProvider, UuidGenerator uuidGenerator) {
        OooOOO0.OooO0oO(timeProvider, "timeProvider");
        OooOOO0.OooO0oO(uuidGenerator, "uuidGenerator");
        this.timeProvider = timeProvider;
        this.uuidGenerator = uuidGenerator;
    }

    private final String generateSessionId() {
        String string = this.uuidGenerator.next().toString();
        OooOOO0.OooO0o(string, "toString(...)");
        String lowerCase = C33595OooOOo.OooOo0O(string, CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR, "").toLowerCase(Locale.ROOT);
        OooOOO0.OooO0o(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public final SessionDetails generateNewSession(SessionDetails currentSession) {
        String firstSessionId;
        String strGenerateSessionId = generateSessionId();
        if (currentSession == null || (firstSessionId = currentSession.getFirstSessionId()) == null) {
            firstSessionId = strGenerateSessionId;
        }
        return new SessionDetails(strGenerateSessionId, firstSessionId, currentSession != null ? currentSession.getSessionIndex() + 1 : 0, this.timeProvider.currentTime().getUs());
    }
}
