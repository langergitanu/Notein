package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYE6 {
    private static boolean zzY(Run run, Run run2, zzZ6R zzz6r) {
        if (run2 != null && !"".equals(run2.getText()) && !"".equals(run.getText())) {
            char cCharAt = run2.getText().charAt(run2.getText().length() - 1);
            char cCharAt2 = run.getText().charAt(0);
            if ((zzY42.getScript(cCharAt) == 1098015074 && zzY42.getScript(cCharAt2) == 1098015074 && !zzZ(run2, run, zzz6r)) || zzZ(run, run2)) {
                return true;
            }
        }
        return false;
    }

    public static zzYE8 zzZ(zzYWB zzywb, zzZ6R zzz6r) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Node parentNode = null;
        Run run = null;
        for (Node node : zzywb) {
            if (parentNode == null) {
                parentNode = node.getNodeType() == 28 ? node : node.getParentNode();
            }
            if (node.getNodeType() == 21 && node.getParentNode() == parentNode) {
                Run run2 = (Run) node;
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<String>) arrayList, run2.getText());
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<Boolean>) arrayList2, Boolean.valueOf(zzY(run2, run, zzz6r)));
                run = run2;
            }
        }
        return new zzYE8((String[]) arrayList.toArray(new String[0]), zzZ6(arrayList2));
    }

    private static boolean[] zzZ6(ArrayList<Boolean> arrayList) {
        boolean[] zArr = new boolean[arrayList.size()];
        Iterator<Boolean> it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            zArr[i] = it.next().booleanValue();
            i++;
        }
        return zArr;
    }

    private static boolean zzz(Run run) {
        return run.getParentNode().getNodeType() == 28;
    }

    public static zzYE8 zzZ(RunCollection runCollection, zzZ6R zzz6r) {
        String[] strArr = new String[runCollection.getCount()];
        boolean[] zArr = new boolean[runCollection.getCount()];
        Run run = null;
        int i = 0;
        while (i < runCollection.getCount()) {
            Run run2 = runCollection.get(i);
            if (run != null) {
                run2.getParentParagraph();
                run.getParentParagraph();
            }
            strArr[i] = run2.getText();
            zArr[i] = zzY(run2, run, zzz6r);
            i++;
            run = run2;
        }
        return new zzYE8(strArr, zArr);
    }

    private static boolean zzZ(Run run, Run run2, zzZ6R zzz6r) {
        zzYEF zzyefZzZ = zzZQ.zzZ(run, zzz6r);
        zzYEF zzyefZzZ2 = zzZQ.zzZ(run2, zzz6r);
        return zzyefZzZ.zzYdM() == zzyefZzZ2.zzYdM() && com.aspose.words.internal.zzZKO.equals(zzyefZzZ.get(270), zzyefZzZ2.get(270)) && zzyefZzZ.zzYL6() == zzyefZzZ2.zzYL6() && zzyefZzZ.zzYdO() == zzyefZzZ2.zzYdO() && zzyefZzZ.zzYdN() == zzyefZzZ2.zzYdN();
    }

    private static boolean zzZ(Run run, Run run2) {
        return zzz(run) != zzz(run2);
    }
}
