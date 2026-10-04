package OooooOO;

import android.graphics.Paint;

/* JADX INFO: renamed from: OooooOO.Oooo0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21332Oooo0OO {

    /* JADX INFO: renamed from: OooooOO.Oooo0OO$OooO00o */
    public /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f61744OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final /* synthetic */ int[] f61745OooO0O0;

        static {
            try {
                new int[Paint.Style.values().length][Paint.Style.STROKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            int[] iArr = new int[Paint.Cap.values().length];
            try {
                iArr[Paint.Cap.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Paint.Cap.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Paint.Cap.SQUARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            f61744OooO00o = iArr;
            int[] iArr2 = new int[Paint.Join.values().length];
            try {
                iArr2[Paint.Join.MITER.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Paint.Join.BEVEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Paint.Join.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            f61745OooO0O0 = iArr2;
        }
    }

    public static final C21331Oooo0O0 OooO00o() {
        Paint paint = new Paint(7);
        C21331Oooo0O0 c21331Oooo0O0 = new C21331Oooo0O0();
        c21331Oooo0O0.f61740OooO00o = paint;
        c21331Oooo0O0.f61741OooO0O0 = 3;
        return c21331Oooo0O0;
    }
}
