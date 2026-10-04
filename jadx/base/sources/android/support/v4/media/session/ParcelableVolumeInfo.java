package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f62214OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f62215OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f62216OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f62217OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f62218OooOoOO;

    public static class OooO00o implements Parcelable.Creator<ParcelableVolumeInfo> {
        @Override // android.os.Parcelable.Creator
        public final ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo();
            parcelableVolumeInfo.f62215OooOo0o = parcel.readInt();
            parcelableVolumeInfo.f62217OooOoO0 = parcel.readInt();
            parcelableVolumeInfo.f62216OooOoO = parcel.readInt();
            parcelableVolumeInfo.f62218OooOoOO = parcel.readInt();
            parcelableVolumeInfo.f62214OooOo = parcel.readInt();
            return parcelableVolumeInfo;
        }

        @Override // android.os.Parcelable.Creator
        public final ParcelableVolumeInfo[] newArray(int i) {
            return new ParcelableVolumeInfo[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f62215OooOo0o);
        parcel.writeInt(this.f62217OooOoO0);
        parcel.writeInt(this.f62216OooOoO);
        parcel.writeInt(this.f62218OooOoOO);
        parcel.writeInt(this.f62214OooOo);
    }
}
