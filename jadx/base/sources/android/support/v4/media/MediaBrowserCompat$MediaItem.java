package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class MediaBrowserCompat$MediaItem implements Parcelable {
    public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new OooO00o();
    public static final int FLAG_BROWSABLE = 1;
    public static final int FLAG_PLAYABLE = 2;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final MediaDescriptionCompat f62196OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f62197OooOo0o;

    public static class OooO00o implements Parcelable.Creator<MediaBrowserCompat$MediaItem> {
        @Override // android.os.Parcelable.Creator
        public final MediaBrowserCompat$MediaItem createFromParcel(Parcel parcel) {
            return new MediaBrowserCompat$MediaItem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final MediaBrowserCompat$MediaItem[] newArray(int i) {
            return new MediaBrowserCompat$MediaItem[i];
        }
    }

    public MediaBrowserCompat$MediaItem(Parcel parcel) {
        this.f62197OooOo0o = parcel.readInt();
        this.f62196OooOo = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "MediaItem{mFlags=" + this.f62197OooOo0o + ", mDescription=" + this.f62196OooOo + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f62197OooOo0o);
        this.f62196OooOo.writeToParcel(parcel, i);
    }
}
