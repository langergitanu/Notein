package oO00O;

/* JADX INFO: renamed from: oO00O.OoooO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public enum EnumC32170OoooO0O {
    ChangeCipherSpec(20),
    Alert(21),
    Handshake(22),
    ApplicationData(23);


    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final OooO00o f115409OooOo = new OooO00o();

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final EnumC32170OoooO0O[] f115411OooOoO0;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f115416OooOo0o;

    /* JADX INFO: renamed from: oO00O.OoooO0O$OooO00o */
    public static final class OooO00o {
    }

    static {
        EnumC32170OoooO0O enumC32170OoooO0O;
        EnumC32170OoooO0O[] enumC32170OoooO0OArr = new EnumC32170OoooO0O[256];
        for (int i = 0; i < 256; i++) {
            EnumC32170OoooO0O[] enumC32170OoooO0OArrValues = values();
            int length = enumC32170OoooO0OArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    enumC32170OoooO0O = null;
                    break;
                }
                enumC32170OoooO0O = enumC32170OoooO0OArrValues[i2];
                if (enumC32170OoooO0O.f115416OooOo0o == i) {
                    break;
                } else {
                    i2++;
                }
            }
            enumC32170OoooO0OArr[i] = enumC32170OoooO0O;
        }
        f115411OooOoO0 = enumC32170OoooO0OArr;
    }

    EnumC32170OoooO0O(int i) {
        this.f115416OooOo0o = i;
    }
}
