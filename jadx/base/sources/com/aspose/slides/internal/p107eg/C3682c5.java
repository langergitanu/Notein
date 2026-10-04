package com.aspose.slides.internal.p107eg;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Specialized.OooO00o;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p264m3.InterfaceC6313x1;
import com.aspose.slides.internal.p275mi.AbstractC6390h4;
import com.aspose.slides.internal.p275mi.AbstractC6395x1;
import com.aspose.slides.internal.p275mi.C6394to;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p505xn.C12555c5;
import com.aspose.slides.internal.p558zz.C13637dy;
import com.aspose.slides.internal.p558zz.C13641m9;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.eg.c5 */
/* JADX INFO: loaded from: classes3.dex */
public class C3682c5 extends AbstractC6390h4 {

    /* JADX INFO: renamed from: com.aspose.slides.internal.eg.c5$du */
    public static class du implements x1 {

        /* JADX INFO: renamed from: k4 */
        private int f10227k4;

        /* JADX INFO: renamed from: kk */
        private int f10228kk;

        /* JADX INFO: renamed from: to */
        private int f10229to;

        /* JADX INFO: renamed from: x1 */
        private int f10230x1;

        public du(int i, int i2, int i3, int i4) {
            this.f10227k4 = i;
            this.f10230x1 = i2;
            this.f10228kk = i3;
            this.f10229to = i4;
        }

        @Override // com.aspose.slides.internal.p107eg.C3682c5.x1
        /* JADX INFO: renamed from: k4 */
        public final boolean mo14935k4(int i, int i2, int i3, int i4) {
            return this.f10227k4 == i && this.f10230x1 == i2 && this.f10228kk == i3 && this.f10229to == i4;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.eg.c5$h4 */
    public static class h4 implements Comparable<h4> {

        /* JADX INFO: renamed from: k4 */
        protected int f10231k4;

        /* JADX INFO: renamed from: kk */
        protected int f10232kk;

        /* JADX INFO: renamed from: to */
        protected int f10233to;

        /* JADX INFO: renamed from: x1 */
        protected int f10234x1;

        public h4(int i, int i2, int i3, int i4) {
            this.f10231k4 = i;
            this.f10234x1 = i2;
            this.f10232kk = i3;
            this.f10233to = i4;
        }

        public boolean equals(Object obj) {
            if (C14067j2.m66729x1(null, obj)) {
                return false;
            }
            if (C14067j2.m66729x1(this, obj)) {
                return true;
            }
            if (C14067j2.m66727k4(obj) != C7019kk.m27443k4((Class<?>) h4.class)) {
                return false;
            }
            return m14941x1((h4) obj);
        }

        public int hashCode() {
            return ((this.f10234x1 & 63) << 26) | ((this.f10233to & 63) << 16) | ((this.f10231k4 & 15) << 12) | (this.f10232kk & 255);
        }

        /* JADX INFO: renamed from: k4 */
        public final int m14936k4() {
            return this.f10231k4;
        }

        /* JADX INFO: renamed from: kk */
        public final int m14938kk() {
            return this.f10232kk;
        }

        /* JADX INFO: renamed from: to */
        public final int m14939to() {
            return this.f10233to;
        }

        public final String toString() {
            C6765kp c6765kpOooO00o = OooO00o.OooO00o("P=");
            c6765kpOooO00o.m26805kk(this.f10231k4);
            c6765kpOooO00o.m26792k4(", E=0x");
            c6765kpOooO00o.m26792k4(C14113y2.m67402k4("{0:x}", Integer.valueOf(this.f10234x1)));
            c6765kpOooO00o.m26792k4(", L=0x");
            c6765kpOooO00o.m26792k4(C14113y2.m67402k4("{0:x}", Integer.valueOf(this.f10232kk)));
            c6765kpOooO00o.m26792k4(", N=");
            c6765kpOooO00o.m26805kk(this.f10233to);
            return c6765kpOooO00o.toString();
        }

        /* JADX INFO: renamed from: x1 */
        public final int m14940x1() {
            return this.f10234x1;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public final int compareTo(h4 h4Var) {
            int i = this.f10231k4;
            int i2 = h4Var.f10231k4;
            if (i != i2) {
                return i - i2;
            }
            int i3 = this.f10234x1;
            int i4 = h4Var.f10234x1;
            if (i3 != i4) {
                return i3 - i4;
            }
            int i5 = this.f10232kk;
            int i6 = h4Var.f10232kk;
            return i5 != i6 ? i5 - i6 : this.f10233to - h4Var.f10233to;
        }

        /* JADX INFO: renamed from: x1 */
        public final boolean m14941x1(h4 h4Var) {
            if (C14067j2.m66729x1(null, h4Var)) {
                return false;
            }
            if (C14067j2.m66729x1(this, h4Var)) {
                return true;
            }
            return h4Var.f10231k4 == this.f10231k4 && h4Var.f10234x1 == this.f10234x1 && h4Var.f10232kk == this.f10232kk && h4Var.f10233to == this.f10233to;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.eg.c5$k4 */
    public static class k4 extends AbstractC6390h4.k4 {

        /* JADX INFO: renamed from: k4 */
        private Dictionary<h4, to> f10235k4;

        public k4(C6394to c6394to, C13637dy c13637dy) {
            super(c6394to, c13637dy);
        }

        @Override // com.aspose.slides.internal.p275mi.AbstractC6395x1.k4
        /* JADX INFO: renamed from: ck */
        public int mo14943ck() {
            Dictionary<h4, to> dictionary = this.f10235k4;
            if (dictionary == null || dictionary.size() == 0) {
                return 0;
            }
            int size = (this.f10235k4.size() * 12) + 6;
            Dictionary.Enumerator<h4, to> it = this.f10235k4.iterator();
            while (it.hasNext()) {
                try {
                    size += ((to) it.next().getValue()).m14950kk().length;
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            return size;
        }

        @Override // com.aspose.slides.internal.p275mi.AbstractC6395x1.k4
        /* JADX INFO: renamed from: fa */
        public void mo14944fa() {
            this.f10235k4 = null;
            m26246k4(false);
        }

        @Override // com.aspose.slides.internal.p275mi.AbstractC6395x1.k4
        /* JADX INFO: renamed from: jd */
        public boolean mo14945jd() {
            Dictionary<h4, to> dictionary = this.f10235k4;
            return (dictionary == null || dictionary.size() == 0) ? false : true;
        }

        @Override // com.aspose.slides.internal.p275mi.AbstractC6395x1.k4
        /* JADX INFO: renamed from: k4 */
        public int mo14946k4(C13637dy c13637dy) {
            int i = 6;
            int size = (this.f10235k4.size() * 12) + 6;
            int iM62963k4 = 0;
            c13637dy.m62968to(0, 0);
            c13637dy.m62968to(2, this.f10235k4.size());
            c13637dy.m62968to(4, size);
            Dictionary.Enumerator<h4, to> it = this.f10235k4.iterator();
            while (it.hasNext()) {
                try {
                    KeyValuePair next = it.next();
                    c13637dy.m62968to(i, ((h4) next.getKey()).m14936k4());
                    c13637dy.m62968to(i + 2, ((h4) next.getKey()).m14940x1());
                    c13637dy.m62968to(i + 4, ((h4) next.getKey()).m14938kk());
                    c13637dy.m62968to(i + 6, ((h4) next.getKey()).m14939to());
                    c13637dy.m62968to(i + 8, ((to) next.getValue()).m14950kk().length);
                    c13637dy.m62968to(i + 10, iM62963k4);
                    i += 12;
                    iM62963k4 += c13637dy.m62963k4(iM62963k4 + size, ((to) next.getValue()).m14950kk());
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            return iM62963k4 + size;
        }

        /* JADX INFO: renamed from: k4 */
        public static k4 m14942k4(C6394to c6394to, C13637dy c13637dy) {
            return new k4(c6394to, c13637dy);
        }

        @Override // com.aspose.slides.internal.p275mi.AbstractC6395x1.k4
        /* JADX INFO: renamed from: k4 */
        public AbstractC6395x1 mo14947k4(C13641m9 c13641m9) {
            return new C3682c5(m26228up(), c13641m9);
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.eg.c5$kk */
    public static class kk {

        /* JADX INFO: renamed from: k4 */
        public h4 f10236k4;

        /* JADX INFO: renamed from: kk */
        protected byte[] f10237kk;

        /* JADX INFO: renamed from: x1 */
        protected int f10238x1;

        public kk() {
        }

        public boolean equals(Object obj) {
            if (C14067j2.m66729x1(null, obj)) {
                return false;
            }
            if (C14067j2.m66729x1(this, obj)) {
                return true;
            }
            if (C14067j2.m66727k4(obj) != C7019kk.m27443k4((Class<?>) kk.class)) {
                return false;
            }
            return m14949k4((kk) obj);
        }

        public int hashCode() {
            int iHashCode = this.f10236k4.hashCode();
            for (int i = 0; i < this.f10237kk.length; i += 4) {
                for (int i2 = 0; i2 < 4; i2++) {
                    int i3 = i2 + i;
                    byte[] bArr = this.f10237kk;
                    if (i3 < bArr.length) {
                        iHashCode |= (bArr[i2] & 255) << (i2 * 8);
                    }
                }
            }
            return iHashCode;
        }

        /* JADX INFO: renamed from: k4 */
        public final int m14948k4() {
            return this.f10236k4.m14936k4();
        }

        /* JADX INFO: renamed from: kk */
        public final byte[] m14950kk() {
            return this.f10237kk;
        }

        /* JADX INFO: renamed from: to */
        public final String m14951to() {
            return C3682c5.m14924x1(this.f10237kk, m14948k4(), m14952x1());
        }

        public final String toString() {
            C6765kp c6765kpOooO00o = OooO00o.OooO00o("[");
            c6765kpOooO00o.m26791k4(this.f10236k4);
            c6765kpOooO00o.m26792k4(", \"");
            c6765kpOooO00o.m26792k4(m14951to());
            c6765kpOooO00o.m26792k4("\"]");
            return c6765kpOooO00o.toString();
        }

        /* JADX INFO: renamed from: x1 */
        public final int m14952x1() {
            return this.f10236k4.m14940x1();
        }

        public kk(int i, int i2, int i3, int i4, byte[] bArr) {
            this(new h4(i, i2, i3, i4), bArr);
        }

        /* JADX INFO: renamed from: k4 */
        public final boolean m14949k4(kk kkVar) {
            if (C14067j2.m66729x1(null, kkVar)) {
                return false;
            }
            if (C14067j2.m66729x1(this, kkVar)) {
                return true;
            }
            return C14067j2.m66728k4(kkVar.f10236k4, this.f10236k4) && kkVar.f10238x1 == this.f10238x1 && C14067j2.m66728k4(kkVar.f10237kk, this.f10237kk);
        }

        public kk(h4 h4Var, byte[] bArr) {
            this.f10236k4 = h4Var;
            this.f10237kk = bArr;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.eg.c5$m9 */
    public static class m9 implements InterfaceC6313x1 {

        /* JADX INFO: renamed from: k4 */
        private int f10239k4 = 0;

        /* JADX INFO: renamed from: kk */
        private C3682c5 f10240kk;

        /* JADX INFO: renamed from: x1 */
        private x1 f10241x1;

        public m9(x1 x1Var, C3682c5 c3682c5) {
            this.f10241x1 = x1Var;
            this.f10240kk = c3682c5;
        }

        @Override // com.aspose.slides.internal.p264m3.InterfaceC6313x1
        /* JADX INFO: renamed from: k4 */
        public final boolean mo14953k4() {
            if (this.f10241x1 == null) {
                return this.f10239k4 < this.f10240kk.m14925du();
            }
            while (this.f10239k4 < this.f10240kk.m14925du()) {
                if (this.f10241x1.mo14935k4(this.f10240kk.m14928k4(this.f10239k4), this.f10240kk.m14933x1(this.f10239k4), this.f10240kk.m14931kk(this.f10239k4), this.f10240kk.m14932to(this.f10239k4))) {
                    return true;
                }
                this.f10239k4++;
            }
            return false;
        }

        @Override // com.aspose.slides.internal.p264m3.InterfaceC6313x1
        /* JADX INFO: renamed from: x1 */
        public final Object mo14954x1() {
            if (!mo14953k4()) {
                throw new InvalidOperationException();
            }
            C3682c5 c3682c5 = this.f10240kk;
            int i = this.f10239k4;
            this.f10239k4 = i + 1;
            return c3682c5.m14927h4(i);
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.eg.c5$to */
    public static class to extends kk {
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.eg.c5$x1 */
    public interface x1 {
        /* JADX INFO: renamed from: k4 */
        boolean mo14935k4(int i, int i2, int i3, int i4);
    }

    private C3682c5(C6394to c6394to, C13641m9 c13641m9) {
        super(c6394to, c13641m9);
    }

    /* JADX INFO: renamed from: c5 */
    private int m14918c5(int i) {
        return this.f18176k4.m62997du(m14923m9(i) + 10) + m14920h4();
    }

    /* JADX INFO: renamed from: dy */
    private int m14919dy(int i) {
        return this.f18176k4.m62997du(m14923m9(i) + 8);
    }

    /* JADX INFO: renamed from: h4 */
    private int m14920h4() {
        return this.f18176k4.m62997du(4);
    }

    /* JADX INFO: renamed from: m9 */
    private static int m14923m9(int i) {
        return (i * 12) + 6;
    }

    /* JADX INFO: renamed from: du */
    public final int m14925du() {
        return this.f18176k4.m62997du(2);
    }

    /* JADX INFO: renamed from: k4 */
    public final int m14928k4(int i) {
        return this.f18176k4.m62997du(m14923m9(i));
    }

    /* JADX INFO: renamed from: kk */
    public final int m14931kk(int i) {
        return this.f18176k4.m62997du(m14923m9(i) + 4);
    }

    /* JADX INFO: renamed from: to */
    public final int m14932to(int i) {
        return this.f18176k4.m62997du(m14923m9(i) + 6);
    }

    /* JADX INFO: renamed from: x1 */
    public final int m14933x1(int i) {
        return this.f18176k4.m62997du(m14923m9(i) + 2);
    }

    /* JADX INFO: renamed from: du */
    public final byte[] m14926du(int i) {
        int iM14919dy = m14919dy(i);
        byte[] bArr = new byte[iM14919dy];
        this.f18176k4.m63001k4(m14918c5(i), bArr, 0, iM14919dy);
        return bArr;
    }

    /* JADX INFO: renamed from: h4 */
    public final kk m14927h4(int i) {
        return new kk(m14928k4(i), m14933x1(i), m14931kk(i), m14932to(i), m14926du(i));
    }

    /* JADX INFO: renamed from: k4 */
    public final InterfaceC6313x1 m14929k4(x1 x1Var) {
        return new m9(x1Var, this);
    }

    /* JADX INFO: renamed from: x1 */
    public final kk m14934x1(int i, int i2, int i3, int i4) {
        InterfaceC6313x1 interfaceC6313x1M14929k4 = m14929k4(new du(i, i2, i3, i4));
        if (interfaceC6313x1M14929k4.mo14953k4()) {
            return (kk) interfaceC6313x1M14929k4.mo14954x1();
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    private static String m14921k4(int i, int i2) {
        if (i == 0) {
            return "UTF-16BE";
        }
        if (i != 1) {
            if (i != 3) {
                return null;
            }
            if (i2 == 10) {
                return "UCS-4";
            }
            switch (i2) {
                case 0:
                case 1:
                    return "UTF-16BE";
                case 2:
                    return "windows-933";
                case 3:
                    return "windows-936";
                case 4:
                    return "windows-950";
                case 5:
                    return "windows-949";
                case 6:
                    return "ms1361";
                default:
                    return null;
            }
        }
        if (i2 == 21) {
            return "MacThai";
        }
        if (i2 == 23) {
            return "MacCyrillic";
        }
        if (i2 == 25) {
            return "EUC-CN";
        }
        if (i2 == 27 || i2 == 29) {
            return "MacCyrillic";
        }
        switch (i2) {
            case 0:
                return "MacRoman";
            case 1:
                return "Shift_JIS";
            case 2:
                return "Big5";
            case 3:
                return "EUC-KR";
            case 4:
                return "MacArabic";
            case 5:
                return "MacHebrew";
            case 6:
                return "MacGreek";
            case 7:
                return "MacCyrillic";
            case 8:
                return "MacSymbol";
            default:
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x1 */
    public static String m14924x1(byte[] bArr, int i, int i2) {
        return C12555c5.m58553k4(C14113y2.m67368h4(m14921k4(i, i2))).m26681x1(bArr);
    }

    /* JADX INFO: renamed from: k4 */
    public final byte[] m14930k4(int i, int i2, int i3, int i4) {
        kk kkVarM14934x1 = m14934x1(i, i2, i3, i4);
        if (kkVarM14934x1 != null) {
            return kkVarM14934x1.m14950kk();
        }
        return null;
    }
}
