package com.aspose.words.internal;

import Oooo0oO.o0Oo0oo;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ7U extends zzZDB {
    private zzZD9 zzWqd;
    private boolean zzWqe;
    private zzZDA zzWqf;
    public static final zzZDA zzWqL = o0Oo0oo.OooO00o("2.5.29.9");
    public static final zzZDA zzWqK = o0Oo0oo.OooO00o("2.5.29.14");
    public static final zzZDA zzWqJ = o0Oo0oo.OooO00o("2.5.29.15");
    public static final zzZDA zzWqI = o0Oo0oo.OooO00o("2.5.29.16");
    public static final zzZDA zzWqH = o0Oo0oo.OooO00o("2.5.29.17");
    public static final zzZDA zzWqG = o0Oo0oo.OooO00o("2.5.29.18");
    public static final zzZDA zzWqF = o0Oo0oo.OooO00o("2.5.29.19");
    public static final zzZDA zzWqE = o0Oo0oo.OooO00o("2.5.29.20");
    public static final zzZDA zzWqD = o0Oo0oo.OooO00o("2.5.29.21");
    public static final zzZDA zzWqC = o0Oo0oo.OooO00o("2.5.29.23");
    public static final zzZDA zzWqB = o0Oo0oo.OooO00o("2.5.29.24");
    public static final zzZDA zzWqA = o0Oo0oo.OooO00o("2.5.29.27");
    public static final zzZDA zzWqz = o0Oo0oo.OooO00o("2.5.29.28");
    public static final zzZDA zzWqy = o0Oo0oo.OooO00o("2.5.29.29");
    public static final zzZDA zzWqx = o0Oo0oo.OooO00o("2.5.29.30");
    public static final zzZDA zzWqw = o0Oo0oo.OooO00o("2.5.29.31");
    public static final zzZDA zzWqv = o0Oo0oo.OooO00o("2.5.29.32");
    public static final zzZDA zzWqu = o0Oo0oo.OooO00o("2.5.29.33");
    public static final zzZDA zzWqt = o0Oo0oo.OooO00o("2.5.29.35");
    public static final zzZDA zzWqs = o0Oo0oo.OooO00o("2.5.29.36");
    public static final zzZDA zzWqr = o0Oo0oo.OooO00o("2.5.29.37");
    public static final zzZDA zzWqq = o0Oo0oo.OooO00o("2.5.29.46");
    public static final zzZDA zzWqp = o0Oo0oo.OooO00o("2.5.29.54");
    public static final zzZDA zzWqo = o0Oo0oo.OooO00o("1.3.6.1.5.5.7.1.1");
    public static final zzZDA zzWqn = o0Oo0oo.OooO00o("1.3.6.1.5.5.7.1.11");
    public static final zzZDA zzWqm = o0Oo0oo.OooO00o("1.3.6.1.5.5.7.1.12");
    public static final zzZDA zzWql = o0Oo0oo.OooO00o("1.3.6.1.5.5.7.1.2");
    public static final zzZDA zzWqk = o0Oo0oo.OooO00o("1.3.6.1.5.5.7.1.3");
    public static final zzZDA zzWqj = o0Oo0oo.OooO00o("1.3.6.1.5.5.7.1.4");
    public static final zzZDA zzWqi = o0Oo0oo.OooO00o("2.5.29.56");
    public static final zzZDA zzWqh = o0Oo0oo.OooO00o("2.5.29.55");
    public static final zzZDA zzWqg = o0Oo0oo.OooO00o("2.5.29.60");

    private zzZ7U(zzZD4 zzzd4) {
        if (zzzd4.size() == 2) {
            this.zzWqf = zzZDA.zzYA(zzzd4.zzg6(0));
            this.zzWqe = false;
            this.zzWqd = zzZD9.zzYz(zzzd4.zzg6(1));
        } else {
            if (zzzd4.size() != 3) {
                throw new IllegalArgumentException("Bad sequence size: " + zzzd4.size());
            }
            this.zzWqf = zzZDA.zzYA(zzzd4.zzg6(0));
            this.zzWqe = zzZDM.zzYE(zzzd4.zzg6(1)).zzXL1();
            this.zzWqd = zzZD9.zzYz(zzzd4.zzg6(2));
        }
    }

    public static zzZ7U zzXb(Object obj) {
        if (obj instanceof zzZ7U) {
            return (zzZ7U) obj;
        }
        if (obj != null) {
            return new zzZ7U(zzZD4.zzYy(obj));
        }
        return null;
    }

    private static zzZD5 zzZ(zzZ7U zzz7u) throws IllegalArgumentException {
        try {
            return zzZD5.zzXo(zzz7u.zzWqd.zzXL5());
        } catch (IOException e) {
            throw new IllegalArgumentException("can't convert extension: " + e);
        }
    }

    @Override // com.aspose.words.internal.zzZDB
    public final boolean equals(Object obj) {
        if (!(obj instanceof zzZ7U)) {
            return false;
        }
        zzZ7U zzz7u = (zzZ7U) obj;
        return zzz7u.zzWqf.equals(this.zzWqf) && zzz7u.zzWqd.equals(this.zzWqd) && zzz7u.zzWqe == this.zzWqe;
    }

    @Override // com.aspose.words.internal.zzZDB
    public final int hashCode() {
        return this.zzWqe ? this.zzWqd.hashCode() ^ this.zzWqf.hashCode() : ~(this.zzWqd.hashCode() ^ this.zzWqf.hashCode());
    }

    public final boolean isCritical() {
        return this.zzWqe;
    }

    public final zzZDK zzXHY() {
        return zzZ(this);
    }

    public final zzZD9 zzXHZ() {
        return this.zzWqd;
    }

    public final zzZDA zzXI0() {
        return this.zzWqf;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        zzzdj.zzZ(this.zzWqf);
        if (this.zzWqe) {
            zzzdj.zzZ(zzZDM.zzOQ(true));
        }
        zzzdj.zzZ(this.zzWqd);
        return new zzZC2(zzzdj);
    }
}
