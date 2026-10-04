package com.aspose.slides.internal.p088dn;

import com.aspose.slides.PatternStyle;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.exceptions.FormatException;
import com.aspose.slides.exceptions.OverflowException;
import com.aspose.slides.internal.p463vm.C11683c5;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;

/* JADX INFO: renamed from: com.aspose.slides.internal.dn.c5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3191c5 {

    /* JADX INFO: renamed from: com.aspose.slides.internal.dn.c5$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: c5 */
        private int f9476c5;

        /* JADX INFO: renamed from: ck */
        private String f9477ck;

        /* JADX INFO: renamed from: du */
        private String f9478du;

        /* JADX INFO: renamed from: dy */
        private int f9479dy;

        /* JADX INFO: renamed from: fa */
        private String f9480fa;

        /* JADX INFO: renamed from: h4 */
        private String f9481h4;

        /* JADX INFO: renamed from: ix */
        private RuntimeException f9482ix;

        /* JADX INFO: renamed from: jd */
        private String f9483jd;

        /* JADX INFO: renamed from: k4 */
        boolean f9484k4;

        /* JADX INFO: renamed from: kk */
        private C11683c5 f9485kk;

        /* JADX INFO: renamed from: ks */
        private int f9486ks;

        /* JADX INFO: renamed from: m9 */
        private int f9487m9;

        /* JADX INFO: renamed from: ne */
        private char[] f9488ne;

        /* JADX INFO: renamed from: rv */
        private int f9490rv;

        /* JADX INFO: renamed from: to */
        private String f9491to;

        /* JADX INFO: renamed from: x1 */
        private int f9496x1;

        /* JADX INFO: renamed from: x6 */
        private byte[] f9497x6;

        /* JADX INFO: renamed from: yj */
        private char f9498yj;

        /* JADX INFO: renamed from: up */
        private int f9493up = 1;

        /* JADX INFO: renamed from: u4 */
        private boolean f9492u4 = false;

        /* JADX INFO: renamed from: uz */
        private boolean f9494uz = false;

        /* JADX INFO: renamed from: wl */
        private boolean f9495wl = false;

        /* JADX INFO: renamed from: qq */
        private boolean f9489qq = false;

        /* JADX INFO: renamed from: ar */
        private boolean f9475ar = false;

        /* JADX INFO: renamed from: com.aspose.slides.internal.dn.c5$k4$k4, reason: collision with other inner class name */
        public enum EnumC19057k4 {
            None,
            Break,
            Continue,
            Return
        }

        public k4(int i, C11683c5 c11683c5, String str, byte[] bArr, char[] cArr, int i2, int i3, boolean z) {
            this.f9487m9 = 0;
            this.f9479dy = 0;
            this.f9476c5 = 0;
            this.f9483jd = null;
            this.f9477ck = null;
            this.f9480fa = null;
            this.f9496x1 = i;
            this.f9485kk = c11683c5;
            this.f9491to = str;
            this.f9497x6 = bArr;
            this.f9488ne = cArr;
            this.f9486ks = i2;
            this.f9490rv = i3;
            this.f9484k4 = z;
            this.f9478du = c11683c5.m55042dq();
            this.f9481h4 = c11683c5.m55064rv();
            if ((i & 32) != 0) {
                String strM55062ne = c11683c5.m55062ne();
                this.f9483jd = strM55062ne;
                this.f9487m9 = strM55062ne.length();
            }
            if ((i & 64) != 0) {
                String strM55050ix = c11683c5.m55050ix();
                this.f9477ck = strM55050ix;
                this.f9479dy = strM55050ix.length();
            }
            if ((i & 256) != 0) {
                String strM55040c5 = c11683c5.m55040c5();
                this.f9480fa = strM55040c5;
                this.f9476c5 = strM55040c5.length();
            }
        }

        /* JADX INFO: renamed from: c5 */
        private boolean m13710c5() {
            int i = this.f9496x1;
            return !((i & 4) == 0 && (i & 8) == 0) && m13725m9();
        }

        /* JADX INFO: renamed from: ck */
        private boolean m13712ck() {
            return this.f9498yj == this.f9481h4.charAt(0) && C14113y2.m67363du(C14113y2.m67443x1(this.f9491to, this.f9486ks, this.f9481h4.length()), this.f9481h4);
        }

        /* JADX INFO: renamed from: fa */
        private boolean m13716fa() {
            return m13718jd() || m13712ck();
        }

        /* JADX INFO: renamed from: jd */
        private boolean m13718jd() {
            return this.f9498yj == this.f9478du.charAt(0) && C14113y2.m67363du(C14113y2.m67443x1(this.f9491to, this.f9486ks, this.f9478du.length()), this.f9478du);
        }

        /* JADX INFO: renamed from: m9 */
        private boolean m13725m9() {
            if (this.f9494uz) {
                return false;
            }
            boolean zM13718jd = m13718jd();
            if (!zM13718jd && !m13712ck()) {
                return false;
            }
            this.f9493up = 2;
            this.f9486ks = ((zM13718jd ? this.f9478du : this.f9481h4).length() - 1) + this.f9486ks;
            this.f9492u4 = !zM13718jd;
            this.f9494uz = true;
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: up */
        public EnumC19057k4 m13728up() {
            if (C14117yj.m67539to(this.f9498yj)) {
                char[] cArr = this.f9488ne;
                int i = this.f9490rv;
                char c = this.f9498yj;
                cArr[i] = c;
                byte[] bArr = this.f9497x6;
                this.f9490rv = i + 1;
                bArr[i] = (byte) c;
            } else {
                char c2 = this.f9498yj;
                if (c2 != 'e' && c2 != 'E') {
                    EnumC19057k4 enumC19057k4M13723k4 = m13723k4(2);
                    if (enumC19057k4M13723k4 != EnumC19057k4.None) {
                        return enumC19057k4M13723k4;
                    }
                    if (C14117yj.m67534ks(this.f9498yj)) {
                        return m13731yj();
                    }
                    if (!this.f9484k4) {
                        this.f9482ix = new FormatException(C14113y2.m67407k4("Unknown char: ", Character.valueOf(this.f9498yj)));
                    }
                    return EnumC19057k4.Return;
                }
                if ((this.f9496x1 & 128) == 0) {
                    if (!this.f9484k4) {
                        this.f9482ix = new FormatException(C14113y2.m67407k4("Unknown char: ", Character.valueOf(this.f9498yj)));
                    }
                    return EnumC19057k4.Return;
                }
                char[] cArr2 = this.f9488ne;
                int i2 = this.f9490rv;
                cArr2[i2] = c2;
                byte[] bArr2 = this.f9497x6;
                this.f9490rv = i2 + 1;
                bArr2[i2] = (byte) c2;
                this.f9493up = 4;
            }
            return EnumC19057k4.Break;
        }

        /* JADX INFO: renamed from: x1 */
        public static /* synthetic */ int m13729x1(k4 k4Var) {
            int i = k4Var.f9486ks;
            k4Var.f9486ks = i + 1;
            return i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: yj */
        public EnumC19057k4 m13731yj() {
            if (C14117yj.m67534ks(this.f9498yj)) {
                if (this.f9494uz && !this.f9489qq && !this.f9495wl) {
                    if (!this.f9484k4) {
                        this.f9482ix = new FormatException("Whitespace between sign and number");
                    }
                    return EnumC19057k4.Return;
                }
                int i = this.f9496x1;
                if ((i & 1) != 0 && !this.f9489qq) {
                    this.f9493up = 6;
                    return EnumC19057k4.Break;
                }
                if ((i & 2) != 0 && this.f9489qq) {
                    this.f9493up = 6;
                    return EnumC19057k4.Break;
                }
            }
            if (C14117yj.m67539to(this.f9498yj) || (this.f9487m9 > 0 && this.f9483jd.charAt(0) == this.f9498yj)) {
                if (!this.f9489qq) {
                    this.f9493up = 2;
                    return m13735kk();
                }
                if (!this.f9484k4) {
                    this.f9482ix = new FormatException("Unknown char");
                }
                return EnumC19057k4.Return;
            }
            EnumC19057k4 enumC19057k4M13723k4 = m13723k4(6);
            if (enumC19057k4M13723k4 != EnumC19057k4.None) {
                return enumC19057k4M13723k4;
            }
            if ((this.f9496x1 & 4) != 0 && !this.f9489qq && m13710c5()) {
                return EnumC19057k4.Continue;
            }
            if ((this.f9496x1 & 8) != 0 && this.f9489qq && m13710c5()) {
                return EnumC19057k4.Continue;
            }
            if (!this.f9484k4) {
                this.f9482ix = new FormatException("Unknown char");
            }
            return EnumC19057k4.Return;
        }

        /* JADX INFO: renamed from: du */
        public EnumC19057k4 m13732du() {
            if (!C14117yj.m67539to(this.f9498yj)) {
                if (C14117yj.m67534ks(this.f9498yj)) {
                    return m13731yj();
                }
                if (!this.f9484k4) {
                    this.f9482ix = new FormatException(C14113y2.m67407k4("Unknown char: ", Character.valueOf(this.f9498yj)));
                }
                return EnumC19057k4.Return;
            }
            char[] cArr = this.f9488ne;
            int i = this.f9490rv;
            char c = this.f9498yj;
            cArr[i] = c;
            byte[] bArr = this.f9497x6;
            this.f9490rv = i + 1;
            bArr[i] = (byte) c;
            return EnumC19057k4.Break;
        }

        /* JADX INFO: renamed from: h4 */
        public int m13733h4() {
            return this.f9493up;
        }

        /* JADX INFO: renamed from: to */
        public EnumC19057k4 m13736to() {
            if (C14117yj.m67539to(this.f9498yj)) {
                this.f9493up = 5;
                return EnumC19057k4.None;
            }
            if (m13715dy()) {
                return EnumC19057k4.Continue;
            }
            if (C14117yj.m67534ks(this.f9498yj)) {
                return m13731yj();
            }
            if (!this.f9484k4) {
                this.f9482ix = new FormatException(C14113y2.m67407k4("Unknown char: ", Character.valueOf(this.f9498yj)));
            }
            return EnumC19057k4.Return;
        }

        /* JADX INFO: renamed from: dy */
        private boolean m13715dy() {
            int i;
            String str;
            if (m13718jd()) {
                this.f9493up = 2;
                i = this.f9486ks;
                str = this.f9478du;
            } else {
                if (!m13712ck()) {
                    return false;
                }
                this.f9493up = 2;
                char[] cArr = this.f9488ne;
                int i2 = this.f9490rv;
                cArr[i2] = '-';
                byte[] bArr = this.f9497x6;
                this.f9490rv = i2 + 1;
                bArr[i2] = PatternStyle.DottedGrid;
                i = this.f9486ks;
                str = this.f9481h4;
            }
            this.f9486ks = (str.length() - 1) + i;
            return true;
        }

        /* JADX INFO: renamed from: kk */
        public EnumC19057k4 m13735kk() {
            if (C14117yj.m67539to(this.f9498yj)) {
                if (this.f9475ar) {
                    if (!this.f9484k4) {
                        this.f9482ix = new FormatException(C14113y2.m67407k4("Currency inside a number: ", Character.valueOf(this.f9498yj)));
                    }
                    return EnumC19057k4.Return;
                }
                this.f9489qq = true;
                char[] cArr = this.f9488ne;
                int i = this.f9490rv;
                char c = this.f9498yj;
                cArr[i] = c;
                byte[] bArr = this.f9497x6;
                this.f9490rv = i + 1;
                bArr[i] = (byte) c;
                return EnumC19057k4.Break;
            }
            char c2 = this.f9498yj;
            if (c2 == 'e' || c2 == 'E') {
                this.f9493up = 3;
                return m13728up();
            }
            if (this.f9487m9 > 0 && this.f9483jd.charAt(0) == this.f9498yj && C14113y2.m67436x1(this.f9491to, this.f9486ks, this.f9483jd, 0, this.f9487m9) == 0) {
                char[] cArr2 = this.f9488ne;
                int i2 = this.f9490rv;
                cArr2[i2] = FilenameUtils.EXTENSION_SEPARATOR;
                byte[] bArr2 = this.f9497x6;
                this.f9490rv = i2 + 1;
                bArr2[i2] = PatternStyle.Divot;
                this.f9486ks = (this.f9487m9 - 1) + this.f9486ks;
                this.f9493up = 3;
                return EnumC19057k4.Break;
            }
            if (this.f9479dy > 0 && (this.f9477ck.charAt(0) == this.f9498yj || (C14117yj.m67534ks(this.f9477ck.charAt(0)) && C14117yj.m67534ks(this.f9498yj)))) {
                this.f9486ks = (this.f9479dy - 1) + this.f9486ks;
                this.f9493up = 2;
                return EnumC19057k4.Break;
            }
            EnumC19057k4 enumC19057k4M13723k4 = m13723k4(1);
            if (enumC19057k4M13723k4 != EnumC19057k4.None) {
                return enumC19057k4M13723k4;
            }
            if (C14117yj.m67534ks(this.f9498yj)) {
                return m13731yj();
            }
            if ((this.f9496x1 & 8) != 0 && m13710c5()) {
                return EnumC19057k4.Continue;
            }
            if (!this.f9484k4) {
                this.f9482ix = new FormatException(C14113y2.m67407k4("Unknown char: ", Character.valueOf(this.f9498yj)));
            }
            return EnumC19057k4.Return;
        }

        /* JADX INFO: renamed from: x1 */
        public EnumC19057k4 m13737x1() {
            if (m13716fa()) {
                if ((this.f9496x1 & 4) == 0) {
                    if (!this.f9484k4) {
                        this.f9482ix = new FormatException();
                    }
                    return EnumC19057k4.Return;
                }
                if (m13710c5()) {
                    return EnumC19057k4.Continue;
                }
            }
            this.f9493up = 2;
            return m13735kk();
        }

        /* JADX INFO: renamed from: k4 */
        private EnumC19057k4 m13723k4(int i) {
            if (this.f9476c5 <= 0 || this.f9480fa.charAt(0) != this.f9498yj || !C14113y2.m67363du(C14113y2.m67443x1(this.f9491to, this.f9486ks, this.f9476c5), this.f9480fa)) {
                return EnumC19057k4.None;
            }
            if (this.f9495wl) {
                if (!this.f9484k4) {
                    this.f9482ix = new FormatException();
                }
                return EnumC19057k4.Return;
            }
            this.f9486ks = (this.f9476c5 - 1) + this.f9486ks;
            this.f9493up = i;
            this.f9495wl = true;
            this.f9475ar = this.f9489qq;
            return EnumC19057k4.Break;
        }

        /* JADX INFO: renamed from: k4 */
        public RuntimeException m13734k4() {
            return this.f9482ix;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static double m13705k4(String str) {
        return m13706k4(str, 231, null);
    }

    /* JADX INFO: renamed from: k4 */
    public static double m13706k4(String str, int i, InterfaceC14073kp interfaceC14073kp) {
        double[] dArr = {0.0d};
        RuntimeException[] runtimeExceptionArr = {null};
        boolean zM13708k4 = m13708k4(str, i, interfaceC14073kp, false, dArr, runtimeExceptionArr);
        double d = dArr[0];
        RuntimeException runtimeException = runtimeExceptionArr[0];
        if (zM13708k4) {
            return d;
        }
        throw runtimeException;
    }

    /* JADX INFO: renamed from: k4 */
    public static double m13707k4(String str, InterfaceC14073kp interfaceC14073kp) {
        return m13706k4(str, 231, interfaceC14073kp);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(9:58|(4:61|(2:63|168)(2:64|SW:65)|130|59)|167|131|155|132|(0)|135|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01b9, code lost:
    
        r15 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x013c  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m13708k4(String str, int i, InterfaceC14073kp interfaceC14073kp, boolean z, double[] dArr, RuntimeException[] runtimeExceptionArr) {
        int i2;
        boolean z2;
        double d = 0.0d;
        dArr[0] = 0.0d;
        runtimeExceptionArr[0] = null;
        if (str == null) {
            if (!z) {
                runtimeExceptionArr[0] = new ArgumentNullException("s");
            }
            return false;
        }
        if (str.length() == 0) {
            if (!z) {
                runtimeExceptionArr[0] = new FormatException();
            }
            return false;
        }
        if ((i & 512) != 0) {
            throw new ArgumentException(C14113y2.m67402k4("Double doesn't support parsing with '{0}'.", "AllowHexSpecifier"));
        }
        if (i > 511) {
            if (!z) {
                runtimeExceptionArr[0] = new ArgumentException();
            }
            return false;
        }
        C11683c5 c11683c5M55035k4 = C11683c5.m55035k4(interfaceC14073kp);
        if (c11683c5M55035k4 == null) {
            throw new Exception("How did this happen?");
        }
        int length = str.length();
        boolean z3 = (i & 1) != 0;
        boolean z4 = (i & 2) != 0;
        if (z3) {
            int i3 = 0;
            while (i3 < length && C14117yj.m67534ks(str.charAt(i3))) {
                i3++;
            }
            if (i3 == length) {
                if (!z) {
                    runtimeExceptionArr[0] = C3192ck.m13742k4();
                }
                return false;
            }
            i2 = i3;
        } else {
            i2 = 0;
        }
        int length2 = str.length() - 1;
        if (z4) {
            while (C14117yj.m67534ks(str.charAt(length2))) {
                length2--;
            }
        }
        int i4 = length2;
        if (m13709k4(c11683c5M55035k4.m55047fa(), str, i2, i4)) {
            dArr[0] = Double.NaN;
            return true;
        }
        if (m13709k4(c11683c5M55035k4.m55036ak(), str, i2, i4)) {
            dArr[0] = Double.POSITIVE_INFINITY;
            return true;
        }
        if (m13709k4(c11683c5M55035k4.m55058ks(), str, i2, i4)) {
            dArr[0] = Double.NEGATIVE_INFINITY;
            return true;
        }
        int i5 = length + 1;
        char[] cArr = new char[i5];
        k4 k4Var = new k4(i, c11683c5M55035k4, str, new byte[i5], cArr, i2, 0, z);
        k4Var.f9493up = 6;
        while (k4Var.f9486ks <= i4) {
            k4Var.f9498yj = str.charAt(k4Var.f9486ks);
            if (k4Var.f9498yj == 0) {
                k4Var.f9486ks = length;
            } else {
                switch (k4Var.m13733h4()) {
                    case 1:
                        k4.EnumC19057k4 enumC19057k4M13737x1 = k4Var.m13737x1();
                        if (enumC19057k4M13737x1 == k4.EnumC19057k4.Return) {
                            runtimeExceptionArr[0] = k4Var.m13734k4();
                            return false;
                        }
                        if (enumC19057k4M13737x1 != k4.EnumC19057k4.Break) {
                            if (enumC19057k4M13737x1 == k4.EnumC19057k4.Continue) {
                                continue;
                            } else {
                                k4.EnumC19057k4 enumC19057k4M13735kk = k4Var.m13735kk();
                                if (enumC19057k4M13735kk == k4.EnumC19057k4.Return) {
                                    runtimeExceptionArr[0] = k4Var.m13734k4();
                                    return false;
                                }
                                if (enumC19057k4M13735kk != k4.EnumC19057k4.Break) {
                                    if (enumC19057k4M13735kk == k4.EnumC19057k4.Continue) {
                                        continue;
                                    } else {
                                        k4.EnumC19057k4 enumC19057k4M13728up = k4Var.m13728up();
                                        if (enumC19057k4M13728up == k4.EnumC19057k4.Return) {
                                            runtimeExceptionArr[0] = k4Var.m13734k4();
                                            return false;
                                        }
                                        if (enumC19057k4M13728up != k4.EnumC19057k4.Break) {
                                            if (enumC19057k4M13728up == k4.EnumC19057k4.Continue) {
                                                continue;
                                            } else {
                                                k4.EnumC19057k4 enumC19057k4M13736to = k4Var.m13736to();
                                                if (enumC19057k4M13736to == k4.EnumC19057k4.Return) {
                                                    runtimeExceptionArr[0] = k4Var.m13734k4();
                                                    return false;
                                                }
                                                if (enumC19057k4M13736to != k4.EnumC19057k4.Break) {
                                                    if (enumC19057k4M13736to != k4.EnumC19057k4.Continue) {
                                                        k4.EnumC19057k4 enumC19057k4M13732du = k4Var.m13732du();
                                                        if (enumC19057k4M13732du == k4.EnumC19057k4.Return) {
                                                            runtimeExceptionArr[0] = k4Var.m13734k4();
                                                            return false;
                                                        }
                                                        if (enumC19057k4M13732du == k4.EnumC19057k4.Break || enumC19057k4M13732du != k4.EnumC19057k4.Continue) {
                                                            if (k4Var.f9493up == 7) {
                                                                k4Var.f9497x6[k4Var.f9490rv] = 0;
                                                                k4Var.f9488ne[k4Var.f9490rv] = 0;
                                                                d = Double.parseDouble(C14113y2.m67405k4(cArr));
                                                                if (k4Var.f9492u4) {
                                                                    d = -d;
                                                                }
                                                                z2 = false;
                                                                if (!z2) {
                                                                    if (!z) {
                                                                        runtimeExceptionArr[0] = C3192ck.m13742k4();
                                                                    }
                                                                    return false;
                                                                }
                                                                if (!C14044b3.m66424du(d) && !C14044b3.m66438to(d)) {
                                                                    dArr[0] = d;
                                                                    return true;
                                                                }
                                                                if (!z) {
                                                                    runtimeExceptionArr[0] = new OverflowException();
                                                                }
                                                                return false;
                                                            }
                                                        }
                                                    } else {
                                                        continue;
                                                    }
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    case 6:
                        k4.EnumC19057k4 enumC19057k4M13731yj = k4Var.m13731yj();
                        if (enumC19057k4M13731yj == k4.EnumC19057k4.Return) {
                            runtimeExceptionArr[0] = k4Var.m13734k4();
                            return false;
                        }
                        if (enumC19057k4M13731yj != k4.EnumC19057k4.Break) {
                            if (enumC19057k4M13731yj == k4.EnumC19057k4.Continue) {
                                continue;
                            }
                        }
                        break;
                }
            }
            k4.m13729x1(k4Var);
        }
        k4Var.f9497x6[k4Var.f9490rv] = 0;
        k4Var.f9488ne[k4Var.f9490rv] = 0;
        d = Double.parseDouble(C14113y2.m67405k4(cArr));
        if (k4Var.f9492u4) {
        }
        z2 = false;
        if (!z2) {
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m13709k4(String str, String str2, int i, int i2) {
        return (i2 - i) + 1 == str.length() && C14113y2.m67436x1(str, 0, str2, i, str.length()) == 0;
    }
}
