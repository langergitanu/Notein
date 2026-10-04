package o00O;

import android.graphics.Color;
import java.io.IOException;
import o00OO000.OooO0OO;

/* JADX INFO: renamed from: o00O.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24775OooO0oO implements InterfaceC24795Oooo0OO<Integer> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C24775OooO0oO f84011OooO00o = new C24775OooO0oO();

    @Override // o00O.InterfaceC24795Oooo0OO
    public final Integer OooO00o(o00OO000.OooO0OO oooO0OO, float f) throws IOException {
        boolean z = oooO0OO.ooOO() == OooO0OO.OooO0O0.f84726OooOo0o;
        if (z) {
            oooO0OO.OooO00o();
        }
        double dOooo00o = oooO0OO.Oooo00o();
        double dOooo00o2 = oooO0OO.Oooo00o();
        double dOooo00o3 = oooO0OO.Oooo00o();
        double dOooo00o4 = oooO0OO.ooOO() == OooO0OO.OooO0O0.f84730OooOoo ? oooO0OO.Oooo00o() : 1.0d;
        if (z) {
            oooO0OO.OooOOO0();
        }
        if (dOooo00o <= 1.0d && dOooo00o2 <= 1.0d && dOooo00o3 <= 1.0d) {
            dOooo00o *= 255.0d;
            dOooo00o2 *= 255.0d;
            dOooo00o3 *= 255.0d;
            if (dOooo00o4 <= 1.0d) {
                dOooo00o4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) dOooo00o4, (int) dOooo00o, (int) dOooo00o2, (int) dOooo00o3));
    }
}
