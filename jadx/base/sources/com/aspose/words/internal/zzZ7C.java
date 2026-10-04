package com.aspose.words.internal;

import java.util.Enumeration;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ7C extends zzZDB {
    zzZDD zzWFn;
    zzZ8C zzWpA;
    zzZ86 zzWpB;
    zzZ7T zzWpw;
    zzZD4 zzWpx;
    zzZ7A zzWpy;
    zzZ7A zzWpz;

    public static class zzX implements Enumeration {
        private final Enumeration zzWpu;

        public zzX(Enumeration enumeration) {
            this.zzWpu = enumeration;
        }

        @Override // java.util.Enumeration
        public final boolean hasMoreElements() {
            return this.zzWpu.hasMoreElements();
        }

        @Override // java.util.Enumeration
        public final Object nextElement() {
            return zzZ.zzWX(this.zzWpu.nextElement());
        }
    }

    public static class zzY implements Enumeration {
        private zzY() {
        }

        @Override // java.util.Enumeration
        public final boolean hasMoreElements() {
            return false;
        }

        @Override // java.util.Enumeration
        public final Object nextElement() {
            throw new NoSuchElementException("Empty Enumeration");
        }

        public /* synthetic */ zzY(byte b) {
            this();
        }
    }

    public static class zzZ extends zzZDB {
        zzZ7T zzWpv;
        zzZD4 zzWvF;

        private zzZ(zzZD4 zzzd4) {
            if (zzzd4.size() >= 2 && zzzd4.size() <= 3) {
                this.zzWvF = zzzd4;
            } else {
                throw new IllegalArgumentException("Bad sequence size: " + zzzd4.size());
            }
        }

        public static zzZ zzWX(Object obj) {
            if (obj instanceof zzZ) {
                return (zzZ) obj;
            }
            if (obj != null) {
                return new zzZ(zzZD4.zzYy(obj));
            }
            return null;
        }

        public final boolean hasExtensions() {
            return this.zzWvF.size() == 3;
        }

        public final zzZ7A zzXHE() {
            return zzZ7A.zzWV(this.zzWvF.zzg6(1));
        }

        public final zzZDD zzXHF() {
            return zzZDD.zzYB(this.zzWvF.zzg6(0));
        }

        public final zzZ7T zzXIH() {
            if (this.zzWpv == null && this.zzWvF.size() == 3) {
                this.zzWpv = zzZ7T.zzXa(this.zzWvF.zzg6(2));
            }
            return this.zzWpv;
        }

        @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
        public final zzZD5 zzXL0() {
            return this.zzWvF;
        }
    }

    private zzZ7C(zzZD4 zzzd4) {
        if (zzzd4.size() < 3 || zzzd4.size() > 7) {
            throw new IllegalArgumentException("Bad sequence size: " + zzzd4.size());
        }
        int i = 0;
        if (zzzd4.zzg6(0) instanceof zzZDD) {
            this.zzWFn = zzZDD.zzYB(zzzd4.zzg6(0));
            i = 1;
        } else {
            this.zzWFn = null;
        }
        this.zzWpB = zzZ86.zzXm(zzzd4.zzg6(i));
        this.zzWpA = zzZ8C.zzXn(zzzd4.zzg6(i + 1));
        int i2 = i + 3;
        this.zzWpz = zzZ7A.zzWV(zzzd4.zzg6(i + 2));
        if (i2 < zzzd4.size() && ((zzzd4.zzg6(i2) instanceof zzZCW) || (zzzd4.zzg6(i2) instanceof zzZDF) || (zzzd4.zzg6(i2) instanceof zzZ7A))) {
            this.zzWpy = zzZ7A.zzWV(zzzd4.zzg6(i2));
            i2 = i + 4;
        }
        if (i2 < zzzd4.size() && !(zzzd4.zzg6(i2) instanceof zzZCY)) {
            this.zzWpx = zzZD4.zzYy(zzzd4.zzg6(i2));
            i2++;
        }
        if (i2 >= zzzd4.size() || !(zzzd4.zzg6(i2) instanceof zzZCY)) {
            return;
        }
        this.zzWpw = zzZ7T.zzXa(zzZD4.zzX((zzZCY) zzzd4.zzg6(i2), true));
    }

    public static zzZ7C zzWY(Object obj) {
        if (obj instanceof zzZ7C) {
            return (zzZ7C) obj;
        }
        if (obj != null) {
            return new zzZ7C(zzZD4.zzYy(obj));
        }
        return null;
    }

    public final zzZ86 zzXHG() {
        return this.zzWpB;
    }

    public final Enumeration zzXI9() {
        zzZD4 zzzd4 = this.zzWpx;
        return zzzd4 == null ? new zzY((byte) 0) : new zzX(zzzd4.zzXKE());
    }

    public final zzZ7T zzXIH() {
        return this.zzWpw;
    }

    public final int zzXIi() {
        zzZDD zzzdd = this.zzWFn;
        if (zzzdd == null) {
            return 1;
        }
        return zzzdd.zzXKZ().intValue() + 1;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        zzZDD zzzdd = this.zzWFn;
        if (zzzdd != null) {
            zzzdj.zzZ(zzzdd);
        }
        zzzdj.zzZ(this.zzWpB);
        zzzdj.zzZ(this.zzWpA);
        zzzdj.zzZ(this.zzWpz);
        zzZ7A zzz7a = this.zzWpy;
        if (zzz7a != null) {
            zzzdj.zzZ(zzz7a);
        }
        zzZD4 zzzd4 = this.zzWpx;
        if (zzzd4 != null) {
            zzzdj.zzZ(zzzd4);
        }
        zzZ7T zzz7t = this.zzWpw;
        if (zzz7t != null) {
            zzzdj.zzZ(new zzZBX(zzz7t));
        }
        return new zzZC2(zzzdj);
    }
}
