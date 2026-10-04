package com.aspose.words;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
final class zzYT9 {
    public static void zzX(zzYQ7 zzyq7) {
        zzYT8 zzyt8;
        String strZzZ = zzZ(zzyq7.zzYuT());
        if (strZzZ == null || (zzyt8 = (zzYT8) com.aspose.words.internal.zzQW.zzZ((Map<String, TValue>) zzyq7.zzYuw(), strZzZ)) == null || ((zzYRD) com.aspose.words.internal.zzZKW.zzZ(zzyt8.zzYxV(), zzYRD.class)) == null) {
            return;
        }
        for (int i = 0; i < zzyq7.zzYuv().getCount(); i++) {
            if (com.aspose.words.internal.zzZKN.equals(zzyq7.zzYuv().get(i).zzYxW(), strZzZ)) {
                zzyq7.zzYuv().zzVG(i);
                zzyq7.zzSa(true);
                return;
            }
        }
        zzyq7.zzSa(true);
    }

    private static void zzY(Paragraph paragraph, CompositeNode compositeNode, zzYTA zzyta, int i) {
        for (Node node : compositeNode.getChildNodes(0, false)) {
            if (zzZ(node, zzyta)) {
                if (i == 0) {
                    paragraph.appendChild(node.deepClone(true));
                } else {
                    Paragraph paragraph2 = (Paragraph) paragraph.deepClone(false);
                    paragraph2.appendChild(node);
                    paragraph.getParentNode().appendChild(paragraph2);
                }
            }
        }
    }

    public static void zzZ(zzYQ7 zzyq7, Paragraph paragraph) {
        zzYT8 zzyt8;
        zzYS9 zzys9;
        String strZzZ = zzZ(zzyq7.zzYuT());
        if (strZzZ == null || (zzyt8 = (zzYT8) com.aspose.words.internal.zzQW.zzZ((Map<String, TValue>) zzyq7.zzYuw(), strZzZ)) == null || (zzys9 = (zzYS9) com.aspose.words.internal.zzZKW.zzZ(zzyt8.zzYxV(), zzYS9.class)) == null || zzys9.zzYwI() == null) {
            return;
        }
        zzYTA zzytaZzYxX = zzys9.zzYxX();
        for (int i = 0; i < zzys9.zzYwI().size(); i++) {
            CompositeNode compositeNode = zzys9.zzYwI().get(i);
            if (compositeNode instanceof Paragraph) {
                zzY(paragraph, compositeNode, zzytaZzYxX, i);
            }
            if (compositeNode instanceof Body) {
                zzZ(paragraph, compositeNode, zzytaZzYxX, i);
            }
        }
    }

    private static zzYEF zzs(Node node) {
        zzZAM zzzam = (zzZAM) com.aspose.words.internal.zzZKW.zzZ(node, zzZAM.class);
        if (zzzam != null) {
            return zzzam.getRunPr_IInline();
        }
        return null;
    }

    public static void zzY(zzYQ7 zzyq7) {
        zzYT8 zzyt8;
        String strZzZ = zzZ(zzyq7.zzYuT());
        if (strZzZ == null || (zzyt8 = (zzYT8) com.aspose.words.internal.zzQW.zzZ((Map<String, TValue>) zzyq7.zzYuw(), strZzZ)) == null || ((zzYRD) com.aspose.words.internal.zzZKW.zzZ(zzyt8.zzYxV(), zzYRD.class)) == null) {
            return;
        }
        zzyq7.zzYuv().add(zzyq7.zzYuv().getCount(), zzyt8);
        zzyq7.zzSa(true);
    }

    private static void zzZ(Paragraph paragraph, CompositeNode compositeNode, zzYTA zzyta, int i) {
        for (CompositeNode compositeNode2 : compositeNode.getChildNodes(0, false)) {
            Iterator<T> it = compositeNode2.getChildNodes(0, false).iterator();
            while (it.hasNext()) {
                zzZ((Node) it.next(), zzyta);
            }
            Paragraph paragraph2 = (Paragraph) com.aspose.words.internal.zzZKW.zzZ(compositeNode2, Paragraph.class);
            if (zzZ(paragraph, i, paragraph2)) {
                paragraph.zzZ(paragraph2.zzZYj());
                Iterator<T> it2 = paragraph2.getChildNodes(0, false).iterator();
                while (it2.hasNext()) {
                    paragraph.appendChild((Inline) it2.next());
                }
            } else {
                paragraph.getParentNode().appendChild(compositeNode2);
            }
        }
    }

    private static boolean zzZ(Paragraph paragraph, int i, Paragraph paragraph2) {
        return (paragraph2 == null || paragraph.hasChildNodes() || i != 0) ? false : true;
    }

    private static boolean zzZ(Node node, zzYTA zzyta) {
        zzYEF zzyefZzs = zzs(node);
        if (zzyefZzs == null) {
            return false;
        }
        zzyefZzs.zzQ(12, new zzZV8(1, zzyta.zzQF(), zzyta.zzkT()));
        return true;
    }

    private static String zzZ(zzYQ9 zzyq9) {
        while (zzyq9.zzi()) {
            if ("change-id".equals(zzyq9.getLocalName())) {
                return zzyq9.getValue();
            }
        }
        return null;
    }
}
