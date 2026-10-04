package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class xyf extends AbstractC0753ak {

    /* JADX INFO: renamed from: k4 */
    private boolean f50232k4;

    /* JADX INFO: renamed from: c5 */
    private xji m73652c5() {
        return (xji) m3643k4();
    }

    /* JADX INFO: renamed from: k4 */
    private bay m73653k4(String str, List<bay> list) {
        List.Enumerator<bay> it = list.iterator();
        while (it.hasNext()) {
            try {
                bay next = it.next();
                if (C14113y2.m67363du(next.m4099m9().mo4816J_(), str)) {
                    return next;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            return null;
        }
        it.dispose();
        return null;
    }

    @Override // com.aspose.slides.wsu
    /* JADX INFO: renamed from: L_ */
    public void mo4732L_() {
        this.f50232k4 = false;
    }

    /* JADX INFO: renamed from: dy */
    public final boolean m73655dy() {
        return this.f50232k4;
    }

    /* JADX INFO: renamed from: k4 */
    private void m73654k4(bay bayVar, double d, double d2, double d3) {
        bayVar.m4103to(61, d);
        bayVar.m4103to(15, d2);
        bayVar.m4103to(8, d3);
        bayVar.m4103to(10, d2 / 2.0d);
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x0201 A[PHI: r0
      0x0201: PHI (r0v37 int) = (r0v32 int), (r0v40 int) binds: [B:94:0x0212, B:86:0x01ff] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0203 A[PHI: r0
      0x0203: PHI (r0v34 int) = (r0v32 int), (r0v40 int) binds: [B:94:0x0212, B:86:0x01ff] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.aspose.slides.AbstractC0753ak
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo3646k4(bay bayVar) {
        double d;
        int i;
        bay bayVar2;
        xji xjiVar;
        int i2;
        long j;
        int i3;
        long j2;
        int i4;
        int i5;
        xyf xyfVar = this;
        bay bayVar3 = bayVar;
        xji xjiVarM73652c5 = xyfVar.m73652c5();
        int size = bayVar3.m4110x1().size();
        if (size > 0) {
            double dM4072du = bayVar3.m4072du(61);
            double dM4072du2 = bayVar3.m4072du(15);
            double dM4072du3 = bayVar3.m4072du(23);
            if (dM4072du3 > 1.0d) {
                dM4072du3 = 1.0d;
            } else if (dM4072du3 < 0.0d) {
                dM4072du3 = 0.0d;
            }
            double d2 = 0.0d;
            int i6 = 0;
            int i7 = 0;
            int i8 = size;
            while (i6 < size) {
                bay bayVarM73653k4 = xyfVar.m73653k4(xjiVarM73652c5.m73447kk(), bayVar3.m4110x1().get_Item(i6).m4110x1());
                if (bayVarM73653k4 == null) {
                    throw new NullReferenceException("TreeNode couldn't be empty.");
                }
                double d3 = dM4072du;
                if (bayVarM73653k4.m4066ar().f49091x1 != 1.0d) {
                    d2 += bayVarM73653k4.m4066ar().f49091x1;
                    i8--;
                }
                i6++;
                dM4072du = d3;
            }
            double d4 = dM4072du;
            double d5 = d4 - (d4 * dM4072du3);
            double d6 = d4 - d5;
            double d7 = ((double) i8) + d2;
            double d8 = dM4072du2 / d7;
            double d9 = d5 / (d7 * 2.0d);
            double d10 = xjiVarM73652c5.m73448m9() == 0 ? d6 : 0.0d;
            if (xjiVarM73652c5.m73446h4() == 1) {
                d10 = (d5 / 2.0d) + d10;
            }
            double d11 = xjiVarM73652c5.m73446h4() == 1 ? 0.0d : d5;
            int i9 = 0;
            double d12 = 0.0d;
            while (i9 < size) {
                bay bayVar4 = bayVar3.m4110x1().get_Item(i9);
                bayVar4.m4103to(15, d8);
                double d13 = d10;
                bay bayVarM73653k42 = xyfVar.m73653k4(xjiVarM73652c5.m73447kk(), bayVar4.m4110x1());
                bay bayVarM73653k43 = xyfVar.m73653k4(xjiVarM73652c5.m73449to(), bayVar4.m4110x1());
                if (bayVarM73653k42 == null) {
                    throw new NullReferenceException("TreeNode couldn't be empty.");
                }
                double d14 = d9 * bayVarM73653k42.m4066ar().f49091x1;
                if (i9 != 0 || xjiVarM73652c5.m73446h4() != 4) {
                    d11 += ((double) (xjiVarM73652c5.m73446h4() == 1 ? 2 : -2)) * d14;
                    d13 = (((double) (xjiVarM73652c5.m73446h4() == 1 ? -1 : 1)) * d14) + d13;
                }
                bay bayVarM73653k44 = xyfVar.m73653k4(xjiVarM73652c5.m73444du(), bayVar4.m4110x1());
                bayVar4.m4074dy().m74246k4((xjiVarM73652c5.m73448m9() == 1 || (xjiVarM73652c5.m73448m9() == 0 && bayVarM73653k44 == null)) ? d13 : 0.0d, d12);
                if (xyfVar.f50232k4) {
                    d = d11;
                    i = size;
                    bayVar2 = bayVarM73653k42;
                    xjiVar = xjiVarM73652c5;
                } else {
                    if (xjiVarM73652c5.m73446h4() == 4) {
                        bayVarM73653k42.m4074dy().m74229ck(180.0d);
                    }
                    SmartArtShape smartArtShapeM74280x1 = bayVarM73653k42.m4074dy().m74280x1();
                    if (smartArtShapeM74280x1.getShapeType() == 8 && smartArtShapeM74280x1.m1591yj().m3334x1()[i7].m64510to()) {
                        smartArtShapeM74280x1.getAdjustments().get_Item(i7).setRawValue(C7019kk.m27438h4(Double.valueOf((d14 * 100000.0d) / C14116yg.m67491kk(d8, d11)), 14));
                    }
                    double d15 = d11 / 2.0d;
                    if (xjiVarM73652c5.m73448m9() == 0 && bayVarM73653k44 != null) {
                        d15 += d13;
                    }
                    double d16 = d11;
                    i = size;
                    xjiVar = xjiVarM73652c5;
                    xyfVar.m73654k4(bayVarM73653k42, d16, d8, d15);
                    bayVar2 = bayVarM73653k42;
                    d = d16;
                    double d17 = ((d5 - d) / 2.0d) + d6 + d14;
                    if (bayVarM73653k44 != null) {
                        if (xjiVar.m73446h4() == 1) {
                            bayVarM73653k44.m4074dy().m74229ck(180.0d);
                        }
                        SmartArtShape smartArtShapeM74280x12 = bayVarM73653k44.m4074dy().m74280x1();
                        if (smartArtShapeM74280x12.getShapeType() == 9) {
                            if (xjiVar.m73446h4() == 4) {
                                i4 = xjiVar.m73448m9() == 0 ? 0 : 1;
                                i5 = xjiVar.m73448m9() == 0 ? 1 : 0;
                            } else {
                                i4 = xjiVar.m73448m9() == 0 ? 1 : 0;
                                if (xjiVar.m73448m9() == 0) {
                                }
                            }
                            smartArtShapeM74280x12.getAdjustments().get_Item(i5).setRawValue(C7019kk.m27438h4(Double.valueOf((100000.0d * d9) / C14116yg.m67491kk(d8, d17)), 14));
                            j2 = 0;
                            smartArtShapeM74280x12.getAdjustments().get_Item(i4).setRawValue(0L);
                        } else {
                            j2 = 0;
                        }
                        double d18 = d17 / 2.0d;
                        if (xjiVar.m73448m9() == 1) {
                            d18 = (d - d9) + d18;
                        }
                        double d19 = d18;
                        j = j2;
                        i2 = 9;
                        m73654k4(bayVarM73653k44, d17, d8, d19);
                    } else {
                        i2 = 9;
                        j = 0;
                    }
                    if (bayVarM73653k43 != null) {
                        SmartArtShape smartArtShapeM74280x13 = bayVarM73653k43.m4074dy().m74280x1();
                        if (smartArtShapeM74280x13.getShapeType() == i2) {
                            smartArtShapeM74280x13.getAdjustments().get_Item(0).setRawValue(j);
                            i3 = 1;
                            smartArtShapeM74280x13.getAdjustments().get_Item(1).setRawValue(j);
                        } else {
                            i3 = 1;
                        }
                        double d20 = xjiVar.m73445dy() == 0 ? d17 - d14 : d6;
                        double d21 = d20 / 2.0d;
                        if (xjiVar.m73448m9() == i3) {
                            d21 += d;
                        }
                        if (xjiVar.m73445dy() == i3 && xjiVar.m73448m9() == i3) {
                            d21 += (d17 - d14) - d20;
                        }
                        xyfVar = this;
                        xyfVar.m73654k4(bayVarM73653k43, d20, d8, d21);
                    } else {
                        xyfVar = this;
                    }
                }
                d12 += bayVar2.m4066ar().f49091x1 * d8;
                i9++;
                bayVar3 = bayVar;
                d10 = d13;
                xjiVarM73652c5 = xjiVar;
                size = i;
                d11 = d;
                i7 = 0;
            }
        }
        if (xyfVar.f50232k4) {
            return true;
        }
        List.Enumerator<bay> it = bayVar.m4110x1().iterator();
        while (it.hasNext()) {
            try {
                bay next = it.next();
                next.m4077jd().mo3642h4(next);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        xyfVar.f50232k4 = true;
        return false;
    }
}
