package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZP7 {
    private ArrayList<Field> zzYEO = new ArrayList<>();
    private boolean zzYPG;
    private Document zzZEY;

    private zzZP7(Document document) {
        this.zzZEY = document;
    }

    private void unlinkFields() throws Exception {
        for (Field field : this.zzYEO) {
            zzw(field);
            field.zzZgL();
        }
    }

    public static void zzZt(Node node) throws Exception {
        zzZP7 zzzp7 = new zzZP7(node.zzYBb());
        Iterator<Field> it = zzZQF.zzZS(node).iterator();
        while (it.hasNext()) {
            zzzp7.zzv(it.next());
        }
        zzzp7.unlinkFields();
    }

    private void zzv(Field field) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzYEO, field);
    }

    private void zzw(Field field) throws Exception {
        if (!this.zzYPG && zzZPU.zzD9(field.getType())) {
            this.zzZEY.updateListLabels();
            this.zzYPG = true;
        }
    }

    public static void zzx(Field field) throws Exception {
        zzZP7 zzzp7 = new zzZP7(field.getStart().zzYBb());
        zzzp7.zzv(field);
        zzzp7.unlinkFields();
    }
}
