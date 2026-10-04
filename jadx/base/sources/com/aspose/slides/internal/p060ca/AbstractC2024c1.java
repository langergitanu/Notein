package com.aspose.slides.internal.p060ca;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14085qw;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.c1 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2024c1 extends AbstractC2282s0 {

    /* JADX INFO: renamed from: du */
    private boolean f7030du;

    /* JADX INFO: renamed from: h4 */
    private x1 f7031h4;

    /* JADX INFO: renamed from: kk */
    protected int f7032kk;

    /* JADX INFO: renamed from: m9 */
    private kk f7033m9;

    /* JADX INFO: renamed from: to */
    protected String f7034to;

    /* JADX INFO: renamed from: x1 */
    protected Map<AbstractC2220nx, Integer> f7035x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.ca.c1$k4 */
    public static class k4 implements Comparator<AbstractC2220nx> {

        /* JADX INFO: renamed from: k4 */
        private String f7036k4;

        public k4(String str) {
            this.f7036k4 = str;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public final int compare(AbstractC2220nx abstractC2220nx, AbstractC2220nx abstractC2220nx2) {
            C2334v6 c2334v6 = (C2334v6) C7019kk.m27452k4((Object) abstractC2220nx, C2334v6.class);
            C2334v6 c2334v62 = (C2334v6) C7019kk.m27452k4((Object) abstractC2220nx2, C2334v6.class);
            if (c2334v6 == null || c2334v62 == null) {
                throw new ArgumentException(C14113y2.m67402k4("Incorrect GlyphID instance in {0} list!", this.f7036k4));
            }
            return C14057f9.m66580k4(c2334v6.m11556k4(), c2334v62.m11556k4());
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.ca.c1$kk */
    public static abstract class kk extends AbstractC14085qw {
        /* JADX INFO: renamed from: k4 */
        public abstract void mo10296k4(C2212n9 c2212n9);
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.ca.c1$x1 */
    public static abstract class x1 extends AbstractC14085qw {
        /* JADX INFO: renamed from: k4 */
        public abstract void mo10297k4(C2212n9 c2212n9);
    }

    public AbstractC2024c1(long j, long j2, String str) {
        super(j, j2);
        m10286k4(str);
    }

    /* JADX INFO: renamed from: k4 */
    public final int m10287k4(AbstractC2220nx abstractC2220nx) {
        try {
            return this.f7035x1.get(abstractC2220nx).intValue();
        } catch (NullPointerException unused) {
            return -1;
        }
    }

    /* JADX INFO: renamed from: kk */
    public final x1 m10292kk() {
        return this.f7031h4;
    }

    /* JADX INFO: renamed from: to */
    public final kk m10293to() {
        return this.f7033m9;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m10294x1() {
        return this.f7030du;
    }

    public AbstractC2024c1(long j, String str) {
        super(j);
        m10286k4(str);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10288k4(kk kkVar) {
        this.f7033m9 = kkVar;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10289k4(x1 x1Var) {
        this.f7031h4 = x1Var;
    }

    @Override // com.aspose.slides.internal.p060ca.AbstractC2282s0
    /* JADX INFO: renamed from: k4 */
    public void mo10153k4(C2212n9 c2212n9) {
        c2212n9.m11159k4(this.f7845k4 & 4294967295L);
        int iM11151fa = c2212n9.m11151fa() & 65535;
        this.f7032kk = iM11151fa;
        if (iM11151fa == 1) {
            if (m10292kk() != null) {
                m10292kk().mo10297k4(c2212n9);
            }
        } else if (iM11151fa != 2) {
            C6005k4.m24260k4("Incorrect format number({0}) for table of type {1}", Integer.valueOf(iM11151fa), this.f7034to);
        } else if (m10293to() != null) {
            m10293to().mo10296k4(c2212n9);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10290k4(AbstractC2220nx abstractC2220nx, int i) {
        try {
            this.f7035x1.put(abstractC2220nx, Integer.valueOf(i));
        } catch (IllegalArgumentException e) {
            if (!m10294x1()) {
                throw new C2136iy(abstractC2220nx, this.f7034to, e);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m10286k4(String str) {
        this.f7034to = str;
        this.f7035x1 = new TreeMap(new k4(this.f7034to));
        m10291k4(false);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10291k4(boolean z) {
        this.f7030du = z;
    }
}
