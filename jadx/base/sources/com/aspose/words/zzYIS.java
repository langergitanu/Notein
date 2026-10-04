package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYIS implements com.aspose.words.internal.zzFM {
    private ArrayList<com.aspose.words.internal.zzHG> zzXxz;

    public zzYIS() {
        this(0);
    }

    public final void clear() {
        this.zzXxz.clear();
    }

    @Override // com.aspose.words.internal.zzFM
    public final int getLength() {
        return this.zzXxz.size();
    }

    @Override // com.aspose.words.internal.zzFM
    public final void setLength(int i) {
        if (this.zzXxz.size() == i) {
            return;
        }
        if (this.zzXxz.size() > i) {
            ArrayList<com.aspose.words.internal.zzHG> arrayList = this.zzXxz;
            com.aspose.words.internal.zzZQG.zzV(arrayList, i, arrayList.size() - i);
        } else {
            while (this.zzXxz.size() != i) {
                zzZ(zzYIV.zzXxE);
            }
        }
    }

    @Override // com.aspose.words.internal.zzFM
    public final com.aspose.words.internal.zzFM zz9(int i, int i2) {
        return zzW3(i, i2);
    }

    @Override // com.aspose.words.internal.zzFM
    public final com.aspose.words.internal.zzFO zzEI() {
        return zzYkq();
    }

    public final zzYIS zzT(String str, zzYEF zzyef) {
        for (int i = 0; i < str.length(); i++) {
            zzV(str.charAt(i), zzyef);
        }
        return this;
    }

    public final zzYIS zzV(zzYIU zzyiu) {
        Iterator<com.aspose.words.internal.zzHG> it = zzyiu.iterator();
        while (it.hasNext()) {
            zzZ((zzYIV) it.next());
        }
        return this;
    }

    public final zzYIS zzW3(int i, int i2) {
        com.aspose.words.internal.zzZQG.zzV(this.zzXxz, i, i2);
        return this;
    }

    @Override // com.aspose.words.internal.zzFM
    public final com.aspose.words.internal.zzHG zzW9(int i) {
        return zzpn(i);
    }

    @Override // com.aspose.words.internal.zzFM
    public final com.aspose.words.internal.zzFM zzY(int i, char c, com.aspose.words.internal.zzHG zzhg) {
        return zzY(i, c, (zzYIV) zzhg);
    }

    public final zzYIS zzY8(String str, String str2) {
        if (!com.aspose.words.internal.zzZKN.zzU3(str)) {
            int length = 0;
            while (true) {
                int iZzW = com.aspose.words.internal.zzZKN.zzW(zzYkq().zzEL(), str, length, com.aspose.words.internal.zzZOF.ORDINAL$4894b8c8);
                if (iZzW == -1) {
                    break;
                }
                zzYIV zzyivZzpn = zzpn(iZzW);
                zzW3(iZzW, str.length());
                zzZ(iZzW, str2, zzyivZzpn);
                length = iZzW + str2.length();
            }
        }
        return this;
    }

    public final zzYIU zzYkq() {
        return new zzYIU(this.zzXxz);
    }

    public final void zzZ(int i, zzYIV zzyiv) {
        this.zzXxz.set(i, zzyiv);
    }

    public final zzYIV zzpn(int i) {
        return (zzYIV) this.zzXxz.get(i);
    }

    @Override // com.aspose.words.internal.zzFM
    public final com.aspose.words.internal.zzFM zzz(String str, String str2) {
        return zzY8(str, str2);
    }

    public zzYIS(zzYIU zzyiu) {
        this();
        zzV(zzyiu);
    }

    private zzYIS zzY(int i, char c, zzYIV zzyiv) {
        this.zzXxz.set(i, new zzYIV(c, zzY(zzyiv)));
        return this;
    }

    @Override // com.aspose.words.internal.zzFM
    public final com.aspose.words.internal.zzFM zzZ(com.aspose.words.internal.zzHG zzhg) {
        return zzZ((zzYIV) zzhg);
    }

    private static zzYEF zzY(zzYIV zzyiv) {
        if (zzyiv != null) {
            return zzyiv.zzZYh();
        }
        return new zzYEF();
    }

    public final zzYIS zzV(char c, zzYEF zzyef) {
        return zzZ(new zzYIV(c, zzyef));
    }

    public final zzYIS zzZ(zzYIV zzyiv) {
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzYIV>) this.zzXxz, zzyiv);
        return this;
    }

    public zzYIS(int i) {
        this.zzXxz = new ArrayList<>(i);
    }

    @Override // com.aspose.words.internal.zzFM
    public final com.aspose.words.internal.zzFM zzZ(char c, com.aspose.words.internal.zzHG zzhg) {
        return zzZ(c, (zzYIV) zzhg);
    }

    public final zzYIS zzZ(char c, zzYIV zzyiv) {
        return zzV(c, zzY(zzyiv));
    }

    @Override // com.aspose.words.internal.zzFM
    public final com.aspose.words.internal.zzFM zzZ(int i, com.aspose.words.internal.zzHG zzhg) {
        return zzZ('0', i, (zzYIV) zzhg);
    }

    private zzYIS zzZ(char c, int i, zzYIV zzyiv) {
        zzYEF zzyefZzY = zzY(zzyiv);
        for (int i2 = 0; i2 < i; i2++) {
            zzV('0', zzyefZzY);
        }
        return this;
    }

    @Override // com.aspose.words.internal.zzFM
    public final com.aspose.words.internal.zzFM zzZ(String str, com.aspose.words.internal.zzHG zzhg) {
        return zzZ(str, (zzYIV) zzhg);
    }

    private zzYIS zzZ(String str, zzYIV zzyiv) {
        return zzT(str, zzY(zzyiv));
    }

    @Override // com.aspose.words.internal.zzFM
    public final com.aspose.words.internal.zzFM zzZ(int i, char c, com.aspose.words.internal.zzHG zzhg) {
        return zzZ(i, c, (zzYIV) zzhg);
    }

    private zzYIS zzZ(int i, char c, zzYIV zzyiv) {
        this.zzXxz.add(i, new zzYIV(c, zzY(zzyiv)));
        return this;
    }

    private zzYIS zzZ(int i, String str, zzYIV zzyiv) {
        zzYEF zzyefZzY = zzY(zzyiv);
        int i2 = 0;
        while (i2 < str.length()) {
            this.zzXxz.add(i, new zzYIV(str.charAt(i2), zzyefZzY));
            i2++;
            i++;
        }
        return this;
    }

    @Override // com.aspose.words.internal.zzFM
    public final com.aspose.words.internal.zzFM zzZ(String str, int i, ArrayList<com.aspose.words.internal.zzHG> arrayList) {
        return zzZ(0, str, i, arrayList);
    }

    private zzYIS zzZ(int i, String str, int i2, ArrayList<com.aspose.words.internal.zzHG> arrayList) {
        int i3 = 0;
        while (i3 < i2) {
            zzYEF zzyefZzY = zzY((arrayList == null || i3 >= arrayList.size()) ? null : (zzYIV) arrayList.get(i3));
            int i4 = 0;
            while (i4 < str.length()) {
                this.zzXxz.add(i, new zzYIV(str.charAt(i4), zzyefZzY));
                i4++;
                i++;
            }
            i3++;
        }
        return this;
    }
}
