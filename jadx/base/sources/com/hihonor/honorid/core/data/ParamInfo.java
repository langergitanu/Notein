package com.hihonor.honorid.core.data;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes8.dex */
public class ParamInfo implements Parcelable {
    public static final Parcelable.Creator<ParamInfo> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public String f68880OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public String f68881OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f68882OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public String f68883OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public String f68884OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public boolean f68885OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f68886OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public String f68887OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public String f68888OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public String f68889Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public String f68890Oooo00O;

    public class OooO00o implements Parcelable.Creator<ParamInfo> {
        @Override // android.os.Parcelable.Creator
        public final ParamInfo createFromParcel(Parcel parcel) {
            ParamInfo paramInfo = new ParamInfo();
            paramInfo.f68881OooOo0o = parcel.readString();
            paramInfo.f68880OooOo = parcel.readString();
            paramInfo.f68883OooOoO0 = parcel.readString();
            paramInfo.f68882OooOoO = parcel.readInt();
            paramInfo.f68884OooOoOO = parcel.readString();
            paramInfo.f68886OooOoo0 = parcel.readByte() != 0;
            paramInfo.f68885OooOoo = parcel.readByte() != 0;
            paramInfo.f68887OooOooO = parcel.readString();
            paramInfo.f68888OooOooo = parcel.readString();
            paramInfo.f68889Oooo000 = parcel.readString();
            paramInfo.f68890Oooo00O = parcel.readString();
            return paramInfo;
        }

        @Override // android.os.Parcelable.Creator
        public final ParamInfo[] newArray(int i) {
            return new ParamInfo[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f68881OooOo0o);
        parcel.writeString(this.f68880OooOo);
        parcel.writeString(this.f68883OooOoO0);
        parcel.writeInt(this.f68882OooOoO);
        parcel.writeString(this.f68884OooOoOO);
        parcel.writeByte(this.f68886OooOoo0 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f68885OooOoo ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f68887OooOooO);
        parcel.writeString(this.f68888OooOooo);
        parcel.writeString(this.f68889Oooo000);
        parcel.writeString(this.f68890Oooo00O);
    }
}
