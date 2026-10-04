package androidx.concurrent.futures;

import android.graphics.Bitmap;
import androidx.ink.authoring.InProgressStrokesView;
import com.aspose.words.internal.zzYPP;
import com.aspose.words.internal.zzYQ8;
import com.microsoft.identity.common.java.platform.AbstractDevicePopManager;
import com.orion.notein.domain.models.cloudsync.CloudMetaExtra;
import kotlin.jvm.internal.OooOOO0;
import o000OO00.o000oOoO;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO0o implements o000oOoO {
    public static /* synthetic */ byte OooO00o(int i) {
        switch (i) {
            case 1:
                return (byte) 0;
            case 2:
                return (byte) 1;
            case 3:
                return (byte) 2;
            case 4:
                return (byte) 3;
            case 5:
                return (byte) 7;
            case 6:
                return (byte) 8;
            default:
                throw null;
        }
    }

    public static String OooO0O0(StringBuilder sb, Object obj, String str) {
        sb.append(obj);
        sb.append(str);
        return sb.toString();
    }

    public static StringBuilder OooO0OO(zzYQ8 zzyq8, String str, String str2, zzYPP zzypp, String str3) {
        zzyq8.zzZ(str, str2, zzypp);
        StringBuilder sb = new StringBuilder();
        sb.append(str3);
        return sb;
    }

    public static /* synthetic */ String OooO0Oo(int i) {
        switch (i) {
            case 1:
                return "ANON";
            case 2:
                return AbstractDevicePopManager.KeyPairGeneratorAlgorithms.RSA;
            case 3:
                return "DSA";
            case 4:
                return "ECDSA";
            case 5:
                return "ED25519";
            case 6:
                return "ED448";
            default:
                return CloudMetaExtra.DEFINE_NON_PARENT_ID;
        }
    }

    @Override // o000OO00.o000oOoO
    public Bitmap get(String it) {
        int i = InProgressStrokesView.f65171OooOoO;
        OooOOO0.OooO0oO(it, "it");
        return null;
    }
}
