package o00O;

import com.airbnb.lottie.C22142OooO0oo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import o00O0oOo.C24948OooO00o;
import o00O0oOo.C24949OooO0O0;
import o00O0oOo.C24950OooO0OO;
import o00O0oOo.C24951OooO0Oo;
import o00O0oOo.C24952OooO0o;
import o00O0oo0.C24963OooO0OO;
import o00OO000.C24982OooO0Oo;
import o00OO00O.C24986OooO0oo;
import o00OO00o.C24988OooO00o;

/* JADX INFO: renamed from: o00O.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24773OooO0Oo {
    public static C24948OooO00o OooO00o(C24982OooO0Oo c24982OooO0Oo, C22142OooO0oo c22142OooO0oo) throws IOException {
        return new C24948OooO00o(OooOo00.OooO00o(c24982OooO0Oo, c22142OooO0oo, 1.0f, C24775OooO0oO.f84011OooO00o, false));
    }

    public static C24949OooO0O0 OooO0O0(o00OO000.OooO0OO oooO0OO, C22142OooO0oo c22142OooO0oo, boolean z) throws IOException {
        return new C24949OooO0O0(OooOo00.OooO00o(oooO0OO, c22142OooO0oo, z ? C24986OooO0oo.OooO0O0() : 1.0f, OooOO0O.f84020OooO00o, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C24950OooO0OO OooO0OO(C24982OooO0Oo c24982OooO0Oo, C22142OooO0oo c22142OooO0oo, int i) throws IOException {
        OooOOO oooOOO = new OooOOO();
        oooOOO.f84023OooO00o = i;
        ArrayList arrayListOooO00o = OooOo00.OooO00o(c24982OooO0Oo, c22142OooO0oo, 1.0f, oooOOO, false);
        for (int i2 = 0; i2 < arrayListOooO00o.size(); i2++) {
            C24988OooO00o c24988OooO00o = (C24988OooO00o) arrayListOooO00o.get(i2);
            C24963OooO0OO c24963OooO0OO = (C24963OooO0OO) c24988OooO00o.f84762OooO00o;
            C24963OooO0OO c24963OooO0OO2 = (C24963OooO0OO) c24988OooO00o.f84763OooO0O0;
            if (c24963OooO0OO != null && c24963OooO0OO2 != null) {
                float[] fArr = c24963OooO0OO.f84670OooO00o;
                int length = fArr.length;
                float[] fArr2 = c24963OooO0OO2.f84670OooO00o;
                if (length != fArr2.length) {
                    int length2 = fArr.length + fArr2.length;
                    float[] fArr3 = new float[length2];
                    System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
                    System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
                    Arrays.sort(fArr3);
                    float f = Float.NaN;
                    int i3 = 0;
                    for (int i4 = 0; i4 < length2; i4++) {
                        float f2 = fArr3[i4];
                        if (f2 != f) {
                            fArr3[i3] = f2;
                            i3++;
                            f = fArr3[i4];
                        }
                    }
                    float[] fArrCopyOfRange = Arrays.copyOfRange(fArr3, 0, i3);
                    c24988OooO00o = new C24988OooO00o(c24963OooO0OO.OooO00o(fArrCopyOfRange), c24963OooO0OO2.OooO00o(fArrCopyOfRange));
                }
            }
            arrayListOooO00o.set(i2, c24988OooO00o);
        }
        return new C24950OooO0OO(arrayListOooO00o);
    }

    public static C24951OooO0Oo OooO0Oo(C24982OooO0Oo c24982OooO0Oo, C22142OooO0oo c22142OooO0oo) throws IOException {
        return new C24951OooO0Oo(OooOo00.OooO00o(c24982OooO0Oo, c22142OooO0oo, 1.0f, C24780OooOOo0.f84031OooO00o, false));
    }

    public static C24952OooO0o OooO0o0(C24982OooO0Oo c24982OooO0Oo, C22142OooO0oo c22142OooO0oo) throws IOException {
        return new C24952OooO0o(OooOo00.OooO00o(c24982OooO0Oo, c22142OooO0oo, C24986OooO0oo.OooO0O0(), C24786OooOoO0.f84046OooO00o, true));
    }
}
