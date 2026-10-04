package oO0o0OOo;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0OO.AbstractC33602OooO00o;
import oO0o0OO.o0ooOOo;
import oO0o0OO.oo000o;
import oO0o0OOo.C33695OooO0o0;
import oO0o0OOo.C33711OooOo00;
import oO0o0OoO.C33801OooOOO;
import oO0o0oO0.InterfaceC33889OooO0o0;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO0o0OOo.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C33700OooOO0O<E> extends AbstractC33602OooO00o<C32460OooOooO> implements InterfaceC33699OooOO0<E> {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final C33695OooO0o0 f121482OooOoO;

    public C33700OooOO0O(InterfaceC34415OooO0oo interfaceC34415OooO0oo, C33695OooO0o0 c33695OooO0o0, boolean z, boolean z2) {
        super(interfaceC34415OooO0oo, z, z2);
        this.f121482OooOoO = c33695OooO0o0;
    }

    @Override // oO0o0OOo.InterfaceC33709OooOo
    public final Object OooO(C33801OooOOO.OooO00o oooO00o) throws Throwable {
        C33695OooO0o0 c33695OooO0o0 = this.f121482OooOoO;
        c33695OooO0o0.getClass();
        Object objOooo000 = C33695OooO0o0.Oooo000(c33695OooO0o0, oooO00o);
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        return objOooo000;
    }

    @Override // oO0o0OOo.InterfaceC33715OooOoO0
    public boolean OooO0Oo(Throwable th) {
        return this.f121482OooOoO.OooOOOo(false, th);
    }

    @Override // oO0o0OOo.InterfaceC33709OooOo
    public final InterfaceC33889OooO0o0<C33702OooOOO<E>> OooO0o() {
        return this.f121482OooOoO.OooO0o();
    }

    @Override // oO0o0OOo.InterfaceC33715OooOoO0
    public Object OooO0o0(E e) {
        return this.f121482OooOoO.OooO0o0(e);
    }

    @Override // oO0o0OOo.InterfaceC33709OooOo
    public final Object OooO0oO(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        return this.f121482OooOoO.OooO0oO(abstractC32479OooO0OO);
    }

    @Override // oO0o0OOo.InterfaceC33709OooOo
    public final Object OooO0oo() {
        return this.f121482OooOoO.OooO0oo();
    }

    @Override // oO0o0OOo.InterfaceC33715OooOoO0
    public final boolean OooOO0() {
        return this.f121482OooOoO.OooOO0();
    }

    @Override // oO0o0OOo.InterfaceC33715OooOoO0
    public final void OooOO0O(C33711OooOo00.OooO0O0 oooO0O0) {
        this.f121482OooOoO.OooOO0O(oooO0O0);
    }

    @Override // oO0o0OOo.InterfaceC33709OooOo
    public final InterfaceC33889OooO0o0<E> OooOO0o() {
        return this.f121482OooOoO.OooOO0o();
    }

    @Override // oO0o0OOo.InterfaceC33715OooOoO0
    public Object OooOOO(E e, Continuation<? super C32460OooOooO> continuation) {
        return this.f121482OooOoO.OooOOO(e, continuation);
    }

    @Override // oO0o0OO.o0ooOOo
    public final void OooOo0O(CancellationException cancellationException) {
        CancellationException cancellationExceptionOooooOO = o0ooOOo.OooooOO(this, cancellationException);
        this.f121482OooOoO.OooOOOo(true, cancellationExceptionOooooOO);
        OooOo0(cancellationExceptionOooooOO);
    }

    @Override // oO0o0OO.o0ooOOo, oO0o0OO.InterfaceC33672o00ooo
    public final void cancel(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new oo000o(OooOo(), null, this);
        }
        OooOo0O(cancellationException);
    }

    @Override // oO0o0OO.o0ooOOo, oO0o0OO.InterfaceC33672o00ooo
    public final /* synthetic */ boolean cancel(Throwable th) {
        throw null;
    }

    public final C33700OooOO0O getChannel() {
        return this;
    }

    @Override // oO0o0OOo.InterfaceC33709OooOo
    public final InterfaceC33701OooOO0o<E> iterator() {
        C33695OooO0o0 c33695OooO0o0 = this.f121482OooOoO;
        c33695OooO0o0.getClass();
        return new C33695OooO0o0.OooO00o();
    }

    @Override // oO0o0OO.o0ooOOo, oO0o0OO.InterfaceC33672o00ooo
    public final /* synthetic */ void cancel() {
        OooOo0O(new oo000o(OooOo(), null, this));
    }
}
