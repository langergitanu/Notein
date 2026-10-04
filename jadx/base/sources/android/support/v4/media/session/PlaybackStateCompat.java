package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final long ACTION_FAST_FORWARD = 64;
    public static final long ACTION_PAUSE = 2;
    public static final long ACTION_PLAY = 4;
    public static final long ACTION_PLAY_FROM_MEDIA_ID = 1024;
    public static final long ACTION_PLAY_FROM_SEARCH = 2048;
    public static final long ACTION_PLAY_FROM_URI = 8192;
    public static final long ACTION_PLAY_PAUSE = 512;
    public static final long ACTION_PREPARE = 16384;
    public static final long ACTION_PREPARE_FROM_MEDIA_ID = 32768;
    public static final long ACTION_PREPARE_FROM_SEARCH = 65536;
    public static final long ACTION_PREPARE_FROM_URI = 131072;
    public static final long ACTION_REWIND = 8;
    public static final long ACTION_SEEK_TO = 256;
    public static final long ACTION_SET_CAPTIONING_ENABLED = 1048576;
    public static final long ACTION_SET_RATING = 128;
    public static final long ACTION_SET_REPEAT_MODE = 262144;
    public static final long ACTION_SET_SHUFFLE_MODE = 2097152;

    @Deprecated
    public static final long ACTION_SET_SHUFFLE_MODE_ENABLED = 524288;
    public static final long ACTION_SKIP_TO_NEXT = 32;
    public static final long ACTION_SKIP_TO_PREVIOUS = 16;
    public static final long ACTION_SKIP_TO_QUEUE_ITEM = 4096;
    public static final long ACTION_STOP = 1;
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new OooO00o();
    public static final int ERROR_CODE_ACTION_ABORTED = 10;
    public static final int ERROR_CODE_APP_ERROR = 1;
    public static final int ERROR_CODE_AUTHENTICATION_EXPIRED = 3;
    public static final int ERROR_CODE_CONCURRENT_STREAM_LIMIT = 5;
    public static final int ERROR_CODE_CONTENT_ALREADY_PLAYING = 8;
    public static final int ERROR_CODE_END_OF_QUEUE = 11;
    public static final int ERROR_CODE_NOT_AVAILABLE_IN_REGION = 7;
    public static final int ERROR_CODE_NOT_SUPPORTED = 2;
    public static final int ERROR_CODE_PARENTAL_CONTROL_RESTRICTED = 6;
    public static final int ERROR_CODE_PREMIUM_ACCOUNT_REQUIRED = 4;
    public static final int ERROR_CODE_SKIP_LIMIT_REACHED = 9;
    public static final int ERROR_CODE_UNKNOWN_ERROR = 0;
    public static final long PLAYBACK_POSITION_UNKNOWN = -1;
    public static final int REPEAT_MODE_ALL = 2;
    public static final int REPEAT_MODE_GROUP = 3;
    public static final int REPEAT_MODE_INVALID = -1;
    public static final int REPEAT_MODE_NONE = 0;
    public static final int REPEAT_MODE_ONE = 1;
    public static final int SHUFFLE_MODE_ALL = 1;
    public static final int SHUFFLE_MODE_GROUP = 2;
    public static final int SHUFFLE_MODE_INVALID = -1;
    public static final int SHUFFLE_MODE_NONE = 0;
    public static final int STATE_BUFFERING = 6;
    public static final int STATE_CONNECTING = 8;
    public static final int STATE_ERROR = 7;
    public static final int STATE_FAST_FORWARDING = 4;
    public static final int STATE_NONE = 0;
    public static final int STATE_PAUSED = 2;
    public static final int STATE_PLAYING = 3;
    public static final int STATE_REWINDING = 5;
    public static final int STATE_SKIPPING_TO_NEXT = 10;
    public static final int STATE_SKIPPING_TO_PREVIOUS = 9;
    public static final int STATE_SKIPPING_TO_QUEUE_ITEM = 11;
    public static final int STATE_STOPPED = 1;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final long f62219OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f62220OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final float f62221OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final long f62222OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final long f62223OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final CharSequence f62224OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final int f62225OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final long f62226OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final ArrayList f62227OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final long f62228Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final Bundle f62229Oooo00O;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final CharSequence f62230OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final String f62231OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final Bundle f62232OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final int f62233OooOoO0;

        public static class OooO00o implements Parcelable.Creator<CustomAction> {
            @Override // android.os.Parcelable.Creator
            public final CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        }

        public CustomAction(Parcel parcel) {
            this.f62231OooOo0o = parcel.readString();
            this.f62230OooOo = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f62233OooOoO0 = parcel.readInt();
            this.f62232OooOoO = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.f62230OooOo) + ", mIcon=" + this.f62233OooOoO0 + ", mExtras=" + this.f62232OooOoO;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f62231OooOo0o);
            TextUtils.writeToParcel(this.f62230OooOo, parcel, i);
            parcel.writeInt(this.f62233OooOoO0);
            parcel.writeBundle(this.f62232OooOoO);
        }
    }

    public static class OooO00o implements Parcelable.Creator<PlaybackStateCompat> {
        @Override // android.os.Parcelable.Creator
        public final PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f62220OooOo0o = parcel.readInt();
        this.f62219OooOo = parcel.readLong();
        this.f62221OooOoO = parcel.readFloat();
        this.f62226OooOooO = parcel.readLong();
        this.f62222OooOoO0 = parcel.readLong();
        this.f62223OooOoOO = parcel.readLong();
        this.f62224OooOoo = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f62227OooOooo = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f62228Oooo000 = parcel.readLong();
        this.f62229Oooo00O = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f62225OooOoo0 = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {state=");
        sb.append(this.f62220OooOo0o);
        sb.append(", position=");
        sb.append(this.f62219OooOo);
        sb.append(", buffered position=");
        sb.append(this.f62222OooOoO0);
        sb.append(", speed=");
        sb.append(this.f62221OooOoO);
        sb.append(", updated=");
        sb.append(this.f62226OooOooO);
        sb.append(", actions=");
        sb.append(this.f62223OooOoOO);
        sb.append(", error code=");
        sb.append(this.f62225OooOoo0);
        sb.append(", error message=");
        sb.append(this.f62224OooOoo);
        sb.append(", custom actions=");
        sb.append(this.f62227OooOooo);
        sb.append(", active item id=");
        return android.support.v4.media.session.OooO00o.OooO00o(this.f62228Oooo000, "}", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f62220OooOo0o);
        parcel.writeLong(this.f62219OooOo);
        parcel.writeFloat(this.f62221OooOoO);
        parcel.writeLong(this.f62226OooOooO);
        parcel.writeLong(this.f62222OooOoO0);
        parcel.writeLong(this.f62223OooOoOO);
        TextUtils.writeToParcel(this.f62224OooOoo, parcel, i);
        parcel.writeTypedList(this.f62227OooOooo);
        parcel.writeLong(this.f62228Oooo000);
        parcel.writeBundle(this.f62229Oooo00O);
        parcel.writeInt(this.f62225OooOoo0);
    }
}
