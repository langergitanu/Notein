package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYFP extends zzYFE implements zzYFV {

    /* JADX INFO: renamed from: fk */
    protected final boolean f50793fk;

    private zzYFP(zzZQQ zzzqq) {
        super(zzzqq);
        this.f50790fn = zzzqq;
        Object property = zzzqq.getProperty("com.aspose.javax.xml.stream.isRepairingNamespaces");
        this.f50793fk = (property instanceof Boolean) && ((Boolean) property).booleanValue();
    }

    private static void zzXyh() throws zzZQS {
        throw new UnsupportedOperationException("Not implemented");
    }

    public static zzYFV zzZ(zzZQQ zzzqq) {
        return zzzqq instanceof zzYFV ? (zzYFV) zzzqq : new zzYFP(zzzqq);
    }

    @Override // com.aspose.words.internal.zzYFV
    public final void zzW(String str, String str2, String str3, String str4) throws zzZQS {
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
    public final void zzX(String str) throws zzZQS {
        zzXyh();
    }

    @Override // com.aspose.words.internal.zzYFV
    public final void zzf6() throws zzZQS {
        this.f50790fn.zzVV("");
        this.f50790fn.zzle();
    }
}
