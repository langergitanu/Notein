package com.aspose.words;

import androidx.core.view.ViewCompat;
import java.io.EOFException;

/* JADX INFO: loaded from: classes6.dex */
final class zzZGZ {
    private static boolean zzI(com.aspose.words.internal.zzZOR zzzor) throws Exception {
        try {
            zzzor.zzH(0L);
            return com.aspose.words.internal.zzEF.zzn(zzzor);
        } catch (EOFException unused) {
            return false;
        }
    }

    private static boolean zzJ(com.aspose.words.internal.zzZOR zzzor) throws Exception {
        try {
            zzzor.zzH(0L);
            return com.aspose.words.internal.zzEF.zzu(zzzor);
        } catch (EOFException unused) {
            return false;
        }
    }

    private static boolean zzK(com.aspose.words.internal.zzZOR zzzor) throws Exception {
        try {
            zzzor.zzH(0L);
            return com.aspose.words.internal.zzEF.zzy(zzzor);
        } catch (EOFException unused) {
            return false;
        }
    }

    private static boolean zzL(com.aspose.words.internal.zzZOR zzzor) throws Exception {
        try {
            zzzor.zzH(0L);
            return com.aspose.words.internal.zzEF.zzA(zzzor);
        } catch (EOFException unused) {
            return false;
        }
    }

    private static boolean zzM(com.aspose.words.internal.zzZOR zzzor) throws Exception {
        try {
            zzzor.zzH(0L);
            return com.aspose.words.internal.zzEF.zzz(zzzor);
        } catch (EOFException unused) {
            return false;
        }
    }

    private static boolean zzN(com.aspose.words.internal.zzZOR zzzor) throws Exception {
        try {
            zzzor.zzH(0L);
            return com.aspose.words.internal.zzEF.zzx(zzzor);
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean zzO(com.aspose.words.internal.zzZOR zzzor) throws Exception {
        if (zzzor == null) {
            return false;
        }
        return zzL(zzzor) || zzM(zzzor) || zzN(zzzor) || zzJ(zzzor) || zzK(zzzor);
    }

    public static boolean zzP(com.aspose.words.internal.zzZOR zzzor) throws Exception {
        if (zzzor == null) {
            return false;
        }
        if (zzL(zzzor) || zzM(zzzor) || zzN(zzzor) || zzI(zzzor)) {
            return true;
        }
        try {
            byte[] bArrZzWy = zzzor.zzWy();
            if (!zzYb(bArrZzWy)) {
                if (!com.aspose.words.internal.zzEF.zzZN(bArrZzWy)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static byte[] zzX(Document document, boolean z) throws Exception {
        GroupShape groupShape = new GroupShape(document);
        groupShape.zze(9.0d, 9.0d);
        groupShape.zzXi(com.aspose.words.internal.zzZPX.zzZm(10, 10));
        Shape shape = new Shape(document, 3);
        shape.setWidth(10.0d);
        shape.setHeight(10.0d);
        groupShape.appendChild(shape);
        if (z) {
            Shape shape2 = new Shape(document, 3);
            shape2.setWidth(5.0d);
            shape2.setHeight(5.0d);
            shape2.setLeft(2.5d);
            shape2.setTop(2.5d);
            shape2.setFillColor(ViewCompat.MEASURED_STATE_MASK);
            shape2.setFilled(true);
            groupShape.appendChild(shape2);
        }
        ShapeRenderer shapeRenderer = groupShape.getShapeRenderer();
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        shapeRenderer.zzZ(zzzor, new ImageSaveOptions(101));
        return com.aspose.words.internal.zzZYQ.zzZX(zzzor);
    }

    public static boolean zzY9(byte[] bArr) throws Exception {
        if (bArr == null || bArr.length == 0) {
            return false;
        }
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR(bArr);
        try {
            return zzP(zzzor);
        } finally {
            zzzor.close();
        }
    }

    public static byte[] zzYa(byte[] bArr) throws Exception {
        try {
            return zzZ8K.zzZW(bArr);
        } catch (com.aspose.words.internal.zzX8 unused) {
            return null;
        }
    }

    private static boolean zzYb(byte[] bArr) throws Exception {
        return zzYa(bArr) != null;
    }
}
