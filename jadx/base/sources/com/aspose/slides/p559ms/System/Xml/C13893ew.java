package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.IndexOutOfRangeException;
import com.aspose.slides.exceptions.XmlException;
import com.aspose.slides.internal.p080dd.AbstractC3124b3;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p294n9.AbstractC6766ks;
import com.aspose.slides.internal.p463vm.C11683c5;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14114y9;
import com.aspose.words.ControlChar;
import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.ew */
/* JADX INFO: loaded from: classes5.dex */
public class C13893ew extends AbstractC13965r5 {

    /* JADX INFO: renamed from: ak */
    protected boolean f46487ak;

    /* JADX INFO: renamed from: ar */
    protected int f46488ar;

    /* JADX INFO: renamed from: b3 */
    protected int f46489b3;

    /* JADX INFO: renamed from: bv */
    protected boolean f46490bv;

    /* JADX INFO: renamed from: c5 */
    protected int f46491c5;

    /* JADX INFO: renamed from: ck */
    protected int f46492ck;

    /* JADX INFO: renamed from: du */
    protected byte[] f46493du;

    /* JADX INFO: renamed from: dy */
    protected C14022y4 f46494dy;

    /* JADX INFO: renamed from: fa */
    protected int f46495fa;

    /* JADX INFO: renamed from: h4 */
    protected AbstractC3150x6 f46496h4;

    /* JADX INFO: renamed from: ix */
    protected char[] f46497ix;

    /* JADX INFO: renamed from: jd */
    protected int f46498jd;

    /* JADX INFO: renamed from: k4 */
    private int f46499k4;

    /* JADX INFO: renamed from: kk */
    private C13918jd f46500kk;

    /* JADX INFO: renamed from: ks */
    protected boolean f46501ks;

    /* JADX INFO: renamed from: lr */
    protected boolean f46502lr;

    /* JADX INFO: renamed from: m9 */
    protected AbstractC6747ar f46503m9;

    /* JADX INFO: renamed from: ne */
    protected int f46504ne;

    /* JADX INFO: renamed from: qq */
    protected boolean f46505qq;

    /* JADX INFO: renamed from: rv */
    protected boolean f46506rv;

    /* JADX INFO: renamed from: u4 */
    protected AbstractC6766ks f46507u4;

    /* JADX INFO: renamed from: um */
    protected boolean f46508um;

    /* JADX INFO: renamed from: up */
    protected int f46509up;

    /* JADX INFO: renamed from: uz */
    protected AbstractC3124b3 f46510uz;

    /* JADX INFO: renamed from: v4 */
    protected String f46511v4;

    /* JADX INFO: renamed from: wl */
    protected boolean f46512wl;

    /* JADX INFO: renamed from: wy */
    protected boolean f46513wy;

    /* JADX INFO: renamed from: x1 */
    private int[] f46514x1;

    /* JADX INFO: renamed from: x6 */
    protected boolean f46515x6;

    /* JADX INFO: renamed from: yd */
    protected int f46516yd;

    /* JADX INFO: renamed from: yj */
    protected int f46517yj;

    public C13893ew(AbstractC3124b3 abstractC3124b3, C13907h0 c13907h0) {
        this(c13907h0);
        this.f46510uz = abstractC3124b3;
        this.f46503m9 = abstractC3124b3.mo13310x1();
        this.f46497ix = new char[this.f46517yj + 32];
        if (c13907h0.m65443wl()) {
            mo21902k4(this.f46516yd);
            this.f46513wy = true;
        }
    }

    /* JADX INFO: renamed from: c5 */
    public static int m65323c5(char[] cArr, int i) {
        cArr[i] = '&';
        cArr[i + 1] = '#';
        cArr[i + 2] = 'x';
        cArr[i + 3] = 'D';
        cArr[i + 4] = ';';
        return i + 5;
    }

    /* JADX INFO: renamed from: ck */
    public static int m65324ck(char[] cArr, int i) {
        cArr[i] = ']';
        cArr[i + 1] = ']';
        cArr[i + 2] = '>';
        return i + 3;
    }

    /* JADX INFO: renamed from: du */
    public static int m65325du(char[] cArr, int i) {
        cArr[i] = '&';
        cArr[i + 1] = 'a';
        cArr[i + 2] = 'm';
        cArr[i + 3] = 'p';
        cArr[i + 4] = ';';
        return i + 5;
    }

    /* JADX INFO: renamed from: dy */
    public static int m65326dy(char[] cArr, int i) {
        cArr[i] = '&';
        cArr[i + 1] = '#';
        cArr[i + 2] = 'x';
        cArr[i + 3] = 'A';
        cArr[i + 4] = ';';
        return i + 5;
    }

    /* JADX INFO: renamed from: h4 */
    public static int m65327h4(char[] cArr, int i) {
        cArr[i] = '&';
        cArr[i + 1] = 'q';
        cArr[i + 2] = 'u';
        cArr[i + 3] = 'o';
        cArr[i + 4] = 't';
        cArr[i + 5] = ';';
        return i + 6;
    }

    /* JADX INFO: renamed from: jd */
    public static int m65328jd(char[] cArr, int i) {
        cArr[i] = '<';
        cArr[i + 1] = '!';
        cArr[i + 2] = '[';
        cArr[i + 3] = 'C';
        cArr[i + 4] = 'D';
        cArr[i + 5] = 'A';
        cArr[i + 6] = 'T';
        cArr[i + 7] = 'A';
        cArr[i + 8] = '[';
        return i + 9;
    }

    /* JADX INFO: renamed from: k4 */
    private int m65329k4(int i, char[] cArr, int i2, boolean z) {
        char c = (char) i;
        if (this.f46502lr) {
            throw C13850af.m65137x1(c, (char) 0);
        }
        if (z) {
            return m65330k4(cArr, i2, c);
        }
        cArr[i2] = c;
        return i2 + 1;
    }

    /* JADX INFO: renamed from: kk */
    public static int m65333kk(char[] cArr, int i) {
        cArr[i] = '&';
        cArr[i + 1] = 'l';
        cArr[i + 2] = 't';
        cArr[i + 3] = ';';
        return i + 4;
    }

    /* JADX INFO: renamed from: m9 */
    public static int m65334m9(char[] cArr, int i) {
        cArr[i] = '&';
        cArr[i + 1] = '#';
        cArr[i + 2] = 'x';
        cArr[i + 3] = '9';
        cArr[i + 4] = ';';
        return i + 5;
    }

    /* JADX INFO: renamed from: to */
    public static int m65336to(char[] cArr, int i) {
        cArr[i] = '&';
        cArr[i + 1] = 'g';
        cArr[i + 2] = 't';
        cArr[i + 3] = ';';
        return i + 4;
    }

    /* JADX INFO: renamed from: up */
    private void m65337up() {
        int[] iArr = this.f46514x1;
        int[] iArr2 = new int[iArr.length * 2];
        AbstractC14092to.m67220k4(AbstractC14092to.m67208k4((Object) iArr), AbstractC14092to.m67208k4((Object) iArr2), this.f46514x1.length);
        this.f46514x1 = iArr2;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: a_ */
    public void mo21891a_(char[] cArr, int i, int i2) {
        if (this.f46512wl && this.f46505qq) {
            m65344k4(false);
        }
        m65340h4(cArr, i, i2 + i);
        this.f46498jd = this.f46491c5;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    public boolean aa_() {
        return true;
    }

    public void ab_() {
        try {
            try {
                if (!this.f46501ks) {
                    if (this.f46496h4 != null) {
                        if (this.f46512wl) {
                            this.f46500kk.m65490k4(this.f46514x1, this.f46499k4);
                            if ((this.f46499k4 & 1) != 0) {
                                this.f46514x1[1] = 1;
                                this.f46499k4 = 1;
                            } else {
                                this.f46499k4 = 0;
                            }
                        }
                        m65332k4(1, this.f46491c5, true);
                    } else {
                        this.f46510uz.mo13307k4(this.f46497ix, 1, this.f46491c5 - 1);
                    }
                }
                char[] cArr = this.f46497ix;
                int i = this.f46491c5;
                cArr[0] = cArr[i - 1];
                this.f46498jd = this.f46498jd == i ? 1 : 0;
                this.f46509up = this.f46509up == i ? 1 : 0;
                this.f46492ck = 0;
                this.f46495fa = 0;
                this.f46491c5 = 1;
            } catch (RuntimeException e) {
                this.f46501ks = true;
                throw e;
            }
        } catch (Throwable th) {
            char[] cArr2 = this.f46497ix;
            int i2 = this.f46491c5;
            cArr2[0] = cArr2[i2 - 1];
            this.f46498jd = this.f46498jd == i2 ? 1 : 0;
            this.f46509up = this.f46509up == i2 ? 1 : 0;
            this.f46492ck = 0;
            this.f46495fa = 0;
            this.f46491c5 = 1;
            throw th;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final int m65348x1(int i) {
        this.f46491c5 = i;
        m65341jd(this.f46511v4);
        return this.f46491c5;
    }

    public C13893ew(AbstractC3150x6 abstractC3150x6, C13907h0 c13907h0) {
        this(c13907h0);
        this.f46496h4 = abstractC3150x6;
        this.f46503m9 = c13907h0.m65424k4();
        char[] cArr = new char[this.f46517yj + 32];
        this.f46497ix = cArr;
        this.f46493du = new byte[cArr.length];
        this.f46504ne = 0;
        this.f46512wl = true;
        this.f46505qq = false;
        this.f46499k4 = 0;
        int[] iArr = new int[64];
        this.f46514x1 = iArr;
        iArr[0] = 1;
        this.f46500kk = new C13918jd();
        AbstractC6747ar abstractC6747ar = (AbstractC6747ar) c13907h0.m65424k4().deepClone();
        this.f46503m9 = abstractC6747ar;
        abstractC6747ar.m26669k4(this.f46500kk);
        this.f46507u4 = this.f46503m9.mo26626kk();
        if (!abstractC3150x6.canSeek() || abstractC3150x6.getPosition() == 0) {
            byte[] bArrMo26655dy = this.f46503m9.mo26655dy();
            if (bArrMo26655dy.length != 0) {
                this.f46496h4.write(bArrMo26655dy, 0, bArrMo26655dy.length);
            }
        }
        if (c13907h0.m65443wl()) {
            mo21902k4(this.f46516yd);
            this.f46513wy = true;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static int m65330k4(char[] cArr, int i, char c) {
        int i2;
        String strM66588k4 = C14057f9.m66588k4(c, "X", C11683c5.m55033ck());
        cArr[i] = '&';
        cArr[i + 1] = '#';
        cArr[i + 2] = 'x';
        int i3 = i + 3;
        int i4 = 0;
        while (true) {
            i2 = i3 + 1;
            try {
                int i5 = i4 + 1;
                if (cArr[i3] != C14113y2.m67365dy(strM66588k4)[i4]) {
                    break;
                }
                i3 = i2;
                i4 = i5;
            } catch (IndexOutOfRangeException | ArrayIndexOutOfBoundsException unused) {
            }
        }
        cArr[i3] = ';';
        return i2;
    }

    /* JADX INFO: renamed from: m9 */
    private void m65335m9() {
        if (this.f46496h4 != null) {
            int[] iArr = {0};
            AbstractC6766ks abstractC6766ks = this.f46507u4;
            char[] cArr = this.f46497ix;
            byte[] bArr = this.f46493du;
            abstractC6766ks.mo26812k4(cArr, 1, 0, bArr, 0, bArr.length, true, new int[]{0}, iArr, new boolean[]{false});
            int i = iArr[0];
            if (i != 0) {
                this.f46496h4.write(this.f46493du, 0, i);
            }
        }
    }

    /* JADX INFO: renamed from: ck */
    public final void m65338ck(String str) {
        if (str.length() == 0) {
            if (this.f46491c5 >= this.f46517yj) {
                ab_();
                return;
            }
            return;
        }
        char[] cArrM67365dy = C14113y2.m67365dy(str);
        int length = str.length();
        char[] cArr = this.f46497ix;
        int iM65348x1 = this.f46491c5;
        int i = 0;
        char c = 0;
        while (true) {
            int i2 = (length - i) + iM65348x1;
            int i3 = this.f46517yj;
            if (i2 > i3) {
                i2 = i3;
            }
            while (iM65348x1 < i2) {
                byte[] bArr = this.f46494dy.f47099k4;
                char c2 = cArrM67365dy[i];
                if ((bArr[c2] & UnsignedBytes.MAX_POWER_OF_TWO) == 0 || c2 == ']') {
                    c = c2;
                    break;
                }
                cArr[iM65348x1] = c2;
                iM65348x1++;
                i++;
                c = c2;
            }
            if (i >= length) {
                this.f46491c5 = iM65348x1;
                return;
            }
            if (iM65348x1 >= i2) {
                this.f46491c5 = iM65348x1;
                ab_();
                iM65348x1 = 1;
            } else {
                if (c != '\t') {
                    if (c != '\n') {
                        if (c != '\r') {
                            if (c != '\"' && c != '<') {
                                if (c == '>') {
                                    if (this.f46506rv && cArr[iM65348x1 - 1] == ']') {
                                        iM65348x1 = m65328jd(cArr, m65324ck(cArr, iM65348x1));
                                    }
                                    cArr[iM65348x1] = '>';
                                    iM65348x1++;
                                } else if (c == ']') {
                                    if (cArr[iM65348x1 - 1] == ']') {
                                        this.f46506rv = true;
                                    } else {
                                        this.f46506rv = false;
                                    }
                                    cArr[iM65348x1] = ']';
                                } else if (c != '&' && c != '\'') {
                                    if (C14022y4.m66325kk((int) c)) {
                                        iM65348x1 = m65331k4(cArrM67365dy, i, length, cArr, iM65348x1);
                                        i += 2;
                                    } else {
                                        if (c <= 127 || c >= 65534) {
                                            iM65348x1 = m65329k4((int) c, cArr, iM65348x1, false);
                                        } else {
                                            cArr[iM65348x1] = c;
                                            iM65348x1++;
                                        }
                                        i++;
                                    }
                                }
                            }
                        } else if (this.f46488ar == 0) {
                            int i4 = i + 1;
                            try {
                                if (cArrM67365dy[i4] == '\n') {
                                    i = i4;
                                }
                            } catch (IndexOutOfRangeException | ArrayIndexOutOfBoundsException unused) {
                            }
                            iM65348x1 = m65348x1(iM65348x1);
                        } else {
                            cArr[iM65348x1] = c;
                        }
                        iM65348x1++;
                    } else {
                        if (this.f46488ar != 0) {
                            cArr[iM65348x1] = c;
                            iM65348x1++;
                        }
                        iM65348x1 = m65348x1(iM65348x1);
                    }
                    i++;
                }
                cArr[iM65348x1] = c;
                iM65348x1++;
                i++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: du */
    public void mo21893du() {
        try {
            ab_();
            m65335m9();
            this.f46501ks = true;
            AbstractC3150x6 abstractC3150x6 = this.f46496h4;
            if (abstractC3150x6 != null) {
                try {
                    abstractC3150x6.flush();
                    try {
                        if (this.f46508um) {
                            this.f46496h4.close();
                        }
                        return;
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        if (this.f46508um) {
                            this.f46496h4.close();
                        }
                        throw th;
                    } finally {
                    }
                }
            }
            AbstractC3124b3 abstractC3124b3 = this.f46510uz;
            if (abstractC3124b3 != null) {
                try {
                    abstractC3124b3.mo13308kk();
                    try {
                        if (this.f46508um) {
                            this.f46510uz.mo13309to();
                        }
                    } finally {
                    }
                } catch (Throwable th2) {
                    try {
                        if (this.f46508um) {
                            this.f46510uz.mo13309to();
                        }
                        throw th2;
                    } finally {
                    }
                }
            }
        } catch (Throwable th3) {
            this.f46501ks = true;
            AbstractC3150x6 abstractC3150x62 = this.f46496h4;
            if (abstractC3150x62 != null) {
                try {
                    abstractC3150x62.flush();
                    try {
                        if (this.f46508um) {
                            this.f46496h4.close();
                        }
                    } finally {
                    }
                } catch (Throwable th4) {
                    try {
                        if (this.f46508um) {
                            this.f46496h4.close();
                        }
                        throw th4;
                    } finally {
                    }
                }
            } else {
                AbstractC3124b3 abstractC3124b32 = this.f46510uz;
                if (abstractC3124b32 != null) {
                    try {
                        abstractC3124b32.mo13308kk();
                        try {
                            if (this.f46508um) {
                                this.f46510uz.mo13309to();
                            }
                        } finally {
                        }
                    } catch (Throwable th5) {
                        try {
                            if (this.f46508um) {
                                this.f46510uz.mo13309to();
                            }
                            throw th5;
                        } finally {
                        }
                    }
                }
            }
            throw th3;
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: dy */
    public void mo21895dy(String str) {
        if (this.f46512wl && this.f46505qq) {
            m65344k4(false);
        }
        char[] cArrM67365dy = C14113y2.m67365dy(str);
        m65340h4(cArrM67365dy, 0, cArrM67365dy.length);
        this.f46498jd = this.f46491c5;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: h4 */
    public void mo21896h4() {
        ab_();
        m65335m9();
        AbstractC3150x6 abstractC3150x6 = this.f46496h4;
        if (abstractC3150x6 != null) {
            abstractC3150x6.flush();
            return;
        }
        AbstractC3124b3 abstractC3124b3 = this.f46510uz;
        if (abstractC3124b3 != null) {
            abstractC3124b3.mo13308kk();
        }
    }

    /* JADX INFO: renamed from: jd */
    public final void m65341jd(String str) {
        char[] cArrM67365dy = C14113y2.m67365dy(str);
        m65339du(cArrM67365dy, 0, cArrM67365dy.length);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: kk */
    public void mo21910kk(String str) {
        if (this.f46512wl && this.f46505qq) {
            m65344k4(false);
        }
        char[] cArr = this.f46497ix;
        int i = this.f46491c5;
        this.f46491c5 = i + 1;
        cArr[i] = '&';
        m65341jd(str);
        char[] cArr2 = this.f46497ix;
        int i2 = this.f46491c5;
        int i3 = i2 + 1;
        this.f46491c5 = i3;
        cArr2[i2] = ';';
        if (i3 > this.f46517yj) {
            ab_();
        }
        this.f46498jd = this.f46491c5;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    /* JADX INFO: renamed from: to */
    public void mo65316to() {
        if (this.f46512wl && this.f46505qq) {
            m65344k4(false);
        }
        this.f46515x6 = false;
        char[] cArr = this.f46497ix;
        int i = this.f46491c5;
        int i2 = i + 1;
        this.f46491c5 = i2;
        cArr[i] = '\"';
        this.f46509up = i2;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: x1 */
    public void mo21917x1() {
        if (this.f46512wl && this.f46505qq) {
            m65344k4(false);
        }
        char[] cArr = this.f46497ix;
        int i = this.f46491c5;
        int i2 = i + 1;
        this.f46491c5 = i2;
        cArr[i] = '\"';
        this.f46515x6 = false;
        this.f46509up = i2;
    }

    public C13893ew(C13907h0 c13907h0) {
        this.f46494dy = C14022y4.m66318k4().Clone();
        this.f46491c5 = 1;
        this.f46498jd = 1;
        this.f46517yj = 6144;
        this.f46488ar = c13907h0.m65431kk();
        this.f46490bv = c13907h0.m65445x1();
        this.f46511v4 = c13907h0.m65438to();
        this.f46502lr = c13907h0.m65423jd();
        this.f46508um = c13907h0.m65419dy();
        this.f46516yd = c13907h0.m65442uz();
        this.f46489b3 = c13907h0.m65441up();
        this.f46487ak = c13907h0.m65446x6();
        if (this.f46502lr && this.f46488ar == 0) {
            m65343k4(this.f46511v4, "NewLineChars", false);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static int m65331k4(char[] cArr, int i, int i2, char[] cArr2, int i3) {
        char c = cArr[i];
        if (c > 56319) {
            throw C13850af.m65136x1(c);
        }
        int i4 = i + 1;
        if (i4 >= i2) {
            throw new ArgumentException(C13968ri.m65818k4("The surrogate pair is invalid. Missing a low surrogate character."));
        }
        char c2 = cArr[i4];
        if (c2 < 56320 || c2 > 57343) {
            throw C13850af.m65078k4(c2, c);
        }
        cArr2[i3] = c;
        cArr2[i3 + 1] = c2;
        return i3 + 2;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: du */
    public void mo21894du(String str) {
        int i;
        if (this.f46512wl && this.f46505qq) {
            m65344k4(false);
        }
        if (this.f46487ak && (i = this.f46491c5) == this.f46495fa) {
            this.f46491c5 = i - 3;
        } else {
            char[] cArr = this.f46497ix;
            int i2 = this.f46491c5;
            int i3 = i2 + 1;
            this.f46491c5 = i3;
            cArr[i2] = '<';
            int i4 = i2 + 2;
            this.f46491c5 = i4;
            cArr[i3] = '!';
            int i5 = i2 + 3;
            this.f46491c5 = i5;
            cArr[i4] = '[';
            int i6 = i2 + 4;
            this.f46491c5 = i6;
            cArr[i5] = 'C';
            int i7 = i2 + 5;
            this.f46491c5 = i7;
            cArr[i6] = 'D';
            int i8 = i2 + 6;
            this.f46491c5 = i8;
            cArr[i7] = 'A';
            int i9 = i2 + 7;
            this.f46491c5 = i9;
            cArr[i8] = 'T';
            int i10 = i2 + 8;
            this.f46491c5 = i10;
            cArr[i9] = 'A';
            this.f46491c5 = i2 + 9;
            cArr[i10] = '[';
        }
        m65338ck(str);
        char[] cArr2 = this.f46497ix;
        int i11 = this.f46491c5;
        int i12 = i11 + 1;
        this.f46491c5 = i12;
        cArr2[i11] = ']';
        int i13 = i11 + 2;
        this.f46491c5 = i13;
        cArr2[i12] = ']';
        int i14 = i11 + 3;
        this.f46491c5 = i14;
        cArr2[i13] = '>';
        this.f46498jd = i14;
        this.f46495fa = i14;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: h4 */
    public void mo21897h4(String str) {
        if (this.f46512wl && this.f46505qq) {
            m65344k4(false);
        }
        char[] cArr = this.f46497ix;
        int i = this.f46491c5;
        int i2 = i + 1;
        this.f46491c5 = i2;
        cArr[i] = '<';
        int i3 = i + 2;
        this.f46491c5 = i3;
        cArr[i2] = '!';
        int i4 = i + 3;
        this.f46491c5 = i4;
        cArr[i3] = '-';
        this.f46491c5 = i + 4;
        cArr[i4] = '-';
        m65342k4(str, 45);
        char[] cArr2 = this.f46497ix;
        int i5 = this.f46491c5;
        int i6 = i5 + 1;
        this.f46491c5 = i6;
        cArr2[i5] = '-';
        int i7 = i5 + 2;
        this.f46491c5 = i7;
        cArr2[i6] = '-';
        this.f46491c5 = i5 + 3;
        cArr2[i7] = '>';
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    /* JADX INFO: renamed from: kk */
    public void mo21911kk(String str, String str2, String str3) {
        if (this.f46512wl && this.f46505qq) {
            m65344k4(false);
        }
        char[] cArr = this.f46497ix;
        int i = this.f46491c5;
        int i2 = i + 1;
        this.f46491c5 = i2;
        cArr[i] = '<';
        this.f46491c5 = i + 2;
        cArr[i2] = IOUtils.DIR_SEPARATOR_UNIX;
        if (str != null && str.length() != 0) {
            m65341jd(str);
            char[] cArr2 = this.f46497ix;
            int i3 = this.f46491c5;
            this.f46491c5 = i3 + 1;
            cArr2[i3] = ':';
        }
        m65341jd(str2);
        char[] cArr3 = this.f46497ix;
        int i4 = this.f46491c5;
        this.f46491c5 = i4 + 1;
        cArr3[i4] = '>';
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: m9 */
    public void mo21913m9(String str) {
        if (this.f46512wl && this.f46505qq) {
            m65344k4(false);
        }
        char[] cArrM67365dy = C14113y2.m67365dy(str);
        int length = str.length();
        if (this.f46515x6) {
            m65346kk(cArrM67365dy, 0, length);
        } else {
            m65347to(cArrM67365dy, 0, length);
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    /* JADX INFO: renamed from: to */
    public void mo65317to(String str) {
        if (this.f46512wl && this.f46505qq) {
            m65344k4(false);
        }
        if (str.length() == 0) {
            m65341jd(" xmlns=\"");
        } else {
            m65341jd(" xmlns:");
            m65341jd(str);
            char[] cArr = this.f46497ix;
            int i = this.f46491c5;
            int i2 = i + 1;
            this.f46491c5 = i2;
            cArr[i] = '=';
            this.f46491c5 = i + 2;
            cArr[i2] = '\"';
        }
        this.f46515x6 = true;
        if (!this.f46512wl || this.f46505qq) {
            return;
        }
        m65344k4(true);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: x1 */
    public void mo21918x1(String str) {
        if (this.f46512wl && !this.f46505qq) {
            m65344k4(true);
        }
        char[] cArrM67365dy = C14113y2.m67365dy(str);
        int length = cArrM67365dy.length;
        if (this.f46515x6) {
            m65346kk(cArrM67365dy, 0, length);
        } else {
            m65347to(cArrM67365dy, 0, length);
        }
    }

    /* JADX INFO: renamed from: du */
    public final void m65339du(char[] cArr, int i, int i2) {
        char[] cArr2 = this.f46497ix;
        int iM65331k4 = this.f46491c5;
        char c = 0;
        while (true) {
            int i3 = (i2 - i) + iM65331k4;
            int i4 = this.f46517yj;
            if (i3 > i4) {
                i3 = i4;
            }
            while (iM65331k4 < i3) {
                c = cArr[i];
                if (c >= 55296) {
                    break;
                }
                i++;
                cArr2[iM65331k4] = c;
                iM65331k4++;
            }
            if (i >= i2) {
                this.f46491c5 = iM65331k4;
                return;
            }
            if (iM65331k4 >= i3) {
                this.f46491c5 = iM65331k4;
                ab_();
                iM65331k4 = 1;
            } else if (C14022y4.m66325kk((int) c)) {
                iM65331k4 = m65331k4(cArr, i, i2, cArr2, iM65331k4);
                i += 2;
            } else {
                if (c <= 127 || c >= 65534) {
                    iM65331k4 = m65329k4((int) c, cArr2, iM65331k4, false);
                } else {
                    cArr2[iM65331k4] = c;
                    iM65331k4++;
                }
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: h4 */
    public final void m65340h4(char[] cArr, int i, int i2) {
        char[] cArr2 = this.f46497ix;
        int iM65348x1 = this.f46491c5;
        char c = 0;
        while (true) {
            int i3 = (i2 - i) + iM65348x1;
            int i4 = this.f46517yj;
            if (i3 > i4) {
                i3 = i4;
            }
            while (true) {
                if (iM65348x1 >= i3) {
                    break;
                }
                byte[] bArr = this.f46494dy.f47099k4;
                char c2 = cArr[i];
                if ((bArr[c2] & SignedBytes.MAX_POWER_OF_TWO) == 0) {
                    c = c2;
                    break;
                }
                cArr2[iM65348x1] = c2;
                iM65348x1++;
                i++;
                c = c2;
            }
            if (i >= i2) {
                this.f46491c5 = iM65348x1;
                return;
            }
            if (iM65348x1 >= i3) {
                this.f46491c5 = iM65348x1;
                ab_();
                iM65348x1 = 1;
            } else {
                if (c != '\t') {
                    if (c == '\n') {
                        if (this.f46488ar != 0) {
                            cArr2[iM65348x1] = c;
                            iM65348x1++;
                        }
                        iM65348x1 = m65348x1(iM65348x1);
                    } else if (c != '\r') {
                        if (c != '&' && c != '<' && c != ']') {
                            if (C14022y4.m66325kk((int) c)) {
                                iM65348x1 = m65331k4(cArr, i, i2, cArr2, iM65348x1);
                                i += 2;
                            } else {
                                if (c <= 127 || c >= 65534) {
                                    iM65348x1 = m65329k4((int) c, cArr2, iM65348x1, false);
                                } else {
                                    cArr2[iM65348x1] = c;
                                    iM65348x1++;
                                }
                                i++;
                            }
                        }
                    } else if (this.f46488ar == 0) {
                        int i5 = i + 1;
                        try {
                            if (cArr[i5] == '\n') {
                                i = i5;
                            }
                        } catch (IndexOutOfRangeException | ArrayIndexOutOfBoundsException unused) {
                        }
                        iM65348x1 = m65348x1(iM65348x1);
                    } else {
                        cArr2[iM65348x1] = c;
                        iM65348x1++;
                    }
                    i++;
                }
                cArr2[iM65348x1] = c;
                iM65348x1++;
                i++;
            }
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    /* JADX INFO: renamed from: k4 */
    public void mo21899k4() {
        char[] cArr = this.f46497ix;
        int i = this.f46491c5;
        int i2 = i + 1;
        this.f46491c5 = i2;
        cArr[i] = '>';
        this.f46492ck = i2;
    }

    /* JADX INFO: renamed from: kk */
    public final void m65346kk(char[] cArr, int i, int i2) {
        char[] cArr2 = this.f46497ix;
        int iM65334m9 = this.f46491c5;
        char c = 0;
        while (true) {
            int i3 = (i2 - i) + iM65334m9;
            int i4 = this.f46517yj;
            if (i3 > i4) {
                i3 = i4;
            }
            while (true) {
                if (iM65334m9 >= i3) {
                    break;
                }
                byte[] bArr = this.f46494dy.f47099k4;
                char c2 = cArr[i];
                if ((bArr[c2] & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                    c = c2;
                    break;
                }
                cArr2[iM65334m9] = c2;
                iM65334m9++;
                i++;
                c = c2;
            }
            if (i >= i2) {
                this.f46491c5 = iM65334m9;
                return;
            }
            if (i >= i3) {
                this.f46491c5 = i;
                ab_();
                i = 1;
            } else if (c != '\t') {
                if (c != '\n') {
                    if (c != '\r') {
                        if (c == '\"') {
                            iM65334m9 = m65327h4(cArr2, iM65334m9);
                        } else if (c == '<') {
                            iM65334m9 = m65333kk(cArr2, iM65334m9);
                        } else if (c == '>') {
                            iM65334m9 = m65336to(cArr2, iM65334m9);
                        } else if (c != '&') {
                            if (c == '\'') {
                                cArr2[iM65334m9] = c;
                            } else if (C14022y4.m66325kk((int) c)) {
                                iM65334m9 = m65331k4(cArr, i, i2, cArr2, iM65334m9);
                                i += 2;
                            } else if (c <= 127 || c >= 65534) {
                                iM65334m9 = m65329k4((int) c, cArr2, iM65334m9, true);
                            } else {
                                cArr2[iM65334m9] = c;
                            }
                            iM65334m9++;
                        } else {
                            iM65334m9 = m65325du(cArr2, iM65334m9);
                        }
                        i++;
                    } else if (this.f46488ar == 2) {
                        cArr2[iM65334m9] = c;
                        iM65334m9++;
                        i++;
                    } else {
                        iM65334m9 = m65323c5(cArr2, iM65334m9);
                        i++;
                    }
                } else if (this.f46488ar == 2) {
                    cArr2[iM65334m9] = c;
                    iM65334m9++;
                    i++;
                } else {
                    iM65334m9 = m65326dy(cArr2, iM65334m9);
                    i++;
                }
            } else if (this.f46488ar == 2) {
                cArr2[iM65334m9] = c;
                iM65334m9++;
                i++;
            } else {
                iM65334m9 = m65334m9(cArr2, iM65334m9);
                i++;
            }
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: to */
    public void mo21915to(String str, String str2, String str3) {
        if (this.f46512wl && this.f46505qq) {
            m65344k4(false);
        }
        int i = this.f46509up;
        int i2 = this.f46491c5;
        if (i == i2) {
            char[] cArr = this.f46497ix;
            this.f46491c5 = i2 + 1;
            cArr[i2] = ControlChar.SPACE_CHAR;
        }
        if (str != null && str.length() > 0) {
            m65341jd(str);
            char[] cArr2 = this.f46497ix;
            int i3 = this.f46491c5;
            this.f46491c5 = i3 + 1;
            cArr2[i3] = ':';
        }
        m65341jd(str2);
        char[] cArr3 = this.f46497ix;
        int i4 = this.f46491c5;
        int i5 = i4 + 1;
        this.f46491c5 = i5;
        cArr3[i4] = '=';
        this.f46491c5 = i4 + 2;
        cArr3[i5] = '\"';
        this.f46515x6 = true;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    /* JADX INFO: renamed from: x1 */
    public void mo21919x1(String str, String str2) {
        mo65317to(str);
        mo21918x1(str2);
        mo65316to();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo21900k4(char c) {
        String strM66588k4 = C14057f9.m66588k4(c, "X", C11683c5.m55033ck());
        if (this.f46502lr && !this.f46494dy.m66329du(c)) {
            throw C13850af.m65137x1(c, (char) 0);
        }
        if (this.f46512wl && this.f46505qq) {
            m65344k4(false);
        }
        char[] cArr = this.f46497ix;
        int i = this.f46491c5;
        int i2 = i + 1;
        this.f46491c5 = i2;
        cArr[i] = '&';
        int i3 = i + 2;
        this.f46491c5 = i3;
        cArr[i2] = '#';
        this.f46491c5 = i + 3;
        cArr[i3] = 'x';
        m65341jd(strM66588k4);
        char[] cArr2 = this.f46497ix;
        int i4 = this.f46491c5;
        int i5 = i4 + 1;
        this.f46491c5 = i5;
        cArr2[i4] = ';';
        if (i5 > this.f46517yj) {
            ab_();
        }
        this.f46498jd = this.f46491c5;
    }

    /* JADX INFO: renamed from: to */
    public final void m65347to(char[] cArr, int i, int i2) {
        char[] cArr2 = this.f46497ix;
        int iM65348x1 = this.f46491c5;
        char c = 0;
        while (true) {
            int i3 = (i2 - i) + iM65348x1;
            int i4 = this.f46517yj;
            if (i3 > i4) {
                i3 = i4;
            }
            while (true) {
                if (iM65348x1 >= i3) {
                    break;
                }
                byte[] bArr = this.f46494dy.f47099k4;
                char c2 = cArr[i];
                if ((bArr[c2] & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                    c = c2;
                    break;
                }
                cArr2[iM65348x1] = c2;
                iM65348x1++;
                i++;
                c = c2;
            }
            if (i >= i2) {
                this.f46491c5 = iM65348x1;
                this.f46498jd = iM65348x1;
                this.f46492ck = 0;
                return;
            }
            if (iM65348x1 >= i3) {
                this.f46491c5 = iM65348x1;
                ab_();
                iM65348x1 = 1;
            } else {
                if (c != '\t') {
                    if (c == '\n') {
                        if (this.f46488ar != 0) {
                            cArr2[iM65348x1] = c;
                            iM65348x1++;
                        }
                        iM65348x1 = m65348x1(iM65348x1);
                    } else if (c == '\r') {
                        int i5 = this.f46488ar;
                        if (i5 == 0) {
                            int i6 = i + 1;
                            try {
                                if (cArr[i6] == '\n') {
                                    i = i6;
                                }
                            } catch (IndexOutOfRangeException | ArrayIndexOutOfBoundsException unused) {
                            }
                            iM65348x1 = m65348x1(iM65348x1);
                        } else if (i5 == 1) {
                            iM65348x1 = m65323c5(cArr2, iM65348x1);
                        } else if (i5 == 2) {
                            cArr2[iM65348x1] = c;
                            iM65348x1++;
                        }
                    } else if (c != '\"') {
                        if (c == '<') {
                            iM65348x1 = m65333kk(cArr2, iM65348x1);
                        } else if (c == '>') {
                            iM65348x1 = m65336to(cArr2, iM65348x1);
                        } else if (c == '&') {
                            iM65348x1 = m65325du(cArr2, iM65348x1);
                        } else if (c != '\'') {
                            if (C14022y4.m66325kk((int) c)) {
                                iM65348x1 = m65331k4(cArr, i, i2, cArr2, iM65348x1);
                                i += 2;
                            } else {
                                if (c <= 127 || c >= 65534) {
                                    iM65348x1 = m65329k4((int) c, cArr2, iM65348x1, true);
                                } else {
                                    cArr2[iM65348x1] = c;
                                    iM65348x1++;
                                }
                                i++;
                            }
                        }
                    }
                    i++;
                }
                cArr2[iM65348x1] = c;
                iM65348x1++;
                i++;
            }
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    /* JADX INFO: renamed from: x1 */
    public void mo21920x1(String str, String str2, String str3) {
        if (this.f46512wl && this.f46505qq) {
            m65344k4(false);
        }
        int i = this.f46492ck;
        int i2 = this.f46491c5;
        if (i == i2) {
            char[] cArr = this.f46497ix;
            this.f46491c5 = i2;
            cArr[i2 - 1] = ControlChar.SPACE_CHAR;
            int i3 = i2 + 1;
            this.f46491c5 = i3;
            cArr[i2] = IOUtils.DIR_SEPARATOR_UNIX;
            this.f46491c5 = i2 + 2;
            cArr[i3] = '>';
            return;
        }
        char[] cArr2 = this.f46497ix;
        int i4 = i2 + 1;
        this.f46491c5 = i4;
        cArr2[i2] = '<';
        this.f46491c5 = i2 + 2;
        cArr2[i4] = IOUtils.DIR_SEPARATOR_UNIX;
        if (str != null && str.length() != 0) {
            m65341jd(str);
            char[] cArr3 = this.f46497ix;
            int i5 = this.f46491c5;
            this.f46491c5 = i5 + 1;
            cArr3[i5] = ':';
        }
        m65341jd(str2);
        char[] cArr4 = this.f46497ix;
        int i6 = this.f46491c5;
        this.f46491c5 = i6 + 1;
        cArr4[i6] = '>';
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo21901k4(char c, char c2) {
        if (this.f46512wl && this.f46505qq) {
            m65344k4(false);
        }
        int iM66317k4 = C14022y4.m66317k4(c, c2);
        char[] cArr = this.f46497ix;
        int i = this.f46491c5;
        int i2 = i + 1;
        this.f46491c5 = i2;
        cArr[i] = '&';
        int i3 = i + 2;
        this.f46491c5 = i3;
        cArr[i2] = '#';
        this.f46491c5 = i + 3;
        cArr[i3] = 'x';
        m65341jd(C14057f9.m66588k4(iM66317k4, "X", C11683c5.m55033ck()));
        char[] cArr2 = this.f46497ix;
        int i4 = this.f46491c5;
        int i5 = i4 + 1;
        this.f46491c5 = i5;
        cArr2[i4] = ';';
        this.f46498jd = i5;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    /* JADX INFO: renamed from: k4 */
    public void mo21902k4(int i) {
        if (this.f46490bv || this.f46513wy) {
            return;
        }
        if (this.f46512wl && this.f46505qq) {
            m65344k4(false);
        }
        m65341jd("<?xml version=\"");
        m65341jd("1.0");
        if (this.f46503m9 != null) {
            m65341jd("\" encoding=\"");
            m65341jd(this.f46503m9.mo26657jd());
        }
        if (i != 0) {
            m65341jd("\" standalone=\"");
            m65341jd(i == 1 ? "yes" : TranslateLanguage.NORWEGIAN);
        }
        m65341jd("\"?>");
    }

    /* JADX INFO: renamed from: k4 */
    private void m65332k4(int i, int i2, boolean z) {
        int i3;
        int i4 = i;
        int i5 = 0;
        int i6 = 0;
        boolean z2 = false;
        while (i4 < i2) {
            C13918jd c13918jd = this.f46500kk;
            if (c13918jd != null) {
                c13918jd.m65489k4(i4);
            }
            int[] iArr = {i5};
            int[] iArr2 = {i6};
            boolean[] zArr = {z2};
            byte[] bArr = this.f46493du;
            int i7 = this.f46504ne;
            this.f46507u4.mo26812k4(this.f46497ix, i4, i2 - i4, bArr, i7, bArr.length - i7, false, iArr, iArr2, zArr);
            i5 = iArr[0];
            i6 = iArr2[0];
            z2 = zArr[0];
            i4 += i5;
            int i8 = this.f46504ne + i6;
            this.f46504ne = i8;
            byte[] bArr2 = this.f46493du;
            if (i8 >= bArr2.length - 16) {
                this.f46496h4.write(bArr2, 0, i8);
                this.f46504ne = 0;
            }
        }
        if (!z || (i3 = this.f46504ne) <= 0) {
            return;
        }
        this.f46496h4.write(this.f46493du, 0, i3);
        this.f46504ne = 0;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5
    /* JADX INFO: renamed from: k4 */
    public void mo21905k4(String str) {
        if (this.f46490bv || this.f46513wy) {
            return;
        }
        mo21907k4("xml", str);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m65342k4(String str, int i) {
        int i2;
        int i3;
        if (str.length() == 0) {
            if (this.f46491c5 >= this.f46517yj) {
                ab_();
                return;
            }
            return;
        }
        char[] cArrM67365dy = C14113y2.m67365dy(str);
        int length = str.length();
        char[] cArr = this.f46497ix;
        int iM65348x1 = this.f46491c5;
        int i4 = 0;
        char c = 0;
        while (true) {
            int i5 = (length - i4) + iM65348x1;
            int i6 = this.f46517yj;
            if (i5 > i6) {
                i5 = i6;
            }
            while (iM65348x1 < i5) {
                byte[] bArr = this.f46494dy.f47099k4;
                char c2 = cArrM67365dy[i4];
                if ((bArr[c2] & SignedBytes.MAX_POWER_OF_TWO) == 0 || c2 == i) {
                    c = c2;
                    break;
                }
                cArr[iM65348x1] = c2;
                iM65348x1++;
                i4++;
                c = c2;
            }
            if (i4 >= length) {
                this.f46491c5 = iM65348x1;
                return;
            }
            if (iM65348x1 >= i5) {
                this.f46491c5 = iM65348x1;
                ab_();
                iM65348x1 = 1;
            } else {
                if (c != '\t') {
                    if (c != '\n') {
                        if (c != '\r') {
                            if (c != '&') {
                                if (c == '-') {
                                    cArr[iM65348x1] = '-';
                                    int i7 = iM65348x1 + 1;
                                    if (c == i && ((i2 = i4 + 1) == length || cArrM67365dy[i2] == '-')) {
                                        cArr[i7] = ControlChar.SPACE_CHAR;
                                        iM65348x1 += 2;
                                    } else {
                                        iM65348x1 = i7;
                                    }
                                } else if (c != '<') {
                                    if (c == '?') {
                                        cArr[iM65348x1] = '?';
                                        int i8 = iM65348x1 + 1;
                                        if (c == i && (i3 = i4 + 1) < length && cArrM67365dy[i3] == '>') {
                                            cArr[i8] = ControlChar.SPACE_CHAR;
                                            iM65348x1 += 2;
                                        } else {
                                            iM65348x1 = i8;
                                        }
                                    } else if (c == ']') {
                                        cArr[iM65348x1] = ']';
                                    } else if (C14022y4.m66325kk((int) c)) {
                                        iM65348x1 = m65331k4(cArrM67365dy, i4, length, cArr, iM65348x1);
                                        i4 += 2;
                                    } else {
                                        if (c <= 127 || c >= 65534) {
                                            iM65348x1 = m65329k4((int) c, cArr, iM65348x1, false);
                                        } else {
                                            cArr[iM65348x1] = c;
                                            iM65348x1++;
                                        }
                                        i4++;
                                    }
                                }
                            }
                        } else if (this.f46488ar == 0) {
                            int i9 = i4 + 1;
                            try {
                                if (cArrM67365dy[i9] == '\n') {
                                    i4 = i9;
                                }
                            } catch (IndexOutOfRangeException | ArrayIndexOutOfBoundsException unused) {
                            }
                            iM65348x1 = m65348x1(iM65348x1);
                        } else {
                            cArr[iM65348x1] = c;
                        }
                        iM65348x1++;
                    } else {
                        if (this.f46488ar != 0) {
                            cArr[iM65348x1] = c;
                            iM65348x1++;
                        }
                        iM65348x1 = m65348x1(iM65348x1);
                    }
                    i4++;
                }
                cArr[iM65348x1] = c;
                iM65348x1++;
                i4++;
            }
        }
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo21907k4(String str, String str2) {
        if (this.f46512wl && this.f46505qq) {
            m65344k4(false);
        }
        char[] cArr = this.f46497ix;
        int i = this.f46491c5;
        int i2 = i + 1;
        this.f46491c5 = i2;
        cArr[i] = '<';
        this.f46491c5 = i + 2;
        cArr[i2] = '?';
        m65341jd(str);
        if (str2.length() > 0) {
            char[] cArr2 = this.f46497ix;
            int i3 = this.f46491c5;
            this.f46491c5 = i3 + 1;
            cArr2[i3] = ControlChar.SPACE_CHAR;
            m65342k4(str2, 63);
        }
        char[] cArr3 = this.f46497ix;
        int i4 = this.f46491c5;
        int i5 = i4 + 1;
        this.f46491c5 = i5;
        cArr3[i4] = '?';
        this.f46491c5 = i4 + 2;
        cArr3[i5] = '>';
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo12953k4(String str, String str2, String str3) {
        if (this.f46512wl && this.f46505qq) {
            m65344k4(false);
        }
        char[] cArr = this.f46497ix;
        int i = this.f46491c5;
        this.f46491c5 = i + 1;
        cArr[i] = '<';
        if (str != null && str.length() != 0) {
            m65341jd(str);
            char[] cArr2 = this.f46497ix;
            int i2 = this.f46491c5;
            this.f46491c5 = i2 + 1;
            cArr2[i2] = ':';
        }
        m65341jd(str2);
        this.f46509up = this.f46491c5;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo21908k4(String str, String str2, String str3, String str4) {
        if (this.f46512wl && this.f46505qq) {
            m65344k4(false);
        }
        m65341jd("<!DOCTYPE ");
        m65341jd(str);
        if (str2 != null) {
            m65341jd(" PUBLIC \"");
            m65341jd(str2);
            m65341jd("\" \"");
            if (str3 != null) {
                m65341jd(str3);
            }
            char[] cArr = this.f46497ix;
            int i = this.f46491c5;
            this.f46491c5 = i + 1;
            cArr[i] = '\"';
        } else if (str3 != null) {
            m65341jd(" SYSTEM \"");
            m65341jd(str3);
            char[] cArr2 = this.f46497ix;
            int i2 = this.f46491c5;
            this.f46491c5 = i2 + 1;
            cArr2[i2] = '\"';
        } else {
            char[] cArr3 = this.f46497ix;
            int i3 = this.f46491c5;
            this.f46491c5 = i3 + 1;
            cArr3[i3] = ControlChar.SPACE_CHAR;
        }
        if (str4 != null) {
            char[] cArr4 = this.f46497ix;
            int i4 = this.f46491c5;
            this.f46491c5 = i4 + 1;
            cArr4[i4] = '[';
            m65341jd(str4);
            char[] cArr5 = this.f46497ix;
            int i5 = this.f46491c5;
            this.f46491c5 = i5 + 1;
            cArr5[i5] = ']';
        }
        char[] cArr6 = this.f46497ix;
        int i6 = this.f46491c5;
        this.f46491c5 = i6 + 1;
        cArr6[i6] = '>';
    }

    /* JADX INFO: renamed from: k4 */
    public final void m65343k4(String str, String str2, boolean z) {
        char cCharAt;
        if (z) {
            if (!this.f46494dy.m66334k4(str)) {
                throw new ArgumentException(C13968ri.m65819k4("XmlWriterSettings.{0} can contain only valid XML white space characters when XmlWriterSettings.CheckCharacters and XmlWriterSettings.NewLineOnAttributes are true.", str2));
            }
            return;
        }
        int i = 0;
        while (i < str.length()) {
            if (!this.f46494dy.m66337m9(str.charAt(i)) && (cCharAt = str.charAt(i)) != '\t' && cCharAt != '\n' && cCharAt != '\r') {
                if (cCharAt == '&' || cCharAt == '<' || cCharAt == ']') {
                    throw new ArgumentException(C13968ri.m65819k4("XmlWriterSettings.{0} can contain only valid XML text content characters when XmlWriterSettings.CheckCharacters is true. {1}", str2, C13968ri.m65819k4("'{0}', hexadecimal value {1}, is an invalid character.", XmlException.buildCharExceptionArgs(str, i))));
                }
                if (C14022y4.m66321k4((int) str.charAt(i))) {
                    i++;
                    if (i >= str.length() || !C14022y4.m66327x1((int) str.charAt(i))) {
                        throw new ArgumentException(C13968ri.m65819k4("XmlWriterSettings.{0} can contain only valid XML text content characters when XmlWriterSettings.CheckCharacters is true. {1}", str2, C13968ri.m65818k4("The surrogate pair is invalid. Missing a low surrogate character.")));
                    }
                } else if (C14022y4.m66327x1((int) str.charAt(i))) {
                    throw new ArgumentException(C13968ri.m65819k4("XmlWriterSettings.{0} can contain only valid XML text content characters when XmlWriterSettings.CheckCharacters is true. {1}", str2, C13968ri.m65819k4("Invalid high surrogate character (0x{0}). A high surrogate character must have a value from range (0xD800 - 0xDBFF).", C14114y9.m67461k4(str.charAt(i), "X", C11697x1.m55250kk()))));
                }
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m65344k4(boolean z) {
        this.f46505qq = z;
        if (this.f46499k4 + 1 == this.f46514x1.length) {
            m65337up();
        }
        int[] iArr = this.f46514x1;
        int i = this.f46499k4 + 1;
        this.f46499k4 = i;
        iArr[i] = this.f46491c5;
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13965r5, com.aspose.slides.p559ms.System.Xml.AbstractC13958qb
    /* JADX INFO: renamed from: k4 */
    public void mo21909k4(char[] cArr, int i, int i2) {
        if (this.f46512wl && !this.f46505qq) {
            m65344k4(true);
        }
        int i3 = i2 + i;
        if (this.f46515x6) {
            m65346kk(cArr, i, i3);
        } else {
            m65347to(cArr, i, i3);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m65345k4(char[] cArr, int[] iArr, int i, char[] cArr2, int[] iArr2) {
        char c = cArr[iArr[0]];
        if (C14022y4.m66325kk((int) c)) {
            iArr2[0] = m65331k4(cArr, iArr[0], i, cArr2, iArr2[0]);
            iArr[0] = iArr[0] + 2;
        } else if (c <= 127 || c >= 65534) {
            iArr2[0] = m65329k4((int) c, cArr2, iArr2[0], false);
            iArr[0] = iArr[0] + 1;
        } else {
            int i2 = iArr2[0];
            cArr2[i2] = c;
            iArr2[0] = i2 + 1;
            iArr[0] = iArr[0] + 1;
        }
    }
}
