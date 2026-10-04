package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYOL {
    private OfficeMath zzXJx;

    private zzYOL(OfficeMath officeMath) {
        this.zzXJx = officeMath;
    }

    private static void zzF(Run run) {
        if (run == null || run.getText().length() <= 0) {
            return;
        }
        run.setText(run.getText().substring(1, run.getText().length()));
    }

    private static void zzG(Run run) {
        if (run == null || run.getText().length() <= 0) {
            return;
        }
        run.setText(run.getText().substring(0, run.getText().length() - 1));
    }

    private static boolean zzH(Run run) {
        return run != null && run.getText().length() > 0 && run.getText().charAt(0) == 11;
    }

    private static boolean zzI(Run run) {
        return run != null && run.getText().length() > 0 && run.getText().charAt(run.getText().length() - 1) == 11;
    }

    private static boolean zzJ(Run run) {
        return run != null && run.getText().length() > 0 && run.getText().charAt(0) == ' ';
    }

    private static boolean zzK(Run run) {
        return run != null && run.getText().length() > 0 && run.getText().charAt(run.getText().length() - 1) == ' ';
    }

    private static int zzY(OfficeMath officeMath, boolean z) {
        int iIndexOf = officeMath.getParentParagraph().getChildNodes(0, false).indexOf(officeMath);
        int count = z ? 0 : officeMath.getParentParagraph().getChildNodes(0, false).getCount();
        if (z) {
            iIndexOf++;
        }
        if (!zzu(officeMath, z)) {
            if (!zzu(z ? officeMath.getPreviousSibling() : officeMath.getNextSibling(), !z)) {
                return count;
            }
        }
        return iIndexOf;
    }

    private Run zzYrJ() {
        return (Run) com.aspose.words.internal.zzZKW.zzZ(this.zzXJx.getPreviousSibling(), Run.class);
    }

    private Run zzYrK() {
        return (Run) com.aspose.words.internal.zzZKW.zzZ(this.zzXJx.getNextSibling(), Run.class);
    }

    private void zzYrL() {
        Run runZzYrK = zzYrK();
        Run runZzYrJ = zzYrJ();
        if (this.zzXJx.getLastChild().getNodeType() == 21) {
            Run run = (Run) this.zzXJx.getLastChild();
            if (zzI(run)) {
                zzG(run);
            }
            Run run2 = new Run(this.zzXJx.getDocument(), ControlChar.zzZs5);
            run2.zzZ((zzYEF) run.zzZYh().zzbn());
            if (runZzYrK == null || !zzJ(runZzYrK)) {
                this.zzXJx.zzYD(run2);
            }
        }
        if (runZzYrJ == null || !zzI(runZzYrJ)) {
            return;
        }
        zzG(runZzYrJ);
        if (runZzYrJ.getText().length() != 0 || runZzYrJ.getPreviousSibling().getNodeType() != 21) {
            runZzYrJ.setText(runZzYrJ.getText() + ControlChar.zzZs5);
            return;
        }
        if (zzK((Run) runZzYrJ.getPreviousSibling())) {
            return;
        }
        runZzYrJ.setText(runZzYrJ.getText() + ControlChar.zzZs5);
    }

    private void zzYrM() {
        if (this.zzXJx.isTopLevel()) {
            zzZ0J zzz0jZzZsL = this.zzXJx.zzZsL();
            if (zzz0jZzZsL.getMathObjectType() != 1) {
                zzZ02 zzz02 = new zzZ02();
                OfficeMath officeMath = new OfficeMath(this.zzXJx.getDocument(), zzz0jZzZsL);
                this.zzXJx.zzX(zzz02);
                while (this.zzXJx.hasChildNodes()) {
                    officeMath.appendChild(this.zzXJx.getFirstChild());
                }
                this.zzXJx.appendChild(officeMath);
                zzZ(officeMath, true);
                zzZ(officeMath, false);
            }
        }
    }

    private void zzYrN() {
        if (this.zzXJx.isTopLevel() && this.zzXJx.zzZsL().getMathObjectType() == 1) {
            OfficeMath officeMath = (OfficeMath) this.zzXJx.getFirstChild();
            this.zzXJx.zzX(officeMath.zzZsL());
            while (officeMath.hasChildNodes()) {
                this.zzXJx.appendChild(officeMath.getFirstChild());
            }
            officeMath.remove();
            zzYrL();
        }
    }

    public static void zzZ(Shape shape, IWarningCallback iWarningCallback) throws Exception {
        byte[] bArrZzZT = zzZT(shape);
        if (!shape.isTopLevel() || bArrZzZT == null) {
            return;
        }
        OfficeMath officeMathZzr = new zzY1J().zzr(bArrZzZT, shape.zzYBb().getOriginalLoadFormat());
        if (officeMathZzr == null) {
            zzY1Z.zzZ(iWarningCallback, 1, 17, "Aspose.Words failed to load OfficeMath XML for equation.");
        } else {
            shape.zzYC(shape.getDocument().importNode(officeMathZzr, true));
            shape.remove();
        }
    }

    public static byte[] zzZT(Shape shape) {
        return (byte[]) com.aspose.words.internal.zzZKW.zzZ(shape.zzYvW().get(780), byte[].class);
    }

    private static boolean zzh(OfficeMath officeMath) {
        if (!officeMath.zzYGa() && officeMath.getParentParagraph() != null) {
            int iZzY = zzY(officeMath, false);
            for (int iZzY2 = zzY(officeMath, true); iZzY2 < iZzY; iZzY2++) {
                Node node = officeMath.getParentParagraph().getChildNodes(0, false).get(iZzY2);
                if (zzYVU.zzXN(node)) {
                    return true;
                }
                Run run = (Run) com.aspose.words.internal.zzZKW.zzZ(node, Run.class);
                if (run != null && com.aspose.words.internal.zzZYD.zzXk(run.getText())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean zzi(OfficeMath officeMath) {
        OfficeMath officeMathZzYrX = officeMath.zzYrX();
        int mathObjectType = officeMathZzYrX.getMathObjectType();
        if (mathObjectType == 0 || mathObjectType == 1) {
            return zzh(officeMathZzYrX);
        }
        return false;
    }

    public static void zzj(OfficeMath officeMath) {
        new zzYOL(officeMath).zzYrM();
    }

    public static void zzk(OfficeMath officeMath) {
        new zzYOL(officeMath).zzYrN();
    }

    private static boolean zzt(Node node, boolean z) {
        Run run = (Run) com.aspose.words.internal.zzZKW.zzZ(node, Run.class);
        return z ? zzH(run) : zzI(run);
    }

    private static boolean zzu(Node node, boolean z) {
        if (node == null) {
            return false;
        }
        int nodeType = node.getNodeType();
        if (nodeType == 21) {
            return zzt(node, z);
        }
        if (nodeType == 35) {
            OfficeMath officeMath = (OfficeMath) node;
            if (officeMath.hasChildNodes()) {
                return zzu(z ? officeMath.getFirstChild() : officeMath.getLastChild(), z);
            }
        }
        return false;
    }

    private void zzZ(OfficeMath officeMath, boolean z) {
        OfficeMath officeMath2 = this.zzXJx;
        Node nextSibling = z ? officeMath2.getNextSibling() : officeMath2.getPreviousSibling();
        if (nextSibling != null) {
            int nodeType = nextSibling.getNodeType();
            if (nodeType == 21 || nodeType == 18 || nodeType == 17) {
                Run run = new Run(this.zzXJx.getDocument(), ControlChar.LINE_BREAK);
                if (nodeType == 21) {
                    Run run2 = (Run) nextSibling;
                    run = (Run) run2.deepClone(false);
                    run.setText(ControlChar.LINE_BREAK);
                    if (zzJ(run2) && z) {
                        zzF(run2);
                    }
                    if (zzK(run2) && !z) {
                        zzG(run2);
                    }
                }
                zzZ(officeMath, run, z);
            }
        }
    }

    private void zzZ(OfficeMath officeMath, Run run, boolean z) {
        if (z) {
            officeMath.appendChild(run);
        } else {
            this.zzXJx.zzYC(run);
        }
    }
}
