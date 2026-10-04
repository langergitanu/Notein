package com.google.firebase.sessions;

import OooOoo0.C20703o000000o;
import OooOooo.C20785Oooo00o;
import Oooo0oO.C21111o0ooOoO;
import kotlin.Metadata;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m80611d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003JO\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0006HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006'"}, m80612d2 = {"Lcom/google/firebase/sessions/SessionInfo;", "", "sessionId", "", "firstSessionId", "sessionIndex", "", "eventTimestampUs", "", "dataCollectionStatus", "Lcom/google/firebase/sessions/DataCollectionStatus;", "firebaseInstallationId", "firebaseAuthenticationToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;IJLcom/google/firebase/sessions/DataCollectionStatus;Ljava/lang/String;Ljava/lang/String;)V", "getSessionId", "()Ljava/lang/String;", "getFirstSessionId", "getSessionIndex", "()I", "getEventTimestampUs", "()J", "getDataCollectionStatus", "()Lcom/google/firebase/sessions/DataCollectionStatus;", "getFirebaseInstallationId", "getFirebaseAuthenticationToken", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "com.google.firebase-firebase-sessions"}, m80613k = 1, m80614mv = {2, 0, 0}, m80616xi = 48)
public final /* data */ class SessionInfo {
    private final DataCollectionStatus dataCollectionStatus;
    private final long eventTimestampUs;
    private final String firebaseAuthenticationToken;
    private final String firebaseInstallationId;
    private final String firstSessionId;
    private final String sessionId;
    private final int sessionIndex;

    public SessionInfo(String sessionId, String firstSessionId, int i, long j, DataCollectionStatus dataCollectionStatus, String firebaseInstallationId, String firebaseAuthenticationToken) {
        OooOOO0.OooO0oO(sessionId, "sessionId");
        OooOOO0.OooO0oO(firstSessionId, "firstSessionId");
        OooOOO0.OooO0oO(dataCollectionStatus, "dataCollectionStatus");
        OooOOO0.OooO0oO(firebaseInstallationId, "firebaseInstallationId");
        OooOOO0.OooO0oO(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        this.sessionId = sessionId;
        this.firstSessionId = firstSessionId;
        this.sessionIndex = i;
        this.eventTimestampUs = j;
        this.dataCollectionStatus = dataCollectionStatus;
        this.firebaseInstallationId = firebaseInstallationId;
        this.firebaseAuthenticationToken = firebaseAuthenticationToken;
    }

    public static /* synthetic */ SessionInfo copy$default(SessionInfo sessionInfo, String str, String str2, int i, long j, DataCollectionStatus dataCollectionStatus, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = sessionInfo.sessionId;
        }
        if ((i2 & 2) != 0) {
            str2 = sessionInfo.firstSessionId;
        }
        if ((i2 & 4) != 0) {
            i = sessionInfo.sessionIndex;
        }
        if ((i2 & 8) != 0) {
            j = sessionInfo.eventTimestampUs;
        }
        if ((i2 & 16) != 0) {
            dataCollectionStatus = sessionInfo.dataCollectionStatus;
        }
        if ((i2 & 32) != 0) {
            str3 = sessionInfo.firebaseInstallationId;
        }
        if ((i2 & 64) != 0) {
            str4 = sessionInfo.firebaseAuthenticationToken;
        }
        String str5 = str4;
        DataCollectionStatus dataCollectionStatus2 = dataCollectionStatus;
        long j2 = j;
        int i3 = i;
        return sessionInfo.copy(str, str2, i3, j2, dataCollectionStatus2, str3, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSessionId() {
        return this.sessionId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFirstSessionId() {
        return this.firstSessionId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getSessionIndex() {
        return this.sessionIndex;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getEventTimestampUs() {
        return this.eventTimestampUs;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final DataCollectionStatus getDataCollectionStatus() {
        return this.dataCollectionStatus;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getFirebaseInstallationId() {
        return this.firebaseInstallationId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getFirebaseAuthenticationToken() {
        return this.firebaseAuthenticationToken;
    }

    public final SessionInfo copy(String sessionId, String firstSessionId, int sessionIndex, long eventTimestampUs, DataCollectionStatus dataCollectionStatus, String firebaseInstallationId, String firebaseAuthenticationToken) {
        OooOOO0.OooO0oO(sessionId, "sessionId");
        OooOOO0.OooO0oO(firstSessionId, "firstSessionId");
        OooOOO0.OooO0oO(dataCollectionStatus, "dataCollectionStatus");
        OooOOO0.OooO0oO(firebaseInstallationId, "firebaseInstallationId");
        OooOOO0.OooO0oO(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        return new SessionInfo(sessionId, firstSessionId, sessionIndex, eventTimestampUs, dataCollectionStatus, firebaseInstallationId, firebaseAuthenticationToken);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionInfo)) {
            return false;
        }
        SessionInfo sessionInfo = (SessionInfo) other;
        return OooOOO0.OooO0O0(this.sessionId, sessionInfo.sessionId) && OooOOO0.OooO0O0(this.firstSessionId, sessionInfo.firstSessionId) && this.sessionIndex == sessionInfo.sessionIndex && this.eventTimestampUs == sessionInfo.eventTimestampUs && OooOOO0.OooO0O0(this.dataCollectionStatus, sessionInfo.dataCollectionStatus) && OooOOO0.OooO0O0(this.firebaseInstallationId, sessionInfo.firebaseInstallationId) && OooOOO0.OooO0O0(this.firebaseAuthenticationToken, sessionInfo.firebaseAuthenticationToken);
    }

    public final DataCollectionStatus getDataCollectionStatus() {
        return this.dataCollectionStatus;
    }

    public final long getEventTimestampUs() {
        return this.eventTimestampUs;
    }

    public final String getFirebaseAuthenticationToken() {
        return this.firebaseAuthenticationToken;
    }

    public final String getFirebaseInstallationId() {
        return this.firebaseInstallationId;
    }

    public final String getFirstSessionId() {
        return this.firstSessionId;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final int getSessionIndex() {
        return this.sessionIndex;
    }

    public int hashCode() {
        return this.firebaseAuthenticationToken.hashCode() + com.aspose.slides.internal.p497xc.OooO00o.OooO0O0((this.dataCollectionStatus.hashCode() + C20703o000000o.OooO0O0(C20785Oooo00o.OooO00o(this.sessionIndex, com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(this.sessionId.hashCode() * 31, 31, this.firstSessionId), 31), 31, this.eventTimestampUs)) * 31, 31, this.firebaseInstallationId);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SessionInfo(sessionId=");
        sb.append(this.sessionId);
        sb.append(", firstSessionId=");
        sb.append(this.firstSessionId);
        sb.append(", sessionIndex=");
        sb.append(this.sessionIndex);
        sb.append(", eventTimestampUs=");
        sb.append(this.eventTimestampUs);
        sb.append(", dataCollectionStatus=");
        sb.append(this.dataCollectionStatus);
        sb.append(", firebaseInstallationId=");
        sb.append(this.firebaseInstallationId);
        sb.append(", firebaseAuthenticationToken=");
        return C21111o0ooOoO.OooO0OO(this.firebaseAuthenticationToken, ')', sb);
    }
}
