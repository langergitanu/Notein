package com.aspose.slides.internal.p060ca;

import androidx.appcompat.widget.C21532OooOOo;
import com.aspose.slides.OooO;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14106wy;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.google.android.play.core.integrity.model.IntegrityErrorCode;
import com.google.android.play.core.integrity.model.StandardIntegrityErrorCode;
import com.huawei.hms.network.embedded.C18250l0;
import com.orion.notein.domain.models.backup.BackupEvent;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.ar */
/* JADX INFO: loaded from: classes3.dex */
public class C2003ar {

    /* JADX INFO: renamed from: du */
    private C2103gv f6976du;

    /* JADX INFO: renamed from: h4 */
    private C2377xv f6977h4;

    /* JADX INFO: renamed from: k4 */
    public C2333v4 f6978k4;

    /* JADX INFO: renamed from: kk */
    private int f6979kk;

    /* JADX INFO: renamed from: to */
    private C2068ei f6980to;

    /* JADX INFO: renamed from: x1 */
    private C2323um f6981x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.ca.ar$k4 */
    public static final class k4 extends AbstractC14106wy {
        static {
            AbstractC14106wy.register(new AbstractC14106wy.du(k4.class, Byte.class) { // from class: com.aspose.slides.internal.ca.ar.k4.1
                {
                    addConstant("SVTCA0", 0L);
                    addConstant("SVTCA1", 1L);
                    addConstant("SPVTL_0", 6L);
                    addConstant("SPVTL_1", 7L);
                    addConstant("SPVFS", 10L);
                    addConstant("GPV", 12L);
                    addConstant("SFVTPV", 14L);
                    addConstant("SRP0", 16L);
                    addConstant("SRP1", 17L);
                    addConstant("SRP2", 18L);
                    addConstant("RTG", 24L);
                    addConstant("ELSE", 27L);
                    addConstant("SCVTCI", 29L);
                    addConstant("IDEF", -119L);
                    addConstant("DUP", 32L);
                    addConstant("POP", 33L);
                    addConstant("SWAP", 35L);
                    addConstant("CINDEX", 37L);
                    addConstant("CALL", 43L);
                    addConstant("MDAP0", 46L);
                    addConstant("MDAP1", 47L);
                    addConstant("FDEF", 44L);
                    addConstant("ENDF", 45L);
                    addConstant("IUP_0", 48L);
                    addConstant("IUP_1", 49L);
                    addConstant("IP", 57L);
                    addConstant("MSIRP_0", 58L);
                    addConstant("MSIRP_1", 59L);
                    addConstant("ALIGNRP", 60L);
                    addConstant("MIAP0", 62L);
                    addConstant("MIAP1", 63L);
                    addConstant("NPUSHB", 64L);
                    addConstant("NPUSHW", 65L);
                    addConstant("WS", 66L);
                    addConstant("RS", 67L);
                    addConstant("WCVTP", 68L);
                    addConstant("RCVT", 69L);
                    addConstant("SCFS", 72L);
                    addConstant("MD_0", 73L);
                    addConstant("MD_1", 74L);
                    addConstant("MPPEM", 75L);
                    addConstant("LT", 80L);
                    addConstant("LTEQ", 81L);
                    addConstant("GT", 82L);
                    addConstant("GTEQ", 83L);
                    addConstant("EQ", 84L);
                    addConstant("NEQ", 85L);
                    addConstant("ODD", 86L);
                    addConstant("EVEN", 87L);
                    addConstant("IF", 88L);
                    addConstant("EIF", 89L);
                    addConstant("ADD", 96L);
                    addConstant("SUB", 97L);
                    addConstant("DIV", 98L);
                    addConstant("MUL", 99L);
                    addConstant("ABS", 100L);
                    addConstant("NEG", 101L);
                    addConstant("ROUND1", 104L);
                    addConstant("ROUND2", 105L);
                    addConstant("ROUND3", 106L);
                    addConstant("ROUND4", 107L);
                    addConstant("WCVTF", 112L);
                    addConstant("SCANCTRL", -123L);
                    addConstant("ROLL", -118L);
                    addConstant("SCANTYPE", -115L);
                    addConstant("PUSHB_0", -80L);
                    addConstant("PUSHB_1", -79L);
                    addConstant("PUSHB_2", -78L);
                    addConstant("PUSHB_3", -77L);
                    addConstant("PUSHB_4", -76L);
                    addConstant("PUSHB_5", -75L);
                    addConstant("PUSHB_6", -74L);
                    addConstant("PUSHB_7", -73L);
                    addConstant("PUSHW_0", -72L);
                    addConstant("PUSHW_1", -71L);
                    addConstant("PUSHW_2", -70L);
                    addConstant("PUSHW_3", -69L);
                    addConstant("PUSHW_4", -68L);
                    addConstant("PUSHW_5", -67L);
                    addConstant("PUSHW_6", -66L);
                    addConstant("PUSHW_7", -65L);
                    addConstant("MDRP_0", -64L);
                    addConstant("MDRP_1", -63L);
                    addConstant("MDRP_2", -62L);
                    addConstant("MDRP_3", -61L);
                    addConstant("MDRP_4", -60L);
                    addConstant("MDRP_5", -59L);
                    addConstant("MDRP_6", -58L);
                    addConstant("MDRP_7", -57L);
                    addConstant("MDRP_8", -56L);
                    addConstant("MDRP_9", -55L);
                    addConstant("MDRP_10", -54L);
                    addConstant("MDRP_11", -53L);
                    addConstant("MDRP_12", -52L);
                    addConstant("MDRP_13", -51L);
                    addConstant("MDRP_14", -50L);
                    addConstant("MDRP_15", -49L);
                    addConstant("MDRP_16", -48L);
                    addConstant("MDRP_17", -47L);
                    addConstant("MDRP_18", -46L);
                    addConstant("MDRP_19", -45L);
                    addConstant("MDRP_20", -44L);
                    addConstant("MDRP_21", -43L);
                    addConstant("MDRP_22", -42L);
                    addConstant("MDRP_23", -41L);
                    addConstant("MDRP_24", -40L);
                    addConstant("MDRP_25", -39L);
                    addConstant("MDRP_26", -38L);
                    addConstant("MDRP_27", -37L);
                    addConstant("MDRP_28", -36L);
                    addConstant("MDRP_29", -35L);
                    addConstant("MDRP_30", -34L);
                    addConstant("MDRP_31", -33L);
                    addConstant("MIRP_0", -32L);
                    addConstant("MIRP_1", -31L);
                    addConstant("MIRP_2", -30L);
                    addConstant("MIRP_3", -29L);
                    addConstant("MIRP_4", -28L);
                    addConstant("MIRP_5", -27L);
                    addConstant("MIRP_6", -26L);
                    addConstant("MIRP_7", -25L);
                    addConstant("MIRP_8", -24L);
                    addConstant("MIRP_9", -23L);
                    addConstant("MIRP_10", -22L);
                    addConstant("MIRP_11", -21L);
                    addConstant("MIRP_12", -20L);
                    addConstant("MIRP_13", -19L);
                    addConstant("MIRP_14", -18L);
                    addConstant("MIRP_15", -17L);
                    addConstant("MIRP_16", -16L);
                    addConstant("MIRP_17", -15L);
                    addConstant("MIRP_18", -14L);
                    addConstant("MIRP_19", -13L);
                    addConstant("MIRP_20", -12L);
                    addConstant("MIRP_21", -11L);
                    addConstant("MIRP_22", -10L);
                    addConstant("MIRP_23", -9L);
                    addConstant("MIRP_24", -8L);
                    addConstant("MIRP_25", -7L);
                    addConstant("MIRP_26", -6L);
                    addConstant("MIRP_27", -5L);
                    addConstant("MIRP_28", -4L);
                    addConstant("MIRP_29", -3L);
                    addConstant("MIRP_30", -2L);
                    addConstant("MIRP_31", -1L);
                }
            });
        }

        private k4() {
        }
    }

    public C2003ar(C2068ei c2068ei, C2377xv c2377xv, C2333v4 c2333v4) {
        this(new C2323um(((C2216ni) c2068ei.mo10477kk()).f7665c5), c2377xv, c2333v4);
        this.f6980to = c2068ei;
    }

    /* JADX INFO: renamed from: ak */
    private void m10156ak() {
        double dM11123to = this.f6978k4.f8092m9.m11123to();
        this.f6977h4.m11705x1().m10582yj().m11252k4(C7019kk.m27462to(Double.valueOf(this.f6978k4.f8092m9.m11123to()), 14), C7019kk.m27468x1(Double.valueOf(dM11123to / 64.0d), 14));
    }

    /* JADX INFO: renamed from: ar */
    private void m10157ar() {
        this.f6978k4.f8092m9.m11121k4(-this.f6978k4.f8092m9.m11123to());
    }

    /* JADX INFO: renamed from: b3 */
    private void m10158b3() {
        this.f6978k4.f8092m9.m11123to();
    }

    /* JADX INFO: renamed from: bv */
    private void m10159bv() {
        this.f6978k4.f8092m9.m11121k4(((double) this.f6977h4.m11705x1().m10582yj().m11251k4(C7019kk.m27462to(Double.valueOf(this.f6978k4.f8092m9.m11123to()), 14))) * 64.0d);
    }

    /* JADX INFO: renamed from: bz */
    private void m10160bz() {
        C2333v4 c2333v4 = this.f6978k4;
        c2333v4.f8087ix = C7019kk.m27462to(Double.valueOf(c2333v4.f8092m9.m11123to()), 14);
    }

    /* JADX INFO: renamed from: c5 */
    private void m10161c5() {
        C2193mc c2193mc;
        double d;
        if (C7019kk.m27462to(Double.valueOf(this.f6978k4.f8092m9.m11123to()), 14) > C7019kk.m27462to(Double.valueOf(this.f6978k4.f8092m9.m11123to()), 14)) {
            c2193mc = this.f6978k4.f8092m9;
            d = 1.0d;
        } else {
            c2193mc = this.f6978k4.f8092m9;
            d = 0.0d;
        }
        c2193mc.m11121k4(d);
    }

    /* JADX INFO: renamed from: c6 */
    private void m10163c6() {
        double dM11123to = this.f6978k4.f8092m9.m11123to();
        double dM11123to2 = this.f6978k4.f8092m9.m11123to();
        double dM11123to3 = this.f6978k4.f8092m9.m11123to();
        this.f6978k4.f8092m9.m11121k4(dM11123to2);
        this.f6978k4.f8092m9.m11121k4(dM11123to);
        this.f6978k4.f8092m9.m11121k4(dM11123to3);
    }

    /* JADX INFO: renamed from: ck */
    private void m10164ck() {
        C2193mc c2193mc;
        double d;
        if (C7019kk.m27462to(Double.valueOf(this.f6978k4.f8092m9.m11123to()), 14) == C7019kk.m27462to(Double.valueOf(this.f6978k4.f8092m9.m11123to()), 14)) {
            c2193mc = this.f6978k4.f8092m9;
            d = 1.0d;
        } else {
            c2193mc = this.f6978k4.f8092m9;
            d = 0.0d;
        }
        c2193mc.m11121k4(d);
    }

    /* JADX INFO: renamed from: dq */
    private void m10166dq() {
        double dM11123to = this.f6978k4.f8092m9.m11123to();
        double dM11123to2 = this.f6978k4.f8092m9.m11123to();
        this.f6978k4.f8092m9.m11121k4(dM11123to);
        this.f6978k4.f8092m9.m11121k4(dM11123to2);
    }

    /* JADX INFO: renamed from: du */
    private void m10167du() {
        int iM27462to = C7019kk.m27462to(Double.valueOf(this.f6978k4.f8092m9.m11123to()), 14);
        this.f6978k4.f8092m9.m11121k4(((Integer) r1.f8084dy.get_Item(Integer.valueOf(iM27462to))).intValue());
    }

    /* JADX INFO: renamed from: dy */
    private void m10169dy() {
        C2193mc c2193mc;
        double d;
        if (C7019kk.m27462to(Double.valueOf(this.f6978k4.f8092m9.m11123to()), 14) <= C7019kk.m27462to(Double.valueOf(this.f6978k4.f8092m9.m11123to()), 14)) {
            c2193mc = this.f6978k4.f8092m9;
            d = 1.0d;
        } else {
            c2193mc = this.f6978k4.f8092m9;
            d = 0.0d;
        }
        c2193mc.m11121k4(d);
    }

    /* JADX INFO: renamed from: e0 */
    private void m10171e0() {
        C2333v4 c2333v4 = this.f6978k4;
        c2333v4.f8093ne = C7019kk.m27462to(Double.valueOf(c2333v4.f8092m9.m11123to()), 14);
    }

    /* JADX INFO: renamed from: f9 */
    private void m10172f9() {
        C2333v4 c2333v4 = this.f6978k4;
        c2333v4.f8092m9.m11121k4(c2333v4.f8088jd.m10725k4());
        C2333v4 c2333v42 = this.f6978k4;
        c2333v42.f8092m9.m11121k4(c2333v42.f8088jd.m10727x1());
    }

    /* JADX INFO: renamed from: fa */
    private void m10173fa() {
        C2193mc c2193mc;
        double d;
        if (C7019kk.m27462to(Double.valueOf(this.f6978k4.f8092m9.m11123to()), 14) != C7019kk.m27462to(Double.valueOf(this.f6978k4.f8092m9.m11123to()), 14)) {
            c2193mc = this.f6978k4.f8092m9;
            d = 1.0d;
        } else {
            c2193mc = this.f6978k4.f8092m9;
            d = 0.0d;
        }
        c2193mc.m11121k4(d);
    }

    /* JADX INFO: renamed from: g8 */
    private void m10175g8() {
        double dM11123to = this.f6978k4.f8092m9.m11123to();
        int iM27462to = C7019kk.m27462to(Double.valueOf(this.f6978k4.f8092m9.m11123to()), 14);
        C2333v4 c2333v4 = this.f6978k4;
        double dMo10664k4 = c2333v4.f8082ck.mo10664k4(c2333v4.f8098um.m10312k4().f7666du[iM27462to], this.f6978k4.f8098um.m10312k4().f7668h4[iM27462to]);
        C2333v4 c2333v42 = this.f6978k4;
        c2333v42.f8085fa.mo10665k4(c2333v42.f8098um.m10313x1(), iM27462to, (dM11123to / 64.0d) - dMo10664k4);
    }

    /* JADX INFO: renamed from: gi */
    private void m10176gi() {
        double dM11123to = this.f6978k4.f8092m9.m11123to();
        this.f6978k4.f8092m9.m11121k4(this.f6978k4.f8092m9.m11123to() - dM11123to);
    }

    /* JADX INFO: renamed from: h4 */
    private void m10177h4() {
        this.f6978k4.f8092m9.m11121k4(((int) this.f6977h4.m11705x1().m10572kk().m11015x1()) * 64);
    }

    /* JADX INFO: renamed from: ix */
    private void m10179ix() {
        C2323um c2323um = this.f6981x1;
        int i = this.f6979kk;
        this.f6979kk = i + 1;
        byte bM11508k4 = c2323um.m11508k4(i);
        while (true) {
            int i2 = bM11508k4 & 255;
            if (i2 <= 0 || this.f6979kk > this.f6981x1.m11510kk() - 2) {
                return;
            }
            C2193mc c2193mc = this.f6978k4.f8092m9;
            C2323um c2323um2 = this.f6981x1;
            int i3 = this.f6979kk;
            this.f6979kk = i3 + 1;
            int iM11508k4 = (c2323um2.m11508k4(i3) & 255) << 8;
            C2323um c2323um3 = this.f6981x1;
            this.f6979kk = this.f6979kk + 1;
            c2193mc.m11121k4(iM11508k4 + (c2323um3.m11508k4(r4) & 255));
            bM11508k4 = (byte) (i2 - 1);
        }
    }

    /* JADX INFO: renamed from: jd */
    private void m10180jd() {
        C2193mc c2193mc;
        double d;
        if (C7019kk.m27462to(Double.valueOf(this.f6978k4.f8092m9.m11123to()), 14) >= C7019kk.m27462to(Double.valueOf(this.f6978k4.f8092m9.m11123to()), 14)) {
            c2193mc = this.f6978k4.f8092m9;
            d = 1.0d;
        } else {
            c2193mc = this.f6978k4.f8092m9;
            d = 0.0d;
        }
        c2193mc.m11121k4(d);
    }

    /* JADX INFO: renamed from: k4 */
    private int m10182k4(double d, double d2) {
        return this.f6978k4.f8089k4 != 1 ? OooO.OooO00o(d, 14) : C7019kk.m27462to(Double.valueOf(C14116yg.m67497to(d + d2)), 14);
    }

    /* JADX INFO: renamed from: kk */
    private void m10189kk() {
        C2323um c2323umM10649k4 = this.f6977h4.m11705x1().m10573ks().m11255kk().m10649k4(C7019kk.m27462to(Double.valueOf(this.f6978k4.f8092m9.m11123to()), 14));
        if (c2323umM10649k4 != null) {
            new C2003ar(c2323umM10649k4, this.f6977h4, this.f6978k4).m10222x1();
        }
    }

    /* JADX INFO: renamed from: kp */
    private void m10191kp() {
        double dM11123to = this.f6978k4.f8092m9.m11123to();
        this.f6978k4.f8092m9.m11121k4(this.f6978k4.f8092m9.m11123to() + dM11123to);
    }

    /* JADX INFO: renamed from: ks */
    private void m10192ks() {
    }

    /* JADX INFO: renamed from: lr */
    private void m10193lr() {
        if (m10182k4(this.f6978k4.f8092m9.m11123to() / 64.0d, 0.0d) % 2 == 0) {
            this.f6978k4.f8092m9.m11121k4(0.0d);
        } else {
            this.f6978k4.f8092m9.m11121k4(1.0d);
        }
    }

    /* JADX INFO: renamed from: m9 */
    private void m10194m9() {
        C2193mc c2193mc;
        double d;
        if (C7019kk.m27462to(Double.valueOf(this.f6978k4.f8092m9.m11123to()), 14) < C7019kk.m27462to(Double.valueOf(this.f6978k4.f8092m9.m11123to()), 14)) {
            c2193mc = this.f6978k4.f8092m9;
            d = 1.0d;
        } else {
            c2193mc = this.f6978k4.f8092m9;
            d = 0.0d;
        }
        c2193mc.m11121k4(d);
    }

    /* JADX INFO: renamed from: ne */
    private void m10196ne() {
        C2323um c2323um = this.f6981x1;
        int i = this.f6979kk;
        this.f6979kk = i + 1;
        for (byte bM11508k4 = c2323um.m11508k4(i); (bM11508k4 & 255) > 0 && this.f6979kk <= this.f6981x1.m11510kk(); bM11508k4 = (byte) (bM11508k4 - 1)) {
            C2193mc c2193mc = this.f6978k4.f8092m9;
            C2323um c2323um2 = this.f6981x1;
            this.f6979kk = this.f6979kk + 1;
            c2193mc.m11121k4(c2323um2.m11508k4(r3) & 255);
        }
    }

    /* JADX INFO: renamed from: qm */
    private void m10197qm() {
        C2333v4 c2333v4 = this.f6978k4;
        c2333v4.f8097u4 = C7019kk.m27462to(Double.valueOf(c2333v4.f8092m9.m11123to()), 14);
    }

    /* JADX INFO: renamed from: qq */
    private void m10198qq() {
        double dM11123to = this.f6978k4.f8092m9.m11123to();
        this.f6978k4.f8092m9.m11121k4((this.f6978k4.f8092m9.m11123to() * dM11123to) / 64.0d);
    }

    /* JADX INFO: renamed from: rv */
    private void m10199rv() {
        int iM27462to = C7019kk.m27462to(Double.valueOf(this.f6978k4.f8092m9.m11123to()), 14);
        int i = this.f6979kk;
        int i2 = i;
        boolean z = false;
        while (this.f6979kk <= this.f6981x1.m11510kk() && !z) {
            byte[] bArr = {0};
            m10185k4(this.f6981x1, bArr);
            byte b = bArr[0];
            if (b == -119 || b == 44) {
                throw new C2019bv();
            }
            if (b == 45) {
                m10221k4().m10650k4(iM27462to, new C2323um(this.f6981x1.m11509k4(), i, i2));
                z = true;
            }
            i2 = this.f6979kk;
        }
    }

    /* JADX INFO: renamed from: s7 */
    private void m10200s7() {
        this.f6978k4.f8092m9.m11121k4(C14116yg.m67475k4(this.f6978k4.f8092m9.m11123to()));
    }

    /* JADX INFO: renamed from: ss */
    private void m10201ss() {
        this.f6978k4.f8089k4 = 1;
    }

    /* JADX INFO: renamed from: sv */
    private void m10202sv() {
        while (true) {
            C2333v4 c2333v4 = this.f6978k4;
            if (c2333v4.f8090kk <= 0) {
                c2333v4.f8090kk = 1;
                return;
            }
            int iM27462to = C7019kk.m27462to(Double.valueOf(c2333v4.f8092m9.m11123to()), 14);
            C2333v4 c2333v42 = this.f6978k4;
            double dMo10664k4 = c2333v42.f8082ck.mo10664k4(c2333v42.f8098um.m10312k4().f7666du[iM27462to], this.f6978k4.f8098um.m10312k4().f7668h4[iM27462to]);
            C2333v4 c2333v43 = this.f6978k4;
            AbstractC2108h5 abstractC2108h5 = c2333v43.f8082ck;
            double[] dArr = c2333v43.f8094qq.m10312k4().f7666du;
            C2333v4 c2333v44 = this.f6978k4;
            double dMo10664k42 = abstractC2108h5.mo10664k4(dArr[c2333v44.f8087ix], c2333v44.f8094qq.m10312k4().f7668h4[this.f6978k4.f8087ix]);
            C2333v4 c2333v45 = this.f6978k4;
            AbstractC2108h5 abstractC2108h52 = c2333v45.f8082ck;
            double[] dArr2 = c2333v45.f8080ar.m10312k4().f7666du;
            C2333v4 c2333v46 = this.f6978k4;
            double dMo10664k43 = abstractC2108h52.mo10664k4(dArr2[c2333v46.f8097u4], c2333v46.f8080ar.m10312k4().f7668h4[this.f6978k4.f8097u4]);
            C2333v4 c2333v47 = this.f6978k4;
            double dMo10664k44 = c2333v47.f8082ck.mo10664k4(c2333v47.f8098um.m10313x1().f7666du[iM27462to], this.f6978k4.f8098um.m10313x1().f7668h4[iM27462to]);
            C2333v4 c2333v48 = this.f6978k4;
            AbstractC2108h5 abstractC2108h53 = c2333v48.f8082ck;
            double[] dArr3 = c2333v48.f8094qq.m10313x1().f7666du;
            C2333v4 c2333v49 = this.f6978k4;
            double dMo10664k45 = abstractC2108h53.mo10664k4(dArr3[c2333v49.f8087ix], c2333v49.f8094qq.m10313x1().f7668h4[this.f6978k4.f8087ix]);
            C2333v4 c2333v410 = this.f6978k4;
            AbstractC2108h5 abstractC2108h54 = c2333v410.f8082ck;
            double[] dArr4 = c2333v410.f8080ar.m10313x1().f7666du;
            C2333v4 c2333v411 = this.f6978k4;
            double dMo10664k46 = abstractC2108h54.mo10664k4(dArr4[c2333v411.f8097u4], c2333v411.f8080ar.m10313x1().f7668h4[this.f6978k4.f8097u4]);
            if (dMo10664k42 != dMo10664k43) {
                C7019kk.m27469x1(this.f6978k4.f8082ck, C2205mz.class);
                double d = (((dMo10664k4 - dMo10664k42) / (dMo10664k43 - dMo10664k42)) * (dMo10664k46 - dMo10664k45)) + dMo10664k45;
                C2333v4 c2333v412 = this.f6978k4;
                c2333v412.f8085fa.mo10665k4(c2333v412.f8098um.m10313x1(), iM27462to, d - dMo10664k44);
            }
            C2333v4 c2333v413 = this.f6978k4;
            c2333v413.f8090kk--;
        }
    }

    /* JADX INFO: renamed from: t6 */
    private void m10203t6() {
        double dM11123to = this.f6978k4.f8092m9.m11123to();
        double dM11123to2 = this.f6978k4.f8092m9.m11123to();
        this.f6978k4.f8088jd.m10726k4(dM11123to2, dM11123to);
        this.f6978k4.f8099up.m10726k4(dM11123to2, dM11123to);
    }

    /* JADX INFO: renamed from: to */
    private void m10204to() {
        int iM27462to = C7019kk.m27462to(Double.valueOf(this.f6978k4.f8092m9.m11123to()), 14);
        this.f6978k4.f8084dy.set_Item(Integer.valueOf(C7019kk.m27462to(Double.valueOf(this.f6978k4.f8092m9.m11123to()), 14)), Integer.valueOf(iM27462to));
    }

    /* JADX INFO: renamed from: ts */
    private void m10206ts() {
        while (true) {
            C2333v4 c2333v4 = this.f6978k4;
            if (c2333v4.f8090kk <= 0) {
                c2333v4.f8090kk = 1;
                return;
            }
            int iM27462to = C7019kk.m27462to(Double.valueOf(c2333v4.f8092m9.m11123to()), 14);
            C2333v4 c2333v42 = this.f6978k4;
            AbstractC2108h5 abstractC2108h5 = c2333v42.f8082ck;
            double d = c2333v42.f8080ar.m10313x1().f7666du[iM27462to];
            double[] dArr = this.f6978k4.f8094qq.m10313x1().f7666du;
            C2333v4 c2333v43 = this.f6978k4;
            double dMo10664k4 = abstractC2108h5.mo10664k4(d - dArr[c2333v43.f8093ne], c2333v43.f8080ar.m10313x1().f7668h4[iM27462to] - this.f6978k4.f8094qq.m10313x1().f7668h4[this.f6978k4.f8093ne]);
            C2333v4 c2333v44 = this.f6978k4;
            c2333v44.f8085fa.mo10665k4(c2333v44.f8080ar.m10313x1(), iM27462to, -dMo10664k4);
            this.f6978k4.f8090kk--;
        }
    }

    /* JADX INFO: renamed from: u4 */
    private void m10207u4() {
        C2333v4 c2333v4 = this.f6978k4;
        c2333v4.f8102x1 = C7019kk.m27462to(Double.valueOf(c2333v4.f8092m9.m11123to()), 14);
    }

    /* JADX INFO: renamed from: um */
    private void m10208um() {
        C2333v4 c2333v4 = this.f6978k4;
        c2333v4.f8083du = c2333v4.f8092m9.m11123to();
    }

    /* JADX INFO: renamed from: up */
    private void m10209up() {
        if (C7019kk.m27462to(Double.valueOf(this.f6978k4.f8092m9.m11123to()), 14) == 0) {
            boolean z = false;
            byte b = 0;
            int i = 1;
            while (this.f6979kk <= this.f6981x1.m11510kk() && !z) {
                byte[] bArr = {b};
                m10185k4(this.f6981x1, bArr);
                b = bArr[0];
                if (b != 27) {
                    if (b == 88) {
                        i++;
                    } else if (b == 89 && i - 1 == 0) {
                        z = true;
                    }
                } else if (i == 1) {
                    z = true;
                }
            }
        }
    }

    /* JADX INFO: renamed from: uz */
    private void m10210uz() {
        C2333v4 c2333v4;
        boolean z;
        int iM27462to = C7019kk.m27462to(Double.valueOf(this.f6978k4.f8092m9.m11123to()), 14) & 255;
        if (iM27462to == 255) {
            c2333v4 = this.f6978k4;
            z = true;
        } else {
            if (iM27462to != 0) {
                return;
            }
            c2333v4 = this.f6978k4;
            z = false;
        }
        c2333v4.f8096to = z;
    }

    /* JADX INFO: renamed from: v4 */
    private void m10211v4() {
        double dM11123to = this.f6978k4.f8092m9.m11123to();
        this.f6978k4.f8092m9.m11121k4(dM11123to);
        this.f6978k4.f8092m9.m11121k4(dM11123to);
    }

    /* JADX INFO: renamed from: wl */
    private void m10212wl() {
        double dM11123to = this.f6978k4.f8092m9.m11123to();
        this.f6978k4.f8092m9.m11121k4((this.f6978k4.f8092m9.m11123to() / dM11123to) * 64.0d);
    }

    /* JADX INFO: renamed from: wp */
    private void m10213wp() {
        int iM27462to = C7019kk.m27462to(Double.valueOf(this.f6978k4.f8092m9.m11123to()), 14);
        C2193mc c2193mc = this.f6978k4.f8092m9;
        c2193mc.m11121k4(c2193mc.m11119k4(iM27462to - 1));
    }

    /* JADX INFO: renamed from: wy */
    private void m10214wy() {
        double dM11123to = this.f6978k4.f8092m9.m11123to();
        this.f6977h4.m11705x1().m10582yj().m11252k4(C7019kk.m27462to(Double.valueOf(this.f6978k4.f8092m9.m11123to()), 14), C7019kk.m27468x1(Double.valueOf(dM11123to), 14));
    }

    /* JADX INFO: renamed from: x1 */
    private static double m10215x1(double d, double d2) {
        return C7019kk.m27462to(Double.valueOf(d), 14);
    }

    /* JADX INFO: renamed from: x6 */
    private void m10217x6() {
    }

    /* JADX INFO: renamed from: xk */
    private void m10218xk() {
        C2333v4 c2333v4;
        AbstractC2108h5 c2205mz;
        C2333v4 c2333v42 = this.f6978k4;
        c2333v42.f8081c5.m10726k4(c2333v42.f8088jd.m10725k4(), this.f6978k4.f8088jd.m10727x1());
        if (this.f6978k4.f8081c5.m10725k4() != 0.0d && this.f6978k4.f8081c5.m10727x1() != 0.0d) {
            c2333v4 = this.f6978k4;
            c2205mz = new C2122i1(c2333v4.f8081c5);
        } else if (this.f6978k4.f8081c5.m10727x1() != 0.0d) {
            c2333v4 = this.f6978k4;
            c2205mz = new C2315tz();
        } else {
            c2333v4 = this.f6978k4;
            c2205mz = new C2205mz();
        }
        c2333v4.f8085fa = c2205mz;
    }

    /* JADX INFO: renamed from: yd */
    private void m10219yd() {
        if (m10182k4(this.f6978k4.f8092m9.m11123to() / 64.0d, 0.0d) % 2 == 0) {
            this.f6978k4.f8092m9.m11121k4(1.0d);
        } else {
            this.f6978k4.f8092m9.m11121k4(0.0d);
        }
    }

    /* JADX INFO: renamed from: yj */
    private void m10220yj() {
        boolean z = false;
        byte b = 0;
        int i = 1;
        while (this.f6979kk <= this.f6981x1.m11510kk() && !z) {
            byte[] bArr = {b};
            m10185k4(this.f6981x1, bArr);
            b = bArr[0];
            if (b == 88) {
                i++;
            } else if (b == 89 && i - 1 == 0) {
                z = true;
            }
        }
    }

    public C2003ar(C2323um c2323um, C2377xv c2377xv) {
        this(c2323um, c2377xv, new C2333v4());
    }

    /* JADX INFO: renamed from: c5 */
    private void m10162c5(int i) {
        int i2;
        int iM27462to = C7019kk.m27462to(Double.valueOf(this.f6978k4.f8092m9.m11123to()), 14);
        C2333v4 c2333v4 = this.f6978k4;
        AbstractC2108h5 abstractC2108h5 = c2333v4.f8082ck;
        double d = c2333v4.f8080ar.m10312k4().f7666du[iM27462to];
        double[] dArr = this.f6978k4.f8094qq.m10312k4().f7666du;
        C2333v4 c2333v42 = this.f6978k4;
        double[] dArr2 = {abstractC2108h5.mo10664k4(d - dArr[c2333v42.f8093ne], c2333v42.f8080ar.m10312k4().f7668h4[iM27462to] - this.f6978k4.f8094qq.m10312k4().f7668h4[this.f6978k4.f8093ne])};
        m10186k4(dArr2);
        double d2 = dArr2[0];
        double dM10182k4 = (i & 4) != 0 ? m10182k4(d2, this.f6978k4.f8086h4[i & 3]) : m10215x1(d2, this.f6978k4.f8086h4[i & 3]);
        if ((i & 8) != 0) {
            if (d2 >= 0.0d) {
                i2 = this.f6978k4.f8103x6;
                if (dM10182k4 < i2) {
                    dM10182k4 = i2;
                }
            } else {
                int i3 = this.f6978k4.f8103x6;
                if (dM10182k4 > (-i3)) {
                    i2 = -i3;
                    dM10182k4 = i2;
                }
            }
        }
        C2333v4 c2333v43 = this.f6978k4;
        AbstractC2108h5 abstractC2108h52 = c2333v43.f8082ck;
        double d3 = c2333v43.f8080ar.m10313x1().f7666du[iM27462to];
        double[] dArr3 = this.f6978k4.f8094qq.m10313x1().f7666du;
        C2333v4 c2333v44 = this.f6978k4;
        double dMo10664k4 = abstractC2108h52.mo10664k4(d3 - dArr3[c2333v44.f8093ne], c2333v44.f8080ar.m10313x1().f7668h4[iM27462to] - this.f6978k4.f8094qq.m10313x1().f7668h4[this.f6978k4.f8093ne]);
        C2333v4 c2333v45 = this.f6978k4;
        c2333v45.f8085fa.mo10665k4(c2333v45.f8080ar.m10313x1(), iM27462to, dM10182k4 - dMo10664k4);
        C2333v4 c2333v46 = this.f6978k4;
        c2333v46.f8087ix = c2333v46.f8093ne;
        c2333v46.f8097u4 = iM27462to;
        if ((i & 16) != 0) {
            c2333v46.f8093ne = iM27462to;
        }
    }

    /* JADX INFO: renamed from: ck */
    private void m10165ck(int i) {
        int iM27462to = C7019kk.m27462to(Double.valueOf(this.f6978k4.f8092m9.m11123to()), 14);
        int iM27462to2 = C7019kk.m27462to(Double.valueOf(this.f6978k4.f8092m9.m11123to()), 14);
        C2333v4 c2333v4 = this.f6978k4;
        AbstractC2108h5 abstractC2108h5 = c2333v4.f8082ck;
        double d = c2333v4.f8080ar.m10313x1().f7666du[iM27462to2];
        double[] dArr = this.f6978k4.f8094qq.m10313x1().f7666du;
        C2333v4 c2333v42 = this.f6978k4;
        double dMo10664k4 = abstractC2108h5.mo10664k4(d - dArr[c2333v42.f8093ne], c2333v42.f8080ar.m10313x1().f7668h4[iM27462to2] - this.f6978k4.f8094qq.m10313x1().f7668h4[this.f6978k4.f8093ne]);
        C2333v4 c2333v43 = this.f6978k4;
        c2333v43.f8085fa.mo10665k4(c2333v43.f8080ar.m10313x1(), iM27462to2, ((double) (iM27462to / 64)) - dMo10664k4);
        C2333v4 c2333v44 = this.f6978k4;
        c2333v44.f8087ix = c2333v44.f8093ne;
        c2333v44.f8097u4 = iM27462to2;
        if ((i & 1) != 0) {
            c2333v44.f8093ne = iM27462to2;
        }
    }

    /* JADX INFO: renamed from: du */
    private void m10168du(int i) {
        C2333v4 c2333v4;
        C2122i1 c2122i1;
        int iM27462to = C7019kk.m27462to(Double.valueOf(this.f6978k4.f8092m9.m11123to()), 14);
        int iM27462to2 = C7019kk.m27462to(Double.valueOf(this.f6978k4.f8092m9.m11123to()), 14);
        double d = this.f6978k4.f8098um.m10313x1().f7666du[iM27462to2] - this.f6978k4.f8080ar.m10313x1().f7666du[iM27462to];
        double d2 = this.f6978k4.f8098um.m10313x1().f7668h4[iM27462to2] - this.f6978k4.f8080ar.m10313x1().f7668h4[iM27462to];
        if (i == 0) {
            this.f6978k4.f8088jd.m10726k4(d, d2);
            this.f6978k4.f8099up.m10726k4(d, d2);
            c2333v4 = this.f6978k4;
            c2122i1 = new C2122i1(c2333v4.f8088jd);
        } else {
            if (i != 1) {
                return;
            }
            double d3 = -d;
            this.f6978k4.f8088jd.m10726k4(d3, d3);
            this.f6978k4.f8099up.m10726k4(d3, d3);
            c2333v4 = this.f6978k4;
            c2122i1 = new C2122i1(c2333v4.f8088jd);
        }
        c2333v4.f8082ck = c2122i1;
    }

    /* JADX INFO: renamed from: dy */
    private void m10170dy(int i) {
        int i2;
        int iM27462to = C7019kk.m27462to(Double.valueOf(this.f6978k4.f8092m9.m11123to()), 14);
        int iM27462to2 = C7019kk.m27462to(Double.valueOf(this.f6978k4.f8092m9.m11123to()), 14);
        double dM11251k4 = this.f6977h4.m11705x1().m10582yj().m11251k4(iM27462to);
        if (m10187k4(dM11251k4)) {
            dM11251k4 = dM11251k4 >= 0.0d ? this.f6978k4.f8104yj : -this.f6978k4.f8104yj;
        }
        C2333v4 c2333v4 = this.f6978k4;
        AbstractC2108h5 abstractC2108h5 = c2333v4.f8082ck;
        double d = c2333v4.f8080ar.m10313x1().f7666du[iM27462to2];
        double[] dArr = this.f6978k4.f8094qq.m10313x1().f7666du;
        C2333v4 c2333v42 = this.f6978k4;
        double dMo10664k4 = abstractC2108h5.mo10664k4(d - dArr[c2333v42.f8093ne], c2333v42.f8080ar.m10313x1().f7668h4[iM27462to2] - this.f6978k4.f8094qq.m10313x1().f7668h4[this.f6978k4.f8093ne]);
        C2333v4 c2333v43 = this.f6978k4;
        AbstractC2108h5 abstractC2108h52 = c2333v43.f8082ck;
        double d2 = c2333v43.f8080ar.m10312k4().f7666du[iM27462to2];
        double[] dArr2 = this.f6978k4.f8094qq.m10312k4().f7666du;
        C2333v4 c2333v44 = this.f6978k4;
        double dMo10664k42 = abstractC2108h52.mo10664k4(d2 - dArr2[c2333v44.f8093ne], c2333v44.f8080ar.m10312k4().f7668h4[iM27462to2] - this.f6978k4.f8094qq.m10312k4().f7668h4[this.f6978k4.f8093ne]);
        C2333v4 c2333v45 = this.f6978k4;
        if (c2333v45.f8095rv && dMo10664k42 != 0.0d && ((dMo10664k42 < 0.0d && dM11251k4 > 0.0d) || (dMo10664k42 > 0.0d && dM11251k4 < 0.0d))) {
            dM11251k4 = -dM11251k4;
        }
        double dM10182k4 = (i & 4) != 0 ? m10182k4(dM11251k4, r1[i & 3]) : m10215x1(dM11251k4, c2333v45.f8086h4[i & 3]);
        if ((i & 8) != 0) {
            if (dMo10664k42 >= 0.0d) {
                i2 = this.f6978k4.f8103x6;
                if (dM10182k4 < i2) {
                    dM10182k4 = i2;
                }
            } else {
                int i3 = this.f6978k4.f8103x6;
                if (dM10182k4 > (-i3)) {
                    i2 = -i3;
                    dM10182k4 = i2;
                }
            }
        }
        C2333v4 c2333v46 = this.f6978k4;
        c2333v46.f8085fa.mo10665k4(c2333v46.f8080ar.m10313x1(), iM27462to2, dM10182k4 - dMo10664k4);
        C2333v4 c2333v47 = this.f6978k4;
        c2333v47.f8087ix = c2333v47.f8093ne;
        if ((i & 16) != 0) {
            c2333v47.f8093ne = iM27462to2;
        }
        c2333v47.f8097u4 = iM27462to2;
    }

    /* JADX INFO: renamed from: fa */
    private void m10174fa(int i) {
        AbstractC2108h5 abstractC2108h5;
        double d;
        double d2;
        double d3;
        int iM27462to = C7019kk.m27462to(Double.valueOf(this.f6978k4.f8092m9.m11123to()), 14);
        int iM27462to2 = C7019kk.m27462to(Double.valueOf(this.f6978k4.f8092m9.m11123to()), 14);
        if (i != 0) {
            C2333v4 c2333v4 = this.f6978k4;
            abstractC2108h5 = c2333v4.f8082ck;
            d = c2333v4.f8080ar.m10312k4().f7666du[iM27462to2] - this.f6978k4.f8094qq.m10312k4().f7666du[iM27462to];
            d2 = this.f6978k4.f8080ar.m10312k4().f7668h4[iM27462to2];
            d3 = this.f6978k4.f8094qq.m10312k4().f7668h4[iM27462to];
        } else {
            C2333v4 c2333v42 = this.f6978k4;
            abstractC2108h5 = c2333v42.f8082ck;
            d = c2333v42.f8080ar.m10313x1().f7666du[iM27462to2] - this.f6978k4.f8094qq.m10313x1().f7666du[iM27462to];
            d2 = this.f6978k4.f8080ar.m10313x1().f7668h4[iM27462to2];
            d3 = this.f6978k4.f8094qq.m10313x1().f7668h4[iM27462to];
        }
        this.f6978k4.f8092m9.m11121k4(abstractC2108h5.mo10664k4(d, d2 - d3) * 64.0d);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0086  */
    /* JADX INFO: renamed from: h4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m10178h4(int i) {
        int i2;
        int i3;
        int i4;
        int i5 = i;
        C2216ni c2216niM10313x1 = this.f6978k4.f8098um.m10313x1();
        C2216ni c2216niM10312k4 = this.f6978k4.f8098um.m10312k4();
        boolean[] zArr = i5 == 1 ? c2216niM10313x1.f7667dy : c2216niM10313x1.f7671m9;
        int i6 = 0;
        for (int i7 = 0; i7 < this.f6978k4.f8098um.m10313x1().f7669k4; i7++) {
            int i8 = c2216niM10313x1.f7673x1[i7] & 65535;
            int i9 = 0;
            int i10 = i6;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            while (true) {
                int[] iArr = {i9};
                boolean zM10188k4 = m10188k4(i10, i8, zArr, iArr);
                i9 = iArr[0];
                if (zM10188k4) {
                    int i14 = i11 == -1 ? i9 : i11;
                    if (i12 != -1 && (i9 - i12) - 1 > 0) {
                        m10184k4(i5, c2216niM10312k4, c2216niM10313x1, i12, i9, i12 + 1, i9 - 1);
                        i9 = i9;
                    }
                    i10 = i9 + 1;
                    i12 = i9;
                    i11 = i14;
                    i13 = i12;
                }
                if (!zM10188k4) {
                    break;
                }
                i8 = i8;
                i11 = i11;
                i13 = i13;
                i5 = i;
            }
            if (i11 == -1 || i13 == -1) {
                i5 = i;
                i2 = i8;
            } else if (i11 != i13) {
                if (i6 != i11) {
                    i3 = i11;
                    i4 = i13;
                    m10184k4(i, c2216niM10312k4, c2216niM10313x1, i3, i4, i6, i11 - 1);
                } else {
                    i3 = i11;
                    i4 = i13;
                }
                if (i8 != i4) {
                    i5 = i;
                    int i15 = i8;
                    m10184k4(i5, c2216niM10312k4, c2216niM10313x1, i3, i4, i4 + 1, i15);
                    i2 = i15;
                }
            } else {
                i5 = i;
                i2 = i8;
                double d = (i5 == 1 ? c2216niM10313x1.f7666du[i12] : c2216niM10313x1.f7668h4[i12]) - (i5 == 1 ? c2216niM10312k4.f7666du[i12] : c2216niM10312k4.f7668h4[i12]);
                while (i6 <= i2) {
                    if (i6 != i12) {
                        if (i5 == 0) {
                            double[] dArr = c2216niM10313x1.f7668h4;
                            dArr[i6] = dArr[i6] + d;
                        } else if (i5 == 1) {
                            double[] dArr2 = c2216niM10313x1.f7666du;
                            dArr2[i6] = dArr2[i6] + d;
                        }
                    }
                    i6++;
                }
            }
            i6 = i2 + 1;
        }
    }

    /* JADX INFO: renamed from: jd */
    private void m10181jd(int i) {
        C2333v4 c2333v4 = this.f6978k4;
        double d = c2333v4.f8083du;
        int iM27462to = C7019kk.m27462to(Double.valueOf(c2333v4.f8092m9.m11123to()), 14);
        int iM27462to2 = C7019kk.m27462to(Double.valueOf(this.f6978k4.f8092m9.m11123to()), 14);
        int iM11251k4 = this.f6977h4.m11705x1().m10582yj().m11251k4(iM27462to);
        C2333v4 c2333v42 = this.f6978k4;
        double dMo10664k4 = c2333v42.f8082ck.mo10664k4(c2333v42.f8094qq.m10313x1().f7666du[iM27462to2], this.f6978k4.f8094qq.m10313x1().f7668h4[iM27462to2]);
        if (i == 1) {
            iM11251k4 = m10182k4(iM11251k4, this.f6978k4.f8086h4[0]);
        }
        C2333v4 c2333v43 = this.f6978k4;
        c2333v43.f8085fa.mo10665k4(c2333v43.f8094qq.m10313x1(), iM27462to2, ((double) iM11251k4) - dMo10664k4);
        C2333v4 c2333v44 = this.f6978k4;
        c2333v44.f8093ne = iM27462to2;
        c2333v44.f8087ix = iM27462to2;
    }

    /* JADX INFO: renamed from: kk */
    private void m10190kk(int i) {
        this.f6978k4.f8092m9.m11121k4(m10182k4(this.f6978k4.f8092m9.m11123to(), this.f6978k4.f8086h4[i]));
    }

    /* JADX INFO: renamed from: m9 */
    private void m10195m9(int i) {
        double dM10182k4;
        int iM27462to = C7019kk.m27462to(Double.valueOf(this.f6978k4.f8092m9.m11123to()), 14);
        if (i != 1) {
            dM10182k4 = 0.0d;
        } else {
            C2333v4 c2333v4 = this.f6978k4;
            double dMo10664k4 = c2333v4.f8082ck.mo10664k4(c2333v4.f8094qq.m10313x1().f7666du[iM27462to], this.f6978k4.f8094qq.m10313x1().f7668h4[iM27462to]);
            dM10182k4 = ((double) m10182k4(dMo10664k4, this.f6978k4.f8086h4[0])) - dMo10664k4;
        }
        C2333v4 c2333v42 = this.f6978k4;
        c2333v42.f8085fa.mo10665k4(c2333v42.f8094qq.m10313x1(), iM27462to, dM10182k4);
        C2333v4 c2333v43 = this.f6978k4;
        c2333v43.f8093ne = iM27462to;
        c2333v43.f8087ix = iM27462to;
    }

    /* JADX INFO: renamed from: to */
    private void m10205to(int i) {
        C2333v4 c2333v4;
        AbstractC2108h5 c2315tz;
        if (i == 0) {
            this.f6978k4.f8081c5.m10726k4(0.0d, 1.0d);
            this.f6978k4.f8088jd.m10726k4(0.0d, 1.0d);
            this.f6978k4.f8099up.m10726k4(0.0d, 1.0d);
            this.f6978k4.f8082ck = new C2315tz();
            c2333v4 = this.f6978k4;
            c2315tz = new C2315tz();
        } else {
            if (i != 1) {
                return;
            }
            this.f6978k4.f8081c5.m10726k4(1.0d, 0.0d);
            this.f6978k4.f8088jd.m10726k4(1.0d, 0.0d);
            this.f6978k4.f8099up.m10726k4(1.0d, 0.0d);
            this.f6978k4.f8082ck = new C2205mz();
            c2333v4 = this.f6978k4;
            c2315tz = new C2205mz();
        }
        c2333v4.f8085fa = c2315tz;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m10222x1() {
        try {
            this.f6979kk = this.f6981x1.m11511x1();
            while (this.f6979kk <= this.f6981x1.m11510kk()) {
                C2323um c2323um = this.f6981x1;
                int i = this.f6979kk;
                this.f6979kk = i + 1;
                byte bM11508k4 = c2323um.m11508k4(i);
                switch (bM11508k4) {
                    case -123:
                        m10210uz();
                        break;
                    case -122:
                    case -121:
                    case -120:
                    case -119:
                    case -117:
                    case -116:
                    case -114:
                    case -113:
                    case -112:
                    case BackupEvent.ERROR_IN_FILE_DB_VERSION_BIG_THAN_LOCAL /* -111 */:
                    case BackupEvent.ERROR_INVALID_FILENAME /* -110 */:
                    case BackupEvent.ERROR_GUID_NOT_EXIST /* -109 */:
                    case BackupEvent.ERROR_UID_NOT_EXIST /* -108 */:
                    case BackupEvent.ERROR_CAPACITY_FULL /* -107 */:
                    case BackupEvent.ERROR_REMOTE_DISK_FULL /* -106 */:
                    case BackupEvent.ERROR_LOCAL_DISK_FULL /* -105 */:
                    case BackupEvent.ERROR_FILE_ALREADY_EXIST /* -104 */:
                    case BackupEvent.ERROR_FILE_NOT_EXIST /* -103 */:
                    case BackupEvent.ERROR_TOKEN_EXPIRED /* -102 */:
                    case BackupEvent.ERROR_INVALID_TOKEN /* -101 */:
                    case -100:
                    case -99:
                    case -98:
                    case -97:
                    case -96:
                    case -95:
                    case -94:
                    case -93:
                    case -92:
                    case -91:
                    case C18250l0.l.f55515b /* -90 */:
                    case -89:
                    case -88:
                    case -87:
                    case -86:
                    case -85:
                    case -84:
                    case -83:
                    case -82:
                    case -81:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 8:
                    case 9:
                    case 11:
                    case 13:
                    case 15:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 25:
                    case 26:
                    case 28:
                    case 30:
                    case 31:
                    case 34:
                    case 36:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 61:
                    case 70:
                    case 71:
                    case 76:
                    case 77:
                    case 78:
                    case 79:
                    case 90:
                    case 91:
                    case 92:
                    case 93:
                    case 94:
                    case 95:
                    case 102:
                    case 103:
                    case 108:
                    case 109:
                    case 110:
                    case 111:
                    default:
                        throw new NotSupportedException(C14113y2.m67402k4("operаtion 0x{0:x} is not supported", C14042ak.m66410k4(k4.class, bM11508k4)));
                    case -118:
                        m10163c6();
                        break;
                    case -115:
                        m10207u4();
                        break;
                    case -80:
                        m10183k4(0);
                        break;
                    case -79:
                        m10183k4(1);
                        break;
                    case -78:
                        m10183k4(2);
                        break;
                    case -77:
                        m10183k4(3);
                        break;
                    case -76:
                        m10183k4(4);
                        break;
                    case -75:
                        m10183k4(5);
                        break;
                    case -74:
                        m10183k4(6);
                        break;
                    case -73:
                        m10183k4(7);
                        break;
                    case -72:
                        m10216x1(0);
                        break;
                    case -71:
                        m10216x1(1);
                        break;
                    case -70:
                        m10216x1(2);
                        break;
                    case -69:
                        m10216x1(3);
                        break;
                    case -68:
                        m10216x1(4);
                        break;
                    case -67:
                        m10216x1(5);
                        break;
                    case -66:
                        m10216x1(6);
                        break;
                    case -65:
                        m10216x1(7);
                        break;
                    case -64:
                        m10162c5(0);
                        break;
                    case -63:
                        m10162c5(1);
                        break;
                    case -62:
                        m10162c5(2);
                        break;
                    case -61:
                        m10162c5(3);
                        break;
                    case -60:
                        m10162c5(4);
                        break;
                    case -59:
                        m10162c5(5);
                        break;
                    case -58:
                        m10162c5(6);
                        break;
                    case -57:
                        m10162c5(7);
                        break;
                    case -56:
                        m10162c5(8);
                        break;
                    case -55:
                        m10162c5(9);
                        break;
                    case -54:
                        m10162c5(10);
                        break;
                    case -53:
                        m10162c5(11);
                        break;
                    case -52:
                        m10162c5(12);
                        break;
                    case -51:
                        m10162c5(13);
                        break;
                    case -50:
                        m10162c5(14);
                        break;
                    case -49:
                        m10162c5(15);
                        break;
                    case -48:
                        m10162c5(16);
                        break;
                    case -47:
                        m10162c5(17);
                        break;
                    case -46:
                        m10162c5(18);
                        break;
                    case -45:
                        m10162c5(19);
                        break;
                    case -44:
                        m10162c5(20);
                        break;
                    case -43:
                        m10162c5(21);
                        break;
                    case -42:
                        m10162c5(22);
                        break;
                    case -41:
                        m10162c5(23);
                        break;
                    case -40:
                        m10162c5(24);
                        break;
                    case -39:
                        m10162c5(25);
                        break;
                    case -38:
                        m10162c5(26);
                        break;
                    case -37:
                        m10162c5(27);
                        break;
                    case -36:
                        m10162c5(28);
                        break;
                    case -35:
                        m10162c5(29);
                        break;
                    case -34:
                        m10162c5(30);
                        break;
                    case -33:
                        m10162c5(31);
                        break;
                    case -32:
                        m10170dy(0);
                        break;
                    case -31:
                        m10170dy(1);
                        break;
                    case -30:
                        m10170dy(2);
                        break;
                    case -29:
                        m10170dy(3);
                        break;
                    case -28:
                        m10170dy(4);
                        break;
                    case -27:
                        m10170dy(5);
                        break;
                    case -26:
                        m10170dy(6);
                        break;
                    case -25:
                        m10170dy(7);
                        break;
                    case -24:
                        m10170dy(8);
                        break;
                    case -23:
                        m10170dy(9);
                        break;
                    case -22:
                        m10170dy(10);
                        break;
                    case -21:
                        m10170dy(11);
                        break;
                    case -20:
                        m10170dy(12);
                        break;
                    case StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                        m10170dy(13);
                        break;
                    case StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                        m10170dy(14);
                        break;
                    case -17:
                        m10170dy(15);
                        break;
                    case -16:
                        m10170dy(16);
                        break;
                    case -15:
                        m10170dy(17);
                        break;
                    case -14:
                        m10170dy(18);
                        break;
                    case IntegrityErrorCode.NONCE_IS_NOT_BASE64 /* -13 */:
                        m10170dy(19);
                        break;
                    case -12:
                        m10170dy(20);
                        break;
                    case -11:
                        m10170dy(21);
                        break;
                    case -10:
                        m10170dy(22);
                        break;
                    case -9:
                        m10170dy(23);
                        break;
                    case -8:
                        m10170dy(24);
                        break;
                    case -7:
                        m10170dy(25);
                        break;
                    case -6:
                        m10170dy(26);
                        break;
                    case -5:
                        m10170dy(27);
                        break;
                    case -4:
                        m10170dy(28);
                        break;
                    case -3:
                        m10170dy(29);
                        break;
                    case -2:
                        m10170dy(30);
                        break;
                    case -1:
                        m10170dy(31);
                        break;
                    case 0:
                        m10205to(0);
                        break;
                    case 1:
                        m10205to(1);
                        break;
                    case 6:
                        m10168du(0);
                        break;
                    case 7:
                        m10168du(1);
                        break;
                    case 10:
                        m10203t6();
                        break;
                    case 12:
                        m10172f9();
                        break;
                    case 14:
                        m10218xk();
                        break;
                    case 16:
                        m10171e0();
                        break;
                    case 17:
                        m10160bz();
                        break;
                    case 18:
                        m10197qm();
                        break;
                    case 24:
                        m10201ss();
                        break;
                    case 27:
                        m10220yj();
                        break;
                    case 29:
                        m10208um();
                        break;
                    case 32:
                        m10211v4();
                        break;
                    case 33:
                        m10158b3();
                        break;
                    case 35:
                        m10166dq();
                        break;
                    case 37:
                        m10213wp();
                        break;
                    case 43:
                        m10189kk();
                        break;
                    case 44:
                        m10199rv();
                        break;
                    case 45:
                        m10217x6();
                        return;
                    case 46:
                        m10195m9(0);
                        break;
                    case 47:
                        m10195m9(1);
                        break;
                    case 48:
                        m10178h4(0);
                        break;
                    case 49:
                        m10178h4(1);
                        break;
                    case 57:
                        m10202sv();
                        break;
                    case 58:
                        m10165ck(0);
                        break;
                    case 59:
                        m10165ck(1);
                        break;
                    case 60:
                        m10206ts();
                        break;
                    case 62:
                        m10181jd(0);
                        break;
                    case 63:
                        m10181jd(1);
                        break;
                    case 64:
                        m10196ne();
                        break;
                    case 65:
                        m10179ix();
                        break;
                    case 66:
                        m10204to();
                        break;
                    case 67:
                        m10167du();
                        break;
                    case 68:
                        m10156ak();
                        break;
                    case 69:
                        m10159bv();
                        break;
                    case 72:
                        m10175g8();
                        break;
                    case 73:
                        m10174fa(0);
                        break;
                    case 74:
                        m10174fa(1);
                        break;
                    case 75:
                        m10177h4();
                        break;
                    case 80:
                        m10194m9();
                        break;
                    case 81:
                        m10169dy();
                        break;
                    case 82:
                        m10161c5();
                        break;
                    case 83:
                        m10180jd();
                        break;
                    case 84:
                        m10164ck();
                        break;
                    case 85:
                        m10173fa();
                        break;
                    case 86:
                        m10193lr();
                        break;
                    case 87:
                        m10219yd();
                        break;
                    case 88:
                        m10209up();
                        break;
                    case 89:
                        m10192ks();
                        break;
                    case 96:
                        m10191kp();
                        break;
                    case 97:
                        m10176gi();
                        break;
                    case 98:
                        m10212wl();
                        break;
                    case 99:
                        m10198qq();
                        break;
                    case 100:
                        m10200s7();
                        break;
                    case 101:
                        m10157ar();
                        break;
                    case 104:
                        m10190kk(1);
                        break;
                    case 105:
                        m10190kk(2);
                        break;
                    case 106:
                        m10190kk(3);
                        break;
                    case 107:
                        m10190kk(4);
                        break;
                    case 112:
                        m10214wy();
                        break;
                }
            }
        } catch (C2019bv unused) {
        }
    }

    public C2003ar(C2323um c2323um, C2377xv c2377xv, C2333v4 c2333v4) {
        this.f6979kk = 0;
        this.f6976du = new C2103gv();
        this.f6981x1 = c2323um;
        this.f6977h4 = c2377xv;
        this.f6978k4 = c2333v4;
    }

    /* JADX INFO: renamed from: x1 */
    private void m10216x1(int i) {
        for (int i2 = (i + 1) * 2; i2 > 0 && this.f6979kk <= this.f6981x1.m11510kk(); i2 -= 2) {
            C2193mc c2193mc = this.f6978k4.f8092m9;
            C2323um c2323um = this.f6981x1;
            int i3 = this.f6979kk;
            this.f6979kk = i3 + 1;
            int iM11508k4 = (c2323um.m11508k4(i3) & 255) << 8;
            C2323um c2323um2 = this.f6981x1;
            this.f6979kk = this.f6979kk + 1;
            c2193mc.m11121k4(iM11508k4 + (c2323um2.m11508k4(r3) & 255));
        }
    }

    public C2003ar(byte[] bArr, C2377xv c2377xv) {
        this(new C2323um(bArr), c2377xv);
    }

    /* JADX INFO: renamed from: k4 */
    public final C2103gv m10221k4() {
        return this.f6976du;
    }

    /* JADX INFO: renamed from: k4 */
    private void m10183k4(int i) {
        for (int i2 = i + 1; i2 > 0 && this.f6979kk <= this.f6981x1.m11510kk(); i2--) {
            C2193mc c2193mc = this.f6978k4.f8092m9;
            C2323um c2323um = this.f6981x1;
            this.f6979kk = this.f6979kk + 1;
            c2193mc.m11121k4(c2323um.m11508k4(r2) & 255);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m10184k4(int i, C2216ni c2216ni, C2216ni c2216ni2, int i2, int i3, int i4, int i5) {
        double d = i == 1 ? c2216ni.f7666du[i2] : c2216ni.f7668h4[i2];
        double d2 = i == 1 ? c2216ni.f7666du[i3] : c2216ni.f7668h4[i3];
        double d3 = i == 1 ? c2216ni2.f7666du[i2] : c2216ni2.f7668h4[i2];
        double d4 = i == 1 ? c2216ni2.f7666du[i3] : c2216ni2.f7668h4[i3];
        for (int i6 = i4; i6 <= i5; i6++) {
            double d5 = i == 1 ? c2216ni.f7666du[i6] : c2216ni.f7668h4[i6];
            double dOooO0O0 = ((d2 <= d || d5 <= d || d5 >= d2) && (d2 >= d || d5 <= d2 || d5 >= d)) ? d5 + (C14116yg.m67475k4(d5 - d) < C14116yg.m67475k4(d2 - d5) ? d3 - d : d4 - d2) : C21532OooOOo.OooO0O0(d4, d3, (d5 - d) / (d2 - d), d3);
            if (i == 0) {
                c2216ni2.f7668h4[i6] = dOooO0O0;
            } else if (i == 1) {
                c2216ni2.f7666du[i6] = dOooO0O0;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m10185k4(C2323um c2323um, byte[] bArr) {
        int i = this.f6979kk;
        this.f6979kk = i + 1;
        byte bM11508k4 = c2323um.m11508k4(i);
        bArr[0] = bM11508k4;
        if (bM11508k4 == 64) {
            C2323um c2323um2 = this.f6981x1;
            int i2 = this.f6979kk;
            this.f6979kk = i2 + 1;
            this.f6979kk += c2323um2.m11508k4(i2) & 255;
            return;
        }
        if (bM11508k4 == 65) {
            C2323um c2323um3 = this.f6981x1;
            int i3 = this.f6979kk;
            this.f6979kk = i3 + 1;
            this.f6979kk = ((c2323um3.m11508k4(i3) & 255) * 2) + this.f6979kk;
            return;
        }
        switch (bM11508k4) {
            case -80:
                this.f6979kk++;
                break;
            case -79:
                this.f6979kk += 2;
                break;
            case -78:
                this.f6979kk += 3;
                break;
            case -77:
                this.f6979kk += 4;
                break;
            case -76:
                this.f6979kk += 5;
                break;
            case -75:
                this.f6979kk += 6;
                break;
            case -74:
                this.f6979kk += 7;
                break;
            case -73:
                this.f6979kk += 8;
                break;
            case -72:
                this.f6979kk += 2;
                break;
            case -71:
                this.f6979kk += 4;
                break;
            case -70:
                this.f6979kk += 6;
                break;
            case -69:
                this.f6979kk += 8;
                break;
            case -68:
                this.f6979kk += 10;
                break;
            case -67:
                this.f6979kk += 12;
                break;
            case -66:
                this.f6979kk += 14;
                break;
            case -65:
                this.f6979kk += 16;
                break;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m10186k4(double[] dArr) {
        if (m10187k4(dArr[0])) {
            if (dArr[0] >= 0.0d) {
                dArr[0] = this.f6978k4.f8104yj;
            } else {
                dArr[0] = -this.f6978k4.f8104yj;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m10187k4(double d) {
        return C14116yg.m67475k4(d - this.f6978k4.f8104yj) < this.f6978k4.f8091ks;
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m10188k4(int i, int i2, boolean[] zArr, int[] iArr) {
        while (i <= i2) {
            if (zArr[i]) {
                iArr[0] = i;
                return true;
            }
            i++;
        }
        iArr[0] = -1;
        return false;
    }
}
