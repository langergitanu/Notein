package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzY55 implements zzZA2 {
    private int zzX2a;
    private boolean zzX2b;
    private boolean zzX2c;
    private boolean zzX2f;
    private Run zzX2g;
    private boolean zzYBC;
    private ArrayList<Run> zzX2e = new ArrayList<>();
    private int zzX2d = -1;

    public zzY55(boolean z, boolean z2, int i, boolean z3) {
        this.zzX2c = z;
        this.zzX2b = z2;
        this.zzX2a = i;
        this.zzYBC = z3;
    }

    private boolean zzXI(char c) {
        return c == 11 && !this.zzX2b;
    }

    private void zzXUS() {
        this.zzX2f = true;
        this.zzX2e.clear();
        this.zzX2d = -1;
    }

    private void zzXUT() {
        Run run = this.zzX2g;
        if (run == null || run.getParentNode() == null) {
            return;
        }
        int iZzT = com.aspose.words.internal.zzZKN.zzT(this.zzX2g.getText(), ControlChar.TAB, com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8);
        this.zzX2g.zznf(iZzT + 1);
        this.zzX2g.zzng(iZzT);
        if (this.zzX2g.getFont().getStyleIdentifier() == 85) {
            this.zzX2g.zzZYh().remove(50);
        }
        zzZQ3.zzZ(this.zzX2g, this.zzX2a, this.zzYBC);
    }

    private void zzXUU() {
        int i;
        for (int i2 = 0; i2 < this.zzX2e.size(); i2++) {
            Run run = this.zzX2e.get(i2);
            if (i2 != 0 || (i = this.zzX2d) == 0) {
                run.remove();
            } else {
                run.zzG(0, i, false);
            }
        }
    }

    private void zzs(Run run) {
        if (this.zzX2f) {
            boolean z = false;
            for (int i = 0; i < run.getText().length(); i++) {
                if (com.aspose.words.internal.zzZYD.zzZ1(run.getText().charAt(i))) {
                    if (this.zzX2d == -1) {
                        this.zzX2d = i;
                    }
                    z = true;
                } else {
                    zzXUS();
                    z = false;
                }
            }
            if (z) {
                com.aspose.words.internal.zzZQG.zzZ(this.zzX2e, run);
            }
        }
    }

    private Run zzt(Run run) {
        if (this.zzX2f) {
            return run;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i < run.getText().length()) {
                if (!com.aspose.words.internal.zzZYD.zzZ1(run.getText().charAt(i))) {
                    zzXUS();
                    break;
                }
                i2++;
                i++;
            } else {
                break;
            }
        }
        if (i2 == run.getText().length()) {
            return null;
        }
        if (i2 > 0) {
            run.setText(com.aspose.words.internal.zzZKN.zzT(run.getText(), 0, i2));
        }
        return run;
    }

    private Run zzu(Run run) {
        Run runZzt = zzt(run);
        zzs(runZzt);
        return runZzt;
    }

    private void zzv(Run run) {
        if (run == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < run.getText().length(); i++) {
            char cCharAt = run.getText().charAt(i);
            if (cCharAt != '\f' && cCharAt != 14) {
                boolean zZzZ = zzZ(cCharAt, run);
                boolean zZzXI = zzXI(cCharAt);
                if (zZzZ || zZzXI) {
                    sb.append(ControlChar.SPACE_CHAR);
                } else {
                    sb.append(cCharAt);
                }
            }
        }
        run.setText(sb.toString());
    }

    public final void zzXUV() {
        zzXUU();
        zzXUT();
    }

    @Override // com.aspose.words.zzZA2
    public final Node zzZ(Node node, Node node2, boolean z, zzZA5 zzza5) {
        int nodeType;
        Inline inline = (Inline) com.aspose.words.internal.zzZKW.zzZ(node, Inline.class);
        if ((inline == null || !inline.zzYUU()) && (nodeType = node2.getNodeType()) != 33 && nodeType != 34) {
            switch (nodeType) {
                case 17:
                case 18:
                    if (!((ShapeBase) node2).isInline()) {
                        return null;
                    }
                    zzXUS();
                    return node2;
                case 19:
                case 20:
                    break;
                case 21:
                    Run runZzu = zzu((Run) node2);
                    zzv(runZzu);
                    return runZzu;
                default:
                    zzXUS();
                    return node2;
            }
        }
        return null;
    }

    private boolean zzZ(char c, Run run) {
        if (c != '\t' || this.zzX2c) {
            return false;
        }
        if (this.zzX2g != null) {
            return true;
        }
        this.zzX2g = run;
        return false;
    }
}
