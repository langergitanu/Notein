package com.aspose.slides.internal.p333p8;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p329p4.C7182dy;
import com.aspose.slides.internal.p329p4.C7191up;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.words.ControlChar;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: renamed from: com.aspose.slides.internal.p8.ck */
/* JADX INFO: loaded from: classes4.dex */
public class C9422ck implements IDisposable {

    /* JADX INFO: renamed from: k4 */
    private final AbstractC3150x6 f34299k4;

    /* JADX INFO: renamed from: x1 */
    private static final byte[] f34298x1 = new byte[2048];

    /* JADX INFO: renamed from: kk */
    private static final byte[] f34296kk = {101, 110, 100, 115, 116, 114, 101, 97, 109};

    /* JADX INFO: renamed from: to */
    private static final byte[] f34297to = {101, 110, 100, 111, 98, 106};

    public C9422ck(AbstractC3150x6 abstractC3150x6) {
        this.f34299k4 = abstractC3150x6;
        abstractC3150x6.seek(0L, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
    
        return com.aspose.slides.internal.p329p4.C7191up.m27841k4(r0.toString());
     */
    /* JADX INFO: renamed from: ix */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private C7191up m46106ix() {
        char cM46114du;
        C6765kp c6765kp = new C6765kp();
        while (true) {
            char cM46114du2 = (char) m46114du();
            if (!m46108kk(cM46114du2)) {
                if (cM46114du2 == '>') {
                    break;
                }
                if (cM46114du2 < 0) {
                    throw new IOException("Missing closing bracket for hex string. Reached EOS");
                }
                if (cM46114du2 != ' ' && cM46114du2 != '\n' && cM46114du2 != '\t' && cM46114du2 != '\r' && cM46114du2 != '\b' && cM46114du2 != '\f') {
                    if (c6765kp.m26807x1() % 2 != 0) {
                        c6765kp.m26809x1(c6765kp.m26807x1() - 1, 1);
                    }
                    do {
                        cM46114du = (char) m46114du();
                        if (cM46114du == '>') {
                            break;
                        }
                    } while (cM46114du >= 0);
                    if (cM46114du < 0) {
                        throw new IOException("Missing closing bracket for hex string. Reached EOS");
                    }
                }
            } else {
                c6765kp.m26780k4(cM46114du2);
            }
        }
    }

    /* JADX INFO: renamed from: c5 */
    public final long m46112c5() {
        return m46113ck();
    }

    /* JADX INFO: renamed from: ck */
    public final long m46113ck() {
        m46130up();
        try {
            return C14080ne.m66866du(m46128rv());
        } catch (RuntimeException unused) {
            return 0L;
        }
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public final void dispose() {
        AbstractC3150x6 abstractC3150x6 = this.f34299k4;
        if (abstractC3150x6 == null) {
            return;
        }
        abstractC3150x6.dispose();
    }

    /* JADX INFO: renamed from: du */
    public final int m46114du() {
        return this.f34299k4.readByte();
    }

    /* JADX INFO: renamed from: dy */
    public final String m46115dy() {
        long jM46121k4 = m46121k4();
        String strM46134yj = m46134yj();
        m46123k4(jM46121k4);
        return strM46134yj;
    }

    /* JADX INFO: renamed from: fa */
    public final int m46116fa() {
        m46130up();
        try {
            return C14080ne.m67015to(m46128rv());
        } catch (RuntimeException unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: h4 */
    public final int m46117h4() {
        long position = this.f34299k4.getPosition();
        int i = this.f34299k4.readByte();
        this.f34299k4.setPosition(position);
        return i;
    }

    /* JADX INFO: renamed from: jd */
    public final int m46118jd() {
        return m46116fa();
    }

    /* JADX INFO: renamed from: k4 */
    public final int m46119k4(byte[] bArr) {
        return this.f34299k4.read(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: kk */
    public final void m46124kk() {
        m46123k4(m46121k4() - 1);
    }

    /* JADX INFO: renamed from: ks */
    public final C7182dy m46125ks() {
        int iM46114du;
        C6005k4.m24262k4(m46114du() == 47, "CosName should start from /");
        C6765kp c6765kp = new C6765kp();
        loop0: while (true) {
            iM46114du = m46114du();
            while (true) {
                if (iM46114du == -1) {
                    break loop0;
                }
                char c = (char) iM46114du;
                if (c == '#') {
                    char cM46114du = (char) m46114du();
                    char cM46114du2 = (char) m46114du();
                    if (m46108kk(cM46114du) && m46108kk(cM46114du2)) {
                        c6765kp.m26780k4((char) C14080ne.m67044x1(C14113y2.m67402k4("{0}{1}", Character.valueOf(cM46114du), Character.valueOf(cM46114du2)), 16));
                        break;
                    }
                    m46124kk();
                    c6765kp.m26780k4(c);
                    iM46114du = cM46114du;
                } else {
                    if (m46107k4(c)) {
                        break;
                    }
                    c6765kp.m26780k4(c);
                }
            }
        }
        if (iM46114du != -1) {
            m46124kk();
        }
        return C7182dy.m27763k4(c6765kp.toString());
    }

    /* JADX INFO: renamed from: m9 */
    public final char m46126m9() {
        long position = this.f34299k4.getPosition();
        char c = (char) this.f34299k4.readByte();
        this.f34299k4.setPosition(position);
        return c;
    }

    /* JADX INFO: renamed from: ne */
    public final C7191up m46127ne() {
        int iM46114du;
        char cM46114du = (char) m46114du();
        if (cM46114du == '<') {
            return m46106ix();
        }
        int iM46109m9 = 1;
        C6005k4.m24262k4(cM46114du == '(', C14113y2.m67402k4("parseCOSString string should start with '(' or '<' and not '{0}'", Character.valueOf(cM46114du)));
        C6765kp c6765kp = new C6765kp();
        while (true) {
            iM46114du = m46114du();
            while (iM46109m9 > 0 && iM46114du != -1) {
                char cM46114du2 = (char) iM46114du;
                if (cM46114du2 == ')') {
                    iM46109m9 = m46109m9(iM46109m9 - 1);
                    if (iM46109m9 != 0) {
                        c6765kp.m26780k4(cM46114du2);
                    }
                    iM46114du = -2;
                } else {
                    if (cM46114du2 == '(') {
                        iM46109m9++;
                    } else if (cM46114du2 == '\\') {
                        cM46114du2 = (char) m46114du();
                        if (cM46114du2 == '\n' || cM46114du2 == '\r') {
                            do {
                                iM46114du = m46114du();
                                if (m46111x1(iM46114du)) {
                                }
                            } while (iM46114du != -1);
                        } else if (cM46114du2 != '\\') {
                            if (cM46114du2 == 'b') {
                                c6765kp.m26780k4('\b');
                            } else if (cM46114du2 == 'f') {
                                cM46114du2 = '\f';
                            } else if (cM46114du2 == 'n') {
                                c6765kp.m26780k4('\n');
                            } else if (cM46114du2 == 'r') {
                                c6765kp.m26780k4(ControlChar.PARAGRAPH_BREAK_CHAR);
                            } else if (cM46114du2 == 't') {
                                cM46114du2 = '\t';
                            } else if (cM46114du2 != '(') {
                                if (cM46114du2 != ')') {
                                    switch (cM46114du2) {
                                        case '0':
                                        case '1':
                                        case '2':
                                        case '3':
                                        case '4':
                                        case '5':
                                        case '6':
                                        case '7':
                                            C6765kp c6765kp2 = new C6765kp();
                                            c6765kp2.m26780k4(cM46114du2);
                                            iM46114du = m46114du();
                                            char c = (char) iM46114du;
                                            if (c >= '0' && c <= '7') {
                                                c6765kp2.m26780k4(c);
                                                iM46114du = m46114du();
                                                char c2 = (char) iM46114du;
                                                if (c2 >= '0' && c2 <= '7') {
                                                    c6765kp2.m26780k4(c2);
                                                    iM46114du = -2;
                                                }
                                            }
                                            c6765kp.m26780k4((char) C14080ne.m67044x1(c6765kp2.toString(), 8));
                                            break;
                                    }
                                } else {
                                    iM46109m9 = m46109m9(iM46109m9);
                                    if (iM46109m9 == 0) {
                                        c6765kp.m26780k4(IOUtils.DIR_SEPARATOR_WINDOWS);
                                    }
                                }
                            }
                            iM46114du = -2;
                        }
                    }
                    c6765kp.m26780k4(cM46114du2);
                    iM46114du = -2;
                }
                if (iM46114du != -2) {
                }
            }
        }
        if (iM46114du != -1) {
            m46124kk();
        }
        return new C7191up(c6765kp.toString());
    }

    /* JADX INFO: renamed from: rv */
    public final String m46128rv() {
        int iM46114du;
        C6765kp c6765kp = new C6765kp();
        while (true) {
            iM46114du = m46114du();
            if (iM46114du == 32 || iM46114du == 10 || iM46114du == 13 || iM46114du == 60 || iM46114du == 91 || iM46114du == 40 || iM46114du == 0 || iM46114du == -1) {
                break;
            }
            c6765kp.m26780k4((char) iM46114du);
        }
        if (iM46114du != -1) {
            m46124kk();
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: to */
    public final String m46129to() {
        if (m46132x1()) {
            return null;
        }
        C6765kp c6765kp = new C6765kp();
        while (true) {
            int iM46114du = m46114du();
            if (iM46114du == -1 || m46111x1(iM46114du)) {
                break;
            }
            c6765kp.m26780k4((char) iM46114du);
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: up */
    public final void m46130up() {
        int iM46114du;
        loop0: while (true) {
            iM46114du = m46114du();
            while (true) {
                if (!m46110to(iM46114du) && iM46114du != 37) {
                    break loop0;
                }
                if (iM46114du == 37) {
                    do {
                        iM46114du = m46114du();
                        if (!m46111x1(iM46114du)) {
                        }
                    } while (iM46114du != -1);
                }
            }
        }
        if (iM46114du != -1) {
            m46124kk();
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m46131x1(long j) {
        m46123k4(m46121k4() - j);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004c  */
    /* JADX INFO: renamed from: x6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<Byte> m46133x6() {
        int i;
        List<Byte> list = new List<>();
        byte[] bArr = f34296kk;
        int i2 = 0;
        while (true) {
            int iM46120k4 = m46120k4(f34298x1, i2, 2048 - i2);
            if (iM46120k4 <= 0) {
                return list;
            }
            int i3 = iM46120k4 + i2;
            int i4 = i3 - 5;
            int i5 = i2;
            while (true) {
                if (i2 >= i3) {
                    break;
                }
                int i6 = i2 + 5;
                if (i5 != 0 || i6 >= i4 || ((i = f34298x1[i6] & 255) <= 116 && i >= 97)) {
                    byte b = f34298x1[i2];
                    if (b == bArr[i5]) {
                        i5++;
                        if (i5 == bArr.length) {
                            i2++;
                            break;
                        }
                    } else if (i5 == 3) {
                        bArr = f34297to;
                        if (b == bArr[i5]) {
                            i5++;
                        } else {
                            i5 = b == 101 ? 1 : (b == 110 && i5 == 7) ? 2 : 0;
                            bArr = f34296kk;
                        }
                    }
                } else {
                    i2 = i6;
                }
                i2++;
            }
            int iM67483k4 = C14116yg.m67483k4(0, i2 - i5);
            if (iM67483k4 > 0) {
                byte[] bArr2 = new byte[iM67483k4];
                AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) f34298x1), 0, AbstractC14092to.m67208k4((Object) bArr2), 0, iM67483k4);
                list.addRange(AbstractC14092to.m67254x1(AbstractC14092to.m67208k4((Object) bArr2)));
            }
            if (i5 == bArr.length) {
                m46123k4(m46121k4() - ((long) (i3 - iM67483k4)));
                return list;
            }
            AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) bArr), 0, AbstractC14092to.m67208k4((Object) f34298x1), 0, i5);
            i2 = i5;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: yj */
    public final String m46134yj() {
        m46130up();
        C6765kp c6765kp = new C6765kp();
        while (true) {
            char cM46126m9 = m46126m9();
            if (m46107k4(cM46126m9) || m46104du(cM46126m9) || cM46126m9 == -1) {
                break;
            }
            c6765kp.m26780k4(cM46126m9);
            m46114du();
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: du */
    public static boolean m46104du(int i) {
        return i == 93;
    }

    /* JADX INFO: renamed from: h4 */
    public static boolean m46105h4(int i) {
        return i == 10 || i == 13 || i == 32;
    }

    /* JADX INFO: renamed from: kk */
    public static boolean m46108kk(int i) {
        if (i >= 48 && i <= 57) {
            return true;
        }
        if (i < 97 || i > 102) {
            return i >= 65 && i <= 70;
        }
        return true;
    }

    /* JADX INFO: renamed from: m9 */
    private int m46109m9(int i) {
        long jM46121k4 = m46121k4();
        byte[] bArr = new byte[3];
        int iM46119k4 = m46119k4(bArr);
        if (iM46119k4 == 3) {
            byte b = bArr[0];
            if (((b & 255) == 13 && (bArr[1] & 255) == 10 && (bArr[2] & 255) == 47) || ((b & 255) == 13 && (bArr[1] & 255) == 47)) {
                i = 0;
            }
        }
        if (iM46119k4 > 0) {
            m46123k4(jM46121k4);
        }
        return i;
    }

    /* JADX INFO: renamed from: to */
    public static boolean m46110to(int i) {
        return i == 0 || i == 9 || i == 12 || i == 10 || i == 13 || i == 32;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m46120k4(byte[] bArr, int i, int i2) {
        return this.f34299k4.read(bArr, i, i2);
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m46132x1() {
        return m46117h4() < 0;
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m46111x1(int i) {
        return i == 10 || i == 13;
    }

    /* JADX INFO: renamed from: k4 */
    public final long m46121k4() {
        return this.f34299k4.getPosition();
    }

    /* JADX INFO: renamed from: k4 */
    public final String m46122k4(int i) {
        m46130up();
        char cM46126m9 = m46126m9();
        C6765kp c6765kp = new C6765kp(i);
        while (!m46110to(cM46126m9) && !m46104du(cM46126m9) && cM46126m9 != 65535 && c6765kp.m26807x1() < i && cM46126m9 != '[' && cM46126m9 != '<' && cM46126m9 != '(' && cM46126m9 != '/') {
            c6765kp.m26780k4(cM46126m9);
            m46114du();
            cM46126m9 = m46126m9();
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m46123k4(long j) {
        this.f34299k4.setPosition(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public static boolean m46107k4(char c) {
        return c == 32 || c == 13 || c == 10 || c == 9 || c == 62 || c == 60 || c == 91 || c == 47 || c == 93 || c == 41 || c == 40 || c == 0 || c == 12 || c == -1;
    }
}
