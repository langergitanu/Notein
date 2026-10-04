package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ83 extends zzZDB {
    zzZD4 zzWvF;

    private zzZ83(zzZD4 zzzd4) {
        this.zzWvF = zzzd4;
    }

    public static zzZ83 zzXj(Object obj) {
        if (obj instanceof zzZ83) {
            return (zzZ83) obj;
        }
        if (obj != null) {
            return new zzZ83(zzZD4.zzYy(obj));
        }
        return null;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("CRLDistPoint:");
        String strLineSeparator = zzYGI.lineSeparator();
        stringBuffer.append(strLineSeparator);
        zzZ7W[] zzz7wArrZzXIk = zzXIk();
        for (int i = 0; i != zzz7wArrZzXIk.length; i++) {
            stringBuffer.append("    ");
            stringBuffer.append(zzz7wArrZzXIk[i]);
            stringBuffer.append(strLineSeparator);
        }
        return stringBuffer.toString();
    }

    public final zzZ7W[] zzXIk() {
        zzZ7W[] zzz7wArr = new zzZ7W[this.zzWvF.size()];
        for (int i = 0; i != this.zzWvF.size(); i++) {
            zzz7wArr[i] = zzZ7W.zzXd(this.zzWvF.zzg6(i));
        }
        return zzz7wArr;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        return this.zzWvF;
    }
}
