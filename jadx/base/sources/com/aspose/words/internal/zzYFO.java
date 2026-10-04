package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzYFO implements zzYFV {
    @Override // com.aspose.words.internal.zzYFV
    public void zzW(String str, String str2, String str3, String str4) throws zzZQS {
        StringBuffer stringBuffer = new StringBuffer("<!DOCTYPE");
        stringBuffer.append(str);
        if (str2 != null) {
            if (str3 != null) {
                stringBuffer.append(" PUBLIC \"");
                stringBuffer.append(str3);
                stringBuffer.append("\" \"");
            } else {
                stringBuffer.append(" SYSTEM \"");
            }
            stringBuffer.append(str2);
            stringBuffer.append('\"');
        }
        if (str4 != null && str4.length() > 0) {
            stringBuffer.append(" [");
            stringBuffer.append(str4);
            stringBuffer.append(']');
        }
        stringBuffer.append('>');
        zzVX(stringBuffer.toString());
    }

    @Override // com.aspose.words.internal.zzYFV
    public void zzX(String str) throws zzZQS {
        zzYR(str, str.length());
    }

    public abstract void zzYR(String str, int i) throws zzZQS;

    @Override // com.aspose.words.internal.zzYFV
    public void zzf6() throws zzZQS {
        zzVV("");
        zzle();
    }
}
