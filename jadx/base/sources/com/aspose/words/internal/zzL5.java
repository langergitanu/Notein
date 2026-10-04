package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzL5 {
    private long zzCV;
    private long zzCW;
    private int zzCX;
    private boolean zzEq;
    private long zzEr;
    private int zzEw;
    private zzZOW zzW5;

    public static class zzZ {
        private int zzCL;
        private int zzCM;
        private int zzCN;
        private int zzCO;
        private int zzCP;
        private int zzCQ;
        private int zzCR;
        private int zzCS;
        private int zzCT;
        private int zzCU;

        private zzZ() {
        }

        public static zzZ zzY(long j, float f, float f2) {
            zzZ zzz = new zzZ();
            double d = f;
            zzz.zzCU = zzSA.zzV(Float.intBitsToFloat((int) j), d);
            double d2 = f2;
            int iZzV = zzSA.zzV(zzZPW.zzYz(j), d2);
            zzz.zzCT = iZzV;
            int i = zzz.zzCU;
            int i2 = i - 1;
            int i3 = iZzV - 1;
            if (i2 > 20) {
                i = i2;
            }
            if (i3 > 20) {
                iZzV = i3;
            }
            long j2 = zz8T.zzpr;
            int i4 = (int) j2;
            zzz.zzCQ = i4;
            zzz.zzCP = (int) (j2 >>> 32);
            zzz.zzCO = (int) zzSA.zzP(i4, d);
            int iZzP = (int) zzSA.zzP(zzz.zzCP, d2);
            zzz.zzCN = iZzP;
            double d3 = ((double) zzz.zzCQ) / ((double) zzz.zzCO);
            double d4 = ((double) zzz.zzCP) / ((double) iZzP);
            zzz.zzCS = (int) ((((double) i) * 100.0d) / d3);
            zzz.zzCR = (int) ((((double) iZzV) * 100.0d) / d4);
            zzz.zzCM = (int) zzSA.zzO((int) zz8T.zzpr, d);
            zzz.zzCL = (int) zzSA.zzO((int) (zz8T.zzpr >>> 32), d2);
            return zzz;
        }

        public final int zzIY() {
            return this.zzCL;
        }

        public final int zzIZ() {
            return this.zzCM;
        }

        public final int zzJ0() {
            return this.zzCN;
        }

        public final int zzJ1() {
            return this.zzCO;
        }

        public final int zzJ2() {
            return this.zzCP;
        }

        public final int zzJ3() {
            return this.zzCQ;
        }

        public final int zzJ4() {
            return this.zzCR;
        }

        public final int zzJ5() {
            return this.zzCS;
        }

        public final int zzJ6() {
            return this.zzCT;
        }

        public final int zzJ7() {
            return this.zzCU;
        }
    }

    public zzL5(zzZOW zzzow) {
        this.zzW5 = zzzow;
    }

    private void zzX4(int i) throws Exception {
        if (this.zzEq) {
            return;
        }
        this.zzEq = true;
        this.zzEr = this.zzW5.zzq().getPosition();
        this.zzEw = i;
        this.zzCX++;
        this.zzW5.zzl(i);
        this.zzW5.zzl(0);
    }

    public final void zzJ8() throws Exception {
        zzX4(70);
        this.zzW5.zzl(0);
        this.zzW5.zzl(726027589);
    }

    public final void zzKD() throws Exception {
        if (this.zzEq) {
            this.zzEq = false;
            long position = this.zzW5.zzq().getPosition();
            int i = (int) (position - this.zzEr);
            this.zzW5.zzq().zzH(this.zzEr + 4);
            this.zzW5.zzl(i);
            if (this.zzEw == 70) {
                this.zzW5.zzl(i - 12);
            }
            this.zzW5.zzq().zzH(position);
        }
    }

    public final void zzKE() throws Exception {
        zzX4(14);
        this.zzW5.zzl(0);
        this.zzW5.zzl(16);
        this.zzW5.zzl(20);
        zzKD();
        long position = this.zzW5.zzq().getPosition();
        this.zzW5.zzq().zzH(this.zzCV);
        this.zzW5.zzl((int) (position - this.zzCW));
        this.zzW5.zzl(this.zzCX);
        this.zzW5.zzq().zzH(position);
    }

    public final void zzZ(long j, float f, float f2) throws Exception {
        this.zzCW = this.zzW5.zzq().getPosition();
        zzX4(1);
        zzZ zzzZzY = zzZ.zzY(j, f, f2);
        this.zzW5.zzl(0);
        this.zzW5.zzl(0);
        this.zzW5.zzl(zzzZzY.zzJ7());
        this.zzW5.zzl(zzzZzY.zzJ6());
        this.zzW5.zzl(0);
        this.zzW5.zzl(0);
        this.zzW5.zzl(zzzZzY.zzJ5());
        this.zzW5.zzl(zzzZzY.zzJ4());
        this.zzW5.zzl(1179469088);
        this.zzW5.zzl(65536);
        this.zzCV = this.zzW5.zzq().getPosition();
        this.zzW5.zzl(0);
        this.zzW5.zzl(0);
        this.zzW5.zzl(1);
        this.zzW5.zzl(0);
        this.zzW5.zzl(0);
        this.zzW5.zzl(0);
        this.zzW5.zzl(zzzZzY.zzJ3());
        this.zzW5.zzl(zzzZzY.zzJ2());
        this.zzW5.zzl(zzzZzY.zzJ1());
        this.zzW5.zzl(zzzZzY.zzJ0());
        this.zzW5.zzl(0);
        this.zzW5.zzl(0);
        this.zzW5.zzl(0);
        this.zzW5.zzl(zzzZzY.zzIZ());
        this.zzW5.zzl(zzzZzY.zzIY());
        zzKD();
    }
}
