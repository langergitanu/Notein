package com.aspose.words;

import java.util.Date;

/* JADX INFO: loaded from: classes6.dex */
public class DocumentProperty implements Cloneable {
    private String mName;
    private Object zzth;
    private String zzYQY = "";
    private Object zzYQX = null;

    public DocumentProperty(String str, Object obj) {
        com.aspose.words.internal.zzZ4.zzU(str, "name");
        this.mName = str;
        setValue(obj);
    }

    public static Object zzFI(int i) {
        switch (i) {
            case 0:
                return Boolean.FALSE;
            case 1:
                return com.aspose.words.internal.zzZQ9.zz35;
            case 2:
                return Double.valueOf(0.0d);
            case 3:
                return 0;
            case 4:
                return "";
            case 5:
                return com.aspose.words.internal.zzZ1.zzXV;
            case 6:
                return com.aspose.words.internal.zzZ1.zzXU;
            case 7:
                return com.aspose.words.internal.zzZ1.zzXW;
            case 8:
                return null;
            default:
                throw new IllegalStateException("Unknown property type.");
        }
    }

    public static int zzZz(Object obj) {
        if (obj instanceof String) {
            return 4;
        }
        if (obj instanceof Boolean) {
            return 0;
        }
        if (obj instanceof com.aspose.words.internal.zzZQ9) {
            return 1;
        }
        boolean z = obj instanceof Integer;
        if (z || z) {
            return 3;
        }
        if (obj instanceof Double) {
            return 2;
        }
        if (obj instanceof String[]) {
            return 5;
        }
        if (obj instanceof Object[]) {
            return 6;
        }
        return obj instanceof byte[] ? 7 : 8;
    }

    public String getLinkSource() {
        return this.zzYQY;
    }

    public String getName() {
        return this.mName;
    }

    public int getType() {
        return zzZz(zzZol());
    }

    public Object getValue() {
        Object objZzZol = zzZol();
        if (objZzZol instanceof com.aspose.words.internal.zzZQ9) {
            return ((com.aspose.words.internal.zzZQ9) objZzZol).zzkH();
        }
        if (getType() != 4) {
            return objZzZol;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            String str = (String) objZzZol;
            if (i >= str.length()) {
                return sb.toString();
            }
            char cCharAt = str.charAt(i);
            if (cCharAt <= '\b') {
                com.aspose.words.internal.zzZNH.zzZ(sb, "_x{0:X4}_", Integer.valueOf(cCharAt));
            } else {
                sb.append(cCharAt);
            }
            i++;
        }
    }

    public boolean isLinkToContent() {
        return com.aspose.words.internal.zzZYD.zzXk(this.zzYQY);
    }

    public Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public void setValue(Object obj) {
        if (obj instanceof Date) {
            obj = com.aspose.words.internal.zzZQ9.zzZ((Date) obj);
        }
        zzZA(obj);
    }

    public boolean toBool() {
        return ((Boolean) zzZol()).booleanValue();
    }

    public byte[] toByteArray() {
        return (byte[]) zzZol();
    }

    public Date toDateTime() {
        return com.aspose.words.internal.zzZQ9.zzJ((com.aspose.words.internal.zzZQ9) zzZol());
    }

    public double toDouble() {
        return ((Double) zzZol()).doubleValue();
    }

    public int toInt() {
        return ((Integer) zzZol()).intValue();
    }

    public String toString() {
        int type = getType();
        return type != 0 ? type != 1 ? type != 2 ? zzZol().toString() : com.aspose.words.internal.zzJB.zzZZ(((Double) zzZol()).doubleValue()) : ((com.aspose.words.internal.zzZQ9) zzZol()).zzkG() : ((Boolean) zzZol()).booleanValue() ? "Y" : "N";
    }

    public final void zzFJ(int i) {
        zzZA(Integer.valueOf(i));
    }

    public final void zzO1(String str) {
        zzZA(str);
    }

    public final void zzO2(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "value");
        this.zzYQY = str;
    }

    public final void zzWw(boolean z) {
        zzZA(Boolean.valueOf(z));
    }

    public final void zzZA(Object obj) {
        com.aspose.words.internal.zzZ4.zzY(obj, "value");
        if (zzZz(obj) == 8) {
            throw new IllegalArgumentException("The type of the value is not supported for a document property value.");
        }
        this.zzth = obj;
        this.zzYQX = null;
    }

    public final void zzZB(Object obj) {
        this.zzYQX = obj;
    }

    public final DocumentProperty zzZoi() {
        return (DocumentProperty) memberwiseClone();
    }

    public final com.aspose.words.internal.zzZQ9 zzZoj() {
        return (com.aspose.words.internal.zzZQ9) zzZol();
    }

    public final String zzZok() {
        return this.zzYQY;
    }

    public final Object zzZol() {
        Object obj = this.zzYQX;
        return obj == null ? this.zzth : obj;
    }

    public final Object zzZom() {
        return this.zzYQX;
    }
}
