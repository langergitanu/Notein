package com.aspose.words;

import com.aspose.words.ref.Ref;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZMG implements zzZA9 {
    private static com.aspose.words.internal.zzZNR zzYw8 = new com.aspose.words.internal.zzZNR("<<([^_]*)_(\\w+)_([^_]*)>>", 66);
    private zzZAF zzYHV;
    private zzZAT zzYw9;

    public zzZMG(zzZAT zzzat, zzZAF zzzaf) {
        this.zzYw9 = zzzat;
        this.zzYHV = zzzaf;
    }

    private String zzLk(String str) {
        for (OdsoFieldMapData odsoFieldMapData : this.zzYw9.iFormattableMergeField_FetchDocument().getMailMergeSettings().getOdso().getFieldMapDatas()) {
            if (com.aspose.words.internal.zzZYD.zzi(odsoFieldMapData.getMappedName(), str)) {
                return odsoFieldMapData.getName();
            }
        }
        return str;
    }

    private String zzX(com.aspose.words.internal.zzZNT zzznt) throws Exception {
        return this.zzYw9.getPlaceholderValue(this, new zzYZF(OooO0O0.OooO00o(zzznt, 2), OooO0O0.OooO00o(zzznt, 1), OooO0O0.OooO00o(zzznt, 3)));
    }

    private void zzZ6s() {
        MailMergeSettings mailMergeSettings = this.zzYw9.iFormattableMergeField_FetchDocument().getMailMergeSettings();
        if (mailMergeSettings.isEmpty()) {
            return;
        }
        mailMergeSettings.getOdso().getFieldMapDatas().zzYyg();
    }

    private com.aspose.words.internal.zzZNS zzZ6t() throws Exception {
        return zzYw8.zzUW(this.zzYw9.getMergeFormat() != null ? this.zzYw9.getMergeFormat() : "");
    }

    @Override // com.aspose.words.zzZA9
    public final String zzLj(String str) throws Exception {
        String str2 = this.zzYw9.getPlaceholdersToFieldsMap().get(str);
        if (str2 != null) {
            String strZzLk = zzLk(str2);
            Ref<Object> ref = new Ref<>(null);
            boolean value = this.zzYHV.getValue(strZzLk, ref);
            Object obj = ref.get();
            if (value) {
                return obj.toString();
            }
        }
        return "";
    }

    public final String[] zzZ6u() throws Exception {
        ArrayList arrayList = new ArrayList();
        Iterator<com.aspose.words.internal.zzZNT> it = zzZ6t().iterator();
        while (it.hasNext()) {
            String str = this.zzYw9.getPlaceholdersToFieldsMap().get(OooO0O0.OooO00o(it.next(), 2));
            if (!com.aspose.words.internal.zzZKN.zzU3(str)) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<String>) arrayList, zzLk(str));
            }
        }
        String[] strArr = new String[arrayList.size()];
        com.aspose.words.internal.zzZQG.zzY(arrayList, (Object[]) strArr);
        return strArr;
    }

    public final String zzZ6v() throws Exception {
        zzZ6s();
        ArrayList arrayList = new ArrayList();
        Iterator<com.aspose.words.internal.zzZNT> it = zzZ6t().iterator();
        while (it.hasNext()) {
            String strZzX = zzX(it.next());
            if (com.aspose.words.internal.zzZYD.zzXk(strZzX)) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<String>) arrayList, com.aspose.words.internal.zzZKN.zzTX(strZzX));
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arrayList.size(); i++) {
            com.aspose.words.internal.zzZNH.zzU(sb, (String) arrayList.get(i));
            if (i < arrayList.size() - 1) {
                sb.append(ControlChar.SPACE_CHAR);
            }
        }
        return sb.toString();
    }

    public final String zzZ6w() throws Exception {
        zzZ6s();
        StringBuilder sb = new StringBuilder();
        String mergeFormat = this.zzYw9.getMergeFormat();
        com.aspose.words.internal.zzZNS zzznsZzZ6t = zzZ6t();
        int i = 0;
        int length = 0;
        while (i < zzznsZzZ6t.getCount() && length < mergeFormat.length()) {
            com.aspose.words.internal.zzZNT zzzntZzQw = zzznsZzZ6t.zzQw(i);
            if (length < zzzntZzQw.getIndex()) {
                sb.append(mergeFormat.charAt(length));
                length++;
            } else {
                com.aspose.words.internal.zzZNH.zzU(sb, zzX(zzzntZzQw));
                length += zzzntZzQw.getLength();
                i++;
            }
        }
        return sb.toString();
    }
}
