package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYFQ extends zzZQM implements zzYFW {

    /* JADX INFO: renamed from: fh */
    protected zzYFJ f50794fh;

    /* JADX INFO: renamed from: fi */
    protected int f50795fi;

    /* JADX INFO: renamed from: fj */
    protected String f50796fj;

    private zzYFQ(zzZQR zzzqr) {
        super(zzzqr);
        this.f50794fh = null;
        this.f50795fi = 0;
    }

    public static zzYFW zz4(zzZQR zzzqr) {
        return zzzqr instanceof zzYFW ? (zzYFW) zzzqr : new zzYFQ(zzzqr);
    }

    @Override // com.aspose.words.internal.zzZQM, com.aspose.words.internal.zzZQR
    public final int next() throws zzZQS {
        if (this.f50796fj != null) {
            this.f50796fj = null;
            return 2;
        }
        int next = super.next();
        if (next == 1) {
            this.f50795fi++;
            return next;
        }
        if (next == 2) {
            this.f50795fi--;
        }
        return next;
    }

    @Override // com.aspose.words.internal.zzYFW
    public final String zzXMY() {
        int eventType = getEventType();
        if (eventType != 1 && eventType != 2) {
            if (eventType == 3) {
                return zzlg();
            }
            if (eventType == 9) {
                return getLocalName();
            }
            if (eventType == 11) {
                return null;
            }
            throw new IllegalStateException("Current state not START_ELEMENT, END_ELEMENT, ENTITY_REFERENCE, PROCESSING_INSTRUCTION or DTD");
        }
        String prefix = getPrefix();
        String localName = getLocalName();
        if (prefix == null || prefix.length() == 0) {
            return localName;
        }
        StringBuffer stringBuffer = new StringBuffer(prefix.length() + localName.length() + 1);
        stringBuffer.append(prefix);
        stringBuffer.append(':');
        stringBuffer.append(localName);
        return stringBuffer.toString();
    }
}
