package oO0OooO;

import OooOOO0.AbstractC20449OooO0Oo;
import java.util.Collection;
import oO0O0OO.InterfaceC32596OooO0o0;
import oO0O0OO.InterfaceC32615OooOoo;
import oO0Ooo.AbstractC33320OooOoo;
import oO0OooO0.C33476OooO0O0;
import oO0o0000.InterfaceC33541OooO0oO;

/* JADX INFO: renamed from: oO0OooO.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC33457OooO0oO extends AbstractC20449OooO0Oo {

    /* JADX INFO: renamed from: oO0OooO.OooO0oO$OooO00o */
    public static final class OooO00o extends AbstractC33457OooO0oO {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f120916OooOo0o = new OooO00o();

        @Override // oO0OooO.AbstractC33457OooO0oO
        public final void Oooo(C33476OooO0O0 c33476OooO0O0) {
        }

        @Override // oO0OooO.AbstractC33457OooO0oO
        /* JADX INFO: renamed from: OoooO */
        public final AbstractC33320OooOoo Oooo0o0(InterfaceC33541OooO0oO type) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(type, "type");
            return (AbstractC33320OooOoo) type;
        }

        @Override // oO0OooO.AbstractC33457OooO0oO
        public final void OoooO0(oO0O0OO.OooOO0O descriptor) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(descriptor, "descriptor");
        }

        @Override // oO0OooO.AbstractC33457OooO0oO
        public final void OoooO00(InterfaceC32615OooOoo interfaceC32615OooOoo) {
        }

        @Override // oO0OooO.AbstractC33457OooO0oO
        public final Collection<AbstractC33320OooOoo> OoooO0O(InterfaceC32596OooO0o0 classDescriptor) {
            kotlin.jvm.internal.OooOOO0.OooO0oO(classDescriptor, "classDescriptor");
            Collection<AbstractC33320OooOoo> collectionOooO0Oo = classDescriptor.OooO().OooO0Oo();
            kotlin.jvm.internal.OooOOO0.OooO0o(collectionOooO0Oo, "classDescriptor.typeConstructor.supertypes");
            return collectionOooO0Oo;
        }
    }

    public abstract void Oooo(C33476OooO0O0 c33476OooO0O0);

    @Override // OooOOO0.AbstractC20449OooO0Oo
    /* JADX INFO: renamed from: OoooO, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC33320OooOoo Oooo0o0(InterfaceC33541OooO0oO interfaceC33541OooO0oO);

    public abstract void OoooO0(oO0O0OO.OooOO0O oooOO0O);

    public abstract void OoooO00(InterfaceC32615OooOoo interfaceC32615OooOoo);

    public abstract Collection<AbstractC33320OooOoo> OoooO0O(InterfaceC32596OooO0o0 interfaceC32596OooO0o0);
}
