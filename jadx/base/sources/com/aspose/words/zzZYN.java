package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZYN {
    private static zzYAS zzYPY = new zzYAS(21514, null);
    private zzYAS[] zzYPZ;
    private zzYAU zzZw6;

    public zzZYN(zzYAU zzyau) {
        zzYAS zzyas = zzYPY;
        this.zzYPZ = new zzYAS[]{zzyas, zzyas, zzyas};
        if (zzyau != null) {
            zzyau.zzaa();
        }
        this.zzZw6 = zzyau;
        if (zzyau != null) {
            return;
        }
        int i = 0;
        while (true) {
            zzYAS[] zzyasArr = this.zzYPZ;
            if (i >= zzyasArr.length) {
                return;
            }
            zzyasArr[i] = null;
            i++;
        }
    }

    private static int zzFC(int i) {
        if (zzY98.zzlj(i)) {
            return i - 2;
        }
        throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: storyType");
    }

    private zzYAS zzY(int i, zzYA3 zzya3) throws Exception {
        zzYAU zzyau;
        zzYAU zzyauZzY6L;
        zzya3.zzY7n();
        if (zzya3.zzaa() == null) {
            zzY9C zzy9cZz4 = this.zzZw6.zzab().zz4(i, false);
            if (zzy9cZz4 == null || zzy9cZz4.zzY4s().isEmpty()) {
                return null;
            }
            if (this.zzZw6.zzY7n() == i) {
                return (zzYAS) this.zzZw6.zzY6L();
            }
            zzyau = this.zzZw6;
        } else {
            zzyau = zzya3;
        }
        zzZ4N zzz4nZzYPe = this.zzZw6.zzab().zzZp0().zzY4s().zzYPe();
        zzz4nZzYPe.zzX(zzyau);
        while (zzz4nZzYPe.movePrevious()) {
            zzYAU zzyau2 = (zzYAU) zzz4nZzYPe.zzYPi();
            if (zzyau2.zzY7n() == i) {
                zzYAQ zzyaq = (zzYAQ) com.aspose.words.internal.zzZKW.zzZ(zzyau2, zzYAQ.class);
                if (zzyaq == null) {
                    zzyauZzY6L = zzyau2.zzY6L();
                } else if (zzyaq.zzY63() != zzya3) {
                    zzyauZzY6L = zzyaq.zzY63().zzY6L();
                }
                zzY9R.zzmT(zzyauZzY6L.zzZo6());
                return (zzYAS) zzyauZzY6L;
            }
        }
        return null;
    }

    public final zzYAS zzZ(int i, zzYA3 zzya3) throws Exception {
        zzYAU zzyau = this.zzZw6;
        if (zzyau != null && zzyau.zzaa() != null) {
            this.zzZw6.zzaa();
        }
        int iZzFC = zzFC(i);
        zzYAS zzyas = this.zzYPZ[iZzFC];
        if (zzyas != zzYPY) {
            return zzyas;
        }
        zzYAS zzyasZzY = zzY(i, zzya3);
        this.zzYPZ[iZzFC] = zzyasZzY;
        return zzyasZzY;
    }

    public final void zzZ(int i, zzYAS zzyas) {
        this.zzYPZ[zzFC(i)] = zzyas;
    }
}
