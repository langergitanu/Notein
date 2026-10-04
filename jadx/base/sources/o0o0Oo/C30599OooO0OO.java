package o0o0Oo;

/* JADX INFO: renamed from: o0o0Oo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C30599OooO0OO extends AbstractC30598OooO0O0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final String f109485OooO0Oo;

    public C30599OooO0OO(String str) {
        this.f109485OooO0Oo = str;
    }

    @Override // o0o0Oo.AbstractC30598OooO0O0
    public final void OooO00o() throws Exception {
        this.f109482OooO00o = (byte) 1;
        byte[] bytes = this.f109485OooO0Oo.getBytes("UTF-8");
        this.f109484OooO0OO = bytes;
        this.f109483OooO0O0 = (byte) bytes.length;
    }
}
