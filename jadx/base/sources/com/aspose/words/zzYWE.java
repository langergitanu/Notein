package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
class zzYWE {
    private ArrayList<Node> zzXK;
    private zzVD zzXVb;
    private Node zzYz2;
    private int zzXVf = -1;
    private int zzXVe = -1;
    private zzYWF zzXVd = new zzYWF();
    private StringBuilder zzXVc = new StringBuilder();

    public zzYWE(Node node) {
        this.zzYz2 = node;
    }

    private int zzL(Node node, int i) throws Exception {
        int iZzG = zzG(node);
        int i2 = 0;
        if (iZzG == 1) {
            return 0;
        }
        if (iZzG == 3) {
            String strZzF = zzF(node);
            zzZ(i, node, strZzF);
            return strZzF.length();
        }
        if (!node.isComposite()) {
            if (iZzG == 2) {
                return 0;
            }
            String strZzF2 = zzF(node);
            if (strZzF2.length() > 0) {
                zzZ(i, node, strZzF2);
            }
            return strZzF2.length();
        }
        CompositeNode compositeNode = (CompositeNode) node;
        Iterator<T> it = compositeNode.getChildNodes(0, false).iterator();
        while (it.hasNext()) {
            int iZzL = zzL((Node) it.next(), i);
            i += iZzL;
            i2 += iZzL;
        }
        if (zzG(compositeNode) != 2) {
            String strZzX = zzX(compositeNode);
            if (strZzX.length() > 0) {
                zzZ(i, compositeNode, strZzX);
                return strZzX.length() + i2;
            }
        }
        return i2;
    }

    private void zzYAe() {
        this.zzXVe = -1;
        this.zzXVf = -1;
    }

    private int zztu(int i) {
        int count = this.zzXVd.getCount();
        int i2 = 0;
        while (i2 <= count) {
            int i3 = (i2 + count) >> 1;
            int iZzT3 = this.zzXVd.zzT3(i3);
            int i4 = i3 + 1;
            int iZzT32 = i4 < this.zzXVd.getCount() ? this.zzXVd.zzT3(i4) : Integer.MAX_VALUE;
            if (i < iZzT3) {
                count = i3 - 1;
            } else {
                if (i < iZzT32) {
                    return i3;
                }
                i2 = i4;
            }
        }
        return 0;
    }

    private int zztv(int i) {
        if (i != this.zzXVf) {
            this.zzXVf = i;
            this.zzXVe = zztu(i);
        }
        return this.zzXVe;
    }

    public final void update() throws Exception {
        int iZzL = 0;
        this.zzXVc.setLength(0);
        this.zzXVb = null;
        this.zzXVd.clear();
        zzYAe();
        ArrayList<Node> arrayList = this.zzXK;
        if (arrayList == null) {
            zzL(this.zzYz2, 0);
            return;
        }
        for (Node node : arrayList) {
            this.zzYz2 = node;
            iZzL += zzL(node, iZzL);
        }
    }

    public String zzF(Node node) {
        return node.getText();
    }

    public int zzG(Node node) throws Exception {
        return 0;
    }

    public final void zzX(int i, Node node) {
        this.zzXVd.add(i, node);
        zzYAe();
    }

    public final void zzY(int i, Node node, String str) {
        this.zzXVd.zzWz(i, str.length());
        this.zzXVd.add(i, node);
        this.zzXVb.insert(i, str);
        zzYAe();
    }

    public final Node zzYAb() {
        return this.zzYz2;
    }

    public final zzVD zzYAc() {
        if (this.zzXVb == null) {
            this.zzXVb = new zzVD(this.zzXVc.toString());
        }
        return this.zzXVb;
    }

    public final com.aspose.words.internal.zzZYV<Node> zzYAd() {
        return this.zzXVd;
    }

    public final void zzZ(int i, int i2, Node node) {
        this.zzXVd.zzZ(i, i2, node);
        zzYAe();
    }

    public final int zztw(int i) {
        return this.zzXVd.zzT3(zztv(i));
    }

    public final Node zztx(int i) {
        return this.zzXVd.zzVY(zztv(i));
    }

    public String zzX(CompositeNode compositeNode) {
        return compositeNode.zzZYp();
    }

    public void zzZ(int i, Node node, String str) {
        com.aspose.words.internal.zzZNH.zzU(this.zzXVc, str);
        this.zzXVd.add(i, node);
    }

    public zzYWE(ArrayList<Node> arrayList) {
        this.zzXK = arrayList;
    }
}
