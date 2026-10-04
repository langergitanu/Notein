package com.aspose.slides.internal.p475wh;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p154gr.C4375kk;
import com.aspose.slides.internal.p167hh.AbstractC4584k4;
import com.aspose.slides.internal.p316of.C7035kk;
import com.aspose.slides.p559ms.System.AbstractC14106wy;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.InterfaceC14059g8;

/* JADX INFO: renamed from: com.aspose.slides.internal.wh.m9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C12013m9 implements IDisposable, InterfaceC14059g8, Cloneable {

    /* JADX INFO: renamed from: c5 */
    private boolean f40537c5;

    /* JADX INFO: renamed from: du */
    private AbstractC4584k4 f40538du;

    /* JADX INFO: renamed from: dy */
    private String f40539dy;

    /* JADX INFO: renamed from: h4 */
    private byte f40540h4;

    /* JADX INFO: renamed from: k4 */
    private int f40541k4;

    /* JADX INFO: renamed from: kk */
    private String f40542kk;

    /* JADX INFO: renamed from: m9 */
    private boolean f40543m9;

    /* JADX INFO: renamed from: to */
    private float f40544to;

    /* JADX INFO: renamed from: x1 */
    private final C12004dy f40545x1;

    public C12013m9(C12004dy c12004dy, float f) {
        this(c12004dy, f, 0, 3, (byte) 1, false);
    }

    /* JADX INFO: renamed from: rv */
    private float m56635rv() {
        return (float) (((double) m56651x1().m56526du(m56642jd())) / ((double) m56651x1().m56535to(m56642jd())));
    }

    /* JADX INFO: renamed from: c5 */
    public float m56636c5() {
        return this.f40541k4 == 3 ? m56639dy() : (float) C4375kk.m17615k4(m56640fa(), 3, m56639dy());
    }

    /* JADX INFO: renamed from: ck */
    public boolean m56637ck() {
        return m56647ks().m18925dy();
    }

    @Override // com.aspose.slides.p559ms.System.InterfaceC14059g8
    public Object deepClone() {
        return m56652yj();
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public void dispose() {
        this.f40538du = null;
        this.f40537c5 = true;
    }

    /* JADX INFO: renamed from: du */
    public int m56638du() {
        return (int) Math.ceil(m56650up());
    }

    /* JADX INFO: renamed from: dy */
    public float m56639dy() {
        return this.f40544to;
    }

    public boolean equals(Object obj) {
        C12013m9 c12013m9 = obj instanceof C12013m9 ? (C12013m9) obj : null;
        return c12013m9 != null && m56647ks().equals(c12013m9.m56647ks());
    }

    /* JADX INFO: renamed from: fa */
    public int m56640fa() {
        return this.f40541k4;
    }

    /* JADX INFO: renamed from: h4 */
    public boolean m56641h4() {
        return m56647ks().m18926h4();
    }

    public int hashCode() {
        return m56647ks().hashCode();
    }

    /* JADX INFO: renamed from: jd */
    public int m56642jd() {
        return m56647ks().m18936to();
    }

    /* JADX INFO: renamed from: k4 */
    public float m56643k4(float f) {
        return (float) (C4375kk.m17615k4(this.f40541k4, 4, this.f40544to) * ((double) m56635rv()) * ((double) f));
    }

    /* JADX INFO: renamed from: kk */
    public byte m56646kk() {
        return this.f40540h4;
    }

    /* JADX INFO: renamed from: ks */
    public AbstractC4584k4 m56647ks() {
        if (this.f40537c5) {
            throw new ArgumentException("Parameter is invalid");
        }
        return this.f40538du;
    }

    /* JADX INFO: renamed from: m9 */
    public String m56648m9() {
        return this.f40542kk;
    }

    /* JADX INFO: renamed from: to */
    public boolean m56649to() {
        return this.f40543m9;
    }

    public String toString() {
        return "[Font: Name=" + m56648m9() + ", Size=" + m56639dy() + ", Style=" + m56642jd() + ", Units=" + m56640fa() + "]";
    }

    /* JADX INFO: renamed from: up */
    public float m56650up() {
        return m56643k4(C4375kk.m17633to());
    }

    /* JADX INFO: renamed from: x1 */
    public C12004dy m56651x1() {
        return this.f40545x1;
    }

    /* JADX INFO: renamed from: yj */
    public Object m56652yj() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public C12013m9(C12004dy c12004dy, float f, int i, int i2) {
        this(c12004dy, f, i, i2, (byte) 1, false);
    }

    /* JADX INFO: renamed from: k4 */
    public float m56644k4(AbstractC12008jd abstractC12008jd) {
        int i;
        if (abstractC12008jd == null) {
            throw new ArgumentNullException("graphics");
        }
        float fMo17474ck = abstractC12008jd.mo17474ck();
        int iMo17605yj = abstractC12008jd.mo17605yj();
        if (iMo17605yj != 2 && iMo17605yj != 1 && (i = this.f40541k4) != 2 && i != 0) {
            fMo17474ck = (float) C4375kk.m17615k4(2, abstractC12008jd.mo17605yj(), abstractC12008jd.mo17474ck());
        }
        return m56643k4(fMo17474ck);
    }

    public C12013m9(C12004dy c12004dy, float f, int i, int i2, byte b) {
        this(c12004dy, f, i, i2, b, false);
    }

    /* JADX INFO: renamed from: k4 */
    public static C12013m9 m56630k4(C12004dy c12004dy, float f, int i) {
        return new C12013m9(c12004dy, f, i, 3, (byte) 1, false);
    }

    public C12013m9(C12004dy c12004dy, float f, int i, int i2, byte b, boolean z) {
        this.f40541k4 = 3;
        this.f40542kk = null;
        this.f40544to = 0.0f;
        this.f40540h4 = (byte) 1;
        this.f40543m9 = false;
        this.f40537c5 = false;
        if (c12004dy == null) {
            throw new ArgumentNullException("family");
        }
        this.f40545x1 = c12004dy;
        m56633k4(c12004dy, f, i, i2, b, z, false);
    }

    /* JADX INFO: renamed from: k4 */
    public static C12013m9 m56631k4(C12013m9 c12013m9, float f, int i) {
        C12013m9 c12013m92 = (C12013m9) c12013m9.deepClone();
        c12013m92.f40544to = f;
        c12013m92.f40541k4 = i;
        c12013m92.f40538du = c12013m9.f40538du.mo18929k4(f);
        return c12013m92;
    }

    public C12013m9(C12013m9 c12013m9, int i) {
        this.f40541k4 = 3;
        this.f40542kk = null;
        this.f40544to = 0.0f;
        this.f40540h4 = (byte) 1;
        this.f40543m9 = false;
        this.f40537c5 = false;
        this.f40538du = c12013m9.m56647ks().mo18931k4(i);
        this.f40541k4 = c12013m9.f40541k4;
        this.f40545x1 = c12013m9.f40545x1;
        this.f40540h4 = c12013m9.f40540h4;
        this.f40542kk = c12013m9.m56648m9();
        this.f40543m9 = c12013m9.m56649to();
        this.f40544to = c12013m9.f40544to;
    }

    /* JADX INFO: renamed from: k4 */
    public static C12013m9 m56632k4(String str, float f, int i) {
        return new C12013m9(str, f, i, 3, (byte) 1, m56634k4(str));
    }

    public C12013m9(String str, float f) {
        this(str, f, 0, 3, (byte) 1, m56634k4(str));
    }

    /* JADX INFO: renamed from: k4 */
    private void m56633k4(C12004dy c12004dy, float f, int i, int i2, byte b, boolean z, boolean z2) {
        if (Float.isNaN(f) || Float.isInfinite(f) || f <= 0.0f) {
            throw new ArgumentException("Parameter 'emSize' is invalid");
        }
        if (i2 == 1) {
            throw new ArgumentException("Parameter 'unit' cannot be Graphics.Display");
        }
        if (!c12004dy.m56529h4(i)) {
            throw new ArgumentException("Font '" + c12004dy.m56527du() + "' does not support style '" + AbstractC14106wy.getName((Class<?>) C12001c5.class, i) + "'");
        }
        this.f40541k4 = i2;
        this.f40540h4 = b;
        this.f40543m9 = z;
        this.f40544to = f;
        double dM17615k4 = f;
        if (i2 != 2) {
            dM17615k4 = C4375kk.m17615k4(i2, 2, f);
        }
        AbstractC4584k4 abstractC4584k4Mo18930k4 = c12004dy.m56533m9(i).mo18930k4((float) dM17615k4, i);
        this.f40538du = abstractC4584k4Mo18930k4;
        this.f40542kk = abstractC4584k4Mo18930k4.m18937x1();
    }

    public C12013m9(String str, float f, int i) {
        this(str, f, 0, i, (byte) 1, m56634k4(str));
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m56645k4() {
        return m56647ks().m18924du();
    }

    public C12013m9(String str, float f, int i, int i2) {
        this(str, f, i, i2, (byte) 1, m56634k4(str));
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m56634k4(String str) {
        return str != null && str.length() > 0 && str.charAt(0) == '@';
    }

    public C12013m9(String str, float f, int i, int i2, byte b) {
        this(str, f, i, i2, b, m56634k4(str));
    }

    public C12013m9(String str, float f, int i, int i2, byte b, boolean z) {
        this(C7035kk.m27495k4(str), f, i, i2, b, z);
    }

    public C12013m9(String str, float f, String str2) {
        this(str, f);
        this.f40539dy = str2;
    }
}
