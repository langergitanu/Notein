package com.oplus.ocs.base.internal.safeparcel;

import android.os.Parcel;
import androidx.core.internal.view.SupportMenu;

/* JADX INFO: renamed from: com.oplus.ocs.base.internal.safeparcel.b */
/* JADX INFO: loaded from: classes9.dex */
public final class C18839b {
    /* JADX INFO: renamed from: a */
    public static void m80523a(Parcel parcel, int i, int i2) {
        m80525c(parcel, i);
        parcel.writeInt(i2);
    }

    /* JADX INFO: renamed from: b */
    public static int m80524b(Parcel parcel, int i) {
        parcel.writeInt(i | SupportMenu.CATEGORY_MASK);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* JADX INFO: renamed from: c */
    private static void m80525c(Parcel parcel, int i) {
        parcel.writeInt(i | 262144);
    }

    /* JADX INFO: renamed from: a */
    public static void m80522a(Parcel parcel, int i) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(iDataPosition - i);
        parcel.setDataPosition(iDataPosition);
    }
}
