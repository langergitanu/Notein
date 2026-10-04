package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class Run extends Inline {
    private PhoneticGuide zzXqd;
    private String zzZi;
    static int[] zzXqc = {30, 40, 250, StyleIdentifier.SUBTLE_EMPHASIS, 270, StyleIdentifier.LIST_TABLE_5_DARK_ACCENT_2, StyleIdentifier.LIST_TABLE_1_LIGHT_ACCENT_4};
    static int[] zzXqb = {30, 40, 60, 70, 190, 230, 235, 240, 380, 390};

    public Run(DocumentBase documentBase) {
        this(documentBase, "");
    }

    public static boolean zzBq(String str) {
        return com.aspose.words.internal.zzZYD.zzXk(str) && com.aspose.words.internal.zzZYD.zzn(str.charAt(0));
    }

    @Override // com.aspose.words.Node
    public boolean accept(DocumentVisitor documentVisitor) throws Exception {
        return Node.visitorActionToBool(documentVisitor.visitRun(this));
    }

    @Override // com.aspose.words.Node
    public int getNodeType() {
        return 21;
    }

    public PhoneticGuide getPhoneticGuide() {
        if (this.zzXqd == null) {
            this.zzXqd = new PhoneticGuide(this);
        }
        return this.zzXqd;
    }

    @Override // com.aspose.words.Node
    public String getText() {
        return this.zzZi;
    }

    public boolean isPhoneticGuide() {
        return zzZYh().contains(885);
    }

    public void setText(String str) {
        if (str == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: value");
        }
        if (com.aspose.words.internal.zzZKN.equals(this.zzZi, str)) {
            return;
        }
        if (getDocument().zzZqp()) {
            zzZV7 zzzv7ZzZqs = zzYBa().zzZqs();
            if (!com.aspose.words.internal.zzZKN.equals(this.zzZi, "")) {
                Run run = new Run(getDocument(), this.zzZi, (zzYEF) zzZYh().zzbn());
                zzY81 zzy81 = new zzY81(getDocument());
                try {
                    getParentNode().insertAfter(run, this);
                    zzYJ4.zzW(run, zzzv7ZzZqs);
                } finally {
                    zzy81.dispose();
                }
            }
            zzYJ4.zzX(this, zzzv7ZzZqs);
        }
        this.zzZi = str;
    }

    public final Run zzG(int i, int i2, boolean z) {
        Run run = !z ? this : (Run) deepClone(false);
        if (i2 == 0) {
            run.setText("");
            return run;
        }
        run.setText(run.getText().substring(i, i2 + i));
        return run;
    }

    public final Run zznf(int i) {
        if (i <= 0 || i >= getText().length()) {
            return null;
        }
        Run run = (Run) getParentNode().insertAfter(new Run(getDocument(), getText().substring(i, (getText().length() - i) + i), (zzYEF) zzZYh().zzbn()), this);
        zzG(0, i, false);
        return run;
    }

    public final Run zzng(int i) {
        if (i <= 0 || i >= getText().length()) {
            return null;
        }
        Run run = (Run) getParentNode().insertBefore(new Run(getDocument(), getText().substring(0, i), (zzYEF) zzZYh().zzbn()), this);
        zzG(i, getText().length() - i, false);
        return run;
    }

    public final boolean zzpA() {
        if (this.zzZi.length() == 0) {
            return false;
        }
        for (int i = 0; i < this.zzZi.length(); i++) {
            if (!com.aspose.words.internal.zzZYD.zzn(this.zzZi.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public Run(DocumentBase documentBase, String str) {
        this(documentBase, str, new zzYEF());
    }

    public Run(DocumentBase documentBase, String str, zzYEF zzyef) {
        super(documentBase, zzyef);
        if (str != null) {
            this.zzZi = str;
            return;
        }
        throw new NullPointerException("Value cannot be null.\r\nParameter name: text");
    }
}
