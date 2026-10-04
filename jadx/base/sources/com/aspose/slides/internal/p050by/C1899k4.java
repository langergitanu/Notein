package com.aspose.slides.internal.p050by;

import com.aspose.slides.exceptions.OutOfMemoryException;
import com.aspose.slides.internal.p105ee.C3670k4;
import com.aspose.slides.internal.p185il.C5103kk;
import com.aspose.slides.internal.p262m1.C6304x1;
import com.aspose.slides.internal.p291n4.C6740x1;
import com.aspose.slides.internal.p299ni.InterfaceC6902dy;
import com.aspose.slides.internal.p299ni.InterfaceC6908m9;
import com.aspose.slides.internal.p383rp.AbstractC10039x1;
import com.aspose.slides.internal.p439ug.C11306h4;
import com.aspose.slides.internal.p439ug.C11307k4;
import com.aspose.slides.internal.p439ug.C11309m9;
import com.aspose.slides.internal.p439ug.C11310to;
import com.aspose.slides.internal.p448ur.C11550kk;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12016rv;
import com.aspose.slides.internal.p550zi.C13601ix;
import com.aspose.slides.internal.p550zi.C13617wl;
import com.aspose.slides.internal.p550zi.C13620x6;
import com.aspose.slides.p559ms.System.AbstractC14106wy;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.by.k4 */
/* JADX INFO: loaded from: classes3.dex */
public class C1899k4 extends AbstractC10039x1 {

    /* JADX INFO: renamed from: k4 */
    private static int f6779k4;

    /* JADX INFO: renamed from: x1 */
    private final C13620x6 f6780x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.by.k4$k4 */
    public static class k4 implements InterfaceC6902dy {

        /* JADX INFO: renamed from: k4 */
        private final InterfaceC6908m9 f6781k4;

        /* JADX INFO: renamed from: x1 */
        private final AbstractC19053k4 f6782x1;

        /* JADX INFO: renamed from: com.aspose.slides.internal.by.k4$k4$c5 */
        public static abstract class c5 extends AbstractC19053k4 {

            /* JADX INFO: renamed from: du */
            private int f6783du;

            /* JADX INFO: renamed from: kk */
            private final int f6784kk;

            /* JADX INFO: renamed from: to */
            private int f6785to;

            public c5(int i, C11306h4 c11306h4, C11310to c11310to, C13620x6 c13620x6, C12014ne c12014ne) {
                super(c11306h4, c11310to, c13620x6, c12014ne.Clone());
                this.f6784kk = i;
            }

            /* JADX WARN: Code restructure failed: missing block: B:26:0x008e, code lost:
            
                r5 = r5 - r4;
             */
            /* JADX WARN: Code restructure failed: missing block: B:27:0x008f, code lost:
            
                if (r5 <= 0) goto L41;
             */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x0091, code lost:
            
                r8.f6796x1.m54327k4(r5);
             */
            /* JADX WARN: Code restructure failed: missing block: B:29:0x0096, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:41:?, code lost:
            
                return;
             */
            /* JADX INFO: renamed from: kk */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void m9832kk() {
                int i;
                if (this.f6796x1.m54330m9()) {
                    this.f6783du = 0;
                }
                int iM54316kk = this.f6796x1.m54316kk();
                boolean z = true;
                while (true) {
                    int i2 = this.f6783du;
                    int i3 = this.f6784kk;
                    if (i2 < i3 && z) {
                        int[] iArrM14870to = C3670k4.m14870to();
                        if (iM54316kk == 0) {
                            iArrM14870to = C3670k4.m14865du();
                            i = 12;
                        } else {
                            i = 13;
                        }
                        C11309m9 c11309m9Clone = this.f6793k4.m54304k4(i, true).Clone();
                        int i4 = c11309m9Clone.f38904k4;
                        if (i4 != 2) {
                            C11307k4 c11307k4M54309k4 = i4 == 0 ? C11307k4.m54309k4(iArrM14870to, c11309m9Clone.f38905kk) : C11307k4.m54308k4();
                            this.f6793k4.mo54294k4(c11307k4M54309k4.m54310kk() & 255);
                            switch (c11307k4M54309k4.m54312x1()) {
                                case 7:
                                case 8:
                                    int iM54311to = c11307k4M54309k4.m54311to() + this.f6785to;
                                    this.f6783du += iM54311to;
                                    this.f6785to = 0;
                                    this.f6796x1.m54327k4(iM54311to);
                                    this.f6796x1.m54314h4();
                                    iM54316kk = this.f6796x1.m54316kk();
                                    break;
                                case 9:
                                case 10:
                                case 11:
                                    this.f6785to = c11307k4M54309k4.m54311to() + this.f6785to;
                                    break;
                                case 12:
                                    z = false;
                                    break;
                            }
                        } else {
                            m9837k4(c11309m9Clone.f38906x1);
                            this.f6783du = this.f6784kk;
                            return;
                        }
                    }
                }
            }
        }

        /* JADX INFO: renamed from: com.aspose.slides.internal.by.k4$k4$du */
        public static class du extends AbstractC19053k4 {

            /* JADX INFO: renamed from: kk */
            private final x1 f6786kk;

            /* JADX INFO: renamed from: to */
            private final int f6787to;

            public du(int i, C11306h4 c11306h4, C11310to c11310to, C13620x6 c13620x6, C12014ne c12014ne) {
                super(c11306h4, c11310to, c13620x6, c12014ne.Clone());
                x1 x1Var = new x1(c11310to, i, c11306h4, c13620x6);
                this.f6786kk = x1Var;
                x1Var.m9841k4(new int[]{i, 0});
                this.f6787to = i;
            }

            @Override // com.aspose.slides.internal.p050by.C1899k4.k4.AbstractC19053k4
            /* JADX INFO: renamed from: k4 */
            public void mo9833k4() {
                while (this.f6796x1.m54323c5()) {
                    if (this.f6796x1.m54325dy()) {
                        int[] iArrM54317to = this.f6796x1.m54317to();
                        this.f6796x1.m54324ck();
                        if (m9836x1()) {
                            iArrM54317to = new int[]{this.f6787to, 0};
                        }
                        this.f6786kk.m9841k4(iArrM54317to);
                    }
                    this.f6786kk.m9840k4();
                }
            }
        }

        /* JADX INFO: renamed from: com.aspose.slides.internal.by.k4$k4$dy */
        public static class dy implements InterfaceC6902dy {

            /* JADX INFO: renamed from: k4 */
            private final InterfaceC6908m9 f6788k4;

            /* JADX INFO: renamed from: kk */
            private final C12014ne f6789kk;

            /* JADX INFO: renamed from: x1 */
            private final int[] f6790x1;

            public dy(int[] iArr, InterfaceC6908m9 interfaceC6908m9, C12014ne c12014ne) {
                C12014ne c12014ne2 = new C12014ne();
                this.f6789kk = c12014ne2;
                this.f6788k4 = interfaceC6908m9;
                this.f6790x1 = iArr;
                c12014ne.CloneTo(c12014ne2);
            }

            @Override // com.aspose.slides.internal.p299ni.InterfaceC6902dy
            /* JADX INFO: renamed from: k4 */
            public void mo9818k4(C12014ne c12014ne) {
                if (C12014ne.m56658kk(c12014ne, this.f6789kk)) {
                    this.f6788k4.mo9843k4(c12014ne.Clone(), this.f6790x1, c12014ne.m56665du().Clone(), new C12016rv(c12014ne.m56668h4(), c12014ne.m56670k4()));
                    return;
                }
                int iM56663c5 = c12014ne.m56663c5();
                int iM56683x1 = c12014ne.m56683x1() * iM56663c5;
                int[] iArr = new int[iM56683x1];
                int iM56666dy = c12014ne.m56666dy() - this.f6789kk.m56666dy();
                int iM56663c52 = this.f6789kk.m56663c5();
                int i = 0;
                if (c12014ne.m56681to() == this.f6789kk.m56681to() && c12014ne.m56668h4() == this.f6789kk.m56668h4()) {
                    System.arraycopy(this.f6790x1, iM56666dy * iM56663c52, iArr, 0, iM56683x1);
                } else {
                    int iM56681to = c12014ne.m56681to() - this.f6789kk.m56681to();
                    int iM56683x12 = c12014ne.m56683x1();
                    while (i < iM56683x12) {
                        System.arraycopy(this.f6790x1, (iM56666dy * iM56663c52) + iM56681to, iArr, i * iM56663c5, iM56663c5);
                        i++;
                        iM56666dy++;
                    }
                }
                this.f6788k4.mo9843k4(c12014ne.Clone(), iArr, c12014ne.m56665du().Clone(), new C12016rv(c12014ne.m56668h4(), c12014ne.m56670k4()));
            }
        }

        /* JADX INFO: renamed from: com.aspose.slides.internal.by.k4$k4$h4 */
        public static class h4 extends c5 {
            public h4(int i, C11306h4 c11306h4, C11310to c11310to, C13620x6 c13620x6, C12014ne c12014ne) {
                super(i, c11306h4, c11310to, c13620x6, c12014ne.Clone());
            }

            @Override // com.aspose.slides.internal.p050by.C1899k4.k4.AbstractC19053k4
            /* JADX INFO: renamed from: k4 */
            public void mo9833k4() {
                while (this.f6796x1.m54323c5()) {
                    if (this.f6796x1.m54325dy()) {
                        this.f6796x1.m54324ck();
                        m9836x1();
                        this.f6793k4.mo54297x1();
                    }
                    m9832kk();
                }
            }
        }

        /* JADX INFO: renamed from: com.aspose.slides.internal.by.k4$k4$k4, reason: collision with other inner class name */
        public static abstract class AbstractC19053k4 extends m9 {

            /* JADX INFO: renamed from: kk */
            private final int f6791kk;

            /* JADX INFO: renamed from: to */
            private boolean f6792to;

            public AbstractC19053k4(C11306h4 c11306h4, C11310to c11310to, C13620x6 c13620x6, C12014ne c12014ne) {
                super(c11306h4, c11310to, c13620x6);
                this.f6791kk = c12014ne.m56681to();
            }

            /* JADX WARN: Code restructure failed: missing block: B:6:0x001e, code lost:
            
                r2 = false;
             */
            /* JADX INFO: renamed from: k4 */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public static C13601ix m9834k4(C11306h4 c11306h4) {
                boolean z;
                boolean z2;
                int iMo54296x1;
                C13601ix c13601ix = new C13601ix();
                c13601ix.f45161k4 = true;
                while (true) {
                    z = false;
                    C11309m9 c11309m9Clone = c11306h4.m54304k4(11, false).Clone();
                    int i = c11309m9Clone.f38904k4;
                    if (i != 2) {
                        if (i != 0) {
                            break;
                        }
                        if (c11306h4.mo54296x1(11) == 0) {
                            z2 = true;
                            break;
                        }
                        c11306h4.mo54294k4(1);
                    } else {
                        c13601ix.f45162x1 = c11309m9Clone.f38906x1;
                        c13601ix.f45161k4 = false;
                        break;
                    }
                }
                if (z2) {
                    while (true) {
                        C11309m9 c11309m9Clone2 = c11306h4.m54304k4(8, false).Clone();
                        int i2 = c11309m9Clone2.f38904k4;
                        if (i2 == 2) {
                            c13601ix.f45162x1 = c11309m9Clone2.f38906x1;
                            c13601ix.f45161k4 = false;
                            break;
                        }
                        if (i2 != 0) {
                            break;
                        }
                        if (c11306h4.mo54296x1(8) != 0) {
                            z = z2;
                            break;
                        }
                        c11306h4.mo54294k4(8);
                    }
                    if (z) {
                        do {
                            iMo54296x1 = c11306h4.mo54296x1(1);
                            c11306h4.mo54294k4(1);
                        } while (iMo54296x1 == 0);
                    }
                }
                return c13601ix;
            }

            /* JADX INFO: renamed from: k4 */
            public abstract void mo9833k4();

            /* JADX INFO: renamed from: x1 */
            public boolean m9836x1() {
                if (!this.f6792to || this.f6793k4.m54303du() != this.f6796x1.m54326jd()) {
                    return false;
                }
                this.f6793k4.m54307to(this.f6796x1.m54326jd());
                return true;
            }

            /* JADX INFO: renamed from: k4 */
            public int[] m9835k4(C12014ne c12014ne) {
                int[] iArr = new int[c12014ne.m56683x1() * c12014ne.m56663c5()];
                this.f6792to = this.f6791kk == c12014ne.m56681to();
                this.f6796x1.m54329k4(iArr, c12014ne.Clone());
                mo9833k4();
                return iArr;
            }
        }

        /* JADX INFO: renamed from: com.aspose.slides.internal.by.k4$k4$kk */
        public static class kk extends c5 {
            public kk(int i, C11306h4 c11306h4, C11310to c11310to, C13620x6 c13620x6, C12014ne c12014ne) {
                super(i, c11306h4, c11310to, c13620x6, c12014ne.Clone());
            }

            @Override // com.aspose.slides.internal.p050by.C1899k4.k4.AbstractC19053k4
            /* JADX INFO: renamed from: k4 */
            public void mo9833k4() {
                while (this.f6796x1.m54323c5()) {
                    if (this.f6796x1.m54325dy()) {
                        this.f6796x1.m54324ck();
                        m9836x1();
                    }
                    if (this.f6796x1.m54330m9()) {
                        C13601ix c13601ixClone = AbstractC19053k4.m9834k4(this.f6793k4).Clone();
                        if (!c13601ixClone.f45161k4) {
                            m9837k4(c13601ixClone.f45162x1);
                        }
                    }
                    m9832kk();
                }
            }
        }

        /* JADX INFO: renamed from: com.aspose.slides.internal.by.k4$k4$m9 */
        public static abstract class m9 {

            /* JADX INFO: renamed from: k4 */
            protected final C11306h4 f6793k4;

            /* JADX INFO: renamed from: kk */
            private int f6794kk;

            /* JADX INFO: renamed from: to */
            private int f6795to;

            /* JADX INFO: renamed from: x1 */
            protected final C11310to f6796x1;

            public m9(C11306h4 c11306h4, C11310to c11310to, C13620x6 c13620x6) {
                this.f6793k4 = c11306h4;
                this.f6796x1 = c11310to;
                if (c13620x6 != null) {
                    this.f6794kk = c13620x6.m62868k4();
                    this.f6795to = c13620x6.m62869x1();
                }
            }

            /* JADX INFO: renamed from: k4 */
            public void m9837k4(String str) {
                int i = this.f6794kk;
                if (i == 2) {
                    C11310to c11310to = this.f6796x1;
                    c11310to.m54328k4(c11310to.m54326jd() + 1, this.f6795to);
                } else {
                    if (i != 1) {
                        throw new C5103kk(C14113y2.m67408k4("Cannot decode strip ", C14057f9.m66591x1(this.f6793k4.m54306to()), ". Details: ", str));
                    }
                    this.f6796x1.m54328k4(this.f6793k4.m54305kk(this.f6796x1.m54326jd()), this.f6795to);
                }
            }
        }

        /* JADX INFO: renamed from: com.aspose.slides.internal.by.k4$k4$to */
        public static class to extends c5 {

            /* JADX INFO: renamed from: du */
            private int[] f6797du;

            /* JADX INFO: renamed from: kk */
            private final x1 f6798kk;

            /* JADX INFO: renamed from: to */
            private boolean f6799to;

            public to(int i, C11306h4 c11306h4, C11310to c11310to, C13620x6 c13620x6, C12014ne c12014ne) {
                super(i, c11306h4, c11310to, c13620x6, c12014ne.Clone());
                this.f6798kk = new x1(c11310to, i, c11306h4, c13620x6);
            }

            @Override // com.aspose.slides.internal.p050by.C1899k4.k4.AbstractC19053k4
            /* JADX INFO: renamed from: k4 */
            public final void mo9833k4() {
                while (this.f6796x1.m54323c5()) {
                    if (this.f6796x1.m54325dy()) {
                        this.f6797du = this.f6796x1.m54317to();
                        this.f6796x1.m54324ck();
                        if (m9836x1()) {
                            this.f6797du = null;
                        }
                    }
                    if (this.f6796x1.m54330m9()) {
                        C13601ix c13601ixClone = AbstractC19053k4.m9834k4(this.f6793k4).Clone();
                        if (c13601ixClone.f45161k4) {
                            C11309m9 c11309m9Clone = this.f6793k4.m54304k4(1, true).Clone();
                            if (c11309m9Clone.f38904k4 == 0) {
                                this.f6799to = c11309m9Clone.f38905kk != 0;
                                this.f6793k4.mo54294k4(1);
                                if (!this.f6799to) {
                                    this.f6798kk.m9841k4(this.f6797du);
                                }
                            }
                        }
                        m9837k4(c13601ixClone.f45162x1);
                    }
                    if (this.f6799to) {
                        m9832kk();
                    } else {
                        this.f6798kk.m9840k4();
                    }
                }
            }
        }

        /* JADX INFO: renamed from: com.aspose.slides.internal.by.k4$k4$x1 */
        public static class x1 extends m9 {

            /* JADX INFO: renamed from: du */
            private int f6800du;

            /* JADX INFO: renamed from: h4 */
            private int f6801h4;

            /* JADX INFO: renamed from: kk */
            private final int f6802kk;

            /* JADX INFO: renamed from: m9 */
            private int f6803m9;

            /* JADX INFO: renamed from: to */
            private int[] f6804to;

            public x1(C11310to c11310to, int i, C11306h4 c11306h4, C13620x6 c13620x6) {
                super(c11306h4, c11310to, c13620x6);
                this.f6802kk = i;
            }

            /* JADX INFO: renamed from: x1 */
            private void m9839x1(int i) {
                int i2;
                int i3 = this.f6801h4;
                int i4 = this.f6800du;
                int[] iArr = this.f6804to;
                if (i4 < iArr.length) {
                    i3 += iArr[i4];
                }
                if (this.f6803m9 > 0 || i3 + i < 0) {
                    int i5 = 1;
                    while (true) {
                        int i6 = this.f6800du;
                        int i7 = i6 + i5 + 1;
                        int[] iArr2 = this.f6804to;
                        if (i7 >= iArr2.length || (i3 > (i2 = this.f6803m9) && i3 + i > i2)) {
                            break;
                        }
                        int i8 = i5 + 1;
                        int i9 = i3 + iArr2[i6 + i5];
                        i5 += 2;
                        i3 = i9 + iArr2[i6 + i8];
                    }
                }
                int i10 = i3 + i;
                int i11 = i10 - this.f6803m9;
                if (i11 <= 0 && this.f6800du > 0) {
                    m9837k4("Vertical code is incorrect.");
                    this.f6803m9 = this.f6802kk;
                    return;
                }
                this.f6796x1.m54327k4(i11);
                this.f6796x1.m54314h4();
                this.f6803m9 = i10;
                int i12 = this.f6801h4;
                if (i12 > i10) {
                    int i13 = this.f6800du;
                    if (i13 == 0) {
                        m9837k4("Cannot adjust reference position backwards. No more changes exist.");
                        this.f6803m9 = this.f6802kk;
                        return;
                    } else {
                        int[] iArr3 = this.f6804to;
                        int i14 = i13 - 1;
                        this.f6800du = i14;
                        this.f6801h4 = i12 - iArr3[i14];
                        return;
                    }
                }
                int i15 = this.f6800du;
                int[] iArr4 = this.f6804to;
                if (i15 >= iArr4.length) {
                    return;
                }
                this.f6800du = i15 + 1;
                int i16 = iArr4[i15];
                while (true) {
                    this.f6801h4 = i12 + i16;
                    int i17 = this.f6801h4;
                    if (i17 >= this.f6802kk) {
                        return;
                    }
                    int i18 = this.f6800du;
                    int[] iArr5 = this.f6804to;
                    if (i18 >= iArr5.length - 1) {
                        return;
                    }
                    int i19 = iArr5[i18];
                    if (i17 + i19 > this.f6803m9) {
                        return;
                    }
                    int i20 = i18 + 1;
                    this.f6800du = i20;
                    i12 = i17 + i19;
                    this.f6801h4 = i12;
                    this.f6800du = i18 + 2;
                    i16 = iArr5[i20];
                }
            }

            /* JADX INFO: renamed from: k4 */
            public void m9840k4() {
                String str;
                int i;
                int iM54311to;
                int i2;
                C11307k4[] c11307k4Arr = new C11307k4[this.f6802kk * 2];
                if (this.f6804to != null) {
                    int i3 = 0;
                    while (this.f6803m9 < this.f6802kk) {
                        C11309m9 c11309m9Clone = this.f6793k4.m54304k4(7, true).Clone();
                        if (c11309m9Clone.f38904k4 != 0) {
                            str = c11309m9Clone.f38906x1;
                        } else {
                            C11307k4 c11307k4M54309k4 = C11307k4.m54309k4(C3670k4.m14869m9(), c11309m9Clone.f38905kk);
                            this.f6793k4.mo54294k4(c11307k4M54309k4.m54310kk() & 255);
                            int i4 = i3 + 1;
                            c11307k4Arr[i3] = c11307k4M54309k4;
                            byte bM54312x1 = c11307k4M54309k4.m54312x1();
                            if (bM54312x1 != 1) {
                                int i5 = 12;
                                if (bM54312x1 == 2) {
                                    int i6 = 13;
                                    if (this.f6796x1.m54316kk() != 0) {
                                        i5 = 13;
                                        i6 = 12;
                                    }
                                    if (m9838k4(i5) && m9838k4(i6)) {
                                        while (true) {
                                            int i7 = this.f6800du;
                                            int[] iArr = this.f6804to;
                                            if (i7 < iArr.length - 1) {
                                                int i8 = this.f6801h4;
                                                int i9 = iArr[i7];
                                                if (i8 + i9 <= this.f6803m9) {
                                                    int i10 = i7 + 1;
                                                    this.f6800du = i10;
                                                    int i11 = i8 + i9;
                                                    this.f6801h4 = i11;
                                                    this.f6800du = i7 + 2;
                                                    this.f6801h4 = i11 + iArr[i10];
                                                }
                                            }
                                        }
                                    }
                                } else if (bM54312x1 != 3) {
                                    if (bM54312x1 == 4) {
                                        iM54311to = c11307k4M54309k4.m54311to();
                                    } else if (bM54312x1 == 5) {
                                        iM54311to = -c11307k4M54309k4.m54311to();
                                    } else if (bM54312x1 == 12 && (i2 = this.f6802kk - this.f6803m9) > 0) {
                                        this.f6796x1.m54327k4(i2);
                                        this.f6803m9 += i2;
                                    }
                                    m9839x1(iM54311to);
                                } else {
                                    m9839x1(0);
                                }
                            } else {
                                int i12 = this.f6800du;
                                int i13 = i12 + 1;
                                int[] iArr2 = this.f6804to;
                                if (i13 >= iArr2.length) {
                                    m9837k4("Cannot do pass. There is no more changes exist.");
                                    i = this.f6802kk;
                                } else {
                                    int i14 = this.f6801h4;
                                    int i15 = i12 + 1;
                                    this.f6800du = i15;
                                    int i16 = i14 + iArr2[i12];
                                    this.f6801h4 = i16;
                                    this.f6800du = i12 + 2;
                                    int i17 = i16 + iArr2[i15];
                                    this.f6801h4 = i17;
                                    int i18 = i17 - this.f6803m9;
                                    this.f6796x1.m54327k4(i18);
                                    i = this.f6803m9 + i18;
                                }
                                this.f6803m9 = i;
                            }
                            i3 = i4;
                        }
                    }
                    return;
                }
                str = "Cannot perform 2d decoding. Missing changes from previous row.";
                m9837k4(str);
                this.f6803m9 = this.f6802kk;
            }

            /* JADX INFO: renamed from: k4 */
            public void m9841k4(int[] iArr) {
                this.f6804to = iArr;
                this.f6800du = 0;
                this.f6801h4 = 0;
                this.f6803m9 = 0;
            }

            /* JADX INFO: renamed from: k4 */
            private boolean m9838k4(int i) {
                int[] iArrM14865du = C3670k4.m14865du();
                if (this.f6796x1.m54316kk() == 1) {
                    iArrM14865du = C3670k4.m14870to();
                }
                boolean z = false;
                int iM54311to = 0;
                boolean z2 = true;
                while (!z) {
                    C11309m9 c11309m9Clone = this.f6793k4.m54304k4(i, true).Clone();
                    int i2 = c11309m9Clone.f38905kk;
                    int i3 = c11309m9Clone.f38904k4;
                    if (i2 <= 0 || i3 != 0) {
                        m9837k4(c11309m9Clone.f38906x1);
                        this.f6803m9 = this.f6802kk;
                        return false;
                    }
                    C11307k4 c11307k4M54309k4 = C11307k4.m54309k4(iArrM14865du, i2);
                    this.f6793k4.mo54294k4(c11307k4M54309k4.m54310kk() & 255);
                    byte bM54312x1 = c11307k4M54309k4.m54312x1();
                    if (bM54312x1 != 0) {
                        switch (bM54312x1) {
                            case 7:
                            case 8:
                                iM54311to += c11307k4M54309k4.m54311to();
                                this.f6796x1.m54327k4(iM54311to);
                                this.f6796x1.m54314h4();
                                this.f6803m9 += iM54311to;
                                z = true;
                                break;
                            case 9:
                            case 10:
                            case 11:
                                iM54311to += c11307k4M54309k4.m54311to();
                                break;
                        }
                    }
                    m9837k4("EOL has been found");
                    this.f6803m9 = this.f6802kk;
                    z2 = false;
                    z = true;
                }
                return z2;
            }
        }

        public k4(C1899k4 c1899k4, C6304x1 c6304x1, InterfaceC6908m9 interfaceC6908m9, C12014ne c12014ne) {
            AbstractC19053k4 h4Var;
            this.f6781k4 = interfaceC6908m9;
            C11306h4 c11306h4 = new C11306h4(c6304x1.m62861x1(), c1899k4.m49327kk(), c1899k4.m49329x1(), c1899k4.m49327kk().m26579ks().length, c1899k4.m49324du());
            C11310to c11310to = new C11310to(c12014ne.Clone(), c1899k4.m49325k4(), c11306h4.m54307to(c12014ne.m56664ck()), c1899k4.m49327kk().m26568jd() == 0);
            C13620x6 c13620x6 = c1899k4.f6780x1;
            int iM49328to = c1899k4.m49328to();
            if (iM49328to == 2) {
                h4Var = new h4(c1899k4.m49325k4(), c11306h4, c11310to, c13620x6, c12014ne.Clone());
            } else if (iM49328to == 3) {
                long jM26582ne = c1899k4.m49327kk().m26582ne();
                if ((jM26582ne & 2) == 2) {
                    throw new C5103kk("Uncompressed mode is not supported for CcittFax3.");
                }
                h4Var = (jM26582ne & 1) == 1 ? new to(c1899k4.m49325k4(), c11306h4, c11310to, c13620x6, c12014ne.Clone()) : new kk(c1899k4.m49325k4(), c11306h4, c11310to, c13620x6, c12014ne.Clone());
            } else {
                if (iM49328to != 4) {
                    throw new C5103kk(C14113y2.m67408k4("The compression ", AbstractC14106wy.getName((Class<?>) C11550kk.class, c1899k4.m49328to()), " is not supported"));
                }
                h4Var = new du(c1899k4.m49325k4(), c11306h4, c11310to, c13620x6, c12014ne.Clone());
            }
            this.f6782x1 = h4Var;
        }

        @Override // com.aspose.slides.internal.p299ni.InterfaceC6902dy
        /* JADX INFO: renamed from: k4 */
        public void mo9818k4(C12014ne c12014ne) {
            int iM56683x1 = c12014ne.m56683x1() * c12014ne.m56663c5();
            if (C1899k4.m9830h4() > 0 && iM56683x1 > C1899k4.m9830h4()) {
                throw new OutOfMemoryException();
            }
            C13617wl.m62840k4(c12014ne.Clone(), new dy(this.f6782x1.m9835k4(c12014ne.Clone()), this.f6781k4, c12014ne.Clone()));
        }
    }

    public C1899k4(C6740x1 c6740x1, int i, int i2, C13620x6 c13620x6) {
        super(c6740x1, i, i2);
        this.f6780x1 = c13620x6;
    }

    /* JADX INFO: renamed from: h4 */
    public static int m9830h4() {
        return f6779k4;
    }

    @Override // com.aspose.slides.internal.p383rp.AbstractC10039x1
    /* JADX INFO: renamed from: k4 */
    public void mo9816k4(C6304x1 c6304x1, C12014ne c12014ne, InterfaceC6908m9 interfaceC6908m9) {
        C13617wl.m62840k4(c12014ne.Clone(), new k4(this, c6304x1, interfaceC6908m9, c12014ne.Clone()));
    }
}
