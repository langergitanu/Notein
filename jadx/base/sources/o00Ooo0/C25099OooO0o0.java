package o00Ooo0;

import android.graphics.Bitmap;
import android.util.Log;
import com.aspose.words.EditingLanguage;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;
import o00Ooo0.InterfaceC25097OooO00o;
import o00OooOO.C25159OooO0oO;

/* JADX INFO: renamed from: o00Ooo0.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25099OooO0o0 implements InterfaceC25097OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public byte[] f85235OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public int[] f85236OooO00o;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC25097OooO00o.InterfaceC19675OooO00o f85238OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public ByteBuffer f85239OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public short[] f85240OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public byte[] f85241OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public byte[] f85242OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public byte[] f85243OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final int[] f85244OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public int f85245OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public OooO0OO f85246OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final boolean f85247OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public Bitmap f85248OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f85249OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final int f85250OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final int f85251OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final int f85252OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public Boolean f85253OooOOoo;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int[] f85237OooO0O0 = new int[256];

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public Bitmap.Config f85254OooOo00 = Bitmap.Config.ARGB_8888;

    public C25099OooO0o0(InterfaceC25097OooO00o.InterfaceC19675OooO00o interfaceC19675OooO00o, OooO0OO oooO0OO, ByteBuffer byteBuffer, int i) {
        this.f85238OooO0OO = interfaceC19675OooO00o;
        this.f85246OooOO0o = new OooO0OO();
        synchronized (this) {
            try {
                if (i <= 0) {
                    throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
                }
                int iHighestOneBit = Integer.highestOneBit(i);
                this.f85249OooOOOO = 0;
                this.f85246OooOO0o = oooO0OO;
                this.f85245OooOO0O = -1;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                this.f85239OooO0Oo = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                this.f85239OooO0Oo.order(ByteOrder.LITTLE_ENDIAN);
                this.f85247OooOOO = false;
                Iterator it = oooO0OO.f85226OooO0o0.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((OooO0O0) it.next()).f85216OooO0oO == 3) {
                        this.f85247OooOOO = true;
                        break;
                    }
                }
                this.f85250OooOOOo = iHighestOneBit;
                int i2 = oooO0OO.f85225OooO0o;
                this.f85251OooOOo = i2 / iHighestOneBit;
                int i3 = oooO0OO.f85227OooO0oO;
                this.f85252OooOOo0 = i3 / iHighestOneBit;
                int i4 = i2 * i3;
                C25159OooO0oO c25159OooO0oO = ((o00o00.OooO0O0) this.f85238OooO0OO).f85818OooO0O0;
                this.f85235OooO = c25159OooO0oO == null ? new byte[i4] : (byte[]) c25159OooO0oO.OooO0Oo(byte[].class, i4);
                InterfaceC25097OooO00o.InterfaceC19675OooO00o interfaceC19675OooO00o2 = this.f85238OooO0OO;
                int i5 = this.f85251OooOOo * this.f85252OooOOo0;
                C25159OooO0oO c25159OooO0oO2 = ((o00o00.OooO0O0) interfaceC19675OooO00o2).f85818OooO0O0;
                this.f85244OooOO0 = c25159OooO0oO2 == null ? new int[i5] : (int[]) c25159OooO0oO2.OooO0Oo(int[].class, i5);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o00Ooo0.InterfaceC25097OooO00o
    public final synchronized Bitmap OooO00o() {
        try {
            if (this.f85246OooOO0o.f85223OooO0OO <= 0 || this.f85245OooOO0O < 0) {
                if (Log.isLoggable("OooO0o0", 3)) {
                    Log.d("OooO0o0", "Unable to decode frame, frameCount=" + this.f85246OooOO0o.f85223OooO0OO + ", framePointer=" + this.f85245OooOO0O);
                }
                this.f85249OooOOOO = 1;
            }
            int i = this.f85249OooOOOO;
            if (i != 1 && i != 2) {
                this.f85249OooOOOO = 0;
                if (this.f85241OooO0o0 == null) {
                    C25159OooO0oO c25159OooO0oO = ((o00o00.OooO0O0) this.f85238OooO0OO).f85818OooO0O0;
                    this.f85241OooO0o0 = c25159OooO0oO == null ? new byte[255] : (byte[]) c25159OooO0oO.OooO0Oo(byte[].class, 255);
                }
                OooO0O0 oooO0O0 = (OooO0O0) this.f85246OooOO0o.f85226OooO0o0.get(this.f85245OooOO0O);
                int i2 = this.f85245OooOO0O - 1;
                OooO0O0 oooO0O02 = i2 >= 0 ? (OooO0O0) this.f85246OooOO0o.f85226OooO0o0.get(i2) : null;
                int[] iArr = oooO0O0.f85219OooOO0O;
                if (iArr == null) {
                    iArr = this.f85246OooOO0o.f85221OooO00o;
                }
                this.f85236OooO00o = iArr;
                if (iArr == null) {
                    if (Log.isLoggable("OooO0o0", 3)) {
                        Log.d("OooO0o0", "No valid color table found for frame #" + this.f85245OooOO0O);
                    }
                    this.f85249OooOOOO = 1;
                    return null;
                }
                if (oooO0O0.f85214OooO0o) {
                    System.arraycopy(iArr, 0, this.f85237OooO0O0, 0, iArr.length);
                    int[] iArr2 = this.f85237OooO0O0;
                    this.f85236OooO00o = iArr2;
                    iArr2[oooO0O0.f85217OooO0oo] = 0;
                    if (oooO0O0.f85216OooO0oO == 2 && this.f85245OooOO0O == 0) {
                        this.f85253OooOOoo = Boolean.TRUE;
                    }
                }
                return OooO0o0(oooO0O0, oooO0O02);
            }
            if (Log.isLoggable("OooO0o0", 3)) {
                Log.d("OooO0o0", "Unable to decode frame, status=" + this.f85249OooOOOO);
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void OooO0O0() {
        this.f85245OooOO0O = (this.f85245OooOO0O + 1) % this.f85246OooOO0o.f85223OooO0OO;
    }

    public final Bitmap OooO0OO() {
        Boolean bool = this.f85253OooOOoo;
        Bitmap bitmapOooO0O0 = ((o00o00.OooO0O0) this.f85238OooO0OO).f85817OooO00o.OooO0O0(this.f85251OooOOo, this.f85252OooOOo0, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.f85254OooOo00);
        bitmapOooO0O0.setHasAlpha(true);
        return bitmapOooO0O0;
    }

    public final void OooO0Oo(Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
        if (config == config3 || config == (config2 = Bitmap.Config.RGB_565)) {
            this.f85254OooOo00 = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + config3 + " or " + config2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v19, types: [short] */
    /* JADX WARN: Type inference failed for: r6v21 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap OooO0o0(OooO0O0 oooO0O0, OooO0O0 oooO0O02) {
        int[] iArr;
        byte b;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr2;
        int i6;
        short[] sArr;
        int i7;
        short s;
        int i8;
        Bitmap bitmap;
        int[] iArr3 = this.f85244OooOO0;
        InterfaceC25097OooO00o.InterfaceC19675OooO00o interfaceC19675OooO00o = this.f85238OooO0OO;
        byte b2 = 0;
        if (oooO0O02 == null) {
            Bitmap bitmap2 = this.f85248OooOOO0;
            if (bitmap2 != null) {
                ((o00o00.OooO0O0) interfaceC19675OooO00o).f85817OooO00o.OooO00o(bitmap2);
            }
            this.f85248OooOOO0 = null;
            Arrays.fill(iArr3, 0);
        }
        if (oooO0O02 != null && oooO0O02.f85216OooO0oO == 3 && this.f85248OooOOO0 == null) {
            Arrays.fill(iArr3, 0);
        }
        if (oooO0O02 != null && (i8 = oooO0O02.f85216OooO0oO) > 0) {
            if (i8 == 2) {
                if (!oooO0O0.f85214OooO0o) {
                    OooO0OO oooO0OO = this.f85246OooOO0o;
                    int i9 = oooO0OO.f85230OooOO0O;
                    if (oooO0O0.f85219OooOO0O != null && oooO0OO.f85229OooOO0 == oooO0O0.f85217OooO0oo) {
                        i9 = 0;
                    }
                    int i10 = oooO0O02.f85213OooO0Oo;
                    int i11 = this.f85250OooOOOo;
                    int i12 = i10 / i11;
                    int i13 = oooO0O02.f85211OooO0O0 / i11;
                    int i14 = oooO0O02.f85212OooO0OO / i11;
                    int i15 = oooO0O02.f85210OooO00o / i11;
                    int i16 = this.f85251OooOOo;
                    int i17 = (i13 * i16) + i15;
                    int i18 = (i12 * i16) + i17;
                    while (i17 < i18) {
                        int i19 = i17 + i14;
                        for (int i20 = i17; i20 < i19; i20++) {
                            iArr3[i20] = i9;
                        }
                        i17 += this.f85251OooOOo;
                    }
                }
            } else if (i8 == 3 && (bitmap = this.f85248OooOOO0) != null) {
                int i21 = this.f85251OooOOo;
                bitmap.getPixels(iArr3, 0, i21, 0, 0, i21, this.f85252OooOOo0);
            }
        }
        int[] iArr4 = iArr3;
        this.f85239OooO0Oo.position(oooO0O0.f85218OooOO0);
        int i22 = oooO0O0.f85212OooO0OO * oooO0O0.f85213OooO0Oo;
        byte[] bArr = this.f85235OooO;
        if (bArr == null || bArr.length < i22) {
            C25159OooO0oO c25159OooO0oO = ((o00o00.OooO0O0) interfaceC19675OooO00o).f85818OooO0O0;
            this.f85235OooO = c25159OooO0oO == null ? new byte[i22] : (byte[]) c25159OooO0oO.OooO0Oo(byte[].class, i22);
        }
        byte[] bArr2 = this.f85235OooO;
        if (this.f85240OooO0o == null) {
            this.f85240OooO0o = new short[4096];
        }
        short[] sArr2 = this.f85240OooO0o;
        if (this.f85242OooO0oO == null) {
            this.f85242OooO0oO = new byte[4096];
        }
        byte[] bArr3 = this.f85242OooO0oO;
        if (this.f85243OooO0oo == null) {
            this.f85243OooO0oo = new byte[EditingLanguage.ARABIC_LIBYA];
        }
        byte[] bArr4 = this.f85243OooO0oo;
        int i23 = this.f85239OooO0Oo.get() & 255;
        int i24 = 1;
        int i25 = 1 << i23;
        int i26 = i25 + 1;
        int i27 = i25 + 2;
        int i28 = i23 + 1;
        int i29 = (1 << i28) - 1;
        int i30 = 0;
        while (i30 < i25) {
            sArr2[i30] = 0;
            bArr3[i30] = (byte) i30;
            i30++;
            i24 = i24;
        }
        int i31 = i24;
        byte[] bArr5 = this.f85241OooO0o0;
        int i32 = i28;
        int i33 = 0;
        int i34 = 0;
        int i35 = 0;
        int i36 = 0;
        int i37 = 0;
        int i38 = 0;
        int i39 = 0;
        int i40 = 0;
        int i41 = i27;
        int i42 = i29;
        int i43 = -1;
        while (true) {
            if (i33 >= i22) {
                iArr = iArr4;
                b = b2;
                break;
            }
            if (i34 == 0) {
                i7 = -1;
                int i44 = this.f85239OooO0Oo.get() & 255;
                if (i44 <= 0) {
                    iArr = iArr4;
                    sArr = sArr2;
                } else {
                    ByteBuffer byteBuffer = this.f85239OooO0Oo;
                    iArr = iArr4;
                    sArr = sArr2;
                    byteBuffer.get(this.f85241OooO0o0, 0, Math.min(i44, byteBuffer.remaining()));
                }
                if (i44 <= 0) {
                    this.f85249OooOOOO = 3;
                    b = 0;
                    break;
                }
                i34 = i44;
                i35 = 0;
            } else {
                iArr = iArr4;
                sArr = sArr2;
                i7 = -1;
            }
            i37 += (bArr5[i35] & 255) << i36;
            i35++;
            i34--;
            int i45 = i36 + 8;
            int i46 = i41;
            int i47 = i32;
            int i48 = i43;
            int i49 = i39;
            while (true) {
                i36 = i45;
                if (i45 < i47) {
                    i32 = i47;
                    i43 = i48;
                    i39 = i49;
                    iArr4 = iArr;
                    b2 = 0;
                    i41 = i46;
                    sArr2 = sArr;
                    break;
                }
                int i50 = i37 & i42;
                i37 >>= i47;
                i36 -= i47;
                if (i50 == i25) {
                    i47 = i28;
                    i46 = i27;
                    i42 = i29;
                    i45 = i36;
                    i48 = i7;
                } else {
                    if (i50 == i26) {
                        i41 = i46;
                        i32 = i47;
                        i43 = i48;
                        i39 = i49;
                        iArr4 = iArr;
                        sArr2 = sArr;
                        b2 = 0;
                        break;
                    }
                    int i51 = i33;
                    if (i48 == i7) {
                        bArr2[i38] = bArr3[i50];
                        i38++;
                        i33 = i51 + 1;
                        i48 = i50;
                        i49 = i48;
                        i45 = i36;
                    } else {
                        if (i50 >= i46) {
                            bArr4[i40] = (byte) i49;
                            i40++;
                            s = i48;
                        } else {
                            s = i50;
                        }
                        while (s >= i25) {
                            bArr4[i40] = bArr3[s];
                            i40++;
                            s = sArr[s];
                        }
                        i49 = bArr3[s] & 255;
                        byte b3 = (byte) i49;
                        bArr2[i38] = b3;
                        while (true) {
                            i38++;
                            i51++;
                            if (i40 <= 0) {
                                break;
                            }
                            i40--;
                            bArr2[i38] = bArr4[i40];
                        }
                        if (i46 < 4096) {
                            sArr[i46] = (short) i48;
                            bArr3[i46] = b3;
                            i46++;
                            if ((i46 & i42) == 0 && i46 < 4096) {
                                i47++;
                                i42 += i46;
                            }
                        }
                        i45 = i36;
                        i33 = i51;
                        i48 = i50;
                    }
                    i7 = -1;
                }
            }
        }
        Arrays.fill(bArr2, i38, i22, b);
        if (oooO0O0.f85215OooO0o0 || this.f85250OooOOOo != i31) {
            int[] iArr5 = this.f85244OooOO0;
            int i52 = oooO0O0.f85213OooO0Oo;
            int i53 = this.f85250OooOOOo;
            int i54 = i52 / i53;
            int i55 = oooO0O0.f85211OooO0O0 / i53;
            int i56 = oooO0O0.f85212OooO0OO / i53;
            int i57 = oooO0O0.f85210OooO00o / i53;
            boolean z = this.f85245OooOO0O == 0;
            int i58 = this.f85251OooOOo;
            int i59 = this.f85252OooOOo0;
            byte[] bArr6 = this.f85235OooO;
            int[] iArr6 = this.f85236OooO00o;
            Boolean bool = this.f85253OooOOoo;
            int i60 = 8;
            int i61 = 0;
            int i62 = 1;
            int i63 = 0;
            while (i63 < i54) {
                int[] iArr7 = iArr5;
                if (oooO0O0.f85215OooO0o0) {
                    if (i61 >= i54) {
                        i62++;
                        if (i62 == 2) {
                            i61 = 4;
                        } else if (i62 == 3) {
                            i60 = 4;
                            i61 = 2;
                        } else if (i62 == 4) {
                            i61 = 1;
                            i60 = 2;
                        }
                    }
                    i = i61 + i60;
                } else {
                    i = i61;
                    i61 = i63;
                }
                int i64 = i61 + i55;
                int i65 = i;
                boolean z2 = i53 == 1;
                if (i64 < i59) {
                    int i66 = i64 * i58;
                    boolean z3 = z2;
                    int i67 = i66 + i57;
                    i2 = i54;
                    int i68 = i67 + i56;
                    int i69 = i66 + i58;
                    if (i69 < i68) {
                        i68 = i69;
                    }
                    i4 = i55;
                    int i70 = i63 * i53 * oooO0O0.f85212OooO0OO;
                    if (z3) {
                        while (i67 < i68) {
                            int i71 = iArr6[bArr6[i70] & 255];
                            if (i71 != 0) {
                                iArr7[i67] = i71;
                            } else if (z && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i70 += i53;
                            i67++;
                        }
                    } else {
                        int iOooO00o = androidx.core.graphics.OooO0OO.OooO00o(i68, i67, i53, i70);
                        while (i67 < i68) {
                            int i72 = i67;
                            int i73 = oooO0O0.f85212OooO0OO;
                            int i74 = i68;
                            int i75 = i70;
                            int i76 = 0;
                            int i77 = 0;
                            int i78 = 0;
                            int i79 = 0;
                            int i80 = 0;
                            while (true) {
                                if (i75 >= this.f85250OooOOOo + i70) {
                                    i5 = i53;
                                    break;
                                }
                                byte[] bArr7 = this.f85235OooO;
                                i5 = i53;
                                if (i75 >= bArr7.length || i75 >= iOooO00o) {
                                    break;
                                }
                                int i81 = this.f85236OooO00o[bArr7[i75] & 255];
                                if (i81 != 0) {
                                    i76 += (i81 >> 24) & 255;
                                    i77 += (i81 >> 16) & 255;
                                    i78 += (i81 >> 8) & 255;
                                    i79 += i81 & 255;
                                    i80++;
                                }
                                i75++;
                                i53 = i5;
                            }
                            int i82 = i70 + i73;
                            int i83 = i82;
                            while (i83 < this.f85250OooOOOo + i82) {
                                byte[] bArr8 = this.f85235OooO;
                                int i84 = i82;
                                if (i83 >= bArr8.length || i83 >= iOooO00o) {
                                    break;
                                }
                                int i85 = this.f85236OooO00o[bArr8[i83] & 255];
                                if (i85 != 0) {
                                    i76 += (i85 >> 24) & 255;
                                    i77 += (i85 >> 16) & 255;
                                    i78 += (i85 >> 8) & 255;
                                    i79 += i85 & 255;
                                    i80++;
                                }
                                i83++;
                                i82 = i84;
                            }
                            int i86 = i80 == 0 ? 0 : ((i76 / i80) << 24) | ((i77 / i80) << 16) | ((i78 / i80) << 8) | (i79 / i80);
                            if (i86 != 0) {
                                iArr7[i72] = i86;
                            } else if (z && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i70 += i5;
                            i67 = i72 + 1;
                            i68 = i74;
                            i53 = i5;
                        }
                    }
                    i3 = i53;
                } else {
                    i2 = i54;
                    i3 = i53;
                    i4 = i55;
                }
                i63++;
                iArr5 = iArr7;
                i61 = i65;
                i54 = i2;
                i55 = i4;
                i53 = i3;
            }
            if (this.f85253OooOOoo == null) {
                this.f85253OooOOoo = Boolean.valueOf(bool == null ? false : bool.booleanValue());
            }
        } else {
            int[] iArr8 = this.f85244OooOO0;
            int i87 = oooO0O0.f85213OooO0Oo;
            int i88 = oooO0O0.f85211OooO0O0;
            int i89 = oooO0O0.f85212OooO0OO;
            int i90 = oooO0O0.f85210OooO00o;
            byte b4 = this.f85245OooOO0O == 0 ? (byte) 1 : b;
            int i91 = this.f85251OooOOo;
            byte[] bArr9 = this.f85235OooO;
            int[] iArr9 = this.f85236OooO00o;
            byte b5 = -1;
            for (int i92 = b; i92 < i87; i92++) {
                int i93 = (i92 + i88) * i91;
                int i94 = i93 + i90;
                int i95 = i94 + i89;
                int i96 = i93 + i91;
                if (i96 < i95) {
                    i95 = i96;
                }
                int i97 = oooO0O0.f85212OooO0OO * i92;
                while (i94 < i95) {
                    int[] iArr10 = iArr8;
                    byte b6 = bArr9[i97];
                    int i98 = i87;
                    int i99 = b6 & 255;
                    if (i99 != b5) {
                        int i100 = iArr9[i99];
                        if (i100 != 0) {
                            iArr10[i94] = i100;
                        } else {
                            b5 = b6;
                        }
                    }
                    i97++;
                    i94++;
                    iArr8 = iArr10;
                    i87 = i98;
                }
            }
            Boolean bool2 = this.f85253OooOOoo;
            this.f85253OooOOoo = Boolean.valueOf((bool2 != null && bool2.booleanValue()) || !(this.f85253OooOOoo != null || b4 == 0 || b5 == -1));
        }
        if (this.f85247OooOOO && ((i6 = oooO0O0.f85216OooO0oO) == 0 || i6 == 1)) {
            if (this.f85248OooOOO0 == null) {
                this.f85248OooOOO0 = OooO0OO();
            }
            Bitmap bitmap3 = this.f85248OooOOO0;
            int i101 = this.f85251OooOOo;
            iArr2 = iArr;
            bitmap3.setPixels(iArr2, 0, i101, 0, 0, i101, this.f85252OooOOo0);
        } else {
            iArr2 = iArr;
        }
        Bitmap bitmapOooO0OO = OooO0OO();
        int i102 = this.f85251OooOOo;
        bitmapOooO0OO.setPixels(iArr2, 0, i102, 0, 0, i102, this.f85252OooOOo0);
        return bitmapOooO0OO;
    }
}
