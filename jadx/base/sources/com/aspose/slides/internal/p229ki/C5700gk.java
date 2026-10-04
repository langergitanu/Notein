package com.aspose.slides.internal.p229ki;

import com.aspose.slides.exceptions.XPathException;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.aspose.slides.p559ms.System.Xml.C14022y4;
import com.huawei.hms.network.embedded.C18358t1;

/* JADX INFO: renamed from: com.aspose.slides.internal.ki.gk */
/* JADX INFO: loaded from: classes.dex */
public final class C5700gk {

    /* JADX INFO: renamed from: c5 */
    private boolean f15731c5;

    /* JADX INFO: renamed from: du */
    private String f15732du;

    /* JADX INFO: renamed from: h4 */
    private String f15734h4;

    /* JADX INFO: renamed from: k4 */
    private String f15736k4;

    /* JADX INFO: renamed from: kk */
    private int f15737kk;

    /* JADX INFO: renamed from: m9 */
    private String f15738m9;

    /* JADX INFO: renamed from: to */
    private char f15739to;

    /* JADX INFO: renamed from: x1 */
    private int f15740x1;

    /* JADX INFO: renamed from: dy */
    private double f15733dy = Double.NaN;

    /* JADX INFO: renamed from: jd */
    private C14022y4 f15735jd = C14022y4.m66318k4().Clone();

    public C5700gk(String str) {
        if (str == null) {
            throw XPathException.create("'{0}' is an invalid expression.", C14113y2.f47374k4);
        }
        this.f15736k4 = str;
        m23282jd();
        m23287dy();
    }

    /* JADX INFO: renamed from: c5 */
    private char m23279c5() {
        return this.f15739to;
    }

    /* JADX INFO: renamed from: ck */
    private void m23280ck() {
        while (this.f15735jd.m66333k4(m23279c5()) && m23282jd()) {
        }
    }

    /* JADX INFO: renamed from: fa */
    private double m23281fa() {
        int i = this.f15740x1 - 1;
        int i2 = 0;
        while (C14022y4.m66316c5(m23279c5())) {
            m23282jd();
            i2++;
        }
        if (m23279c5() == '.') {
            do {
                m23282jd();
                i2++;
            } while (C14022y4.m66316c5(m23279c5()));
        }
        return C13850af.m65076k4((Object) C14113y2.m67443x1(this.f15736k4, i, i2));
    }

    /* JADX INFO: renamed from: jd */
    private boolean m23282jd() {
        if (this.f15740x1 >= this.f15736k4.length()) {
            this.f15739to = (char) 0;
            return false;
        }
        String str = this.f15736k4;
        int i = this.f15740x1;
        this.f15740x1 = i + 1;
        this.f15739to = str.charAt(i);
        return true;
    }

    /* JADX INFO: renamed from: ks */
    private String m23283ks() {
        int i = this.f15740x1 - 1;
        int i2 = 0;
        while (this.f15735jd.m66342x1(m23279c5())) {
            m23282jd();
            i2++;
        }
        return C14113y2.m67443x1(this.f15736k4, i, i2);
    }

    /* JADX INFO: renamed from: up */
    private double m23284up() {
        int i = this.f15740x1 - 2;
        int i2 = 1;
        while (C14022y4.m66316c5(m23279c5())) {
            m23282jd();
            i2++;
        }
        return C13850af.m65076k4((Object) C14113y2.m67443x1(this.f15736k4, i, i2));
    }

    /* JADX INFO: renamed from: yj */
    private String m23285yj() {
        char cM23279c5 = m23279c5();
        m23282jd();
        int i = this.f15740x1 - 1;
        int i2 = 0;
        while (m23279c5() != cM23279c5) {
            if (!m23282jd()) {
                throw XPathException.create("This is an unclosed string.");
            }
            i2++;
        }
        m23282jd();
        return C14113y2.m67443x1(this.f15736k4, i, i2);
    }

    /* JADX INFO: renamed from: du */
    public final String m23286du() {
        return this.f15738m9;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0149  */
    /* JADX INFO: renamed from: dy */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m23287dy() {
        int iM66999m9;
        double dM23284up;
        String strM23283ks;
        m23280ck();
        char cM23279c5 = m23279c5();
        if (cM23279c5 == 0) {
            this.f15737kk = 69;
            return false;
        }
        if (cM23279c5 != '@' && cM23279c5 != '[' && cM23279c5 != ']' && cM23279c5 != '|') {
            switch (cM23279c5) {
                case '!':
                    this.f15737kk = 33;
                    m23282jd();
                    if (m23279c5() == '=') {
                        iM66999m9 = 78;
                        this.f15737kk = iM66999m9;
                        m23282jd();
                    }
                    break;
                case '\"':
                    this.f15737kk = 115;
                    this.f15738m9 = m23285yj();
                    break;
                case '#':
                case '$':
                    break;
                default:
                    switch (cM23279c5) {
                        case '\'':
                            break;
                        case '(':
                        case ')':
                        case '*':
                        case '+':
                        case ',':
                        case '-':
                            break;
                        case '.':
                            this.f15737kk = 46;
                            m23282jd();
                            if (m23279c5() == '.') {
                                iM66999m9 = 68;
                                this.f15737kk = iM66999m9;
                                m23282jd();
                            } else if (C14022y4.m66316c5(m23279c5())) {
                                this.f15737kk = 100;
                                dM23284up = m23284up();
                                this.f15733dy = dM23284up;
                            }
                            break;
                        case '/':
                            this.f15737kk = 47;
                            m23282jd();
                            if (m23279c5() == '/') {
                                iM66999m9 = 83;
                                this.f15737kk = iM66999m9;
                                m23282jd();
                            }
                            break;
                        default:
                            switch (cM23279c5) {
                                case '<':
                                    this.f15737kk = 60;
                                    m23282jd();
                                    if (m23279c5() == '=') {
                                        iM66999m9 = 76;
                                        this.f15737kk = iM66999m9;
                                        m23282jd();
                                    }
                                    break;
                                case '=':
                                    break;
                                case '>':
                                    this.f15737kk = 62;
                                    m23282jd();
                                    if (m23279c5() == '=') {
                                        iM66999m9 = 71;
                                        this.f15737kk = iM66999m9;
                                        m23282jd();
                                    }
                                    break;
                                default:
                                    if (C14022y4.m66316c5(m23279c5())) {
                                        this.f15737kk = 100;
                                        dM23284up = m23281fa();
                                        this.f15733dy = dM23284up;
                                    } else {
                                        if (!this.f15735jd.m66336kk(m23279c5())) {
                                            throw XPathException.create("'{0}' has an invalid token.", m23289k4());
                                        }
                                        this.f15737kk = 110;
                                        this.f15732du = m23283ks();
                                        this.f15734h4 = C14113y2.f47374k4;
                                        if (m23279c5() != ':') {
                                            m23280ck();
                                            if (m23279c5() == ':') {
                                                m23282jd();
                                                if (m23279c5() != ':') {
                                                    throw XPathException.create("'{0}' has an invalid qualified name.", m23289k4());
                                                }
                                                m23282jd();
                                                this.f15737kk = 97;
                                            }
                                            m23280ck();
                                            this.f15731c5 = m23279c5() == '(';
                                        } else {
                                            m23282jd();
                                            if (m23279c5() == ':') {
                                                m23282jd();
                                                this.f15737kk = 97;
                                            } else {
                                                this.f15734h4 = this.f15732du;
                                                if (m23279c5() == '*') {
                                                    m23282jd();
                                                    strM23283ks = C18358t1.g.f56183c;
                                                } else {
                                                    if (!this.f15735jd.m66336kk(m23279c5())) {
                                                        throw XPathException.create("'{0}' has an invalid qualified name.", m23289k4());
                                                    }
                                                    strM23283ks = m23283ks();
                                                }
                                                this.f15732du = strM23283ks;
                                            }
                                            m23280ck();
                                            this.f15731c5 = m23279c5() == '(';
                                        }
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            iM66999m9 = C14080ne.m66999m9(Character.valueOf(m23279c5()), C11697x1.m55250kk());
            this.f15737kk = iM66999m9;
            m23282jd();
        }
        return true;
    }

    /* JADX INFO: renamed from: h4 */
    public final double m23288h4() {
        return this.f15733dy;
    }

    /* JADX INFO: renamed from: k4 */
    public final String m23289k4() {
        return this.f15736k4;
    }

    /* JADX INFO: renamed from: kk */
    public final String m23290kk() {
        return this.f15732du;
    }

    /* JADX INFO: renamed from: m9 */
    public final boolean m23291m9() {
        return this.f15731c5;
    }

    /* JADX INFO: renamed from: to */
    public final String m23292to() {
        return this.f15734h4;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m23293x1() {
        return this.f15737kk;
    }
}
