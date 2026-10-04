package com.hihonor.honorid.core.data;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public class ReadWhiteListInfo implements Parcelable {
    public static final Parcelable.Creator<ReadWhiteListInfo> CREATOR = new OooO00o();

    public class OooO00o implements Parcelable.Creator<ReadWhiteListInfo> {
        @Override // android.os.Parcelable.Creator
        public final ReadWhiteListInfo createFromParcel(Parcel parcel) {
            return new ReadWhiteListInfo();
        }

        @Override // android.os.Parcelable.Creator
        public final ReadWhiteListInfo[] newArray(int i) {
            return new ReadWhiteListInfo[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
    }
}
