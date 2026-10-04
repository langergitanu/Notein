package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class FieldArgumentBuilder implements zzZBD {
    private ArrayList<zzZBD> zzYGn = new ArrayList<>();

    public FieldArgumentBuilder addField(FieldBuilder fieldBuilder) {
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<FieldBuilder>) this.zzYGn, fieldBuilder);
        return this;
    }

    public FieldArgumentBuilder addNode(Inline inline) {
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzYWH>) this.zzYGn, new zzYWH(inline));
        return this;
    }

    public FieldArgumentBuilder addText(String str) {
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzY5V>) this.zzYGn, new zzY5V(str));
        return this;
    }

    @Override // com.aspose.words.zzZBD
    @ReservedForInternalUse
    @Deprecated
    public void buildBlock(DocumentBuilder documentBuilder) throws Exception {
        Iterator<zzZBD> it = this.zzYGn.iterator();
        while (it.hasNext()) {
            it.next().buildBlock(documentBuilder);
        }
    }
}
