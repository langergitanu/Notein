package oO0Oo0o0;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C24028OooOoO0;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.Oooo0;
import o00oO0O.C25515Oooo0O0;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O0OO.InterfaceC32598OooO0oo;
import oO0O0OO.InterfaceC32627Oooo0oo;
import oO0O0OO.InterfaceC32632OoooOO0;
import oO0OoOO.C33263OooO0Oo;
import oO0Ooo0.C33361OooO0Oo;
import oO0Ooo0.InterfaceC33370OooOO0;
import oO0OooO0.C33479OooO0o;
import oO0o0O0.C33557OooO0OO;
import oOo000Oo.OooOo;
import oOoo0.InterfaceC34602OooOO0o;

/* JADX INFO: renamed from: oO0Oo0o0.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33221OooOOOo extends OooOO0O {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC34602OooOO0o<Object>[] f120225OooO0o0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final C33263OooO0Oo f120226OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC33370OooOO0 f120227OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final InterfaceC33370OooOO0 f120228OooO0Oo;

    static {
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        f120225OooO0o0 = new InterfaceC34602OooOO0o[]{oooo0.OooO0oO(new C24028OooOoO0(oooo0.OooO0O0(C33221OooOOOo.class), "functions", "getFunctions()Ljava/util/List;")), oooo0.OooO0oO(new C24028OooOoO0(oooo0.OooO0O0(C33221OooOOOo.class), "properties", "getProperties()Ljava/util/List;"))};
    }

    public C33221OooOOOo(C33361OooO0Oo storageManager, C33263OooO0Oo c33263OooO0Oo) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(storageManager, "storageManager");
        this.f120226OooO0O0 = c33263OooO0Oo;
        this.f120227OooO0OO = storageManager.OooO00o(new OooOOO(this));
        this.f120228OooO0Oo = storageManager.OooO00o(new OooOOOO(this));
    }

    @Override // oO0Oo0o0.OooOO0O, oO0Oo0o0.OooOO0
    public final Collection OooO0O0(C33479OooO0o name, oOo0o0oO.OooO0O0 oooO0O0) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        List list = (List) C25515Oooo0O0.OooO00o(this.f120228OooO0Oo, f120225OooO0o0[1]);
        C33557OooO0OO c33557OooO0OO = new C33557OooO0OO();
        for (Object obj : list) {
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(((InterfaceC32627Oooo0oo) obj).getName(), name)) {
                c33557OooO0OO.add(obj);
            }
        }
        return c33557OooO0OO;
    }

    @Override // oO0Oo0o0.OooOO0O, oO0Oo0o0.OooOO0
    public final Collection OooO0o(C33479OooO0o name, oOo0o0oO.OooO0O0 oooO0O0) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        List list = (List) C25515Oooo0O0.OooO00o(this.f120227OooO0OO, f120225OooO0o0[0]);
        C33557OooO0OO c33557OooO0OO = new C33557OooO0OO();
        for (Object obj : list) {
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(((InterfaceC32632OoooOO0) obj).getName(), name)) {
                c33557OooO0OO.add(obj);
            }
        }
        return c33557OooO0OO;
    }

    @Override // oO0Oo0o0.OooOO0O, oO0Oo0o0.OooOOO0
    public final Collection OooO0o0(C33216OooO0Oo kindFilter, InterfaceC32507OooOO0o nameFilter) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(kindFilter, "kindFilter");
        kotlin.jvm.internal.OooOOO0.OooO0oO(nameFilter, "nameFilter");
        InterfaceC34602OooOO0o<Object>[] interfaceC34602OooOO0oArr = f120225OooO0o0;
        return OooOo.OooooOO((List) C25515Oooo0O0.OooO00o(this.f120227OooO0OO, interfaceC34602OooOO0oArr[0]), (List) C25515Oooo0O0.OooO00o(this.f120228OooO0Oo, interfaceC34602OooOO0oArr[1]));
    }

    @Override // oO0Oo0o0.OooOO0O, oO0Oo0o0.OooOOO0
    public final InterfaceC32598OooO0oo OooO0oO(C33479OooO0o name, oOo0o0oO.OooO0O0 location) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        kotlin.jvm.internal.OooOOO0.OooO0oO(location, "location");
        return null;
    }
}
