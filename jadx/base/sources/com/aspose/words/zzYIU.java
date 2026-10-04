package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYIU implements com.aspose.words.internal.zzFO {
    static zzYIU zzXxD = new zzYIU(new zzYIV[0]);
    private String zzXxB;
    private com.aspose.words.internal.zzHG[] zzXxC;
    private ArrayList<zzYIR> zzZw0;

    public zzYIU(ArrayList<com.aspose.words.internal.zzHG> arrayList) {
        this.zzXxC = (com.aspose.words.internal.zzHG[]) arrayList.toArray(new com.aspose.words.internal.zzHG[0]);
    }

    public static zzYIU zzCI(String str) {
        return zzU(str, new zzYEF());
    }

    public static zzYIU zzU(String str, zzYEF zzyef) {
        if (str == null) {
            return null;
        }
        zzYIS zzyis = new zzYIS(str.length());
        zzyis.zzT(str, zzyef);
        return zzyis.zzYkq();
    }

    private zzYIU zzW4(int i, int i2) {
        return new zzYIS(this).zzW3(0, 1).zzYkq();
    }

    @Override // com.aspose.words.internal.zzFO
    public final int getLength() {
        return this.zzXxC.length;
    }

    @Override // com.aspose.words.internal.zzFO
    public final int indexOf(String str) {
        return com.aspose.words.internal.zzZKN.zzT(zzEL(), str, com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8);
    }

    @Override // java.lang.Iterable
    public final Iterator<com.aspose.words.internal.zzHG> iterator() {
        return com.aspose.words.internal.zzZKV.zzT(this.zzXxC);
    }

    public final zzYIU zz2(int... iArr) {
        zzYIS zzyis = new zzYIS();
        Iterator<com.aspose.words.internal.zzHG> it = iterator();
        while (it.hasNext()) {
            zzYIV zzyiv = (zzYIV) it.next();
            zzYEF zzyef = (zzYEF) zzyiv.zzZYh().zzbn();
            for (int i = 0; i < 2; i++) {
                zzyef.remove(iArr[i]);
            }
            zzyis.zzV(zzyiv.getCharacter(), zzyef);
        }
        return zzyis.zzYkq();
    }

    @Override // com.aspose.words.internal.zzFO
    public final com.aspose.words.internal.zzFO zzA(String str, String str2) {
        return zzY9(str, str2);
    }

    @Override // com.aspose.words.internal.zzFO
    public final String zzEL() {
        if (this.zzXxB == null) {
            StringBuilder sb = new StringBuilder(this.zzXxC.length);
            for (com.aspose.words.internal.zzHG zzhg : this.zzXxC) {
                sb.append(zzhg.zzFM());
            }
            this.zzXxB = sb.toString();
        }
        return this.zzXxB;
    }

    @Override // com.aspose.words.internal.zzFO
    public final com.aspose.words.internal.zzFO zzEM() {
        return zzW4(0, 1);
    }

    public final zzYIU zzW5(int i, int i2) {
        return new zzYIU((ArrayList<com.aspose.words.internal.zzHG>) com.aspose.words.internal.zzZQG.zzW(com.aspose.words.internal.zzZQG.zzV(this.zzXxC), i, i2));
    }

    @Override // com.aspose.words.internal.zzFO
    public final com.aspose.words.internal.zzHG zzW9(int i) {
        return zzpn(i);
    }

    public final zzYIU zzY9(String str, String str2) {
        return new zzYIS(this).zzY8(str, str2).zzYkq();
    }

    public final zzYIR[] zzYkm() {
        if (this.zzZw0 == null) {
            this.zzZw0 = new ArrayList<>();
            StringBuilder sb = new StringBuilder();
            zzYEF zzyefZzZYh = null;
            for (com.aspose.words.internal.zzHG zzhg : this.zzXxC) {
                zzYIV zzyiv = (zzYIV) zzhg;
                if (zzyefZzZYh != null && !zzZS.zzZ(zzyefZzZYh, zzyiv.zzZYh(), (int[]) null)) {
                    com.aspose.words.internal.zzZQG.zzZ(this.zzZw0, new zzYIR(sb.toString(), zzyefZzZYh));
                    sb.setLength(0);
                }
                zzyefZzZYh = zzyiv.zzZYh();
                sb.append(zzyiv.getCharacter());
            }
            com.aspose.words.internal.zzZQG.zzZ(this.zzZw0, new zzYIR(sb.toString(), zzyefZzZYh));
        }
        return (zzYIR[]) this.zzZw0.toArray(new zzYIR[0]);
    }

    public final zzYIU zzYkn() {
        if (this.zzXxC.length == 0) {
            return this;
        }
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < this.zzXxC.length; i3++) {
            if (!com.aspose.words.internal.zzZKU.zzG(zzpn(i3).getCharacter())) {
                if (i == -1) {
                    i = i3;
                    i2 = i;
                } else {
                    i2 = i3;
                }
            }
        }
        if (i == -1) {
            return zzXxD;
        }
        zzYIS zzyis = new zzYIS();
        while (i <= i2) {
            zzyis.zzZ(zzpn(i));
            i++;
        }
        return zzyis.zzYkq();
    }

    public final zzYIU zzYko() {
        zzYIS zzyis = new zzYIS(this.zzXxC.length);
        for (com.aspose.words.internal.zzHG zzhg : this.zzXxC) {
            zzyis.zzZ((zzYIV) zzhg.zzFK());
        }
        return zzyis.zzYkq();
    }

    public final zzYIU zzYkp() {
        zzYIS zzyis = new zzYIS(this.zzXxC.length);
        for (com.aspose.words.internal.zzHG zzhg : this.zzXxC) {
            zzyis.zzZ((zzYIV) zzhg.zzFL());
        }
        return zzyis.zzYkq();
    }

    public final zzYIV zzpn(int i) {
        return (zzYIV) this.zzXxC[i];
    }

    public final int indexOf(String str, int i) {
        return com.aspose.words.internal.zzZKN.zzW(zzEL(), str, i, com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8);
    }

    public zzYIU(zzYIV... zzyivArr) {
        zzYIV[] zzyivArr2 = new zzYIV[zzyivArr.length];
        this.zzXxC = zzyivArr2;
        System.arraycopy(zzyivArr, 0, zzyivArr2, 0, zzyivArr.length);
    }
}
