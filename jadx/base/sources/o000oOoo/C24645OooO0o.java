package o000oOoo;

import com.aspose.slides.C22218Oooo;
import com.huawei.hms.network.embedded.C18241k5;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: o000oOoo.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24645OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final byte[] f83477OooO00o = {112, 114, 111, 0};

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final byte[] f83478OooO0O0 = {112, 114, 109, 0};

    /* JADX WARN: Finally extract failed */
    public static boolean OooO(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, C24642OooO0O0[] c24642OooO0O0Arr) throws IOException {
        long j;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = C24647OooO0oO.f83480OooO00o;
        int i = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = C24647OooO0oO.f83481OooO0O0;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrOooO00o = OooO00o(c24642OooO0O0Arr, bArr3);
                C24643OooO0OO.OooO0o0(byteArrayOutputStream, c24642OooO0O0Arr.length, 1);
                C24643OooO0OO.OooO0o0(byteArrayOutputStream, bArrOooO00o.length, 4);
                byte[] bArrOooO00o2 = C24643OooO0OO.OooO00o(bArrOooO00o);
                C24643OooO0OO.OooO0o0(byteArrayOutputStream, bArrOooO00o2.length, 4);
                byteArrayOutputStream.write(bArrOooO00o2);
                return true;
            }
            byte[] bArr4 = C24647OooO0oO.f83483OooO0Oo;
            if (Arrays.equals(bArr, bArr4)) {
                C24643OooO0OO.OooO0o0(byteArrayOutputStream, c24642OooO0O0Arr.length, 1);
                for (C24642OooO0O0 c24642OooO0O0 : c24642OooO0O0Arr) {
                    int size = c24642OooO0O0.f83466OooO.size() * 4;
                    String strOooO0O0 = OooO0O0(c24642OooO0O0.f83467OooO00o, c24642OooO0O0.f83468OooO0O0, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    C24643OooO0OO.OooO0o(byteArrayOutputStream, strOooO0O0.getBytes(charset).length);
                    C24643OooO0OO.OooO0o(byteArrayOutputStream, c24642OooO0O0.f83474OooO0oo.length);
                    C24643OooO0OO.OooO0o0(byteArrayOutputStream, size, 4);
                    C24643OooO0OO.OooO0o0(byteArrayOutputStream, c24642OooO0O0.f83469OooO0OO, 4);
                    byteArrayOutputStream.write(strOooO0O0.getBytes(charset));
                    Iterator<Integer> it = c24642OooO0O0.f83466OooO.keySet().iterator();
                    while (it.hasNext()) {
                        C24643OooO0OO.OooO0o(byteArrayOutputStream, it.next().intValue());
                        C24643OooO0OO.OooO0o(byteArrayOutputStream, 0);
                    }
                    for (int i2 : c24642OooO0O0.f83474OooO0oo) {
                        C24643OooO0OO.OooO0o(byteArrayOutputStream, i2);
                    }
                }
                return true;
            }
            byte[] bArr5 = C24647OooO0oO.f83482OooO0OO;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrOooO00o3 = OooO00o(c24642OooO0O0Arr, bArr5);
                C24643OooO0OO.OooO0o0(byteArrayOutputStream, c24642OooO0O0Arr.length, 1);
                C24643OooO0OO.OooO0o0(byteArrayOutputStream, bArrOooO00o3.length, 4);
                byte[] bArrOooO00o4 = C24643OooO0OO.OooO00o(bArrOooO00o3);
                C24643OooO0OO.OooO0o0(byteArrayOutputStream, bArrOooO00o4.length, 4);
                byteArrayOutputStream.write(bArrOooO00o4);
                return true;
            }
            byte[] bArr6 = C24647OooO0oO.f83485OooO0o0;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            C24643OooO0OO.OooO0o(byteArrayOutputStream, c24642OooO0O0Arr.length);
            for (C24642OooO0O0 c24642OooO0O02 : c24642OooO0O0Arr) {
                String strOooO0O02 = OooO0O0(c24642OooO0O02.f83467OooO00o, c24642OooO0O02.f83468OooO0O0, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                C24643OooO0OO.OooO0o(byteArrayOutputStream, strOooO0O02.getBytes(charset2).length);
                TreeMap<Integer, Integer> treeMap = c24642OooO0O02.f83466OooO;
                C24643OooO0OO.OooO0o(byteArrayOutputStream, treeMap.size());
                C24643OooO0OO.OooO0o(byteArrayOutputStream, c24642OooO0O02.f83474OooO0oo.length);
                C24643OooO0OO.OooO0o0(byteArrayOutputStream, c24642OooO0O02.f83469OooO0OO, 4);
                byteArrayOutputStream.write(strOooO0O02.getBytes(charset2));
                Iterator<Integer> it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    C24643OooO0OO.OooO0o(byteArrayOutputStream, it2.next().intValue());
                }
                for (int i3 : c24642OooO0O02.f83474OooO0oo) {
                    C24643OooO0OO.OooO0o(byteArrayOutputStream, i3);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            C24643OooO0OO.OooO0o(byteArrayOutputStream2, c24642OooO0O0Arr.length);
            int i4 = 2;
            int i5 = 2;
            for (C24642OooO0O0 c24642OooO0O03 : c24642OooO0O0Arr) {
                C24643OooO0OO.OooO0o0(byteArrayOutputStream2, c24642OooO0O03.f83469OooO0OO, 4);
                C24643OooO0OO.OooO0o0(byteArrayOutputStream2, c24642OooO0O03.f83470OooO0Oo, 4);
                C24643OooO0OO.OooO0o0(byteArrayOutputStream2, c24642OooO0O03.f83473OooO0oO, 4);
                String strOooO0O03 = OooO0O0(c24642OooO0O03.f83467OooO00o, c24642OooO0O03.f83468OooO0O0, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strOooO0O03.getBytes(charset3).length;
                C24643OooO0OO.OooO0o(byteArrayOutputStream2, length2);
                i5 = i5 + 14 + length2;
                byteArrayOutputStream2.write(strOooO0O03.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i5 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i5 + ", does not match actual size " + byteArray.length);
            }
            C24648OooO0oo c24648OooO0oo = new C24648OooO0oo(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(c24648OooO0oo);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i6 = 0;
            int i7 = 0;
            while (i6 < c24642OooO0O0Arr.length) {
                try {
                    C24642OooO0O0 c24642OooO0O04 = c24642OooO0O0Arr[i6];
                    C24643OooO0OO.OooO0o(byteArrayOutputStream3, i6);
                    C24643OooO0OO.OooO0o(byteArrayOutputStream3, c24642OooO0O04.f83472OooO0o0);
                    i7 = i7 + 4 + (c24642OooO0O04.f83472OooO0o0 * i4);
                    int[] iArr = c24642OooO0O04.f83474OooO0oo;
                    int length3 = iArr.length;
                    int i8 = i;
                    int i9 = i4;
                    int i10 = i8;
                    while (i10 < length3) {
                        int i11 = iArr[i10];
                        C24643OooO0OO.OooO0o(byteArrayOutputStream3, i11 - i8);
                        i10++;
                        i8 = i11;
                    }
                    i6++;
                    i4 = i9;
                    i = 0;
                } catch (Throwable th) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i7 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i7 + ", does not match actual size " + byteArray2.length);
            }
            C24648OooO0oo c24648OooO0oo2 = new C24648OooO0oo(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(c24648OooO0oo2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i12 = 0;
            int i13 = 0;
            while (i12 < c24642OooO0O0Arr.length) {
                try {
                    C24642OooO0O0 c24642OooO0O05 = c24642OooO0O0Arr[i12];
                    Iterator<Map.Entry<Integer, Integer>> it3 = c24642OooO0O05.f83466OooO.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= it3.next().getValue().intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        OooOO0o(byteArrayOutputStream4, iIntValue, c24642OooO0O05);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            OooOOO0(byteArrayOutputStream4, c24642OooO0O05);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            C24643OooO0OO.OooO0o(byteArrayOutputStream3, i12);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i14 = i13 + 6;
                            ArrayList arrayList4 = arrayList3;
                            C24643OooO0OO.OooO0o0(byteArrayOutputStream3, length4, 4);
                            C24643OooO0OO.OooO0o(byteArrayOutputStream3, iIntValue);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i13 = i14 + length4;
                            i12++;
                            arrayList3 = arrayList4;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i13 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i13 + ", does not match actual size " + byteArray5.length);
            }
            C24648OooO0oo c24648OooO0oo3 = new C24648OooO0oo(4, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList2.add(c24648OooO0oo3);
            long j2 = 4;
            long size2 = j2 + j2 + 4 + ((long) (arrayList2.size() * 16));
            C24643OooO0OO.OooO0o0(byteArrayOutputStream, arrayList2.size(), 4);
            int i15 = 0;
            while (i15 < arrayList2.size()) {
                C24648OooO0oo c24648OooO0oo4 = (C24648OooO0oo) arrayList2.get(i15);
                int i16 = c24648OooO0oo4.f83487OooO00o;
                if (i16 == 1) {
                    j = 0;
                } else if (i16 == 2) {
                    j = 1;
                } else if (i16 == 3) {
                    j = 2;
                } else if (i16 == 4) {
                    j = 3;
                } else {
                    if (i16 != 5) {
                        throw null;
                    }
                    j = 4;
                }
                C24643OooO0OO.OooO0o0(byteArrayOutputStream, j, 4);
                C24643OooO0OO.OooO0o0(byteArrayOutputStream, size2, 4);
                byte[] bArr7 = c24648OooO0oo4.f83488OooO0O0;
                if (c24648OooO0oo4.f83489OooO0OO) {
                    long length5 = bArr7.length;
                    byte[] bArrOooO00o5 = C24643OooO0OO.OooO00o(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrOooO00o5);
                    C24643OooO0OO.OooO0o0(byteArrayOutputStream, bArrOooO00o5.length, 4);
                    C24643OooO0OO.OooO0o0(byteArrayOutputStream, length5, 4);
                    length = bArrOooO00o5.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    C24643OooO0OO.OooO0o0(byteArrayOutputStream, bArr7.length, 4);
                    C24643OooO0OO.OooO0o0(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i15++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i17 = 0; i17 < arrayList6.size(); i17++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i17));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public static byte[] OooO00o(C24642OooO0O0[] c24642OooO0O0Arr, byte[] bArr) throws IOException {
        int i = 0;
        int length = 0;
        for (C24642OooO0O0 c24642OooO0O0 : c24642OooO0O0Arr) {
            length += ((((c24642OooO0O0.f83473OooO0oO * 2) + 7) & (-8)) / 8) + (c24642OooO0O0.f83472OooO0o0 * 2) + OooO0O0(c24642OooO0O0.f83467OooO00o, c24642OooO0O0.f83468OooO0O0, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + c24642OooO0O0.f83471OooO0o;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, C24647OooO0oO.f83482OooO0OO)) {
            int length2 = c24642OooO0O0Arr.length;
            while (i < length2) {
                C24642OooO0O0 c24642OooO0O02 = c24642OooO0O0Arr[i];
                OooOO0O(byteArrayOutputStream, c24642OooO0O02, OooO0O0(c24642OooO0O02.f83467OooO00o, c24642OooO0O02.f83468OooO0O0, bArr));
                OooOO0(byteArrayOutputStream, c24642OooO0O02);
                i++;
            }
        } else {
            for (C24642OooO0O0 c24642OooO0O03 : c24642OooO0O0Arr) {
                OooOO0O(byteArrayOutputStream, c24642OooO0O03, OooO0O0(c24642OooO0O03.f83467OooO00o, c24642OooO0O03.f83468OooO0O0, bArr));
            }
            int length3 = c24642OooO0O0Arr.length;
            while (i < length3) {
                OooOO0(byteArrayOutputStream, c24642OooO0O0Arr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    public static String OooO0O0(String str, String str2, byte[] bArr) {
        byte[] bArr2 = C24647OooO0oO.f83485OooO0o0;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = C24647OooO0oO.f83483OooO0Oo;
        Object obj = (zEquals || Arrays.equals(bArr, bArr3)) ? C18241k5.f55433h : "!";
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(C18241k5.f55433h, "!");
            }
            if (C18241k5.f55433h.equals(obj)) {
                return str2.replace("!", C18241k5.f55433h);
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(C18241k5.f55433h)) {
                if ("!".equals(obj)) {
                    return str2.replace(C18241k5.f55433h, "!");
                }
                if (C18241k5.f55433h.equals(obj)) {
                    return str2.replace("!", C18241k5.f55433h);
                }
            } else if (!str2.endsWith(".apk")) {
                return androidx.concurrent.futures.OooO00o.OooO0OO(C22218Oooo.OooO0OO(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? C18241k5.f55433h : "!", str2);
            }
        }
        return str2;
    }

    public static int[] OooO0OO(ByteArrayInputStream byteArrayInputStream, int i) throws IOException {
        int[] iArr = new int[i];
        int iOooO0Oo = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iOooO0Oo += (int) C24643OooO0OO.OooO0Oo(byteArrayInputStream, 2);
            iArr[i2] = iOooO0Oo;
        }
        return iArr;
    }

    public static C24642OooO0O0[] OooO0Oo(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, C24642OooO0O0[] c24642OooO0O0Arr) throws IOException {
        byte[] bArr3 = C24647OooO0oO.f83484OooO0o;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, C24647OooO0oO.f83486OooO0oO)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iOooO0Oo = (int) C24643OooO0OO.OooO0Oo(fileInputStream, 2);
            byte[] bArrOooO0OO = C24643OooO0OO.OooO0OO(fileInputStream, (int) C24643OooO0OO.OooO0Oo(fileInputStream, 4), (int) C24643OooO0OO.OooO0Oo(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrOooO0OO);
            try {
                C24642OooO0O0[] c24642OooO0O0ArrOooO0o = OooO0o(byteArrayInputStream, bArr2, iOooO0Oo, c24642OooO0O0Arr);
                byteArrayInputStream.close();
                return c24642OooO0O0ArrOooO0o;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(C24647OooO0oO.f83480OooO00o, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iOooO0Oo2 = (int) C24643OooO0OO.OooO0Oo(fileInputStream, 1);
        byte[] bArrOooO0OO2 = C24643OooO0OO.OooO0OO(fileInputStream, (int) C24643OooO0OO.OooO0Oo(fileInputStream, 4), (int) C24643OooO0OO.OooO0Oo(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrOooO0OO2);
        try {
            C24642OooO0O0[] c24642OooO0O0ArrOooO0o0 = OooO0o0(byteArrayInputStream2, iOooO0Oo2, c24642OooO0O0Arr);
            byteArrayInputStream2.close();
            return c24642OooO0O0ArrOooO0o0;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static C24642OooO0O0[] OooO0o(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, C24642OooO0O0[] c24642OooO0O0Arr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new C24642OooO0O0[0];
        }
        if (i != c24642OooO0O0Arr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i2 = 0; i2 < i; i2++) {
            C24643OooO0OO.OooO0Oo(byteArrayInputStream, 2);
            String str = new String(C24643OooO0OO.OooO0O0(byteArrayInputStream, (int) C24643OooO0OO.OooO0Oo(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jOooO0Oo = C24643OooO0OO.OooO0Oo(byteArrayInputStream, 4);
            int iOooO0Oo = (int) C24643OooO0OO.OooO0Oo(byteArrayInputStream, 2);
            C24642OooO0O0 c24642OooO0O0 = null;
            if (c24642OooO0O0Arr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(C18241k5.f55433h);
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                int i3 = 0;
                while (true) {
                    if (i3 >= c24642OooO0O0Arr.length) {
                        break;
                    }
                    if (c24642OooO0O0Arr[i3].f83468OooO0O0.equals(strSubstring)) {
                        c24642OooO0O0 = c24642OooO0O0Arr[i3];
                        break;
                    }
                    i3++;
                }
            }
            if (c24642OooO0O0 == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            c24642OooO0O0.f83470OooO0Oo = jOooO0Oo;
            int[] iArrOooO0OO = OooO0OO(byteArrayInputStream, iOooO0Oo);
            if (Arrays.equals(bArr, C24647OooO0oO.f83485OooO0o0)) {
                c24642OooO0O0.f83472OooO0o0 = iOooO0Oo;
                c24642OooO0O0.f83474OooO0oo = iArrOooO0OO;
            }
        }
        return c24642OooO0O0Arr;
    }

    public static C24642OooO0O0[] OooO0o0(ByteArrayInputStream byteArrayInputStream, int i, C24642OooO0O0[] c24642OooO0O0Arr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new C24642OooO0O0[0];
        }
        if (i != c24642OooO0O0Arr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iOooO0Oo = (int) C24643OooO0OO.OooO0Oo(byteArrayInputStream, 2);
            iArr[i2] = (int) C24643OooO0OO.OooO0Oo(byteArrayInputStream, 2);
            strArr[i2] = new String(C24643OooO0OO.OooO0O0(byteArrayInputStream, iOooO0Oo), StandardCharsets.UTF_8);
        }
        for (int i3 = 0; i3 < i; i3++) {
            C24642OooO0O0 c24642OooO0O0 = c24642OooO0O0Arr[i3];
            if (!c24642OooO0O0.f83468OooO0O0.equals(strArr[i3])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i4 = iArr[i3];
            c24642OooO0O0.f83472OooO0o0 = i4;
            c24642OooO0O0.f83474OooO0oo = OooO0OO(byteArrayInputStream, i4);
        }
        return c24642OooO0O0Arr;
    }

    public static C24642OooO0O0[] OooO0oO(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, C24647OooO0oO.f83481OooO0O0)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iOooO0Oo = (int) C24643OooO0OO.OooO0Oo(fileInputStream, 1);
        byte[] bArrOooO0OO = C24643OooO0OO.OooO0OO(fileInputStream, (int) C24643OooO0OO.OooO0Oo(fileInputStream, 4), (int) C24643OooO0OO.OooO0Oo(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrOooO0OO);
        try {
            C24642OooO0O0[] c24642OooO0O0ArrOooO0oo = OooO0oo(byteArrayInputStream, str, iOooO0Oo);
            byteArrayInputStream.close();
            return c24642OooO0O0ArrOooO0oo;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static C24642OooO0O0[] OooO0oo(ByteArrayInputStream byteArrayInputStream, String str, int i) throws IOException {
        TreeMap<Integer, Integer> treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new C24642OooO0O0[0];
        }
        C24642OooO0O0[] c24642OooO0O0Arr = new C24642OooO0O0[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iOooO0Oo = (int) C24643OooO0OO.OooO0Oo(byteArrayInputStream, 2);
            int iOooO0Oo2 = (int) C24643OooO0OO.OooO0Oo(byteArrayInputStream, 2);
            c24642OooO0O0Arr[i2] = new C24642OooO0O0(str, new String(C24643OooO0OO.OooO0O0(byteArrayInputStream, iOooO0Oo), StandardCharsets.UTF_8), C24643OooO0OO.OooO0Oo(byteArrayInputStream, 4), iOooO0Oo2, (int) C24643OooO0OO.OooO0Oo(byteArrayInputStream, 4), (int) C24643OooO0OO.OooO0Oo(byteArrayInputStream, 4), new int[iOooO0Oo2], new TreeMap());
        }
        for (int i3 = 0; i3 < i; i3++) {
            C24642OooO0O0 c24642OooO0O0 = c24642OooO0O0Arr[i3];
            int iAvailable = byteArrayInputStream.available() - c24642OooO0O0.f83471OooO0o;
            int iOooO0Oo3 = 0;
            while (true) {
                int iAvailable2 = byteArrayInputStream.available();
                treeMap = c24642OooO0O0.f83466OooO;
                if (iAvailable2 <= iAvailable) {
                    break;
                }
                iOooO0Oo3 += (int) C24643OooO0OO.OooO0Oo(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iOooO0Oo3), 1);
                for (int iOooO0Oo4 = (int) C24643OooO0OO.OooO0Oo(byteArrayInputStream, 2); iOooO0Oo4 > 0; iOooO0Oo4--) {
                    C24643OooO0OO.OooO0Oo(byteArrayInputStream, 2);
                    int iOooO0Oo5 = (int) C24643OooO0OO.OooO0Oo(byteArrayInputStream, 1);
                    if (iOooO0Oo5 != 6 && iOooO0Oo5 != 7) {
                        while (iOooO0Oo5 > 0) {
                            C24643OooO0OO.OooO0Oo(byteArrayInputStream, 1);
                            for (int iOooO0Oo6 = (int) C24643OooO0OO.OooO0Oo(byteArrayInputStream, 1); iOooO0Oo6 > 0; iOooO0Oo6--) {
                                C24643OooO0OO.OooO0Oo(byteArrayInputStream, 2);
                            }
                            iOooO0Oo5--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() != iAvailable) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            c24642OooO0O0.f83474OooO0oo = OooO0OO(byteArrayInputStream, c24642OooO0O0.f83472OooO0o0);
            int i4 = c24642OooO0O0.f83473OooO0oO;
            BitSet bitSetValueOf = BitSet.valueOf(C24643OooO0OO.OooO0O0(byteArrayInputStream, (((i4 * 2) + 7) & (-8)) / 8));
            for (int i5 = 0; i5 < i4; i5++) {
                int i6 = bitSetValueOf.get(i5) ? 2 : 0;
                if (bitSetValueOf.get(i5 + i4)) {
                    i6 |= 4;
                }
                if (i6 != 0) {
                    Integer num = treeMap.get(Integer.valueOf(i5));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(Integer.valueOf(i5), Integer.valueOf(i6 | num.intValue()));
                }
            }
        }
        return c24642OooO0O0Arr;
    }

    public static void OooOO0(ByteArrayOutputStream byteArrayOutputStream, C24642OooO0O0 c24642OooO0O0) throws IOException {
        OooOOO0(byteArrayOutputStream, c24642OooO0O0);
        int[] iArr = c24642OooO0O0.f83474OooO0oo;
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = iArr[i];
            C24643OooO0OO.OooO0o(byteArrayOutputStream, i3 - i2);
            i++;
            i2 = i3;
        }
        int i4 = c24642OooO0O0.f83473OooO0oO;
        byte[] bArr = new byte[(((i4 * 2) + 7) & (-8)) / 8];
        for (Map.Entry<Integer, Integer> entry : c24642OooO0O0.f83466OooO.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            if ((iIntValue2 & 2) != 0) {
                int i5 = iIntValue / 8;
                bArr[i5] = (byte) (bArr[i5] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i6 = iIntValue + i4;
                int i7 = i6 / 8;
                bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void OooOO0O(ByteArrayOutputStream byteArrayOutputStream, C24642OooO0O0 c24642OooO0O0, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        C24643OooO0OO.OooO0o(byteArrayOutputStream, str.getBytes(charset).length);
        C24643OooO0OO.OooO0o(byteArrayOutputStream, c24642OooO0O0.f83472OooO0o0);
        C24643OooO0OO.OooO0o0(byteArrayOutputStream, c24642OooO0O0.f83471OooO0o, 4);
        C24643OooO0OO.OooO0o0(byteArrayOutputStream, c24642OooO0O0.f83469OooO0OO, 4);
        C24643OooO0OO.OooO0o0(byteArrayOutputStream, c24642OooO0O0.f83473OooO0oO, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void OooOO0o(ByteArrayOutputStream byteArrayOutputStream, int i, C24642OooO0O0 c24642OooO0O0) throws IOException {
        int iBitCount = Integer.bitCount(i & (-2));
        int i2 = c24642OooO0O0.f83473OooO0oO;
        byte[] bArr = new byte[(((iBitCount * i2) + 7) & (-8)) / 8];
        for (Map.Entry<Integer, Integer> entry : c24642OooO0O0.f83466OooO.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            int i3 = 0;
            for (int i4 = 1; i4 <= 4; i4 <<= 1) {
                if (i4 != 1 && (i4 & i) != 0) {
                    if ((i4 & iIntValue2) == i4) {
                        int i5 = (i3 * i2) + iIntValue;
                        int i6 = i5 / 8;
                        bArr[i6] = (byte) ((1 << (i5 % 8)) | bArr[i6]);
                    }
                    i3++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void OooOOO0(ByteArrayOutputStream byteArrayOutputStream, C24642OooO0O0 c24642OooO0O0) throws IOException {
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : c24642OooO0O0.f83466OooO.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            if ((entry.getValue().intValue() & 1) != 0) {
                C24643OooO0OO.OooO0o(byteArrayOutputStream, iIntValue - i);
                C24643OooO0OO.OooO0o(byteArrayOutputStream, 0);
                i = iIntValue;
            }
        }
    }
}
