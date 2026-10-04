package oO0o0Ooo;

import androidx.fragment.app.C21904OooOoo0;
import kotlin.coroutines.Continuation;
import o00oo0OO.C25683OooO0OO;
import oO00ooo.InterfaceC32480OooO0Oo;
import oO0o0OO.AbstractC33602OooO00o;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO0o0Ooo.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C33835OooOOo<T> extends AbstractC33602OooO00o<T> implements InterfaceC32480OooO0Oo {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final Continuation<T> f121948OooOoO;

    public C33835OooOOo(Continuation continuation, InterfaceC34415OooO0oo interfaceC34415OooO0oo) {
        super(interfaceC34415OooO0oo, true, true);
        this.f121948OooOoO = continuation;
    }

    @Override // oO0o0OO.o0ooOOo
    public void OooOOo(Object obj) {
        C33826OooO0oO.OooO00o(C25683OooO0OO.OooO0O0(obj), C21904OooOoo0.OooO0o0(this.f121948OooOoO));
    }

    @Override // oO0o0OO.o0ooOOo
    public void OooOOoo(Object obj) {
        this.f121948OooOoO.resumeWith(C25683OooO0OO.OooO0O0(obj));
    }

    @Override // oO0o0OO.o0ooOOo
    public final boolean Oooo() {
        return true;
    }

    @Override // oO00ooo.InterfaceC32480OooO0Oo
    public final InterfaceC32480OooO0Oo getCallerFrame() {
        Continuation<T> continuation = this.f121948OooOoO;
        if (continuation instanceof InterfaceC32480OooO0Oo) {
            return (InterfaceC32480OooO0Oo) continuation;
        }
        return null;
    }
}
