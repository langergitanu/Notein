package com.orion.notein.domain.models.cloudsync;

import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00112\u00020\u0001:\u0016\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&B\u0015\b\u0004\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0001X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\rR\u0014\u0010\u000e\u001a\u00020\fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r\u0082\u0001\u0015'()*+,-./0123456789:;¨\u0006<"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/CloudSyncError;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "errorCode", "", "getErrorCode", "()Ljava/lang/String;", "isRetryable", "", "()Z", "requiresConflictResolution", "getRequiresConflictResolution", "isGlobalError", "Companion", "Network", "LockBusy", "LockExpired", "ServerTemporary", "NotInitialized", "MetaVersionMismatch", "UnknownContentSource", "MetaNotFound", "ResourceNotFound", "VersionIncompatible", "StorageFull", "AuthExpired", "NoteinAuthFailed", "HmsComponentNotAvailable", "VersionUnknown", "ChecksumMismatch", "DisallowToUseCellular", "Internal", "ResetStuck", "ContentConflict", "RemoteDisabled", "Lcom/orion/notein/domain/models/cloudsync/CloudSyncError$AuthExpired;", "Lcom/orion/notein/domain/models/cloudsync/CloudSyncError$ChecksumMismatch;", "Lcom/orion/notein/domain/models/cloudsync/CloudSyncError$ContentConflict;", "Lcom/orion/notein/domain/models/cloudsync/CloudSyncError$DisallowToUseCellular;", "Lcom/orion/notein/domain/models/cloudsync/CloudSyncError$HmsComponentNotAvailable;", "Lcom/orion/notein/domain/models/cloudsync/CloudSyncError$Internal;", "Lcom/orion/notein/domain/models/cloudsync/CloudSyncError$LockBusy;", "Lcom/orion/notein/domain/models/cloudsync/CloudSyncError$LockExpired;", "Lcom/orion/notein/domain/models/cloudsync/CloudSyncError$MetaNotFound;", "Lcom/orion/notein/domain/models/cloudsync/CloudSyncError$MetaVersionMismatch;", "Lcom/orion/notein/domain/models/cloudsync/CloudSyncError$Network;", "Lcom/orion/notein/domain/models/cloudsync/CloudSyncError$NotInitialized;", "Lcom/orion/notein/domain/models/cloudsync/CloudSyncError$NoteinAuthFailed;", "Lcom/orion/notein/domain/models/cloudsync/CloudSyncError$RemoteDisabled;", "Lcom/orion/notein/domain/models/cloudsync/CloudSyncError$ResetStuck;", "Lcom/orion/notein/domain/models/cloudsync/CloudSyncError$ResourceNotFound;", "Lcom/orion/notein/domain/models/cloudsync/CloudSyncError$ServerTemporary;", "Lcom/orion/notein/domain/models/cloudsync/CloudSyncError$StorageFull;", "Lcom/orion/notein/domain/models/cloudsync/CloudSyncError$UnknownContentSource;", "Lcom/orion/notein/domain/models/cloudsync/CloudSyncError$VersionIncompatible;", "Lcom/orion/notein/domain/models/cloudsync/CloudSyncError$VersionUnknown;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public abstract class CloudSyncError extends Throwable {
    public static final String CODE_APP_VERSION_INCOMPATIBLE = "CONTENT_APP_VERSION_INCOMPATIBLE";
    public static final String CODE_AUTH_EXPIRED = "CLOUD_AUTH_EXPIRED";
    public static final String CODE_CHECKSUM_MISMATCH = "CHECKSUM_MISMATCH";
    public static final String CODE_CONTENT_CONFLICT = "CONTENT_CONFLICT";
    public static final String CODE_DISALLOW_TO_USE_CELLULAR = "DISALLOW_TO_USE_CELLULAR";
    public static final String CODE_HW_COMPONENT_NOT_AVAILABLE = "HW_COMPONENT_NOT_AVAILABLE";
    public static final String CODE_INTERNAL = "INTERNAL_ERROR";
    public static final String CODE_LOCK_BUSY = "LOCK_BUSY";
    public static final String CODE_LOCK_EXPIRED = "LOCK_EXPIRED";
    public static final String CODE_META_NOT_FOUND = "META_NOT_FOUND";
    public static final String CODE_META_VERSION_MISMATCH = "META_VERSION_MISMATCH";
    public static final String CODE_NETWORK = "NETWORK";
    public static final String CODE_NOTEIN_AUTH_FAILED = "NOTEIN_AUTH_FAILED";
    public static final String CODE_NOT_INITIALIZED = "NOT_INITIALIZED";
    public static final String CODE_REMOTE_DISABLED = "REMOTE_DISABLED";
    public static final String CODE_RESET_STUCK = "RESET_STUCK";
    public static final String CODE_RESOURCE_NOT_FOUND = "RESOURCE_NOT_FOUND";
    public static final String CODE_SERVER_TEMPORARY = "SERVER_TEMPORARY";
    public static final String CODE_STORAGE_FULL = "CLOUD_STORAGE_FULL";
    public static final String CODE_UNKNOWN_CONTENT_SOURCE = "UNKNOWN_CONTENT_SOURCE";
    public static final String CODE_VERSION_UNKNOWN = "CONTENT_VERSION_UNKNOWN";
    private final Throwable cause;
    private final boolean isGlobalError;
    private final boolean isRetryable;
    private final boolean requiresConflictResolution;

    @Metadata(m80611d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\f¨\u0006\r"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/CloudSyncError$AuthExpired;", "Lcom/orion/notein/domain/models/cloudsync/CloudSyncError;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "errorCode", "", "getErrorCode", "()Ljava/lang/String;", "isGlobalError", "", "()Z", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class AuthExpired extends CloudSyncError {
        private final String errorCode;
        private final boolean isGlobalError;

        /* JADX WARN: Multi-variable type inference failed */
        public AuthExpired() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.orion.notein.domain.models.cloudsync.CloudSyncError
        public String getErrorCode() {
            return this.errorCode;
        }

        @Override // com.orion.notein.domain.models.cloudsync.CloudSyncError
        /* JADX INFO: renamed from: isGlobalError, reason: from getter */
        public boolean getIsGlobalError() {
            return this.isGlobalError;
        }

        public AuthExpired(Throwable th) {
            super(th, null);
            this.errorCode = CloudSyncError.CODE_AUTH_EXPIRED;
            this.isGlobalError = true;
        }

        public /* synthetic */ AuthExpired(Throwable th, int i, C24018OooO0oo c24018OooO0oo) {
            this((i & 1) != 0 ? null : th);
        }
    }

    @Metadata(m80611d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/CloudSyncError$ChecksumMismatch;", "Lcom/orion/notein/domain/models/cloudsync/CloudSyncError;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "errorCode", "", "getErrorCode", "()Ljava/lang/String;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class ChecksumMismatch extends CloudSyncError {
        private final String errorCode;

        /* JADX WARN: Multi-variable type inference failed */
        public ChecksumMismatch() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.orion.notein.domain.models.cloudsync.CloudSyncError
        public String getErrorCode() {
            return this.errorCode;
        }

        public ChecksumMismatch(Throwable th) {
            super(th, null);
            this.errorCode = CloudSyncError.CODE_CHECKSUM_MISMATCH;
        }

        public /* synthetic */ ChecksumMismatch(Throwable th, int i, C24018OooO0oo c24018OooO0oo) {
            this((i & 1) != 0 ? null : th);
        }
    }

    @Metadata(m80611d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/CloudSyncError$ContentConflict;", "Lcom/orion/notein/domain/models/cloudsync/CloudSyncError;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "errorCode", "", "getErrorCode", "()Ljava/lang/String;", "requiresConflictResolution", "", "getRequiresConflictResolution", "()Z", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class ContentConflict extends CloudSyncError {
        private final String errorCode;
        private final boolean requiresConflictResolution;

        /* JADX WARN: Multi-variable type inference failed */
        public ContentConflict() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.orion.notein.domain.models.cloudsync.CloudSyncError
        public String getErrorCode() {
            return this.errorCode;
        }

        @Override // com.orion.notein.domain.models.cloudsync.CloudSyncError
        public boolean getRequiresConflictResolution() {
            return this.requiresConflictResolution;
        }

        public ContentConflict(Throwable th) {
            super(th, null);
            this.errorCode = CloudSyncError.CODE_CONTENT_CONFLICT;
            this.requiresConflictResolution = true;
        }

        public /* synthetic */ ContentConflict(Throwable th, int i, C24018OooO0oo c24018OooO0oo) {
            this((i & 1) != 0 ? null : th);
        }
    }

    @Metadata(m80611d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\f¨\u0006\r"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/CloudSyncError$DisallowToUseCellular;", "Lcom/orion/notein/domain/models/cloudsync/CloudSyncError;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "errorCode", "", "getErrorCode", "()Ljava/lang/String;", "isGlobalError", "", "()Z", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class DisallowToUseCellular extends CloudSyncError {
        private final String errorCode;
        private final boolean isGlobalError;

        /* JADX WARN: Multi-variable type inference failed */
        public DisallowToUseCellular() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.orion.notein.domain.models.cloudsync.CloudSyncError
        public String getErrorCode() {
            return this.errorCode;
        }

        @Override // com.orion.notein.domain.models.cloudsync.CloudSyncError
        /* JADX INFO: renamed from: isGlobalError, reason: from getter */
        public boolean getIsGlobalError() {
            return this.isGlobalError;
        }

        public DisallowToUseCellular(Throwable th) {
            super(th, null);
            this.errorCode = CloudSyncError.CODE_DISALLOW_TO_USE_CELLULAR;
            this.isGlobalError = true;
        }

        public /* synthetic */ DisallowToUseCellular(Throwable th, int i, C24018OooO0oo c24018OooO0oo) {
            this((i & 1) != 0 ? null : th);
        }
    }

    @Metadata(m80611d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\f¨\u0006\r"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/CloudSyncError$HmsComponentNotAvailable;", "Lcom/orion/notein/domain/models/cloudsync/CloudSyncError;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "errorCode", "", "getErrorCode", "()Ljava/lang/String;", "isGlobalError", "", "()Z", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class HmsComponentNotAvailable extends CloudSyncError {
        private final String errorCode;
        private final boolean isGlobalError;

        /* JADX WARN: Multi-variable type inference failed */
        public HmsComponentNotAvailable() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.orion.notein.domain.models.cloudsync.CloudSyncError
        public String getErrorCode() {
            return this.errorCode;
        }

        @Override // com.orion.notein.domain.models.cloudsync.CloudSyncError
        /* JADX INFO: renamed from: isGlobalError, reason: from getter */
        public boolean getIsGlobalError() {
            return this.isGlobalError;
        }

        public HmsComponentNotAvailable(Throwable th) {
            super(th, null);
            this.errorCode = CloudSyncError.CODE_HW_COMPONENT_NOT_AVAILABLE;
            this.isGlobalError = true;
        }

        public /* synthetic */ HmsComponentNotAvailable(Throwable th, int i, C24018OooO0oo c24018OooO0oo) {
            this((i & 1) != 0 ? null : th);
        }
    }

    @Metadata(m80611d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\f¨\u0006\r"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/CloudSyncError$Internal;", "Lcom/orion/notein/domain/models/cloudsync/CloudSyncError;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "errorCode", "", "getErrorCode", "()Ljava/lang/String;", "isRetryable", "", "()Z", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class Internal extends CloudSyncError {
        private final String errorCode;
        private final boolean isRetryable;

        /* JADX WARN: Multi-variable type inference failed */
        public Internal() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.orion.notein.domain.models.cloudsync.CloudSyncError
        public String getErrorCode() {
            return this.errorCode;
        }

        @Override // com.orion.notein.domain.models.cloudsync.CloudSyncError
        /* JADX INFO: renamed from: isRetryable, reason: from getter */
        public boolean getIsRetryable() {
            return this.isRetryable;
        }

        public Internal(Throwable th) {
            super(th, null);
            this.errorCode = CloudSyncError.CODE_INTERNAL;
            this.isRetryable = true;
        }

        public /* synthetic */ Internal(Throwable th, int i, C24018OooO0oo c24018OooO0oo) {
            this((i & 1) != 0 ? null : th);
        }
    }

    @Metadata(m80611d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\fR\u0014\u0010\r\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u000e"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/CloudSyncError$LockBusy;", "Lcom/orion/notein/domain/models/cloudsync/CloudSyncError;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "errorCode", "", "getErrorCode", "()Ljava/lang/String;", "isRetryable", "", "()Z", "isGlobalError", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class LockBusy extends CloudSyncError {
        private final String errorCode;
        private final boolean isGlobalError;
        private final boolean isRetryable;

        /* JADX WARN: Multi-variable type inference failed */
        public LockBusy() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.orion.notein.domain.models.cloudsync.CloudSyncError
        public String getErrorCode() {
            return this.errorCode;
        }

        @Override // com.orion.notein.domain.models.cloudsync.CloudSyncError
        /* JADX INFO: renamed from: isGlobalError, reason: from getter */
        public boolean getIsGlobalError() {
            return this.isGlobalError;
        }

        @Override // com.orion.notein.domain.models.cloudsync.CloudSyncError
        /* JADX INFO: renamed from: isRetryable, reason: from getter */
        public boolean getIsRetryable() {
            return this.isRetryable;
        }

        public LockBusy(Throwable th) {
            super(th, null);
            this.errorCode = CloudSyncError.CODE_LOCK_BUSY;
            this.isRetryable = true;
            this.isGlobalError = true;
        }

        public /* synthetic */ LockBusy(Throwable th, int i, C24018OooO0oo c24018OooO0oo) {
            this((i & 1) != 0 ? null : th);
        }
    }

    @Metadata(m80611d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\fR\u0014\u0010\r\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u000e"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/CloudSyncError$LockExpired;", "Lcom/orion/notein/domain/models/cloudsync/CloudSyncError;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "errorCode", "", "getErrorCode", "()Ljava/lang/String;", "isRetryable", "", "()Z", "isGlobalError", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class LockExpired extends CloudSyncError {
        private final String errorCode;
        private final boolean isGlobalError;
        private final boolean isRetryable;

        /* JADX WARN: Multi-variable type inference failed */
        public LockExpired() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.orion.notein.domain.models.cloudsync.CloudSyncError
        public String getErrorCode() {
            return this.errorCode;
        }

        @Override // com.orion.notein.domain.models.cloudsync.CloudSyncError
        /* JADX INFO: renamed from: isGlobalError, reason: from getter */
        public boolean getIsGlobalError() {
            return this.isGlobalError;
        }

        @Override // com.orion.notein.domain.models.cloudsync.CloudSyncError
        /* JADX INFO: renamed from: isRetryable, reason: from getter */
        public boolean getIsRetryable() {
            return this.isRetryable;
        }

        public LockExpired(Throwable th) {
            super(th, null);
            this.errorCode = CloudSyncError.CODE_LOCK_EXPIRED;
            this.isRetryable = true;
            this.isGlobalError = true;
        }

        public /* synthetic */ LockExpired(Throwable th, int i, C24018OooO0oo c24018OooO0oo) {
            this((i & 1) != 0 ? null : th);
        }
    }

    @Metadata(m80611d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/CloudSyncError$MetaNotFound;", "Lcom/orion/notein/domain/models/cloudsync/CloudSyncError;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "errorCode", "", "getErrorCode", "()Ljava/lang/String;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class MetaNotFound extends CloudSyncError {
        private final String errorCode;

        /* JADX WARN: Multi-variable type inference failed */
        public MetaNotFound() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.orion.notein.domain.models.cloudsync.CloudSyncError
        public String getErrorCode() {
            return this.errorCode;
        }

        public MetaNotFound(Throwable th) {
            super(th, null);
            this.errorCode = CloudSyncError.CODE_META_NOT_FOUND;
        }

        public /* synthetic */ MetaNotFound(Throwable th, int i, C24018OooO0oo c24018OooO0oo) {
            this((i & 1) != 0 ? null : th);
        }
    }

    @Metadata(m80611d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/CloudSyncError$MetaVersionMismatch;", "Lcom/orion/notein/domain/models/cloudsync/CloudSyncError;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "errorCode", "", "getErrorCode", "()Ljava/lang/String;", "requiresConflictResolution", "", "getRequiresConflictResolution", "()Z", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class MetaVersionMismatch extends CloudSyncError {
        private final String errorCode;
        private final boolean requiresConflictResolution;

        /* JADX WARN: Multi-variable type inference failed */
        public MetaVersionMismatch() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.orion.notein.domain.models.cloudsync.CloudSyncError
        public String getErrorCode() {
            return this.errorCode;
        }

        @Override // com.orion.notein.domain.models.cloudsync.CloudSyncError
        public boolean getRequiresConflictResolution() {
            return this.requiresConflictResolution;
        }

        public MetaVersionMismatch(Throwable th) {
            super(th, null);
            this.errorCode = CloudSyncError.CODE_META_VERSION_MISMATCH;
            this.requiresConflictResolution = true;
        }

        public /* synthetic */ MetaVersionMismatch(Throwable th, int i, C24018OooO0oo c24018OooO0oo) {
            this((i & 1) != 0 ? null : th);
        }
    }

    @Metadata(m80611d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\fR\u0014\u0010\r\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u000e"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/CloudSyncError$Network;", "Lcom/orion/notein/domain/models/cloudsync/CloudSyncError;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "errorCode", "", "getErrorCode", "()Ljava/lang/String;", "isRetryable", "", "()Z", "isGlobalError", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class Network extends CloudSyncError {
        private final String errorCode;
        private final boolean isGlobalError;
        private final boolean isRetryable;

        /* JADX WARN: Multi-variable type inference failed */
        public Network() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.orion.notein.domain.models.cloudsync.CloudSyncError
        public String getErrorCode() {
            return this.errorCode;
        }

        @Override // com.orion.notein.domain.models.cloudsync.CloudSyncError
        /* JADX INFO: renamed from: isGlobalError, reason: from getter */
        public boolean getIsGlobalError() {
            return this.isGlobalError;
        }

        @Override // com.orion.notein.domain.models.cloudsync.CloudSyncError
        /* JADX INFO: renamed from: isRetryable, reason: from getter */
        public boolean getIsRetryable() {
            return this.isRetryable;
        }

        public Network(Throwable th) {
            super(th, null);
            this.errorCode = CloudSyncError.CODE_NETWORK;
            this.isRetryable = true;
            this.isGlobalError = true;
        }

        public /* synthetic */ Network(Throwable th, int i, C24018OooO0oo c24018OooO0oo) {
            this((i & 1) != 0 ? null : th);
        }
    }

    @Metadata(m80611d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/CloudSyncError$NotInitialized;", "Lcom/orion/notein/domain/models/cloudsync/CloudSyncError;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "errorCode", "", "getErrorCode", "()Ljava/lang/String;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class NotInitialized extends CloudSyncError {
        private final String errorCode;

        /* JADX WARN: Multi-variable type inference failed */
        public NotInitialized() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.orion.notein.domain.models.cloudsync.CloudSyncError
        public String getErrorCode() {
            return this.errorCode;
        }

        public NotInitialized(Throwable th) {
            super(th, null);
            this.errorCode = CloudSyncError.CODE_NOT_INITIALIZED;
        }

        public /* synthetic */ NotInitialized(Throwable th, int i, C24018OooO0oo c24018OooO0oo) {
            this((i & 1) != 0 ? null : th);
        }
    }

    @Metadata(m80611d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\f¨\u0006\r"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/CloudSyncError$NoteinAuthFailed;", "Lcom/orion/notein/domain/models/cloudsync/CloudSyncError;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "errorCode", "", "getErrorCode", "()Ljava/lang/String;", "isGlobalError", "", "()Z", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class NoteinAuthFailed extends CloudSyncError {
        private final String errorCode;
        private final boolean isGlobalError;

        /* JADX WARN: Multi-variable type inference failed */
        public NoteinAuthFailed() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.orion.notein.domain.models.cloudsync.CloudSyncError
        public String getErrorCode() {
            return this.errorCode;
        }

        @Override // com.orion.notein.domain.models.cloudsync.CloudSyncError
        /* JADX INFO: renamed from: isGlobalError, reason: from getter */
        public boolean getIsGlobalError() {
            return this.isGlobalError;
        }

        public NoteinAuthFailed(Throwable th) {
            super(th, null);
            this.errorCode = CloudSyncError.CODE_NOTEIN_AUTH_FAILED;
            this.isGlobalError = true;
        }

        public /* synthetic */ NoteinAuthFailed(Throwable th, int i, C24018OooO0oo c24018OooO0oo) {
            this((i & 1) != 0 ? null : th);
        }
    }

    @Metadata(m80611d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\f¨\u0006\r"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/CloudSyncError$RemoteDisabled;", "Lcom/orion/notein/domain/models/cloudsync/CloudSyncError;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "errorCode", "", "getErrorCode", "()Ljava/lang/String;", "isGlobalError", "", "()Z", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class RemoteDisabled extends CloudSyncError {
        private final String errorCode;
        private final boolean isGlobalError;

        /* JADX WARN: Multi-variable type inference failed */
        public RemoteDisabled() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.orion.notein.domain.models.cloudsync.CloudSyncError
        public String getErrorCode() {
            return this.errorCode;
        }

        @Override // com.orion.notein.domain.models.cloudsync.CloudSyncError
        /* JADX INFO: renamed from: isGlobalError, reason: from getter */
        public boolean getIsGlobalError() {
            return this.isGlobalError;
        }

        public RemoteDisabled(Throwable th) {
            super(th, null);
            this.errorCode = CloudSyncError.CODE_REMOTE_DISABLED;
            this.isGlobalError = true;
        }

        public /* synthetic */ RemoteDisabled(Throwable th, int i, C24018OooO0oo c24018OooO0oo) {
            this((i & 1) != 0 ? null : th);
        }
    }

    @Metadata(m80611d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/CloudSyncError$ResetStuck;", "Lcom/orion/notein/domain/models/cloudsync/CloudSyncError;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "errorCode", "", "getErrorCode", "()Ljava/lang/String;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class ResetStuck extends CloudSyncError {
        private final String errorCode;

        /* JADX WARN: Multi-variable type inference failed */
        public ResetStuck() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.orion.notein.domain.models.cloudsync.CloudSyncError
        public String getErrorCode() {
            return this.errorCode;
        }

        public ResetStuck(Throwable th) {
            super(th, null);
            this.errorCode = CloudSyncError.CODE_RESET_STUCK;
        }

        public /* synthetic */ ResetStuck(Throwable th, int i, C24018OooO0oo c24018OooO0oo) {
            this((i & 1) != 0 ? null : th);
        }
    }

    @Metadata(m80611d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/CloudSyncError$ResourceNotFound;", "Lcom/orion/notein/domain/models/cloudsync/CloudSyncError;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "errorCode", "", "getErrorCode", "()Ljava/lang/String;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class ResourceNotFound extends CloudSyncError {
        private final String errorCode;

        /* JADX WARN: Multi-variable type inference failed */
        public ResourceNotFound() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.orion.notein.domain.models.cloudsync.CloudSyncError
        public String getErrorCode() {
            return this.errorCode;
        }

        public ResourceNotFound(Throwable th) {
            super(th, null);
            this.errorCode = CloudSyncError.CODE_RESOURCE_NOT_FOUND;
        }

        public /* synthetic */ ResourceNotFound(Throwable th, int i, C24018OooO0oo c24018OooO0oo) {
            this((i & 1) != 0 ? null : th);
        }
    }

    @Metadata(m80611d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\f¨\u0006\r"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/CloudSyncError$ServerTemporary;", "Lcom/orion/notein/domain/models/cloudsync/CloudSyncError;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "errorCode", "", "getErrorCode", "()Ljava/lang/String;", "isRetryable", "", "()Z", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class ServerTemporary extends CloudSyncError {
        private final String errorCode;
        private final boolean isRetryable;

        /* JADX WARN: Multi-variable type inference failed */
        public ServerTemporary() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.orion.notein.domain.models.cloudsync.CloudSyncError
        public String getErrorCode() {
            return this.errorCode;
        }

        @Override // com.orion.notein.domain.models.cloudsync.CloudSyncError
        /* JADX INFO: renamed from: isRetryable, reason: from getter */
        public boolean getIsRetryable() {
            return this.isRetryable;
        }

        public ServerTemporary(Throwable th) {
            super(th, null);
            this.errorCode = CloudSyncError.CODE_SERVER_TEMPORARY;
            this.isRetryable = true;
        }

        public /* synthetic */ ServerTemporary(Throwable th, int i, C24018OooO0oo c24018OooO0oo) {
            this((i & 1) != 0 ? null : th);
        }
    }

    @Metadata(m80611d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\fR\u0014\u0010\r\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u000e"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/CloudSyncError$StorageFull;", "Lcom/orion/notein/domain/models/cloudsync/CloudSyncError;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "errorCode", "", "getErrorCode", "()Ljava/lang/String;", "isRetryable", "", "()Z", "isGlobalError", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class StorageFull extends CloudSyncError {
        private final String errorCode;
        private final boolean isGlobalError;
        private final boolean isRetryable;

        /* JADX WARN: Multi-variable type inference failed */
        public StorageFull() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.orion.notein.domain.models.cloudsync.CloudSyncError
        public String getErrorCode() {
            return this.errorCode;
        }

        @Override // com.orion.notein.domain.models.cloudsync.CloudSyncError
        /* JADX INFO: renamed from: isGlobalError, reason: from getter */
        public boolean getIsGlobalError() {
            return this.isGlobalError;
        }

        @Override // com.orion.notein.domain.models.cloudsync.CloudSyncError
        /* JADX INFO: renamed from: isRetryable, reason: from getter */
        public boolean getIsRetryable() {
            return this.isRetryable;
        }

        public StorageFull(Throwable th) {
            super(th, null);
            this.errorCode = CloudSyncError.CODE_STORAGE_FULL;
            this.isGlobalError = true;
        }

        public /* synthetic */ StorageFull(Throwable th, int i, C24018OooO0oo c24018OooO0oo) {
            this((i & 1) != 0 ? null : th);
        }
    }

    @Metadata(m80611d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/CloudSyncError$UnknownContentSource;", "Lcom/orion/notein/domain/models/cloudsync/CloudSyncError;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "errorCode", "", "getErrorCode", "()Ljava/lang/String;", "requiresConflictResolution", "", "getRequiresConflictResolution", "()Z", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class UnknownContentSource extends CloudSyncError {
        private final String errorCode;
        private final boolean requiresConflictResolution;

        /* JADX WARN: Multi-variable type inference failed */
        public UnknownContentSource() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.orion.notein.domain.models.cloudsync.CloudSyncError
        public String getErrorCode() {
            return this.errorCode;
        }

        @Override // com.orion.notein.domain.models.cloudsync.CloudSyncError
        public boolean getRequiresConflictResolution() {
            return this.requiresConflictResolution;
        }

        public UnknownContentSource(Throwable th) {
            super(th, null);
            this.errorCode = CloudSyncError.CODE_UNKNOWN_CONTENT_SOURCE;
            this.requiresConflictResolution = true;
        }

        public /* synthetic */ UnknownContentSource(Throwable th, int i, C24018OooO0oo c24018OooO0oo) {
            this((i & 1) != 0 ? null : th);
        }
    }

    @Metadata(m80611d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/CloudSyncError$VersionIncompatible;", "Lcom/orion/notein/domain/models/cloudsync/CloudSyncError;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "errorCode", "", "getErrorCode", "()Ljava/lang/String;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class VersionIncompatible extends CloudSyncError {
        private final String errorCode;

        /* JADX WARN: Multi-variable type inference failed */
        public VersionIncompatible() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.orion.notein.domain.models.cloudsync.CloudSyncError
        public String getErrorCode() {
            return this.errorCode;
        }

        public VersionIncompatible(Throwable th) {
            super(th, null);
            this.errorCode = CloudSyncError.CODE_APP_VERSION_INCOMPATIBLE;
        }

        public /* synthetic */ VersionIncompatible(Throwable th, int i, C24018OooO0oo c24018OooO0oo) {
            this((i & 1) != 0 ? null : th);
        }
    }

    @Metadata(m80611d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m80612d2 = {"Lcom/orion/notein/domain/models/cloudsync/CloudSyncError$VersionUnknown;", "Lcom/orion/notein/domain/models/cloudsync/CloudSyncError;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "errorCode", "", "getErrorCode", "()Ljava/lang/String;", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
    public static final class VersionUnknown extends CloudSyncError {
        private final String errorCode;

        /* JADX WARN: Multi-variable type inference failed */
        public VersionUnknown() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.orion.notein.domain.models.cloudsync.CloudSyncError
        public String getErrorCode() {
            return this.errorCode;
        }

        public VersionUnknown(Throwable th) {
            super(th, null);
            this.errorCode = CloudSyncError.CODE_VERSION_UNKNOWN;
        }

        public /* synthetic */ VersionUnknown(Throwable th, int i, C24018OooO0oo c24018OooO0oo) {
            this((i & 1) != 0 ? null : th);
        }
    }

    public /* synthetic */ CloudSyncError(Throwable th, C24018OooO0oo c24018OooO0oo) {
        this(th);
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    public abstract String getErrorCode();

    public boolean getRequiresConflictResolution() {
        return this.requiresConflictResolution;
    }

    /* JADX INFO: renamed from: isGlobalError, reason: from getter */
    public boolean getIsGlobalError() {
        return this.isGlobalError;
    }

    /* JADX INFO: renamed from: isRetryable, reason: from getter */
    public boolean getIsRetryable() {
        return this.isRetryable;
    }

    public /* synthetic */ CloudSyncError(Throwable th, int i, C24018OooO0oo c24018OooO0oo) {
        this((i & 1) != 0 ? null : th, null);
    }

    private CloudSyncError(Throwable th) {
        super(th);
        this.cause = th;
    }
}
