package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.internal.p077d8.C3038bv;
import com.aspose.slides.internal.p077d8.C3041c6;
import com.aspose.slides.internal.p077d8.C3052g8;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p077d8.C3092um;
import com.aspose.slides.internal.p077d8.C3095v4;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p356qb.C9816ck;
import com.aspose.slides.internal.p356qb.C9820h4;
import com.aspose.slides.internal.p407st.AbstractC10571o4;
import com.aspose.slides.internal.p407st.C10372bq;
import com.aspose.slides.internal.p407st.C10528lr;
import com.aspose.slides.internal.p407st.C10695wm;
import com.aspose.slides.internal.p407st.C10696wp;
import com.aspose.slides.internal.p407st.C10734yl;
import com.aspose.slides.internal.p407st.C10755zn;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.words.EditingLanguage;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class rtn {

    /* JADX INFO: renamed from: c5 */
    private int f48688c5;

    /* JADX INFO: renamed from: ck */
    private Object f48689ck;

    /* JADX INFO: renamed from: k4 */
    private C9816ck f48695k4;

    /* JADX INFO: renamed from: kk */
    private C3152yj f48696kk;

    /* JADX INFO: renamed from: m9 */
    private C10696wp f48697m9;

    /* JADX INFO: renamed from: to */
    private C3134k4 f48698to;

    /* JADX INFO: renamed from: x1 */
    private C10528lr f48700x1;

    /* JADX INFO: renamed from: du */
    private C10372bq f48690du = null;

    /* JADX INFO: renamed from: h4 */
    private svz[] f48693h4 = new svz[3];

    /* JADX INFO: renamed from: dy */
    private SortedList<Long, Long> f48691dy = new SortedList<>();

    /* JADX INFO: renamed from: jd */
    private int f48694jd = 1252;

    /* JADX INFO: renamed from: fa */
    private final int[] f48692fa = {10, 2, 30, 30, 30, 30, 30, 30, 30, 30, 64, 64, 64, 64, 3, 3, 3, 71, 30, 3};

    /* JADX INFO: renamed from: up */
    private final int[] f48699up = {10, 2, 30, 30, 3, 3, 3, 3, 3, 3, 3, 11, EditingLanguage.FRENCH_SWITZERLAND, 4126, 30, 30, 11, 3, 10, 11, 0, 0, 11, 3, 65, 10, 30, 30, 30, 30};

    public rtn(C9816ck c9816ck, Object obj) {
        this.f48695k4 = c9816ck;
        this.f48689ck = obj;
        this.f48700x1 = C10528lr.m51214k4(c9816ck);
        try {
            m70338c5();
        } catch (PptException e) {
            throw e;
        } catch (RuntimeException e2) {
            throw new PptReadException("Couldn't read \"PowerPoint Document\" record.", e2);
        }
    }

    /* JADX INFO: renamed from: c5 */
    private void m70338c5() {
        m70339dy();
    }

    /* JADX INFO: renamed from: dy */
    private void m70339dy() {
        C3152yj c3152yj = new C3152yj(((C9820h4) this.f48695k4.m48360k4().m48344to("PowerPoint Document")).m48410k4());
        this.f48696kk = c3152yj;
        this.f48698to = new C3134k4(c3152yj);
        long jM51218x1 = this.f48700x1.m51218x1();
        do {
            C10372bq c10372bq = new C10372bq();
            m70342k4(c10372bq, jM51218x1 & 4294967295L);
            if (this.f48690du == null) {
                this.f48690du = c10372bq;
            }
            C10755zn c10755zn = new C10755zn();
            m70342k4(c10755zn, c10372bq.m50475kk());
            List.Enumerator<C10734yl> it = c10755zn.m52164x1().iterator();
            while (it.hasNext()) {
                try {
                    C10734yl next = it.next();
                    if (!this.f48691dy.containsKey(Long.valueOf(next.m52077k4()))) {
                        this.f48691dy.addItem(Long.valueOf(next.m52077k4()), Long.valueOf(next.m52079x1()));
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            jM51218x1 = c10372bq.m50479x1();
        } while ((jM51218x1 & 4294967295L) > 0);
        this.f48696kk.setPosition(this.f48691dy.get_Item(Long.valueOf(this.f48690du.m50477to())).longValue() & 4294967295L);
        m70340jd();
    }

    /* JADX INFO: renamed from: jd */
    private void m70340jd() {
        ofi ofiVar = new ofi(new C10695wm(this.f48698to), this.f48698to);
        while (true) {
            try {
                C10695wm c10695wmM68513x1 = ofiVar.m68513x1();
                if (c10695wmM68513x1 == null) {
                    ofiVar.dispose();
                    return;
                }
                int iM51923to = c10695wmM68513x1.m51923to();
                if (iM51923to == 1001) {
                    m70343k4(c10695wmM68513x1);
                } else if (iM51923to == 4080) {
                    this.f48693h4[c10695wmM68513x1.m51922kk()] = new svz(c10695wmM68513x1, this);
                }
            } catch (Throwable th) {
                ofiVar.dispose();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: du */
    public final svz m70344du() {
        return this.f48693h4[0];
    }

    /* JADX INFO: renamed from: h4 */
    public final svz m70345h4() {
        return this.f48693h4[1];
    }

    /* JADX INFO: renamed from: k4 */
    public final C3134k4 m70346k4() {
        return this.f48698to;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m70348kk() {
        String[][] strArr = {null};
        byte[][] bArr = {null};
        int[] iArrM2334k4 = Presentation.m2334k4((ctm) this.f48689ck, bArr);
        byte[] bArr2 = bArr[0];
        strArr[0] = C3038bv.m12798to();
        if (Arrays.equals(iArrM2334k4, r1s.f48531x1) && bArr2 != null && bArr2.length > 0) {
            strArr[0] = C14113y2.m67417k4(Presentation.m2325k4(bArr2), new String[]{IOUtils.LINE_SEPARATOR_WINDOWS, IOUtils.LINE_SEPARATOR_UNIX, "\r", "\n\r"}, 0);
        }
        int[] iArrM12821x1 = C3052g8.f9069k4;
        if (C3041c6.m12821x1() == C3052g8.f9070x1) {
            try {
                C3041c6.m12809k4().m12825to();
                iArrM12821x1 = C3041c6.m12821x1();
            } catch (IllegalStateException e) {
                int[] iArr = C3052g8.f9069k4;
                C3085sv.m13082k4(e);
                iArrM12821x1 = iArr;
            }
        }
        C14113y2.m67403k4(" ", strArr[0]);
        return ((Arrays.equals(C3038bv.m12793k4(), C3095v4.f9211x1) && C3092um.m13135k4() != null && (C3092um.m13135k4() instanceof C3038bv)) || Arrays.equals(iArrM2334k4, r1s.f48530kk) || Arrays.equals(iArrM12821x1, C3052g8.f9070x1) || Arrays.equals(iArrM2334k4, r1s.f48531x1)) ? false : true;
    }

    /* JADX INFO: renamed from: m9 */
    public final svz m70349m9() {
        return this.f48693h4[2];
    }

    /* JADX INFO: renamed from: to */
    public final C10696wp m70350to() {
        return this.f48697m9;
    }

    /* JADX INFO: renamed from: x1 */
    public final SortedList<Long, Long> m70351x1() {
        return this.f48691dy;
    }

    /* JADX INFO: renamed from: k4 */
    private void m70341k4(AbstractC10571o4 abstractC10571o4) {
        abstractC10571o4.m51406kk(this.f48698to);
    }

    /* JADX INFO: renamed from: k4 */
    private void m70342k4(AbstractC10571o4 abstractC10571o4, long j) {
        this.f48696kk.setPosition(j);
        m70341k4(abstractC10571o4);
    }

    /* JADX INFO: renamed from: k4 */
    private void m70343k4(C10695wm c10695wm) {
        C10696wp c10696wp = new C10696wp();
        this.f48697m9 = c10696wp;
        c10696wp.m51405k4(this.f48698to, c10695wm);
    }

    /* JADX INFO: renamed from: k4 */
    public final ISlideText[] m70347k4(int i) {
        tif tifVarM70803k4;
        tif tifVarM70803k42;
        this.f48688c5 = i;
        svz svzVarM70344du = m70344du();
        int i2 = 0;
        if (svzVarM70344du == null) {
            return new ISlideText[0];
        }
        int iM70805kk = svzVarM70344du.m70805kk();
        if (m70348kk() && iM70805kk > 2) {
            iM70805kk = 2;
        }
        ISlideText[] iSlideTextArr = new ISlideText[iM70805kk];
        if (i == 1) {
            int iM71217dy = 90;
            for (int i3 = 0; i3 < iM70805kk; i3++) {
                tif tifVarM70802k4 = svzVarM70344du.m70802k4(i3);
                tifVarM70802k4.m71221k4(90);
                tifVarM70802k4.m71223k4(true);
                if (tifVarM70802k4.m71217dy() > 0 && iM71217dy > tifVarM70802k4.m71217dy()) {
                    iM71217dy = tifVarM70802k4.m71217dy();
                }
            }
            while (i2 < iM70805kk) {
                tif tifVarM70802k42 = svzVarM70344du.m70802k4(i2);
                tif tifVarM71216du = tifVarM70802k42.m71216du();
                tifVarM70802k42.m71221k4(iM71217dy);
                if (tifVarM71216du == null) {
                    iSlideTextArr[i2] = new gt8(tifVarM70802k42.m71225m9(), null, null, null);
                } else {
                    tifVarM71216du.m71221k4(iM71217dy);
                    iSlideTextArr[i2] = new gt8(tifVarM70802k42.m71225m9(), null, null, tifVarM71216du.m71225m9());
                }
                i2++;
            }
        } else {
            while (i2 < iM70805kk) {
                tif tifVarM70802k43 = svzVarM70344du.m70802k4(i2);
                iSlideTextArr[i2] = new gt8(tifVarM70802k43.m71218h4(), (this.f48693h4[1] == null || (tifVarM70803k42 = m70345h4().m70803k4(tifVarM70802k43.m71219jd())) == null) ? null : tifVarM70803k42.m71218h4(), null, (this.f48693h4[2] == null || (tifVarM70803k4 = m70349m9().m70803k4(tifVarM70802k43.m71214c5())) == null) ? null : tifVarM70803k4.m71218h4());
                i2++;
            }
        }
        return iSlideTextArr;
    }
}
