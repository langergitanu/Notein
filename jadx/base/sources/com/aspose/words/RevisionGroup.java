package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class RevisionGroup {
    private static int[] zzXBp = {230, 270, 235, 240};
    private zzYJC zzXBq;
    private String zzXX5;
    private ArrayList<Node> zzYC3;
    private ArrayList<Node> zzZ7F;

    public RevisionGroup(ArrayList<Node> arrayList, zzZV8 zzzv8) {
        this.zzXBq = new zzZV8(zzzv8.getType(), zzzv8.getAuthor(), zzzv8.zzZx());
        this.zzYC3 = arrayList;
    }

    private String zzYln() {
        StringBuilder sb = new StringBuilder();
        for (Node node : zzYlo()) {
            com.aspose.words.internal.zzZNH.zzU(sb, node.isComposite() ? ((CompositeNode) node).zzZYp() : node.getText());
        }
        return sb.toString();
    }

    public String getAuthor() {
        return this.zzXBq.getAuthor();
    }

    public int getRevisionType() {
        zzYJC zzyjc = this.zzXBq;
        return zzyjc instanceof zzZV8 ? ((zzZV8) zzyjc).getType() != 1 ? 0 : 1 : (!(zzyjc instanceof zzZMK) && (zzyjc instanceof zzYX5)) ? 4 : 2;
    }

    public String getText() {
        return (this.zzYC3.size() == 1 && this.zzYC3.get(0).getNodeType() == 5) ? "Table" : zzYsN() != null ? zzZMJ.zzZ(zzYsN(), zzYlp().getDocument()) : zzYln();
    }

    public final boolean zzYli() {
        return zzYsN() != null && zzYsN().zzZ6C().zzS(zzXBp);
    }

    public final String zzYlj() {
        return this.zzXX5;
    }

    public final ArrayList<Node> zzYlk() {
        return this.zzYC3;
    }

    public final zzYX5 zzYll() {
        return (zzYX5) com.aspose.words.internal.zzZKW.zzZ(this.zzXBq, zzYX5.class);
    }

    public final zzZV8 zzYlm() {
        return (zzZV8) com.aspose.words.internal.zzZKW.zzZ(this.zzXBq, zzZV8.class);
    }

    public final ArrayList<Node> zzYlo() {
        if (this.zzZ7F == null) {
            this.zzZ7F = new ArrayList<>();
            Iterator<Node> it = this.zzYC3.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Node next = it.next();
                if (next.getNodeType() == 8 && ((Paragraph) next).isEndOfCell()) {
                    if (this.zzYC3.get(0) == next) {
                        com.aspose.words.internal.zzZQG.zzZ(this.zzZ7F, next);
                    }
                } else if (next.getNodeType() != 28) {
                    com.aspose.words.internal.zzZQG.zzZ(this.zzZ7F, next);
                }
            }
        }
        return this.zzZ7F;
    }

    public final Node zzYlp() {
        return this.zzYC3.get(0);
    }

    public final zzZMK zzYsN() {
        return (zzZMK) com.aspose.words.internal.zzZKW.zzZ(this.zzXBq, zzZMK.class);
    }

    public RevisionGroup(ArrayList<Node> arrayList, zzZMK zzzmk) {
        this.zzXBq = new zzZMK((WordAttrCollection) zzzmk.zzZ6C().zzbn(), zzzmk.getAuthor(), zzzmk.zzZx());
        this.zzYC3 = arrayList;
    }

    public RevisionGroup(ArrayList<Node> arrayList, zzYX5 zzyx5, String str) {
        this.zzXBq = new zzYX5(zzyx5.getType(), zzyx5.getAuthor(), zzyx5.zzZx());
        this.zzYC3 = arrayList;
        this.zzXX5 = str;
    }
}
