package com.aspose.slides.internal.p555zp;

import android.graphics.Path;
import android.graphics.PathMeasure;
import com.aspose.slides.internal.p031aw.InterfaceC1565x1;
import com.aspose.slides.internal.p156gw.AbstractC4391bv;
import com.aspose.slides.internal.p156gw.C4417x6;
import com.aspose.slides.internal.p156gw.InterfaceC4413v4;
import com.aspose.slides.internal.p531yq.AbstractC12885k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.zp.k4 */
/* JADX INFO: loaded from: classes5.dex */
public class C13629k4 extends AbstractC12885k4<Path> {

    /* JADX INFO: renamed from: x1 */
    private Path f45251x1;

    public C13629k4(Path path) {
        this.f45251x1 = path;
        if (path != null) {
            this.f43396k4 = m62885k4(path, 0.25f);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static Path.FillType m62884k4(InterfaceC4413v4.k4 k4Var) {
        return k4Var == InterfaceC4413v4.k4.WIND_EVEN_ODD ? Path.FillType.EVEN_ODD : Path.FillType.WINDING;
    }

    /* JADX INFO: renamed from: kk */
    public static Path m62888kk(InterfaceC1565x1 interfaceC1565x1) {
        Path path = new Path();
        m62887k4(interfaceC1565x1, path);
        return path;
    }

    /* JADX INFO: renamed from: x1 */
    private static Path.FillType m62890x1(int i) {
        return i == 0 ? Path.FillType.EVEN_ODD : Path.FillType.WINDING;
    }

    @Override // com.aspose.slides.p559ms.System.InterfaceC14059g8
    public Object deepClone() {
        C13629k4 c13629k4 = new C13629k4(null);
        c13629k4.f43396k4 = new C4417x6(this.f43396k4);
        return c13629k4;
    }

    @Override // com.aspose.slides.internal.p531yq.AbstractC12885k4
    /* JADX INFO: renamed from: ne, reason: merged with bridge method [inline-methods] */
    public Path mo59957k4() {
        Path path = this.f45251x1;
        if (path == null) {
            this.f45251x1 = new Path();
        } else {
            path.rewind();
        }
        m62887k4(this.f43396k4, this.f45251x1);
        this.f45251x1.setFillType(m62890x1(m59971to()));
        return this.f45251x1;
    }

    @Override // com.aspose.slides.internal.p531yq.AbstractC12885k4
    /* JADX INFO: renamed from: rv */
    public void mo59970rv() {
        Path path = this.f45251x1;
        if (path != null) {
            path.reset();
            this.f45251x1 = null;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC4391bv m62885k4(Path path, float f) {
        AbstractC4391bv abstractC4391bvM62891x1 = m62891x1(path, f);
        abstractC4391bvM62891x1.m17828k4(m62886k4(path.getFillType()));
        return abstractC4391bvM62891x1;
    }

    /* JADX INFO: renamed from: kk */
    private AbstractC4391bv m62889kk(Path path, float f) {
        AbstractC4391bv.x1 x1Var = new AbstractC4391bv.x1();
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        do {
            float length = pathMeasure.getLength();
            if (length > 0.0f) {
                float fMin = length / Math.min(128, ((int) (length / f)) + 1);
                for (float f2 = 0.0f; f2 <= length; f2 += fMin) {
                    pathMeasure.getPosTan(f2, fArr, null);
                    if (f2 == 0.0f) {
                        x1Var.m17842k4(fArr[0], fArr[1]);
                    } else {
                        x1Var.m17845x1(fArr[0], fArr[1]);
                    }
                }
                if (pathMeasure.isClosed()) {
                    x1Var.m17825k4();
                }
            }
        } while (pathMeasure.nextContour());
        return x1Var;
    }

    /* JADX INFO: renamed from: x1 */
    private AbstractC4391bv m62891x1(Path path, float f) {
        AbstractC4391bv.x1 x1Var = new AbstractC4391bv.x1();
        float[] fArrApproximate = path.approximate(f);
        int length = fArrApproximate.length / 3;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i = 0;
        float f4 = 0.0f;
        while (i < length) {
            int i2 = i * 3;
            int i3 = i2 + 1;
            int i4 = i2 + 2;
            float f5 = fArrApproximate[i2];
            if (i == 0 || f2 == f5) {
                x1Var.m17842k4(fArrApproximate[i3], fArrApproximate[i4]);
                float f6 = fArrApproximate[i3];
                f3 = fArrApproximate[i4];
                f4 = f6;
            } else {
                float f7 = fArrApproximate[i3];
                if (f4 == f7 && f3 == fArrApproximate[i4]) {
                    x1Var.m17825k4();
                } else {
                    x1Var.m17845x1(f7, fArrApproximate[i4]);
                }
            }
            i++;
            f2 = f5;
        }
        return x1Var;
    }

    /* JADX INFO: renamed from: k4 */
    private static InterfaceC4413v4.k4 m62886k4(Path.FillType fillType) {
        return (fillType == Path.FillType.EVEN_ODD || fillType == Path.FillType.INVERSE_EVEN_ODD) ? InterfaceC4413v4.k4.WIND_EVEN_ODD : InterfaceC4413v4.k4.WIND_NON_ZERO;
    }

    /* JADX INFO: renamed from: k4 */
    private static void m62887k4(InterfaceC1565x1 interfaceC1565x1, Path path) {
        Path path2;
        InterfaceC4413v4 interfaceC4413v4Mo8359kk = interfaceC1565x1.mo8359kk(null);
        path.setFillType(m62884k4(interfaceC4413v4Mo8359kk.mo17819k4()));
        float[] fArr = new float[6];
        while (!interfaceC4413v4Mo8359kk.mo17821x1()) {
            byte bMo17818k4 = (byte) interfaceC4413v4Mo8359kk.mo17818k4(fArr);
            if (bMo17818k4 == 0) {
                path2 = path;
                path2.moveTo(fArr[0], fArr[1]);
            } else if (bMo17818k4 == 1) {
                path2 = path;
                path2.lineTo(fArr[0], fArr[1]);
            } else if (bMo17818k4 == 2) {
                path2 = path;
                path2.quadTo(fArr[0], fArr[1], fArr[2], fArr[3]);
            } else if (bMo17818k4 != 3) {
                if (bMo17818k4 == 4) {
                    path.close();
                }
                path2 = path;
            } else {
                path2 = path;
                path2.cubicTo(fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5]);
            }
            interfaceC4413v4Mo8359kk.mo17820kk();
            path = path2;
        }
    }
}
