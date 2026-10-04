package o0oOOo;

import OooOOO0.AbstractC20449OooO0Oo;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import o00oO0O0.C25559OooOOo;
import o00oO0O0.C25561OooOOoo;
import o00oO0O0.C25562OooOo0;
import o00oO0O0.C25563OooOo0O;
import o00oO0O0.C25564OooOo0o;
import o00oO0O0.C25565OooOoO;
import o00oO0O0.C25566OooOoO0;
import o00oO0O0.OooOo;
import o00oO0O0.OooOo00;

/* JADX INFO: renamed from: o0oOOo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C30840OooO0OO {
    public static Drawable OooO00o(Context context, TypedArray typedArray, int i) {
        int resourceId = typedArray.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        return context.getDrawable(resourceId);
    }

    public static C30843OooO0o0 OooO0O0(C30839OooO0O0 c30839OooO0O0) {
        if (c30839OooO0O0.f110228OooOOOo == null) {
            c30839OooO0O0.f110228OooOOOo = new C30843OooO0o0();
        }
        return c30839OooO0O0.f110228OooOOOo;
    }

    public static AbstractC20449OooO0Oo OooO0OO(TypedArray typedArray, int i) {
        switch (typedArray.getInt(i, -2)) {
            case -1:
                return null;
            case 0:
                return C25566OooOoO0.f87246OooOo0o;
            case 1:
                return OooOo.f87240OooOo0o;
            case 2:
                return C25563OooOo0O.f87243OooOo0o;
            case 3:
                return C25564OooOo0o.f87244OooOo0o;
            case 4:
                return C25559OooOOo.f87232OooOo0o;
            case 5:
                return OooOo00.f87242OooOo0o;
            case 6:
                return C25561OooOOoo.f87239OooOo0o;
            case 7:
                return C25565OooOoO.f87245OooOo0o;
            case 8:
                return C25562OooOo0.f87241OooOo0o;
            default:
                throw new RuntimeException("XML attribute not specified!");
        }
    }
}
