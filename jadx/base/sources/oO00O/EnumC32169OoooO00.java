package oO00O;

/* JADX INFO: renamed from: oO00O.OoooO00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public enum EnumC32169OoooO00 {
    HelloRequest(0),
    ClientHello(1),
    ServerHello(2),
    Certificate(11),
    /* JADX INFO: Fake field, exist only in values array */
    ServerKeyExchange(12),
    /* JADX INFO: Fake field, exist only in values array */
    CertificateRequest(13),
    /* JADX INFO: Fake field, exist only in values array */
    ServerDone(14),
    /* JADX INFO: Fake field, exist only in values array */
    CertificateVerify(15),
    ClientKeyExchange(16),
    Finished(20);


    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final EnumC32169OoooO00[] f115400OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f115408OooOo0o;

    static {
        EnumC32169OoooO00 enumC32169OoooO00;
        EnumC32169OoooO00[] enumC32169OoooO00Arr = new EnumC32169OoooO00[256];
        for (int i = 0; i < 256; i++) {
            EnumC32169OoooO00[] enumC32169OoooO00ArrValues = values();
            int length = enumC32169OoooO00ArrValues.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    enumC32169OoooO00 = null;
                    break;
                }
                enumC32169OoooO00 = enumC32169OoooO00ArrValues[i2];
                if (enumC32169OoooO00.f115408OooOo0o == i) {
                    break;
                } else {
                    i2++;
                }
            }
            enumC32169OoooO00Arr[i] = enumC32169OoooO00;
        }
        f115400OooOo = enumC32169OoooO00Arr;
    }

    EnumC32169OoooO00(int i) {
        this.f115408OooOo0o = i;
    }
}
