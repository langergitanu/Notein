package com.aspose.slides.internal.p393s7;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p048bv.C1868rv;
import com.aspose.slides.internal.p048bv.InterfaceC1858du;
import com.aspose.slides.internal.p090dq.InterfaceC3212k4;
import com.aspose.slides.internal.p090dq.InterfaceC3213x1;
import com.aspose.slides.internal.p223ka.C5659x1;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p353q7.C9763ck;
import com.aspose.slides.internal.p353q7.C9790ts;
import com.aspose.slides.internal.p431ty.C11240k4;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.ControlChar;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;

/* JADX INFO: renamed from: com.aspose.slides.internal.s7.to */
/* JADX INFO: loaded from: classes4.dex */
public class C10161to implements InterfaceC3212k4, InterfaceC3213x1 {

    /* JADX INFO: renamed from: k4 */
    public static final C10155jd f36563k4 = new C10155jd("any", "normal", 400, 97, 0);

    /* JADX INFO: renamed from: du */
    private int f36564du;

    /* JADX INFO: renamed from: h4 */
    private InterfaceC10158ks f36565h4;

    /* JADX INFO: renamed from: kk */
    private C10155jd f36566kk;

    /* JADX INFO: renamed from: m9 */
    private C5659x1 f36567m9 = null;

    /* JADX INFO: renamed from: to */
    private int f36568to;

    /* JADX INFO: renamed from: x1 */
    private String f36569x1;

    public C10161to(String str, C10155jd c10155jd, InterfaceC10158ks interfaceC10158ks, int i, int i2) {
        this.f36569x1 = str;
        this.f36566kk = c10155jd;
        this.f36565h4 = interfaceC10158ks;
        this.f36568to = i;
        this.f36564du = i2;
    }

    /* JADX INFO: renamed from: c5 */
    public final int m49967c5() {
        return this.f36568to;
    }

    /* JADX INFO: renamed from: ck */
    public final int m49968ck() {
        return this.f36565h4.mo15564du(this.f36568to) / 1000;
    }

    /* JADX INFO: renamed from: du */
    public final int m49969du() {
        return this.f36565h4.mo15574x1(this.f36568to) / 1000;
    }

    /* JADX INFO: renamed from: dy */
    public final C10155jd m49970dy() {
        return this.f36566kk;
    }

    /* JADX INFO: renamed from: fa */
    public final boolean m49971fa() {
        return this.f36565h4.mo15573to();
    }

    /* JADX INFO: renamed from: h4 */
    public final int m49972h4() {
        return this.f36565h4.mo15572to(this.f36568to) / 1000;
    }

    /* JADX INFO: renamed from: jd */
    public final int m49973jd() {
        return this.f36564du;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m49974k4(char c, char c2) {
        Dictionary<Integer, Integer> dictionary = m49983up().get_Item(Integer.valueOf(c));
        if (dictionary == null || !dictionary.containsKey(Integer.valueOf(c2))) {
            return 0;
        }
        return (m49967c5() * dictionary.get_Item(Integer.valueOf(c2)).intValue()) / 1000;
    }

    /* JADX INFO: renamed from: kk */
    public final int m49979kk(int i) {
        if (i < 65536) {
            return m49984x1((char) i);
        }
        return -1;
    }

    /* JADX INFO: renamed from: m9 */
    public final String m49981m9() {
        return this.f36569x1;
    }

    /* JADX INFO: renamed from: to */
    public final InterfaceC10158ks m49982to() {
        return this.f36565h4;
    }

    public String toString() {
        C6765kp c6765kp = new C6765kp();
        c6765kp.m26780k4('{');
        c6765kp.m26792k4(this.f36569x1);
        c6765kp.m26780k4(',');
        c6765kp.m26805kk(this.f36568to);
        c6765kp.m26780k4('}');
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: up */
    public final Dictionary<Integer, Dictionary<Integer, Integer>> m49983up() {
        return this.f36565h4.mo15573to() ? this.f36565h4.mo15565du() : new Dictionary<>();
    }

    /* JADX INFO: renamed from: x1 */
    public final int m49984x1(char c) {
        if (c == '\n' || c == '\r' || c == '\t' || c == 160) {
            return m49984x1(ControlChar.SPACE_CHAR);
        }
        if (c >= 8234 && c <= 8238) {
            return 0;
        }
        int iM49975k4 = m49978k4(c) ? m49975k4(m49985x1((int) c)) : -1;
        if (iM49975k4 > 0) {
            return iM49975k4;
        }
        int iM49967c5 = m49967c5();
        int i = iM49967c5 / 2;
        if (c != ' ') {
            if (c == 8192) {
                return i;
            }
            if (c != 8193) {
                if (c == 8194) {
                    return i;
                }
                if (c == 8195) {
                    return m49967c5();
                }
                if (c == 8196) {
                    return iM49967c5 / 3;
                }
                if (c == 8197) {
                    return iM49967c5 / 4;
                }
                if (c == 8198) {
                    return iM49967c5 / 6;
                }
                if (c == 8199) {
                    return m49984x1('0');
                }
                if (c == 8200) {
                    return m49984x1(FilenameUtils.EXTENSION_SEPARATOR);
                }
                if (c == 8201) {
                    return iM49967c5 / 5;
                }
                if (c == 8202) {
                    return iM49967c5 / 10;
                }
                if (c == 8203) {
                    return 0;
                }
                if (c == 8239) {
                    return m49984x1(ControlChar.SPACE_CHAR) / 2;
                }
                if (c == 8288) {
                    return 0;
                }
                if (c == 12288) {
                    return m49984x1(ControlChar.SPACE_CHAR) * 2;
                }
                if (c == 65279) {
                    return 0;
                }
                return m49975k4(m49985x1((int) c));
            }
        }
        return iM49967c5;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m49975k4(int i) {
        return C7019kk.m27462to(Float.valueOf(this.f36565h4.mo15567k4(i, this.f36568to) / 1000.0f), 13);
    }

    /* JADX INFO: renamed from: kk */
    public final C5659x1 m49980kk() {
        if (this.f36567m9 == null) {
            C10155jd c10155jdM49970dy = m49970dy();
            int iM49938kk = c10155jdM49970dy.m49938kk();
            String strM49940x1 = c10155jdM49970dy.m49940x1();
            byte b = ("italic".equals(strM49940x1) || "oblique".equals(strM49940x1)) ? (byte) 2 : (byte) 0;
            if (iM49938kk >= 600) {
                b = (byte) ((b & 255) | 1);
            }
            String strMo15575x1 = m49982to().mo15575x1();
            C9790ts c9790tsM9782k4 = C1868rv.m9778k4().m9782k4(strMo15575x1, strM49940x1, iM49938kk);
            if (c9790tsM9782k4 != null) {
                this.f36567m9 = new C5659x1(m49967c5() / 1000.0f, b & 255, c9790tsM9782k4);
            } else {
                if ("Helvetica-Bold".equals(strMo15575x1) || "Helvetica-BoldOblique".equals(strMo15575x1)) {
                    strMo15575x1 = "Helvetica";
                } else if ("Courier-Bold".equals(strMo15575x1) || "Courier-BoldOblique".equals(strMo15575x1)) {
                    strMo15575x1 = "Courier";
                }
                this.f36567m9 = C9763ck.m48030to().m48332k4(strMo15575x1, m49967c5() / 1000.0f, b & 255, C11240k4.m54221x1(strMo15575x1));
            }
        }
        return this.f36567m9;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m49985x1(int i) {
        if (C7019kk.m27469x1(this.f36565h4, AbstractC10164x6.class)) {
            return ((AbstractC10164x6) this.f36565h4).mo15566k4(i);
        }
        int iM49941k4 = C10163x1.m49987k4("WinAnsiEncoding").m49941k4(i);
        if (iM49941k4 != 0) {
            return iM49941k4;
        }
        return 35;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m49976k4(int i, int i2) {
        if (i > 65536) {
            return 0;
        }
        if ((i >= 55296 && i <= 57344) || i2 > 65536) {
            return 0;
        }
        if (i2 < 55296 || i2 > 57344) {
            return m49974k4((char) i, (char) i2);
        }
        return 0;
    }

    @Override // com.aspose.slides.internal.p090dq.InterfaceC3213x1
    /* JADX INFO: renamed from: x1 */
    public final boolean mo13928x1() {
        if (C7019kk.m27469x1(this.f36565h4, InterfaceC3213x1.class)) {
            return ((InterfaceC3213x1) this.f36565h4).mo13928x1();
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m49977k4(String str) {
        if (str == null) {
            return 0;
        }
        int length = str.length();
        char[] cArrM67425kk = C14113y2.m67425kk(str, 0, length);
        int iM49984x1 = 0;
        for (int i = 0; i < length; i++) {
            iM49984x1 += m49984x1(cArrM67425kk[i]);
        }
        return iM49984x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final int[][] m49986x1(InterfaceC1858du interfaceC1858du, String str, String str2) {
        return mo13925k4(interfaceC1858du, str, str2, this.f36568to);
    }

    @Override // com.aspose.slides.internal.p090dq.InterfaceC3213x1
    /* JADX INFO: renamed from: k4 */
    public final InterfaceC1858du mo13926k4(InterfaceC1858du interfaceC1858du, String str, String str2) {
        if (C7019kk.m27469x1(this.f36565h4, InterfaceC3213x1.class)) {
            return ((InterfaceC3213x1) this.f36565h4).mo13926k4(interfaceC1858du, str, str2);
        }
        throw new NotSupportedException();
    }

    @Override // com.aspose.slides.internal.p090dq.InterfaceC3213x1
    /* JADX INFO: renamed from: k4 */
    public final InterfaceC1858du mo13927k4(InterfaceC1858du interfaceC1858du, int[][] iArr, String str, String str2) {
        if (C7019kk.m27469x1(this.f36565h4, InterfaceC3213x1.class)) {
            return ((InterfaceC3213x1) this.f36565h4).mo13927k4(interfaceC1858du, iArr, str, str2);
        }
        throw new NotSupportedException();
    }

    @Override // com.aspose.slides.internal.p090dq.InterfaceC3212k4
    /* JADX INFO: renamed from: k4 */
    public final boolean mo13924k4() {
        if (C7019kk.m27469x1(this.f36565h4, InterfaceC3212k4.class)) {
            return ((InterfaceC3212k4) this.f36565h4).mo13924k4();
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m49978k4(char c) {
        return C7019kk.m27469x1(this.f36565h4, AbstractC10164x6.class) ? ((AbstractC10164x6) this.f36565h4).mo15569k4(c) : C10163x1.m49987k4("WinAnsiEncoding").m49941k4(c) > 0;
    }

    @Override // com.aspose.slides.internal.p090dq.InterfaceC3212k4
    /* JADX INFO: renamed from: k4 */
    public final int[][] mo13925k4(InterfaceC1858du interfaceC1858du, String str, String str2, int i) {
        if (C7019kk.m27469x1(this.f36565h4, InterfaceC3212k4.class)) {
            return ((InterfaceC3212k4) this.f36565h4).mo13925k4(interfaceC1858du, str, str2, i);
        }
        throw new NotSupportedException();
    }
}
