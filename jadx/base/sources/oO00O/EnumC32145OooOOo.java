package oO00O;

/* JADX INFO: renamed from: oO00O.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public enum EnumC32145OooOOo {
    /* JADX INFO: Fake field, exist only in values array */
    DecryptionFailed_RESERVED(21),
    CloseNotify(0),
    /* JADX INFO: Fake field, exist only in values array */
    UnexpectedMessage(10),
    /* JADX INFO: Fake field, exist only in values array */
    BadRecordMac(20),
    /* JADX INFO: Fake field, exist only in values array */
    RecordOverflow(22),
    /* JADX INFO: Fake field, exist only in values array */
    DecompressionFailure(30),
    /* JADX INFO: Fake field, exist only in values array */
    HandshakeFailure(40),
    /* JADX INFO: Fake field, exist only in values array */
    NoCertificate_RESERVED(41),
    /* JADX INFO: Fake field, exist only in values array */
    BadCertificate(42),
    /* JADX INFO: Fake field, exist only in values array */
    UnsupportedCertificate(43),
    /* JADX INFO: Fake field, exist only in values array */
    CertificateRevoked(44),
    /* JADX INFO: Fake field, exist only in values array */
    CertificateExpired(45),
    /* JADX INFO: Fake field, exist only in values array */
    CertificateUnknown(46),
    /* JADX INFO: Fake field, exist only in values array */
    IllegalParameter(47),
    /* JADX INFO: Fake field, exist only in values array */
    UnknownCa(48),
    /* JADX INFO: Fake field, exist only in values array */
    AccessDenied(49),
    /* JADX INFO: Fake field, exist only in values array */
    DecodeError(50),
    /* JADX INFO: Fake field, exist only in values array */
    DecryptError(51),
    /* JADX INFO: Fake field, exist only in values array */
    ExportRestriction_RESERVED(60),
    /* JADX INFO: Fake field, exist only in values array */
    ProtocolVersion(70),
    /* JADX INFO: Fake field, exist only in values array */
    InsufficientSecurity(71),
    /* JADX INFO: Fake field, exist only in values array */
    InternalError(80),
    /* JADX INFO: Fake field, exist only in values array */
    UserCanceled(90),
    /* JADX INFO: Fake field, exist only in values array */
    NoRenegotiation(100),
    /* JADX INFO: Fake field, exist only in values array */
    UnsupportedExtension(110);


    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final EnumC32145OooOOo[] f115295OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f115298OooOo0o;

    /* JADX INFO: renamed from: oO00O.OooOOo$OooO00o */
    public static final class OooO00o {
    }

    static {
        EnumC32145OooOOo enumC32145OooOOo;
        EnumC32145OooOOo[] enumC32145OooOOoArr = new EnumC32145OooOOo[256];
        for (int i = 0; i < 256; i++) {
            EnumC32145OooOOo[] enumC32145OooOOoArrValues = values();
            int length = enumC32145OooOOoArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    enumC32145OooOOo = null;
                    break;
                }
                enumC32145OooOOo = enumC32145OooOOoArrValues[i2];
                if (enumC32145OooOOo.f115298OooOo0o == i) {
                    break;
                } else {
                    i2++;
                }
            }
            enumC32145OooOOoArr[i] = enumC32145OooOOo;
        }
        f115295OooOo = enumC32145OooOOoArr;
    }

    EnumC32145OooOOo(int i) {
        this.f115298OooOo0o = i;
    }
}
