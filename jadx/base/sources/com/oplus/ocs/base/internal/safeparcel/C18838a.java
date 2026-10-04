package com.oplus.ocs.base.internal.safeparcel;

import OooO0O0.OooO0o;
import android.os.Parcel;
import androidx.core.internal.view.SupportMenu;

/* JADX INFO: renamed from: com.oplus.ocs.base.internal.safeparcel.a */
/* JADX INFO: loaded from: classes9.dex */
public final class C18838a {

    /* JADX INFO: renamed from: com.oplus.ocs.base.internal.safeparcel.a$a */
    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m80519a(Parcel parcel, int i) {
        m80521c(parcel, i);
        return parcel.readInt();
    }

    /* JADX INFO: renamed from: b */
    public static int m80520b(Parcel parcel, int i) {
        return (i & SupportMenu.CATEGORY_MASK) != -65536 ? (i >> 16) & 65535 : parcel.readInt();
    }

    /* JADX INFO: renamed from: c */
    private static void m80521c(Parcel parcel, int i) {
        int iM80520b = m80520b(parcel, i);
        if (iM80520b == 4) {
            return;
        }
        StringBuilder sbOooO0OO = OooO0o.OooO0OO(iM80520b, "Expected size 4 got ", " (0x");
        sbOooO0OO.append(Integer.toHexString(iM80520b));
        sbOooO0OO.append(")");
        throw new a(sbOooO0OO.toString());
    }
}
