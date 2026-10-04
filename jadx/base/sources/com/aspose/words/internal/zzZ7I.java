package com.aspose.words.internal;

import Oooo0oO.C21111o0ooOoO;
import androidx.appcompat.widget.C21532OooOOo;
import com.aspose.slides.C22218Oooo;
import com.huawei.hms.network.embedded.C18241k5;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ7I {
    private Set zzWpI;
    private Set zzWpJ;
    private Set zzWpK;
    private Set zzWpL;
    private Set zzWpM;
    private Set zzWpN;
    private Set zzWpT = new HashSet();
    private Set zzWpS = new HashSet();
    private Set zzWpR = new HashSet();
    private Set zzWpQ = new HashSet();
    private Set zzWpP = new HashSet();
    private Set zzWpO = new HashSet();

    private static byte[] zzH(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr3[i] = (byte) (bArr[i] | bArr2[i]);
        }
        return bArr3;
    }

    private static int zzI(byte[] bArr, byte[] bArr2) {
        if (zzYGU.zzp(bArr, bArr2)) {
            return 0;
        }
        return zzYGU.zzp(zzK(bArr, bArr2), bArr) ? 1 : -1;
    }

    private static byte[] zzJ(byte[] bArr, byte[] bArr2) {
        for (int i = 0; i < bArr.length; i++) {
            if ((bArr[i] & 65535) < (65535 & bArr2[i])) {
                return bArr;
            }
        }
        return bArr2;
    }

    private static byte[] zzK(byte[] bArr, byte[] bArr2) {
        for (int i = 0; i < bArr.length; i++) {
            if ((bArr[i] & 65535) > (65535 & bArr2[i])) {
                return bArr;
            }
        }
        return bArr2;
    }

    private static boolean zzL(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length != bArr2.length / 2) {
            return false;
        }
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr2, length, bArr3, 0, length);
        byte[] bArr4 = new byte[length];
        byte[] bArr5 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr4[i] = (byte) (bArr2[i] & bArr3[i]);
            bArr5[i] = (byte) (bArr[i] & bArr3[i]);
        }
        return zzYGU.zzp(bArr4, bArr5);
    }

    private static byte[][] zzM(byte[] bArr, byte[] bArr2) {
        int length = bArr.length / 2;
        byte[] bArr3 = new byte[length];
        byte[] bArr4 = new byte[length];
        System.arraycopy(bArr, 0, bArr3, 0, length);
        System.arraycopy(bArr, length, bArr4, 0, length);
        byte[] bArr5 = new byte[length];
        byte[] bArr6 = new byte[length];
        System.arraycopy(bArr2, 0, bArr5, 0, length);
        System.arraycopy(bArr2, length, bArr6, 0, length);
        return new byte[][]{bArr3, bArr4, bArr5, bArr6};
    }

    private static byte[] zzN(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length * 2];
        System.arraycopy(bArr, 0, bArr3, 0, length);
        System.arraycopy(bArr2, 0, bArr3, length, length);
        return bArr3;
    }

    private static Set zzO(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return Collections.EMPTY_SET;
        }
        byte[][] bArrZzM = zzM(bArr, bArr2);
        byte[] bArr3 = bArrZzM[0];
        byte[] bArr4 = bArrZzM[1];
        byte[] bArr5 = bArrZzM[2];
        byte[] bArr6 = bArrZzM[3];
        byte[][] bArrZzX = zzX(bArr3, bArr4, bArr5, bArr6);
        return zzI(zzK(bArrZzX[0], bArrZzX[2]), zzJ(bArrZzX[1], bArrZzX[3])) == 1 ? Collections.EMPTY_SET : Collections.singleton(zzN(zzH(bArrZzX[0], bArrZzX[2]), zzH(bArr4, bArr6)));
    }

    private static Set zzP(byte[] bArr, byte[] bArr2) {
        HashSet hashSet = new HashSet();
        if (zzYGU.zzp(bArr, bArr2)) {
            hashSet.add(bArr);
            return hashSet;
        }
        hashSet.add(bArr);
        hashSet.add(bArr2);
        return hashSet;
    }

    private void zzR(Set set, String str) throws zzZ7L {
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (zzXq(str, (String) it.next())) {
                return;
            }
        }
        if (str.length() != 0 || set.size() != 0) {
            throw new zzZ7L("URI is not from a permitted subtree.");
        }
    }

    private Set zzS(Set set, String str) {
        if (set.isEmpty()) {
            if (str == null) {
                return set;
            }
            set.add(str);
            return set;
        }
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzY((String) it.next(), str, hashSet);
        }
        return hashSet;
    }

    private void zzT(Set set, String str) throws zzZ7L {
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (zzXq(str, (String) it.next())) {
                throw new zzZ7L("URI is from an excluded subtree.");
            }
        }
    }

    private static Set zzU(Set set, String str) {
        if (set.isEmpty()) {
            if (str == null) {
                return set;
            }
            set.add(str);
            return set;
        }
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (zzXr(str2, str)) {
                hashSet.add(str);
            } else if (zzXr(str, str2)) {
                hashSet.add(str2);
            } else {
                hashSet.add(str2);
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    private void zzV(zzZ8C zzz8c) throws zzZ7L {
        zzY(this.zzWpT, zzZD4.zzYy(zzz8c));
    }

    private void zzW(zzZ8C zzz8c) throws zzZ7L {
        zzZ(this.zzWpN, zzZD4.zzYy(zzz8c.zzXL0()));
    }

    private static Set zzX(Set set, zzZD4 zzzd4) {
        if (set.isEmpty()) {
            if (zzzd4 == null) {
                return set;
            }
            set.add(zzzd4);
            return set;
        }
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzZD4 zzzd42 = (zzZD4) it.next();
            if (zzZ(zzzd4, zzzd42)) {
                hashSet.add(zzzd42);
            } else if (zzZ(zzzd42, zzzd4)) {
                hashSet.add(zzzd4);
            } else {
                hashSet.add(zzzd42);
                hashSet.add(zzzd4);
            }
        }
        return hashSet;
    }

    private static String zzXl(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bArr.length / 2; i++) {
            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(Integer.toString(bArr[i] & 255));
        }
        sb.append("/");
        boolean z = true;
        for (int length = bArr.length / 2; length < bArr.length; length++) {
            if (z) {
                z = false;
            } else {
                sb.append(".");
            }
            sb.append(Integer.toString(bArr[length] & 255));
        }
        return sb.toString();
    }

    private static boolean zzXq(String str, String str2) {
        String strZzwH = zzwH(str);
        return !str2.startsWith(".") ? strZzwH.equalsIgnoreCase(str2) : zzXr(strZzwH, str2);
    }

    private static boolean zzXr(String str, String str2) {
        if (str2.startsWith(".")) {
            str2 = str2.substring(1);
        }
        String[] strArrZzwa = zzYGI.zzwa(str2);
        String[] strArrZzwa2 = zzYGI.zzwa(str);
        if (strArrZzwa2.length <= strArrZzwa.length) {
            return false;
        }
        int length = strArrZzwa2.length - strArrZzwa.length;
        for (int i = -1; i < strArrZzwa.length; i++) {
            if (i == -1) {
                if (strArrZzwa2[i + length].equals("")) {
                    return false;
                }
            } else if (!strArrZzwa[i].equalsIgnoreCase(strArrZzwa2[i + length])) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzXs(String str, String str2) {
        String strSubstring = str.substring(str.indexOf(64) + 1);
        if (str2.indexOf(64) != -1) {
            if (str.equalsIgnoreCase(str2)) {
                return true;
            }
        } else if (str2.charAt(0) != '.') {
            if (strSubstring.equalsIgnoreCase(str2)) {
                return true;
            }
        } else if (zzXr(strSubstring, str2)) {
            return true;
        }
        return false;
    }

    private static String zzwH(String str) {
        String strSubstring = str.substring(str.indexOf(58) + 1);
        if (strSubstring.indexOf("//") != -1) {
            strSubstring = strSubstring.substring(strSubstring.indexOf("//") + 2);
        }
        if (strSubstring.lastIndexOf(58) != -1) {
            strSubstring = strSubstring.substring(0, strSubstring.lastIndexOf(58));
        }
        String strSubstring2 = strSubstring.substring(strSubstring.indexOf(58) + 1);
        String strSubstring3 = strSubstring2.substring(strSubstring2.indexOf(64) + 1);
        return strSubstring3.indexOf(47) != -1 ? strSubstring3.substring(0, strSubstring3.indexOf(47)) : strSubstring3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzZ7I)) {
            return false;
        }
        zzZ7I zzz7i = (zzZ7I) obj;
        return zzY((Collection) zzz7i.zzWpT, (Collection) this.zzWpT) && zzY((Collection) zzz7i.zzWpS, (Collection) this.zzWpS) && zzY((Collection) zzz7i.zzWpR, (Collection) this.zzWpR) && zzY((Collection) zzz7i.zzWpP, (Collection) this.zzWpP) && zzY((Collection) zzz7i.zzWpQ, (Collection) this.zzWpQ) && zzY((Collection) zzz7i.zzWpO, (Collection) this.zzWpO) && zzY((Collection) zzz7i.zzWpN, (Collection) this.zzWpN) && zzY((Collection) zzz7i.zzWpM, (Collection) this.zzWpM) && zzY((Collection) zzz7i.zzWpL, (Collection) this.zzWpL) && zzY((Collection) zzz7i.zzWpJ, (Collection) this.zzWpJ) && zzY((Collection) zzz7i.zzWpK, (Collection) this.zzWpK) && zzY((Collection) zzz7i.zzWpI, (Collection) this.zzWpI);
    }

    public final int hashCode() {
        return zzU(this.zzWpT) + zzU(this.zzWpS) + zzU(this.zzWpR) + zzU(this.zzWpP) + zzU(this.zzWpQ) + zzU(this.zzWpO) + zzU(this.zzWpN) + zzU(this.zzWpM) + zzU(this.zzWpL) + zzU(this.zzWpJ) + zzU(this.zzWpK) + zzU(this.zzWpI);
    }

    public final String toString() {
        String strOooO0OO;
        if (this.zzWpN != null) {
            strOooO0OO = "permitted:\nDN:\n" + this.zzWpN.toString() + IOUtils.LINE_SEPARATOR_UNIX;
        } else {
            strOooO0OO = "permitted:\n";
        }
        if (this.zzWpM != null) {
            StringBuilder sbOooO0OO = C22218Oooo.OooO0OO(C21111o0ooOoO.OooO0Oo(strOooO0OO, "DNS:\n"));
            sbOooO0OO.append(this.zzWpM.toString());
            sbOooO0OO.append(IOUtils.LINE_SEPARATOR_UNIX);
            strOooO0OO = sbOooO0OO.toString();
        }
        if (this.zzWpL != null) {
            StringBuilder sbOooO0OO2 = C22218Oooo.OooO0OO(C21111o0ooOoO.OooO0Oo(strOooO0OO, "Email:\n"));
            sbOooO0OO2.append(this.zzWpL.toString());
            sbOooO0OO2.append(IOUtils.LINE_SEPARATOR_UNIX);
            strOooO0OO = sbOooO0OO2.toString();
        }
        if (this.zzWpK != null) {
            StringBuilder sbOooO0OO3 = C22218Oooo.OooO0OO(C21111o0ooOoO.OooO0Oo(strOooO0OO, "URI:\n"));
            sbOooO0OO3.append(this.zzWpK.toString());
            sbOooO0OO3.append(IOUtils.LINE_SEPARATOR_UNIX);
            strOooO0OO = sbOooO0OO3.toString();
        }
        if (this.zzWpJ != null) {
            strOooO0OO = androidx.concurrent.futures.OooO00o.OooO0OO(C22218Oooo.OooO0OO(C21111o0ooOoO.OooO0Oo(strOooO0OO, "IP:\n")), zzZ(this.zzWpJ), IOUtils.LINE_SEPARATOR_UNIX);
        }
        if (this.zzWpI != null) {
            strOooO0OO = androidx.concurrent.futures.OooO00o.OooO0OO(C22218Oooo.OooO0OO(C21111o0ooOoO.OooO0Oo(strOooO0OO, "OtherName:\n")), zzY(this.zzWpI), IOUtils.LINE_SEPARATOR_UNIX);
        }
        String strOooO0Oo = C21111o0ooOoO.OooO0Oo(strOooO0OO, "excluded:\n");
        if (!this.zzWpT.isEmpty()) {
            StringBuilder sbOooO0OO4 = C22218Oooo.OooO0OO(C21111o0ooOoO.OooO0Oo(strOooO0Oo, "DN:\n"));
            sbOooO0OO4.append(this.zzWpT.toString());
            sbOooO0OO4.append(IOUtils.LINE_SEPARATOR_UNIX);
            strOooO0Oo = sbOooO0OO4.toString();
        }
        if (!this.zzWpS.isEmpty()) {
            StringBuilder sbOooO0OO5 = C22218Oooo.OooO0OO(C21111o0ooOoO.OooO0Oo(strOooO0Oo, "DNS:\n"));
            sbOooO0OO5.append(this.zzWpS.toString());
            sbOooO0OO5.append(IOUtils.LINE_SEPARATOR_UNIX);
            strOooO0Oo = sbOooO0OO5.toString();
        }
        if (!this.zzWpR.isEmpty()) {
            StringBuilder sbOooO0OO6 = C22218Oooo.OooO0OO(C21111o0ooOoO.OooO0Oo(strOooO0Oo, "Email:\n"));
            sbOooO0OO6.append(this.zzWpR.toString());
            sbOooO0OO6.append(IOUtils.LINE_SEPARATOR_UNIX);
            strOooO0Oo = sbOooO0OO6.toString();
        }
        if (!this.zzWpQ.isEmpty()) {
            StringBuilder sbOooO0OO7 = C22218Oooo.OooO0OO(C21111o0ooOoO.OooO0Oo(strOooO0Oo, "URI:\n"));
            sbOooO0OO7.append(this.zzWpQ.toString());
            sbOooO0OO7.append(IOUtils.LINE_SEPARATOR_UNIX);
            strOooO0Oo = sbOooO0OO7.toString();
        }
        if (!this.zzWpP.isEmpty()) {
            strOooO0Oo = androidx.concurrent.futures.OooO00o.OooO0OO(C22218Oooo.OooO0OO(C21111o0ooOoO.OooO0Oo(strOooO0Oo, "IP:\n")), zzZ(this.zzWpP), IOUtils.LINE_SEPARATOR_UNIX);
        }
        return !this.zzWpO.isEmpty() ? androidx.concurrent.futures.OooO00o.OooO0OO(C22218Oooo.OooO0OO(C21111o0ooOoO.OooO0Oo(strOooO0Oo, "OtherName:\n")), zzY(this.zzWpO), IOUtils.LINE_SEPARATOR_UNIX) : strOooO0Oo;
    }

    public final void zzY(zzZ7R zzz7r) throws zzZ7L {
        int iZzXKy = zzz7r.zzXKy();
        if (iZzXKy == 0) {
            zzX(this.zzWpO, zzZ7J.zzX2(zzz7r.zzXI1()));
            return;
        }
        if (iZzXKy == 1) {
            zzX(this.zzWpR, zzX(zzz7r));
            return;
        }
        if (iZzXKy == 2) {
            zzV(this.zzWpS, zzZC9.zzYt(zzz7r.zzXI1()).getString());
            return;
        }
        if (iZzXKy == 4) {
            zzV(zzZ8C.zzXn(zzz7r.zzXI1()));
            return;
        }
        if (iZzXKy == 6) {
            zzT(this.zzWpQ, zzZC9.zzYt(zzz7r.zzXI1()).getString());
        } else if (iZzXKy == 7) {
            zzX(this.zzWpP, zzZD9.zzYz(zzz7r.zzXI1()).zzXL5());
        } else {
            throw new IllegalStateException("Unknown tag encountered: " + zzz7r.zzXKy());
        }
    }

    public final void zzZ(zzZ7R zzz7r) throws zzZ7L {
        int iZzXKy = zzz7r.zzXKy();
        if (iZzXKy == 0) {
            zzY(this.zzWpI, zzZ7J.zzX2(zzz7r.zzXI1()));
            return;
        }
        if (iZzXKy == 1) {
            zzY(this.zzWpL, zzX(zzz7r));
            return;
        }
        if (iZzXKy == 2) {
            zzW(this.zzWpM, zzZC9.zzYt(zzz7r.zzXI1()).getString());
            return;
        }
        if (iZzXKy == 4) {
            zzW(zzZ8C.zzXn(zzz7r.zzXI1()));
            return;
        }
        if (iZzXKy == 6) {
            zzR(this.zzWpK, zzZC9.zzYt(zzz7r.zzXI1()).getString());
        } else if (iZzXKy == 7) {
            zzY(this.zzWpJ, zzZD9.zzYz(zzz7r.zzXI1()).zzXL5());
        } else {
            throw new IllegalStateException("Unknown tag encountered: " + zzz7r.zzXKy());
        }
    }

    private static void zzV(Set set, String str) throws zzZ7L {
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (zzXr(str, str2) || str.equalsIgnoreCase(str2)) {
                throw new zzZ7L("DNS is from an excluded subtree.");
            }
        }
    }

    private Set zzW(Set set, Set set2) {
        HashSet hashSet = new HashSet();
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            byte[] bArrZzXL5 = zzZD9.zzYz(((zzZ7P) it.next()).zzXHU().zzXI1()).zzXL5();
            if (set != null) {
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    hashSet.addAll(zzO((byte[]) it2.next(), bArrZzXL5));
                }
            } else if (bArrZzXL5 != null) {
                hashSet.add(bArrZzXL5);
            }
        }
        return hashSet;
    }

    private static Set zzV(Set set, Set set2) {
        HashSet hashSet = new HashSet();
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            String strZzX = zzX(((zzZ7P) it.next()).zzXHU());
            if (set != null) {
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    String str = (String) it2.next();
                    if (zzXr(str, strZzX)) {
                        hashSet.add(str);
                    } else if (zzXr(strZzX, str)) {
                        hashSet.add(strZzX);
                    }
                }
            } else if (strZzX != null) {
                hashSet.add(strZzX);
            }
        }
        return hashSet;
    }

    private static void zzW(Set set, String str) throws zzZ7L {
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (zzXr(str, str2) || str.equalsIgnoreCase(str2)) {
                return;
            }
        }
        if (str.length() != 0 || set.size() != 0) {
            throw new zzZ7L("DNS is not from a permitted subtree.");
        }
    }

    private Set zzU(Set set, Set set2) {
        HashSet hashSet = new HashSet();
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            String strZzX = zzX(((zzZ7P) it.next()).zzXHU());
            if (set != null) {
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    zzW((String) it2.next(), strZzX, hashSet);
                }
            } else if (strZzX != null) {
                hashSet.add(strZzX);
            }
        }
        return hashSet;
    }

    private Set zzX(Set set, Set set2) {
        HashSet hashSet = new HashSet();
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            String strZzX = zzX(((zzZ7P) it.next()).zzXHU());
            if (set != null) {
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    zzX(strZzX, (String) it2.next(), hashSet);
                }
            } else if (strZzX != null) {
                hashSet.add(strZzX);
            }
        }
        return hashSet;
    }

    private static boolean equals(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
            return zzYGU.zzp((byte[]) obj, (byte[]) obj2);
        }
        return obj.equals(obj2);
    }

    private static void zzW(String str, String str2, Set set) {
        if (str.indexOf(64) != -1) {
            String strSubstring = str.substring(str.indexOf(64) + 1);
            if (str2.indexOf(64) != -1) {
                if (str.equalsIgnoreCase(str2)) {
                    set.add(str);
                    return;
                }
                return;
            } else if (str2.startsWith(".")) {
                if (zzXr(strSubstring, str2)) {
                    set.add(str);
                    return;
                }
                return;
            } else {
                if (strSubstring.equalsIgnoreCase(str2)) {
                    set.add(str);
                    return;
                }
                return;
            }
        }
        if (str.startsWith(".")) {
            if (str2.indexOf(64) != -1) {
                if (zzXr(str2.substring(str.indexOf(64) + 1), str)) {
                    set.add(str2);
                    return;
                }
                return;
            } else {
                if (str2.startsWith(".")) {
                    if (!zzXr(str, str2) && !str.equalsIgnoreCase(str2)) {
                        if (zzXr(str2, str)) {
                            set.add(str2);
                            return;
                        }
                        return;
                    }
                    set.add(str);
                    return;
                }
                if (zzXr(str2, str)) {
                    set.add(str2);
                    return;
                }
                return;
            }
        }
        if (str2.indexOf(64) != -1) {
            if (str2.substring(str2.indexOf(64) + 1).equalsIgnoreCase(str)) {
                set.add(str2);
            }
        } else if (str2.startsWith(".")) {
            if (zzXr(str, str2)) {
                set.add(str);
            }
        } else if (str.equalsIgnoreCase(str2)) {
            set.add(str);
        }
    }

    public final void zzY(zzZ7P[] zzz7pArr) {
        HashMap map = new HashMap();
        for (int i = 0; i != zzz7pArr.length; i++) {
            zzZ7P zzz7p = zzz7pArr[i];
            Integer numValueOf = Integer.valueOf(zzz7p.zzXHU().zzXKy());
            if (map.get(numValueOf) == null) {
                map.put(numValueOf, new HashSet());
            }
            ((Set) map.get(numValueOf)).add(zzz7p);
        }
        for (Map.Entry entry : map.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if (iIntValue == 0) {
                this.zzWpI = zzY(this.zzWpI, (Set) entry.getValue());
            } else if (iIntValue == 1) {
                this.zzWpL = zzX(this.zzWpL, (Set) entry.getValue());
            } else if (iIntValue == 2) {
                this.zzWpM = zzV(this.zzWpM, (Set) entry.getValue());
            } else if (iIntValue == 4) {
                this.zzWpN = zzZ(this.zzWpN, (Set) entry.getValue());
            } else if (iIntValue == 6) {
                this.zzWpK = zzU(this.zzWpK, (Set) entry.getValue());
            } else if (iIntValue == 7) {
                this.zzWpJ = zzW(this.zzWpJ, (Set) entry.getValue());
            } else {
                throw new IllegalStateException(C21532OooOOo.OooO0OO(iIntValue, "Unknown tag encountered: "));
            }
        }
    }

    public final void zzZ(zzZ7P zzz7p) {
        zzZ7R zzz7rZzXHU = zzz7p.zzXHU();
        int iZzXKy = zzz7rZzXHU.zzXKy();
        if (iZzXKy == 0) {
            this.zzWpO = zzZ(this.zzWpO, zzZ7J.zzX2(zzz7rZzXHU.zzXI1()));
            return;
        }
        if (iZzXKy == 1) {
            this.zzWpR = zzZ(this.zzWpR, zzX(zzz7rZzXHU));
            return;
        }
        if (iZzXKy == 2) {
            this.zzWpS = zzU(this.zzWpS, zzX(zzz7rZzXHU));
            return;
        }
        if (iZzXKy == 4) {
            this.zzWpT = zzX(this.zzWpT, (zzZD4) zzz7rZzXHU.zzXI1().zzXL0());
            return;
        }
        if (iZzXKy == 6) {
            this.zzWpQ = zzS(this.zzWpQ, zzX(zzz7rZzXHU));
        } else if (iZzXKy == 7) {
            this.zzWpP = zzZ(this.zzWpP, zzZD9.zzYz(zzz7rZzXHU.zzXI1()).zzXL5());
        } else {
            throw new IllegalStateException("Unknown tag encountered: " + zzz7rZzXHU.zzXKy());
        }
    }

    private static int zzU(Collection collection) {
        int iHashCode;
        int i = 0;
        if (collection == null) {
            return 0;
        }
        for (Object obj : collection) {
            if (obj instanceof byte[]) {
                iHashCode = zzYGU.hashCode((byte[]) obj);
            } else {
                iHashCode = obj.hashCode();
            }
            i += iHashCode;
        }
        return i;
    }

    private static byte[][] zzX(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int length = bArr.length;
        byte[] bArr5 = new byte[length];
        byte[] bArr6 = new byte[length];
        byte[] bArr7 = new byte[length];
        byte[] bArr8 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr5[i] = (byte) (bArr[i] & bArr2[i]);
            byte b = bArr[i];
            byte b2 = bArr2[i];
            bArr6[i] = (byte) ((b & b2) | (~b2));
            bArr7[i] = (byte) (bArr3[i] & bArr4[i]);
            byte b3 = bArr3[i];
            byte b4 = bArr4[i];
            bArr8[i] = (byte) ((b3 & b4) | (~b4));
        }
        return new byte[][]{bArr5, bArr6, bArr7, bArr8};
    }

    private static void zzX(Set set, zzZ7J zzz7j) throws zzZ7L {
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (zzZ(zzz7j, zzZ7J.zzX2(it.next()))) {
                throw new zzZ7L("OtherName is from an excluded subtree.");
            }
        }
    }

    private void zzX(Set set, String str) throws zzZ7L {
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (zzXs(str, (String) it.next())) {
                throw new zzZ7L("Email address is from an excluded subtree.");
            }
        }
    }

    private static boolean zzZ(zzZD4 zzzd4, zzZD4 zzzd42) {
        if (zzzd42.size() <= 0 || zzzd42.size() > zzzd4.size()) {
            return false;
        }
        for (int size = zzzd42.size() - 1; size >= 0; size--) {
            if (!zzzd42.zzg6(size).equals(zzzd4.zzg6(size))) {
                return false;
            }
        }
        return true;
    }

    private static void zzX(Set set, byte[] bArr) throws zzZ7L {
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (zzL(bArr, (byte[]) it.next())) {
                throw new zzZ7L("IP is from an excluded subtree.");
            }
        }
    }

    private static void zzZ(Set set, zzZD4 zzzd4) throws zzZ7L {
        if (set == null) {
            return;
        }
        if (set.isEmpty() && zzzd4.size() == 0) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (zzZ(zzzd4, (zzZD4) it.next())) {
                return;
            }
        }
        throw new zzZ7L("Subject distinguished name is not from a permitted subtree");
    }

    private static void zzX(String str, String str2, Set set) {
        if (str.indexOf(64) != -1) {
            String strSubstring = str.substring(str.indexOf(64) + 1);
            if (str2.indexOf(64) != -1) {
                if (str.equalsIgnoreCase(str2)) {
                    set.add(str);
                    return;
                }
                return;
            } else if (str2.startsWith(".")) {
                if (zzXr(strSubstring, str2)) {
                    set.add(str);
                    return;
                }
                return;
            } else {
                if (strSubstring.equalsIgnoreCase(str2)) {
                    set.add(str);
                    return;
                }
                return;
            }
        }
        if (str.startsWith(".")) {
            if (str2.indexOf(64) != -1) {
                if (zzXr(str2.substring(str.indexOf(64) + 1), str)) {
                    set.add(str2);
                    return;
                }
                return;
            } else {
                if (str2.startsWith(".")) {
                    if (!zzXr(str, str2) && !str.equalsIgnoreCase(str2)) {
                        if (zzXr(str2, str)) {
                            set.add(str2);
                            return;
                        }
                        return;
                    }
                    set.add(str);
                    return;
                }
                if (zzXr(str2, str)) {
                    set.add(str2);
                    return;
                }
                return;
            }
        }
        if (str2.indexOf(64) != -1) {
            if (str2.substring(str2.indexOf(64) + 1).equalsIgnoreCase(str)) {
                set.add(str2);
            }
        } else if (str2.startsWith(".")) {
            if (zzXr(str, str2)) {
                set.add(str);
            }
        } else if (str.equalsIgnoreCase(str2)) {
            set.add(str);
        }
    }

    private static Set zzZ(Set set, Set set2) {
        HashSet hashSet = new HashSet();
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            zzZD4 zzzd4ZzYy = zzZD4.zzYy(((zzZ7P) it.next()).zzXHU().zzXI1().zzXL0());
            if (set != null) {
                Iterator it2 = set.iterator();
                while (it2.hasNext()) {
                    zzZD4 zzzd4 = (zzZD4) it2.next();
                    if (zzZ(zzzd4ZzYy, zzzd4)) {
                        hashSet.add(zzzd4ZzYy);
                    } else if (zzZ(zzzd4, zzzd4ZzYy)) {
                        hashSet.add(zzzd4);
                    }
                }
            } else if (zzzd4ZzYy != null) {
                hashSet.add(zzzd4ZzYy);
            }
        }
        return hashSet;
    }

    private static void zzY(Set set, zzZD4 zzzd4) throws zzZ7L {
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (zzZ(zzzd4, (zzZD4) it.next())) {
                throw new zzZ7L("Subject distinguished name is from an excluded subtree");
            }
        }
    }

    private static Set zzY(Set set, Set set2) {
        HashSet hashSet = new HashSet(set);
        hashSet.retainAll(set2);
        return hashSet;
    }

    private void zzY(Set set, String str) throws zzZ7L {
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (zzXs(str, (String) it.next())) {
                return;
            }
        }
        if (str.length() != 0 || set.size() != 0) {
            throw new zzZ7L("Subject email address is not from a permitted subtree.");
        }
    }

    private static Set zzZ(Set set, zzZ7J zzz7j) {
        HashSet hashSet = new HashSet(set);
        hashSet.add(zzz7j);
        return hashSet;
    }

    private Set zzZ(Set set, String str) {
        if (set.isEmpty()) {
            if (str == null) {
                return set;
            }
            set.add(str);
            return set;
        }
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzZ((String) it.next(), str, hashSet);
        }
        return hashSet;
    }

    private static void zzY(Set set, zzZ7J zzz7j) throws zzZ7L {
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (zzZ(zzz7j, (zzZ7J) it.next())) {
                return;
            }
        }
        throw new zzZ7L("Subject OtherName is not from a permitted subtree.");
    }

    private static Set zzZ(Set set, byte[] bArr) {
        if (set.isEmpty()) {
            if (bArr == null) {
                return set;
            }
            set.add(bArr);
            return set;
        }
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.addAll(zzP((byte[]) it.next(), bArr));
        }
        return hashSet;
    }

    private static void zzY(Set set, byte[] bArr) throws zzZ7L {
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (zzL(bArr, (byte[]) it.next())) {
                return;
            }
        }
        if (bArr.length != 0 || set.size() != 0) {
            throw new zzZ7L("IP is not from a permitted subtree.");
        }
    }

    private static void zzY(String str, String str2, Set set) {
        if (str.indexOf(64) != -1) {
            String strSubstring = str.substring(str.indexOf(64) + 1);
            if (str2.indexOf(64) != -1) {
                if (str.equalsIgnoreCase(str2)) {
                    set.add(str);
                    return;
                } else {
                    set.add(str);
                    set.add(str2);
                    return;
                }
            }
            if (str2.startsWith(".")) {
                if (zzXr(strSubstring, str2)) {
                    set.add(str2);
                    return;
                } else {
                    set.add(str);
                    set.add(str2);
                    return;
                }
            }
            if (strSubstring.equalsIgnoreCase(str2)) {
                set.add(str2);
                return;
            } else {
                set.add(str);
                set.add(str2);
                return;
            }
        }
        if (str.startsWith(".")) {
            if (str2.indexOf(64) != -1) {
                if (zzXr(str2.substring(str.indexOf(64) + 1), str)) {
                    set.add(str);
                    return;
                } else {
                    set.add(str);
                    set.add(str2);
                    return;
                }
            }
            if (str2.startsWith(".")) {
                if (!zzXr(str, str2) && !str.equalsIgnoreCase(str2)) {
                    if (zzXr(str2, str)) {
                        set.add(str);
                        return;
                    } else {
                        set.add(str);
                        set.add(str2);
                        return;
                    }
                }
                set.add(str2);
                return;
            }
            if (zzXr(str2, str)) {
                set.add(str);
                return;
            } else {
                set.add(str);
                set.add(str2);
                return;
            }
        }
        if (str2.indexOf(64) != -1) {
            if (str2.substring(str.indexOf(64) + 1).equalsIgnoreCase(str)) {
                set.add(str);
                return;
            } else {
                set.add(str);
                set.add(str2);
                return;
            }
        }
        if (str2.startsWith(".")) {
            if (zzXr(str, str2)) {
                set.add(str2);
                return;
            } else {
                set.add(str);
                set.add(str2);
                return;
            }
        }
        if (str.equalsIgnoreCase(str2)) {
            set.add(str);
        } else {
            set.add(str);
            set.add(str2);
        }
    }

    private static boolean zzZ(zzZ7J zzz7j, zzZ7J zzz7j2) {
        return zzz7j2.equals(zzz7j);
    }

    private static void zzZ(String str, String str2, Set set) {
        if (str.indexOf(64) != -1) {
            String strSubstring = str.substring(str.indexOf(64) + 1);
            if (str2.indexOf(64) != -1) {
                if (str.equalsIgnoreCase(str2)) {
                    set.add(str);
                    return;
                } else {
                    set.add(str);
                    set.add(str2);
                    return;
                }
            }
            if (str2.startsWith(".")) {
                if (zzXr(strSubstring, str2)) {
                    set.add(str2);
                    return;
                } else {
                    set.add(str);
                    set.add(str2);
                    return;
                }
            }
            if (strSubstring.equalsIgnoreCase(str2)) {
                set.add(str2);
                return;
            } else {
                set.add(str);
                set.add(str2);
                return;
            }
        }
        if (str.startsWith(".")) {
            if (str2.indexOf(64) != -1) {
                if (zzXr(str2.substring(str.indexOf(64) + 1), str)) {
                    set.add(str);
                    return;
                } else {
                    set.add(str);
                    set.add(str2);
                    return;
                }
            }
            if (str2.startsWith(".")) {
                if (!zzXr(str, str2) && !str.equalsIgnoreCase(str2)) {
                    if (zzXr(str2, str)) {
                        set.add(str);
                        return;
                    } else {
                        set.add(str);
                        set.add(str2);
                        return;
                    }
                }
                set.add(str2);
                return;
            }
            if (zzXr(str2, str)) {
                set.add(str);
                return;
            } else {
                set.add(str);
                set.add(str2);
                return;
            }
        }
        if (str2.indexOf(64) != -1) {
            if (str2.substring(str.indexOf(64) + 1).equalsIgnoreCase(str)) {
                set.add(str);
                return;
            } else {
                set.add(str);
                set.add(str2);
                return;
            }
        }
        if (str2.startsWith(".")) {
            if (zzXr(str, str2)) {
                set.add(str2);
                return;
            } else {
                set.add(str);
                set.add(str2);
                return;
            }
        }
        if (str.equalsIgnoreCase(str2)) {
            set.add(str);
        } else {
            set.add(str);
            set.add(str2);
        }
    }

    private static String zzX(zzZ7R zzz7r) {
        return zzZC9.zzYt(zzz7r.zzXI1()).getString();
    }

    private static boolean zzY(Collection collection, Collection collection2) {
        if (collection == collection2) {
            return true;
        }
        if (collection == null || collection2 == null || collection.size() != collection2.size()) {
            return false;
        }
        for (Object obj : collection) {
            Iterator it = collection2.iterator();
            while (it.hasNext()) {
                if (equals(obj, it.next())) {
                    break;
                }
            }
            return false;
        }
        return true;
    }

    private static String zzZ(Set set) {
        StringBuilder sbOooO0OO = C22218Oooo.OooO0OO("[");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (sbOooO0OO.length() > 1) {
                sbOooO0OO.append(",");
            }
            sbOooO0OO.append(zzXl((byte[]) it.next()));
        }
        sbOooO0OO.append("]");
        return sbOooO0OO.toString();
    }

    private static String zzY(Set set) {
        StringBuilder sbOooO0OO = C22218Oooo.OooO0OO("[");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (sbOooO0OO.length() > 1) {
                sbOooO0OO.append(",");
            }
            zzZ7J zzz7jZzX2 = zzZ7J.zzX2(it.next());
            sbOooO0OO.append(zzz7jZzX2.zzXHM().getId());
            sbOooO0OO.append(C18241k5.f55433h);
            try {
                sbOooO0OO.append(zzYGC.zzVE(zzz7jZzX2.zzXIs().zzXL0().getEncoded()));
            } catch (IOException e) {
                sbOooO0OO.append(e.toString());
            }
        }
        sbOooO0OO.append("]");
        return sbOooO0OO.toString();
    }
}
