package o00oO0O;

import OooooO0.C21289OooO0o;
import OooooO0.C21290OooO0o0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oOo000Oo.C34444Oooo0O0;
import oo000o.AbstractC34622OooO00o;
import oo000o.AbstractC34655Oooo0o;
import oo000o.C34623OooO0O0;
import oo000o.C34629OooO0oo;

/* JADX INFO: renamed from: o00oO0O.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC25483OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AbstractC34655Oooo0o f86855OooO00o;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f86857OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f86858OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public InterfaceC25484OooO0O0 f86859OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f86860OooO0o0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f86856OooO0O0 = true;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final HashMap f86861OooO0oO = new HashMap();

    /* JADX INFO: renamed from: o00oO0O.OooO00o$OooO00o, reason: collision with other inner class name */
    public final class C19708OooO00o extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<InterfaceC25484OooO0O0, C32460OooOooO> {
        public C19708OooO00o() {
            super(1);
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [o00oO0O.OooO0O0, oo000o.Oooo0o] */
        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C32460OooOooO invoke(InterfaceC25484OooO0O0 interfaceC25484OooO0O0) {
            AbstractC25483OooO00o abstractC25483OooO00o;
            InterfaceC25484OooO0O0 childOwner = interfaceC25484OooO0O0;
            kotlin.jvm.internal.OooOOO0.OooO0oO(childOwner, "childOwner");
            if (childOwner.Oooo000()) {
                if (childOwner.OooO0O0().f86856OooO0O0) {
                    childOwner.OooOoO();
                }
                Iterator it = childOwner.OooO0O0().f86861OooO0oO.entrySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    abstractC25483OooO00o = AbstractC25483OooO00o.this;
                    if (!zHasNext) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    AbstractC25483OooO00o.OooO00o(abstractC25483OooO00o, (AbstractC34622OooO00o) entry.getKey(), ((Number) entry.getValue()).intValue(), childOwner.Oooo0o());
                }
                AbstractC25521OoooO abstractC25521OoooO = childOwner.Oooo0o().f87053OooOooo;
                kotlin.jvm.internal.OooOOO0.OooO0Oo(abstractC25521OoooO);
                while (!abstractC25521OoooO.equals(abstractC25483OooO00o.f86855OooO00o.Oooo0o())) {
                    for (AbstractC34622OooO00o abstractC34622OooO00o : abstractC25483OooO00o.OooO0OO(abstractC25521OoooO).keySet()) {
                        AbstractC25483OooO00o.OooO00o(abstractC25483OooO00o, abstractC34622OooO00o, abstractC25483OooO00o.OooO0Oo(abstractC25521OoooO, abstractC34622OooO00o), abstractC25521OoooO);
                    }
                    abstractC25521OoooO = abstractC25521OoooO.f87053OooOooo;
                    kotlin.jvm.internal.OooOOO0.OooO0Oo(abstractC25521OoooO);
                }
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC25483OooO00o(InterfaceC25484OooO0O0 interfaceC25484OooO0O0) {
        this.f86855OooO00o = (AbstractC34655Oooo0o) interfaceC25484OooO0O0;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [kotlin.jvm.internal.OooOO0o, oO0O000o.OooOOOo] */
    /* JADX WARN: Type inference failed for: r4v2, types: [o00oO0O.OooO0O0, oo000o.Oooo0o] */
    public static final void OooO00o(AbstractC25483OooO00o abstractC25483OooO00o, AbstractC34622OooO00o abstractC34622OooO00o, int i, AbstractC25521OoooO abstractC25521OoooO) {
        abstractC25483OooO00o.getClass();
        float f = i;
        long jOooO00o = C21289OooO0o.OooO00o(f, f);
        while (true) {
            jOooO00o = abstractC25483OooO00o.OooO0O0(abstractC25521OoooO, jOooO00o);
            abstractC25521OoooO = abstractC25521OoooO.f87053OooOooo;
            kotlin.jvm.internal.OooOOO0.OooO0Oo(abstractC25521OoooO);
            if (abstractC25521OoooO.equals(abstractC25483OooO00o.f86855OooO00o.Oooo0o())) {
                break;
            } else if (abstractC25483OooO00o.OooO0OO(abstractC25521OoooO).containsKey(abstractC34622OooO00o)) {
                float fOooO0Oo = abstractC25483OooO00o.OooO0Oo(abstractC25521OoooO, abstractC34622OooO00o);
                jOooO00o = C21289OooO0o.OooO00o(fOooO0Oo, fOooO0Oo);
            }
        }
        int iOooO0O0 = abstractC34622OooO00o instanceof C34629OooO0oo ? oO0O00O.OooO00o.OooO0O0(C21290OooO0o0.OooO0Oo(jOooO00o)) : oO0O00O.OooO00o.OooO0O0(C21290OooO0o0.OooO0OO(jOooO00o));
        HashMap map = abstractC25483OooO00o.f86861OooO0oO;
        if (map.containsKey(abstractC34622OooO00o)) {
            int iIntValue = ((Number) C34444Oooo0O0.OooO0oO(abstractC34622OooO00o, map)).intValue();
            C34629OooO0oo c34629OooO0oo = C34623OooO0O0.f124801OooO00o;
            kotlin.jvm.internal.OooOOO0.OooO0oO(abstractC34622OooO00o, "<this>");
            iOooO0O0 = ((Number) abstractC34622OooO00o.f124800OooO00o.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iOooO0O0))).intValue();
        }
        map.put(abstractC34622OooO00o, Integer.valueOf(iOooO0O0));
    }

    public abstract long OooO0O0(AbstractC25521OoooO abstractC25521OoooO, long j);

    public abstract Map<AbstractC34622OooO00o, Integer> OooO0OO(AbstractC25521OoooO abstractC25521OoooO);

    public abstract int OooO0Oo(AbstractC25521OoooO abstractC25521OoooO, AbstractC34622OooO00o abstractC34622OooO00o);

    public final boolean OooO0o() {
        OooO0oo();
        return this.f86859OooO0o != null;
    }

    public final boolean OooO0o0() {
        return this.f86857OooO0OO || this.f86858OooO0Oo || this.f86860OooO0o0;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [o00oO0O.OooO0O0, oo000o.Oooo0o] */
    public final void OooO0oO() {
        this.f86856OooO0O0 = true;
        ?? r0 = this.f86855OooO00o;
        InterfaceC25484OooO0O0 interfaceC25484OooO0O0OooOo0o = r0.OooOo0o();
        if (interfaceC25484OooO0O0OooOo0o == null) {
            return;
        }
        if (this.f86857OooO0OO) {
            interfaceC25484OooO0O0OooOo0o.requestLayout();
        }
        if (this.f86858OooO0Oo) {
            r0.OooOOo();
        }
        if (this.f86860OooO0o0) {
            interfaceC25484OooO0O0OooOo0o.requestLayout();
        }
        interfaceC25484OooO0O0OooOo0o.OooO0O0().OooO0oO();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /* JADX WARN: Type inference failed for: r1v0, types: [o00oO0O.OooO0O0, oo000o.Oooo0o] */
    /* JADX WARN: Type inference failed for: r1v1, types: [o00oO0O.OooO0O0] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void OooO0oo() {
        AbstractC25483OooO00o abstractC25483OooO00oOooO0O0;
        AbstractC25483OooO00o abstractC25483OooO00oOooO0O02;
        boolean zOooO0o0 = OooO0o0();
        ?? r1 = this.f86855OooO00o;
        ?? r12 = r1;
        if (!zOooO0o0) {
            InterfaceC25484OooO0O0 interfaceC25484OooO0O0OooOo0o = r1.OooOo0o();
            if (interfaceC25484OooO0O0OooOo0o == null) {
                return;
            }
            InterfaceC25484OooO0O0 interfaceC25484OooO0O0 = interfaceC25484OooO0O0OooOo0o.OooO0O0().f86859OooO0o;
            if (interfaceC25484OooO0O0 != null) {
                boolean zOooO0o02 = interfaceC25484OooO0O0.OooO0O0().OooO0o0();
                r12 = interfaceC25484OooO0O0;
                if (!zOooO0o02) {
                    InterfaceC25484OooO0O0 interfaceC25484OooO0O02 = this.f86859OooO0o;
                    if (interfaceC25484OooO0O02 == null || interfaceC25484OooO0O02.OooO0O0().OooO0o0()) {
                        return;
                    }
                    InterfaceC25484OooO0O0 interfaceC25484OooO0O0OooOo0o2 = interfaceC25484OooO0O02.OooOo0o();
                    if (interfaceC25484OooO0O0OooOo0o2 != null && (abstractC25483OooO00oOooO0O02 = interfaceC25484OooO0O0OooOo0o2.OooO0O0()) != null) {
                        abstractC25483OooO00oOooO0O02.OooO0oo();
                    }
                    InterfaceC25484OooO0O0 interfaceC25484OooO0O0OooOo0o3 = interfaceC25484OooO0O02.OooOo0o();
                    r12 = (interfaceC25484OooO0O0OooOo0o3 == null || (abstractC25483OooO00oOooO0O0 = interfaceC25484OooO0O0OooOo0o3.OooO0O0()) == null) ? 0 : abstractC25483OooO00oOooO0O0.f86859OooO0o;
                }
            }
        }
        this.f86859OooO0o = r12;
    }
}
