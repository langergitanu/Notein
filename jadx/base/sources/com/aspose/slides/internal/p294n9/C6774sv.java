package com.aspose.slides.internal.p294n9;

import com.aspose.slides.PatternStyle;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.network.embedded.C18293o1;

/* JADX INFO: renamed from: com.aspose.slides.internal.n9.sv */
/* JADX INFO: loaded from: classes4.dex */
public class C6774sv extends AbstractC6747ar {

    /* JADX INFO: renamed from: k4 */
    public static final C6774sv f18717k4 = new C6774sv();

    /* JADX INFO: renamed from: du */
    private boolean f18718du;

    /* JADX INFO: renamed from: kk */
    private byte[] f18719kk;

    /* JADX INFO: renamed from: to */
    private boolean[] f18720to;

    /* JADX INFO: renamed from: x1 */
    private byte[] f18721x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.n9.sv$k4 */
    public static final class k4 extends C6753ck {

        /* JADX INFO: renamed from: h4 */
        public int f18722h4;

        /* JADX INFO: renamed from: k4 */
        public int f18723k4;

        /* JADX INFO: renamed from: m9 */
        public boolean f18724m9;

        public k4(C6774sv c6774sv) {
            super(c6774sv);
        }

        @Override // com.aspose.slides.internal.p294n9.C6753ck, com.aspose.slides.internal.p294n9.AbstractC6760h4
        /* JADX INFO: renamed from: k4 */
        public void mo26629k4() {
            this.f18723k4 = 0;
            this.f18722h4 = -1;
            this.f18724m9 = false;
            AbstractC6762jd abstractC6762jd = this.f18666kk;
            if (abstractC6762jd != null) {
                abstractC6762jd.mo26768kk();
            }
        }

        @Override // com.aspose.slides.internal.p294n9.C6753ck
        /* JADX INFO: renamed from: x1 */
        public boolean mo26630x1() {
            return this.f18722h4 != -1;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.n9.sv$kk */
    public static final class kk extends AbstractC6762jd {

        /* JADX INFO: renamed from: du */
        private int f18725du;

        /* JADX INFO: renamed from: kk */
        private char f18726kk = 0;

        /* JADX INFO: renamed from: to */
        private int f18727to = -1;

        public kk(x1 x1Var) {
        }

        @Override // com.aspose.slides.internal.p294n9.AbstractC6762jd
        /* JADX INFO: renamed from: k4 */
        public char mo26744k4() {
            int i = this.f18727to;
            this.f18727to = i - 1;
            if (i > 0) {
                return this.f18726kk;
            }
            return (char) 0;
        }

        @Override // com.aspose.slides.internal.p294n9.AbstractC6762jd
        /* JADX INFO: renamed from: kk */
        public void mo26768kk() {
            this.f18727to = -1;
            this.f18675k4 = 0;
        }

        @Override // com.aspose.slides.internal.p294n9.AbstractC6762jd
        /* JADX INFO: renamed from: x1 */
        public int mo26746x1() {
            int i = this.f18727to;
            if (i > 0) {
                return i;
            }
            return 0;
        }

        @Override // com.aspose.slides.internal.p294n9.AbstractC6762jd
        /* JADX INFO: renamed from: k4 */
        public boolean mo26745k4(byte[] bArr, int i) {
            char c = (char) (bArr[0] & 255);
            this.f18726kk = c;
            if (c == 0) {
                return false;
            }
            this.f18725du = 1;
            this.f18727to = 1;
            return true;
        }

        @Override // com.aspose.slides.internal.p294n9.AbstractC6762jd
        /* JADX INFO: renamed from: x1 */
        public int mo26770x1(byte[] bArr, int i) {
            if (bArr.length == 1) {
                return (bArr[0] & 255) == 0 ? 0 : 1;
            }
            throw new ArgumentException("String contains invalid Unicode code points.");
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.n9.sv$to */
    public static final class to extends C6780uz {

        /* JADX INFO: renamed from: h4 */
        public int f18728h4;

        /* JADX INFO: renamed from: m9 */
        public int f18729m9;

        public to(C6774sv c6774sv) {
            super(c6774sv);
        }

        @Override // com.aspose.slides.internal.p294n9.C6780uz
        /* JADX INFO: renamed from: m9 */
        public boolean mo26631m9() {
            return (this.f18728h4 == 0 && this.f18729m9 == -1) ? false : true;
        }

        @Override // com.aspose.slides.internal.p294n9.C6780uz, com.aspose.slides.internal.p294n9.AbstractC6766ks
        /* JADX INFO: renamed from: to */
        public void mo26632to() {
            this.f18729m9 = -1;
            this.f18728h4 = 0;
            AbstractC6761ix abstractC6761ix = this.f18690x1;
            if (abstractC6761ix != null) {
                abstractC6761ix.mo26763to();
            }
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.n9.sv$x1 */
    public static final class x1 extends AbstractC6751c5 {
        public boolean equals(Object obj) {
            return ((x1) C7019kk.m27452k4(obj, x1.class)) != null;
        }

        public int hashCode() {
            return 984;
        }

        @Override // com.aspose.slides.internal.p294n9.AbstractC6751c5
        /* JADX INFO: renamed from: k4 */
        public AbstractC6762jd mo26734k4() {
            return new kk(this);
        }

        @Override // com.aspose.slides.internal.p294n9.AbstractC6751c5
        /* JADX INFO: renamed from: x1 */
        public int mo26735x1() {
            return 1;
        }
    }

    public C6774sv() {
        this(false);
    }

    /* JADX INFO: renamed from: to */
    private void m26825to() {
        this.f18721x1 = new byte[64];
        for (int i = 0; i < 64; i++) {
            this.f18721x1[i] = (byte) "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt(i);
        }
        this.f18719kk = new byte[128];
        for (int i2 = 0; i2 < 128; i2++) {
            this.f18719kk[i2] = -1;
        }
        for (int i3 = 0; i3 < 64; i3++) {
            this.f18719kk[this.f18721x1[i3] & 255] = (byte) i3;
        }
        this.f18720to = new boolean[128];
        for (int i4 = 0; i4 < 75; i4++) {
            this.f18720to["\t\n\r '(),-./0123456789:?ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".charAt(i4)] = true;
        }
        if (this.f18718du) {
            for (int i5 = 0; i5 < 20; i5++) {
                this.f18720to["!\"#$%&*;<=>@[]^_`{|}".charAt(i5)] = true;
            }
        }
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    public boolean equals(Object obj) {
        C6774sv c6774sv = (C6774sv) C7019kk.m27452k4(obj, C6774sv.class);
        return c6774sv != null && this.f18718du == c6774sv.f18718du && m26654ck().equals(c6774sv.m26654ck()) && m26656fa().equals(c6774sv.m26656fa());
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    public int hashCode() {
        return m26656fa().hashCode() + m26654ck().hashCode() + mo26673ks();
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    public int mo26620k4(int i) {
        if (i < 0) {
            throw new ArgumentOutOfRangeException("charCount", "Non-negative number required.");
        }
        long j = (((long) i) * 3) + 2;
        if (j <= 2147483647L) {
            return (int) j;
        }
        throw new ArgumentOutOfRangeException("charCount", "Too many characters. The resulting number of bytes is larger than what can be returned as an int.");
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: kk */
    public AbstractC6766ks mo26626kk() {
        return new to(this);
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: x1 */
    public int mo26627x1(int i) {
        if (i < 0) {
            throw new ArgumentOutOfRangeException("byteCount", "Non-negative number required.");
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public C6774sv(boolean z) {
        super(65000);
        this.f18718du = z;
        m26825to();
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    public int mo26658k4(String str) {
        if (str != null) {
            return mo26623k4(C14113y2.m67365dy(str), 0, str.length(), (C6780uz) null);
        }
        throw new ArgumentNullException("s");
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: x1 */
    public AbstractC6760h4 mo26628x1() {
        return new k4(this);
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    public int mo26659k4(String str, int i, int i2, byte[] bArr, int i3) {
        if (str == null || bArr == null) {
            throw new ArgumentNullException(str != null ? "bytes" : "s", "Array cannot be null.");
        }
        if (i < 0 || i2 < 0) {
            throw new ArgumentOutOfRangeException(i < 0 ? "charIndex" : "charCount", "Non-negative number required.");
        }
        if (str.length() - i < i2) {
            throw new ArgumentOutOfRangeException("s", "Index and count must refer to a location within the string.");
        }
        if (i3 < 0 || i3 > bArr.length) {
            throw new ArgumentOutOfRangeException("byteIndex", "Index was out of range. Must be non-negative and less than the size of the collection.");
        }
        return mo26624k4(C14113y2.m67365dy(str), i, i2, bArr, i3, bArr.length - i3, (C6780uz) null);
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: x1 */
    public String mo26682x1(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new ArgumentNullException("bytes", "Array cannot be null.");
        }
        if (i < 0 || i2 < 0) {
            throw new ArgumentOutOfRangeException(i < 0 ? FirebaseAnalytics.Param.INDEX : C18293o1.f55803f, "Non-negative number required.");
        }
        if (bArr.length - i >= i2) {
            return i2 == 0 ? C14113y2.f47374k4 : m26676to(bArr, i, i2);
        }
        throw new ArgumentOutOfRangeException("bytes", "Index and count must refer to a location within the buffer.");
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    public int mo26660k4(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new ArgumentNullException("bytes", "Array cannot be null.");
        }
        String str = C18293o1.f55803f;
        if (i2 < 0) {
            throw new ArgumentOutOfRangeException(C18293o1.f55803f, "Non-negative number required.");
        }
        if (i < 0 || i2 < 0) {
            if (i < 0) {
                str = FirebaseAnalytics.Param.INDEX;
            }
            throw new ArgumentOutOfRangeException(str, "Non-negative number required.");
        }
        if (bArr.length - i < i2) {
            throw new ArgumentOutOfRangeException("bytes", "Index and count must refer to a location within the buffer.");
        }
        if (i2 == 0) {
            return 0;
        }
        return mo26621k4(bArr, i, i2, (C6753ck) null);
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    public int mo26621k4(byte[] bArr, int i, int i2, C6753ck c6753ck) {
        return mo26622k4(bArr, i, i2, (char[]) null, 0, 0, c6753ck);
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    public int mo26661k4(byte[] bArr, int i, int i2, char[] cArr, int i3) {
        if (bArr == null || cArr == null) {
            throw new ArgumentNullException(bArr != null ? "chars" : "bytes", "Array cannot be null.");
        }
        if (i < 0 || i2 < 0) {
            throw new ArgumentOutOfRangeException(i < 0 ? "byteIndex" : "byteCount", "Non-negative number required.");
        }
        if (bArr.length - i < i2) {
            throw new ArgumentOutOfRangeException("bytes", "Index and count must refer to a location within the buffer.");
        }
        if (i3 < 0 || i3 > cArr.length) {
            throw new ArgumentOutOfRangeException("charIndex", "Index was out of range. Must be non-negative and less than the size of the collection.");
        }
        if (i2 == 0) {
            return 0;
        }
        return mo26622k4(bArr, i, i2, cArr, i3, cArr.length - i3, (C6753ck) null);
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    public int mo26662k4(byte[] bArr, int i, int i2, char[] cArr, int i3, int i4) {
        if (bArr == null || cArr == null) {
            throw new ArgumentNullException(bArr == null ? "bytes" : "chars", "Array cannot be null.");
        }
        if (i4 < 0 || i2 < 0) {
            throw new ArgumentOutOfRangeException(i4 < 0 ? "charCount" : "byteCount", "Non-negative number required.");
        }
        return mo26622k4(bArr, i, i2, cArr, i3, i4, (C6753ck) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x003d A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int mo26622k4(byte[] bArr, int i, int i2, char[] cArr, int i3, int i4, C6753ck c6753ck) {
        int i5;
        boolean z;
        int i6;
        byte b;
        k4 k4Var = (k4) c6753ck;
        AbstractC6747ar.to toVar = new AbstractC6747ar.to(this, k4Var, cArr, i3, i4, bArr, i, i2);
        if (k4Var != null) {
            i5 = k4Var.f18723k4;
            i6 = k4Var.f18722h4;
            z = k4Var.f18724m9;
        } else {
            i5 = 0;
            z = false;
            i6 = -1;
        }
        if (i6 >= 16) {
            if (!toVar.m26708k4((char) ((i5 >> (i6 - 16)) & 65535))) {
                m26668k4((C6753ck) k4Var, true);
            }
            i6 -= 16;
        }
        while (true) {
            if (!toVar.m26704k4()) {
                break;
            }
            byte bM26714x1 = toVar.m26714x1();
            int i7 = 43;
            int i8 = bM26714x1 & 255;
            if (i6 >= 0) {
                if (i8 >= 128 || (b = this.f18719kk[i8]) < 0) {
                    if (i8 != 45) {
                        if (!toVar.m26705k4(bM26714x1)) {
                            i6 = -1;
                            break;
                        }
                    } else if (z) {
                        i6 = -1;
                        if (i7 < 0 && !toVar.m26708k4((char) i7)) {
                            if (i6 >= 0) {
                                toVar.m26703k4(1);
                                i6 += 16;
                            }
                        }
                    }
                    i6 = -1;
                } else {
                    i5 = (i5 << 6) | (b & 255);
                    int i9 = i6 + 6;
                    if (i9 >= 16) {
                        i7 = (i5 >> (i6 - 10)) & 65535;
                        i6 -= 10;
                        z = false;
                        if (i7 < 0) {
                            continue;
                        }
                    } else {
                        i6 = i9;
                        z = false;
                    }
                }
            } else if (i8 == 43) {
                i6 = 0;
                z = true;
            } else if (i8 < 128) {
                i7 = i8;
                if (i7 < 0) {
                }
            } else if (!toVar.m26705k4(bM26714x1)) {
                break;
            }
        }
        if (cArr != null && k4Var != null) {
            if (k4Var.m26738h4()) {
                k4Var.f18723k4 = 0;
                k4Var.f18722h4 = -1;
                k4Var.f18724m9 = false;
            } else {
                k4Var.f18723k4 = i5;
                k4Var.f18722h4 = i6;
                k4Var.f18724m9 = z;
            }
            k4Var.f18640du = toVar.m26712kk();
        }
        return toVar.m26713to();
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    public int mo26663k4(char[] cArr, int i, int i2) {
        if (cArr == null) {
            throw new ArgumentNullException("chars", "Array cannot be null.");
        }
        String str = C18293o1.f55803f;
        if (i2 < 0) {
            throw new ArgumentOutOfRangeException(C18293o1.f55803f, "Non-negative number required.");
        }
        if (i < 0 || i2 < 0) {
            if (i < 0) {
                str = FirebaseAnalytics.Param.INDEX;
            }
            throw new ArgumentOutOfRangeException(str, "Non-negative number required.");
        }
        if (cArr.length - i < i2) {
            throw new ArgumentOutOfRangeException("chars", "Index and count must refer to a location within the buffer.");
        }
        if (i2 == 0) {
            return 0;
        }
        return mo26623k4(cArr, i, i2, (C6780uz) null);
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    public int mo26623k4(char[] cArr, int i, int i2, C6780uz c6780uz) {
        return mo26624k4(cArr, i, i2, (byte[]) null, 0, 0, c6780uz);
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    public int mo26664k4(char[] cArr, int i, int i2, byte[] bArr, int i3) {
        if (cArr == null || bArr == null) {
            throw new ArgumentNullException(cArr != null ? "bytes" : "chars", "Array cannot be null.");
        }
        if (i < 0 || i2 < 0) {
            throw new ArgumentOutOfRangeException(i < 0 ? "charIndex" : "charCount", "Non-negative number required.");
        }
        if (cArr.length - i < i2) {
            throw new ArgumentOutOfRangeException("chars", "Index and count must refer to a location within the buffer.");
        }
        if (i3 < 0 || i3 > bArr.length) {
            throw new ArgumentOutOfRangeException("byteIndex", "Index was out of range. Must be non-negative and less than the size of the collection.");
        }
        if (i2 == 0) {
            return 0;
        }
        return mo26624k4(cArr, i, i2, bArr, i3, bArr.length - i3, (C6780uz) null);
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    public int mo26665k4(char[] cArr, int i, int i2, byte[] bArr, int i3, int i4) {
        if (bArr == null || cArr == null) {
            throw new ArgumentNullException(bArr == null ? "bytes" : "chars", "Array cannot be null.");
        }
        if (i2 < 0 || i4 < 0) {
            throw new ArgumentOutOfRangeException(i2 < 0 ? "charCount" : "byteCount", "Non-negative number required.");
        }
        return mo26624k4(cArr, i, i2, bArr, i3, i4, (C6780uz) null);
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    public int mo26624k4(char[] cArr, int i, int i2, byte[] bArr, int i3, int i4, C6780uz c6780uz) {
        int i5;
        int i6;
        to toVar = (to) c6780uz;
        AbstractC6747ar.kk kkVar = new AbstractC6747ar.kk(this, toVar, bArr, i3, i4, cArr, i, i2);
        int i7 = 0;
        int i8 = -1;
        if (toVar != null) {
            i5 = toVar.f18728h4;
            i6 = toVar.f18729m9;
            while (i6 >= 6) {
                i6 -= 6;
                if (!kkVar.m26692k4(this.f18721x1[(i5 >> i6) & 63])) {
                    m26670k4(toVar, kkVar.m26701to() == 0);
                }
            }
        } else {
            i5 = 0;
            i6 = -1;
        }
        while (kkVar.m26691k4()) {
            char cM26702x1 = kkVar.m26702x1();
            if (cM26702x1 < 128 && this.f18720to[cM26702x1]) {
                if (i6 >= 0) {
                    if (i6 > 0) {
                        if (!kkVar.m26692k4(this.f18721x1[(i5 << (6 - i6)) & 63])) {
                            break;
                        }
                        i6 = 0;
                    }
                    if (!kkVar.m26692k4(PatternStyle.DottedGrid)) {
                        break;
                    }
                    i6 = -1;
                }
                if (!kkVar.m26692k4((byte) cM26702x1)) {
                    break;
                }
            } else if (i6 >= 0 || cM26702x1 != '+') {
                if (i6 < 0) {
                    if (!kkVar.m26692k4(PatternStyle.Sphere)) {
                        break;
                    }
                    i6 = 0;
                }
                i5 = (i5 << 16) | cM26702x1;
                i6 += 16;
                while (true) {
                    if (i6 < 6) {
                        break;
                    }
                    int i9 = i6 - 6;
                    if (!kkVar.m26692k4(this.f18721x1[(i5 >> i9) & 63])) {
                        kkVar.m26702x1();
                        break;
                    }
                    i6 = i9;
                }
                if (i6 >= 6) {
                    break;
                }
            } else if (!kkVar.m26693k4(PatternStyle.Sphere, PatternStyle.DottedGrid)) {
                break;
            }
        }
        if (i6 < 0 || !(toVar == null || toVar.m26835h4())) {
            i7 = i5;
            i8 = i6;
        } else {
            if (i6 > 0 && kkVar.m26692k4(this.f18721x1[(i5 << (6 - i6)) & 63])) {
                i6 = 0;
            }
            if (!kkVar.m26692k4(PatternStyle.DottedGrid)) {
                kkVar.m26702x1();
                i7 = i5;
                i8 = i6;
            }
        }
        if (bArr != null && toVar != null) {
            toVar.f18728h4 = i7;
            toVar.f18729m9 = i8;
            toVar.f18745du = kkVar.m26700kk();
        }
        return kkVar.m26701to();
    }

    @Override // com.aspose.slides.internal.p294n9.AbstractC6747ar
    /* JADX INFO: renamed from: k4 */
    public void mo26666k4() {
        this.f18591ks = new C6782wl(C14113y2.f47374k4);
        this.f18592rv = new x1();
    }
}
