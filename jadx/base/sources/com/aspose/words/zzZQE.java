package com.aspose.words;

import com.aspose.words.ref.Ref;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzZQE extends zzZQF {
    private static int[] zzYE8 = {FieldType.FIELD_MERGE_BARCODE, 59, 44, 75};
    private Map<Run, ArrayList<MustacheTag>> zzYE9;
    private ArrayList<Object> zzYEa;

    private zzZQE(Document document, boolean z) throws Exception {
        super(zzYE8);
        this.zzYEa = new ArrayList<>();
        if (z) {
            this.zzYE9 = new HashMap();
            for (MustacheTag mustacheTag : zzY69.zzZT(document)) {
                zzU(mustacheTag.getReferenceRun()).add(mustacheTag);
            }
        }
    }

    private ArrayList<MustacheTag> zzU(Run run) {
        ArrayList<MustacheTag> arrayListZzV = zzV(run);
        if (arrayListZzV != null) {
            return arrayListZzV;
        }
        ArrayList<MustacheTag> arrayList = new ArrayList<>();
        com.aspose.words.internal.zzZQF.zzY(this.zzYE9, run, arrayList);
        return arrayList;
    }

    private ArrayList<MustacheTag> zzV(Run run) {
        if (this.zzYE9 == null) {
            return null;
        }
        Ref ref = new Ref(null);
        com.aspose.words.internal.zzZQF.zzZ((Map<Run, V>) this.zzYE9, run, ref);
        return (ArrayList) ref.get();
    }

    public static ArrayList<Object> zzZ(Document document, boolean z) throws Exception {
        zzZQE zzzqe = new zzZQE(document, z);
        zzzqe.zzZQ(document);
        return zzzqe.zzYEa;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int visitRun(Run run) throws Exception {
        ArrayList<MustacheTag> arrayListZzV = zzV(run);
        if (arrayListZzV != null) {
            Iterator<MustacheTag> it = arrayListZzV.iterator();
            while (it.hasNext()) {
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<MustacheTag>) this.zzYEa, it.next());
            }
        }
        return super.visitRun(run);
    }

    @Override // com.aspose.words.zzZQF
    public final void zzZe8() {
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<Field>) this.zzYEa, zzZe7());
    }
}
