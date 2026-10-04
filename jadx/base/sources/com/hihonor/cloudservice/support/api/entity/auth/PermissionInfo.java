package com.hihonor.cloudservice.support.api.entity.auth;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public class PermissionInfo implements Parcelable {
    public static final Parcelable.Creator<PermissionInfo> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f68822OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f68823OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public String f68824OooOoO0;

    public class OooO00o implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            PermissionInfo permissionInfo = new PermissionInfo();
            permissionInfo.f68823OooOo0o = parcel.readString();
            permissionInfo.f68822OooOo = parcel.readString();
            permissionInfo.f68824OooOoO0 = parcel.readString();
            return permissionInfo;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PermissionInfo[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f68823OooOo0o);
        parcel.writeString(this.f68822OooOo);
        parcel.writeString(this.f68824OooOoO0);
    }
}
