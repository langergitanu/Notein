package com.aspose.words;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
class zzYOM {
    private int zzZCv;
    private Document zzZEY;
    private HashMap<OfficeMath, Shape> zzXJz = new HashMap<>();
    private HashMap<ShapeBase, OfficeMath> zzXJy = new HashMap<>();

    public zzYOM(Document document, int i) {
        this.zzZEY = document;
        this.zzZCv = i;
    }

    private void zzLz(String str) {
        IWarningCallback warningCallback = this.zzZEY.getWarningCallback();
        if (warningCallback != null) {
            OooO00o.OooO0O0(warningCallback, 65536, 3, str);
        }
    }

    public static Shape zzl(OfficeMath officeMath) throws Exception {
        zzZ13 zzz13Zzo = new zzYON().zzo(officeMath);
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        zzg.zzW(new com.aspose.words.internal.zzP9());
        zzg.zzZO().zzY(0.0f, 0.5f, 1);
        zzg.zzX((com.aspose.words.internal.zzZL) zzz13Zzo.zzYGn());
        Shape shapeZzZ = Shape.zzZ((Document) officeMath.getDocument(), zzg, zzz13Zzo.zzZj().getWidth(), zzz13Zzo.zzZj().getHeight() + 1.0f);
        shapeZzZ.setWrapType(0);
        shapeZzZ.getFont().setPosition(-(zzz13Zzo.zzYGq() - (zzz13Zzo.zzZr().getAscentPoints() / 2.0f)));
        zzYVU.zzj(shapeZzZ, officeMath);
        return shapeZzZ;
    }

    public int zzX(OfficeMath officeMath, zzZYM zzzym) throws Exception {
        return 0;
    }

    public int zzY(OfficeMath officeMath, zzZYM zzzym) throws Exception {
        return zzZ(officeMath, zzzym) ? 1 : 0;
    }

    public void zzZ(OfficeMath officeMath, Shape shape) throws Exception {
    }

    public final Map<ShapeBase, OfficeMath> zzZn6() {
        return this.zzXJy;
    }

    public final Map<OfficeMath, Shape> zzZn7() {
        return this.zzXJz;
    }

    public final void zzZnb() {
        for (Map.Entry<OfficeMath, Shape> entry : this.zzXJz.entrySet()) {
            Shape value = entry.getValue();
            zzY(entry.getKey(), value);
            value.remove();
        }
    }

    public void zzY(OfficeMath officeMath, Shape shape) {
        officeMath.zzY(this.zzZEY);
        zzYVU.zzj(officeMath, shape);
    }

    public boolean zzZ(OfficeMath officeMath, zzZYM zzzym) throws Exception {
        if (officeMath.getDocument().getNodeType() == 31) {
            return false;
        }
        Shape shapeZzl = zzl(officeMath);
        officeMath.remove();
        com.aspose.words.internal.zzZQF.zzY(this.zzXJz, officeMath, shapeZzl);
        com.aspose.words.internal.zzZQF.zzY(this.zzXJy, shapeZzl, officeMath);
        zzZ(officeMath, shapeZzl);
        shapeZzl.accept(zzzym);
        zzLz(com.aspose.words.internal.zzZKN.format("Office math is not supported in {0} format and will be converted to shape.", FileFormatUtil.zzC9(this.zzZCv)));
        return true;
    }
}
