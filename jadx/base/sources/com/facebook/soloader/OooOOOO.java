package com.facebook.soloader;

import android.util.Log;
import com.huawei.hms.network.embedded.C18177fb;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.ClosedByInterruptException;

/* JADX INFO: loaded from: classes5.dex */
public final class OooOOOO {

    public static class OooO00o extends UnsatisfiedLinkError {
    }

    public static String[] OooO00o(InterfaceC22310OooO0oo interfaceC22310OooO0oo) throws IOException {
        if (!(interfaceC22310OooO0oo instanceof OooO)) {
            return OooO0O0(interfaceC22310OooO0oo);
        }
        OooO oooO = (OooO) interfaceC22310OooO0oo;
        int i = 0;
        while (true) {
            try {
                return OooO0O0(oooO);
            } catch (ClosedByInterruptException e) {
                i++;
                if (i > 4) {
                    throw e;
                }
                Thread.interrupted();
                Log.e("MinElf", "retrying extract_DT_NEEDED due to ClosedByInterruptException", e);
                FileInputStream fileInputStream = new FileInputStream(oooO.f67475OooOo0o);
                oooO.f67474OooOo = fileInputStream;
                oooO.f67476OooOoO0 = fileInputStream.getChannel();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x0244 A[LOOP:1: B:49:0x00f6->B:133:0x0244, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0142 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String[] OooO0O0(InterfaceC22310OooO0oo interfaceC22310OooO0oo) throws IOException {
        long jOooO0OO;
        long j;
        int i;
        long j2;
        long j3;
        long jOooO0OO2;
        long jOooO0OO3;
        String str;
        long jOooO0OO4;
        int i2;
        long j4;
        long jOooO0OO5;
        long jOooO0OO6;
        long jOooO0OO7;
        long jOooO0OO8;
        long jOooO0OO9;
        long jOooO0OO10;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        long jOooO0OO11 = OooO0OO(interfaceC22310OooO0oo, byteBufferAllocate, 0L);
        if (jOooO0OO11 != 1179403647) {
            throw new OooO00o("file is not ELF: magic is 0x" + Long.toHexString(jOooO0OO11) + ", it should be " + Long.toHexString(1179403647L));
        }
        OooO0Oo(interfaceC22310OooO0oo, byteBufferAllocate, 1, 4L);
        boolean z = ((short) (byteBufferAllocate.get() & 255)) == 1;
        OooO0Oo(interfaceC22310OooO0oo, byteBufferAllocate, 1, 5L);
        if (((short) (byteBufferAllocate.get() & 255)) == 2) {
            byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        }
        if (z) {
            jOooO0OO = OooO0OO(interfaceC22310OooO0oo, byteBufferAllocate, 28L);
        } else {
            OooO0Oo(interfaceC22310OooO0oo, byteBufferAllocate, 8, 32L);
            jOooO0OO = byteBufferAllocate.getLong();
        }
        if (z) {
            OooO0Oo(interfaceC22310OooO0oo, byteBufferAllocate, 2, 44L);
            j = 44;
            i = byteBufferAllocate.getShort() & 65535;
        } else {
            j = 44;
            OooO0Oo(interfaceC22310OooO0oo, byteBufferAllocate, 2, 56L);
            i = byteBufferAllocate.getShort() & 65535;
        }
        long jOooO0OO12 = i;
        if (z) {
            j2 = 4;
            j3 = 42;
        } else {
            j2 = 4;
            j3 = 54;
        }
        OooO0Oo(interfaceC22310OooO0oo, byteBufferAllocate, 2, j3);
        int i3 = byteBufferAllocate.getShort() & 65535;
        long j5 = 40;
        if (jOooO0OO12 == C18177fb.f54859s) {
            if (z) {
                jOooO0OO10 = OooO0OO(interfaceC22310OooO0oo, byteBufferAllocate, 32L);
            } else {
                OooO0Oo(interfaceC22310OooO0oo, byteBufferAllocate, 8, 40L);
                jOooO0OO10 = byteBufferAllocate.getLong();
            }
            jOooO0OO12 = z ? OooO0OO(interfaceC22310OooO0oo, byteBufferAllocate, jOooO0OO10 + 28) : OooO0OO(interfaceC22310OooO0oo, byteBufferAllocate, jOooO0OO10 + j);
        }
        long j6 = 0;
        long j7 = jOooO0OO;
        while (true) {
            if (j6 >= jOooO0OO12) {
                jOooO0OO2 = 0;
                break;
            }
            if ((z ? OooO0OO(interfaceC22310OooO0oo, byteBufferAllocate, j7) : OooO0OO(interfaceC22310OooO0oo, byteBufferAllocate, j7)) != 2) {
                j7 += (long) i3;
                j6++;
                z = z;
            } else if (z) {
                jOooO0OO2 = OooO0OO(interfaceC22310OooO0oo, byteBufferAllocate, j7 + j2);
            } else {
                OooO0Oo(interfaceC22310OooO0oo, byteBufferAllocate, 8, j7 + 8);
                jOooO0OO2 = byteBufferAllocate.getLong();
            }
        }
        boolean z2 = z;
        if (jOooO0OO2 == 0) {
            throw new OooO00o("ELF file does not contain dynamic linking information");
        }
        long j8 = jOooO0OO2;
        long j9 = 0;
        int i4 = 0;
        while (true) {
            if (z2) {
                jOooO0OO3 = OooO0OO(interfaceC22310OooO0oo, byteBufferAllocate, j8);
            } else {
                OooO0Oo(interfaceC22310OooO0oo, byteBufferAllocate, 8, j8);
                jOooO0OO3 = byteBufferAllocate.getLong();
            }
            long j10 = j5;
            if (jOooO0OO3 != 1) {
                if (jOooO0OO3 == 5) {
                    str = "malformed DT_NEEDED section";
                    if (z2) {
                        jOooO0OO4 = OooO0OO(interfaceC22310OooO0oo, byteBufferAllocate, j8 + j2);
                    } else {
                        OooO0Oo(interfaceC22310OooO0oo, byteBufferAllocate, 8, j8 + 8);
                        jOooO0OO4 = byteBufferAllocate.getLong();
                    }
                    j9 = jOooO0OO4;
                }
                j8 += !z2 ? 8L : 16L;
                if (jOooO0OO3 != 0) {
                    if (j9 == 0) {
                        throw new OooO00o("Dynamic section string-table not found");
                    }
                    long j11 = jOooO0OO;
                    int i5 = 0;
                    while (true) {
                        int i6 = i3;
                        if (i5 >= jOooO0OO12) {
                            i2 = i4;
                            j4 = 0;
                            break;
                        }
                        if ((z2 ? OooO0OO(interfaceC22310OooO0oo, byteBufferAllocate, j11) : OooO0OO(interfaceC22310OooO0oo, byteBufferAllocate, j11)) == 1) {
                            if (z2) {
                                jOooO0OO7 = OooO0OO(interfaceC22310OooO0oo, byteBufferAllocate, j11 + 8);
                            } else {
                                OooO0Oo(interfaceC22310OooO0oo, byteBufferAllocate, 8, j11 + 16);
                                jOooO0OO7 = byteBufferAllocate.getLong();
                            }
                            if (z2) {
                                i2 = i4;
                                jOooO0OO8 = OooO0OO(interfaceC22310OooO0oo, byteBufferAllocate, j11 + 20);
                            } else {
                                i2 = i4;
                                OooO0Oo(interfaceC22310OooO0oo, byteBufferAllocate, 8, j11 + j10);
                                jOooO0OO8 = byteBufferAllocate.getLong();
                            }
                            if (jOooO0OO7 <= j9 && j9 < jOooO0OO8 + jOooO0OO7) {
                                if (z2) {
                                    jOooO0OO9 = OooO0OO(interfaceC22310OooO0oo, byteBufferAllocate, j11 + j2);
                                } else {
                                    OooO0Oo(interfaceC22310OooO0oo, byteBufferAllocate, 8, j11 + 8);
                                    jOooO0OO9 = byteBufferAllocate.getLong();
                                }
                                j4 = (j9 - jOooO0OO7) + jOooO0OO9;
                            }
                        } else {
                            i2 = i4;
                        }
                        i3 = i6;
                        j11 += (long) i3;
                        i5++;
                        i4 = i2;
                    }
                    if (j4 == 0) {
                        throw new OooO00o("did not find file offset of DT_STRTAB table");
                    }
                    int i7 = i2;
                    String[] strArr = new String[i7];
                    int i8 = 0;
                    do {
                        if (z2) {
                            jOooO0OO5 = OooO0OO(interfaceC22310OooO0oo, byteBufferAllocate, jOooO0OO2);
                        } else {
                            OooO0Oo(interfaceC22310OooO0oo, byteBufferAllocate, 8, jOooO0OO2);
                            jOooO0OO5 = byteBufferAllocate.getLong();
                        }
                        if (jOooO0OO5 == 1) {
                            if (z2) {
                                jOooO0OO6 = OooO0OO(interfaceC22310OooO0oo, byteBufferAllocate, jOooO0OO2 + j2);
                            } else {
                                OooO0Oo(interfaceC22310OooO0oo, byteBufferAllocate, 8, jOooO0OO2 + 8);
                                jOooO0OO6 = byteBufferAllocate.getLong();
                            }
                            long j12 = j4 + jOooO0OO6;
                            StringBuilder sb = new StringBuilder();
                            while (true) {
                                long j13 = j12 + 1;
                                OooO0Oo(interfaceC22310OooO0oo, byteBufferAllocate, 1, j12);
                                short s = (short) (byteBufferAllocate.get() & 255);
                                if (s == 0) {
                                    break;
                                }
                                sb.append((char) s);
                                j12 = j13;
                            }
                            strArr[i8] = sb.toString();
                            if (i8 == Integer.MAX_VALUE) {
                                throw new OooO00o(str);
                            }
                            i8++;
                        }
                        jOooO0OO2 += z2 ? 8L : 16L;
                    } while (jOooO0OO5 != 0);
                    if (i8 == i7) {
                        return strArr;
                    }
                    throw new OooO00o(str);
                }
                j5 = j10;
            } else {
                if (i4 == Integer.MAX_VALUE) {
                    throw new OooO00o("malformed DT_NEEDED section");
                }
                i4++;
            }
            str = "malformed DT_NEEDED section";
            j8 += !z2 ? 8L : 16L;
            if (jOooO0OO3 != 0) {
            }
        }
    }

    public static long OooO0OO(InterfaceC22310OooO0oo interfaceC22310OooO0oo, ByteBuffer byteBuffer, long j) throws IOException {
        OooO0Oo(interfaceC22310OooO0oo, byteBuffer, 4, j);
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }

    public static void OooO0Oo(InterfaceC22310OooO0oo interfaceC22310OooO0oo, ByteBuffer byteBuffer, int i, long j) throws IOException {
        int iOooOoOO;
        byteBuffer.position(0);
        byteBuffer.limit(i);
        while (byteBuffer.remaining() > 0 && (iOooOoOO = interfaceC22310OooO0oo.OooOoOO(byteBuffer, j)) != -1) {
            j += (long) iOooOoOO;
        }
        if (byteBuffer.remaining() > 0) {
            throw new OooO00o("ELF file truncated");
        }
        byteBuffer.position(0);
    }
}
