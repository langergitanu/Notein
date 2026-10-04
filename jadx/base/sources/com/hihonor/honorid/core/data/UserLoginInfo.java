package com.hihonor.honorid.core.data;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public class UserLoginInfo implements Parcelable {
    public static final Parcelable.Creator<UserLoginInfo> CREATOR = new OooO00o();
    public static final String TAG_LASTLOGINTIME = "lastLoginTime";
    public static final String TAG_LAST_LOGINIP = "lastLoginIP";
    public static final String TAG_REGISTERCLIENT_IP = "registerClientIP";
    public static final String TAG_REGISTERFROM = "registerFrom";
    public static final String TAG_REGISTERTIME = "registerTime";
    public static final String TAG_REGISTER_CLIENTTYPE = "registerClientType";
    public static final String TAG_UNREGISTERTIME = "unRegisterTime";
    public static final String TAG_USER_ID = "userID";

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f68945OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f68946OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public String f68947OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public String f68948OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public String f68949OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public String f68950OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public String f68951OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public String f68952OooOooO;

    public class OooO00o implements Parcelable.Creator<UserLoginInfo> {
        @Override // android.os.Parcelable.Creator
        public final UserLoginInfo createFromParcel(Parcel parcel) {
            UserLoginInfo userLoginInfo = new UserLoginInfo();
            userLoginInfo.f68952OooOooO = parcel.readString();
            userLoginInfo.f68947OooOoO = parcel.readString();
            userLoginInfo.f68951OooOoo0 = parcel.readString();
            userLoginInfo.f68949OooOoOO = parcel.readString();
            userLoginInfo.f68950OooOoo = parcel.readString();
            userLoginInfo.f68945OooOo = parcel.readString();
            userLoginInfo.f68948OooOoO0 = parcel.readString();
            userLoginInfo.f68946OooOo0o = parcel.readString();
            return userLoginInfo;
        }

        @Override // android.os.Parcelable.Creator
        public final UserLoginInfo[] newArray(int i) {
            return new UserLoginInfo[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f68952OooOooO);
        parcel.writeString(this.f68947OooOoO);
        parcel.writeString(this.f68951OooOoo0);
        parcel.writeString(this.f68949OooOoOO);
        parcel.writeString(this.f68950OooOoo);
        parcel.writeString(this.f68945OooOo);
        parcel.writeString(this.f68948OooOoO0);
        parcel.writeString(this.f68946OooOo0o);
    }
}
