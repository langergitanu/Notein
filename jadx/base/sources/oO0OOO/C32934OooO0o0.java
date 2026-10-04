package oO0OOO;

import java.util.Arrays;
import kotlin.jvm.internal.OooOOO0;
import oO0OO0Oo.AbstractC32916OooO00o;

/* JADX INFO: renamed from: oO0OOO.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32934OooO0o0 extends AbstractC32916OooO00o {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final C32934OooO0o0 f118820OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final C32934OooO0o0 f118821OooO0oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f118822OooO0o;

    static {
        C32934OooO0o0 c32934OooO0o0 = new C32934OooO0o0(new int[]{1, 8, 0}, false);
        f118820OooO0oO = c32934OooO0o0;
        int i = c32934OooO0o0.f118754OooO0OO;
        int i2 = c32934OooO0o0.f118753OooO0O0;
        f118821OooO0oo = (i2 == 1 && i == 9) ? new C32934OooO0o0(new int[]{2, 0, 0}, false) : new C32934OooO0o0(new int[]{i2, i + 1, 0}, false);
        new C32934OooO0o0(new int[0], false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32934OooO0o0(int[] versionArray, boolean z) {
        super(Arrays.copyOf(versionArray, versionArray.length));
        OooOOO0.OooO0oO(versionArray, "versionArray");
        this.f118822OooO0o = z;
    }

    public final boolean OooO0O0(C32934OooO0o0 metadataVersionFromLanguageVersion) {
        OooOOO0.OooO0oO(metadataVersionFromLanguageVersion, "metadataVersionFromLanguageVersion");
        C32934OooO0o0 c32934OooO0o0 = f118820OooO0oO;
        int i = this.f118753OooO0O0;
        int i2 = this.f118754OooO0OO;
        if (i == 2 && i2 == 0 && c32934OooO0o0.f118753OooO0O0 == 1 && c32934OooO0o0.f118754OooO0OO == 8) {
            return true;
        }
        if (!this.f118822OooO0o) {
            c32934OooO0o0 = f118821OooO0oo;
        }
        c32934OooO0o0.getClass();
        int i3 = metadataVersionFromLanguageVersion.f118753OooO0O0;
        int i4 = c32934OooO0o0.f118753OooO0O0;
        if (i4 > i3 || (i4 >= i3 && c32934OooO0o0.f118754OooO0OO > metadataVersionFromLanguageVersion.f118754OooO0OO)) {
            metadataVersionFromLanguageVersion = c32934OooO0o0;
        }
        boolean z = false;
        if ((i == 1 && i2 == 0) || i == 0) {
            return false;
        }
        int i5 = metadataVersionFromLanguageVersion.f118753OooO0O0;
        if (i > i5 || (i >= i5 && i2 > metadataVersionFromLanguageVersion.f118754OooO0OO)) {
            z = true;
        }
        return !z;
    }
}
