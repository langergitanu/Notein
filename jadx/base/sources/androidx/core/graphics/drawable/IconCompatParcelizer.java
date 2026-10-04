package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import o00O000o.OooO00o;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(OooO00o oooO00o) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.mType = oooO00o.OooOO0(iconCompat.mType, 1);
        byte[] bArrOooO0o = iconCompat.mData;
        if (oooO00o.OooO0oo(2)) {
            bArrOooO0o = oooO00o.OooO0o();
        }
        iconCompat.mData = bArrOooO0o;
        Parcelable parcelableOooOO0O = iconCompat.mParcelable;
        if (oooO00o.OooO0oo(3)) {
            parcelableOooOO0O = oooO00o.OooOO0O();
        }
        iconCompat.mParcelable = parcelableOooOO0O;
        iconCompat.mInt1 = oooO00o.OooOO0(iconCompat.mInt1, 4);
        iconCompat.mInt2 = oooO00o.OooOO0(iconCompat.mInt2, 5);
        Parcelable parcelableOooOO0O2 = iconCompat.mTintList;
        if (oooO00o.OooO0oo(6)) {
            parcelableOooOO0O2 = oooO00o.OooOO0O();
        }
        iconCompat.mTintList = (ColorStateList) parcelableOooOO0O2;
        String strOooOO0o = iconCompat.mTintModeStr;
        if (oooO00o.OooO0oo(7)) {
            strOooOO0o = oooO00o.OooOO0o();
        }
        iconCompat.mTintModeStr = strOooOO0o;
        String strOooOO0o2 = iconCompat.mString1;
        if (oooO00o.OooO0oo(8)) {
            strOooOO0o2 = oooO00o.OooOO0o();
        }
        iconCompat.mString1 = strOooOO0o2;
        iconCompat.onPostParceling();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, OooO00o oooO00o) {
        oooO00o.getClass();
        iconCompat.onPreParceling(false);
        int i = iconCompat.mType;
        if (-1 != i) {
            oooO00o.OooOOoo(i, 1);
        }
        byte[] bArr = iconCompat.mData;
        if (bArr != null) {
            oooO00o.OooOOO(2);
            oooO00o.OooOOOo(bArr);
        }
        Parcelable parcelable = iconCompat.mParcelable;
        if (parcelable != null) {
            oooO00o.OooOOO(3);
            oooO00o.OooOo00(parcelable);
        }
        int i2 = iconCompat.mInt1;
        if (i2 != 0) {
            oooO00o.OooOOoo(i2, 4);
        }
        int i3 = iconCompat.mInt2;
        if (i3 != 0) {
            oooO00o.OooOOoo(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.mTintList;
        if (colorStateList != null) {
            oooO00o.OooOOO(6);
            oooO00o.OooOo00(colorStateList);
        }
        String str = iconCompat.mTintModeStr;
        if (str != null) {
            oooO00o.OooOOO(7);
            oooO00o.OooOo0(str);
        }
        String str2 = iconCompat.mString1;
        if (str2 != null) {
            oooO00o.OooOOO(8);
            oooO00o.OooOo0(str2);
        }
    }
}
