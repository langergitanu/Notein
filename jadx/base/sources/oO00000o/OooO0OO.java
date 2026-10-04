package oO00000o;

import com.microsoft.identity.common.java.platform.AbstractDevicePopManager;
import java.math.BigInteger;
import java.security.Key;
import java.security.interfaces.ECKey;
import java.security.interfaces.RSAKey;
import java.security.spec.EllipticCurve;

/* JADX INFO: loaded from: classes10.dex */
public enum OooO0OO {
    RSA1024((byte) 6, new AbstractC20185OooO0OO(1024) { // from class: oO00000o.OooO0OO.OooO0Oo
        {
            OooO00o oooO00o = OooO00o.f113747OooOo0o;
        }

        @Override // oO00000o.OooO0OO.AbstractC20185OooO0OO
        public final boolean OooO00o(Key key) {
            return (key instanceof RSAKey) && ((RSAKey) key).getModulus().bitLength() == this.f113752OooO0O0;
        }
    }),
    RSA2048((byte) 7, new AbstractC20185OooO0OO(2048) { // from class: oO00000o.OooO0OO.OooO0Oo
        {
            OooO00o oooO00o = OooO00o.f113747OooOo0o;
        }

        @Override // oO00000o.OooO0OO.AbstractC20185OooO0OO
        public final boolean OooO00o(Key key) {
            return (key instanceof RSAKey) && ((RSAKey) key).getModulus().bitLength() == this.f113752OooO0O0;
        }
    }),
    /* JADX INFO: Fake field, exist only in values array */
    ECCP256((byte) 17, new AbstractC20185OooO0OO(256, "115792089210356248762697446949407573530086143415290314195533631308867097853948", "41058363725152142129326129780047268409114441015993725554835256314039467401291") { // from class: oO00000o.OooO0OO.OooO0O0

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final BigInteger f113749OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final BigInteger f113750OooO0Oo;

        {
            OooO00o oooO00o = OooO00o.f113746OooOo;
            this.f113749OooO0OO = new BigInteger(str);
            this.f113750OooO0Oo = new BigInteger(str);
        }

        @Override // oO00000o.OooO0OO.AbstractC20185OooO0OO
        public final boolean OooO00o(Key key) {
            if (!(key instanceof ECKey)) {
                return false;
            }
            EllipticCurve curve = ((ECKey) key).getParams().getCurve();
            return curve.getField().getFieldSize() == this.f113752OooO0O0 && curve.getA().equals(this.f113749OooO0OO) && curve.getB().equals(this.f113750OooO0Oo);
        }
    }),
    ECCP384((byte) 20, new AbstractC20185OooO0OO(384, "39402006196394479212279040100143613805079739270465446667948293404245721771496870329047266088258938001861606973112316", "27580193559959705877849011840389048093056905856361568521428707301988689241309860865136260764883745107765439761230575") { // from class: oO00000o.OooO0OO.OooO0O0

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final BigInteger f113749OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final BigInteger f113750OooO0Oo;

        {
            OooO00o oooO00o = OooO00o.f113746OooOo;
            this.f113749OooO0OO = new BigInteger(str);
            this.f113750OooO0Oo = new BigInteger(str);
        }

        @Override // oO00000o.OooO0OO.AbstractC20185OooO0OO
        public final boolean OooO00o(Key key) {
            if (!(key instanceof ECKey)) {
                return false;
            }
            EllipticCurve curve = ((ECKey) key).getParams().getCurve();
            return curve.getField().getFieldSize() == this.f113752OooO0O0 && curve.getA().equals(this.f113749OooO0OO) && curve.getB().equals(this.f113750OooO0Oo);
        }
    });


    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final AbstractC20185OooO0OO f113744OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final byte f113745OooOo0o;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final OooO00o f113746OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f113747OooOo0o;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public static final /* synthetic */ OooO00o[] f113748OooOoO0;

        static {
            OooO00o oooO00o = new OooO00o(AbstractDevicePopManager.KeyPairGeneratorAlgorithms.RSA, 0);
            f113747OooOo0o = oooO00o;
            OooO00o oooO00o2 = new OooO00o("EC", 1);
            f113746OooOo = oooO00o2;
            f113748OooOoO0 = new OooO00o[]{oooO00o, oooO00o2};
        }

        public OooO00o() {
            throw null;
        }

        public static OooO00o valueOf(String str) {
            return (OooO00o) Enum.valueOf(OooO00o.class, str);
        }

        public static OooO00o[] values() {
            return (OooO00o[]) f113748OooOoO0.clone();
        }
    }

    /* JADX INFO: renamed from: oO00000o.OooO0OO$OooO0OO, reason: collision with other inner class name */
    public static abstract class AbstractC20185OooO0OO {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO00o f113751OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f113752OooO0O0;

        public AbstractC20185OooO0OO(OooO00o oooO00o, int i) {
            this.f113751OooO00o = oooO00o;
            this.f113752OooO0O0 = i;
        }

        public abstract boolean OooO00o(Key key);
    }

    OooO0OO(byte b, AbstractC20185OooO0OO abstractC20185OooO0OO) {
        this.f113745OooOo0o = b;
        this.f113744OooOo = abstractC20185OooO0OO;
    }

    public static OooO0OO OooO00o(Key key) {
        for (OooO0OO oooO0OO : values()) {
            if (oooO0OO.f113744OooOo.OooO00o(key)) {
                return oooO0OO;
            }
        }
        throw new IllegalArgumentException("Unsupported key type");
    }
}
