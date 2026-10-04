package com.aspose.slides.internal.p397sd;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3123ar;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p116ev.AbstractC3803to;
import com.aspose.slides.internal.p116ev.C3798dy;
import com.aspose.slides.internal.p116ev.C3799h4;
import com.aspose.slides.internal.p116ev.C3800k4;
import com.aspose.slides.internal.p116ev.C3802m9;
import com.aspose.slides.internal.p284mx.C6618k4;
import com.aspose.slides.internal.p284mx.C6619kk;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p558zz.C13641m9;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.words.StyleIdentifier;
import com.google.android.material.internal.ViewUtils;

/* JADX INFO: renamed from: com.aspose.slides.internal.sd.du */
/* JADX INFO: loaded from: classes4.dex */
public class C10216du {

    /* JADX INFO: renamed from: k4 */
    private final boolean f36602k4;

    /* JADX INFO: renamed from: kk */
    private final C3123ar f36603kk;

    /* JADX INFO: renamed from: to */
    private final C3123ar f36604to;

    /* JADX INFO: renamed from: x1 */
    private final C3123ar f36605x1;

    public C10216du() {
        this(true);
    }

    /* JADX INFO: renamed from: k4 */
    private void m50020k4(int i) {
        this.f36605x1.m13301k4().writeByte((byte) (i >> 8));
        this.f36605x1.m13301k4().writeByte((byte) (i & 255));
    }

    /* JADX INFO: renamed from: kk */
    private void m50027kk(AbstractC3803to abstractC3803to) {
        int i;
        int iM63005kk;
        int iMo15174du = abstractC3803to.mo15174du();
        C13641m9 c13641m9Mo15175h4 = abstractC3803to.mo15175h4();
        List list = new List();
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= iMo15174du) {
                break;
            }
            int iM63005kk2 = c13641m9Mo15175h4.m63005kk(i2);
            if (iM63005kk2 == 64 || iM63005kk2 == 65) {
                i = (iM63005kk2 & 1) + 1;
                iM63005kk = c13641m9Mo15175h4.m63005kk(i3);
                i3 = i2 + 2;
            } else {
                if (iM63005kk2 < 176 || iM63005kk2 >= 192) {
                    break;
                }
                iM63005kk = (iM63005kk2 & 7) + 1;
                i = ((iM63005kk2 & 8) >> 3) + 1;
            }
            if ((i * iM63005kk) + i2 > iMo15174du) {
                break;
            }
            i2 = i3;
            for (int i4 = 0; i4 < iM63005kk; i4++) {
                list.addItem(Integer.valueOf(i == 1 ? c13641m9Mo15175h4.m63005kk(i2) : c13641m9Mo15175h4.m62999h4(i2)));
                i2 += i;
            }
        }
        int i5 = iMo15174du - i2;
        m50021k4(this.f36605x1, list.size());
        m50021k4(this.f36605x1, i5);
        m50022k4(this.f36603kk, (List<Integer>) list);
        if (i5 > 0) {
            ((C13641m9) c13641m9Mo15175h4.mo62971x1(i2)).m63002k4(this.f36604to);
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static void m50028x1(C3123ar c3123ar, int i) {
        AbstractC3150x6 abstractC3150x6M13301k4;
        AbstractC3150x6 abstractC3150x6M13301k42;
        byte b;
        int i2 = (short) i;
        if (i2 >= 750 || i2 <= -750) {
            c3123ar.m13301k4().writeByte((byte) -3);
            c3123ar.m13301k4().writeByte((byte) (i2 >> 8));
            abstractC3150x6M13301k4 = c3123ar.m13301k4();
            i2 &= 255;
        } else {
            if (i2 < 0) {
                c3123ar.m13301k4().writeByte((byte) -6);
                i2 = (short) (-i2);
            }
            if (i2 >= 250) {
                i2 = (short) (i2 - 250);
                if (i2 >= 250) {
                    i2 = (short) (i2 - 250);
                    abstractC3150x6M13301k42 = c3123ar.m13301k4();
                    b = -2;
                } else {
                    abstractC3150x6M13301k42 = c3123ar.m13301k4();
                    b = -1;
                }
                abstractC3150x6M13301k42.writeByte(b);
            }
            abstractC3150x6M13301k4 = c3123ar.m13301k4();
        }
        abstractC3150x6M13301k4.writeByte((byte) i2);
    }

    public C10216du(boolean z) {
        this.f36602k4 = z;
        C3123ar c3123ar = new C3123ar(new C3152yj());
        this.f36605x1 = c3123ar;
        c3123ar.m13305k4(true);
        C3123ar c3123ar2 = new C3123ar(new C3152yj());
        this.f36603kk = c3123ar2;
        c3123ar2.m13305k4(true);
        C3123ar c3123ar3 = new C3123ar(new C3152yj());
        this.f36604to = c3123ar3;
        c3123ar3.m13305k4(true);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m50021k4(C3123ar c3123ar, int i) {
        AbstractC3150x6 abstractC3150x6M13301k4;
        if (i < 0) {
            throw new InvalidOperationException();
        }
        if (i < 253) {
            abstractC3150x6M13301k4 = c3123ar.m13301k4();
        } else if (i < 506) {
            c3123ar.m13301k4().writeByte((byte) -1);
            abstractC3150x6M13301k4 = c3123ar.m13301k4();
            i -= StyleIdentifier.MEDIUM_GRID_1_ACCENT_6;
        } else if (i < 762) {
            c3123ar.m13301k4().writeByte((byte) -2);
            abstractC3150x6M13301k4 = c3123ar.m13301k4();
            i -= 506;
        } else {
            c3123ar.m13301k4().writeByte((byte) -3);
            c3123ar.m13301k4().writeByte((byte) (i >> 8));
            abstractC3150x6M13301k4 = c3123ar.m13301k4();
            i &= 255;
        }
        abstractC3150x6M13301k4.writeByte((byte) i);
    }

    /* JADX INFO: renamed from: x1 */
    private void m50029x1(AbstractC3803to abstractC3803to) {
        if (this.f36602k4) {
            m50027kk(abstractC3803to);
            return;
        }
        int iMo15174du = abstractC3803to.mo15174du();
        m50021k4(this.f36605x1, 0);
        m50021k4(this.f36605x1, iMo15174du);
        if (iMo15174du > 0) {
            abstractC3803to.mo15175h4().m63002k4(this.f36604to);
        }
    }

    /* JADX INFO: renamed from: kk */
    public final byte[] m50032kk() {
        return ((C3152yj) this.f36604to.m13301k4()).toArray();
    }

    /* JADX INFO: renamed from: k4 */
    private static void m50022k4(C3123ar c3123ar, List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            if ((i2 & 1) == 0) {
                int iIntValue = list.get_Item(i3).intValue();
                if (i2 == 0 && i3 >= 2 && (i = i3 + 2) < size && iIntValue == list.get_Item(i3 - 2).intValue() && iIntValue == list.get_Item(i).intValue()) {
                    int i4 = i3 + 4;
                    if (i4 >= size || iIntValue != list.get_Item(i4).intValue()) {
                        c3123ar.m13301k4().writeByte((byte) -5);
                        i2 = 4;
                    } else {
                        c3123ar.m13301k4().writeByte((byte) -4);
                        i2 = 20;
                    }
                } else {
                    m50028x1(c3123ar, list.get_Item(i3).intValue());
                }
            }
            i2 >>= 1;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final byte[] m50033x1() {
        return ((C3152yj) this.f36603kk.m13301k4()).toArray();
    }

    /* JADX INFO: renamed from: k4 */
    private void m50023k4(C3123ar c3123ar, boolean z, int i, int i2) {
        AbstractC3150x6 abstractC3150x6M13301k4;
        int i3;
        AbstractC3150x6 abstractC3150x6M13301k42;
        int i4;
        int iM67482k4 = C14116yg.m67482k4(i);
        int iM67482k42 = C14116yg.m67482k4(i2);
        int i5 = z ? 0 : 128;
        int i6 = i < 0 ? 0 : 1;
        int i7 = i2 >= 0 ? 1 : 0;
        int i8 = (i7 * 2) + i6;
        if (i != 0 || iM67482k42 >= 1280) {
            if (i2 == 0 && iM67482k4 < 1280) {
                this.f36605x1.m13301k4().writeByte((byte) (i5 + 10 + ((iM67482k4 & 3840) >> 7) + i6));
                abstractC3150x6M13301k42 = c3123ar.m13301k4();
                i4 = iM67482k4 & 255;
            } else if (iM67482k4 >= 65 || iM67482k42 >= 65) {
                if (iM67482k4 < 769 && iM67482k42 < 769) {
                    int i9 = iM67482k4 - 1;
                    iM67482k42--;
                    this.f36605x1.m13301k4().writeByte((byte) ((((i9 & ViewUtils.EDGE_TO_EDGE_FLAGS) >> 8) * 12) + i5 + 84 + ((iM67482k42 & ViewUtils.EDGE_TO_EDGE_FLAGS) >> 6) + i8));
                    abstractC3150x6M13301k4 = c3123ar.m13301k4();
                    i3 = i9 & 255;
                } else if (iM67482k4 >= 4096 || iM67482k42 >= 4096) {
                    this.f36605x1.m13301k4().writeByte((byte) (i5 + 124 + i8));
                    c3123ar.m13301k4().writeByte((byte) (iM67482k4 >> 8));
                    c3123ar.m13301k4().writeByte((byte) (iM67482k4 & 255));
                    abstractC3150x6M13301k4 = c3123ar.m13301k4();
                    i3 = iM67482k42 >> 8;
                } else {
                    this.f36605x1.m13301k4().writeByte((byte) (i5 + 120 + i8));
                    c3123ar.m13301k4().writeByte((byte) (iM67482k4 >> 4));
                    abstractC3150x6M13301k4 = c3123ar.m13301k4();
                    i3 = ((iM67482k4 & 15) << 4) | (iM67482k42 >> 8);
                }
                abstractC3150x6M13301k4.writeByte((byte) i3);
            } else {
                int i10 = iM67482k4 - 1;
                int i11 = iM67482k42 - 1;
                this.f36605x1.m13301k4().writeByte((byte) (i5 + 20 + (i10 & 48) + ((i11 & 48) >> 2) + i8));
                abstractC3150x6M13301k42 = c3123ar.m13301k4();
                i4 = ((i10 & 15) << 4) | (i11 & 15);
            }
            abstractC3150x6M13301k42.writeByte((byte) i4);
        }
        this.f36605x1.m13301k4().writeByte((byte) (i5 + ((iM67482k42 & 3840) >> 7) + i7));
        abstractC3150x6M13301k42 = c3123ar.m13301k4();
        i4 = iM67482k42 & 255;
        abstractC3150x6M13301k42.writeByte((byte) i4);
    }

    /* JADX INFO: renamed from: k4 */
    private void m50024k4(C3798dy c3798dy) {
        int iM15211m9 = c3798dy.m15211m9();
        m50020k4(iM15211m9);
        int i = 0;
        while (true) {
            int i2 = 1;
            if (i >= iM15211m9) {
                break;
            }
            C3123ar c3123ar = this.f36605x1;
            int iM15177kk = c3798dy.m15177kk(i);
            if (i != 0) {
                i2 = 0;
            }
            m50021k4(c3123ar, iM15177kk - i2);
            i++;
        }
        C3123ar c3123ar2 = new C3123ar(new C3152yj());
        c3123ar2.m13305k4(true);
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < iM15211m9; i5++) {
            int iM15177kk2 = c3798dy.m15177kk(i5);
            int i6 = 0;
            while (i6 < iM15177kk2) {
                int iM15176k4 = c3798dy.m15176k4(i5, i6);
                int iM15181x1 = c3798dy.m15181x1(i5, i6);
                m50023k4(c3123ar2, c3798dy.m15179kk(i5, i6), iM15176k4 - i3, iM15181x1 - i4);
                i6++;
                i3 = iM15176k4;
                i4 = iM15181x1;
            }
        }
        byte[] array = ((C3152yj) c3123ar2.m13301k4()).toArray();
        this.f36605x1.m13301k4().write(array, 0, array.length);
        if (iM15211m9 > 0) {
            m50029x1(c3798dy);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m50025k4(C3800k4 c3800k4) {
        m50020k4(-1);
        m50020k4(c3800k4.m15209dy());
        m50020k4(c3800k4.m15210jd());
        m50020k4(c3800k4.m15207c5());
        m50020k4(c3800k4.m15208ck());
        int i = 0;
        boolean z = false;
        while (i < c3800k4.m15188to()) {
            int iM15190x1 = c3800k4.m15190x1(i);
            m50020k4(iM15190x1);
            boolean z2 = (iM15190x1 & 256) != 0;
            m50020k4(c3800k4.m15186kk(i));
            if ((iM15190x1 & 1) == 0) {
                this.f36605x1.m13301k4().writeByte((byte) c3800k4.m15189to(i));
                this.f36605x1.m13301k4().writeByte((byte) c3800k4.m15184du(i));
            } else {
                m50020k4(c3800k4.m15189to(i));
                m50020k4(c3800k4.m15184du(i));
            }
            if (c3800k4.m15185h4(i) != 0) {
                try {
                    byte[] bArrM15187m9 = c3800k4.m15187m9(i);
                    this.f36605x1.m13301k4().write(bArrM15187m9, 0, bArrM15187m9.length);
                } catch (IOException unused) {
                }
            }
            i++;
            z = z2;
        }
        if (z) {
            m50029x1(c3800k4);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m50026k4(AbstractC3803to abstractC3803to) {
        if (abstractC3803to != null) {
            try {
                if (abstractC3803to.m26240x1() != 0) {
                    if (C7019kk.m27469x1(abstractC3803to, C3798dy.class)) {
                        m50024k4((C3798dy) abstractC3803to);
                        return;
                    } else {
                        if (C7019kk.m27469x1(abstractC3803to, C3800k4.class)) {
                            m50025k4((C3800k4) abstractC3803to);
                            return;
                        }
                        return;
                    }
                }
            } catch (IOException e) {
                throw new Exception("unexpected IOException writing glyph data", e);
            }
        }
        m50020k4(0);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50030k4(C6618k4 c6618k4) {
        C3802m9 c3802m9 = (C3802m9) c6618k4.m26396x1(C6619kk.f18346up);
        int iM15195du = c3802m9.m15195du();
        C3799h4 c3799h4 = (C3799h4) c6618k4.m26396x1(C6619kk.f18322fa);
        for (int i = 0; i < iM15195du; i++) {
            m50026k4(c3799h4.m15182k4(c3802m9.m15197k4(i), c3802m9.m15199x1(i)));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final byte[] m50031k4() {
        return ((C3152yj) this.f36605x1.m13301k4()).toArray();
    }
}
