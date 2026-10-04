package com.aspose.words;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzZQA implements zzZA3 {
    private ArrayList<Node> zzYE3;
    private HashMap<FieldStart, FieldStart> zzYE4;
    private zzZB8 zzYE5;
    private Field zzYE6;

    public zzZQA(Field field) {
        this(field, null);
    }

    private static void zzU(FieldStart fieldStart) throws Exception {
        FormField formFieldZzZcg = fieldStart.zzZcg();
        if (formFieldZzZcg == null) {
            return;
        }
        DocumentBuilder documentBuilder = new DocumentBuilder(fieldStart.zzYBb());
        documentBuilder.moveTo(fieldStart);
        zzZPB.zzY(documentBuilder, formFieldZzZcg.getResult());
    }

    private void zzY(FieldStart fieldStart, FieldStart fieldStart2) throws Exception {
        fieldStart.zzYBb();
        fieldStart2.zzYBb();
        for (Run run : zzZPU.zzZ(fieldStart, this.zzYE6)) {
            zzZB8 zzzb8 = this.zzYE5;
            if (zzzb8 != null) {
                zzzb8.zzZw(run);
            }
            fieldStart2.zzYC(run);
        }
    }

    private void zzZ(FieldStart fieldStart, FieldStart fieldStart2) {
        FieldStart fieldStart3;
        if (zzZe0()) {
            fieldStart3 = (FieldStart) com.aspose.words.internal.zzQW.zzZ(this.zzYE4, fieldStart);
        } else {
            this.zzYE4 = new HashMap<>();
            fieldStart3 = null;
        }
        HashMap<FieldStart, FieldStart> map = this.zzYE4;
        if (fieldStart3 != null) {
            fieldStart = fieldStart3;
        }
        map.put(fieldStart2, fieldStart);
    }

    private void zzZP(Node node) {
        if (!zzZe1()) {
            this.zzYE3 = new ArrayList<>();
        }
        com.aspose.words.internal.zzZQG.zzZ(this.zzYE3, node);
    }

    private boolean zzZe0() {
        return this.zzYE4 != null;
    }

    private boolean zzZe1() {
        return this.zzYE3 != null;
    }

    private void zzZe2() throws Exception {
        if (zzZe0()) {
            for (Map.Entry<FieldStart, FieldStart> entry : this.zzYE4.entrySet()) {
                FieldStart key = entry.getKey();
                if (!key.isRemoved()) {
                    FieldStart value = entry.getValue();
                    key.getFieldType();
                    zzY(value, key);
                }
            }
        }
    }

    private void zzZe3() throws Exception {
        if (zzZe1()) {
            Iterator<Node> it = this.zzYE3.iterator();
            while (it.hasNext()) {
                FieldStart fieldStart = (FieldStart) it.next();
                if (!fieldStart.isRemoved()) {
                    fieldStart.getFieldType();
                    zzU(fieldStart);
                }
            }
        }
    }

    @Override // com.aspose.words.zzZA5
    public final void zzW(Node node, Node node2) {
        if (node.getNodeType() != 22) {
            return;
        }
        FieldStart fieldStart = (FieldStart) node;
        if (fieldStart.isDeleteRevision()) {
            return;
        }
        if (fieldStart.getFieldType() != 83) {
            if (zzZPU.zzD9(fieldStart.getFieldType())) {
                zzZ(fieldStart, (FieldStart) node2);
            }
        } else if (this.zzYE6.getType() != 13) {
            zzZP(node2);
        }
    }

    public zzZQA(Field field, zzZB8 zzzb8) {
        this.zzYE6 = field;
        this.zzYE5 = zzzb8;
    }

    @Override // com.aspose.words.zzZA3
    public final void zzZ(zzYWB zzywb, zzYWB zzywb2) throws Exception {
        zzZe3();
        zzZe2();
    }
}
