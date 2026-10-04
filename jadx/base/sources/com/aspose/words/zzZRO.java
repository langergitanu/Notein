package com.aspose.words;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzZRO {
    private Map<Node, zzZRS> zzYHR;
    private DocumentBuilder zzYHS;

    private static zzZRS zz0(Node node) {
        if (node.getNodeType() == 37) {
            return (zzZRS) com.aspose.words.internal.zzZKW.zzZ(node, zzZRS.class);
        }
        return null;
    }

    public static boolean zz1(Node node) {
        zzZRL zzzrl = (zzZRL) zzU(node, 5);
        if (zzzrl != null) {
            return zzzrl.zzZh6().getSdtType() == 5 || zzzrl.zzZh6().getSdtType() == 4;
        }
        return false;
    }

    public static boolean zz2(Node node) {
        zzZRL zzzrl = (zzZRL) zzU(node, 5);
        return zzzrl != null && zzzrl.zzZh6().getSdtType() == 13;
    }

    public static Node zz3(Node node) {
        return zzV(node, 4);
    }

    public static Node zz4(Node node) {
        return zzV(node, 0);
    }

    public static ChartSeries zz5(Node node) {
        zzZRS zzzrsZzU = zzU(node, 2);
        if (zzzrsZzU != null) {
            return ((zzZRV) zzzrsZzU).zzZhd();
        }
        return null;
    }

    public static zzCU zz6(Node node) {
        zzZRS zzzrsZzU = zzU(node, 3);
        if (zzzrsZzU != null) {
            return ((zzZRT) zzzrsZzU).zzZhc();
        }
        return null;
    }

    public static zzCU zz7(Node node) {
        zzZRS zzzrsZzU = zzU(node, 1);
        if (zzzrsZzU != null) {
            return ((zzZRT) zzzrsZzU).zzZhc();
        }
        return null;
    }

    private void zzR(Node node, boolean z) {
        zzZRS zzzrs;
        Map<Node, zzZRS> map = this.zzYHR;
        if (map == null || (zzzrs = (zzZRS) com.aspose.words.internal.zzQW.zzZ((Map<Node, TValue>) map, node)) == null) {
            return;
        }
        zzZ(zzzrs, z);
    }

    private static zzZRS zzU(Node node, int i) {
        while (node != null) {
            zzZRS zzzrsZz0 = zz0(node);
            if (zzzrsZz0 != null && zzzrsZz0.zzZhe() == i) {
                return zzzrsZz0;
            }
            node = node.getParentNode();
        }
        return null;
    }

    private static Node zzV(Node node, int i) {
        zzZRS zzzrsZzU = zzU(node, i);
        if (zzzrsZzU != null) {
            return zzzrsZzU.zzZhf();
        }
        return null;
    }

    private void zzZ(zzZRS zzzrs) {
        zzZh8().appendChild(zzzrs);
        this.zzYHR.put(zzzrs.zzZhf(), zzzrs);
    }

    private Map<Node, zzZRS> zzZh7() {
        if (this.zzYHR == null) {
            this.zzYHR = new HashMap();
        }
        return this.zzYHR;
    }

    private Document zzZh8() {
        try {
            if (this.zzYHS == null) {
                this.zzYHS = new DocumentBuilder();
            }
            return this.zzYHS.getDocument();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void zza(Node node) {
        zzZRS zzzrs = (zzZRS) node.getAncestor(zzZRS.class);
        if (zzzrs != null) {
            zzzrs.zzZz9();
        }
    }

    public static Node zzb(Node node) {
        zzZRS zzzrsZz0 = zz0(node);
        if (zzzrsZz0 != null) {
            return zzzrsZz0.zzZhf();
        }
        return null;
    }

    private Node zzc(Node node) {
        if (node.getNodeType() != 28) {
            return null;
        }
        StructuredDocumentTag structuredDocumentTag = (StructuredDocumentTag) node;
        zzZRS zzzrs = (zzZRS) com.aspose.words.internal.zzQW.zzZ((Map<Node, TValue>) zzZh7(), node);
        if (zzzrs != null) {
            return zzzrs;
        }
        zzZRN zzzrn = new zzZRN(zzZh8(), structuredDocumentTag);
        zzZ(zzzrn);
        return zzzrn;
    }

    private Node zzd(Node node) {
        if (node.getNodeType() != 18) {
            return null;
        }
        Shape shape = (Shape) node;
        if (!shape.hasChart()) {
            return null;
        }
        zzZRS zzzrs = (zzZRS) com.aspose.words.internal.zzQW.zzZ((Map<Node, TValue>) zzZh7(), node);
        if (zzzrs != null) {
            return zzzrs;
        }
        zzZRX zzzrx = new zzZRX(zzZh8(), shape);
        zzZ(zzzrx);
        return zzzrx;
    }

    public final void zz8(Node node) {
        zzR(node, false);
    }

    public final void zz9(Node node) {
        zzR(node, true);
    }

    public final void zzEQ() {
        if (this.zzYHS == null) {
            return;
        }
        Node firstChild = zzZh8().getFirstChild();
        while (firstChild != null) {
            Node nextSibling = firstChild.getNextSibling();
            zzZRS zzzrsZz0 = zz0(firstChild);
            if (zzzrsZz0 != null && !zzzrsZz0.zzZhf().isRemoved()) {
                zzZ(zzzrsZz0, true);
            }
            firstChild = nextSibling;
        }
    }

    public final DocumentBuilder zzZh9() {
        return this.zzYHS;
    }

    public final Node zze(Node node) {
        node.isComposite();
        Node nodeZzd = zzd(node);
        return nodeZzd != null ? nodeZzd : zzc(node);
    }

    public final Node zzZ(Node node, boolean z, zzYW9 zzyw9) {
        return zzZ(node, z, true, zzyw9);
    }

    private Node zzZ(Node node, boolean z, boolean z2, zzYW9 zzyw9) {
        Node nodeZze;
        Node nodeDeepClone = node.deepClone(false);
        if (zzyw9 != null) {
            zzyw9.zzW(node, nodeDeepClone);
        }
        if (z && node.isComposite()) {
            CompositeNode compositeNode = (CompositeNode) nodeDeepClone;
            for (Node firstChild = ((CompositeNode) node).getFirstChild(); firstChild != null; firstChild = firstChild.getNextSibling()) {
                compositeNode.zzA(zzZ(firstChild, true, z2, zzyw9));
            }
        }
        if (z2 && node.isComposite() && (nodeZze = zze(node)) != null) {
            zzZRS zzzrs = (zzZRS) zzZ(nodeZze, true, false, zzyw9);
            zzzrs.zzf(nodeDeepClone);
            zzZ(zzzrs);
        }
        return nodeDeepClone;
    }

    private void zzZ(zzZRS zzzrs, boolean z) {
        if (z) {
            zzzrs.zzZz9();
        }
        zzzrs.remove();
        com.aspose.words.internal.zzZQF.zzY(this.zzYHR, zzzrs.zzZhf());
    }
}
