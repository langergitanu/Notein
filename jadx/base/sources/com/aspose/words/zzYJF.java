package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYJF {
    private boolean zzPx;
    private boolean zzXBO;
    private int zzXBP;
    private com.aspose.words.internal.zzKV<Node> zzXBQ;
    private Table zzXBR;
    private Paragraph zzXBS;
    private int zzXBT;
    private int zzXV0 = 0;
    private Node zzXVU;
    private int zzYPC;
    private Paragraph zzYlK;

    public zzYJF(Iterable<Node> iterable, Paragraph paragraph) {
        this.zzXBQ = new com.aspose.words.internal.zzKV<>(iterable.iterator());
        this.zzYlK = paragraph;
    }

    private boolean isInitialized() {
        return this.zzXVU != null;
    }

    private boolean isLocked() {
        return this.zzYPC > 0;
    }

    private void zzX2(Node node) throws Exception {
        switch (node.getNodeType()) {
            case 22:
                this.zzYPC++;
                return;
            case 23:
                this.zzYPC--;
                break;
            case 24:
                if (!((FieldEnd) node).hasSeparator()) {
                    this.zzYPC--;
                }
                break;
            default:
                return;
        }
        zzYBf();
    }

    private int zzY3(char c) {
        if (c != 30 && c != '\'' && c != 160) {
            switch (c) {
                case ',':
                case '.':
                    return this.zzXBO ? 1 : 3;
                case '-':
                    break;
                default:
                    if (Character.isLetterOrDigit(c)) {
                        return 1;
                    }
                    return com.aspose.words.internal.zzZKU.zzG(c) ? 2 : 3;
            }
        }
        return 1;
    }

    private boolean zzYlE() {
        return this.zzXV0 != 0;
    }

    private boolean zzYlH() {
        if (isLocked()) {
            return false;
        }
        Table table = this.zzXBR;
        if (table != null && this.zzXVU.zzYF(table)) {
            return false;
        }
        int nodeType = this.zzXVU.getNodeType();
        if (nodeType != 5 && nodeType != 8) {
            if (nodeType == 21) {
                return this.zzXBT < this.zzXVU.getText().length();
            }
            if (nodeType != 28) {
                return false;
            }
        }
        return true;
    }

    private boolean zzYlI() {
        int i = this.zzXV0;
        return i != 1 ? i != 2 ? i == 3 || i == 4 || i == 5 : this.zzXBP != 2 : this.zzXBP != 1;
    }

    private boolean zzYlJ() throws Exception {
        do {
            if (isInitialized() && zzYlC() && this.zzXBT < ((Run) this.zzXVU).getText().length()) {
                this.zzXBT++;
            } else {
                if (!this.zzXBQ.moveNext()) {
                    this.zzPx = true;
                    return false;
                }
                Node current = this.zzXBQ.getCurrent();
                this.zzXVU = current;
                this.zzXBT = 0;
                zzX2(current);
            }
        } while (!zzYlH());
        return true;
    }

    public final Paragraph getCurrentParagraph() {
        return this.zzYlK;
    }

    public final Paragraph getLastParagraph() {
        return this.zzXBS;
    }

    public abstract boolean isSuspended();

    public boolean moveNext() throws Exception {
        if (this.zzPx) {
            return false;
        }
        if (isInitialized()) {
            if (zzYlB()) {
                this.zzXBS = this.zzYlK;
                this.zzYlK = (Paragraph) this.zzXVU;
            }
            if (zzYlA()) {
                this.zzXBS = this.zzYlK;
                this.zzYlK = null;
            }
            this.zzXV0 = this.zzXBP;
            zzYBe();
        }
        while (zzYlJ()) {
            zzYrI();
            int nodeType = this.zzXVU.getNodeType();
            if (nodeType == 5) {
                this.zzXBP = 5;
                this.zzXBR = (Table) this.zzXVU;
                return zzYlE() || moveNext();
            }
            if (nodeType == 8) {
                this.zzXBP = 4;
                this.zzXBO = false;
                return zzYlE() || moveNext();
            }
            if (nodeType == 21) {
                char cCharAt = ((Run) this.zzXVU).getText().charAt(this.zzXBT);
                int iZzY3 = zzY3(cCharAt);
                this.zzXBP = iZzY3;
                if (iZzY3 != 1) {
                    this.zzXBO = false;
                } else if (Character.isDigit(cCharAt)) {
                    this.zzXBO = true;
                }
                if (zzYlI()) {
                    zzYb(cCharAt);
                    return true;
                }
                this.zzXV0 = this.zzXBP;
                zzYc(cCharAt);
            }
        }
        return zzYlE();
    }

    public void zzYBe() throws Exception {
    }

    public void zzYBf() throws Exception {
    }

    public void zzYb(char c) {
    }

    public void zzYc(char c) throws Exception {
    }

    public final boolean zzYlA() {
        return this.zzXVU.getNodeType() == 5;
    }

    public final boolean zzYlB() {
        return this.zzXVU.getNodeType() == 8;
    }

    public final boolean zzYlC() {
        return this.zzXVU.getNodeType() == 21;
    }

    public final int zzYlD() {
        return this.zzXBT;
    }

    public final boolean zzYlF() {
        return this.zzXV0 == 5;
    }

    public final boolean zzYlG() {
        return this.zzXV0 == 4;
    }

    public final Table zzYlz() {
        return this.zzXBR;
    }

    public void zzYrI() {
    }

    public final Run zzYrK() {
        return (Run) this.zzXVU;
    }
}
