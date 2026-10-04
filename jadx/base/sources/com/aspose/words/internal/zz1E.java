package com.aspose.words.internal;

import com.aspose.words.EditingLanguage;
import com.aspose.words.StyleIdentifier;
import com.huawei.hms.network.embedded.C18438z3;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
final class zz1E extends zz4I {
    private static zzD5 zzfo;

    static {
        zzt4();
    }

    public static int zzH(byte b) {
        int iZzVB = zzfo.zzVB(b & 255);
        if (iZzVB != Integer.MIN_VALUE) {
            return iZzVB;
        }
        return 63;
    }

    public static byte zzTD(int i) {
        int iZzVC = zzfo.zzVC(i);
        if (iZzVC != Integer.MIN_VALUE) {
            return (byte) iZzVC;
        }
        return (byte) 63;
    }

    public static boolean zzTE(int i) {
        return zzfo.zzVC(i) != Integer.MIN_VALUE;
    }

    public static boolean zzXJ(String str) {
        if (str == null) {
            return false;
        }
        Iterator itOooO00o = OooO0OO.OooO00o(str);
        while (itOooO00o.hasNext()) {
            if (!zzTE(((Integer) itOooO00o.next()).intValue())) {
                return false;
            }
        }
        return true;
    }

    private static void zzt4() {
        zzfo = new zzD5();
        for (int i = 32; i <= 126; i++) {
            zzfo.zz2(i, 255 & ((byte) i));
        }
        for (int i2 = 161; i2 <= 255; i2++) {
            if (i2 != 173) {
                zzfo.zz2(i2, ((byte) i2) & 255);
            }
        }
        zzfo.zz2(8364, 128);
        zzfo.zz2(EditingLanguage.BOSNIAN_CYRILLIC, 130);
        zzfo.zz2(402, 131);
        zzfo.zz2(8222, 132);
        zzfo.zz2(8230, 133);
        zzfo.zz2(8224, 134);
        zzfo.zz2(8225, 135);
        zzfo.zz2(710, 136);
        zzfo.zz2(8240, 137);
        zzfo.zz2(StyleIdentifier.LIST_TABLE_3_ACCENT_4, 138);
        zzfo.zz2(8249, 139);
        zzfo.zz2(StyleIdentifier.LIST_TABLE_3_ACCENT_2, 140);
        zzfo.zz2(381, 142);
        zzfo.zz2(8216, 145);
        zzfo.zz2(8217, 146);
        zzfo.zz2(C18438z3.f56774j, 147);
        zzfo.zz2(8221, 148);
        zzfo.zz2(8226, 149);
        zzfo.zz2(8211, 150);
        zzfo.zz2(8212, 151);
        zzfo.zz2(732, 152);
        zzfo.zz2(8482, 153);
        zzfo.zz2(StyleIdentifier.LIST_TABLE_4_ACCENT_4, 154);
        zzfo.zz2(8250, 155);
        zzfo.zz2(StyleIdentifier.LIST_TABLE_4_ACCENT_2, 156);
        zzfo.zz2(382, 158);
        zzfo.zz2(376, 159);
    }

    public static int zzt5() {
        return 255;
    }

    public static int zzt6() {
        return 32;
    }

    @Override // com.aspose.words.internal.zz4I
    public final void zzI(zzFY zzfy) throws Exception {
        zzfy.zzH("/Encoding", "/WinAnsiEncoding");
    }

    @Override // com.aspose.words.internal.zz4I
    public final void zzX(zz4X zz4x) throws Exception {
        zz4x.zzsX();
    }

    @Override // com.aspose.words.internal.zz4I
    public final void zzY(zz4X zz4x) throws Exception {
        zz4x.zzsY();
    }

    @Override // com.aspose.words.internal.zz4I
    public final void zzZ(int i, int i2, zz4X zz4x) throws Exception {
        if (zzTE(i2)) {
            zz4x.zzG(zzTD(i2));
        }
    }

    public static boolean zzI(byte b) {
        return zzfo.zzVB(b & 255) != Integer.MIN_VALUE;
    }
}
