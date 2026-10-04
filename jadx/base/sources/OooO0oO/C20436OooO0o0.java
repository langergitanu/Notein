package OooO0oO;

import OooO0oO.AbstractC20431OooO00o;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32442OooOO0o;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.OooOo;

/* JADX INFO: renamed from: OooO0oO.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20436OooO0o0 extends AbstractC20431OooO00o<OooO0o.OooOO0, Uri> {

    /* JADX INFO: renamed from: OooO0oO.OooO0o0$OooO00o */
    public static final class OooO00o {
        public static ResolveInfo OooO00o(Context context) {
            return context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
        }

        public static String OooO0O0(OooO0o oooO0o) {
            if ((oooO0o instanceof C20437OooO0Oo) || (oooO0o instanceof C18959OooO0o0)) {
                return "image/*";
            }
            if (oooO0o instanceof OooO0OO) {
                return null;
            }
            throw new C32442OooOO0o();
        }
    }

    /* JADX INFO: renamed from: OooO0oO.OooO0o0$OooO0O0 */
    public static abstract class OooO0O0 {

        /* JADX INFO: renamed from: OooO0oO.OooO0o0$OooO0O0$OooO00o */
        public static final class OooO00o extends OooO0O0 {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public static final OooO00o f58274OooO00o = new OooO00o();

            /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
            public static final int f58275OooO0O0 = 1;

            @Override // OooO0oO.C20436OooO0o0.OooO0O0
            public final int OooO00o() {
                return f58275OooO0O0;
            }
        }

        public abstract int OooO00o();
    }

    /* JADX INFO: renamed from: OooO0oO.OooO0o0$OooO0OO */
    public static final class OooO0OO implements OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final OooO0OO f58276OooO00o = new OooO0OO();
    }

    /* JADX INFO: renamed from: OooO0oO.OooO0o0$OooO0Oo, reason: case insensitive filesystem */
    public static final class C20437OooO0Oo implements OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final C20437OooO0Oo f58277OooO00o = new C20437OooO0Oo();
    }

    /* JADX INFO: renamed from: OooO0oO.OooO0o0$OooO0o */
    public interface OooO0o {
    }

    /* JADX INFO: renamed from: OooO0oO.OooO0o0$OooO0o0, reason: collision with other inner class name */
    public static final class C18959OooO0o0 implements OooO0o {
    }

    @Override // OooO0oO.AbstractC20431OooO00o
    public final Intent OooO00o(Context context, OooO0o.OooOO0 oooOO02) {
        OooO0o.OooOO0 input = oooOO02;
        OooOOO0.OooO0oO(input, "input");
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 || (i >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
            Intent intent = new Intent("android.provider.action.PICK_IMAGES");
            intent.setType(OooO00o.OooO0O0(input.f58267OooO00o));
            intent.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", input.f58269OooO0OO.OooO00o());
            return intent;
        }
        if (OooO00o.OooO00o(context) == null) {
            Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent2.setType(OooO00o.OooO0O0(input.f58267OooO00o));
            if (intent2.getType() == null) {
                intent2.setType("*/*");
                intent2.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
            }
            return intent2;
        }
        ResolveInfo resolveInfoOooO00o = OooO00o.OooO00o(context);
        if (resolveInfoOooO00o == null) {
            throw new IllegalStateException("Required value was null.");
        }
        ActivityInfo activityInfo = resolveInfoOooO00o.activityInfo;
        Intent intent3 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
        intent3.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
        intent3.setType(OooO00o.OooO0O0(input.f58267OooO00o));
        intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB", input.f58269OooO0OO.OooO00o());
        return intent3;
    }

    @Override // OooO0oO.AbstractC20431OooO00o
    public final AbstractC20431OooO00o.C18958OooO00o<Uri> OooO0O0(Context context, OooO0o.OooOO0 oooOO02) {
        OooO0o.OooOO0 input = oooOO02;
        OooOOO0.OooO0oO(input, "input");
        return null;
    }

    @Override // OooO0oO.AbstractC20431OooO00o
    public final Uri OooO0OO(int i, Intent intent) {
        List arrayList;
        if (i != -1) {
            intent = null;
        }
        if (intent == null) {
            return null;
        }
        Uri data = intent.getData();
        if (data != null) {
            return data;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Uri data2 = intent.getData();
        if (data2 != null) {
            linkedHashSet.add(data2);
        }
        ClipData clipData = intent.getClipData();
        if (clipData == null && linkedHashSet.isEmpty()) {
            arrayList = C34434OooOoO.f123453OooOo0o;
        } else {
            if (clipData != null) {
                int itemCount = clipData.getItemCount();
                for (int i2 = 0; i2 < itemCount; i2++) {
                    Uri uri = clipData.getItemAt(i2).getUri();
                    if (uri != null) {
                        linkedHashSet.add(uri);
                    }
                }
            }
            arrayList = new ArrayList(linkedHashSet);
        }
        return (Uri) OooOo.Oooo(arrayList);
    }
}
