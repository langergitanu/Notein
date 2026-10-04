package com.aspose.words;

import com.aspose.words.ref.Ref;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class FieldBibliography extends Field implements zzZBA {
    private static com.aspose.words.internal.zz7I zzYGk = new com.aspose.words.internal.zz7I(-1);
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\l", "\\f", "\\m");

    private com.aspose.words.internal.zzZOP zzI(Iterable<Source> iterable) throws Exception {
        return new zzYO("Bibliography", zzZR5.zzMm(zzZg6())).zzS(iterable).zz9S();
    }

    private Collection<Source> zzV(Map<String, Source> map) {
        ArrayList arrayList = new ArrayList();
        com.aspose.words.internal.zz7I zz7iZzZg5 = zzZg5();
        for (Source source : map.values()) {
            if (zzZ(source, zz7iZzZg5)) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<Source>) arrayList, source);
            }
        }
        return arrayList;
    }

    private Collection<Source> zzW(Map<String, Source> map) {
        Iterable<String> iterableZzZg4 = zzZg4();
        return iterableZzZg4 != null ? zzZ(map, iterableZzZg4) : zzV(map);
    }

    private void zzX(String str, Document document) throws Exception {
        com.aspose.words.internal.zzZOY zzzoyZzZbn = zzZgn().zzZbn();
        try {
            DocumentBuilder documentBuilder = new DocumentBuilder(document);
            documentBuilder.moveTo(getEnd());
            documentBuilder.insertHtml(str, true);
        } finally {
            zzzoyZzZbn.dispose();
        }
    }

    private static String zzZ(com.aspose.words.internal.zzZOP zzzop, Bibliography bibliography) throws Exception {
        com.aspose.words.internal.zzZOP zzzopZzZR = bibliography.zzZR(zzzop);
        if (zzzopZzZR == null) {
            return zzzopZzZR != null ? null : null;
        }
        try {
            com.aspose.words.internal.zzZOO zzzoo = new com.aspose.words.internal.zzZOO(zzzopZzZR);
            try {
                return zzzoo.zziv();
            } finally {
                zzzoo.close();
            }
        } finally {
            zzzopZzZR.close();
        }
    }

    private Iterable<String> zzZg4() {
        if (!zzZgq().zzMj("\\m")) {
            return null;
        }
        ArrayList<String> arrayListZzMd = zzZgq().zzMd("\\m");
        if (arrayListZzMd.size() <= 10) {
            return arrayListZzMd;
        }
        String[] strArr = new String[10];
        for (int i = 0; i < 10; i++) {
            strArr[i] = arrayListZzMd.get(i);
        }
        return com.aspose.words.internal.zzZKV.zzZY(strArr);
    }

    private com.aspose.words.internal.zz7I zzZg5() {
        if (!zzZgq().zzMj("\\f")) {
            return com.aspose.words.internal.zz7I.zznT;
        }
        String filterLanguageId = getFilterLanguageId();
        return com.aspose.words.internal.zzZKN.equals(filterLanguageId, "") ? zzYGk : com.aspose.words.internal.zzZKN.zzU3(filterLanguageId) ? com.aspose.words.internal.zz7J.zzUA(zzZR5.zzZg3()) : com.aspose.words.internal.zz7J.zzUA(zzZR5.zzMm(filterLanguageId));
    }

    private String zzZg6() {
        String filterLanguageId = getFilterLanguageId();
        if (!com.aspose.words.internal.zzZKN.zzU3(filterLanguageId)) {
            return filterLanguageId;
        }
        String formatLanguageId = getFormatLanguageId();
        if (com.aspose.words.internal.zzZKN.zzU3(formatLanguageId)) {
            return null;
        }
        return formatLanguageId;
    }

    public String getFilterLanguageId() {
        return zzZgq().zzt("\\f", false);
    }

    public String getFormatLanguageId() {
        return zzZgq().zzt("\\l", false);
    }

    public String getSourceTag() {
        return zzZgq().zzt("\\m", false);
    }

    @Override // com.aspose.words.zzZBA
    @ReservedForInternalUse
    @Deprecated
    public int getSwitchType(String str) {
        int iZzTP = zzUR.zzTP(str);
        return (iZzTP == 0 || iZzTP == 1 || iZzTP == 2) ? 2 : 0;
    }

    public void setFilterLanguageId(String str) throws Exception {
        zzZgq().zzZf("\\f", str);
    }

    public void setFormatLanguageId(String str) throws Exception {
        zzZgq().zzZf("\\l", str);
    }

    public void setSourceTag(String str) throws Exception {
        zzZgq().zzZf("\\m", str);
    }

    @Override // com.aspose.words.Field
    public final zzZP6 zzZgM() throws Exception {
        Document documentZzYBb = getStart().zzYBb();
        Bibliography bibliography = documentZzYBb.getBibliography();
        if (!bibliography.zz9V()) {
            return null;
        }
        if (bibliography.zz9U().size() == 0) {
            return new zzZP2(this, "There are no sources in the current document.");
        }
        Collection<Source> collectionZzW = zzW(bibliography.zz9U());
        if (collectionZzW.size() == 0) {
            return new zzZP2(this, "There are no sources in the current document.");
        }
        com.aspose.words.internal.zzZOP zzzopZzI = zzI(collectionZzW);
        try {
            if (zzzopZzI == null) {
                return new zzZP2(this, "There are no sources in the current document.");
            }
            String strZzZ = zzZ(zzzopZzI, bibliography);
            zzzopZzI.close();
            if (strZzZ == null) {
                return new zzZP2(this, "There are no sources in the current document.");
            }
            zzX(strZzZ, documentZzYBb);
            return new zzZP4(this);
        } finally {
            if (zzzopZzI != null) {
                zzzopZzI.close();
            }
        }
    }

    private static Collection<Source> zzZ(Map<String, Source> map, Iterable<String> iterable) {
        ArrayList arrayList = new ArrayList();
        for (String str : iterable) {
            Ref ref = new Ref(null);
            boolean zZzZ = com.aspose.words.internal.zzZQF.zzZ((Map<String, V>) map, str, ref);
            Source source = (Source) ref.get();
            if (zZzZ) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<Source>) arrayList, source);
            }
        }
        return arrayList;
    }

    private static boolean zzZ(Source source, com.aspose.words.internal.zz7I zz7i) {
        return !zz7i.hasValue() || source.zzY7F() == zz7i.getValue();
    }
}
