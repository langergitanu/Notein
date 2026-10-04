package com.hihonor.honorid.core.data;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public class UserAccountInfo implements Parcelable {
    public static final Parcelable.Creator<UserAccountInfo> CREATOR = new OooO00o();
    public static final String TAG_ACCOUNTVALID_STATUS = "accountValidStatus";
    public static final String TAG_ACCOUNT_STATE = "accountState";
    public static final String TAG_ACCOUNT_TYPE = "accountType";
    public static final String TAG_AGE = "age";
    public static final String TAG_MEMBERRIGHT = "memberRight";
    public static final String TAG_MEMBERRIGHTLIST = "memberRightList";
    public static final String TAG_MOBILEPHONE = "mobilePhone";
    public static final String TAG_MOBILE_PHONE_STATE = "mobilePhoneState";
    public static final String TAG_UPDATE_TIME = "updateTime";
    public static final String TAG_USERACCINFO = "userAcctInfo";
    public static final String TAG_USERACCTINFO_LIST = "userAcctInfoList";
    public static final String TAG_USEREMAIL = "userEMail";
    public static final String TAG_USER_ACCOUNT = "userAccount";
    public static final String TAG_USER_EMAIL_STATE = "emailState";

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f68899OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f68900OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public String f68901OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public String f68902OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public String f68903OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public String f68904OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public String f68905OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public String f68906OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public String f68907OooOooo;

    public class OooO00o implements Parcelable.Creator<UserAccountInfo> {
        @Override // android.os.Parcelable.Creator
        public final UserAccountInfo createFromParcel(Parcel parcel) {
            UserAccountInfo userAccountInfo = new UserAccountInfo();
            userAccountInfo.f68900OooOo0o = parcel.readString();
            userAccountInfo.f68899OooOo = parcel.readString();
            userAccountInfo.f68902OooOoO0 = parcel.readString();
            userAccountInfo.f68901OooOoO = parcel.readString();
            userAccountInfo.f68903OooOoOO = parcel.readString();
            userAccountInfo.f68905OooOoo0 = parcel.readString();
            userAccountInfo.f68904OooOoo = parcel.readString();
            userAccountInfo.f68906OooOooO = parcel.readString();
            userAccountInfo.f68907OooOooo = parcel.readString();
            return userAccountInfo;
        }

        @Override // android.os.Parcelable.Creator
        public final UserAccountInfo[] newArray(int i) {
            return new UserAccountInfo[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f68900OooOo0o);
        parcel.writeString(this.f68899OooOo);
        parcel.writeString(this.f68902OooOoO0);
        parcel.writeString(this.f68901OooOoO);
        parcel.writeString(this.f68903OooOoOO);
        parcel.writeString(this.f68905OooOoo0);
        parcel.writeString(this.f68904OooOoo);
        parcel.writeString(this.f68906OooOooO);
        parcel.writeString(this.f68907OooOooo);
    }
}
