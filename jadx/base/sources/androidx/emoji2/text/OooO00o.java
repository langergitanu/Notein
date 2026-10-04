package androidx.emoji2.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import androidx.core.provider.FontRequest;
import androidx.core.util.Preconditions;
import androidx.emoji2.text.C21868OooO0o0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: androidx.emoji2.text.OooO00o$OooO00o, reason: collision with other inner class name */
    public static class C19014OooO00o {
        public Signature[] OooO00o(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    public static class OooO0O0 extends C19014OooO00o {
    }

    public static class OooO0OO extends OooO0O0 {
        @Override // androidx.emoji2.text.OooO00o.C19014OooO00o
        public final Signature[] OooO00o(PackageManager packageManager, String str) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    public static C21868OooO0o0 OooO00o(Context context) {
        ProviderInfo providerInfo;
        FontRequest fontRequest;
        ApplicationInfo applicationInfo;
        C19014OooO00o oooO0OO = Build.VERSION.SDK_INT >= 28 ? new OooO0OO() : new OooO0O0();
        PackageManager packageManager = context.getPackageManager();
        Preconditions.checkNotNull(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            fontRequest = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrOooO00o = oooO0OO.OooO00o(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrOooO00o) {
                    arrayList.add(signature.toByteArray());
                }
                fontRequest = new FontRequest(str, str2, "emojicompat-emoji-font", (List<List<byte[]>>) Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e);
                fontRequest = null;
            }
        }
        if (fontRequest == null) {
            return null;
        }
        return new C21868OooO0o0(new C21868OooO0o0.OooO0O0(context, fontRequest));
    }
}
