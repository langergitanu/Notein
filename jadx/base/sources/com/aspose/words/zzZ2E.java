package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ2E {
    public static int zz6(Field field) {
        if (field.getType() != 59) {
            return 0;
        }
        FieldMergeField fieldMergeField = (FieldMergeField) field;
        if (fieldMergeField.zzZd6()) {
            return 1;
        }
        return fieldMergeField.zzZd5() ? 2 : 0;
    }

    public static int zzvc(int i) {
        if (i == 0 || i == 1 || i == 2) {
            return 0;
        }
        if (i == 3) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        throw new IllegalArgumentException();
    }
}
