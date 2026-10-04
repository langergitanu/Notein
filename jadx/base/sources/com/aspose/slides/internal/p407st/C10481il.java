package com.aspose.slides.internal.p407st;

import com.aspose.slides.PptReadException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14106wy;
import com.aspose.slides.p559ms.System.C14042ak;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.il */
/* JADX INFO: loaded from: classes4.dex */
public class C10481il {

    /* JADX INFO: renamed from: u4 */
    private int f37079u4 = 0;

    /* JADX INFO: renamed from: uz */
    private int f37081uz = 0;

    /* JADX INFO: renamed from: k4 */
    protected short f37072k4 = 0;

    /* JADX INFO: renamed from: x1 */
    protected int f37082x1 = 65535;

    /* JADX INFO: renamed from: kk */
    protected short f37073kk = 0;

    /* JADX INFO: renamed from: to */
    protected C10661u4 f37078to = null;

    /* JADX INFO: renamed from: du */
    protected int f37066du = 0;

    /* JADX INFO: renamed from: h4 */
    protected short f37069h4 = 0;

    /* JADX INFO: renamed from: m9 */
    protected short f37075m9 = 0;

    /* JADX INFO: renamed from: dy */
    protected short f37067dy = 0;

    /* JADX INFO: renamed from: c5 */
    protected short f37064c5 = 0;

    /* JADX INFO: renamed from: jd */
    protected short f37071jd = 0;

    /* JADX INFO: renamed from: ck */
    protected short f37065ck = 0;

    /* JADX INFO: renamed from: fa */
    protected C10475i3 f37068fa = null;

    /* JADX INFO: renamed from: up */
    protected int f37080up = 0;

    /* JADX INFO: renamed from: yj */
    protected int f37084yj = 0;

    /* JADX INFO: renamed from: ks */
    protected int f37074ks = 0;

    /* JADX INFO: renamed from: rv */
    protected short f37077rv = -1;

    /* JADX INFO: renamed from: x6 */
    protected boolean f37083x6 = false;

    /* JADX INFO: renamed from: ne */
    protected C10405dn f37076ne = new C10405dn();

    /* JADX INFO: renamed from: ix */
    protected int[] f37070ix = {1, 2, 4, 8};

    /* JADX INFO: renamed from: du */
    private int m50932du(int i) {
        int i2 = ((int) ((((long) i) & 4294967295L) << 17)) & 917504;
        if (i2 != 0) {
            return i2;
        }
        throw new InvalidOperationException();
    }

    /* JADX INFO: renamed from: to */
    private int m50933to(int i) {
        int i2 = i & 15;
        if (i2 != 0) {
            return i2;
        }
        throw new InvalidOperationException();
    }

    /* JADX INFO: renamed from: ar */
    public final boolean m50934ar() {
        return this.f37079u4 == 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50935k4(int i, byte b) {
        int iM50933to = m50933to(i);
        if (b == -1) {
            this.f37079u4 = (this.f37079u4 | iM50933to) ^ iM50933to;
            return;
        }
        this.f37079u4 = iM50933to | this.f37079u4;
        int i2 = this.f37081uz | i;
        this.f37081uz = i2;
        if (b == 0) {
            this.f37081uz = i ^ i2;
        }
    }

    /* JADX INFO: renamed from: kk */
    public final byte m50943kk(int i) {
        if (m50942k4(m50932du(i))) {
            return (i & this.f37084yj) != 0 ? (byte) 1 : (byte) 0;
        }
        return (byte) -1;
    }

    /* JADX INFO: renamed from: qq */
    public final int m50945qq() {
        if (m50942k4(4193791)) {
            iM50902k4 = m50942k4(15) ? 6 : 4;
            if (m50942k4(128)) {
                iM50902k4 += 2;
            }
            if (m50942k4(16)) {
                iM50902k4 += 2;
            }
            if (m50942k4(64)) {
                iM50902k4 += 2;
            }
            if (m50942k4(32)) {
                iM50902k4 += 4;
            }
            if (m50942k4(2048)) {
                iM50902k4 += 2;
            }
            if (m50942k4(4096)) {
                iM50902k4 += 2;
            }
            if (m50942k4(8192)) {
                iM50902k4 += 2;
            }
            if (m50942k4(16384)) {
                iM50902k4 += 2;
            }
            if (m50942k4(256)) {
                iM50902k4 += 2;
            }
            if (m50942k4(1024)) {
                iM50902k4 += 2;
            }
            if (m50942k4(32768)) {
                iM50902k4 += 2;
            }
            if (m50942k4(1048576)) {
                iM50902k4 += this.f37068fa.m50902k4();
            }
            if (m50942k4(65536)) {
                iM50902k4 += 2;
            }
            if (m50942k4(917504)) {
                iM50902k4 += 2;
            }
            if (m50942k4(2097152)) {
                iM50902k4 += 2;
            }
        }
        if (m50942k4(58720256)) {
            if (m50942k4(8388608)) {
                iM50902k4 += 2;
            }
            if (m50942k4(33554432)) {
                iM50902k4 += 2;
            }
            if (m50942k4(16777216)) {
                return this.f37076ne.m50694kk() + iM50902k4;
            }
        }
        return iM50902k4;
    }

    public String toString() {
        C6765kp c6765kp = new C6765kp();
        c6765kp.m26810x1(C14113y2.m67402k4("  PFMask: 0x{0:X}, {1}", Long.valueOf(((long) this.f37079u4) & 4294967295L), C14042ak.m66410k4(C10437fc.class, this.f37079u4)));
        if (m50942k4(4193791)) {
            if (m50942k4(15)) {
                c6765kp.m26810x1(C14113y2.m67402k4("  Bulletflags   : 0x{0:X}, {1}", Integer.valueOf(this.f37081uz & 65535), C14042ak.m66410k4(C10540mc.class, this.f37081uz)));
                if (m50942k4(1)) {
                    c6765kp.m26810x1(C14113y2.m67402k4("  HasBullet     : {0}", Boolean.valueOf(m50947x1(1) == 1)));
                }
                if (m50942k4(2)) {
                    c6765kp.m26810x1(C14113y2.m67402k4("  BulletHasFont : {0}", Boolean.valueOf(m50947x1(2) == 1)));
                }
                if (m50942k4(4)) {
                    c6765kp.m26810x1(C14113y2.m67402k4("  BulletHasColor: {0}", Boolean.valueOf(m50947x1(4) == 1)));
                }
                if (m50942k4(8)) {
                    c6765kp.m26810x1(C14113y2.m67402k4("  BulletHasSize : {0}", Boolean.valueOf(m50947x1(8) == 1)));
                }
            }
            if (m50942k4(128)) {
                c6765kp.m26810x1(C14113y2.m67402k4("  BulletChar: {0}", Short.valueOf(this.f37072k4)));
            }
            if (m50942k4(16)) {
                c6765kp.m26810x1(C14113y2.m67402k4("  BulletFontRef: {0}", Integer.valueOf(this.f37082x1)));
            }
            if (m50942k4(64)) {
                c6765kp.m26810x1(C14113y2.m67402k4("  BulletSize: {0}", Short.valueOf(this.f37073kk)));
            }
            if (m50942k4(32)) {
                c6765kp.m26810x1(C14113y2.m67402k4("  BulletColor: {0}", this.f37078to));
            }
            if (m50942k4(2048)) {
                c6765kp.m26810x1(C14113y2.m67402k4("  TextAlignment: {0}", C14042ak.m66410k4(C10512ko.class, this.f37066du)));
            }
            if (m50942k4(4096)) {
                c6765kp.m26810x1(C14113y2.m67402k4("  LineSpacing: {0}", Short.valueOf(this.f37069h4)));
            }
            if (m50942k4(8192)) {
                c6765kp.m26810x1(C14113y2.m67402k4("  SpaceBefore: {0}", Short.valueOf(this.f37075m9)));
            }
            if (m50942k4(16384)) {
                c6765kp.m26810x1(C14113y2.m67402k4("  SpaceAfter: {0}", Short.valueOf(this.f37067dy)));
            }
            if (m50942k4(256)) {
                c6765kp.m26810x1(C14113y2.m67402k4("  LeftMargin: {0}", Short.valueOf(this.f37064c5)));
            }
            if (m50942k4(1024)) {
                c6765kp.m26810x1(C14113y2.m67402k4("  Indent: {0}", Short.valueOf(this.f37071jd)));
            }
            if (m50942k4(32768)) {
                c6765kp.m26810x1(C14113y2.m67402k4("  DefaultTabSize: {0}", Short.valueOf(this.f37065ck)));
            }
            if (m50942k4(1048576)) {
                c6765kp.m26810x1(C14113y2.m67402k4("  TabStops: {0}", this.f37068fa));
            }
            if (m50942k4(65536)) {
                c6765kp.m26810x1(C14113y2.m67402k4("  FontAlign: {0}", C14042ak.m66410k4(C10748zd.class, this.f37080up)));
            }
            if (m50942k4(917504)) {
                c6765kp.m26810x1(C14113y2.m67402k4("  Wrapflags   : 0x{0:X}, {1}", Integer.valueOf(this.f37084yj & 65535), C14042ak.m66410k4(C10353ae.class, this.f37084yj)));
                if (m50942k4(131072)) {
                    c6765kp.m26810x1(C14113y2.m67402k4("  CharWrap: {0}", Boolean.valueOf(m50943kk(1) == 1)));
                }
                if (m50942k4(262144)) {
                    c6765kp.m26810x1(C14113y2.m67402k4("  WordWrap: {0}", Boolean.valueOf(m50943kk(2) == 1)));
                }
                if (m50942k4(524288)) {
                    c6765kp.m26810x1(C14113y2.m67402k4("  Overfow: {0}", Boolean.valueOf(m50943kk(4) == 1)));
                }
            }
            if (m50942k4(2097152)) {
                c6765kp.m26792k4(C14113y2.m67402k4("  TextDirection: {0}", C14042ak.m66410k4(C10615qy.class, this.f37074ks)));
            }
        }
        if (m50942k4(58720256)) {
            if (m50942k4(8388608)) {
                c6765kp.m26810x1(C14113y2.m67402k4("  BulletBlip: {0}", Short.valueOf(this.f37077rv)));
            }
            if (m50942k4(33554432)) {
                c6765kp.m26810x1(C14113y2.m67402k4("  BulletHasScheme: {0}", Boolean.valueOf(this.f37083x6)));
            }
            if (m50942k4(16777216)) {
                c6765kp.m26810x1(C14113y2.m67402k4("  BulletScheme: {0}", this.f37076ne.toString()));
            }
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: um */
    public final boolean m50946um() {
        return m50942k4(1082624);
    }

    /* JADX INFO: renamed from: x1 */
    public final byte m50947x1(int i) {
        if (m50942k4(m50933to(i))) {
            return (i & this.f37081uz) != 0 ? (byte) 1 : (byte) 0;
        }
        return (byte) -1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50936k4(int i, boolean z) {
        int i2 = this.f37079u4 | i;
        this.f37079u4 = i2;
        if (z) {
            return;
        }
        this.f37079u4 = i ^ i2;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m50944kk(C10481il c10481il) {
        int i = this.f37079u4;
        if (i != c10481il.f37079u4) {
            return false;
        }
        if (i == 0) {
            return true;
        }
        if (m50942k4(15) && this.f37081uz != c10481il.f37081uz) {
            return false;
        }
        if (m50942k4(128) && this.f37072k4 != c10481il.f37072k4) {
            return false;
        }
        if (m50942k4(16) && (this.f37082x1 & 65535) != (65535 & c10481il.f37082x1)) {
            return false;
        }
        if (m50942k4(64) && this.f37073kk != c10481il.f37073kk) {
            return false;
        }
        if (m50942k4(32) && (this.f37078to.m51792kk() & 4294967295L) != (4294967295L & c10481il.f37078to.m51792kk())) {
            return false;
        }
        if (m50942k4(2048) && this.f37066du != c10481il.f37066du) {
            return false;
        }
        if (m50942k4(4096) && this.f37069h4 != c10481il.f37069h4) {
            return false;
        }
        if (m50942k4(8192) && this.f37075m9 != c10481il.f37075m9) {
            return false;
        }
        if (m50942k4(16384) && this.f37067dy != c10481il.f37067dy) {
            return false;
        }
        if (m50942k4(256) && this.f37064c5 != c10481il.f37064c5) {
            return false;
        }
        if (m50942k4(1024) && this.f37071jd != c10481il.f37071jd) {
            return false;
        }
        if (m50942k4(32768) && this.f37065ck != c10481il.f37065ck) {
            return false;
        }
        if (m50942k4(1048576) && !this.f37068fa.m50906k4(c10481il.f37068fa)) {
            return false;
        }
        if (m50942k4(65536) && this.f37080up != c10481il.f37080up) {
            return false;
        }
        if (m50942k4(917504) && this.f37084yj != c10481il.f37084yj) {
            return false;
        }
        if (m50942k4(2097152) && this.f37074ks != c10481il.f37074ks) {
            return false;
        }
        if (m50942k4(8388608) && this.f37077rv != c10481il.f37077rv) {
            return false;
        }
        if (!m50942k4(33554432) || this.f37083x6 == c10481il.f37083x6) {
            return !m50942k4(16777216) || this.f37076ne.m50693k4(c10481il.f37076ne);
        }
        return false;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m50948x1(int i, byte b) {
        int iM50932du = m50932du(i);
        if (b == -1) {
            this.f37079u4 = (this.f37079u4 | iM50932du) ^ iM50932du;
            return;
        }
        this.f37079u4 = iM50932du | this.f37079u4;
        int i2 = this.f37084yj | i;
        this.f37084yj = i2;
        if (b == 0) {
            this.f37084yj = i ^ i2;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50937k4(long j) {
    }

    /* JADX INFO: renamed from: x1 */
    public void m50949x1(C10481il c10481il) {
        if (c10481il == null) {
            return;
        }
        int i = c10481il.f37079u4;
        int i2 = i ^ (this.f37079u4 & i);
        if ((4193791 & i2) != 0) {
            if ((i2 & 15) != 0) {
                for (int i3 : this.f37070ix) {
                    if (m50947x1(i3) == -1) {
                        m50935k4(i3, c10481il.m50947x1(i3));
                    }
                }
            }
            if ((i2 & 128) != 0) {
                this.f37072k4 = c10481il.f37072k4;
            }
            if (m50947x1(2) != 0 && (i2 & 16) != 0) {
                this.f37082x1 = c10481il.f37082x1;
            }
            if ((i2 & 64) != 0) {
                this.f37073kk = c10481il.f37073kk;
            }
            if ((i2 & 32) != 0) {
                this.f37078to = c10481il.f37078to;
            }
            if ((i2 & 2048) != 0) {
                this.f37066du = c10481il.f37066du;
            }
            if ((i2 & 4096) != 0) {
                this.f37069h4 = c10481il.f37069h4;
            }
            if ((i2 & 8192) != 0) {
                this.f37075m9 = c10481il.f37075m9;
            }
            if ((i2 & 16384) != 0) {
                this.f37067dy = c10481il.f37067dy;
            }
            if ((i2 & 256) != 0) {
                this.f37064c5 = c10481il.f37064c5;
            }
            if ((i2 & 1024) != 0) {
                this.f37071jd = c10481il.f37071jd;
            }
            if ((32768 & i2) != 0) {
                this.f37065ck = c10481il.f37065ck;
            }
            if ((1048576 & i2) != 0) {
                this.f37068fa = c10481il.f37068fa;
            }
            if ((65536 & i2) != 0) {
                this.f37080up = c10481il.f37080up;
            }
            if ((917504 & i2) != 0) {
                this.f37084yj = c10481il.f37084yj;
            }
            if ((2097152 & i2) != 0) {
                this.f37074ks = c10481il.f37074ks;
            }
        }
        if ((58720256 & i2) != 0) {
            if ((8388608 & i2) != 0) {
                this.f37077rv = c10481il.f37077rv;
            }
            if ((33554432 & i2) != 0) {
                this.f37083x6 = c10481il.f37083x6;
            }
            if ((i2 & 16777216) != 0) {
                this.f37076ne = c10481il.f37076ne;
            }
        }
        this.f37079u4 = c10481il.f37079u4 | this.f37079u4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50938k4(C3134k4 c3134k4) {
        this.f37079u4 = (int) c3134k4.m13384uz();
        if (m50942k4(4193791)) {
            if (m50942k4(15)) {
                this.f37081uz = c3134k4.m13382u4() & 65535;
            }
            if (m50942k4(128)) {
                this.f37072k4 = c3134k4.m13381rv();
            }
            if (m50942k4(16)) {
                this.f37082x1 = c3134k4.m13382u4();
            }
            if (m50942k4(64)) {
                this.f37073kk = c3134k4.m13381rv();
            }
            if (m50942k4(32)) {
                this.f37078to = new C10661u4(c3134k4.m13384uz());
            }
            if (m50942k4(2048)) {
                int iM13382u4 = c3134k4.m13382u4() & 65535;
                if (!AbstractC14106wy.isDefined(C7019kk.m27443k4((Class<?>) C10512ko.class), iM13382u4)) {
                    throw new PptReadException("[ms-ppt] 2.9.20 TextPFException contains wrong value in textAlignment field which is not present in 2.13.27 TextAlignmentEnum enumeration.");
                }
                this.f37066du = iM13382u4;
            }
            if (m50942k4(4096)) {
                this.f37069h4 = c3134k4.m13381rv();
            }
            if (m50942k4(8192)) {
                this.f37075m9 = c3134k4.m13381rv();
            }
            if (m50942k4(16384)) {
                this.f37067dy = c3134k4.m13381rv();
            }
            if (m50942k4(256)) {
                this.f37064c5 = c3134k4.m13381rv();
            }
            if (m50942k4(1024)) {
                this.f37071jd = c3134k4.m13381rv();
            }
            if (m50942k4(32768)) {
                this.f37065ck = c3134k4.m13381rv();
            }
            if (m50942k4(1048576)) {
                this.f37068fa = new C10475i3(c3134k4);
            }
            if (m50942k4(65536)) {
                int iM13382u42 = c3134k4.m13382u4() & 65535;
                if (!AbstractC14106wy.isDefined(C7019kk.m27443k4((Class<?>) C10748zd.class), iM13382u42)) {
                    throw new PptReadException("[ms-ppt] 2.9.20 TextPFException contains wrong value in fontAlign field which is not present in 2.13.31 TextFontAlignmentEnum enumeration.");
                }
                this.f37080up = iM13382u42;
            }
            if (m50942k4(917504)) {
                this.f37084yj = c3134k4.m13382u4() & 65535;
            }
            if (m50942k4(2097152)) {
                int iM13382u43 = c3134k4.m13382u4() & 65535;
                if (!AbstractC14106wy.isDefined(C7019kk.m27443k4((Class<?>) C10615qy.class), iM13382u43)) {
                    throw new PptReadException("[ms-ppt] 2.9.20 TextPFException contains wrong value in textDirection field which is not present in 2.13.30 TextDirectionEnum enumeration.");
                }
                this.f37074ks = iM13382u43;
            }
        }
        if (m50942k4(58720256)) {
            if (m50942k4(8388608)) {
                this.f37077rv = c3134k4.m13381rv();
            }
            if (m50942k4(33554432)) {
                this.f37083x6 = c3134k4.m13381rv() != 0;
            }
            if (m50942k4(16777216)) {
                this.f37076ne.m50691k4(c3134k4);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50939k4(C3149x1 c3149x1) {
        c3149x1.m13447k4(((long) this.f37079u4) & 4294967295L);
        if (m50942k4(4193791)) {
            if (m50942k4(15)) {
                c3149x1.m13446k4(this.f37081uz & 65535);
            }
            if (m50942k4(128)) {
                c3149x1.m13448k4(this.f37072k4);
            }
            if (m50942k4(16)) {
                c3149x1.m13446k4(this.f37082x1);
            }
            if (m50942k4(64)) {
                c3149x1.m13448k4(this.f37073kk);
            }
            if (m50942k4(32)) {
                c3149x1.m13447k4(this.f37078to.m51792kk());
            }
            if (m50942k4(2048)) {
                c3149x1.m13446k4(this.f37066du & 65535);
            }
            if (m50942k4(4096)) {
                c3149x1.m13448k4(this.f37069h4);
            }
            if (m50942k4(8192)) {
                c3149x1.m13448k4(this.f37075m9);
            }
            if (m50942k4(16384)) {
                c3149x1.m13448k4(this.f37067dy);
            }
            if (m50942k4(256)) {
                c3149x1.m13448k4(this.f37064c5);
            }
            if (m50942k4(1024)) {
                c3149x1.m13448k4(this.f37071jd);
            }
            if (m50942k4(32768)) {
                c3149x1.m13448k4(this.f37065ck);
            }
            if (m50942k4(1048576)) {
                this.f37068fa.m50905k4(c3149x1);
            }
            if (m50942k4(65536)) {
                c3149x1.m13446k4(this.f37080up & 65535);
            }
            if (m50942k4(917504)) {
                c3149x1.m13446k4(this.f37084yj & 65535);
            }
            if (m50942k4(2097152)) {
                c3149x1.m13446k4(this.f37074ks & 65535);
            }
        }
        if (m50942k4(58720256)) {
            if (m50942k4(8388608)) {
                c3149x1.m13448k4(this.f37077rv);
            }
            if (m50942k4(33554432)) {
                c3149x1.m13446k4((this.f37083x6 ? 1 : 0) & 65535);
            }
            if (m50942k4(16777216)) {
                this.f37076ne.m50692k4(c3149x1);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void mo50940k4(C10481il c10481il) {
        if (c10481il == null) {
            return;
        }
        int i = c10481il.f37079u4 & this.f37079u4;
        if ((4193791 & i) != 0) {
            if ((i & 15) != 0) {
                if (this.f37081uz != c10481il.f37081uz) {
                    int i2 = 0;
                    while (true) {
                        int[] iArr = this.f37070ix;
                        if (i2 >= iArr.length) {
                            break;
                        }
                        byte bM50947x1 = m50947x1(iArr[i2]);
                        byte bM50947x12 = c10481il.m50947x1(this.f37070ix[i2]);
                        if (bM50947x1 != -1 && bM50947x1 == bM50947x12) {
                            m50935k4(this.f37070ix[i2], (byte) -1);
                        }
                        i2++;
                    }
                } else {
                    m50936k4(15, false);
                }
            }
            if ((i & 128) != 0 && this.f37072k4 == c10481il.f37072k4) {
                m50936k4(128, false);
            }
            if ((i & 16) != 0 && this.f37082x1 == c10481il.f37082x1) {
                m50936k4(16, false);
            }
            if ((i & 64) != 0 && this.f37073kk == c10481il.f37073kk) {
                m50936k4(64, false);
            }
            if ((i & 32) != 0 && this.f37078to == c10481il.f37078to) {
                m50936k4(32, false);
            }
            if ((i & 2048) != 0 && this.f37066du == c10481il.f37066du) {
                m50936k4(2048, false);
            }
            if ((i & 4096) != 0 && this.f37069h4 == c10481il.f37069h4) {
                m50936k4(4096, false);
            }
            if ((i & 8192) != 0 && this.f37075m9 == c10481il.f37075m9) {
                m50936k4(8192, false);
            }
            if ((i & 16384) != 0 && this.f37067dy == c10481il.f37067dy) {
                m50936k4(16384, false);
            }
            if ((i & 256) != 0 && this.f37064c5 == c10481il.f37064c5) {
                m50936k4(256, false);
            }
            if ((i & 1024) != 0 && this.f37071jd == c10481il.f37071jd) {
                m50936k4(1024, false);
            }
            if ((i & 32768) != 0 && this.f37065ck == c10481il.f37065ck) {
                m50936k4(32768, false);
            }
            if ((i & 1048576) != 0 && this.f37068fa == c10481il.f37068fa) {
                m50936k4(1048576, false);
            }
            if ((i & 65536) != 0 && this.f37080up == c10481il.f37080up) {
                m50936k4(65536, false);
            }
            if ((i & 917504) != 0 && this.f37084yj == c10481il.f37084yj) {
                m50936k4(917504, false);
            }
            if ((i & 2097152) == 0 || this.f37074ks != c10481il.f37074ks) {
                return;
            }
            m50936k4(2097152, false);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50941k4(boolean z) {
        if (z) {
            return;
        }
        m50936k4(1082624, false);
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m50942k4(int i) {
        return (i & this.f37079u4) != 0;
    }
}
