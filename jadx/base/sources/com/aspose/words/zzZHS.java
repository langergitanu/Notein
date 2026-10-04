package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZHS {
    private static int[] zzYqn = new int[0];
    private com.aspose.words.internal.zzGQ zzFh;
    private com.aspose.words.internal.zzZYG<zzZJS> zzYqo = new com.aspose.words.internal.zzZYG<>(false);

    public zzZHS(com.aspose.words.internal.zzGQ zzgq) {
        this.zzFh = zzgq;
    }

    private int[] zzW(String str, Font font) {
        int i = 3;
        zzZJS zzzjsZzZ = zzZ(3, font);
        com.aspose.words.internal.zzZYE zzzye = new com.aspose.words.internal.zzZYE(str);
        com.aspose.words.internal.zzDB zzdb = null;
        while (zzzye.hasNext()) {
            int iIntValue = zzzye.next().intValue();
            int iZzzG = zzzG(iIntValue);
            if (iZzzG != i) {
                zzzjsZzZ = zzZ(iZzzG, font);
                i = iZzzG;
            }
            if (!zzzjsZzZ.zzA1(iIntValue)) {
                if (zzdb == null) {
                    zzdb = new com.aspose.words.internal.zzDB();
                }
                zzdb.add(zzzye.getOffset());
            }
        }
        return zzdb == null ? zzYqn : zzdb.toArray();
    }

    private zzZHU[] zzZ(String str, Font font, int[] iArr) {
        zzZHT zzzht = new zzZHT();
        int length = 0;
        for (int i : iArr) {
            if (i > length) {
                zzzht.zzZ6(C22241OooO0Oo.OooO00o(i, length, length, length, str), null);
            }
            int iZzA = com.aspose.words.internal.zzZVS.zzA(str, i);
            String strZzZ = zzZ(zzzG(iZzA), font).zzZ(iZzA, this.zzFh);
            String strZzS7 = com.aspose.words.internal.zzZVS.zzS7(iZzA);
            zzzht.zzZ6(strZzS7, strZzZ);
            length = strZzS7.length() + i;
        }
        if (length < str.length()) {
            zzzht.zzZ6(str.substring(length), null);
        }
        return zzzht.zzZ25();
    }

    private static int zzzG(int i) {
        if (i <= 65535) {
            return zzY0C.zzzG((char) i);
        }
        return 0;
    }

    public final zzZHU[] zzX(String str, Font font) {
        int[] iArrZzW = zzW(str, font);
        return iArrZzW.length == 0 ? new zzZHU[]{new zzZHU(str)} : zzZ(str, font, iArrZzW);
    }

    private zzZJS zzZ(int i, Font font) {
        String nameOther;
        if (i == 0) {
            nameOther = font.getNameOther();
        } else if (i == 1) {
            nameOther = font.getNameFarEast();
        } else if (i == 2) {
            nameOther = font.getNameBi();
        } else if (i != 3) {
            nameOther = font.getNameOther();
        } else {
            nameOther = font.getNameAscii();
        }
        zzZJS zzzjs = this.zzYqo.get(nameOther);
        if (zzzjs != null) {
            return zzzjs;
        }
        zzZJS zzzjs2 = new zzZJS(this.zzFh, nameOther);
        this.zzYqo.zzW(nameOther, zzzjs2);
        return zzzjs2;
    }
}
