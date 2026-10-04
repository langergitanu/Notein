package android.support.v4.media;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;

/* JADX INFO: loaded from: classes.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;
    public static final String METADATA_KEY_ADVERTISEMENT = "android.media.metadata.ADVERTISEMENT";
    public static final String METADATA_KEY_ALBUM = "android.media.metadata.ALBUM";
    public static final String METADATA_KEY_ALBUM_ART = "android.media.metadata.ALBUM_ART";
    public static final String METADATA_KEY_ALBUM_ARTIST = "android.media.metadata.ALBUM_ARTIST";
    public static final String METADATA_KEY_ALBUM_ART_URI = "android.media.metadata.ALBUM_ART_URI";
    public static final String METADATA_KEY_ART = "android.media.metadata.ART";
    public static final String METADATA_KEY_ARTIST = "android.media.metadata.ARTIST";
    public static final String METADATA_KEY_ART_URI = "android.media.metadata.ART_URI";
    public static final String METADATA_KEY_AUTHOR = "android.media.metadata.AUTHOR";
    public static final String METADATA_KEY_BT_FOLDER_TYPE = "android.media.metadata.BT_FOLDER_TYPE";
    public static final String METADATA_KEY_COMPILATION = "android.media.metadata.COMPILATION";
    public static final String METADATA_KEY_COMPOSER = "android.media.metadata.COMPOSER";
    public static final String METADATA_KEY_DATE = "android.media.metadata.DATE";
    public static final String METADATA_KEY_DISC_NUMBER = "android.media.metadata.DISC_NUMBER";
    public static final String METADATA_KEY_DISPLAY_DESCRIPTION = "android.media.metadata.DISPLAY_DESCRIPTION";
    public static final String METADATA_KEY_DISPLAY_ICON = "android.media.metadata.DISPLAY_ICON";
    public static final String METADATA_KEY_DISPLAY_ICON_URI = "android.media.metadata.DISPLAY_ICON_URI";
    public static final String METADATA_KEY_DISPLAY_SUBTITLE = "android.media.metadata.DISPLAY_SUBTITLE";
    public static final String METADATA_KEY_DISPLAY_TITLE = "android.media.metadata.DISPLAY_TITLE";
    public static final String METADATA_KEY_DOWNLOAD_STATUS = "android.media.metadata.DOWNLOAD_STATUS";
    public static final String METADATA_KEY_DURATION = "android.media.metadata.DURATION";
    public static final String METADATA_KEY_GENRE = "android.media.metadata.GENRE";
    public static final String METADATA_KEY_MEDIA_ID = "android.media.metadata.MEDIA_ID";
    public static final String METADATA_KEY_MEDIA_URI = "android.media.metadata.MEDIA_URI";
    public static final String METADATA_KEY_NUM_TRACKS = "android.media.metadata.NUM_TRACKS";
    public static final String METADATA_KEY_RATING = "android.media.metadata.RATING";
    public static final String METADATA_KEY_TITLE = "android.media.metadata.TITLE";
    public static final String METADATA_KEY_TRACK_NUMBER = "android.media.metadata.TRACK_NUMBER";
    public static final String METADATA_KEY_USER_RATING = "android.media.metadata.USER_RATING";
    public static final String METADATA_KEY_WRITER = "android.media.metadata.WRITER";
    public static final String METADATA_KEY_YEAR = "android.media.metadata.YEAR";

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Bundle f62207OooOo0o;

    public static class OooO00o implements Parcelable.Creator<MediaMetadataCompat> {
        @Override // android.os.Parcelable.Creator
        public final MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final MediaMetadataCompat[] newArray(int i) {
            return new MediaMetadataCompat[i];
        }
    }

    static {
        OooOo.OooO00o oooO00o = new OooOo.OooO00o();
        oooO00o.put(METADATA_KEY_TITLE, 1);
        oooO00o.put(METADATA_KEY_ARTIST, 1);
        oooO00o.put(METADATA_KEY_DURATION, 0);
        oooO00o.put(METADATA_KEY_ALBUM, 1);
        oooO00o.put(METADATA_KEY_AUTHOR, 1);
        oooO00o.put(METADATA_KEY_WRITER, 1);
        oooO00o.put(METADATA_KEY_COMPOSER, 1);
        oooO00o.put(METADATA_KEY_COMPILATION, 1);
        oooO00o.put(METADATA_KEY_DATE, 1);
        oooO00o.put(METADATA_KEY_YEAR, 0);
        oooO00o.put(METADATA_KEY_GENRE, 1);
        oooO00o.put(METADATA_KEY_TRACK_NUMBER, 0);
        oooO00o.put(METADATA_KEY_NUM_TRACKS, 0);
        oooO00o.put(METADATA_KEY_DISC_NUMBER, 0);
        oooO00o.put(METADATA_KEY_ALBUM_ARTIST, 1);
        oooO00o.put(METADATA_KEY_ART, 2);
        oooO00o.put(METADATA_KEY_ART_URI, 1);
        oooO00o.put(METADATA_KEY_ALBUM_ART, 2);
        oooO00o.put(METADATA_KEY_ALBUM_ART_URI, 1);
        oooO00o.put(METADATA_KEY_USER_RATING, 3);
        oooO00o.put(METADATA_KEY_RATING, 3);
        oooO00o.put(METADATA_KEY_DISPLAY_TITLE, 1);
        oooO00o.put(METADATA_KEY_DISPLAY_SUBTITLE, 1);
        oooO00o.put(METADATA_KEY_DISPLAY_DESCRIPTION, 1);
        oooO00o.put(METADATA_KEY_DISPLAY_ICON, 2);
        oooO00o.put(METADATA_KEY_DISPLAY_ICON_URI, 1);
        oooO00o.put(METADATA_KEY_MEDIA_ID, 1);
        oooO00o.put(METADATA_KEY_BT_FOLDER_TYPE, 0);
        oooO00o.put(METADATA_KEY_MEDIA_URI, 1);
        oooO00o.put(METADATA_KEY_ADVERTISEMENT, 0);
        oooO00o.put(METADATA_KEY_DOWNLOAD_STATUS, 0);
        CREATOR = new OooO00o();
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.f62207OooOo0o = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f62207OooOo0o);
    }
}
