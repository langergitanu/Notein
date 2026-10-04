package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import android.os.BadParcelableException;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.C21532OooOOo;

/* JADX INFO: loaded from: classes7.dex */
public final class zbc {
    static {
        zbc.class.getClassLoader();
    }

    private zbc() {
    }

    public static Parcelable zba(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void zbb(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(C21532OooOOo.OooO0OO(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
    }

    public static void zbc(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}
