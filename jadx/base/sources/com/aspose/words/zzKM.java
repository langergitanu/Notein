package com.aspose.words;

import OooOoo.C20593OooO0Oo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzKM {
    private static Map<String, String> zzRW(String str) {
        if (!com.aspose.words.internal.zzZYD.zzXk(str)) {
            return null;
        }
        com.aspose.words.internal.zzO zzo = new com.aspose.words.internal.zzO(C20593OooO0Oo.OooO0O0("<?xml version='1.0' encoding='utf-8' standalone='yes'?><map ", str, "/>"), (Map<String, String>) null);
        HashMap map = new HashMap();
        zzo.zzj();
        while (zzo.zzT(false)) {
            com.aspose.words.internal.zzZQF.zzY(map, zzo.getLocalName(), zzo.getValue());
        }
        return map;
    }

    public static ArrayList<org.w3c.dom.Node> zzZ(byte[] bArr, String str, String str2, String str3, zzXYV zzxyv) throws Exception {
        ArrayList<org.w3c.dom.Node> arrayList = new ArrayList<>();
        try {
            org.w3c.dom.Document documentZzZ = zzZ(bArr, str3, zzxyv);
            Map<String, String> mapZzRW = zzRW(str2);
            arrayList = com.aspose.words.internal.zzZSN.zzZ(documentZzZ.getDocumentElement(), str, mapZzRW);
            if (arrayList.size() == 0 && !com.aspose.words.internal.zzZKN.zzS(str, "/", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8)) {
                arrayList = com.aspose.words.internal.zzZSN.zzZ(documentZzZ.getDocumentElement(), com.aspose.words.internal.zzZKN.format("/{0}", str), mapZzRW);
            }
            if (zzl(arrayList)) {
                String key = "";
                Iterator<Map.Entry<String, String>> it = mapZzRW.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry<String, String> next = it.next();
                    if ("http://schemas.microsoft.com/office/infopath/2007/PartnerControls".equals(next.getValue())) {
                        key = next.getKey();
                        break;
                    }
                }
                return com.aspose.words.internal.zzZSN.zzZ(documentZzZ.getDocumentElement(), com.aspose.words.internal.zzZKN.format("{0}/{1}:TermInfo/{1}:TermName", str, key), mapZzRW);
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    public static boolean zzl(ArrayList<org.w3c.dom.Node> arrayList) {
        return arrayList.size() > 0 && "http://schemas.microsoft.com/office/infopath/2007/PartnerControls".equals(arrayList.get(0).getNamespaceURI());
    }

    public static String zzm(ArrayList<org.w3c.dom.Node> arrayList) {
        if (arrayList.size() == 0) {
            return "";
        }
        if (!zzl(arrayList)) {
            return arrayList.get(0).getTextContent();
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            com.aspose.words.internal.zzZNH.zzU(sb, arrayList.get(i).getTextContent());
            if (i != size - 1) {
                com.aspose.words.internal.zzZNH.zzU(sb, "; ");
            }
        }
        return sb.toString();
    }

    private static org.w3c.dom.Document zzZ(byte[] bArr, String str, zzXYV zzxyv) throws Exception {
        if (zzxyv != null && zzxyv.zzye(str)) {
            return zzxyv.zzyf(str);
        }
        org.w3c.dom.Document documentZzX = com.aspose.words.internal.zzZSN.zzX(new com.aspose.words.internal.zzZOR(bArr), true);
        if (zzxyv != null) {
            zzxyv.zzZ(str, documentZzX);
        }
        return documentZzX;
    }
}
