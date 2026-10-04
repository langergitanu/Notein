package com.oplus.ocs.base.common;

import Oooo0.C20855OooooOO;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.graphics.OooO0O0;
import com.oplus.ocs.base.internal.safeparcel.C18838a;

/* JADX INFO: renamed from: com.oplus.ocs.base.common.b */
/* JADX INFO: loaded from: classes9.dex */
final class C18837b implements Parcelable.Creator<Status> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Status createFromParcel(Parcel parcel) {
        Parcelable parcelable;
        int i = parcel.readInt();
        int iM80520b = C18838a.m80520b(parcel, i);
        int iDataPosition = parcel.dataPosition();
        if ((i & 65535) != 20293) {
            throw new C18838a.a(OooO0O0.OooO00o(i, new StringBuilder("Expected object header. Got 0x")));
        }
        int i2 = iM80520b + iDataPosition;
        if (i2 < iDataPosition || i2 > parcel.dataSize()) {
            throw new C18838a.a(C20855OooooOO.OooO0OO(iDataPosition, i2, "Size read is invalid start=", " end="));
        }
        int iM80519a = 0;
        int iM80519a2 = 0;
        String str = null;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < i2) {
            int i3 = parcel.readInt();
            int i4 = i3 & 65535;
            if (i4 == 1) {
                iM80519a2 = C18838a.m80519a(parcel, i3);
            } else if (i4 == 2) {
                int iM80520b2 = C18838a.m80520b(parcel, i3);
                int iDataPosition2 = parcel.dataPosition();
                if (iM80520b2 == 0) {
                    str = null;
                } else {
                    String string = parcel.readString();
                    parcel.setDataPosition(iDataPosition2 + iM80520b2);
                    str = string;
                }
            } else if (i4 == 3) {
                Parcelable.Creator creator = PendingIntent.CREATOR;
                int iM80520b3 = C18838a.m80520b(parcel, i3);
                int iDataPosition3 = parcel.dataPosition();
                if (iM80520b3 == 0) {
                    parcelable = null;
                } else {
                    parcelable = (Parcelable) creator.createFromParcel(parcel);
                    parcel.setDataPosition(iDataPosition3 + iM80520b3);
                }
                pendingIntent = (PendingIntent) parcelable;
            } else if (i4 != 1000) {
                parcel.setDataPosition(parcel.dataPosition() + C18838a.m80520b(parcel, i3));
            } else {
                iM80519a = C18838a.m80519a(parcel, i3);
            }
        }
        if (parcel.dataPosition() == i2) {
            return new Status(iM80519a, iM80519a2, str, pendingIntent);
        }
        throw new C18838a.a("Overread allowed size end=".concat(String.valueOf(i2)));
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Status[] newArray(int i) {
        return new Status[i];
    }
}
