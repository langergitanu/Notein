package com.aspose.words.internal;

import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.huawei.hms.network.embedded.C18385v2;
import com.orion.notein.domain.models.backup.BackupFile;
import com.orion.notein.domain.models.transactions.google.GoogleBillingConstants;

/* JADX INFO: loaded from: classes5.dex */
public final class zzDP {
    private static zzZYI zzvi;
    private static zzZYI zzvj;
    private static zzZYI zzvk;
    private static zzZYI zzvl;

    static {
        zzZYI zzzyi = new zzZYI();
        zzvj = zzzyi;
        zzzyi.add("X", 0);
        zzvj.add("Y", 1);
        zzvj.add("Z", 0);
        zzvj.add("F", 3);
        zzvj.add("S", 4);
        zzvj.add("OTx", 5);
        zzvj.add("OTy", 6);
        zzvj.add("OA", 7);
        zzvj.add("OE", 8);
        zzvj.add("OR", 9);
        zzvj.add("C", 10);
        zzvj.add("CR", 11);
        zzvj.add("CG", 13);
        zzvj.add("CB", 12);
        zzvj.add("CC", 14);
        zzvj.add("CM", 15);
        zzvj.add("CY", 16);
        zzvj.add("CK", 17);
        zzvj.add(C18385v2.f56336h, 18);
        zzvj.add("W", 19);
        zzvj.add("BW", 20);
        zzvj.add("BH", 21);
        zzvj.add("T", 22);
        zzZYI zzzyi2 = new zzZYI();
        zzvl = zzzyi2;
        zzzyi2.add("threshold", 0);
        zzvl.add("resolution", 1);
        zzvl.add("quantization", 2);
        zzvl.add("noise", 3);
        zzvl.add("accuracy", 4);
        zzvl.add("crossCoupling", 5);
        zzvl.add("skew", 6);
        zzvl.add("minBandwidth", 7);
        zzvl.add("peakRate", 8);
        zzvl.add("distortion", 9);
        zzZYI zzzyi3 = new zzZYI();
        zzvk = zzzyi3;
        zzzyi3.add("cm", 0);
        zzvk.add(BackupFile.EXTENSION_NOTEIN_FILE, 1);
        zzvk.add("s", 2);
        zzvk.add(TranslateLanguage.MALAY, 3);
        zzvk.add("lb", 4);
        zzvk.add("g", 5);
        zzvk.add("deg", 6);
        zzvk.add("rad", 7);
        zzvk.add(GoogleBillingConstants.GOOGLE_TAG_DEV, 8);
        zzZYI zzzyi4 = new zzZYI();
        zzvi = zzzyi4;
        zzzyi4.add("noOperation", 1);
        zzvi.add("copyPen", 0);
        zzvi.add("maskPen", 2);
        zzvi.add("black", 3);
        zzvi.add("maskNotPen", 4);
        zzvi.add("maskPenNot", 5);
        zzvi.add("mergeNotPen", 6);
        zzvi.add("mergePen", 7);
        zzvi.add("mergePenNot", 8);
        zzvi.add("not", 9);
        zzvi.add("notCopyPen", 10);
        zzvi.add("notMaskPen", 11);
        zzvi.add("notMergePen", 12);
        zzvi.add("notXOrPen", 13);
        zzvi.add("white", 14);
        zzvi.add("xOrPen", 15);
    }

    public static String zzY(zzO zzo, String str) {
        String strZzV = zzo.zzV(str, "");
        if (zzZKN.zzU3(strZzV) || strZzV.length() < 2 || strZzV.charAt(0) != '#') {
            throw new IllegalStateException();
        }
        return strZzV.substring(1);
    }

    public static int zzYF(String str) {
        return zzvi.get(str);
    }

    public static int zzYG(String str) {
        return zzvl.get(str);
    }

    public static int zzYH(String str) {
        return zzvk.get(str);
    }

    public static int zzYI(String str) {
        return zzvj.get(str);
    }

    public static void zzZ(String str, Object obj, Object obj2) {
        if (obj == obj2) {
            throw new IllegalArgumentException(com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("Specified argument was out of the range of valid values.\r\nParameter name: ", str));
        }
    }
}
