package com.hihonor.honorid.core.data;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public class TmemberRight implements Parcelable {
    public static final Parcelable.Creator<TmemberRight> CREATOR = new OooO00o();
    public static final String TAG_DEVICEID = "deviceId";
    public static final String TAG_DEVICEID2 = "deviceID2";
    public static final String TAG_DEVICETYPE = "deviceType";
    public static final String TAG_EXPIREDDATE = "expiredDate";
    public static final String TAG_MEMBERBINDTIME = "memberBindTime";
    public static final String TAG_RIGHTSID = "rightsId";
    public static final String TAG_TERMINALTYPE = "terminalType";
    public static final String TAG_USERID = "userId";

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f68891OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public long f68892OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public String f68893OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public String f68894OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public String f68895OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public String f68896OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f68897OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public String f68898OooOooO;

    public class OooO00o implements Parcelable.Creator<TmemberRight> {
        @Override // android.os.Parcelable.Creator
        public final TmemberRight createFromParcel(Parcel parcel) {
            TmemberRight tmemberRight = new TmemberRight();
            tmemberRight.f68892OooOo0o = parcel.readLong();
            tmemberRight.f68891OooOo = parcel.readInt();
            tmemberRight.f68894OooOoO0 = parcel.readString();
            tmemberRight.f68893OooOoO = parcel.readString();
            tmemberRight.f68895OooOoOO = parcel.readString();
            tmemberRight.f68897OooOoo0 = parcel.readInt();
            tmemberRight.f68896OooOoo = parcel.readString();
            tmemberRight.f68898OooOooO = parcel.readString();
            return tmemberRight;
        }

        @Override // android.os.Parcelable.Creator
        public final TmemberRight[] newArray(int i) {
            return new TmemberRight[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f68892OooOo0o);
        parcel.writeInt(this.f68891OooOo);
        parcel.writeString(this.f68894OooOoO0);
        parcel.writeString(this.f68893OooOoO);
        parcel.writeString(this.f68895OooOoOO);
        parcel.writeInt(this.f68897OooOoo0);
        parcel.writeString(this.f68896OooOoo);
        parcel.writeString(this.f68898OooOooO);
    }
}
