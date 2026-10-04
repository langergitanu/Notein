package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYB0 extends zzYL4 {
    private zzU8 zzZGE;

    public zzYB0(zzU8 zzu8) {
        this.zzZGE = zzu8;
    }

    @Override // com.aspose.words.zzYL4
    public final void zzZ(Node node, Node node2) throws Exception {
        zzU6.zzSU(com.aspose.words.internal.zzZKN.format("{{SmartTag}} '{0}' -> '{1}'", node, node2));
        if (node.getNodeType() == 27 && node2.getNodeType() == 27) {
            SmartTag smartTag = (SmartTag) node;
            SmartTag smartTag2 = (SmartTag) node2;
            if (zzZ(smartTag, smartTag2)) {
                zzY9D.zzU(smartTag, smartTag2, this.zzZGE);
            } else {
                zzU4.zzY(smartTag, smartTag2, this.zzZGE);
            }
        }
    }

    private static boolean zzZ(SmartTag smartTag, SmartTag smartTag2) {
        if (!com.aspose.words.internal.zzZKN.equals(smartTag.getElement(), smartTag2.getElement()) || !com.aspose.words.internal.zzZKN.equals(smartTag.getUri(), smartTag2.getUri()) || smartTag.getProperties().getCount() != smartTag2.getProperties().getCount()) {
            return false;
        }
        for (int i = 0; i < smartTag.getProperties().getCount(); i++) {
            CustomXmlProperty customXmlProperty = smartTag.getProperties().get(i);
            CustomXmlProperty customXmlProperty2 = smartTag2.getProperties().get(i);
            if (!com.aspose.words.internal.zzZKN.equals(customXmlProperty.getName(), customXmlProperty2.getName()) || !com.aspose.words.internal.zzZKN.equals(customXmlProperty.getUri(), customXmlProperty2.getUri()) || !com.aspose.words.internal.zzZKN.equals(customXmlProperty.getValue(), customXmlProperty2.getValue())) {
                return false;
            }
        }
        return true;
    }
}
