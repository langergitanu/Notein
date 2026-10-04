package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public class FontInfo implements Cloneable {
    private int zzA0;
    private zzZUV zzYxl;
    private byte[] zzYxn;
    private byte[] zzYxo;
    private String zzYxp;
    private int zzzX;
    private int zzzZ;
    private boolean zzYxq = true;
    private int zzzY = -1;
    private String mName = "";
    private String zzYxm = "";

    public FontInfo() {
    }

    private static int zzB7(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    private static int zzB8(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        i2 = 5;
                        if (i != 5) {
                            return 0;
                        }
                    }
                }
            }
        }
        return i2;
    }

    private int zzBa(int i) {
        zzZUW[] zzzuwArrZzBg = zzBg(i);
        if (zzzuwArrZzBg == null) {
            return 0;
        }
        int i2 = 0;
        for (zzZUW zzzuw : zzzuwArrZzBg) {
            if (zzzuw != null) {
                i2++;
            }
        }
        return i2;
    }

    private boolean zzBc(int i) {
        return zzBa(i) != 0;
    }

    private static int zzBe(int i) {
        int i2 = i & 2;
        if (i2 != 0 && (i & 1) != 0) {
            return 3;
        }
        if (i2 != 0) {
            return 2;
        }
        return (i & 1) != 0 ? 1 : 0;
    }

    private zzZUW[] zzBg(int i) {
        zzZUV zzzuv = this.zzYxl;
        if (zzzuv == null) {
            return null;
        }
        return zzzuv.zzEv(i);
    }

    private void zzX(FontInfo fontInfo) {
        com.aspose.words.internal.zzZYD.zzi(this.mName, fontInfo.mName);
        if (this.zzzZ == 0) {
            this.zzzZ = fontInfo.zzzZ;
        }
        if ("".equals(this.zzYxm)) {
            this.zzYxm = fontInfo.zzYxm;
        }
        if (this.zzA0 == 0) {
            this.zzA0 = fontInfo.zzA0;
        }
        if (this.zzzX == 0) {
            this.zzzX = fontInfo.zzzX;
        }
        if (this.zzYxq) {
            this.zzYxq = fontInfo.zzYxq;
        }
        if ((!zzZ73() || this.zzzY == 0) && !com.aspose.words.internal.zzZYD.zzXk(this.zzYxp)) {
            this.zzzY = fontInfo.zzzY;
            this.zzYxp = fontInfo.zzYxp;
        }
        if (this.zzYxo == null) {
            this.zzYxo = fontInfo.zzYxo;
        }
        if (this.zzYxn == null) {
            this.zzYxn = fontInfo.zzYxn;
        }
        zzZN2 zzzn2 = new zzZN2(this.zzYxn);
        zzzn2.zzB4(fontInfo.getCharset());
        zzzn2.zzB4(this.zzzY);
        this.zzYxn = zzzn2.getData();
    }

    public String getAltName() {
        return this.zzYxm;
    }

    public int getCharset() {
        if (zzZ73()) {
            return this.zzzY;
        }
        int iZzP = com.aspose.words.internal.zzJF.zzP(this.zzYxp, this.mName);
        if (iZzP != -1) {
            return iZzP;
        }
        return 0;
    }

    public byte[] getEmbeddedFont(int i, int i2) {
        zzZUW zzzuwZzXN;
        zzZUV zzzuv = this.zzYxl;
        if (zzzuv == null || (zzzuwZzXN = zzzuv.zzXN(i, i2)) == null) {
            return null;
        }
        return zzzuwZzXN.getData();
    }

    public byte[] getEmbeddedFontAsOpenType(int i) {
        zzZUV zzzuv = this.zzYxl;
        if (zzzuv == null) {
            return null;
        }
        return zzzuv.zzEt(i);
    }

    public int getFamily() {
        return this.zzA0;
    }

    public String getName() {
        return this.mName;
    }

    public byte[] getPanose() {
        return this.zzYxo;
    }

    public int getPitch() {
        return this.zzzZ;
    }

    public final int getWeight() {
        return this.zzzX;
    }

    public boolean isTrueType() {
        return this.zzYxq;
    }

    public Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public void setAltName(String str) {
        if (str == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: value");
        }
        this.zzYxm = str;
    }

    public void setCharset(int i) {
        this.zzzY = i;
        if (zzZ73()) {
            this.zzYxp = null;
        }
    }

    public void setFamily(int i) {
        this.zzA0 = i;
    }

    public final void setName(String str) {
        if (str == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: name");
        }
        com.aspose.words.internal.zzZKN.zzU3(this.mName);
        this.mName = str;
    }

    public void setPanose(byte[] bArr) {
        if (bArr != null && bArr.length != 10) {
            throw new IllegalArgumentException("Incorrect array length.");
        }
        this.zzYxo = bArr;
    }

    public void setPitch(int i) {
        this.zzzZ = i;
    }

    public final void zzB9(int i) {
        this.zzzX = i;
    }

    public final boolean zzBb(int i) {
        return zzBf(0) != null;
    }

    public final com.aspose.words.internal.zzZXH zzBd(int i) {
        zzZUV zzzuv = this.zzYxl;
        if (zzzuv == null) {
            return null;
        }
        return zzzuv.zzEu(zzBe(i));
    }

    public final zzZUW zzBf(int i) {
        if (this.zzYxl == null) {
            return null;
        }
        int iZzBe = zzBe(i);
        zzZUW zzzuwZzXN = this.zzYxl.zzXN(1, iZzBe);
        if (zzzuwZzXN != null && zzzuwZzXN.getData() != null) {
            return zzzuwZzXN;
        }
        zzZUW zzzuwZzXN2 = this.zzYxl.zzXN(0, iZzBe);
        if (zzzuwZzXN2 == null || zzzuwZzXN2.getData() == null) {
            return null;
        }
        return zzzuwZzXN2;
    }

    public final com.aspose.words.internal.zzJG zzHC() {
        return this.zzYxn == null ? com.aspose.words.internal.zzJG.zzzU : new com.aspose.words.internal.zzJG(this.zzYxn);
    }

    public final void zzI(com.aspose.words.internal.zzZXH zzzxh) throws Exception {
        com.aspose.words.internal.zzZOP zzzopOpenStream = zzzxh.zzpB().openStream();
        try {
            zzW(com.aspose.words.internal.zzZYQ.zzZX(zzzopOpenStream), 1, zzBe(zzzxh.getStyle()), false);
        } finally {
            if (zzzopOpenStream != null) {
                zzzopOpenStream.close();
            }
        }
    }

    public final void zzLo(String str) {
        this.zzYxp = str;
        if (com.aspose.words.internal.zzZYD.zzXk(str)) {
            this.zzzY = -1;
        }
    }

    public final void zzV(com.aspose.words.internal.zzJO zzjo) throws Exception {
        com.aspose.words.internal.zzZOR zzzor = new com.aspose.words.internal.zzZOR();
        try {
            zzjo.zzY(zzzor);
            zzW(zzzor.zzWy(), 1, zzBe(zzjo.getStyle()), !zzjo.zzHo());
        } finally {
            zzzor.close();
        }
    }

    public final void zzW(byte[] bArr, int i, int i2, boolean z) {
        if (this.zzYxl == null) {
            this.zzYxl = new zzZUV();
        }
        this.zzYxl.zzZ(new zzZUW(bArr, i, i2, z));
    }

    public final void zzY(FontInfo fontInfo) {
        zzX(fontInfo);
        if (fontInfo.zzYxl == null) {
            return;
        }
        if (this.zzYxl == null) {
            this.zzYxl = new zzZUV();
        }
        this.zzYxl.zzZ(fontInfo.zzYxl);
    }

    public final void zzYe(byte[] bArr) {
        this.zzYxn = bArr;
    }

    public final com.aspose.words.internal.zzJJ zzZ72() {
        return new com.aspose.words.internal.zzJJ(new com.aspose.words.internal.zzJW(this.zzYxo), zzHC(), this.zzYxn == null ? com.aspose.words.internal.zzK7.zzBC : new com.aspose.words.internal.zzK7(this.zzYxn), zzB8(this.zzA0), zzB7(this.zzzZ), this.zzzY, this.zzzX);
    }

    public final boolean zzZ73() {
        return this.zzzY != -1;
    }

    public final byte[] zzZ74() {
        return this.zzYxn;
    }

    public final String zzZ75() {
        return com.aspose.words.internal.zzZYD.zzXk(this.zzYxp) ? this.zzYxp : zzZ73() ? com.aspose.words.internal.zzJF.zzWH(this.zzzY) : "";
    }

    public final void zzZ76() {
        this.zzYxl = null;
    }

    public final boolean zzZ77() {
        return zzBc(1) || zzBc(0);
    }

    public final zzZUW[] zzZ78() {
        if (zzBc(1)) {
            return zzBg(1);
        }
        if (zzBc(0)) {
            return zzBg(0);
        }
        return null;
    }

    public final ArrayList<String> zzZ79() {
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str : com.aspose.words.internal.zzZKN.zzR(this.zzYxm, ',')) {
            String strZzS = com.aspose.words.internal.zzZKN.zzS(str, ControlChar.SPACE_CHAR);
            if (com.aspose.words.internal.zzZYD.zzXk(strZzS)) {
                com.aspose.words.internal.zzZQG.zzZ(arrayList, strZzS);
            }
        }
        return arrayList;
    }

    public final com.aspose.words.internal.zzZXH zzZ7a() {
        zzZUV zzzuv = this.zzYxl;
        if (zzzuv == null) {
            return null;
        }
        return zzzuv.zzZjw();
    }

    public final FontInfo zzZ7b() {
        FontInfo fontInfo = (FontInfo) memberwiseClone();
        zzZUV zzzuv = this.zzYxl;
        if (zzzuv != null) {
            fontInfo.zzYxl = zzzuv.zzZjx();
        }
        byte[] bArr = this.zzYxo;
        if (bArr != null) {
            fontInfo.zzYxo = (byte[]) bArr.clone();
        }
        byte[] bArr2 = this.zzYxn;
        if (bArr2 != null) {
            fontInfo.zzYxn = (byte[]) bArr2.clone();
        }
        return fontInfo;
    }

    public void isTrueType(boolean z) {
        this.zzYxq = z;
    }

    public FontInfo(String str) {
        setName(str);
    }

    public final void zzY(zzZUW zzzuw) {
        if (this.zzYxl == null) {
            this.zzYxl = new zzZUV();
        }
        this.zzYxl.zzZ(zzzuw);
    }
}
