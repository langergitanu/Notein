package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYE3 {
    private int zzUt;
    private com.aspose.words.internal.zzDB zzXpA;
    private com.aspose.words.internal.zz7D<zzYAU> zzXpB;
    private Node zzYR6;
    private zzZ55 zzYeg;
    private Paragraph zzYtC;
    private ArrayList<Node> zzYtn;

    private static int zzWC(Node node) {
        int nodeType = node.getNodeType();
        if (nodeType == 17 || nodeType == 18) {
            return 1;
        }
        if (nodeType == 35) {
            return zzZYO.zzZ((OfficeMath) node);
        }
        if (nodeType != 38) {
            switch (nodeType) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    switch (nodeType) {
                        case 20:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                            return 1;
                        case 21:
                            return node.zz0R();
                        default:
                            return -1;
                    }
            }
        }
        throw new IllegalStateException();
    }

    private void zzYdm() throws Exception {
        zzZ4N zzz4nZzYPe = this.zzYeg.zzaa().zzY4s().zzYPe();
        ArrayList arrayList = new ArrayList();
        zzz4nZzYPe.zzX(((zzYMM) this.zzYeg.zza9()).zzZ9r());
        zzYAS zzyas = (zzYAS) zzz4nZzYPe.zzYPi();
        int length = 0;
        arrayList.add(0, zzyas.zzY67());
        while (true) {
            if (!zzz4nZzYPe.movePrevious()) {
                break;
            }
            zzYAU zzyau = (zzYAU) zzz4nZzYPe.zzYPi();
            zzYAS zzyas2 = (zzYAS) com.aspose.words.internal.zzZKW.zzZ(zzyau, zzYAS.class);
            if (zzyas2 != null && zzY9R.zzmO(zzyas2.zzZo6())) {
                if (!zzyau.zzY6Z()) {
                    zzz4nZzYPe.moveNext();
                    break;
                }
                arrayList.add(0, zzyas2.zzY67());
            }
        }
        if (zzz4nZzYPe.zz13()) {
            zzz4nZzYPe.zz0Z();
        }
        this.zzXpB = new com.aspose.words.internal.zz7D<>();
        do {
            zzYAU zzyau2 = (zzYAU) zzz4nZzYPe.zzYPi();
            this.zzXpB.zzP(zzyau2, length);
            if ((!(zzyau2 instanceof zzYAS) || zzY9R.zzmV(zzyau2.zzZo6())) && !zzyau2.zzY7w()) {
                length += zzyau2.getLength();
            }
            if (zzz4nZzYPe.zzYPi() == zzyas) {
                break;
            }
        } while (zzz4nZzYPe.moveNext());
        this.zzYtn = new ArrayList<>();
        this.zzXpA = new com.aspose.words.internal.zzDB();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zzYp((Paragraph) ((Node) it.next()));
        }
    }

    private void zzYp(Paragraph paragraph) {
        zzZYT zzzyt = new zzZYT(paragraph);
        while (true) {
            Paragraph paragraph2 = paragraph;
            if (!zzzyt.zzZ(paragraph2, true, true, false, false, false)) {
                return;
            }
            Node node = zzzyt.getNode();
            int iZzWC = zzWC(node);
            if (iZzWC >= 0) {
                int nodeType = node.getNodeType();
                if (nodeType == 17 || nodeType == 18 || nodeType == 35) {
                    zzzyt.zzZor();
                }
                if (iZzWC > 0) {
                    com.aspose.words.internal.zzZQG.zzZ(this.zzYtn, node);
                    this.zzXpA.add(iZzWC);
                }
            }
            paragraph = paragraph2;
        }
    }

    public final Node getNode() {
        return this.zzYR6;
    }

    public final int getOffset() {
        return this.zzUt;
    }

    public final void zzZ(zzZ55 zzz55, Paragraph paragraph) throws Exception {
        int length;
        zzz55.zzYTn();
        zzZ55 zzz552 = this.zzYeg;
        if (zzz552 != null) {
            zzz552.zza9();
            zzz55.zza9();
        }
        zzZ55 zzz553 = this.zzYeg;
        if (zzz553 == zzz55) {
            return;
        }
        int i = 0;
        boolean z = zzz553 == null || zzz553.zza9() != zzz55.zza9();
        this.zzYeg = zzz55;
        this.zzYtC = paragraph;
        if (z) {
            zzYdm();
        }
        zzYAU zzyau = (zzYAU) zzz55.zz6w();
        while (true) {
            if (zzyau == null) {
                length = 0;
                break;
            }
            int i2 = this.zzXpB.get(zzyau);
            if (!com.aspose.words.internal.zz7D.zzWm(i2)) {
                length = i2 + zzyau.getLength();
                break;
            }
            zzyau = (zzYAU) zzyau.zz5Y();
        }
        this.zzYR6 = null;
        this.zzUt = 0;
        int size = this.zzYtn.size();
        int i3 = 0;
        while (i < size) {
            int i4 = this.zzXpA.get(i);
            int i5 = i3 + i4;
            if (i5 >= length) {
                this.zzYR6 = this.zzYtn.get(i);
                int i6 = length - i3;
                this.zzUt = i6;
                if (i6 == i4) {
                    this.zzUt = -1;
                    return;
                }
                return;
            }
            i++;
            i3 = i5;
        }
    }
}
