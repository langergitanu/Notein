package com.aspose.slides.internal.p294n9;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p294n9.C6783wp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.InterfaceC14059g8;

/* JADX INFO: renamed from: com.aspose.slides.internal.n9.ar */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6747ar implements InterfaceC14059g8, Cloneable {

    /* JADX INFO: renamed from: k4 */
    private static final C6783wp.kk f18590k4 = new C6783wp.kk(false);

    /* JADX INFO: renamed from: ks */
    public AbstractC6769ne f18591ks;

    /* JADX INFO: renamed from: rv */
    public AbstractC6751c5 f18592rv;

    /* JADX INFO: renamed from: up */
    public int f18593up;

    /* JADX INFO: renamed from: x1 */
    private boolean f18594x1;

    /* JADX INFO: renamed from: yj */
    public C6764kk f18595yj;

    /* JADX INFO: renamed from: com.aspose.slides.internal.n9.ar$k4 */
    public static final class k4 extends AbstractC6760h4 {

        /* JADX INFO: renamed from: k4 */
        private AbstractC6747ar f18596k4;

        public k4(AbstractC6747ar abstractC6747ar) {
            this.f18596k4 = abstractC6747ar;
        }

        @Override // com.aspose.slides.internal.p294n9.AbstractC6760h4
        /* JADX INFO: renamed from: k4 */
        public int mo26685k4(byte[] bArr, int i, int i2) {
            return mo26686k4(bArr, i, i2, false);
        }

        @Override // com.aspose.slides.internal.p294n9.AbstractC6760h4
        /* JADX INFO: renamed from: k4 */
        public int mo26686k4(byte[] bArr, int i, int i2, boolean z) {
            return this.f18596k4.mo26660k4(bArr, i, i2);
        }

        @Override // com.aspose.slides.internal.p294n9.AbstractC6760h4
        /* JADX INFO: renamed from: k4 */
        public int mo26687k4(byte[] bArr, int i, int i2, char[] cArr, int i3) {
            return mo26689k4(bArr, i, i2, cArr, i3, false);
        }

        @Override // com.aspose.slides.internal.p294n9.AbstractC6760h4
        /* JADX INFO: renamed from: k4 */
        public int mo26688k4(byte[] bArr, int i, int i2, char[] cArr, int i3, int i4, boolean z) {
            return this.f18596k4.mo26662k4(bArr, i, i2, cArr, i3, i4);
        }

        @Override // com.aspose.slides.internal.p294n9.AbstractC6760h4
        /* JADX INFO: renamed from: k4 */
        public int mo26689k4(byte[] bArr, int i, int i2, char[] cArr, int i3, boolean z) {
            return this.f18596k4.mo26661k4(bArr, i, i2, cArr, i3);
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.n9.ar$kk */
    public static class kk {

        /* JADX INFO: renamed from: c5 */
        private int f18597c5;

        /* JADX INFO: renamed from: ck */
        private AbstractC6747ar f18598ck;

        /* JADX INFO: renamed from: du */
        private int f18599du;

        /* JADX INFO: renamed from: dy */
        private int f18600dy;

        /* JADX INFO: renamed from: fa */
        private C6780uz f18601fa;

        /* JADX INFO: renamed from: h4 */
        private char[] f18602h4;

        /* JADX INFO: renamed from: jd */
        private int f18603jd = 0;

        /* JADX INFO: renamed from: k4 */
        public AbstractC6761ix f18604k4;

        /* JADX INFO: renamed from: kk */
        private int f18605kk;

        /* JADX INFO: renamed from: m9 */
        private int[] f18606m9;

        /* JADX INFO: renamed from: to */
        private int f18607to;

        /* JADX INFO: renamed from: x1 */
        private byte[] f18608x1;

        public kk(AbstractC6747ar abstractC6747ar, C6780uz c6780uz, byte[] bArr, int i, int i2, char[] cArr, int i3, int i4) {
            this.f18606m9 = new int[]{i3};
            this.f18598ck = abstractC6747ar;
            this.f18601fa = c6780uz;
            this.f18600dy = i3;
            this.f18602h4 = cArr;
            this.f18597c5 = i3 + i4;
            this.f18608x1 = bArr;
            this.f18605kk = i;
            this.f18607to = i;
            this.f18599du = i + i2;
            if (c6780uz == null) {
                this.f18604k4 = abstractC6747ar.m26654ck().mo26736k4();
            } else {
                this.f18604k4 = c6780uz.m26814x1();
                C6780uz c6780uz2 = this.f18601fa;
                if (c6780uz2.f18749to && c6780uz2.m26813kk() && this.f18604k4.mo26762kk() > 0) {
                    throw new ArgumentException(C6770qm.m26824k4("Must complete Convert() operation or call Encoder.Reset() before calling GetBytes() or GetByteCount(). Encoder '{0}' fallback '{1}'.", this.f18601fa.m26833du().mo26653c5(), C14067j2.m66727k4(this.f18601fa.m26811k4())));
                }
            }
            this.f18604k4.m26758k4(this.f18606m9[0], this.f18597c5, this.f18601fa, this.f18608x1 != null);
        }

        /* JADX INFO: renamed from: k4 */
        public final void m26690k4(boolean z) {
            AbstractC6761ix abstractC6761ix = this.f18604k4;
            if (abstractC6761ix.f18669h4) {
                abstractC6761ix.mo26764x1();
            } else {
                int[] iArr = this.f18606m9;
                int i = iArr[0];
                if (i > this.f18600dy) {
                    iArr[0] = i - 1;
                }
            }
            if (z) {
                this.f18598ck.m26670k4(this.f18601fa, this.f18605kk == this.f18607to);
            }
        }

        /* JADX INFO: renamed from: kk */
        public final int m26700kk() {
            return this.f18606m9[0] - this.f18600dy;
        }

        /* JADX INFO: renamed from: to */
        public final int m26701to() {
            return this.f18603jd;
        }

        /* JADX INFO: renamed from: x1 */
        public final char m26702x1() {
            int[] iArr;
            int i;
            char cM26755h4 = this.f18604k4.m26755h4();
            if (cM26755h4 != 0 || (i = (iArr = this.f18606m9)[0]) >= this.f18597c5) {
                return cM26755h4;
            }
            char[] cArr = this.f18602h4;
            iArr[0] = i + 1;
            return cArr[i];
        }

        /* JADX INFO: renamed from: k4 */
        public final boolean m26691k4() {
            return this.f18604k4.mo26762kk() > 0 || this.f18606m9[0] < this.f18597c5;
        }

        /* JADX INFO: renamed from: k4 */
        public final boolean m26692k4(byte b) {
            return m26698k4(b, 0);
        }

        /* JADX INFO: renamed from: k4 */
        public final boolean m26693k4(byte b, byte b2) {
            return m26697k4(b, b2, 0);
        }

        /* JADX INFO: renamed from: k4 */
        public final boolean m26694k4(byte b, byte b2, byte b3) {
            return m26696k4(b, b2, b3, 0);
        }

        /* JADX INFO: renamed from: k4 */
        public final boolean m26695k4(byte b, byte b2, byte b3, byte b4) {
            return m26698k4(b, 3) && m26698k4(b2, 2) && m26698k4(b3, 1) && m26698k4(b4, 0);
        }

        /* JADX INFO: renamed from: k4 */
        public final boolean m26696k4(byte b, byte b2, byte b3, int i) {
            return m26698k4(b, i + 2) && m26698k4(b2, i + 1) && m26698k4(b3, i);
        }

        /* JADX INFO: renamed from: k4 */
        public final boolean m26697k4(byte b, byte b2, int i) {
            return m26698k4(b, i + 1) && m26698k4(b2, i);
        }

        /* JADX INFO: renamed from: k4 */
        public final boolean m26698k4(byte b, int i) {
            byte[] bArr = this.f18608x1;
            if (bArr != null) {
                int i2 = this.f18605kk;
                if (i2 >= this.f18599du - i) {
                    m26690k4(true);
                    return false;
                }
                this.f18605kk = i2 + 1;
                bArr[i2] = b;
            }
            this.f18603jd++;
            return true;
        }

        /* JADX INFO: renamed from: k4 */
        public final boolean m26699k4(char c) {
            return this.f18604k4.m26761k4(c, this.f18602h4, new int[]{this.f18606m9[0]});
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.n9.ar$to */
    public static class to {

        /* JADX INFO: renamed from: c5 */
        private int f18609c5;

        /* JADX INFO: renamed from: ck */
        private int f18610ck;

        /* JADX INFO: renamed from: du */
        private int f18611du = 0;

        /* JADX INFO: renamed from: dy */
        private int f18612dy;

        /* JADX INFO: renamed from: fa */
        private AbstractC6762jd f18613fa;

        /* JADX INFO: renamed from: h4 */
        private AbstractC6747ar f18614h4;

        /* JADX INFO: renamed from: jd */
        private byte[] f18615jd;

        /* JADX INFO: renamed from: k4 */
        private char[] f18616k4;

        /* JADX INFO: renamed from: kk */
        private int f18617kk;

        /* JADX INFO: renamed from: m9 */
        private C6753ck f18618m9;

        /* JADX INFO: renamed from: to */
        private int f18619to;

        /* JADX INFO: renamed from: x1 */
        private int[] f18620x1;

        public to(AbstractC6747ar abstractC6747ar, C6753ck c6753ck, char[] cArr, int i, int i2, byte[] bArr, int i3, int i4) {
            this.f18620x1 = new int[]{i};
            this.f18614h4 = abstractC6747ar;
            this.f18618m9 = c6753ck;
            this.f18616k4 = cArr;
            this.f18617kk = i;
            this.f18619to = i + i2;
            this.f18612dy = i3;
            this.f18610ck = i3;
            this.f18615jd = bArr;
            this.f18609c5 = i3 + i4;
            this.f18613fa = c6753ck == null ? abstractC6747ar.m26656fa().mo26734k4() : c6753ck.m26753to();
            this.f18613fa.m26765k4(this.f18610ck, this.f18619to);
        }

        /* JADX INFO: renamed from: k4 */
        public final void m26703k4(int i) {
            this.f18610ck += i;
        }

        /* JADX INFO: renamed from: kk */
        public final int m26712kk() {
            return this.f18610ck - this.f18612dy;
        }

        /* JADX INFO: renamed from: to */
        public final int m26713to() {
            return this.f18611du;
        }

        /* JADX INFO: renamed from: x1 */
        public final byte m26714x1() {
            int i = this.f18610ck;
            if (i >= this.f18609c5) {
                return (byte) 0;
            }
            byte[] bArr = this.f18615jd;
            this.f18610ck = i + 1;
            return bArr[i];
        }

        /* JADX INFO: renamed from: k4 */
        public final boolean m26704k4() {
            return this.f18610ck < this.f18609c5;
        }

        /* JADX INFO: renamed from: x1 */
        public final boolean m26715x1(int i) {
            return this.f18610ck <= this.f18609c5 - i;
        }

        /* JADX INFO: renamed from: k4 */
        public final boolean m26705k4(byte b) {
            return m26711k4(new byte[]{b});
        }

        /* JADX INFO: renamed from: k4 */
        public final boolean m26706k4(byte b, byte b2) {
            return m26711k4(new byte[]{b, b2});
        }

        /* JADX INFO: renamed from: k4 */
        public final boolean m26707k4(byte b, byte b2, byte b3, byte b4) {
            return m26711k4(new byte[]{b, b2, b3, b4});
        }

        /* JADX INFO: renamed from: k4 */
        public final boolean m26708k4(char c) {
            return m26710k4(c, 1);
        }

        /* JADX INFO: renamed from: k4 */
        public final boolean m26709k4(char c, char c2, int i) {
            if (this.f18620x1[0] < this.f18619to - 1) {
                return m26710k4(c, i) && m26710k4(c2, i);
            }
            int i2 = this.f18610ck - i;
            this.f18610ck = i2;
            this.f18614h4.m26668k4(this.f18618m9, i2 <= this.f18612dy);
            return false;
        }

        /* JADX INFO: renamed from: k4 */
        public final boolean m26710k4(char c, int i) {
            char[] cArr = this.f18616k4;
            if (cArr != null) {
                int[] iArr = this.f18620x1;
                int i2 = iArr[0];
                if (i2 >= this.f18619to) {
                    int i3 = this.f18610ck - i;
                    this.f18610ck = i3;
                    this.f18614h4.m26668k4(this.f18618m9, i3 <= this.f18612dy);
                    return false;
                }
                iArr[0] = i2 + 1;
                cArr[i2] = c;
            }
            this.f18611du++;
            return true;
        }

        /* JADX INFO: renamed from: k4 */
        public final boolean m26711k4(byte[] bArr) {
            char[] cArr = this.f18616k4;
            if (cArr != null) {
                int[] iArr = this.f18620x1;
                int i = iArr[0];
                if (!this.f18613fa.m26767k4(bArr, this.f18610ck, cArr, iArr)) {
                    this.f18610ck -= bArr.length;
                    this.f18613fa.m26769to();
                    this.f18614h4.m26668k4(this.f18618m9, this.f18620x1[0] == this.f18617kk);
                    return false;
                }
                this.f18611du = (this.f18620x1[0] - i) + this.f18611du;
            } else {
                this.f18611du = this.f18613fa.mo26770x1(bArr, this.f18610ck) + this.f18611du;
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.n9.ar$x1 */
    public static final class x1 extends AbstractC6766ks {

        /* JADX INFO: renamed from: kk */
        private AbstractC6747ar f18621kk;

        public x1(AbstractC6747ar abstractC6747ar) {
            this.f18621kk = abstractC6747ar;
        }

        @Override // com.aspose.slides.internal.p294n9.AbstractC6766ks
        /* JADX INFO: renamed from: k4 */
        public int mo26716k4(char[] cArr, int i, int i2, boolean z) {
            return this.f18621kk.mo26663k4(cArr, i, i2);
        }

        @Override // com.aspose.slides.internal.p294n9.AbstractC6766ks
        /* JADX INFO: renamed from: k4 */
        public int mo26717k4(char[] cArr, int i, int i2, byte[] bArr, int i3, int i4, boolean z) {
            return this.f18621kk.mo26665k4(cArr, i, i2, bArr, i3, i4);
        }

        @Override // com.aspose.slides.internal.p294n9.AbstractC6766ks
        /* JADX INFO: renamed from: k4 */
        public int mo26718k4(char[] cArr, int i, int i2, byte[] bArr, int i3, boolean z) {
            return this.f18621kk.mo26664k4(cArr, i, i2, bArr, i3);
        }
    }

    public AbstractC6747ar() {
        this(0);
    }

    /* JADX INFO: renamed from: du */
    private static AbstractC6747ar m26633du() {
        return C6757e0.f18654k4;
    }

    /* JADX INFO: renamed from: h4 */
    public static AbstractC6747ar m26634h4() {
        return f18590k4;
    }

    /* JADX INFO: renamed from: ix */
    public static AbstractC6747ar m26635ix() {
        return C6783wp.f18753k4;
    }

    /* JADX INFO: renamed from: kk */
    public static AbstractC6747ar m26640kk(String str) {
        AbstractC6747ar abstractC6747arM26839x1 = AbstractC6781v4.m26839x1(str);
        return abstractC6747arM26839x1 != null ? abstractC6747arM26839x1 : m26644to(C6767lr.m26815k4(str));
    }

    /* JADX INFO: renamed from: lr */
    private static AbstractC6747ar m26641lr() {
        return C6759g8.f18660x1;
    }

    /* JADX INFO: renamed from: ne */
    public static AbstractC6747ar m26642ne() {
        return C6774sv.f18717k4;
    }

    /* JADX INFO: renamed from: rv */
    public static AbstractC6747ar m26643rv() {
        return C6773ss.f18711x1;
    }

    /* JADX INFO: renamed from: to */
    public static AbstractC6747ar m26644to(int i) {
        if (i < 0 || i > 65535) {
            throw new ArgumentOutOfRangeException("codepage", C6770qm.m26824k4("Valid values are between {0} and {1}, inclusive.", 0, 65535));
        }
        if (i == 0) {
            return m26634h4();
        }
        if (i == 1 || i == 2 || i == 3 || i == 42) {
            throw new ArgumentException(C6770qm.m26823k4("{0} is not a supported code page.", Integer.valueOf(i)), "codepage");
        }
        if (i == 20127) {
            return m26650yj();
        }
        if (i == 28591) {
            return m26633du();
        }
        if (i == 1200) {
            return m26643rv();
        }
        if (i == 1201) {
            return m26649x6();
        }
        if (i == 12000) {
            return m26647uz();
        }
        if (i == 12001) {
            return m26641lr();
        }
        switch (i) {
            case 65000:
                return m26642ne();
            case 65001:
                return m26635ix();
            default:
                AbstractC6747ar abstractC6747arM26837x1 = AbstractC6781v4.m26837x1(i);
                if (abstractC6747arM26837x1 != null) {
                    return abstractC6747arM26837x1;
                }
                if (C6767lr.m26816k4(i) != null) {
                    return m26635ix();
                }
                throw new NotSupportedException(C6770qm.m26823k4("No data is available for encoding {0}. For information on defining a custom encoding, see the documentation for the Encoding.RegisterProvider method.", Integer.valueOf(i)));
        }
    }

    /* JADX INFO: renamed from: u4 */
    public static AbstractC6747ar m26646u4() {
        return C6783wp.f18755x1;
    }

    /* JADX INFO: renamed from: uz */
    public static AbstractC6747ar m26647uz() {
        return C6759g8.f18657k4;
    }

    /* JADX INFO: renamed from: wl */
    public static AbstractC6747ar m26648wl() {
        return m26641lr();
    }

    /* JADX INFO: renamed from: x6 */
    public static AbstractC6747ar m26649x6() {
        return C6773ss.f18709k4;
    }

    /* JADX INFO: renamed from: yj */
    public static AbstractC6747ar m26650yj() {
        return C6763k4.f18677k4;
    }

    /* JADX INFO: renamed from: ar */
    public char[] m26651ar() {
        return new char[0];
    }

    /* JADX INFO: renamed from: bv */
    public final void m26652bv() {
        throw new ArgumentException(C6770qm.m26824k4("The output char buffer is too small to contain the decoded characters, encoding '{0}' fallback '{1}'.", mo26653c5(), C14067j2.m66727k4(m26656fa())), "chars");
    }

    /* JADX INFO: renamed from: c5 */
    public String mo26653c5() {
        return C6770qm.m26822k4(C14113y2.m67408k4("Globalization_cp_", C14057f9.m66591x1(this.f18593up)));
    }

    /* JADX INFO: renamed from: ck */
    public final AbstractC6769ne m26654ck() {
        return this.f18591ks;
    }

    @Override // com.aspose.slides.p559ms.System.InterfaceC14059g8
    public Object deepClone() {
        AbstractC6747ar abstractC6747ar = (AbstractC6747ar) m26680v4();
        abstractC6747ar.f18594x1 = false;
        return abstractC6747ar;
    }

    /* JADX INFO: renamed from: dy */
    public byte[] mo26655dy() {
        return mo26674m9();
    }

    public boolean equals(Object obj) {
        AbstractC6747ar abstractC6747ar = (AbstractC6747ar) C7019kk.m27452k4(obj, AbstractC6747ar.class);
        return abstractC6747ar != null && this.f18593up == abstractC6747ar.f18593up && m26654ck().equals(abstractC6747ar.m26654ck()) && m26656fa().equals(abstractC6747ar.m26656fa());
    }

    /* JADX INFO: renamed from: fa */
    public final AbstractC6751c5 m26656fa() {
        return this.f18592rv;
    }

    public int hashCode() {
        return m26656fa().hashCode() + m26654ck().hashCode() + this.f18593up;
    }

    /* JADX INFO: renamed from: jd */
    public String mo26657jd() {
        if (this.f18595yj == null) {
            m26645to();
        }
        return this.f18595yj.m26771k4();
    }

    /* JADX INFO: renamed from: k4 */
    public abstract int mo26620k4(int i);

    /* JADX INFO: renamed from: k4 */
    public int mo26658k4(String str) {
        if (str == null) {
            throw new ArgumentNullException("s");
        }
        char[] cArrM67365dy = C14113y2.m67365dy(str);
        return mo26663k4(cArrM67365dy, 0, cArrM67365dy.length);
    }

    /* JADX INFO: renamed from: k4 */
    public abstract int mo26660k4(byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: k4 */
    public abstract int mo26661k4(byte[] bArr, int i, int i2, char[] cArr, int i3);

    /* JADX INFO: renamed from: k4 */
    public abstract int mo26663k4(char[] cArr, int i, int i2);

    /* JADX INFO: renamed from: k4 */
    public abstract int mo26664k4(char[] cArr, int i, int i2, byte[] bArr, int i3);

    /* JADX INFO: renamed from: ks */
    public int mo26673ks() {
        return this.f18593up;
    }

    /* JADX INFO: renamed from: m9 */
    public byte[] mo26674m9() {
        return new byte[0];
    }

    /* JADX INFO: renamed from: qq */
    public char[] mo26675qq() {
        return new char[0];
    }

    /* JADX INFO: renamed from: um */
    public final void m26678um() {
        throw new ArgumentException(C6770qm.m26824k4("The output byte buffer is too small to contain the encoded data, encoding '{0}' fallback '{1}'.", mo26653c5(), C14067j2.m66727k4(m26654ck())), "bytes");
    }

    /* JADX INFO: renamed from: up */
    public final boolean m26679up() {
        return this.f18594x1;
    }

    /* JADX INFO: renamed from: v4 */
    public Object m26680v4() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public abstract int mo26627x1(int i);

    /* JADX INFO: renamed from: x1 */
    public AbstractC6760h4 mo26628x1() {
        return new k4(this);
    }

    public AbstractC6747ar(int i) {
        this.f18593up = 0;
        this.f18595yj = null;
        this.f18594x1 = true;
        this.f18591ks = null;
        this.f18592rv = null;
        if (i < 0) {
            throw new ArgumentOutOfRangeException("codePage");
        }
        this.f18593up = i;
        mo26666k4();
    }

    /* JADX INFO: renamed from: k4 */
    public int mo26659k4(String str, int i, int i2, byte[] bArr, int i3) {
        if (str != null) {
            return mo26664k4(C14113y2.m67365dy(str), i, i2, bArr, i3);
        }
        throw new ArgumentNullException("s");
    }

    /* JADX INFO: renamed from: kk */
    public AbstractC6766ks mo26626kk() {
        return new x1(this);
    }

    /* JADX INFO: renamed from: to */
    public final String m26676to(byte[] bArr, int i, int i2) {
        int iMo26660k4 = mo26660k4(bArr, i, i2);
        if (iMo26660k4 == 0) {
            return C14113y2.f47374k4;
        }
        char[] cArr = new char[iMo26660k4];
        mo26661k4(bArr, i, i2, cArr, 0);
        return C14113y2.m67405k4(cArr);
    }

    /* JADX INFO: renamed from: x1 */
    public String m26681x1(byte[] bArr) {
        if (bArr != null) {
            return mo26682x1(bArr, 0, bArr.length);
        }
        throw new ArgumentNullException("bytes", "Array cannot be null.");
    }

    public AbstractC6747ar(int i, AbstractC6769ne abstractC6769ne, AbstractC6751c5 abstractC6751c5) {
        this.f18593up = 0;
        this.f18595yj = null;
        this.f18594x1 = true;
        this.f18591ks = null;
        this.f18592rv = null;
        if (i < 0) {
            throw new ArgumentOutOfRangeException("codePage");
        }
        this.f18593up = i;
        this.f18591ks = abstractC6769ne == null ? new C6752c6(this) : abstractC6769ne;
        this.f18592rv = abstractC6751c5 == null ? new C6754dq(this) : abstractC6751c5;
    }

    /* JADX INFO: renamed from: to */
    private void m26645to() {
        if (this.f18595yj == null) {
            C6764kk c6764kkM26816k4 = C6767lr.m26816k4(this.f18593up);
            this.f18595yj = c6764kkM26816k4;
            if (c6764kkM26816k4 == null) {
                throw new NotSupportedException(C6770qm.m26823k4("No data is available for encoding {0}. For information on defining a custom encoding, see the documentation for the Encoding.RegisterProvider method.", Integer.valueOf(this.f18593up)));
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public int mo26621k4(byte[] bArr, int i, int i2, C6753ck c6753ck) {
        return mo26660k4(bArr, i, i2);
    }

    /* JADX INFO: renamed from: kk */
    public char[] m26672kk(byte[] bArr, int i, int i2) {
        char[] cArr = new char[mo26660k4(bArr, i, i2)];
        mo26661k4(bArr, i, i2, cArr, 0);
        return cArr;
    }

    /* JADX INFO: renamed from: x1 */
    public String mo26682x1(byte[] bArr, int i, int i2) {
        return C14113y2.m67405k4(m26672kk(bArr, i, i2));
    }

    /* JADX INFO: renamed from: k4 */
    public int mo26662k4(byte[] bArr, int i, int i2, char[] cArr, int i3, int i4) {
        if (cArr == null || bArr == null) {
            throw new ArgumentNullException(cArr == null ? "chars" : "bytes", "Array cannot be null.");
        }
        if (i2 < 0 || i4 < 0) {
            throw new ArgumentOutOfRangeException(i2 < 0 ? "byteCount" : "charCount", "Non-negative number required.");
        }
        byte[] bArr2 = new byte[i2];
        for (int i5 = 0; i5 < i2; i5++) {
            bArr2[i5] = bArr[i5 + i];
        }
        char[] cArr2 = new char[i4];
        int iMo26661k4 = mo26661k4(bArr2, 0, i2, cArr2, 0);
        if (iMo26661k4 < i4) {
            i4 = iMo26661k4;
        }
        for (int i6 = 0; i6 < i4; i6++) {
            cArr[i6] = cArr2[i6];
        }
        return i4;
    }

    /* JADX INFO: renamed from: to */
    public byte[] mo26677to(String str) {
        if (str == null) {
            throw new ArgumentNullException("s", "String reference not set to an instance of a String.");
        }
        byte[] bArr = new byte[mo26658k4(str)];
        mo26659k4(str, 0, str.length(), bArr, 0);
        return bArr;
    }

    /* JADX INFO: renamed from: x1 */
    public byte[] m26683x1(char[] cArr) {
        if (cArr != null) {
            return m26684x1(cArr, 0, cArr.length);
        }
        throw new ArgumentNullException("chars", "Array cannot be null.");
    }

    /* JADX INFO: renamed from: k4 */
    public int mo26622k4(byte[] bArr, int i, int i2, char[] cArr, int i3, int i4, C6753ck c6753ck) {
        return mo26662k4(bArr, i, i2, cArr, i3, i4);
    }

    /* JADX INFO: renamed from: x1 */
    public byte[] m26684x1(char[] cArr, int i, int i2) {
        byte[] bArr = new byte[mo26663k4(cArr, i, i2)];
        mo26664k4(cArr, i, i2, bArr, 0);
        return bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public int mo26623k4(char[] cArr, int i, int i2, C6780uz c6780uz) {
        return mo26663k4(cArr, i, i2);
    }

    /* JADX INFO: renamed from: k4 */
    public int mo26665k4(char[] cArr, int i, int i2, byte[] bArr, int i3, int i4) {
        if (bArr == null || cArr == null) {
            throw new ArgumentNullException(bArr == null ? "bytes" : "chars", "Array cannot be null.");
        }
        if (i2 < 0 || i4 < 0) {
            throw new ArgumentOutOfRangeException(i2 < 0 ? "charCount" : "byteCount", "Non-negative number required.");
        }
        char[] cArr2 = new char[i2];
        for (int i5 = 0; i5 < i2; i5++) {
            cArr2[i5] = cArr[i5 + i];
        }
        byte[] bArr2 = new byte[i4];
        int iMo26664k4 = mo26664k4(cArr2, 0, i2, bArr2, 0);
        if (iMo26664k4 < i4) {
            i4 = iMo26664k4;
        }
        for (int i6 = 0; i6 < i4; i6++) {
            bArr[i6] = bArr2[i6 + i3];
        }
        return i4;
    }

    /* JADX INFO: renamed from: k4 */
    public int mo26624k4(char[] cArr, int i, int i2, byte[] bArr, int i3, int i4, C6780uz c6780uz) {
        return mo26665k4(cArr, i, i2, bArr, i3, i4);
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC6747ar m26636k4(int i, AbstractC6769ne abstractC6769ne, AbstractC6751c5 abstractC6751c5) {
        AbstractC6747ar abstractC6747arM26838x1 = AbstractC6781v4.m26838x1(i, abstractC6769ne, abstractC6751c5);
        if (abstractC6747arM26838x1 != null) {
            return abstractC6747arM26838x1;
        }
        AbstractC6747ar abstractC6747ar = (AbstractC6747ar) m26644to(i).deepClone();
        abstractC6747ar.m26669k4(abstractC6769ne);
        abstractC6747ar.m26667k4(abstractC6751c5);
        return abstractC6747ar;
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC6747ar m26637k4(String str, AbstractC6769ne abstractC6769ne, AbstractC6751c5 abstractC6751c5) {
        AbstractC6747ar abstractC6747arM26840x1 = AbstractC6781v4.m26840x1(str, abstractC6769ne, abstractC6751c5);
        return abstractC6747arM26840x1 != null ? abstractC6747arM26840x1 : m26636k4(C6767lr.m26815k4(str), abstractC6769ne, abstractC6751c5);
    }

    /* JADX INFO: renamed from: k4 */
    public void mo26666k4() {
        this.f18591ks = new C6752c6(this);
        this.f18592rv = new C6754dq(this);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m26667k4(AbstractC6751c5 abstractC6751c5) {
        if (m26679up()) {
            throw new InvalidOperationException("Instance is read-only.");
        }
        if (abstractC6751c5 == null) {
            throw new ArgumentNullException("value");
        }
        this.f18592rv = abstractC6751c5;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m26668k4(C6753ck c6753ck, boolean z) {
        if (c6753ck == null || c6753ck.f18643to || z) {
            if (c6753ck != null && c6753ck.m26751du()) {
                c6753ck.m26753to().m26769to();
            }
            m26652bv();
        }
        c6753ck.m26740m9();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m26669k4(AbstractC6769ne abstractC6769ne) {
        if (m26679up()) {
            throw new InvalidOperationException("Instance is read-only.");
        }
        if (abstractC6769ne == null) {
            throw new ArgumentNullException("value");
        }
        this.f18591ks = abstractC6769ne;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m26670k4(C6780uz c6780uz, boolean z) {
        if (c6780uz == null || c6780uz.f18749to || z) {
            if (c6780uz != null && c6780uz.m26813kk()) {
                c6780uz.m26814x1().m26754du();
            }
            m26678um();
        }
        c6780uz.m26834dy();
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m26638k4(AbstractC6747ar abstractC6747ar, AbstractC6747ar abstractC6747ar2, byte[] bArr) {
        if (bArr != null) {
            return m26639k4(abstractC6747ar, abstractC6747ar2, bArr, 0, bArr.length);
        }
        throw new ArgumentNullException("bytes");
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m26639k4(AbstractC6747ar abstractC6747ar, AbstractC6747ar abstractC6747ar2, byte[] bArr, int i, int i2) {
        if (abstractC6747ar == null || abstractC6747ar2 == null) {
            throw new ArgumentNullException(abstractC6747ar == null ? "srcEncoding" : "dstEncoding", "Array cannot be null.");
        }
        if (bArr != null) {
            return abstractC6747ar2.m26683x1(abstractC6747ar.m26672kk(bArr, i, i2));
        }
        throw new ArgumentNullException("bytes", "Array cannot be null.");
    }

    /* JADX INFO: renamed from: k4 */
    public char[] m26671k4(byte[] bArr) {
        if (bArr != null) {
            return m26672kk(bArr, 0, bArr.length);
        }
        throw new ArgumentNullException("bytes", "Array cannot be null.");
    }
}
