package com.aspose.words.internal;

import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes5.dex */
abstract class zzZ07 implements zzYGP, zzYUU {
    static final long[] zzWbP = {4794697086780616226L, 8158064640168781261L, -5349999486874862801L, -1606136188198331460L, 4131703408338449720L, 6480981068601479193L, -7908458776815382629L, -6116909921290321640L, -2880145864133508542L, 1334009975649890238L, 2608012711638119052L, 6128411473006802146L, 8268148722764581231L, -9160688886553864527L, -7215885187991268811L, -4495734319001033068L, -1973867731355612462L, -1171420211273849373L, 1135362057144423861L, 2597628984639134821L, 3308224258029322869L, 5365058923640841347L, 6679025012923562964L, 8573033837759648693L, -7476448914759557205L, -6327057829258317296L, -5763719355590565569L, -4658551843659510044L, -4116276920077217854L, -3051310485924567259L, 489312712824947311L, 1452737877330783856L, 2861767655752347644L, 3322285676063803686L, 5560940570517711597L, 5996557281743188959L, 7280758554555802590L, 8532644243296465576L, -9096487096722542874L, -7894198246740708037L, -6719396339535248540L, -6333637450476146687L, -4446306890439682159L, -4076793802049405392L, -3345356375505022440L, -2983346525034927856L, -860691631967231958L, 1182934255886127544L, 1847814050463011016L, 2177327727835720531L, 2830643537854262169L, 3796741975233480872L, 4115178125766777443L, 5681478168544905931L, 6601373596472566643L, 7507060721942968483L, 8399075790359081724L, 8693463985226723168L, -8878714635349349518L, -8302665154208450068L, -8016688836872298968L, -6606660893046293015L, -4685533653050689259L, -4147400797238176981L, -3880063495543823972L, -3348786107499101689L, -1523767162380948706L, -757361751448694408L, 500013540394364858L, 748580250866718886L, 1242879168328830382L, 1977374033974150939L, 2944078676154940804L, 3659926193048069267L, 4368137639120453308L, 4836135668995329356L, 5532061633213252278L, 6448918945643986474L, 6902733635092675308L, 7801388544844847127L};
    private int zzWbQ;
    private long[] zzWbR;
    protected long zzWbS;
    protected long zzWbT;
    protected long zzWbU;
    protected long zzWbV;
    protected long zzWbW;
    protected long zzWbX;
    protected long zzWbY;
    protected long zzWbZ;
    private long zzWc0;
    private long zzWc1;
    private int zzWng;
    private byte[] zzWnh;

    public zzZ07() {
        this.zzWbR = new long[80];
        this.zzWnh = new byte[8];
        this.zzWng = 0;
        reset();
    }

    private static long zzN(long j, long j2, long j3) {
        return ((j & j3) ^ (j & j2)) ^ (j2 & j3);
    }

    private static long zzO(long j, long j2, long j3) {
        return ((~j) & j3) ^ (j2 & j);
    }

    private static long zzX3(long j) {
        return (j >>> 6) ^ (((j << 45) | (j >>> 19)) ^ ((j << 3) | (j >>> 61)));
    }

    private static long zzX4(long j) {
        return (j >>> 7) ^ (((j << 63) | (j >>> 1)) ^ ((j << 56) | (j >>> 8)));
    }

    private static long zzX5(long j) {
        return ((j >>> 41) | (j << 23)) ^ (((j << 50) | (j >>> 14)) ^ ((j << 46) | (j >>> 18)));
    }

    private static long zzX6(long j) {
        return ((j >>> 39) | (j << 25)) ^ (((j << 36) | (j >>> 28)) ^ ((j << 30) | (j >>> 34)));
    }

    private void zzXE3() {
        long j = this.zzWc1;
        if (j > 2305843009213693951L) {
            this.zzWc0 += j >>> 61;
            this.zzWc1 = j & 2305843009213693951L;
        }
    }

    private void zzXHo() {
        zzXE3();
        for (int i = 16; i <= 79; i++) {
            long[] jArr = this.zzWbR;
            long jZzX3 = zzX3(jArr[i - 2]);
            long[] jArr2 = this.zzWbR;
            jArr[i] = jZzX3 + jArr2[i - 7] + zzX4(jArr2[i - 15]) + this.zzWbR[i - 16];
        }
        long j = this.zzWbZ;
        long j2 = this.zzWbY;
        long j3 = this.zzWbX;
        long j4 = this.zzWbW;
        long j5 = this.zzWbV;
        long j6 = this.zzWbU;
        long j7 = this.zzWbT;
        long j8 = this.zzWbS;
        long j9 = j2;
        long jZzX6 = j;
        long j10 = j5;
        long j11 = j4;
        long j12 = j3;
        long j13 = j6;
        long j14 = j7;
        int i2 = 0;
        int i3 = 0;
        while (i2 < 10) {
            long j15 = j14;
            long jZzX5 = zzX5(j10) + zzO(j10, j13, j14);
            long[] jArr3 = zzWbP;
            int i4 = i3 + 1;
            long j16 = jZzX5 + jArr3[i3] + this.zzWbR[i3] + j8;
            long j17 = j11 + j16;
            long jZzX62 = zzX6(jZzX6) + zzN(jZzX6, j9, j12) + j16;
            long j18 = j13;
            long j19 = j10;
            int i5 = i3 + 2;
            long jZzX52 = zzX5(j17) + zzO(j17, j19, j18) + jArr3[i4] + this.zzWbR[i4] + j15;
            long j20 = j12 + jZzX52;
            long j21 = j9;
            long j22 = jZzX6;
            long jZzX63 = zzX6(jZzX62) + zzN(jZzX62, j22, j21) + jZzX52;
            int i6 = i3 + 3;
            long jZzX53 = zzX5(j20) + zzO(j20, j17, j19) + jArr3[i5] + this.zzWbR[i5] + j18;
            long j23 = j21 + jZzX53;
            long jZzX64 = zzX6(jZzX63) + zzN(jZzX63, jZzX62, j22) + jZzX53;
            int i7 = i3 + 4;
            long jZzX54 = zzX5(j23) + zzO(j23, j20, j17) + jArr3[i6] + this.zzWbR[i6] + j19;
            long j24 = j22 + jZzX54;
            long jZzX65 = zzX6(jZzX64) + zzN(jZzX64, jZzX63, jZzX62) + jZzX54;
            int i8 = i3 + 5;
            long jZzX55 = zzX5(j24) + zzO(j24, j23, j20) + jArr3[i7] + this.zzWbR[i7] + j17;
            long j25 = jZzX62 + jZzX55;
            long jZzX66 = zzX6(jZzX65) + zzN(jZzX65, jZzX64, jZzX63) + jZzX55;
            int i9 = i3 + 6;
            long jZzX56 = zzX5(j25) + zzO(j25, j24, j23) + jArr3[i8] + this.zzWbR[i8] + j20;
            long j26 = jZzX63 + jZzX56;
            long jZzX67 = zzX6(jZzX66) + zzN(jZzX66, jZzX65, jZzX64) + jZzX56;
            int i10 = i3 + 7;
            long jZzX57 = zzX5(j26) + zzO(j26, j25, j24) + jArr3[i9] + this.zzWbR[i9] + j23;
            long j27 = jZzX64 + jZzX57;
            long jZzX68 = zzX6(jZzX67) + zzN(jZzX67, jZzX66, jZzX65) + jZzX57;
            i3 += 8;
            long jZzX58 = zzX5(j27) + zzO(j27, j26, j25) + jArr3[i10] + this.zzWbR[i10] + j24;
            i2++;
            j14 = j26;
            j12 = jZzX67;
            j11 = jZzX66;
            j10 = jZzX65 + jZzX58;
            jZzX6 = jZzX58 + zzX6(jZzX68) + zzN(jZzX68, jZzX67, jZzX66);
            j8 = j25;
            j9 = jZzX68;
            j13 = j27;
        }
        this.zzWbZ += jZzX6;
        this.zzWbY += j9;
        this.zzWbX += j12;
        this.zzWbW += j11;
        this.zzWbV += j10;
        this.zzWbU += j13;
        this.zzWbT += j14;
        this.zzWbS += j8;
        this.zzWbQ = 0;
        for (int i11 = 0; i11 < 16; i11++) {
            this.zzWbR[i11] = 0;
        }
    }

    private void zzk(byte[] bArr, int i) {
        this.zzWbR[this.zzWbQ] = zzYGN.zzZM(bArr, i);
        int i2 = this.zzWbQ + 1;
        this.zzWbQ = i2;
        if (i2 == 16) {
            zzXHo();
        }
    }

    private void zzr(long j, long j2) {
        if (this.zzWbQ > 14) {
            zzXHo();
        }
        long[] jArr = this.zzWbR;
        jArr[14] = j2;
        jArr[15] = j;
    }

    public final void finish() {
        zzXE3();
        long j = this.zzWc1 << 3;
        long j2 = this.zzWc0;
        update(UnsignedBytes.MAX_POWER_OF_TWO);
        while (this.zzWng != 0) {
            update((byte) 0);
        }
        zzr(j, j2);
        zzXHo();
    }

    public void reset() {
        this.zzWc1 = 0L;
        this.zzWc0 = 0L;
        int i = 0;
        this.zzWng = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.zzWnh;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = 0;
            i2++;
        }
        this.zzWbQ = 0;
        while (true) {
            long[] jArr = this.zzWbR;
            if (i == jArr.length) {
                return;
            }
            jArr[i] = 0;
            i++;
        }
    }

    @Override // com.aspose.words.internal.zzYUX
    public final void update(byte b) {
        byte[] bArr = this.zzWnh;
        int i = this.zzWng;
        int i2 = i + 1;
        this.zzWng = i2;
        bArr[i] = b;
        if (i2 == bArr.length) {
            zzk(bArr, 0);
            this.zzWng = 0;
        }
        this.zzWc1++;
    }

    @Override // com.aspose.words.internal.zzYUU, com.aspose.words.internal.zzYUX
    public final int zzXE6() {
        return 128;
    }

    public final void zzZ(zzZ07 zzz07) {
        byte[] bArr = zzz07.zzWnh;
        System.arraycopy(bArr, 0, this.zzWnh, 0, bArr.length);
        this.zzWng = zzz07.zzWng;
        this.zzWc1 = zzz07.zzWc1;
        this.zzWc0 = zzz07.zzWc0;
        this.zzWbZ = zzz07.zzWbZ;
        this.zzWbY = zzz07.zzWbY;
        this.zzWbX = zzz07.zzWbX;
        this.zzWbW = zzz07.zzWbW;
        this.zzWbV = zzz07.zzWbV;
        this.zzWbU = zzz07.zzWbU;
        this.zzWbT = zzz07.zzWbT;
        this.zzWbS = zzz07.zzWbS;
        long[] jArr = zzz07.zzWbR;
        System.arraycopy(jArr, 0, this.zzWbR, 0, jArr.length);
        this.zzWbQ = zzz07.zzWbQ;
    }

    public zzZ07(zzZ07 zzz07) {
        this.zzWbR = new long[80];
        this.zzWnh = new byte[zzz07.zzWnh.length];
        zzZ(zzz07);
    }

    @Override // com.aspose.words.internal.zzYUX
    public final void update(byte[] bArr, int i, int i2) {
        while (this.zzWng != 0 && i2 > 0) {
            update(bArr[i]);
            i++;
            i2--;
        }
        while (i2 > this.zzWnh.length) {
            zzk(bArr, i);
            byte[] bArr2 = this.zzWnh;
            i += bArr2.length;
            i2 -= bArr2.length;
            this.zzWc1 += (long) bArr2.length;
        }
        while (i2 > 0) {
            update(bArr[i]);
            i++;
            i2--;
        }
    }
}
