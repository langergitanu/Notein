package com.aspose.words;

import java.io.OutputStream;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public class OleFormat {
    private OlePackage zzXJe;
    private zzYZB zzXJf;
    private zzZ9A zzYtA;

    public OleFormat(zzZ9A zzz9a) {
        this.zzYtA = zzz9a;
    }

    private com.aspose.words.internal.zzZOR zzDe(String str) {
        if (getOleObject() != null) {
            return getOleObject().zzYrr().zzYt(str);
        }
        return null;
    }

    private void zzL(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        if (zzzop == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: stream");
        }
        if (isLink()) {
            throw new IllegalStateException("This OLE object is linked, and cannot be saved. Only embedded OLE objects can be saved.");
        }
        zzZBL zzzblZzYrB = zzYrB();
        if (zzzblZzYrB == null) {
            throw new IllegalStateException("There is no OLE or OOXML object for saving.");
        }
        zzzblZzYrB.saveForUser(zzzop, this.zzYtA);
    }

    private Object zzPj(int i) {
        return this.zzYtA.fetchShapeAttr(i);
    }

    private void zzQ(int i, Object obj) {
        this.zzYtA.setShapeAttr(i, obj);
    }

    private void zzYrD() {
        zzYTR zzytrZzQ;
        try {
            if (getOleObject() == null || (zzytrZzQ = zzYTR.zzQ(getOleObject().zzYrr())) == null) {
                return;
            }
            zzRP(zzytrZzQ.zzYyj());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private zzYZB zzYrx() throws Exception {
        if (this.zzXJf == null) {
            this.zzXJf = new zzYZB((byte[]) this.zzYtA.getDirectShapeAttr(4102));
        }
        if (this.zzXJf.isValid()) {
            return this.zzXJf;
        }
        return null;
    }

    private void zzZ8(Object obj) {
        if (obj.equals(zzYC3.zzOt(826))) {
            return;
        }
        this.zzYtA.setShapeAttr(826, obj);
    }

    public boolean getAutoUpdate() {
        return ((Boolean) zzPj(4116)).booleanValue();
    }

    public UUID getClsid() {
        return com.aspose.words.internal.zzZOZ.zzV(zzYrC());
    }

    public String getIconCaption() throws Exception {
        if (!getOleIcon()) {
            return "";
        }
        if (zzYrx() != null && zzYrx().isValid() && zzYrx().zzYDL() != null) {
            return zzYrx().zzYDL();
        }
        zzYOC zzyoc = (zzYOC) com.aspose.words.internal.zzZKW.zzZ(zzYrB(), zzYOC.class);
        return (zzyoc == null || !zzyoc.zzYrs()) ? "" : zzyoc.zzYrw();
    }

    public OleControl getOleControl() throws Exception {
        zzZBL zzzblZzYrB = zzYrB();
        OleControl oleControl = (OleControl) com.aspose.words.internal.zzZKW.zzZ(zzzblZzYrB, OleControl.class);
        if (oleControl != null) {
            return oleControl;
        }
        zzYOC zzyoc = (zzYOC) com.aspose.words.internal.zzZKW.zzZ(zzzblZzYrB, zzYOC.class);
        if (zzyoc == null) {
            return null;
        }
        OleControl oleControlZzM = OleControl.zzM(zzyoc.zzYrr());
        if (oleControlZzM != null) {
            zzQ(4112, oleControlZzM);
        }
        return oleControlZzM;
    }

    public byte[] getOleEntry(String str) {
        return zzDe(str).zzWy();
    }

    public boolean getOleIcon() {
        return ((Boolean) zzPj(826)).booleanValue();
    }

    public final zzYOC getOleObject() {
        return (zzYOC) com.aspose.words.internal.zzZKW.zzZ(zzYrB(), zzYOC.class);
    }

    public OlePackage getOlePackage() throws Exception {
        if (this.zzXJe == null && com.aspose.words.internal.zzZKN.equals(getProgId(), zzYOA.zzYrn().zzXJ9) && (zzYrB() instanceof zzYOC)) {
            zzYOC zzyoc = (zzYOC) zzYrB();
            this.zzXJe = new OlePackage(zzyoc);
            zzYOI zzyoiZzN = zzYOI.zzN(zzyoc.zzYrr());
            if (zzyoiZzN != null) {
                com.aspose.words.internal.zzZO0 zzzo0ZzQz = com.aspose.words.internal.zzZO0.zzQz(1251);
                com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR(zzyoiZzN.zzYrG());
                try {
                    com.aspose.words.internal.zzZOX zzzox = new com.aspose.words.internal.zzZOX(zzzor, zzzo0ZzQz);
                    try {
                        this.zzXJe.zzZ(zzzox);
                    } finally {
                        zzzox.close();
                    }
                } finally {
                    zzzor.close();
                }
            }
        }
        return this.zzXJe;
    }

    public String getProgId() {
        zzZBL zzzblZzYrB = zzYrB();
        return (zzzblZzYrB == null || !zzzblZzYrB.isForms2OleControlInternal()) ? (String) zzPj(4113) : Forms2OleControl.zzLi(zzzblZzYrB.getClsidInternal());
    }

    public byte[] getRawData() throws Exception {
        if (getOleObject() != null) {
            com.aspose.words.internal.zzKD zzkd = new com.aspose.words.internal.zzKD(getOleObject().zzYrr());
            com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
            zzkd.zzL(zzzor);
            return zzzor.zzWy();
        }
        if (zzYrA() == null) {
            return null;
        }
        com.aspose.words.internal.zzZOR zzzor2 = new com.aspose.words.internal.zzZOR((int) zzYrA().zzR1().getLength());
        com.aspose.words.internal.zzZYQ.zzX(zzYrA().zzR1(), zzzor2);
        return zzzor2.zzWy();
    }

    public String getSourceFullName() throws Exception {
        String str = (String) zzPj(4114);
        return (com.aspose.words.internal.zzZYD.zzXk(str) || getOlePackage() == null || !getOlePackage().isLink()) ? str : getOlePackage().getFileName();
    }

    public String getSourceItem() {
        return (String) zzPj(4115);
    }

    public String getSuggestedExtension() throws Exception {
        zzZBL zzzblZzYrB = zzYrB();
        return zzzblZzYrB != null ? zzzblZzYrB.getExtensionForUser(getProgId()) : "";
    }

    public String getSuggestedFileName() throws Exception {
        zzZBL zzzblZzYrB = zzYrB();
        return zzzblZzYrB != null ? zzzblZzYrB.getFileNameForUser() : "";
    }

    public boolean isLink() throws Exception {
        return com.aspose.words.internal.zzZYD.zzXk(getSourceFullName());
    }

    public boolean isLocked() {
        return ((Boolean) zzPj(4117)).booleanValue();
    }

    public void save(OutputStream outputStream) throws Exception {
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        zzL(zzzor);
        zzzor.zzH(0L);
        com.aspose.words.internal.zzZKB.zzZ(zzzor, outputStream);
    }

    public void setAutoUpdate(boolean z) {
        zzQ(4116, Boolean.valueOf(z));
    }

    public void setProgId(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "value");
        zzQ(4113, str);
    }

    public void setSourceFullName(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "value");
        zzQ(4114, str);
    }

    public void setSourceItem(String str) {
        com.aspose.words.internal.zzZ4.zzY((Object) str, "value");
        zzQ(4115, str);
    }

    public final void zzRP(boolean z) {
        zzZ8(Boolean.valueOf(z));
    }

    public final void zzY(zzZBL zzzbl) {
        if (zzzbl == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: value");
        }
        zzQ(4112, zzzbl);
        this.zzXJe = null;
        zzYrD();
    }

    public final zzYO2 zzYrA() {
        return (zzYO2) com.aspose.words.internal.zzZKW.zzZ(zzYrB(), zzYO2.class);
    }

    public final zzZBL zzYrB() {
        return (zzZBL) zzPj(4112);
    }

    public final com.aspose.words.internal.zzZOZ zzYrC() {
        zzZBL zzzblZzYrB = zzYrB();
        return zzzblZzYrB != null ? new com.aspose.words.internal.zzZOZ(zzzblZzYrB.getClsidInternal()) : com.aspose.words.internal.zzZOZ.zzZXP;
    }

    public final boolean zzYry() throws Exception {
        return (isLink() && getOlePackage() == null) ? false : true;
    }

    public final boolean zzYrz() throws Exception {
        return isLink() && zzYrB() == null;
    }

    public final int zzZf9() {
        return ((Integer) zzPj(4118)).intValue();
    }

    public final int zzZfa() {
        return ((Integer) zzPj(4119)).intValue();
    }

    public final void zzqW(int i) {
        zzQ(4119, Integer.valueOf(i));
    }

    public final void zzqX(int i) {
        zzQ(4118, Integer.valueOf(i));
    }

    public final void zzqY(int i) {
        zzQ(StyleIdentifier.PLAIN_TABLE_1, Integer.valueOf(i));
    }

    public void isLocked(boolean z) {
        zzQ(4117, Boolean.valueOf(z));
    }

    public void save(String str) throws Exception {
        com.aspose.words.internal.zzZOS zzzosZzVl = com.aspose.words.internal.zzZOU.zzVl(str);
        try {
            zzL(zzzosZzVl);
        } finally {
            zzzosZzVl.close();
        }
    }
}
