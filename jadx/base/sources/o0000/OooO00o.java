package o0000;

import Oooo0oO.C21111o0ooOoO;
import com.aspose.slides.C22218Oooo;
import java.util.Arrays;
import o0000.OooO0O0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o implements OooO0O0.OooO00o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0O0 f80966OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO0OO f80967OooO0OO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int f80965OooO00o = 0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f80968OooO0Oo = 8;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int[] f80970OooO0o0 = new int[8];

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int[] f80969OooO0o = new int[8];

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public float[] f80971OooO0oO = new float[8];

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f80972OooO0oo = -1;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public int f80964OooO = -1;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public boolean f80973OooOO0 = false;

    public OooO00o(OooO0O0 oooO0O0, OooO0OO oooO0OO) {
        this.f80966OooO0O0 = oooO0O0;
        this.f80967OooO0OO = oooO0OO;
    }

    @Override // o0000.OooO0O0.OooO00o
    public final int OooO() {
        return this.f80965OooO00o;
    }

    @Override // o0000.OooO0O0.OooO00o
    public final C24044OooO0oo OooO00o(int i) {
        int i2 = this.f80972OooO0oo;
        for (int i3 = 0; i2 != -1 && i3 < this.f80965OooO00o; i3++) {
            if (i3 == i) {
                return this.f80967OooO0OO.f80981OooO0OO[this.f80970OooO0o0[i2]];
            }
            i2 = this.f80969OooO0o[i2];
        }
        return null;
    }

    @Override // o0000.OooO0O0.OooO00o
    public final void OooO0O0(C24044OooO0oo c24044OooO0oo, float f, boolean z) {
        if (f <= -0.001f || f >= 0.001f) {
            int i = this.f80972OooO0oo;
            OooO0O0 oooO0O0 = this.f80966OooO0O0;
            if (i == -1) {
                this.f80972OooO0oo = 0;
                this.f80971OooO0oO[0] = f;
                this.f80970OooO0o0[0] = c24044OooO0oo.f81007OooOo;
                this.f80969OooO0o[0] = -1;
                c24044OooO0oo.f81018Oooo00o++;
                c24044OooO0oo.OooO00o(oooO0O0);
                this.f80965OooO00o++;
                if (this.f80973OooOO0) {
                    return;
                }
                int i2 = this.f80964OooO + 1;
                this.f80964OooO = i2;
                int[] iArr = this.f80970OooO0o0;
                if (i2 >= iArr.length) {
                    this.f80973OooOO0 = true;
                    this.f80964OooO = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.f80965OooO00o; i4++) {
                int i5 = this.f80970OooO0o0[i];
                int i6 = c24044OooO0oo.f81007OooOo;
                if (i5 == i6) {
                    float[] fArr = this.f80971OooO0oO;
                    float f2 = fArr[i] + f;
                    if (f2 > -0.001f && f2 < 0.001f) {
                        f2 = 0.0f;
                    }
                    fArr[i] = f2;
                    if (f2 == 0.0f) {
                        if (i == this.f80972OooO0oo) {
                            this.f80972OooO0oo = this.f80969OooO0o[i];
                        } else {
                            int[] iArr2 = this.f80969OooO0o;
                            iArr2[i3] = iArr2[i];
                        }
                        if (z) {
                            c24044OooO0oo.OooO0O0(oooO0O0);
                        }
                        if (this.f80973OooOO0) {
                            this.f80964OooO = i;
                        }
                        c24044OooO0oo.f81018Oooo00o--;
                        this.f80965OooO00o--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.f80969OooO0o[i];
            }
            int length = this.f80964OooO;
            int i7 = length + 1;
            if (this.f80973OooOO0) {
                int[] iArr3 = this.f80970OooO0o0;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i7;
            }
            int[] iArr4 = this.f80970OooO0o0;
            if (length >= iArr4.length && this.f80965OooO00o < iArr4.length) {
                int i8 = 0;
                while (true) {
                    int[] iArr5 = this.f80970OooO0o0;
                    if (i8 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i8] == -1) {
                        length = i8;
                        break;
                    }
                    i8++;
                }
            }
            int[] iArr6 = this.f80970OooO0o0;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i9 = this.f80968OooO0Oo * 2;
                this.f80968OooO0Oo = i9;
                this.f80973OooOO0 = false;
                this.f80964OooO = length - 1;
                this.f80971OooO0oO = Arrays.copyOf(this.f80971OooO0oO, i9);
                this.f80970OooO0o0 = Arrays.copyOf(this.f80970OooO0o0, this.f80968OooO0Oo);
                this.f80969OooO0o = Arrays.copyOf(this.f80969OooO0o, this.f80968OooO0Oo);
            }
            this.f80970OooO0o0[length] = c24044OooO0oo.f81007OooOo;
            this.f80971OooO0oO[length] = f;
            if (i3 != -1) {
                int[] iArr7 = this.f80969OooO0o;
                iArr7[length] = iArr7[i3];
                iArr7[i3] = length;
            } else {
                this.f80969OooO0o[length] = this.f80972OooO0oo;
                this.f80972OooO0oo = length;
            }
            c24044OooO0oo.f81018Oooo00o++;
            c24044OooO0oo.OooO00o(oooO0O0);
            this.f80965OooO00o++;
            if (!this.f80973OooOO0) {
                this.f80964OooO++;
            }
            int i10 = this.f80964OooO;
            int[] iArr8 = this.f80970OooO0o0;
            if (i10 >= iArr8.length) {
                this.f80973OooOO0 = true;
                this.f80964OooO = iArr8.length - 1;
            }
        }
    }

    @Override // o0000.OooO0O0.OooO00o
    public final float OooO0OO(C24044OooO0oo c24044OooO0oo, boolean z) {
        int i = this.f80972OooO0oo;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f80965OooO00o) {
            if (this.f80970OooO0o0[i] == c24044OooO0oo.f81007OooOo) {
                if (i == this.f80972OooO0oo) {
                    this.f80972OooO0oo = this.f80969OooO0o[i];
                } else {
                    int[] iArr = this.f80969OooO0o;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    c24044OooO0oo.OooO0O0(this.f80966OooO0O0);
                }
                c24044OooO0oo.f81018Oooo00o--;
                this.f80965OooO00o--;
                this.f80970OooO0o0[i] = -1;
                if (this.f80973OooOO0) {
                    this.f80964OooO = i;
                }
                return this.f80971OooO0oO[i];
            }
            i2++;
            i3 = i;
            i = this.f80969OooO0o[i];
        }
        return 0.0f;
    }

    @Override // o0000.OooO0O0.OooO00o
    public final float OooO0Oo(OooO0O0 oooO0O0, boolean z) {
        float fOooO0oo = OooO0oo(oooO0O0.f80974OooO00o);
        OooO0OO(oooO0O0.f80974OooO00o, z);
        OooO0O0.OooO00o oooO00o = oooO0O0.f80977OooO0Oo;
        int iOooO = oooO00o.OooO();
        for (int i = 0; i < iOooO; i++) {
            C24044OooO0oo c24044OooO0ooOooO00o = oooO00o.OooO00o(i);
            OooO0O0(c24044OooO0ooOooO00o, oooO00o.OooO0oo(c24044OooO0ooOooO00o) * fOooO0oo, z);
        }
        return fOooO0oo;
    }

    @Override // o0000.OooO0O0.OooO00o
    public final boolean OooO0o(C24044OooO0oo c24044OooO0oo) {
        int i = this.f80972OooO0oo;
        if (i != -1) {
            for (int i2 = 0; i != -1 && i2 < this.f80965OooO00o; i2++) {
                if (this.f80970OooO0o0[i] == c24044OooO0oo.f81007OooOo) {
                    return true;
                }
                i = this.f80969OooO0o[i];
            }
        }
        return false;
    }

    @Override // o0000.OooO0O0.OooO00o
    public final void OooO0o0(float f) {
        int i = this.f80972OooO0oo;
        for (int i2 = 0; i != -1 && i2 < this.f80965OooO00o; i2++) {
            float[] fArr = this.f80971OooO0oO;
            fArr[i] = fArr[i] / f;
            i = this.f80969OooO0o[i];
        }
    }

    @Override // o0000.OooO0O0.OooO00o
    public final void OooO0oO() {
        int i = this.f80972OooO0oo;
        for (int i2 = 0; i != -1 && i2 < this.f80965OooO00o; i2++) {
            float[] fArr = this.f80971OooO0oO;
            fArr[i] = fArr[i] * (-1.0f);
            i = this.f80969OooO0o[i];
        }
    }

    @Override // o0000.OooO0O0.OooO00o
    public final float OooO0oo(C24044OooO0oo c24044OooO0oo) {
        int i = this.f80972OooO0oo;
        for (int i2 = 0; i != -1 && i2 < this.f80965OooO00o; i2++) {
            if (this.f80970OooO0o0[i] == c24044OooO0oo.f81007OooOo) {
                return this.f80971OooO0oO[i];
            }
            i = this.f80969OooO0o[i];
        }
        return 0.0f;
    }

    @Override // o0000.OooO0O0.OooO00o
    public final float OooOO0(int i) {
        int i2 = this.f80972OooO0oo;
        for (int i3 = 0; i2 != -1 && i3 < this.f80965OooO00o; i3++) {
            if (i3 == i) {
                return this.f80971OooO0oO[i2];
            }
            i2 = this.f80969OooO0o[i2];
        }
        return 0.0f;
    }

    @Override // o0000.OooO0O0.OooO00o
    public final void OooOO0O(C24044OooO0oo c24044OooO0oo, float f) {
        if (f == 0.0f) {
            OooO0OO(c24044OooO0oo, true);
            return;
        }
        int i = this.f80972OooO0oo;
        OooO0O0 oooO0O0 = this.f80966OooO0O0;
        if (i == -1) {
            this.f80972OooO0oo = 0;
            this.f80971OooO0oO[0] = f;
            this.f80970OooO0o0[0] = c24044OooO0oo.f81007OooOo;
            this.f80969OooO0o[0] = -1;
            c24044OooO0oo.f81018Oooo00o++;
            c24044OooO0oo.OooO00o(oooO0O0);
            this.f80965OooO00o++;
            if (this.f80973OooOO0) {
                return;
            }
            int i2 = this.f80964OooO + 1;
            this.f80964OooO = i2;
            int[] iArr = this.f80970OooO0o0;
            if (i2 >= iArr.length) {
                this.f80973OooOO0 = true;
                this.f80964OooO = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f80965OooO00o; i4++) {
            int i5 = this.f80970OooO0o0[i];
            int i6 = c24044OooO0oo.f81007OooOo;
            if (i5 == i6) {
                this.f80971OooO0oO[i] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.f80969OooO0o[i];
        }
        int length = this.f80964OooO;
        int i7 = length + 1;
        if (this.f80973OooOO0) {
            int[] iArr2 = this.f80970OooO0o0;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i7;
        }
        int[] iArr3 = this.f80970OooO0o0;
        if (length >= iArr3.length && this.f80965OooO00o < iArr3.length) {
            int i8 = 0;
            while (true) {
                int[] iArr4 = this.f80970OooO0o0;
                if (i8 >= iArr4.length) {
                    break;
                }
                if (iArr4[i8] == -1) {
                    length = i8;
                    break;
                }
                i8++;
            }
        }
        int[] iArr5 = this.f80970OooO0o0;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i9 = this.f80968OooO0Oo * 2;
            this.f80968OooO0Oo = i9;
            this.f80973OooOO0 = false;
            this.f80964OooO = length - 1;
            this.f80971OooO0oO = Arrays.copyOf(this.f80971OooO0oO, i9);
            this.f80970OooO0o0 = Arrays.copyOf(this.f80970OooO0o0, this.f80968OooO0Oo);
            this.f80969OooO0o = Arrays.copyOf(this.f80969OooO0o, this.f80968OooO0Oo);
        }
        this.f80970OooO0o0[length] = c24044OooO0oo.f81007OooOo;
        this.f80971OooO0oO[length] = f;
        if (i3 != -1) {
            int[] iArr6 = this.f80969OooO0o;
            iArr6[length] = iArr6[i3];
            iArr6[i3] = length;
        } else {
            this.f80969OooO0o[length] = this.f80972OooO0oo;
            this.f80972OooO0oo = length;
        }
        c24044OooO0oo.f81018Oooo00o++;
        c24044OooO0oo.OooO00o(oooO0O0);
        int i10 = this.f80965OooO00o + 1;
        this.f80965OooO00o = i10;
        if (!this.f80973OooOO0) {
            this.f80964OooO++;
        }
        int[] iArr7 = this.f80970OooO0o0;
        if (i10 >= iArr7.length) {
            this.f80973OooOO0 = true;
        }
        if (this.f80964OooO >= iArr7.length) {
            this.f80973OooOO0 = true;
            this.f80964OooO = iArr7.length - 1;
        }
    }

    @Override // o0000.OooO0O0.OooO00o
    public final void clear() {
        int i = this.f80972OooO0oo;
        for (int i2 = 0; i != -1 && i2 < this.f80965OooO00o; i2++) {
            C24044OooO0oo c24044OooO0oo = this.f80967OooO0OO.f80981OooO0OO[this.f80970OooO0o0[i]];
            if (c24044OooO0oo != null) {
                c24044OooO0oo.OooO0O0(this.f80966OooO0O0);
            }
            i = this.f80969OooO0o[i];
        }
        this.f80972OooO0oo = -1;
        this.f80964OooO = -1;
        this.f80973OooOO0 = false;
        this.f80965OooO00o = 0;
    }

    public final String toString() {
        int i = this.f80972OooO0oo;
        String string = "";
        for (int i2 = 0; i != -1 && i2 < this.f80965OooO00o; i2++) {
            StringBuilder sbOooO0OO = C22218Oooo.OooO0OO(Oooo00o.OooO0OO.OooO0OO(C22218Oooo.OooO0OO(C21111o0ooOoO.OooO0Oo(string, " -> ")), this.f80971OooO0oO[i], " : "));
            sbOooO0OO.append(this.f80967OooO0OO.f80981OooO0OO[this.f80970OooO0o0[i]]);
            string = sbOooO0OO.toString();
            i = this.f80969OooO0o[i];
        }
        return string;
    }
}
