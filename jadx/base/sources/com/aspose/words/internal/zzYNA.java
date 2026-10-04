package com.aspose.words.internal;

import com.aspose.words.internal.zzZ7C;
import java.io.IOException;
import java.math.BigInteger;
import java.security.cert.CRLException;
import java.security.cert.X509CRLEntry;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes5.dex */
final class zzYNA extends X509CRLEntry {
    private boolean zzVOt;
    private int zzVOu;
    private zzZ8C zzVOv;
    private zzZ7C.zzZ zzVOw;

    public zzYNA(zzZ7C.zzZ zzz, boolean z, zzZ8C zzz8c) {
        this.zzVOw = zzz;
        this.zzVOv = zzZ(z, zzz8c);
    }

    private Set zzOD(boolean z) {
        zzZ7T zzz7tZzXIH = this.zzVOw.zzXIH();
        if (zzz7tZzXIH == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        Enumeration enumerationZzXHX = zzz7tZzXIH.zzXHX();
        while (enumerationZzXHX.hasMoreElements()) {
            zzZDA zzzda = (zzZDA) enumerationZzXHX.nextElement();
            if (z == zzz7tZzXIH.zzQ(zzzda).isCritical()) {
                hashSet.add(zzzda.getId());
            }
        }
        return hashSet;
    }

    private zzZ7U zzQ(zzZDA zzzda) {
        zzZ7T zzz7tZzXIH = this.zzVOw.zzXIH();
        if (zzz7tZzXIH != null) {
            return zzz7tZzXIH.zzQ(zzzda);
        }
        return null;
    }

    private zzZ8C zzZ(boolean z, zzZ8C zzz8c) {
        zzZ7R[] zzz7rArrZzXHV;
        int i;
        if (!z) {
            return null;
        }
        zzZ7U zzz7uZzQ = zzQ(zzZ7U.zzWqy);
        if (zzz7uZzQ == null) {
            return zzz8c;
        }
        try {
            zzz7rArrZzXHV = zzZ7Q.zzX8(zzz7uZzQ.zzXHY()).zzXHV();
        } catch (Exception unused) {
        }
        for (i = 0; i < zzz7rArrZzXHV.length; i++) {
            if (zzz7rArrZzXHV[i].zzXKy() == 4) {
                return zzZ8C.zzXn(zzz7rArrZzXHV[i].zzXI1());
            }
            return null;
        }
        return null;
    }

    @Override // java.security.cert.X509CRLEntry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof zzYNA ? this.zzVOw.equals(((zzYNA) obj).zzVOw) : super.equals(this);
    }

    @Override // java.security.cert.X509CRLEntry
    public final X500Principal getCertificateIssuer() {
        if (this.zzVOv == null) {
            return null;
        }
        try {
            return new X500Principal(this.zzVOv.getEncoded());
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.cert.X509Extension
    public final Set getCriticalExtensionOIDs() {
        return zzOD(true);
    }

    @Override // java.security.cert.X509CRLEntry
    public final byte[] getEncoded() throws CRLException {
        try {
            return this.zzVOw.getEncoded("DER");
        } catch (IOException e) {
            throw new CRLException(e.toString());
        }
    }

    @Override // java.security.cert.X509Extension
    public final byte[] getExtensionValue(String str) {
        zzZ7U zzz7uZzQ = zzQ(new zzZDA(str));
        if (zzz7uZzQ == null) {
            return null;
        }
        try {
            return zzz7uZzQ.zzXHZ().getEncoded();
        } catch (Exception e) {
            throw new IllegalStateException(C22245OooO0oO.OooO0Oo(e, new StringBuilder("Exception encoding: ")), e);
        }
    }

    @Override // java.security.cert.X509Extension
    public final Set getNonCriticalExtensionOIDs() {
        return zzOD(false);
    }

    @Override // java.security.cert.X509CRLEntry
    public final Date getRevocationDate() {
        return this.zzVOw.zzXHE().getDate();
    }

    @Override // java.security.cert.X509CRLEntry
    public final BigInteger getSerialNumber() {
        return this.zzVOw.zzXHF().zzXKZ();
    }

    @Override // java.security.cert.X509CRLEntry
    public final boolean hasExtensions() {
        return this.zzVOw.zzXIH() != null;
    }

    @Override // java.security.cert.X509Extension
    public final boolean hasUnsupportedCriticalExtension() {
        Set criticalExtensionOIDs = getCriticalExtensionOIDs();
        return (criticalExtensionOIDs == null || criticalExtensionOIDs.isEmpty()) ? false : true;
    }

    @Override // java.security.cert.X509CRLEntry
    public final int hashCode() {
        if (!this.zzVOt) {
            this.zzVOu = super.hashCode();
            this.zzVOt = true;
        }
        return this.zzVOu;
    }

    @Override // java.security.cert.X509CRLEntry
    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("      userCertificate: ");
        String strLineSeparator = zzYGI.lineSeparator();
        stringBuffer.append(getSerialNumber());
        stringBuffer.append(strLineSeparator);
        stringBuffer.append("       revocationDate: ");
        stringBuffer.append(getRevocationDate());
        stringBuffer.append(strLineSeparator);
        stringBuffer.append("       certificateIssuer: ");
        stringBuffer.append(getCertificateIssuer());
        stringBuffer.append(strLineSeparator);
        zzZ7T zzz7tZzXIH = this.zzVOw.zzXIH();
        if (zzz7tZzXIH != null) {
            Enumeration enumerationZzXHX = zzz7tZzXIH.zzXHX();
            if (enumerationZzXHX.hasMoreElements()) {
                stringBuffer.append("   crlEntryExtensions:");
                stringBuffer.append(strLineSeparator);
                while (enumerationZzXHX.hasMoreElements()) {
                    zzZDA zzzda = (zzZDA) enumerationZzXHX.nextElement();
                    zzZ7U zzz7uZzQ = zzz7tZzXIH.zzQ(zzzda);
                    if (zzz7uZzQ.zzXHZ() != null) {
                        byte[] bArrZzXL5 = zzz7uZzQ.zzXHZ().zzXL5();
                        stringBuffer.append("                       critical(");
                        stringBuffer.append(zzz7uZzQ.isCritical());
                        stringBuffer.append(") ");
                        try {
                            zzZD5 zzzd5ZzXo = zzZD5.zzXo(bArrZzXL5);
                            if (zzzda.equals(zzZ7U.zzWqD)) {
                                stringBuffer.append(zzZ81.zzXi(zzZDI.zzYD(zzzd5ZzXo)));
                                stringBuffer.append(strLineSeparator);
                            } else if (zzzda.equals(zzZ7U.zzWqy)) {
                                stringBuffer.append("Certificate issuer: ");
                                stringBuffer.append(zzZ7Q.zzX8(zzzd5ZzXo));
                                stringBuffer.append(strLineSeparator);
                            } else {
                                stringBuffer.append(zzzda.getId());
                                stringBuffer.append(" value = ");
                                stringBuffer.append(zzZ8F.zzXr(zzzd5ZzXo));
                                stringBuffer.append(strLineSeparator);
                            }
                        } catch (Exception unused) {
                            stringBuffer.append(zzzda.getId());
                            stringBuffer.append(" value = *****");
                            stringBuffer.append(strLineSeparator);
                        }
                    } else {
                        stringBuffer.append(strLineSeparator);
                    }
                }
            }
        }
        return stringBuffer.toString();
    }
}
