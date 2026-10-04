package com.aspose.words;

import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ7M extends DocumentVisitor {
    private int zzDt;
    int zzYhF;
    int zzYhG;
    int zzYhH;
    int zzYhI;
    int zzYhJ;
    int zzYhK;
    int zzYhL;
    int zzYhM;
    int zze0 = 1;
    private HashMap<zzZS, zzZ7L> zzYhE = new HashMap<>();

    public static void zzE(DocumentBase documentBase) throws Exception {
        zzZ7M zzz7m = documentBase.zzYSx;
        if (zzz7m == null) {
            return;
        }
        zzz7m.zzDt = 1;
        documentBase.accept(zzz7m);
        documentBase.zzYSx = null;
    }

    public static void zzF(DocumentBase documentBase) throws Exception {
        if (documentBase.zzYSx == null) {
            documentBase.zzYSx = new zzZ7M();
        }
        zzZ7M zzz7m = documentBase.zzYSx;
        zzz7m.zzDt = 0;
        documentBase.accept(zzz7m);
    }

    private void zzN(zzZS zzzs) {
        try {
            this.zzYhG++;
            zzZ7L zzz7l = (zzZ7L) com.aspose.words.internal.zzQW.zzZ(this.zzYhE, zzzs);
            zzzs.zzZ((zzZ7L) null);
            com.aspose.words.internal.zzZQF.zzY(this.zzYhE, zzzs);
            if (zzz7l.zzYhC != 0) {
                zzZS zzzsZzbn = zzzs.zzbn();
                zzz7l.zzYhD = zzzsZzbn;
                com.aspose.words.internal.zzZQF.zzY(this.zzYhE, zzzsZzbn, zzz7l);
                zzzsZzbn.zzZ(zzz7l);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void zzO(zzZS zzzs) {
        try {
            this.zzYhF++;
            zzZ7L zzz7lZzbk = zzzs.zzbk();
            zzz7lZzbk.zzYhC--;
            zzzs.zzZ((zzZ7L) null);
            for (int i = 0; i < zzz7lZzbk.zzYhD.getCount(); i++) {
                int iZzT3 = zzz7lZzbk.zzYhD.zzT3(i);
                Object objZzVY = zzz7lZzbk.zzYhD.zzVY(i);
                if (objZzVY instanceof InternableComplexAttr) {
                    zzZCY zzzcy = (zzZCY) objZzVY;
                    if (!zzzcy.isInheritedComplexAttr()) {
                        Object objDeepCloneComplexAttr = zzzcy.deepCloneComplexAttr();
                        ((InternableComplexAttr) objDeepCloneComplexAttr).detach();
                        zzzs.set(iZzT3, objDeepCloneComplexAttr);
                    }
                } else {
                    zzzs.set(iZzT3, objZzVY);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void zzP(zzZS zzzs) {
        if (this.zzDt == 0) {
            zzU(zzzs);
        } else {
            zzQ(zzzs);
        }
    }

    private void zzU(zzZS zzzs) {
        this.zzYhM++;
        if (zzzs.getCount() == 0) {
            this.zzYhI++;
            return;
        }
        if (zzzs.zzbq() != 0) {
            this.zzYhH++;
            return;
        }
        boolean z = false;
        for (int i = 0; i < zzzs.getCount(); i++) {
            Object objZzVY = zzzs.zzVY(i);
            if (objZzVY instanceof zzZCY) {
                if (!(objZzVY instanceof InternableComplexAttr) || ((zzZCY) objZzVY).isInheritedComplexAttr()) {
                    this.zzYhJ++;
                    return;
                }
                z = true;
            }
        }
        if (z) {
            this.zzYhJ++;
        }
        zzZ7L zzz7l = (zzZ7L) com.aspose.words.internal.zzQW.zzZ(this.zzYhE, zzzs);
        for (int i2 = 0; i2 < zzzs.getCount(); i2++) {
            InternableComplexAttr internableComplexAttr = (InternableComplexAttr) com.aspose.words.internal.zzZKW.zzZ(zzzs.zzVY(i2), InternableComplexAttr.class);
            if (internableComplexAttr != null) {
                internableComplexAttr.zzM(zzzs);
            }
        }
        if (zzz7l == null) {
            zzz7l = new zzZ7L(this);
            zzz7l.zzYhD = zzzs;
            int i3 = this.zze0;
            this.zze0 = i3 + 1;
            zzz7l.zze0 = i3;
            com.aspose.words.internal.zzZQF.zzY(this.zzYhE, zzzs, zzz7l);
            this.zzYhK++;
            this.zzYhE.size();
            com.aspose.words.internal.zzZKN.format("Pool size: {0}", Integer.valueOf(this.zzYhE.size()));
        } else {
            zzz7l.zzYhC++;
            zzzs.clear();
            this.zzYhL++;
        }
        zzzs.zzZ(zzz7l);
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitCellStart(Cell cell) {
        cell.getDocument().zzYSx.zzP(cell.zz6G());
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitDocumentStart(Document document) {
        for (Style style : document.getStyles()) {
            document.zzYSx.zzP(style.zzZYh());
            if (style.getType() == 1) {
                document.zzYSx.zzP(style.zzZYj());
            }
            if (style.getType() == 3) {
                document.zzYSx.zzP(((TableStyle) style).zzZYf());
            }
        }
        Iterator<zzZ4J> it = document.getLists().zzYOX().iterator();
        while (it.hasNext()) {
            for (ListLevel listLevel : it.next().zzYOP()) {
                document.zzYSx.zzP(listLevel.zzZYh());
                document.zzYSx.zzP(listLevel.zzZYj());
            }
        }
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitParagraphStart(Paragraph paragraph) {
        paragraph.getDocument().zzYSx.zzP(paragraph.zzZYj());
        paragraph.getDocument().zzYSx.zzP(paragraph.zzYp5());
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitRowStart(Row row) {
        row.getDocument().zzYSx.zzP(row.zzZYf());
        return 0;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitRun(Run run) {
        run.getDocument().zzYSx.zzP(run.zzZYh());
        return 0;
    }

    public final void zzQ(zzZS zzzs) {
        int iZzbq = zzzs.zzbq();
        if (iZzbq == 1) {
            zzN(zzzs);
        } else {
            if (iZzbq != 2) {
                return;
            }
            zzO(zzzs);
        }
    }
}
