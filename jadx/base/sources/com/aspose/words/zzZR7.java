package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZR7 {
    private zzZBE zzYGl;
    private Field zzZz7;

    private zzZR7(Field field, zzZBE zzzbe) {
        this.zzZz7 = field;
        this.zzYGl = zzzbe;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static zzZP6 zzU(Field field) throws Exception {
        return new zzZR7(field, (zzZBE) field).zzZg8();
    }

    private void zzZ(zzYWB zzywb, zzZA2 zzza2) throws Exception {
        Paragraph paragraph;
        if (zzywb.zzYA7() || (paragraph = (Paragraph) zzywb.zzYA2().getNode().getAncestor(8)) == null) {
            return;
        }
        Paragraph paragraph2 = (Paragraph) zzza2.zzZ(paragraph, paragraph, false, null);
        Paragraph parentParagraph = this.zzZz7.getStart().getParentParagraph();
        parentParagraph.zzZ((zzYMX) paragraph2.zzZYj().zzbn());
        parentParagraph.zzC((zzYEF) paragraph2.zzYp5().zzbn());
    }

    private zzZP6 zzZg8() throws Exception {
        if (!com.aspose.words.internal.zzZYD.zzXk(this.zzYGl.getEntryName())) {
            return new zzZP2(this.zzZz7, "Error! No AutoText entry specified.");
        }
        BuildingBlock buildingBlockZzTz = this.zzZz7.zzZgo().zzZaL().zzTz(this.zzYGl.getEntryName());
        if (buildingBlockZzTz == null) {
            return null;
        }
        com.aspose.words.internal.zzZOY zzzoyZzZbn = this.zzZz7.zzZgn().zzZbn();
        try {
            zzYWB zzywbZzP = zzZOO.zzP(buildingBlockZzTz.getFirstSection(), buildingBlockZzTz.getLastSection());
            zzZSB zzzsb = new zzZSB(zzywbZzP.getDocument(), this.zzZz7.getStart().zzYBb(), 0);
            zzYWJ.zzZ(zzywbZzP, this.zzZz7.getEnd(), zzzsb, (zzZA5) null, 5);
            zzZ(zzywbZzP, zzzsb);
            zzzoyZzZbn.dispose();
            return new zzZP3(this.zzZz7);
        } catch (Throwable th) {
            zzzoyZzZbn.dispose();
            throw th;
        }
    }
}
