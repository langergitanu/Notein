package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p077d8.C3110yd;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p407st.C10462h9;
import com.aspose.slides.internal.p407st.C10534m3;
import com.aspose.slides.internal.p407st.C10535m4;
import com.aspose.slides.internal.p407st.C10609qn;
import com.aspose.slides.internal.p407st.C10731yg;
import com.aspose.slides.internal.p407st.C10735yn;
import com.aspose.slides.internal.p407st.C10749ze;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.words.StyleIdentifier;
import com.huawei.hms.network.embedded.C18177fb;

/* JADX INFO: renamed from: com.aspose.slides.zk */
/* JADX INFO: loaded from: classes3.dex */
final class C14888zk {

    /* JADX INFO: renamed from: c5 */
    C10749ze f50568c5;

    /* JADX INFO: renamed from: ck */
    long f50569ck;

    /* JADX INFO: renamed from: du */
    int f50570du;

    /* JADX INFO: renamed from: dy */
    C10749ze f50571dy;

    /* JADX INFO: renamed from: fa */
    long f50572fa;

    /* JADX INFO: renamed from: h4 */
    C10749ze f50573h4;

    /* JADX INFO: renamed from: jd */
    C10749ze f50574jd;

    /* JADX INFO: renamed from: k4 */
    int f50575k4;

    /* JADX INFO: renamed from: kk */
    int f50576kk;

    /* JADX INFO: renamed from: ks */
    private long[] f50577ks;

    /* JADX INFO: renamed from: m9 */
    C10749ze f50578m9;

    /* JADX INFO: renamed from: ne */
    private byte[] f50579ne;

    /* JADX INFO: renamed from: rv */
    private C0735a7 f50580rv;

    /* JADX INFO: renamed from: to */
    int f50581to;

    /* JADX INFO: renamed from: up */
    long f50582up;

    /* JADX INFO: renamed from: x1 */
    int f50583x1;

    /* JADX INFO: renamed from: x6 */
    private List<C0899df> f50584x6;

    /* JADX INFO: renamed from: yj */
    long f50585yj;

    public C14888zk(C0735a7 c0735a7, AutoShapeImp autoShapeImp, C10534m3 c10534m3) {
        m74548k4(c0735a7);
        this.f50582up = autoShapeImp.m299m9();
        this.f50585yj = autoShapeImp.m298dy();
        boolean z = c10534m3 != null;
        if (z) {
            C10609qn c10609qn = (C10609qn) C22223Oooo0o.OooO0O0(c10534m3, StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_6, C10609qn.class);
            if (c10609qn != null) {
                int iM51597ar = (int) c10609qn.m51597ar();
                this.f50569ck = iM51597ar != 0 ? m74537k4(iM51597ar) : 0L;
            }
            C10609qn c10609qn2 = (C10609qn) C22223Oooo0o.OooO0O0(c10534m3, StyleIdentifier.GRID_TABLE_7_COLORFUL_ACCENT_6, C10609qn.class);
            if (c10609qn2 != null) {
                int iM51597ar2 = (int) c10609qn2.m51597ar();
                this.f50572fa = iM51597ar2 != 0 ? m74537k4(iM51597ar2) : 0L;
            }
            C10609qn c10609qn3 = (C10609qn) C22223Oooo0o.OooO0O0(c10534m3, StyleIdentifier.LIST_TABLE_1_LIGHT, C10609qn.class);
            if (c10609qn3 != null) {
                int iM51597ar3 = (int) c10609qn3.m51597ar();
                this.f50575k4 = iM51597ar3;
                this.f50582up = m74537k4(iM51597ar3) - this.f50569ck;
            }
            C10609qn c10609qn4 = (C10609qn) C22223Oooo0o.OooO0O0(c10534m3, StyleIdentifier.LIST_TABLE_2, C10609qn.class);
            if (c10609qn4 != null) {
                int iM51597ar4 = (int) c10609qn4.m51597ar();
                this.f50583x1 = iM51597ar4;
                this.f50585yj = m74537k4(iM51597ar4) - this.f50572fa;
            }
            C10609qn c10609qn5 = (C10609qn) C22223Oooo0o.OooO0O0(c10534m3, StyleIdentifier.LIST_TABLE_4_ACCENT_2, C10609qn.class);
            if (c10609qn5 != null) {
                this.f50576kk = (int) c10609qn5.m51597ar();
            } else {
                this.f50576kk = -1;
            }
            C10609qn c10609qn6 = (C10609qn) C22223Oooo0o.OooO0O0(c10534m3, StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_2, C10609qn.class);
            if (c10609qn6 != null) {
                this.f50581to = (int) c10609qn6.m51597ar();
            } else {
                this.f50581to = -1;
            }
            if (this.f50576kk > -1 && this.f50581to > -1 && this.f50582up == this.f50585yj) {
                if (autoShapeImp.m299m9() < autoShapeImp.m298dy()) {
                    this.f50585yj = (this.f50582up * ((long) autoShapeImp.m298dy())) / ((long) autoShapeImp.m299m9());
                } else {
                    this.f50582up = (this.f50585yj * ((long) autoShapeImp.m299m9())) / ((long) autoShapeImp.m298dy());
                }
            }
            this.f50570du = 4;
            C10609qn c10609qn7 = (C10609qn) C22223Oooo0o.OooO0O0(c10534m3, StyleIdentifier.LIST_TABLE_3, C10609qn.class);
            if (c10609qn7 != null) {
                this.f50570du = (int) c10609qn7.m51597ar();
            }
        }
        this.f50573h4 = (!z || c10534m3.m51263x1().m50923k4(StyleIdentifier.LIST_TABLE_4) == null) ? autoShapeImp.m295kk() : (C10749ze) C22223Oooo0o.OooO0O0(c10534m3, StyleIdentifier.LIST_TABLE_4, C10749ze.class);
        this.f50578m9 = autoShapeImp.m297x1();
        this.f50571dy = autoShapeImp.m292du();
        this.f50568c5 = autoShapeImp.m293h4();
        this.f50574jd = (!z || c10534m3.m51263x1().m50923k4(StyleIdentifier.LIST_TABLE_2_ACCENT_2) == null) ? autoShapeImp.m296to() : (C10749ze) C22223Oooo0o.OooO0O0(c10534m3, StyleIdentifier.LIST_TABLE_2_ACCENT_2, C10749ze.class);
        m74545to();
    }

    /* JADX INFO: renamed from: c5 */
    private void m74530c5() {
        int iM13249kk;
        int iM13249kk2;
        int iM13249kk3;
        int iM13249kk4;
        C10749ze c10749ze = this.f50568c5;
        if (c10749ze == null || (c10749ze.m52134to() & 65535) == 0) {
            return;
        }
        if ((this.f50568c5.m52131du() & 65535) != 8 && (this.f50568c5.m52131du() & 65535) != 16) {
            throw new PptReadException("Wront element size in IMsoArray p_Inscape_complex property.");
        }
        m74546k4().m3324k4(new C14843yd[this.f50568c5.m52134to()]);
        m74546k4().m3332x1(new C14843yd[this.f50568c5.m52134to()]);
        qnt qntVar = new qnt(this.f50582up, this.f50585yj);
        List<C0899df> list = new List<>(AbstractC14092to.m67204k4((Object[]) m74546k4().m3309du()));
        for (int i = 0; i < (this.f50568c5.m52134to() & 65535); i++) {
            byte[] bArrM52133kk = this.f50568c5.m52133kk(i);
            if ((this.f50568c5.m52131du() & 65535) == 8) {
                iM13249kk = C3110yd.m13241k4(bArrM52133kk, 0);
                iM13249kk2 = C3110yd.m13241k4(bArrM52133kk, 2);
                iM13249kk3 = C3110yd.m13241k4(bArrM52133kk, 4);
                iM13249kk4 = C3110yd.m13241k4(bArrM52133kk, 6);
            } else {
                iM13249kk = C3110yd.m13249kk(bArrM52133kk, 0);
                iM13249kk2 = C3110yd.m13249kk(bArrM52133kk, 4);
                iM13249kk3 = C3110yd.m13249kk(bArrM52133kk, 8);
                iM13249kk4 = C3110yd.m13249kk(bArrM52133kk, 12);
            }
            long jM69713k4 = qntVar.m69713k4(list, m74537k4(iM13249kk), m74550kk());
            long jM69716x1 = qntVar.m69716x1(list, m74537k4(iM13249kk2), m74550kk());
            if (m74546k4().m3329m9() != null) {
                m74546k4().m3329m9()[i] = new C14843yd(jM69713k4, jM69716x1);
            }
            long jM69713k42 = qntVar.m69713k4(list, m74537k4(iM13249kk3), m74550kk());
            long jM69716x12 = qntVar.m69716x1(list, m74537k4(iM13249kk4), m74550kk());
            if (m74546k4().m3310dy() != null) {
                m74546k4().m3310dy()[i] = new C14843yd(jM69713k42, jM69716x12);
            }
            m74546k4().m3319k4(list.toArray(new C0899df[0]));
        }
    }

    /* JADX INFO: renamed from: ck */
    private void m74531ck() {
        byte b;
        int i;
        int i2;
        int length = m74546k4().m3309du().length + 11;
        byte[] bArr = new byte[length];
        int[] iArr = new int[m74546k4().m3309du().length + 11];
        int length2 = m74546k4().m3309du().length;
        C0899df[] c0899dfArr = new C0899df[length2];
        int i3 = 0;
        while (true) {
            b = 16;
            if (i3 >= 11) {
                break;
            }
            bArr[i3] = 16;
            iArr[i3] = i3;
            i3++;
        }
        int i4 = 10;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i4 > 0 && i5 < length) {
            i7++;
            int iM67483k4 = C14116yg.m67483k4(i5, 11);
            int i8 = i6;
            int i9 = 0;
            int i10 = length;
            while (iM67483k4 < length) {
                if ((bArr[iM67483k4] & b) == b) {
                    i2 = iM67483k4;
                    i = i9;
                } else {
                    C0899df c0899df = m74546k4().m3309du()[iM67483k4 - 11];
                    int i11 = iM67483k4;
                    byte bM74536k4 = m74536k4(bArr, c0899df.m5083kk());
                    i = i9;
                    byte bM74536k42 = m74536k4(bArr, c0899df.m5085to());
                    byte bM74536k43 = m74536k4(bArr, c0899df.m5078du());
                    if ((bM74536k4 & 16) == 16 && (bM74536k42 & 16) == 16 && (bM74536k43 & 16) == 16) {
                        bArr[i11] = (byte) (bM74536k4 | bM74536k42 | bM74536k43);
                        iArr[i11] = i8 + 11;
                        c0899dfArr[i8] = c0899df;
                        i9 = i + 1;
                        i8++;
                        i2 = i11;
                        iM67483k4 = i2 + 1;
                        b = 16;
                    } else {
                        i2 = i11;
                        if (i2 < i10) {
                            i10 = i2;
                        }
                    }
                }
                i9 = i;
                iM67483k4 = i2 + 1;
                b = 16;
            }
            int i12 = i9;
            i5 = i10;
            i6 = i8;
            i4 = i12;
        }
        if (i6 < length2) {
            for (int i13 = 11; i13 < length; i13++) {
                if ((bArr[i13] & 16) != 16) {
                    C0899df c0899df2 = m74546k4().m3309du()[i13 - 11];
                    iArr[i13] = i6 + 11;
                    c0899dfArr[i6] = c0899df2;
                    i6++;
                }
            }
        }
        if (i7 == 1) {
            return;
        }
        m74546k4().m3319k4(c0899dfArr);
        for (int i14 = 0; i14 < m74546k4().m3309du().length; i14++) {
            C0899df c0899df3 = m74546k4().m3309du()[i14];
            c0899df3.m5082k4(m74541k4(iArr, c0899df3.m5083kk()));
            c0899df3.m5086x1(m74541k4(iArr, c0899df3.m5085to()));
            c0899df3.m5084kk(m74541k4(iArr, c0899df3.m5078du()));
        }
        for (int i15 = 0; i15 < m74546k4().m3311h4().length; i15++) {
            long[] jArrM6041k4 = m74546k4().m3311h4()[i15].m6041k4();
            for (int i16 = 0; i16 < jArrM6041k4.length; i16++) {
                jArrM6041k4[i16] = m74541k4(iArr, jArrM6041k4[i16]);
            }
        }
        if (m74546k4().m3329m9() != null) {
            for (int i17 = 0; i17 < m74546k4().m3329m9().length; i17++) {
                m74546k4().m3329m9()[i17].m73857k4(m74541k4(iArr, m74546k4().m3329m9()[i17].m73856k4()));
                m74546k4().m3329m9()[i17].m73859x1(m74541k4(iArr, m74546k4().m3329m9()[i17].m73858x1()));
            }
        }
        if (m74546k4().m3310dy() != null) {
            for (int i18 = 0; i18 < m74546k4().m3310dy().length; i18++) {
                m74546k4().m3310dy()[i18].m73857k4(m74541k4(iArr, m74546k4().m3310dy()[i18].m73856k4()));
                m74546k4().m3310dy()[i18].m73859x1(m74541k4(iArr, m74546k4().m3310dy()[i18].m73858x1()));
            }
        }
        if (m74546k4().m3328kk() != null) {
            for (int i19 = 0; i19 < m74546k4().m3328kk().length; i19++) {
                m74546k4().m3328kk()[i19].m7640k4().m73857k4(m74541k4(iArr, m74546k4().m3328kk()[i19].m7640k4().m73856k4()));
                m74546k4().m3328kk()[i19].m7640k4().m73859x1(m74541k4(iArr, m74546k4().m3328kk()[i19].m7640k4().m73858x1()));
                m74546k4().m3328kk()[i19].m7641k4(m74541k4(iArr, m74546k4().m3328kk()[i19].m7642x1()));
            }
        }
        if (m74546k4().m3330to() != null) {
            for (int i20 = 0; i20 < m74546k4().m3330to().length; i20++) {
                m74546k4().m3330to()[i20].f49467dy.m73857k4(m74541k4(iArr, m74546k4().m3330to()[i20].f49467dy.m73856k4()));
                m74546k4().m3330to()[i20].f49467dy.m73859x1(m74541k4(iArr, m74546k4().m3330to()[i20].f49467dy.m73858x1()));
                m74546k4().m3330to()[i20].f49473x1 = m74541k4(iArr, m74546k4().m3330to()[i20].f49473x1);
                m74546k4().m3330to()[i20].f49466du = m74541k4(iArr, m74546k4().m3330to()[i20].f49466du);
                m74546k4().m3330to()[i20].f49470kk = m74541k4(iArr, m74546k4().m3330to()[i20].f49470kk);
                m74546k4().m3330to()[i20].f49468h4 = m74541k4(iArr, m74546k4().m3330to()[i20].f49468h4);
                m74546k4().m3330to()[i20].f49472to = m74541k4(iArr, m74546k4().m3330to()[i20].f49472to);
                m74546k4().m3330to()[i20].f49471m9 = m74541k4(iArr, m74546k4().m3330to()[i20].f49471m9);
            }
        }
    }

    /* JADX INFO: renamed from: du */
    private void m74532du() {
        C10749ze c10749ze = this.f50573h4;
        if (c10749ze == null) {
            return;
        }
        if ((c10749ze.m52131du() & 65535) != 4 && (this.f50573h4.m52131du() & 65535) != 8 && (this.f50573h4.m52131du() & 65535) != 65520) {
            this.f50577ks = null;
            return;
        }
        this.f50577ks = new long[(this.f50573h4.m52134to() & 65535) * 2];
        int i = 0;
        if ((this.f50573h4.m52131du() & 65535) != 4 && (this.f50573h4.m52131du() & 65535) != 65520) {
            while (i < (this.f50573h4.m52134to() & 65535)) {
                long jM52135x1 = this.f50573h4.m52135x1(i);
                int i2 = i * 2;
                this.f50577ks[i2] = m74537k4((int) (jM52135x1 & 4294967295L));
                this.f50577ks[i2 + 1] = m74537k4((int) (jM52135x1 >> 32));
                i++;
            }
            return;
        }
        while (i < (this.f50573h4.m52134to() & 65535)) {
            long jM52135x12 = this.f50573h4.m52135x1(i);
            int i3 = i * 2;
            this.f50577ks[i3] = m74537k4((int) (jM52135x12 & C18177fb.f54859s));
            this.f50577ks[i3 + 1] = m74537k4((int) ((jM52135x12 & 4294967295L) >> 16));
            i++;
        }
    }

    /* JADX INFO: renamed from: dy */
    private void m74533dy() {
        int i;
        int i2;
        m74549k4(new byte[m74551x1().size() + 11]);
        for (int i3 = 0; i3 < 11; i3++) {
            m74550kk()[i3] = 16;
        }
        byte[] bArrM74550kk = m74550kk();
        bArrM74550kk[7] = (byte) (bArrM74550kk[7] | 1);
        byte[] bArrM74550kk2 = m74550kk();
        bArrM74550kk2[8] = (byte) (bArrM74550kk2[8] | 4);
        byte[] bArrM74550kk3 = m74550kk();
        bArrM74550kk3[9] = (byte) (bArrM74550kk3[9] | 2);
        byte[] bArrM74550kk4 = m74550kk();
        int i4 = 10;
        bArrM74550kk4[10] = (byte) (8 | bArrM74550kk4[10]);
        for (int i5 = 0; i4 > 0 && i5 < m74550kk().length; i5 = i2) {
            int length = m74550kk().length;
            i2 = length;
            i4 = 0;
            for (int iM67483k4 = C14116yg.m67483k4(i5, 11); iM67483k4 < m74550kk().length; iM67483k4++) {
                if ((m74550kk()[iM67483k4] & 16) != 16) {
                    C0899df c0899df = m74551x1().get_Item(iM67483k4 - 11);
                    byte bM74536k4 = m74536k4(m74550kk(), c0899df.m5083kk());
                    byte bM74536k42 = m74536k4(m74550kk(), c0899df.m5085to());
                    byte bM74536k43 = m74536k4(m74550kk(), c0899df.m5078du());
                    if ((bM74536k4 & 16) == 16 && (bM74536k42 & 16) == 16 && (bM74536k43 & 16) == 16) {
                        m74550kk()[iM67483k4] = (byte) (bM74536k4 | bM74536k42 | bM74536k43);
                        c0899df.m5082k4(m74540k4(m74551x1(), c0899df.m5083kk(), this.f50582up, this.f50585yj));
                        c0899df.m5086x1(m74540k4(m74551x1(), c0899df.m5085to(), this.f50582up, this.f50585yj));
                        c0899df.m5084kk(m74540k4(m74551x1(), c0899df.m5078du(), this.f50582up, this.f50585yj));
                        i4++;
                    } else if (iM67483k4 < i2) {
                        i2 = iM67483k4;
                    }
                }
            }
        }
        f7k[] f7kVarArrM3311h4 = m74546k4().m3311h4();
        if (f7kVarArrM3311h4 != null) {
            for (int i6 = 0; i6 < f7kVarArrM3311h4.length; i6++) {
                long[] jArrM6041k4 = f7kVarArrM3311h4[i6].m6041k4();
                boolean z = f7kVarArrM3311h4[i6].m6045x1() < -27273042329600L || f7kVarArrM3311h4[i6].m6042kk() < -27273042329600L;
                if (!z) {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= jArrM6041k4.length) {
                            break;
                        }
                        long j = jArrM6041k4[i7];
                        if (j < -27273042329600L && (i = (int) ((-27273042329601L) - j)) < m74550kk().length && (m74550kk()[i] & 15) != 0) {
                            z = true;
                            break;
                        }
                        i7++;
                    }
                }
                if (z && (this.f50576kk <= -1 || this.f50581to <= -1 || this.f50582up == this.f50585yj)) {
                    f7kVarArrM3311h4[i6].m6038k4(m74551x1(), m74550kk());
                }
            }
        }
    }

    /* JADX INFO: renamed from: h4 */
    private void m74534h4() {
        List<C0899df> listM74551x1;
        C0899df c0899df;
        List<C0899df> listM74551x12;
        C0899df c0899df2;
        C14888zk c14888zk = this;
        c14888zk.m74547k4(new List<>());
        C10749ze c10749ze = c14888zk.f50571dy;
        if (c10749ze == null || (c10749ze.m52134to() & 65535) == 0) {
            return;
        }
        if ((c14888zk.f50571dy.m52131du() & 65535) != 8) {
            throw new PptReadException("Wrong SG structure size in IMsoArray.");
        }
        for (int i = 0; i < (c14888zk.f50571dy.m52134to() & 65535); i++) {
            c14888zk.m74551x1().addItem(null);
        }
        int i2 = -1;
        int i3 = 0;
        while (i3 < (c14888zk.f50571dy.m52134to() & 65535)) {
            C10535m4 c10535m4 = new C10535m4(c14888zk.f50571dy.m52133kk(i3));
            int[] iArr = {i2};
            long jM74538k4 = c10535m4.m51271x1() ? c14888zk.m74538k4(c10535m4.m51265du() & 65535, iArr) : c10535m4.m51265du() & 65535;
            iArr[0] = iArr[0];
            long jM74538k42 = c10535m4.m51268kk() ? c14888zk.m74538k4(c10535m4.m51266h4() & 65535, iArr) : c10535m4.m51266h4() & 65535;
            iArr[0] = iArr[0];
            long jM74538k43 = c10535m4.m51270to() ? c14888zk.m74538k4(c10535m4.m51269m9() & 65535, iArr) : c10535m4.m51269m9() & 65535;
            int i4 = iArr[0];
            String strM67408k4 = C14113y2.m67408k4("G", C14057f9.m66591x1(i3));
            switch (c10535m4.m51267k4()) {
                case 0:
                    listM74551x1 = m74551x1();
                    c0899df = new C0899df(strM67408k4, (byte) 1, jM74538k4, jM74538k42, jM74538k43);
                    listM74551x1.set_Item(i3, c0899df);
                    break;
                case 1:
                    if (jM74538k43 == 0) {
                        jM74538k43 = 1;
                    }
                    listM74551x1 = m74551x1();
                    c0899df = new C0899df(strM67408k4, (byte) 0, jM74538k4, jM74538k42, jM74538k43);
                    listM74551x1.set_Item(i3, c0899df);
                    break;
                case 2:
                    listM74551x1 = m74551x1();
                    c0899df = new C0899df(strM67408k4, (byte) 2, jM74538k4, jM74538k42, 2L);
                    listM74551x1.set_Item(i3, c0899df);
                    break;
                case 3:
                    listM74551x1 = m74551x1();
                    c0899df = new C0899df(strM67408k4, (byte) 4, jM74538k4, 0L, 0L);
                    listM74551x1.set_Item(i3, c0899df);
                    break;
                case 4:
                    listM74551x1 = m74551x1();
                    c0899df = new C0899df(strM67408k4, (byte) 9, jM74538k4, jM74538k42, 0L);
                    listM74551x1.set_Item(i3, c0899df);
                    break;
                case 5:
                    listM74551x1 = m74551x1();
                    c0899df = new C0899df(strM67408k4, (byte) 8, jM74538k4, jM74538k42, 0L);
                    listM74551x1.set_Item(i3, c0899df);
                    break;
                case 6:
                    listM74551x1 = m74551x1();
                    c0899df = new C0899df(strM67408k4, (byte) 3, jM74538k4, jM74538k42, jM74538k43);
                    listM74551x1.set_Item(i3, c0899df);
                    break;
                case 7:
                    listM74551x1 = m74551x1();
                    c0899df = new C0899df(strM67408k4, (byte) 10, jM74538k4, jM74538k42, jM74538k43);
                    listM74551x1.set_Item(i3, c0899df);
                    break;
                case 8:
                    listM74551x12 = m74551x1();
                    c0899df2 = new C0899df(strM67408k4, (byte) 0, m74539k4(m74551x1(), (byte) 5, jM74538k4, jM74538k42, 0L), 65536L, 60000L);
                    listM74551x12.set_Item(i3, c0899df2);
                    break;
                case 9:
                    listM74551x1 = m74551x1();
                    c0899df = new C0899df(strM67408k4, (byte) 13, jM74538k4, m74539k4(m74551x1(), (byte) 0, jM74538k42, 60000L, 65536L), 0L);
                    listM74551x1.set_Item(i3, c0899df);
                    break;
                case 10:
                    listM74551x1 = m74551x1();
                    c0899df = new C0899df(strM67408k4, (byte) 7, jM74538k4, m74539k4(m74551x1(), (byte) 0, jM74538k42, 60000L, 65536L), 0L);
                    listM74551x1.set_Item(i3, c0899df);
                    break;
                case 11:
                    listM74551x1 = m74551x1();
                    c0899df = new C0899df(strM67408k4, (byte) 6, jM74538k4, jM74538k42, jM74538k43);
                    listM74551x1.set_Item(i3, c0899df);
                    break;
                case 12:
                    listM74551x1 = m74551x1();
                    c0899df = new C0899df(strM67408k4, (byte) 12, jM74538k4, jM74538k42, jM74538k43);
                    listM74551x1.set_Item(i3, c0899df);
                    break;
                case 13:
                    listM74551x1 = m74551x1();
                    c0899df = new C0899df(strM67408k4, (byte) 14, jM74538k4, 0L, 0L);
                    listM74551x1.set_Item(i3, c0899df);
                    break;
                case 14:
                    listM74551x1 = m74551x1();
                    c0899df = new C0899df(strM67408k4, (byte) 1, jM74538k4, m74539k4(m74551x1(), (byte) 0, 65536L, m74539k4(m74551x1(), (byte) 1, jM74538k42, 0L, jM74538k43), 1L), 0L);
                    listM74551x1.set_Item(i3, c0899df);
                    break;
                case 15:
                    long jM74539k4 = m74539k4(m74551x1(), (byte) 0, jM74538k4, 1L, jM74538k42);
                    listM74551x12 = m74551x1();
                    c0899df2 = new C0899df(strM67408k4, (byte) 0, jM74538k43, m74539k4(m74551x1(), (byte) 14, m74539k4(m74551x1(), (byte) 1, 1L, 0L, m74539k4(m74551x1(), (byte) 0, jM74539k4, jM74539k4, 1L)), 0L, 0L), 1L);
                    listM74551x12.set_Item(i3, c0899df2);
                    break;
                case 16:
                    List<C0899df> listM74551x13 = c14888zk.m74551x1();
                    long jM74539k42 = c14888zk.m74539k4(c14888zk.m74551x1(), (byte) 0, jM74538k42, 60000L, 65536L);
                    listM74551x1 = listM74551x13;
                    c0899df = new C0899df(strM67408k4, (byte) 15, jM74538k4, jM74539k42, 0L);
                    listM74551x1.set_Item(i3, c0899df);
                    break;
            }
            i3++;
            c14888zk = this;
            i2 = i4;
        }
        if (i2 >= 0) {
            m74546k4().m3322k4(new C13791lr[i2 + 1]);
        }
    }

    /* JADX INFO: renamed from: jd */
    private void m74535jd() {
        C10749ze c10749ze = this.f50574jd;
        if (c10749ze == null) {
            return;
        }
        if ((c10749ze.m52131du() & 65535) != 4 && (this.f50574jd.m52131du() & 65535) != 8 && (this.f50574jd.m52131du() & 65535) != 65520) {
            m74546k4().m3321k4(new C1253ij[0]);
            return;
        }
        int iM52134to = this.f50574jd.m52134to();
        C14843yd[] c14843ydArr = new C14843yd[iM52134to];
        if ((this.f50574jd.m52131du() & 65535) == 4 || (this.f50574jd.m52131du() & 65535) == 65520) {
            for (int i = 0; i < (this.f50574jd.m52134to() & 65535); i++) {
                long jM52135x1 = this.f50574jd.m52135x1(i);
                c14843ydArr[i] = new C14843yd(m74537k4((short) (jM52135x1 & C18177fb.f54859s)), m74537k4((short) ((jM52135x1 & 4294967295L) >> 16)));
            }
        } else {
            for (int i2 = 0; i2 < (this.f50574jd.m52134to() & 65535); i2++) {
                long jM52135x12 = this.f50574jd.m52135x1(i2);
                c14843ydArr[i2] = new C14843yd(m74537k4((int) (jM52135x12 & 4294967295L)), m74537k4((int) (jM52135x12 >> 32)));
            }
        }
        if (m74551x1().size() == 0) {
            List list = new List();
            for (int i3 = 0; i3 < iM52134to; i3++) {
                C14843yd c14843yd = c14843ydArr[i3];
                if (c14843yd.m73856k4() > -27273042329612L && c14843yd.m73858x1() > -27273042329612L) {
                    list.addItem(c14843yd);
                }
            }
            c14843ydArr = (C14843yd[]) list.toArray(new C14843yd[0]);
        }
        m74546k4().m3321k4(new C1253ij[c14843ydArr.length]);
        for (int i4 = 0; i4 < c14843ydArr.length; i4++) {
            m74546k4().m3328kk()[i4] = new C1253ij(c14843ydArr[i4].m73856k4(), c14843ydArr[i4].m73858x1(), 0L);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private byte m74536k4(byte[] bArr, long j) {
        if (j <= 27273042316900L && j < -27273042329600L) {
            return bArr[(int) ((-27273042329601L) - j)];
        }
        return (byte) 16;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:492:0x09b4  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x0a39  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x0ad5  */
    /* JADX WARN: Removed duplicated region for block: B:575:0x0b4d  */
    /* JADX WARN: Removed duplicated region for block: B:597:0x0bdd  */
    /* JADX WARN: Removed duplicated region for block: B:607:0x0c0e  */
    /* JADX WARN: Removed duplicated region for block: B:691:0x00a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r21v11 */
    /* JADX WARN: Type inference failed for: r21v12 */
    /* JADX WARN: Type inference failed for: r21v13 */
    /* JADX WARN: Type inference failed for: r21v15 */
    /* JADX WARN: Type inference failed for: r21v16 */
    /* JADX WARN: Type inference failed for: r21v17 */
    /* JADX WARN: Type inference failed for: r21v18 */
    /* JADX WARN: Type inference failed for: r21v19 */
    /* JADX WARN: Type inference failed for: r21v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r21v20 */
    /* JADX WARN: Type inference failed for: r21v21 */
    /* JADX WARN: Type inference failed for: r21v22 */
    /* JADX WARN: Type inference failed for: r21v23 */
    /* JADX WARN: Type inference failed for: r21v24 */
    /* JADX WARN: Type inference failed for: r21v25 */
    /* JADX WARN: Type inference failed for: r21v26 */
    /* JADX WARN: Type inference failed for: r21v27 */
    /* JADX WARN: Type inference failed for: r21v28 */
    /* JADX WARN: Type inference failed for: r21v29 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r21v30 */
    /* JADX WARN: Type inference failed for: r21v31 */
    /* JADX WARN: Type inference failed for: r21v32 */
    /* JADX WARN: Type inference failed for: r21v33 */
    /* JADX WARN: Type inference failed for: r21v34 */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r21v6 */
    /* JADX WARN: Type inference failed for: r21v7 */
    /* JADX WARN: Type inference failed for: r21v8 */
    /* JADX WARN: Type inference failed for: r21v9 */
    /* JADX INFO: renamed from: m9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m74544m9() {
        byte b;
        List<Byte> list;
        List<Long> list2;
        int size;
        byte b2;
        int i;
        byte b3;
        int i2;
        List<Long> list3;
        List<Byte> list4;
        ?? r21;
        int i3;
        int i4;
        C10731yg c10731ygM52067k4;
        int i5;
        byte b4;
        int i6;
        List<Long> list5;
        C10735yn c10735yn;
        int i7;
        long jM74539k4;
        long j;
        long j2;
        long jM74539k42;
        byte b5;
        long jM74539k43;
        int i8;
        long jM74539k44;
        int i9;
        long j3;
        long jM74539k45;
        int i10;
        long j4;
        long jM74539k46;
        int i11;
        long[] jArr;
        int i12;
        long j5;
        long jM74539k47;
        int i13;
        long jM74539k48;
        int i14;
        long jM74539k49;
        int i15;
        long jM74539k410;
        int i16;
        long jM74539k411;
        int i17;
        long jM74539k412;
        int i18;
        long jM74539k413;
        int i19;
        int i20;
        long jM74539k414;
        int i21;
        long jM74539k415;
        int i22;
        long jM74539k416;
        int i23;
        long jM74539k417;
        int i24;
        int i25;
        long jM74539k418;
        long j6;
        int i26;
        long jM74539k419;
        int i27;
        int i28;
        long jM74539k420;
        long jM74539k421;
        int i29;
        long jM74539k422;
        ?? r212;
        int i30;
        long[] jArr2;
        long jM74539k423;
        long jM74539k424;
        long[] jArr3;
        byte b6;
        int i31;
        long[] jArr4;
        long jM74539k425;
        long[] jArr5;
        long jM74539k426;
        int i32;
        long jM74539k427;
        long jM74539k428;
        List<Byte> list6;
        List<Byte> list7;
        ?? r213;
        List<Long> list8;
        List<Byte> list9;
        ?? r214;
        C14888zk c14888zk = this;
        if (c14888zk.f50577ks == null) {
            return;
        }
        List list10 = new List();
        List<Long> list11 = new List<>(c14888zk.f50577ks.length + 16);
        List<Byte> list12 = new List<>();
        C10749ze c10749ze = c14888zk.f50578m9;
        int i33 = 6;
        byte b7 = 3;
        byte b8 = 0;
        int i34 = 2;
        byte b9 = 1;
        byte b10 = 1;
        ?? r215 = 1;
        ?? r216 = 1;
        r215 = 1;
        if (c10749ze == null || (c10749ze.m52134to() & 65535) == 0) {
            b = 0;
            if (c14888zk.f50577ks.length < 4) {
                return;
            }
            list12.addItem((byte) 1);
            list11.addItem(Long.valueOf(c14888zk.f50569ck == 0 ? c14888zk.f50577ks[0] : c14888zk.m74539k4(c14888zk.m74551x1(), (byte) 1, c14888zk.f50577ks[0], 0L, c14888zk.f50569ck)));
            list11.addItem(Long.valueOf(c14888zk.f50572fa == 0 ? c14888zk.f50577ks[1] : c14888zk.m74539k4(c14888zk.m74551x1(), (byte) 1, c14888zk.f50577ks[1], 0L, c14888zk.f50572fa)));
            int i35 = c14888zk.f50570du;
            if (i35 == 0) {
                list = list12;
                list2 = list11;
                long[] jArr6 = c14888zk.f50577ks;
                c14888zk.m74542k4((byte) 2, list, list2, jArr6, (jArr6.length - 2) / 2, 2, 2, false);
            } else if (i35 == 1) {
                list = list12;
                list2 = list11;
                long[] jArr7 = c14888zk.f50577ks;
                c14888zk.m74542k4((byte) 2, list, list2, jArr7, (jArr7.length - 2) / 2, 2, 2, true);
            } else if (i35 == 2) {
                list = list12;
                list2 = list11;
                long[] jArr8 = c14888zk.f50577ks;
                c14888zk.m74542k4((byte) 5, list, list2, jArr8, (jArr8.length - 2) / 6, 2, 6, false);
            } else if (i35 != 3) {
                list12.setCapacity(c14888zk.f50577ks.length / 2);
                list = list12;
                list2 = list11;
            } else {
                long[] jArr9 = c14888zk.f50577ks;
                list = list12;
                list2 = list11;
                c14888zk.m74542k4((byte) 5, list, list2, jArr9, (jArr9.length - 2) / 6, 2, 6, true);
            }
            if (c14888zk.f50570du != 4) {
                list10.addItem(new f7k(C3085sv.m13110x1(list), list2, 0, list2.size(), c14888zk.f50582up, c14888zk.f50585yj, (byte) 1, true, true));
                list.clear();
                list2.clear();
                size = list2.size();
            } else {
                size = 0;
            }
        } else {
            int i36 = 0;
            int iM52068kk = 0;
            int size2 = 0;
            byte b11 = 1;
            while (i36 < (c14888zk.f50578m9.m52134to() & 65535)) {
                try {
                    i3 = i36 + 1;
                    try {
                        c10731ygM52067k4 = C10731yg.m52067k4((int) (c14888zk.f50578m9.m52135x1(i36) & C18177fb.f54859s));
                    } catch (RuntimeException e) {
                        e = e;
                        b2 = b8;
                        i = i34;
                        b3 = b9;
                        i2 = i33;
                        list3 = list11;
                        list4 = list12;
                        i4 = i3;
                    }
                } catch (RuntimeException e2) {
                    e = e2;
                    b2 = b8;
                    i = i34;
                    b3 = b9;
                    i2 = i33;
                    list3 = list11;
                }
                if (iM52068kk >= c14888zk.f50577ks.length - b9) {
                    try {
                        if ((c10731ygM52067k4.m52068kk() & 255) > 0 && c10731ygM52067k4.m52069to() < b7) {
                            list11.clear();
                            list10.clear();
                            b = b8;
                            list = list12;
                            list2 = list11;
                            size = size2;
                            r215 = r216;
                        }
                    } catch (RuntimeException e3) {
                        e = e3;
                        b2 = b8;
                        i = i34;
                        b3 = b9;
                        i36 = i3;
                        i2 = i33;
                        list3 = list11;
                    }
                    switch (c10731ygM52067k4.m52069to()) {
                        case 0:
                            b2 = b8;
                            i = i34;
                            byte b12 = b9;
                            i2 = i33;
                            list3 = list11;
                            i26 = iM52068kk;
                            list4 = list12;
                            i4 = i3;
                            try {
                                b5 = b12;
                                if (list4.size() > b5) {
                                    try {
                                        if (list4.get_Item(list4.size() - b5).byteValue() == 4) {
                                            b3 = b5;
                                            iM52068kk = i26;
                                            r21 = r216;
                                        } else {
                                            if (b11 != 0) {
                                                list4.addItem(Byte.valueOf(b5));
                                                long[] jArr10 = c14888zk.f50577ks;
                                                if (c14888zk.f50569ck == 0) {
                                                    jM74539k423 = jArr10[i26];
                                                    jArr2 = jArr10;
                                                    b3 = b5;
                                                } else {
                                                    jArr2 = jArr10;
                                                    b3 = b5;
                                                    jM74539k423 = c14888zk.m74539k4(c14888zk.m74551x1(), (byte) 1, c14888zk.f50577ks[i26], 0L, c14888zk.f50569ck);
                                                }
                                                jArr2[i26] = jM74539k423;
                                                long[] jArr11 = c14888zk.f50577ks;
                                                int i37 = i26 + 1;
                                                if (c14888zk.f50572fa == 0) {
                                                    try {
                                                        jM74539k424 = jArr11[i37];
                                                        jArr3 = jArr11;
                                                    } catch (RuntimeException e4) {
                                                        e = e4;
                                                        i36 = i4;
                                                        iM52068kk = i26;
                                                        r21 = r216;
                                                        C3085sv.m13082k4(e);
                                                    }
                                                } else {
                                                    jArr3 = jArr11;
                                                    jM74539k424 = c14888zk.m74539k4(c14888zk.m74551x1(), (byte) 1, c14888zk.f50577ks[i37], 0L, c14888zk.f50572fa);
                                                }
                                                jArr3[i37] = jM74539k424;
                                                c14888zk.m74543k4(list3, c14888zk.f50577ks, i26, i);
                                                i30 = i26 + 2;
                                                b11 = b2;
                                            } else {
                                                b3 = b5;
                                                i30 = i26;
                                            }
                                            try {
                                                try {
                                                    c14888zk.m74542k4((byte) 2, list4, list3, c14888zk.f50577ks, c10731ygM52067k4.m52068kk() & 255, i30, 2, false);
                                                    iM52068kk = ((c10731ygM52067k4.m52068kk() & 255) * i) + i30;
                                                    r21 = r216;
                                                } catch (RuntimeException e5) {
                                                    e = e5;
                                                    list4 = list4;
                                                    list3 = list3;
                                                    iM52068kk = i30;
                                                    i36 = i4;
                                                    r21 = r216;
                                                    C3085sv.m13082k4(e);
                                                }
                                            } catch (RuntimeException e6) {
                                                e = e6;
                                            }
                                        }
                                        i36 = i4;
                                    } catch (RuntimeException e7) {
                                        e = e7;
                                        b3 = b5;
                                        i36 = i4;
                                        iM52068kk = i26;
                                        r21 = r216;
                                        C3085sv.m13082k4(e);
                                        list12 = list4;
                                        i34 = i;
                                        list11 = list3;
                                        b9 = b3;
                                        i33 = i2;
                                        b8 = b2;
                                        b7 = 3;
                                        r216 = r21;
                                    }
                                    break;
                                }
                            } catch (RuntimeException e8) {
                                e = e8;
                                b3 = b12;
                            }
                            break;
                        case 1:
                            b2 = b8;
                            i = i34;
                            b6 = b9;
                            i2 = i33;
                            list3 = list11;
                            int i38 = iM52068kk;
                            list4 = list12;
                            i4 = i3;
                            if (b11 != 0) {
                                list4.addItem(Byte.valueOf(b6));
                                long[] jArr12 = c14888zk.f50577ks;
                                if (c14888zk.f50569ck == 0) {
                                    jM74539k425 = jArr12[i38];
                                    jArr4 = jArr12;
                                } else {
                                    jArr4 = jArr12;
                                    jM74539k425 = c14888zk.m74539k4(c14888zk.m74551x1(), (byte) 1, c14888zk.f50577ks[i38], 0L, c14888zk.f50569ck);
                                }
                                jArr4[i38] = jM74539k425;
                                long[] jArr13 = c14888zk.f50577ks;
                                int i39 = i38 + 1;
                                if (c14888zk.f50572fa == 0) {
                                    jM74539k426 = jArr13[i39];
                                    jArr5 = jArr13;
                                } else {
                                    jArr5 = jArr13;
                                    jM74539k426 = c14888zk.m74539k4(c14888zk.m74551x1(), (byte) 1, c14888zk.f50577ks[i39], 0L, c14888zk.f50572fa);
                                }
                                jArr5[i39] = jM74539k426;
                                c14888zk.m74543k4(list3, c14888zk.f50577ks, i38, i);
                                i31 = i38 + 2;
                                b11 = b2;
                            } else {
                                i31 = i38;
                            }
                            try {
                            } catch (RuntimeException e9) {
                                e = e9;
                            }
                            try {
                                c14888zk.m74542k4((byte) 5, list4, list3, c14888zk.f50577ks, c10731ygM52067k4.m52068kk() & 255, i31, 6, false);
                                iM52068kk = ((c10731ygM52067k4.m52068kk() & 255) * 6) + i31;
                                b3 = b6;
                                r21 = r216;
                                i36 = i4;
                            } catch (RuntimeException e10) {
                                e = e10;
                                list4 = list4;
                                list3 = list3;
                                iM52068kk = i31;
                                i36 = i4;
                                b3 = b6;
                                r21 = r216;
                                C3085sv.m13082k4(e);
                            }
                            break;
                        case 2:
                            list3 = list11;
                            b2 = b8;
                            i = i34;
                            b6 = b9;
                            List<Byte> list13 = list12;
                            i2 = i33;
                            i4 = i3;
                            try {
                                list13.addItem(Byte.valueOf(b6));
                                long[] jArr14 = c14888zk.f50577ks;
                                if (c14888zk.f50569ck != 0) {
                                    try {
                                        list4 = list13;
                                        i32 = iM52068kk;
                                        jM74539k427 = c14888zk.m74539k4(c14888zk.m74551x1(), (byte) 1, c14888zk.f50577ks[iM52068kk], 0L, c14888zk.f50569ck);
                                    } catch (RuntimeException e11) {
                                        e = e11;
                                        list4 = list13;
                                        i36 = i4;
                                        b3 = b6;
                                        r21 = r216;
                                        C3085sv.m13082k4(e);
                                        list12 = list4;
                                        i34 = i;
                                        list11 = list3;
                                        b9 = b3;
                                        i33 = i2;
                                        b8 = b2;
                                        b7 = 3;
                                        r216 = r21;
                                    }
                                } else {
                                    jM74539k427 = jArr14[iM52068kk];
                                    list4 = list13;
                                    i32 = iM52068kk;
                                }
                                jArr14[i32] = jM74539k427;
                                long[] jArr15 = c14888zk.f50577ks;
                                int i40 = i32 + 1;
                                if (c14888zk.f50572fa == 0) {
                                    try {
                                        jM74539k428 = jArr15[i40];
                                    } catch (RuntimeException e12) {
                                        e = e12;
                                        i36 = i4;
                                        iM52068kk = i32;
                                        b3 = b6;
                                        r21 = r216;
                                        C3085sv.m13082k4(e);
                                    }
                                } else {
                                    jM74539k428 = c14888zk.m74539k4(c14888zk.m74551x1(), (byte) 1, c14888zk.f50577ks[i40], 0L, c14888zk.f50572fa);
                                }
                                jArr15[i40] = jM74539k428;
                                c14888zk.m74543k4(list3, c14888zk.f50577ks, i32, i);
                                iM52068kk = i32 + 2;
                                b3 = b6;
                                b11 = b2;
                                r21 = r216;
                                i36 = i4;
                            } catch (RuntimeException e13) {
                                e = e13;
                                list4 = list13;
                            }
                            break;
                        case 3:
                            b2 = b8;
                            int i41 = i34;
                            b6 = b9;
                            List<Byte> list14 = list12;
                            i2 = i33;
                            byte b13 = b7;
                            char c = 4;
                            try {
                            } catch (RuntimeException e14) {
                                e = e14;
                                list6 = list14;
                                list3 = list11;
                                i = i41;
                                i4 = i3;
                            }
                            try {
                                if (iM52068kk < c14888zk.f50577ks.length - 2) {
                                    i4 = i3;
                                    if (i4 != (c14888zk.f50578m9.m52134to() & 65535) - 1) {
                                        try {
                                            if (((int) (c14888zk.f50578m9.m52135x1(i36 + 2) >> 13)) == 4) {
                                            }
                                            list6.addItem(Byte.valueOf(b2));
                                            list4 = list6;
                                            b3 = b6;
                                            r21 = r216;
                                            i36 = i4;
                                        } catch (RuntimeException e15) {
                                            e = e15;
                                            list4 = list14;
                                            i36 = i4;
                                            list3 = list11;
                                            b3 = b6;
                                            i = i41;
                                            r21 = r216;
                                            C3085sv.m13082k4(e);
                                        }
                                    }
                                    i31 = iM52068kk;
                                    while (true) {
                                        try {
                                            long[] jArr16 = c14888zk.f50577ks;
                                            if (i31 < jArr16.length - 1) {
                                                char c2 = c;
                                                List<Long> list15 = list11;
                                                byte b14 = b13;
                                                i = i41;
                                                try {
                                                    c14888zk.m74542k4((byte) 2, list14, list15, jArr16, 1, i31, 2, false);
                                                    i31 += 2;
                                                    list14 = list14;
                                                    c = c2;
                                                    b13 = b14;
                                                    i41 = i;
                                                    list11 = list15;
                                                } catch (RuntimeException e16) {
                                                    e = e16;
                                                    list7 = list14;
                                                    list3 = list15;
                                                    list4 = list7;
                                                    iM52068kk = i31;
                                                    i36 = i4;
                                                    b3 = b6;
                                                    r21 = r216;
                                                    C3085sv.m13082k4(e);
                                                    list12 = list4;
                                                    i34 = i;
                                                    list11 = list3;
                                                    b9 = b3;
                                                    i33 = i2;
                                                    b8 = b2;
                                                    b7 = 3;
                                                    r216 = r21;
                                                }
                                            } else {
                                                list6 = list14;
                                                list3 = list11;
                                                i = i41;
                                                iM52068kk = i31;
                                                list6.addItem(Byte.valueOf(b2));
                                                list4 = list6;
                                                b3 = b6;
                                                r21 = r216;
                                                i36 = i4;
                                            }
                                        } catch (RuntimeException e17) {
                                            e = e17;
                                            list7 = list14;
                                            list3 = list11;
                                            i = i41;
                                        }
                                    }
                                } else {
                                    i4 = i3;
                                }
                                list6.addItem(Byte.valueOf(b2));
                                list4 = list6;
                                b3 = b6;
                                r21 = r216;
                                i36 = i4;
                            } catch (RuntimeException e18) {
                                e = e18;
                                list4 = list6;
                                i36 = i4;
                                b3 = b6;
                                r21 = r216;
                                C3085sv.m13082k4(e);
                            }
                            list6 = list14;
                            list3 = list11;
                            i = i41;
                            break;
                        case 4:
                            b2 = b8;
                            int i42 = i34;
                            byte b15 = b9;
                            i6 = i3;
                            List<Long> list16 = list11;
                            try {
                                if (list12.size() > 0 && list16.size() > 0) {
                                    list9 = list12;
                                    try {
                                        list8 = list16;
                                        i2 = 6;
                                        try {
                                            list10.addItem(new f7k(C3085sv.m13110x1(list9), list8, 0, list16.size(), c14888zk.f50582up, c14888zk.f50585yj, b10, r216, true));
                                        } catch (RuntimeException e19) {
                                            e = e19;
                                            list4 = list9;
                                            list3 = list8;
                                            b3 = b15;
                                            r214 = r216;
                                            i = i42;
                                            i36 = i6;
                                            r21 = r214;
                                            C3085sv.m13082k4(e);
                                            list12 = list4;
                                            i34 = i;
                                            list11 = list3;
                                            b9 = b3;
                                            i33 = i2;
                                            b8 = b2;
                                            b7 = 3;
                                            r216 = r21;
                                        }
                                    } catch (RuntimeException e20) {
                                        e = e20;
                                        list8 = list16;
                                        i2 = 6;
                                        list4 = list9;
                                        list3 = list8;
                                        b3 = b15;
                                        r214 = r216;
                                        i = i42;
                                        i36 = i6;
                                        r21 = r214;
                                        C3085sv.m13082k4(e);
                                        list12 = list4;
                                        i34 = i;
                                        list11 = list3;
                                        b9 = b3;
                                        i33 = i2;
                                        b8 = b2;
                                        b7 = 3;
                                        r216 = r21;
                                    }
                                } else {
                                    list8 = list16;
                                    list9 = list12;
                                    i2 = 6;
                                }
                            } catch (RuntimeException e21) {
                                e = e21;
                                list8 = list16;
                                list9 = list12;
                            }
                            try {
                                list9.clear();
                                list8.clear();
                                size2 = list8.size();
                                list4 = list9;
                                list3 = list8;
                                b3 = b15;
                                b10 = b3;
                                byte b16 = b10;
                                b11 = b16 == true ? 1 : 0;
                                i = i42;
                                r213 = b16;
                                i4 = i6;
                                r21 = r213;
                                i36 = i4;
                            } catch (RuntimeException e22) {
                                e = e22;
                                list4 = list9;
                                list3 = list8;
                                b3 = b15;
                                b10 = b3;
                                r214 = b10;
                                i = i42;
                                i36 = i6;
                                r21 = r214;
                                C3085sv.m13082k4(e);
                            }
                            break;
                        case 5:
                        case 6:
                            try {
                                c10735yn = (C10735yn) c10731ygM52067k4;
                            } catch (RuntimeException e23) {
                                e = e23;
                                b2 = b8;
                                i5 = i34;
                                b4 = b9;
                                i6 = i3;
                                list5 = list11;
                            }
                            switch (c10735yn.m52080k4()) {
                                case 1:
                                case 2:
                                    b2 = b8;
                                    b4 = b9;
                                    i6 = i3;
                                    byte b17 = b7;
                                    try {
                                        if ((c10735yn.m52068kk() & 255) == 0) {
                                            i2 = i33;
                                            list3 = list11;
                                            b5 = b4;
                                            i = 2;
                                            i26 = iM52068kk;
                                            list4 = list12;
                                            i4 = i6;
                                            b3 = b5;
                                            iM52068kk = i26;
                                            r21 = r216;
                                            i36 = i4;
                                        } else if ((c10735yn.m52068kk() & 255) % 3 != 0) {
                                            i2 = i33;
                                            list3 = list11;
                                            b5 = b4;
                                            i = 2;
                                            i26 = iM52068kk;
                                            list4 = list12;
                                            i4 = i6;
                                            b3 = b5;
                                            iM52068kk = i26;
                                            r21 = r216;
                                            i36 = i4;
                                        } else {
                                            int iM52068kk2 = c10735yn.m52068kk() & 255;
                                            while (iM52068kk2 > 0) {
                                                if (c14888zk.f50569ck != 0) {
                                                    int i43 = iM52068kk + 1;
                                                    try {
                                                        jM74539k43 = c14888zk.m74539k4(c14888zk.m74551x1(), (byte) 1, c14888zk.f50577ks[iM52068kk], 0L, c14888zk.f50569ck);
                                                        i8 = i43;
                                                    } catch (RuntimeException e24) {
                                                        e = e24;
                                                        i5 = 2;
                                                        list3 = list11;
                                                        list4 = list12;
                                                        iM52068kk = i43;
                                                        b3 = b4;
                                                        i = i5;
                                                        i36 = i6;
                                                        i2 = 6;
                                                        r21 = r216;
                                                        C3085sv.m13082k4(e);
                                                        list12 = list4;
                                                        i34 = i;
                                                        list11 = list3;
                                                        b9 = b3;
                                                        i33 = i2;
                                                        b8 = b2;
                                                        b7 = 3;
                                                        r216 = r21;
                                                    }
                                                } else {
                                                    i8 = iM52068kk + 1;
                                                    jM74539k43 = c14888zk.f50577ks[iM52068kk];
                                                }
                                                long j7 = jM74539k43;
                                                try {
                                                    if (c14888zk.f50572fa == 0) {
                                                        i9 = i8 + 1;
                                                        jM74539k44 = c14888zk.f50577ks[i8];
                                                    } else {
                                                        int i44 = i8 + 1;
                                                        jM74539k44 = c14888zk.m74539k4(c14888zk.m74551x1(), (byte) 1, c14888zk.f50577ks[i8], 0L, c14888zk.f50572fa);
                                                        i9 = i44;
                                                    }
                                                    j3 = jM74539k44;
                                                    try {
                                                        if (c14888zk.f50569ck == 0) {
                                                            i10 = i9 + 1;
                                                            jM74539k45 = c14888zk.f50577ks[i9];
                                                        } else {
                                                            int i45 = i9 + 1;
                                                            jM74539k45 = c14888zk.m74539k4(c14888zk.m74551x1(), (byte) 1, c14888zk.f50577ks[i9], 0L, c14888zk.f50569ck);
                                                            i10 = i45;
                                                        }
                                                        j4 = jM74539k45;
                                                        if (c14888zk.f50572fa != 0) {
                                                            int i46 = i10 + 1;
                                                            try {
                                                                jM74539k46 = c14888zk.m74539k4(c14888zk.m74551x1(), (byte) 1, c14888zk.f50577ks[i10], 0L, c14888zk.f50572fa);
                                                                i11 = i46;
                                                            } catch (RuntimeException e25) {
                                                                e = e25;
                                                                i5 = 2;
                                                                list3 = list11;
                                                                list4 = list12;
                                                                iM52068kk = i46;
                                                                b3 = b4;
                                                                i = i5;
                                                                i36 = i6;
                                                                i2 = 6;
                                                                r21 = r216;
                                                                C3085sv.m13082k4(e);
                                                                list12 = list4;
                                                                i34 = i;
                                                                list11 = list3;
                                                                b9 = b3;
                                                                i33 = i2;
                                                                b8 = b2;
                                                                b7 = 3;
                                                                r216 = r21;
                                                            }
                                                        } else {
                                                            i11 = i10 + 1;
                                                            jM74539k46 = c14888zk.f50577ks[i10];
                                                        }
                                                        jArr = c14888zk.f50577ks;
                                                        i12 = i11 + 1;
                                                        j5 = jArr[i11];
                                                        i9 = i11 + 2;
                                                        list5 = list11;
                                                    } catch (RuntimeException e26) {
                                                        e = e26;
                                                        list5 = list11;
                                                    }
                                                } catch (RuntimeException e27) {
                                                    e = e27;
                                                    list5 = list11;
                                                    i5 = 2;
                                                    iM52068kk = i8;
                                                }
                                                try {
                                                    long j8 = jArr[i12];
                                                    if (b11 == 0) {
                                                        i5 = 2;
                                                        try {
                                                            list12.addItem((byte) 2);
                                                        } catch (RuntimeException e28) {
                                                            e = e28;
                                                            iM52068kk = i9;
                                                            list3 = list5;
                                                            list4 = list12;
                                                            b3 = b4;
                                                            i = i5;
                                                            i36 = i6;
                                                            i2 = 6;
                                                            r21 = r216;
                                                            C3085sv.m13082k4(e);
                                                            list12 = list4;
                                                            i34 = i;
                                                            list11 = list3;
                                                            b9 = b3;
                                                            i33 = i2;
                                                            b8 = b2;
                                                            b7 = 3;
                                                            r216 = r21;
                                                        }
                                                    } else {
                                                        try {
                                                            list12.addItem(Byte.valueOf(b4));
                                                            b11 = b2;
                                                            i5 = 2;
                                                        } catch (RuntimeException e29) {
                                                            e = e29;
                                                            iM52068kk = i9;
                                                            list3 = list5;
                                                            list4 = list12;
                                                            b3 = b4;
                                                            i36 = i6;
                                                            i = 2;
                                                            i2 = 6;
                                                            r21 = r216;
                                                            C3085sv.m13082k4(e);
                                                            list12 = list4;
                                                            i34 = i;
                                                            list11 = list3;
                                                            b9 = b3;
                                                            i33 = i2;
                                                            b8 = b2;
                                                            b7 = 3;
                                                            r216 = r21;
                                                        }
                                                    }
                                                    list5.addItem(Long.valueOf(j7));
                                                    list5.addItem(Long.valueOf(j3));
                                                    list12.addItem(Byte.valueOf(b17));
                                                    list5.addItem(Long.valueOf(j4));
                                                    list5.addItem(Long.valueOf(jM74539k46));
                                                    list5.addItem(Long.valueOf(C7019kk.m27438h4(Double.valueOf(j5 * 0.017453292519943295d), 14)));
                                                    list5.addItem(Long.valueOf(C7019kk.m27438h4(Double.valueOf(j8 * 0.017453292519943295d), 14)));
                                                    iM52068kk2 -= 3;
                                                    iM52068kk = i9;
                                                    list11 = list5;
                                                    i33 = 6;
                                                } catch (RuntimeException e30) {
                                                    e = e30;
                                                    i5 = 2;
                                                    iM52068kk = i9;
                                                    list3 = list5;
                                                    list4 = list12;
                                                    b3 = b4;
                                                    i = i5;
                                                    i36 = i6;
                                                    i2 = 6;
                                                    r21 = r216;
                                                    C3085sv.m13082k4(e);
                                                    list12 = list4;
                                                    i34 = i;
                                                    list11 = list3;
                                                    b9 = b3;
                                                    i33 = i2;
                                                    b8 = b2;
                                                    b7 = 3;
                                                    r216 = r21;
                                                }
                                                break;
                                            }
                                            i2 = i33;
                                            list3 = list11;
                                            b3 = b4;
                                            i = 2;
                                            list4 = list12;
                                            r213 = r216;
                                            i4 = i6;
                                            r21 = r213;
                                            i36 = i4;
                                        }
                                    } catch (RuntimeException e31) {
                                        e = e31;
                                        list5 = list11;
                                        i5 = 2;
                                    }
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                    b2 = b8;
                                    b4 = b9;
                                    i6 = i3;
                                    int i47 = 5;
                                    byte b18 = b7;
                                    if ((c10735yn.m52068kk() & 255) == 2) {
                                        if (c14888zk.f50569ck == 0) {
                                            i22 = iM52068kk + 1;
                                            jM74539k415 = c14888zk.f50577ks[iM52068kk];
                                        } else {
                                            int i48 = iM52068kk + 1;
                                            try {
                                                jM74539k415 = c14888zk.m74539k4(c14888zk.m74551x1(), (byte) 1, c14888zk.f50577ks[iM52068kk], 0L, c14888zk.f50569ck);
                                                i22 = i48;
                                            } catch (RuntimeException e32) {
                                                e = e32;
                                                i2 = i33;
                                                list3 = list11;
                                                iM52068kk = i48;
                                                b3 = b4;
                                                i36 = i6;
                                                i = 2;
                                                list4 = list12;
                                                r21 = r216;
                                                C3085sv.m13082k4(e);
                                            }
                                        }
                                        long j9 = jM74539k415;
                                        if (c14888zk.f50572fa == 0) {
                                            i23 = i22 + 1;
                                            jM74539k416 = c14888zk.f50577ks[i22];
                                        } else {
                                            int i49 = i22;
                                            int i50 = i49 + 1;
                                            jM74539k416 = c14888zk.m74539k4(c14888zk.m74551x1(), (byte) 1, c14888zk.f50577ks[i49], 0L, c14888zk.f50572fa);
                                            i23 = i50;
                                        }
                                        long j10 = jM74539k416;
                                        if (c14888zk.f50569ck == 0) {
                                            i24 = i23 + 1;
                                            jM74539k417 = c14888zk.f50577ks[i23];
                                        } else {
                                            int i51 = i23 + 1;
                                            jM74539k417 = c14888zk.m74539k4(c14888zk.m74551x1(), (byte) 1, c14888zk.f50577ks[i23], 0L, c14888zk.f50569ck);
                                            i24 = i51;
                                        }
                                        long j11 = jM74539k417;
                                        try {
                                            if (c14888zk.f50572fa == 0) {
                                                int i52 = i24 + 1;
                                                jM74539k418 = c14888zk.f50577ks[i24];
                                                i25 = i52;
                                            } else {
                                                int i53 = i24;
                                                i25 = i53 + 1;
                                                jM74539k418 = c14888zk.m74539k4(c14888zk.m74551x1(), (byte) 1, c14888zk.f50577ks[i53], 0L, c14888zk.f50572fa);
                                            }
                                            j6 = jM74539k418;
                                        } catch (RuntimeException e33) {
                                            e = e33;
                                            i7 = i24;
                                            i2 = i33;
                                            list3 = list11;
                                            iM52068kk = i7;
                                            b3 = b4;
                                            i36 = i6;
                                            i = 2;
                                            list4 = list12;
                                            r21 = r216;
                                            C3085sv.m13082k4(e);
                                        }
                                        try {
                                            list12.addItem(Byte.valueOf(b4));
                                            list11.addItem(Long.valueOf(j11));
                                            list11.addItem(Long.valueOf(m74539k4(m74551x1(), (byte) 2, j10, j6, 2L)));
                                            list12.addItem(Byte.valueOf(b18));
                                            long jM74539k429 = m74539k4(m74551x1(), (byte) 1, j11, 0L, j9);
                                            long jM74539k430 = m74539k4(m74551x1(), (byte) 1, j11, 0L, j9);
                                            list11.addItem(Long.valueOf(m74539k4(m74551x1(), (byte) 0, jM74539k429, 1L, 2L)));
                                            c14888zk = this;
                                            list11.addItem(Long.valueOf(c14888zk.m74539k4(m74551x1(), (byte) 0, jM74539k430, 1L, 2L)));
                                            list11.addItem(0L);
                                            list11.addItem(21600000L);
                                            list3 = list11;
                                            b3 = b4;
                                            iM52068kk = i25;
                                            i = 2;
                                            i2 = i33;
                                            list4 = list12;
                                            r213 = r216;
                                            i4 = i6;
                                            r21 = r213;
                                            i36 = i4;
                                        } catch (RuntimeException e34) {
                                            e = e34;
                                            c14888zk = this;
                                            list3 = list11;
                                            b3 = b4;
                                            iM52068kk = i25;
                                            i36 = i6;
                                            i = 2;
                                            i2 = i33;
                                            list4 = list12;
                                            r21 = r216;
                                            C3085sv.m13082k4(e);
                                        }
                                    } else {
                                        if ((c10735yn.m52068kk() & 255) % 4 != 0) {
                                            throw new Exception("Invalid data autoshape segment" + c10735yn);
                                        }
                                        int iM52068kk3 = c10735yn.m52068kk() & 255;
                                        while (iM52068kk3 > 0) {
                                            if (c14888zk.f50569ck == 0) {
                                                i13 = iM52068kk + 1;
                                                jM74539k47 = c14888zk.f50577ks[iM52068kk];
                                            } else {
                                                int i54 = iM52068kk + 1;
                                                jM74539k47 = c14888zk.m74539k4(c14888zk.m74551x1(), (byte) 1, c14888zk.f50577ks[iM52068kk], 0L, c14888zk.f50569ck);
                                                i13 = i54;
                                            }
                                            long j12 = jM74539k47;
                                            if (c14888zk.f50572fa == 0) {
                                                i14 = i13 + 1;
                                                try {
                                                    jM74539k48 = c14888zk.f50577ks[i13];
                                                } catch (RuntimeException e35) {
                                                    e = e35;
                                                    iM52068kk = i14;
                                                    i2 = i33;
                                                    list3 = list11;
                                                }
                                            } else {
                                                int i55 = i13 + 1;
                                                jM74539k48 = c14888zk.m74539k4(c14888zk.m74551x1(), (byte) 1, c14888zk.f50577ks[i13], 0L, c14888zk.f50572fa);
                                                i14 = i55;
                                            }
                                            long j13 = jM74539k48;
                                            if (c14888zk.f50569ck == 0) {
                                                i15 = i14 + 1;
                                                jM74539k49 = c14888zk.f50577ks[i14];
                                            } else {
                                                int i56 = i14 + 1;
                                                jM74539k49 = c14888zk.m74539k4(c14888zk.m74551x1(), (byte) 1, c14888zk.f50577ks[i14], 0L, c14888zk.f50569ck);
                                                i15 = i56;
                                            }
                                            long j14 = jM74539k49;
                                            if (c14888zk.f50572fa == 0) {
                                                i16 = i15 + 1;
                                                jM74539k410 = c14888zk.f50577ks[i15];
                                            } else {
                                                int i57 = i15 + 1;
                                                jM74539k410 = c14888zk.m74539k4(c14888zk.m74551x1(), (byte) 1, c14888zk.f50577ks[i15], 0L, c14888zk.f50572fa);
                                                i16 = i57;
                                            }
                                            long j15 = jM74539k410;
                                            if (c14888zk.f50569ck == 0) {
                                                i17 = i16 + 1;
                                                jM74539k411 = c14888zk.f50577ks[i16];
                                            } else {
                                                int i58 = i16 + 1;
                                                jM74539k411 = c14888zk.m74539k4(c14888zk.m74551x1(), (byte) 1, c14888zk.f50577ks[i16], 0L, c14888zk.f50569ck);
                                                i17 = i58;
                                            }
                                            long j16 = jM74539k411;
                                            if (c14888zk.f50572fa == 0) {
                                                i18 = i17 + 1;
                                                jM74539k412 = c14888zk.f50577ks[i17];
                                            } else {
                                                int i59 = i17 + 1;
                                                jM74539k412 = c14888zk.m74539k4(c14888zk.m74551x1(), (byte) 1, c14888zk.f50577ks[i17], 0L, c14888zk.f50572fa);
                                                i18 = i59;
                                            }
                                            long j17 = jM74539k412;
                                            if (c14888zk.f50569ck == 0) {
                                                i19 = i18 + 1;
                                                jM74539k413 = c14888zk.f50577ks[i18];
                                            } else {
                                                int i60 = i18 + 1;
                                                jM74539k413 = c14888zk.m74539k4(c14888zk.m74551x1(), (byte) 1, c14888zk.f50577ks[i18], 0L, c14888zk.f50569ck);
                                                i19 = i60;
                                            }
                                            long j18 = jM74539k413;
                                            if (c14888zk.f50572fa == 0) {
                                                int i61 = i19 + 1;
                                                jM74539k414 = c14888zk.f50577ks[i19];
                                                i20 = i61;
                                            } else {
                                                i20 = i19 + 1;
                                                jM74539k414 = c14888zk.m74539k4(c14888zk.m74551x1(), (byte) 1, c14888zk.f50577ks[i19], 0L, c14888zk.f50572fa);
                                            }
                                            long j19 = jM74539k414;
                                            if (b11 != 0) {
                                                try {
                                                    list12.addItem(Byte.valueOf(b4));
                                                    b11 = b2;
                                                } catch (RuntimeException e36) {
                                                    e = e36;
                                                    c14888zk = this;
                                                    i2 = i33;
                                                    list3 = list11;
                                                    iM52068kk = i20;
                                                    b3 = b4;
                                                    i36 = i6;
                                                    i = 2;
                                                    list4 = list12;
                                                    r21 = r216;
                                                    C3085sv.m13082k4(e);
                                                    list12 = list4;
                                                    i34 = i;
                                                    list11 = list3;
                                                    b9 = b3;
                                                    i33 = i2;
                                                    b8 = b2;
                                                    b7 = 3;
                                                    r216 = r21;
                                                }
                                            } else {
                                                list12.addItem((byte) 2);
                                            }
                                            list11.addItem(Long.valueOf(j16));
                                            list11.addItem(Long.valueOf(j17));
                                            list12.addItem(Byte.valueOf(b18));
                                            c14888zk = this;
                                            try {
                                                long jM74539k431 = c14888zk.m74539k4(m74551x1(), (byte) 1, j14, 0L, j12);
                                                long jM74539k432 = m74539k4(m74551x1(), (byte) 1, j15, 0L, j13);
                                                list11.addItem(Long.valueOf(m74539k4(m74551x1(), (byte) 0, jM74539k431, 1L, 2L)));
                                                list11.addItem(Long.valueOf(m74539k4(m74551x1(), (byte) 0, jM74539k432, 1L, 2L)));
                                                long jM74539k433 = m74539k4(m74551x1(), (byte) 2, j12, j14, 2L);
                                                long jM74539k434 = m74539k4(m74551x1(), (byte) 2, j13, j15, 2L);
                                                long jM74539k435 = m74539k4(m74551x1(), (byte) 1, j16, 0L, jM74539k433);
                                                long jM74539k436 = m74539k4(m74551x1(), (byte) 1, j17, 0L, jM74539k434);
                                                long jM74539k437 = m74539k4(m74551x1(), (byte) 1, j18, 0L, jM74539k433);
                                                long jM74539k438 = m74539k4(m74551x1(), (byte) 1, j19, 0L, jM74539k434);
                                                long jM74539k439 = m74539k4(m74551x1(), (byte) 5, jM74539k435, jM74539k436, 0L);
                                                long jM74539k440 = m74539k4(m74551x1(), (byte) 5, jM74539k437, jM74539k438, 0L);
                                                list11.addItem(Long.valueOf(jM74539k439));
                                                long jM74539k441 = m74539k4(m74551x1(), (byte) 1, jM74539k440, 0L, jM74539k439);
                                                if (jM74539k441 == 0) {
                                                    list11.addItem(Long.valueOf(jM74539k441));
                                                    c14888zk = this;
                                                    i21 = i47;
                                                } else {
                                                    i21 = i47;
                                                    if (c10735yn.m52080k4() == i21 || c10735yn.m52080k4() == i33) {
                                                        c14888zk = this;
                                                        list11.addItem(Long.valueOf(c14888zk.m74539k4(m74551x1(), (byte) 3, jM74539k441, jM74539k441, m74539k4(m74551x1(), (byte) 1, jM74539k441, 21600000L, 0L))));
                                                    } else {
                                                        list11.addItem(Long.valueOf(m74539k4(m74551x1(), (byte) 3, jM74539k441, m74539k4(m74551x1(), (byte) 1, jM74539k441, 0L, 21600000L), jM74539k441)));
                                                        c14888zk = this;
                                                    }
                                                }
                                                iM52068kk3 -= 4;
                                                i47 = i21;
                                                iM52068kk = i20;
                                            } catch (RuntimeException e37) {
                                                e = e37;
                                                i2 = i33;
                                                list3 = list11;
                                                iM52068kk = i20;
                                                b3 = b4;
                                                i36 = i6;
                                                i = 2;
                                                list4 = list12;
                                                r21 = r216;
                                                C3085sv.m13082k4(e);
                                                list12 = list4;
                                                i34 = i;
                                                list11 = list3;
                                                b9 = b3;
                                                i33 = i2;
                                                b8 = b2;
                                                b7 = 3;
                                                r216 = r21;
                                            }
                                            break;
                                        }
                                        i2 = i33;
                                        list3 = list11;
                                        b3 = b4;
                                        i = 2;
                                        list4 = list12;
                                        r213 = r216;
                                        i4 = i6;
                                        r21 = r213;
                                        i36 = i4;
                                    }
                                    b3 = b4;
                                    i36 = i6;
                                    i = 2;
                                    list4 = list12;
                                    r21 = r216;
                                    C3085sv.m13082k4(e);
                                    break;
                                case 7:
                                case 8:
                                default:
                                    try {
                                        if ((c10735yn.m52068kk() & 255) != 0) {
                                            if (b11 != 0) {
                                                list12.addItem(Byte.valueOf(b9));
                                                c14888zk.m74543k4(list11, c14888zk.f50577ks, iM52068kk, i34);
                                                iM52068kk += 2;
                                                b11 = b8;
                                            }
                                            i7 = iM52068kk;
                                            try {
                                                long[] jArr17 = c14888zk.f50577ks;
                                                long j20 = jArr17[i7 - 2];
                                                long j21 = jArr17[i7 - 1];
                                                long j22 = jArr17[i7];
                                                long j23 = jArr17[i7 + 1];
                                                byte b19 = b8;
                                                try {
                                                    b2 = b19;
                                                    i6 = i3;
                                                    b4 = b9;
                                                    try {
                                                        jM74539k4 = c14888zk.m74539k4(c14888zk.m74551x1(), (byte) 1, j22, 0L, j20);
                                                    } catch (RuntimeException e38) {
                                                        e = e38;
                                                    }
                                                } catch (RuntimeException e39) {
                                                    e = e39;
                                                    b4 = b9;
                                                    b2 = b19;
                                                    i6 = i3;
                                                    i2 = i33;
                                                    list3 = list11;
                                                    iM52068kk = i7;
                                                    b3 = b4;
                                                    i36 = i6;
                                                    i = 2;
                                                    list4 = list12;
                                                    r21 = r216;
                                                    C3085sv.m13082k4(e);
                                                    list12 = list4;
                                                    i34 = i;
                                                    list11 = list3;
                                                    b9 = b3;
                                                    i33 = i2;
                                                    b8 = b2;
                                                    b7 = 3;
                                                    r216 = r21;
                                                    break;
                                                }
                                                try {
                                                    long jM74539k442 = m74539k4(m74551x1(), (byte) 1, j23, 0L, j21);
                                                    long j24 = c10735yn.m52080k4() != 7 ? 1L : -1L;
                                                    c14888zk = this;
                                                    try {
                                                        c14888zk = this;
                                                        long jM74539k443 = c14888zk.m74539k4(m74551x1(), (byte) 3, c14888zk.m74539k4(m74551x1(), (byte) 0, jM74539k4, jM74539k442, 1L), j24, -j24);
                                                        int iM52068kk4 = c10735yn.m52068kk() & 255;
                                                        while (true) {
                                                            int i62 = iM52068kk4 - 1;
                                                            if (iM52068kk4 > 0) {
                                                                long[] jArr18 = c14888zk.f50577ks;
                                                                int i63 = i7 + 1;
                                                                try {
                                                                    j = jArr18[i7];
                                                                    i7 += 2;
                                                                    j2 = jArr18[i63];
                                                                    jM74539k42 = c14888zk.m74539k4(c14888zk.m74551x1(), (byte) 1, j, 0L, j20);
                                                                } catch (RuntimeException e40) {
                                                                    e = e40;
                                                                    iM52068kk = i63;
                                                                    i2 = i33;
                                                                    list3 = list11;
                                                                    b3 = b4;
                                                                    i36 = i6;
                                                                    i = 2;
                                                                    list4 = list12;
                                                                    r21 = r216;
                                                                    C3085sv.m13082k4(e);
                                                                    list12 = list4;
                                                                    i34 = i;
                                                                    list11 = list3;
                                                                    b9 = b3;
                                                                    i33 = i2;
                                                                    b8 = b2;
                                                                    b7 = 3;
                                                                    r216 = r21;
                                                                }
                                                                try {
                                                                    long jM74539k444 = m74539k4(m74551x1(), (byte) 1, j2, 0L, j21);
                                                                    long j25 = jM74539k443;
                                                                    long jM74539k445 = m74539k4(m74551x1(), (byte) 0, jM74539k42, jM74539k444, j25);
                                                                    long jM74539k446 = m74539k4(m74551x1(), (byte) 0, jM74539k42, 1L, 2L);
                                                                    long jM74539k447 = m74539k4(m74551x1(), (byte) 0, jM74539k444, 1L, 2L);
                                                                    list12.addItem((byte) 5);
                                                                    list11.addItem(Long.valueOf(m74539k4(m74551x1(), (byte) 3, jM74539k445, j20, m74539k4(m74551x1(), (byte) 1, j20, jM74539k446, 0L))));
                                                                    long j26 = j21;
                                                                    list11.addItem(Long.valueOf(m74539k4(m74551x1(), (byte) 3, jM74539k445, m74539k4(m74551x1(), (byte) 1, j26, jM74539k447, 0L), j26)));
                                                                    list11.addItem(Long.valueOf(m74539k4(m74551x1(), (byte) 3, jM74539k445, m74539k4(m74551x1(), (byte) 1, j, 0L, jM74539k446), j)));
                                                                    c14888zk = this;
                                                                    list11.addItem(Long.valueOf(c14888zk.m74539k4(m74551x1(), (byte) 3, jM74539k445, j2, m74539k4(m74551x1(), (byte) 1, j2, 0L, jM74539k447))));
                                                                    list11.addItem(Long.valueOf(j));
                                                                    list11.addItem(Long.valueOf(j2));
                                                                    j21 = j26;
                                                                    iM52068kk4 = i62;
                                                                    jM74539k443 = j25;
                                                                } catch (RuntimeException e41) {
                                                                    e = e41;
                                                                    c14888zk = this;
                                                                    i2 = i33;
                                                                    list3 = list11;
                                                                    iM52068kk = i7;
                                                                    b3 = b4;
                                                                    i36 = i6;
                                                                    i = 2;
                                                                    list4 = list12;
                                                                    r21 = r216;
                                                                    C3085sv.m13082k4(e);
                                                                    list12 = list4;
                                                                    i34 = i;
                                                                    list11 = list3;
                                                                    b9 = b3;
                                                                    i33 = i2;
                                                                    b8 = b2;
                                                                    b7 = 3;
                                                                    r216 = r21;
                                                                }
                                                            } else {
                                                                i2 = i33;
                                                                list3 = list11;
                                                                iM52068kk = i7;
                                                                b3 = b4;
                                                                i = 2;
                                                                list4 = list12;
                                                                r213 = r216;
                                                                i4 = i6;
                                                                r21 = r213;
                                                                i36 = i4;
                                                            }
                                                        }
                                                    } catch (RuntimeException e42) {
                                                        e = e42;
                                                    }
                                                } catch (RuntimeException e43) {
                                                    e = e43;
                                                    c14888zk = this;
                                                    i2 = i33;
                                                    list3 = list11;
                                                    iM52068kk = i7;
                                                    b3 = b4;
                                                    i36 = i6;
                                                    i = 2;
                                                    list4 = list12;
                                                    r21 = r216;
                                                    C3085sv.m13082k4(e);
                                                    list12 = list4;
                                                    i34 = i;
                                                    list11 = list3;
                                                    b9 = b3;
                                                    i33 = i2;
                                                    b8 = b2;
                                                    b7 = 3;
                                                    r216 = r21;
                                                }
                                            } catch (RuntimeException e44) {
                                                e = e44;
                                                b2 = b8;
                                                b4 = b9;
                                            }
                                        }
                                    } catch (RuntimeException e45) {
                                        e = e45;
                                        b2 = b8;
                                        b4 = b9;
                                        i6 = i3;
                                    }
                                    break;
                                case 9:
                                    b2 = b8;
                                    b4 = b9;
                                    i6 = i3;
                                    try {
                                        if ((c10735yn.m52068kk() & 255) != 0) {
                                            int iM52068kk5 = c10735yn.m52068kk() & 255;
                                            while (true) {
                                                int i64 = iM52068kk5 - 1;
                                                if (iM52068kk5 > 0) {
                                                    if (c14888zk.f50569ck == 0) {
                                                        i27 = iM52068kk + 1;
                                                        jM74539k419 = c14888zk.f50577ks[iM52068kk];
                                                    } else {
                                                        int i65 = iM52068kk + 1;
                                                        try {
                                                            jM74539k419 = c14888zk.m74539k4(c14888zk.m74551x1(), (byte) 1, c14888zk.f50577ks[iM52068kk], 0L, c14888zk.f50569ck);
                                                            i27 = i65;
                                                        } catch (RuntimeException e46) {
                                                            e = e46;
                                                            i2 = i33;
                                                            iM52068kk = i65;
                                                            b3 = b4;
                                                            i36 = i6;
                                                            i = 2;
                                                            list4 = list12;
                                                            list3 = list11;
                                                            r21 = r216;
                                                        }
                                                    }
                                                    long j27 = jM74539k419;
                                                    try {
                                                        if (c14888zk.f50572fa != 0) {
                                                            int i66 = i27;
                                                            int i67 = i66 + 1;
                                                            try {
                                                                jM74539k420 = c14888zk.m74539k4(c14888zk.m74551x1(), (byte) 1, c14888zk.f50577ks[i66], 0L, c14888zk.f50572fa);
                                                                i28 = i67;
                                                            } catch (RuntimeException e47) {
                                                                e = e47;
                                                                i2 = i33;
                                                                list3 = list11;
                                                                iM52068kk = i67;
                                                            }
                                                        } else {
                                                            i28 = i27 + 1;
                                                            try {
                                                                jM74539k420 = c14888zk.f50577ks[i27];
                                                            } catch (RuntimeException e48) {
                                                                e = e48;
                                                                iM52068kk = i28;
                                                                i2 = i33;
                                                                list3 = list11;
                                                            }
                                                        }
                                                        long j28 = jM74539k420;
                                                        if (c14888zk.f50569ck != 0) {
                                                            int i68 = i28 + 1;
                                                            try {
                                                                jM74539k421 = c14888zk.m74539k4(c14888zk.m74551x1(), (byte) 1, c14888zk.f50577ks[i28], 0L, c14888zk.f50569ck);
                                                                i29 = i68;
                                                            } catch (RuntimeException e49) {
                                                                e = e49;
                                                                i2 = i33;
                                                                list3 = list11;
                                                                iM52068kk = i68;
                                                            }
                                                        } else {
                                                            i29 = i28 + 1;
                                                            jM74539k421 = c14888zk.f50577ks[i28];
                                                        }
                                                        long j29 = jM74539k421;
                                                        if (c14888zk.f50572fa != 0) {
                                                            int i69 = i29;
                                                            i25 = i69 + 1;
                                                            try {
                                                                jM74539k422 = c14888zk.m74539k4(c14888zk.m74551x1(), (byte) 1, c14888zk.f50577ks[i69], 0L, c14888zk.f50572fa);
                                                                iM52068kk = i25;
                                                            } catch (RuntimeException e50) {
                                                                e = e50;
                                                                list3 = list11;
                                                                b3 = b4;
                                                                iM52068kk = i25;
                                                                i36 = i6;
                                                                i = 2;
                                                                i2 = i33;
                                                                list4 = list12;
                                                                r21 = r216;
                                                                C3085sv.m13082k4(e);
                                                                list12 = list4;
                                                                i34 = i;
                                                                list11 = list3;
                                                                b9 = b3;
                                                                i33 = i2;
                                                                b8 = b2;
                                                                b7 = 3;
                                                                r216 = r21;
                                                            }
                                                        } else {
                                                            int i70 = i29 + 1;
                                                            jM74539k422 = c14888zk.f50577ks[i29];
                                                            iM52068kk = i70;
                                                        }
                                                        list12.addItem((byte) 4);
                                                        list11.addItem(Long.valueOf(j27));
                                                        list11.addItem(Long.valueOf(j28));
                                                        list11.addItem(Long.valueOf(j29));
                                                        list11.addItem(Long.valueOf(jM74539k422));
                                                        iM52068kk5 = i64;
                                                    } catch (RuntimeException e51) {
                                                        e = e51;
                                                        i28 = i27;
                                                    }
                                                } else {
                                                    i2 = i33;
                                                    list3 = list11;
                                                    b3 = b4;
                                                    i = 2;
                                                    list4 = list12;
                                                    r213 = r216;
                                                    i4 = i6;
                                                    r21 = r213;
                                                    i36 = i4;
                                                }
                                            }
                                        }
                                        i2 = i33;
                                        list3 = list11;
                                        b5 = b4;
                                        i = 2;
                                        i26 = iM52068kk;
                                        list4 = list12;
                                        i4 = i6;
                                        b3 = b5;
                                        iM52068kk = i26;
                                        r21 = r216;
                                        i36 = i4;
                                    } catch (RuntimeException e52) {
                                        e = e52;
                                    }
                                    break;
                                case 10:
                                    b2 = b8;
                                    i = i34;
                                    b3 = b9;
                                    i2 = i33;
                                    list3 = list11;
                                    b10 = b2;
                                    r212 = r216;
                                    list4 = list12;
                                    i4 = i3;
                                    r21 = r212;
                                    i36 = i4;
                                    break;
                                case 11:
                                    b2 = b8;
                                    i = i34;
                                    b3 = b9;
                                    i2 = i33;
                                    list3 = list11;
                                    r212 = b2;
                                    list4 = list12;
                                    i4 = i3;
                                    r21 = r212;
                                    i36 = i4;
                                    break;
                            }
                        default:
                            b2 = b8;
                            i = i34;
                            b5 = b9;
                            i2 = i33;
                            list3 = list11;
                            i26 = iM52068kk;
                            list4 = list12;
                            i4 = i3;
                            b3 = b5;
                            iM52068kk = i26;
                            r21 = r216;
                            i36 = i4;
                            break;
                    }
                } else {
                    switch (c10731ygM52067k4.m52069to()) {
                    }
                }
                list12 = list4;
                i34 = i;
                list11 = list3;
                b9 = b3;
                i33 = i2;
                b8 = b2;
                b7 = 3;
                r216 = r21;
            }
            b = b8;
            list = list12;
            list2 = list11;
            size = size2;
            r215 = r216;
        }
        if (size < list2.size()) {
            list10.addItem(new f7k(C3085sv.m13110x1(list), list2, 0, list2.size(), c14888zk.f50582up, c14888zk.f50585yj, b10, r215, true));
        }
        c14888zk.m74546k4().m3320k4((f7k[]) list10.toArray(new f7k[b]));
    }

    /* JADX INFO: renamed from: to */
    private void m74545to() {
        m74546k4().m3317k4(0);
        m74532du();
        m74534h4();
        m74544m9();
        m74533dy();
        m74546k4().m3319k4(m74551x1().toArray(new C0899df[0]));
        m74530c5();
        m74535jd();
        m74531ck();
    }

    /* JADX INFO: renamed from: kk */
    public final byte[] m74550kk() {
        return this.f50579ne;
    }

    /* JADX INFO: renamed from: x1 */
    public final List<C0899df> m74551x1() {
        return this.f50584x6;
    }

    /* JADX INFO: renamed from: k4 */
    private long m74537k4(int i) {
        return i < -2147479552 ? (-27273042329612L) - ((long) (i & Integer.MAX_VALUE)) : i;
    }

    /* JADX INFO: renamed from: k4 */
    private long m74538k4(int i, int[] iArr) {
        long j;
        long j2;
        if (i >= 1024 && i <= 1151) {
            j = i - 1024;
            j2 = -27273042329612L;
        } else {
            if (i >= 327 && i <= 334) {
                int i2 = i - StyleIdentifier.LIST_TABLE_6_COLORFUL;
                if (i2 > iArr[0]) {
                    iArr[0] = i2;
                }
                return ((long) i2) + 27273042316901L;
            }
            if (i < 320 || i > 323) {
                return i;
            }
            j = i - 313;
            j2 = -27273042329601L;
        }
        return j2 - j;
    }

    /* JADX INFO: renamed from: k4 */
    private long m74539k4(List<C0899df> list, byte b, long j, long j2, long j3) {
        return C13760l2.m64251k4(list, b, j, j2, j3);
    }

    /* JADX INFO: renamed from: k4 */
    private long m74540k4(List<C0899df> list, long j, long j2, long j3) {
        long j4;
        if (j < -27273042329611L || j > -27273042329608L) {
            j4 = j;
        } else {
            if (j == -27273042329608L || j == -27273042329609L) {
                j = 0;
            } else if (j == -27273042329610L) {
                j4 = j2;
            } else if (j == -27273042329611L) {
                j4 = j3;
            }
            j4 = j;
        }
        return j4 > 27273042316900L ? m74539k4(list, (byte) 0, j4, 21600L, 100000L) : j4;
    }

    /* JADX INFO: renamed from: k4 */
    private long m74541k4(int[] iArr, long j) {
        return j < -27273042329600L ? (-27273042329601L) - ((long) iArr[(int) ((-27273042329601L) - j)]) : j;
    }

    /* JADX INFO: renamed from: k4 */
    public final C0735a7 m74546k4() {
        return this.f50580rv;
    }

    /* JADX INFO: renamed from: k4 */
    private void m74542k4(byte b, List<Byte> list, List<Long> list2, long[] jArr, int i, int i2, int i3, boolean z) {
        for (int i4 = 0; i4 < i; i4++) {
            list.addItem(Byte.valueOf(b));
            if (this.f50569ck != 0 || this.f50572fa != 0) {
                int i5 = 0;
                while (i5 < i3) {
                    int i6 = (i3 * i4) + i2;
                    int i7 = i6 + i5;
                    int i8 = i5;
                    jArr[i7] = m74539k4(m74551x1(), (byte) 1, jArr[i7], 0L, this.f50569ck);
                    int i9 = i6 + 1 + i8;
                    jArr[i9] = m74539k4(m74551x1(), (byte) 1, jArr[i9], 0L, this.f50572fa);
                    i5 = i8 + 2;
                }
            }
        }
        m74543k4(list2, jArr, i2, i * i3);
        if (z) {
            list.addItem((byte) 0);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74547k4(List<C0899df> list) {
        this.f50584x6 = list;
    }

    /* JADX INFO: renamed from: k4 */
    private void m74543k4(List<Long> list, long[] jArr, int i, int i2) {
        int i3 = i2 + i;
        while (i < i3) {
            list.addItem(Long.valueOf(jArr[i]));
            i++;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74548k4(C0735a7 c0735a7) {
        this.f50580rv = c0735a7;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m74549k4(byte[] bArr) {
        this.f50579ne = bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C14888zk(C0735a7 c0735a7, C10462h9 c10462h9) {
        int iMo50543du;
        m74548k4(c0735a7);
        C10534m3 c10534m3Mo50859du = c10462h9.mo50859du();
        this.f50575k4 = 21600;
        this.f50583x1 = 21600;
        C10609qn c10609qn = (C10609qn) C22223Oooo0o.OooO0O0(c10534m3Mo50859du, StyleIdentifier.LIST_TABLE_1_LIGHT, C10609qn.class);
        if (c10609qn != null) {
            this.f50575k4 = (int) c10609qn.m51597ar();
        }
        C10609qn c10609qn2 = (C10609qn) C22223Oooo0o.OooO0O0(c10534m3Mo50859du, StyleIdentifier.LIST_TABLE_2, C10609qn.class);
        if (c10609qn2 != null) {
            this.f50583x1 = (int) c10609qn2.m51597ar();
        }
        C10609qn c10609qn3 = (C10609qn) C22223Oooo0o.OooO0O0(c10534m3Mo50859du, StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_6, C10609qn.class);
        int iM51597ar = c10609qn3 != null ? (int) c10609qn3.m51597ar() : 0;
        C10609qn c10609qn4 = (C10609qn) C22223Oooo0o.OooO0O0(c10534m3Mo50859du, StyleIdentifier.GRID_TABLE_7_COLORFUL_ACCENT_6, C10609qn.class);
        int iM51597ar2 = c10609qn4 != null ? (int) c10609qn4.m51597ar() : 0;
        C10609qn c10609qn5 = (C10609qn) C22223Oooo0o.OooO0O0(c10534m3Mo50859du, StyleIdentifier.LIST_TABLE_4_ACCENT_2, C10609qn.class);
        if (c10609qn5 != null) {
            this.f50576kk = (int) c10609qn5.m51597ar();
        } else {
            this.f50576kk = -1;
        }
        C10609qn c10609qn6 = (C10609qn) C22223Oooo0o.OooO0O0(c10534m3Mo50859du, StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_2, C10609qn.class);
        if (c10609qn6 != null) {
            this.f50581to = (int) c10609qn6.m51597ar();
        } else {
            this.f50581to = -1;
        }
        this.f50569ck = iM51597ar != 0 ? m74537k4(iM51597ar) : 0L;
        this.f50572fa = iM51597ar2 != 0 ? m74537k4(iM51597ar2) : 0L;
        this.f50582up = m74537k4(this.f50575k4) - this.f50569ck;
        long jM74537k4 = m74537k4(this.f50583x1) - this.f50572fa;
        this.f50585yj = jM74537k4;
        if (this.f50576kk > -1 && this.f50581to > -1) {
            long jMo50549to = this.f50582up;
            if (jMo50549to == jM74537k4) {
                if (c10462h9.mo50858c5() != null) {
                    jMo50549to = c10462h9.mo50858c5().mo50549to();
                    iMo50543du = c10462h9.mo50858c5().mo50543du();
                } else {
                    if (c10462h9.mo50860dy() != null) {
                        jMo50549to = c10462h9.mo50860dy().mo50549to();
                        iMo50543du = c10462h9.mo50860dy().mo50543du();
                    }
                    if (jMo50549to >= jM74537k4) {
                        this.f50585yj = (this.f50582up * jM74537k4) / jMo50549to;
                    } else {
                        this.f50582up = (this.f50585yj * jMo50549to) / jM74537k4;
                    }
                }
                jM74537k4 = iMo50543du;
                if (jMo50549to >= jM74537k4) {
                }
            }
        }
        this.f50570du = 4;
        C10609qn c10609qn7 = (C10609qn) C22223Oooo0o.OooO0O0(c10534m3Mo50859du, StyleIdentifier.LIST_TABLE_3, C10609qn.class);
        if (c10609qn7 != null) {
            this.f50570du = (int) c10609qn7.m51597ar();
        }
        this.f50573h4 = (C10749ze) C22223Oooo0o.OooO0O0(c10534m3Mo50859du, StyleIdentifier.LIST_TABLE_4, C10749ze.class);
        this.f50578m9 = (C10749ze) C22223Oooo0o.OooO0O0(c10534m3Mo50859du, StyleIdentifier.LIST_TABLE_5_DARK, C10749ze.class);
        this.f50571dy = (C10749ze) C22223Oooo0o.OooO0O0(c10534m3Mo50859du, StyleIdentifier.LIST_TABLE_7_COLORFUL_ACCENT_2, C10749ze.class);
        this.f50568c5 = (C10749ze) C22223Oooo0o.OooO0O0(c10534m3Mo50859du, StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_3, C10749ze.class);
        this.f50574jd = (C10749ze) C22223Oooo0o.OooO0O0(c10534m3Mo50859du, StyleIdentifier.LIST_TABLE_2_ACCENT_2, C10749ze.class);
        m74545to();
    }
}
