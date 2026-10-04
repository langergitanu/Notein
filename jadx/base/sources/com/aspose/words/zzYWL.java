package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYWL {
    private zzZ zzXVN;
    private INodeChangingCallback zzXVO;

    public static class zzZ {
        private zzZ zzXVL;
        private INodeChangingCallback zzXVM;

        public zzZ(INodeChangingCallback iNodeChangingCallback) {
            this.zzXVM = iNodeChangingCallback;
        }

        public final zzZ zzYAQ() {
            return this.zzXVL;
        }

        public final INodeChangingCallback zzYAR() {
            return this.zzXVM;
        }

        public final void zzZ(zzZ zzz) {
            this.zzXVL = zzz;
        }
    }

    private void zzZ(int i, NodeChangingArgs nodeChangingArgs) throws Exception {
        zzZ zzz = this.zzXVN;
        while (zzz != null) {
            zzZ zzzZzYAQ = zzz.zzYAQ();
            zzZ(zzz.zzYAR(), i, nodeChangingArgs);
            zzz = zzzZzYAQ;
        }
        INodeChangingCallback iNodeChangingCallback = this.zzXVO;
        if (iNodeChangingCallback != null) {
            zzZ(iNodeChangingCallback, i, nodeChangingArgs);
        }
    }

    public final boolean isEmpty() {
        return this.zzXVN == null && this.zzXVO == null;
    }

    public final void nodeInserted(NodeChangingArgs nodeChangingArgs) throws Exception {
        zzZ(1, nodeChangingArgs);
    }

    public final void nodeInserting(NodeChangingArgs nodeChangingArgs) throws Exception {
        zzZ(0, nodeChangingArgs);
    }

    public final void nodeRemoved(NodeChangingArgs nodeChangingArgs) throws Exception {
        zzZ(3, nodeChangingArgs);
    }

    public final void nodeRemoving(NodeChangingArgs nodeChangingArgs) throws Exception {
        zzZ(2, nodeChangingArgs);
    }

    public final void zzV(INodeChangingCallback iNodeChangingCallback) {
        this.zzXVO = iNodeChangingCallback;
    }

    public final boolean zzW(INodeChangingCallback iNodeChangingCallback) {
        zzZ zzz = null;
        for (zzZ zzzZzYAQ = this.zzXVN; zzzZzYAQ != null; zzzZzYAQ = zzzZzYAQ.zzYAQ()) {
            if (com.aspose.words.internal.zzZKO.zzA(zzzZzYAQ.zzYAR(), iNodeChangingCallback)) {
                if (zzzZzYAQ == this.zzXVN) {
                    this.zzXVN = zzzZzYAQ.zzYAQ();
                } else {
                    zzz.zzZ(zzzZzYAQ.zzYAQ());
                }
                zzzZzYAQ.zzZ(null);
                return true;
            }
            zzz = zzzZzYAQ;
        }
        return false;
    }

    public final void zzX(INodeChangingCallback iNodeChangingCallback) {
        zzZ zzz = new zzZ(iNodeChangingCallback);
        zzZ zzzZzYAQ = this.zzXVN;
        if (zzzZzYAQ == null) {
            this.zzXVN = zzz;
            return;
        }
        while (zzzZzYAQ.zzYAQ() != null) {
            zzzZzYAQ = zzzZzYAQ.zzYAQ();
        }
        zzzZzYAQ.zzZ(zzz);
    }

    public final INodeChangingCallback zzYAS() {
        return this.zzXVO;
    }

    private static void zzZ(INodeChangingCallback iNodeChangingCallback, int i, NodeChangingArgs nodeChangingArgs) throws Exception {
        if (i == 0) {
            iNodeChangingCallback.nodeInserting(nodeChangingArgs);
            return;
        }
        if (i == 1) {
            iNodeChangingCallback.nodeInserted(nodeChangingArgs);
        } else if (i == 2) {
            iNodeChangingCallback.nodeRemoving(nodeChangingArgs);
        } else {
            if (i == 3) {
                iNodeChangingCallback.nodeRemoved(nodeChangingArgs);
                return;
            }
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: nodeState");
        }
    }
}
