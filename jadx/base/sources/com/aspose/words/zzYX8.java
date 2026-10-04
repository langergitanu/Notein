package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYX8 extends DocumentVisitor {
    private zzYX9 zzXX0;
    private zzYX6 zzXX1;
    private int zzXX2;
    private boolean zzXX3;
    private int zzXX4;
    private String zzXX5;
    private boolean zzZCF;

    private zzYX8(int i, boolean z) {
        this.zzXX4 = i;
        this.zzZCF = z;
        this.zzXX5 = "";
        this.zzXX3 = false;
        this.zzXX2 = 1;
    }

    public static zzYX6 zzE(Node node, boolean z) {
        zzYX6 zzyx6;
        int i = z ? 15 : 13;
        if (!node.isComposite() || (zzyx6 = (zzYX6) ((CompositeNode) node).getChild(i, -1, true)) == null) {
            return (zzYX6) node.zzN(node.getDocument(), i);
        }
        zzYX9 zzyx9ZzO = zzO(node.getDocument(), zzyx6.getId());
        if (zzyx9ZzO == null || zzyx9ZzO.zzYF(node)) {
            return null;
        }
        return zzyx6;
    }

    public static zzYXA zzF(Node node, boolean z) {
        return new zzYXA(node, z);
    }

    public static zzYX9 zzO(Node node, int i) {
        try {
            if (node == null) {
                throw new NullPointerException("Value cannot be null.\r\nParameter name: node");
            }
            zzYX8 zzyx8 = new zzYX8(i, false);
            node.accept(zzyx8);
            return zzyx8.zzXX0;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static zzYX6 zzP(Node node, int i) {
        try {
            zzYX8 zzyx8 = new zzYX8(i, true);
            node.accept(zzyx8);
            return zzyx8.zzXX1;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static zzYX6 zzY(Node node, String str, int i) {
        try {
            zzYX8 zzyx8 = new zzYX8(str, i);
            node.accept(zzyx8);
            return zzyx8.zzXX1;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int zzZ(zzYX6 zzyx6) {
        if (!this.zzZCF) {
            return 0;
        }
        if ((this.zzXX3 || this.zzXX4 != zzyx6.getId()) && !(this.zzXX3 && this.zzXX2 == 0 && com.aspose.words.internal.zzZKN.equals(this.zzXX5, zzyx6.getName()))) {
            return 0;
        }
        this.zzXX1 = zzyx6;
        return 2;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int zzY(zzYX6 zzyx6) {
        if (!this.zzZCF) {
            return 0;
        }
        if ((this.zzXX3 || this.zzXX4 != zzyx6.getId()) && !(this.zzXX3 && this.zzXX2 == 1 && com.aspose.words.internal.zzZKN.equals(this.zzXX5, zzyx6.getName()))) {
            return 0;
        }
        this.zzXX1 = zzyx6;
        return 2;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int zzZ(zzYX9 zzyx9) {
        if (this.zzZCF || this.zzXX4 != zzyx9.getId()) {
            return 0;
        }
        this.zzXX0 = zzyx9;
        return 2;
    }

    private zzYX8(String str, int i) {
        this.zzXX4 = -1;
        this.zzZCF = true;
        this.zzXX5 = str;
        this.zzXX3 = true;
        this.zzXX2 = i;
    }

    @Override // com.aspose.words.DocumentVisitor
    public final int zzY(zzYX9 zzyx9) {
        if (this.zzZCF || this.zzXX4 != zzyx9.getId()) {
            return 0;
        }
        this.zzXX0 = zzyx9;
        return 2;
    }
}
