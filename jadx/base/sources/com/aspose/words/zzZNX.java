package com.aspose.words;

import OooOoo.C20593OooO0Oo;

/* JADX INFO: loaded from: classes6.dex */
final class zzZNX {
    private boolean zzYDe;
    private IReplacingCallback zzYyL;
    private String zzYyM;
    private com.aspose.words.internal.zzZNR zzYz0;
    private Node zzYz2;
    private DocumentBase zzZG3;
    private static char[] zzYyO = {1, 2, 3, 4, 7, '\f', ControlChar.PARAGRAPH_BREAK_CHAR, ControlChar.FIELD_START_CHAR, ControlChar.FIELD_SEPARATOR_CHAR, ControlChar.FIELD_END_CHAR};
    private static char[] zzYyN = {1, 2, 3, 4, 7, ControlChar.PARAGRAPH_BREAK_CHAR, ControlChar.FIELD_START_CHAR, ControlChar.FIELD_SEPARATOR_CHAR, ControlChar.FIELD_END_CHAR};

    public static class zzZ {
        private int zzYyJ;
        private Run zzYyK;

        private zzZ() {
        }

        public final void zzBG(int i) {
            this.zzYyJ = i;
        }

        public final void zzS(Run run) {
            this.zzYyK = run;
        }

        public final int zzZ9v() {
            return this.zzYyJ;
        }

        public final Run zzZ9w() {
            return this.zzYyK;
        }

        public /* synthetic */ zzZ(byte b) {
            this();
        }
    }

    public zzZNX(Node node, com.aspose.words.internal.zzZNR zzznr, String str, IReplacingCallback iReplacingCallback, boolean z) {
        zzZe(node);
        zzY(zzznr);
        setReplacement(str);
        this.zzYyL = iReplacingCallback;
        this.zzYDe = z;
        this.zzZG3 = node.getDocument();
    }

    private void setReplacement(String str) {
        if (str == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: value");
        }
        if (com.aspose.words.internal.zzZKN.zzZ(str, zzYyN) != -1) {
            throw new IllegalArgumentException("The replace string cannot contain special or break characters.");
        }
        this.zzYyM = str;
    }

    private static com.aspose.words.internal.zzZNR zzU(String str, boolean z, boolean z2) {
        String strZzUU = com.aspose.words.internal.zzZNR.zzUU(str);
        if (z2) {
            strZzUU = C20593OooO0Oo.OooO0O0("\\b", strZzUU, "\\b");
        }
        return new com.aspose.words.internal.zzZNR(strZzUU, z ? 0 : 66);
    }

    private void zzY(com.aspose.words.internal.zzZNR zzznr) {
        if (zzznr == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: value");
        }
        if ("".equals(zzznr.toString())) {
            throw new IllegalArgumentException("The search string cannot be empty.");
        }
        this.zzYz0 = zzznr;
    }

    private int zzZ(ReplacingArgs replacingArgs, zzYWE zzywe) throws Exception {
        int iZzZq4 = this.zzYz2.getDocument().zzZq4();
        int iReplacing = this.zzYyL.replacing(replacingArgs);
        if (this.zzYz2.getDocument().zzZq4() == iZzZq4) {
            return iReplacing;
        }
        if (this.zzYDe) {
            throw new IllegalStateException("Cannot perform further replacements since the document has been changed.");
        }
        zzywe.update();
        return iReplacing;
    }

    private void zzZe(Node node) {
        if (node == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: value");
        }
        this.zzYz2 = node;
    }

    public final int zzZ9D() throws Exception {
        com.aspose.words.internal.zzZNS zzznsZzUW = this.zzYz0.zzUW(this.zzYz2.getText());
        zzYWE zzywe = new zzYWE(this.zzYz2);
        zzywe.update();
        int count = zzznsZzUW.getCount();
        boolean z = this.zzYDe;
        int i = z ? 1 : -1;
        int count2 = z ? 0 : zzznsZzUW.getCount() - 1;
        zzZ zzZ2 = null;
        int i2 = 0;
        int iZzZ9v = 0;
        while (true) {
            if (count <= 0) {
                break;
            }
            com.aspose.words.internal.zzZNT zzzntZzQw = zzznsZzUW.zzQw(count2);
            if (zzzntZzQw.getLength() > 0) {
                int index = zzzntZzQw.getIndex() - zzywe.zztw(zzzntZzQw.getIndex());
                Node nodeZztx = zzywe.zztx(zzzntZzQw.getIndex());
                if (this.zzYDe && zzZ2 != null && zzZ2.zzZ9w() == nodeZztx) {
                    iZzZ9v += zzZ2.zzZ9v();
                    index += iZzZ9v;
                } else {
                    iZzZ9v = 0;
                }
                ReplacingArgs replacingArgs = new ReplacingArgs(zzzntZzQw, nodeZztx, index, this.zzYyM);
                int iZzZ = this.zzYyL != null ? zzZ(replacingArgs, zzywe) : 0;
                if (iZzZ == 0) {
                    zzZ2 = zzZ(replacingArgs);
                    i2++;
                } else if (iZzZ != 1) {
                    if (iZzZ != 2) {
                        throw new IllegalStateException("Unknown replace action.");
                    }
                }
            }
            count2 += i;
            count--;
        }
        return i2;
    }

    private zzZ zzZ(ReplacingArgs replacingArgs) {
        zzZ zzz = new zzZ((byte) 0);
        zzY81 zzy81 = new zzY81(this.zzZG3);
        try {
            com.aspose.words.internal.zzZNV zzznvZzQx = replacingArgs.zzYlS().zzhJ().zzQx(replacingArgs.getGroupIndex());
            if (com.aspose.words.internal.zzZKN.zzZ(zzznvZzQx.getValue(), zzYyO) == -1) {
                Run run = (Run) replacingArgs.getMatchNode();
                int length = zzznvZzQx.getLength();
                int matchOffset = replacingArgs.getMatchOffset();
                Run run2 = run;
                while (length > 0) {
                    int iMin = Math.min(run2.zz0R() - matchOffset, length);
                    run2.setText(com.aspose.words.internal.zzZKN.zzT(run2.getText(), matchOffset, iMin));
                    length -= iMin;
                    zzz.zzS(run2);
                    zzz.zzBG(-iMin);
                    Node nodeNextPreOrder = run2;
                    do {
                        nodeNextPreOrder = nodeNextPreOrder.nextPreOrder(this.zzYz2);
                        if (nodeNextPreOrder == null) {
                            break;
                        }
                    } while (nodeNextPreOrder.getNodeType() != 21);
                    if (run2 != run && "".equals(run2.getText())) {
                        run2.remove();
                    }
                    run2 = (Run) nodeNextPreOrder;
                    matchOffset = 0;
                }
                run.setText(com.aspose.words.internal.zzZKN.zzV(run.getText(), replacingArgs.getMatchOffset(), replacingArgs.getReplacement()));
                if ("".equals(run.getText())) {
                    run.remove();
                }
                if (zzz.zzZ9w() == run) {
                    zzz.zzBG(replacingArgs.getReplacement().length() - zzznvZzQx.getLength());
                }
                zzy81.dispose();
                return zzz;
            }
            throw new UnsupportedOperationException("The match includes one or more special or break characters and cannot be replaced.");
        } catch (Throwable th) {
            zzy81.dispose();
            throw th;
        }
    }

    public zzZNX(Node node, String str, String str2, boolean z, boolean z2) {
        this(node, zzU(str, z, z2), str2, (IReplacingCallback) null, false);
    }
}
