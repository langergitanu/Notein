package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ8D extends zzYJG {
    private int zzYjw;
    private IImageSavingCallback zzYjx;

    public zzZ8D(String str, zzY86 zzy86, String str2, String str3, String str4, boolean z, IImageSavingCallback iImageSavingCallback) throws Exception {
        super(str, zzy86, str2, str3, str4, false, z);
        this.zzYjx = iImageSavingCallback;
    }

    private String zzJz(String str) {
        this.zzYjw++;
        return com.aspose.words.internal.zzZKN.format("{0}.{1}.{2}", zzYlL() != null ? "image" : zzYlK(), com.aspose.words.internal.zzJB.zz5(this.zzYjw), str);
    }

    public final String zzZ(ShapeBase shapeBase, byte[] bArr, int i, int i2, int i3, boolean z) throws Exception {
        zzY3P zzy3pZzZVm;
        String str;
        String str2;
        String strZzJz = zzJz(com.aspose.words.internal.zzKE.zzWX(i3));
        String strZzCM = zzCM(strZzJz);
        if (this.zzYjx != null) {
            ImageSavingArgs imageSavingArgs = new ImageSavingArgs(shapeBase, z, strZzJz);
            this.zzYjx.imageSaving(imageSavingArgs);
            String imageFileName = imageSavingArgs.getImageFileName();
            String strZzCM2 = zzCM(imageFileName);
            zzy3pZzZVm = imageSavingArgs.zzro() ? imageSavingArgs.zzZVm() : null;
            str = imageFileName;
            str2 = strZzCM2;
        } else {
            zzy3pZzZVm = null;
            str = strZzJz;
            str2 = strZzCM;
        }
        if (zzYlL() != null) {
            com.aspose.words.internal.zzZKN.equals(com.aspose.words.internal.zzZOQ.zzVh(str), str);
            zzYlL().zzX(new zzYM(com.aspose.words.internal.zzKE.zzWY(i3), str, bArr, i, i2));
        } else if (zzy3pZzZVm != null) {
            zzy3pZzZVm.zzXU9().write(bArr, i, i2);
        } else {
            zzYlM();
            com.aspose.words.internal.zzZOS zzzosZzVl = com.aspose.words.internal.zzZOU.zzVl(str2);
            try {
                zzzosZzVl.write(bArr, i, i2);
            } finally {
                zzzosZzVl.close();
            }
        }
        if (zzy3pZzZVm != null) {
            zzy3pZzZVm.zzXU8();
        }
        return zzCL(str2);
    }

    public final void zzZ(ShapeBase shapeBase, int i, boolean z) throws Exception {
        if (this.zzYjx == null) {
            return;
        }
        ImageSavingArgs imageSavingArgs = new ImageSavingArgs(shapeBase, z, zzJz(com.aspose.words.internal.zzKE.zzWX(i)));
        this.zzYjx.imageSaving(imageSavingArgs);
        if (imageSavingArgs.zzro()) {
            imageSavingArgs.zzZVm().zzXU8();
        }
    }
}
