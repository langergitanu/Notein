package OoooOoO;

import kotlin.jvm.internal.OooOOO0;
import o00oO0O.AbstractC25521OoooO;
import o00oO0O.C25520Oooo0oo;
import o00oO0O.InterfaceC25492OooO0oo;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;

/* JADX INFO: renamed from: OoooOoO.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC21233OooO0o {

    /* JADX INFO: renamed from: OoooOoO.OooO0o$OooO00o */
    public static final class OooO00o implements InterfaceC21233OooO0o {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final /* synthetic */ OooO00o f61602OooOo0o = new OooO00o();

        @Override // OoooOoO.InterfaceC21233OooO0o
        public final <R> R OooOOOO(R r, InterfaceC32508OooOOOo<? super R, ? super OooO0O0, ? extends R> operation) {
            OooOOO0.OooO0oO(operation, "operation");
            return r;
        }

        @Override // OoooOoO.InterfaceC21233OooO0o
        public final boolean OooOo0o(InterfaceC32507OooOO0o<? super OooO0O0, Boolean> predicate) {
            OooOOO0.OooO0oO(predicate, "predicate");
            return true;
        }

        @Override // OoooOoO.InterfaceC21233OooO0o
        public final InterfaceC21233OooO0o o00ooo(InterfaceC21233OooO0o other) {
            OooOOO0.OooO0oO(other, "other");
            return other;
        }

        public final String toString() {
            return "Modifier";
        }
    }

    /* JADX INFO: renamed from: OoooOoO.OooO0o$OooO0O0 */
    public interface OooO0O0 extends InterfaceC21233OooO0o {
        @Override // OoooOoO.InterfaceC21233OooO0o
        default <R> R OooOOOO(R r, InterfaceC32508OooOOOo<? super R, ? super OooO0O0, ? extends R> operation) {
            OooOOO0.OooO0oO(operation, "operation");
            return operation.invoke(r, this);
        }

        @Override // OoooOoO.InterfaceC21233OooO0o
        default boolean OooOo0o(InterfaceC32507OooOO0o<? super OooO0O0, Boolean> predicate) {
            OooOOO0.OooO0oO(predicate, "predicate");
            return predicate.invoke(this).booleanValue();
        }
    }

    /* JADX INFO: renamed from: OoooOoO.OooO0o$OooO0OO */
    public static abstract class OooO0OO implements InterfaceC25492OooO0oo {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public int f61603OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final OooO0OO f61604OooOo0o = this;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public OooO0OO f61605OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public int f61606OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public OooO0OO f61607OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public AbstractC25521OoooO f61608OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public C25520Oooo0oo f61609OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public boolean f61610OooOooO;

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public boolean f61611OooOooo;

        /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
        public boolean f61612Oooo000;

        public final void OooOooO() {
            if (!this.f61612Oooo000) {
                throw new IllegalStateException("Check failed.");
            }
            if (this.f61608OooOoo == null) {
                throw new IllegalStateException("Check failed.");
            }
            Oooo000();
            this.f61612Oooo000 = false;
        }

        public void OooOooo() {
        }

        public void Oooo000() {
        }

        public void Oooo00O() {
        }

        @Override // o00oO0O.InterfaceC25492OooO0oo
        public final OooO0OO getNode() {
            return this.f61604OooOo0o;
        }
    }

    <R> R OooOOOO(R r, InterfaceC32508OooOOOo<? super R, ? super OooO0O0, ? extends R> interfaceC32508OooOOOo);

    boolean OooOo0o(InterfaceC32507OooOO0o<? super OooO0O0, Boolean> interfaceC32507OooOO0o);

    default InterfaceC21233OooO0o o00ooo(InterfaceC21233OooO0o other) {
        OooOOO0.OooO0oO(other, "other");
        return other == OooO00o.f61602OooOo0o ? this : new C21231OooO0OO(this, other);
    }
}
