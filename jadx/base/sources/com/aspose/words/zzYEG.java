package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYEG {
    private ArrayList<Node> zzYM4 = new ArrayList<>();
    private zzZYM zzYM5;
    private zzYDZ zzZFZ;
    private static com.aspose.words.internal.zzZNR zzXqf = new com.aspose.words.internal.zzZNR("EQ\\s*(?:\\\\\\*\\s*jc([0-5]{1}))?\\s*(?:\\\\\\*\\s*\\x22Font\\:(.*)\\x22)?\\s*(?:\\\\\\*\\s*hps([0-9]+))?\\s*\\\\o\\s*(\\\\a[ldr]{1}\\s*)?\\(\\\\s\\s*\\\\up\\s*([0-9]+)\\s*\\((.*)\\)\\s*,\\s*(.*)\\)", 0);
    private static com.aspose.words.internal.zzZNR zzXqe = new com.aspose.words.internal.zzZNR("\\\\s\\\\do\\s*(\\d+)");

    public zzYEG(zzZYM zzzym, zzYDZ zzydz) {
        this.zzZFZ = zzydz;
        this.zzYM5 = zzzym;
    }

    private static OfficeMath zzA(Run run) {
        zzYEJ zzyej = (zzYEJ) run.zzZYh().get(885);
        DocumentBase document = run.getDocument();
        OfficeMath officeMath = new OfficeMath(document, new zzZ02());
        OfficeMath officeMath2 = new OfficeMath(document, new zzZ03());
        zzZ07 zzz07 = new zzZ07();
        zzz07.zzuB(1);
        zzz07.zzuu(3);
        zzz07.zzuv(0);
        zzZ(zzz07, zzyej.zzZGm);
        OfficeMath officeMath3 = new OfficeMath(document, zzz07, run.zzZYh());
        OfficeMath officeMath4 = new OfficeMath(document, new zzZ06());
        OfficeMath officeMath5 = new OfficeMath(document, new zzZ06());
        officeMath3.appendChild(officeMath4);
        officeMath3.appendChild(officeMath5);
        officeMath2.appendChild(officeMath3);
        officeMath.appendChild(officeMath2);
        officeMath.zzYrQ();
        zzZ(document, zzyej, officeMath4, true);
        zzZ(document, zzyej, officeMath5, false);
        return officeMath;
    }

    public static Node[] zzB(Run run) {
        zzYEJ zzyej = (zzYEJ) run.zzZYh().get(885);
        DocumentBase document = run.getDocument();
        Node[] nodeArr = new Node[zzyej.zzYe7().getCount() + 6 + zzyej.zzYe6().getCount()];
        zzYEF zzyef = new zzYEF();
        zzyef.zzQ(190, Integer.valueOf(zzyej.zzXqk));
        nodeArr[0] = new FieldStart(document, (zzYEF) zzyef.zzbn(), 49);
        nodeArr[1] = new Run(document, com.aspose.words.internal.zzZKN.format("EQ \\* jc{0} \\* \"Font:{1}\" \\* hps{2} \\o\\ad(\\s\\up {3}(", Integer.valueOf(zzyej.zzZGm), run.getFont().getNameAscii(), Integer.valueOf(zzyej.zzXql), Integer.valueOf(zzyej.zzXqj / 2)), (zzYEF) zzyef.zzbn());
        int i = 2;
        for (zzYEI zzyei : zzyej.zzYe7()) {
            nodeArr[i] = new Run(document, zzyei.zzZAL, (zzYEF) zzyei.zzXqg.zzbn());
            i++;
        }
        int i2 = i + 1;
        nodeArr[i] = new Run(document, "),", (zzYEF) zzyef.zzbn());
        for (zzYEI zzyei2 : zzyej.zzYe6()) {
            nodeArr[i2] = new Run(document, zzyei2.zzZAL, (zzYEF) zzyei2.zzXqg.zzbn());
            i2++;
        }
        nodeArr[i2] = new Run(document, ")", (zzYEF) zzyef.zzbn());
        nodeArr[i2 + 1] = new FieldSeparator(document, (zzYEF) zzyef.zzbn(), 49);
        nodeArr[i2 + 2] = new FieldEnd(document, (zzYEF) zzyef.zzbn(), 49, true);
        return nodeArr;
    }

    private static zzYEJ zzQ(zzZR4 zzzr4) {
        return zzZZ(zzZQB.zzX(zzzr4.getStart(), zzzr4.getSeparator(), zzzr4.getEnd()));
    }

    public static void zzR(zzZR4 zzzr4) throws Exception {
        zzYEJ zzyejZzQ = zzQ(zzzr4);
        if (zzyejZzQ == null) {
            return;
        }
        Run run = new Run(zzzr4.getStart().getDocument(), "", (zzYEF) zzzr4.getStart().zzZYh().zzbn());
        run.zzZYh().zzQ(885, zzyejZzQ);
        zzzr4.getStart().zzYC(run);
        zzYW0.zzZ((Node) zzzr4.getStart(), true, (Node) zzzr4.getEnd(), true, 0);
    }

    private void zzV(Node node, Node node2) throws Exception {
        node2.zzYD(node);
        com.aspose.words.internal.zzZQG.zzZ(this.zzYM4, node);
        node.accept(this.zzYM5);
    }

    private static Run zzX(zzYWB zzywb, int i) {
        int iZz0R = 0;
        for (Node node : zzywb) {
            if (node.zz0R() + iZz0R > i && node.getNodeType() == 21) {
                return (Run) node;
            }
            iZz0R += node.zz0R();
        }
        return (Run) com.aspose.words.internal.zzZKW.zzZ(zzywb.zzYA1().getNode(), Run.class);
    }

    private static void zzZ(String str, int i, zzYWB zzywb, zzYEH zzyeh) {
        int length = str.length();
        int i2 = 0;
        while (length > 0) {
            int i3 = i + i2;
            Run runZzX = zzX(zzywb, i3);
            int iZzZ = i3 - zzZ(zzywb, runZzX);
            zzYEI zzyei = new zzYEI();
            int iMin = Math.min(runZzX.getText().length() - iZzZ, length);
            zzyei.zzZAL = runZzX.getText().substring(iZzZ, iZzZ + iMin);
            zzyei.zzXqg = (zzYEF) runZzX.zzZYh().zzbn();
            zzyeh.zzZ(zzyei);
            i2 += iMin;
            length -= iMin;
        }
    }

    private static zzYEJ zzZZ(Field field) {
        com.aspose.words.internal.zzZNS zzznsZzUW = zzXqf.zzUW(field.getFieldCode());
        if (zzznsZzUW.getCount() != 1) {
            return null;
        }
        com.aspose.words.internal.zzZNU zzznuZzhJ = zzznsZzUW.zzQw(0).zzhJ();
        if (zzXqe.zzUV(zzznuZzhJ.zzQx(7).getValue())) {
            return null;
        }
        zzYEJ zzyej = new zzYEJ();
        if (zzznuZzhJ.zzQx(1).zzhL()) {
            zzyej.zzZGm = com.aspose.words.internal.zzJB.parseInt(zzznuZzhJ.zzQx(1).getValue());
        }
        if (zzznuZzhJ.zzQx(3).zzhL()) {
            zzyej.zzXql = com.aspose.words.internal.zzJB.parseInt(zzznuZzhJ.zzQx(3).getValue());
        }
        zzyej.zzXqj = com.aspose.words.internal.zzJB.parseInt(zzznuZzhJ.zzQx(5).getValue()) * 2;
        zzyej.zzXqk = ((Integer) zzZ7R.zzZ(field.getStart(), 190, 0)).intValue();
        zzyej.zzQy = ((Integer) zzZ7R.zzZ(field.getStart(), 390, 0)).intValue();
        zzYWB zzywbZzZgG = field.zzZgG();
        zzZ(zzznuZzhJ.zzQx(6).getValue(), zzznuZzhJ.zzQx(6).getIndex(), zzywbZzZgG, zzyej.zzYe7());
        zzZ(zzznuZzhJ.zzQx(7).getValue(), zzznuZzhJ.zzQx(7).getIndex(), zzywbZzZgG, zzyej.zzYe6());
        return zzyej;
    }

    private static int zznh(int i) {
        if (i != 3) {
            return (i == 4 || i == 5) ? 3 : 2;
        }
        return 1;
    }

    public final void zzC(Run run) throws Exception {
        int saveFormat = this.zzZFZ.zzXpa.getSaveFormat();
        if (saveFormat == 10 || saveFormat == 11 || saveFormat == 30) {
            zzZ(zzB(run), run);
            return;
        }
        if (saveFormat == 31 || saveFormat == 50 || saveFormat == 51 || saveFormat == 70) {
            return;
        }
        switch (saveFormat) {
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
                break;
            default:
                zzV(zzA(run), run);
                break;
        }
    }

    public final void zzZnb() {
        Iterator<Node> it = this.zzYM4.iterator();
        while (it.hasNext()) {
            it.next().remove();
        }
    }

    private static void zzZ(zzZ07 zzz07, int i) {
        zzZ0O zzz0o = new zzZ0O();
        zzz0o.setHorizontalAlignment(zznh(i));
        zzz07.zzYEI().zzZ(zzz0o);
    }

    private static void zzZ(DocumentBase documentBase, zzYEJ zzyej, OfficeMath officeMath, boolean z) {
        zzYEF zzyef;
        String text;
        if (z && zzyej.zzYe7().getCount() == 0) {
            return;
        }
        if (z || zzyej.zzYe6().getCount() != 0) {
            if (z) {
                zzyef = (zzYEF) zzyej.zzYe7().zzYe5().zzXqg.zzbn();
                zzyef.setSize(zzyej.zzXql);
                text = zzyej.zzYe7().getText();
            } else {
                zzyef = (zzYEF) zzyej.zzYe6().zzYe5().zzXqg.zzbn();
                zzyef.setSize(zzyej.zzXqk);
                text = zzyej.zzYe6().getText();
            }
            zzYEF zzyef2 = zzyef;
            String str = text;
            int i = zzyej.zzZGm;
            if (i != 1 && i != 2) {
                zzZ(str, documentBase, zzyef2, officeMath);
            } else {
                zzZ(documentBase, zzyej, officeMath, z, str, zzyef2);
            }
        }
    }

    private static void zzZ(DocumentBase documentBase, zzYEJ zzyej, OfficeMath officeMath, boolean z, String str, zzYEF zzyef) {
        if (zzyej.zzYe7().getText().length() == zzyej.zzYe6().getText().length()) {
            int i = 0;
            while (i < str.length()) {
                if (i > 0 && z) {
                    zzZ((zzZ07) ((OfficeMath) officeMath.getParentNode()).zzZsL(), zzyej.zzZGm);
                }
                int i2 = i + 1;
                zzZ(str.substring(i, i2), documentBase, zzyef, officeMath);
                i = i2;
            }
            return;
        }
        zzyef.setSpacing(zzZ(zzyej, z));
        zzZ(str, documentBase, zzyef, officeMath);
    }

    private static int zzZ(zzYEJ zzyej, boolean z) {
        double length = ((double) (zzyej.zzYe6().getText().length() * zzyej.zzXqk)) - ((double) (zzyej.zzYe7().getText().length() * zzyej.zzXql));
        int iAbs = (((int) Math.abs(length)) / (z ? zzyej.zzYe7() : zzyej.zzYe6()).getText().length()) * (zzyej.zzZGm == 1 ? 5 : 4);
        if ((length <= 0.0d || !z) && (length >= 0.0d || z)) {
            return 0;
        }
        return iAbs;
    }

    private static void zzZ(String str, DocumentBase documentBase, zzYEF zzyef, OfficeMath officeMath) {
        Run run = new Run(documentBase, str, zzyef);
        OfficeMath officeMath2 = new OfficeMath(documentBase, new zzZ0H(8));
        officeMath.appendChild(officeMath2);
        officeMath2.appendChild(run);
    }

    private static int zzZ(zzYWB zzywb, Run run) {
        int iZz0R = 0;
        for (Node node : zzywb) {
            if (node == run) {
                return iZz0R;
            }
            iZz0R += node.zz0R();
        }
        return 0;
    }

    private void zzZ(Node[] nodeArr, Node node) throws Exception {
        int length = nodeArr.length;
        int i = 0;
        while (i < length) {
            Node node2 = nodeArr[i];
            zzV(node2, node);
            i++;
            node = node2;
        }
    }
}
