package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYGW extends zzYHQ {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\version", "\\edmins", "\\nofpages", "\\nofwords", "\\nofchars", "\\nofcharsws", "\\yr", "\\mo", "\\dy", "\\hr", "\\min", "\\sec");
    private int zzXuV;
    private int zzXuW;
    private int zzXuX;
    private int zzXuY;
    private int zzXuZ;
    private int zzXv0;

    public zzYGW(zzYFT zzyft) {
        super(zzyft);
    }

    private void zzCj(String str) {
        getDocument().zzZpV().zzYW6.zzFE(new zzYGY(str).zzXc());
    }

    private void zzI(zzYET zzyet) throws Exception {
        switch (zzUR.zzTP(zzyet.getName())) {
            case 6:
                this.zzXv0 = zzyet.zzYeT();
                break;
            case 7:
                this.zzXuZ = zzyet.zzYeT();
                break;
            case 8:
                this.zzXuY = zzyet.zzYeT();
                break;
            case 9:
                this.zzXuX = zzyet.zzYeT();
                break;
            case 10:
                this.zzXuW = zzyet.zzYeT();
                break;
            case 11:
                this.zzXuV = zzyet.zzYeT();
                break;
            default:
                this.zzXw4.zzC0(zzyet.getName());
                break;
        }
    }

    private void zzJ(zzYET zzyet) throws Exception {
        int iZzTP = zzUR.zzTP(zzyet.getName());
        if (iZzTP == 0) {
            getDocument().getBuiltInDocumentProperties().setRevisionNumber(zzyet.zzYeT());
            return;
        }
        if (iZzTP == 1) {
            getDocument().getBuiltInDocumentProperties().zzOJ(zzyet.zzYeT());
            return;
        }
        if (iZzTP == 2) {
            getDocument().getBuiltInDocumentProperties().setPages(zzyet.zzYeT());
            return;
        }
        if (iZzTP == 3) {
            getDocument().getBuiltInDocumentProperties().setWords(zzyet.zzYeT());
            return;
        }
        if (iZzTP == 4) {
            getDocument().getBuiltInDocumentProperties().setCharacters(zzyet.zzYeT());
        } else if (iZzTP != 5) {
            zzO(zzyet);
        } else {
            getDocument().getBuiltInDocumentProperties().setCharactersWithSpaces(zzyet.zzYeT());
        }
    }

    private com.aspose.words.internal.zzZQ9 zzZx() {
        return com.aspose.words.internal.zzR1.zzZ(this.zzXv0, this.zzXuZ, this.zzXuY, this.zzXuX, this.zzXuW, this.zzXuV);
    }

    @Override // com.aspose.words.zzYHQ
    public final void zzT(zzYET zzyet) throws Exception {
        int type = zzYiN().getType();
        if (type == 6) {
            zzJ(zzyet);
            return;
        }
        switch (type) {
            case 18:
            case 19:
            case 20:
                zzI(zzyet);
                break;
            default:
                zzO(zzyet);
                break;
        }
    }

    @Override // com.aspose.words.zzYHQ
    public final void zzY(zzYET zzyet) {
        int type = zzYiN().getType();
        if (type == 112) {
            zzCj(zzyet.zzYR());
            return;
        }
        if (type == 113) {
            zzYG2.zzY(zzyet.zzYR(), getDocument().zzZpV().zzYW6.zzZo8());
            return;
        }
        switch (type) {
            case 8:
                getDocument().getBuiltInDocumentProperties().setTitle(zzyet.zzYR());
                break;
            case 9:
                getDocument().getBuiltInDocumentProperties().setSubject(zzyet.zzYR());
                break;
            case 10:
                getDocument().getBuiltInDocumentProperties().setAuthor(zzyet.zzYR());
                break;
            case 11:
                getDocument().getBuiltInDocumentProperties().setManager(zzyet.zzYR());
                break;
            case 12:
                getDocument().getBuiltInDocumentProperties().setCompany(zzyet.zzYR());
                break;
            case 13:
                getDocument().getBuiltInDocumentProperties().setHyperlinkBase(zzyet.zzYR());
                break;
            case 14:
                getDocument().getBuiltInDocumentProperties().setLastSavedBy(zzyet.zzYR());
                break;
            case 15:
                getDocument().getBuiltInDocumentProperties().setCategory(zzyet.zzYR());
                break;
            case 16:
                getDocument().getBuiltInDocumentProperties().setKeywords(zzyet.zzYR());
                break;
            case 17:
                getDocument().getBuiltInDocumentProperties().setComments(zzyet.zzYR());
                break;
        }
    }

    @Override // com.aspose.words.zzYHQ
    public final void zzYjb() {
        switch (zzYiN().getType()) {
            case 18:
                getDocument().getBuiltInDocumentProperties().zzB(zzZx());
                break;
            case 19:
                getDocument().getBuiltInDocumentProperties().zzz(zzZx());
                break;
            case 20:
                getDocument().getBuiltInDocumentProperties().zzA(zzZx());
                break;
        }
    }

    @Override // com.aspose.words.zzYHQ
    public final void zzZ(zzYET zzyet) {
        switch (zzYiN().getType()) {
            case 18:
            case 19:
            case 20:
                this.zzXv0 = 0;
                this.zzXuZ = 0;
                this.zzXuY = 0;
                this.zzXuX = 0;
                this.zzXuW = 0;
                this.zzXuV = 0;
                break;
        }
    }

    @Override // com.aspose.words.zzYHQ
    public final zzYHQ zzZ(zzYHP zzyhp) {
        int type = zzyhp.getType();
        if (type != 112 && type != 113) {
            switch (type) {
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                    break;
                default:
                    return null;
            }
        }
        return this;
    }
}
