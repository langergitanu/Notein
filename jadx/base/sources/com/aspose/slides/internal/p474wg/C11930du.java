package com.aspose.slides.internal.p474wg;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.internal.p080dd.C3144um;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14058fa;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.wg.du */
/* JADX INFO: loaded from: classes5.dex */
class C11930du {

    /* JADX INFO: renamed from: c5 */
    private int f40195c5;

    /* JADX INFO: renamed from: du */
    private int f40196du;

    /* JADX INFO: renamed from: dy */
    private boolean f40197dy;

    /* JADX INFO: renamed from: h4 */
    private C6765kp f40198h4;

    /* JADX INFO: renamed from: jd */
    private ArrayList f40199jd;

    /* JADX INFO: renamed from: k4 */
    C11973u1 f40200k4;

    /* JADX INFO: renamed from: kk */
    private int f40201kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f40202m9;

    /* JADX INFO: renamed from: to */
    private int f40203to;

    /* JADX INFO: renamed from: x1 */
    private int f40204x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.wg.du$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        public byte[] f40205k4;

        /* JADX INFO: renamed from: x1 */
        public int f40206x1;

        public k4(byte[] bArr) {
            this.f40205k4 = bArr;
        }

        /* JADX INFO: renamed from: k4 */
        public int m55921k4(byte[] bArr, int i, int i2) {
            if (i2 > AbstractC14092to.m67208k4((Object) this.f40205k4).m67265du() - this.f40206x1) {
                i2 = AbstractC14092to.m67208k4((Object) this.f40205k4).m67265du() - this.f40206x1;
            }
            C14058fa.m66596k4(this.f40205k4, this.f40206x1, bArr, i, i2);
            this.f40206x1 += i2;
            return i2;
        }
    }

    public C11930du(C11973u1 c11973u1) {
        this.f40200k4 = c11973u1;
        this.f40198h4 = new C6765kp();
        this.f40199jd = new ArrayList();
        this.f40204x1 = -1;
        this.f40203to = 0;
    }

    /* JADX INFO: renamed from: du */
    private int m55906du(byte[] bArr, int[] iArr, int i) {
        int i2;
        if (this.f40195c5 == 2 && C7019kk.m27434ck(Byte.valueOf(bArr[iArr[0]]), 6) == '\r' && this.f40198h4.m26807x1() == 0) {
            int i3 = iArr[0] + 1;
            iArr[0] = i3;
            if (i3 < i && C7019kk.m27434ck(Byte.valueOf(bArr[i3]), 6) == '\n') {
                iArr[0] = iArr[0] + 1;
                return 0;
            }
            iArr[0] = iArr[0] - 1;
        }
        int i4 = this.f40195c5;
        while (true) {
            i2 = iArr[0];
            if (i2 >= i || i4 >= 4) {
                break;
            }
            iArr[0] = i2 + 1;
            char cM27434ck = C7019kk.m27434ck(Byte.valueOf(bArr[i2]), 6);
            if (((i4 == 0 || i4 == 2) && cM27434ck == '\r') || ((i4 == 1 || i4 == 3) && cM27434ck == '\n')) {
                i4++;
            } else if (i4 > 0) {
                C6765kp c6765kp = this.f40198h4;
                if (c6765kp.m26807x1() == 0) {
                    i4 -= 2;
                }
                c6765kp.m26792k4(C14113y2.m67443x1("\r\n\r", 0, i4));
                if (this.f40198h4.m26807x1() > 4196) {
                    m55913x1("Error reading trailer (too long).");
                }
                i4 = 0;
            }
        }
        if (i4 < 4) {
            this.f40195c5 = i4;
            if (i2 < i) {
                m55913x1("Error reading trailer.");
            }
            return 3;
        }
        C3144um c3144um = new C3144um(this.f40198h4.toString());
        while (true) {
            String strMo13429m9 = c3144um.mo13429m9();
            if (strMo13429m9 == null || "".equals(strMo13429m9)) {
                break;
            }
            this.f40200k4.m56151k4(strMo13429m9);
        }
        return 0;
    }

    /* JADX INFO: renamed from: kk */
    private int m55909kk(byte[] bArr, int i, int i2) {
        int size = this.f40199jd.size();
        int iM55921k4 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            k4 k4Var = (k4) this.f40199jd.get_Item(i3);
            if (k4Var != null) {
                if (k4Var.f40206x1 == AbstractC14092to.m67208k4((Object) k4Var.f40205k4).m67265du()) {
                    this.f40199jd.set_Item(i3, null);
                } else {
                    iM55921k4 += k4Var.m55921k4(bArr, i + iM55921k4, i2 - iM55921k4);
                    if (iM55921k4 == i2) {
                        return iM55921k4;
                    }
                }
            }
        }
        return iM55921k4;
    }

    /* JADX INFO: renamed from: x1 */
    private int m55912x1(byte[] bArr, int[] iArr, int i) {
        int i2 = this.f40204x1;
        if (i2 == 0) {
            return 2;
        }
        int i3 = iArr[0];
        int i4 = i - i3;
        int i5 = this.f40201kk;
        if (i4 + i5 > i2) {
            i4 = i2 - i5;
        }
        byte[] bArr2 = new byte[i4];
        C14058fa.m66596k4(bArr, i3, bArr2, 0, i4);
        this.f40199jd.addItem(new k4(bArr2));
        iArr[0] = iArr[0] + i4;
        int i6 = this.f40201kk + i4;
        this.f40201kk = i6;
        this.f40203to += i4;
        return i6 == this.f40204x1 ? 2 : 1;
    }

    /* JADX INFO: renamed from: k4 */
    public int m55914k4(byte[] bArr, int i, int i2) {
        return m55909kk(bArr, i, i2);
    }

    /* JADX INFO: renamed from: to */
    public int m55918to() {
        return this.f40204x1 - this.f40201kk;
    }

    public C11930du(byte[] bArr, int i, int i2, C11973u1 c11973u1) {
        this(c11973u1);
        m55919x1(bArr, i, i2);
    }

    /* JADX INFO: renamed from: k4 */
    public static String m55907k4(String str) {
        int iM67429to = C14113y2.m67429to(str, ';');
        return iM67429to == -1 ? str : C14113y2.m67443x1(str, 0, iM67429to);
    }

    /* JADX INFO: renamed from: kk */
    private int m55910kk(byte[] bArr, int[] iArr, int i) {
        this.f40201kk = 0;
        this.f40204x1 = 0;
        char cM27434ck = 0;
        while (true) {
            int i2 = iArr[0];
            if (i2 >= i) {
                break;
            }
            iArr[0] = i2 + 1;
            cM27434ck = C7019kk.m27434ck(Byte.valueOf(bArr[i2]), 6);
            if (cM27434ck != '\r') {
                if (this.f40202m9 && cM27434ck == '\n') {
                    break;
                }
                if (cM27434ck == ' ') {
                    this.f40197dy = true;
                }
                if (!this.f40197dy) {
                    this.f40198h4.m26780k4(cM27434ck);
                }
                if (this.f40198h4.m26807x1() > 20) {
                    m55913x1("chunk size too long.");
                }
            } else {
                if (this.f40202m9) {
                    m55913x1("2 CR found");
                }
                this.f40202m9 = true;
            }
        }
        if (!this.f40202m9 || cM27434ck != '\n') {
            if (iArr[0] < i) {
                m55913x1("Missing \\n");
            }
            try {
                if (this.f40198h4.m26807x1() > 0) {
                    this.f40204x1 = C14057f9.m66583k4(m55907k4(this.f40198h4.toString()), 515);
                }
            } catch (RuntimeException unused) {
                m55913x1("Cannot parse chunk size.");
            }
            return 0;
        }
        this.f40201kk = 0;
        try {
            this.f40204x1 = C14057f9.m66583k4(m55907k4(this.f40198h4.toString()), 515);
        } catch (RuntimeException unused2) {
            m55913x1("Cannot parse chunk size.");
        }
        if (this.f40204x1 != 0) {
            return 1;
        }
        this.f40195c5 = 2;
        return 3;
    }

    /* JADX INFO: renamed from: to */
    private int m55911to(byte[] bArr, int[] iArr, int i) {
        if (!this.f40202m9) {
            int i2 = iArr[0];
            iArr[0] = i2 + 1;
            if (C7019kk.m27434ck(Byte.valueOf(bArr[i2]), 6) != '\r') {
                m55913x1("Expecting \\r");
            }
            this.f40202m9 = true;
            if (iArr[0] == i) {
                return 2;
            }
        }
        if (this.f40202m9) {
            int i3 = iArr[0];
            iArr[0] = i3 + 1;
            if (C7019kk.m27434ck(Byte.valueOf(bArr[i3]), 6) != '\n') {
                m55913x1("Expecting \\n");
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: x1 */
    public static void m55913x1(String str) {
        throw new C11997yo(str, null, 11, null);
    }

    /* JADX INFO: renamed from: k4 */
    public void m55915k4() {
        this.f40204x1 = -1;
        this.f40201kk = 0;
        this.f40203to = 0;
        this.f40199jd.clear();
    }

    /* JADX INFO: renamed from: kk */
    public boolean m55917kk() {
        byte[] bArr;
        int size = this.f40199jd.size();
        for (int i = 0; i < size; i++) {
            k4 k4Var = (k4) this.f40199jd.get_Item(i);
            if (k4Var != null && (bArr = k4Var.f40205k4) != null && AbstractC14092to.m67208k4((Object) bArr).m67265du() > 0 && k4Var.f40206x1 < AbstractC14092to.m67208k4((Object) k4Var.f40205k4).m67265du()) {
                return this.f40196du != 1;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: x1 */
    public void m55919x1(byte[] bArr, int i, int i2) {
        if (i < i2) {
            m55908k4(bArr, new int[]{i}, i2);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m55916k4(byte[] bArr, int i, int i2, int[] iArr) {
        int i3 = iArr[0];
        if (i + i3 > 0) {
            m55919x1(bArr, i, i3 + i);
        }
        iArr[0] = m55914k4(bArr, i, i2);
    }

    /* JADX INFO: renamed from: x1 */
    public boolean m55920x1() {
        int i = this.f40201kk;
        int i2 = this.f40204x1;
        return (i == i2 && i2 == 0 && this.f40196du == 0) ? false : true;
    }

    /* JADX INFO: renamed from: k4 */
    private void m55908k4(byte[] bArr, int[] iArr, int i) {
        if (this.f40196du == 0) {
            int iM55910kk = m55910kk(bArr, iArr, i);
            this.f40196du = iM55910kk;
            if (iM55910kk == 0) {
                return;
            }
            this.f40198h4.m26801k4(0);
            this.f40202m9 = false;
            this.f40197dy = false;
        }
        if (this.f40196du == 1 && iArr[0] < i) {
            int iM55912x1 = m55912x1(bArr, iArr, i);
            this.f40196du = iM55912x1;
            if (iM55912x1 == 1) {
                return;
            }
        }
        if (this.f40196du == 2 && iArr[0] < i) {
            int iM55911to = m55911to(bArr, iArr, i);
            this.f40196du = iM55911to;
            if (iM55911to == 2) {
                return;
            } else {
                this.f40202m9 = false;
            }
        }
        if (this.f40196du == 3 && iArr[0] < i) {
            int iM55906du = m55906du(bArr, iArr, i);
            this.f40196du = iM55906du;
            if (iM55906du == 3) {
                return;
            }
            this.f40198h4.m26801k4(0);
            this.f40202m9 = false;
            this.f40197dy = false;
        }
        if (iArr[0] < i) {
            m55908k4(bArr, iArr, i);
        }
    }
}
