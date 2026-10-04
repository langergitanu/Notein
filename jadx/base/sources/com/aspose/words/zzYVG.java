package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYVG {
    private zzYUV zzXUq;
    private zzYUP zzXUr;

    public zzYVG(zzYUP zzyup, zzYUV zzyuv) {
        this.zzXUr = zzyup;
        this.zzXUq = zzyuv;
    }

    public static void zzZ(zzYTV zzytv, String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int i2 = 0;
        while (i < str.length() && str.charAt(i) == '%') {
            sb.append((char) (str.charAt(i + 1) - '1'));
            zzytv.zzYyp()[i2] = (byte) sb.length();
            zzytv.zzYyn()[i2] = str.charAt(i + 3) - '0';
            zzytv.zzYyo()[i2] = str.charAt(i + 5) - '0';
            int i3 = i + 7;
            if (i3 >= str.length() || str.charAt(i3) == '%') {
                i = i3;
            } else {
                sb.append(str.charAt(i3));
                i += 8;
            }
            i2++;
        }
        zzytv.setNumberFormat(sb.toString());
    }

    public final void zzZ(zzYVB zzyvb, zzYMX zzymx, zzYEF zzyef, zzYVH zzyvh) throws Exception {
        zzYMX zzymx2 = (zzYMX) zzymx.zzbn();
        zzymx.clear();
        this.zzXUq.zzY(zzyvb, zzymx, zzyef);
        zzymx2.zzY(zzymx, EditingLanguage.DIVEHI);
        zzymx2.zzY(zzymx, 1580);
        zzymx.zzZ(new zzZMK(zzymx2, zzyvh.getAuthor(), zzyvh.zzkT()));
    }

    public final void zzZ(zzYVB zzyvb, zzYEF zzyef, zzYVH zzyvh) throws Exception {
        zzYEF zzyef2 = (zzYEF) zzyef.zzbn();
        zzyef.clear();
        this.zzXUr.zzW(zzyvb, zzyef);
        zzyef.remove(14);
        zzyef2.zzY(zzyef, 14);
        zzyef2.zzY(zzyef, 12);
        zzyef2.zzY(zzyef, 13);
        zzyef2.zzY(zzyef, 15);
        zzyef2.zzY(zzyef, 40);
        zzyef2.zzY(zzyef, 30);
        zzyef.zzZ(new zzZMK(zzyef2, zzyvh.getAuthor(), zzyvh.zzkT()));
    }
}
