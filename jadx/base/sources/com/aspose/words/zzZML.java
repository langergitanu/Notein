package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZML {
    public static String zzAU(int i) {
        if (i == 0) {
            return "TEXTINPUT";
        }
        if (i == 1) {
            return "CHECKBOX";
        }
        if (i == 2) {
            return "DROPDOWN";
        }
        throw new IllegalArgumentException("Unknown FormFieldType value, please update FormFieldTypeEnum.ToUpperString().\r\nParameter name: enumValue");
    }
}
