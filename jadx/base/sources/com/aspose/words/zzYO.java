package com.aspose.words;

import com.aspose.words.ref.Ref;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzYO {
    private static HashMap<Integer, String> zzZD9 = zz9Q();
    private String mName;
    private int zzZDa;
    private ArrayList<Source> zzZDc = new ArrayList<>();
    private HashMap<String, String> zzZDb = new HashMap<>();

    public zzYO(String str, int i) {
        this.mName = str;
        this.zzZDa = i;
    }

    private static HashMap<Integer, String> zz9Q() {
        try {
            com.aspose.words.internal.zzZOP zzzopZzW = com.aspose.words.internal.zzZXR.zzW("Aspose.Words.Resources.Bibliography.BibliographyLocales.xml", Document.class);
            try {
                com.aspose.words.internal.zzO zzo = new com.aspose.words.internal.zzO(zzzopZzW, true);
                String localName = zzo.getLocalName();
                HashMap<Integer, String> map = new HashMap<>();
                if (zzo.zzQ(localName)) {
                    while (!zzo.zzP(localName)) {
                        zzo.getLocalName();
                        String strZzf = zzo.zzf();
                        com.aspose.words.internal.zzZQF.zzY(map, Integer.valueOf(zzTn(strZzf)), strZzf);
                    }
                }
                map.size();
                if (zzzopZzW != null) {
                    zzzopZzW.close();
                }
                return map;
            } catch (Throwable th) {
                if (zzzopZzW != null) {
                    zzzopZzW.close();
                }
                throw th;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private Iterable<Integer> zz9R() {
        ArrayList arrayList = new ArrayList();
        for (Source source : this.zzZDc) {
            if (source.zzY7E()) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<Integer>) arrayList, Integer.valueOf(source.zzY7F()));
            }
        }
        return arrayList;
    }

    private static int zzTn(String str) {
        return Integer.parseInt(new com.aspose.words.internal.zzO(str, (Map<String, String>) null).zzV("LCID", null));
    }

    public final com.aspose.words.internal.zzZOP zz9S() throws Exception {
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        com.aspose.words.internal.zzP zzp = new com.aspose.words.internal.zzP(zzzor, false);
        zzp.zzZ(this.mName);
        zzp.zzX("xmlns", "http://schemas.openxmlformats.org/officeDocument/2006/bibliography");
        zzZ(zzp, this.zzZDa, zz9R());
        Iterator<Map.Entry<String, String>> it = this.zzZDb.entrySet().iterator();
        while (it.hasNext()) {
            zzZ(zzp, it.next());
        }
        Iterator<Source> it2 = this.zzZDc.iterator();
        while (it2.hasNext()) {
            zzp.zzX(it2.next().zzY7I());
        }
        zzp.endDocument();
        zzzor.zzH(0L);
        return zzzor;
    }

    public final zzYO zzG(String str, boolean z) {
        if (z) {
            this.zzZDb.put(str, null);
        }
        return this;
    }

    public final zzYO zzS(Iterable<Source> iterable) {
        com.aspose.words.internal.zzZQG.zzZ((ArrayList) this.zzZDc, (Iterable) iterable);
        return this;
    }

    public final zzYO zzZ(Source source) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzZDc, source);
        return this;
    }

    public final zzYO zzZB(String str, String str2) {
        if (str2 != null) {
            this.zzZDb.put(str, str2);
        }
        return this;
    }

    private static void zzZ(com.aspose.words.internal.zzHW zzhw, Map.Entry<String, String> entry) {
        if (entry.getValue() != null) {
            zzhw.zzZ(entry.getKey(), entry.getValue());
        } else {
            zzhw.zzW(entry.getKey());
        }
    }

    private static void zzZ(com.aspose.words.internal.zzHW zzhw, int i, Iterable<Integer> iterable) throws Exception {
        zzhw.zzY("Locals");
        zzhw.zzZ("DefaultLCID", i);
        com.aspose.words.internal.zzIM zzim = new com.aspose.words.internal.zzIM(iterable);
        zzim.add(Integer.valueOf(i));
        Iterator it = zzim.iterator();
        while (it.hasNext()) {
            zzZ(zzhw, ((Integer) it.next()).intValue());
        }
        zzhw.zzp();
    }

    private static void zzZ(com.aspose.words.internal.zzHW zzhw, int i) throws Exception {
        Ref ref = new Ref(null);
        boolean zZzZ = com.aspose.words.internal.zzZQF.zzZ(zzZD9, Integer.valueOf(i), ref);
        String str = (String) ref.get();
        if (zZzZ) {
            zzhw.zzX(str);
        } else {
            com.aspose.words.internal.zzZKN.format("Unknown bibliography locale '{0}'", Integer.valueOf(i));
        }
    }
}
