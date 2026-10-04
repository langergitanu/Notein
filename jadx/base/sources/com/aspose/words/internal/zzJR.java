package com.aspose.words.internal;

import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes5.dex */
final class zzJR {
    private static final zzZHW zzUR = new zzZHW("SearchInfos");

    private static String zzY(zzK7 zzk7) {
        return zzZKN.format("{0}{1}", zzJB.zzWs((int) (((long) zzk7.zzIa()) & 4294967295L)), zzJB.zzWs((int) (((long) zzk7.zzI9()) & 4294967295L)));
    }

    public static void zzZ(zzZOP zzzop, Iterable<zzJU> iterable) throws Exception {
        zzP zzp = new zzP(zzzop, true);
        zzp.zzZ("FontSearchInfoCache");
        zzp.zzX("xmlns", "Aspose.Words");
        zzp.zzY("SearchInfos");
        for (zzJU zzju : iterable) {
            if (zzju.zzHL().getCacheKeyInternal() != null) {
                zzp.zzY("SearchInfo");
                zzp.zzX("FamilyName", zzju.getFontFamilyName());
                zzp.zzX("Style", zzJB.zzWF(zzju.getStyle()));
                zzp.zzX("FullName", zzju.zzHF());
                zzp.zzX("Panose", zzZYD.zzZ8(zzju.zzHD().getValues()));
                zzp.zzX("UnicodeRanges", zzZ(zzju.zzHC()));
                zzp.zzX("CodepageRanges", zzY(zzju.zzHB()));
                zzp.zzX("IsCff", zzJB.zz5(zzju.zzHG()));
                zzp.zzX("IsTtc", zzJB.zz5(zzju.zzHH()));
                zzp.zzX("Version", zzju.getVersion());
                zzp.zzX("FontSourceKey", zzju.zzHL().getCacheKeyInternal());
                zzZ(zzp, "FamilyNamesAllLanguages", zzju.zzHI());
                zzZ(zzp, "FullNamesAllLanguages", zzju.zzHJ());
                zzp.zzp();
            }
        }
        zzp.zzp();
        zzp.endDocument();
    }

    private static zzK7 zzZN(String str) {
        return str.length() != 16 ? zzK7.zzBC : new zzK7(zzJB.zzZe(str.substring(0, 8)), zzJB.zzZe(str.substring(8, 16)));
    }

    private static zzJG zzZO(String str) {
        return str.length() != 32 ? zzJG.zzzU : new zzJG(zzJB.zzZe(str.substring(0, 8)), zzJB.zzZe(str.substring(8, 16)), zzJB.zzZe(str.substring(16, 24)), zzJB.zzZe(str.substring(24, 32)));
    }

    public static Collection<zzJU> zzY(zzZOP zzzop, Iterable<zzJV> iterable) throws Exception {
        zzO zzo = new zzO(zzzop);
        while (zzo.zzQ("FontSearchInfoCache")) {
            if (zzUR.zzTP(zzo.getLocalName()) == 0) {
                return zzZ(zzo, iterable);
            }
        }
        return new ArrayList();
    }

    private static void zzZ(zzP zzp, String str, Collection<String> collection) {
        zzp.zzY(str);
        for (String str2 : collection) {
            zzp.zzY("Name");
            zzp.zzX("Value", str2);
            zzp.zzp();
        }
        zzp.zzp();
    }

    private static String zzZ(zzJG zzjg) {
        return zzZKN.format("{0}{1}{2}{3}", zzJB.zzWs((int) (((long) zzjg.zzIa()) & 4294967295L)), zzJB.zzWs((int) (((long) zzjg.zzI9()) & 4294967295L)), zzJB.zzWs((int) (((long) zzjg.zzHl()) & 4294967295L)), zzJB.zzWs((int) (4294967295L & ((long) zzjg.zzHk()))));
    }

    private static Collection<zzJU> zzZ(zzO zzo, Iterable<zzJV> iterable) {
        ArrayList arrayList = new ArrayList();
        while (zzo.zzQ("SearchInfos")) {
            if ("SearchInfo".equals(zzo.getLocalName())) {
                String strZzV = zzo.zzV("FamilyName", "");
                int iZzX = zzo.zzX("Style", 0);
                String strZzV2 = zzo.zzV("FullName", "");
                zzJW zzjw = new zzJW(zzZYD.zzXb(zzo.zzV("Panose", "")));
                zzJG zzjgZzZO = zzZO(zzo.zzV("UnicodeRanges", ""));
                zzK7 zzk7ZzZN = zzZN(zzo.zzV("CodepageRanges", ""));
                boolean zZzX = zzo.zzX("IsCff", false);
                boolean zZzX2 = zzo.zzX("IsTtc", false);
                String strZzV3 = zzo.zzV("Version", "");
                String strZzV4 = zzo.zzV("FontSourceKey", "");
                Collection<String> collectionZzZ = zzZ(zzo, "FamilyNamesAllLanguages");
                Collection<String> collectionZzZ2 = zzZ(zzo, "FullNamesAllLanguages");
                zzJV zzjvZzZ = zzZ(strZzV4, iterable);
                if (zzjvZzZ != null && zzZYD.zzXk(strZzV)) {
                    zzZQG.zzZ((ArrayList<zzJU>) arrayList, new zzJU(zzjvZzZ.zzHL(), strZzV2, strZzV, collectionZzZ2, collectionZzZ, iZzX, zZzX2, zZzX, zzjvZzZ.zzHK(), strZzV3, zzjw, zzjgZzZO, zzk7ZzZN));
                }
            }
        }
        return arrayList;
    }

    private static zzJV zzZ(String str, Iterable<zzJV> iterable) {
        for (zzJV zzjv : iterable) {
            if (zzZKN.equals(zzjv.zzHL().getCacheKeyInternal(), str)) {
                return zzjv;
            }
        }
        return null;
    }

    private static Collection<String> zzZ(zzO zzo, String str) {
        ArrayList arrayList = new ArrayList();
        while (zzo.zzQ(str)) {
            if ("Name".equals(zzo.getLocalName())) {
                String strZzV = zzo.zzV("Value", "");
                if (zzZYD.zzXk(strZzV)) {
                    zzZQG.zzZ((ArrayList<String>) arrayList, strZzV);
                }
            }
        }
        return arrayList;
    }
}
