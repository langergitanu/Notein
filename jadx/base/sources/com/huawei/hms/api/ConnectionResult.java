package com.huawei.hms.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import com.alipay.share.sdk.openapi.APMediaMessage;
import com.huawei.hms.common.internal.Objects;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.orion.notein.data.service.dto.MaterialPurchaseStatusResponse;
import com.orion.notein.domain.models.cloudsync.CloudSyncError;

/* JADX INFO: loaded from: classes6.dex */
public final class ConnectionResult implements Parcelable {
    public static final int API_UNAVAILABLE = 1000;
    public static final int BINDFAIL_RESOLUTION_BACKGROUND = 7;
    public static final int BINDFAIL_RESOLUTION_REQUIRED = 6;
    public static final int CANCELED = 13;
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new C17719a();
    public static final int DEVELOPER_ERROR = 10;
    public static final int DRIVE_EXTERNAL_STORAGE_REQUIRED = 9002;
    public static final int INTERNAL_ERROR = 8;
    public static final int INTERRUPTED = 15;
    public static final int INVALID_ACCOUNT = 5;
    public static final int LICENSE_CHECK_FAILED = 11;
    public static final int NETWORK_ERROR = 9000;
    public static final int RESOLUTION_REQUIRED = 9001;
    public static final int RESTRICTED_PROFILE = 9003;
    public static final int SERVICE_DISABLED = 3;
    public static final int SERVICE_INVALID = 9;
    public static final int SERVICE_MISSING = 1;
    public static final int SERVICE_MISSING_PERMISSION = 19;
    public static final int SERVICE_UNSUPPORTED = 21;
    public static final int SERVICE_UPDATING = 9004;
    public static final int SERVICE_VERSION_UPDATE_REQUIRED = 2;
    public static final int SIGN_IN_FAILED = 9005;
    public static final int SIGN_IN_REQUIRED = 4;
    public static final int SUCCESS = 0;
    public static final int TIMEOUT = 14;

    /* JADX INFO: renamed from: a */
    private int f52408a;

    /* JADX INFO: renamed from: b */
    private PendingIntent f52409b;

    /* JADX INFO: renamed from: c */
    private String f52410c;

    /* JADX INFO: renamed from: d */
    private int f52411d;

    /* JADX INFO: renamed from: com.huawei.hms.api.ConnectionResult$a */
    public static class C17719a implements Parcelable.Creator<ConnectionResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ConnectionResult createFromParcel(Parcel parcel) {
            return new ConnectionResult(parcel, (C17719a) null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ConnectionResult[] newArray(int i) {
            return new ConnectionResult[i];
        }
    }

    public /* synthetic */ ConnectionResult(Parcel parcel, C17719a c17719a) {
        this(parcel);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v16, types: [java.lang.String, void] */
    /* JADX INFO: renamed from: a */
    public static String m75763a(int i) {
        if (i == -1) {
            return GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
        if (i == 0) {
            return MaterialPurchaseStatusResponse.STATUS_SUCCESS;
        }
        if (i == 1) {
            return "SERVICE_MISSING";
        }
        if (i == 2) {
            return "SERVICE_VERSION_UPDATE_REQUIRED";
        }
        if (i == 3) {
            return "SERVICE_DISABLED";
        }
        if (i == 13) {
            return "CANCELED";
        }
        if (i == 14) {
            return "TIMEOUT";
        }
        if (i == 19) {
            return "SERVICE_MISSING_PERMISSION";
        }
        if (i == 21) {
            return "API_VERSION_UPDATE_REQUIRED";
        }
        switch (i) {
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return CloudSyncError.CODE_INTERNAL;
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                return APMediaMessage.IMediaObject.serialize(i);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if ((obj instanceof ConnectionResult) && this.f52408a == ((ConnectionResult) obj).f52408a && this.f52411d == ((ConnectionResult) obj).f52411d && this.f52410c.equals(((ConnectionResult) obj).f52410c)) {
                if (this.f52409b.equals(((ConnectionResult) obj).f52409b)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public int getErrorCode() {
        return this.f52411d;
    }

    public final String getErrorMessage() {
        return this.f52410c;
    }

    public final PendingIntent getResolution() {
        return this.f52409b;
    }

    public final boolean hasResolution() {
        return HuaweiApiAvailability.getInstance().isUserResolvableError(this.f52411d, this.f52409b);
    }

    public int hashCode() {
        return Objects.hashCode(Long.valueOf(this.f52408a), Long.valueOf(getErrorCode()), getErrorMessage(), this.f52409b);
    }

    public final boolean isSuccess() {
        return this.f52411d == 0;
    }

    public final void startResolutionForResult(Activity activity, int i) throws IntentSender.SendIntentException {
        if (hasResolution()) {
            HuaweiApiAvailability.getInstance().resolveError(activity, this.f52411d, i, this.f52409b);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f52408a);
        parcel.writeInt(this.f52411d);
        parcel.writeString(this.f52410c);
        this.f52409b.writeToParcel(parcel, i);
    }

    public ConnectionResult(int i, int i2, PendingIntent pendingIntent, String str) {
        this.f52408a = i;
        this.f52411d = i2;
        this.f52409b = pendingIntent;
        this.f52410c = str;
    }

    public ConnectionResult(int i) {
        this(i, (PendingIntent) null);
    }

    public ConnectionResult(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, null);
    }

    public ConnectionResult(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str);
    }

    private ConnectionResult(Parcel parcel) {
        this.f52408a = 1;
        this.f52409b = null;
        this.f52410c = null;
        this.f52408a = parcel.readInt();
        this.f52411d = parcel.readInt();
        this.f52410c = parcel.readString();
        Parcelable parcelable = (Parcelable) PendingIntent.CREATOR.createFromParcel(parcel);
        if (parcelable != null) {
            this.f52409b = (PendingIntent) parcelable;
        }
    }
}
