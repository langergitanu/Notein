package oO00o0OO;

import com.google.firebase.inappmessaging.internal.C22737OooOo0o;
import com.google.firebase.inappmessaging.internal.InAppMessageStreamManager;
import java.util.concurrent.atomic.AtomicReference;
import o0o0OO0.C30416Oooo0OO;
import oO0OooOO.AbstractC33485OooO;
import oO0OooOO.InterfaceC33494OooOO0;
import oO0OooOO.InterfaceC33495OooOO0O;
import ooOOo0.EnumC35109OooO0O0;

/* JADX INFO: renamed from: oO00o0OO.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32348OooO0OO<T> extends AbstractC33485OooO<T> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C22737OooOo0o f116294OooOo0o;

    /* JADX INFO: renamed from: oO00o0OO.OooO0OO$OooO00o */
    public static final class OooO00o<T> extends AtomicReference<oO0OOO00.OooO0O0> implements InterfaceC33494OooOO0<T>, oO0OOO00.OooO0O0 {
        private static final long serialVersionUID = -2467358622224974244L;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final InterfaceC33495OooOO0O<? super T> f116295OooOo0o;

        public OooO00o(InterfaceC33495OooOO0O<? super T> interfaceC33495OooOO0O) {
            this.f116295OooOo0o = interfaceC33495OooOO0O;
        }

        public final void OooO00o() {
            oO0OOO00.OooO0O0 andSet;
            oO0OOO00.OooO0O0 oooO0O0 = get();
            EnumC35109OooO0O0 enumC35109OooO0O0 = EnumC35109OooO0O0.f126092OooOo0o;
            if (oooO0O0 == enumC35109OooO0O0 || (andSet = getAndSet(enumC35109OooO0O0)) == enumC35109OooO0O0) {
                return;
            }
            try {
                this.f116295OooOo0o.onComplete();
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }

        public final void OooO0O0(Throwable th) {
            oO0OOO00.OooO0O0 andSet;
            Throwable nullPointerException = th == null ? new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.") : th;
            oO0OOO00.OooO0O0 oooO0O0 = get();
            EnumC35109OooO0O0 enumC35109OooO0O0 = EnumC35109OooO0O0.f126092OooOo0o;
            if (oooO0O0 == enumC35109OooO0O0 || (andSet = getAndSet(enumC35109OooO0O0)) == enumC35109OooO0O0) {
                oO0OOO0O.OooO00o.OooO0O0(th);
                return;
            }
            try {
                this.f116295OooOo0o.onError(nullPointerException);
            } finally {
                if (andSet != null) {
                    andSet.dispose();
                }
            }
        }

        @Override // oO0OOO00.OooO0O0
        public final void dispose() {
            EnumC35109OooO0O0.OooO00o(this);
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public final String toString() {
            return OooO0O0.OooO00o.OooO0O0(OooO00o.class.getSimpleName(), "{", super.toString(), "}");
        }
    }

    public C32348OooO0OO(C22737OooOo0o c22737OooOo0o) {
        this.f116294OooOo0o = c22737OooOo0o;
    }

    @Override // oO0OooOO.AbstractC33485OooO
    public final void OooO0OO(InterfaceC33495OooOO0O<? super T> interfaceC33495OooOO0O) {
        OooO00o oooO00o = new OooO00o(interfaceC33495OooOO0O);
        interfaceC33495OooOO0O.OooO00o(oooO00o);
        try {
            C22737OooOo0o c22737OooOo0o = this.f116294OooOo0o;
            InAppMessageStreamManager.lambda$taskToMaybe$30(c22737OooOo0o.f68510OooO00o, c22737OooOo0o.f68511OooO0O0, oooO00o);
        } catch (Throwable th) {
            C30416Oooo0OO.OooO00o(th);
            oooO00o.OooO0O0(th);
        }
    }
}
