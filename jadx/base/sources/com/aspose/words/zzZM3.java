package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZM3 extends zzZMB {
    private zzYDU zzYvJ;

    public static class zzZ {
        private double zzYvG;
        private double zzYvH;
        private double zzYvI;

        private zzZ() {
        }

        public final void zzX4(double d) {
            this.zzYvG = d;
        }

        public final void zzX5(double d) {
            this.zzYvH = d;
        }

        public final void zzX6(double d) {
            this.zzYvI = d;
        }

        public final double zzZ5N() {
            return this.zzYvG;
        }

        public final double zzZ5O() {
            return this.zzYvH;
        }

        public final double zzZ5P() {
            return this.zzYvI;
        }

        public /* synthetic */ zzZ(byte b) {
            this();
        }
    }

    public zzZM3(DocumentBase documentBase, zzYDU zzydu) {
        super(documentBase, zzydu);
        this.zzYvJ = zzydu;
    }

    private boolean zz40() {
        if (this.zzYvJ.getOrientation() != 0) {
            return this.zzYvJ.getOrientation() == -1 && this.zzYvJ.getHeight() >= this.zzYvJ.getWidth();
        }
        return true;
    }

    private zzZ zzX7(double d) {
        byte b = 0;
        if (this.zzYvJ.getMin() == this.zzYvJ.getMax()) {
            zzZ zzz = new zzZ(b);
            zzz.zzX6(12.0d);
            return zzz;
        }
        if (d <= 36.0d) {
            zzZ zzz2 = new zzZ(b);
            zzz2.zzX6(d / 2.0d);
            return zzz2;
        }
        int iAbs = Math.abs(this.zzYvJ.getMax() - this.zzYvJ.getMin());
        double d2 = d - 24.0d;
        double dMax = this.zzYvJ.zzYcZ() == -1 ? Math.max(d2 / ((double) (iAbs + 1)), 6.0d) : 12.0d;
        double d3 = (d2 - dMax) / ((double) iAbs);
        double position = this.zzYvJ.getMax() > this.zzYvJ.getMin() ? (((double) (this.zzYvJ.getPosition() - this.zzYvJ.getMin())) * d3) + 12.0d : ((d2 + 12.0d) - dMax) - (((double) (this.zzYvJ.getPosition() - this.zzYvJ.getMax())) * d3);
        zzZ zzz3 = new zzZ(b);
        zzz3.zzX6(12.0d);
        zzz3.zzX5(dMax);
        zzz3.zzX4(position);
        return zzz3;
    }

    private void zzZ5Q() {
        zzZ zzzZzX7 = zzX7(this.zzYvJ.getWidth());
        zzX(0, com.aspose.words.internal.zzZQ4.zzX(zzZ67().zzZm(), zzZ67().zzZo(), zzZ67().zzZm() + ((float) zzzZzX7.zzZ5P()), zzZ67().zzZn()));
        zzX(1, com.aspose.words.internal.zzZQ4.zzX(zzZ67().zzkw() - ((float) zzzZzX7.zzZ5P()), zzZ67().zzZo(), zzZ67().zzkw(), zzZ67().zzZn()));
        zzZd(new com.aspose.words.internal.zzZQ4(zzZ67().zzZm() + ((float) zzzZzX7.zzZ5N()), zzZ67().zzZo(), (float) zzzZzX7.zzZ5O(), zzZ67().getHeight()));
    }

    private void zzZ5R() {
        zzZ zzzZzX7 = zzX7(this.zzYvJ.getHeight());
        zzX(2, com.aspose.words.internal.zzZQ4.zzX(zzZ67().zzZm(), zzZ67().zzZo(), zzZ67().zzkw(), zzZ67().zzZo() + ((float) zzzZzX7.zzZ5P())));
        zzX(3, com.aspose.words.internal.zzZQ4.zzX(zzZ67().zzZm(), zzZ67().zzZn() - ((float) zzzZzX7.zzZ5P()), zzZ67().zzkw(), zzZ67().zzZn()));
        zzZd(new com.aspose.words.internal.zzZQ4(zzZ67().zzZm(), zzZ67().zzZo() + ((float) zzzZzX7.zzZ5N()), zzZ67().getWidth(), (float) zzzZzX7.zzZ5O()));
    }

    private void zzZd(com.aspose.words.internal.zzZQ4 zzzq4) {
        com.aspose.words.internal.zzZG zzzgZzW = com.aspose.words.internal.zzZG.zzW(zzzq4);
        zzzgZzW.zzY(new com.aspose.words.internal.zzOI(com.aspose.words.internal.zzPV.zzYR(this.zzYvJ.getBackColor())));
        this.zzYvS.zzX(zzzgZzW);
        this.zzYvS.zzX(zzZMC.zzZm(zzzq4));
    }

    @Override // com.aspose.words.zzZMB
    public final void zzZ68() {
        zzZ65();
        if (zz40()) {
            zzZ5R();
        } else {
            zzZ5Q();
        }
    }
}
