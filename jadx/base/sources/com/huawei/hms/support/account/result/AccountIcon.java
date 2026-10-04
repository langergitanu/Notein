package com.huawei.hms.support.account.result;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public class AccountIcon implements Parcelable {
    public static final Parcelable.Creator<AccountIcon> CREATOR = new Parcelable.Creator<AccountIcon>() { // from class: com.huawei.hms.support.account.result.AccountIcon.1
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AccountIcon createFromParcel(Parcel parcel) {
            return new AccountIcon(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public AccountIcon[] newArray(int i) {
            return new AccountIcon[i];
        }
    };

    /* JADX INFO: renamed from: a */
    private String f56888a;

    /* JADX INFO: renamed from: b */
    private Bitmap f56889b;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getDescription() {
        return this.f56888a;
    }

    public Bitmap getIcon() {
        return this.f56889b;
    }

    public void setDescription(String str) {
        this.f56888a = str;
    }

    public void setIcon(Bitmap bitmap) {
        this.f56889b = bitmap;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f56888a);
        parcel.writeParcelable(this.f56889b, i);
    }

    public AccountIcon() {
    }

    private AccountIcon(Parcel parcel) {
        this.f56888a = parcel.readString();
        this.f56889b = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
    }

    public AccountIcon(String str, Bitmap bitmap) {
        this.f56888a = str;
        this.f56889b = bitmap;
    }
}
