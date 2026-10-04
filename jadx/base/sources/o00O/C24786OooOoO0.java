package o00O;

import android.graphics.PointF;
import java.io.IOException;
import o00OO000.OooO0OO;

/* JADX INFO: renamed from: o00O.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24786OooOoO0 implements InterfaceC24795Oooo0OO<PointF> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C24786OooOoO0 f84046OooO00o = new C24786OooOoO0();

    @Override // o00O.InterfaceC24795Oooo0OO
    public final PointF OooO00o(o00OO000.OooO0OO oooO0OO, float f) throws IOException {
        OooO0OO.OooO0O0 oooO0O0OoOO = oooO0OO.ooOO();
        if (oooO0O0OoOO != OooO0OO.OooO0O0.f84726OooOo0o && oooO0O0OoOO != OooO0OO.OooO0O0.f84728OooOoO0) {
            if (oooO0O0OoOO != OooO0OO.OooO0O0.f84730OooOoo) {
                throw new IllegalArgumentException("Cannot convert json to point. Next token is " + oooO0O0OoOO);
            }
            PointF pointF = new PointF(((float) oooO0OO.Oooo00o()) * f, ((float) oooO0OO.Oooo00o()) * f);
            while (oooO0OO.OooOooo()) {
                oooO0OO.o00000oO();
            }
            return pointF;
        }
        return C24779OooOOo.OooO0O0(oooO0OO, f);
    }
}
