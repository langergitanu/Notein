package o0000;

import com.aspose.slides.C22218Oooo;
import com.aspose.slides.C22226Oooo0oo;
import java.util.Arrays;
import java.util.Comparator;
import o0000.OooO0O0;

/* JADX INFO: renamed from: o0000.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24043OooO0oO extends o0000.OooO0O0 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public OooO0O0 f81001OooO;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public C24044OooO0oo[] f81002OooO0o;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public C24044OooO0oo[] f81003OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f81004OooO0oo;

    /* JADX INFO: renamed from: o0000.OooO0oO$OooO00o */
    public class OooO00o implements Comparator<C24044OooO0oo> {
        @Override // java.util.Comparator
        public final int compare(C24044OooO0oo c24044OooO0oo, C24044OooO0oo c24044OooO0oo2) {
            return c24044OooO0oo.f81007OooOo - c24044OooO0oo2.f81007OooOo;
        }
    }

    /* JADX INFO: renamed from: o0000.OooO0oO$OooO0O0 */
    public class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public C24044OooO0oo f81005OooO00o;

        public OooO0O0() {
        }

        public final String toString() {
            String strOooO0OO = "[ ";
            if (this.f81005OooO00o != null) {
                for (int i = 0; i < 9; i++) {
                    strOooO0OO = Oooo00o.OooO0OO.OooO0OO(C22218Oooo.OooO0OO(strOooO0OO), this.f81005OooO00o.f81014OooOooO[i], " ");
                }
            }
            StringBuilder sbOooO0OO = C22226Oooo0oo.OooO0OO(strOooO0OO, "] ");
            sbOooO0OO.append(this.f81005OooO00o);
            return sbOooO0OO.toString();
        }
    }

    @Override // o0000.OooO0O0
    public final void OooO(C24041OooO0Oo c24041OooO0Oo, o0000.OooO0O0 oooO0O0, boolean z) {
        C24044OooO0oo c24044OooO0oo = oooO0O0.f80974OooO00o;
        if (c24044OooO0oo == null) {
            return;
        }
        OooO0O0.OooO00o oooO00o = oooO0O0.f80977OooO0Oo;
        int iOooO = oooO00o.OooO();
        for (int i = 0; i < iOooO; i++) {
            C24044OooO0oo c24044OooO0ooOooO00o = oooO00o.OooO00o(i);
            float fOooOO0 = oooO00o.OooOO0(i);
            OooO0O0 oooO0O02 = this.f81001OooO;
            oooO0O02.f81005OooO00o = c24044OooO0ooOooO00o;
            boolean z2 = c24044OooO0ooOooO00o.f81008OooOo0o;
            float[] fArr = c24044OooO0oo.f81014OooOooO;
            if (z2) {
                boolean z3 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = oooO0O02.f81005OooO00o.f81014OooOooO;
                    float f = (fArr[i2] * fOooOO0) + fArr2[i2];
                    fArr2[i2] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        oooO0O02.f81005OooO00o.f81014OooOooO[i2] = 0.0f;
                    } else {
                        z3 = false;
                    }
                }
                if (z3) {
                    C24043OooO0oO.this.OooOO0O(oooO0O02.f81005OooO00o);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f2 = fArr[i3];
                    if (f2 != 0.0f) {
                        float f3 = f2 * fOooOO0;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        oooO0O02.f81005OooO00o.f81014OooOooO[i3] = f3;
                    } else {
                        oooO0O02.f81005OooO00o.f81014OooOooO[i3] = 0.0f;
                    }
                }
                OooOO0(c24044OooO0ooOooO00o);
            }
            this.f80975OooO0O0 = (oooO0O0.f80975OooO0O0 * fOooOO0) + this.f80975OooO0O0;
        }
        OooOO0O(c24044OooO0oo);
    }

    @Override // o0000.OooO0O0, o0000.C24041OooO0Oo.OooO00o
    public final C24044OooO0oo OooO00o(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f81004OooO0oo; i2++) {
            C24044OooO0oo[] c24044OooO0ooArr = this.f81002OooO0o;
            C24044OooO0oo c24044OooO0oo = c24044OooO0ooArr[i2];
            if (!zArr[c24044OooO0oo.f81007OooOo]) {
                OooO0O0 oooO0O0 = this.f81001OooO;
                oooO0O0.f81005OooO00o = c24044OooO0oo;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f = oooO0O0.f81005OooO00o.f81014OooOooO[i3];
                        if (f <= 0.0f) {
                            if (f < 0.0f) {
                                i = i2;
                                break;
                            }
                            i3--;
                        }
                    }
                } else {
                    C24044OooO0oo c24044OooO0oo2 = c24044OooO0ooArr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f2 = c24044OooO0oo2.f81014OooOooO[i3];
                            float f3 = oooO0O0.f81005OooO00o.f81014OooOooO[i3];
                            if (f3 == f2) {
                                i3--;
                            } else if (f3 < f2) {
                            }
                        }
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f81002OooO0o[i];
    }

    @Override // o0000.OooO0O0
    public final boolean OooO0o0() {
        return this.f81004OooO0oo == 0;
    }

    public final void OooOO0(C24044OooO0oo c24044OooO0oo) {
        int i;
        int i2 = this.f81004OooO0oo + 1;
        C24044OooO0oo[] c24044OooO0ooArr = this.f81002OooO0o;
        if (i2 > c24044OooO0ooArr.length) {
            C24044OooO0oo[] c24044OooO0ooArr2 = (C24044OooO0oo[]) Arrays.copyOf(c24044OooO0ooArr, c24044OooO0ooArr.length * 2);
            this.f81002OooO0o = c24044OooO0ooArr2;
            this.f81003OooO0oO = (C24044OooO0oo[]) Arrays.copyOf(c24044OooO0ooArr2, c24044OooO0ooArr2.length * 2);
        }
        C24044OooO0oo[] c24044OooO0ooArr3 = this.f81002OooO0o;
        int i3 = this.f81004OooO0oo;
        c24044OooO0ooArr3[i3] = c24044OooO0oo;
        int i4 = i3 + 1;
        this.f81004OooO0oo = i4;
        if (i4 > 1 && c24044OooO0ooArr3[i3].f81007OooOo > c24044OooO0oo.f81007OooOo) {
            int i5 = 0;
            while (true) {
                i = this.f81004OooO0oo;
                if (i5 >= i) {
                    break;
                }
                this.f81003OooO0oO[i5] = this.f81002OooO0o[i5];
                i5++;
            }
            Arrays.sort(this.f81003OooO0oO, 0, i, new OooO00o());
            for (int i6 = 0; i6 < this.f81004OooO0oo; i6++) {
                this.f81002OooO0o[i6] = this.f81003OooO0oO[i6];
            }
        }
        c24044OooO0oo.f81008OooOo0o = true;
        c24044OooO0oo.OooO00o(this);
    }

    public final void OooOO0O(C24044OooO0oo c24044OooO0oo) {
        int i = 0;
        while (i < this.f81004OooO0oo) {
            if (this.f81002OooO0o[i] == c24044OooO0oo) {
                while (true) {
                    int i2 = this.f81004OooO0oo;
                    if (i >= i2 - 1) {
                        this.f81004OooO0oo = i2 - 1;
                        c24044OooO0oo.f81008OooOo0o = false;
                        return;
                    } else {
                        C24044OooO0oo[] c24044OooO0ooArr = this.f81002OooO0o;
                        int i3 = i + 1;
                        c24044OooO0ooArr[i] = c24044OooO0ooArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // o0000.OooO0O0
    public final String toString() {
        String strOooO0OO = Oooo00o.OooO0OO.OooO0OO(new StringBuilder(" goal -> ("), this.f80975OooO0O0, ") : ");
        for (int i = 0; i < this.f81004OooO0oo; i++) {
            C24044OooO0oo c24044OooO0oo = this.f81002OooO0o[i];
            OooO0O0 oooO0O0 = this.f81001OooO;
            oooO0O0.f81005OooO00o = c24044OooO0oo;
            strOooO0OO = strOooO0OO + oooO0O0 + " ";
        }
        return strOooO0OO;
    }
}
