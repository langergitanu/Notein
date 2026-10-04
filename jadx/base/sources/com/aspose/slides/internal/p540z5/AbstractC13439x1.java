package com.aspose.slides.internal.p540z5;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p185il.C5103kk;
import com.aspose.slides.internal.p291n4.C6740x1;
import com.aspose.slides.internal.p299ni.InterfaceC6901du;
import com.aspose.slides.internal.p299ni.InterfaceC6906k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p383rp.AbstractC10036kk;
import com.aspose.slides.internal.p385rr.C10052k4;
import com.aspose.slides.internal.p550zi.C13594c5;
import com.aspose.slides.internal.p550zi.C13595ck;
import com.aspose.slides.internal.p550zi.C13611to;
import com.aspose.slides.internal.p550zi.C13619x1;
import com.aspose.slides.p559ms.System.C14069jd;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import java.awt.Color;

/* JADX INFO: renamed from: com.aspose.slides.internal.z5.x1 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC13439x1 extends AbstractC10036kk {

    /* JADX INFO: renamed from: com.aspose.slides.internal.z5.x1$c5 */
    public static class c5 extends jd {

        /* JADX INFO: renamed from: jd */
        private final int f44994jd;

        public c5(int i, int i2, int i3, int i4) {
            super(i, i2, i3);
            this.f44994jd = i4;
        }

        @Override // com.aspose.slides.internal.p540z5.AbstractC13439x1.m9
        /* JADX INFO: renamed from: k4 */
        public void mo62538k4(int[] iArr, int i, int i2) {
            int i3 = 0;
            while (i3 < i2) {
                int i4 = i + 1;
                int i5 = iArr[i];
                byte b = (byte) (i5 >> 24);
                byte b2 = (byte) ((i5 >> 16) & 255);
                byte b3 = (byte) ((i5 >> 8) & 255);
                byte b4 = (byte) (i5 & 255);
                byte[] bArr = this.f45009kk;
                int i6 = this.f45011to;
                bArr[i6] = (byte) ((b2 & 255) - (((jd) this).f45001h4 & 255));
                bArr[i6 + 1] = (byte) ((b3 & 255) - (((jd) this).f45002m9 & 255));
                bArr[i6 + 2] = (byte) ((b4 & 255) - (((jd) this).f45000dy & 255));
                bArr[i6 + 3] = (byte) ((b & 255) - (this.f44999c5 & 255));
                this.f45011to = i6 + this.f44994jd;
                this.f44999c5 = b;
                ((jd) this).f45001h4 = b2;
                ((jd) this).f45002m9 = b3;
                ((jd) this).f45000dy = b4;
                i3++;
                i = i4;
            }
            m62539k4(i2);
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.z5.x1$ck */
    public static class ck extends m9 {

        /* JADX INFO: renamed from: h4 */
        private final int f44995h4;

        public ck(int i, int i2, int i3, int i4, int i5) {
            super(i, i2, i3, i5);
            this.f44995h4 = i4;
        }

        @Override // com.aspose.slides.internal.p540z5.AbstractC13439x1.m9
        /* JADX INFO: renamed from: k4 */
        public void mo62538k4(int[] iArr, int i, int i2) {
            int i3 = 0;
            while (i3 < i2) {
                int i4 = i + 1;
                int i5 = iArr[i];
                byte[] bArr = this.f45009kk;
                int i6 = this.f45011to;
                bArr[i6] = (byte) ((i5 >> 16) & 255);
                bArr[i6 + 1] = (byte) ((i5 >> 8) & 255);
                bArr[i6 + 2] = (byte) (i5 & 255);
                bArr[i6 + 3] = (byte) (i5 >> 24);
                this.f45011to = i6 + this.f44995h4;
                i3++;
                i = i4;
            }
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.z5.x1$du */
    public static class du extends m9 {

        /* JADX INFO: renamed from: h4 */
        private final InterfaceC6901du f44996h4;

        public du(int i, int i2, int i3, InterfaceC6901du interfaceC6901du) {
            super(i, i2, i3, 8);
            if (interfaceC6901du == null) {
                throw new ArgumentNullException("palette");
            }
            this.f44996h4 = interfaceC6901du;
        }

        @Override // com.aspose.slides.internal.p540z5.AbstractC13439x1.m9
        /* JADX INFO: renamed from: k4 */
        public void mo62538k4(int[] iArr, int i, int i2) {
            int i3 = 0;
            while (i3 < i2) {
                int i4 = i + 1;
                byte bMo27030k4 = (byte) this.f44996h4.mo27030k4(iArr[i]);
                byte[] bArr = this.f45009kk;
                int i5 = this.f45011to;
                this.f45011to = i5 + 1;
                bArr[i5] = bMo27030k4;
                i3++;
                i = i4;
            }
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.z5.x1$dy */
    public static class dy extends jd {
        public dy(int i, int i2) {
            super(i, i2, 24);
        }

        @Override // com.aspose.slides.internal.p540z5.AbstractC13439x1.m9
        /* JADX INFO: renamed from: k4 */
        public void mo62538k4(int[] iArr, int i, int i2) {
            int i3 = 0;
            while (i3 < i2) {
                int i4 = i + 1;
                int i5 = iArr[i];
                byte b = (byte) ((i5 >> 16) & 255);
                byte b2 = (byte) ((i5 >> 8) & 255);
                byte b3 = (byte) (i5 & 255);
                byte[] bArr = this.f45009kk;
                int i6 = this.f45011to;
                bArr[i6] = (byte) ((b & 255) - (((jd) this).f45001h4 & 255));
                bArr[i6 + 1] = (byte) ((b2 & 255) - (((jd) this).f45002m9 & 255));
                bArr[i6 + 2] = (byte) ((b3 & 255) - (((jd) this).f45000dy & 255));
                this.f45011to = i6 + 3;
                ((jd) this).f45001h4 = b;
                ((jd) this).f45002m9 = b2;
                ((jd) this).f45000dy = b3;
                i3++;
                i = i4;
            }
            m62539k4(i2);
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.z5.x1$fa */
    public static class fa extends m9 {
        public fa(int i, int i2, int i3) {
            super(i, i2, i3, 24);
        }

        @Override // com.aspose.slides.internal.p540z5.AbstractC13439x1.m9
        /* JADX INFO: renamed from: k4 */
        public void mo62538k4(int[] iArr, int i, int i2) {
            int i3 = 0;
            while (i3 < i2) {
                int i4 = i + 1;
                int i5 = iArr[i];
                byte[] bArr = this.f45009kk;
                int i6 = this.f45011to;
                int i7 = i6 + 1;
                this.f45011to = i7;
                bArr[i6] = (byte) ((i5 >> 16) & 255);
                int i8 = i6 + 2;
                this.f45011to = i8;
                bArr[i7] = (byte) ((i5 >> 8) & 255);
                this.f45011to = i6 + 3;
                bArr[i8] = (byte) (i5 & 255);
                i3++;
                i = i4;
            }
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.z5.x1$h4 */
    public static class h4 extends m9 {

        /* JADX INFO: renamed from: h4 */
        private final InterfaceC6901du f44997h4;

        /* JADX INFO: renamed from: m9 */
        private byte f44998m9;

        public h4(int i, int i2, InterfaceC6901du interfaceC6901du) {
            super(i, i2, 1, 8);
            if (interfaceC6901du == null) {
                throw new ArgumentNullException("palette");
            }
            this.f44997h4 = interfaceC6901du;
        }

        @Override // com.aspose.slides.internal.p540z5.AbstractC13439x1.m9
        /* JADX INFO: renamed from: k4 */
        public void mo62538k4(int[] iArr, int i, int i2) {
            int i3 = 0;
            while (i3 < i2) {
                int i4 = i + 1;
                byte bMo27030k4 = (byte) this.f44997h4.mo27030k4(iArr[i]);
                byte[] bArr = this.f45009kk;
                int i5 = this.f45011to;
                this.f45011to = i5 + 1;
                bArr[i5] = (byte) ((bMo27030k4 & 255) - (this.f44998m9 & 255));
                this.f44998m9 = bMo27030k4;
                i3++;
                i = i4;
            }
            if (this.f45012x1 - i2 == 0) {
                this.f44998m9 = (byte) 0;
            }
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.z5.x1$jd */
    public static abstract class jd extends m9 {

        /* JADX INFO: renamed from: c5 */
        protected byte f44999c5;

        /* JADX INFO: renamed from: dy */
        protected byte f45000dy;

        /* JADX INFO: renamed from: h4 */
        protected byte f45001h4;

        /* JADX INFO: renamed from: m9 */
        protected byte f45002m9;

        public jd(int i, int i2, int i3) {
            super(i, i2, 1, i3);
            this.f45012x1 = i;
        }

        /* JADX INFO: renamed from: k4 */
        public void m62539k4(int i) {
            if (this.f45012x1 - i == 0) {
                this.f44999c5 = (byte) 0;
                this.f45001h4 = (byte) 0;
                this.f45002m9 = (byte) 0;
                this.f45000dy = (byte) 0;
            }
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.z5.x1$k4 */
    public static class k4 extends m9 {

        /* JADX INFO: renamed from: h4 */
        private final InterfaceC6901du f45003h4;

        public k4(int i, int i2, int i3, InterfaceC6901du interfaceC6901du) {
            super(i, i2, i3, 16);
            if (interfaceC6901du == null) {
                throw new ArgumentNullException("palette");
            }
            this.f45003h4 = interfaceC6901du;
        }

        @Override // com.aspose.slides.internal.p540z5.AbstractC13439x1.m9
        /* JADX INFO: renamed from: k4 */
        public void mo62538k4(int[] iArr, int i, int i2) {
            int i3 = 0;
            while (i3 < i2) {
                C13611to.m62798x1(this.f45003h4.mo27030k4(iArr[i]) & 65535, this.f45009kk, this.f45011to);
                this.f45011to += 2;
                i3++;
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.z5.x1$kk */
    public static class kk extends m9 {

        /* JADX INFO: renamed from: h4 */
        private final InterfaceC6901du f45004h4;

        public kk(int i, int i2, int i3, InterfaceC6901du interfaceC6901du) {
            super(i, i2, i3, 1);
            if (interfaceC6901du == null) {
                throw new ArgumentNullException("palette");
            }
            this.f45004h4 = interfaceC6901du;
        }

        @Override // com.aspose.slides.internal.p540z5.AbstractC13439x1.m9
        /* JADX INFO: renamed from: k4 */
        public void mo62538k4(int[] iArr, int i, int i2) {
            while (i2 > 0) {
                int iM67507x1 = C14116yg.m67507x1(this.f45005du + 1, i2);
                byte b = this.f45009kk[this.f45011to];
                int i3 = 0;
                while (i3 < iM67507x1) {
                    int i4 = i + 1;
                    int iMo27030k4 = this.f45004h4.mo27030k4(iArr[i]);
                    int i5 = this.f45005du;
                    byte b2 = (byte) (1 << i5);
                    b = (byte) (iMo27030k4 == 1 ? (b & 255) | (b2 & 255) : b & 255 & ((byte) (~(b2 & 255))) & 255);
                    this.f45005du = i5 - 1;
                    i3++;
                    i = i4;
                }
                byte[] bArr = this.f45009kk;
                int i6 = this.f45011to;
                bArr[i6] = b;
                i2 -= iM67507x1;
                if (this.f45005du < 0) {
                    this.f45005du = 7;
                    this.f45011to = i6 + 1;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.z5.x1$m9 */
    public static abstract class m9 {

        /* JADX INFO: renamed from: du */
        protected int f45005du = 7;

        /* JADX INFO: renamed from: dy */
        private int f45006dy;

        /* JADX INFO: renamed from: h4 */
        private int f45007h4;

        /* JADX INFO: renamed from: k4 */
        protected final int f45008k4;

        /* JADX INFO: renamed from: kk */
        protected final byte[] f45009kk;

        /* JADX INFO: renamed from: m9 */
        private final int f45010m9;

        /* JADX INFO: renamed from: to */
        protected int f45011to;

        /* JADX INFO: renamed from: x1 */
        protected int f45012x1;

        public m9(int i, int i2, int i3, int i4) {
            this.f45010m9 = i4;
            this.f45008k4 = i;
            this.f45006dy = i3;
            this.f45007h4 = i2;
            if ((i * i4) % 8 != 0) {
                this.f45006dy = 1;
            }
            this.f45012x1 = i * this.f45006dy;
            byte[] bArrM62865k4 = C13619x1.m62865k4(((r3 + 7) / 8) * r4);
            this.f45009kk = bArrM62865k4;
            if ((bArrM62865k4.length * 8) / i4 == 0) {
                throw new C5103kk("The buffer allocated is too small. Cannot continue execution.");
            }
        }

        /* JADX INFO: renamed from: k4 */
        private int m62540k4(int i) {
            return C14116yg.m67507x1(C14116yg.m67507x1(i, (((this.f45009kk.length - this.f45011to) * 8) - (7 - this.f45005du)) / this.f45010m9), this.f45012x1);
        }

        /* JADX INFO: renamed from: k4 */
        public abstract void mo62538k4(int[] iArr, int i, int i2);

        /* JADX INFO: renamed from: k4 */
        public void m62541k4(int[] iArr, InterfaceC6906k4 interfaceC6906k4) {
            int length = iArr.length;
            int length2 = this.f45009kk.length;
            int iM62540k4 = m62540k4(length);
            int i = 0;
            while (iM62540k4 > 0) {
                mo62538k4(iArr, i, iM62540k4);
                i += iM62540k4;
                int i2 = this.f45012x1 - iM62540k4;
                this.f45012x1 = i2;
                int i3 = this.f45011to;
                int i4 = this.f45005du;
                int i5 = (((length2 - i3) * 8) - (7 - i4)) / this.f45010m9;
                if (i2 == 0 || i5 == 0) {
                    if (i2 == 0 && i4 != 7) {
                        this.f45011to = i3 + 1;
                    }
                    interfaceC6906k4.mo27041k4(this.f45009kk, this.f45011to);
                    if (this.f45012x1 == 0) {
                        int iM67507x1 = C14116yg.m67507x1(this.f45007h4, this.f45006dy);
                        interfaceC6906k4.mo27038k4(iM67507x1);
                        int i6 = this.f45007h4 - iM67507x1;
                        this.f45007h4 = i6;
                        this.f45012x1 = C14116yg.m67507x1(i6, this.f45006dy) * this.f45008k4;
                        this.f45005du = 7;
                    } else {
                        int i7 = this.f45011to;
                        if (i7 > 0 && i7 < length2 && this.f45005du < 7) {
                            byte[] bArr = this.f45009kk;
                            bArr[0] = bArr[i7];
                        }
                    }
                    this.f45011to = 0;
                }
                iM62540k4 = m62540k4(length - i);
            }
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.z5.x1$to */
    public static class to extends m9 {

        /* JADX INFO: renamed from: h4 */
        private final InterfaceC6901du f45013h4;

        public to(int i, int i2, int i3, InterfaceC6901du interfaceC6901du) {
            super(i, i2, i3, 4);
            if (interfaceC6901du == null) {
                throw new ArgumentNullException("palette");
            }
            this.f45013h4 = interfaceC6901du;
        }

        @Override // com.aspose.slides.internal.p540z5.AbstractC13439x1.m9
        /* JADX INFO: renamed from: k4 */
        public void mo62538k4(int[] iArr, int i, int i2) {
            while (i2 > 0) {
                int iM67507x1 = C14116yg.m67507x1((this.f45005du + 1) / 4, i2);
                byte b = this.f45009kk[this.f45011to];
                int i3 = 0;
                while (i3 < iM67507x1) {
                    int i4 = i + 1;
                    int iMo27030k4 = this.f45013h4.mo27030k4(iArr[i]);
                    int i5 = this.f45005du;
                    int i6 = i5 - 3;
                    b = (byte) ((((byte) (iMo27030k4 << i6)) & 255) | (((byte) (b & 255 & ((byte) (~(15 << i6))) & 255)) & 255));
                    this.f45005du = i5 - 4;
                    i3++;
                    i = i4;
                }
                byte[] bArr = this.f45009kk;
                int i7 = this.f45011to;
                bArr[i7] = b;
                i2 -= iM67507x1;
                if (this.f45005du < 0) {
                    this.f45005du = 7;
                    this.f45011to = i7 + 1;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.z5.x1$x1 */
    public static class x1 extends m9 {

        /* JADX INFO: renamed from: h4 */
        private final InterfaceC6901du f45014h4;

        public x1(int i, int i2, int i3, InterfaceC6901du interfaceC6901du) {
            super(i, i2, i3, 16);
            if (interfaceC6901du == null) {
                throw new ArgumentNullException("palette");
            }
            this.f45014h4 = interfaceC6901du;
        }

        @Override // com.aspose.slides.internal.p540z5.AbstractC13439x1.m9
        /* JADX INFO: renamed from: k4 */
        public void mo62538k4(int[] iArr, int i, int i2) {
            int i3 = 0;
            while (i3 < i2) {
                C10052k4.m49680k4(C14069jd.m66775k4(this.f45014h4.mo27030k4(iArr[i]) & 65535), 0, this.f45009kk, this.f45011to, 2);
                this.f45011to += 2;
                i3++;
                i++;
            }
        }
    }

    public AbstractC13439x1(C6740x1 c6740x1, int i, int i2) {
        super(c6740x1, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009c  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static m9 m62537k4(C6740x1 c6740x1, int i, int i2, int i3) {
        int i4;
        int iM26567ix = c6740x1.m26567ix();
        int[] iArrM26586to = c6740x1.m26586to();
        int iM26556ar = c6740x1.m26556ar();
        if (iArrM26586to == null) {
            throw new ArgumentException("TiffImageException: The bits per sample are not specified");
        }
        int iM26568jd = c6740x1.m26568jd();
        m9 c5Var = null;
        if (iArrM26586to.length == 1) {
            InterfaceC6901du interfaceC6901duMo26569k4 = c6740x1.mo26569k4();
            if (iM26568jd == 3 && interfaceC6901duMo26569k4 == null) {
                throw new ArgumentException("TiffImageException: The palette is not defined for palettized tiff image.");
            }
            if (iM26568jd == 3) {
                i4 = 0;
                if (iM26567ix != 2) {
                    int i5 = iArrM26586to[i4];
                    if (i5 == 1) {
                        c5Var = new kk(i, i2, i3, interfaceC6901duMo26569k4);
                    } else if (i5 == 4) {
                        c5Var = new to(i, i2, i3, interfaceC6901duMo26569k4);
                    } else if (i5 == 8) {
                        c5Var = new du(i, i2, i3, interfaceC6901duMo26569k4);
                    } else if (i5 == 16) {
                        c5Var = iM26568jd == 3 ? new x1(i, i2, i3, interfaceC6901duMo26569k4) : new k4(i, i2, i3, interfaceC6901duMo26569k4);
                    }
                } else if ((iArrM26586to[i4] & 65535) == 8) {
                    c5Var = new h4(i, i2, interfaceC6901duMo26569k4);
                }
            } else {
                int i6 = iArrM26586to[0];
                if (i6 != 1) {
                    if (i6 == 4) {
                        interfaceC6901duMo26569k4 = C13595ck.m62710k4(iM26568jd == 0);
                    } else if (i6 == 8 || i6 == 16) {
                        interfaceC6901duMo26569k4 = C13595ck.m62711x1(iM26568jd == 0);
                    }
                    i4 = 0;
                    if (iM26567ix != 2) {
                    }
                } else {
                    if (iM26568jd != 1) {
                        i4 = 0;
                        interfaceC6901duMo26569k4 = new C13594c5(new int[]{Color.WHITE.getRGB(), Color.BLACK.getRGB()});
                    } else {
                        i4 = 0;
                        interfaceC6901duMo26569k4 = new C13594c5(new int[]{Color.BLACK.getRGB(), Color.WHITE.getRGB()});
                    }
                    if (iM26567ix != 2) {
                    }
                }
            }
        } else {
            i4 = 0;
            if (iArrM26586to.length == 3) {
                if ((iArrM26586to[0] & 65535) == 8 && (iArrM26586to[1] & 65535) == 8 && (iArrM26586to[2] & 65535) == 8) {
                    c5Var = iM26567ix == 2 ? new dy(i, i2) : new fa(i, i2, i3);
                }
            } else if (iArrM26586to.length >= 4) {
                int length = iArrM26586to.length;
                int i7 = 0;
                while (true) {
                    if (i7 >= length) {
                        c5Var = iM26567ix == 2 ? new c5(i, i2, iM26556ar, iArrM26586to.length) : new ck(i, i2, i3, iArrM26586to.length, iM26556ar);
                    } else {
                        if ((iArrM26586to[i7] & 65535) != 8) {
                            break;
                        }
                        i7++;
                    }
                }
            }
        }
        if (c5Var != null) {
            return c5Var;
        }
        String strM67399k4 = "TiffImageException: Unsupported bits per sample ";
        for (int i8 = i4; i8 < iArrM26586to.length; i8++) {
            strM67399k4 = C14113y2.m67399k4(strM67399k4, C7019kk.m27466x1(iArrM26586to[i8]));
            if (i8 < iArrM26586to.length - 1) {
                strM67399k4 = C14113y2.m67400k4(strM67399k4, ", ");
            }
        }
        throw new InvalidOperationException(C14113y2.m67400k4(strM67399k4, " count."));
    }
}
