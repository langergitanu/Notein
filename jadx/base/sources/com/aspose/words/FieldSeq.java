package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class FieldSeq extends Field implements zzZBA {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\c", "\\h", "\\n", "\\r", "\\s");

    private boolean zzY(zzYD zzyd) throws Exception {
        return com.aspose.words.internal.zzZYD.zzXk(getBookmarkName()) && zzyd.get(getBookmarkName()) == null;
    }

    private boolean zzZcr() {
        return !com.aspose.words.internal.zzZYD.zzXk(getSequenceIdentifier());
    }

    private boolean zzZcs() {
        return getStart().getAncestor(3) == null && !zzZcq();
    }

    public String getBookmarkName() {
        return zzZgq().zzDG(1);
    }

    public boolean getInsertNextNumber() {
        return zzZgq().zzMj("\\n");
    }

    public String getResetHeadingLevel() {
        return zzZgq().zzt("\\s", false);
    }

    public String getResetNumber() {
        return zzZgq().zzt("\\r", false);
    }

    public String getSequenceIdentifier() {
        return zzZgq().zzDG(0);
    }

    @Override // com.aspose.words.zzZBA
    @ReservedForInternalUse
    @Deprecated
    public int getSwitchType(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP == 0 || iZzTP == 1 || iZzTP == 2) {
            return 1;
        }
        return (iZzTP == 3 || iZzTP == 4) ? 2 : 0;
    }

    public void setBookmarkName(String str) throws Exception {
        zzZgq().zzB(1, str);
    }

    public void setInsertNextNumber(boolean z) throws Exception {
        zzZgq().zzs("\\n", z);
    }

    public void setResetHeadingLevel(String str) throws Exception {
        zzZgq().zzZe("\\s", str);
    }

    public void setResetNumber(String str) throws Exception {
        zzZgq().zzZe("\\r", str);
    }

    public void setSequenceIdentifier(String str) throws Exception {
        zzZgq().zzB(0, str);
    }

    public final boolean zzZ(zzYD zzyd) throws Exception {
        return zzZcs() || zzZcr() || zzY(zzyd);
    }

    public final com.aspose.words.internal.zz7I zzZcl() {
        return zzZgq().zzMc("\\s");
    }

    public final boolean zzZcm() {
        return zzZgq().zzMj("\\s");
    }

    public final com.aspose.words.internal.zz7I zzZcn() {
        return zzZgq().zzMc("\\r");
    }

    public final boolean zzZco() {
        return zzZgq().zzMj("\\r");
    }

    public final boolean zzZcp() {
        return zzZgq().zzMj("\\h");
    }

    public final boolean zzZcq() {
        return zzZgq().zzMj("\\c");
    }

    @Override // com.aspose.words.Field
    public final zzZP6 zzZgM() throws Exception {
        if (zzZcs()) {
            return new zzZP2(this, "Error! Main Document Only.");
        }
        if (zzZcr()) {
            return new zzZP2(this, "Error! No sequence specified.");
        }
        if (zzY(zzZgo().zzZau())) {
            return new zzZP2(this, "Error! Bookmark not defined.");
        }
        if (zzZcp() && getFormat().getGeneralFormats().zzZ5i() == 0) {
            return new zzZP5(this, "");
        }
        zzZgo().zzZav().zzY(new zzZPF(zzZgo()));
        return new zzZP5(this, zzZgo().zzZav().zzz(this));
    }
}
