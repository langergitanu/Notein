package oO00O;

/* JADX INFO: renamed from: oO00O.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public enum EnumC32144OooOOOo {
    /* JADX INFO: Fake field, exist only in values array */
    ExplicitPrime(1),
    /* JADX INFO: Fake field, exist only in values array */
    ExplicitChar(2),
    /* JADX INFO: Fake field, exist only in values array */
    NamedCurve(3);


    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final EnumC32144OooOOOo[] f115292OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f115294OooOo0o;

    static {
        EnumC32144OooOOOo enumC32144OooOOOo;
        EnumC32144OooOOOo[] enumC32144OooOOOoArr = new EnumC32144OooOOOo[256];
        for (int i = 0; i < 256; i++) {
            EnumC32144OooOOOo[] enumC32144OooOOOoArrValues = values();
            int length = enumC32144OooOOOoArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    enumC32144OooOOOo = null;
                    break;
                }
                enumC32144OooOOOo = enumC32144OooOOOoArrValues[i2];
                if (enumC32144OooOOOo.f115294OooOo0o == i) {
                    break;
                } else {
                    i2++;
                }
            }
            enumC32144OooOOOoArr[i] = enumC32144OooOOOo;
        }
        f115292OooOo = enumC32144OooOOOoArr;
    }

    EnumC32144OooOOOo(int i) {
        this.f115294OooOo0o = i;
    }
}
