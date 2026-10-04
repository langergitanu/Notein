package oO0oo0O0;

import com.microsoft.identity.common.java.crypto.IDevicePopManager;
import com.microsoft.identity.common.java.crypto.key.KeyUtil;
import java.util.Hashtable;

/* JADX INFO: renamed from: oO0oo0O0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34244OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f122992OooO00o = 0;

    static {
        Hashtable hashtable = new Hashtable();
        hashtable.put(IDevicePopManager.SHA_1, 128);
        hashtable.put("SHA-224", 192);
        hashtable.put(KeyUtil.HMAC_KEY_HASH_ALGORITHM, 256);
        hashtable.put("SHA-384", 256);
        hashtable.put("SHA-512", 256);
        hashtable.put("SHA-512/224", 192);
        hashtable.put("SHA-512/256", 256);
    }
}
