package oO0oOoo0;

import OooOOO0.AbstractC20449OooO0Oo;
import com.google.common.primitives.UnsignedBytes;
import oO0oOoOo.InterfaceC34201OooO0Oo;

/* JADX INFO: renamed from: oO0oOoo0.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC34210OooO0OO implements InterfaceC34201OooO0Oo {

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final long[] f122876OooOOOO = {4794697086780616226L, 8158064640168781261L, -5349999486874862801L, -1606136188198331460L, 4131703408338449720L, 6480981068601479193L, -7908458776815382629L, -6116909921290321640L, -2880145864133508542L, 1334009975649890238L, 2608012711638119052L, 6128411473006802146L, 8268148722764581231L, -9160688886553864527L, -7215885187991268811L, -4495734319001033068L, -1973867731355612462L, -1171420211273849373L, 1135362057144423861L, 2597628984639134821L, 3308224258029322869L, 5365058923640841347L, 6679025012923562964L, 8573033837759648693L, -7476448914759557205L, -6327057829258317296L, -5763719355590565569L, -4658551843659510044L, -4116276920077217854L, -3051310485924567259L, 489312712824947311L, 1452737877330783856L, 2861767655752347644L, 3322285676063803686L, 5560940570517711597L, 5996557281743188959L, 7280758554555802590L, 8532644243296465576L, -9096487096722542874L, -7894198246740708037L, -6719396339535248540L, -6333637450476146687L, -4446306890439682159L, -4076793802049405392L, -3345356375505022440L, -2983346525034927856L, -860691631967231958L, 1182934255886127544L, 1847814050463011016L, 2177327727835720531L, 2830643537854262169L, 3796741975233480872L, 4115178125766777443L, 5681478168544905931L, 6601373596472566643L, 7507060721942968483L, 8399075790359081724L, 8693463985226723168L, -8878714635349349518L, -8302665154208450068L, -8016688836872298968L, -6606660893046293015L, -4685533653050689259L, -4147400797238176981L, -3880063495543823972L, -3348786107499101689L, -1523767162380948706L, -757361751448694408L, 500013540394364858L, 748580250866718886L, 1242879168328830382L, 1977374033974150939L, 2944078676154940804L, 3659926193048069267L, 4368137639120453308L, 4836135668995329356L, 5532061633213252278L, 6448918945643986474L, 6902733635092675308L, 7801388544844847127L};

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public long f122877OooO;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public long f122880OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public long f122881OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public long f122882OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public long f122883OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f122884OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f122885OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public long f122886OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public long f122887OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public long f122888OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f122889OooOOO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final byte[] f122878OooO00o = new byte[8];

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final long[] f122890OooOOO0 = new long[80];

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f122879OooO0O0 = 0;

    public AbstractC34210OooO0OO() {
        OooOO0();
    }

    public static long OooO0Oo(long j, long j2, long j3) {
        return ((~j) & j3) ^ (j2 & j);
    }

    public static long OooO0o(long j) {
        return ((j >>> 39) | (j << 25)) ^ (((j << 36) | (j >>> 28)) ^ ((j << 30) | (j >>> 34)));
    }

    public static long OooO0o0(long j, long j2, long j3) {
        return ((j & j3) ^ (j & j2)) ^ (j2 & j3);
    }

    public static long OooO0oO(long j) {
        return ((j >>> 41) | (j << 23)) ^ (((j << 50) | (j >>> 14)) ^ ((j << 46) | (j >>> 18)));
    }

    public final void OooO() {
        long[] jArr;
        long j = this.f122880OooO0OO;
        if (j > 2305843009213693951L) {
            this.f122881OooO0Oo += j >>> 61;
            this.f122880OooO0OO = j & 2305843009213693951L;
        }
        int i = 16;
        while (true) {
            jArr = this.f122890OooOOO0;
            if (i > 79) {
                break;
            }
            long j2 = jArr[i - 2];
            long j3 = ((j2 >>> 6) ^ (((j2 << 45) | (j2 >>> 19)) ^ ((j2 << 3) | (j2 >>> 61)))) + jArr[i - 7];
            long j4 = jArr[i - 15];
            jArr[i] = j3 + ((((j4 >>> 8) | (j4 << 56)) ^ ((j4 << 63) | (j4 >>> 1))) ^ (j4 >>> 7)) + jArr[i - 16];
            i++;
        }
        long j5 = this.f122883OooO0o0;
        long j6 = this.f122882OooO0o;
        long j7 = this.f122884OooO0oO;
        long j8 = this.f122885OooO0oo;
        long j9 = this.f122877OooO;
        long j10 = this.f122886OooOO0;
        long j11 = this.f122887OooOO0O;
        long j12 = this.f122888OooOO0o;
        long j13 = j11;
        long j14 = j10;
        int i2 = 0;
        int i3 = 0;
        long j15 = j8;
        long j16 = j9;
        long j17 = j6;
        long j18 = j7;
        long jOooO0o = j5;
        while (i2 < 10) {
            long jOooO0oO = OooO0oO(j16) + OooO0Oo(j16, j14, j13);
            long[] jArr2 = f122876OooOOOO;
            int i4 = i3 + 1;
            long j19 = jOooO0oO + jArr2[i3] + jArr[i3] + j12;
            long j20 = j15 + j19;
            long j21 = jOooO0o;
            long j22 = j17;
            long jOooO0o2 = OooO0o(jOooO0o) + OooO0o0(jOooO0o, j17, j18) + j19;
            int i5 = i3 + 2;
            long jOooO0oO2 = OooO0oO(j20) + OooO0Oo(j20, j16, j14) + jArr2[i4] + jArr[i4] + j13;
            long j23 = j18 + jOooO0oO2;
            long jOooO0o3 = OooO0o(jOooO0o2) + OooO0o0(jOooO0o2, j21, j22) + jOooO0oO2;
            int i6 = i3 + 3;
            long jOooO0oO3 = OooO0oO(j23) + OooO0Oo(j23, j20, j16) + jArr2[i5] + jArr[i5] + j14;
            long j24 = j22 + jOooO0oO3;
            long jOooO0o4 = OooO0o(jOooO0o3) + OooO0o0(jOooO0o3, jOooO0o2, j21) + jOooO0oO3;
            int i7 = i3 + 4;
            long jOooO0oO4 = OooO0oO(j24) + OooO0Oo(j24, j23, j20) + jArr2[i6] + jArr[i6] + j16;
            long j25 = j21 + jOooO0oO4;
            long jOooO0o5 = OooO0o(jOooO0o4) + OooO0o0(jOooO0o4, jOooO0o3, jOooO0o2) + jOooO0oO4;
            int i8 = i3 + 5;
            long jOooO0oO5 = OooO0oO(j25) + OooO0Oo(j25, j24, j23) + jArr2[i7] + jArr[i7] + j20;
            long j26 = jOooO0o2 + jOooO0oO5;
            long jOooO0o6 = OooO0o(jOooO0o5) + OooO0o0(jOooO0o5, jOooO0o4, jOooO0o3) + jOooO0oO5;
            int i9 = i3 + 6;
            long jOooO0oO6 = OooO0oO(j26) + OooO0Oo(j26, j25, j24) + jArr2[i8] + jArr[i8] + j23;
            long j27 = jOooO0o3 + jOooO0oO6;
            long jOooO0o7 = OooO0o(jOooO0o6) + OooO0o0(jOooO0o6, jOooO0o5, jOooO0o4) + jOooO0oO6;
            int i10 = i3 + 7;
            long jOooO0oO7 = OooO0oO(j27) + OooO0Oo(j27, j26, j25) + jArr2[i9] + jArr[i9] + j24;
            long j28 = jOooO0o4 + jOooO0oO7;
            long jOooO0o8 = OooO0o(jOooO0o7) + OooO0o0(jOooO0o7, jOooO0o6, jOooO0o5) + jOooO0oO7;
            i3 += 8;
            long jOooO0oO8 = OooO0oO(j28) + OooO0Oo(j28, j27, j26) + jArr2[i10] + jArr[i10] + j25;
            j16 = jOooO0o5 + jOooO0oO8;
            j18 = jOooO0o7;
            jOooO0o = OooO0o(jOooO0o8) + OooO0o0(jOooO0o8, jOooO0o7, jOooO0o6) + jOooO0oO8;
            i2++;
            j17 = jOooO0o8;
            j15 = jOooO0o6;
            j14 = j28;
            j13 = j27;
            j12 = j26;
        }
        this.f122883OooO0o0 += jOooO0o;
        this.f122882OooO0o += j17;
        this.f122884OooO0oO += j18;
        this.f122885OooO0oo += j15;
        this.f122877OooO += j16;
        this.f122886OooOO0 += j14;
        this.f122887OooOO0O += j13;
        this.f122888OooOO0o += j12;
        this.f122889OooOOO = 0;
        for (int i11 = 0; i11 < 16; i11++) {
            jArr[i11] = 0;
        }
    }

    public final void OooO0oo() {
        long j = this.f122880OooO0OO;
        if (j > 2305843009213693951L) {
            this.f122881OooO0Oo += j >>> 61;
            this.f122880OooO0OO = j & 2305843009213693951L;
        }
        long j2 = this.f122880OooO0OO << 3;
        long j3 = this.f122881OooO0Oo;
        byte b = UnsignedBytes.MAX_POWER_OF_TWO;
        while (true) {
            update(b);
            if (this.f122879OooO0O0 == 0) {
                break;
            } else {
                b = 0;
            }
        }
        if (this.f122889OooOOO > 14) {
            OooO();
        }
        long[] jArr = this.f122890OooOOO0;
        jArr[14] = j3;
        jArr[15] = j2;
        OooO();
    }

    public void OooOO0() {
        this.f122880OooO0OO = 0L;
        this.f122881OooO0Oo = 0L;
        int i = 0;
        this.f122879OooO0O0 = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f122878OooO00o;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = 0;
            i2++;
        }
        this.f122889OooOOO = 0;
        while (true) {
            long[] jArr = this.f122890OooOOO0;
            if (i == jArr.length) {
                return;
            }
            jArr[i] = 0;
            i++;
        }
    }

    @Override // oO0oOoOo.InterfaceC34201OooO0Oo
    public final void update(byte b) {
        int i = this.f122879OooO0O0;
        int i2 = i + 1;
        this.f122879OooO0O0 = i2;
        byte[] bArr = this.f122878OooO00o;
        bArr[i] = b;
        if (i2 == bArr.length) {
            this.f122890OooOOO0[this.f122889OooOOO] = (((long) AbstractC20449OooO0Oo.OooO0oo(4, bArr)) & 4294967295L) | ((((long) AbstractC20449OooO0Oo.OooO0oo(0, bArr)) & 4294967295L) << 32);
            int i3 = this.f122889OooOOO + 1;
            this.f122889OooOOO = i3;
            if (i3 == 16) {
                OooO();
            }
            this.f122879OooO0O0 = 0;
        }
        this.f122880OooO0OO++;
    }

    @Override // oO0oOoOo.InterfaceC34201OooO0Oo
    public final void update(byte[] bArr, int i, int i2) {
        while (this.f122879OooO0O0 != 0 && i2 > 0) {
            update(bArr[i]);
            i++;
            i2--;
        }
        while (true) {
            byte[] bArr2 = this.f122878OooO00o;
            if (i2 <= bArr2.length) {
                break;
            }
            this.f122890OooOOO0[this.f122889OooOOO] = (((long) AbstractC20449OooO0Oo.OooO0oo(i + 4, bArr)) & 4294967295L) | ((((long) AbstractC20449OooO0Oo.OooO0oo(i, bArr)) & 4294967295L) << 32);
            int i3 = this.f122889OooOOO + 1;
            this.f122889OooOOO = i3;
            if (i3 == 16) {
                OooO();
            }
            i += bArr2.length;
            i2 -= bArr2.length;
            this.f122880OooO0OO += (long) bArr2.length;
        }
        while (i2 > 0) {
            update(bArr[i]);
            i++;
            i2--;
        }
    }
}
