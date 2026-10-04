package com.orion.notein.domain.models.backup;

import OooO0Oo.C20398OooO0O0;
import OooOooo.C20785Oooo00o;
import android.os.Bundle;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.C24018OooO0oo;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m80611d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m80612d2 = {"Lcom/orion/notein/domain/models/backup/BackupEvent;", "", "what", "", "result", Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/os/Bundle;", "<init>", "(IILandroid/os/Bundle;)V", "getWhat", "()I", "getResult", "getData", "()Landroid/os/Bundle;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "app_google_playRelease"}, m80613k = 1, m80614mv = {2, 1, 0}, m80616xi = 48)
public final /* data */ class BackupEvent {
    public static final int ERROR_BACKUP_FILE_CORRUPTED = -3;
    public static final int ERROR_BACKUP_FILE_NOT_FOUND = -2;
    public static final int ERROR_CAPACITY_FULL = -107;
    public static final int ERROR_DELETE_FAILED = -200;
    public static final int ERROR_DOWNLOAD_FAILED = -202;
    public static final int ERROR_FILE_ALREADY_EXIST = -104;
    public static final int ERROR_FILE_NOT_EXIST = -103;
    public static final int ERROR_GUID_NOT_EXIST = -109;
    public static final int ERROR_INVALID_FILENAME = -110;
    public static final int ERROR_INVALID_TOKEN = -101;
    public static final int ERROR_INVALID_VENDOR = -100;
    public static final int ERROR_IN_FILE_DB_VERSION_BIG_THAN_LOCAL = -111;
    public static final int ERROR_LOCAL_DISK_FULL = -105;
    public static final int ERROR_NO_BACKUP_DATA_TO_BE_GENERATED = -8;
    public static final int ERROR_NO_DATA_SUCCESSFULLY_BACKED_UP = -4;
    public static final int ERROR_NO_DATA_SUCCESSFULLY_RECOVERED = -5;
    public static final int ERROR_NO_DATA_TO_BACK_UP = -6;
    public static final int ERROR_NO_DATA_TO_RECOVER = -7;
    public static final int ERROR_OPEN_FILE_FAILED = -9;
    public static final int ERROR_OTHER = -999;
    public static final int ERROR_REMOTE_DISK_FULL = -106;
    public static final int ERROR_TOKEN_EXPIRED = -102;
    public static final int ERROR_UID_NOT_EXIST = -108;
    public static final int ERROR_UPLOAD_FAILED = -201;
    public static final int EVENT_BACKUP = 5;
    public static final int EVENT_CLOUD_AUTH = 2;
    public static final int EVENT_CLOUD_DELETE = 4;
    public static final int EVENT_CLOUD_UPLOAD = 3;
    public static final int EVENT_RECOVER = 1;
    public static final int RESULT_OK = 0;
    private final Bundle data;
    private final int result;
    private final int what;

    public BackupEvent(int i, int i2, Bundle bundle) {
        this.what = i;
        this.result = i2;
        this.data = bundle;
    }

    public static /* synthetic */ BackupEvent copy$default(BackupEvent backupEvent, int i, int i2, Bundle bundle, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = backupEvent.what;
        }
        if ((i3 & 2) != 0) {
            i2 = backupEvent.result;
        }
        if ((i3 & 4) != 0) {
            bundle = backupEvent.data;
        }
        return backupEvent.copy(i, i2, bundle);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getWhat() {
        return this.what;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getResult() {
        return this.result;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Bundle getData() {
        return this.data;
    }

    public final BackupEvent copy(int what, int result, Bundle data) {
        return new BackupEvent(what, result, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BackupEvent)) {
            return false;
        }
        BackupEvent backupEvent = (BackupEvent) other;
        return this.what == backupEvent.what && this.result == backupEvent.result && OooOOO0.OooO0O0(this.data, backupEvent.data);
    }

    public final Bundle getData() {
        return this.data;
    }

    public final int getResult() {
        return this.result;
    }

    public final int getWhat() {
        return this.what;
    }

    public int hashCode() {
        int iOooO00o = C20785Oooo00o.OooO00o(this.result, Integer.hashCode(this.what) * 31, 31);
        Bundle bundle = this.data;
        return iOooO00o + (bundle == null ? 0 : bundle.hashCode());
    }

    public String toString() {
        int i = this.what;
        int i2 = this.result;
        Bundle bundle = this.data;
        StringBuilder sbOooO0O0 = C20398OooO0O0.OooO0O0("BackupEvent(what=", i, ", result=", ", data=", i2);
        sbOooO0O0.append(bundle);
        sbOooO0O0.append(")");
        return sbOooO0O0.toString();
    }

    public /* synthetic */ BackupEvent(int i, int i2, Bundle bundle, int i3, C24018OooO0oo c24018OooO0oo) {
        this(i, i2, (i3 & 4) != 0 ? null : bundle);
    }
}
