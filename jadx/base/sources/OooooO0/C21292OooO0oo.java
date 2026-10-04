package OooooO0;

import androidx.appcompat.widget.C21532OooOOo;
import com.huawei.hms.network.embedded.C18177fb;
import io.ktor.utils.p616io.C24009o0ooOoO;
import io.ktor.utils.p616io.InterfaceC23986Ooooo0o;
import io.ktor.utils.p616io.InterfaceC24008o0ooOO0;
import io.ktor.utils.p616io.Oooo000;
import io.ktor.utils.p616io.o0OOO0o;
import io.ktor.utils.p616io.oo0o0Oo;
import java.io.EOFException;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.OooOOO0;
import o000OO0o.C24495OooO00o;
import oO00O0o.C32176OooO0Oo;
import oO00Oo0.C32266OooO0Oo;
import oO00Oo0O.C32271OooO00o;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32450OooOo;
import oO00ooO.C32453OooOo0O;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;

/* JADX INFO: renamed from: OooooO0.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21292OooO0oo {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO(oo0o0Oo oo0o0oo, int i, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        o0OOO0o o0ooo0o2;
        if (abstractC32479OooO0OO instanceof o0OOO0o) {
            o0ooo0o2 = (o0OOO0o) abstractC32479OooO0OO;
            int i2 = o0ooo0o2.f80888OooOoO0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o0ooo0o2.f80888OooOoO0 = i2 - Integer.MIN_VALUE;
            } else {
                o0ooo0o2 = new o0OOO0o(abstractC32479OooO0OO);
            }
        }
        Object obj = o0ooo0o2.f80886OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = o0ooo0o2.f80888OooOoO0;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            o0ooo0o2.f80887OooOo0o = oo0o0oo;
            o0ooo0o2.f80888OooOoO0 = 1;
            if (oo0o0oo.OooOo00(i, o0ooo0o2) == enumC32485OooO00o) {
                return enumC32485OooO00o;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oo0o0oo = o0ooo0o2.f80887OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        return oo0o0oo.OooO00o(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long OooO00o(float f, float f2, float f3, float f4, o000OOO.OooO0OO colorSpace) {
        int i;
        int i2;
        int i3;
        float fOooO0OO;
        float fOooO0O0;
        int i4;
        int i5;
        int i6;
        int i7;
        float fOooO0OO2;
        float fOooO0O02;
        int i8;
        int i9;
        int i10;
        float f5;
        int i11 = 31;
        OooOOO0.OooO0oO(colorSpace, "colorSpace");
        if (colorSpace.OooO0Oo()) {
            float f6 = f4 < 0.0f ? 0.0f : f4;
            if (f6 > 1.0f) {
                f6 = 1.0f;
            }
            int i12 = ((int) ((f6 * 255.0f) + 0.5f)) << 24;
            float f7 = f < 0.0f ? 0.0f : f;
            if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            int i13 = i12 | (((int) ((f7 * 255.0f) + 0.5f)) << 16);
            float f8 = f2 < 0.0f ? 0.0f : f2;
            if (f8 > 1.0f) {
                f8 = 1.0f;
            }
            int i14 = i13 | (((int) ((f8 * 255.0f) + 0.5f)) << 8);
            f5 = f3 >= 0.0f ? f3 : 0.0f;
            long j = ((long) (i14 | ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 255.0f) + 0.5f)))) << 32;
            int i15 = C24495OooO00o.f82815OooO0Oo;
            return j;
        }
        int i16 = o000OOO.OooO0O0.f82824OooO0o0;
        if (((int) (colorSpace.f82826OooO0O0 >> 32)) != 3) {
            throw new IllegalArgumentException("Color only works with ColorSpaces with 3 components");
        }
        int i17 = colorSpace.f82827OooO0OO;
        if (i17 == -1) {
            throw new IllegalArgumentException("Unknown color space, please use a color space in ColorSpaces");
        }
        float fOooO0OO3 = colorSpace.OooO0OO(0);
        float fOooO0O03 = colorSpace.OooO0O0(0);
        if (f >= fOooO0OO3) {
            fOooO0OO3 = f;
        }
        if (fOooO0OO3 <= fOooO0O03) {
            fOooO0O03 = fOooO0OO3;
        }
        int iFloatToRawIntBits = Float.floatToRawIntBits(fOooO0O03);
        int i18 = iFloatToRawIntBits >>> 31;
        int i19 = (iFloatToRawIntBits >>> 23) & 255;
        int i20 = iFloatToRawIntBits & 8388607;
        if (i19 == 255) {
            i2 = i20 != 0 ? 512 : 0;
            i = 31;
        } else {
            i = i19 - 112;
            if (i >= 31) {
                i = 49;
                i2 = 0;
            } else if (i <= 0) {
                if (i >= -10) {
                    int i21 = (i20 | 8388608) >> (1 - i);
                    if ((i21 & 4096) != 0) {
                        i21 += 8192;
                    }
                    i2 = i21 >> 13;
                } else {
                    i2 = 0;
                }
                i = 0;
            } else {
                int i22 = i20 >> 13;
                if ((iFloatToRawIntBits & 4096) != 0) {
                    i3 = (((i << 10) | i22) + 1) | (i18 << 15);
                    short s = (short) i3;
                    fOooO0OO = colorSpace.OooO0OO(1);
                    fOooO0O0 = colorSpace.OooO0O0(1);
                    if (f2 >= fOooO0OO) {
                        fOooO0OO = f2;
                    }
                    if (fOooO0OO <= fOooO0O0) {
                        fOooO0O0 = fOooO0OO;
                    }
                    int iFloatToRawIntBits2 = Float.floatToRawIntBits(fOooO0O0);
                    int i23 = iFloatToRawIntBits2 >>> 31;
                    i4 = (iFloatToRawIntBits2 >>> 23) & 255;
                    int i24 = iFloatToRawIntBits2 & 8388607;
                    if (i4 != 255) {
                        i6 = i24 != 0 ? 512 : 0;
                        i5 = 31;
                    } else {
                        i5 = i4 - 112;
                        if (i5 >= 31) {
                            i5 = 49;
                            i6 = 0;
                        } else if (i5 <= 0) {
                            if (i5 >= -10) {
                                int i25 = (i24 | 8388608) >> (1 - i5);
                                if ((i25 & 4096) != 0) {
                                    i25 += 8192;
                                }
                                i6 = i25 >> 13;
                            } else {
                                i6 = 0;
                            }
                            i5 = 0;
                        } else {
                            int i26 = i24 >> 13;
                            if ((iFloatToRawIntBits2 & 4096) != 0) {
                                i7 = (((i5 << 10) | i26) + 1) | (i23 << 15);
                                short s2 = (short) i7;
                                fOooO0OO2 = colorSpace.OooO0OO(2);
                                fOooO0O02 = colorSpace.OooO0O0(2);
                                if (f3 >= fOooO0OO2) {
                                    fOooO0OO2 = f3;
                                }
                                if (fOooO0OO2 <= fOooO0O02) {
                                    fOooO0O02 = fOooO0OO2;
                                }
                                int iFloatToRawIntBits3 = Float.floatToRawIntBits(fOooO0O02);
                                int i27 = iFloatToRawIntBits3 >>> 31;
                                i8 = (iFloatToRawIntBits3 >>> 23) & 255;
                                int i28 = 8388607 & iFloatToRawIntBits3;
                                if (i8 == 255) {
                                    i9 = i28 != 0 ? 512 : 0;
                                    i10 = (i27 << 15) | (i11 << 10) | i9;
                                } else {
                                    int i29 = i8 - 112;
                                    if (i29 >= 31) {
                                        i11 = 49;
                                    } else {
                                        if (i29 > 0) {
                                            i9 = i28 >> 13;
                                            if ((iFloatToRawIntBits3 & 4096) != 0) {
                                                i10 = (((i29 << 10) | i9) + 1) | (i27 << 15);
                                            } else {
                                                i11 = i29;
                                            }
                                        } else if (i29 >= -10) {
                                            int i30 = (i28 | 8388608) >> (1 - i29);
                                            if ((i30 & 4096) != 0) {
                                                i30 += 8192;
                                            }
                                            i9 = i30 >> 13;
                                            i11 = 0;
                                        } else {
                                            i11 = 0;
                                        }
                                        i10 = (i27 << 15) | (i11 << 10) | i9;
                                    }
                                    i10 = (i27 << 15) | (i11 << 10) | i9;
                                }
                                short s3 = (short) i10;
                                f5 = f4 >= 0.0f ? f4 : 0.0f;
                                long j2 = ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6) | ((((long) s) & C18177fb.f54859s) << 48) | ((((long) s2) & C18177fb.f54859s) << 32) | ((((long) s3) & C18177fb.f54859s) << 16) | (((long) i17) & 63);
                                int i31 = C24495OooO00o.f82815OooO0Oo;
                                return j2;
                            }
                            i6 = i26;
                        }
                    }
                    i7 = i6 | (i23 << 15) | (i5 << 10);
                    short s22 = (short) i7;
                    fOooO0OO2 = colorSpace.OooO0OO(2);
                    fOooO0O02 = colorSpace.OooO0O0(2);
                    if (f3 >= fOooO0OO2) {
                    }
                    if (fOooO0OO2 <= fOooO0O02) {
                    }
                    int iFloatToRawIntBits32 = Float.floatToRawIntBits(fOooO0O02);
                    int i272 = iFloatToRawIntBits32 >>> 31;
                    i8 = (iFloatToRawIntBits32 >>> 23) & 255;
                    int i282 = 8388607 & iFloatToRawIntBits32;
                    if (i8 == 255) {
                    }
                    short s32 = (short) i10;
                    if (f4 >= 0.0f) {
                    }
                    long j22 = ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6) | ((((long) s) & C18177fb.f54859s) << 48) | ((((long) s22) & C18177fb.f54859s) << 32) | ((((long) s32) & C18177fb.f54859s) << 16) | (((long) i17) & 63);
                    int i312 = C24495OooO00o.f82815OooO0Oo;
                    return j22;
                }
                i2 = i22;
            }
        }
        i3 = i2 | (i18 << 15) | (i << 10);
        short s4 = (short) i3;
        fOooO0OO = colorSpace.OooO0OO(1);
        fOooO0O0 = colorSpace.OooO0O0(1);
        if (f2 >= fOooO0OO) {
        }
        if (fOooO0OO <= fOooO0O0) {
        }
        int iFloatToRawIntBits22 = Float.floatToRawIntBits(fOooO0O0);
        int i232 = iFloatToRawIntBits22 >>> 31;
        i4 = (iFloatToRawIntBits22 >>> 23) & 255;
        int i242 = iFloatToRawIntBits22 & 8388607;
        if (i4 != 255) {
        }
        i7 = i6 | (i232 << 15) | (i5 << 10);
        short s222 = (short) i7;
        fOooO0OO2 = colorSpace.OooO0OO(2);
        fOooO0O02 = colorSpace.OooO0O0(2);
        if (f3 >= fOooO0OO2) {
        }
        if (fOooO0OO2 <= fOooO0O02) {
        }
        int iFloatToRawIntBits322 = Float.floatToRawIntBits(fOooO0O02);
        int i2722 = iFloatToRawIntBits322 >>> 31;
        i8 = (iFloatToRawIntBits322 >>> 23) & 255;
        int i2822 = 8388607 & iFloatToRawIntBits322;
        if (i8 == 255) {
        }
        short s322 = (short) i10;
        if (f4 >= 0.0f) {
        }
        long j222 = ((((long) ((int) (((f5 <= 1.0f ? f5 : 1.0f) * 1023.0f) + 0.5f))) & 1023) << 6) | ((((long) s4) & C18177fb.f54859s) << 48) | ((((long) s222) & C18177fb.f54859s) << 32) | ((((long) s322) & C18177fb.f54859s) << 16) | (((long) i17) & 63);
        int i3122 = C24495OooO00o.f82815OooO0Oo;
        return j222;
    }

    public static final long OooO0O0(int i) {
        long j = ((long) i) << 32;
        int i2 = C24495OooO00o.f82815OooO0Oo;
        return j;
    }

    public static final long OooO0OO(int i) {
        long j = (((long) i) << 32) | (((long) 0) & 4294967295L);
        int i2 = o00O0O.OooO00o.f84201OooOO0o;
        return j;
    }

    public static final C21291OooO0oO OooO0Oo(long j, long j2) {
        return new C21291OooO0oO(C21290OooO0o0.OooO0OO(j), C21290OooO0o0.OooO0Oo(j), C21293OooOO0.OooO0Oo(j2) + C21290OooO0o0.OooO0OO(j), C21293OooOO0.OooO0O0(j2) + C21290OooO0o0.OooO0Oo(j));
    }

    public static final int OooO0o(C32266OooO0Oo c32266OooO0Oo, ByteBuffer byteBuffer) {
        C32271OooO00o c32271OooO00oOooo0OO;
        int i = 0;
        while (byteBuffer.hasRemaining() && (c32271OooO00oOooo0OO = c32266OooO0Oo.Oooo0OO()) != null) {
            int iRemaining = byteBuffer.remaining();
            int i2 = c32271OooO00oOooo0OO.f115946OooO0OO - c32271OooO00oOooo0OO.f115945OooO0O0;
            if (iRemaining < i2) {
                o00O0O.OooO0OO.OooO0O0(c32271OooO00oOooo0OO, byteBuffer, iRemaining);
                c32266OooO0Oo.f115966OooOoO = c32271OooO00oOooo0OO.f115945OooO0O0;
                return i + iRemaining;
            }
            o00O0O.OooO0OO.OooO0O0(c32271OooO00oOooo0OO, byteBuffer, i2);
            c32266OooO0Oo.o0Oo0oo(c32271OooO00oOooo0OO);
            i += i2;
        }
        return i;
    }

    public static final Object OooO0o0(InterfaceC23986Ooooo0o interfaceC23986Ooooo0o, oO00Oo0.OooO00o oooO00o, int i, C32176OooO0Oo c32176OooO0Oo) {
        if (i < 0) {
            throw new IllegalStateException(C21532OooOOo.OooO0OO(i, "bytesRead shouldn't be negative: ").toString());
        }
        boolean z = interfaceC23986Ooooo0o instanceof InterfaceC24008o0ooOO0;
        oo0o0Oo oo0o0ooOooOO0o = z ? ((InterfaceC24008o0ooOO0) interfaceC23986Ooooo0o).OooOO0o() : null;
        if (oo0o0ooOooOO0o != null) {
            oo0o0ooOooOO0o.OooO0oo(i);
            if (z) {
                ((InterfaceC24008o0ooOO0) interfaceC23986Ooooo0o).OooOoO0();
            }
            return C32460OooOooO.f116667OooO00o;
        }
        if (!(oooO00o instanceof C32271OooO00o) || oooO00o == C32271OooO00o.f115978OooOOO0) {
            return C32460OooOooO.f116667OooO00o;
        }
        ((C32271OooO00o) oooO00o).OooOO0(C32271OooO00o.f115976OooOO0O);
        Object objOooOOO = interfaceC23986Ooooo0o.OooOOO(i, c32176OooO0Oo);
        return objOooOOO == EnumC32485OooO00o.f116726OooOo0o ? objOooOOO : C32460OooOooO.f116667OooO00o;
    }

    public static final void OooO0oO(C32266OooO0Oo c32266OooO0Oo, ByteBuffer byteBuffer) throws EOFException {
        OooOOO0.OooO0oO(c32266OooO0Oo, "<this>");
        OooO0o(c32266OooO0Oo, byteBuffer);
        if (byteBuffer.hasRemaining()) {
            throw new EOFException("Not enough data in packet to fill buffer: " + byteBuffer.remaining() + " more bytes required");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooO0oo(InterfaceC23986Ooooo0o interfaceC23986Ooooo0o, int i, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C24009o0ooOoO c24009o0ooOoO;
        C32271OooO00o c32271OooO00o;
        if (abstractC32479OooO0OO instanceof C24009o0ooOoO) {
            c24009o0ooOoO = (C24009o0ooOoO) abstractC32479OooO0OO;
            int i2 = c24009o0ooOoO.f80893OooOoO0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c24009o0ooOoO.f80893OooOoO0 = i2 - Integer.MIN_VALUE;
            } else {
                c24009o0ooOoO = new C24009o0ooOoO(abstractC32479OooO0OO);
            }
        }
        C24009o0ooOoO c24009o0ooOoO2 = c24009o0ooOoO;
        Object obj = c24009o0ooOoO2.f80891OooOo;
        Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = c24009o0ooOoO2.f80893OooOoO0;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            C32271OooO00o c32271OooO00o2 = (C32271OooO00o) C32271OooO00o.f115976OooOO0O.o0000OoO();
            int i4 = c32271OooO00o2.f115946OooO0OO;
            long j = c32271OooO00o2.f115949OooO0o0 - i4;
            c24009o0ooOoO2.f80892OooOo0o = c32271OooO00o2;
            c24009o0ooOoO2.f80893OooOoO0 = 1;
            Object objOooOOoo = interfaceC23986Ooooo0o.OooOOoo(c32271OooO00o2.f115944OooO00o, i4, i, j, c24009o0ooOoO2);
            if (objOooOOoo == obj2) {
                return obj2;
            }
            obj = objOooOOoo;
            c32271OooO00o = c32271OooO00o2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c32271OooO00o = c24009o0ooOoO2.f80892OooOo0o;
            C32446OooOOOo.OooO0O0(obj);
        }
        c32271OooO00o.OooO00o((int) ((Number) obj).longValue());
        return c32271OooO00o;
    }

    public static final C32453OooOo0O OooOO0(String str) {
        int i;
        Oooo000.OooO0O0(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char cCharAt = str.charAt(0);
        if (OooOOO0.OooO(cCharAt, 48) < 0) {
            i = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i = 0;
        }
        int iDivideUnsigned = 119304647;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if (Integer.compareUnsigned(i2, iDivideUnsigned) > 0) {
                if (iDivideUnsigned != 119304647) {
                    return null;
                }
                iDivideUnsigned = Integer.divideUnsigned(-1, 10);
                if (Integer.compareUnsigned(i2, iDivideUnsigned) > 0) {
                    return null;
                }
            }
            int i3 = i2 * 10;
            int i4 = iDigit + i3;
            if (Integer.compareUnsigned(i4, i3) < 0) {
                return null;
            }
            i++;
            i2 = i4;
        }
        return new C32453OooOo0O(i2);
    }

    public static final C32450OooOo OooOO0O(String str) {
        OooOOO0.OooO0oO(str, "<this>");
        Oooo000.OooO0O0(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        char cCharAt = str.charAt(0);
        if (OooOOO0.OooO(cCharAt, 48) < 0) {
            i = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        }
        long j = 10;
        long j2 = 0;
        long jDivideUnsigned = 512409557603043100L;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if (Long.compareUnsigned(j2, jDivideUnsigned) > 0) {
                if (jDivideUnsigned != 512409557603043100L) {
                    return null;
                }
                jDivideUnsigned = Long.divideUnsigned(-1L, j);
                if (Long.compareUnsigned(j2, jDivideUnsigned) > 0) {
                    return null;
                }
            }
            long j3 = j2 * j;
            long j4 = (((long) iDigit) & 4294967295L) + j3;
            if (Long.compareUnsigned(j4, j3) < 0) {
                return null;
            }
            i++;
            j2 = j4;
        }
        return new C32450OooOo(j2);
    }
}
