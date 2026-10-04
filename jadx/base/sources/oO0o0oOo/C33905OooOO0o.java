package oO0o0oOo;

import java.util.concurrent.atomic.AtomicReferenceArray;
import oO0o0Ooo.AbstractC33837OooOOoo;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO0o0oOo.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33905OooOO0o extends AbstractC33837OooOOoo<C33905OooOO0o> {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f122120OooOoOO;

    public C33905OooOO0o(long j, C33905OooOO0o c33905OooOO0o, int i) {
        super(j, c33905OooOO0o, i);
        this.f122120OooOoOO = new AtomicReferenceArray(C33904OooOO0O.f122118OooO0o);
    }

    @Override // oO0o0Ooo.AbstractC33837OooOOoo
    public final int OooO0oO() {
        return C33904OooOO0O.f122118OooO0o;
    }

    @Override // oO0o0Ooo.AbstractC33837OooOOoo
    public final void OooO0oo(int i, InterfaceC34415OooO0oo interfaceC34415OooO0oo) {
        this.f122120OooOoOO.set(i, C33904OooOO0O.f122119OooO0o0);
        OooO();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f121950OooOoO0 + ", hashCode=" + hashCode() + ']';
    }
}
