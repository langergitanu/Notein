package oO0Ooo;

import java.util.ArrayDeque;
import oO0OooO.AbstractC33456OooO0o0;
import oO0OooO.AbstractC33457OooO0oO;
import oO0OooO.InterfaceC33452OooO0O0;
import oO0o0000.InterfaceC33541OooO0oO;
import oO0o0000.InterfaceC33542OooO0oo;
import oO0o0O0.C33558OooO0Oo;

/* JADX INFO: renamed from: oO0Ooo.OoooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C33340OoooOOo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f120600OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f120601OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC33452OooO0O0 f120602OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final AbstractC33456OooO0o0 f120603OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f120604OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final AbstractC33457OooO0oO f120605OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public ArrayDeque<InterfaceC33542OooO0oo> f120606OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public C33558OooO0Oo f120607OooO0oo;

    /* JADX INFO: renamed from: oO0Ooo.OoooOOo$OooO00o */
    public interface OooO00o {

        /* JADX INFO: renamed from: oO0Ooo.OoooOOo$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C20313OooO00o implements OooO00o {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public boolean f120608OooO00o;

            @Override // oO0Ooo.C33340OoooOOo.OooO00o
            public final void OooO00o(C33298OooO0o0 c33298OooO0o0) {
                if (this.f120608OooO00o) {
                    return;
                }
                this.f120608OooO00o = ((Boolean) c33298OooO0o0.invoke()).booleanValue();
            }
        }

        void OooO00o(C33298OooO0o0 c33298OooO0o0);
    }

    /* JADX INFO: renamed from: oO0Ooo.OoooOOo$OooO0O0 */
    public static abstract class OooO0O0 {

        /* JADX INFO: renamed from: oO0Ooo.OoooOOo$OooO0O0$OooO00o */
        public static abstract class OooO00o extends OooO0O0 {
        }

        /* JADX INFO: renamed from: oO0Ooo.OoooOOo$OooO0O0$OooO0O0, reason: collision with other inner class name */
        public static final class C20314OooO0O0 extends OooO0O0 {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public static final C20314OooO0O0 f120609OooO00o = new C20314OooO0O0();

            @Override // oO0Ooo.C33340OoooOOo.OooO0O0
            public final InterfaceC33542OooO0oo OooO00o(C33340OoooOOo state, InterfaceC33541OooO0oO type) {
                kotlin.jvm.internal.OooOOO0.OooO0oO(state, "state");
                kotlin.jvm.internal.OooOOO0.OooO0oO(type, "type");
                return state.f120602OooO0OO.OooooOO(type);
            }
        }

        /* JADX INFO: renamed from: oO0Ooo.OoooOOo$OooO0O0$OooO0OO */
        public static final class OooO0OO extends OooO0O0 {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public static final OooO0OO f120610OooO00o = new OooO0OO();

            @Override // oO0Ooo.C33340OoooOOo.OooO0O0
            public final InterfaceC33542OooO0oo OooO00o(C33340OoooOOo state, InterfaceC33541OooO0oO type) {
                kotlin.jvm.internal.OooOOO0.OooO0oO(state, "state");
                kotlin.jvm.internal.OooOOO0.OooO0oO(type, "type");
                throw new UnsupportedOperationException("Should not be called");
            }
        }

        /* JADX INFO: renamed from: oO0Ooo.OoooOOo$OooO0O0$OooO0Oo, reason: case insensitive filesystem */
        public static final class C33341OooO0Oo extends OooO0O0 {

            /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
            public static final C33341OooO0Oo f120611OooO00o = new C33341OooO0Oo();

            @Override // oO0Ooo.C33340OoooOOo.OooO0O0
            public final InterfaceC33542OooO0oo OooO00o(C33340OoooOOo state, InterfaceC33541OooO0oO type) {
                kotlin.jvm.internal.OooOOO0.OooO0oO(state, "state");
                kotlin.jvm.internal.OooOOO0.OooO0oO(type, "type");
                return state.f120602OooO0OO.OooOo0(type);
            }
        }

        public abstract InterfaceC33542OooO0oo OooO00o(C33340OoooOOo c33340OoooOOo, InterfaceC33541OooO0oO interfaceC33541OooO0oO);
    }

    public C33340OoooOOo(boolean z, boolean z2, InterfaceC33452OooO0O0 typeSystemContext, AbstractC33456OooO0o0 kotlinTypePreparator, AbstractC33457OooO0oO kotlinTypeRefiner) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(typeSystemContext, "typeSystemContext");
        kotlin.jvm.internal.OooOOO0.OooO0oO(kotlinTypePreparator, "kotlinTypePreparator");
        kotlin.jvm.internal.OooOOO0.OooO0oO(kotlinTypeRefiner, "kotlinTypeRefiner");
        this.f120600OooO00o = z;
        this.f120601OooO0O0 = z2;
        this.f120602OooO0OO = typeSystemContext;
        this.f120603OooO0Oo = kotlinTypePreparator;
        this.f120605OooO0o0 = kotlinTypeRefiner;
    }

    public final void OooO00o() {
        ArrayDeque<InterfaceC33542OooO0oo> arrayDeque = this.f120606OooO0oO;
        kotlin.jvm.internal.OooOOO0.OooO0Oo(arrayDeque);
        arrayDeque.clear();
        C33558OooO0Oo c33558OooO0Oo = this.f120607OooO0oo;
        kotlin.jvm.internal.OooOOO0.OooO0Oo(c33558OooO0Oo);
        c33558OooO0Oo.clear();
    }

    public final void OooO0O0() {
        if (this.f120606OooO0oO == null) {
            this.f120606OooO0oO = new ArrayDeque<>(4);
        }
        if (this.f120607OooO0oo == null) {
            this.f120607OooO0oo = new C33558OooO0Oo();
        }
    }

    public final InterfaceC33541OooO0oO OooO0OO(InterfaceC33541OooO0oO type) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(type, "type");
        return this.f120603OooO0Oo.OoooooO(type);
    }
}
