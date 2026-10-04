package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZQR {
    private String zzYF4;
    private boolean zzYF5;
    private String zzYF6;
    private zzYWB zzYF7;
    private int zzYw;

    public zzZQR(FieldTC fieldTC) {
        this.zzYF7 = fieldTC.zzZeH();
        this.zzYF6 = fieldTC.getTypeIdentifier();
        this.zzYw = fieldTC.getLevel();
        this.zzYF5 = fieldTC.getOmitPageNumber();
        if (fieldTC.zzZgq().zzZfD().size() <= 1) {
            this.zzYF4 = null;
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < fieldTC.zzZgq().zzZfD().size(); i++) {
            sb.append(ControlChar.SPACE_CHAR);
            com.aspose.words.internal.zzZNH.zzU(sb, fieldTC.zzZgq().zzDG(i));
        }
        this.zzYF4 = sb.toString();
    }

    public final int getLevel() {
        return this.zzYw;
    }

    public final boolean getOmitPageNumber() {
        return this.zzYF5;
    }

    public final String getTypeIdentifier() {
        return this.zzYF6;
    }

    public final String zzZeG() {
        return this.zzYF4;
    }

    public final zzYWB zzZeH() {
        return this.zzYF7;
    }
}
