package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYRE {
    private zzYOR zzXRT;

    public zzYRE(zzYOR zzyor) {
        this.zzXRT = zzyor;
    }

    private void zzT(String str, byte[] bArr) throws Exception {
        int iZzZU = com.aspose.words.internal.zzEF.zzZU(bArr);
        String strZzWX = com.aspose.words.internal.zzKE.zzWX(iZzZU);
        zzYOR zzyor = this.zzXRT;
        zzyor.zzrc(zzyor.zzYsB() + 1);
        String str2 = com.aspose.words.internal.zzZKN.format("Pictures/image{0}.{1}", Integer.valueOf(this.zzXRT.zzYsB()), strZzWX);
        zzYQO zzyqo = new zzYQO(str2);
        this.zzXRT.zzYuU().zzYvp().zzZ(zzyqo);
        zzyqo.zzYvo().write(bArr, 0, bArr.length);
        this.zzXRT.zzYst().add(new zzYR5(com.aspose.words.internal.zzKE.zzWY(iZzZU), str2));
        zzYl(str, str2);
    }

    private void zzY(String str, Shape shape) throws Exception {
        byte[] imageBytes = shape.hasImage() ? shape.getImageData().getImageBytes() : shape.getFill().getImageBytes();
        if (com.aspose.words.internal.zzZ1.zzX(imageBytes)) {
            zzT(str, imageBytes);
        } else if (shape.getImageData().isLink()) {
            zzYl("draw:image", zzYOU.zzJ(shape.getImageData().getSourceFullName(), this.zzXRT.getDocument().getBaseUri(), true));
        }
    }

    private void zzYl(String str, String str2) {
        zzYTG zzytgZzYsG = this.zzXRT.zzYsG();
        if ("text:list-level-style-image".equals(str)) {
            zzytgZzYsG.zz0("xlink:href", str2);
            zzytgZzYsG.zz0("xlink:type", "simple");
            zzytgZzYsG.zz0("xlink:show", "embed");
            zzytgZzYsG.zz0("xlink:actuate", "onLoad");
            return;
        }
        zzytgZzYsG.zzGB(str);
        zzytgZzYsG.zzYu("xlink:href", str2);
        zzytgZzYsG.zzYu("xlink:type", "simple");
        zzytgZzYsG.zzYu("xlink:show", "embed");
        zzytgZzYsG.zzYu("xlink:actuate", "onLoad");
        if ("style:background-image".equals(str)) {
            zzytgZzYsG.zzYu("style:repeat", "stretch");
        }
        zzytgZzYsG.zzX("/>");
    }

    public final void zzZ(String str, Shape shape) throws Exception {
        if (this.zzXRT.zzYsC() == 6) {
            return;
        }
        zzY(str, shape);
    }
}
