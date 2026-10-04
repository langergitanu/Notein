package com.orion.notein.domain.models.cloudsync;

import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/SyncPostAction;", "", "<init>", "()V", "None", "AcceptRemoteDelete", "RetryPull", "PushFull", "PushDuplicateFull", "Lcom/orion/notein/domain/models/cloudsync/SyncPostAction$AcceptRemoteDelete;", "Lcom/orion/notein/domain/models/cloudsync/SyncPostAction$None;", "Lcom/orion/notein/domain/models/cloudsync/SyncPostAction$PushDuplicateFull;", "Lcom/orion/notein/domain/models/cloudsync/SyncPostAction$PushFull;", "Lcom/orion/notein/domain/models/cloudsync/SyncPostAction$RetryPull;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public abstract class SyncPostAction {

    @Metadata(m80611d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/SyncPostAction$AcceptRemoteDelete;", "Lcom/orion/notein/domain/models/cloudsync/SyncPostAction;", "deletedRemoteMeta", "Lcom/orion/notein/domain/models/cloudsync/CloudMetaRemote;", "<init>", "(Lcom/orion/notein/domain/models/cloudsync/CloudMetaRemote;)V", "getDeletedRemoteMeta", "()Lcom/orion/notein/domain/models/cloudsync/CloudMetaRemote;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final /* data */ class AcceptRemoteDelete extends SyncPostAction {
        private final CloudMetaRemote deletedRemoteMeta;

        /* JADX WARN: Multi-variable type inference failed */
        public AcceptRemoteDelete() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ AcceptRemoteDelete copy$default(AcceptRemoteDelete acceptRemoteDelete, CloudMetaRemote cloudMetaRemote, int i, Object obj) {
            if ((i & 1) != 0) {
                cloudMetaRemote = acceptRemoteDelete.deletedRemoteMeta;
            }
            return acceptRemoteDelete.copy(cloudMetaRemote);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final CloudMetaRemote getDeletedRemoteMeta() {
            return this.deletedRemoteMeta;
        }

        public final AcceptRemoteDelete copy(CloudMetaRemote deletedRemoteMeta) {
            return new AcceptRemoteDelete(deletedRemoteMeta);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AcceptRemoteDelete) && OooOOO0.OooO0O0(this.deletedRemoteMeta, ((AcceptRemoteDelete) other).deletedRemoteMeta);
        }

        public final CloudMetaRemote getDeletedRemoteMeta() {
            return this.deletedRemoteMeta;
        }

        public int hashCode() {
            CloudMetaRemote cloudMetaRemote = this.deletedRemoteMeta;
            if (cloudMetaRemote == null) {
                return 0;
            }
            return cloudMetaRemote.hashCode();
        }

        public String toString() {
            return "AcceptRemoteDelete(deletedRemoteMeta=" + this.deletedRemoteMeta + ")";
        }

        public /* synthetic */ AcceptRemoteDelete(CloudMetaRemote cloudMetaRemote, int i, C24018OooO0oo c24018OooO0oo) {
            this((i & 1) != 0 ? null : cloudMetaRemote);
        }

        public AcceptRemoteDelete(CloudMetaRemote cloudMetaRemote) {
            super(null);
            this.deletedRemoteMeta = cloudMetaRemote;
        }
    }

    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/SyncPostAction$None;", "Lcom/orion/notein/domain/models/cloudsync/SyncPostAction;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class None extends SyncPostAction {
        public static final None INSTANCE = new None();

        private None() {
            super(null);
        }
    }

    @Metadata(m80611d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/SyncPostAction$PushDuplicateFull;", "Lcom/orion/notein/domain/models/cloudsync/SyncPostAction;", "targetId", "", "targetType", "Lcom/orion/notein/domain/models/cloudsync/CloudMetaType;", "<init>", "(Ljava/lang/String;Lcom/orion/notein/domain/models/cloudsync/CloudMetaType;)V", "getTargetId", "()Ljava/lang/String;", "getTargetType", "()Lcom/orion/notein/domain/models/cloudsync/CloudMetaType;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final /* data */ class PushDuplicateFull extends SyncPostAction {
        private final String targetId;
        private final CloudMetaType targetType;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PushDuplicateFull(String targetId, CloudMetaType targetType) {
            super(null);
            OooOOO0.OooO0oO(targetId, "targetId");
            OooOOO0.OooO0oO(targetType, "targetType");
            this.targetId = targetId;
            this.targetType = targetType;
        }

        public static /* synthetic */ PushDuplicateFull copy$default(PushDuplicateFull pushDuplicateFull, String str, CloudMetaType cloudMetaType, int i, Object obj) {
            if ((i & 1) != 0) {
                str = pushDuplicateFull.targetId;
            }
            if ((i & 2) != 0) {
                cloudMetaType = pushDuplicateFull.targetType;
            }
            return pushDuplicateFull.copy(str, cloudMetaType);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getTargetId() {
            return this.targetId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final CloudMetaType getTargetType() {
            return this.targetType;
        }

        public final PushDuplicateFull copy(String targetId, CloudMetaType targetType) {
            OooOOO0.OooO0oO(targetId, "targetId");
            OooOOO0.OooO0oO(targetType, "targetType");
            return new PushDuplicateFull(targetId, targetType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PushDuplicateFull)) {
                return false;
            }
            PushDuplicateFull pushDuplicateFull = (PushDuplicateFull) other;
            return OooOOO0.OooO0O0(this.targetId, pushDuplicateFull.targetId) && this.targetType == pushDuplicateFull.targetType;
        }

        public final String getTargetId() {
            return this.targetId;
        }

        public final CloudMetaType getTargetType() {
            return this.targetType;
        }

        public int hashCode() {
            return this.targetType.hashCode() + (this.targetId.hashCode() * 31);
        }

        public String toString() {
            return "PushDuplicateFull(targetId=" + this.targetId + ", targetType=" + this.targetType + ")";
        }
    }

    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/SyncPostAction$PushFull;", "Lcom/orion/notein/domain/models/cloudsync/SyncPostAction;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class PushFull extends SyncPostAction {
        public static final PushFull INSTANCE = new PushFull();

        private PushFull() {
            super(null);
        }
    }

    @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/SyncPostAction$RetryPull;", "Lcom/orion/notein/domain/models/cloudsync/SyncPostAction;", "<init>", "()V", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class RetryPull extends SyncPostAction {
        public static final RetryPull INSTANCE = new RetryPull();

        private RetryPull() {
            super(null);
        }
    }

    public /* synthetic */ SyncPostAction(C24018OooO0oo c24018OooO0oo) {
        this();
    }

    private SyncPostAction() {
    }
}
