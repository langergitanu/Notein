package com.google.android.play.integrity.internal;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.C21532OooOOo;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.c */
/* JADX INFO: loaded from: classes7.dex */
public final class C16392c {
    static {
        C16392c.class.getClassLoader();
    }

    private C16392c() {
    }

    /* JADX INFO: renamed from: a */
    public static Parcelable m75042a(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* JADX INFO: renamed from: b */
    public static void m75043b(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(C21532OooOOo.OooO0OO(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m75044c(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }
}
