package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZPN {
    private com.aspose.words.internal.zzZQC<FieldChar> zzYCc = new com.aspose.words.internal.zzZQC<>();
    private ArrayList<Node> zzYCb = new ArrayList<>();
    private ArrayList<zzZ> zzYCa = new ArrayList<>();

    public static class zzZ {
        Node zzYC8;
        Node zzYC9;

        public zzZ(Node node, Node node2) {
            this.zzYC9 = node;
            this.zzYC8 = node2;
        }
    }

    private zzZPN() {
    }

    private void zzT(FieldStart fieldStart) {
        this.zzYCc.push(fieldStart);
    }

    private void zzW(FieldSeparator fieldSeparator) {
        if (!zzZlT()) {
            com.aspose.words.internal.zzZQG.zzZ((ArrayList<FieldSeparator>) this.zzYCb, fieldSeparator);
            return;
        }
        FieldChar fieldCharPop = this.zzYCc.pop();
        if (fieldCharPop.getNodeType() != 22) {
            this.zzYCc.push(fieldCharPop);
            return;
        }
        if (zzZlT()) {
            this.zzYCc.push(fieldSeparator);
        } else if (zzZOO.zzX((FieldStart) fieldCharPop, fieldSeparator)) {
            this.zzYCc.push(fieldCharPop);
        } else {
            com.aspose.words.internal.zzZQG.zzZ(this.zzYCa, new zzZ(fieldCharPop, fieldSeparator));
        }
    }

    public static zzYWB zzZ(zzYWB zzywb, zzZB4 zzzb4) throws Exception {
        if (!zzywb.zzYA1().zzZou()) {
            zzywb.zzYA1().zzZot();
        }
        zzYWI zzywi = new zzYWI(zzywb);
        zzZPN zzzpn = new zzZPN();
        Node next = null;
        while (true) {
            Node node = next;
            Node node2 = node;
            while (zzywi.zzF(true, true)) {
                next = zzywi.next();
                switch (next.getNodeType()) {
                    case 22:
                        FieldStart fieldStart = (FieldStart) next;
                        if (zzzb4.zzU(fieldStart)) {
                            zzzpn.zzT(fieldStart);
                        }
                        break;
                    case 23:
                        FieldSeparator fieldSeparator = (FieldSeparator) next;
                        if (zzzb4.zzU(fieldSeparator)) {
                            zzzpn.zzW(fieldSeparator);
                        }
                        break;
                    case 24:
                        FieldEnd fieldEnd = (FieldEnd) next;
                        if (zzzb4.zzU(fieldEnd)) {
                            zzzpn.zzW(fieldEnd);
                        }
                        break;
                    default:
                        if (zzzpn.zzZlT()) {
                            continue;
                        } else if (node != null) {
                            node2 = next;
                        }
                        break;
                }
            }
            zzzpn.zzZg1();
            zzzpn.zzZC(next);
            if (node != null) {
                return new zzYWB(node, node2);
            }
            return null;
        }
    }

    private void zzZC(Node node) throws Exception {
        FieldChar fieldCharPop;
        if (zzZlT()) {
            do {
                fieldCharPop = this.zzYCc.pop();
            } while (this.zzYCc.size() > 0);
            zzYW0.zzm(fieldCharPop, node);
        }
    }

    private void zzZg1() throws Exception {
        Iterator<Node> it = this.zzYCb.iterator();
        while (it.hasNext()) {
            it.next().remove();
        }
        for (zzZ zzz : this.zzYCa) {
            zzYW0.zzZ(zzz.zzYC9, true, zzz.zzYC8, true, 2);
        }
    }

    private boolean zzZlT() {
        return this.zzYCc.size() > 0;
    }

    private void zzW(FieldEnd fieldEnd) {
        if (zzZlT()) {
            FieldChar fieldCharPop = this.zzYCc.pop();
            if (fieldCharPop.getNodeType() != 22 || zzZlT()) {
                return;
            }
            com.aspose.words.internal.zzZQG.zzZ(this.zzYCa, new zzZ(fieldCharPop, fieldEnd));
            return;
        }
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<FieldEnd>) this.zzYCb, fieldEnd);
    }
}
