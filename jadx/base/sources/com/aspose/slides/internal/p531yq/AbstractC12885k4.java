package com.aspose.slides.internal.p531yq;

import com.aspose.slides.internal.p031aw.InterfaceC1565x1;
import com.aspose.slides.internal.p156gw.AbstractC4391bv;
import com.aspose.slides.internal.p156gw.C4417x6;
import com.aspose.slides.internal.p156gw.InterfaceC4413v4;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12025x6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: com.aspose.slides.internal.yq.k4 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC12885k4<T_Path> implements InterfaceC12886x1<T_Path> {

    /* JADX INFO: renamed from: x1 */
    private Set<Integer> f43397x1 = new HashSet();

    /* JADX INFO: renamed from: k4 */
    protected AbstractC4391bv f43396k4 = new C4417x6();

    /* JADX INFO: renamed from: k4 */
    private int m59948k4(InterfaceC4413v4.k4 k4Var) {
        return k4Var == InterfaceC4413v4.k4.WIND_EVEN_ODD ? 0 : 1;
    }

    @Override // com.aspose.slides.internal.p531yq.InterfaceC12886x1
    /* JADX INFO: renamed from: c5 */
    public C12025x6 mo59950c5() {
        return this.f43396k4.m17835to();
    }

    @Override // com.aspose.slides.internal.p531yq.InterfaceC12886x1
    /* JADX INFO: renamed from: ck */
    public boolean mo59951ck() {
        InterfaceC4413v4 interfaceC4413v4M59974x1 = m59974x1((C11913yj) null);
        while (!interfaceC4413v4M59974x1.mo17821x1()) {
            if (((byte) interfaceC4413v4M59974x1.mo17818k4(new float[6])) == 3) {
                return true;
            }
            interfaceC4413v4M59974x1.mo17820kk();
        }
        return false;
    }

    @Override // com.aspose.slides.internal.p531yq.InterfaceC12886x1
    /* JADX INFO: renamed from: du */
    public Set<Integer> mo59952du() {
        return this.f43397x1;
    }

    @Override // com.aspose.slides.internal.p531yq.InterfaceC12886x1
    /* JADX INFO: renamed from: dy */
    public int mo59953dy() {
        return mo59969m9() / 2;
    }

    @Override // com.aspose.slides.internal.p531yq.InterfaceC12886x1
    /* JADX INFO: renamed from: fa */
    public void mo59954fa() {
        this.f43396k4.m17825k4();
    }

    @Override // com.aspose.slides.internal.p531yq.InterfaceC12886x1
    /* JADX INFO: renamed from: h4 */
    public void mo59955h4() {
        int iMo59953dy = mo59953dy();
        if (iMo59953dy > 0) {
            this.f43397x1.add(Integer.valueOf(iMo59953dy - 1));
        }
    }

    @Override // com.aspose.slides.internal.p531yq.InterfaceC12886x1
    /* JADX INFO: renamed from: jd */
    public boolean mo59956jd() {
        InterfaceC4413v4 interfaceC4413v4M59974x1 = m59974x1((C11913yj) null);
        byte bMo17818k4 = -1;
        while (!interfaceC4413v4M59974x1.mo17821x1()) {
            bMo17818k4 = (byte) interfaceC4413v4M59974x1.mo17818k4(new float[6]);
            interfaceC4413v4M59974x1.mo17820kk();
        }
        return bMo17818k4 == -1 || bMo17818k4 == 4;
    }

    /* JADX INFO: renamed from: k4 */
    public abstract T_Path mo59957k4();

    @Override // com.aspose.slides.internal.p531yq.InterfaceC12886x1
    /* JADX INFO: renamed from: kk */
    public T_Path mo59967kk() {
        return mo59957k4();
    }

    @Override // com.aspose.slides.internal.p531yq.InterfaceC12886x1
    /* JADX INFO: renamed from: ks */
    public void mo59968ks() {
        this.f43396k4.m17822du();
        mo59970rv();
    }

    @Override // com.aspose.slides.internal.p531yq.InterfaceC12886x1
    /* JADX INFO: renamed from: m9 */
    public int mo59969m9() {
        return this.f43396k4.m17823h4();
    }

    /* JADX INFO: renamed from: rv */
    public abstract void mo59970rv();

    /* JADX INFO: renamed from: to */
    public int m59971to() {
        return m59948k4(this.f43396k4.m17840x1());
    }

    @Override // com.aspose.slides.internal.p531yq.InterfaceC12886x1
    /* JADX INFO: renamed from: up */
    public void mo59972up() {
        float[] fArrM59977x6 = m59977x6();
        ArrayList arrayList = new ArrayList();
        InterfaceC4413v4 interfaceC4413v4M59974x1 = m59974x1((C11913yj) null);
        while (!interfaceC4413v4M59974x1.mo17821x1()) {
            arrayList.add(Byte.valueOf((byte) interfaceC4413v4M59974x1.mo17818k4(new float[6])));
            interfaceC4413v4M59974x1.mo17820kk();
        }
        for (int i = 1; i < arrayList.size(); i++) {
            if (((Byte) arrayList.get(i)).byteValue() == 0 && ((Byte) arrayList.get(i - 1)).byteValue() != 4) {
                arrayList.add(i, (byte) 4);
            }
        }
        mo59978yj();
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            byte bByteValue = ((Byte) arrayList.get(i3)).byteValue();
            if (bByteValue == 0) {
                int i4 = i2 + 1;
                float f = fArrM59977x6[i2];
                i2 += 2;
                mo59958k4(f, fArrM59977x6[i4]);
            } else if (bByteValue == 1) {
                int i5 = i2 + 1;
                float f2 = fArrM59977x6[i2];
                i2 += 2;
                mo59975x1(f2, fArrM59977x6[i5]);
            } else if (bByteValue == 2) {
                float f3 = fArrM59977x6[i2];
                float f4 = fArrM59977x6[i2 + 1];
                int i6 = i2 + 3;
                float f5 = fArrM59977x6[i2 + 2];
                i2 += 4;
                m59959k4(f3, f4, f5, fArrM59977x6[i6]);
            } else if (bByteValue == 3) {
                float f6 = fArrM59977x6[i2];
                float f7 = fArrM59977x6[i2 + 1];
                float f8 = fArrM59977x6[i2 + 2];
                float f9 = fArrM59977x6[i2 + 3];
                int i7 = i2 + 5;
                float f10 = fArrM59977x6[i2 + 4];
                i2 += 6;
                mo59960k4(f6, f7, f8, f9, f10, fArrM59977x6[i7]);
            } else if (bByteValue == 4) {
                mo59954fa();
            }
        }
    }

    @Override // com.aspose.slides.internal.p531yq.InterfaceC12886x1
    /* JADX INFO: renamed from: x1 */
    public InterfaceC1565x1 mo59973x1() {
        return this.f43396k4;
    }

    /* JADX INFO: renamed from: x6 */
    public float[] m59977x6() {
        float[] fArr = new float[6];
        float[] fArrCopyOf = new float[20];
        InterfaceC4413v4 interfaceC4413v4M59974x1 = m59974x1((C11913yj) null);
        int i = 0;
        while (!interfaceC4413v4M59974x1.mo17821x1()) {
            byte bMo17818k4 = (byte) interfaceC4413v4M59974x1.mo17818k4(fArr);
            if (i + 6 >= fArrCopyOf.length) {
                int length = fArrCopyOf.length;
                if (length > 500) {
                    length = 500;
                }
                fArrCopyOf = Arrays.copyOf(fArrCopyOf, fArrCopyOf.length + length);
            }
            if (bMo17818k4 == 0) {
                int i2 = i + 1;
                fArrCopyOf[i] = fArr[0];
                i += 2;
                fArrCopyOf[i2] = fArr[1];
            } else if (bMo17818k4 == 1) {
                int i3 = i + 1;
                fArrCopyOf[i] = fArr[0];
                i += 2;
                fArrCopyOf[i3] = fArr[1];
            } else if (bMo17818k4 == 2) {
                fArrCopyOf[i] = fArr[0];
                fArrCopyOf[i + 1] = fArr[1];
                int i4 = i + 3;
                fArrCopyOf[i + 2] = fArr[2];
                i += 4;
                fArrCopyOf[i4] = fArr[3];
            } else if (bMo17818k4 == 3) {
                fArrCopyOf[i] = fArr[0];
                fArrCopyOf[i + 1] = fArr[1];
                fArrCopyOf[i + 2] = fArr[2];
                fArrCopyOf[i + 3] = fArr[3];
                int i5 = i + 5;
                fArrCopyOf[i + 4] = fArr[4];
                i += 6;
                fArrCopyOf[i5] = fArr[5];
            }
            interfaceC4413v4M59974x1.mo17820kk();
        }
        return Arrays.copyOf(fArrCopyOf, i);
    }

    @Override // com.aspose.slides.internal.p531yq.InterfaceC12886x1
    /* JADX INFO: renamed from: yj */
    public void mo59978yj() {
        this.f43396k4.m17822du();
        mo59961k4(0);
        this.f43397x1.clear();
    }

    /* JADX INFO: renamed from: x1 */
    private InterfaceC4413v4.k4 m59949x1(int i) {
        return i == 0 ? InterfaceC4413v4.k4.WIND_EVEN_ODD : InterfaceC4413v4.k4.WIND_NON_ZERO;
    }

    @Override // com.aspose.slides.internal.p531yq.InterfaceC12886x1
    /* JADX INFO: renamed from: k4 */
    public void mo59958k4(float f, float f2) {
        this.f43396k4.mo17833kk(f, f2);
    }

    /* JADX INFO: renamed from: k4 */
    public void m59959k4(float f, float f2, float f3, float f4) {
        this.f43396k4.mo17834kk(f, f2, f3, f4);
    }

    /* JADX INFO: renamed from: x1 */
    public InterfaceC4413v4 m59974x1(C11913yj c11913yj) {
        return this.f43396k4.mo8359kk(c11913yj);
    }

    @Override // com.aspose.slides.internal.p531yq.InterfaceC12886x1
    /* JADX INFO: renamed from: k4 */
    public void mo59960k4(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f43396k4.mo17826k4(f, f2, f3, f4, f5, f6);
    }

    @Override // com.aspose.slides.internal.p531yq.InterfaceC12886x1
    /* JADX INFO: renamed from: x1 */
    public void mo59975x1(float f, float f2) {
        this.f43396k4.mo17836to(f, f2);
    }

    @Override // com.aspose.slides.internal.p531yq.InterfaceC12886x1
    /* JADX INFO: renamed from: k4 */
    public void mo59961k4(int i) {
        this.f43396k4.m17828k4(m59949x1(i));
    }

    @Override // com.aspose.slides.internal.p531yq.InterfaceC12886x1
    /* JADX INFO: renamed from: x1 */
    public void mo59976x1(InterfaceC1565x1 interfaceC1565x1) {
        mo59963k4(interfaceC1565x1, !mo59956jd());
    }

    @Override // com.aspose.slides.internal.p531yq.InterfaceC12886x1
    /* JADX INFO: renamed from: k4 */
    public void mo59962k4(InterfaceC1565x1 interfaceC1565x1) {
        if (interfaceC1565x1 instanceof AbstractC4391bv) {
            this.f43396k4 = (AbstractC4391bv) interfaceC1565x1;
        } else {
            this.f43396k4 = new C4417x6(interfaceC1565x1);
        }
    }

    @Override // com.aspose.slides.internal.p531yq.InterfaceC12886x1
    /* JADX INFO: renamed from: k4 */
    public void mo59963k4(InterfaceC1565x1 interfaceC1565x1, boolean z) {
        mo59964k4(interfaceC1565x1.mo8359kk(null), z);
    }

    @Override // com.aspose.slides.internal.p531yq.InterfaceC12886x1
    /* JADX INFO: renamed from: k4 */
    public void mo59964k4(InterfaceC4413v4 interfaceC4413v4, boolean z) {
        this.f43396k4.mo17829k4(interfaceC4413v4, z);
    }

    @Override // com.aspose.slides.internal.p531yq.InterfaceC12886x1
    /* JADX INFO: renamed from: k4 */
    public void mo59965k4(C11913yj c11913yj) {
        this.f43396k4.mo17837to(c11913yj);
    }

    @Override // com.aspose.slides.internal.p531yq.InterfaceC12886x1
    /* JADX INFO: renamed from: k4 */
    public void mo59966k4(C11913yj c11913yj, int i, int i2) {
        int i3;
        float[] fArrM59977x6 = m59977x6();
        ArrayList<Byte> arrayList = new ArrayList();
        InterfaceC4413v4 interfaceC4413v4M59974x1 = m59974x1((C11913yj) null);
        while (!interfaceC4413v4M59974x1.mo17821x1()) {
            arrayList.add(Byte.valueOf((byte) interfaceC4413v4M59974x1.mo17818k4(new float[6])));
            interfaceC4413v4M59974x1.mo17820kk();
        }
        c11913yj.m55773k4(fArrM59977x6, i, fArrM59977x6, i, i2 / 2);
        mo59978yj();
        int i4 = 0;
        for (Byte b : arrayList) {
            byte bByteValue = b.byteValue();
            if (bByteValue == 0) {
                int i5 = i4;
                int i6 = i5 + 1;
                float f = fArrM59977x6[i5];
                i3 = i5 + 2;
                mo59958k4(f, fArrM59977x6[i6]);
            } else if (bByteValue == 1) {
                int i7 = i4;
                int i8 = i7 + 1;
                float f2 = fArrM59977x6[i7];
                i3 = i7 + 2;
                mo59975x1(f2, fArrM59977x6[i8]);
            } else if (bByteValue == 2) {
                int i9 = i4;
                float f3 = fArrM59977x6[i9];
                float f4 = fArrM59977x6[i9 + 1];
                int i10 = i9 + 3;
                float f5 = fArrM59977x6[i9 + 2];
                i3 = i9 + 4;
                m59959k4(f3, f4, f5, fArrM59977x6[i10]);
            } else if (bByteValue == 3) {
                int i11 = i4;
                mo59960k4(fArrM59977x6[i11], fArrM59977x6[i4 + 1], fArrM59977x6[i11 + 2], fArrM59977x6[i11 + 3], fArrM59977x6[i11 + 4], fArrM59977x6[i11 + 5]);
                i4 = i11 + 6;
            } else {
                if (bByteValue != 4) {
                    throw new IllegalStateException("Invalid path point type=" + b);
                }
                mo59954fa();
            }
            i4 = i3;
        }
    }
}
