package com.google.firebase.sessions.api;

import OooO.OooO00o;
import Oooo0oO.C21111o0ooOoO;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;
import oOo000oo.InterfaceC34452OooO00o;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0002\u000e\u000fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m80612d2 = {"Lcom/google/firebase/sessions/api/SessionSubscriber;", "", "Lcom/google/firebase/sessions/api/SessionSubscriber$SessionDetails;", "sessionDetails", "LoO00ooO/OooOooO;", "onSessionChanged", "(Lcom/google/firebase/sessions/api/SessionSubscriber$SessionDetails;)V", "", "isDataCollectionEnabled", "()Z", "Lcom/google/firebase/sessions/api/SessionSubscriber$Name;", "getSessionSubscriberName", "()Lcom/google/firebase/sessions/api/SessionSubscriber$Name;", "sessionSubscriberName", "Name", "SessionDetails", "com.google.firebase-firebase-sessions"}, m80613k = 1, m80614mv = {2, 0, 0}, m80616xi = 48)
public interface SessionSubscriber {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m80612d2 = {"Lcom/google/firebase/sessions/api/SessionSubscriber$Name;", "", "<init>", "(Ljava/lang/String;I)V", "CRASHLYTICS", "PERFORMANCE", "MATT_SAYS_HI", "com.google.firebase-firebase-sessions"}, m80613k = 1, m80614mv = {2, 0, 0}, m80616xi = 48)
    public static final class Name {
        private static final /* synthetic */ InterfaceC34452OooO00o $ENTRIES;
        private static final /* synthetic */ Name[] $VALUES;
        public static final Name CRASHLYTICS = new Name("CRASHLYTICS", 0);
        public static final Name PERFORMANCE = new Name("PERFORMANCE", 1);
        public static final Name MATT_SAYS_HI = new Name("MATT_SAYS_HI", 2);

        private static final /* synthetic */ Name[] $values() {
            return new Name[]{CRASHLYTICS, PERFORMANCE, MATT_SAYS_HI};
        }

        static {
            Name[] nameArr$values = $values();
            $VALUES = nameArr$values;
            $ENTRIES = OooO00o.OooO0O0(nameArr$values);
        }

        private Name(String str, int i) {
        }

        public static InterfaceC34452OooO00o<Name> getEntries() {
            return $ENTRIES;
        }

        public static Name valueOf(String str) {
            return (Name) Enum.valueOf(Name.class, str);
        }

        public static Name[] values() {
            return (Name[]) $VALUES.clone();
        }
    }

    @Metadata(m80611d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, m80612d2 = {"Lcom/google/firebase/sessions/api/SessionSubscriber$SessionDetails;", "", "sessionId", "", "<init>", "(Ljava/lang/String;)V", "getSessionId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "com.google.firebase-firebase-sessions"}, m80613k = 1, m80614mv = {2, 0, 0}, m80616xi = 48)
    public static final /* data */ class SessionDetails {
        private final String sessionId;

        public SessionDetails(String sessionId) {
            OooOOO0.OooO0oO(sessionId, "sessionId");
            this.sessionId = sessionId;
        }

        public static /* synthetic */ SessionDetails copy$default(SessionDetails sessionDetails, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sessionDetails.sessionId;
            }
            return sessionDetails.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getSessionId() {
            return this.sessionId;
        }

        public final SessionDetails copy(String sessionId) {
            OooOOO0.OooO0oO(sessionId, "sessionId");
            return new SessionDetails(sessionId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SessionDetails) && OooOOO0.OooO0O0(this.sessionId, ((SessionDetails) other).sessionId);
        }

        public final String getSessionId() {
            return this.sessionId;
        }

        public int hashCode() {
            return this.sessionId.hashCode();
        }

        public String toString() {
            return C21111o0ooOoO.OooO0OO(this.sessionId, ')', new StringBuilder("SessionDetails(sessionId="));
        }
    }

    Name getSessionSubscriberName();

    boolean isDataCollectionEnabled();

    void onSessionChanged(SessionDetails sessionDetails);
}
