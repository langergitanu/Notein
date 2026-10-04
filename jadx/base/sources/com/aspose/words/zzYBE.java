package com.aspose.words;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzYBE {
    private static ArrayList<String> zzXIp;

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        zzXIp = arrayList;
        com.aspose.words.internal.zzZQG.zzZ(arrayList, "_signatures");
        com.aspose.words.internal.zzZQG.zzZ(zzXIp, "\tDRMContent");
        com.aspose.words.internal.zzZQG.zzZ(zzXIp, "\u0005SummaryInformation");
        com.aspose.words.internal.zzZQG.zzZ(zzXIp, "\u0005DocumentSummaryInformation");
    }

    private static String zzI(com.aspose.words.internal.zzAA zzaa) {
        String strZzWD;
        do {
            strZzWD = com.aspose.words.internal.zzJB.zzWD(com.aspose.words.internal.zzZZS.zzY(1234).hashCode() & 65535);
        } while (zzaa.containsKey(strZzWD));
        return strZzWD;
    }

    private static void zzY(com.aspose.words.internal.zzKD zzkd, DigitalSignature digitalSignature) throws Exception {
        com.aspose.words.internal.zzAA zzaaZzYr = zzkd.zzIf().zzYr("_xmlsignatures");
        if (zzaaZzYr == null) {
            zzaaZzYr = new com.aspose.words.internal.zzAA();
        }
        zzYJU zzyju = new zzYJU(new zzZZ9(zzkd));
        for (Map.Entry entry : zzkd.zzIf()) {
            String str = (String) entry.getKey();
            if ((entry.getValue() instanceof com.aspose.words.internal.zzZOP) && !zzXIp.contains(str)) {
                zzyju.zzY(new zzYJW(com.aspose.words.internal.zzZKN.format("/{0}", str), "application/octet-stream"));
            }
        }
        zzaaZzYr.zzZ(zzI(zzaaZzYr), new zzXYZ().zzY(zzyju, digitalSignature));
        zzkd.zzIf().set("_xmlsignatures", zzaaZzYr);
    }

    public static void zzZ(com.aspose.words.internal.zzKD zzkd, DigitalSignature digitalSignature, int i) throws Exception {
        if (i == 1) {
            zzZ(zzkd, digitalSignature);
        } else {
            if (i != 2) {
                throw new IllegalStateException("Invalid DigitalSignatureType value.");
            }
            zzY(zzkd, digitalSignature);
        }
    }

    private static void zzZ(com.aspose.words.internal.zzKD zzkd, DigitalSignature digitalSignature) throws Exception {
        com.aspose.words.internal.zzZOW zzzow = new com.aspose.words.internal.zzZOW(new com.aspose.words.internal.zzZOR(), com.aspose.words.internal.zzZO0.zzhU());
        zzWC.zzZ(zzzow, zzkd, digitalSignature);
        com.aspose.words.internal.zzZOR zzzorZzYt = zzkd.zzIf().zzYt("_signatures");
        if (zzzorZzYt != null) {
            zzzorZzYt.zzH(zzzorZzYt.getLength() - 4);
        } else {
            zzzorZzYt = new com.aspose.words.internal.zzZOR();
            for (int i = 0; i < 8; i++) {
                zzzorZzYt.writeByte((byte) 0);
            }
        }
        com.aspose.words.internal.zzZOW zzzow2 = new com.aspose.words.internal.zzZOW(zzzorZzYt, com.aspose.words.internal.zzZO0.zzhU());
        zzzow2.zzl((int) zzzow.zzq().getLength());
        zzzow2.writeBytes(((com.aspose.words.internal.zzZOR) zzzow.zzq()).zzWy());
        zzzow2.zzl(0);
        zzzow2.zzq().zzH(0L);
        zzkd.zzIf().set("_signatures", zzzow2.zzq());
    }
}
