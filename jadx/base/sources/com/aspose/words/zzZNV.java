package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZNV implements Iterable<zzYAU> {
    private int zzVL;
    private int zzYyp;
    private int zzYyq;
    private int zzYyr;
    private zzYAU zzYys;
    private zzYAU zzYyt;

    public static final class zzZ implements Iterator<zzYAU> {
        private zzYAU zzYyo;
        private zzYAU zzYys;
        private zzYAU zzYyt;

        public zzZ(zzYAU zzyau, zzYAU zzyau2) {
            this.zzYyt = zzyau;
            this.zzYys = zzyau2;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            try {
                zzYAU zzyau = this.zzYyo;
                if (zzyau == null) {
                    this.zzYyo = this.zzYyt;
                    return true;
                }
                if (zzyau == this.zzYys) {
                    return false;
                }
                this.zzYyo = (zzYAU) zzyau.zzYo1();
                while (this.zzYyo.zzZo6() == 0) {
                    this.zzYyo = (zzYAU) this.zzYyo.zzYo1();
                }
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        @Override // java.util.Iterator
        public final /* bridge */ /* synthetic */ zzYAU next() {
            return this.zzYyo;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private zzZNV(zzYAU zzyau, zzYAU zzyau2, int i) {
        this.zzVL = i;
        this.zzYyt = zzyau;
        this.zzYys = zzyau2;
    }

    public static boolean zzBF(int i) {
        return zzY9R.zzmY(i) || i == 10754;
    }

    private static boolean zzU(zzYAU zzyau, int i) throws Exception {
        if (zzBF(zzyau.zzZo6())) {
            return (zzyau.zzYQ1() || zzyau.zzY6N().zzYKK().getId() == i) ? false : true;
        }
        return true;
    }

    private static boolean zzY(zzZ55 zzz55) throws Exception {
        for (zzYAU zzyau = (zzYAU) zzz55.zz6x(); zzyau != null; zzyau = (zzYAU) zzyau.zz5Z()) {
            if (zzyau.zzZo6() != 0) {
                if (zzY9R.zzmW(zzyau.zzZo6())) {
                    return false;
                }
                if (!zzBF(zzyau.zzZo6())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean zzZ(zzZ55 zzz55) throws Exception {
        return zzz55.zzYQ1() && zzY(zzz55);
    }

    private void zzZ9l() throws Exception {
        if (zzZ9n().equals(zzZ3D.zzYaA)) {
            return;
        }
        for (zzYAU zzyau : this) {
            if (zzyau != this.zzYyt) {
                zzZ32 zzz32ZzX = zzZ32.zzX(zzyau.zzY6N());
                zzz32ZzX.zzV(zzZ9n());
                zzyau.zzU(zzZ32.zzW(zzz32ZzX));
            }
        }
    }

    private void zzZ9m() throws Exception {
        int iZzYf = 0;
        int scaledWidth = 0;
        int iZzYoJ = 0;
        int iZz0R = 0;
        for (zzYAU zzyau : this) {
            iZzYoJ += zzyau.zzYoJ();
            scaledWidth += zzyau.getScaledWidth(zzyau.zzYoJ());
            iZz0R += zzyau.zz0R();
        }
        int i = this.zzVL;
        if (scaledWidth <= i) {
            this.zzYyr = Integer.MIN_VALUE;
        } else if (iZzYoJ <= i) {
            this.zzYyr = 100;
            scaledWidth = iZzYoJ;
        } else {
            this.zzYyr = Math.max((int) ((i * 100.0f) / iZzYoJ), 1);
            Iterator<zzYAU> it = iterator();
            while (it.hasNext()) {
                iZzYf += zzT9.zzYf(it.next().zzYoJ(), this.zzYyr);
            }
            scaledWidth = iZzYf;
        }
        int i2 = this.zzVL - scaledWidth;
        if (iZz0R <= 1) {
            this.zzYyp = i2;
            return;
        }
        int i3 = iZz0R - 1;
        this.zzYyq = i2 / i3;
        this.zzYyp = i2 % i3;
    }

    private zzZ3D zzZ9n() {
        return this.zzYyt.zzY6N().zzYKO();
    }

    public static void zzz(zzYAU zzyau) throws Exception {
        zzyau.zza7();
        zzBF(zzyau.zzZo6());
        if (!zzyau.zzY73()) {
            zzyau.zzYQ1();
        }
        zzYAU zzyauZzZ = zzZ(zzyau, false);
        zzYAU zzyauZzZ2 = zzZ(zzyau, true);
        if (zzyauZzZ2.zz0R() > 1) {
            zzYAU zzyauZzlX = zzyauZzZ2.zzlX(zzyauZzZ2.zz0R() - 1);
            if (zzyauZzZ == zzyauZzZ2) {
                zzyauZzZ = zzyauZzlX;
            }
        }
        zzZNV zzznv = new zzZNV(zzyauZzZ, zzyauZzZ2, zzyauZzZ.zzYQ1() ? Math.max(((zzZ55) zzyauZzZ.zzZZJ()).getWidth() - 1000, 0) : zzyauZzZ.zzY6N().zzYKK().getWidth());
        zzznv.zzZ9m();
        zzznv.zzZ9l();
        Iterator<zzYAU> it = zzznv.iterator();
        while (it.hasNext()) {
            it.next().zzZ(zzznv);
        }
    }

    public final int getSpacing() {
        return this.zzYyq;
    }

    public final int getWidth() {
        return this.zzVL;
    }

    @Override // java.lang.Iterable
    public final Iterator<zzYAU> iterator() {
        return new zzZ(this.zzYyt, this.zzYys);
    }

    public final boolean zzZ9o() {
        return this.zzYyr == Integer.MIN_VALUE;
    }

    public final int zzZ9p() {
        return this.zzYyp;
    }

    public final int zzZ9q() {
        return this.zzYyr;
    }

    public final zzYAU zzZ9r() {
        return this.zzYys;
    }

    public final zzYAU zzZ9s() {
        return this.zzYyt;
    }

    private static zzYAU zzZ(zzYAU zzyau, boolean z) throws Exception {
        int id = zzyau.zzY6N().zzYKK().getId();
        zzYAU zzyau2 = null;
        while (zzyau != null) {
            if (zzyau.zzZo6() != 0) {
                if (zzU(zzyau, id)) {
                    break;
                }
                zzyau2 = zzyau;
            }
            zzyau = z ? (zzYAU) zzyau.zzYo1() : (zzYAU) zzyau.zzYo0();
        }
        return zzyau2;
    }
}
