package com.aspose.words;

import android.os.Bundle;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public class FieldHyperlink extends Field implements zzZB0, zzZBA {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("\\m", "\\n", "\\h", "\\l", "\\o", "\\t", "\\s");

    public static class zzY implements zzZB1 {
        private zzYEF zzZsP;

        private zzY(zzYEF zzyef) {
            this.zzZsP = zzyef;
        }

        public static zzY zzO(Field field) {
            Iterator<Node> it = field.zzZgF().iterator();
            zzYEF zzyefZzZYh = null;
            while (it.hasNext()) {
                Inline inline = (Inline) com.aspose.words.internal.zzZKW.zzZ(it.next(), Inline.class);
                if (inline != null) {
                    zzyefZzZYh = inline.zzZYh();
                }
            }
            return new zzY(zzyefZzZYh);
        }

        @Override // com.aspose.words.zzZB1
        public final void zzZ(zzYWB zzywb) {
            if (this.zzZsP == null) {
                return;
            }
            Iterator<Node> it = zzywb.iterator();
            while (it.hasNext()) {
                Inline inline = (Inline) com.aspose.words.internal.zzZKW.zzZ(it.next(), Inline.class);
                if (inline != null) {
                    inline.zzZ((zzYEF) this.zzZsP.zzbn());
                }
            }
        }
    }

    public static class zzZ implements zzZB1 {
        static zzZ zzYDU = new zzZ();

        private zzZ() {
        }

        @Override // com.aspose.words.zzZB1
        public final void zzZ(zzYWB zzywb) {
            Iterator<Node> it = zzywb.iterator();
            while (it.hasNext()) {
                Inline inline = (Inline) com.aspose.words.internal.zzZKW.zzZ(it.next(), Inline.class);
                if (inline != null) {
                    inline.getFont().clearFormatting();
                    inline.getFont().setStyleIdentifier(85);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [int, java.lang.String] */
    private static String zzZb(String str, String str2) {
        return (!com.aspose.words.internal.zzZKN.zzU3(str) && com.aspose.words.internal.zzZKN.zzS(str, Bundle.getInt(str2), com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8)) ? com.aspose.words.internal.zzZKN.zzT(str, 0, str2.length() + 1) : str;
    }

    private boolean zzZdQ() {
        return zzZgn() == null;
    }

    private String zzZdR() {
        return zzZb(getAddress(), "url");
    }

    private String zzZdS() {
        String strZzZdR = zzZdR();
        String subAddress = getSubAddress();
        if (com.aspose.words.internal.zzZYD.zzXk(strZzZdR) && com.aspose.words.internal.zzZYD.zzXk(subAddress)) {
            return com.aspose.words.internal.zzZKN.format("{0} - {1}", strZzZdR, subAddress);
        }
        if (com.aspose.words.internal.zzZYD.zzXk(strZzZdR)) {
            return strZzZdR;
        }
        if (com.aspose.words.internal.zzZYD.zzXk(subAddress)) {
            return subAddress;
        }
        return null;
    }

    private boolean zzZdT() {
        return com.aspose.words.internal.zzZKN.zzS(getResult(), "Error!", com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8);
    }

    public String getAddress() {
        return zzZgq().zzDG(0);
    }

    @Override // com.aspose.words.zzZB0
    @ReservedForInternalUse
    @Deprecated
    public zzZB1 getFormatApplier() {
        return zzZdQ() ? zzY.zzO(this) : zzZ.zzYDU;
    }

    public final String getHRef() {
        return com.aspose.words.internal.zzZVR.zz5(zzZdR(), getSubAddress());
    }

    public boolean getOpenInNewWindow() {
        return zzZgq().zzMj("\\n");
    }

    public String getScreenTip() {
        return zzZgq().zzt("\\o", false);
    }

    @Override // com.aspose.words.zzZB0
    @ReservedForInternalUse
    @Deprecated
    public Inline getSourceNode() {
        return null;
    }

    public String getSubAddress() {
        return zzZgq().zzt("\\l", false);
    }

    @Override // com.aspose.words.zzZBA
    @ReservedForInternalUse
    @Deprecated
    public int getSwitchType(String str) {
        switch (zzUR.zzTP(str)) {
            case 0:
            case 1:
            case 2:
                return 1;
            case 3:
            case 4:
            case 5:
            case 6:
                return 2;
            default:
                return 0;
        }
    }

    public String getTarget() {
        return zzZgq().zzt("\\t", false);
    }

    public boolean isImageMap() {
        return zzZgq().zzMj("\\m");
    }

    @Override // com.aspose.words.Field
    public boolean needStoreOldResultNodes() {
        return zzZdQ() || super.needStoreOldResultNodes();
    }

    public void setAddress(String str) throws Exception {
        zzZgq().zzB(0, str);
    }

    public void setOpenInNewWindow(boolean z) throws Exception {
        zzZgq().zzs("\\n", z);
    }

    public void setScreenTip(String str) throws Exception {
        zzZgq().zzZf("\\o", str);
    }

    public void setSubAddress(String str) throws Exception {
        zzZgq().zzZf("\\l", str);
    }

    public void setTarget(String str) throws Exception {
        zzZgq().zzZf("\\t", str);
    }

    public final boolean zzZfh() {
        return zzZgq().zzMj("\\h");
    }

    public final String zzZfi() {
        return zzZgq().zzt("\\s", false);
    }

    @Override // com.aspose.words.Field
    public final void zzZgJ() {
        Iterator<Node> it = zzZgF().iterator();
        while (it.hasNext()) {
            Inline inline = (Inline) com.aspose.words.internal.zzZKW.zzZ(it.next(), Inline.class);
            if (inline != null && inline.getFont().getStyleIdentifier() == 85) {
                inline.zzZYh().remove(50);
            }
        }
    }

    @Override // com.aspose.words.Field
    public final zzZP6 zzZgM() {
        if (zzZgs() && !zzZdT()) {
            return new zzZP4(this);
        }
        String strZzZdS = zzZdS();
        return strZzZdS != null ? new zzZP5(this, strZzZdS) : new zzZP2(this, "Error! Hyperlink reference not valid.");
    }

    public void isImageMap(boolean z) throws Exception {
        zzZgq().zzs("\\m", z);
    }
}
