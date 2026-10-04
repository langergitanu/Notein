package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzYAC extends zzYAL {
    private int zzXc6;
    private FormField zzXc7;
    private String zzZi = "";

    public zzYAC(FormField formField) {
        this.zzXc7 = formField;
    }

    private void zzY5s() throws Exception {
        this.zzXc7.getType();
        zzZ32 zzz32ZzX = zzZ32.zzX(zzY6N());
        if (this.zzXc7.isCheckBoxExactSize()) {
            zzz32ZzX.setSize(com.aspose.words.internal.zzSA.zzn(this.zzXc7.getCheckBoxSize()));
            zzz32ZzX.zzvA(com.aspose.words.internal.zzSA.zzn(this.zzXc7.getCheckBoxSize()));
        } else {
            zzZ4N zzz4nZzYPe = zzaa().zzY4s().zzYPe();
            zzz4nZzYPe.zzX(this);
            zzYAU zzyau = (zzYAU) zzz4nZzYPe.zzYPi();
            while (zzz4nZzYPe.movePrevious()) {
                zzyau = (zzYAU) zzz4nZzYPe.zzYPi();
                boolean z = false;
                boolean z2 = (zzyau instanceof zzY9S) && com.aspose.words.internal.zzZKN.zzX(zzyau.getText(), "FORMCHECKBOX", com.aspose.words.internal.zzZOF.ORDINAL_IGNORE_CASE$4894b8c8);
                if ((zzyau instanceof zzYAH) && zzyau == zzY6Y()) {
                    z = true;
                }
                if (z2 || z) {
                    break;
                }
            }
            zzz32ZzX.setSize(zzyau.zzY6N().getSize());
            zzz32ZzX.zzvA(zzyau.zzY6N().zzYL6());
        }
        zzU(zzZ32.zzW(zzz32ZzX));
    }

    @Override // com.aspose.words.zzYAU
    public final int getLength() {
        return 1;
    }

    @Override // com.aspose.words.zzYAU
    public final String getText() {
        return this.zzZi;
    }

    @Override // com.aspose.words.zzYAL
    public final boolean isChecked() {
        return this.zzXc7.zzZ6R() == 1 && this.zzXc7.getChecked();
    }

    public final zzYAH zzY5q() {
        FieldStart start = this.zzXc7.getField().getStart();
        zzZ4N zzz4nZzYPe = zzaa().zzY4s().zzYPe();
        zzz4nZzYPe.zzX(this);
        while (zzz4nZzYPe.movePrevious()) {
            zzYAH zzyah = (zzYAH) com.aspose.words.internal.zzZKW.zzZ(zzz4nZzYPe.zzYPi(), zzYAH.class);
            if (zzyah != null && zzyah.zzZ1s() == 2 && zzyah.zzY5C().zzY5z() == start) {
                return zzyah;
            }
        }
        return null;
    }

    public final FormField zzY5r() {
        return this.zzXc7;
    }

    @Override // com.aspose.words.zzYAU
    public final zzYAU zzY71() throws Exception {
        zzYAC zzyac = new zzYAC(this.zzXc7);
        zzZB(zzyac);
        return zzyac;
    }

    @Override // com.aspose.words.zzYAU
    public final boolean zzY7b() throws Exception {
        return super.zzY7b() || zzY5q().zzY7b();
    }

    @Override // com.aspose.words.zzYAU
    public final void zzY7p() throws Exception {
        FormField formField = this.zzXc7;
        int type = formField.getType();
        if (type == 71) {
            this.zzZi = "☐";
            zzY5s();
        } else {
            if (type != 83) {
                return;
            }
            this.zzZi = (com.aspose.words.internal.zzZYD.zzXk(formField.getResult()) && zza8().zzYT4()) ? formField.getResult() : "";
        }
    }

    @Override // com.aspose.words.zzYAU
    public final int zzY7r() {
        return "".equals(this.zzZi) ? 0 : 1024;
    }

    @Override // com.aspose.words.zzYAU
    public final int zzY7u() {
        if (this.zzXc6 == 0 && com.aspose.words.internal.zzZYD.zzXk(this.zzZi)) {
            this.zzXc6 = zzY5Z.zzXK(this.zzZi.charAt(0));
        }
        return this.zzXc6;
    }

    @Override // com.aspose.words.zzYAL
    public final int zzYRH() {
        return this.zzXc7.zzZ6R();
    }

    @Override // com.aspose.words.zzYAU
    public final boolean zzYol() {
        return !com.aspose.words.internal.zzZYD.zzXk(this.zzZi);
    }

    @Override // com.aspose.words.zzYAU
    public final int zzZ1s() {
        return 1;
    }

    @Override // com.aspose.words.zzYAU
    public final int zzZXS() throws Exception {
        return this.zzXc7.getType() == 71 ? zzY6N().zzZr().zzP8() : super.zzZXS();
    }

    @Override // com.aspose.words.zzYA3, com.aspose.words.zzYAU
    public final int zzZo6() {
        if (com.aspose.words.internal.zzZYD.zzXk(this.zzZi)) {
            return EditingLanguage.ARABIC_YEMEN;
        }
        return 0;
    }
}
