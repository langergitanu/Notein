package oO0oO0Oo;

import java.io.InputStream;

/* JADX INFO: loaded from: classes10.dex */
public abstract class o0000oO extends InputStream {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f122438OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InputStream f122439OooOo0o;

    public o0000oO(InputStream inputStream, int i) {
        this.f122439OooOo0o = inputStream;
        this.f122438OooOo = i;
    }

    public final void OooO00o() {
        InputStream inputStream = this.f122439OooOo0o;
        if (inputStream instanceof o0000) {
            o0000 o0000Var = (o0000) inputStream;
            o0000Var.f122422OooOoo0 = true;
            o0000Var.OooO0OO();
        }
    }
}
