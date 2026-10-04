package com.aspose.slides.internal.p463vm;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.p559ms.System.C14117yj;
import com.aspose.words.ControlChar;
import com.google.firebase.messaging.Constants;

/* JADX INFO: renamed from: com.aspose.slides.internal.vm.up */
/* JADX INFO: loaded from: classes4.dex */
public class C11696up {

    /* JADX INFO: renamed from: du */
    private int f39626du;

    /* JADX INFO: renamed from: dy */
    private k4 f39627dy;

    /* JADX INFO: renamed from: h4 */
    private C11697x1 f39628h4;

    /* JADX INFO: renamed from: k4 */
    private String f39629k4;

    /* JADX INFO: renamed from: kk */
    private int f39630kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f39631m9;

    /* JADX INFO: renamed from: to */
    private boolean f39632to;

    /* JADX INFO: renamed from: x1 */
    private String f39633x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.vm.up$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: du */
        private char f39634du;

        /* JADX INFO: renamed from: k4 */
        private int f39635k4;

        /* JADX INFO: renamed from: kk */
        private int f39636kk;

        /* JADX INFO: renamed from: to */
        private int f39637to;

        /* JADX INFO: renamed from: x1 */
        private int f39638x1;

        public k4(int i, int i2, int i3, int i4, char c) {
            this.f39635k4 = i;
            this.f39638x1 = i2;
            this.f39636kk = i3;
            this.f39637to = i4;
            this.f39634du = c;
        }
    }

    private C11696up(C11696up c11696up) {
        this.f39626du = c11696up.f39626du;
        this.f39630kk = c11696up.f39630kk;
        this.f39632to = c11696up.f39632to;
        this.f39629k4 = c11696up.m55238kk();
        this.f39633x1 = c11696up.m55239to();
        this.f39628h4 = c11696up.f39628h4;
        this.f39631m9 = c11696up.f39631m9;
        this.f39627dy = c11696up.f39627dy;
    }

    public Object clone() {
        return new C11696up(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C11696up c11696up = (C11696up) obj;
        if (this.f39626du != c11696up.f39626du) {
            return false;
        }
        C11697x1 c11697x1 = this.f39628h4;
        C11697x1 c11697x12 = c11696up.f39628h4;
        return c11697x1 == null ? c11697x12 == null : c11697x1.equals(c11697x12);
    }

    public int hashCode() {
        return this.f39626du;
    }

    /* JADX INFO: renamed from: k4 */
    public char m55234k4(char c) {
        if (c < '@') {
            return c;
        }
        if ('`' < c && c < 128) {
            return c;
        }
        if ('A' <= c && c <= 'Z' && (!this.f39631m9 || c != 'I')) {
            return (char) (c + ControlChar.SPACE_CHAR);
        }
        C11697x1 c11697x1 = this.f39628h4;
        if (c11697x1 == null || c11697x1.m55262dy() == 127) {
            return C14117yj.m67549x6(c);
        }
        if (c != 'I') {
            if (c == 304) {
                return 'i';
            }
            if (c == 453) {
                return (char) 454;
            }
            if (c == 456) {
                return (char) 457;
            }
            if (c == 459) {
                return (char) 460;
            }
            if (c == 498) {
                return (char) 499;
            }
            switch (c) {
                case 978:
                    return (char) 965;
                case 979:
                    return (char) 973;
                case 980:
                    return (char) 971;
            }
        }
        if (this.f39631m9) {
            return (char) 305;
        }
        return C14117yj.m67549x6(c);
    }

    /* JADX INFO: renamed from: kk */
    public char m55237kk(char c) {
        switch (c) {
            case 452:
            case 453:
            case 454:
                return (char) 453;
            case 455:
            case 456:
            case 457:
                return (char) 456;
            case 458:
            case 459:
            case 460:
                return (char) 459;
            default:
                switch (c) {
                    case 497:
                    case 498:
                    case 499:
                        return (char) 498;
                    default:
                        return ((8560 > c || c > 8575) && (9424 > c || c > 9449)) ? m55240x1(c) : c;
                }
        }
    }

    /* JADX INFO: renamed from: to */
    public String m55239to() {
        if (this.f39633x1 == null) {
            this.f39633x1 = this.f39628h4.m55259c5();
        }
        return this.f39633x1;
    }

    public String toString() {
        return "TextInfo - " + this.f39626du;
    }

    /* JADX INFO: renamed from: x1 */
    public char m55240x1(char c) {
        if (c < '`') {
            return c;
        }
        if ('a' <= c && c <= 'z' && (!this.f39631m9 || c != 'i')) {
            return (char) (c - ' ');
        }
        C11697x1 c11697x1 = this.f39628h4;
        if (c11697x1 == null || c11697x1.m55262dy() == 127) {
            return C14117yj.m67541u4(c);
        }
        if (c != 'i') {
            if (c == 305) {
                return 'I';
            }
            if (c == 453) {
                return (char) 452;
            }
            if (c == 456) {
                return (char) 455;
            }
            if (c == 459) {
                return (char) 458;
            }
            if (c == 498) {
                return (char) 497;
            }
            if (c == 912) {
                return (char) 938;
            }
            if (c == 944) {
                return (char) 939;
            }
            if (c == 976) {
                return (char) 914;
            }
            if (c == 977) {
                return (char) 920;
            }
            if (c == 981) {
                return (char) 934;
            }
            if (c == 982) {
                return (char) 928;
            }
            if (c == 1008) {
                return (char) 922;
            }
            if (c == 1009) {
                return (char) 929;
            }
        } else if (this.f39631m9) {
            return (char) 304;
        }
        return C14117yj.m67541u4(c);
    }

    public C11696up(C11697x1 c11697x1, int i, k4 k4Var) {
        if (k4Var == null) {
            throw new ArgumentNullException(Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        }
        if (c11697x1 == null) {
            throw new ArgumentNullException("CultureInfo");
        }
        this.f39626du = i;
        this.f39628h4 = c11697x1;
        this.f39627dy = k4Var;
        int iM55262dy = c11697x1.m55262dy();
        if (iM55262dy == 31 || iM55262dy == 44) {
            this.f39631m9 = true;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public int m55235k4() {
        return this.f39627dy.f39635k4;
    }

    /* JADX INFO: renamed from: kk */
    public String m55238kk() {
        if (this.f39629k4 == null) {
            this.f39629k4 = Character.toString(this.f39627dy.f39634du);
        }
        return this.f39629k4;
    }

    /* JADX INFO: renamed from: x1 */
    public int m55241x1() {
        return this.f39626du;
    }

    /* JADX INFO: renamed from: k4 */
    public String m55236k4(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            sb.append(m55234k4(c));
        }
        return sb.toString();
    }
}
