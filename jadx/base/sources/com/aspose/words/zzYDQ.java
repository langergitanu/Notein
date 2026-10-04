package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzYDQ {
    private int zzXoo;
    private zzZ72 zzXop;
    private zzZAI zzYgG;

    public zzYDQ(zzZ72 zzz72, zzZAI zzzai) {
        this.zzXop = zzz72;
        this.zzYgG = zzzai;
    }

    private static zzYAS zzO(zzZ6T zzz6t) {
        int iZz6y = zzz6t.zz6y();
        if (iZz6y == 4 || iZz6y == 8 || iZz6y == 16) {
            while (zzz6t.zz6y() != 32) {
                zzz6t = ((zzTG) zzz6t).zzZXY();
            }
            return (zzYAS) ((zzYMM) zzz6t).zzZ9r();
        }
        if (iZz6y != 32) {
            return null;
        }
        return (zzYAS) ((zzYMM) zzz6t).zzZ9r();
    }

    private static ArrayList<Node> zzP(zzZ6T zzz6t) throws Exception {
        Node nodeZzY67;
        zzYAS zzyasZzO = zzO(zzz6t);
        if (zzyasZzO == null || (nodeZzY67 = zzyasZzO.zzY67()) == null) {
            return null;
        }
        int iZz6y = zzz6t.zz6y();
        if (iZz6y == 4) {
            nodeZzY67 = nodeZzY67.getAncestor(5);
        } else if (iZz6y == 8) {
            nodeZzY67 = nodeZzY67.getAncestor(6);
        } else if (iZz6y == 16) {
            nodeZzY67 = nodeZzY67.getAncestor(7);
        }
        if (nodeZzY67 == null) {
            throw new Exception("document model is invalid");
        }
        ArrayList<Node> arrayList = new ArrayList<>();
        CompositeNode parentNode = nodeZzY67.getParentNode();
        while (true) {
            Node node = (Node) com.aspose.words.internal.zzZKW.zzZ(parentNode, StructuredDocumentTag.class);
            if (node == null) {
                break;
            }
            com.aspose.words.internal.zzZQG.zzZ(arrayList, node);
            parentNode = node.getParentNode();
        }
        if (arrayList.size() > 0) {
            return arrayList;
        }
        return null;
    }

    private void zzWA(Node node) {
        zzWB(node);
        this.zzXoo++;
    }

    private void zzWB(Node node) {
        this.zzYgG.zzZ2n();
        com.aspose.words.internal.zzZS zzzs = new com.aspose.words.internal.zzZS(65536);
        zzzs.setTag(node);
        this.zzXop.zzYTV().zzL(zzzs);
    }

    private void zzZ2(ArrayList<Node> arrayList) {
        if (arrayList != null) {
            zzmH(arrayList.size());
        }
    }

    private void zzZ3(ArrayList<Node> arrayList) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            zzWB(arrayList.get(size));
        }
    }

    private void zzmF(int i) {
        if (zzmG(i)) {
            this.zzXoo -= i;
        }
    }

    private boolean zzmG(int i) {
        this.zzYgG.zzZ2n();
        for (int i2 = 0; i2 < i; i2++) {
            if (this.zzXop.zzYTV().zzYTS().getClass() != com.aspose.words.internal.zzZS.class) {
                return false;
            }
            this.zzXop.zzYTV().zzZI();
        }
        return true;
    }

    private void zzmH(int i) {
        this.zzYgG.zzZ2n();
        for (int i2 = 0; i2 < i; i2++) {
            this.zzXop.zzYTV().zzZI();
        }
    }

    public final void zzV(zzZ6U zzz6u) {
        if (((zzZ55) zzz6u.zzYgm).zzYTn() || !((zzZ55) zzz6u.zzYgm).zzYnY()) {
            return;
        }
        zzYR7();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzW(zzZ6U zzz6u) {
        if (((zzZ55) zzz6u.zzYgm).zzYTm() || !((zzZ55) zzz6u.zzYgm).zzYnZ()) {
            return;
        }
        com.aspose.words.internal.zzZQC zzzqc = new com.aspose.words.internal.zzZQC();
        com.aspose.words.internal.zzZQC zzzqc2 = new com.aspose.words.internal.zzZQC();
        for (zzYAU zzyau = (zzYAU) ((zzYAU) ((zzZ55) zzz6u.zzYgm).zz6x()).zzYo0(); zzyau != null && (zzyau.zza9() == ((zzZ55) zzz6u.zzYgm).zza9() || !zzyau.zzY6X()); zzyau = (zzYAU) zzyau.zzYo0()) {
            zzY9Y zzy9y = (zzY9Y) com.aspose.words.internal.zzZKW.zzZ(zzyau, zzY9Y.class);
            if (zzy9y != null) {
                if (zzy9y.zzZ1s() == 3) {
                    zzzqc.push(zzy9y);
                } else if (zzzqc.size() > 0) {
                    zzzqc.pop();
                } else {
                    zzzqc2.push(zzy9y);
                }
            }
        }
        while (zzzqc2.size() > 0) {
            zzWA(((zzY9Y) zzzqc2.pop()).zzYRv());
        }
    }

    public final void zzY(zzZ6N zzz6n) throws Exception {
        zzZ2(zzP(zzz6n.zzYSe()));
    }

    public final void zzYR7() {
        int i = this.zzXoo;
        if (i > 0) {
            zzmF(i);
        }
    }

    public final void zzZ(zzZ6N zzz6n) throws Exception {
        zzZ3(zzP(zzz6n.zzYSe()));
    }

    public final void zzY(zzZ70 zzz70) throws Exception {
        zzZ2(zzP(((zzWT) zzz70.zzYgm).zza9()));
    }

    public final void zzZ(zzZ66 zzz66) {
        zzY9Y zzy9y = (zzY9Y) com.aspose.words.internal.zzZKW.zzZ(zzz66.zz14(), zzY9Y.class);
        if (zzy9y.zzZ1s() == 2) {
            zzWA(zzy9y.zzYRv());
            return;
        }
        zzy9y.zzZ1s();
        if (zzy9y.zzYRv().getLevel() != 1 || this.zzXoo == 0) {
            return;
        }
        zzmF(1);
    }

    public final void zzY(zzZ63 zzz63) throws Exception {
        zzZ2(zzP((zzY6N) ((zzYIC) ((zzYIA) zzz63.zzYgm).zza9()).zza9()));
    }

    public final void zzZ(zzZ70 zzz70) throws Exception {
        zzZ3(zzP(((zzWT) zzz70.zzYgm).zza9()));
    }

    public final void zzZ(zzZ6M zzz6m) throws Exception {
        zzZ3(zzP(((zzYIA) zzz6m.zzYgm).zza9()));
    }

    public final void zzZ(zzZ63 zzz63) throws Exception {
        zzZ3(zzP((zzY6N) ((zzYIC) ((zzYIA) zzz63.zzYgm).zza9()).zza9()));
    }

    public final void zzW(zzZ6M zzz6m) throws Exception {
        zzZ2(zzP(((zzYIA) zzz6m.zzYgm).zza9()));
    }
}
