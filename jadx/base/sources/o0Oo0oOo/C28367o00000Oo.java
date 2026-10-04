package o0Oo0oOo;

import com.orion.notein.domain.models.material.Orientation;
import com.orion.notein.domain.models.material.PageSize;

/* JADX INFO: renamed from: o0Oo0oOo.o00000Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C28367o00000Oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int[] f100560OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ int[] f100561OooO0O0;

    static {
        int[] iArr = new int[Orientation.values().length];
        try {
            iArr[Orientation.PORTRAIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Orientation.LANDSCAPE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Orientation.BOTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f100560OooO00o = iArr;
        int[] iArr2 = new int[PageSize.values().length];
        try {
            iArr2[PageSize.f57843A4.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[PageSize.f57844A5.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[PageSize.LETTER.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[PageSize.CUSTOM.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        f100561OooO0O0 = iArr2;
        int[] iArr3 = new int[o00000OO.values().length];
        try {
            iArr3[0] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            o00000OO o00000oo2 = o00000OO.f100556OooOo0o;
            iArr3[1] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            o00000OO o00000oo3 = o00000OO.f100556OooOo0o;
            iArr3[2] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            o00000OO o00000oo4 = o00000OO.f100556OooOo0o;
            iArr3[3] = 4;
        } catch (NoSuchFieldError unused11) {
        }
    }
}
