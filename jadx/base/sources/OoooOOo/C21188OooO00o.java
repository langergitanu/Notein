package OoooOOo;

import OoooOOo.C21200OooOOO0;
import java.util.List;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: OoooOOo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21188OooO00o extends C21189OooO0O0 {

    /* JADX INFO: renamed from: OoooOOo.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C18981OooO00o extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<Object, C32460OooOooO> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f61452OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18981OooO00o(List<? extends InterfaceC32507OooOO0o<Object, C32460OooOooO>> list) {
            super(1);
            this.f61452OooOo0o = list;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C32460OooOooO invoke(Object obj) {
            ?? r0 = this.f61452OooOo0o;
            int size = r0.size();
            for (int i = 0; i < size; i++) {
                ((InterfaceC32507OooOO0o) r0.get(i)).invoke(obj);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX INFO: renamed from: OoooOOo.OooO00o$OooO0O0 */
    public static final class OooO0O0 extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<C21196OooOO0, C21189OooO0O0> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ InterfaceC32507OooOO0o<Object, C32460OooOooO> f61453OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC32507OooOO0o<Object, C32460OooOooO> f61454OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(InterfaceC32507OooOO0o<Object, C32460OooOooO> interfaceC32507OooOO0o, InterfaceC32507OooOO0o<Object, C32460OooOooO> interfaceC32507OooOO0o2) {
            super(1);
            this.f61454OooOo0o = interfaceC32507OooOO0o;
            this.f61453OooOo = interfaceC32507OooOO0o2;
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C21189OooO0O0 invoke(C21196OooOO0 c21196OooOO0) {
            int i;
            C21196OooOO0 c21196OooOO02 = c21196OooOO0;
            synchronized (C21200OooOOO0.f61496OooO0OO) {
                i = C21200OooOOO0.f61499OooO0o0;
                C21200OooOOO0.f61499OooO0o0 = i + 1;
            }
            return new C21189OooO0O0(i, c21196OooOO02, this.f61454OooOo0o, this.f61453OooOo);
        }
    }

    /* JADX INFO: renamed from: OoooOOo.OooO00o$OooO0OO */
    public static final class OooO0OO extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<C21196OooOO0, C21193OooO0o0> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC32507OooOO0o<Object, C32460OooOooO> f61455OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(InterfaceC32507OooOO0o<Object, C32460OooOooO> interfaceC32507OooOO0o) {
            super(1);
            this.f61455OooOo0o = interfaceC32507OooOO0o;
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C21193OooO0o0 invoke(C21196OooOO0 c21196OooOO0) {
            int i;
            C21196OooOO0 c21196OooOO02 = c21196OooOO0;
            synchronized (C21200OooOOO0.f61496OooO0OO) {
                i = C21200OooOOO0.f61499OooO0o0;
                C21200OooOOO0.f61499OooO0o0 = i + 1;
            }
            return new C21193OooO0o0(i, c21196OooOO02, this.f61455OooOo0o);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    public C21188OooO00o(int i, C21196OooOO0 c21196OooOO0) {
        InterfaceC32507OooOO0o c18981OooO00o;
        synchronized (C21200OooOOO0.f61496OooO0OO) {
            ?? r1 = C21200OooOOO0.f61493OooO;
            c18981OooO00o = (InterfaceC32507OooOO0o) oOo000Oo.OooOo.o0OoOo0(r1);
            c18981OooO00o = c18981OooO00o == null ? new C18981OooO00o(r1) : c18981OooO00o;
        }
        super(i, c21196OooOO0, null, c18981OooO00o);
    }

    @Override // OoooOOo.C21189OooO0O0, OoooOOo.AbstractC21194OooO0oO
    public final void OooO0OO() {
        synchronized (C21200OooOOO0.f61496OooO0OO) {
            int i = this.f61476OooO0Oo;
            if (i >= 0) {
                C21200OooOOO0.OooOo0(i);
                this.f61476OooO0Oo = -1;
            }
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        }
    }

    @Override // OoooOOo.C21189OooO0O0, OoooOOo.AbstractC21194OooO0oO
    public final void OooOO0O() {
        C21206OooOo.OooO00o();
        throw null;
    }

    @Override // OoooOOo.C21189OooO0O0, OoooOOo.AbstractC21194OooO0oO
    public final void OooOO0o() {
        C21206OooOo.OooO00o();
        throw null;
    }

    @Override // OoooOOo.C21189OooO0O0, OoooOOo.AbstractC21194OooO0oO
    public final void OooOOO0() {
        C21200OooOOO0.OooO00o();
    }

    @Override // OoooOOo.C21189OooO0O0, OoooOOo.AbstractC21194OooO0oO
    public final AbstractC21194OooO0oO OooOo00(InterfaceC32507OooOO0o<Object, C32460OooOooO> interfaceC32507OooOO0o) {
        OooO0OO oooO0OO = new OooO0OO(interfaceC32507OooOO0o);
        C21200OooOOO0.OooO00o oooO00o = C21200OooOOO0.f61494OooO00o;
        return (AbstractC21194OooO0oO) C21200OooOOO0.OooO0o(new C21201OooOOOO(oooO0OO));
    }

    @Override // OoooOOo.C21189OooO0O0
    public final AbstractC21195OooO0oo OooOo0O() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }

    @Override // OoooOOo.C21189OooO0O0
    public final C21189OooO0O0 OooOoo0(InterfaceC32507OooOO0o<Object, C32460OooOooO> interfaceC32507OooOO0o, InterfaceC32507OooOO0o<Object, C32460OooOooO> interfaceC32507OooOO0o2) {
        OooO0O0 oooO0O0 = new OooO0O0(interfaceC32507OooOO0o, interfaceC32507OooOO0o2);
        C21200OooOOO0.OooO00o oooO00o = C21200OooOOO0.f61494OooO00o;
        return (C21189OooO0O0) ((AbstractC21194OooO0oO) C21200OooOOO0.OooO0o(new C21201OooOOOO(oooO0O0)));
    }
}
