package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZQN extends zzYL4 {
    private zzU8 zzZGE;

    public zzZQN(zzU8 zzu8) {
        this.zzZGE = zzu8;
    }

    private static String zzS(Field field) throws Exception {
        zzZQD zzzqd = new zzZQD(true, 37, 88);
        zzzqd.zzV(new zzYWB(field.getStart(), field.getEnd()));
        StringBuilder sb = new StringBuilder();
        Iterator<Field> it = zzzqd.getFields().iterator();
        while (it.hasNext()) {
            com.aspose.words.internal.zzZNH.zzU(sb, it.next().getFieldCode());
        }
        return sb.toString();
    }

    private static boolean zzX(Field field, Field field2) {
        FormField formFieldZzZcg = field.getStart().zzZcg();
        FormField formFieldZzZcg2 = field2.getStart().zzZcg();
        if (com.aspose.words.internal.zzZ4.zzY(formFieldZzZcg, formFieldZzZcg2)) {
            return formFieldZzZcg.zzZ6O().zzV(formFieldZzZcg2.zzZ6O());
        }
        return true;
    }

    private static void zzY(Field field, Field field2, zzU8 zzu8) throws Exception {
        if (field.getSeparator() == null || field2.getSeparator() == null) {
            return;
        }
        zzYWB zzywb = new zzYWB(field.getStart(), false, field.getSeparator(), false);
        zzYWB zzywb2 = new zzYWB(field2.getStart(), false, field2.getSeparator(), false);
        zzU6.zzZZ2();
        zzY9D.zzZ(zzywb, zzywb2, zzu8);
        zzU6.zzZZ1();
    }

    @Override // com.aspose.words.zzYL4
    public final void zzZ(Node node, Node node2) throws Exception {
        Field field = ((FieldStart) node).getField();
        Field field2 = ((FieldStart) node2).getField();
        if (field == null || field2 == null) {
            return;
        }
        String fieldCode = field.getFieldCode();
        String fieldCode2 = field2.getFieldCode();
        zzU6.zzSU(com.aspose.words.internal.zzZKN.format("\n{{Field}} '{{{0}|{1}}}' -> '{{{2}|{3}}}'", zzU6.zzST(fieldCode), zzU6.zzST(field.getResult()), zzU6.zzST(fieldCode2), zzU6.zzST(field2.getResult())));
        if (this.zzZGE.zzZup.getIgnoreCaseChanges()) {
            fieldCode = fieldCode.toLowerCase();
        }
        if (this.zzZGE.zzZup.getIgnoreCaseChanges()) {
            fieldCode2 = fieldCode2.toLowerCase();
        }
        if (field.getType() == 88 && field2.getType() == 88) {
            zzY(field, field2, this.zzZGE);
        } else {
            if (!com.aspose.words.internal.zzZKN.equals(fieldCode, fieldCode2)) {
                zzZ(field, field2);
                return;
            }
            if (field.getType() == 13) {
                if (zzY(field, field2)) {
                    return;
                }
                zzZ(field, field2);
                return;
            } else if (zzZOO.zzCJ(field.getType()) && !zzX(field, field2)) {
                zzZ(field, field2);
                return;
            } else if (field.getType() == 33) {
                return;
            }
        }
        zzZ(field, field2, this.zzZGE);
    }

    private static boolean zzY(Field field, Field field2) throws Exception {
        if (com.aspose.words.internal.zzZ4.zzX(field.getSeparator(), field2.getSeparator())) {
            return true;
        }
        if (com.aspose.words.internal.zzZ4.zzY(field.getSeparator(), field2.getSeparator())) {
            return com.aspose.words.internal.zzZKN.equals(zzS(field), zzS(field2));
        }
        return false;
    }

    private void zzZ(Field field, Field field2) throws Exception {
        zzU4.zzZ(field, this.zzZGE);
        zzU4.zzZ(field2, zzU4.zzD(field.getEnd()), this.zzZGE);
    }

    private static void zzZ(Field field, Field field2, zzU8 zzu8) throws Exception {
        if (field.getSeparator() == null || field2.getSeparator() == null) {
            return;
        }
        zzYWB zzywb = new zzYWB(field.getSeparator(), false, field.getEnd(), true);
        zzYWB zzywb2 = new zzYWB(field2.getSeparator(), false, field2.getEnd(), true);
        zzU6.zzZZ2();
        zzY9D.zzZ(zzywb, zzywb2, zzu8);
        zzU6.zzZZ1();
    }
}
