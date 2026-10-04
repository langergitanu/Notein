package o0oo0oO;

import OooO0o.C20424OooO0Oo;
import androidx.appcompat.view.menu.C21505OooO0Oo;
import androidx.datastore.preferences.protobuf.o000oOoO;
import com.huawei.hms.network.embedded.C18241k5;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import o0oo0ooo.C31413OooO0O0;
import o0ooO00o.C31428OooO00o;

/* JADX INFO: renamed from: o0oo0oO.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C31328OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final byte[] f111870OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f111871OooO0O0;

    /* JADX INFO: renamed from: o0oo0oO.OooO0OO$OooO00o */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public String f111872OooO00o;
    }

    /* JADX INFO: renamed from: o0oo0oO.OooO0OO$OooO0O0 */
    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public String f111873OooO00o;
    }

    public C31328OooO0OO() {
        this.f111870OooO00o = new byte[512];
        this.f111871OooO0O0 = false;
    }

    public static void OooO0O0(OooO0O0 oooO0O0, String str, String str2) throws IOException {
        if (oooO0O0.f111873OooO00o.equals(str)) {
            return;
        }
        StringBuilder sbOooO0o0 = C20424OooO0Oo.OooO0o0("Error : ~", str2, " contains an unexpected operator : ");
        sbOooO0o0.append(oooO0O0.f111873OooO00o);
        throw new IOException(sbOooO0o0.toString());
    }

    public static int OooO0OO(byte[] bArr) {
        int i = bArr[0] & 255;
        return bArr.length == 2 ? (i << 8) + (bArr[1] & 255) : i;
    }

    public static BufferedInputStream OooO0Oo(String str) throws IOException {
        if (C31428OooO00o.f112202OooO00o != null) {
            return new BufferedInputStream(C31428OooO00o.OooO00o("com/tom_roush/fontbox/resources/cmap/" + str));
        }
        InputStream resourceAsStream = C31328OooO0OO.class.getResourceAsStream("/com/tom_roush/fontbox/resources/cmap/" + str);
        if (resourceAsStream != null) {
            return new BufferedInputStream(resourceAsStream);
        }
        throw new IOException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Error: Could not find referenced cmap stream ", str));
    }

    public static boolean OooO0o(int i) {
        return i == 37 || i == 47 || i == 60 || i == 62 || i == 91 || i == 93 || i == 123 || i == 125 || i == 40 || i == 41;
    }

    public static boolean OooO0o0(int i, byte[] bArr, boolean z) {
        if (i <= 0 || (bArr[i] & 255) != 255) {
            bArr[i] = (byte) (bArr[i] + 1);
            return true;
        }
        if (z) {
            return false;
        }
        bArr[i] = 0;
        OooO0o0(i - 1, bArr, z);
        return true;
    }

    public static boolean OooO0oO(int i) {
        return i == -1 || i == 32 || i == 13 || i == 10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x01c0, code lost:
    
        r2 = r2 + 1;
        r11 = new byte[r2];
        java.lang.System.arraycopy(r6, 0, r11, 0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01c6, code lost:
    
        return r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO(PushbackInputStream pushbackInputStream) throws IOException {
        int i;
        int i2 = pushbackInputStream.read();
        while (true) {
            if (i2 != 9 && i2 != 32 && i2 != 13 && i2 != 10) {
                break;
            }
            i2 = pushbackInputStream.read();
        }
        if (i2 == -1) {
            return null;
        }
        if (i2 == 37) {
            StringBuilder sb = new StringBuilder();
            sb.append((char) i2);
            int i3 = pushbackInputStream.read();
            while (i3 != -1 && i3 != 13 && i3 != 10) {
                sb.append((char) i3);
                i3 = pushbackInputStream.read();
            }
            return sb.toString();
        }
        if (i2 == 40) {
            StringBuilder sb2 = new StringBuilder();
            int i4 = pushbackInputStream.read();
            while (i4 != -1 && i4 != 41) {
                sb2.append((char) i4);
                i4 = pushbackInputStream.read();
            }
            return sb2.toString();
        }
        if (i2 == 60) {
            int i5 = pushbackInputStream.read();
            if (i5 == 60) {
                HashMap map = new HashMap();
                Object objOooO = OooO(pushbackInputStream);
                while ((objOooO instanceof OooO00o) && !">>".equals(objOooO)) {
                    map.put(((OooO00o) objOooO).f111872OooO00o, OooO(pushbackInputStream));
                    objOooO = OooO(pushbackInputStream);
                }
                return map;
            }
            int i6 = 16;
            int i7 = -1;
            while (true) {
                byte[] bArr = this.f111870OooO00o;
                if (i5 == -1 || i5 == 62) {
                    break;
                }
                if (i5 >= 48 && i5 <= 57) {
                    i = i5 - 48;
                } else if (i5 >= 65 && i5 <= 70) {
                    i = i5 - 55;
                } else if (i5 >= 97 && i5 <= 102) {
                    i = i5 - 87;
                } else {
                    if (!OooO0oO(i5)) {
                        throw new IOException("Error: expected hex character and not " + ((char) i5) + C18241k5.f55433h + i5);
                    }
                    i5 = pushbackInputStream.read();
                }
                int i8 = i * i6;
                if (i6 == 16) {
                    i7++;
                    if (i7 >= bArr.length) {
                        throw new IOException("cmap token ist larger than buffer size " + bArr.length);
                    }
                    bArr[i7] = 0;
                    i6 = 1;
                } else {
                    i6 = 16;
                }
                bArr[i7] = (byte) (bArr[i7] + i8);
                i5 = pushbackInputStream.read();
            }
        } else {
            if (i2 == 62) {
                if (pushbackInputStream.read() == 62) {
                    return ">>";
                }
                throw new IOException("Error: expected the end of a dictionary.");
            }
            if (i2 == 91) {
                ArrayList arrayList = new ArrayList();
                Object objOooO2 = OooO(pushbackInputStream);
                while (objOooO2 != null && !"]".equals(objOooO2)) {
                    arrayList.add(objOooO2);
                    objOooO2 = OooO(pushbackInputStream);
                }
                return arrayList;
            }
            if (i2 == 93) {
                return "]";
            }
            switch (i2) {
                case 47:
                    StringBuilder sb3 = new StringBuilder();
                    int i9 = pushbackInputStream.read();
                    while (!OooO0oO(i9) && !OooO0o(i9)) {
                        sb3.append((char) i9);
                        i9 = pushbackInputStream.read();
                    }
                    if (OooO0o(i9)) {
                        pushbackInputStream.unread(i9);
                    }
                    String string = sb3.toString();
                    OooO00o oooO00o = new OooO00o();
                    oooO00o.f111872OooO00o = string;
                    return oooO00o;
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append((char) i2);
                    int i10 = pushbackInputStream.read();
                    while (!OooO0oO(i10)) {
                        char c = (char) i10;
                        if (!Character.isDigit(c) && i10 != 46) {
                            pushbackInputStream.unread(i10);
                            String string2 = sb4.toString();
                            return string2.indexOf(46) < 0 ? Double.valueOf(string2) : Integer.valueOf(string2);
                        }
                        sb4.append(c);
                        i10 = pushbackInputStream.read();
                    }
                    pushbackInputStream.unread(i10);
                    String string22 = sb4.toString();
                    if (string22.indexOf(46) < 0) {
                    }
                    break;
                default:
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append((char) i2);
                    int i11 = pushbackInputStream.read();
                    while (!OooO0oO(i11) && !OooO0o(i11) && !Character.isDigit(i11)) {
                        sb5.append((char) i11);
                        i11 = pushbackInputStream.read();
                    }
                    if (OooO0o(i11) || Character.isDigit(i11)) {
                        pushbackInputStream.unread(i11);
                    }
                    String string3 = sb5.toString();
                    OooO0O0 oooO0O0 = new OooO0O0();
                    oooO0O0.f111873OooO00o = string3;
                    return oooO0O0;
            }
        }
    }

    public final void OooO00o(C31327OooO0O0 c31327OooO0O0, byte[] bArr, int i, byte[] bArr2) {
        for (int i2 = 0; i2 < i; i2++) {
            c31327OooO0O0.OooO00o(new String(bArr2, bArr2.length == 1 ? C31413OooO0O0.f112169OooO00o : C31413OooO0O0.f112171OooO0OO), bArr);
            if (!OooO0o0(bArr2.length - 1, bArr2, this.f111871OooO0O0)) {
                return;
            }
            OooO0o0(bArr.length - 1, bArr, false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:180:0x0377, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x0374, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0374, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C31327OooO0O0 OooO0oo(FilterInputStream filterInputStream) throws IOException {
        PushbackInputStream pushbackInputStream = new PushbackInputStream(filterInputStream);
        C31327OooO0O0 c31327OooO0O0 = new C31327OooO0O0();
        Object obj = null;
        while (true) {
            Object objOooO = OooO(pushbackInputStream);
            if (objOooO == null) {
                break;
            }
            if (objOooO instanceof OooO0O0) {
                String str = ((OooO0O0) objOooO).f111873OooO00o;
                if (str.equals("endcmap")) {
                    break;
                }
                if (obj != null) {
                    boolean zEquals = str.equals("usecmap");
                    ArrayList arrayList = c31327OooO0O0.f111869OooOO0;
                    ArrayList arrayList2 = c31327OooO0O0.f111865OooO0o;
                    HashMap map = c31327OooO0O0.f111860OooO;
                    if (zEquals && (obj instanceof OooO00o)) {
                        C31327OooO0O0 c31327OooO0O0OooO0oo = OooO0oo(OooO0Oo(((OooO00o) obj).f111872OooO00o));
                        for (C31329OooO0Oo c31329OooO0Oo : c31327OooO0O0OooO0oo.f111865OooO0o) {
                            arrayList2.add(c31329OooO0Oo);
                            c31327OooO0O0.f111866OooO0o0 = Math.max(c31327OooO0O0.f111866OooO0o0, c31329OooO0Oo.f111876OooO0OO);
                            c31327OooO0O0.f111864OooO0Oo = Math.min(c31327OooO0O0.f111864OooO0Oo, c31329OooO0Oo.f111876OooO0OO);
                        }
                        c31327OooO0O0.f111867OooO0oO.putAll(c31327OooO0O0OooO0oo.f111867OooO0oO);
                        map.putAll(c31327OooO0O0OooO0oo.f111860OooO);
                        arrayList.addAll(c31327OooO0O0OooO0oo.f111869OooOO0);
                    } else if (obj instanceof Number) {
                        int i = 0;
                        if (str.equals("begincodespacerange")) {
                            Number number = (Number) obj;
                            while (true) {
                                if (i < number.intValue()) {
                                    Object objOooO2 = OooO(pushbackInputStream);
                                    if (objOooO2 instanceof OooO0O0) {
                                        OooO0O0((OooO0O0) objOooO2, "endcodespacerange", "codespacerange");
                                        break;
                                    }
                                    try {
                                        C31329OooO0Oo c31329OooO0Oo2 = new C31329OooO0Oo((byte[]) objOooO2, (byte[]) OooO(pushbackInputStream));
                                        arrayList2.add(c31329OooO0Oo2);
                                        c31327OooO0O0.f111866OooO0o0 = Math.max(c31327OooO0O0.f111866OooO0o0, c31329OooO0Oo2.f111876OooO0OO);
                                        c31327OooO0O0.f111864OooO0Oo = Math.min(c31327OooO0O0.f111864OooO0Oo, c31329OooO0Oo2.f111876OooO0OO);
                                        i++;
                                    } catch (IllegalArgumentException e) {
                                        throw new IOException(e);
                                    }
                                }
                            }
                        } else if (str.equals("beginbfchar")) {
                            Number number2 = (Number) obj;
                            while (true) {
                                if (i < number2.intValue()) {
                                    Object objOooO3 = OooO(pushbackInputStream);
                                    if (objOooO3 instanceof OooO0O0) {
                                        OooO0O0((OooO0O0) objOooO3, "endbfchar", "bfchar");
                                        break;
                                    }
                                    byte[] bArr = (byte[]) objOooO3;
                                    Object objOooO4 = OooO(pushbackInputStream);
                                    if (objOooO4 instanceof byte[]) {
                                        byte[] bArr2 = (byte[]) objOooO4;
                                        c31327OooO0O0.OooO00o(new String(bArr2, bArr2.length == 1 ? C31413OooO0O0.f112169OooO00o : C31413OooO0O0.f112171OooO0OO), bArr);
                                    } else {
                                        if (!(objOooO4 instanceof OooO00o)) {
                                            throw new IOException(o000oOoO.OooO00o(objOooO4, "Error parsing CMap beginbfchar, expected{COSString or COSName} and not "));
                                        }
                                        c31327OooO0O0.OooO00o(((OooO00o) objOooO4).f111872OooO00o, bArr);
                                    }
                                    i++;
                                }
                            }
                        } else if (str.equals("beginbfrange")) {
                            Number number3 = (Number) obj;
                            int i2 = 0;
                            while (true) {
                                if (i2 < number3.intValue()) {
                                    Object objOooO5 = OooO(pushbackInputStream);
                                    if (objOooO5 instanceof OooO0O0) {
                                        OooO0O0((OooO0O0) objOooO5, "endbfrange", "bfrange");
                                        break;
                                    }
                                    byte[] bArr3 = (byte[]) objOooO5;
                                    byte[] bArr4 = (byte[]) OooO(pushbackInputStream);
                                    int iOooO0OO = C31327OooO0O0.OooO0OO(bArr3.length, bArr3);
                                    int iOooO0OO2 = C31327OooO0O0.OooO0OO(bArr4.length, bArr4);
                                    if (iOooO0OO2 < iOooO0OO) {
                                        break;
                                    }
                                    Object objOooO6 = OooO(pushbackInputStream);
                                    if (objOooO6 instanceof List) {
                                        List<byte[]> list = (List) objOooO6;
                                        if (!list.isEmpty() && list.size() >= iOooO0OO2 - iOooO0OO) {
                                            for (byte[] bArr5 : list) {
                                                c31327OooO0O0.OooO00o(new String(bArr5, bArr5.length == 1 ? C31413OooO0O0.f112169OooO00o : C31413OooO0O0.f112171OooO0OO), bArr3);
                                                OooO0o0(bArr3.length - 1, bArr3, false);
                                            }
                                        }
                                    } else if (objOooO6 instanceof byte[]) {
                                        byte[] bArr6 = (byte[]) objOooO6;
                                        if (bArr6.length > 0) {
                                            if (bArr6.length == 2 && iOooO0OO == 0 && iOooO0OO2 == 65535 && bArr6[0] == 0 && bArr6[1] == 0) {
                                                for (int i3 = 0; i3 < 256; i3++) {
                                                    byte b = (byte) i3;
                                                    bArr3[0] = b;
                                                    bArr3[1] = 0;
                                                    bArr6[0] = b;
                                                    bArr6[1] = 0;
                                                    OooO00o(c31327OooO0O0, bArr3, 256, bArr6);
                                                }
                                            } else {
                                                OooO00o(c31327OooO0O0, bArr3, (iOooO0OO2 - iOooO0OO) + 1, bArr6);
                                            }
                                        }
                                    }
                                    i2++;
                                }
                            }
                        } else if (str.equals("begincidchar")) {
                            Number number4 = (Number) obj;
                            while (true) {
                                if (i < number4.intValue()) {
                                    Object objOooO7 = OooO(pushbackInputStream);
                                    if (objOooO7 instanceof OooO0O0) {
                                        OooO0O0((OooO0O0) objOooO7, "endcidchar", "cidchar");
                                        break;
                                    }
                                    Integer num = (Integer) OooO(pushbackInputStream);
                                    num.getClass();
                                    map.put(Integer.valueOf(OooO0OO((byte[]) objOooO7)), num);
                                    i++;
                                }
                            }
                        } else if (str.equals("begincidrange") && (obj instanceof Integer)) {
                            int iIntValue = ((Integer) obj).intValue();
                            int i4 = 0;
                            while (true) {
                                if (i4 < iIntValue) {
                                    Object objOooO8 = OooO(pushbackInputStream);
                                    if (objOooO8 instanceof OooO0O0) {
                                        OooO0O0((OooO0O0) objOooO8, "endcidrange", "cidrange");
                                        break;
                                    }
                                    byte[] bArr7 = (byte[]) objOooO8;
                                    int iOooO0OO3 = OooO0OO(bArr7);
                                    byte[] bArr8 = (byte[]) OooO(pushbackInputStream);
                                    int iOooO0OO4 = OooO0OO(bArr8);
                                    Integer num2 = (Integer) OooO(pushbackInputStream);
                                    int iIntValue2 = num2.intValue();
                                    if (bArr7.length > 2 || bArr8.length > 2) {
                                        int i5 = (iOooO0OO4 + iIntValue2) - iOooO0OO3;
                                        while (iIntValue2 <= i5) {
                                            map.put(Integer.valueOf(OooO0OO(bArr7)), Integer.valueOf(iIntValue2));
                                            OooO0o0(bArr7.length - 1, bArr7, false);
                                            iIntValue2++;
                                        }
                                    } else if (iOooO0OO4 == iOooO0OO3) {
                                        map.put(Integer.valueOf(iOooO0OO3), num2);
                                    } else {
                                        char c = (char) iOooO0OO3;
                                        char c2 = (char) iOooO0OO4;
                                        C31326OooO00o c31326OooO00o = !arrayList.isEmpty() ? (C31326OooO00o) C21505OooO0Oo.OooO00o(1, arrayList) : null;
                                        if (c31326OooO00o != null) {
                                            char c3 = c31326OooO00o.f111858OooO0O0;
                                            if (c == c3 + 1 && iIntValue2 == ((c31326OooO00o.f111859OooO0OO + c3) - c31326OooO00o.f111857OooO00o) + 1) {
                                                c31326OooO00o.f111858OooO0O0 = c2;
                                            } else {
                                                arrayList.add(new C31326OooO00o(c, c2, iIntValue2));
                                            }
                                        }
                                    }
                                    i4++;
                                }
                            }
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            } else if (objOooO instanceof OooO00o) {
                String str2 = ((OooO00o) objOooO).f111872OooO00o;
                if ("WMode".equals(str2)) {
                    Object objOooO9 = OooO(pushbackInputStream);
                    if (objOooO9 instanceof Integer) {
                        ((Integer) objOooO9).getClass();
                    }
                } else if ("CMapName".equals(str2)) {
                    Object objOooO10 = OooO(pushbackInputStream);
                    if (objOooO10 instanceof OooO00o) {
                        c31327OooO0O0.f111861OooO00o = ((OooO00o) objOooO10).f111872OooO00o;
                    }
                } else if ("CMapVersion".equals(str2)) {
                    Object objOooO11 = OooO(pushbackInputStream);
                    if (objOooO11 instanceof Number) {
                        objOooO11.toString();
                    } else {
                        boolean z = objOooO11 instanceof String;
                    }
                } else if ("CMapType".equals(str2)) {
                    Object objOooO12 = OooO(pushbackInputStream);
                    if (objOooO12 instanceof Integer) {
                        ((Integer) objOooO12).getClass();
                    }
                } else if ("Registry".equals(str2)) {
                    Object objOooO13 = OooO(pushbackInputStream);
                    if (objOooO13 instanceof String) {
                        c31327OooO0O0.f111862OooO0O0 = (String) objOooO13;
                    }
                } else if ("Ordering".equals(str2)) {
                    Object objOooO14 = OooO(pushbackInputStream);
                    if (objOooO14 instanceof String) {
                        c31327OooO0O0.f111863OooO0OO = (String) objOooO14;
                    }
                } else if ("Supplement".equals(str2)) {
                    Object objOooO15 = OooO(pushbackInputStream);
                    if (objOooO15 instanceof Integer) {
                        ((Integer) objOooO15).getClass();
                    }
                }
            }
            obj = objOooO;
        }
    }

    public C31328OooO0OO(int i) {
        this.f111870OooO00o = new byte[512];
        this.f111871OooO0O0 = true;
    }
}
