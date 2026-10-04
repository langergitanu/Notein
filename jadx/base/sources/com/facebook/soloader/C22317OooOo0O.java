package com.facebook.soloader;

import OooO0o.C20424OooO0Oo;
import android.content.Context;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: renamed from: com.facebook.soloader.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C22317OooOo0O extends C22318OooOo0o {
    public static C22317OooOo0O OooO00o(String str, Context context, AbstractC22320OooOoO0[] abstractC22320OooOoO0Arr) {
        StringBuilder sbOooO0o0 = C20424OooO0Oo.OooO0o0("couldn't find DSO to load: ", str, "\n\texisting SO sources: ");
        for (int i = 0; i < abstractC22320OooOoO0Arr.length; i++) {
            sbOooO0o0.append("\n\t\tSoSource ");
            sbOooO0o0.append(i);
            sbOooO0o0.append(": ");
            sbOooO0o0.append(abstractC22320OooOoO0Arr[i].toString());
        }
        if (context != null) {
            sbOooO0o0.append("\n\tNative lib dir: ");
            sbOooO0o0.append(context.getApplicationInfo().nativeLibraryDir);
            sbOooO0o0.append(IOUtils.LINE_SEPARATOR_UNIX);
        }
        return new C22317OooOo0O(str, sbOooO0o0.toString());
    }
}
