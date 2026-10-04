package com.aspose.slides;

import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;
import com.aspose.words.ControlChar;

/* JADX INFO: loaded from: classes3.dex */
class a5d {

    /* JADX INFO: renamed from: c5 */
    private int f3792c5;

    /* JADX INFO: renamed from: ck */
    private String f3793ck;

    /* JADX INFO: renamed from: du */
    private String f3794du;

    /* JADX INFO: renamed from: dy */
    private String f3795dy;

    /* JADX INFO: renamed from: fa */
    private String f3796fa;

    /* JADX INFO: renamed from: h4 */
    private String f3797h4;

    /* JADX INFO: renamed from: jd */
    private String f3798jd;

    /* JADX INFO: renamed from: k4 */
    private int f3799k4;

    /* JADX INFO: renamed from: kk */
    private String f3800kk;

    /* JADX INFO: renamed from: ks */
    private String f3801ks;

    /* JADX INFO: renamed from: m9 */
    private String f3802m9;

    /* JADX INFO: renamed from: ne */
    private String f3803ne;

    /* JADX INFO: renamed from: rv */
    private String f3804rv;

    /* JADX INFO: renamed from: to */
    private String f3805to;

    /* JADX INFO: renamed from: up */
    private char f3806up;

    /* JADX INFO: renamed from: x1 */
    private char f3807x1;

    /* JADX INFO: renamed from: x6 */
    private char f3808x6;

    /* JADX INFO: renamed from: yj */
    private String f3809yj;

    public a5d() {
        m3251k4(0, 1);
    }

    /* JADX INFO: renamed from: c5 */
    public final int m3267c5() {
        return this.f3792c5;
    }

    /* JADX INFO: renamed from: ck */
    public final String m3268ck() {
        return this.f3793ck;
    }

    /* JADX INFO: renamed from: du */
    public final String m3269du() {
        return this.f3794du;
    }

    /* JADX INFO: renamed from: dy */
    public final String m3270dy() {
        return this.f3795dy;
    }

    /* JADX INFO: renamed from: fa */
    public final String m3271fa() {
        return this.f3796fa;
    }

    /* JADX INFO: renamed from: h4 */
    public final String m3272h4() {
        return this.f3797h4;
    }

    /* JADX INFO: renamed from: jd */
    public final String m3273jd() {
        return this.f3798jd;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m3274k4() {
        return this.f3799k4;
    }

    /* JADX INFO: renamed from: kk */
    public final String m3275kk() {
        return this.f3800kk;
    }

    /* JADX INFO: renamed from: ks */
    public final String m3276ks() {
        return this.f3801ks;
    }

    /* JADX INFO: renamed from: m9 */
    public final String m3277m9() {
        return this.f3802m9;
    }

    /* JADX INFO: renamed from: ne */
    public final String m3278ne() {
        return this.f3803ne;
    }

    /* JADX INFO: renamed from: rv */
    public final String m3279rv() {
        return this.f3804rv;
    }

    /* JADX INFO: renamed from: to */
    public final String m3280to() {
        return this.f3805to;
    }

    /* JADX INFO: renamed from: up */
    public final char m3281up() {
        return this.f3806up;
    }

    /* JADX INFO: renamed from: x1 */
    public final char m3282x1() {
        return this.f3807x1;
    }

    /* JADX INFO: renamed from: x6 */
    public final char m3283x6() {
        return this.f3808x6;
    }

    /* JADX INFO: renamed from: yj */
    public final String m3284yj() {
        return this.f3809yj;
    }

    public a5d(int i, int i2) {
        m3251k4(i, i2);
    }

    /* JADX INFO: renamed from: c5 */
    private void m3235c5(int i) {
        if (i != 0 && i != 1 && i != 3 && i != 4 && i != 6 && i != 8 && i != 11) {
            if (i == 21) {
                m3242dy("{0} ^^{1}^^");
                return;
            }
            if (i != 22) {
                switch (i) {
                    case 13:
                    case 14:
                    case 15:
                    case 17:
                    case 18:
                    case 19:
                        break;
                    case 16:
                        m3242dy("{0}^({1})");
                        break;
                    default:
                        m3242dy("{0}^{1}^");
                        break;
                }
                return;
            }
        }
        m3250k4(m3274k4() | 4);
    }

    /* JADX INFO: renamed from: ck */
    private void m3237ck(int i) {
        int i2;
        if (i != 21) {
            m3248jd("{0}1. {1}");
            m3263x1(ControlChar.SPACE_CHAR);
            i2 = 4;
        } else {
            m3248jd("{0}1. ((({1})))");
            m3263x1('1');
            i2 = 1;
        }
        m3264x1(i2);
    }

    /* JADX INFO: renamed from: du */
    private void m3239du(int i) {
        m3265x1(i != 21 ? "![{0}]({1})" : "[[image:{0}]]");
    }

    /* JADX INFO: renamed from: dy */
    private void m3241dy(int i) {
        switch (i) {
            case 0:
            case 1:
            case 3:
            case 4:
            case 6:
            case 8:
            case 9:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 22:
                m3250k4(m3274k4() | 8);
                break;
            case 2:
            case 5:
            case 7:
            case 10:
            case 12:
            case 20:
            default:
                m3258m9("{0}~{1}~");
                break;
            case 21:
                m3258m9("{0} ,,{1},,");
                break;
        }
    }

    /* JADX INFO: renamed from: fa */
    private void m3243fa(int i) {
        switch (i) {
            case 1:
            case 3:
            case 6:
            case 8:
            case 9:
            case 14:
            case 15:
            case 17:
            case 18:
            case 22:
                m3250k4(m3274k4() | 2);
                break;
            case 2:
            case 4:
            case 7:
                m3238ck("{{--{0}--}}");
                break;
            case 5:
            case 10:
            case 11:
            case 12:
            case 13:
            case 16:
            case 19:
            case 20:
            default:
                m3238ck("~~{0}~~");
                break;
            case 21:
                m3238ck("--{0}--");
                break;
        }
    }

    /* JADX INFO: renamed from: h4 */
    private void m3245h4(int i) {
        m3255kk(i != 21 ? "*{0}*" : "//{0}//");
    }

    /* JADX INFO: renamed from: jd */
    private void m3247jd(int i) {
        m3236c5(i != 0 ? i != 2 ? C14117yj.m67537ne('\n') : C14117yj.m67537ne(ControlChar.PARAGRAPH_BREAK_CHAR) : C14113y2.m67407k4(C14117yj.m67537ne(ControlChar.PARAGRAPH_BREAK_CHAR), '\n'));
    }

    /* JADX INFO: renamed from: k4 */
    private void m3249k4(char c) {
        this.f3807x1 = c;
    }

    /* JADX INFO: renamed from: kk */
    private void m3253kk(char c) {
        this.f3808x6 = c;
    }

    /* JADX INFO: renamed from: ks */
    private void m3256ks(int i) {
        char c;
        if (i != 21) {
            m3262up("{0}- {1}");
            c = ControlChar.SPACE_CHAR;
        } else {
            m3262up("{0}* ((({1})))");
            c = '*';
        }
        m3253kk(c);
    }

    /* JADX INFO: renamed from: m9 */
    private void m3257m9(int i) {
        String str;
        if (i != 21) {
            m3240du("[{0}]({1})");
            m3246h4("[");
            str = "]({0})";
        } else {
            m3240du("[[{0}>>{1}]]");
            m3246h4("[[");
            str = ">>{0}]]";
        }
        m3260to(str);
    }

    /* JADX INFO: renamed from: to */
    private void m3259to(int i) {
        m3252k4(i != 21 ? "\\" : "~");
    }

    /* JADX INFO: renamed from: up */
    private void m3261up(int i) {
        if (i == 1 || i == 3 || i == 10 || i == 12 || i == 17 || i == 19 || i == 20) {
            m3250k4(m3274k4() | 1);
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m3263x1(char c) {
        this.f3806up = c;
    }

    /* JADX INFO: renamed from: yj */
    private void m3266yj(int i) {
        if (i != 0 && i != 1 && i != 3 && i != 4 && i != 6) {
            switch (i) {
                case 8:
                case 9:
                case 11:
                case 13:
                case 15:
                case 17:
                case 18:
                case 19:
                case 20:
                case 22:
                    break;
                case 10:
                case 12:
                case 14:
                case 16:
                    m3244fa("=={0}==");
                    break;
                case 21:
                    m3244fa("__{0}__");
                    break;
                default:
                    m3244fa("{{=={0}==}}");
                    break;
            }
            return;
        }
        m3250k4(m3274k4() | 16);
    }

    /* JADX INFO: renamed from: c5 */
    private void m3236c5(String str) {
        this.f3796fa = str;
    }

    /* JADX INFO: renamed from: ck */
    private void m3238ck(String str) {
        this.f3801ks = str;
    }

    /* JADX INFO: renamed from: du */
    private void m3240du(String str) {
        this.f3802m9 = str;
    }

    /* JADX INFO: renamed from: dy */
    private void m3242dy(String str) {
        this.f3793ck = str;
    }

    /* JADX INFO: renamed from: fa */
    private void m3244fa(String str) {
        this.f3804rv = str;
    }

    /* JADX INFO: renamed from: h4 */
    private void m3246h4(String str) {
        this.f3795dy = str;
    }

    /* JADX INFO: renamed from: jd */
    private void m3248jd(String str) {
        this.f3809yj = str;
    }

    /* JADX INFO: renamed from: k4 */
    private void m3250k4(int i) {
        this.f3799k4 = i;
    }

    /* JADX INFO: renamed from: kk */
    private void m3254kk(int i) {
        m3249k4(i != 21 ? '#' : '=');
    }

    /* JADX INFO: renamed from: m9 */
    private void m3258m9(String str) {
        this.f3798jd = str;
    }

    /* JADX INFO: renamed from: to */
    private void m3260to(String str) {
        this.f3797h4 = str;
    }

    /* JADX INFO: renamed from: up */
    private void m3262up(String str) {
        this.f3803ne = str;
    }

    /* JADX INFO: renamed from: x1 */
    private void m3264x1(int i) {
        this.f3792c5 = i;
    }

    /* JADX INFO: renamed from: k4 */
    private void m3251k4(int i, int i2) {
        m3261up(i);
        m3241dy(i);
        m3235c5(i);
        m3243fa(i);
        m3266yj(i);
        m3254kk(i);
        m3239du(i);
        m3245h4(i);
        m3257m9(i);
        m3237ck(i);
        m3256ks(i);
        m3259to(i);
        m3247jd(i2);
    }

    /* JADX INFO: renamed from: kk */
    private void m3255kk(String str) {
        this.f3794du = str;
    }

    /* JADX INFO: renamed from: x1 */
    private void m3265x1(String str) {
        this.f3805to = str;
    }

    /* JADX INFO: renamed from: k4 */
    private void m3252k4(String str) {
        this.f3800kk = str;
    }
}
