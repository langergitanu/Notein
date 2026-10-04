package o0Oo0oOo;

import android.content.Context;
import com.orion.notein.domain.models.material.MaterialActionType;
import com.orion.notein.global.R;
import oO00ooO.C32442OooOO0o;

/* JADX INFO: loaded from: classes10.dex */
public final class o00000 {

    public /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f100547OooO00o;

        static {
            int[] iArr = new int[MaterialActionType.values().length];
            try {
                iArr[MaterialActionType.DOWNLOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MaterialActionType.APPLIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MaterialActionType.ADD_TEMPLATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MaterialActionType.ADD_FONT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MaterialActionType.IMPORT_STICKER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MaterialActionType.ADD_PALETTE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[MaterialActionType.GO_TO_CREATE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f100547OooO00o = iArr;
        }
    }

    public static String OooO00o(Context context, MaterialActionType actionType) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(actionType, "actionType");
        switch (OooO00o.f100547OooO00o[actionType.ordinal()]) {
            case 1:
                String string = context.getString(R.string.creative_library_action_download);
                kotlin.jvm.internal.OooOOO0.OooO0o(string, "getString(...)");
                return string;
            case 2:
                String string2 = context.getString(R.string.creative_library_action_applied);
                kotlin.jvm.internal.OooOOO0.OooO0o(string2, "getString(...)");
                return string2;
            case 3:
                String string3 = context.getString(R.string.creative_library_action_add_template);
                kotlin.jvm.internal.OooOOO0.OooO0o(string3, "getString(...)");
                return string3;
            case 4:
                String string4 = context.getString(R.string.creative_library_action_add_font);
                kotlin.jvm.internal.OooOOO0.OooO0o(string4, "getString(...)");
                return string4;
            case 5:
                String string5 = context.getString(R.string.creative_library_action_import_sticker);
                kotlin.jvm.internal.OooOOO0.OooO0o(string5, "getString(...)");
                return string5;
            case 6:
                String string6 = context.getString(R.string.creative_library_action_add_palette);
                kotlin.jvm.internal.OooOOO0.OooO0o(string6, "getString(...)");
                return string6;
            case 7:
                String string7 = context.getString(R.string.creative_library_action_go_to_create);
                kotlin.jvm.internal.OooOOO0.OooO0o(string7, "getString(...)");
                return string7;
            default:
                throw new C32442OooOO0o();
        }
    }
}
