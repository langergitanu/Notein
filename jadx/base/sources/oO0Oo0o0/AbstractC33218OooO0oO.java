package oO0Oo0o0;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C24028OooOoO0;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.Oooo0;
import o00oO0O.C25515Oooo0O0;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O0OO.InterfaceC32609OooOo0;
import oO0O0OO.InterfaceC32627Oooo0oo;
import oO0O0OO.InterfaceC32632OoooOO0;
import oO0O0Oo0.AbstractC32667OooO0Oo;
import oO0Ooo0.C33361OooO0Oo;
import oO0Ooo0.InterfaceC33370OooOO0;
import oO0OooO0.C33479OooO0o;
import oO0o0O0.C33557OooO0OO;
import oOo000Oo.C34434OooOoO;
import oOoo0.InterfaceC34602OooOO0o;

/* JADX INFO: renamed from: oO0Oo0o0.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC33218OooO0oO extends OooOO0O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC34602OooOO0o<Object>[] f120214OooO0Oo;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final AbstractC32667OooO0Oo f120215OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC33370OooOO0 f120216OooO0OO;

    static {
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        f120214OooO0Oo = new InterfaceC34602OooOO0o[]{oooo0.OooO0oO(new C24028OooOoO0(oooo0.OooO0O0(AbstractC33218OooO0oO.class), "allDescriptors", "getAllDescriptors()Ljava/util/List;"))};
    }

    public AbstractC33218OooO0oO(C33361OooO0Oo c33361OooO0Oo, AbstractC32667OooO0Oo abstractC32667OooO0Oo) {
        this.f120215OooO0O0 = abstractC32667OooO0Oo;
        this.f120216OooO0OO = c33361OooO0Oo.OooO00o(new C33217OooO0o0(this));
    }

    @Override // oO0Oo0o0.OooOO0O, oO0Oo0o0.OooOO0
    public final Collection OooO0O0(C33479OooO0o name, oOo0o0oO.OooO0O0 oooO0O0) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        List list = (List) C25515Oooo0O0.OooO00o(this.f120216OooO0OO, f120214OooO0Oo[0]);
        C33557OooO0OO c33557OooO0OO = new C33557OooO0OO();
        for (Object obj : list) {
            if ((obj instanceof InterfaceC32627Oooo0oo) && kotlin.jvm.internal.OooOOO0.OooO0O0(((InterfaceC32627Oooo0oo) obj).getName(), name)) {
                c33557OooO0OO.add(obj);
            }
        }
        return c33557OooO0OO;
    }

    @Override // oO0Oo0o0.OooOO0O, oO0Oo0o0.OooOO0
    public final Collection<InterfaceC32632OoooOO0> OooO0o(C33479OooO0o name, oOo0o0oO.OooO0O0 oooO0O0) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        List list = (List) C25515Oooo0O0.OooO00o(this.f120216OooO0OO, f120214OooO0Oo[0]);
        C33557OooO0OO c33557OooO0OO = new C33557OooO0OO();
        for (Object obj : list) {
            if ((obj instanceof InterfaceC32632OoooOO0) && kotlin.jvm.internal.OooOOO0.OooO0O0(((InterfaceC32632OoooOO0) obj).getName(), name)) {
                c33557OooO0OO.add(obj);
            }
        }
        return c33557OooO0OO;
    }

    @Override // oO0Oo0o0.OooOO0O, oO0Oo0o0.OooOOO0
    public final Collection<oO0O0OO.OooOO0O> OooO0o0(C33216OooO0Oo kindFilter, InterfaceC32507OooOO0o<? super C33479OooO0o, Boolean> nameFilter) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(kindFilter, "kindFilter");
        kotlin.jvm.internal.OooOOO0.OooO0oO(nameFilter, "nameFilter");
        if (!kindFilter.OooO00o(C33216OooO0Oo.f120200OooOOO.f120208OooO0O0)) {
            return C34434OooOoO.f123453OooOo0o;
        }
        return (List) C25515Oooo0O0.OooO00o(this.f120216OooO0OO, f120214OooO0Oo[0]);
    }

    public abstract List<InterfaceC32609OooOo0> OooO0oo();
}
