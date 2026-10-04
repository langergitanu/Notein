package com.hihonor.honorid.core.data;

import android.os.Parcel;
import android.os.Parcelable;
import o0O00.OooO0OO;

/* JADX INFO: loaded from: classes8.dex */
public class DeviceInfo implements Parcelable {
    public static final Parcelable.Creator<DeviceInfo> CREATOR = new OooO00o();
    public static final String TAG_DEVICE_ALIASNAME = "deviceAliasName";
    public static final String TAG_DEVICE_FREQUENTLYUSED = "frequentlyUsed";
    public static final String TAG_DEVICE_ID = "deviceID";
    public static final String TAG_DEVICE_INFO = "deviceInfo";
    public static final String TAG_DEVICE_INFO_LIST = "deviceIDList";
    public static final String TAG_DEVICE_LOGINTIME = "loginTime";
    public static final String TAG_DEVICE_LOGOUTTIME = "logoutTime";
    public static final String TAG_DEVICE_TYPE = "deviceType";
    public static final String TAG_TERMINALTYPE = "terminalType";
    public static final String TAG_UUID = "uuid";

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f68846OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f68847OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public String f68848OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public String f68849OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public String f68850OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public String f68851OooOoo = "";

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public String f68852OooOoo0;

    public class OooO00o implements Parcelable.Creator<DeviceInfo> {
        @Override // android.os.Parcelable.Creator
        public final DeviceInfo createFromParcel(Parcel parcel) {
            DeviceInfo deviceInfo = new DeviceInfo();
            deviceInfo.f68846OooOo = parcel.readString();
            deviceInfo.f68848OooOoO = parcel.readString();
            deviceInfo.f68847OooOo0o = parcel.readString();
            deviceInfo.f68849OooOoO0 = parcel.readString();
            deviceInfo.f68850OooOoOO = parcel.readString();
            deviceInfo.f68852OooOoo0 = parcel.readString();
            deviceInfo.f68851OooOoo = parcel.readString();
            return deviceInfo;
        }

        @Override // android.os.Parcelable.Creator
        public final DeviceInfo[] newArray(int i) {
            return new DeviceInfo[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{'mDeviceAliasName':");
        sb.append(OooO0OO.OooO00o(this.f68848OooOoO));
        sb.append(",'mDeviceId':");
        sb.append(OooO0OO.OooO00o(this.f68846OooOo));
        sb.append(",'mTerminalType':");
        sb.append(this.f68849OooOoO0);
        sb.append(",'mDeviceType':");
        sb.append(this.f68847OooOo0o);
        sb.append(",'mLoginTime':");
        sb.append(this.f68850OooOoOO);
        sb.append(",'mLogoutTime':");
        sb.append(this.f68852OooOoo0);
        sb.append(",'mFrequentlyUsed':");
        return androidx.concurrent.futures.OooO00o.OooO0OO(sb, this.f68851OooOoo, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f68846OooOo);
        parcel.writeString(this.f68848OooOoO);
        parcel.writeString(this.f68847OooOo0o);
        parcel.writeString(this.f68849OooOoO0);
        parcel.writeString(this.f68850OooOoOO);
        parcel.writeString(this.f68852OooOoo0);
        parcel.writeString(this.f68851OooOoo);
    }
}
