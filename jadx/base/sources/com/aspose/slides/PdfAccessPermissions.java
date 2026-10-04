package com.aspose.slides;

import com.aspose.slides.p559ms.System.AbstractC14106wy;

/* JADX INFO: loaded from: classes3.dex */
public final class PdfAccessPermissions extends AbstractC14106wy {
    public static final int AddOrModifyFields = 32;
    public static final int AssembleDocument = 1024;
    public static final int CopyTextAndGraphics = 16;
    public static final int ExtractTextAndGraphics = 512;
    public static final int FillExistingFields = 256;
    public static final int HighQualityPrint = 2048;
    public static final int ModifyContent = 8;
    public static final int None = 0;
    public static final int PrintDocument = 4;

    static {
        AbstractC14106wy.register(new AbstractC14106wy.kk(PdfAccessPermissions.class, Integer.class) { // from class: com.aspose.slides.PdfAccessPermissions.1
            {
                addConstant("None", 0L);
                addConstant("PrintDocument", 4L);
                addConstant("ModifyContent", 8L);
                addConstant("CopyTextAndGraphics", 16L);
                addConstant("AddOrModifyFields", 32L);
                addConstant("FillExistingFields", 256L);
                addConstant("ExtractTextAndGraphics", 512L);
                addConstant("AssembleDocument", 1024L);
                addConstant("HighQualityPrint", 2048L);
            }
        });
    }

    private PdfAccessPermissions() {
    }
}
