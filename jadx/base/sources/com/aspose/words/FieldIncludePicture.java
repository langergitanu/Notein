package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class FieldIncludePicture extends Field implements zzZB7, zzZBA {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\c", "\\d", "\\x", "\\y");

    public String getGraphicFilter() {
        return zzZgq().zzt("\\c", false);
    }

    public boolean getResizeHorizontally() {
        return zzZgq().zzMj("\\x");
    }

    public boolean getResizeVertically() {
        return zzZgq().zzMj("\\y");
    }

    @Override // com.aspose.words.zzZB7
    public String getSourceFullName() {
        return zzZgq().zzDG(0);
    }

    @Override // com.aspose.words.zzZBA
    @ReservedForInternalUse
    @Deprecated
    public int getSwitchType(String str) {
        int iZzTP = zzUR.zzTP(str);
        if (iZzTP != 0) {
            return (iZzTP == 1 || iZzTP == 2 || iZzTP == 3) ? 1 : 0;
        }
        return 2;
    }

    @Override // com.aspose.words.zzZB7
    public boolean isLinked() {
        return zzZgq().zzMj("\\d");
    }

    public void setGraphicFilter(String str) throws Exception {
        zzZgq().zzZf("\\c", str);
    }

    public void setResizeHorizontally(boolean z) throws Exception {
        zzZgq().zzs("\\x", z);
    }

    public void setResizeVertically(boolean z) throws Exception {
        zzZgq().zzs("\\y", z);
    }

    public void setSourceFullName(String str) throws Exception {
        zzZgq().zzB(0, str);
    }

    @Override // com.aspose.words.Field
    public final void zzZgJ() throws Exception {
        Iterator<Node> it = zzZgF().iterator();
        while (it.hasNext()) {
            Shape shape = (Shape) com.aspose.words.internal.zzZKW.zzZ(it.next(), Shape.class);
            if (shape != null) {
                shape.getImageData().setSourceFullName("");
            }
        }
    }

    @Override // com.aspose.words.Field
    public final zzZP6 zzZgM() throws Exception {
        return zzZQ5.zzU(this);
    }

    public void isLinked(boolean z) throws Exception {
        zzZgq().zzs("\\d", z);
    }
}
