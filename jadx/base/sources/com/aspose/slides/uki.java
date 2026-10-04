package com.aspose.slides;

import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.BadImageFormatException;
import com.aspose.slides.internal.p077d8.C3094uz;
import com.aspose.slides.internal.p077d8.C3099wl;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p129fe.C3989up;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p407st.AbstractC10579os;
import com.aspose.slides.internal.p407st.AbstractC10657tu;
import com.aspose.slides.internal.p407st.AbstractC10669uo;
import com.aspose.slides.internal.p407st.AbstractC10753zj;
import com.aspose.slides.internal.p407st.C10352aa;
import com.aspose.slides.internal.p407st.C10384c5;
import com.aspose.slides.internal.p407st.C10403dk;
import com.aspose.slides.internal.p407st.C10432f5;
import com.aspose.slides.internal.p407st.C10609qn;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p500xi.AbstractC12536x1;
import com.aspose.slides.internal.p504xm.C12549du;

/* JADX INFO: loaded from: classes3.dex */
class uki {

    /* JADX INFO: renamed from: du */
    private int f49341du;

    /* JADX INFO: renamed from: h4 */
    private long f49342h4;

    /* JADX INFO: renamed from: k4 */
    private C14652uw f49343k4;

    /* JADX INFO: renamed from: kk */
    private PPImage f49344kk;

    /* JADX INFO: renamed from: m9 */
    private byte[] f49345m9;

    /* JADX INFO: renamed from: to */
    private int f49346to;

    /* JADX INFO: renamed from: x1 */
    private AbstractC10657tu f49347x1;

    public uki(PPImage pPImage, int i, C14652uw c14652uw) {
        this.f49341du = -1;
        this.f49342h4 = 0L;
        this.f49345m9 = null;
        this.f49343k4 = c14652uw;
        this.f49344kk = pPImage;
        this.f49347x1 = null;
        this.f49346to = i;
        m71715dy();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0099  */
    /* JADX INFO: renamed from: c5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private PPImage m71714c5() {
        byte[] bArrMo50778kk;
        int iM52158h4;
        C12014ne c12014neClone;
        AbstractC12002ck abstractC12002ckM56312k4;
        Presentation presentationM71946k4 = this.f49343k4.m71946k4();
        int i = 0;
        if (C7019kk.m27469x1(this.f49347x1, C10352aa.class) || C7019kk.m27469x1(this.f49347x1, C10432f5.class)) {
            bArrMo50778kk = this.f49347x1.mo50778kk();
        } else {
            if (!C7019kk.m27469x1(this.f49347x1, AbstractC10579os.class)) {
                if (!C7019kk.m27469x1(this.f49347x1, AbstractC10753zj.class)) {
                    throw new ArgumentException();
                }
                AbstractC10657tu abstractC10657tu = this.f49347x1;
                AbstractC10753zj abstractC10753zj = (AbstractC10753zj) abstractC10657tu;
                bArrMo50778kk = abstractC10657tu.m51775c5() == 3 ? abstractC10753zj.m52160to() : this.f49347x1.mo50778kk();
                int iM52157du = abstractC10753zj.m52157du();
                iM52158h4 = abstractC10753zj.m52158h4();
                i = iM52157du;
                if (!C3099wl.m13194kk(bArrMo50778kk) || C3099wl.m13199x1(bArrMo50778kk)) {
                    c12014neClone = C3099wl.m13173jd(bArrMo50778kk).Clone();
                    if (c12014neClone.m56663c5() >= 0 || c12014neClone.m56683x1() < 0) {
                        throw new BadImageFormatException();
                    }
                } else {
                    C3152yj c3152yj = new C3152yj(bArrMo50778kk);
                    try {
                        if (!new C3094uz(c3152yj).m13161x1() && (abstractC12002ckM56312k4 = AbstractC12002ck.m56312k4(c3152yj)) != null) {
                            abstractC12002ckM56312k4.dispose();
                        }
                    } finally {
                        c3152yj.dispose();
                    }
                }
                PPImage pPImage = (PPImage) presentationM71946k4.getImages().addImage(bArrMo50778kk);
                pPImage.m2135to().m63348x1(i);
                pPImage.m2135to().m63346kk(iM52158h4);
                return pPImage;
            }
            bArrMo50778kk = this.f49347x1.m51776dy();
        }
        iM52158h4 = 0;
        if (C3099wl.m13194kk(bArrMo50778kk)) {
            c12014neClone = C3099wl.m13173jd(bArrMo50778kk).Clone();
            if (c12014neClone.m56663c5() >= 0) {
            }
            throw new BadImageFormatException();
        }
        PPImage pPImage2 = (PPImage) presentationM71946k4.getImages().addImage(bArrMo50778kk);
        pPImage2.m2135to().m63348x1(i);
        pPImage2.m2135to().m63346kk(iM52158h4);
        return pPImage2;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX INFO: renamed from: dy */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m71715dy() {
        SortedList<Integer, uki> sortedListM71939c5;
        if (m71722kk() != null && !this.f49343k4.m71940ck().containsKey(m71722kk())) {
            this.f49343k4.m71940ck().addItem(m71722kk(), this);
        }
        int i = this.f49346to;
        if (i == 0) {
            if (this.f49341du < 0) {
                this.f49341du = this.f49343k4.m71939c5().size() + 1;
            }
            sortedListM71939c5 = this.f49343k4.m71939c5();
        } else if (i != 1) {
            if (i != 2) {
                throw new ArgumentOutOfRangeException("Illegal typeIndex for Image context.");
            }
            if (this.f49341du < 0) {
            }
            sortedListM71939c5 = this.f49343k4.m71939c5();
        } else {
            if (this.f49341du < 0) {
                this.f49341du = this.f49343k4.m71945jd().size();
            }
            sortedListM71939c5 = this.f49343k4.m71945jd();
        }
        sortedListM71939c5.addItem(Integer.valueOf(this.f49341du), this);
    }

    /* JADX INFO: renamed from: du */
    public final byte[] m71716du() {
        if (this.f49345m9 == null) {
            this.f49345m9 = m71725x1().m51779m9().m66539k4();
        }
        return this.f49345m9;
    }

    /* JADX INFO: renamed from: h4 */
    public final int m71717h4() {
        return this.f49346to;
    }

    /* JADX INFO: renamed from: k4 */
    public final C10403dk m71718k4(long j) {
        C10403dk c10403dk = new C10403dk();
        AbstractC10657tu abstractC10657tuM71725x1 = m71725x1();
        c10403dk.m51409um().m51916k4((byte) 2);
        c10403dk.m51409um().m51920k4((short) abstractC10657tuM71725x1.m51775c5());
        c10403dk.m50678k4((byte) abstractC10657tuM71725x1.m51775c5());
        c10403dk.m50685x1((byte) abstractC10657tuM71725x1.m51775c5());
        c10403dk.m50683kk(j);
        c10403dk.m50680k4(((((long) abstractC10657tuM71725x1.mo50440k4()) & 4294967295L) + 8) & 4294967295L);
        c10403dk.m50679k4(m71723m9() & 255);
        c10403dk.m50681k4(abstractC10657tuM71725x1.m51779m9().m66539k4());
        c10403dk.m50686x1(this.f49342h4);
        this.f49343k4.m71954x1().m51488kk().m50899k4((AbstractC10669uo) abstractC10657tuM71725x1);
        return c10403dk;
    }

    /* JADX INFO: renamed from: kk */
    public final PPImage m71722kk() {
        return this.f49344kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final byte m71723m9() {
        AbstractC10579os abstractC10579os = (AbstractC10579os) C7019kk.m27452k4((Object) m71725x1(), AbstractC10579os.class);
        if (abstractC10579os != null) {
            return abstractC10579os.m51445x1();
        }
        return (byte) -1;
    }

    /* JADX INFO: renamed from: to */
    public final int m71724to() {
        return this.f49341du;
    }

    /* JADX INFO: renamed from: x1 */
    public final AbstractC10657tu m71725x1() {
        if (this.f49347x1 == null) {
            this.f49347x1 = mo71246k4();
        }
        return this.f49347x1;
    }

    public uki(AbstractC10657tu abstractC10657tu, int i, int i2, C14652uw c14652uw) {
        this.f49342h4 = 0L;
        this.f49345m9 = null;
        this.f49343k4 = c14652uw;
        this.f49341du = i2;
        this.f49347x1 = abstractC10657tu;
        this.f49344kk = m71714c5();
        this.f49346to = i;
        m71715dy();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: k4 */
    public AbstractC10657tu mo71246k4() {
        C3989up c3989up;
        PPImage pPImage = this.f49344kk;
        AbstractC10657tu abstractC10657tuM52156k4 = null;
        AbstractC12536x1 abstractC12536x1M58363k4 = null;
        if (pPImage == null) {
            return null;
        }
        byte[] binaryData = pPImage.getBinaryData();
        int iM58515x1 = C12549du.m58515x1(binaryData);
        C3152yj c3152yj = new C3152yj(binaryData);
        try {
            switch (iM58515x1) {
                case 0:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    abstractC10657tuM52156k4 = AbstractC10579os.m51441k4(c3152yj);
                    c3152yj.dispose();
                    return abstractC10657tuM52156k4;
                case 1:
                case 2:
                    try {
                        c3989up = (C3989up) AbstractC12002ck.m56312k4(c3152yj);
                        break;
                    } catch (Exception unused) {
                        c3152yj.setPosition(0L);
                        abstractC12536x1M58363k4 = AbstractC12536x1.m58363k4(c3152yj);
                        c3989up = null;
                    }
                    c3152yj.setPosition(0L);
                    abstractC10657tuM52156k4 = abstractC12536x1M58363k4 != null ? (this.f49344kk.m2135to().m63342k4() == 0 || this.f49344kk.m2135to().m63347x1() == 0) ? AbstractC10753zj.m52156k4(abstractC12536x1M58363k4, c3152yj) : AbstractC10753zj.m52155k4(abstractC12536x1M58363k4, this.f49344kk.m2135to().m63342k4(), this.f49344kk.m2135to().m63347x1(), c3152yj) : (this.f49344kk.m2135to().m63342k4() == 0 || this.f49344kk.m2135to().m63347x1() == 0) ? AbstractC10753zj.m52154k4(c3989up, c3152yj) : AbstractC10753zj.m52153k4(c3989up, this.f49344kk.m2135to().m63342k4(), this.f49344kk.m2135to().m63347x1(), c3152yj);
                    c3152yj.dispose();
                    return abstractC10657tuM52156k4;
                case 8:
                    abstractC10657tuM52156k4 = AbstractC10579os.m51442k4(c3152yj, 17);
                    c3152yj.dispose();
                    return abstractC10657tuM52156k4;
                default:
                    c3152yj.dispose();
                    return abstractC10657tuM52156k4;
            }
        } catch (Throwable th) {
            c3152yj.dispose();
            throw th;
        }
    }

    public uki(C14652uw c14652uw) {
        this.f49341du = -1;
        this.f49342h4 = 0L;
        this.f49345m9 = null;
        this.f49343k4 = c14652uw;
        this.f49347x1 = null;
        this.f49346to = 2;
        m71715dy();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m71719k4(C10384c5 c10384c5) {
        c10384c5.m51407kk((short) m71724to());
        AbstractC10657tu abstractC10657tuM71725x1 = m71725x1();
        c10384c5.m50538k4(abstractC10657tuM71725x1);
        c10384c5.m50537k4(abstractC10657tuM71725x1.m51775c5());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m71720k4(C10403dk c10403dk) {
        this.f49345m9 = c10403dk.m50687x1();
        jj3 jj3VarM2135to = this.f49344kk.m2135to();
        jj3VarM2135to.m63344k4(c10403dk.m50687x1());
        jj3VarM2135to.m63343k4(c10403dk.m50682kk());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m71721k4(C10609qn c10609qn) {
        c10609qn.m51598k4(((long) m71724to()) & 4294967295L);
        this.f49342h4++;
    }
}
