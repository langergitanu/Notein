package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzXR {
    static zzXR zzZBy = new zzXR(0, 0, 0, 0);
    private com.aspose.words.internal.zzZQ5 zzZBv;
    private com.aspose.words.internal.zz0P zzZBw;
    private boolean zzZBx;

    public static class zzY {
        public int zzZBj;
        public int zzZBk;
        public int zzZBl;
        public int zzZBm;
        public int zzZBn;
        public int zzZBo;

        private zzY() {
        }

        private void reset() {
            this.zzZBn = Integer.MAX_VALUE;
            this.zzZBo = Integer.MIN_VALUE;
            this.zzZBk = -1;
            this.zzZBm = -1;
            this.zzZBj = -1;
            this.zzZBl = -1;
        }

        public final void zzV(com.aspose.words.internal.zz0P zz0p) {
            reset();
            int i = Integer.MAX_VALUE;
            int i2 = Integer.MIN_VALUE;
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MIN_VALUE;
            for (int i5 = 0; i5 < zz0p.getCount(); i5++) {
                long jZzZ = zzXR.zzZ(zz0p, i5);
                int i6 = this.zzZBn;
                int i7 = (int) (jZzZ >> 32);
                if (i6 >= i7) {
                    if (i6 > i7) {
                        i = (int) jZzZ;
                        this.zzZBk = i5;
                        this.zzZBj = i5;
                        i4 = i;
                    } else {
                        int i8 = (int) jZzZ;
                        if (i > i8) {
                            this.zzZBk = i5;
                            i = i8;
                        } else if (i4 < i8) {
                            this.zzZBj = i5;
                            i4 = i8;
                        }
                    }
                    this.zzZBn = i7;
                }
                int i9 = this.zzZBo;
                if (i9 <= i7) {
                    if (i9 < i7) {
                        i3 = (int) jZzZ;
                        this.zzZBm = i5;
                        this.zzZBl = i5;
                        i2 = i3;
                    } else {
                        int i10 = (int) jZzZ;
                        if (i3 > i10) {
                            this.zzZBm = i5;
                            i3 = i10;
                        } else if (i2 < i10) {
                            this.zzZBl = i5;
                            i2 = i10;
                        }
                    }
                    this.zzZBo = i7;
                }
            }
        }

        public /* synthetic */ zzY(byte b) {
            this();
        }
    }

    public static class zzZ {
        public int zzZBp;
        public int zzZBq;
        public int zzZBr;
        public int zzZBs;
        public int zzZBt;
        public int zzZBu;

        public zzZ() {
            reset();
        }

        private void reset() {
            this.zzZBu = 0;
            this.zzZBt = -1;
            this.zzZBs = Integer.MIN_VALUE;
            this.zzZBq = Integer.MAX_VALUE;
            this.zzZBr = -1;
            this.zzZBp = -1;
        }

        private void zzW(com.aspose.words.internal.zz0P zz0p) {
            int i;
            long jZzZ = zzXR.zzZ(zz0p, this.zzZBt);
            for (int i2 = 0; i2 < zz0p.getCount(); i2++) {
                if (i2 != this.zzZBt) {
                    int i3 = i2 + 1;
                    if (i3 % zz0p.getCount() != this.zzZBt) {
                        long jZzZ2 = zzXR.zzZ(zz0p, i2);
                        long jZzZ3 = zzXR.zzZ(zz0p, i3);
                        int i4 = (int) (jZzZ >> 32);
                        int i5 = (int) (jZzZ2 >> 32);
                        if ((i4 <= i5 || i4 <= ((int) (jZzZ3 >> 32))) && ((i4 >= i5 || i4 >= ((int) (jZzZ3 >> 32))) && i5 != (i = (int) (jZzZ3 >> 32)))) {
                            int i6 = (int) jZzZ2;
                            int i7 = (int) jZzZ3;
                            double d = i6 != i7 ? (((double) i5) - ((double) i)) / ((double) (i6 - i7)) : 0.0d;
                            double d2 = ((double) i5) - (((double) i6) * d);
                            if (i5 > i) {
                                int i8 = (int) jZzZ;
                                if (i6 >= i8 || i7 >= i8) {
                                    if (d != 0.0d) {
                                        i6 = (int) ((((double) i4) - d2) / d);
                                    }
                                    if (i6 < this.zzZBq) {
                                        this.zzZBq = i6;
                                        this.zzZBp = i2;
                                    }
                                }
                            } else {
                                int i9 = (int) jZzZ;
                                if (i6 <= i9 || i7 <= i9) {
                                    if (d != 0.0d) {
                                        i6 = (int) ((((double) i4) - d2) / d);
                                    }
                                    if (i6 > this.zzZBs) {
                                        this.zzZBs = i6;
                                        this.zzZBr = i2;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        public final boolean zz7A() {
            return this.zzZBr >= 0;
        }

        public final boolean zz7B() {
            return this.zzZBu != 0;
        }

        public final boolean zz7z() {
            return this.zzZBp >= 0;
        }

        public final void zzZ(int i, com.aspose.words.internal.zz0P zz0p) {
            int i2;
            int i3;
            reset();
            while (true) {
                if (i >= zz0p.getCount()) {
                    break;
                }
                long jZzZ = zzXR.zzZ(zz0p, i);
                long jZzZ2 = zzXR.zzZ(zz0p, i - 1);
                int i4 = i + 1;
                long jZzZ3 = zzXR.zzZ(zz0p, i4);
                int i5 = (int) (jZzZ2 >> 32);
                int i6 = (int) (jZzZ >> 32);
                if (((i5 < i6 && i6 >= ((int) (jZzZ3 >> 32))) || (i5 <= i6 && i6 > ((int) (jZzZ3 >> 32)))) && ((int) jZzZ2) >= (i3 = (int) jZzZ) && i3 >= ((int) jZzZ3)) {
                    this.zzZBu = 1;
                    this.zzZBt = i;
                    break;
                } else {
                    if (((i5 > i6 && i6 <= ((int) (jZzZ3 >> 32))) || (i5 >= i6 && i6 < ((int) (jZzZ3 >> 32)))) && ((int) jZzZ2) <= (i2 = (int) jZzZ) && i2 <= ((int) jZzZ3)) {
                        this.zzZBu = -1;
                        this.zzZBt = i;
                        break;
                    }
                    i = i4;
                }
            }
            if (this.zzZBu != 0) {
                zzW(zz0p);
            }
        }
    }

    public zzXR(com.aspose.words.internal.zzZQ5 zzzq5) {
        this(zzzq5.getX(), zzzq5.getY(), zzzq5.getWidth(), zzzq5.getHeight());
    }

    private zzXR zz7C() {
        if (this.zzZBw.getCount() < 4) {
            return this;
        }
        com.aspose.words.internal.zz0P zz0pZzZ = zzZ(this);
        zzZ zzz = new zzZ();
        int iZzZ = 0;
        while (true) {
            zzz.zzZ(iZzZ, zz0pZzZ);
            if (!zzz.zz7B()) {
                return zzX(zz0pZzZ);
            }
            iZzZ = zzZ(zzz, zz0pZzZ);
        }
    }

    private com.aspose.words.internal.zzZQ5 zz7D() {
        int iMin = Integer.MAX_VALUE;
        int iMax = Integer.MIN_VALUE;
        int iMin2 = Integer.MAX_VALUE;
        int iMax2 = Integer.MIN_VALUE;
        for (int i = 0; i < this.zzZBw.getCount(); i++) {
            long jZzOL = zzOL(i);
            int i2 = (int) jZzOL;
            iMin = Math.min(iMin, i2);
            int i3 = (int) (jZzOL >> 32);
            iMin2 = Math.min(iMin2, i3);
            iMax2 = Math.max(iMax2, i2);
            iMax = Math.max(iMax, i3);
        }
        return new com.aspose.words.internal.zzZQ5(iMin, iMin2, iMax2 - iMin, iMax - iMin2);
    }

    private long zzOL(int i) {
        return zzZ(this.zzZBw, i);
    }

    private static boolean zzU(long j, long j2, long j3) {
        return zzo((int) j, (int) j2, (int) j3) && zzo((int) (j >> 32), (int) (j2 >> 32), (int) (j3 >> 32));
    }

    private static boolean zzV(long j, long j2, long j3) {
        if (com.aspose.words.internal.zzZPZ.zzD(j, j2) || com.aspose.words.internal.zzZPZ.zzD(j, j3) || !zzU(j, j2, j3)) {
            return false;
        }
        int i = (int) j;
        int i2 = (int) (j >> 32);
        return ((long) (((int) j3) - i)) * ((long) (((int) (j2 >> 32)) - i2)) == ((long) (((int) (j3 >> 32)) - i2)) * ((long) (((int) j2) - i));
    }

    private static zzXR zzX(com.aspose.words.internal.zz0P zz0p) {
        return new zzXR(zz0p);
    }

    private static boolean zzo(int i, int i2, int i3) {
        if (i > i2 || i2 > i3) {
            return i >= i2 && i2 >= i3;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (com.aspose.words.internal.zzZKO.zzA(null, obj)) {
            return false;
        }
        if (com.aspose.words.internal.zzZKO.zzA(this, obj)) {
            return true;
        }
        if (obj.getClass() != zzXR.class) {
            return false;
        }
        return zzY((zzXR) obj);
    }

    public final int getBottom() {
        return this.zzZBv.getBottom();
    }

    public final int getHeight() {
        return this.zzZBv.getHeight();
    }

    public final int getLeft() {
        return this.zzZBv.getLeft();
    }

    public final int getRight() {
        return this.zzZBv.getRight();
    }

    public final int getTop() {
        return this.zzZBv.getTop();
    }

    public final int getWidth() {
        return this.zzZBv.getWidth();
    }

    public final int getX() {
        return this.zzZBv.getX();
    }

    public final int getY() {
        return this.zzZBv.getY();
    }

    public int hashCode() {
        com.aspose.words.internal.zz0P zz0p = this.zzZBw;
        if (zz0p != null) {
            return zz0p.hashCode();
        }
        return 0;
    }

    public final long[] zz7E() {
        long[] jArr = new long[this.zzZBw.getCount()];
        for (int i = 0; i < this.zzZBw.getCount(); i++) {
            jArr[i] = zzOL(i);
        }
        return jArr;
    }

    public final boolean zz7F() {
        return this.zzZBx;
    }

    public final com.aspose.words.internal.zzZQ5 zz7G() {
        return this.zzZBv;
    }

    public final int zz7H() {
        zzY(this.zzZBw);
        return this.zzZBw.getCount();
    }

    public final zzXR zzM(int i, int i2, int i3, int i4) {
        return this.zzZBx ? new zzXR(new com.aspose.words.internal.zzZQ5(this.zzZBv.getX() - i, this.zzZBv.getY() - i2, this.zzZBv.getWidth() + i + i3, this.zzZBv.getHeight() + i2 + i4)) : zzXP.zzZ(this, i, i2, i3, i4);
    }

    public final boolean zzP(com.aspose.words.internal.zzZQ5 zzzq5) {
        return this.zzZBx ? this.zzZBv.zzP(zzzq5) : zzXP.zzY(this, new zzXR(zzzq5));
    }

    public final zzXR zzYA(int i, int i2) {
        if (i == 1) {
            i = i2;
        }
        return zzZ(i, 0, com.aspose.words.internal.zzZQ5.zz2U);
    }

    public final zzXR zzYB(int i, int i2) {
        return this.zzZBx ? new zzXR(this.zzZBv.getX() + i, this.zzZBv.getY() + i2, this.zzZBv.getWidth(), this.zzZBv.getHeight()) : zzXP.zzZ(this, i, i2);
    }

    public final zzXR zzZ(int i, int i2, com.aspose.words.internal.zzZQ5 zzzq5) {
        zzXR zzxr;
        zzzq5.isEmpty();
        if (i == 1) {
            return zzZ(0, zzzq5);
        }
        if (i == 2) {
            zzxr = new zzXR(this.zzZBv.getX(), this.zzZBv.getY(), this.zzZBv.getWidth(), this.zzZBv.getHeight());
        } else if (i == 4) {
            zzxr = zz7C();
        } else {
            if (i != 5) {
                return this;
            }
            zzxr = this;
        }
        if (i2 == 1) {
            return zzxr.zzZ(1, zzzq5);
        }
        if (i2 == 2) {
            return zzxr.zzZ(-1, zzzq5);
        }
        if (i2 != 3) {
            return zzxr;
        }
        return zzxr.zzZ(zzzq5.getRight() - zzxr.zzZBv.getRight() > zzxr.zzZBv.getLeft() - zzzq5.getLeft() ? -1 : 1, zzzq5);
    }

    public final long zzZE() {
        return this.zzZBv.zzZE();
    }

    public zzXR(zzYLC zzylc) {
        this(zzylc.zzYnn());
    }

    private static void zzY(com.aspose.words.internal.zz0P zz0p) {
        for (int i = 0; i < zz0p.getCount(); i++) {
            while (i < zz0p.getCount() && ((zz0p.getCount() > 1 && com.aspose.words.internal.zzZPZ.zzD(zz0p.get(i), zz0p.get((i + 1) % zz0p.getCount()))) || (zz0p.getCount() > 2 && zzV(zz0p.get(i), zz0p.get((i + 1) % zz0p.getCount()), zz0p.get((i + 2) % zz0p.getCount()))))) {
                zz0p.removeAt((i + 1) % zz0p.getCount());
            }
        }
    }

    public zzXR(int i, int i2, int i3, int i4) {
        this.zzZBv = new com.aspose.words.internal.zzZQ5();
        this.zzZBx = true;
        this.zzZBv = new com.aspose.words.internal.zzZQ5(i, i2, i3, i4);
        com.aspose.words.internal.zz0P zz0p = new com.aspose.words.internal.zz0P((byte) 0);
        this.zzZBw = zz0p;
        int i5 = i4 + i2;
        zz0p.add(com.aspose.words.internal.zzZPZ.zzZm(i, i5));
        this.zzZBw.add(com.aspose.words.internal.zzZPZ.zzZm(i, i2));
        int i6 = i + i3;
        this.zzZBw.add(com.aspose.words.internal.zzZPZ.zzZm(i6, i2));
        this.zzZBw.add(com.aspose.words.internal.zzZPZ.zzZm(i6, i5));
    }

    public final boolean zzY(zzXR zzxr) {
        if (com.aspose.words.internal.zzZKO.zzA(null, zzxr)) {
            return false;
        }
        if (com.aspose.words.internal.zzZKO.zzA(this, zzxr) || com.aspose.words.internal.zzZKO.equals(zzxr.zzZBw, this.zzZBw)) {
            return true;
        }
        com.aspose.words.internal.zz0P zz0p = zzxr.zzZBw;
        if (zz0p == null || this.zzZBw == null || zz0p.getCount() != this.zzZBw.getCount()) {
            return false;
        }
        for (int i = 0; i < this.zzZBw.getCount(); i++) {
            if (!com.aspose.words.internal.zzZKO.equals(Long.valueOf(zzxr.zzZBw.get(i)), Long.valueOf(this.zzZBw.get(i)))) {
                return false;
            }
        }
        return true;
    }

    public zzXR(long[] jArr) {
        this(new com.aspose.words.internal.zz0P(jArr), false);
    }

    public zzXR(com.aspose.words.internal.zz0P zz0p) {
        this(zz0p, true);
    }

    private zzXR(com.aspose.words.internal.zz0P zz0p, boolean z) {
        this.zzZBv = new com.aspose.words.internal.zzZQ5();
        this.zzZBx = false;
        zz0p = z ? new com.aspose.words.internal.zz0P(zz0p) : zz0p;
        this.zzZBw = zz0p;
        zzY(zz0p);
        this.zzZBv = zz7D();
    }

    private static com.aspose.words.internal.zz0P zzZ(zzXR zzxr) {
        return new com.aspose.words.internal.zz0P(zzxr.zzZBw);
    }

    private static int zzZ(zzZ zzz, com.aspose.words.internal.zz0P zz0p) {
        if (zzz.zz7A() || zzz.zz7z()) {
            long jZzZ = zzZ(zz0p, zzz.zzZBt);
            if (zzz.zzZBu > 0) {
                if (zzz.zz7A()) {
                    return zzZ(zz0p, zzz.zzZBr, zzz.zzZBt, zzz.zzZBs, (int) (jZzZ >> 32), false);
                }
                if (zzz.zz7z()) {
                    return zzZ(zz0p, zzz.zzZBp, zzz.zzZBt, zzz.zzZBq, (int) (jZzZ >> 32), true);
                }
            } else {
                if (zzz.zz7A()) {
                    return zzZ(zz0p, zzz.zzZBr, zzz.zzZBt, zzz.zzZBs, (int) (jZzZ >> 32), true);
                }
                if (zzz.zz7z()) {
                    return zzZ(zz0p, zzz.zzZBp, zzz.zzZBt, zzz.zzZBq, (int) (jZzZ >> 32), false);
                }
            }
        }
        return zzz.zzZBt + 1;
    }

    private static int zzZ(com.aspose.words.internal.zz0P zz0p, int i, int i2, int i3, int i4, boolean z) {
        long jZzZ = zzZ(zz0p, i);
        int i5 = i + 1;
        long jZzZ2 = zzZ(zz0p, i5);
        if (((int) (jZzZ >> 32)) != i4) {
            if (((int) (jZzZ2 >> 32)) == i4) {
                i = i5;
            } else {
                if (z) {
                    i = i5;
                }
                zz0p.set(i % zz0p.getCount(), com.aspose.words.internal.zzZPZ.zzZm(i3, i4));
            }
        }
        return (z ? zzZ(zz0p, i, i2) : zzZ(zz0p, i2, i)) <= 0 ? i2 + 1 : Math.min(i, i2) + 1;
    }

    private static int zzZ(com.aspose.words.internal.zz0P zz0p, int i, int i2) {
        if (i2 > i) {
            int i3 = (i2 - i) - 1;
            int i4 = i3;
            while (true) {
                i4--;
                if (i4 < 0) {
                    return i3;
                }
                zz0p.removeAt(i + 1);
            }
        } else {
            int count = (zz0p.getCount() - i) - 1;
            int i5 = count;
            while (true) {
                i5--;
                if (i5 < 0) {
                    break;
                }
                zz0p.removeAt(i + 1);
            }
            int i6 = count + i2;
            while (true) {
                i2--;
                if (i2 < 0) {
                    return i6;
                }
                zz0p.removeAt(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long zzZ(com.aspose.words.internal.zz0P zz0p, int i) {
        if (i < 0) {
            i = (zz0p.getCount() + i) - (zz0p.getCount() * (i / zz0p.getCount()));
        }
        return zz0p.get(i % zz0p.getCount());
    }

    private zzXR zzZ(int i, com.aspose.words.internal.zzZQ5 zzzq5) {
        int x;
        int right;
        if (this.zzZBv.getRight() <= zzzq5.getX() || zzzq5.getRight() <= this.zzZBv.getX()) {
            return this;
        }
        if (this.zzZBx) {
            if (i <= 0) {
                x = zzzq5.getLeft();
            } else {
                x = this.zzZBv.getX();
            }
            if (i >= 0) {
                right = zzzq5.getRight();
            } else {
                right = this.zzZBv.getRight();
            }
            return new zzXR(x, this.zzZBv.getY(), right - x, this.zzZBv.getHeight());
        }
        com.aspose.words.internal.zz0P zz0pZzZ = zzZ(this);
        zzY zzy = new zzY((byte) 0);
        zzy.zzV(zz0pZzZ);
        if (i == 0) {
            return new zzXR(zzzq5.getX(), zzy.zzZBn, zzzq5.getWidth(), zzy.zzZBo - zzy.zzZBn);
        }
        if (i <= 0) {
            long jZzZm = com.aspose.words.internal.zzZPZ.zzZm(0, zzy.zzZBo);
            long jZzZm2 = com.aspose.words.internal.zzZPZ.zzZm(0, zzy.zzZBn);
            int i2 = zzy.zzZBj;
            if (i2 < zzy.zzZBl) {
                zz0pZzZ.zzT(i2, jZzZm2);
                zz0pZzZ.zzT(zzy.zzZBl + 2, jZzZm);
                zzZ(zz0pZzZ, zzy.zzZBl + 2, zzy.zzZBj);
            } else {
                zz0pZzZ.zzT(i2, jZzZm2);
                zz0pZzZ.zzT(zzy.zzZBl + 1, jZzZm);
                zzZ(zz0pZzZ, zzy.zzZBl + 1, zzy.zzZBj);
            }
        } else if (i >= 0) {
            long jZzZm3 = com.aspose.words.internal.zzZPZ.zzZm(zzzq5.getRight(), zzy.zzZBo);
            long jZzZm4 = com.aspose.words.internal.zzZPZ.zzZm(zzzq5.getRight(), zzy.zzZBn);
            int i3 = zzy.zzZBk;
            int i4 = zzy.zzZBm;
            if (i3 < i4) {
                zz0pZzZ.zzT(i4, jZzZm3);
                zz0pZzZ.zzT(zzy.zzZBk + 1, jZzZm4);
                zzZ(zz0pZzZ, zzy.zzZBk + 1, zzy.zzZBm + 1);
            } else {
                zz0pZzZ.zzT(i3 + 1, jZzZm4);
                zz0pZzZ.zzT(zzy.zzZBm, jZzZm3);
                zzZ(zz0pZzZ, zzy.zzZBk + 2, zzy.zzZBm);
            }
        }
        return zzX(zz0pZzZ);
    }
}
