package com.vivo.penalgoengine.entity;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes10.dex */
public class TouchPoint implements Parcelable {
    public static final Parcelable.Creator<TouchPoint> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f80208OooOo = 1;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f80209OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public float f80210OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public float f80211OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public float f80212OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public long f80213OooOoo0;

    public class OooO00o implements Parcelable.Creator<TouchPoint> {
        @Override // android.os.Parcelable.Creator
        public final TouchPoint createFromParcel(Parcel parcel) {
            TouchPoint touchPoint = new TouchPoint();
            touchPoint.f80208OooOo = 1;
            touchPoint.f80209OooOo0o = parcel.readInt();
            touchPoint.f80208OooOo = parcel.readInt();
            touchPoint.f80211OooOoO0 = parcel.readFloat();
            touchPoint.f80210OooOoO = parcel.readFloat();
            touchPoint.f80212OooOoOO = parcel.readFloat();
            touchPoint.f80213OooOoo0 = parcel.readLong();
            return touchPoint;
        }

        @Override // android.os.Parcelable.Creator
        public final TouchPoint[] newArray(int i) {
            return new TouchPoint[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "TouchPoint{action=" + this.f80209OooOo0o + ", type=" + this.f80208OooOo + ", x=" + this.f80211OooOoO0 + ", y=" + this.f80210OooOoO + ", pressure=" + this.f80212OooOoOO + ", time=" + this.f80213OooOoo0 + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f80209OooOo0o);
        parcel.writeInt(this.f80208OooOo);
        parcel.writeFloat(this.f80211OooOoO0);
        parcel.writeFloat(this.f80210OooOoO);
        parcel.writeFloat(this.f80212OooOoOO);
        parcel.writeLong(this.f80213OooOoo0);
    }
}
