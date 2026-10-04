package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
public class FieldXE extends Field implements zzZBA {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\b", "\\i", "\\f", "\\r", "\\t", "\\y");

    private boolean isValid() {
        Node start = getStart();
        while (true) {
            start = start.zztB(0);
            if (start == null) {
                return false;
            }
            int nodeType = start.getNodeType();
            if (nodeType == 1) {
                return true;
            }
            if (nodeType != 17 && nodeType != 18) {
                return false;
            }
        }
    }

    private static boolean zzW(zzZQO zzzqo) {
        int iZzXf;
        String text = zzzqo.getText();
        return (text == null || (iZzXf = com.aspose.words.internal.zzZYD.zzXf(text)) == -1 || text.charAt(iZzXf) == ':') ? false : true;
    }

    private static int zzZo(Node node) {
        return node.zztB(0).getNodeType();
    }

    public String getEntryType() {
        return zzZgq().zzt("\\f", false);
    }

    public String getPageNumberReplacement() {
        return zzZgq().zzt("\\t", false);
    }

    public String getPageRangeBookmarkName() {
        return zzZgq().zzt("\\r", false);
    }

    @Override // com.aspose.words.zzZBA
    @ReservedForInternalUse
    @Deprecated
    public int getSwitchType(String str) {
        int iZzTP = zzUR.zzTP(str);
        int i = 1;
        if (iZzTP != 0 && iZzTP != 1) {
            i = 2;
            if (iZzTP != 2 && iZzTP != 3 && iZzTP != 4 && iZzTP != 5) {
                return 0;
            }
        }
        return i;
    }

    public String getText() {
        return zzZgq().zzDG(0);
    }

    public String getYomi() {
        return zzZgq().zzt("\\y", false);
    }

    public boolean isBold() {
        return zzZgq().zzMj("\\b");
    }

    public boolean isItalic() {
        return zzZgq().zzMj("\\i");
    }

    public void setEntryType(String str) throws Exception {
        zzZgq().zzZf("\\f", str);
    }

    public void setPageNumberReplacement(String str) throws Exception {
        zzZgq().zzZf("\\t", str);
    }

    public void setPageRangeBookmarkName(String str) throws Exception {
        zzZgq().zzZf("\\r", str);
    }

    public void setText(String str) throws Exception {
        zzZgq().zzB(0, str);
    }

    public void setYomi(String str) throws Exception {
        zzZgq().zzZf("\\y", str);
    }

    public final String zzCr(int i) {
        return zzYTW.zzM(i, ((Section) getStart().getAncestor(2)).getPageSetup().getPageNumberStyle(), false);
    }

    public final zzYAT zzV(zzZQO zzzqo) throws Exception {
        String pageRangeBookmarkName = zzzqo != null ? zzzqo.getPageRangeBookmarkName() : getPageRangeBookmarkName();
        if (!com.aspose.words.internal.zzZYD.zzXk(pageRangeBookmarkName)) {
            return null;
        }
        zzYAT zzyatZzCY = getStart().zzYBb().zzZqh().zzCY(pageRangeBookmarkName);
        if (zzyatZzCY == null || zzZo(zzyatZzCY.zzZcG()) == zzZo(getStart())) {
            return zzyatZzCY;
        }
        return null;
    }

    public final boolean zzX(zzZQO zzzqo) {
        return isValid() && zzW(zzzqo);
    }

    public final zzYWB zzZeA() {
        return zzZgq().zzMg("\\t");
    }

    public void isBold(boolean z) throws Exception {
        zzZgq().zzs("\\b", z);
    }

    public void isItalic(boolean z) throws Exception {
        zzZgq().zzs("\\i", z);
    }
}
