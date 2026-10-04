package com.aspose.words.internal;

import com.aspose.words.internal.zzYR6;
import java.security.cert.CertPathParameters;
import java.security.cert.CertSelector;
import java.security.cert.CertStore;
import java.security.cert.PKIXParameters;
import java.security.cert.TrustAnchor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public class zzYR4 implements CertPathParameters {
    private final Set<TrustAnchor> zzVWB;
    private final int zzVWC;
    private final boolean zzVWD;
    private final boolean zzVWE;
    private final Map<zzZ7R, zzYR9> zzVWF;
    private final List<zzYR9> zzVWG;
    private final Map<zzZ7R, zzYR7> zzVWH;
    private final List<zzYR7> zzVWI;
    private final Date zzVWJ;
    private final zzYR6 zzVWK;
    private final PKIXParameters zzVWL;

    public static class zzZ {
        private Set<TrustAnchor> zzVWB;
        private int zzVWC;
        private boolean zzVWD;
        private boolean zzVWE;
        private Map<zzZ7R, zzYR9> zzVWF;
        private List<zzYR9> zzVWG;
        private Map<zzZ7R, zzYR7> zzVWH;
        private List<zzYR7> zzVWI;
        private final Date zzVWJ;
        private zzYR6 zzVWK;
        private final PKIXParameters zzVWL;

        public zzZ(PKIXParameters pKIXParameters) {
            this.zzVWI = new ArrayList();
            this.zzVWH = new HashMap();
            this.zzVWG = new ArrayList();
            this.zzVWF = new HashMap();
            this.zzVWC = 0;
            this.zzVWD = false;
            this.zzVWL = (PKIXParameters) pKIXParameters.clone();
            CertSelector targetCertConstraints = pKIXParameters.getTargetCertConstraints();
            if (targetCertConstraints != null) {
                this.zzVWK = new zzYR6.zzZ(targetCertConstraints).zzXBT();
            }
            Date date = pKIXParameters.getDate();
            this.zzVWJ = date == null ? new Date() : date;
            this.zzVWE = pKIXParameters.isRevocationEnabled();
            this.zzVWB = pKIXParameters.getTrustAnchors();
        }

        public final void setRevocationEnabled(boolean z) {
            this.zzVWE = z;
        }

        public final zzYR4 zzXBI() {
            return new zzYR4(this, (byte) 0);
        }

        public final zzZ zzY(zzYR6 zzyr6) {
            this.zzVWK = zzyr6;
            return this;
        }

        public final zzZ zzZ(zzYR9 zzyr9) {
            this.zzVWG.add(zzyr9);
            return this;
        }

        public final zzZ zzZ(TrustAnchor trustAnchor) {
            this.zzVWB = Collections.singleton(trustAnchor);
            return this;
        }

        public zzZ(zzYR4 zzyr4) {
            this.zzVWI = new ArrayList();
            this.zzVWH = new HashMap();
            this.zzVWG = new ArrayList();
            this.zzVWF = new HashMap();
            this.zzVWC = 0;
            this.zzVWD = false;
            this.zzVWL = zzyr4.zzVWL;
            this.zzVWJ = zzyr4.zzVWJ;
            this.zzVWK = zzyr4.zzVWK;
            this.zzVWI = new ArrayList(zzyr4.zzVWI);
            this.zzVWH = new HashMap(zzyr4.zzVWH);
            this.zzVWG = new ArrayList(zzyr4.zzVWG);
            this.zzVWF = new HashMap(zzyr4.zzVWF);
            this.zzVWD = zzyr4.zzVWD;
            this.zzVWC = zzyr4.zzVWC;
            this.zzVWE = zzyr4.isRevocationEnabled();
            this.zzVWB = zzyr4.getTrustAnchors();
        }
    }

    public /* synthetic */ zzYR4(zzZ zzz, byte b) {
        this(zzz);
    }

    @Override // java.security.cert.CertPathParameters
    public Object clone() {
        return this;
    }

    public final List getCertPathCheckers() {
        return this.zzVWL.getCertPathCheckers();
    }

    public final List<CertStore> getCertStores() {
        return this.zzVWL.getCertStores();
    }

    public final Date getDate() {
        return new Date(this.zzVWJ.getTime());
    }

    public final Set getInitialPolicies() {
        return this.zzVWL.getInitialPolicies();
    }

    public final String getSigProvider() {
        return this.zzVWL.getSigProvider();
    }

    public final Set getTrustAnchors() {
        return this.zzVWB;
    }

    public final boolean isAnyPolicyInhibited() {
        return this.zzVWL.isAnyPolicyInhibited();
    }

    public final boolean isExplicitPolicyRequired() {
        return this.zzVWL.isExplicitPolicyRequired();
    }

    public final boolean isPolicyMappingInhibited() {
        return this.zzVWL.isPolicyMappingInhibited();
    }

    public final boolean isRevocationEnabled() {
        return this.zzVWE;
    }

    public final zzYR6 zzXBJ() {
        return this.zzVWK;
    }

    public final int zzXBK() {
        return this.zzVWC;
    }

    public final boolean zzXBL() {
        return this.zzVWD;
    }

    public final Map<zzZ7R, zzYR9> zzXBM() {
        return this.zzVWF;
    }

    public final List<zzYR9> zzXBN() {
        return this.zzVWG;
    }

    public final Map<zzZ7R, zzYR7> zzXBO() {
        return this.zzVWH;
    }

    public final List<zzYR7> zzXBP() {
        return this.zzVWI;
    }

    private zzYR4(zzZ zzz) {
        this.zzVWL = zzz.zzVWL;
        this.zzVWJ = zzz.zzVWJ;
        this.zzVWI = Collections.unmodifiableList(zzz.zzVWI);
        this.zzVWH = Collections.unmodifiableMap(new HashMap(zzz.zzVWH));
        this.zzVWG = Collections.unmodifiableList(zzz.zzVWG);
        this.zzVWF = Collections.unmodifiableMap(new HashMap(zzz.zzVWF));
        this.zzVWK = zzz.zzVWK;
        this.zzVWE = zzz.zzVWE;
        this.zzVWD = zzz.zzVWD;
        this.zzVWC = zzz.zzVWC;
        this.zzVWB = Collections.unmodifiableSet(zzz.zzVWB);
    }
}
