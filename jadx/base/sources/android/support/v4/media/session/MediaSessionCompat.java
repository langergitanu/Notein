package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;

/* JADX INFO: loaded from: classes.dex */
public final class MediaSessionCompat {

    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new OooO00o();
        public static final int UNKNOWN_ID = -1;

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final long f62210OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final MediaDescriptionCompat f62211OooOo0o;

        public static class OooO00o implements Parcelable.Creator<QueueItem> {
            @Override // android.os.Parcelable.Creator
            public final QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final QueueItem[] newArray(int i) {
                return new QueueItem[i];
            }
        }

        public QueueItem(Parcel parcel) {
            this.f62211OooOo0o = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f62210OooOo = parcel.readLong();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MediaSession.QueueItem {Description=");
            sb.append(this.f62211OooOo0o);
            sb.append(", Id=");
            return android.support.v4.media.session.OooO00o.OooO00o(this.f62210OooOo, " }", sb);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.f62211OooOo0o.writeToParcel(parcel, i);
            parcel.writeLong(this.f62210OooOo);
        }
    }

    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public ResultReceiver f62212OooOo0o;

        public static class OooO00o implements Parcelable.Creator<ResultReceiverWrapper> {
            @Override // android.os.Parcelable.Creator
            public final ResultReceiverWrapper createFromParcel(Parcel parcel) {
                ResultReceiverWrapper resultReceiverWrapper = new ResultReceiverWrapper();
                resultReceiverWrapper.f62212OooOo0o = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
                return resultReceiverWrapper;
            }

            @Override // android.os.Parcelable.Creator
            public final ResultReceiverWrapper[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.f62212OooOo0o.writeToParcel(parcel, i);
        }
    }

    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new OooO00o();

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final Parcelable f62213OooOo0o;

        public static class OooO00o implements Parcelable.Creator<Token> {
            @Override // android.os.Parcelable.Creator
            public final Token createFromParcel(Parcel parcel) {
                return new Token(parcel.readParcelable(null));
            }

            @Override // android.os.Parcelable.Creator
            public final Token[] newArray(int i) {
                return new Token[i];
            }
        }

        public Token(Parcelable parcelable) {
            this.f62213OooOo0o = parcelable;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Parcelable parcelable = this.f62213OooOo0o;
            if (parcelable == null) {
                return token.f62213OooOo0o == null;
            }
            Parcelable parcelable2 = token.f62213OooOo0o;
            if (parcelable2 == null) {
                return false;
            }
            return parcelable.equals(parcelable2);
        }

        public final int hashCode() {
            Parcelable parcelable = this.f62213OooOo0o;
            if (parcelable == null) {
                return 0;
            }
            return parcelable.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f62213OooOo0o, i);
        }
    }

    public static void OooO00o(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }
}
