package com.aspose.words;

import Oooo0.C20856OooooOo;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ8K {
    private static boolean zzLX = false;
    private static int zzYjB;
    private static String zzYjC;
    private ImageSize zzYjD;
    private zzZ93 zzYjE;
    private zzZAN zzYjF;
    private Document zzZEY;

    public zzZ8K(Document document, zzZAN zzzan, zzZ93 zzz93) {
        this.zzZEY = document;
        this.zzYjF = zzzan;
        this.zzYjE = zzz93;
    }

    private static byte[] zzR(com.aspose.words.internal.zzZOP zzzop, int i) throws Exception {
        com.aspose.words.internal.zzZOX zzzox = new com.aspose.words.internal.zzZOX(zzzop);
        zzzox.zzX9();
        zzzox.zzX9();
        int iZzX9 = zzzox.zzX9() & 65535;
        if (i < 0 || i >= iZzX9) {
            throw new IllegalArgumentException(C20856OooooOo.OooO0O0("Couldn't extract image with index ", i, " from .ico file, because it contains only ", " image(s).", iZzX9));
        }
        for (int i2 = 0; i2 < iZzX9; i2++) {
            int i3 = zzzox.readByte() & 255;
            if (i3 == 0) {
                i3 = 256;
            }
            int i4 = zzzox.readByte() & 255;
            int i5 = i4 != 0 ? i4 : 256;
            zzzox.readByte();
            zzzox.readByte();
            zzzox.zzX9();
            zzzox.zzX9();
            int iZzXb = (int) (((long) zzzox.zzXb()) & 4294967295L);
            long jZzXb = ((long) zzzox.zzXb()) & 4294967295L;
            if (i2 == i) {
                byte[] bArr = new byte[iZzXb];
                long position = zzzop.getPosition();
                zzzop.zzH(jZzXb);
                zzzox.read(bArr, 0, iZzXb);
                if (iZzX9 <= 1 || position == jZzXb) {
                    zzzop.zzH(position);
                } else {
                    zzzop.zzH(jZzXb);
                }
                return com.aspose.words.internal.zzEF.zzZQ(bArr) ? bArr : com.aspose.words.internal.zzEF.zzZ(zzzox, iZzXb, i3, i5);
            }
        }
        throw new IllegalStateException("Couldn't extract BMP/PNG image from .ico file.");
    }

    private byte[] zzY(byte[] bArr, boolean z) throws Exception {
        if (z) {
            int length = bArr.length - 512;
            byte[] bArr2 = new byte[length];
            com.aspose.words.internal.zzZKV.zzZ(bArr, 512, bArr2, 0, length);
            bArr = bArr2;
        }
        com.aspose.words.internal.zz13 zz13VarZzZf = new com.aspose.words.internal.zz0Z(this.zzZEY.zzZqy()).zzZf(bArr);
        ImageSaveOptions imageSaveOptions = new ImageSaveOptions(FileFormatUtil.zzC8(6));
        com.aspose.words.internal.zzG zzg = new com.aspose.words.internal.zzG();
        zzg.zzW(new com.aspose.words.internal.zzP9());
        zzg.zzZO().zzY(-zz13VarZzZf.zzOw().zzZm(), -zz13VarZzZf.zzOw().zzZo(), 1);
        zzg.zzX((com.aspose.words.internal.zzZL) zz13VarZzZf.zzsP());
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        try {
            zzYDY.zzZ(zzg, zz13VarZzZf.zzOw().getSize(), zzzor, imageSaveOptions, this.zzZEY.zzZqx());
            return com.aspose.words.internal.zzZYQ.zzZX(zzzor);
        } finally {
            zzzor.close();
        }
    }

    private void zzY5(byte[] bArr) throws Exception {
        try {
            if (!com.aspose.words.internal.zzZOV.zzYb(zzYjC)) {
                com.aspose.words.internal.zzZOV.zzVp(zzYjC);
            }
            com.aspose.words.internal.zzZOS zzzosZzVl = com.aspose.words.internal.zzZOU.zzVl(zzYjC + com.aspose.words.internal.zzZOQ.zzZXt + com.aspose.words.internal.zzZOQ.zzVh(this.zzZEY.getOriginalFileName()) + "." + zzYVY() + "." + com.aspose.words.internal.zzKE.zzWX(com.aspose.words.internal.zzEF.zzZU(bArr)));
            try {
                zzzosZzVl.write(bArr, 0, bArr.length);
                zzzosZzVl.flush();
            } finally {
                zzzosZzVl.close();
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public static int zzY6(byte[] bArr) throws Exception {
        com.aspose.words.internal.zzEF.zzZL(bArr);
        return (bArr[4] & 255) + ((bArr[5] & 255) << 8);
    }

    private byte[] zzYVX() throws Exception {
        byte[] bArrZzYW2 = zzYW2();
        return bArrZzYW2 != null ? bArrZzYW2 : com.aspose.words.internal.zzEF.zzDL();
    }

    private static int zzYVY() {
        int i = zzYjB + 1;
        zzYjB = i;
        return i;
    }

    private boolean zzZD(byte[] bArr) {
        return com.aspose.words.internal.zzZ1.zzX(bArr) && this.zzYjE != null && com.aspose.words.internal.zzEF.zzZD(bArr);
    }

    public static byte[] zzZW(byte[] bArr) throws Exception {
        if (bArr == null) {
            return null;
        }
        byte[] bArrZzK = com.aspose.words.internal.zzSJ.zzK(bArr);
        return zzyn(com.aspose.words.internal.zzEF.zzZU(bArrZzK)) ? com.aspose.words.internal.zzEF.zzZK(bArrZzK) ? com.aspose.words.internal.zzEF.zzZ(bArrZzK, com.aspose.words.internal.zzEF.zzZy(bArrZzK)) : bArrZzK : com.aspose.words.internal.zzEF.zzZz(bArrZzK);
    }

    public static byte[] zzq(byte[] bArr, int i) throws Exception {
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR(bArr);
        try {
            return zzR(zzzor, i);
        } finally {
            zzzor.close();
        }
    }

    private static boolean zzyn(int i) {
        return i == 2 || i == 3 || i == 4 || i == 5 || i == 6 || i == 46;
    }

    public final byte[] getImageBytes() throws Exception {
        return this.zzYjF.getImageBytes();
    }

    public final ImageSize getImageSize() throws Exception {
        if (this.zzYjD == null) {
            this.zzYjD = zzZjT() ? new ImageSize(com.aspose.words.internal.zzEF.zzZT(getImageBytes())) : new ImageSize(0, 0);
        }
        return this.zzYjD;
    }

    public final String getSourceFullName() throws Exception {
        return this.zzYjF.getSourceFullName();
    }

    public final boolean hasImage() throws Exception {
        return zzZjT() || isLink();
    }

    public final boolean isLink() throws Exception {
        return com.aspose.words.internal.zzZYD.zzXk(this.zzYjF.getSourceFullName());
    }

    public final boolean isLinkOnly() throws Exception {
        return isLink() && !zzZjT();
    }

    public final void save(String str) throws Exception {
        com.aspose.words.internal.zzZ4.zzU(str, "fileName");
        com.aspose.words.internal.zzZOS zzzosZzVl = com.aspose.words.internal.zzZOU.zzVl(str);
        try {
            zzL(zzzosZzVl);
        } finally {
            zzzosZzVl.close();
        }
    }

    public final void setImage(Bitmap bitmap) throws Exception {
        if (bitmap == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: image");
        }
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        try {
            com.aspose.words.internal.zzXN.zzZ(bitmap, zzzor);
            zzZ1(zzzor);
        } finally {
            zzzor.close();
        }
    }

    public final void setImageBytes(byte[] bArr) throws Exception {
        this.zzYjD = null;
        if (!com.aspose.words.internal.zzZ1.zzX(bArr)) {
            this.zzYjF.setImageBytes(null);
            return;
        }
        if (zzZD(bArr)) {
            this.zzYjF.setImageBytes(zzZ(bArr, null, null, 2));
            return;
        }
        if (com.aspose.words.internal.zzEF.zzZO(bArr)) {
            this.zzYjF.setImageBytes(zzY(bArr, false));
            return;
        }
        if (com.aspose.words.internal.zzEF.zzZN(bArr)) {
            this.zzYjF.setImageBytes(zzY(bArr, true));
        } else if (com.aspose.words.internal.zzEF.zzZL(bArr)) {
            this.zzYjF.setImageBytes(zzq(bArr, 0));
        } else {
            this.zzYjF.setImageBytes(zzZW(bArr));
        }
    }

    public final void setSourceFullName(String str) throws Exception {
        this.zzYjF.setSourceFullName(str);
    }

    public final byte[] toByteArray() throws Exception {
        byte[] imageBytes = getImageBytes();
        return com.aspose.words.internal.zzZ1.zzX(imageBytes) ? imageBytes : zzYVX();
    }

    public final void zzL(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        if (zzzop == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: stream");
        }
        com.aspose.words.internal.zzZOP zzzopZzYVZ = zzYVZ();
        try {
            com.aspose.words.internal.zzZYQ.zzX(zzzopZzYVZ, zzzop);
        } finally {
            if (zzzopZzYVZ != null) {
                zzzopZzYVZ.close();
            }
        }
    }

    public final boolean zzY7(byte[] bArr) throws Exception {
        try {
            if (zzYjC != null) {
                zzY5(bArr);
            }
            setImageBytes(bArr);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public final com.aspose.words.internal.zzZOP zzYVZ() throws Exception {
        byte[] imageBytes = getImageBytes();
        if (com.aspose.words.internal.zzZ1.zzX(imageBytes)) {
            return new com.aspose.words.internal.zzZOR(imageBytes);
        }
        try {
            byte[] bArrZzYW2 = zzYW2();
            return bArrZzYW2 != null ? new com.aspose.words.internal.zzZOR(bArrZzYW2) : com.aspose.words.internal.zzEF.zzDM();
        } catch (Exception unused) {
            return com.aspose.words.internal.zzEF.zzDM();
        }
    }

    public final int zzYW0() throws Exception {
        if (zzZjT()) {
            return com.aspose.words.internal.zzEF.zzZU(getImageBytes());
        }
        if (isLink()) {
            return com.aspose.words.internal.zzKE.zzZT(com.aspose.words.internal.zzZVR.zz8(null, this.zzYjF.getSourceFullName()));
        }
        return 0;
    }

    public final byte[] zzYW2() throws Exception {
        return zzZ8I.zzZ(this.zzYjF.getSourceFullName(), this.zzZEY);
    }

    public final byte[] zzZ(byte[] bArr, zzYB5 zzyb5, zzYB5 zzyb52, int i) throws Exception {
        return this.zzYjE.zzZ(bArr, this.zzZEY, zzyb5, zzyb52, i);
    }

    public final void zzZ1(com.aspose.words.internal.zzZOP zzzop) throws Exception {
        if (zzzop == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: stream");
        }
        setImageBytes(com.aspose.words.internal.zzZYQ.zzZX(zzzop));
    }

    public final boolean zzZjT() throws Exception {
        return this.zzYjF.zzZjT();
    }

    public final void setImage(String str) throws Exception {
        com.aspose.words.internal.zzZ4.zzU(str, "fileName");
        setImageBytes(zzZ8I.zzZ(str, this.zzZEY));
    }
}
