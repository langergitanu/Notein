package oO0o0OO;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes10.dex */
public final class o0000 extends CancellationException implements InterfaceC33627OooOoOO<o0000> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final transient o0000O00 f121351OooOo0o;

    public o0000(String str, o0000O00 o0000o00) {
        super(str);
        this.f121351OooOo0o = o0000o00;
    }

    @Override // oO0o0OO.InterfaceC33627OooOoOO
    public final Throwable OooO00o() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        o0000 o0000Var = new o0000(message, this.f121351OooOo0o);
        o0000Var.initCause(this);
        return o0000Var;
    }
}
