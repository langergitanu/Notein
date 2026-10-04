package com.orion.notein.domain.models.cloudsync;

import OooOoo.C20593OooO0Oo;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/SyncNotification;", "", "<init>", "()V", "VersionIncompatible", "VersionMetadataMissing", "ConflictDetected", "OtherUserEditing", "CloudSpaceFull", "AuthExpired", "NetworkError", "Lcom/orion/notein/domain/models/cloudsync/SyncNotification$AuthExpired;", "Lcom/orion/notein/domain/models/cloudsync/SyncNotification$CloudSpaceFull;", "Lcom/orion/notein/domain/models/cloudsync/SyncNotification$ConflictDetected;", "Lcom/orion/notein/domain/models/cloudsync/SyncNotification$NetworkError;", "Lcom/orion/notein/domain/models/cloudsync/SyncNotification$OtherUserEditing;", "Lcom/orion/notein/domain/models/cloudsync/SyncNotification$VersionIncompatible;", "Lcom/orion/notein/domain/models/cloudsync/SyncNotification$VersionMetadataMissing;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public abstract class SyncNotification {

    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/SyncNotification$AuthExpired;", "Lcom/orion/notein/domain/models/cloudsync/SyncNotification;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class AuthExpired extends SyncNotification {
        public static final AuthExpired INSTANCE = new AuthExpired();

        private AuthExpired() {
            super(null);
        }
    }

    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/SyncNotification$CloudSpaceFull;", "Lcom/orion/notein/domain/models/cloudsync/SyncNotification;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class CloudSpaceFull extends SyncNotification {
        public static final CloudSpaceFull INSTANCE = new CloudSpaceFull();

        private CloudSpaceFull() {
            super(null);
        }
    }

    @Metadata(m80611d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/SyncNotification$ConflictDetected;", "Lcom/orion/notein/domain/models/cloudsync/SyncNotification;", "metaId", "", "<init>", "(Ljava/lang/String;)V", "getMetaId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final /* data */ class ConflictDetected extends SyncNotification {
        private final String metaId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConflictDetected(String metaId) {
            super(null);
            OooOOO0.OooO0oO(metaId, "metaId");
            this.metaId = metaId;
        }

        public static /* synthetic */ ConflictDetected copy$default(ConflictDetected conflictDetected, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = conflictDetected.metaId;
            }
            return conflictDetected.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMetaId() {
            return this.metaId;
        }

        public final ConflictDetected copy(String metaId) {
            OooOOO0.OooO0oO(metaId, "metaId");
            return new ConflictDetected(metaId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ConflictDetected) && OooOOO0.OooO0O0(this.metaId, ((ConflictDetected) other).metaId);
        }

        public final String getMetaId() {
            return this.metaId;
        }

        public int hashCode() {
            return this.metaId.hashCode();
        }

        public String toString() {
            return C20593OooO0Oo.OooO0O0("ConflictDetected(metaId=", this.metaId, ")");
        }
    }

    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/SyncNotification$NetworkError;", "Lcom/orion/notein/domain/models/cloudsync/SyncNotification;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class NetworkError extends SyncNotification {
        public static final NetworkError INSTANCE = new NetworkError();

        private NetworkError() {
            super(null);
        }
    }

    @Metadata(m80611d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/SyncNotification$OtherUserEditing;", "Lcom/orion/notein/domain/models/cloudsync/SyncNotification;", "metaId", "", "<init>", "(Ljava/lang/String;)V", "getMetaId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final /* data */ class OtherUserEditing extends SyncNotification {
        private final String metaId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OtherUserEditing(String metaId) {
            super(null);
            OooOOO0.OooO0oO(metaId, "metaId");
            this.metaId = metaId;
        }

        public static /* synthetic */ OtherUserEditing copy$default(OtherUserEditing otherUserEditing, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = otherUserEditing.metaId;
            }
            return otherUserEditing.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMetaId() {
            return this.metaId;
        }

        public final OtherUserEditing copy(String metaId) {
            OooOOO0.OooO0oO(metaId, "metaId");
            return new OtherUserEditing(metaId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OtherUserEditing) && OooOOO0.OooO0O0(this.metaId, ((OtherUserEditing) other).metaId);
        }

        public final String getMetaId() {
            return this.metaId;
        }

        public int hashCode() {
            return this.metaId.hashCode();
        }

        public String toString() {
            return C20593OooO0Oo.OooO0O0("OtherUserEditing(metaId=", this.metaId, ")");
        }
    }

    @Metadata(m80611d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/SyncNotification$VersionIncompatible;", "Lcom/orion/notein/domain/models/cloudsync/SyncNotification;", "metaId", "", "<init>", "(Ljava/lang/String;)V", "getMetaId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final /* data */ class VersionIncompatible extends SyncNotification {
        private final String metaId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VersionIncompatible(String metaId) {
            super(null);
            OooOOO0.OooO0oO(metaId, "metaId");
            this.metaId = metaId;
        }

        public static /* synthetic */ VersionIncompatible copy$default(VersionIncompatible versionIncompatible, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = versionIncompatible.metaId;
            }
            return versionIncompatible.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMetaId() {
            return this.metaId;
        }

        public final VersionIncompatible copy(String metaId) {
            OooOOO0.OooO0oO(metaId, "metaId");
            return new VersionIncompatible(metaId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof VersionIncompatible) && OooOOO0.OooO0O0(this.metaId, ((VersionIncompatible) other).metaId);
        }

        public final String getMetaId() {
            return this.metaId;
        }

        public int hashCode() {
            return this.metaId.hashCode();
        }

        public String toString() {
            return C20593OooO0Oo.OooO0O0("VersionIncompatible(metaId=", this.metaId, ")");
        }
    }

    @Metadata(m80611d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/SyncNotification$VersionMetadataMissing;", "Lcom/orion/notein/domain/models/cloudsync/SyncNotification;", "metaId", "", "<init>", "(Ljava/lang/String;)V", "getMetaId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final /* data */ class VersionMetadataMissing extends SyncNotification {
        private final String metaId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VersionMetadataMissing(String metaId) {
            super(null);
            OooOOO0.OooO0oO(metaId, "metaId");
            this.metaId = metaId;
        }

        public static /* synthetic */ VersionMetadataMissing copy$default(VersionMetadataMissing versionMetadataMissing, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = versionMetadataMissing.metaId;
            }
            return versionMetadataMissing.copy(str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMetaId() {
            return this.metaId;
        }

        public final VersionMetadataMissing copy(String metaId) {
            OooOOO0.OooO0oO(metaId, "metaId");
            return new VersionMetadataMissing(metaId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof VersionMetadataMissing) && OooOOO0.OooO0O0(this.metaId, ((VersionMetadataMissing) other).metaId);
        }

        public final String getMetaId() {
            return this.metaId;
        }

        public int hashCode() {
            return this.metaId.hashCode();
        }

        public String toString() {
            return C20593OooO0Oo.OooO0O0("VersionMetadataMissing(metaId=", this.metaId, ")");
        }
    }

    public /* synthetic */ SyncNotification(C24018OooO0oo c24018OooO0oo) {
        this();
    }

    private SyncNotification() {
    }
}
