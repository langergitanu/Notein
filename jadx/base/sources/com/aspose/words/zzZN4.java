package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZN4 {
    private static byte[] zzYxe = new byte[10];
    private static byte[] zzYxd = new byte[24];

    public static void zzZ(FontInfoCollection fontInfoCollection, zzZRA zzzra, com.aspose.words.internal.zzZOX zzzox, com.aspose.words.internal.zzZOX zzzox2, IWarningCallback iWarningCallback) throws Exception {
        if (zzzra.zzYGE.zzXAq.zzYHK < 0) {
            zzY1Z.zzZ(iWarningCallback, 10, "Invalid font table reference, ignored.", new Object[0]);
            return;
        }
        zzzox.zzq().zzH(zzzra.zzYGE.zzXAq.zzYHK);
        zzZ(fontInfoCollection, zzzox, zzzra.zzYGE.zzXAq.zzYHJ, iWarningCallback, zzzra);
        if (zzZRA.zzDL(zzzra.zzYHB)) {
            return;
        }
        zzzox.zzq().zzH(zzzra.zzYGE.zzXzG.zzYHK);
        zzZ(fontInfoCollection, zzzox, zzzra.zzYGE.zzXzG.zzYHJ, zzzox2, iWarningCallback);
    }

    private static void zzZ(FontInfoCollection fontInfoCollection, com.aspose.words.internal.zzZOX zzzox, int i, IWarningCallback iWarningCallback, zzZRA zzzra) throws Exception {
        if (i == 0) {
            return;
        }
        int position = (int) zzzox.zzq().getPosition();
        if (zzZRA.zzDL(zzzra.zzYHB)) {
            zzzox.zzXa();
        } else {
            zzzox.zzXc();
        }
        int position2 = 0;
        while (position2 < i) {
            FontInfo fontInfoZzZ = zzZ(zzzox, iWarningCallback, zzzra);
            if (fontInfoZzZ != null) {
                fontInfoCollection.zzW(fontInfoZzZ);
            }
            position2 = ((int) zzzox.zzq().getPosition()) - position;
        }
    }

    private static void zzZ(FontInfoCollection fontInfoCollection, com.aspose.words.internal.zzZOX zzzox, int i, com.aspose.words.internal.zzZOX zzzox2, IWarningCallback iWarningCallback) throws Exception {
        if (i == 0) {
            return;
        }
        zzzox.zzXa();
        short sZzXa = zzzox.zzXa();
        zzzox.zzXc();
        zzzox.zzXa();
        for (int i2 = 0; i2 < sZzXa; i2++) {
            int iZzXc = zzzox.zzXc();
            int iZzXa = zzzox.zzXa();
            int iZzXa2 = zzzox.zzXa() & 3;
            boolean z = (((long) zzzox.zzXb()) & 4294967295L) != 4294967295L;
            long j = iZzXc;
            zzzox2.zzq().zzH(j);
            int iZzXc2 = zzzox2.zzXc();
            zzzox2.zzq().zzH(j);
            if (iZzXa > fontInfoCollection.getCount() - 1) {
                zzY1Z.zzZ(iWarningCallback, 10, "Invalid embedded font index {0}.", Integer.valueOf(iZzXa));
                iZzXa = fontInfoCollection.getCount() - 1;
            }
            fontInfoCollection.get(iZzXa).zzW(zzzox2.zzn(iZzXc2), 0, iZzXa2, z);
        }
    }

    public static void zzZ(FontInfoCollection fontInfoCollection, zzZRA zzzra, com.aspose.words.internal.zzZOW zzzow, com.aspose.words.internal.zzZOW zzzow2) throws Exception {
        zzzra.zzYGE.zzXAq.zzYHK = (int) zzzow.zzq().getPosition();
        zzzra.zzYGE.zzXAq.zzYHJ = zzZ(fontInfoCollection, zzzow);
        zzzra.zzYGE.zzXzG.zzYHK = (int) zzzow.zzq().getPosition();
        zzzra.zzYGE.zzXzG.zzYHJ = zzZ(fontInfoCollection, zzzow, zzzow2);
    }

    private static int zzZ(FontInfoCollection fontInfoCollection, com.aspose.words.internal.zzZOW zzzow) throws Exception {
        int position = (int) zzzow.zzq().getPosition();
        zzzow.zzl(fontInfoCollection.getCount());
        Iterator<FontInfo> it = fontInfoCollection.iterator();
        while (it.hasNext()) {
            zzZ(it.next(), zzzow);
        }
        return ((int) zzzow.zzq().getPosition()) - position;
    }

    private static int zzZ(FontInfoCollection fontInfoCollection, com.aspose.words.internal.zzZOW zzzow, com.aspose.words.internal.zzZOW zzzow2) throws Exception {
        int position = (int) zzzow.zzq().getPosition();
        zzzow.zzK((short) 0);
        long position2 = zzzow.zzq().getPosition();
        zzzow.zzK((short) 0);
        zzzow.zzl(64);
        zzzow.zzK((short) 26);
        int i = 0;
        for (int i2 = 0; i2 < fontInfoCollection.getCount(); i2++) {
            FontInfo fontInfo = fontInfoCollection.get(i2);
            zzZUW[] zzzuwArrZzZ78 = fontInfo.zzZ78();
            if (zzzuwArrZzZ78 != null) {
                int i3 = i;
                for (zzZUW zzzuw : zzzuwArrZzZ78) {
                    if (zzzuw != null && zzZ(zzzuw, i2, i3, zzzow, zzzow2, fontInfo.getName())) {
                        i3++;
                    }
                }
                i = i3;
            }
        }
        long position3 = zzzow.zzq().getPosition();
        zzzow.zzq().zzH(position2);
        zzzow.zzK((short) i);
        zzzow.zzq().zzH(position3);
        return ((int) zzzow.zzq().getPosition()) - position;
    }

    private static boolean zzZ(zzZUW zzzuw, int i, int i2, com.aspose.words.internal.zzZOW zzzow, com.aspose.words.internal.zzZOW zzzow2, String str) throws Exception {
        byte[] data;
        zzZUW zzzuwZzMF = zzzuw.zzMF(str);
        if (zzzuwZzMF == null || (data = zzzuwZzMF.getData()) == null) {
            return false;
        }
        zzzow.zzl((int) zzzow2.zzq().getPosition());
        zzzow.zzK((short) i);
        zzzow.zzK((short) zzzuw.getStyle());
        zzzow.zzk((int) (zzzuw.zzZjy() ? ((long) i2) & 4294967295L : -1L));
        zzzow2.writeBytes(data);
        return true;
    }

    private static FontInfo zzZ(com.aspose.words.internal.zzZOX zzzox, IWarningCallback iWarningCallback, zzZRA zzzra) throws Exception {
        String strZzR;
        FontInfo fontInfo = new FontInfo();
        int position = (int) zzzox.zzq().getPosition();
        int i = zzzox.readByte() & 255;
        if (i == 0) {
            return null;
        }
        byte b = zzzox.readByte();
        fontInfo.setPitch(b & 3);
        fontInfo.isTrueType((b & 4) != 0);
        fontInfo.setFamily((b & 112) >> 4);
        fontInfo.zzB9(zzzox.zzXa());
        fontInfo.setCharset(zzzox.readByte() & 255);
        zzzox.readByte();
        if (!zzZRA.zzDL(zzzra.zzYHB)) {
            fontInfo.setPanose(new byte[10]);
            zzzox.read(fontInfo.getPanose(), 0, fontInfo.getPanose().length);
            fontInfo.zzYe(new byte[24]);
            zzzox.read(fontInfo.zzZ74(), 0, fontInfo.zzZ74().length);
        }
        int position2 = ((int) zzzox.zzq().getPosition()) - position;
        if (i > (zzZRA.zzDL(zzzra.zzYHB) ? 7 : 41)) {
            int i2 = (i - position2) + 1;
            int iZzt = com.aspose.words.internal.zzT8.zzt(fontInfo.getCharset(), 1252);
            if (zzZRA.zzDL(zzzra.zzYHB)) {
                strZzR = zzZZR.zzX(zzzox, i2, iZzt);
            } else {
                strZzR = zzZZR.zzR(zzzox, i2);
            }
        } else {
            strZzR = "";
        }
        int iIndexOf = strZzR.indexOf(0);
        if (iIndexOf < 0) {
            if (!com.aspose.words.internal.zzZYD.zzXk(strZzR)) {
                zzY1Z.zzZ(iWarningCallback, 10, "Invalid font name, replaced with '{0}'.", "Times New Roman");
                strZzR = "Times New Roman";
            }
            fontInfo.setName(strZzR);
            return fontInfo;
        }
        String strSubstring = strZzR.substring(0, iIndexOf);
        String strSubstring2 = strZzR.substring(iIndexOf + 1);
        if (!com.aspose.words.internal.zzZYD.zzXk(strSubstring)) {
            zzY1Z.zzZ(iWarningCallback, 10, "Invalid font name, replaced with '{0}'.", com.aspose.words.internal.zzZYD.zzXk(strSubstring2) ? strSubstring2 : "Times New Roman");
            strSubstring = com.aspose.words.internal.zzZYD.zzXk(strSubstring2) ? strSubstring2 : "Times New Roman";
        }
        fontInfo.setName(strSubstring);
        fontInfo.setAltName(strSubstring2);
        return fontInfo;
    }

    private static void zzZ(FontInfo fontInfo, com.aspose.words.internal.zzZOW zzzow) throws Exception {
        int position = (int) zzzow.zzq().getPosition();
        zzzow.writeByte((byte) 0);
        zzzow.writeByte((byte) (fontInfo.getPitch() | (fontInfo.isTrueType() ? 4 : 0) | (fontInfo.getFamily() << 4)));
        zzzow.zzK((short) fontInfo.getWeight());
        zzzow.writeByte((byte) fontInfo.getCharset());
        zzzow.writeByte((byte) (com.aspose.words.internal.zzZYD.zzXk(fontInfo.getAltName()) ? fontInfo.getName().length() + 1 : 0));
        zzzow.writeBytes(fontInfo.getPanose() != null ? fontInfo.getPanose() : zzYxe);
        zzzow.writeBytes(fontInfo.zzZ74() != null ? fontInfo.zzZ74() : zzYxd);
        zzZZQ.zzZ(fontInfo.getName(), zzzow);
        if (com.aspose.words.internal.zzZYD.zzXk(fontInfo.getAltName())) {
            zzZZQ.zzZ(fontInfo.getAltName(), zzzow);
        }
        int position2 = (int) zzzow.zzq().getPosition();
        zzzow.zzq().zzU(position, 0);
        zzzow.writeByte((byte) ((position2 - position) - 1));
        zzzow.zzq().zzU(position2, 0);
    }
}
