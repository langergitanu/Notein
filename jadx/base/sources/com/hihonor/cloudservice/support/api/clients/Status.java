package com.hihonor.cloudservice.support.api.clients;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public final class Status implements Parcelable {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final String f68819OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f68820OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final PendingIntent f68821OooOoO0;
    public static final Status SUCCESS = new Status(0, null, null);
    public static final Status FAILURE = new Status(1, null, null);
    public static final Parcelable.Creator<Status> CREATOR = new OooO00o();

    public class OooO00o implements Parcelable.Creator<Status> {
        @Override // android.os.Parcelable.Creator
        public final Status createFromParcel(Parcel parcel) {
            return new Status(parcel.readInt(), parcel.readString(), PendingIntent.readPendingIntentOrNullFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Status[] newArray(int i) {
            return new Status[i];
        }
    }

    public Status() {
        this(0, null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof Status)) {
            Status status = (Status) obj;
            if (this.f68820OooOo0o == status.f68820OooOo0o) {
                String str = this.f68819OooOo;
                String str2 = status.f68819OooOo;
                if (str != str2 && (str == null || !str.equals(str2))) {
                    return false;
                }
                PendingIntent pendingIntent = this.f68821OooOoO0;
                PendingIntent pendingIntent2 = status.f68821OooOoO0;
                return pendingIntent == pendingIntent2 || (pendingIntent != null && pendingIntent.equals(pendingIntent2));
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f68820OooOo0o), this.f68819OooOo, this.f68821OooOoO0});
    }

    public final String toString() {
        return "{statusCode: " + this.f68820OooOo0o + ", statusMessage: " + this.f68819OooOo + ", pendingIntent: " + this.f68821OooOoO0 + ", }";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f68820OooOo0o);
        parcel.writeString(this.f68819OooOo);
        PendingIntent.writePendingIntentOrNullToParcel(this.f68821OooOoO0, parcel);
    }

    public Status(int i, String str, PendingIntent pendingIntent) {
        this.f68820OooOo0o = i;
        this.f68819OooOo = str;
        this.f68821OooOoO0 = pendingIntent;
    }
}
