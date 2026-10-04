package com.oplus.ocs.base.common;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public class AuthResult implements Parcelable {
    public static final Parcelable.Creator<AuthResult> CREATOR = new Parcelable.Creator<AuthResult>() { // from class: com.oplus.ocs.base.common.AuthResult.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ AuthResult createFromParcel(Parcel parcel) {
            return new AuthResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ AuthResult[] newArray(int i) {
            return new AuthResult[i];
        }
    };

    /* JADX INFO: renamed from: a */
    private String f57437a;

    /* JADX INFO: renamed from: b */
    private int f57438b;

    /* JADX INFO: renamed from: c */
    private int f57439c;

    /* JADX INFO: renamed from: d */
    private int f57440d;

    /* JADX INFO: renamed from: e */
    private byte[] f57441e;

    public AuthResult(String str, int i, int i2, int i3, byte[] bArr) {
        this.f57437a = str;
        this.f57438b = i;
        this.f57439c = i2;
        this.f57440d = i3;
        this.f57441e = bArr;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getErrrorCode() {
        return this.f57440d;
    }

    public String getPackageName() {
        return this.f57437a;
    }

    public byte[] getPermitBits() {
        return this.f57441e;
    }

    public int getPid() {
        return this.f57439c;
    }

    public int getUid() {
        return this.f57438b;
    }

    public void setErrrorCode(int i) {
        this.f57440d = i;
    }

    public void setPackageName(String str) {
        this.f57437a = str;
    }

    public void setPermitBits(byte[] bArr) {
        this.f57441e = bArr;
    }

    public void setPid(int i) {
        this.f57439c = i;
    }

    public void setUid(int i) {
        this.f57438b = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f57437a);
        parcel.writeInt(this.f57438b);
        parcel.writeInt(this.f57439c);
        parcel.writeInt(this.f57440d);
        parcel.writeByteArray(this.f57441e);
    }

    public AuthResult(Parcel parcel) {
        this.f57437a = parcel.readString();
        this.f57438b = parcel.readInt();
        this.f57439c = parcel.readInt();
        this.f57440d = parcel.readInt();
        this.f57441e = parcel.createByteArray();
    }
}
