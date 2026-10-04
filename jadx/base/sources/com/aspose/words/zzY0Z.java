package com.aspose.words;

import com.facebook.common.callercontext.ContextChain;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzY0Z {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("tblPrEx", "trPr", "tc", "annotation", "permStart", "permEnd", ContextChain.TAG_PRODUCT);

    public static class zzZ {
        private ArrayList<Node> zzXU8;

        private zzZ() {
        }

        public final void zzW3(Node node) {
            ArrayList<Node> arrayList = this.zzXU8;
            if (arrayList == null || arrayList.size() == 0) {
                return;
            }
            for (int size = this.zzXU8.size() - 1; size >= 0; size--) {
                ((CompositeNode) node).insertAfter(this.zzXU8.get(size), null);
            }
            this.zzXU8.clear();
        }

        public final void zzW4(Node node) {
            if (this.zzXU8 == null) {
                this.zzXU8 = new ArrayList<>();
            }
            com.aspose.words.internal.zzZQG.zzZ(this.zzXU8, node);
        }

        public /* synthetic */ zzZ(byte b) {
            this();
        }
    }

    public static void zzX(zzYVB zzyvb, zzY6G zzy6g) throws Exception {
        zzY6G zzy6g2 = (zzY6G) zzy6g.zzbn();
        Row row = new Row(zzyvb.getDocument(), zzy6g2);
        zzyvb.zzT(row);
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        zzZ zzz = new zzZ((byte) 0);
        String localName = zzyu4ZzZsD.getLocalName();
        while (zzyu4ZzZsD.zzQ(localName)) {
            zzZ(zzyvb, zzy6g2, zzz);
        }
        zzyvb.zztj(6);
        if (zzyvb.zzYyZ().zzZrB()) {
            return;
        }
        zzYUA.zzZ(row, zzyvb.zzXUk);
    }

    private static void zzZ(zzYVB zzyvb, zzY6G zzy6g, zzZ zzz) throws Exception {
        zzYU4 zzyu4ZzZsD = zzyvb.zzZsD();
        if (zzyvb.zzZmj()) {
            zzyvb.zzZ(1, 13, "Violation of i4i's patent #5,787,449. Custom xml will no longer be supported.");
        }
        switch (zzUR.zzTP(zzyu4ZzZsD.getLocalName())) {
            case 0:
                zzY0R.zzW(zzy6g, zzyvb);
                break;
            case 1:
                zzY10.zzZ(zzy6g, zzyvb);
                break;
            case 2:
                zzY11.zzXSu().zzY(zzyvb);
                zzz.zzW3(zzyvb.zzYz7().getLastChild());
                break;
            case 3:
                zzY1U.zzY(zzyvb);
                break;
            case 4:
                zzYVA.zzD(zzyvb);
                break;
            case 5:
                zzYVA.zzC(zzyvb);
                break;
            case 6:
                zzY11.zzXSv().zzL(zzyvb);
                Node lastChild = zzyvb.zzYz7().getLastChild();
                zzz.zzW4(lastChild);
                lastChild.remove();
                break;
            default:
                String localName = zzyu4ZzZsD.getLocalName();
                while (zzyu4ZzZsD.zzQ(localName)) {
                    zzZ(zzyvb, zzy6g, zzz);
                }
                break;
        }
    }
}
