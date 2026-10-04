package oO0Ooo0O;

import java.util.ArrayList;
import oO000oo.C32133OooO0o;
import oO00OOoO.AbstractC32247OooO0oO;
import oO00OOoO.C32242OooO0O0;
import oO00OOoO.C32243OooO0OO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0Oo0Oo.C33199OooO0O0;
import oOo000Oo.C34429OooOOo0;
import oOo00Oo0.C34502OooO00o;

/* JADX INFO: renamed from: oO0Ooo0O.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33376OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C20316OooO00o f120675OooO00o = new C20316OooO00o();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final C34502OooO00o<C33376OooO00o> f120676OooO0O0 = new C34502OooO00o<>("BodyProgress");

    /* JADX INFO: renamed from: oO0Ooo0O.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C20316OooO00o implements InterfaceC33394OooOo<C32460OooOooO, C33376OooO00o> {
        @Override // oO0Ooo0O.InterfaceC33394OooOo
        public final C33376OooO00o OooO00o(InterfaceC32507OooOO0o<? super C32460OooOooO, C32460OooOooO> interfaceC32507OooOO0o) {
            return new C33376OooO00o();
        }

        @Override // oO0Ooo0O.InterfaceC33394OooOo
        public final void OooO0O0(C33376OooO00o c33376OooO00o, oO000o0.OooO0o scope) throws C32242OooO0O0 {
            AbstractC32247OooO0oO abstractC32247OooO0oO;
            o00O00o0.OooO0O0 oooO0O0;
            C33376OooO00o plugin = c33376OooO00o;
            kotlin.jvm.internal.OooOOO0.OooO0oO(plugin, "plugin");
            kotlin.jvm.internal.OooOOO0.OooO0oO(scope, "scope");
            o00O00o0.OooO0O0 oooO0O02 = new o00O00o0.OooO0O0("ObservableContent", 3);
            C32133OooO0o c32133OooO0o = scope.f114954OooOoOO;
            c32133OooO0o.getClass();
            o00O00o0.OooO0O0 reference = C32133OooO0o.f115209OooO;
            kotlin.jvm.internal.OooOOO0.OooO0oO(reference, "reference");
            if (!c32133OooO0o.OooO0o0(oooO0O02)) {
                int iOooO0OO = c32133OooO0o.OooO0OO(reference);
                if (iOooO0OO == -1) {
                    throw new C32242OooO0O0("Phase " + reference + " was not registered for this pipeline");
                }
                int i = iOooO0OO + 1;
                ArrayList arrayList = c32133OooO0o.f115812OooO00o;
                int iOooOO0O = C34429OooOOo0.OooOO0O(arrayList);
                if (i <= iOooOO0O) {
                    while (true) {
                        Object obj = arrayList.get(i);
                        C32243OooO0OO c32243OooO0OO = obj instanceof C32243OooO0OO ? (C32243OooO0OO) obj : null;
                        if (c32243OooO0OO != null && (abstractC32247OooO0oO = c32243OooO0OO.f115809OooO0O0) != null) {
                            AbstractC32247OooO0oO.OooO00o oooO00o = abstractC32247OooO0oO instanceof AbstractC32247OooO0oO.OooO00o ? (AbstractC32247OooO0oO.OooO00o) abstractC32247OooO0oO : null;
                            if (oooO00o != null && (oooO0O0 = oooO00o.f115818OooO00o) != null && oooO0O0.equals(reference)) {
                                iOooO0OO = i;
                            }
                            if (i == iOooOO0O) {
                                break;
                            } else {
                                i++;
                            }
                        } else {
                            break;
                        }
                    }
                }
                arrayList.add(iOooO0OO + 1, new C32243OooO0OO(oooO0O02, new AbstractC32247OooO0oO.OooO00o(reference)));
            }
            c32133OooO0o.OooO0o(oooO0O02, new C33377OooO0O0(3, null));
            scope.f114957OooOooO.OooO0o(C33199OooO0O0.f120149OooO0oo, new C33378OooO0OO(3, null));
        }

        @Override // oO0Ooo0O.InterfaceC33394OooOo
        public final C34502OooO00o<C33376OooO00o> getKey() {
            return C33376OooO00o.f120676OooO0O0;
        }
    }
}
