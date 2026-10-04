package o00O;

import android.graphics.Color;
import android.graphics.PointF;
import java.io.IOException;
import java.util.ArrayList;
import o00OO000.OooO0OO;

/* JADX INFO: renamed from: o00O.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24779OooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO0OO.OooO00o f84030OooO00o = OooO0OO.OooO00o.OooO00o("x", "y");

    public static int OooO00o(o00OO000.OooO0OO oooO0OO) throws IOException {
        oooO0OO.OooO00o();
        int iOooo00o = (int) (oooO0OO.Oooo00o() * 255.0d);
        int iOooo00o2 = (int) (oooO0OO.Oooo00o() * 255.0d);
        int iOooo00o3 = (int) (oooO0OO.Oooo00o() * 255.0d);
        while (oooO0OO.OooOooo()) {
            oooO0OO.o00000oO();
        }
        oooO0OO.OooOOO0();
        return Color.argb(255, iOooo00o, iOooo00o2, iOooo00o3);
    }

    public static PointF OooO0O0(o00OO000.OooO0OO oooO0OO, float f) throws IOException {
        int iOrdinal = oooO0OO.ooOO().ordinal();
        if (iOrdinal == 0) {
            oooO0OO.OooO00o();
            float fOooo00o = (float) oooO0OO.Oooo00o();
            float fOooo00o2 = (float) oooO0OO.Oooo00o();
            while (oooO0OO.ooOO() != OooO0OO.OooO0O0.f84725OooOo) {
                oooO0OO.o00000oO();
            }
            oooO0OO.OooOOO0();
            return new PointF(fOooo00o * f, fOooo00o2 * f);
        }
        if (iOrdinal != 2) {
            if (iOrdinal != 6) {
                throw new IllegalArgumentException("Unknown point starts with " + oooO0OO.ooOO());
            }
            float fOooo00o3 = (float) oooO0OO.Oooo00o();
            float fOooo00o4 = (float) oooO0OO.Oooo00o();
            while (oooO0OO.OooOooo()) {
                oooO0OO.o00000oO();
            }
            return new PointF(fOooo00o3 * f, fOooo00o4 * f);
        }
        oooO0OO.OooO0OO();
        float fOooO0Oo = 0.0f;
        float fOooO0Oo2 = 0.0f;
        while (oooO0OO.OooOooo()) {
            int iO0Oo0oo = oooO0OO.o0Oo0oo(f84030OooO00o);
            if (iO0Oo0oo == 0) {
                fOooO0Oo = OooO0Oo(oooO0OO);
            } else if (iO0Oo0oo != 1) {
                oooO0OO.o00000OO();
                oooO0OO.o00000oO();
            } else {
                fOooO0Oo2 = OooO0Oo(oooO0OO);
            }
        }
        oooO0OO.OooOOo0();
        return new PointF(fOooO0Oo * f, fOooO0Oo2 * f);
    }

    public static ArrayList OooO0OO(o00OO000.OooO0OO oooO0OO, float f) throws IOException {
        ArrayList arrayList = new ArrayList();
        oooO0OO.OooO00o();
        while (oooO0OO.ooOO() == OooO0OO.OooO0O0.f84726OooOo0o) {
            oooO0OO.OooO00o();
            arrayList.add(OooO0O0(oooO0OO, f));
            oooO0OO.OooOOO0();
        }
        oooO0OO.OooOOO0();
        return arrayList;
    }

    public static float OooO0Oo(o00OO000.OooO0OO oooO0OO) throws IOException {
        OooO0OO.OooO0O0 oooO0O0OoOO = oooO0OO.ooOO();
        int iOrdinal = oooO0O0OoOO.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 6) {
                return (float) oooO0OO.Oooo00o();
            }
            throw new IllegalArgumentException("Unknown value for token of type " + oooO0O0OoOO);
        }
        oooO0OO.OooO00o();
        float fOooo00o = (float) oooO0OO.Oooo00o();
        while (oooO0OO.OooOooo()) {
            oooO0OO.o00000oO();
        }
        oooO0OO.OooOOO0();
        return fOooo00o;
    }
}
