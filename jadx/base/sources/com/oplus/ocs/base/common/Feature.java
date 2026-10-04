package com.oplus.ocs.base.common;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes9.dex */
public class Feature implements Parcelable {
    public static final Parcelable.Creator<Feature> CREATOR = new Parcelable.Creator<Feature>() { // from class: com.oplus.ocs.base.common.Feature.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Feature createFromParcel(Parcel parcel) {
            return new Feature(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Feature[] newArray(int i) {
            return new Feature[i];
        }
    };

    /* JADX INFO: renamed from: a */
    private String f57446a;

    /* JADX INFO: renamed from: b */
    private long f57447b;

    public Feature(String str, long j) {
        this.f57446a = str;
        this.f57447b = j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getName() {
        return this.f57446a;
    }

    public long getVersion() {
        long j = this.f57447b;
        if (j == -1) {
            return -1L;
        }
        return j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f57446a);
        parcel.writeLong(this.f57447b);
    }

    public Feature(Parcel parcel) {
        this.f57446a = parcel.readString();
        this.f57447b = parcel.readLong();
    }
}
