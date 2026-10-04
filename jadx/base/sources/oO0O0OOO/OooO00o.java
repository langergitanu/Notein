package oO0O0OOO;

import Oooo0.o0OoOo0;
import com.aspose.slides.C22220Oooo00o;
import com.aspose.words.internal.C22245OooO0oO;
import com.microsoft.identity.common.java.platform.AbstractDevicePopManager;
import kotlin.jvm.internal.OooOOO0;
import oO00O.OooO;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f117309OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f117310OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooO f117311OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f117312OooO0Oo;

    /* JADX INFO: renamed from: oO0O0OOO.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C20250OooO00o {
    }

    public OooO00o(int i, int i2, OooO oooO) {
        String str;
        String str2;
        C22220Oooo00o.OooO0OO(i, "hash");
        C22220Oooo00o.OooO0OO(i2, "sign");
        this.f117309OooO00o = i;
        this.f117310OooO0O0 = i2;
        this.f117311OooO0OO = oooO;
        StringBuilder sb = new StringBuilder();
        switch (i) {
            case 1:
                str = "NONE";
                break;
            case 2:
                str = "MD5";
                break;
            case 3:
                str = "SHA1";
                break;
            case 4:
                str = "SHA224";
                break;
            case 5:
                str = "SHA256";
                break;
            case 6:
                str = "SHA384";
                break;
            case 7:
                str = "SHA512";
                break;
            case 8:
                str = "INTRINSIC";
                break;
            default:
                throw null;
        }
        sb.append(str);
        sb.append("with");
        switch (i2) {
            case 1:
                str2 = "ANON";
                break;
            case 2:
                str2 = AbstractDevicePopManager.KeyPairGeneratorAlgorithms.RSA;
                break;
            case 3:
                str2 = "DSA";
                break;
            case 4:
                str2 = "ECDSA";
                break;
            case 5:
                str2 = "ED25519";
                break;
            case 6:
                str2 = "ED448";
                break;
            default:
                throw null;
        }
        sb.append(str2);
        this.f117312OooO0Oo = sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooO00o)) {
            return false;
        }
        OooO00o oooO00o = (OooO00o) obj;
        return this.f117309OooO00o == oooO00o.f117309OooO00o && this.f117310OooO0O0 == oooO00o.f117310OooO0O0 && OooOOO0.OooO0O0(this.f117311OooO0OO, oooO00o.f117311OooO0OO);
    }

    public final int hashCode() {
        int iOooO00o = (o0OoOo0.OooO00o(this.f117310OooO0O0) + (o0OoOo0.OooO00o(this.f117309OooO00o) * 31)) * 31;
        OooO oooO = this.f117311OooO0OO;
        return iOooO00o + (oooO == null ? 0 : oooO.f115243OooO00o.hashCode());
    }

    public final String toString() {
        return "HashAndSign(hash=" + C22245OooO0oO.OooO0o0(this.f117309OooO00o) + ", sign=" + androidx.concurrent.futures.OooO0o.OooO0Oo(this.f117310OooO0O0) + ", oid=" + this.f117311OooO0OO + ')';
    }
}
