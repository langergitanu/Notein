package o00O;

import android.graphics.PointF;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import java.io.IOException;
import o00O0oOO.C24943OooO00o;
import o00OO000.OooO0OO;

/* JADX INFO: loaded from: classes.dex */
public final class OooO implements InterfaceC24795Oooo0OO<C24943OooO00o> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final OooO f84001OooO00o = new OooO();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final OooO0OO.OooO00o f84002OooO0O0 = OooO0OO.OooO00o.OooO00o("t", "f", "s", "j", TranslateLanguage.TURKISH, "lh", "ls", "fc", "sc", TranslateLanguage.SWAHILI, "of", "ps", "sz");

    @Override // o00O.InterfaceC24795Oooo0OO
    public final C24943OooO00o OooO00o(o00OO000.OooO0OO oooO0OO, float f) throws IOException {
        C24943OooO00o.EnumC19660OooO00o enumC19660OooO00o = C24943OooO00o.EnumC19660OooO00o.f84639OooOo0o;
        oooO0OO.OooO0OO();
        String strOooo0OO = null;
        C24943OooO00o.EnumC19660OooO00o enumC19660OooO00o2 = enumC19660OooO00o;
        float fOooo00o = 0.0f;
        int iOooo0 = 0;
        int iOooO00o = 0;
        String strOooo0OO2 = null;
        float fOooo00o2 = 0.0f;
        while (oooO0OO.OooOooo()) {
            switch (oooO0OO.o0Oo0oo(f84002OooO0O0)) {
                case 0:
                    strOooo0OO = oooO0OO.Oooo0OO();
                    break;
                case 1:
                    strOooo0OO2 = oooO0OO.Oooo0OO();
                    break;
                case 2:
                    fOooo00o2 = (float) oooO0OO.Oooo00o();
                    break;
                case 3:
                    int iOooo02 = oooO0OO.Oooo0();
                    enumC19660OooO00o2 = (iOooo02 <= 2 && iOooo02 >= 0) ? C24943OooO00o.EnumC19660OooO00o.values()[iOooo02] : enumC19660OooO00o;
                    break;
                case 4:
                    iOooo0 = oooO0OO.Oooo0();
                    break;
                case 5:
                    fOooo00o = (float) oooO0OO.Oooo00o();
                    break;
                case 6:
                    oooO0OO.Oooo00o();
                    break;
                case 7:
                    iOooO00o = C24779OooOOo.OooO00o(oooO0OO);
                    break;
                case 8:
                    C24779OooOOo.OooO00o(oooO0OO);
                    break;
                case 9:
                    oooO0OO.Oooo00o();
                    break;
                case 10:
                    oooO0OO.Oooo000();
                    break;
                case 11:
                    oooO0OO.OooO00o();
                    new PointF(((float) oooO0OO.Oooo00o()) * f, ((float) oooO0OO.Oooo00o()) * f);
                    oooO0OO.OooOOO0();
                    break;
                case 12:
                    oooO0OO.OooO00o();
                    new PointF(((float) oooO0OO.Oooo00o()) * f, ((float) oooO0OO.Oooo00o()) * f);
                    oooO0OO.OooOOO0();
                    break;
                default:
                    oooO0OO.o00000OO();
                    oooO0OO.o00000oO();
                    break;
            }
        }
        oooO0OO.OooOOo0();
        C24943OooO00o c24943OooO00o = new C24943OooO00o();
        c24943OooO00o.f84631OooO00o = strOooo0OO;
        c24943OooO00o.f84632OooO0O0 = strOooo0OO2;
        c24943OooO00o.f84633OooO0OO = fOooo00o2;
        c24943OooO00o.f84634OooO0Oo = enumC19660OooO00o2;
        c24943OooO00o.f84636OooO0o0 = iOooo0;
        c24943OooO00o.f84635OooO0o = fOooo00o;
        c24943OooO00o.f84637OooO0oO = iOooO00o;
        return c24943OooO00o;
    }
}
