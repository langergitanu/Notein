package o0Oo0oOo;

import com.orion.notein.domain.models.material.MaterialCategory;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class o00000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int[] f100552OooO00o;

    static {
        int[] iArr = new int[MaterialCategory.values().length];
        try {
            iArr[MaterialCategory.TEMPLATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MaterialCategory.STICKER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MaterialCategory.FONT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[MaterialCategory.PALETTE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f100552OooO00o = iArr;
    }
}
