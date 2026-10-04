package com.aspose.words;

import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzZPU {

    public static class zzZ implements zzZAZ {
        private FieldStart zzYCO;
        private zzZPW zzYCP;
        private Field zzYE6;
        private Document zzZEY;

        public zzZ(zzZPW zzzpw, FieldStart fieldStart, Field field, Document document) {
            this.zzYCP = zzzpw;
            this.zzYCO = fieldStart;
            this.zzYE6 = field;
            this.zzZEY = document;
        }

        public final Document getDocument() {
            return this.zzZEY;
        }

        @Override // com.aspose.words.zzZAZ
        public final zzYEF zzZYh() {
            zzYEF zzyefZzZ;
            if (zzZPU.zzD9(this.zzYE6.getType())) {
                zzyefZzZ = zzZ7R.zzZ(this.zzYCO, 1);
            } else {
                zzyefZzZ = (zzYEF) this.zzYE6.getStart().zzZYh().zzbn();
                if (this.zzYE6.getType() != 13) {
                    this.zzYCO.zzZYh().zzY(zzyefZzZ);
                }
            }
            if (this.zzYCP.zzZcW()) {
                this.zzYCP.zzZcX().zzY(zzyefZzZ);
            }
            return zzyefZzZ;
        }

        public final zzZPW zzZcO() {
            return this.zzYCP;
        }

        public final boolean zzZcP() {
            if (!this.zzZEY.getFieldOptions().isBidiTextSupportedOnUpdate()) {
                return false;
            }
            int type = this.zzYE6.getType();
            if (type != 0) {
                if (type == 13) {
                    return false;
                }
                if (type != 2 && type != 3) {
                    if (zzZPU.zzD9(this.zzYE6.getType())) {
                        return this.zzYE6.getStart().getParentParagraph().getParagraphFormat().getBidi();
                    }
                    throw new IllegalStateException("Invalid reference field type for the operation.");
                }
            }
            return ((Boolean) this.zzYCO.zzZYh().zzYdM().zzY(this.zzYCO, StyleIdentifier.BIBLIOGRAPHY)).booleanValue();
        }
    }

    public static boolean zzD9(int i) {
        if (i == 90) {
            return true;
        }
        switch (i) {
            case 52:
            case 53:
            case 54:
                return true;
            default:
                return false;
        }
    }

    public static zzZ47 zzI(Field field) {
        zzZ zzzZzY = zzY(field.getStart(), field);
        if (zzzZzY == null) {
            return null;
        }
        return zzzZzY.zzZcO().zzZcV();
    }

    public static zzYWB zzJ(Field field) throws Exception {
        zzZ zzzZzY = zzY(field.getStart(), field);
        if (zzzZzY == null) {
            return null;
        }
        return zzZPB.zzY(zzzZzY.zzZcO().getText(), zzzZzY.getDocument(), zzzZzY, zzzZzY.zzZcP());
    }

    public static ArrayList<Run> zzK(Field field) throws Exception {
        return zzZ(field.getStart(), field);
    }

    public static char zzLO(String str) {
        return com.aspose.words.internal.zzZYD.zzXk(str) ? str.charAt(0) : FilenameUtils.EXTENSION_SEPARATOR;
    }

    private static zzZ zzY(FieldStart fieldStart, Field field) {
        field.getType();
        field.getStart();
        Document documentZzYBb = field.getStart().zzYBb();
        fieldStart.zzYBb();
        zzZPW zzzpwZzZ = documentZzYBb.zzZ(fieldStart);
        if (zzzpwZzZ == null || !zzzpwZzZ.hasText()) {
            return null;
        }
        return new zzZ(zzzpwZzZ, fieldStart, field, documentZzYBb);
    }

    public static ArrayList<Run> zzZ(FieldStart fieldStart, Field field) throws Exception {
        zzZ zzzZzY = zzY(fieldStart, field);
        return zzzZzY == null ? new ArrayList<>() : zzZPB.zzZ(zzzZzY.zzZcO().getText(), zzzZzY.getDocument(), zzzZzY, zzzZzY.zzZcP());
    }
}
