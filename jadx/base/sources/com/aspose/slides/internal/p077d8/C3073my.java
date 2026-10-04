package com.aspose.slides.internal.p077d8;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.IColorFormat;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.orion.notein.domain.models.backup.BackupFile;

/* JADX INFO: renamed from: com.aspose.slides.internal.d8.my */
/* JADX INFO: loaded from: classes3.dex */
public final class C3073my {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f9126du = new C7017h4("rgb", "fill", "fillback", "line", "lineback", "lineorfill", "fillthenline", "black", "silver", "gray", "white", "maroon", "red", "purple", "fuchsia", "green", "lime", "olive", "yellow", "navy", "blue", "teal", "aqua", "darken", "lighten", "add", "subtract", "reversesubtract", "blackwhite", "invert", "invert128", TranslateLanguage.PORTUGUESE, "", "px", BackupFile.EXTENSION_NOTEIN_FILE, "cm", "mm", "em", "pc", "emu", "%");

    /* JADX INFO: renamed from: k4 */
    private final String f9127k4;

    /* JADX INFO: renamed from: kk */
    private final int f9128kk;

    /* JADX INFO: renamed from: to */
    private int f9129to;

    /* JADX INFO: renamed from: x1 */
    private final int f9130x1;

    public C3073my(String str) {
        this(str, 0, str != null ? str.length() : 0);
    }

    /* JADX INFO: renamed from: fa */
    private String[] m12986fa() {
        int i;
        while (true) {
            int i2 = this.f9129to;
            if (i2 >= this.f9128kk || this.f9127k4.charAt(i2) > ' ') {
                break;
            }
            this.f9129to++;
        }
        int i3 = this.f9129to;
        if (i3 >= this.f9128kk || this.f9127k4.charAt(i3) != '(') {
            return null;
        }
        List list = new List();
        while (true) {
            int i4 = this.f9129to;
            if (i4 >= this.f9128kk || this.f9127k4.charAt(i4) == ')') {
                break;
            }
            do {
                this.f9129to++;
                i = this.f9129to;
                if (i >= this.f9128kk) {
                    break;
                }
            } while (this.f9127k4.charAt(i) <= ' ');
            int i5 = this.f9129to;
            while (true) {
                int i6 = this.f9129to;
                if (i6 >= this.f9128kk || this.f9127k4.charAt(i6) == ',' || this.f9127k4.charAt(this.f9129to) == ')') {
                    break;
                }
                this.f9129to++;
            }
            int i7 = this.f9129to;
            while (i5 < i7 && (this.f9127k4.charAt(i7 - 1) < '0' || this.f9127k4.charAt(i7) == ',' || this.f9127k4.charAt(i7) == ')')) {
                i7--;
            }
            list.addItem(C14113y2.m67443x1(this.f9127k4, i5, (i7 - i5) + 1));
        }
        return (String[]) list.toArray(new String[0]);
    }

    /* JADX INFO: renamed from: up */
    private int[] m12988up() {
        int i;
        while (true) {
            int i2 = this.f9129to;
            if (i2 >= this.f9128kk || this.f9127k4.charAt(i2) > ' ') {
                break;
            }
            this.f9129to++;
        }
        int i3 = this.f9129to;
        if (i3 >= this.f9128kk || this.f9127k4.charAt(i3) != '[') {
            return null;
        }
        List list = new List();
        while (true) {
            int i4 = this.f9129to;
            if (i4 >= this.f9128kk || this.f9127k4.charAt(i4) == ']') {
                break;
            }
            do {
                this.f9129to++;
                i = this.f9129to;
                if (i >= this.f9128kk) {
                    break;
                }
            } while (this.f9127k4.charAt(i) <= ' ');
            int i5 = this.f9129to;
            while (true) {
                int i6 = this.f9129to;
                if (i6 >= this.f9128kk || this.f9127k4.charAt(i6) == ',' || this.f9127k4.charAt(this.f9129to) < '0' || this.f9127k4.charAt(this.f9129to) > '9' || this.f9127k4.charAt(this.f9129to) == ']') {
                    break;
                }
                this.f9129to++;
            }
            list.addItem(Integer.valueOf(C14057f9.m66582k4(C14113y2.m67443x1(this.f9127k4, i5, this.f9129to - i5))));
        }
        return C3085sv.m13103kk((List<Integer>) list);
    }

    /* JADX INFO: renamed from: c5 */
    public final char m12990c5() {
        int i = this.f9129to;
        if (i < this.f9128kk) {
            return this.f9127k4.charAt(i);
        }
        return (char) 65535;
    }

    /* JADX INFO: renamed from: ck */
    public final float m12991ck() {
        float fM13005to = m13005to(Float.NaN);
        if (C14064he.m66715kk(fM13005to)) {
            throw new InvalidOperationException("Can't parse percentage.");
        }
        return fM13005to;
    }

    /* JADX INFO: renamed from: du */
    public final char m12992du() {
        int i = this.f9129to;
        if (i < this.f9128kk) {
            return this.f9127k4.charAt(i);
        }
        return (char) 65535;
    }

    /* JADX INFO: renamed from: dy */
    public final void m12993dy() {
        while (true) {
            int i = this.f9129to;
            if (i >= this.f9128kk || this.f9127k4.charAt(i) > ' ') {
                return;
            } else {
                this.f9129to++;
            }
        }
    }

    /* JADX INFO: renamed from: h4 */
    public final int m12994h4() {
        return this.f9128kk - this.f9129to;
    }

    /* JADX INFO: renamed from: jd */
    public final float m12995jd() {
        float fM13006x1 = m13006x1(Float.NaN);
        if (C14064he.m66715kk(fM13006x1)) {
            throw new InvalidOperationException("Can't parse coordinate.");
        }
        return fM13006x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final float m12996k4(float f) {
        int i;
        int i2;
        int i3;
        while (true) {
            int i4 = this.f9129to;
            if (i4 >= this.f9128kk || this.f9127k4.charAt(i4) > ' ') {
                break;
            }
            this.f9129to++;
        }
        int i5 = this.f9129to;
        if (i5 >= this.f9128kk) {
            return Float.NaN;
        }
        if (this.f9127k4.charAt(i5) == '-') {
            do {
                this.f9129to++;
                i3 = this.f9129to;
                if (i3 >= this.f9128kk) {
                    break;
                }
            } while (this.f9127k4.charAt(i3) <= ' ');
            i = -1;
        } else {
            if (this.f9127k4.charAt(this.f9129to) == '+') {
                do {
                    this.f9129to++;
                    i2 = this.f9129to;
                    if (i2 >= this.f9128kk) {
                        break;
                    }
                } while (this.f9127k4.charAt(i2) <= ' ');
            }
            i = 1;
        }
        int i6 = this.f9129to;
        if (i6 >= this.f9128kk || ((this.f9127k4.charAt(i6) < '0' || this.f9127k4.charAt(this.f9129to) > '9') && this.f9127k4.charAt(this.f9129to) != '.')) {
            return f;
        }
        float fCharAt = 0.0f;
        while (true) {
            int i7 = this.f9129to;
            if (i7 >= this.f9128kk || this.f9127k4.charAt(i7) < '0' || this.f9127k4.charAt(this.f9129to) > '9') {
                break;
            }
            String str = this.f9127k4;
            this.f9129to = this.f9129to + 1;
            fCharAt = ((fCharAt * 10.0f) + str.charAt(r6)) - 48.0f;
        }
        int i8 = this.f9129to;
        if (i8 < this.f9128kk && this.f9127k4.charAt(i8) == '.') {
            this.f9129to++;
            float f2 = 0.1f;
            while (true) {
                int i9 = this.f9129to;
                if (i9 >= this.f9128kk || this.f9127k4.charAt(i9) < '0' || this.f9127k4.charAt(this.f9129to) > '9') {
                    break;
                }
                String str2 = this.f9127k4;
                this.f9129to = this.f9129to + 1;
                fCharAt += (str2.charAt(r3) - '0') * f2;
                f2 /= 10.0f;
            }
        }
        return fCharAt * i;
    }

    /* JADX INFO: renamed from: kk */
    public final float m13001kk(float f) {
        float fM12996k4 = m12996k4(Float.NaN);
        if (!C14064he.m66715kk(fM12996k4)) {
            switch (f9126du.m27428k4(m13008x1())) {
                case 31:
                    return -fM12996k4;
                case 33:
                    return ((-fM12996k4) * 72.0f) / 96.0f;
                case 34:
                    return (-fM12996k4) * 72.0f;
                case 35:
                    return ((-fM12996k4) * 72.0f) / 2.54f;
                case 36:
                    return ((-fM12996k4) * 72.0f) / 25.4f;
                case 37:
                    return ((-fM12996k4) * 72.0f) / 90.0f;
                case 38:
                    return (-fM12996k4) * 12.0f;
                case 39:
                    return (-fM12996k4) / 12700.0f;
                case 40:
                    return fM12996k4 / 100.0f;
            }
        }
        return fM12996k4;
    }

    /* JADX INFO: renamed from: m9 */
    public final char m13003m9() {
        int i = this.f9129to;
        if (i >= this.f9128kk) {
            return (char) 65535;
        }
        String str = this.f9127k4;
        this.f9129to = i + 1;
        return str.charAt(i);
    }

    /* JADX INFO: renamed from: to */
    public final float m13004to() {
        while (true) {
            int i = this.f9129to;
            if (i >= this.f9128kk || this.f9127k4.charAt(i) > ' ') {
                break;
            }
            this.f9129to++;
        }
        int i2 = this.f9129to;
        int iCharAt = 0;
        while (true) {
            int i3 = this.f9129to;
            if (i3 >= this.f9128kk || this.f9127k4.charAt(i3) < '0' || this.f9127k4.charAt(this.f9129to) > '9') {
                break;
            }
            String str = this.f9127k4;
            int i4 = this.f9129to;
            this.f9129to = i4 + 1;
            iCharAt = (str.charAt(i4) + (iCharAt * 10)) - 48;
        }
        int i5 = this.f9129to;
        double dCharAt = 0.0d;
        if (i5 < this.f9128kk) {
            if (i2 < i5 && (this.f9127k4.charAt(i5) == 'f' || this.f9127k4.charAt(this.f9129to) == 'F')) {
                this.f9129to++;
                return iCharAt / 65536.0f;
            }
            if (this.f9127k4.charAt(this.f9129to) == '.') {
                this.f9129to++;
                double d = 0.10000000149011612d;
                while (true) {
                    int i6 = this.f9129to;
                    if (i6 >= this.f9128kk || this.f9127k4.charAt(i6) < '0' || this.f9127k4.charAt(this.f9129to) > '9') {
                        break;
                    }
                    String str2 = this.f9127k4;
                    int i7 = this.f9129to;
                    this.f9129to = i7 + 1;
                    dCharAt += ((double) (str2.charAt(i7) - '0')) * d;
                    d /= 10.0d;
                }
            }
        }
        int i8 = this.f9129to;
        if (i2 < i8 && i8 < this.f9128kk && this.f9127k4.charAt(i8) == '%') {
            this.f9129to++;
            return (float) ((((double) iCharAt) + dCharAt) / 100.0d);
        }
        if (this.f9129to == i2) {
            return Float.NaN;
        }
        return (float) (((double) iCharAt) + dCharAt);
    }

    /* JADX INFO: renamed from: x1 */
    public final float m13006x1(float f) {
        float fM12996k4 = m12996k4(Float.NaN);
        if (!C14064he.m66715kk(fM12996k4)) {
            switch (f9126du.m27428k4(m13008x1())) {
                case 33:
                    return (fM12996k4 * 72.0f) / 96.0f;
                case 34:
                    return fM12996k4 * 72.0f;
                case 35:
                    return (fM12996k4 * 72.0f) / 2.54f;
                case 36:
                    return (fM12996k4 * 72.0f) / 25.4f;
                case 37:
                    return (fM12996k4 * 72.0f) / 90.0f;
                case 38:
                    return fM12996k4 * 12.0f;
                case 39:
                    return fM12996k4 / 12700.0f;
            }
        }
        return fM12996k4;
    }

    public C3073my(String str, int i, int i2) {
        this.f9127k4 = str;
        this.f9130x1 = i;
        this.f9128kk = i2 + i;
        this.f9129to = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m12997k4() {
        return this.f9129to - this.f9130x1;
    }

    /* JADX INFO: renamed from: kk */
    public final String m13002kk() {
        while (true) {
            int i = this.f9129to;
            if (i >= this.f9128kk || this.f9127k4.charAt(i) > ' ') {
                break;
            }
            this.f9129to++;
        }
        int i2 = this.f9129to;
        if (i2 >= this.f9128kk) {
            return "";
        }
        if (this.f9127k4.charAt(i2) == '\'' || this.f9127k4.charAt(this.f9129to) == '\"') {
            char cCharAt = this.f9127k4.charAt(this.f9129to);
            int i3 = this.f9129to + 1;
            this.f9129to = i3;
            boolean z = false;
            while (true) {
                int i4 = this.f9129to;
                if (i4 >= this.f9128kk || (this.f9127k4.charAt(i4) == cCharAt && !z)) {
                    break;
                }
                z = !z && this.f9127k4.charAt(this.f9129to) == '\\';
                this.f9129to++;
            }
            return C14113y2.m67443x1(this.f9127k4, i3, this.f9129to - i3);
        }
        int i5 = this.f9129to;
        while (true) {
            int i6 = this.f9129to;
            if (i6 >= this.f9128kk || ((this.f9127k4.charAt(i6) < 'A' || this.f9127k4.charAt(this.f9129to) > 'Z') && ((this.f9127k4.charAt(this.f9129to) < 'a' || this.f9127k4.charAt(this.f9129to) > 'z') && !((this.f9127k4.charAt(this.f9129to) >= '0' && this.f9127k4.charAt(this.f9129to) <= '9') || this.f9127k4.charAt(this.f9129to) == '_' || this.f9127k4.charAt(this.f9129to) == '-')))) {
                break;
            }
            this.f9129to++;
        }
        return C14113y2.m67443x1(this.f9127k4, i5, this.f9129to - i5);
    }

    /* JADX INFO: renamed from: to */
    public final float m13005to(float f) {
        int i;
        int i2;
        int i3;
        while (true) {
            int i4 = this.f9129to;
            if (i4 >= this.f9128kk || this.f9127k4.charAt(i4) > ' ') {
                break;
            }
            this.f9129to++;
        }
        int i5 = this.f9129to;
        if (i5 >= this.f9128kk) {
            return Float.NaN;
        }
        if (this.f9127k4.charAt(i5) == '-') {
            do {
                this.f9129to++;
                i3 = this.f9129to;
                if (i3 >= this.f9128kk) {
                    break;
                }
            } while (this.f9127k4.charAt(i3) <= ' ');
            i = -1;
        } else {
            if (this.f9127k4.charAt(this.f9129to) == '+') {
                do {
                    this.f9129to++;
                    i2 = this.f9129to;
                    if (i2 >= this.f9128kk) {
                        break;
                    }
                } while (this.f9127k4.charAt(i2) <= ' ');
            }
            i = 1;
        }
        if (this.f9129to < this.f9128kk) {
            float fCharAt = 0.0f;
            while (true) {
                int i6 = this.f9129to;
                if (i6 >= this.f9128kk || this.f9127k4.charAt(i6) < '0' || this.f9127k4.charAt(this.f9129to) > '9') {
                    break;
                }
                String str = this.f9127k4;
                this.f9129to = this.f9129to + 1;
                fCharAt = ((fCharAt * 10.0f) + str.charAt(r5)) - 48.0f;
            }
            int i7 = this.f9129to;
            if (i7 < this.f9128kk && this.f9127k4.charAt(i7) == '.') {
                this.f9129to++;
                float f2 = 0.1f;
                while (true) {
                    int i8 = this.f9129to;
                    if (i8 >= this.f9128kk || this.f9127k4.charAt(i8) < '0' || this.f9127k4.charAt(this.f9129to) > '9') {
                        break;
                    }
                    String str2 = this.f9127k4;
                    this.f9129to = this.f9129to + 1;
                    fCharAt += (str2.charAt(r5) - '0') * f2;
                    f2 /= 10.0f;
                }
            }
            float f3 = fCharAt * i;
            int i9 = this.f9128kk;
            while (i9 > this.f9129to && this.f9127k4.charAt(i9 - 1) <= ' ') {
                i9--;
            }
            int i10 = this.f9129to;
            if ("%".equals(i10 < this.f9128kk ? C14113y2.m67443x1(this.f9127k4, i10, i9 - i10) : "")) {
                return f3;
            }
        }
        return f;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m13007x1(int i) {
        int i2;
        int i3;
        int i4;
        while (true) {
            int i5 = this.f9129to;
            i2 = 1;
            if (i5 >= this.f9128kk || this.f9127k4.charAt(i5) > ' ') {
                break;
            }
            this.f9129to++;
        }
        int i6 = this.f9129to;
        if (i6 < this.f9128kk) {
            if (this.f9127k4.charAt(i6) == '-') {
                do {
                    this.f9129to++;
                    i4 = this.f9129to;
                    if (i4 >= this.f9128kk) {
                        break;
                    }
                } while (this.f9127k4.charAt(i4) <= ' ');
                i2 = -1;
            } else if (this.f9127k4.charAt(this.f9129to) == '+') {
                do {
                    this.f9129to++;
                    i3 = this.f9129to;
                    if (i3 >= this.f9128kk) {
                        break;
                    }
                } while (this.f9127k4.charAt(i3) <= ' ');
            }
            if (this.f9129to < this.f9128kk) {
                int iCharAt = 0;
                while (true) {
                    int i7 = this.f9129to;
                    if (i7 >= this.f9128kk || this.f9127k4.charAt(i7) < '0' || this.f9127k4.charAt(this.f9129to) > '9') {
                        break;
                    }
                    String str = this.f9127k4;
                    int i8 = this.f9129to;
                    this.f9129to = i8 + 1;
                    iCharAt = (str.charAt(i8) + (iCharAt * 10)) - 48;
                }
                return iCharAt * i2;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m12998k4(int i) {
        this.f9129to = this.f9130x1 + i;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m13008x1() {
        while (true) {
            int i = this.f9129to;
            if (i >= this.f9128kk || this.f9127k4.charAt(i) > ' ') {
                break;
            }
            this.f9129to++;
        }
        int i2 = this.f9129to;
        while (true) {
            int i3 = this.f9129to;
            if (i3 >= this.f9128kk || ((this.f9127k4.charAt(i3) < 'A' || this.f9127k4.charAt(this.f9129to) > 'Z') && ((this.f9127k4.charAt(this.f9129to) < 'a' || this.f9127k4.charAt(this.f9129to) > 'z') && ((this.f9127k4.charAt(this.f9129to) < '0' || this.f9127k4.charAt(this.f9129to) > '9') && this.f9127k4.charAt(this.f9129to) != '_')))) {
                break;
            }
            this.f9129to++;
        }
        return C14113y2.m67443x1(this.f9127k4, i2, this.f9129to - i2);
    }

    /* JADX INFO: renamed from: x1 */
    private void m12989x1(IColorFormat iColorFormat) {
        m12988up();
        if (this.f9129to < this.f9128kk) {
            String strM67361du = C14113y2.m67361du(m13008x1());
            String[] strArrM12986fa = m12986fa();
            if (strM67361du.length() > 0) {
                m12987k4(iColorFormat, strM67361du, strArrM12986fa.length > 0 ? strArrM12986fa[0] : null);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m12999k4(IColorFormat iColorFormat) {
        m13000k4(iColorFormat, null, null, null, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014d  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m13000k4(IColorFormat iColorFormat, IColorFormat iColorFormat2, IColorFormat iColorFormat3, IColorFormat iColorFormat4, IColorFormat iColorFormat5) {
        int i;
        while (true) {
            int i2 = this.f9129to;
            if (i2 >= this.f9128kk || this.f9127k4.charAt(i2) > ' ') {
                break;
            } else {
                this.f9129to++;
            }
        }
        int i3 = this.f9129to;
        if (i3 >= this.f9128kk) {
            return;
        }
        if (this.f9127k4.charAt(i3) == '#') {
            iColorFormat.setColorType(0);
            int i4 = this.f9129to + 1;
            this.f9129to = i4;
            while (true) {
                int i5 = this.f9129to;
                if (i5 >= this.f9128kk || ((this.f9127k4.charAt(i5) < '0' || this.f9127k4.charAt(this.f9129to) > '9') && ((this.f9127k4.charAt(this.f9129to) < 'a' || this.f9127k4.charAt(this.f9129to) > 'f') && (this.f9127k4.charAt(this.f9129to) < 'A' || this.f9127k4.charAt(this.f9129to) > 'F')))) {
                    break;
                } else {
                    this.f9129to++;
                }
            }
            int i6 = this.f9129to;
            if (i6 - i4 > 3) {
                if (i6 - i4 <= 6) {
                    iColorFormat.setColor((Integer) C12003du.m56473x1(C12003du.m56396k4((int) (C14080ne.m66984kk(C14113y2.m67443x1(this.f9127k4, i4, i6 - i4), 16) | 4278190080L))));
                    return;
                }
                iColorFormat.setR((byte) 0);
                iColorFormat.setG((byte) 0);
                iColorFormat.setB((byte) 0);
                return;
            }
            int iM67044x1 = C14080ne.m67044x1(C14113y2.m67443x1(this.f9127k4, i4, i6 - i4), 16);
            int i7 = (iM67044x1 & 3840) >> 8;
            iColorFormat.setR((byte) ((i7 * 16) + i7));
            int i8 = (iM67044x1 & 240) >> 4;
            iColorFormat.setG((byte) ((i8 * 16) + i8));
            int i9 = iM67044x1 & 15;
            iColorFormat.setB((byte) ((i9 * 16) + i9));
            return;
        }
        String strM67361du = C14113y2.m67361du(m13008x1());
        String[] strArrM12986fa = m12986fa();
        switch (f9126du.m27428k4(strM67361du)) {
            case 0:
                iColorFormat.setColorType(0);
                iColorFormat.setR(strArrM12986fa.length >= 1 ? C13850af.m65126rv(strArrM12986fa[0]) : (byte) 0);
                iColorFormat.setG(strArrM12986fa.length >= 2 ? C13850af.m65126rv(strArrM12986fa[1]) : (byte) 0);
                iColorFormat.setB(strArrM12986fa.length >= 3 ? C13850af.m65126rv(strArrM12986fa[2]) : (byte) 0);
                break;
            case 1:
                if (iColorFormat2 == null || iColorFormat2.getColorType() == -1) {
                    iColorFormat.setPresetColor(7);
                } else {
                    iColorFormat.copyFrom(iColorFormat2);
                }
                break;
            case 2:
                if (iColorFormat3 != null && iColorFormat3.getColorType() != -1) {
                    iColorFormat.copyFrom(iColorFormat3);
                    break;
                }
                break;
            case 3:
                if (iColorFormat4 != null && iColorFormat4.getColorType() != -1) {
                    iColorFormat.copyFrom(iColorFormat4);
                    break;
                }
                break;
            case 4:
                if (iColorFormat5 != null && iColorFormat5.getColorType() != -1) {
                    iColorFormat.copyFrom(iColorFormat5);
                    break;
                }
                break;
            case 5:
                if (iColorFormat4 == null || iColorFormat4.getColorType() == -1) {
                    if (iColorFormat2 == null || iColorFormat2.getColorType() == -1) {
                    }
                }
                iColorFormat.copyFrom(iColorFormat4);
                break;
            case 6:
                if (iColorFormat2 == null || iColorFormat2.getColorType() == -1) {
                    if (iColorFormat4 == null || iColorFormat4.getColorType() == -1) {
                    }
                }
                iColorFormat.copyFrom(iColorFormat2);
                break;
            case 8:
                i = 122;
                iColorFormat.setPresetColor(i);
                break;
            case 9:
                i = 50;
                iColorFormat.setPresetColor(i);
                break;
            case 10:
                i = 136;
                iColorFormat.setPresetColor(i);
                break;
            case 11:
                i = 80;
                iColorFormat.setPresetColor(i);
                break;
            case 12:
                i = 113;
                iColorFormat.setPresetColor(i);
                break;
            case 13:
                i = 112;
                iColorFormat.setPresetColor(i);
                break;
            case 14:
                i = 45;
                iColorFormat.setPresetColor(i);
                break;
            case 15:
                i = 51;
                iColorFormat.setPresetColor(i);
                break;
            case 16:
                i = 76;
                iColorFormat.setPresetColor(i);
                break;
            case 17:
                iColorFormat.setPresetColor(97);
                break;
            case 18:
                i = 138;
                iColorFormat.setPresetColor(i);
                break;
            case 19:
                i = 95;
                iColorFormat.setPresetColor(i);
                break;
            case 20:
                i = 9;
                iColorFormat.setPresetColor(i);
                break;
            case 21:
                i = 130;
                iColorFormat.setPresetColor(i);
                break;
            case 22:
                iColorFormat.setPresetColor(2);
                break;
        }
        m12989x1(iColorFormat);
    }

    /* JADX INFO: renamed from: k4 */
    private void m12987k4(IColorFormat iColorFormat, String str, String str2) {
        float fM13070k4;
        C12003du c12003du = new C12003du();
        int iM27428k4 = f9126du.m27428k4(str);
        if (iM27428k4 == 9) {
            iColorFormat.getColorTransform().add(4);
            return;
        }
        switch (iM27428k4) {
            case 23:
                iColorFormat.getColorTransform().add(1, str2 != null ? C3085sv.m13070k4(C13850af.m65151yj(str2) / 255.0f, 0.0f, 1.0f) : 0.6f);
                break;
            case 24:
                iColorFormat.getColorTransform().add(1, str2 != null ? C3085sv.m13070k4(C13850af.m65151yj(str2) / 255.0f, 0.0f, 1.0f) : 0.6f);
                break;
            case 25:
                fM13070k4 = str2 != null ? C3085sv.m13070k4(C13850af.m65151yj(str2) / 255.0f, 0.0f, 1.0f) : 0.6f;
                iColorFormat.getColorTransform().add(18, fM13070k4);
                iColorFormat.getColorTransform().add(21, fM13070k4);
                iColorFormat.getColorTransform().add(24, fM13070k4);
                break;
            case 26:
                fM13070k4 = str2 != null ? C3085sv.m13070k4(C13850af.m65151yj(str2) / 255.0f, 0.0f, 1.0f) : 0.6f;
                iColorFormat.getColorTransform().add(18, fM13070k4);
                iColorFormat.getColorTransform().add(21, fM13070k4);
                iColorFormat.getColorTransform().add(24, fM13070k4);
                break;
            case 27:
                int iM13072k4 = str2 != null ? C3085sv.m13072k4(C13850af.m65151yj(str2), 0, 255) : 255;
                C12003du.m56401k4(iColorFormat.getColor()).CloneTo(c12003du);
                iColorFormat.setColor((Integer) C12003du.m56473x1(C12003du.m56397k4(iM13072k4 - (c12003du.m56507jd() & 255), iM13072k4 - (c12003du.m56502ck() & 255), iM13072k4 - (c12003du.m56505fa() & 255)).Clone()));
                break;
            case 28:
                int iM13072k42 = str2 != null ? C3085sv.m13072k4(C13850af.m65151yj(str2), 0, 255) : 128;
                C12003du.m56401k4(iColorFormat.getColor()).CloneTo(c12003du);
                iColorFormat.setColor((Integer) C12003du.m56473x1(C12003du.m56397k4((c12003du.m56507jd() & 255) < iM13072k42 ? 0 : 255, (c12003du.m56502ck() & 255) < iM13072k42 ? 0 : 255, (c12003du.m56505fa() & 255) >= iM13072k42 ? 255 : 0).Clone()));
                break;
            case 29:
                iColorFormat.getColorTransform().add(3);
                break;
            case 30:
                C12003du.m56401k4(iColorFormat.getColor()).CloneTo(c12003du);
                int iM56507jd = (c12003du.m56507jd() & 255) < 128 ? (c12003du.m56507jd() & 255) + 128 : (c12003du.m56507jd() & 255) - 128;
                int iM56502ck = (c12003du.m56502ck() & 255) < 128 ? (c12003du.m56502ck() & 255) + 128 : (c12003du.m56502ck() & 255) - 128;
                int iM56505fa = c12003du.m56505fa() & 255;
                int iM56505fa2 = c12003du.m56505fa() & 255;
                iColorFormat.setColor((Integer) C12003du.m56473x1(C12003du.m56397k4(iM56507jd, iM56502ck, iM56505fa < 128 ? iM56505fa2 + 128 : iM56505fa2 - 128).Clone()));
                break;
        }
    }
}
