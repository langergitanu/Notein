package o0ooO0o0;

import android.util.Log;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import o00oO0O.o0OoOo0;
import o0ooO00O.C31425OooO0O0;
import o0ooO00O.C31426OooO0OO;
import o0ooO00O.C31427OooO0Oo;
import o0ooO0Oo.C31436OooO0Oo;
import o0ooO0Oo.C31441OooOO0;
import o0ooO0Oo.C31448OooOOo;
import o0ooO0Oo.C31453OooOo0O;
import o0ooO0o.C31460OooO0o0;

/* JADX INFO: renamed from: o0ooO0o0.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31478OooOOOo extends AbstractC31473OooOO0O {
    public static void OooO0o(ArrayList arrayList, long j, C31425OooO0O0 c31425OooO0O0) throws IOException {
        if (j < 0) {
            StringBuilder sb = new StringBuilder("negative array index: ");
            sb.append(j);
            sb.append(" near offset ");
            c31425OooO0O0.OooO00o();
            sb.append(c31425OooO0O0.f112188OooOo);
            throw new IOException(sb.toString());
        }
        if (j < arrayList.size()) {
            return;
        }
        StringBuilder sbOooO00o = o0OoOo0.OooO00o(j, "array index overflow: ", " >= ");
        sbOooO00o.append(arrayList.size());
        sbOooO00o.append(" near offset ");
        c31425OooO0O0.OooO00o();
        sbOooO00o.append(c31425OooO0O0.f112188OooOo);
        throw new IOException(sbOooO00o.toString());
    }

    public static int OooO0o0(int i, int i2) {
        if (i >= 2048 - i2) {
            return 12;
        }
        if (i >= 1024 - i2) {
            return 11;
        }
        return i >= 512 - i2 ? 10 : 9;
    }

    public static ArrayList OooO0oO() {
        ArrayList arrayList = new ArrayList(4096);
        for (int i = 0; i < 256; i++) {
            arrayList.add(new byte[]{(byte) (i & 255)});
        }
        arrayList.add(null);
        arrayList.add(null);
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f4, code lost:
    
        throw new java.lang.IllegalArgumentException();
     */
    @Override // o0ooO0o0.AbstractC31473OooOO0O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C31472OooOO0 OooO00o(InputStream inputStream, OutputStream outputStream, C31448OooOOo c31448OooOOo, int i) throws IOException {
        int i2;
        C31436OooO0Oo c31436OooO0OoOooO0Oo = AbstractC31473OooOO0O.OooO0Oo(c31448OooOOo, i);
        char c = 1;
        int iO000O00O = c31436OooO0OoOooO0Oo.o000O00O(C31441OooOO0.f112303o0000oO, null, 1);
        if (iO000O00O != 0 && iO000O00O != 1) {
            iO000O00O = 1;
        }
        OutputStream outputStreamOooO00o = C31479OooOOo.OooO00o(outputStream, c31436OooO0OoOooO0Oo);
        ArrayList arrayList = new ArrayList();
        C31425OooO0O0 c31425OooO0O0 = new C31425OooO0O0();
        c31425OooO0O0.f112195OooOooO = new C31427OooO0Oo();
        c31425OooO0O0.f112194OooOoo = inputStream;
        int iOooO0o0 = 9;
        long j = -1;
        while (true) {
            try {
                c31425OooO0O0.OooO00o();
                if (iOooO0o0 >= 0 && iOooO0o0 <= 64) {
                    long j2 = 0;
                    int i3 = 0;
                    while (i3 < iOooO0o0) {
                        long j3 = j2 << c;
                        c31425OooO0O0.OooO00o();
                        int i4 = c31425OooO0O0.f112190OooOoO;
                        char c2 = c;
                        int i5 = c31425OooO0O0.read();
                        if (i5 == -1) {
                            throw new EOFException();
                        }
                        int i6 = (i4 + 1) & 7;
                        if (i6 != 0) {
                            i5 >>= 8 - i6;
                            c31425OooO0O0.OooO00o();
                            i2 = iOooO0o0;
                            c31425OooO0O0.OooO0OO(c31425OooO0O0.f112188OooOo - 1);
                        } else {
                            i2 = iOooO0o0;
                        }
                        c31425OooO0O0.f112190OooOoO = i6;
                        j2 = j3 | ((long) (i5 & 1));
                        i3++;
                        c = c2;
                        iOooO0o0 = i2;
                    }
                    char c3 = c;
                    if (j2 == 257) {
                        break;
                    }
                    if (j2 == 256) {
                        arrayList = OooO0oO();
                        j = -1;
                        c = c3;
                        iOooO0o0 = 9;
                    } else {
                        if (j2 < arrayList.size()) {
                            byte[] bArr = (byte[]) arrayList.get((int) j2);
                            byte b = bArr[0];
                            outputStreamOooO00o.write(bArr);
                            if (j != -1) {
                                OooO0o(arrayList, j, c31425OooO0O0);
                                byte[] bArr2 = (byte[]) arrayList.get((int) j);
                                byte[] bArrCopyOf = Arrays.copyOf(bArr2, bArr2.length + 1);
                                bArrCopyOf[bArr2.length] = b;
                                arrayList.add(bArrCopyOf);
                            }
                        } else {
                            OooO0o(arrayList, j, c31425OooO0O0);
                            byte[] bArr3 = (byte[]) arrayList.get((int) j);
                            byte[] bArrCopyOf2 = Arrays.copyOf(bArr3, bArr3.length + 1);
                            bArrCopyOf2[bArr3.length] = bArr3[0];
                            outputStreamOooO00o.write(bArrCopyOf2);
                            arrayList.add(bArrCopyOf2);
                        }
                        iOooO0o0 = OooO0o0(arrayList.size(), iO000O00O);
                        c = c3;
                        j = j2;
                    }
                } else {
                    break;
                }
            } catch (EOFException unused) {
                Log.w("PdfBox-Android", "Premature EOF in LZW stream, EOD code missing");
            }
        }
        outputStreamOooO00o.flush();
        return new C31472OooOO0(c31448OooOOo);
    }

    @Override // o0ooO0o0.AbstractC31473OooOO0O
    public final void OooO0OO(C31460OooO0o0 c31460OooO0o0, OutputStream outputStream, C31453OooOo0O c31453OooOo0O) throws IOException {
        ArrayList arrayListOooO0oO = OooO0oO();
        C31426OooO0OO c31426OooO0OO = new C31426OooO0OO(outputStream);
        c31426OooO0OO.OooO0o0(9, 256L);
        byte[] bArrCopyOf = null;
        int i = -1;
        while (true) {
            int i2 = c31460OooO0o0.read();
            if (i2 == -1) {
                break;
            }
            byte b = (byte) i2;
            if (bArrCopyOf == null) {
                bArrCopyOf = new byte[]{b};
            } else {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length + 1);
                bArrCopyOf[bArrCopyOf.length - 1] = b;
                int size = arrayListOooO0oO.size() - 1;
                int i3 = -1;
                int length = 0;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    if (size <= 257) {
                        if (i3 != -1) {
                            break;
                        } else if (bArrCopyOf.length > 1) {
                            i3 = -1;
                            break;
                        }
                    }
                    byte[] bArr = (byte[]) arrayListOooO0oO.get(size);
                    if ((i3 != -1 || bArr.length > length) && Arrays.equals(bArr, bArrCopyOf)) {
                        length = bArr.length;
                        i3 = size;
                    }
                    size--;
                }
                if (i3 == -1) {
                    int iOooO0o0 = OooO0o0(arrayListOooO0oO.size() - 1, 1);
                    c31426OooO0OO.OooO0o0(iOooO0o0, i);
                    arrayListOooO0oO.add(bArrCopyOf);
                    if (arrayListOooO0oO.size() == 4096) {
                        c31426OooO0OO.OooO0o0(iOooO0o0, 256L);
                        arrayListOooO0oO = OooO0oO();
                    }
                    bArrCopyOf = new byte[]{b};
                } else {
                    i = i3;
                }
            }
            i = b & 255;
        }
        if (i != -1) {
            c31426OooO0OO.OooO0o0(OooO0o0(arrayListOooO0oO.size() - 1, 1), i);
        }
        c31426OooO0OO.OooO0o0(OooO0o0(arrayListOooO0oO.size(), 1), 257L);
        c31426OooO0OO.OooO0o0(7, 0L);
        c31426OooO0OO.OooO00o();
        c31426OooO0OO.OooO0O0(c31426OooO0OO.f112188OooOo);
        c31426OooO0OO.close();
    }
}
