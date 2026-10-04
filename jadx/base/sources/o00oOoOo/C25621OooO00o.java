package o00oOoOo;

import com.aspose.slides.PatternStyle;
import io.ktor.utils.p616io.C23992OoooooO;

/* JADX INFO: renamed from: o00oOoOo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25621OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final int f87421OooO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final byte[] f87428OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final byte[] f87429OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final int f87430OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final byte[] f87431OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public static final byte[] f87432OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final byte[][] f87433OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public static final byte[] f87434OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public static final int f87435OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public static final byte[] f87436OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public static final byte[] f87437OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public static final byte[] f87438OooOOoo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f87439OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final byte[] f87422OooO0O0 = {-1, -40, -1};

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final int f87423OooO0OO = 3;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final byte[] f87424OooO0Oo = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final int f87426OooO0o0 = 8;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final byte[] f87425OooO0o = C23992OoooooO.OooO00o("GIF87a");

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final byte[] f87427OooO0oO = C23992OoooooO.OooO00o("GIF89a");

    static {
        byte[] bArrOooO00o = C23992OoooooO.OooO00o("BM");
        f87428OooO0oo = bArrOooO00o;
        f87421OooO = bArrOooO00o.length;
        f87429OooOO0 = new byte[]{0, 0, 1, 0};
        f87430OooOO0O = 4;
        f87431OooOO0o = C23992OoooooO.OooO00o("ftyp");
        f87433OooOOO0 = new byte[][]{C23992OoooooO.OooO00o("heic"), C23992OoooooO.OooO00o("heix"), C23992OoooooO.OooO00o("hevc"), C23992OoooooO.OooO00o("hevx"), C23992OoooooO.OooO00o("mif1"), C23992OoooooO.OooO00o("msf1")};
        f87432OooOOO = new byte[]{73, 73, PatternStyle.Plaid, 0};
        f87434OooOOOO = new byte[]{77, 77, 0, PatternStyle.Plaid};
        f87435OooOOOo = 4;
        f87437OooOOo0 = new byte[]{3, 0, 8, 0};
        f87436OooOOo = C23992OoooooO.OooO00o("ftyp");
        f87438OooOOoo = C23992OoooooO.OooO00o("avif");
    }

    public C25621OooO00o() {
        Integer num;
        Integer[] numArr = {21, 20, Integer.valueOf(f87423OooO0OO), Integer.valueOf(f87426OooO0o0), 6, Integer.valueOf(f87421OooO), Integer.valueOf(f87430OooOO0O), 12, 4, 12};
        if (numArr.length == 0) {
            num = null;
        } else {
            Integer num2 = numArr[0];
            int i = 1;
            int length = numArr.length - 1;
            if (1 <= length) {
                while (true) {
                    Integer num3 = numArr[i];
                    num2 = num2.compareTo(num3) < 0 ? num3 : num2;
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            num = num2;
        }
        if (num == null) {
            throw new IllegalStateException("Required value was null.");
        }
        this.f87439OooO00o = num.intValue();
    }
}
