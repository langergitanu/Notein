package com.aspose.words;

import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
final class zzUV implements zzZD0 {
    private HashMap<String, com.aspose.words.internal.zzPV> zzZvf = new HashMap<>();
    private zzZ72 zzZvg;

    public zzUV(zzZ72 zzz72) {
        this.zzZvg = zzz72;
    }

    private com.aspose.words.internal.zzPV zzSX(String str) {
        if (com.aspose.words.internal.zzZKN.zzU3(str)) {
            return zzYJB.zzXBt;
        }
        if (this.zzZvf.containsKey(str)) {
            return this.zzZvf.get(str);
        }
        com.aspose.words.internal.zzPV zzpvZzZP = zzYJB.zzZP(zzYJB.zzpw(this.zzZvf.size()));
        this.zzZvf.put(str, zzpvZzZP);
        return zzpvZzZP;
    }

    private static com.aspose.words.internal.zzZQ4 zzW(com.aspose.words.internal.zzZZQ zzzzq) {
        if (zzzzq == null || zzzzq.getCount() == 0) {
            return com.aspose.words.internal.zzZQ4.zz2T;
        }
        com.aspose.words.internal.zzZQ4 zzzq4ZzT7 = zzzzq.zzT7(0);
        for (int i = 1; i < zzzzq.getCount(); i++) {
            zzzq4ZzT7 = com.aspose.words.internal.zzZQ4.zzT(zzzq4ZzT7, zzzzq.zzT7(i));
        }
        return zzzq4ZzT7;
    }

    private static String zzYm(int i, int i2) {
        return i2 == -1 ? "" : com.aspose.words.internal.zzZKN.format("{0}-{1}", Integer.valueOf(i), Integer.valueOf(i2));
    }

    @Override // com.aspose.words.zzZD0
    public final void zzY(zzZ6P zzz6p, zzZ71 zzz71) throws Exception {
        int index = ((zzYN8) zzz6p.zzYgm).getIndex();
        for (zzZ6X zzz6x : zzz6p.zzYSI()) {
            zzz6x.zzYTC();
            com.aspose.words.internal.zzZZQ zzzzqZzS = zzz6x.zzS(zzz6p);
            String strZzYm = zzYm(index, zzz6x.zzYTC().zzY61().zzY5Y().getId());
            String strZzYm2 = zzYm(index, zzz6x.zzYTC().zzY61().zzY5Y().getParentId());
            String author = zzz6x.zzYTC().zzY61().zzY5Y().getAuthor();
            com.aspose.words.internal.zz8 zz8Var = new com.aspose.words.internal.zz8(zzW(zzzzqZzS), zzzzqZzS, author, zzz6x.zzYTC().zzY61().zzY5Y().zzZZQ(), strZzYm, strZzYm2, zzSX(author), zzz6x.zzYTC().zzY61().zzY5Y().zzZZT());
            com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
            zzg.zzZ(zz8Var);
            this.zzZvg.zzYTU().zzZ(zz8Var);
            this.zzZvg.zzYTV().zzS(zzg);
        }
    }

    @Override // com.aspose.words.zzZD0
    public final void zzZ(zzZ6P zzz6p, zzZ71 zzz71) {
    }
}
