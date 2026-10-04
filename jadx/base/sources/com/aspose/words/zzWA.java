package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzWA implements zzZB0 {
    private Field zzZz7;
    private static int[] zzZz5 = {StyleIdentifier.BIBLIOGRAPHY, 130};
    private static int[] zzZz4 = {StyleIdentifier.BIBLIOGRAPHY};

    public zzWA(Field field) {
        this.zzZz7 = field;
    }

    @Override // com.aspose.words.zzZB0
    public final zzZB1 getFormatApplier() {
        return new zzK3(getSourceNode(), this.zzZz7.getFormat().getGeneralFormats().zzAs(53) ? zzZz4 : zzZz5);
    }

    @Override // com.aspose.words.zzZB0
    public final Inline getSourceNode() {
        boolean zZzYUU = this.zzZz7.getStart().zzYUU();
        for (Node node : this.zzZz7.zzZgG()) {
            if (node.getNodeType() == 21) {
                Run run = (Run) node;
                if (!run.zzYUU() || zZzYUU) {
                    if (!com.aspose.words.internal.zzZYD.zzXi(run.getText())) {
                        return run;
                    }
                }
            }
        }
        return this.zzZz7.getSeparator();
    }
}
