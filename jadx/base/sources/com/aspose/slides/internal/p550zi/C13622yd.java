package com.aspose.slides.internal.p550zi;

import com.aspose.slides.internal.p299ni.InterfaceC6901du;
import com.aspose.slides.internal.p314oc.C7019kk;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.aspose.slides.internal.zi.yd */
/* JADX INFO: loaded from: classes5.dex */
public final class C13622yd implements InterfaceC6901du {

    /* JADX INFO: renamed from: k4 */
    private final InterfaceC6901du f45231k4;

    /* JADX INFO: renamed from: x1 */
    private final k4 f45232x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.zi.yd$k4 */
    public static abstract class k4 {

        /* JADX INFO: renamed from: k4 */
        protected final InterfaceC6901du f45233k4;

        public k4(InterfaceC6901du interfaceC6901du) {
            this.f45233k4 = interfaceC6901du;
        }

        /* JADX INFO: renamed from: k4 */
        public abstract int mo62873k4(int i);
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.zi.yd$kk */
    public static class kk extends k4 {

        /* JADX INFO: renamed from: kk */
        private final byte[] f45234kk;

        /* JADX INFO: renamed from: x1 */
        private final int[] f45235x1;

        public kk(InterfaceC6901du interfaceC6901du) {
            super(interfaceC6901du);
            this.f45235x1 = new int[16777216];
            this.f45234kk = new byte[16777216];
        }

        @Override // com.aspose.slides.internal.p550zi.C13622yd.k4
        /* JADX INFO: renamed from: k4 */
        public int mo62873k4(int i) {
            int i2 = 16777215 & i;
            if (C7019kk.m27462to(Byte.valueOf(this.f45234kk[i2]), 6) > 0) {
                return this.f45235x1[i2];
            }
            int iMo27030k4 = this.f45233k4.mo27030k4(i);
            this.f45234kk[i2] = 1;
            this.f45235x1[i2] = iMo27030k4;
            return iMo27030k4;
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.zi.yd$to */
    public static class to extends k4 {

        /* JADX INFO: renamed from: x1 */
        private final Map<Integer, Integer> f45236x1;

        public to(InterfaceC6901du interfaceC6901du) {
            super(interfaceC6901du);
            this.f45236x1 = new HashMap();
        }

        @Override // com.aspose.slides.internal.p550zi.C13622yd.k4
        /* JADX INFO: renamed from: k4 */
        public int mo62873k4(int i) {
            Integer numValueOf = this.f45236x1.get(Integer.valueOf(i));
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(this.f45233k4.mo27030k4(i));
                this.f45236x1.put(Integer.valueOf(i), numValueOf);
            }
            return numValueOf.intValue();
        }
    }

    /* JADX INFO: renamed from: com.aspose.slides.internal.zi.yd$x1 */
    public static class x1 extends k4 {

        /* JADX INFO: renamed from: kk */
        private final byte[] f45237kk;

        /* JADX INFO: renamed from: x1 */
        private final short[] f45238x1;

        public x1(InterfaceC6901du interfaceC6901du) {
            super(interfaceC6901du);
            this.f45238x1 = new short[16777216];
            this.f45237kk = new byte[16777216];
        }

        @Override // com.aspose.slides.internal.p550zi.C13622yd.k4
        /* JADX INFO: renamed from: k4 */
        public int mo62873k4(int i) {
            int i2 = 16777215 & i;
            if (C7019kk.m27462to(Byte.valueOf(this.f45237kk[i2]), 6) > 0) {
                return this.f45238x1[i2];
            }
            short sM27468x1 = C7019kk.m27468x1(Integer.valueOf(this.f45233k4.mo27030k4(i)), 9);
            this.f45237kk[i2] = 1;
            this.f45238x1[i2] = sM27468x1;
            return sM27468x1;
        }
    }

    public C13622yd(InterfaceC6901du interfaceC6901du) {
        this.f45232x1 = interfaceC6901du.mo27029k4() <= 256 ? new to(interfaceC6901du) : interfaceC6901du.mo27029k4() <= 65536 ? new x1(interfaceC6901du) : new kk(interfaceC6901du);
        this.f45231k4 = interfaceC6901du;
    }

    @Override // com.aspose.slides.internal.p299ni.InterfaceC6901du
    /* JADX INFO: renamed from: k4 */
    public int mo27029k4() {
        return this.f45231k4.mo27029k4();
    }

    @Override // com.aspose.slides.internal.p299ni.InterfaceC6901du
    /* JADX INFO: renamed from: x1 */
    public int mo27031x1(int i) {
        return this.f45231k4.mo27031x1(i);
    }

    @Override // com.aspose.slides.internal.p299ni.InterfaceC6901du
    /* JADX INFO: renamed from: k4 */
    public int mo27030k4(int i) {
        return this.f45232x1.mo62873k4(i);
    }

    @Override // com.aspose.slides.internal.p299ni.InterfaceC6901du
    /* JADX INFO: renamed from: x1 */
    public int[] mo27032x1() {
        return this.f45231k4.mo27032x1();
    }
}
