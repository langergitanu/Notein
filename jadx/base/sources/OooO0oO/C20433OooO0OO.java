package OooO0oO;

import OooO0oO.AbstractC20431OooO00o;
import OooO0oO.C20436OooO0o0;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import oOo000Oo.C34434OooOoO;

/* JADX INFO: renamed from: OooO0oO.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20433OooO0OO extends AbstractC20431OooO00o<OooO0o.OooOO0, List<Uri>> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f58273OooO00o;

    public C20433OooO0OO(int i) {
        this.f58273OooO00o = i;
        if (i <= 1) {
            throw new IllegalArgumentException("Max items must be higher than 1");
        }
    }

    @Override // OooO0oO.AbstractC20431OooO00o
    public final Intent OooO00o(Context context, OooO0o.OooOO0 oooOO02) {
        OooO0o.OooOO0 input = oooOO02;
        OooOOO0.OooO0oO(input, "input");
        int i = Build.VERSION.SDK_INT;
        boolean z = i >= 33 || (i >= 30 && SdkExtensions.getExtensionVersion(30) >= 2);
        int i2 = this.f58273OooO00o;
        if (z) {
            Intent intent = new Intent("android.provider.action.PICK_IMAGES");
            intent.setType(C20436OooO0o0.OooO00o.OooO0O0(input.f58267OooO00o));
            int iMin = Math.min(i2, input.f58268OooO0O0);
            if (iMin <= 1 || iMin > MediaStore.getPickImagesMaxLimit()) {
                throw new IllegalArgumentException("Max items must be greater than 1 and lesser than or equal to MediaStore.getPickImagesMaxLimit()");
            }
            intent.putExtra("android.provider.extra.PICK_IMAGES_MAX", iMin);
            intent.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", input.f58269OooO0OO.OooO00o());
            intent.putExtra("android.provider.extra.PICK_IMAGES_IN_ORDER", false);
            return intent;
        }
        if (C20436OooO0o0.OooO00o.OooO00o(context) == null) {
            Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent2.setType(C20436OooO0o0.OooO00o.OooO0O0(input.f58267OooO00o));
            intent2.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            if (intent2.getType() == null) {
                intent2.setType("*/*");
                intent2.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
            }
            return intent2;
        }
        ResolveInfo resolveInfoOooO00o = C20436OooO0o0.OooO00o.OooO00o(context);
        if (resolveInfoOooO00o == null) {
            throw new IllegalStateException("Required value was null.");
        }
        ActivityInfo activityInfo = resolveInfoOooO00o.activityInfo;
        Intent intent3 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
        intent3.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
        intent3.setType(C20436OooO0o0.OooO00o.OooO0O0(input.f58267OooO00o));
        int iMin2 = Math.min(i2, input.f58268OooO0O0);
        if (iMin2 <= 1) {
            throw new IllegalArgumentException("Max items must be greater than 1");
        }
        intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_MAX", iMin2);
        intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB", input.f58269OooO0OO.OooO00o());
        intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_IN_ORDER", false);
        return intent3;
    }

    @Override // OooO0oO.AbstractC20431OooO00o
    public final AbstractC20431OooO00o.C18958OooO00o<List<Uri>> OooO0O0(Context context, OooO0o.OooOO0 oooOO02) {
        OooO0o.OooOO0 input = oooOO02;
        OooOOO0.OooO0oO(input, "input");
        return null;
    }

    @Override // OooO0oO.AbstractC20431OooO00o
    public final List<Uri> OooO0OO(int i, Intent intent) {
        if (i != -1) {
            intent = null;
        }
        C34434OooOoO c34434OooOoO = C34434OooOoO.f123453OooOo0o;
        if (intent == null) {
            return c34434OooOoO;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Uri data = intent.getData();
        if (data != null) {
            linkedHashSet.add(data);
        }
        ClipData clipData = intent.getClipData();
        if (clipData == null && linkedHashSet.isEmpty()) {
            return c34434OooOoO;
        }
        if (clipData != null) {
            int itemCount = clipData.getItemCount();
            for (int i2 = 0; i2 < itemCount; i2++) {
                Uri uri = clipData.getItemAt(i2).getUri();
                if (uri != null) {
                    linkedHashSet.add(uri);
                }
            }
        }
        return new ArrayList(linkedHashSet);
    }
}
