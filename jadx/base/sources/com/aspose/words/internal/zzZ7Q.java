package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ7Q extends zzZDB {
    private final zzZ7R[] zzWq9;

    public zzZ7Q(zzZ7R zzz7r) {
        this.zzWq9 = new zzZ7R[]{zzz7r};
    }

    public static zzZ7Q zzQ(zzZCY zzzcy) {
        return zzX8(zzZD4.zzX(zzzcy, false));
    }

    public static zzZ7Q zzX8(Object obj) {
        if (obj instanceof zzZ7Q) {
            return (zzZ7Q) obj;
        }
        if (obj != null) {
            return new zzZ7Q(zzZD4.zzYy(obj));
        }
        return null;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("GeneralNames:");
        String strLineSeparator = zzYGI.lineSeparator();
        stringBuffer.append(strLineSeparator);
        for (int i = 0; i != this.zzWq9.length; i++) {
            stringBuffer.append("    ");
            stringBuffer.append(this.zzWq9[i]);
            stringBuffer.append(strLineSeparator);
        }
        return stringBuffer.toString();
    }

    public final zzZ7R[] zzXHV() {
        zzZ7R[] zzz7rArr = this.zzWq9;
        zzZ7R[] zzz7rArr2 = new zzZ7R[zzz7rArr.length];
        System.arraycopy(zzz7rArr, 0, zzz7rArr2, 0, zzz7rArr.length);
        return zzz7rArr2;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        return new zzZC2(this.zzWq9);
    }

    private zzZ7Q(zzZD4 zzzd4) {
        this.zzWq9 = new zzZ7R[zzzd4.size()];
        for (int i = 0; i != zzzd4.size(); i++) {
            this.zzWq9[i] = zzZ7R.zzX9(zzzd4.zzg6(i));
        }
    }
}
