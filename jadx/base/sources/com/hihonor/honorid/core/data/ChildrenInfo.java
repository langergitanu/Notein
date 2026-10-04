package com.hihonor.honorid.core.data;

import android.os.Parcel;
import android.os.Parcelable;
import o0O00.OooO0OO;

/* JADX INFO: loaded from: classes8.dex */
public class ChildrenInfo implements Parcelable {
    public static final Parcelable.Creator<ChildrenInfo> CREATOR = new OooO00o();
    public static final String TAG_ACCOUNT_LOGIN_USER_NAME = "loginUserName";
    public static final String TAG_ACCOUNT_NAME = "accountname";
    public static final String TAG_ACCOUNT_NICK_NAME = "nickName";
    public static final String TAG_BIRTH_DATE = "birthDate";
    public static final String TAG_CHILDREN_INFO = "children";
    public static final String TAG_CHILDREN_INFO_LIST = "childrenList";
    public static final String TAG_CHILDREN_USER_ID = "childrenUserId";
    public static final String TAG_HEAD_PICTURE_URL = "headPictureUrl";
    public static final String TAG_UNI_NICK_NAME = "uniquelyNickname";

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f68839OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f68840OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public String f68841OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public String f68842OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public String f68843OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public String f68844OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public String f68845OooOoo0;

    public class OooO00o implements Parcelable.Creator<ChildrenInfo> {
        @Override // android.os.Parcelable.Creator
        public final ChildrenInfo createFromParcel(Parcel parcel) {
            ChildrenInfo childrenInfo = new ChildrenInfo();
            childrenInfo.f68840OooOo0o = parcel.readString();
            childrenInfo.f68839OooOo = parcel.readString();
            childrenInfo.f68842OooOoO0 = parcel.readString();
            childrenInfo.f68841OooOoO = parcel.readString();
            childrenInfo.f68843OooOoOO = parcel.readString();
            childrenInfo.f68845OooOoo0 = parcel.readString();
            childrenInfo.f68844OooOoo = parcel.readString();
            return childrenInfo;
        }

        @Override // android.os.Parcelable.Creator
        public final ChildrenInfo[] newArray(int i) {
            return new ChildrenInfo[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "{'childrenUserId':" + OooO0OO.OooO00o(this.f68840OooOo0o) + ",'birthDate':" + this.f68839OooOo + ",'uniquelyNickname':" + this.f68842OooOoO0 + ",'headPictureUrl':" + OooO0OO.OooO00o(this.f68843OooOoOO) + ",'accountName':" + this.f68841OooOoO + this.f68845OooOoo0 + OooO0OO.OooO00o(this.f68844OooOoo) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f68840OooOo0o);
        parcel.writeString(this.f68839OooOo);
        parcel.writeString(this.f68842OooOoO0);
        parcel.writeString(this.f68841OooOoO);
        parcel.writeString(this.f68843OooOoOO);
        parcel.writeString(this.f68845OooOoo0);
        parcel.writeString(this.f68844OooOoo);
    }
}
