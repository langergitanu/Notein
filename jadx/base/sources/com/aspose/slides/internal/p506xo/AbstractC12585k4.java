package com.aspose.slides.internal.p506xo;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p329p4.C7179c5;
import com.aspose.slides.internal.p329p4.C7182dy;
import com.aspose.slides.internal.p329p4.C7185jd;
import com.aspose.slides.internal.p329p4.C7186k4;
import com.aspose.slides.internal.p329p4.C7187kk;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import com.microsoft.identity.common.java.platform.AbstractDevicePopManager;

/* JADX INFO: renamed from: com.aspose.slides.internal.xo.k4 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC12585k4 extends AbstractC12578c5 {

    /* JADX INFO: renamed from: du */
    private Dictionary<Integer, Float> f42110du;

    /* JADX INFO: renamed from: h4 */
    private long f42111h4;

    public AbstractC12585k4() {
        this.f42111h4 = 0L;
    }

    /* JADX INFO: renamed from: ar */
    private void m58742ar() {
        String strM58743qq = m58743qq();
        if (strM58743qq == null || C14113y2.m67359c5(strM58743qq, AbstractDevicePopManager.CertificateProperties.ORGANIZATION_UNIT) || C14113y2.m67448x1(strM58743qq, "Adobe-UCS-")) {
            return;
        }
        C14113y2.m67408k4(C14113y2.m67443x1(strM58743qq, 0, C14113y2.m67430to(strM58743qq, CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR)), "-UCS2");
    }

    /* JADX INFO: renamed from: qq */
    private String m58743qq() {
        C7187kk c7187kk = (C7187kk) this.f42121k4.mo27768h4(C7182dy.f19607ri);
        if (c7187kk == null) {
            return null;
        }
        return C14113y2.m67408k4(c7187kk.m27811to(C7182dy.f19473j0), CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR, c7187kk.m27811to(C7182dy.f19517lv), CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR, C14057f9.m66591x1(c7187kk.m27790c5(C7182dy.f19700xh)));
    }

    /* JADX INFO: renamed from: wl */
    private void m58744wl() {
        if (this.f42110du == null) {
            this.f42110du = new Dictionary<>();
            C7186k4 c7186k4 = (C7186k4) this.f42121k4.mo27768h4(C7182dy.f19652ug);
            if (c7186k4 != null) {
                int iM27778k4 = c7186k4.m27778k4();
                int i = 0;
                while (i < iM27778k4) {
                    C7179c5 c7179c5 = (C7179c5) c7186k4.m27787x1(i);
                    int i2 = i + 2;
                    C7185jd c7185jdM27787x1 = c7186k4.m27787x1(i + 1);
                    if (C7019kk.m27469x1(c7185jdM27787x1, C7186k4.class)) {
                        C7186k4 c7186k42 = (C7186k4) c7185jdM27787x1;
                        int iM27752kk = c7179c5.m27752kk();
                        int iM27778k42 = c7186k42.m27778k4();
                        for (int i3 = 0; i3 < iM27778k42; i3++) {
                            C7179c5 c7179c52 = (C7179c5) c7186k42.m27785kk(i3);
                            int i4 = iM27752kk + i3;
                            if (!this.f42110du.containsKey(Integer.valueOf(i4))) {
                                this.f42110du.addItem(Integer.valueOf(i4), Float.valueOf(c7179c52.m27753to()));
                            }
                        }
                        i = i2;
                    } else {
                        i += 3;
                        C7179c5 c7179c53 = (C7179c5) c7186k4.m27787x1(i2);
                        int iM27752kk2 = ((C7179c5) c7185jdM27787x1).m27752kk();
                        float fM27753to = c7179c53.m27753to();
                        for (int iM27752kk3 = c7179c5.m27752kk(); iM27752kk3 <= iM27752kk2; iM27752kk3++) {
                            if (!this.f42110du.containsKey(Integer.valueOf(iM27752kk3))) {
                                this.f42110du.addItem(Integer.valueOf(iM27752kk3), Float.valueOf(fM27753to));
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // com.aspose.slides.internal.p506xo.AbstractC12588to
    /* JADX INFO: renamed from: k4 */
    public float mo58724k4(int i) {
        return this.f42110du.containsKey(Integer.valueOf(i)) ? this.f42110du.get_Item(Integer.valueOf(i)).floatValue() : m58745k4();
    }

    @Override // com.aspose.slides.internal.p506xo.AbstractC12588to
    /* JADX INFO: renamed from: x1 */
    public float mo58725x1() {
        float fM27753to;
        float f;
        float fM58745k4 = m58745k4();
        C7186k4 c7186k4 = (C7186k4) this.f42121k4.mo27768h4(C7182dy.f19652ug);
        if (c7186k4 != null) {
            int i = 1;
            fM27753to = 0.0f;
            f = 0.0f;
            while (i < c7186k4.m27778k4()) {
                C7185jd c7185jdM27787x1 = c7186k4.m27787x1(i);
                if (C7019kk.m27469x1(c7185jdM27787x1, C7186k4.class)) {
                    C7186k4 c7186k42 = (C7186k4) c7185jdM27787x1;
                    for (int i2 = 0; i2 < c7186k42.m27778k4(); i2++) {
                        fM27753to += ((C7179c5) c7186k42.m27785kk(i2)).m27753to();
                        f += 1.0f;
                    }
                } else {
                    i++;
                    C7179c5 c7179c5 = (C7179c5) c7186k4.m27787x1(i);
                    if (c7179c5.m27753to() > 0.0f) {
                        fM27753to += c7179c5.m27753to();
                        f += 1.0f;
                    }
                }
                i += 2;
            }
        } else {
            fM27753to = 0.0f;
            f = 0.0f;
        }
        float f2 = fM27753to / f;
        return f2 <= 0.0f ? fM58745k4 : f2;
    }

    public AbstractC12585k4(C7187kk c7187kk) {
        super(c7187kk);
        this.f42111h4 = 0L;
        m58742ar();
        m58744wl();
    }

    @Override // com.aspose.slides.internal.p506xo.AbstractC12578c5, com.aspose.slides.internal.p506xo.AbstractC12588to
    /* JADX INFO: renamed from: k4 */
    public float mo58717k4(byte[] bArr, int i, int i2) {
        float fM58745k4 = m58745k4();
        int iM58755du = m58755du(bArr, i, i2);
        return this.f42110du.containsKey(Integer.valueOf(iM58755du)) ? this.f42110du.get_Item(Integer.valueOf(iM58755du)).floatValue() : fM58745k4;
    }

    @Override // com.aspose.slides.internal.p506xo.AbstractC12578c5, com.aspose.slides.internal.p506xo.AbstractC12588to
    /* JADX INFO: renamed from: x1 */
    public float mo58722x1(byte[] bArr, int i, int i2) {
        AbstractC12580du abstractC12580duM58776x6 = m58776x6();
        float fMo58735x1 = abstractC12580duM58776x6.mo58735x1();
        float fMo58731k4 = abstractC12580duM58776x6.mo58731k4();
        if (fMo58735x1 != 0.0f && fMo58731k4 != 0.0f) {
            fMo58735x1 = (fMo58735x1 + fMo58731k4) / 2.0f;
        } else if (fMo58735x1 == 0.0f) {
            fMo58735x1 = fMo58731k4 != 0.0f ? fMo58731k4 : 0.0f;
        }
        return fMo58735x1 == 0.0f ? abstractC12580duM58776x6.mo58732kk() : fMo58735x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final long m58745k4() {
        if (this.f42111h4 == 0) {
            this.f42111h4 = ((C7179c5) this.f42121k4.mo27768h4(C7182dy.f19378d3)) != null ? r0.m27752kk() : 1000L;
        }
        return this.f42111h4;
    }
}
