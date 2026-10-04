package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p077d8.C3100wp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p407st.C10421eg;
import com.aspose.slides.internal.p407st.C10459h0;
import com.aspose.slides.internal.p407st.C10487j0;
import com.aspose.slides.internal.p407st.C10536m5;
import com.aspose.slides.internal.p407st.C10580ou;
import com.aspose.slides.internal.p407st.C10591pk;
import com.aspose.slides.internal.p407st.C10677v4;
import com.aspose.slides.internal.p407st.C10740z0;
import com.aspose.slides.internal.p464vq.C11785nh;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.huawei.hms.network.embedded.C18177fb;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class y2n extends C14652uw {

    /* JADX INFO: renamed from: yd */
    private static final byte[] f50247yd = {0, 2, 15, 16, 0, 2, 13, 14, 1, 21, 1, 2, 7, 9, 8, 1, 2, 13, 19, 1, 2, 13, 14, 1, 2, 13, 21, 1, 2, 13, 23, 1, 2, 13, 20, 1, 2, 13, 18, 2, 21, 3, 4, 7, 9, 8, 2, 18, 3, 4, 7, 1, 13, 8, 3, 13, 14, 14, 8, 3, 13, 14, 20, 8, 3, 13, 20, 14, 8, 3, 13, 14, 22, 8, 3, 13, 22, 14, 8, 3, 13, 14, 19, 8, 3, 13, 19, 14, 8, 3, 13, 14, 24, 8, 3, 13, 24, 14, 8, 3, 13, 22, 18, 8, 3, 13, 19, 19, 9, 3, 13, 14, 19, 9, 3, 13, 19, 14, 10, 4, 13, 14, 19, 19, 10, 4, 13, 19, 19, 19, 11, 4, 13, 19, 19, 19, 11, 4, 13, 19, 19, 14, 13, 4, 13, 19, 19, 14, 14, 5, 13, 19, 19, 19, 19, 15, 1, 19, 16, 2, 13, 14, 16, 5, 13, 14, 19, 14, 19, 16, 3, 13, 19, 14, 17, 2, 17, 18, 18, 3, 17, 18, 20};

    /* JADX INFO: renamed from: ar */
    private IThemeEffectiveData f50248ar;

    /* JADX INFO: renamed from: bv */
    private IGenericList<IFontData> f50249bv;

    /* JADX INFO: renamed from: c5 */
    private C10740z0 f50250c5;

    /* JADX INFO: renamed from: ck */
    private final Dictionary<BaseSlide, rpo> f50251ck;

    /* JADX INFO: renamed from: du */
    private long f50252du;

    /* JADX INFO: renamed from: dy */
    private int f50253dy;

    /* JADX INFO: renamed from: fa */
    private final Dictionary<ILayoutSlide, Long> f50254fa;

    /* JADX INFO: renamed from: h4 */
    private long f50255h4;

    /* JADX INFO: renamed from: ix */
    private long[] f50256ix;

    /* JADX INFO: renamed from: jd */
    private C10677v4 f50257jd;

    /* JADX INFO: renamed from: k4 */
    int[] f50258k4;

    /* JADX INFO: renamed from: kk */
    private ISaveOptions f50259kk;

    /* JADX INFO: renamed from: ks */
    private rpo f50260ks;

    /* JADX INFO: renamed from: lr */
    private final Dictionary<Long, Integer> f50261lr;

    /* JADX INFO: renamed from: m9 */
    private long f50262m9;

    /* JADX INFO: renamed from: ne */
    private List<rpo> f50263ne;

    /* JADX INFO: renamed from: qq */
    private final Dictionary<Long, uz3> f50264qq;

    /* JADX INFO: renamed from: rv */
    private List<rpo> f50265rv;

    /* JADX INFO: renamed from: to */
    private long f50266to;

    /* JADX INFO: renamed from: u4 */
    private C10536m5[] f50267u4;

    /* JADX INFO: renamed from: um */
    private int f50268um;

    /* JADX INFO: renamed from: up */
    private Dictionary<C10580ou, ISlide> f50269up;

    /* JADX INFO: renamed from: uz */
    private boolean f50270uz;

    /* JADX INFO: renamed from: v4 */
    private byte[] f50271v4;

    /* JADX INFO: renamed from: wl */
    private int f50272wl;

    /* JADX INFO: renamed from: x1 */
    private u8s f50273x1;

    /* JADX INFO: renamed from: x6 */
    private List<rpo> f50274x6;

    /* JADX INFO: renamed from: yj */
    private rpo f50275yj;

    public y2n(C10591pk c10591pk, Presentation presentation, int[] iArr, InterruptionToken interruptionToken) {
        super(c10591pk, presentation, interruptionToken);
        this.f50266to = 0L;
        this.f50252du = 0L;
        this.f50255h4 = 1L;
        this.f50262m9 = 0L;
        this.f50253dy = 0;
        this.f50251ck = new Dictionary<>();
        this.f50254fa = new Dictionary<>();
        this.f50269up = new Dictionary<>();
        this.f50275yj = null;
        this.f50260ks = null;
        this.f50265rv = new List<>();
        this.f50274x6 = new List<>();
        this.f50263ne = new List<>();
        this.f50267u4 = null;
        this.f50270uz = false;
        this.f50272wl = 0;
        this.f50264qq = new Dictionary<>();
        this.f50268um = 0;
        this.f50261lr = new Dictionary<>();
        if (m71946k4() == null) {
            throw new ArgumentNullException();
        }
        u8s u8sVar = new u8s(new C11785nh(), m71946k4(), iArr, new PptxOptions(), interruptionToken);
        this.f50273x1 = u8sVar;
        u8sVar.m71546k4(true);
        this.f50256ix = m73684t6();
        this.f50258k4 = iArr;
    }

    /* JADX INFO: renamed from: k4 */
    private static long m73682k4(int i) {
        if (i == 0) {
            return 0L;
        }
        int i2 = (((byte) i) & 255) - 1;
        if (i2 > 0) {
            return ((long) (1 << i2)) & 4294967295L;
        }
        return 1L;
    }

    /* JADX INFO: renamed from: t6 */
    private static long[] m73684t6() {
        List list = new List();
        int length = f50247yd.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte b = f50247yd[i + 1];
            long jM73682k4 = ((((long) (b & 16)) & 4294967295L) << 27) & 4294967295L;
            int i3 = b & 15;
            for (int i4 = 0; i4 < i3; i4++) {
                jM73682k4 = (jM73682k4 | m73682k4(f50247yd[i + 2 + i4] & 255)) & 4294967295L;
            }
            list.addItem(Long.valueOf(jM73682k4));
            list.addItem(Long.valueOf(((long) ((f50247yd[i] & 255) + (i2 << 16))) & 4294967295L));
            i2++;
            i += i3 + 2;
        }
        return C3085sv.m13068h4(list);
    }

    /* JADX INFO: renamed from: x1 */
    private long m73685x1(C10487j0 c10487j0) {
        long jM73682k4 = 0;
        for (int i = 0; i < 8; i++) {
            jM73682k4 = (jM73682k4 | m73682k4(c10487j0.m50979dy()[i])) & 4294967295L;
        }
        return jM73682k4;
    }

    /* JADX INFO: renamed from: xw */
    private MasterSlide m73686xw() {
        if (m73728wp().size() <= 0 || !C7019kk.m27469x1(m73728wp().get_Item(0).m70235x1(), MasterSlide.class)) {
            return null;
        }
        return (MasterSlide) m73728wp().get_Item(0).m70235x1();
    }

    /* JADX INFO: renamed from: ak */
    public final int m73687ak() {
        return 1;
    }

    /* JADX INFO: renamed from: ar */
    public final int m73688ar() {
        int i = this.f50272wl + 1;
        this.f50272wl = i;
        return i;
    }

    /* JADX INFO: renamed from: b3 */
    public final long m73689b3() {
        long size = ((((long) m73725uz().m50871x1().m51614to().size()) & 4294967295L) + 1) & 4294967295L;
        m73725uz().m50871x1().m51613kk(m73725uz().m50871x1().m51612kk() + 1);
        m73725uz().m50871x1().m51614to().addItem(new C10421eg(size, 0L));
        return size;
    }

    /* JADX INFO: renamed from: bv */
    public final Dictionary<Long, uz3> m73690bv() {
        return this.f50264qq;
    }

    /* JADX INFO: renamed from: bz */
    public final String m73691bz() {
        AutoShape autoShape;
        if (m73686xw() != null && (autoShape = (AutoShape) C7019kk.m27452k4((Object) m73686xw().m391k4((byte) 6), AutoShape.class)) != null && autoShape.getTextFrame() != null) {
            IGenericEnumerator<IPortion> it = autoShape.getTextFrame().getParagraphs().iterator();
            while (it.hasNext()) {
                try {
                    it = it.next().getPortions().iterator();
                    while (it.hasNext()) {
                        try {
                            IPortion next = it.next();
                            if (next.getField() != null && next.getField().getType() == FieldType.getFooter()) {
                                String text = next.getText();
                                if (text == null) {
                                    text = C14113y2.f47374k4;
                                }
                                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                    it.dispose();
                                }
                                return text;
                            }
                        } finally {
                            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                it.dispose();
                            }
                        }
                    }
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                } catch (Throwable th) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    throw th;
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
        }
        return C14113y2.f47374k4;
    }

    /* JADX INFO: renamed from: c6 */
    public final boolean m73692c6() {
        if (m73686xw() != null) {
            return m73686xw().m1937ix().m421x1();
        }
        return false;
    }

    /* JADX INFO: renamed from: dq */
    public final int m73693dq() {
        int i = this.f50268um + 1;
        this.f50268um = i;
        return i;
    }

    /* JADX INFO: renamed from: e0 */
    public final boolean m73694e0() {
        return m73686xw() != null && m73686xw().m1944x6().m72984dy().m70467x1() && m73686xw().getHeaderFooterManager().isFooterVisible();
    }

    /* JADX INFO: renamed from: f9 */
    public final byte[] m73695f9() {
        return this.f50271v4;
    }

    /* JADX INFO: renamed from: g8 */
    public final rpo m73696g8() {
        return this.f50275yj;
    }

    /* JADX INFO: renamed from: gi */
    public final boolean m73697gi() {
        return true;
    }

    /* JADX INFO: renamed from: ix */
    public final C10536m5[] m73698ix() {
        return this.f50267u4;
    }

    /* JADX INFO: renamed from: kp */
    public final List<rpo> m73712kp() {
        return this.f50263ne;
    }

    /* JADX INFO: renamed from: ks */
    public final u8s m73713ks() {
        return this.f50273x1;
    }

    /* JADX INFO: renamed from: lr */
    public final C10677v4 m73714lr() {
        return this.f50257jd;
    }

    /* JADX INFO: renamed from: ne */
    public final ISaveOptions m73715ne() {
        return this.f50259kk;
    }

    /* JADX INFO: renamed from: qm */
    public final boolean m73716qm() {
        return m73686xw() != null && m73686xw().m1944x6().m72984dy().m70465to() && m73686xw().getHeaderFooterManager().isSlideNumberVisible();
    }

    /* JADX INFO: renamed from: qq */
    public final boolean m73717qq() {
        return this.f50270uz;
    }

    /* JADX INFO: renamed from: rv */
    public final Dictionary<BaseSlide, rpo> m73718rv() {
        return this.f50251ck;
    }

    /* JADX INFO: renamed from: s7 */
    public final IGenericList<IFontData> m73719s7() {
        C13827mb c13827mbM6639k4 = m71946k4().m2389rv().m6639k4();
        int iM64796du = c13827mbM6639k4.m64796du();
        IGenericList<IFontData> iGenericList = this.f50249bv;
        if (iGenericList == null || iM64796du != iGenericList.size()) {
            this.f50249bv = c13827mbM6639k4.m64810to();
        }
        return this.f50249bv;
    }

    /* JADX INFO: renamed from: ss */
    public final List<rpo> m73720ss() {
        return this.f50274x6;
    }

    /* JADX INFO: renamed from: sv */
    public final rpo m73721sv() {
        return this.f50260ks;
    }

    /* JADX INFO: renamed from: ts */
    public final String m73722ts() {
        return m73686xw() != null ? m73686xw().m1937ix().m416kk() : C14113y2.f47374k4;
    }

    /* JADX INFO: renamed from: u4 */
    public final C10740z0 m73723u4() {
        return this.f50250c5;
    }

    /* JADX INFO: renamed from: um */
    public final int m73724um() {
        int i = this.f50253dy + 1;
        this.f50253dy = i;
        return i;
    }

    /* JADX INFO: renamed from: uz */
    public final C10459h0 m73725uz() {
        return m71951m9().m51701ck().m51672x1();
    }

    /* JADX INFO: renamed from: v4 */
    public final Dictionary<Long, Integer> m73726v4() {
        return this.f50261lr;
    }

    /* JADX INFO: renamed from: wl */
    public final Dictionary<C10580ou, ISlide> m73727wl() {
        return this.f50269up;
    }

    /* JADX INFO: renamed from: wp */
    public final List<rpo> m73728wp() {
        return this.f50265rv;
    }

    /* JADX INFO: renamed from: wy */
    public final long m73729wy() {
        long j = this.f50252du + 1;
        this.f50252du = j;
        return j;
    }

    /* JADX INFO: renamed from: x6 */
    public final Dictionary<ILayoutSlide, Long> m73731x6() {
        return this.f50254fa;
    }

    /* JADX INFO: renamed from: xk */
    public final boolean m73732xk() {
        return m73686xw() != null && m73686xw().m1944x6().m72984dy().m70461k4() && m73686xw().getHeaderFooterManager().isDateTimeVisible();
    }

    /* JADX INFO: renamed from: yd */
    public final void m73733yd() {
        long j;
        long j2 = (this.f50262m9 & 4294967295L) + (this.f50255h4 & 4294967295L);
        this.f50255h4 = 0L;
        do {
            j = (this.f50262m9 & 4294967295L) + 1024;
            this.f50262m9 = j & 4294967295L;
        } while ((j & 4294967295L) <= (j2 & 4294967295L));
    }

    /* JADX INFO: renamed from: k4 */
    public final IFontData m73699k4(IFontData iFontData, String str) {
        if (this.f50248ar == null) {
            return iFontData;
        }
        FontData fontDataM1486k4 = null;
        if (iFontData == null) {
            return null;
        }
        if (!C14113y2.m67411k4(str) && C14113y2.m67448x1(iFontData.getFontName(), "+")) {
            String strM64895k4 = C14113y2.m67448x1(iFontData.getFontName(), "+mn") ? ((C13839mj) this.f50248ar.getFontScheme().getMinor()).m64895k4(str) : null;
            if (C14113y2.m67448x1(iFontData.getFontName(), "+mj")) {
                strM64895k4 = ((C13839mj) this.f50248ar.getFontScheme().getMajor()).m64895k4(str);
            }
            if (strM64895k4 != null) {
                fontDataM1486k4 = new FontData(strM64895k4);
            }
        }
        if (fontDataM1486k4 == null) {
            fontDataM1486k4 = ((FontData) iFontData).m1486k4(this.f50248ar);
        }
        return fontDataM1486k4 == null ? iFontData : fontDataM1486k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m73730x1(boolean z) {
        long j = this.f50255h4;
        long j2 = (j & 4294967295L) + (this.f50262m9 & 4294967295L);
        long j3 = j2 & 4294967295L;
        this.f50255h4 = j + 1;
        if (z) {
            m73723u4().m52119k4(m73723u4().m52120kk() + 1);
            m73725uz().m50871x1().m51616x1(m73725uz().m50871x1().m51615x1() + 1);
        }
        m73723u4().m52122x1(j3);
        m73725uz().m50871x1().m51611k4(((j2 & 4294967295L) + 1) & 4294967295L);
        m73700k4(m73723u4().m52121x1() & 65535).m50746x1(this.f50255h4);
        return j3;
    }

    /* JADX INFO: renamed from: k4 */
    public final C10421eg m73700k4(long j) {
        C10421eg next;
        List.Enumerator<C10421eg> it = m73725uz().m50871x1().m51614to().iterator();
        while (true) {
            try {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.m50742k4() == j) {
                    break;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (next != null) {
            return next;
        }
        throw new ArgumentException("There is no OfficeArtIDCL record for specified drawing ID.");
    }

    /* JADX INFO: renamed from: k4 */
    public final void m73701k4(BaseSlide baseSlide) {
        this.f50248ar = baseSlide.createThemeEffective();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m73702k4(ISaveOptions iSaveOptions) {
        this.f50259kk = iSaveOptions;
    }

    /* JADX INFO: renamed from: k4 */
    private void m73683k4(C10487j0 c10487j0, int i) {
        int i2 = f50247yd[i + 1] & 15;
        for (int i3 = 0; i3 < i2; i3++) {
            c10487j0.m50979dy()[i3] = f50247yd[i + 2 + i3] & 255;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m73703k4(C10487j0 c10487j0, boolean z) {
        long j;
        long jLongValue;
        long j2;
        boolean zM73711k4 = m73711k4(c10487j0);
        if (zM73711k4 || c10487j0.m50982m9() != 16) {
            int i = 0;
            if (!zM73711k4) {
                int length = f50247yd.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    byte[] bArr = f50247yd;
                    if ((bArr[i2] & 255) == c10487j0.m50982m9()) {
                        if (z == ((bArr[i2 + 1] & 16) != 0)) {
                            m73683k4(c10487j0, i2);
                            break;
                        }
                    }
                    i2 += ((bArr[i2 + 1] & 255) + 2) & 15;
                }
                if (i2 >= length) {
                    throw new NotImplementedException("Have no matched Geom type for SlideAtom!");
                }
                return;
            }
            long j3 = 4294967295L;
            long jM73685x1 = ((z ? 2147483648L : 0L) | m73685x1(c10487j0)) & 4294967295L;
            int length2 = this.f50256ix.length >> 1;
            List list = new List();
            long j4 = 32;
            int i3 = 0;
            while (true) {
                j = j3;
                if (i3 >= length2) {
                    break;
                }
                int i4 = i3 * 2;
                long j5 = this.f50256ix[i4];
                if (((j5 ^ j) & jM73685x1 & j) == 0) {
                    long jM13101kk = C3085sv.m13101kk((jM73685x1 ^ j5) & j);
                    long j6 = jM13101kk & j;
                    if ((j4 & j) > j6) {
                        list = new List();
                        j4 = jM13101kk;
                    }
                    if (j6 <= (j4 & j)) {
                        list.addItem(Long.valueOf(this.f50256ix[i4 + 1]));
                    }
                }
                i3++;
                j3 = j;
            }
            int size = list.size();
            long j7 = C18177fb.f54859s;
            if (size == 1) {
                jLongValue = ((((Long) list.get_Item(0)).longValue() & j) >> 16) & C18177fb.f54859s;
                c10487j0.m50980k4((int) (((Long) list.get_Item(0)).longValue() & C18177fb.f54859s));
            } else {
                jLongValue = 65535;
            }
            if (list.size() > 1) {
                int i5 = 0;
                while (true) {
                    if (i5 >= list.size()) {
                        j2 = j7;
                        break;
                    }
                    j2 = j7;
                    if ((((Long) list.get_Item(i5)).longValue() & j7) == (((long) c10487j0.m50982m9()) & j)) {
                        jLongValue = ((((Long) list.get_Item(i5)).longValue() & j) >> 16) & j2;
                        break;
                    } else {
                        i5++;
                        j7 = j2;
                    }
                }
                if ((jLongValue & j) == j2) {
                    c10487j0.m50980k4(16);
                    for (int i6 = 0; i6 < 8; i6++) {
                        c10487j0.m50979dy()[i6] = 0;
                    }
                    return;
                }
            } else {
                j2 = 65535;
            }
            if ((jLongValue & j) < j2) {
                while ((jLongValue & j) > 0) {
                    i += ((f50247yd[i + 1] & 255) + 2) & 15;
                    jLongValue--;
                }
                m73683k4(c10487j0, i);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m73704k4(C10677v4 c10677v4) {
        this.f50257jd = c10677v4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m73705k4(C10740z0 c10740z0) {
        this.f50250c5 = c10740z0;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m73706k4(rpo rpoVar) {
        List<rpo> listM73728wp;
        m73718rv().addItem(rpoVar.m70235x1(), rpoVar);
        int iM70220kk = rpoVar.m70220kk();
        if (iM70220kk == 0) {
            listM73728wp = m73728wp();
        } else if (iM70220kk == 4) {
            listM73728wp = m73720ss();
        } else if (iM70220kk == 5) {
            this.f50275yj = rpoVar;
            return;
        } else {
            if (iM70220kk != 6) {
                if (iM70220kk != 7) {
                    return;
                }
                this.f50260ks = rpoVar;
                return;
            }
            listM73728wp = m73712kp();
        }
        listM73728wp.addItem(rpoVar);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m73707k4(String str, int i) {
        if (m73715ne() == null || m73715ne().getWarningCallback() == null) {
            return;
        }
        new C3100wp(str, i).sendWarning(m73715ne().getWarningCallback());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m73708k4(boolean z) {
        this.f50270uz = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m73709k4(byte[] bArr) {
        this.f50271v4 = bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m73710k4(C10536m5[] c10536m5Arr) {
        this.f50267u4 = c10536m5Arr;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m73711k4(C10487j0 c10487j0) {
        for (int i = 0; i < 8; i++) {
            if (c10487j0.m50979dy()[i] != 0) {
                return true;
            }
        }
        return false;
    }
}
