package com.aspose.slides.internal.p200j6;

import OooOO0.OooO0OO;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p329p4.C7179c5;
import com.aspose.slides.internal.p329p4.C7180ck;
import com.aspose.slides.internal.p329p4.C7182dy;
import com.aspose.slides.internal.p329p4.C7185jd;
import com.aspose.slides.internal.p329p4.C7186k4;
import com.aspose.slides.internal.p329p4.C7189m9;
import com.aspose.slides.internal.p329p4.C7191up;
import com.aspose.slides.internal.p333p8.C9421c5;
import com.aspose.slides.internal.p333p8.C9427jd;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.j6.yj */
/* JADX INFO: loaded from: classes.dex */
public class C5214yj extends AbstractC5205k4 {

    /* JADX INFO: renamed from: du */
    private float[][] f14238du;

    /* JADX INFO: renamed from: h4 */
    private int[][] f14239h4;

    /* JADX INFO: renamed from: k4 */
    private C7186k4 f14240k4;

    /* JADX INFO: renamed from: kk */
    private byte[] f14241kk;

    /* JADX INFO: renamed from: m9 */
    private C5210to f14242m9;

    /* JADX INFO: renamed from: to */
    private int f14243to;

    /* JADX INFO: renamed from: x1 */
    private AbstractC5200du f14244x1;

    public C5214yj() {
        C7186k4 c7186k4 = new C7186k4();
        this.f14240k4 = c7186k4;
        c7186k4.m27783k4(C7182dy.f19732z6);
        this.f14240k4.m27783k4(C7182dy.f19650u5);
        this.f14240k4.m27783k4(C7189m9.m27822k4(255L));
        this.f14240k4.m27783k4(C7185jd.m27775dy());
    }

    /* JADX INFO: renamed from: ck */
    private int m22238ck() {
        return ((C7179c5) this.f14240k4.m27787x1(2)).m27752kk();
    }

    /* JADX INFO: renamed from: dy */
    private void m22239dy() {
        if (this.f14241kk == null) {
            C7185jd c7185jdM27787x1 = this.f14240k4.m27787x1(3);
            if (C7019kk.m27469x1(c7185jdM27787x1, C7191up.class)) {
                this.f14241kk = ((C7191up) c7185jdM27787x1).m27846k4();
            } else if (C7019kk.m27469x1(c7185jdM27787x1, C7180ck.class)) {
                this.f14241kk = new C9427jd((C7180ck) c7185jdM27787x1).m46154k4();
            } else if (c7185jdM27787x1 == null) {
                this.f14241kk = new byte[0];
            }
        }
    }

    /* JADX INFO: renamed from: fa */
    private void m22240fa() {
        C12003du c12003duM56397k4;
        int iMo8467du = this.f14244x1.mo8467du();
        C12003du[] c12003duArrM15746k4 = new C12009k4(this.f14243to + 1, 1, 198659).mo15749c5().m15746k4();
        int[] iArr = new int[iMo8467du];
        int i = this.f14243to;
        for (int i2 = 0; i2 <= i; i2++) {
            for (int i3 = 0; i3 < iMo8467du; i3++) {
                iArr[i3] = OooO0OO.OooO0OO(this.f14238du[i2][i3], 255.0f, 13);
            }
            C12003du c12003duClone = C12003du.m56385i5().Clone();
            if (iMo8467du == 3) {
                c12003duM56397k4 = C12003du.m56397k4(iArr[0], iArr[1], iArr[2]);
            } else if (iMo8467du != 4) {
                c12003duClone.CloneTo(c12003duArrM15746k4[i2]);
            } else {
                c12003duM56397k4 = C12003du.m56398k4(iArr[0], iArr[1], iArr[2], iArr[3]);
            }
            c12003duM56397k4.CloneTo(c12003duClone);
            c12003duClone.CloneTo(c12003duArrM15746k4[i2]);
        }
        this.f14239h4 = new int[this.f14243to + 1][];
        int i4 = 0;
        while (true) {
            int[][] iArr2 = this.f14239h4;
            if (i4 >= iArr2.length) {
                break;
            }
            iArr2[i4] = new int[3];
            i4++;
        }
        int i5 = this.f14243to;
        for (int i6 = 0; i6 <= i5; i6++) {
            C12003du c12003duClone2 = c12003duArrM15746k4[i6].Clone();
            this.f14239h4[i6] = new int[]{c12003duClone2.m56507jd() & 255, c12003duClone2.m56502ck() & 255, c12003duClone2.m56505fa() & 255};
        }
    }

    /* JADX INFO: renamed from: h4 */
    public static String m22241h4() {
        return "I";
    }

    /* JADX INFO: renamed from: jd */
    private void m22242jd() {
        m22239dy();
        int iM67507x1 = C14116yg.m67507x1(m22238ck(), 255);
        int iMo8467du = this.f14244x1.mo8467du();
        byte[] bArr = this.f14241kk;
        if (bArr.length / iMo8467du < iM67507x1 + 1) {
            iM67507x1 = (bArr.length / iMo8467du) - 1;
        }
        this.f14243to = iM67507x1;
        this.f14238du = new float[iM67507x1 + 1][];
        int i = 0;
        while (true) {
            float[][] fArr = this.f14238du;
            if (i >= fArr.length) {
                break;
            }
            fArr[i] = new float[iMo8467du];
            i++;
        }
        int i2 = 0;
        for (int i3 = 0; i3 <= iM67507x1; i3++) {
            for (int i4 = 0; i4 < iMo8467du; i4++) {
                this.f14238du[i3][i4] = (this.f14241kk[i2] & 255) / 255.0f;
                i2++;
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static String m22243x1() {
        return "Indexed";
    }

    @Override // com.aspose.slides.internal.p200j6.AbstractC5200du
    /* JADX INFO: renamed from: du */
    public int mo8467du() {
        return m22245m9().mo8467du();
    }

    @Override // com.aspose.slides.internal.p200j6.AbstractC5205k4
    /* JADX INFO: renamed from: k4 */
    public C7186k4 mo22215k4() {
        return this.f14240k4;
    }

    @Override // com.aspose.slides.internal.p200j6.AbstractC5200du
    /* JADX INFO: renamed from: kk */
    public C5210to mo8469kk() {
        if (this.f14242m9 == null) {
            this.f14242m9 = new C5210to(new float[]{0.0f}, this);
        }
        return this.f14242m9;
    }

    /* JADX INFO: renamed from: m9 */
    public final AbstractC5200du m22245m9() {
        return C5203h4.m22209k4(this.f14240k4.m27787x1(1));
    }

    @Override // com.aspose.slides.internal.p200j6.AbstractC5200du
    /* JADX INFO: renamed from: to */
    public String mo8470to() {
        return m22243x1();
    }

    public C5214yj(C7186k4 c7186k4, C9421c5 c9421c5) {
        this.f14240k4 = c7186k4;
        this.f14244x1 = AbstractC5200du.m22203k4(c7186k4.m27785kk(1), c9421c5);
        m22242jd();
        m22240fa();
    }

    /* JADX INFO: renamed from: k4 */
    public final C12009k4 m22244k4(C12009k4 c12009k4) {
        int iMo15760yj = c12009k4.mo15760yj();
        int iMo15757m9 = c12009k4.mo15757m9();
        C12009k4 c12009k42 = new C12009k4(iMo15760yj, iMo15757m9, 139273);
        for (int i = 0; i < iMo15757m9; i++) {
            for (int i2 = 0; i2 < iMo15760yj; i2++) {
                int[] iArr = this.f14239h4[C14116yg.m67507x1(c12009k42.m56609x1(i2, i).Clone().m56507jd() & 255, this.f14243to)];
                c12009k42.m56604k4(i2, i, C12003du.m56397k4(iArr[0], iArr[1], iArr[2]).Clone().Clone());
            }
        }
        return c12009k42;
    }

    @Override // com.aspose.slides.internal.p200j6.AbstractC5200du
    /* JADX INFO: renamed from: k4 */
    public float[] mo8468k4(float[] fArr) {
        if (fArr.length > 1) {
            throw new ArgumentException("Indexed color spaces must have one color value");
        }
        int[] iArr = this.f14239h4[C14116yg.m67507x1(C14116yg.m67483k4(C7019kk.m27462to(Double.valueOf(C14116yg.m67497to(fArr[0])), 14), 0), this.f14243to)];
        return new float[]{iArr[0] / 255.0f, iArr[1] / 255.0f, iArr[2] / 255.0f};
    }
}
