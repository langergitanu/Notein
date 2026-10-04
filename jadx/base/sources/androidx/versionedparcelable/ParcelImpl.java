package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import o00O000o.OooO0O0;
import o00O000o.OooO0OO;

/* JADX INFO: loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new OooO00o();

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final OooO0OO f66510OooOo0o;

    public static class OooO00o implements Parcelable.Creator<ParcelImpl> {
        @Override // android.os.Parcelable.Creator
        public final ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ParcelImpl[] newArray(int i) {
            return new ParcelImpl[i];
        }
    }

    public ParcelImpl(Parcel parcel) {
        this.f66510OooOo0o = new OooO0O0(parcel).OooOOO0();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new OooO0O0(parcel).OooOo0O(this.f66510OooOo0o);
    }
}
