package oO0o0OO;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import o000o0o.C24613OooO0OO;
import oO00ooo.AbstractC32479OooO0OO;
import oO0o0Ooo.C33824OooO0o;
import oO0o0Ooo.C33826OooO0oO;
import oO0o0Ooo.C33827OooO0oo;
import oOo0000O.AbstractC34408OooO00o;
import oOo0000O.AbstractC34409OooO0O0;
import oOo0000O.InterfaceC34412OooO0o;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO0o0OO.OooOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC33630OooOooO extends AbstractC34408OooO00o implements InterfaceC34412OooO0o {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final OooO00o f121312OooOo = new OooO00o(InterfaceC34412OooO0o.OooO00o.f123422OooOo0o, new o0oOoOo.o00O0O(1));

    /* JADX INFO: renamed from: oO0o0OO.OooOooO$OooO00o */
    public static final class OooO00o extends AbstractC34409OooO0O0<InterfaceC34412OooO0o, AbstractC33630OooOooO> {
    }

    public AbstractC33630OooOooO() {
        super(InterfaceC34412OooO0o.OooO00o.f123422OooOo0o);
    }

    @Override // oOo0000O.InterfaceC34412OooO0o
    public final void OooOOo0(Continuation<?> continuation) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        kotlin.jvm.internal.OooOOO0.OooO0o0(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        C33824OooO0o c33824OooO0o = (C33824OooO0o) continuation;
        do {
            atomicReferenceFieldUpdater = C33824OooO0o.f121918OooOooO;
        } while (atomicReferenceFieldUpdater.get(c33824OooO0o) == C33826OooO0oO.f121925OooO0O0);
        Object obj = atomicReferenceFieldUpdater.get(c33824OooO0o);
        C33614OooOOO0 c33614OooOOO0 = obj instanceof C33614OooOOO0 ? (C33614OooOOO0) obj : null;
        if (c33614OooOOO0 != null) {
            c33614OooOOO0.OooOO0o();
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to oO0o0OO.OooOooO for r2v1 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // oOo0000O.AbstractC34408OooO00o, oOo0000O.InterfaceC34415OooO0oo
    public final <E extends oOo0000O.InterfaceC34415OooO0oo.OooO0O0> E get(oOo0000O.InterfaceC34415OooO0oo.OooO0OO<E> r3) {
        /*
            r2 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.OooOOO0.OooO0oO(r3, r0)
            boolean r0 = r3 instanceof oOo0000O.AbstractC34409OooO0O0
            if (r0 == 0) goto L1e
            oOo0000O.OooO0O0 r3 = (oOo0000O.AbstractC34409OooO0O0) r3
            oOo0000O.OooO0oo$OooO0OO<?> r0 = r2.f123417OooOo0o
            if (r0 == r3) goto L13
            oOo0000O.OooO0oo$OooO0OO<?> r1 = r3.f123418OooOo
            if (r1 != r0) goto L23
        L13:
            oO0O000o.OooOO0o<oOo0000O.OooO0oo$OooO0O0, E extends B> r3 = r3.f123419OooOo0o
            java.lang.Object r3 = r3.invoke(r2)
            oOo0000O.OooO0oo$OooO0O0 r3 = (oOo0000O.InterfaceC34415OooO0oo.OooO0O0) r3
            if (r3 == 0) goto L23
            return r3
        L1e:
            oOo0000O.OooO0o$OooO00o r0 = oOo0000O.InterfaceC34412OooO0o.OooO00o.f123422OooOo0o
            if (r0 != r3) goto L23
            return r2
        L23:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: oO0o0OO.AbstractC33630OooOooO.get(oOo0000O.OooO0oo$OooO0OO):oOo0000O.OooO0oo$OooO0O0");
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to oO0o0OO.OooOooO for r3v1 'this'  java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // oOo0000O.AbstractC34408OooO00o, oOo0000O.InterfaceC34415OooO0oo
    public final oOo0000O.InterfaceC34415OooO0oo minusKey(oOo0000O.InterfaceC34415OooO0oo.OooO0OO<?> r4) {
        /*
            r3 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.OooOOO0.OooO0oO(r4, r0)
            boolean r0 = r4 instanceof oOo0000O.AbstractC34409OooO0O0
            oOo0000O.OooO r1 = oOo0000O.OooO.f123416OooOo0o
            if (r0 == 0) goto L22
            oOo0000O.OooO0O0 r4 = (oOo0000O.AbstractC34409OooO0O0) r4
            oOo0000O.OooO0oo$OooO0OO<?> r0 = r3.f123417OooOo0o
            if (r0 == r4) goto L17
            oOo0000O.OooO0oo$OooO0OO<?> r2 = r4.f123418OooOo
            if (r2 != r0) goto L16
            goto L17
        L16:
            return r3
        L17:
            oO0O000o.OooOO0o<oOo0000O.OooO0oo$OooO0O0, E extends B> r4 = r4.f123419OooOo0o
            java.lang.Object r4 = r4.invoke(r3)
            oOo0000O.OooO0oo$OooO0O0 r4 = (oOo0000O.InterfaceC34415OooO0oo.OooO0O0) r4
            if (r4 == 0) goto L27
            goto L26
        L22:
            oOo0000O.OooO0o$OooO00o r0 = oOo0000O.InterfaceC34412OooO0o.OooO00o.f123422OooOo0o
            if (r0 != r4) goto L27
        L26:
            return r1
        L27:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: oO0o0OO.AbstractC33630OooOooO.minusKey(oOo0000O.OooO0oo$OooO0OO):oOo0000O.OooO0oo");
    }

    @Override // oOo0000O.InterfaceC34412OooO0o
    public final C33824OooO0o o0000ooO(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        return new C33824OooO0o(this, abstractC32479OooO0OO);
    }

    public void o000OO0o(InterfaceC34415OooO0oo interfaceC34415OooO0oo, Runnable runnable) {
        o0OoO0o(interfaceC34415OooO0oo, runnable);
    }

    public boolean o000OOO(InterfaceC34415OooO0oo interfaceC34415OooO0oo) {
        return !(this instanceof o0000oO);
    }

    public AbstractC33630OooOooO o000OOo0(int i) {
        C24613OooO0OO.OooO0O0(i);
        return new C33827OooO0oo(this, i);
    }

    public abstract void o0OoO0o(InterfaceC34415OooO0oo interfaceC34415OooO0oo, Runnable runnable);

    public String toString() {
        return getClass().getSimpleName() + '@' + C33640Oooo0o0.OooO00o(this);
    }
}
