package oO0o0Ooo;

import com.orion.notein.data.service.dto.MaterialPurchaseStatusResponse;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: oO0o0Ooo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33820OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C33839OooOo0 f121913OooO00o = new C33839OooOo0(MaterialPurchaseStatusResponse.STATUS_CLOSED);

    public static final <S extends AbstractC33837OooOOoo<S>> Object OooO00o(S s, long j, InterfaceC32508OooOOOo<? super Long, ? super S, ? extends S> interfaceC32508OooOOOo) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            if (s.f121950OooOoO0 >= j && !s.OooO0Oo()) {
                return s;
            }
            Object obj = AbstractC33821OooO0O0.f121915OooOo0o.get(s);
            C33839OooOo0 c33839OooOo0 = f121913OooO00o;
            if (obj == c33839OooOo0) {
                return c33839OooOo0;
            }
            S sInvoke = (S) ((AbstractC33821OooO0O0) obj);
            if (sInvoke == null) {
                sInvoke = interfaceC32508OooOOOo.invoke(Long.valueOf(s.f121950OooOoO0 + 1), s);
                do {
                    atomicReferenceFieldUpdater = AbstractC33821OooO0O0.f121915OooOo0o;
                    if (atomicReferenceFieldUpdater.compareAndSet(s, null, sInvoke)) {
                        if (s.OooO0Oo()) {
                            s.OooO0o0();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(s) == null);
            }
            s = (Object) sInvoke;
        }
    }
}
