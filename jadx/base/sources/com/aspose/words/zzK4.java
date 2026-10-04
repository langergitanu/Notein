package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
class zzK4 implements zzZBC {
    private ArrayList<Paragraph> zzZjr = new ArrayList<>();
    private ArrayList<Field> zzZjq = new ArrayList<>();

    public boolean zzO(Paragraph paragraph) {
        return (paragraph.getChild(9, 0, true) == null && paragraph.getChild(10, 0, true) == null) ? false : true;
    }

    @Override // com.aspose.words.zzZBC
    public final boolean zzP(Paragraph paragraph) {
        if (zzO(paragraph)) {
            this.zzZjr.add(paragraph);
            return false;
        }
        paragraph.remove();
        return true;
    }

    public boolean zzX(zzZOY zzzoy) {
        return false;
    }

    public boolean zzY(zzZOY zzzoy) throws Exception {
        if (zzX(zzzoy)) {
            zzY(zzzoy.getField());
            return false;
        }
        zzZPJ.zzB(zzzoy.getField());
        return true;
    }

    @Override // com.aspose.words.zzZBC
    public final boolean zzZ(zzZOY zzzoy) throws Exception {
        return zzY(zzzoy);
    }

    @Override // com.aspose.words.zzZBC
    public final void zzZTn() throws Exception {
        Iterator<Field> it = this.zzZjq.iterator();
        while (it.hasNext()) {
            zzZPJ.zzB(it.next());
        }
        for (Paragraph paragraph : this.zzZjr) {
            if (paragraph.getParentNode() != null) {
                paragraph.remove();
            }
        }
    }

    public final void zzY(Field field) {
        this.zzZjq.add(field);
    }
}
