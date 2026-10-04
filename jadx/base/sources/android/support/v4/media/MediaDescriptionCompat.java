package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;

/* JADX INFO: loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final long BT_FOLDER_TYPE_ALBUMS = 2;
    public static final long BT_FOLDER_TYPE_ARTISTS = 3;
    public static final long BT_FOLDER_TYPE_GENRES = 4;
    public static final long BT_FOLDER_TYPE_MIXED = 0;
    public static final long BT_FOLDER_TYPE_PLAYLISTS = 5;
    public static final long BT_FOLDER_TYPE_TITLES = 1;
    public static final long BT_FOLDER_TYPE_YEARS = 6;
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new OooO00o();
    public static final String DESCRIPTION_KEY_MEDIA_URI = "android.support.v4.media.description.MEDIA_URI";
    public static final String DESCRIPTION_KEY_NULL_BUNDLE_FLAG = "android.support.v4.media.description.NULL_BUNDLE_FLAG";
    public static final String EXTRA_BT_FOLDER_TYPE = "android.media.extra.BT_FOLDER_TYPE";
    public static final String EXTRA_DOWNLOAD_STATUS = "android.media.extra.DOWNLOAD_STATUS";
    public static final long STATUS_DOWNLOADED = 2;
    public static final long STATUS_DOWNLOADING = 1;
    public static final long STATUS_NOT_DOWNLOADED = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final CharSequence f62198OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final String f62199OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final CharSequence f62200OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final CharSequence f62201OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final Bitmap f62202OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final Bundle f62203OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final Uri f62204OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final Uri f62205OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public Object f62206OooOooo;

    public static class OooO00o implements Parcelable.Creator<MediaDescriptionCompat> {
        @Override // android.os.Parcelable.Creator
        public final MediaDescriptionCompat createFromParcel(Parcel parcel) {
            Uri mediaUri;
            Bundle bundle;
            Object objCreateFromParcel = MediaDescription.CREATOR.createFromParcel(parcel);
            if (objCreateFromParcel == null) {
                return null;
            }
            MediaDescription mediaDescription = (MediaDescription) objCreateFromParcel;
            String mediaId = mediaDescription.getMediaId();
            CharSequence title = mediaDescription.getTitle();
            CharSequence subtitle = mediaDescription.getSubtitle();
            CharSequence description = mediaDescription.getDescription();
            Bitmap iconBitmap = mediaDescription.getIconBitmap();
            Uri iconUri = mediaDescription.getIconUri();
            Bundle extras = mediaDescription.getExtras();
            if (extras != null) {
                MediaSessionCompat.OooO00o(extras);
                mediaUri = (Uri) extras.getParcelable(MediaDescriptionCompat.DESCRIPTION_KEY_MEDIA_URI);
            } else {
                mediaUri = null;
            }
            if (mediaUri == null) {
                bundle = extras;
            } else if (extras.containsKey(MediaDescriptionCompat.DESCRIPTION_KEY_NULL_BUNDLE_FLAG) && extras.size() == 2) {
                bundle = null;
            } else {
                extras.remove(MediaDescriptionCompat.DESCRIPTION_KEY_MEDIA_URI);
                extras.remove(MediaDescriptionCompat.DESCRIPTION_KEY_NULL_BUNDLE_FLAG);
                bundle = extras;
            }
            if (mediaUri == null) {
                mediaUri = mediaDescription.getMediaUri();
            }
            MediaDescriptionCompat mediaDescriptionCompat = new MediaDescriptionCompat(mediaId, title, subtitle, description, iconBitmap, iconUri, bundle, mediaUri);
            mediaDescriptionCompat.f62206OooOooo = objCreateFromParcel;
            return mediaDescriptionCompat;
        }

        @Override // android.os.Parcelable.Creator
        public final MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f62199OooOo0o = str;
        this.f62198OooOo = charSequence;
        this.f62201OooOoO0 = charSequence2;
        this.f62200OooOoO = charSequence3;
        this.f62202OooOoOO = bitmap;
        this.f62204OooOoo0 = uri;
        this.f62203OooOoo = bundle;
        this.f62205OooOooO = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f62198OooOo) + ", " + ((Object) this.f62201OooOoO0) + ", " + ((Object) this.f62200OooOoO);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Object objBuild = this.f62206OooOooo;
        if (objBuild == null) {
            MediaDescription.Builder builder = new MediaDescription.Builder();
            builder.setMediaId(this.f62199OooOo0o);
            builder.setTitle(this.f62198OooOo);
            builder.setSubtitle(this.f62201OooOoO0);
            builder.setDescription(this.f62200OooOoO);
            builder.setIconBitmap(this.f62202OooOoOO);
            builder.setIconUri(this.f62204OooOoo0);
            builder.setExtras(this.f62203OooOoo);
            builder.setMediaUri(this.f62205OooOooO);
            objBuild = builder.build();
            this.f62206OooOooo = objBuild;
        }
        ((MediaDescription) objBuild).writeToParcel(parcel, i);
    }
}
