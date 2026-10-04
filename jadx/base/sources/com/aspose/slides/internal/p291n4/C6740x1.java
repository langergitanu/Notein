package com.aspose.slides.internal.p291n4;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p153gm.C4357ck;
import com.aspose.slides.internal.p153gm.C4358du;
import com.aspose.slides.internal.p153gm.C4361h4;
import com.aspose.slides.internal.p153gm.C4367x1;
import com.aspose.slides.internal.p185il.C5103kk;
import com.aspose.slides.internal.p195iy.InterfaceC5137k4;
import com.aspose.slides.internal.p299ni.InterfaceC6901du;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p383rp.AbstractC10031du;
import com.aspose.slides.internal.p383rp.C10029c5;
import com.aspose.slides.internal.p448ur.C11546du;
import com.aspose.slides.internal.p448ur.C11547dy;
import com.aspose.slides.internal.p448ur.C11548h4;
import com.aspose.slides.internal.p448ur.C11550kk;
import com.aspose.slides.internal.p448ur.C11551m9;
import com.aspose.slides.internal.p448ur.C11553x1;
import com.aspose.slides.internal.p483ws.C12285fa;
import com.aspose.slides.internal.p483ws.C12286h4;
import com.aspose.slides.internal.p483ws.C12288k4;
import com.aspose.slides.internal.p483ws.C12290m9;
import com.aspose.slides.internal.p483ws.C12292up;
import com.aspose.slides.internal.p483ws.C12293x1;
import com.aspose.slides.internal.p483ws.C12294yj;
import com.aspose.slides.internal.p550zi.AbstractC13610rv;
import com.aspose.slides.internal.p550zi.C13594c5;
import com.aspose.slides.internal.p550zi.C13598dy;
import com.aspose.slides.internal.p550zi.C13606lr;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.AbstractC14106wy;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.words.StyleIdentifier;

/* JADX INFO: renamed from: com.aspose.slides.internal.n4.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C6740x1 extends AbstractC13610rv {

    /* JADX INFO: renamed from: k4 */
    private final Dictionary<Integer, AbstractC10031du> f18575k4;

    /* JADX INFO: renamed from: kk */
    private int f18576kk;

    /* JADX INFO: renamed from: to */
    private boolean f18577to;

    /* JADX INFO: renamed from: x1 */
    private final List<AbstractC10031du> f18578x1;

    public C6740x1(int i) {
        this(i, 18761);
    }

    /* JADX INFO: renamed from: bv */
    private InterfaceC6901du m26536bv() {
        int[] iArrM26566h4 = m26566h4();
        if (iArrM26566h4 == null) {
            return null;
        }
        int i = 0;
        while (true) {
            if (i >= iArrM26566h4.length) {
                break;
            }
            if (C7019kk.m27457kk(Integer.valueOf(iArrM26566h4[i]), 8) > 255) {
                int length = iArrM26566h4.length;
                int[] iArr = new int[length];
                for (int i2 = 0; i2 < length; i2++) {
                    iArr[i2] = C7019kk.m27457kk(Integer.valueOf((C7019kk.m27457kk(Integer.valueOf(iArrM26566h4[i2]), 8) >> 8) & 255), 9);
                }
                iArrM26566h4 = iArr;
            } else {
                i++;
            }
        }
        int length2 = iArrM26566h4.length / 3;
        if (length2 <= 0) {
            return null;
        }
        int[] iArr2 = new int[length2];
        for (int i3 = 0; i3 < length2; i3++) {
            iArr2[i3] = C13598dy.m62726x1(C7019kk.m27462to(Integer.valueOf(iArrM26566h4[i3]), 8), C7019kk.m27462to(Integer.valueOf(iArrM26566h4[i3 + length2]), 8), C7019kk.m27462to(Integer.valueOf(iArrM26566h4[(length2 * 2) + i3]), 8));
        }
        return new C13594c5(iArr2, this.f18577to);
    }

    /* JADX INFO: renamed from: k4 */
    private int m26540k4(int i, int i2) {
        C12285fa c12285fa = (C12285fa) C7019kk.m27452k4((Object) m26557c5(i), C12285fa.class);
        return (c12285fa == null || c12285fa.m57546up() == null || c12285fa.m57546up().length <= 0) ? i2 : c12285fa.m57546up()[0];
    }

    /* JADX INFO: renamed from: x1 */
    private long m26554x1(int i, long j) {
        AbstractC10031du abstractC10031duM26557c5 = m26557c5(i);
        return (abstractC10031duM26557c5 == null || abstractC10031duM26557c5.mo49287m9() == null || !C7019kk.m27469x1(abstractC10031duM26557c5.mo49287m9(), AbstractC14092to.class) || ((AbstractC14092to) C7019kk.m27452k4(abstractC10031duM26557c5.mo49287m9(), AbstractC14092to.class)).m67265du() <= 0) ? j : C14080ne.m66889dy(((AbstractC14092to) C7019kk.m27452k4(abstractC10031duM26557c5.mo49287m9(), AbstractC14092to.class)).m67275kk(0));
    }

    /* JADX INFO: renamed from: ar */
    public int m26556ar() {
        int[] iArrM26586to = m26586to();
        if (iArrM26586to == null) {
            return 0;
        }
        int iM27462to = 0;
        for (int i : iArrM26586to) {
            iM27462to += C7019kk.m27462to(Integer.valueOf(i), 8);
        }
        return iM27462to;
    }

    /* JADX INFO: renamed from: c5 */
    public AbstractC10031du m26557c5(int i) {
        if (this.f18575k4.containsKey(Integer.valueOf(i))) {
            return this.f18575k4.get_Item(Integer.valueOf(i));
        }
        return null;
    }

    /* JADX INFO: renamed from: ck */
    public int m26559ck() {
        return C7019kk.m27457kk(Integer.valueOf(m26540k4(StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_1, 1)), 8);
    }

    /* JADX INFO: renamed from: du */
    public int m26560du() {
        return m26540k4(StyleIdentifier.COLORFUL_GRID_ACCENT_6, 1) & 65535;
    }

    /* JADX INFO: renamed from: dy */
    public int m26562dy() {
        return m26540k4(StyleIdentifier.TOC_HEADING, 1) & 65535;
    }

    /* JADX INFO: renamed from: fa */
    public long m26564fa() {
        return m26554x1(StyleIdentifier.GRID_TABLE_6_COLORFUL, 4294967295L);
    }

    /* JADX INFO: renamed from: h4 */
    public void m26565h4(int i) {
        m26544k4(StyleIdentifier.GRID_TABLE_3_ACCENT_3, C7019kk.m27443k4((Class<?>) C11547dy.class), i);
    }

    /* JADX INFO: renamed from: ix */
    public int m26567ix() {
        return C7019kk.m27457kk(Integer.valueOf(m26540k4(StyleIdentifier.GRID_TABLE_3_ACCENT_6, 1)), 8);
    }

    /* JADX INFO: renamed from: jd */
    public int m26568jd() {
        return m26540k4(StyleIdentifier.SUBTLE_REFERENCE, 0);
    }

    /* JADX INFO: renamed from: kk */
    public int m26576kk() {
        return this.f18576kk;
    }

    /* JADX INFO: renamed from: ks */
    public long[] m26579ks() {
        return m26539jd(StyleIdentifier.GRID_TABLE_1_LIGHT);
    }

    /* JADX INFO: renamed from: m9 */
    public int m26580m9() {
        return m26540k4(StyleIdentifier.LIST_TABLE_3_ACCENT_2, 0) & 65535;
    }

    /* JADX INFO: renamed from: ne */
    public long m26582ne() {
        return C7019kk.m27435du(Long.valueOf(m26542k4(StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_2, 0L)), 10);
    }

    /* JADX INFO: renamed from: qq */
    public AbstractC10031du[] m26583qq() {
        return this.f18578x1.toArray(new AbstractC10031du[0]);
    }

    /* JADX INFO: renamed from: rv */
    public C10029c5 m26584rv() {
        return m26538fa(StyleIdentifier.GRID_TABLE_3_ACCENT_1);
    }

    /* JADX INFO: renamed from: to */
    public void m26585to(int i) {
        m26544k4(StyleIdentifier.SUBTLE_REFERENCE, C7019kk.m27443k4((Class<?>) C11546du.class), i);
    }

    /* JADX INFO: renamed from: u4 */
    public long m26587u4() {
        return m26554x1(257, 0L);
    }

    /* JADX INFO: renamed from: um */
    public void m26588um() {
        m26552k4(false);
    }

    /* JADX INFO: renamed from: up */
    public int m26589up() {
        return m26540k4(StyleIdentifier.GRID_TABLE_5_DARK, 1);
    }

    /* JADX INFO: renamed from: uz */
    public long m26590uz() {
        return m26554x1(256, 0L);
    }

    /* JADX INFO: renamed from: wl */
    public byte[] m26591wl() {
        AbstractC10031du abstractC10031duM26557c5 = m26557c5(34675);
        if (abstractC10031duM26557c5 == null || !(abstractC10031duM26557c5 instanceof C12292up)) {
            return null;
        }
        return ((C12292up) abstractC10031duM26557c5).m57555ck();
    }

    /* JADX INFO: renamed from: x6 */
    public C10029c5 m26598x6() {
        return m26538fa(StyleIdentifier.GRID_TABLE_4_ACCENT_1);
    }

    /* JADX INFO: renamed from: yj */
    public long[] m26599yj() {
        return m26539jd(StyleIdentifier.GRID_TABLE_7_COLORFUL);
    }

    public C6740x1(int i, int i2) {
        int i3;
        this.f18575k4 = new Dictionary<>();
        this.f18578x1 = new List<>();
        this.f18576kk = 18761;
        m26585to(0);
        switch (i) {
            case 1:
                m26593x1(5);
                break;
            case 2:
                m26593x1(5);
                m26585to(2);
                m26573k4(new int[]{8, 8, 8});
                break;
            case 3:
                m26593x1(5);
                m26585to(2);
                m26573k4(new int[]{8, 8, 8, 8});
                m26577kk(2);
                break;
            case 4:
                i3 = 3;
                m26593x1(i3);
                break;
            case 5:
                i3 = 4;
                m26593x1(i3);
                break;
            case 6:
                m26593x1(8);
                break;
            case 7:
                m26593x1(8);
                m26585to(2);
                m26573k4(new int[]{8, 8, 8});
                break;
            case 8:
                m26593x1(2);
                break;
            case 9:
                m26593x1(7);
                m26585to(2);
                m26573k4(new int[]{8, 8, 8});
                break;
            case 10:
                m26593x1(7);
                m26585to(6);
                m26573k4(new int[]{8, 8, 8});
                break;
            case 12:
                m26585to(2);
                m26573k4(new int[]{8, 8, 8});
                break;
            case 13:
                m26585to(2);
                m26573k4(new int[]{8, 8, 8, 8});
                m26577kk(2);
                break;
        }
        this.f18576kk = i2;
    }

    /* JADX INFO: renamed from: ck */
    private int[] m26537ck(int i) {
        C12285fa c12285fa = (C12285fa) C7019kk.m27452k4((Object) m26557c5(i), C12285fa.class);
        if (c12285fa != null) {
            return c12285fa.m57546up();
        }
        return null;
    }

    /* JADX INFO: renamed from: fa */
    private C10029c5 m26538fa(int i) {
        C12290m9 c12290m9 = (C12290m9) C7019kk.m27452k4((Object) m26557c5(i), C12290m9.class);
        if (c12290m9 == null || c12290m9.m57554up() == null || c12290m9.m57554up().length <= 0) {
            return null;
        }
        return c12290m9.m57554up()[0];
    }

    /* JADX INFO: renamed from: jd */
    private long[] m26539jd(int i) {
        AbstractC10031du abstractC10031duM26557c5 = m26557c5(i);
        if (abstractC10031duM26557c5 == null || !C7019kk.m27469x1(abstractC10031duM26557c5.mo49287m9(), AbstractC14092to.class)) {
            return null;
        }
        AbstractC14092to abstractC14092to = (AbstractC14092to) C7019kk.m27452k4(abstractC10031duM26557c5.mo49287m9(), AbstractC14092to.class);
        long[] jArr = new long[abstractC14092to.m67265du()];
        for (int i2 = 0; i2 < abstractC14092to.m67265du(); i2++) {
            jArr[i2] = C14080ne.m66889dy(abstractC14092to.m67275kk(i2));
        }
        return jArr;
    }

    /* JADX INFO: renamed from: k4 */
    public static int m26541k4(AbstractC10031du[] abstractC10031duArr) {
        if (abstractC10031duArr == null) {
            return 0;
        }
        int i = 0;
        for (AbstractC10031du abstractC10031du : abstractC10031duArr) {
            if (abstractC10031du != null && !C7019kk.m27469x1(abstractC10031du, C12294yj.class) && abstractC10031du.m49294dy()) {
                i++;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: up */
    private String m26553up(int i) {
        C12288k4 c12288k4 = (C12288k4) C7019kk.m27452k4((Object) m26557c5(i), C12288k4.class);
        if (c12288k4 != null) {
            return c12288k4.m57551ck();
        }
        return null;
    }

    /* JADX INFO: renamed from: c5 */
    public String m26558c5() {
        return m26553up(StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_1);
    }

    /* JADX INFO: renamed from: du */
    public void m26561du(int i) {
        m26544k4(StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_1, C7019kk.m27443k4((Class<?>) C11548h4.class), i);
    }

    /* JADX INFO: renamed from: dy */
    public boolean m26563dy(int i) {
        if (!this.f18575k4.containsKey(Integer.valueOf(i))) {
            return false;
        }
        AbstractC10031du abstractC10031du = this.f18575k4.get_Item(Integer.valueOf(i));
        this.f18575k4.removeItemByKey(Integer.valueOf(i));
        this.f18578x1.removeItem(abstractC10031du);
        return true;
    }

    /* JADX INFO: renamed from: h4 */
    public int[] m26566h4() {
        return m26537ck(StyleIdentifier.GRID_TABLE_6_COLORFUL_ACCENT_6);
    }

    /* JADX INFO: renamed from: kk */
    public void m26577kk(int i) {
        m26544k4(StyleIdentifier.LIST_TABLE_3_ACCENT_2, C7019kk.m27443k4((Class<?>) C11553x1.class), i);
    }

    /* JADX INFO: renamed from: m9 */
    public void m26581m9(int i) {
        m26544k4(StyleIdentifier.GRID_TABLE_3_ACCENT_6, C7019kk.m27443k4((Class<?>) C11551m9.class), i);
    }

    /* JADX INFO: renamed from: to */
    public int[] m26586to() {
        int[] iArrM26537ck = m26537ck(StyleIdentifier.COLORFUL_LIST_ACCENT_6);
        int length = 0;
        if (iArrM26537ck == null) {
            return new int[]{1};
        }
        if (iArrM26537ck.length >= (m26589up() & 65535) || m26568jd() != 2) {
            return iArrM26537ck;
        }
        int iM26589up = m26589up() & 65535;
        int[] iArr = new int[iM26589up];
        System.arraycopy(iArrM26537ck, 0, iArr, 0, iArrM26537ck.length);
        AbstractC10031du abstractC10031duM26557c5 = m26557c5(StyleIdentifier.LIST_TABLE_3_ACCENT_2);
        if (C7019kk.m27469x1(abstractC10031duM26557c5, C12285fa.class)) {
            C12285fa c12285fa = (C12285fa) C7019kk.m27452k4((Object) abstractC10031duM26557c5, C12285fa.class);
            if (c12285fa.m57546up() != null) {
                length = c12285fa.m57546up().length;
            }
        }
        while (length > 0) {
            iArr[iM26589up - length] = 8;
            length--;
        }
        return iArr;
    }

    @Override // com.aspose.slides.internal.p550zi.AbstractC13610rv
    /* JADX INFO: renamed from: x1 */
    public C13606lr mo26592x1() {
        return super.mo26592x1();
    }

    public C6740x1(C6740x1 c6740x1) {
        this.f18575k4 = new Dictionary<>();
        this.f18578x1 = new List<>();
        this.f18576kk = 18761;
        if (c6740x1 == null) {
            throw new ArgumentNullException("options");
        }
        List<AbstractC10031du> list = c6740x1.f18578x1;
        if (list != null) {
            m26555x1(list.toArray(new AbstractC10031du[0]));
        }
    }

    /* JADX INFO: renamed from: k4 */
    private long m26542k4(int i, long j) {
        C12286h4 c12286h4 = (C12286h4) C7019kk.m27452k4((Object) m26557c5(i), C12286h4.class);
        return (c12286h4 == null || c12286h4.m57548up() == null || c12286h4.m57548up().length <= 0) ? j : c12286h4.m57548up()[0];
    }

    /* JADX INFO: renamed from: kk */
    public void m26578kk(long j) {
        m26549k4(256, new long[]{j}, false);
    }

    /* JADX INFO: renamed from: x1 */
    public void m26593x1(int i) {
        m26544k4(StyleIdentifier.COLORFUL_GRID_ACCENT_6, C7019kk.m27443k4((Class<?>) C11550kk.class), i);
    }

    public C6740x1(AbstractC10031du[] abstractC10031duArr) {
        this.f18575k4 = new Dictionary<>();
        this.f18578x1 = new List<>();
        this.f18576kk = 18761;
        if (abstractC10031duArr == null) {
            throw new ArgumentNullException("tags");
        }
        m26555x1(abstractC10031duArr);
    }

    @Override // com.aspose.slides.internal.p550zi.AbstractC13610rv
    /* JADX INFO: renamed from: k4 */
    public InterfaceC6901du mo26569k4() {
        return m26536bv();
    }

    /* JADX INFO: renamed from: x1 */
    public void m26594x1(long j) {
        m26549k4(257, new long[]{j}, false);
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC10031du m26543k4(int i, InterfaceC5137k4 interfaceC5137k4) {
        AbstractC10031du abstractC10031duMo17431k4 = interfaceC5137k4.mo17431k4(i);
        AbstractC10031du abstractC10031du = null;
        if (this.f18575k4.containsKey(Integer.valueOf(i))) {
            AbstractC10031du abstractC10031du2 = this.f18575k4.get_Item(Integer.valueOf(i));
            if (abstractC10031du2.mo49288to() != abstractC10031duMo17431k4.mo49288to()) {
                m26563dy(i);
            } else {
                abstractC10031du = abstractC10031du2;
            }
        }
        return abstractC10031du == null ? abstractC10031duMo17431k4 : abstractC10031du;
    }

    /* JADX INFO: renamed from: x1 */
    public void m26595x1(C10029c5 c10029c5) {
        m26545k4(StyleIdentifier.GRID_TABLE_4_ACCENT_1, (AbstractC14068j5) null, c10029c5);
    }

    /* JADX INFO: renamed from: k4 */
    private void m26544k4(int i, AbstractC14068j5 abstractC14068j5, int i2) {
        if (abstractC14068j5 != null && !AbstractC14106wy.isDefined(abstractC14068j5, C7019kk.m27466x1(i2))) {
            throw new ArgumentOutOfRangeException("value", "The value is not defined.");
        }
        m26547k4(i, new int[]{i2});
    }

    /* JADX INFO: renamed from: x1 */
    public void m26596x1(int[] iArr) {
        m26551k4(AbstractC14092to.m67208k4((Object) iArr), C7019kk.m27462to(Integer.valueOf(m26589up()), 8), "samples per pixel.");
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = iArr[i];
        }
        m26547k4(StyleIdentifier.LIST_TABLE_4_ACCENT_2, iArr2);
    }

    /* JADX INFO: renamed from: k4 */
    private void m26545k4(int i, AbstractC14068j5 abstractC14068j5, C10029c5 c10029c5) {
        if (abstractC14068j5 != null && !AbstractC14106wy.isDefined(abstractC14068j5, c10029c5)) {
            throw new ArgumentOutOfRangeException("value", "The value is not defined.");
        }
        m26550k4(i, new C10029c5[]{c10029c5});
    }

    /* JADX INFO: renamed from: x1 */
    public void m26597x1(long[] jArr) {
        m26549k4(StyleIdentifier.GRID_TABLE_1_LIGHT, jArr, false);
    }

    /* JADX INFO: renamed from: k4 */
    private void m26546k4(int i, byte[] bArr) {
        C12293x1 c12293x1 = (C12293x1) m26543k4(i, new C4367x1());
        c12293x1.m57557k4(bArr);
        m26572k4(c12293x1);
    }

    /* JADX INFO: renamed from: x1 */
    private void m26555x1(AbstractC10031du[] abstractC10031duArr) {
        for (AbstractC10031du abstractC10031du : abstractC10031duArr) {
            m26572k4(abstractC10031du.m49292c5());
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m26547k4(int i, int[] iArr) {
        C12285fa c12285fa = (C12285fa) m26543k4(i, new C4357ck());
        c12285fa.m57545k4(iArr);
        m26572k4(c12285fa);
    }

    /* JADX INFO: renamed from: k4 */
    private void m26548k4(int i, long[] jArr) {
        C12286h4 c12286h4 = (C12286h4) m26543k4(i, new C4358du());
        c12286h4.m57547k4(jArr);
        m26572k4(c12286h4);
    }

    /* JADX INFO: renamed from: k4 */
    private void m26549k4(int i, long[] jArr, boolean z) {
        long j = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < jArr.length; i3++) {
            if (C7019kk.m27435du(Long.valueOf(jArr[i3]), 10) > C7019kk.m27435du(Long.valueOf(j), 10)) {
                j = jArr[i3];
            }
        }
        if (z && C7019kk.m27435du(Long.valueOf(j), 10) <= 255) {
            byte[] bArr = new byte[jArr.length];
            while (i2 < jArr.length) {
                bArr[i2] = C7019kk.m27442k4(Long.valueOf(jArr[i2]), 10);
                i2++;
            }
            AbstractC10031du abstractC10031duM26557c5 = m26557c5(i);
            if (abstractC10031duM26557c5 != null && abstractC10031duM26557c5.mo49288to() != 1) {
                m26563dy(i);
            }
            m26546k4(i, bArr);
            return;
        }
        if (C7019kk.m27435du(Long.valueOf(j), 10) > C7019kk.m27457kk((Object) 65535, 8)) {
            AbstractC10031du abstractC10031duM26557c52 = m26557c5(i);
            if (abstractC10031duM26557c52 != null && abstractC10031duM26557c52.mo49288to() != 4) {
                m26563dy(i);
            }
            m26548k4(i, jArr);
            return;
        }
        int[] iArr = new int[jArr.length];
        while (i2 < jArr.length) {
            iArr[i2] = C7019kk.m27457kk(Long.valueOf(jArr[i2]), 10);
            i2++;
        }
        AbstractC10031du abstractC10031duM26557c53 = m26557c5(i);
        if (abstractC10031duM26557c53 != null && abstractC10031duM26557c53.mo49288to() != 3) {
            m26563dy(i);
        }
        m26547k4(i, iArr);
    }

    /* JADX INFO: renamed from: k4 */
    private void m26550k4(int i, C10029c5[] c10029c5Arr) {
        C12290m9 c12290m9 = (C12290m9) m26543k4(i, new C4361h4());
        c12290m9.m57553k4(c10029c5Arr);
        m26572k4(c12290m9);
    }

    /* JADX INFO: renamed from: k4 */
    public void m26570k4(long j) {
        m26549k4(StyleIdentifier.GRID_TABLE_6_COLORFUL, new long[]{j}, false);
    }

    /* JADX INFO: renamed from: k4 */
    public void m26571k4(C10029c5 c10029c5) {
        m26545k4(StyleIdentifier.GRID_TABLE_3_ACCENT_1, (AbstractC14068j5) null, c10029c5);
    }

    /* JADX INFO: renamed from: k4 */
    public void m26572k4(AbstractC10031du abstractC10031du) {
        if (abstractC10031du == null) {
            throw new ArgumentNullException("tagToAdd");
        }
        if (!this.f18575k4.containsKey(Integer.valueOf(abstractC10031du.m49297kk()))) {
            this.f18578x1.addItem(abstractC10031du);
        }
        this.f18575k4.set_Item(Integer.valueOf(abstractC10031du.m49297kk()), abstractC10031du);
    }

    /* JADX INFO: renamed from: k4 */
    private void m26551k4(AbstractC14092to abstractC14092to, int i, String str) {
        if (abstractC14092to == null) {
            throw new ArgumentNullException("array");
        }
        if (abstractC14092to.m67265du() != i) {
            throw new ArgumentOutOfRangeException("array", C14113y2.m67408k4("The array length is not valid. Expected length equal to ", str));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m26573k4(int[] iArr) {
        if (iArr == null) {
            throw new ArgumentNullException("value");
        }
        if (iArr.length == 0) {
            throw new ArgumentOutOfRangeException("value", "At least single array value must be specified.");
        }
        m26547k4(StyleIdentifier.COLORFUL_LIST_ACCENT_6, iArr);
        m26544k4(StyleIdentifier.GRID_TABLE_5_DARK, (AbstractC14068j5) null, iArr.length & 65535);
    }

    /* JADX INFO: renamed from: k4 */
    public void m26574k4(long[] jArr) {
        m26549k4(StyleIdentifier.GRID_TABLE_7_COLORFUL, jArr, false);
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m26575k4(int i) {
        return this.f18575k4.containsKey(Integer.valueOf(i));
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x0132  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean m26552k4(boolean z) {
        boolean z2;
        int iM26560du;
        int[] iArrM26586to = m26586to();
        int iM26568jd = m26568jd();
        if (iM26568jd == 0 || iM26568jd == 1) {
            if (iArrM26586to.length != 1) {
                if (!z) {
                    throw new C5103kk("The MinIsWhite or MinIsBlack photometric for tiff images require samples per pixels to be equal 1. TiffOptionsError.PhotometricSppMismatch");
                }
                z2 = false;
            }
            z2 = true;
        } else if (iM26568jd == 2) {
            if (iArrM26586to.length < 3) {
                if (!z) {
                    throw new C5103kk("The samples per pixel are invalid. Samples per pixels should be at least 3 for RGB images. TiffOptionsError.PhotometricSppMismatch");
                }
                z2 = false;
            }
            z2 = true;
        } else if (iM26568jd != 3) {
            if (iM26568jd != 6) {
                if (!z) {
                    throw new C5103kk(C14113y2.m67402k4("The Photometric={0} format is not supported at the moment.", AbstractC14106wy.getName((Class<?>) C11546du.class, iM26568jd)));
                }
            } else if (iArrM26586to.length == 3) {
                if (m26560du() != 7 && m26560du() != 6) {
                    if (!z) {
                        throw new C5103kk(C14113y2.m67408k4("For  photometric ", AbstractC14106wy.getName((Class<?>) C11546du.class, iM26568jd), " compression must be Jpeg only. TiffOptionsError.PhotometricCompressionMismatch"));
                    }
                }
                z2 = true;
            } else if (!z) {
                throw new C5103kk("The samples per pixel are invalid. Samples per pixels should be at least 3 for YCbCr images. TiffOptionsError.PhotometricSppMismatch");
            }
            z2 = false;
        } else {
            if (iArrM26586to.length == 1) {
                int[] iArrM26566h4 = m26566h4();
                if (iArrM26566h4 != null) {
                    if (iArrM26566h4.length != C7019kk.m27462to(Double.valueOf(C14116yg.m67469du(2.0d, C7019kk.m27433c5(Integer.valueOf(iArrM26586to[0]), 8)) * 3.0d), 14)) {
                        if (!z) {
                            throw new C5103kk("The palette tiff images require ColorMap length corresponding to the followign formula: 3 * (2**BitsPerSample). TiffOptionsError.ColorMapLengthInvalid");
                        }
                    }
                    z2 = true;
                } else if (!z) {
                    throw new C5103kk("The palette tiff images require ColorMap to be defined. Use ColorMap or Palette property to specify the ColorMap. TiffOptionsError.NoColorMap");
                }
            } else if (!z) {
                throw new C5103kk("The palette tiff images require samples per pixels to be equal 1.TiffOptionsError.PhotometricSppMismatch");
            }
            z2 = false;
        }
        if (z2 && (iM26560du = m26560du()) != 1) {
            if (iM26560du == 2 || iM26560du == 3 || iM26560du == 4) {
                if (iArrM26586to.length != 1) {
                    if (z) {
                        return false;
                    }
                    throw new C5103kk(C14113y2.m67408k4("For compression ", AbstractC14106wy.getName((Class<?>) C11550kk.class, iM26560du), " expected 1 sample per pixel. TiffOptionsError.CompressionSppMismatch"));
                }
                if (iM26568jd != 1 && iM26568jd != 0) {
                    if (z) {
                        return false;
                    }
                    throw new C5103kk(C14113y2.m67408k4("For compression ", AbstractC14106wy.getName((Class<?>) C11550kk.class, iM26560du), " the photometric should be MinIsWhite or MinIsBlack only. TiffOptionsError.PhotometricCompressionMismatch"));
                }
                if (C7019kk.m27457kk(Integer.valueOf(iArrM26586to[0]), 8) != 1) {
                    if (z) {
                        return false;
                    }
                    throw new C5103kk(C14113y2.m67408k4("For compression ", AbstractC14106wy.getName((Class<?>) C11550kk.class, iM26560du), " expected 1 bit per sample. TiffOptionsError.CompressionSppMismatch"));
                }
            } else if (iM26560du != 5) {
                if (iM26560du != 7) {
                    if (iM26560du != 8) {
                        if (iM26560du != 32771) {
                            if (iM26560du != 32773 && iM26560du != 32946) {
                                if (z) {
                                    return false;
                                }
                                throw new C5103kk(C14113y2.m67402k4("The compression {0} is not supported at the moment.", C7019kk.m27466x1(iM26560du)));
                            }
                        }
                    }
                } else if (iM26568jd != 1 && iM26568jd != 2 && iM26568jd != 6) {
                    if (z) {
                        return false;
                    }
                    throw new C5103kk(C14113y2.m67408k4("For compression ", AbstractC14106wy.getName((Class<?>) C11550kk.class, iM26560du), " the photometric should be MinIsBlack or RGB or YCbCr only. TiffOptionsError.PhotometricCompressionMismatch"));
                }
            }
        }
        return z2;
    }
}
