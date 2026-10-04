package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Shape;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p505xn.C12569rv;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: loaded from: classes3.dex */
public class Connector extends GeometryShape implements IConnector {

    /* JADX INFO: renamed from: k4 */
    static final Dictionary<Integer, Integer> f2031k4 = GeometryShape.m1583k4(1, 96, 97, 98, 99, 100, 101, 102, 103, 104);

    /* JADX INFO: renamed from: h4 */
    private Shape f2032h4;

    /* JADX INFO: renamed from: ix */
    private int f2033ix;

    /* JADX INFO: renamed from: kk */
    private final Shape.AbstractC0612k4 f2034kk;

    /* JADX INFO: renamed from: ks */
    private C12025x6 f2035ks;

    /* JADX INFO: renamed from: m9 */
    private long f2036m9;

    /* JADX INFO: renamed from: ne */
    private long f2037ne;

    /* JADX INFO: renamed from: rv */
    private C12025x6 f2038rv;

    /* JADX INFO: renamed from: to */
    private Shape f2039to;

    /* JADX INFO: renamed from: u4 */
    private int f2040u4;

    /* JADX INFO: renamed from: x1 */
    private final Shape.AbstractC0612k4 f2041x1;

    /* JADX INFO: renamed from: x6 */
    private long f2042x6;

    /* JADX INFO: renamed from: yj */
    private long f2043yj;

    /* JADX INFO: renamed from: com.aspose.slides.Connector$k4 */
    public static class C0331k4 extends AbstractC7020m9<C0331k4> {

        /* JADX INFO: renamed from: k4 */
        boolean f2046k4;

        /* JADX INFO: renamed from: x1 */
        boolean f2047x1;

        /* JADX INFO: renamed from: x1 */
        private boolean m1224x1(C0331k4 c0331k4) {
            return c0331k4.f2046k4 == this.f2046k4 && c0331k4.f2047x1 == this.f2047x1;
        }

        public Object clone() {
            return Clone();
        }

        public boolean equals(Object obj) {
            if (C14067j2.m66729x1(null, obj)) {
                return false;
            }
            if (C14067j2.m66729x1(this, obj)) {
                return true;
            }
            if (obj instanceof C0331k4) {
                return m1224x1((C0331k4) obj);
            }
            return false;
        }

        public int hashCode() {
            return C12569rv.m58664k4(Boolean.valueOf(this.f2046k4), Boolean.valueOf(this.f2047x1));
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public C0331k4 Clone() {
            C0331k4 c0331k4 = new C0331k4();
            CloneTo(c0331k4);
            return c0331k4;
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public void CloneTo(C0331k4 c0331k4) {
            c0331k4.f2046k4 = this.f2046k4;
            c0331k4.f2047x1 = this.f2047x1;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.Connector$x1 */
    public static class C0332x1 extends AbstractC7020m9<C0332x1> {

        /* JADX INFO: renamed from: k4 */
        private float f2048k4;

        /* JADX INFO: renamed from: kk */
        private float f2049kk;

        /* JADX INFO: renamed from: to */
        private float f2050to;

        /* JADX INFO: renamed from: x1 */
        private float f2051x1;

        public C0332x1() {
        }

        /* JADX INFO: renamed from: c5 */
        public final C12025x6 m1228c5() {
            return new C12025x6((m1240m9() / 2.0f) + m1230du(), (m1231dy() / 2.0f) + m1233h4());
        }

        /* JADX INFO: renamed from: ck */
        public final C12025x6 m1229ck() {
            return new C12025x6(m1238kk(), m1242to());
        }

        public Object clone() {
            return Clone();
        }

        /* JADX INFO: renamed from: du */
        public final float m1230du() {
            return C14116yg.m67504x1(m1235k4(), m1238kk());
        }

        /* JADX INFO: renamed from: dy */
        public final float m1231dy() {
            return C14116yg.m67480k4(m1242to() - m1244x1());
        }

        public boolean equals(Object obj) {
            if (C14067j2.m66729x1(null, obj)) {
                return false;
            }
            if (C14067j2.m66729x1(this, obj)) {
                return true;
            }
            if (obj instanceof C0332x1) {
                return m1227x1((C0332x1) obj);
            }
            return false;
        }

        /* JADX INFO: renamed from: fa */
        public final float m1232fa() {
            if (m1240m9() == 0.0f) {
                return 1.0f;
            }
            return m1240m9();
        }

        /* JADX INFO: renamed from: h4 */
        public final float m1233h4() {
            return C14116yg.m67504x1(m1244x1(), m1242to());
        }

        public int hashCode() {
            return C12569rv.m58664k4(Float.valueOf(this.f2048k4), Float.valueOf(this.f2051x1), Float.valueOf(this.f2049kk), Float.valueOf(this.f2050to));
        }

        /* JADX INFO: renamed from: jd */
        public final C12025x6 m1234jd() {
            return new C12025x6(m1235k4(), m1244x1());
        }

        /* JADX INFO: renamed from: k4 */
        public final float m1235k4() {
            return this.f2048k4;
        }

        /* JADX INFO: renamed from: kk */
        public final float m1238kk() {
            return this.f2049kk;
        }

        /* JADX INFO: renamed from: ks */
        public final double m1239ks() {
            return 100000.0f / m1243up();
        }

        /* JADX INFO: renamed from: m9 */
        public final float m1240m9() {
            return C14116yg.m67480k4(m1238kk() - m1235k4());
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: rv, reason: merged with bridge method [inline-methods] */
        public C0332x1 Clone() {
            C0332x1 c0332x1 = new C0332x1();
            CloneTo(c0332x1);
            return c0332x1;
        }

        /* JADX INFO: renamed from: to */
        public final float m1242to() {
            return this.f2050to;
        }

        /* JADX INFO: renamed from: up */
        public final float m1243up() {
            if (m1231dy() == 0.0f) {
                return 1.0f;
            }
            return m1231dy();
        }

        /* JADX INFO: renamed from: x1 */
        public final float m1244x1() {
            return this.f2051x1;
        }

        /* JADX INFO: renamed from: yj */
        public final double m1245yj() {
            return 100000.0f / m1232fa();
        }

        public C0332x1(C12025x6 c12025x6, C12025x6 c12025x62) {
            this.f2048k4 = c12025x6.m56897x1();
            this.f2051x1 = c12025x6.m56895kk();
            this.f2049kk = c12025x62.m56897x1();
            this.f2050to = c12025x62.m56895kk();
        }

        /* JADX INFO: renamed from: x1 */
        private boolean m1227x1(C0332x1 c0332x1) {
            return c0332x1.f2048k4 == this.f2048k4 && c0332x1.f2051x1 == this.f2051x1 && c0332x1.f2049kk == this.f2049kk && c0332x1.f2050to == this.f2050to;
        }

        /* JADX INFO: renamed from: k4 */
        public final C0332x1 m1236k4(C11913yj c11913yj) {
            C12025x6[] c12025x6Arr = {m1234jd(), m1229ck()};
            c11913yj.m55775k4(c12025x6Arr);
            return new C0332x1(c12025x6Arr[0].Clone(), c12025x6Arr[1].Clone());
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public void CloneTo(C0332x1 c0332x1) {
            c0332x1.f2048k4 = this.f2048k4;
            c0332x1.f2051x1 = this.f2051x1;
            c0332x1.f2049kk = this.f2049kk;
            c0332x1.f2050to = this.f2050to;
        }
    }

    public Connector(InterfaceC14397rj interfaceC14397rj) {
        super(interfaceC14397rj, new C1127g0(), new ConnectorLock());
        this.f2041x1 = new Shape.AbstractC0612k4() { // from class: com.aspose.slides.Connector.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Connector.OnStartConnectedShapeRemoved(Aspose.Slides.Shape)";
            }

            @Override // com.aspose.slides.Shape.AbstractC0612k4
            /* JADX INFO: renamed from: k4 */
            public void mo1223k4(Shape shape) {
                Connector.this.m1209to(shape);
            }
        };
        this.f2034kk = new Shape.AbstractC0612k4() { // from class: com.aspose.slides.Connector.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return "Aspose.Slides.Connector.OnEndConnectedShapeRemoved(Aspose.Slides.Shape)";
            }

            @Override // com.aspose.slides.Shape.AbstractC0612k4
            /* JADX INFO: renamed from: k4 */
            public void mo1223k4(Shape shape) {
                Connector.this.m1196du(shape);
            }
        };
        this.f2039to = null;
        this.f2032h4 = null;
        this.f2035ks = C12025x6.f40591k4.Clone();
        this.f2038rv = C12025x6.f40591k4.Clone();
        this.f2033ix = -1;
        this.f2040u4 = -1;
        m2560k4(new C0833bw(this));
    }

    /* JADX INFO: renamed from: ar */
    private boolean m1194ar() {
        return getShapeType() >= 101 && getShapeType() <= 104;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x018a  */
    /* JADX INFO: renamed from: ck */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m1195ck() {
        float fM1242to;
        C12025x6 c12025x6M1229ck;
        C12025x6 c12025x6;
        float[] fArr;
        int i;
        Shape shape = this.f2039to;
        if ((shape != null ? shape.mo275c5() : 0L) == this.f2042x6) {
            Shape shape2 = this.f2032h4;
            if ((shape2 != null ? shape2.mo275c5() : 0L) == this.f2037ne && (this.f2036m9 & 4294967295L) == this.f2033ix && (this.f2043yj & 4294967295L) == this.f2040u4) {
                return;
            }
        }
        m1210up();
        boolean[] zArr = {false};
        boolean[] zArr2 = {false};
        C0332x1 c0332x1Clone = m1199k4(zArr, zArr2).Clone();
        boolean z = zArr[0];
        boolean z2 = zArr2[0];
        if (C12025x6.m56888x1(c0332x1Clone.m1234jd(), this.f2035ks) || C12025x6.m56888x1(c0332x1Clone.m1229ck(), this.f2038rv)) {
            float fM1238kk = 0.0f;
            if (z && z2) {
                if (m1211wl()) {
                    m1203k4(c0332x1Clone.Clone());
                } else {
                    float[] fArrM5627c5 = this.f2039to.m2546bz().m5627c5();
                    float[] fArrM5627c52 = this.f2032h4.m2546bz().m5627c5();
                    if (fArrM5627c5 != null && fArrM5627c5.length > (this.f2036m9 & 4294967295L) && fArrM5627c52 != null && fArrM5627c52.length > (4294967295L & this.f2043yj)) {
                        float rotation = this.f2039to.m2593xk().getRotation() % 360.0f;
                        if (rotation < 0.0f) {
                            rotation += 360.0f;
                        }
                        if (rotation >= 45.0f) {
                            if (rotation < 135.0f) {
                                fArr = fArrM5627c52;
                                i = 90;
                            } else if (rotation < 225.0f) {
                                fArr = fArrM5627c52;
                                i = 180;
                            } else if (rotation < 315.0f) {
                                fArr = fArrM5627c52;
                                i = 270;
                            } else {
                                i = 0;
                                fArr = fArrM5627c52;
                            }
                            float f = fArrM5627c5[(int) this.f2036m9] + i;
                            float rotation2 = this.f2032h4.m2593xk().getRotation() % 360.0f;
                            if (rotation2 < 0.0f) {
                                rotation2 += 360.0f;
                            }
                            if (rotation2 >= 45.0f) {
                                int i2 = rotation2 < 135.0f ? 90 : rotation2 < 225.0f ? 180 : rotation2 < 315.0f ? 270 : 0;
                                m1204k4(c0332x1Clone.Clone(), f, fArr[(int) this.f2043yj] + i2);
                            }
                        }
                    }
                }
            } else if (z || z2) {
                if (z) {
                    fM1238kk = c0332x1Clone.m1235k4() - this.f2035ks.m56897x1();
                    fM1242to = c0332x1Clone.m1244x1() - this.f2035ks.m56895kk();
                    c12025x6M1229ck = c0332x1Clone.m1234jd();
                    c12025x6 = this.f2035ks;
                } else if (z2) {
                    fM1238kk = c0332x1Clone.m1238kk() - this.f2038rv.m56897x1();
                    fM1242to = c0332x1Clone.m1242to() - this.f2038rv.m56895kk();
                    c12025x6M1229ck = c0332x1Clone.m1229ck();
                    c12025x6 = this.f2038rv;
                } else {
                    fM1242to = 0.0f;
                    if (C14116yg.m67480k4(fM1238kk) <= 1.0E-4d || C14116yg.m67480k4(fM1242to) > 1.0E-4d) {
                        ShapeFrame shapeFrameM2593xk = m2593xk();
                        m2559k4(new ShapeFrame(shapeFrameM2593xk.getX() + fM1238kk, shapeFrameM2593xk.getY() + fM1242to, shapeFrameM2593xk.getWidth(), shapeFrameM2593xk.getHeight(), shapeFrameM2593xk.getFlipH(), shapeFrameM2593xk.getFlipV(), shapeFrameM2593xk.getRotation()));
                    }
                }
                c12025x6M1229ck.CloneTo(c12025x6);
                if (C14116yg.m67480k4(fM1238kk) <= 1.0E-4d) {
                    ShapeFrame shapeFrameM2593xk2 = m2593xk();
                    m2559k4(new ShapeFrame(shapeFrameM2593xk2.getX() + fM1238kk, shapeFrameM2593xk2.getY() + fM1242to, shapeFrameM2593xk2.getWidth(), shapeFrameM2593xk2.getHeight(), shapeFrameM2593xk2.getFlipH(), shapeFrameM2593xk2.getFlipV(), shapeFrameM2593xk2.getRotation()));
                }
            }
            m1220kk();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static double m1197k4(C12025x6 c12025x6, C12025x6 c12025x62) {
        double dM56897x1 = c12025x62.m56897x1() - c12025x6.m56897x1();
        double dM56895kk = c12025x62.m56895kk() - c12025x6.m56895kk();
        return C14116yg.m67496rv((dM56895kk * dM56895kk) + (dM56897x1 * dM56897x1));
    }

    /* JADX INFO: renamed from: kk */
    private C0331k4 m1206kk(C12007ix c12007ix, C12007ix c12007ix2, C0332x1 c0332x1) {
        C0331k4 c0331k4 = new C0331k4();
        double dM1245yj = c0332x1.m1245yj();
        double dM1239ks = c0332x1.m1239ks();
        if (c12007ix.m56556h4() < c12007ix2.m56571to() || (c12007ix.m56556h4() < c0332x1.m1238kk() && c0332x1.m1244x1() > c0332x1.m1242to())) {
            if (c0332x1.m1244x1() > c0332x1.m1242to()) {
                m1202k4(0);
                c0331k4.f2047x1 = true;
                return c0331k4;
            }
            m1202k4(2);
            getAdjustments().get_Item(0).setRawValue(C22199OooO0Oo.OooO00o(((c0332x1.m1240m9() - (c0332x1.m1238kk() - c12007ix2.m56571to())) - (c12007ix.m56556h4() - c0332x1.m1235k4())) / 2.0f, dM1245yj, 14));
            getAdjustments().get_Item(1).setRawValue(C7019kk.m27438h4(Double.valueOf((dM1239ks * 18.0d) + 100000.0d), 14));
            return c0331k4;
        }
        if (c12007ix2.m56558k4() < c12007ix.m56554dy()) {
            long jOooO00o = C22199OooO0Oo.OooO00o((c12007ix.m56554dy() - c0332x1.m1242to()) / 2.0f, dM1239ks, 14);
            long jOooO00o2 = C22199OooO0Oo.OooO00o(dM1245yj, 18.0d, 14);
            m1202k4(2);
            c0331k4.f2047x1 = true;
            if (c0332x1.m1235k4() <= c0332x1.m1238kk()) {
                getAdjustments().get_Item(0).setRawValue(jOooO00o2);
                getAdjustments().get_Item(1).setRawValue(100000 - jOooO00o);
                return c0331k4;
            }
            getAdjustments().get_Item(0).setRawValue(-jOooO00o2);
            getAdjustments().get_Item(1).setRawValue(100000 - jOooO00o);
            c0331k4.f2046k4 = true;
            return c0331k4;
        }
        m1202k4(2);
        long jOooO00o3 = C22199OooO0Oo.OooO00o((C14116yg.m67481k4(c12007ix.m56558k4(), c12007ix2.m56558k4()) - c0332x1.m1244x1()) + 18.0f, dM1239ks, 14);
        long jOooO00o4 = C22199OooO0Oo.OooO00o((C14116yg.m67481k4(c12007ix.m56556h4(), c12007ix2.m56556h4()) - C14116yg.m67481k4(c0332x1.m1238kk(), c0332x1.m1235k4())) + 18.0f, dM1245yj, 14);
        if (c0332x1.m1235k4() < c0332x1.m1238kk()) {
            getAdjustments().get_Item(0).setRawValue(jOooO00o4 + 100000);
        } else {
            getAdjustments().get_Item(0).setRawValue(-jOooO00o4);
            c0331k4.f2046k4 = true;
        }
        if (c0332x1.m1244x1() <= c0332x1.m1242to()) {
            getAdjustments().get_Item(1).setRawValue(jOooO00o3);
            return c0331k4;
        }
        getAdjustments().get_Item(1).setRawValue(-jOooO00o3);
        c0331k4.f2047x1 = true;
        return c0331k4;
    }

    /* JADX INFO: renamed from: qq */
    private boolean m1207qq() {
        return getShapeType() >= 97 && getShapeType() <= 100;
    }

    /* JADX INFO: renamed from: to */
    private C0331k4 m1208to(C12007ix c12007ix, C12007ix c12007ix2, C0332x1 c0332x1) {
        C0331k4 c0331k4 = new C0331k4();
        double dM1245yj = c0332x1.m1245yj();
        double dM1239ks = c0332x1.m1239ks();
        if (c12007ix.m56556h4() < c12007ix2.m56571to() || (c12007ix.m56556h4() < c0332x1.m1238kk() && c0332x1.m1244x1() < c0332x1.m1242to())) {
            if (c0332x1.m1244x1() < c0332x1.m1242to()) {
                m1202k4(0);
                return c0331k4;
            }
            c0331k4.f2047x1 = true;
            m1202k4(2);
            getAdjustments().get_Item(0).setRawValue(C22199OooO0Oo.OooO00o(((c0332x1.m1240m9() - (c0332x1.m1238kk() - c12007ix2.m56571to())) - (c12007ix.m56556h4() - c0332x1.m1235k4())) / 2.0f, dM1245yj, 14));
            getAdjustments().get_Item(1).setRawValue(C7019kk.m27438h4(Double.valueOf((((double) (((c0332x1.m1244x1() - C14116yg.m67504x1(c12007ix.m56554dy(), c0332x1.m1242to())) - c0332x1.m1231dy()) + 18.0f)) * dM1239ks) + 100000.0d), 14));
            return c0331k4;
        }
        if (c12007ix2.m56554dy() > c12007ix.m56558k4()) {
            long jOooO00o = C22199OooO0Oo.OooO00o((c12007ix2.m56554dy() - c12007ix.m56558k4()) / 2.0f, dM1239ks, 14);
            long jOooO00o2 = C22199OooO0Oo.OooO00o(dM1245yj, 18.0d, 14);
            m1202k4(2);
            if (c0332x1.m1235k4() <= c0332x1.m1238kk()) {
                getAdjustments().get_Item(0).setRawValue(jOooO00o2);
                getAdjustments().get_Item(1).setRawValue(100000 - jOooO00o);
                return c0331k4;
            }
            getAdjustments().get_Item(0).setRawValue(-jOooO00o2);
            getAdjustments().get_Item(1).setRawValue(100000 - jOooO00o);
            c0331k4.f2046k4 = true;
            return c0331k4;
        }
        m1202k4(2);
        long jM27438h4 = C7019kk.m27438h4(Double.valueOf((((double) (((c0332x1.m1244x1() - C14116yg.m67504x1(c12007ix.m56554dy(), c0332x1.m1242to())) - c0332x1.m1231dy()) + 18.0f)) * dM1239ks) + 100000.0d), 14);
        long jOooO00o3 = C22199OooO0Oo.OooO00o((C14116yg.m67481k4(c12007ix.m56556h4(), c12007ix2.m56556h4()) - C14116yg.m67481k4(c0332x1.m1238kk(), c0332x1.m1235k4())) + 18.0f, dM1245yj, 14);
        if (c0332x1.m1235k4() < c0332x1.m1238kk()) {
            getAdjustments().get_Item(0).setRawValue(jOooO00o3 + 100000);
        } else {
            getAdjustments().get_Item(0).setRawValue(-jOooO00o3);
            c0331k4.f2046k4 = true;
        }
        if (c0332x1.m1244x1() <= c0332x1.m1242to()) {
            getAdjustments().get_Item(1).setRawValue(-jM27438h4);
            return c0331k4;
        }
        getAdjustments().get_Item(1).setRawValue(jM27438h4);
        c0331k4.f2047x1 = true;
        return c0331k4;
    }

    /* JADX INFO: renamed from: up */
    private void m1210up() {
        Shape shape = this.f2039to;
        this.f2042x6 = shape != null ? shape.mo275c5() : 0L;
        Shape shape2 = this.f2032h4;
        this.f2037ne = shape2 != null ? shape2.mo275c5() : 0L;
        this.f2033ix = (int) this.f2036m9;
        this.f2040u4 = (int) this.f2043yj;
    }

    /* JADX INFO: renamed from: wl */
    private boolean m1211wl() {
        return getShapeType() == 1 || getShapeType() == 96;
    }

    /* JADX INFO: renamed from: x1 */
    private C0331k4 m1212x1(C12007ix c12007ix, C12007ix c12007ix2, C0332x1 c0332x1) {
        IAdjustValue iAdjustValue;
        long jOooO00o;
        IAdjustValue iAdjustValue2;
        C0331k4 c0331k4 = new C0331k4();
        double dM1245yj = c0332x1.m1245yj();
        double dM1239ks = c0332x1.m1239ks();
        long jOooO00o2 = C22199OooO0Oo.OooO00o((C14116yg.m67481k4(c12007ix.m56556h4(), c12007ix2.m56556h4()) - C14116yg.m67481k4(c0332x1.m1238kk(), c0332x1.m1235k4())) + 18.0f, dM1245yj, 14);
        if (c12007ix.m56556h4() < c12007ix2.m56571to()) {
            if (c0332x1.m1244x1() > c0332x1.m1242to()) {
                c0331k4.f2047x1 = true;
                if (c0332x1.m1244x1() <= c12007ix2.m56558k4()) {
                    m1202k4(3);
                    getAdjustments().get_Item(0).setRawValue(C22199OooO0Oo.OooO00o(((c0332x1.m1240m9() - c12007ix2.m56550c5()) - (c12007ix.m56556h4() - c0332x1.m1235k4())) / 2.0f, dM1245yj, 14));
                    iAdjustValue = getAdjustments().get_Item(1);
                    jOooO00o = C7019kk.m27438h4(Double.valueOf((((double) ((c0332x1.m1242to() - c12007ix2.m56554dy()) + 18.0f)) * dM1239ks) + 100000.0d), 14);
                    iAdjustValue.setRawValue(jOooO00o);
                    iAdjustValue2 = getAdjustments().get_Item(2);
                }
                m1202k4(1);
                iAdjustValue2 = getAdjustments().get_Item(0);
            } else {
                if (c0332x1.m1231dy() < 1.0f) {
                    c0331k4.f2047x1 = true;
                }
                if (c0332x1.m1244x1() >= c12007ix2.m56554dy()) {
                    m1202k4(3);
                    getAdjustments().get_Item(0).setRawValue(C22199OooO0Oo.OooO00o(((c0332x1.m1240m9() - c12007ix2.m56550c5()) - (c12007ix.m56556h4() - c0332x1.m1235k4())) / 2.0f, dM1245yj, 14));
                    iAdjustValue = getAdjustments().get_Item(1);
                    jOooO00o = C22199OooO0Oo.OooO00o((c12007ix2.m56554dy() - c0332x1.m1244x1()) - 18.0f, dM1239ks, 14);
                    iAdjustValue.setRawValue(jOooO00o);
                    iAdjustValue2 = getAdjustments().get_Item(2);
                }
                m1202k4(1);
                iAdjustValue2 = getAdjustments().get_Item(0);
            }
            iAdjustValue2.setRawValue(C7019kk.m27438h4(Double.valueOf((dM1245yj * 18.0d) + 100000.0d), 14));
            return c0331k4;
        }
        if (c12007ix.m56571to() <= c12007ix2.m56556h4()) {
            m1202k4(1);
            if (c0332x1.m1235k4() < c0332x1.m1238kk()) {
                getAdjustments().get_Item(0).setRawValue(jOooO00o2 + 100000);
            } else {
                getAdjustments().get_Item(0).setRawValue(-jOooO00o2);
                c0331k4.f2046k4 = true;
            }
            if (c0332x1.m1244x1() > c0332x1.m1242to()) {
                c0331k4.f2047x1 = true;
                return c0331k4;
            }
        } else {
            if (c0332x1.m1242to() >= c12007ix.m56554dy() && c0332x1.m1242to() <= c12007ix.m56558k4()) {
                m1202k4(3);
                long jOooO00o3 = C22199OooO0Oo.OooO00o((c12007ix.m56558k4() - c0332x1.m1244x1()) + 18.0f, dM1239ks, 14);
                getAdjustments().get_Item(0).setRawValue(-jOooO00o2);
                getAdjustments().get_Item(2).setRawValue(C7019kk.m27438h4(Double.valueOf(100000.0d - (((double) ((c0332x1.m1240m9() - c12007ix.m56550c5()) / 2.0f)) * dM1245yj)), 14));
                if (c0332x1.m1244x1() <= c0332x1.m1242to()) {
                    getAdjustments().get_Item(1).setRawValue(jOooO00o3);
                    if (c0332x1.m1231dy() < 1.0f) {
                    }
                    c0331k4.f2046k4 = true;
                    return c0331k4;
                }
                getAdjustments().get_Item(1).setRawValue(-jOooO00o3);
                c0331k4.f2047x1 = true;
                c0331k4.f2046k4 = true;
                return c0331k4;
            }
            m1202k4(1);
            getAdjustments().get_Item(0).setRawValue(-jOooO00o2);
            c0331k4.f2046k4 = true;
            if (c0332x1.m1242to() < c12007ix.m56554dy()) {
                c0331k4.f2047x1 = true;
            }
        }
        return c0331k4;
    }

    @Override // com.aspose.slides.Shape
    /* JADX INFO: renamed from: P_ */
    public nd1 mo1214P_() {
        m1195ck();
        return super.mo1214P_();
    }

    @Override // com.aspose.slides.GeometryShape, com.aspose.slides.Shape
    /* JADX INFO: renamed from: R_ */
    public C12025x6[] mo1215R_() {
        return null;
    }

    @Override // com.aspose.slides.GeometryShape, com.aspose.slides.Shape
    /* JADX INFO: renamed from: S_ */
    public float[] mo1216S_() {
        return null;
    }

    @Override // com.aspose.slides.IConnector
    public final IConnectorLock getConnectorLock() {
        return (IConnectorLock) super.getShapeLock();
    }

    @Override // com.aspose.slides.IConnector
    public final IShape getEndShapeConnectedTo() {
        return this.f2032h4;
    }

    @Override // com.aspose.slides.IConnector
    public final long getEndShapeConnectionSiteIndex() {
        return this.f2043yj;
    }

    @Override // com.aspose.slides.GeometryShape, com.aspose.slides.IGeometryShape
    public int getShapeType() {
        return super.getShapeType();
    }

    @Override // com.aspose.slides.IConnector
    public final IShape getStartShapeConnectedTo() {
        return this.f2039to;
    }

    @Override // com.aspose.slides.IConnector
    public final long getStartShapeConnectionSiteIndex() {
        return this.f2036m9;
    }

    @Override // com.aspose.slides.IConnector
    public final void reroute() {
        Shape shape;
        C12025x6[] c12025x6Arr;
        C12025x6[] c12025x6Arr2;
        if (this.f2032h4 == null || (shape = this.f2039to) == null) {
            return;
        }
        C12025x6[] c12025x6ArrM5630dy = shape.m2546bz().m5630dy();
        C12025x6[] c12025x6ArrM5630dy2 = this.f2032h4.m2546bz().m5630dy();
        double d = Double.MAX_VALUE;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        while ((j & 4294967295L) < c12025x6ArrM5630dy.length) {
            C12025x6 c12025x6Clone = c12025x6ArrM5630dy[(int) j].Clone();
            long j4 = 0;
            while (true) {
                c12025x6Arr = c12025x6ArrM5630dy;
                c12025x6Arr2 = c12025x6ArrM5630dy2;
                if ((j4 & 4294967295L) < c12025x6ArrM5630dy2.length) {
                    double dM1197k4 = m1197k4(c12025x6Clone.Clone(), c12025x6Arr2[(int) j4].Clone().Clone());
                    if (dM1197k4 < d) {
                        d = dM1197k4;
                        j2 = j;
                        j3 = j4;
                    }
                    j4++;
                    c12025x6ArrM5630dy = c12025x6Arr;
                    c12025x6ArrM5630dy2 = c12025x6Arr2;
                }
            }
            j++;
            c12025x6ArrM5630dy = c12025x6Arr;
            c12025x6ArrM5630dy2 = c12025x6Arr2;
        }
        this.f2036m9 = j2;
        this.f2043yj = j3;
        m1195ck();
    }

    @Override // com.aspose.slides.IConnector
    public final void setEndShapeConnectedTo(IShape iShape) {
        if (m1222x1(iShape)) {
            m1195ck();
        }
    }

    @Override // com.aspose.slides.IConnector
    public final void setEndShapeConnectionSiteIndex(long j) {
        if (m1221x1(j)) {
            m1195ck();
        }
    }

    @Override // com.aspose.slides.GeometryShape, com.aspose.slides.IGeometryShape
    public void setShapeType(int i) {
        if (!f2031k4.containsKey(Integer.valueOf(i))) {
            throw new PptxEditException(C14113y2.m67408k4("Incorrect ShapeType value for Connector specified: ", C14042ak.m66410k4(ShapeType.class, i)));
        }
        super.setShapeType(i);
        m1195ck();
    }

    @Override // com.aspose.slides.IConnector
    public final void setStartShapeConnectedTo(IShape iShape) {
        if (m1219k4(iShape)) {
            m1195ck();
        }
    }

    @Override // com.aspose.slides.IConnector
    public final void setStartShapeConnectionSiteIndex(long j) {
        if (m1218k4(j)) {
            m1195ck();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: du */
    public void m1196du(Shape shape) {
        this.f2032h4 = null;
        this.f2043yj = 0L;
        C12025x6.f40591k4.CloneTo(this.f2038rv);
        this.f2037ne = 0L;
    }

    /* JADX INFO: renamed from: k4 */
    private C0331k4 m1198k4(C12007ix c12007ix, C12007ix c12007ix2, C0332x1 c0332x1) {
        C0331k4 c0331k4 = new C0331k4();
        if (c12007ix.m56556h4() < c12007ix2.m56571to()) {
            if (c0332x1.m1244x1() > c0332x1.m1242to()) {
                c0331k4.f2047x1 = true;
            } else {
                c0331k4.f2047x1 = false;
            }
            m1202k4(1);
            getAdjustments().get_Item(0).setRawValue(50000L);
            return c0331k4;
        }
        double dM1245yj = c0332x1.m1245yj();
        double dM1239ks = c0332x1.m1239ks();
        m1202k4(3);
        if (c0332x1.m1235k4() > c0332x1.m1238kk()) {
            getAdjustments().get_Item(0).setRawValue(C22199OooO0Oo.OooO00o(-dM1245yj, 18.0d, 14));
            getAdjustments().get_Item(2).setRawValue(C7019kk.m27438h4(Double.valueOf((dM1245yj * 18.0d) + 100000.0d), 14));
            c0331k4.f2046k4 = true;
        } else {
            long jOooO00o = C22199OooO0Oo.OooO00o((36.0f - c0332x1.m1240m9()) / 2.0f, dM1245yj, 14);
            getAdjustments().get_Item(0).setRawValue(jOooO00o + 50000);
            getAdjustments().get_Item(2).setRawValue(50000 - jOooO00o);
        }
        if (c12007ix.m56554dy() > c12007ix2.m56558k4()) {
            getAdjustments().get_Item(1).setRawValue(C22199OooO0Oo.OooO00o(dM1239ks, ((c12007ix.m56554dy() - c12007ix2.m56558k4()) / 2.0f) + (c0332x1.m1244x1() - c12007ix.m56554dy()), 14));
            c0331k4.f2047x1 = true;
            return c0331k4;
        }
        if (c12007ix2.m56554dy() > c12007ix.m56558k4()) {
            getAdjustments().get_Item(1).setRawValue(C22199OooO0Oo.OooO00o(dM1239ks, ((c12007ix2.m56554dy() - c12007ix.m56558k4()) / 2.0f) + (c12007ix.m56558k4() - c0332x1.m1244x1()), 14));
            return c0331k4;
        }
        if (c0332x1.m1244x1() <= c0332x1.m1242to()) {
            getAdjustments().get_Item(1).setRawValue(C22199OooO0Oo.OooO00o(dM1239ks, (C14116yg.m67481k4(c12007ix.m56558k4(), c12007ix2.m56558k4()) - c0332x1.m1244x1()) + 18.0f, 14));
            return c0331k4;
        }
        getAdjustments().get_Item(1).setRawValue(C22199OooO0Oo.OooO00o(dM1239ks, (c0332x1.m1244x1() - C14116yg.m67504x1(c12007ix.m56554dy(), c12007ix2.m56554dy())) + 18.0f, 14));
        c0331k4.f2047x1 = true;
        return c0331k4;
    }

    @Override // com.aspose.slides.Shape, com.aspose.slides.IShape
    public final IConnectorLock getShapeLock() {
        return (IConnectorLock) super.getShapeLock();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: to */
    public void m1209to(Shape shape) {
        this.f2039to = null;
        this.f2036m9 = 0L;
        C12025x6.f40591k4.CloneTo(this.f2035ks);
        this.f2042x6 = 0L;
    }

    /* JADX INFO: renamed from: kk */
    public final void m1220kk() {
        m1201k4(this.f2039to, this.f2036m9).CloneTo(this.f2035ks);
        m1201k4(this.f2032h4, this.f2043yj).CloneTo(this.f2038rv);
        m1210up();
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m1221x1(long j) {
        long j2 = 4294967295L & j;
        if ((this.f2043yj & 4294967295L) == j2) {
            return false;
        }
        if (this.f2032h4 != null && r0.getConnectionSiteCount() <= j2) {
            throw new ArgumentException("Index of connection site must be less than EndShapeConnectedTo.ConnectionSiteCount");
        }
        this.f2043yj = j;
        return true;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m1222x1(IShape iShape) {
        if (iShape == this.f2032h4) {
            return false;
        }
        if (iShape != null && iShape.getConnectionSiteCount() == 0) {
            throw new ArgumentException("Connected shape doesn't has any connection sites (IShape.ConnectionSiteCount equals zero)");
        }
        Shape shape = this.f2032h4;
        if (shape != null) {
            shape.f3319up.mo27429k4(this.f2034kk);
        }
        Shape shape2 = (Shape) iShape;
        this.f2032h4 = shape2;
        if (iShape == null) {
            return true;
        }
        shape2.f3319up.mo27432x1(this.f2034kk);
        if ((this.f2043yj & 4294967295L) < iShape.getConnectionSiteCount()) {
            return true;
        }
        this.f2043yj = 0L;
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    private C0332x1 m1199k4(boolean[] zArr, boolean[] zArr2) {
        C12025x6 c12025x6Clone = m1201k4(this.f2039to, this.f2036m9).Clone();
        C12025x6 c12025x6Clone2 = m1201k4(this.f2032h4, this.f2043yj).Clone();
        zArr[0] = C12025x6.m56888x1(c12025x6Clone, C12025x6.f40591k4);
        zArr2[0] = C12025x6.m56888x1(c12025x6Clone2, C12025x6.f40591k4);
        return new C0332x1(c12025x6Clone.Clone(), c12025x6Clone2.Clone());
    }

    @Override // com.aspose.slides.GeometryShape
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C1127g0 mo272to() {
        return (C1127g0) super.mo272to();
    }

    /* JADX INFO: renamed from: k4 */
    private static C12007ix m1200k4(C11913yj c11913yj, Shape shape) {
        C12007ix c12007ixClone = shape.m2593xk().m2660k4().Clone();
        float fM56571to = c12007ixClone.m56571to();
        float fM56554dy = c12007ixClone.m56554dy();
        float fM56556h4 = c12007ixClone.m56556h4();
        float fM56558k4 = c12007ixClone.m56558k4();
        C12025x6[] c12025x6Arr = {new C12025x6(fM56571to, fM56554dy), new C12025x6(fM56556h4, fM56554dy), new C12025x6(fM56571to, fM56558k4), new C12025x6(fM56556h4, fM56558k4)};
        c11913yj.m55775k4(c12025x6Arr);
        float fM56897x1 = c12025x6Arr[0].m56897x1();
        float fM56895kk = c12025x6Arr[0].m56895kk();
        float fM56897x12 = fM56897x1;
        float fM56895kk2 = fM56895kk;
        float fM56897x13 = fM56897x12;
        for (int i = 1; i < 4; i++) {
            C12025x6 c12025x6Clone = c12025x6Arr[i].Clone();
            if (fM56897x13 > c12025x6Clone.m56897x1()) {
                fM56897x13 = c12025x6Clone.m56897x1();
            }
            if (fM56897x12 < c12025x6Clone.m56897x1()) {
                fM56897x12 = c12025x6Clone.m56897x1();
            }
            if (fM56895kk > c12025x6Clone.m56895kk()) {
                fM56895kk = c12025x6Clone.m56895kk();
            }
            if (fM56895kk2 < c12025x6Clone.m56895kk()) {
                fM56895kk2 = c12025x6Clone.m56895kk();
            }
        }
        return new C12007ix((float) C14116yg.m67477k4(fM56897x13, 3), (float) C14116yg.m67477k4(fM56895kk, 3), (float) C14116yg.m67477k4(fM56897x12 - fM56897x13, 3), (float) C14116yg.m67477k4(fM56895kk2 - fM56895kk, 3));
    }

    /* JADX INFO: renamed from: k4 */
    private static C12025x6 m1201k4(Shape shape, long j) {
        C12025x6[] c12025x6ArrM5630dy;
        C12025x6 c12025x6Clone = C12025x6.f40591k4.Clone();
        if (shape != null && (c12025x6ArrM5630dy = shape.m2546bz().m5630dy()) != null && c12025x6ArrM5630dy.length > (4294967295L & j)) {
            c12025x6ArrM5630dy[(int) j].CloneTo(c12025x6Clone);
        }
        return c12025x6Clone;
    }

    /* JADX INFO: renamed from: k4 */
    private void m1202k4(int i) {
        int i2;
        if (m1194ar()) {
            i2 = i + 101;
        } else if (!m1207qq()) {
            return;
        } else {
            i2 = i + 97;
        }
        setShapeType(i2);
    }

    /* JADX INFO: renamed from: k4 */
    private void m1203k4(C0332x1 c0332x1) {
        m2559k4(new ShapeFrame(c0332x1.m1230du(), c0332x1.m1233h4(), c0332x1.m1240m9(), c0332x1.m1231dy(), c0332x1.m1235k4() > c0332x1.m1238kk() ? (byte) 1 : (byte) 0, c0332x1.m1244x1() > c0332x1.m1242to() ? (byte) 1 : (byte) 0, 0.0f));
    }

    /* JADX INFO: renamed from: k4 */
    private void m1204k4(C0332x1 c0332x1, float f, float f2) {
        float f3 = f2 - f;
        if (f3 < -180.0f) {
            f3 += 360.0f;
        }
        if (f3 > 180.0f) {
            f3 -= 360.0f;
        }
        C11913yj c11913yj = new C11913yj();
        c11913yj.m55766k4(-f, c0332x1.m1228c5().Clone());
        C0332x1 c0332x1Clone = c0332x1.m1236k4(c11913yj).Clone();
        C12007ix c12007ixClone = m1200k4(c11913yj, this.f2039to).Clone();
        C12007ix c12007ixClone2 = m1200k4(c11913yj, this.f2032h4).Clone();
        C0331k4 c0331k4 = new C0331k4();
        (C14116yg.m67480k4(f3) == 180.0f ? m1198k4(c12007ixClone.Clone(), c12007ixClone2.Clone(), c0332x1Clone.Clone()) : C14116yg.m67480k4(f3) == 0.0f ? m1212x1(c12007ixClone.Clone(), c12007ixClone2.Clone(), c0332x1Clone.Clone()) : f3 == 90.0f ? m1206kk(c12007ixClone.Clone(), c12007ixClone2.Clone(), c0332x1Clone.Clone()) : m1208to(c12007ixClone.Clone(), c12007ixClone2.Clone(), c0332x1Clone.Clone())).CloneTo(c0331k4);
        m2559k4(new ShapeFrame(c0332x1Clone.m1230du(), c0332x1Clone.m1233h4(), c0332x1Clone.m1232fa(), c0332x1Clone.m1243up(), c0331k4.f2046k4 ? (byte) 1 : (byte) 0, c0331k4.f2047x1 ? (byte) 1 : (byte) 0, f));
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m1218k4(long j) {
        long j2 = 4294967295L & j;
        if ((this.f2036m9 & 4294967295L) == j2) {
            return false;
        }
        if (this.f2039to != null && r0.getConnectionSiteCount() <= j2) {
            throw new ArgumentException("Index of connection site must be less than StartShapeConnectedTo.ConnectionSiteCount");
        }
        this.f2036m9 = j;
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m1219k4(IShape iShape) {
        if (iShape == this.f2039to) {
            return false;
        }
        if (iShape != null && iShape.getConnectionSiteCount() == 0) {
            throw new ArgumentException("Connected shape doesn't has any connection sites (IShape.ConnectionSiteCount equals zero)");
        }
        Shape shape = this.f2039to;
        if (shape != null) {
            shape.f3319up.mo27429k4(this.f2041x1);
            this.f2036m9 = 0L;
        }
        Shape shape2 = (Shape) iShape;
        this.f2039to = shape2;
        if (iShape == null) {
            return true;
        }
        shape2.f3319up.mo27432x1(this.f2041x1);
        if ((this.f2036m9 & 4294967295L) < iShape.getConnectionSiteCount()) {
            return true;
        }
        this.f2036m9 = 0L;
        return true;
    }
}
