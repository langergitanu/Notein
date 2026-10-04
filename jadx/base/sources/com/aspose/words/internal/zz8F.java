package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz8F {

    public static class zzN extends zzZ {
        private zzN() {
            super((byte) 0);
        }

        @Override // com.aspose.words.internal.zz8F.zzZ
        public final int zzZV(int i, int i2) {
            return i ^ i2;
        }

        public /* synthetic */ zzN(byte b) {
            this();
        }
    }

    public static class zzO extends zzZ {
        private zzO() {
            super((byte) 0);
        }

        @Override // com.aspose.words.internal.zz8F.zzZ
        public final int zzZV(int i, int i2) {
            return ~(i ^ i2);
        }

        public /* synthetic */ zzO(byte b) {
            this();
        }
    }

    public static class zzP extends zzZ {
        private zzP() {
            super((byte) 0);
        }

        @Override // com.aspose.words.internal.zz8F.zzZ
        public final int zzZV(int i, int i2) {
            return ~(i | i2);
        }

        public /* synthetic */ zzP(byte b) {
            this();
        }
    }

    public static class zzQ extends zzZ {
        private zzQ() {
            super((byte) 0);
        }

        @Override // com.aspose.words.internal.zz8F.zzZ
        public final int zzZV(int i, int i2) {
            return ~(i & i2);
        }

        public /* synthetic */ zzQ(byte b) {
            this();
        }
    }

    public static class zzR extends zzZ {
        private zzR() {
            super((byte) 0);
        }

        @Override // com.aspose.words.internal.zz8F.zzZ
        public final int zzZV(int i, int i2) {
            return ~i;
        }

        public /* synthetic */ zzR(byte b) {
            this();
        }
    }

    public static class zzS extends zzZ {
        private zzS() {
            super((byte) 0);
        }

        @Override // com.aspose.words.internal.zz8F.zzZ
        public final int zzZV(int i, int i2) {
            return ~i2;
        }

        public /* synthetic */ zzS(byte b) {
            this();
        }
    }

    public static class zzT extends zzZ {
        private zzT() {
            super((byte) 0);
        }

        @Override // com.aspose.words.internal.zz8F.zzZ
        public final int zzZV(int i, int i2) {
            return i | (~i2);
        }

        public /* synthetic */ zzT(byte b) {
            this();
        }
    }

    public static class zzU extends zzZ {
        private zzU() {
            super((byte) 0);
        }

        @Override // com.aspose.words.internal.zz8F.zzZ
        public final int zzZV(int i, int i2) {
            return i | i2;
        }

        public /* synthetic */ zzU(byte b) {
            this();
        }
    }

    public static class zzV extends zzZ {
        private zzV() {
            super((byte) 0);
        }

        @Override // com.aspose.words.internal.zz8F.zzZ
        public final int zzZV(int i, int i2) {
            return (~i) | i2;
        }

        public /* synthetic */ zzV(byte b) {
            this();
        }
    }

    public static class zzW extends zzZ {
        private zzW() {
            super((byte) 0);
        }

        @Override // com.aspose.words.internal.zz8F.zzZ
        public final int zzZV(int i, int i2) {
            return i & (~i2);
        }

        public /* synthetic */ zzW(byte b) {
            this();
        }
    }

    public static class zzX extends zzZ {
        private zzX() {
            super((byte) 0);
        }

        @Override // com.aspose.words.internal.zz8F.zzZ
        public final int zzZV(int i, int i2) {
            return i & i2;
        }

        public /* synthetic */ zzX(byte b) {
            this();
        }
    }

    public static class zzY extends zzZ {
        private zzY() {
            super((byte) 0);
        }

        @Override // com.aspose.words.internal.zz8F.zzZ
        public final int zzZV(int i, int i2) {
            return (~i) & i2;
        }

        public /* synthetic */ zzY(byte b) {
            this();
        }
    }

    public static abstract class zzZ {
        public static zzZ zzoK;
        public static zzZ zzoL;
        public static zzZ zzoM;
        public static zzZ zzoN;
        public static zzZ zzoO;
        public static zzZ zzoP;
        public static zzZ zzoQ;
        public static zzZ zzoR;
        public static zzZ zzoS;
        public static zzZ zzoT;
        public static zzZ zzoU;
        public static zzZ zzoV;

        static {
            byte b = 0;
            zzoV = new zzS(b);
            zzoU = new zzP(b);
            zzoT = new zzY(b);
            zzoS = new zzR(b);
            zzoR = new zzW(b);
            zzoQ = new zzN(b);
            zzoP = new zzQ(b);
            zzoO = new zzX(b);
            zzoN = new zzO(b);
            zzoM = new zzV(b);
            zzoL = new zzT(b);
            zzoK = new zzU(b);
        }

        private zzZ() {
        }

        public final zz8G zzZ(zz8G zz8g, zz8G zz8g2) {
            return new zz8G(255, zzZV(zz8g.zzyi() & 255, zz8g2.zzyi() & 255), zzZV(zz8g.zzyh() & 255, zz8g2.zzyh() & 255), zzZV(zz8g.zzyg() & 255, zz8g2.zzyg() & 255));
        }

        public abstract int zzZV(int i, int i2);

        public /* synthetic */ zzZ(byte b) {
            this();
        }
    }

    private static zz8G zzU(zz8G zz8g, zz8G zz8g2) {
        if (zz8g.zzyl()) {
            return zz8g2;
        }
        if (zz8g2.zzyl()) {
            return zz8g;
        }
        if (zz8g2.zzyj() == 0) {
            zz8g2 = new zz8G(zz8g2, (byte) -1);
        }
        return new zz8G((zz8g.zzyj() & 255) | (zz8g2.zzyj() & 255), (zz8g.zzyi() & 255) ^ (zz8g2.zzyi() & 255), (zz8g.zzyh() & 255) ^ (zz8g2.zzyh() & 255), (zz8g.zzyg() & 255) ^ (zz8g2.zzyg() & 255));
    }

    private static zz8G zzV(zz8G zz8g, zz8G zz8g2) {
        return (zz8g.zzyl() && zz8g2.zzyj() == 0) ? zz8g2 : new zz8G((zz8g.zzyj() & 255) | (zz8g2.zzyj() & 255), (zz8g.zzyi() & 255) | (zz8g2.zzyi() & 255), (zz8g.zzyh() & 255) | (zz8g2.zzyh() & 255), (zz8g.zzyg() & 255) | (zz8g2.zzyg() & 255));
    }

    private static zz8G zzW(zz8G zz8g, zz8G zz8g2) {
        return new zz8G(zz8g.zzyj() & 255 & (~(zz8g2.zzyj() & 255)), zz8g.zzyi() & 255 & (~(zz8g2.zzyi() & 255)), zz8g.zzyh() & 255 & (~(zz8g2.zzyh() & 255)), zz8g.zzyg() & 255 & (~(zz8g2.zzyg() & 255)));
    }

    private static zz8G zzX(zz8G zz8g, zz8G zz8g2) {
        if (!zz8g.zzyl()) {
            if (zz8g2.zzyl() || zz8g.zzyk()) {
                return zz8g2;
            }
            if (!zz8g2.zzyk()) {
                return new zz8G((zz8g.zzyj() & 255) | (zz8g2.zzyj() & 255), zz8g.zzyi() & 255 & zz8g2.zzyi() & 255, zz8g.zzyh() & 255 & zz8g2.zzyh() & 255, zz8g.zzyg() & 255 & zz8g2.zzyg() & 255);
            }
        }
        return zz8g;
    }

    public static zz8G zzY(zz8G zz8g, zz8G zz8g2, int i) {
        zz8G zz8gZzZ = zzZ(zz8g2);
        switch (i) {
            case 4457256:
                return zzW(zz8g, zz8gZzZ);
            case 6684742:
                return zzU(zz8g, zz8gZzZ);
            case 8913094:
                return zzX(zz8g, zz8gZzZ);
            case 12255782:
                return zzY(zz8g, zz8gZzZ);
            case 15597702:
                return zzV(zz8g, zz8gZzZ);
            default:
                return zz8gZzZ;
        }
    }

    public static zz8G zzZ(zz8G zz8g, zz8G zz8g2, int i) {
        if (zz8g.zzyj() == 0) {
            return zz8g2;
        }
        zz8G zz8gZzZ = zzZ(zz8g2);
        switch (i) {
            case 2:
                return zzZ.zzoU.zzZ(zz8g, zz8gZzZ);
            case 3:
                return zzZ.zzoT.zzZ(zz8g, zz8gZzZ);
            case 4:
                return zzZ.zzoS.zzZ(zz8g, zz8gZzZ);
            case 5:
                return zzZ.zzoR.zzZ(zz8g, zz8gZzZ);
            case 6:
                return zzZ.zzoV.zzZ(zz8g, zz8gZzZ);
            case 7:
                return zzZ.zzoQ.zzZ(zz8g, zz8gZzZ);
            case 8:
                return zzZ.zzoP.zzZ(zz8g, zz8gZzZ);
            case 9:
                return zzZ.zzoO.zzZ(zz8g, zz8gZzZ);
            case 10:
                return zzZ.zzoN.zzZ(zz8g, zz8gZzZ);
            case 11:
            case 13:
            default:
                return zz8gZzZ;
            case 12:
                return zzZ.zzoM.zzZ(zz8g, zz8gZzZ);
            case 14:
                return zzZ.zzoL.zzZ(zz8g, zz8gZzZ);
            case 15:
                return zzZ.zzoK.zzZ(zz8g, zz8gZzZ);
        }
    }

    private static zz8G zzY(zz8G zz8g, zz8G zz8g2) {
        if ((zz8g.zzyi() & 255) == 255 && (zz8g.zzyh() & 255) == 255 && (zz8g.zzyg() & 255) == 255) {
            zz8g = new zz8G(zz8g, (byte) 0);
        }
        return new zz8G((zz8g2.zzyj() & 255) | (zz8g.zzyj() & 255), (zz8g2.zzyi() & 255) | (~(zz8g.zzyi() & 255)), (zz8g2.zzyh() & 255) | (~(zz8g.zzyh() & 255)), (~(zz8g.zzyg() & 255)) | (zz8g2.zzyg() & 255));
    }

    public static zz8G zzY(zz8G zz8g) {
        return new zz8G(zz8g.zzyj() & 255, ~(zz8g.zzyi() & 255), ~(zz8g.zzyh() & 255), ~(zz8g.zzyg() & 255));
    }

    private static zz8G zzZ(zz8G zz8g) {
        return zz8g.zzyj() == 0 ? new zz8G(0, 255, 255, 255) : zz8g;
    }
}
