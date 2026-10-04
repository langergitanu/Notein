package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzZOX implements Iterable<zzZOY> {
    private zzZOY zzYAT;
    private zzZOY zzYAU;
    private zzZOY zzYAV;
    private zzZOY zzYAW;
    private zzZOX zzYAX;

    public static final class zzZ implements Iterator<zzZOY> {
        private zzZOY zzYAS;
        private zzZOX zzYAX;

        public zzZ(zzZOX zzzox) {
            this.zzYAX = zzzox;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: zzZaY, reason: merged with bridge method [inline-methods] */
        public zzZOY next() {
            zzZOY zzzoy = this.zzYAS;
            if (zzzoy != null) {
                return zzzoy;
            }
            throw new IllegalStateException();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            zzZOY zzzoy = this.zzYAS;
            zzZOY zzzoyZzZaZ = zzzoy == null ? this.zzYAX.zzZaZ() : zzzoy.zzZb0();
            this.zzYAS = zzzoyZzZaZ;
            return zzzoyZzZaZ != null;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static void zzS(zzZOY zzzoy) {
        if (((zzZOX) zzzoy).zzYAX == null) {
            return;
        }
        zzzoy.zzZb3();
        zzzoy.zzZ(false, ((zzZOX) zzzoy).zzYAV);
        zzzoy.zzZ(true, ((zzZOX) zzzoy).zzYAW);
        ((zzZOX) zzzoy).zzYAX = null;
    }

    private zzZOY zzVP(boolean z) {
        return z ? this.zzYAT : this.zzYAU;
    }

    private void zzX(boolean z, zzZOY zzzoy) {
        if (z) {
            this.zzYAT = zzzoy;
        } else {
            this.zzYAU = zzzoy;
        }
    }

    public static void zzZ(zzZOX zzzox, zzZOY zzzoy, zzZOY zzzoy2, boolean z) {
        if (zzzoy == null) {
            zzzoy = zzzox.zzVP(z);
        }
        if (zzzoy == null) {
            zzzox.zzYAU = zzzoy2;
            zzzox.zzYAT = zzzoy2;
        } else {
            zzzoy.zzZ(z, zzzoy2);
            zzzoy2.zzY(z, zzzoy.zzVQ(z));
            zzzoy2.zzY(!z, zzzoy);
            zzzoy.zzY(z, zzzoy2);
        }
        ((zzZOX) zzzoy2).zzYAX = zzzox;
    }

    public final boolean hasChildren() {
        return this.zzYAU != null;
    }

    @Override // java.lang.Iterable
    public Iterator<zzZOY> iterator() {
        return new zzZ(this);
    }

    public final zzZOY zzVQ(boolean z) {
        return z ? this.zzYAV : this.zzYAW;
    }

    public final void zzY(boolean z, zzZOY zzzoy) {
        if (z) {
            this.zzYAV = zzzoy;
        } else {
            this.zzYAW = zzzoy;
        }
    }

    public final zzZOY zzZaZ() {
        return this.zzYAU;
    }

    public final zzZOY zzZb0() {
        return this.zzYAV;
    }

    public final zzZOX zzZb1() {
        return this.zzYAX;
    }

    public final void zzZb2() {
        for (zzZOY zzzoy : this) {
            zzzoy.zzZb3();
            zzzoy.zzZb2();
        }
    }

    public final void zzZ(boolean z, zzZOY zzzoy) {
        if (this == this.zzYAX.zzVP(z)) {
            this.zzYAX.zzX(z, zzzoy);
        } else {
            zzVQ(z).zzY(!z, zzzoy);
        }
    }
}
