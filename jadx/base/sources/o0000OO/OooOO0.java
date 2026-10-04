package o0000OO;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 extends OooOO0O {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final String f81431OooOo;

    public OooOO0(String str, String str2) {
        super(str, str2);
        this.f81431OooOo = str;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("type must not be empty");
        }
    }

    @Override // o0000OO.OooOO0O
    public final String OooO00o() {
        return this.f81431OooOo;
    }
}
