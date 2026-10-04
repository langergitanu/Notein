package com.orion.notein.domain.models.cloudsync;

import OooO.OooO00o;
import OooOO0.OooO0OO;
import OooOoo0.C20703o000000o;
import OooOoo0.o00000;
import com.aspose.slides.internal.p332p7.OooO;
import com.orion.notein.domain.models.note.NoteMeta;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;
import o0OOo0Oo.EnumC27285OooO;
import oOo000oo.InterfaceC34452OooO00o;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/CloudEvent;", "", "AccountEvent", "MetaBatchEvent", "MetaEvent", "FileEvent", "ErrorEvent", "Lcom/orion/notein/domain/models/cloudsync/CloudEvent$AccountEvent;", "Lcom/orion/notein/domain/models/cloudsync/CloudEvent$ErrorEvent;", "Lcom/orion/notein/domain/models/cloudsync/CloudEvent$FileEvent;", "Lcom/orion/notein/domain/models/cloudsync/CloudEvent$MetaBatchEvent;", "Lcom/orion/notein/domain/models/cloudsync/CloudEvent$MetaEvent;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public interface CloudEvent {

    @Metadata(m80611d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001:\u0001!B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000f¨\u0006\""}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/CloudEvent$AccountEvent;", "Lcom/orion/notein/domain/models/cloudsync/CloudEvent;", "", "accountId", "Lo0OOo0Oo/OooO;", "cloudSyncType", "Lcom/orion/notein/domain/models/cloudsync/CloudEvent$AccountEvent$Type;", "state", "<init>", "(Ljava/lang/String;Lo0OOo0Oo/OooO;Lcom/orion/notein/domain/models/cloudsync/CloudEvent$AccountEvent$Type;)V", "component1", "()Ljava/lang/String;", "component2", "()Lo0OOo0Oo/OooO;", "component3", "()Lcom/orion/notein/domain/models/cloudsync/CloudEvent$AccountEvent$Type;", "copy", "(Ljava/lang/String;Lo0OOo0Oo/OooO;Lcom/orion/notein/domain/models/cloudsync/CloudEvent$AccountEvent$Type;)Lcom/orion/notein/domain/models/cloudsync/CloudEvent$AccountEvent;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAccountId", "Lo0OOo0Oo/OooO;", "getCloudSyncType", "Lcom/orion/notein/domain/models/cloudsync/CloudEvent$AccountEvent$Type;", "getState", "Type", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final /* data */ class AccountEvent implements CloudEvent {
        private final String accountId;
        private final EnumC27285OooO cloudSyncType;
        private final Type state;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/CloudEvent$AccountEvent$Type;", "", "<init>", "(Ljava/lang/String;I)V", "LOGIN", "LOGOUT", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
        public static final class Type {
            private static final /* synthetic */ InterfaceC34452OooO00o $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;
            public static final Type LOGIN = new Type("LOGIN", 0);
            public static final Type LOGOUT = new Type("LOGOUT", 1);

            private static final /* synthetic */ Type[] $values() {
                return new Type[]{LOGIN, LOGOUT};
            }

            static {
                Type[] typeArr$values = $values();
                $VALUES = typeArr$values;
                $ENTRIES = OooO00o.OooO0O0(typeArr$values);
            }

            private Type(String str, int i) {
            }

            public static InterfaceC34452OooO00o<Type> getEntries() {
                return $ENTRIES;
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }
        }

        public AccountEvent(String accountId, EnumC27285OooO cloudSyncType, Type state) {
            OooOOO0.OooO0oO(accountId, "accountId");
            OooOOO0.OooO0oO(cloudSyncType, "cloudSyncType");
            OooOOO0.OooO0oO(state, "state");
            this.accountId = accountId;
            this.cloudSyncType = cloudSyncType;
            this.state = state;
        }

        public static /* synthetic */ AccountEvent copy$default(AccountEvent accountEvent, String str, EnumC27285OooO enumC27285OooO, Type type, int i, Object obj) {
            if ((i & 1) != 0) {
                str = accountEvent.accountId;
            }
            if ((i & 2) != 0) {
                enumC27285OooO = accountEvent.cloudSyncType;
            }
            if ((i & 4) != 0) {
                type = accountEvent.state;
            }
            return accountEvent.copy(str, enumC27285OooO, type);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getAccountId() {
            return this.accountId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final EnumC27285OooO getCloudSyncType() {
            return this.cloudSyncType;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Type getState() {
            return this.state;
        }

        public final AccountEvent copy(String accountId, EnumC27285OooO cloudSyncType, Type state) {
            OooOOO0.OooO0oO(accountId, "accountId");
            OooOOO0.OooO0oO(cloudSyncType, "cloudSyncType");
            OooOOO0.OooO0oO(state, "state");
            return new AccountEvent(accountId, cloudSyncType, state);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AccountEvent)) {
                return false;
            }
            AccountEvent accountEvent = (AccountEvent) other;
            return OooOOO0.OooO0O0(this.accountId, accountEvent.accountId) && this.cloudSyncType == accountEvent.cloudSyncType && this.state == accountEvent.state;
        }

        public final String getAccountId() {
            return this.accountId;
        }

        public final EnumC27285OooO getCloudSyncType() {
            return this.cloudSyncType;
        }

        public final Type getState() {
            return this.state;
        }

        public int hashCode() {
            return this.state.hashCode() + ((this.cloudSyncType.hashCode() + (this.accountId.hashCode() * 31)) * 31);
        }

        public String toString() {
            return "AccountEvent(accountId=" + this.accountId + ", cloudSyncType=" + this.cloudSyncType + ", state=" + this.state + ")";
        }
    }

    @Metadata(m80611d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/CloudEvent$ErrorEvent;", "Lcom/orion/notein/domain/models/cloudsync/CloudEvent;", "error", "Lcom/orion/notein/domain/models/cloudsync/CloudSyncError;", "errorMessage", "", "<init>", "(Lcom/orion/notein/domain/models/cloudsync/CloudSyncError;Ljava/lang/String;)V", "getError", "()Lcom/orion/notein/domain/models/cloudsync/CloudSyncError;", "getErrorMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final /* data */ class ErrorEvent implements CloudEvent {
        private final CloudSyncError error;
        private final String errorMessage;

        public ErrorEvent(CloudSyncError error, String errorMessage) {
            OooOOO0.OooO0oO(error, "error");
            OooOOO0.OooO0oO(errorMessage, "errorMessage");
            this.error = error;
            this.errorMessage = errorMessage;
        }

        public static /* synthetic */ ErrorEvent copy$default(ErrorEvent errorEvent, CloudSyncError cloudSyncError, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                cloudSyncError = errorEvent.error;
            }
            if ((i & 2) != 0) {
                str = errorEvent.errorMessage;
            }
            return errorEvent.copy(cloudSyncError, str);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final CloudSyncError getError() {
            return this.error;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public final ErrorEvent copy(CloudSyncError error, String errorMessage) {
            OooOOO0.OooO0oO(error, "error");
            OooOOO0.OooO0oO(errorMessage, "errorMessage");
            return new ErrorEvent(error, errorMessage);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ErrorEvent)) {
                return false;
            }
            ErrorEvent errorEvent = (ErrorEvent) other;
            return OooOOO0.OooO0O0(this.error, errorEvent.error) && OooOOO0.OooO0O0(this.errorMessage, errorEvent.errorMessage);
        }

        public final CloudSyncError getError() {
            return this.error;
        }

        public final String getErrorMessage() {
            return this.errorMessage;
        }

        public int hashCode() {
            return this.errorMessage.hashCode() + (this.error.hashCode() * 31);
        }

        public String toString() {
            return "ErrorEvent(error=" + this.error + ", errorMessage=" + this.errorMessage + ")";
        }
    }

    @Metadata(m80611d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001)B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003JO\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006*"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/CloudEvent$FileEvent;", "Lcom/orion/notein/domain/models/cloudsync/CloudEvent;", "metaId", "", "changeType", "Lcom/orion/notein/domain/models/cloudsync/CloudEvent$FileEvent$Type;", "driveObjectKey", "checksum", "mimeType", NoteMeta.PROPERTY_LAST_MODIFICATION_TIME, "", "extra", "Lcom/orion/notein/domain/models/cloudsync/CloudMetaExtra;", "<init>", "(Ljava/lang/String;Lcom/orion/notein/domain/models/cloudsync/CloudEvent$FileEvent$Type;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLcom/orion/notein/domain/models/cloudsync/CloudMetaExtra;)V", "getMetaId", "()Ljava/lang/String;", "getChangeType", "()Lcom/orion/notein/domain/models/cloudsync/CloudEvent$FileEvent$Type;", "getDriveObjectKey", "getChecksum", "getMimeType", "getLastModificationTime", "()J", "getExtra", "()Lcom/orion/notein/domain/models/cloudsync/CloudMetaExtra;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Type", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final /* data */ class FileEvent implements CloudEvent {
        private final Type changeType;
        private final String checksum;
        private final String driveObjectKey;
        private final CloudMetaExtra extra;
        private final long lastModificationTime;
        private final String metaId;
        private final String mimeType;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/CloudEvent$FileEvent$Type;", "", "<init>", "(Ljava/lang/String;I)V", "DELETE", "UPDATE", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
        public static final class Type {
            private static final /* synthetic */ InterfaceC34452OooO00o $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;
            public static final Type DELETE = new Type("DELETE", 0);
            public static final Type UPDATE = new Type("UPDATE", 1);

            private static final /* synthetic */ Type[] $values() {
                return new Type[]{DELETE, UPDATE};
            }

            static {
                Type[] typeArr$values = $values();
                $VALUES = typeArr$values;
                $ENTRIES = OooO00o.OooO0O0(typeArr$values);
            }

            private Type(String str, int i) {
            }

            public static InterfaceC34452OooO00o<Type> getEntries() {
                return $ENTRIES;
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }
        }

        public FileEvent(String metaId, Type changeType, String driveObjectKey, String checksum, String mimeType, long j, CloudMetaExtra extra) {
            OooOOO0.OooO0oO(metaId, "metaId");
            OooOOO0.OooO0oO(changeType, "changeType");
            OooOOO0.OooO0oO(driveObjectKey, "driveObjectKey");
            OooOOO0.OooO0oO(checksum, "checksum");
            OooOOO0.OooO0oO(mimeType, "mimeType");
            OooOOO0.OooO0oO(extra, "extra");
            this.metaId = metaId;
            this.changeType = changeType;
            this.driveObjectKey = driveObjectKey;
            this.checksum = checksum;
            this.mimeType = mimeType;
            this.lastModificationTime = j;
            this.extra = extra;
        }

        public static /* synthetic */ FileEvent copy$default(FileEvent fileEvent, String str, Type type, String str2, String str3, String str4, long j, CloudMetaExtra cloudMetaExtra, int i, Object obj) {
            if ((i & 1) != 0) {
                str = fileEvent.metaId;
            }
            if ((i & 2) != 0) {
                type = fileEvent.changeType;
            }
            if ((i & 4) != 0) {
                str2 = fileEvent.driveObjectKey;
            }
            if ((i & 8) != 0) {
                str3 = fileEvent.checksum;
            }
            if ((i & 16) != 0) {
                str4 = fileEvent.mimeType;
            }
            if ((i & 32) != 0) {
                j = fileEvent.lastModificationTime;
            }
            if ((i & 64) != 0) {
                cloudMetaExtra = fileEvent.extra;
            }
            CloudMetaExtra cloudMetaExtra2 = cloudMetaExtra;
            long j2 = j;
            String str5 = str4;
            String str6 = str2;
            return fileEvent.copy(str, type, str6, str3, str5, j2, cloudMetaExtra2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMetaId() {
            return this.metaId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Type getChangeType() {
            return this.changeType;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getDriveObjectKey() {
            return this.driveObjectKey;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getChecksum() {
            return this.checksum;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getMimeType() {
            return this.mimeType;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final long getLastModificationTime() {
            return this.lastModificationTime;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final CloudMetaExtra getExtra() {
            return this.extra;
        }

        public final FileEvent copy(String metaId, Type changeType, String driveObjectKey, String checksum, String mimeType, long lastModificationTime, CloudMetaExtra extra) {
            OooOOO0.OooO0oO(metaId, "metaId");
            OooOOO0.OooO0oO(changeType, "changeType");
            OooOOO0.OooO0oO(driveObjectKey, "driveObjectKey");
            OooOOO0.OooO0oO(checksum, "checksum");
            OooOOO0.OooO0oO(mimeType, "mimeType");
            OooOOO0.OooO0oO(extra, "extra");
            return new FileEvent(metaId, changeType, driveObjectKey, checksum, mimeType, lastModificationTime, extra);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FileEvent)) {
                return false;
            }
            FileEvent fileEvent = (FileEvent) other;
            return OooOOO0.OooO0O0(this.metaId, fileEvent.metaId) && this.changeType == fileEvent.changeType && OooOOO0.OooO0O0(this.driveObjectKey, fileEvent.driveObjectKey) && OooOOO0.OooO0O0(this.checksum, fileEvent.checksum) && OooOOO0.OooO0O0(this.mimeType, fileEvent.mimeType) && this.lastModificationTime == fileEvent.lastModificationTime && OooOOO0.OooO0O0(this.extra, fileEvent.extra);
        }

        public final Type getChangeType() {
            return this.changeType;
        }

        public final String getChecksum() {
            return this.checksum;
        }

        public final String getDriveObjectKey() {
            return this.driveObjectKey;
        }

        public final CloudMetaExtra getExtra() {
            return this.extra;
        }

        public final long getLastModificationTime() {
            return this.lastModificationTime;
        }

        public final String getMetaId() {
            return this.metaId;
        }

        public final String getMimeType() {
            return this.mimeType;
        }

        public int hashCode() {
            return this.extra.hashCode() + C20703o000000o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0(com.aspose.slides.internal.p497xc.OooO00o.OooO0O0((this.changeType.hashCode() + (this.metaId.hashCode() * 31)) * 31, 31, this.driveObjectKey), 31, this.checksum), 31, this.mimeType), 31, this.lastModificationTime);
        }

        public String toString() {
            String str = this.metaId;
            Type type = this.changeType;
            String str2 = this.driveObjectKey;
            String str3 = this.checksum;
            String str4 = this.mimeType;
            long j = this.lastModificationTime;
            CloudMetaExtra cloudMetaExtra = this.extra;
            StringBuilder sb = new StringBuilder("FileEvent(metaId=");
            sb.append(str);
            sb.append(", changeType=");
            sb.append(type);
            sb.append(", driveObjectKey=");
            OooO0OO.OooO0o0(sb, str2, ", checksum=", str3, ", mimeType=");
            OooO.OooO00o(j, str4, ", lastModificationTime=", sb);
            sb.append(", extra=");
            sb.append(cloudMetaExtra);
            sb.append(")");
            return sb.toString();
        }
    }

    @Metadata(m80611d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/CloudEvent$MetaBatchEvent;", "Lcom/orion/notein/domain/models/cloudsync/CloudEvent;", "changes", "", "Lcom/orion/notein/domain/models/cloudsync/CloudEvent$MetaEvent;", "<init>", "(Ljava/util/List;)V", "getChanges", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final /* data */ class MetaBatchEvent implements CloudEvent {
        private final List<MetaEvent> changes;

        public MetaBatchEvent(List<MetaEvent> changes) {
            OooOOO0.OooO0oO(changes, "changes");
            this.changes = changes;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MetaBatchEvent copy$default(MetaBatchEvent metaBatchEvent, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = metaBatchEvent.changes;
            }
            return metaBatchEvent.copy(list);
        }

        public final List<MetaEvent> component1() {
            return this.changes;
        }

        public final MetaBatchEvent copy(List<MetaEvent> changes) {
            OooOOO0.OooO0oO(changes, "changes");
            return new MetaBatchEvent(changes);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof MetaBatchEvent) && OooOOO0.OooO0O0(this.changes, ((MetaBatchEvent) other).changes);
        }

        public final List<MetaEvent> getChanges() {
            return this.changes;
        }

        public int hashCode() {
            return this.changes.hashCode();
        }

        public String toString() {
            return "MetaBatchEvent(changes=" + this.changes + ")";
        }
    }

    @Metadata(m80611d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001(B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u0019JL\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0002\u0010\"J\u0013\u0010#\u001a\u00020\u00052\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\fHÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019¨\u0006)"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/CloudEvent$MetaEvent;", "Lcom/orion/notein/domain/models/cloudsync/CloudEvent;", "metaId", "", "deletedLocal", "", "deletedCloud", "changeType", "Lcom/orion/notein/domain/models/cloudsync/CloudEvent$MetaEvent$Type;", "dirtyCloudMeta", "Lcom/orion/notein/domain/models/cloudsync/CloudMetaRemote;", "expectedLocalMetaVersion", "", "<init>", "(Ljava/lang/String;ZZLcom/orion/notein/domain/models/cloudsync/CloudEvent$MetaEvent$Type;Lcom/orion/notein/domain/models/cloudsync/CloudMetaRemote;Ljava/lang/Integer;)V", "getMetaId", "()Ljava/lang/String;", "getDeletedLocal", "()Z", "getDeletedCloud", "getChangeType", "()Lcom/orion/notein/domain/models/cloudsync/CloudEvent$MetaEvent$Type;", "getDirtyCloudMeta", "()Lcom/orion/notein/domain/models/cloudsync/CloudMetaRemote;", "getExpectedLocalMetaVersion", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;ZZLcom/orion/notein/domain/models/cloudsync/CloudEvent$MetaEvent$Type;Lcom/orion/notein/domain/models/cloudsync/CloudMetaRemote;Ljava/lang/Integer;)Lcom/orion/notein/domain/models/cloudsync/CloudEvent$MetaEvent;", "equals", "other", "", "hashCode", "toString", "Type", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final /* data */ class MetaEvent implements CloudEvent {
        private final Type changeType;
        private final boolean deletedCloud;
        private final boolean deletedLocal;
        private final CloudMetaRemote dirtyCloudMeta;
        private final Integer expectedLocalMetaVersion;
        private final String metaId;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(m80611d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/CloudEvent$MetaEvent$Type;", "", "<init>", "(Ljava/lang/String;I)V", "CLOUD_UPDATE", "CLOUD_DELETE", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
        public static final class Type {
            private static final /* synthetic */ InterfaceC34452OooO00o $ENTRIES;
            private static final /* synthetic */ Type[] $VALUES;
            public static final Type CLOUD_UPDATE = new Type("CLOUD_UPDATE", 0);
            public static final Type CLOUD_DELETE = new Type("CLOUD_DELETE", 1);

            private static final /* synthetic */ Type[] $values() {
                return new Type[]{CLOUD_UPDATE, CLOUD_DELETE};
            }

            static {
                Type[] typeArr$values = $values();
                $VALUES = typeArr$values;
                $ENTRIES = OooO00o.OooO0O0(typeArr$values);
            }

            private Type(String str, int i) {
            }

            public static InterfaceC34452OooO00o<Type> getEntries() {
                return $ENTRIES;
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) $VALUES.clone();
            }
        }

        public MetaEvent(String metaId, boolean z, boolean z2, Type changeType, CloudMetaRemote dirtyCloudMeta, Integer num) {
            OooOOO0.OooO0oO(metaId, "metaId");
            OooOOO0.OooO0oO(changeType, "changeType");
            OooOOO0.OooO0oO(dirtyCloudMeta, "dirtyCloudMeta");
            this.metaId = metaId;
            this.deletedLocal = z;
            this.deletedCloud = z2;
            this.changeType = changeType;
            this.dirtyCloudMeta = dirtyCloudMeta;
            this.expectedLocalMetaVersion = num;
        }

        public static /* synthetic */ MetaEvent copy$default(MetaEvent metaEvent, String str, boolean z, boolean z2, Type type, CloudMetaRemote cloudMetaRemote, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                str = metaEvent.metaId;
            }
            if ((i & 2) != 0) {
                z = metaEvent.deletedLocal;
            }
            if ((i & 4) != 0) {
                z2 = metaEvent.deletedCloud;
            }
            if ((i & 8) != 0) {
                type = metaEvent.changeType;
            }
            if ((i & 16) != 0) {
                cloudMetaRemote = metaEvent.dirtyCloudMeta;
            }
            if ((i & 32) != 0) {
                num = metaEvent.expectedLocalMetaVersion;
            }
            CloudMetaRemote cloudMetaRemote2 = cloudMetaRemote;
            Integer num2 = num;
            return metaEvent.copy(str, z, z2, type, cloudMetaRemote2, num2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getMetaId() {
            return this.metaId;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final boolean getDeletedLocal() {
            return this.deletedLocal;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getDeletedCloud() {
            return this.deletedCloud;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final Type getChangeType() {
            return this.changeType;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final CloudMetaRemote getDirtyCloudMeta() {
            return this.dirtyCloudMeta;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final Integer getExpectedLocalMetaVersion() {
            return this.expectedLocalMetaVersion;
        }

        public final MetaEvent copy(String metaId, boolean deletedLocal, boolean deletedCloud, Type changeType, CloudMetaRemote dirtyCloudMeta, Integer expectedLocalMetaVersion) {
            OooOOO0.OooO0oO(metaId, "metaId");
            OooOOO0.OooO0oO(changeType, "changeType");
            OooOOO0.OooO0oO(dirtyCloudMeta, "dirtyCloudMeta");
            return new MetaEvent(metaId, deletedLocal, deletedCloud, changeType, dirtyCloudMeta, expectedLocalMetaVersion);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MetaEvent)) {
                return false;
            }
            MetaEvent metaEvent = (MetaEvent) other;
            return OooOOO0.OooO0O0(this.metaId, metaEvent.metaId) && this.deletedLocal == metaEvent.deletedLocal && this.deletedCloud == metaEvent.deletedCloud && this.changeType == metaEvent.changeType && OooOOO0.OooO0O0(this.dirtyCloudMeta, metaEvent.dirtyCloudMeta) && OooOOO0.OooO0O0(this.expectedLocalMetaVersion, metaEvent.expectedLocalMetaVersion);
        }

        public final Type getChangeType() {
            return this.changeType;
        }

        public final boolean getDeletedCloud() {
            return this.deletedCloud;
        }

        public final boolean getDeletedLocal() {
            return this.deletedLocal;
        }

        public final CloudMetaRemote getDirtyCloudMeta() {
            return this.dirtyCloudMeta;
        }

        public final Integer getExpectedLocalMetaVersion() {
            return this.expectedLocalMetaVersion;
        }

        public final String getMetaId() {
            return this.metaId;
        }

        public int hashCode() {
            int iHashCode = (this.dirtyCloudMeta.hashCode() + ((this.changeType.hashCode() + o00000.OooO0O0(o00000.OooO0O0(this.metaId.hashCode() * 31, 31, this.deletedLocal), 31, this.deletedCloud)) * 31)) * 31;
            Integer num = this.expectedLocalMetaVersion;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            return "MetaEvent(metaId=" + this.metaId + ", deletedLocal=" + this.deletedLocal + ", deletedCloud=" + this.deletedCloud + ", changeType=" + this.changeType + ", dirtyCloudMeta=" + this.dirtyCloudMeta + ", expectedLocalMetaVersion=" + this.expectedLocalMetaVersion + ")";
        }

        public /* synthetic */ MetaEvent(String str, boolean z, boolean z2, Type type, CloudMetaRemote cloudMetaRemote, Integer num, int i, C24018OooO0oo c24018OooO0oo) {
            this(str, z, z2, type, cloudMetaRemote, (i & 32) != 0 ? null : num);
        }
    }
}
