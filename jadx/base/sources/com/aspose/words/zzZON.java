package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZON {
    private int zzZCv;
    private IWarningCallback zzZG0;
    private com.aspose.words.internal.zzZQC<FieldChar> zzYCc = new com.aspose.words.internal.zzZQC<>();
    private int zzYAc = 0;

    public zzZON(IWarningCallback iWarningCallback, int i) {
        this.zzZCv = i;
        this.zzZG0 = iWarningCallback;
    }

    private void zzLz(String str) {
        IWarningCallback iWarningCallback = this.zzZG0;
        if (iWarningCallback != null) {
            OooO00o.OooO0O0(iWarningCallback, 1, 17, str);
        }
    }

    private boolean zzS(FieldChar fieldChar) {
        if (fieldChar.getFieldType() != 100500) {
            return false;
        }
        int i = this.zzZCv;
        return i == 10 || i == 31;
    }

    private zzZR4 zzZar() {
        zzZR4 zzzr4 = new zzZR4();
        if (this.zzYCc.size() > 0 && (this.zzYCc.peek() instanceof FieldEnd)) {
            zzzr4.zzX((FieldEnd) this.zzYCc.pop());
        }
        if (this.zzYCc.size() > 0 && (this.zzYCc.peek() instanceof FieldSeparator)) {
            zzzr4.zzX((FieldSeparator) this.zzYCc.pop());
        }
        if (this.zzYCc.size() > 0 && (this.zzYCc.peek() instanceof FieldStart)) {
            zzzr4.zzY((FieldStart) this.zzYCc.pop());
        }
        return zzzr4;
    }

    public final void zzN(FieldStart fieldStart) throws Exception {
        if (zzS(fieldStart)) {
            zzZPJ.zzB(new Field(zzZR4.zzW(fieldStart)));
            return;
        }
        this.zzYCc.push(fieldStart);
        if (zzZOO.zzCJ(fieldStart.getFieldType())) {
            this.zzYAc++;
        }
    }

    public final void zzV(FieldSeparator fieldSeparator) {
        this.zzYCc.push(fieldSeparator);
    }

    public final void zzY(FormField formField) {
        if (this.zzYAc != 0) {
            return;
        }
        zzLz("Invalid form field was removed.");
        formField.remove();
    }

    public final void zzbQ() {
        while (this.zzYCc.size() > 0) {
            zzZR4 zzzr4ZzZar = zzZar();
            FieldStart start = zzzr4ZzZar.getStart();
            FieldSeparator separator = zzzr4ZzZar.getSeparator();
            FieldEnd end = zzzr4ZzZar.getEnd();
            if (start == null || end != null) {
                if (start == null && end == null) {
                    zzLz("FieldSeparator without corresponding FieldStart and FieldEnd was removed.");
                    zzzr4ZzZar.zzZg1();
                }
            } else if (start.getFieldType() != 0) {
                boolean z = separator != null;
                (z ? separator.getParentNode() : start.zzYBd()).appendChild(new FieldEnd(start.getDocument(), (zzYEF) start.zzZYh().zzbn(), start.getFieldType(), z));
            } else {
                zzLz("Fields with FieldType.FieldNone are not supported by Aspose.Words.");
                zzzr4ZzZar.zzZg1();
            }
        }
    }

    public final void zzV(FieldEnd fieldEnd) {
        this.zzYCc.push(fieldEnd);
        zzZR4 zzzr4ZzZar = zzZar();
        if (zzzr4ZzZar.getStart() == null) {
            zzLz("FieldSeparator without corresponding FieldStart was removed.");
            zzzr4ZzZar.zzZg1();
        }
        if (zzZOO.zzCJ(fieldEnd.getFieldType())) {
            this.zzYAc--;
        }
        if (zzzr4ZzZar.getStart() == null || zzzr4ZzZar.getEnd() == null) {
            return;
        }
        zzzr4ZzZar.zzZg0();
        Node nodeZztB = zzzr4ZzZar.getStart().zztB(0);
        if ((nodeZztB.getNodeType() == 4 || nodeZztB.getNodeType() == 18) && nodeZztB != zzzr4ZzZar.getEnd().zztB(0)) {
            zzLz("Invalid field is located in different document stories, removed.");
            zzzr4ZzZar.zzZg1();
        }
    }
}
