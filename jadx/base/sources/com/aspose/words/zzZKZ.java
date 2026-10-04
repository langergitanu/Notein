package com.aspose.words;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzZKZ {
    private byte[] zzV2;
    private com.aspose.words.internal.zzH7 zzYtR = com.aspose.words.internal.zzS1.zzYu(8);

    public static class zzZ implements Comparator<String> {
        private zzZ() {
        }

        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(String str, String str2) {
            return compare2(str, str2);
        }

        public /* synthetic */ zzZ(byte b) {
            this();
        }

        /* JADX INFO: renamed from: compare, reason: avoid collision after fix types in other method */
        private static int compare2(String str, String str2) {
            return com.aspose.words.internal.zzZKN.zzZJ(zzZKZ.zzL9(str), zzZKZ.zzL9(str2));
        }
    }

    public zzZKZ(com.aspose.words.internal.zzAA zzaa) throws Exception {
        zzS(zzaa);
        byte[] bArr = new byte[this.zzYtR.zzQI()];
        this.zzV2 = bArr;
        this.zzYtR.zzo(bArr);
    }

    private void append(String str) {
        byte[] bytes = com.aspose.words.internal.zzZO0.zzhU().getBytes(str);
        zzs(bytes, bytes.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzL9(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (Character.isLetterOrDigit(cCharAt) || cCharAt == '_') {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    private void zzS(com.aspose.words.internal.zzAA zzaa) throws Exception {
        zzs(zzaa.zzAC().toByteArray(), 16);
        byte b = 0;
        com.aspose.words.internal.zzZQH<Map.Entry> zzzqh = new com.aspose.words.internal.zzZQH(new zzZ(b));
        com.aspose.words.internal.zzZQH<Map.Entry> zzzqh2 = new com.aspose.words.internal.zzZQH(new zzZ(b));
        Iterator<Map.Entry<K, V>> it = zzaa.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            com.aspose.words.internal.zzZOR zzzor = (com.aspose.words.internal.zzZOR) com.aspose.words.internal.zzZKW.zzZ(entry.getValue(), com.aspose.words.internal.zzZOR.class);
            if (zzzor == null) {
                com.aspose.words.internal.zzAA zzaa2 = (com.aspose.words.internal.zzAA) com.aspose.words.internal.zzZKW.zzZ(entry.getValue(), com.aspose.words.internal.zzAA.class);
                if (zzaa2 == null) {
                    throw new IllegalStateException("Unknown object in memory storage.");
                }
                if (!"\u0006DataSpaces".equals(str) && !"\u0005Bagaaqy23kudbhchAaq5u2chNd".equals(str)) {
                    zzzqh2.zzB(str, zzaa2);
                }
            } else if (!"_signatures".equals(str) && !"\tDRMContent".equals(str)) {
                zzzqh.zzB(str, zzzor);
            }
        }
        for (Map.Entry entry2 : zzzqh) {
            append((String) entry2.getKey());
            com.aspose.words.internal.zzZOR zzzor2 = (com.aspose.words.internal.zzZOR) entry2.getValue();
            zzs(zzzor2.zziA(), (int) zzzor2.getLength());
        }
        for (Map.Entry entry3 : zzzqh2) {
            append((String) entry3.getKey());
            zzS((com.aspose.words.internal.zzAA) entry3.getValue());
        }
    }

    private void zzs(byte[] bArr, int i) {
        this.zzYtR.zzW(bArr, 0, i);
    }

    public final byte[] zzZ50() {
        return this.zzV2;
    }
}
