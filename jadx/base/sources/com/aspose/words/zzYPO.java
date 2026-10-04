package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYPO {
    private zzZ zzXM1;
    private zzZ zzXM2;
    private zzZ zzXM3;
    private ArrayList<Style> zzXM4 = new ArrayList<>();
    private zzYPP zzXM5;
    private zzYPP zzXM6;

    public zzYPO() {
        byte b = 0;
        this.zzXM3 = new zzZ(b);
        this.zzXM2 = new zzZ(b);
        this.zzXM1 = new zzZ(b);
    }

    public final void clear() {
        this.zzXM3.clear();
        this.zzXM2.clear();
        this.zzXM1.clear();
    }

    public final zzYPP zzK(String str, String str2, boolean z) {
        zzYPP zzyppZzY = zzY(str, str2, z, true);
        return zzyppZzY == null ? zzZ(this.zzXM1, str, str2) : zzyppZzY;
    }

    public final zzYPP zzY(String str, String str2, boolean z, boolean z2) {
        zzYPP zzyppZzZ;
        return !z2 ? zzZ(this.zzXM1, str, str2) : (!z || (zzyppZzZ = zzZ(this.zzXM2, str, str2)) == null) ? zzZ(this.zzXM3, str, str2) : zzyppZzZ;
    }

    public final zzYPP zzYh(String str, String str2) {
        if (str == null) {
            return zzZ(this.zzXM1, str2);
        }
        zzYPP zzyppZzZ = zzZ(this.zzXM1, str, str2);
        if (zzyppZzZ == null) {
            zzyppZzZ = zzZ(this.zzXM3, str, str2);
        }
        return zzyppZzZ == null ? zzZ(this.zzXM2, str, str2) : zzyppZzZ;
    }

    public final ArrayList<Style> zzYtY() {
        return this.zzXM4;
    }

    public final zzYPP zzYtZ() {
        return this.zzXM5;
    }

    public final zzYPP zzYu0() {
        return this.zzXM6;
    }

    public final int zzYu1() {
        return this.zzXM3.getCount();
    }

    public final int zzYu2() {
        return this.zzXM2.getCount();
    }

    public final int zzYu3() {
        return this.zzXM1.getCount();
    }

    public final void zzZ(zzYPP zzypp, boolean z, boolean z2) {
        if (z2) {
            if (z) {
                this.zzXM2.zzX(zzypp);
            } else {
                this.zzXM3.zzX(zzypp);
            }
        }
        this.zzXM1.zzX(zzypp);
    }

    public final zzYPP zzrD(int i) {
        return this.zzXM2.zzrC(i);
    }

    public final zzYPP zzrE(int i) {
        return this.zzXM3.zzrC(i);
    }

    public final zzYPP zzrF(int i) {
        return this.zzXM1.zzrC(i);
    }

    public static class zzZ implements Iterable<zzYPP> {
        private ArrayList<zzYPP> zzXK;
        private com.aspose.words.internal.zzZYG<zzYPP> zzXLZ;
        private com.aspose.words.internal.zzZYG<zzYPP> zzXM0;

        private zzZ() {
            this.zzXK = new ArrayList<>();
            this.zzXM0 = new com.aspose.words.internal.zzZYG<>();
            this.zzXLZ = new com.aspose.words.internal.zzZYG<>();
        }

        private static String zzYf(String str, String str2) {
            return str + (char) 0 + str2;
        }

        public final void clear() {
            this.zzXK.clear();
            this.zzXM0.clear();
            this.zzXLZ.clear();
        }

        public final int getCount() {
            return this.zzXK.size();
        }

        @Override // java.lang.Iterable
        public final Iterator<zzYPP> iterator() {
            return this.zzXK.iterator();
        }

        public final zzYPP zzDQ(String str) {
            if (str == null) {
                return null;
            }
            return this.zzXM0.get(str);
        }

        public final void zzX(zzYPP zzypp) {
            com.aspose.words.internal.zzZQG.zzZ(this.zzXK, zzypp);
            if (zzypp.getName() != null && !this.zzXM0.containsKey(zzypp.getName())) {
                this.zzXM0.zzW(zzypp.getName(), zzypp);
            }
            zzYPQ zzypq = (zzYPQ) com.aspose.words.internal.zzZKW.zzZ(zzypp, zzYPQ.class);
            if (zzypq != null) {
                String strZzYf = zzYf(zzypp.getName(), zzypq.getFamily());
                if (this.zzXLZ.containsKey(strZzYf)) {
                    return;
                }
                this.zzXLZ.zzW(strZzYf, zzypp);
            }
        }

        public final zzYPQ zzYg(String str, String str2) {
            return (zzYPQ) this.zzXLZ.get(zzYf(str, str2));
        }

        public final zzYPP zzrC(int i) {
            return this.zzXK.get(i);
        }

        public /* synthetic */ zzZ(byte b) {
            this();
        }
    }

    private static zzYPP zzZ(zzZ zzz, String str) {
        Iterator<zzYPP> it = zzz.iterator();
        while (it.hasNext()) {
            zzYPQ zzypq = (zzYPQ) com.aspose.words.internal.zzZKW.zzZ(it.next(), zzYPQ.class);
            if (zzypq != null && com.aspose.words.internal.zzZKN.equals(zzypq.getFamily(), str) && !com.aspose.words.internal.zzZYD.zzXk(zzypq.getName())) {
                return zzypq;
            }
        }
        return null;
    }

    public final void zzY(zzYPP zzypp) {
        this.zzXM5 = zzypp;
    }

    private static zzYPP zzZ(zzZ zzz, String str, String str2) {
        if (str == null) {
            return null;
        }
        return str2 == null ? zzz.zzDQ(str) : zzz.zzYg(str, str2);
    }

    public final void zzZ(zzYPP zzypp) {
        this.zzXM6 = zzypp;
    }
}
