package oO0OoO0;

import o00O0oo0.C24969OooOO0;
import oO0O0OO.o000oOoO;
import oO0OO00.OooO0O0;
import oO0OO0Oo.C32917OooO0O0;
import oO0OO0Oo.C32922OooO0oO;
import oO0OO0Oo.InterfaceC32918OooO0OO;
import oO0OooO0.C33476OooO0O0;
import oO0OooO0.C33477OooO0OO;
import ooo0o.C35193OooOO0o;

/* JADX INFO: renamed from: oO0OoO0.OooOooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC33252OooOooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC32918OooO0OO f120346OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C32922OooO0oO f120347OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o000oOoO f120348OooO0OO;

    /* JADX INFO: renamed from: oO0OoO0.OooOooO$OooO00o */
    public static final class OooO00o extends AbstractC33252OooOooO {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final oO0OO00.OooO0O0 f120349OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final C33476OooO0O0 f120350OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final OooO00o f120351OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final OooO0O0.OooO0OO f120352OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final boolean f120353OooO0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(oO0OO00.OooO0O0 classProto, InterfaceC32918OooO0OO nameResolver, C32922OooO0oO c32922OooO0oO, o000oOoO o000oooo2, OooO00o oooO00o) {
            super(nameResolver, c32922OooO0oO, o000oooo2);
            kotlin.jvm.internal.OooOOO0.OooO0oO(classProto, "classProto");
            kotlin.jvm.internal.OooOOO0.OooO0oO(nameResolver, "nameResolver");
            this.f120349OooO0Oo = classProto;
            this.f120351OooO0o0 = oooO00o;
            this.f120350OooO0o = C24969OooOO0.OooO00o(nameResolver, classProto.f118079OooOoOO);
            OooO0O0.OooO0OO oooO0OO = (OooO0O0.OooO0OO) C32917OooO0O0.f118762OooO0o.OooO0OO(classProto.f118077OooOoO);
            this.f120352OooO0oO = oooO0OO == null ? OooO0O0.OooO0OO.CLASS : oooO0OO;
            this.f120353OooO0oo = C32917OooO0O0.f118764OooO0oO.OooO0OO(classProto.f118077OooOoO).booleanValue();
        }

        @Override // oO0OoO0.AbstractC33252OooOooO
        public final C33477OooO0OO OooO00o() {
            return this.f120350OooO0o.OooO0O0();
        }
    }

    /* JADX INFO: renamed from: oO0OoO0.OooOooO$OooO0O0 */
    public static final class OooO0O0 extends AbstractC33252OooOooO {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final C33477OooO0OO f120354OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(C33477OooO0OO fqName, InterfaceC32918OooO0OO nameResolver, C32922OooO0oO c32922OooO0oO, C35193OooOO0o c35193OooOO0o) {
            super(nameResolver, c32922OooO0oO, c35193OooOO0o);
            kotlin.jvm.internal.OooOOO0.OooO0oO(fqName, "fqName");
            kotlin.jvm.internal.OooOOO0.OooO0oO(nameResolver, "nameResolver");
            this.f120354OooO0Oo = fqName;
        }

        @Override // oO0OoO0.AbstractC33252OooOooO
        public final C33477OooO0OO OooO00o() {
            return this.f120354OooO0Oo;
        }
    }

    public AbstractC33252OooOooO(InterfaceC32918OooO0OO interfaceC32918OooO0OO, C32922OooO0oO c32922OooO0oO, o000oOoO o000oooo2) {
        this.f120346OooO00o = interfaceC32918OooO0OO;
        this.f120347OooO0O0 = c32922OooO0oO;
        this.f120348OooO0OO = o000oooo2;
    }

    public abstract C33477OooO0OO OooO00o();

    public final String toString() {
        return getClass().getSimpleName() + ": " + OooO00o();
    }
}
