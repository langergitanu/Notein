package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new OooO00o();
    public static final int RATING_3_STARS = 3;
    public static final int RATING_4_STARS = 4;
    public static final int RATING_5_STARS = 5;
    public static final int RATING_HEART = 1;
    public static final int RATING_NONE = 0;
    public static final int RATING_PERCENTAGE = 6;
    public static final int RATING_THUMB_UP_DOWN = 2;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final float f62208OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f62209OooOo0o;

    public static class OooO00o implements Parcelable.Creator<RatingCompat> {
        @Override // android.os.Parcelable.Creator
        public final RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final RatingCompat[] newArray(int i) {
            return new RatingCompat[i];
        }
    }

    public RatingCompat(int i, float f) {
        this.f62209OooOo0o = i;
        this.f62208OooOo = f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.f62209OooOo0o;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.f62209OooOo0o);
        sb.append(" rating=");
        float f = this.f62208OooOo;
        sb.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f62209OooOo0o);
        parcel.writeFloat(this.f62208OooOo);
    }
}
