package com.aspose.slides.internal.p051bz;

import com.aspose.slides.internal.p380ri.C10009ck;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.bz.bv */
/* JADX INFO: loaded from: classes3.dex */
public class C1906bv {

    /* JADX INFO: renamed from: dy */
    private static final String f6839dy = C14113y2.m67408k4("0123456789", "abcdefABCDEF");

    /* JADX INFO: renamed from: du */
    private String f6840du;

    /* JADX INFO: renamed from: m9 */
    private int f6844m9;

    /* JADX INFO: renamed from: k4 */
    protected int f6842k4 = 0;

    /* JADX INFO: renamed from: x1 */
    protected String f6846x1 = null;

    /* JADX INFO: renamed from: kk */
    protected int f6843kk = 0;

    /* JADX INFO: renamed from: to */
    private int f6845to = 0;

    /* JADX INFO: renamed from: h4 */
    private int f6841h4 = 0;

    public C1906bv(String str) {
        this.f6840du = str;
        this.f6844m9 = str.length();
    }

    /* JADX INFO: renamed from: du */
    private void m9858du() {
        int i;
        do {
            i = this.f6841h4 + 1;
            this.f6841h4 = i;
            if (i >= this.f6844m9) {
                return;
            }
        } while (m9866to(this.f6840du.charAt(i)));
    }

    /* JADX INFO: renamed from: dy */
    private boolean m9859dy() {
        for (int i = this.f6841h4; i < this.f6844m9; i++) {
            char cCharAt = this.f6840du.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                if (cCharAt != '(') {
                    return false;
                }
                this.f6841h4 = i + 1;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h4 */
    private void m9860h4() {
        while (true) {
            int i = this.f6841h4;
            if (i >= this.f6844m9 || !m9861k4(this.f6840du.charAt(i))) {
                return;
            } else {
                this.f6841h4++;
            }
        }
    }

    /* JADX INFO: renamed from: kk */
    private void m9862kk() {
        int i = this.f6841h4;
        if (i >= this.f6844m9) {
            throw new C1921qq("illegal character '#'");
        }
        this.f6841h4 = i + 1;
        m9864m9();
        int i2 = (this.f6841h4 - this.f6845to) - 1;
        if (i2 % 3 == 0 || i2 % 4 == 0) {
            this.f6842k4 = 15;
        } else {
            m9858du();
            this.f6842k4 = 1;
        }
        this.f6846x1 = C10009ck.m49139k4(this.f6840du, this.f6845to, this.f6841h4);
    }

    /* JADX INFO: renamed from: m9 */
    private void m9864m9() {
        while (true) {
            int i = this.f6841h4;
            if (i >= this.f6844m9 || !m9868x1(this.f6840du.charAt(i))) {
                return;
            } else {
                this.f6841h4++;
            }
        }
    }

    /* JADX INFO: renamed from: to */
    private void m9865to() {
        int i = this.f6841h4;
        if (i >= this.f6844m9 || !m9863kk(this.f6840du.charAt(i))) {
            return;
        }
        m9858du();
    }

    /* JADX INFO: renamed from: x1 */
    private void m9867x1() {
        int i;
        int i2 = this.f6841h4;
        if (i2 >= this.f6844m9 || !m9861k4(this.f6840du.charAt(i2))) {
            throw new C1921qq("illegal character '.'");
        }
        this.f6841h4++;
        m9860h4();
        int i3 = this.f6841h4;
        if (i3 >= this.f6844m9 || this.f6840du.charAt(i3) != '%') {
            this.f6843kk = this.f6841h4;
            m9865to();
            int i4 = this.f6841h4 - this.f6843kk;
            this.f6843kk = i4;
            i = i4 > 0 ? 12 : 16;
        } else {
            this.f6841h4++;
            i = 14;
        }
        this.f6842k4 = i;
        this.f6846x1 = C10009ck.m49139k4(this.f6840du, this.f6845to, this.f6841h4);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m9869k4() {
        int i;
        this.f6846x1 = null;
        while (true) {
            this.f6845to = this.f6841h4;
            int i2 = this.f6841h4;
            boolean z = false;
            if (i2 >= this.f6844m9) {
                this.f6842k4 = 0;
                return;
            }
            String str = this.f6840du;
            this.f6841h4 = i2 + 1;
            char cCharAt = str.charAt(i2);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                if (cCharAt != '\"') {
                    if (cCharAt == '#') {
                        m9862kk();
                        return;
                    }
                    switch (cCharAt) {
                        case '\'':
                            break;
                        case '(':
                            this.f6842k4 = 3;
                            return;
                        case ')':
                            this.f6842k4 = 4;
                            return;
                        case '*':
                            this.f6842k4 = 2;
                            return;
                        case '+':
                            this.f6842k4 = 8;
                            return;
                        case ',':
                            this.f6842k4 = 13;
                            return;
                        case '-':
                            this.f6842k4 = 9;
                            return;
                        case '.':
                            m9867x1();
                            return;
                        default:
                            switch (cCharAt) {
                                case '0':
                                case '1':
                                case '2':
                                case '3':
                                case '4':
                                case '5':
                                case '6':
                                case '7':
                                case '8':
                                case '9':
                                    m9860h4();
                                    int i3 = this.f6841h4;
                                    if (i3 < this.f6844m9 && this.f6840du.charAt(i3) == '.') {
                                        int i4 = this.f6841h4 + 1;
                                        this.f6841h4 = i4;
                                        if (i4 < this.f6844m9 && m9861k4(this.f6840du.charAt(i4))) {
                                            this.f6841h4++;
                                            m9860h4();
                                        }
                                        z = true;
                                    }
                                    int i5 = this.f6841h4;
                                    if (i5 >= this.f6844m9 || this.f6840du.charAt(i5) != '%') {
                                        this.f6843kk = this.f6841h4;
                                        m9865to();
                                        int i6 = this.f6841h4 - this.f6843kk;
                                        this.f6843kk = i6;
                                        i = i6 > 0 ? 12 : z ? 16 : 17;
                                    } else {
                                        this.f6841h4++;
                                        i = 14;
                                    }
                                    this.f6842k4 = i;
                                    this.f6846x1 = C10009ck.m49139k4(this.f6840du, this.f6845to, this.f6841h4);
                                    return;
                                default:
                                    this.f6841h4--;
                                    m9865to();
                                    int i7 = this.f6841h4;
                                    int i8 = this.f6845to;
                                    if (i7 == i8) {
                                        throw new C1921qq("illegal character");
                                    }
                                    String strM49139k4 = C10009ck.m49139k4(this.f6840du, i8, i7);
                                    this.f6846x1 = strM49139k4;
                                    if (C14113y2.m67363du(strM49139k4, "mod")) {
                                        this.f6842k4 = 10;
                                        return;
                                    }
                                    if (C14113y2.m67363du(this.f6846x1, "div")) {
                                        this.f6842k4 = 11;
                                        return;
                                    } else if (m9859dy()) {
                                        this.f6842k4 = 7;
                                        return;
                                    } else {
                                        this.f6842k4 = 1;
                                        return;
                                    }
                            }
                    }
                }
                int iM67434x1 = C14113y2.m67434x1(this.f6840du, cCharAt, this.f6841h4);
                this.f6841h4 = iM67434x1;
                if (iM67434x1 < 0) {
                    this.f6841h4 = this.f6845to + 1;
                    throw new C1921qq("missing quote");
                }
                String str2 = this.f6840du;
                int i9 = this.f6845to + 1;
                this.f6841h4 = iM67434x1 + 1;
                this.f6846x1 = C10009ck.m49139k4(str2, i9, iM67434x1);
                this.f6842k4 = 5;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m9861k4(char c) {
        return C14113y2.m67429to("0123456789", c) >= 0;
    }

    /* JADX INFO: renamed from: kk */
    private static boolean m9863kk(char c) {
        return C14113y2.m67429to("_abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ", c) >= 0 || c >= 128;
    }

    /* JADX INFO: renamed from: to */
    private static boolean m9866to(char c) {
        return C14113y2.m67429to("_abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ", c) >= 0 || C14113y2.m67429to(".-0123456789", c) >= 0 || c >= 128;
    }

    /* JADX INFO: renamed from: x1 */
    private static boolean m9868x1(char c) {
        return C14113y2.m67429to(f6839dy, c) >= 0;
    }
}
