package oO00O;

/* JADX INFO: renamed from: oO00O.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public enum EnumC32146OooOOo0 {
    /* JADX INFO: Fake field, exist only in values array */
    WARNING(1),
    /* JADX INFO: Fake field, exist only in values array */
    FATAL(2);


    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final EnumC32146OooOOo0[] f115299OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f115301OooOo0o;

    /* JADX INFO: renamed from: oO00O.OooOOo0$OooO00o */
    public static final class OooO00o {
    }

    static {
        EnumC32146OooOOo0 enumC32146OooOOo0;
        EnumC32146OooOOo0[] enumC32146OooOOo0Arr = new EnumC32146OooOOo0[256];
        for (int i = 0; i < 256; i++) {
            EnumC32146OooOOo0[] enumC32146OooOOo0ArrValues = values();
            int length = enumC32146OooOOo0ArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    enumC32146OooOOo0 = null;
                    break;
                }
                enumC32146OooOOo0 = enumC32146OooOOo0ArrValues[i2];
                if (enumC32146OooOOo0.f115301OooOo0o == i) {
                    break;
                } else {
                    i2++;
                }
            }
            enumC32146OooOOo0Arr[i] = enumC32146OooOOo0;
        }
        f115299OooOo = enumC32146OooOOo0Arr;
    }

    EnumC32146OooOOo0(int i) {
        this.f115301OooOo0o = i;
    }
}
