package com.hihonor.cloudservice.framework.aidl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public class DataBuffer implements Parcelable {
    public static final Parcelable.Creator<DataBuffer> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final String f68814OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f68815OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public Bundle f68816OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Bundle f68817OooOoO0;

    public class OooO00o implements Parcelable.Creator<DataBuffer> {
        @Override // android.os.Parcelable.Creator
        public final DataBuffer createFromParcel(Parcel parcel) {
            return new DataBuffer(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final DataBuffer[] newArray(int i) {
            return new DataBuffer[i];
        }
    }

    public DataBuffer(Parcel parcel) {
        this.f68817OooOoO0 = null;
        this.f68816OooOoO = null;
        this.f68815OooOo0o = parcel.readInt();
        this.f68814OooOo = parcel.readString();
        this.f68817OooOoO0 = parcel.readBundle(Bundle.class.getClassLoader());
        this.f68816OooOoO = parcel.readBundle(Bundle.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f68815OooOo0o);
        parcel.writeString(this.f68814OooOo);
        parcel.writeBundle(this.f68817OooOoO0);
        parcel.writeBundle(this.f68816OooOoO);
    }

    public DataBuffer() {
        this.f68817OooOoO0 = null;
        this.f68816OooOoO = null;
        this.f68814OooOo = "honorid.silentsignin";
        this.f68815OooOo0o = 1001;
    }
}
