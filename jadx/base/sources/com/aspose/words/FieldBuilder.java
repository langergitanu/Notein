package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class FieldBuilder implements zzZBD {
    private zzZQH zzYGi;
    private zzZPD zzYGj;
    private ArrayList<zzZBD> zzYGn;

    public FieldBuilder(int i) {
        String strZzCG = zzZOO.zzCG(i);
        if (strZzCG == null) {
            throw new IllegalArgumentException(com.aspose.words.internal.zzZKN.format("Field type '{0}' is not supported.", zzZOO.zzCu(i)));
        }
        this.zzYGj = new zzZPD(i);
        this.zzYGi = new zzZQH(i);
        ArrayList<zzZBD> arrayList = new ArrayList<>();
        this.zzYGn = arrayList;
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzZPD>) arrayList, this.zzYGj);
        com.aspose.words.internal.zzZQG.zzZ(this.zzYGn, zzJY.zzZj4);
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzY5V>) this.zzYGn, new zzY5V(strZzCG));
        com.aspose.words.internal.zzZQG.zzZ(this.zzYGn, zzJY.zzZj4);
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzZQH>) this.zzYGn, this.zzYGi);
    }

    private void zzX(zzZBD zzzbd) {
        zzZ(zzYK8.zzZj4);
        zzZ(zzzbd);
        zzZ(zzYK8.zzZj4);
        zzZ(zzJY.zzZj4);
    }

    private void zzY(zzZBD zzzbd) {
        zzZ(zzzbd);
        zzZ(zzJY.zzZj4);
    }

    private void zzZ(zzZBD zzzbd) {
        this.zzYGn.add(r0.size() - 1, zzzbd);
    }

    private Field zzZZ(Node node) throws Exception {
        DocumentBuilder documentBuilder = new DocumentBuilder(node.zzYBb());
        documentBuilder.moveTo(node);
        buildBlock(documentBuilder);
        return zzZQB.zzX(this.zzYGj.zzZce(), this.zzYGi.zzZea(), this.zzYGi.zzZe9());
    }

    public FieldBuilder addArgument(String str) {
        zzY(new zzY5V(zzZQP.zzM1(str)));
        return this;
    }

    public FieldBuilder addSwitch(String str) {
        return addSwitch(str, (String) null);
    }

    public Field buildAndInsert(Inline inline) throws Exception {
        return zzZZ(inline);
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

    public FieldBuilder addSwitch(String str, String str2) {
        if (!com.aspose.words.internal.zzZYD.zzg(str, "\\")) {
            str = com.alibaba.sdk.android.oss.internal.OooO00o.OooO00o("\\", str);
        }
        zzY(new zzY5V(str));
        if (com.aspose.words.internal.zzZYD.zzXk(str2)) {
            addArgument(str2);
        }
        return this;
    }

    public Field buildAndInsert(Paragraph paragraph) throws Exception {
        return zzZZ(paragraph);
    }

    public FieldBuilder addArgument(int i) {
        return addArgument(com.aspose.words.internal.zzJB.zzWC(i));
    }

    public FieldBuilder addArgument(double d) {
        return addArgument(com.aspose.words.internal.zzJB.zzZY(d));
    }

    public FieldBuilder addArgument(FieldBuilder fieldBuilder) {
        zzY(fieldBuilder);
        return this;
    }

    public FieldBuilder addArgument(FieldArgumentBuilder fieldArgumentBuilder) {
        zzX(fieldArgumentBuilder);
        return this;
    }

    public FieldBuilder addSwitch(String str, int i) {
        return addSwitch(str, com.aspose.words.internal.zzJB.zzWC(i));
    }

    public FieldBuilder addSwitch(String str, double d) {
        return addSwitch(str, com.aspose.words.internal.zzJB.zzZY(d));
    }
}
