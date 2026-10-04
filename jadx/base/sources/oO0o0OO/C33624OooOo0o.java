package oO0o0OO;

import java.util.concurrent.CancellationException;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32510OooOOo0;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO0o0OO.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33624OooOo0o<R> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final R f121305OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC33610OooOO0 f121306OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC32510OooOOo0<Throwable, R, InterfaceC34415OooO0oo, C32460OooOooO> f121307OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Object f121308OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final Throwable f121309OooO0o0;

    /* JADX WARN: Multi-variable type inference failed */
    public C33624OooOo0o(R r, InterfaceC33610OooOO0 interfaceC33610OooOO0, InterfaceC32510OooOOo0<? super Throwable, ? super R, ? super InterfaceC34415OooO0oo, C32460OooOooO> interfaceC32510OooOOo0, Object obj, Throwable th) {
        this.f121305OooO00o = r;
        this.f121306OooO0O0 = interfaceC33610OooOO0;
        this.f121307OooO0OO = interfaceC32510OooOOo0;
        this.f121308OooO0Oo = obj;
        this.f121309OooO0o0 = th;
    }

    public static C33624OooOo0o OooO00o(C33624OooOo0o c33624OooOo0o, InterfaceC33610OooOO0 interfaceC33610OooOO0, CancellationException cancellationException, int i) {
        R r = c33624OooOo0o.f121305OooO00o;
        if ((i & 2) != 0) {
            interfaceC33610OooOO0 = c33624OooOo0o.f121306OooO0O0;
        }
        InterfaceC33610OooOO0 interfaceC33610OooOO02 = interfaceC33610OooOO0;
        InterfaceC32510OooOOo0<Throwable, R, InterfaceC34415OooO0oo, C32460OooOooO> interfaceC32510OooOOo0 = c33624OooOo0o.f121307OooO0OO;
        Object obj = c33624OooOo0o.f121308OooO0Oo;
        Throwable th = cancellationException;
        if ((i & 16) != 0) {
            th = c33624OooOo0o.f121309OooO0o0;
        }
        c33624OooOo0o.getClass();
        return new C33624OooOo0o(r, interfaceC33610OooOO02, interfaceC32510OooOOo0, obj, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33624OooOo0o)) {
            return false;
        }
        C33624OooOo0o c33624OooOo0o = (C33624OooOo0o) obj;
        return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f121305OooO00o, c33624OooOo0o.f121305OooO00o) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f121306OooO0O0, c33624OooOo0o.f121306OooO0O0) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f121307OooO0OO, c33624OooOo0o.f121307OooO0OO) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f121308OooO0Oo, c33624OooOo0o.f121308OooO0Oo) && kotlin.jvm.internal.OooOOO0.OooO0O0(this.f121309OooO0o0, c33624OooOo0o.f121309OooO0o0);
    }

    public final int hashCode() {
        R r = this.f121305OooO00o;
        int iHashCode = (r == null ? 0 : r.hashCode()) * 31;
        InterfaceC33610OooOO0 interfaceC33610OooOO0 = this.f121306OooO0O0;
        int iHashCode2 = (iHashCode + (interfaceC33610OooOO0 == null ? 0 : interfaceC33610OooOO0.hashCode())) * 31;
        InterfaceC32510OooOOo0<Throwable, R, InterfaceC34415OooO0oo, C32460OooOooO> interfaceC32510OooOOo0 = this.f121307OooO0OO;
        int iHashCode3 = (iHashCode2 + (interfaceC32510OooOOo0 == null ? 0 : interfaceC32510OooOOo0.hashCode())) * 31;
        Object obj = this.f121308OooO0Oo;
        int iHashCode4 = (iHashCode3 + (obj == null ? 0 : obj.hashCode())) * 31;
        Throwable th = this.f121309OooO0o0;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f121305OooO00o + ", cancelHandler=" + this.f121306OooO0O0 + ", onCancellation=" + this.f121307OooO0OO + ", idempotentResume=" + this.f121308OooO0Oo + ", cancelCause=" + this.f121309OooO0o0 + ')';
    }

    public /* synthetic */ C33624OooOo0o(Object obj, InterfaceC33610OooOO0 interfaceC33610OooOO0, InterfaceC32510OooOOo0 interfaceC32510OooOOo0, CancellationException cancellationException, int i) {
        this(obj, (i & 2) != 0 ? null : interfaceC33610OooOO0, (InterfaceC32510OooOOo0<? super Throwable, ? super Object, ? super InterfaceC34415OooO0oo, C32460OooOooO>) ((i & 4) != 0 ? null : interfaceC32510OooOOo0), (Object) null, (i & 16) != 0 ? null : cancellationException);
    }
}
