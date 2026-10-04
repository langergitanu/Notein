package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public final class EditableRangeStart extends Node implements zzZA1, zzZCT {
    private int zzYG;
    private int zzYLN;
    private String zzYLO;
    private int zzZCI;
    private int zzZCz;

    public EditableRangeStart(DocumentBase documentBase) {
        this(documentBase, documentBase.zzZpW());
    }

    @Override // com.aspose.words.Node
    public final boolean accept(DocumentVisitor documentVisitor) throws Exception {
        return Node.visitorActionToBool(documentVisitor.visitEditableRangeStart(this));
    }

    @Override // com.aspose.words.zzZCT
    @ReservedForInternalUse
    @Deprecated
    public final int getDisplacedByCustomXml() {
        return this.zzZCI;
    }

    public final EditableRange getEditableRange() {
        return new EditableRange(this);
    }

    public final int getEditorGroup() {
        return this.zzYLN;
    }

    public final int getFirstColumn() {
        return this.zzZCz & 127;
    }

    public final int getFlags() {
        return this.zzZCz;
    }

    public final int getId() {
        return this.zzYG;
    }

    @Override // com.aspose.words.zzZA1
    @ReservedForInternalUse
    @Deprecated
    public final int getIdInternal() {
        return getId();
    }

    public final int getLastColumn() {
        return ((this.zzZCz & 32512) >> 8) - 1;
    }

    @Override // com.aspose.words.Node
    public final int getNodeType() {
        return 11;
    }

    @Override // com.aspose.words.zzZA1
    @ReservedForInternalUse
    @Deprecated
    public final int getParentIdInternal() {
        return -1;
    }

    public final String getSingleUser() {
        return this.zzYLO;
    }

    public final boolean isColumn() {
        return (this.zzZCz & 32768) == 32768;
    }

    @Override // com.aspose.words.zzZCT
    @ReservedForInternalUse
    @Deprecated
    public final void setDisplacedByCustomXml(int i) {
        this.zzZCI = i;
    }

    public final void setEditorGroup(int i) {
        this.zzYLN = i;
    }

    public final void setId(int i) {
        this.zzYG = i;
    }

    @Override // com.aspose.words.zzZA1
    @ReservedForInternalUse
    @Deprecated
    public final void setIdInternal(int i) {
        this.zzYG = i;
    }

    @Override // com.aspose.words.zzZA1
    @ReservedForInternalUse
    @Deprecated
    public final void setParentIdInternal(int i) {
    }

    public final void setSingleUser(String str) {
        this.zzYLO = str;
    }

    public final void zzOW(int i) {
        this.zzZCz = (((i + 1) & 127) << 8) | (this.zzZCz & (-32513)) | 32768;
    }

    public final void zzOX(int i) {
        this.zzZCz = (i & 127) | (this.zzZCz & (-128)) | 32768;
    }

    public final void zzOY(int i) {
        this.zzZCI = i;
    }

    private EditableRangeStart(DocumentBase documentBase, int i) {
        super(documentBase);
        this.zzYLO = "";
        this.zzZCI = 2;
        this.zzYG = i;
    }

    public EditableRangeStart(DocumentBase documentBase, int i, String str, int i2) {
        this(documentBase, i, str, i2, 0);
    }

    public EditableRangeStart(DocumentBase documentBase, int i, String str, int i2, int i3) {
        super(documentBase);
        this.zzZCI = 2;
        this.zzYG = i;
        this.zzYLO = str;
        this.zzYLN = i2;
        this.zzZCz = i3;
    }
}
