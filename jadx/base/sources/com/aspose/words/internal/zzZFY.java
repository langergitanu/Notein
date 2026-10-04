package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZFY extends zzYFN implements zzZQP {
    public zzZFY(zzZQY zzzqy) {
        super(zzzqy);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof zzZQP)) {
            return false;
        }
        zzZQP zzzqp = (zzZQP) obj;
        return zzYFN.zzXl(getName(), zzzqp.getName()) && zzYFN.zzXl(getBaseURI(), zzzqp.getBaseURI()) && zzYFN.zzXl(getNotationName(), zzzqp.getNotationName()) && zzYFN.zzXl(getPublicId(), zzzqp.getPublicId()) && zzYFN.zzXl(zzlc(), zzzqp.zzlc()) && zzYFN.zzXl(getSystemId(), zzzqp.getSystemId());
    }

    @Override // com.aspose.words.internal.zzZQP
    public abstract String getBaseURI();

    @Override // com.aspose.words.internal.zzYFN
    public final int getEventType() {
        return 15;
    }

    @Override // com.aspose.words.internal.zzZQP
    public abstract String getName();

    @Override // com.aspose.words.internal.zzZQP
    public abstract String getNotationName();

    @Override // com.aspose.words.internal.zzZQP
    public abstract String getPublicId();

    @Override // com.aspose.words.internal.zzZQP
    public abstract String getSystemId();

    public int hashCode() {
        return getName().hashCode();
    }

    @Override // com.aspose.words.internal.zzZQP
    public abstract String zzlc();
}
