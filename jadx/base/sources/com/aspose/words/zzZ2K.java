package com.aspose.words;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ2K implements zzZA5 {
    private HashMap<Node, Node> zzY5B;
    private ArrayList<Node> zzY5C;

    public static class zzZ extends zzZQF {
        private zzZ2K zzY5A;

        public zzZ(zzZ2K zzz2k) {
            this.zzY5A = zzz2k;
        }

        private boolean zzYJS() {
            int iZzZe6 = zzZe6();
            if (iZzZe6 == 38 || iZzZe6 == 39) {
                return zzZOP.zzl(zzZe7());
            }
            return false;
        }

        @Override // com.aspose.words.zzZQF
        public final void zzZe8() {
            if (zzYJS()) {
                if (this.zzY5A.zzY5C == null) {
                    this.zzY5A.zzY5C = new ArrayList();
                }
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<FieldStart>) this.zzY5A.zzY5C, zzZe7().getStart());
            }
        }
    }

    @Override // com.aspose.words.zzZA5
    public final void zzW(Node node, Node node2) {
        if (this.zzY5C == null) {
            return;
        }
        HashMap<Node, Node> map = this.zzY5B;
        Node node3 = map != null ? (Node) com.aspose.words.internal.zzQW.zzZ(map, node) : null;
        if (node3 != null) {
            node = node3;
        } else if (!this.zzY5C.contains(node)) {
            return;
        }
        if (this.zzY5B == null) {
            this.zzY5B = new HashMap<>();
        }
        this.zzY5B.put(node2, node);
    }

    public final void zzYJT() {
        this.zzY5C = null;
        this.zzY5B = null;
    }

    public final Node zzYS(Node node) {
        HashMap<Node, Node> map = this.zzY5B;
        if (map == null || !map.containsKey(node)) {
            return null;
        }
        return this.zzY5B.get(node);
    }

    public final void zzj(Document document) {
        new zzZ(this).zzZQ(document);
    }
}
