package com.aspose.words.internal;

import com.aspose.words.internal.zzYR4;
import java.security.cert.CertPathParameters;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public class zzYR5 implements CertPathParameters {
    private final int zzVWM;
    private final Set<X509Certificate> zzVWN;
    private final zzYR4 zzVWO;

    public /* synthetic */ zzYR5(zzZ zzz, byte b) {
        this(zzz);
    }

    @Override // java.security.cert.CertPathParameters
    public Object clone() {
        return this;
    }

    public final int getMaxPathLength() {
        return this.zzVWM;
    }

    public final Set zzXBR() {
        return this.zzVWN;
    }

    public final zzYR4 zzXBS() {
        return this.zzVWO;
    }

    private zzYR5(zzZ zzz) {
        this.zzVWO = zzz.zzVWO;
        this.zzVWN = Collections.unmodifiableSet(zzz.zzVWN);
        this.zzVWM = zzz.zzVWM;
    }

    public static class zzZ {
        private int zzVWM;
        private Set<X509Certificate> zzVWN;
        private final zzYR4 zzVWO;

        public zzZ(PKIXBuilderParameters pKIXBuilderParameters) {
            this.zzVWM = 5;
            this.zzVWN = new HashSet();
            this.zzVWO = new zzYR4.zzZ(pKIXBuilderParameters).zzXBI();
            this.zzVWM = pKIXBuilderParameters.getMaxPathLength();
        }

        public final zzYR5 zzXBQ() {
            return new zzYR5(this, (byte) 0);
        }

        public zzZ(zzYR4 zzyr4) {
            this.zzVWM = 5;
            this.zzVWN = new HashSet();
            this.zzVWO = zzyr4;
        }
    }
}
