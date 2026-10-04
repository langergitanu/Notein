package oO0OoOO;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C24028OooOoO0;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.Oooo0;
import o00oO0O.C25515Oooo0O0;
import oO0Ooo0.C33361OooO0Oo;
import oO0Ooo0.InterfaceC33370OooOO0;
import oO0OooO0.C33477OooO0OO;
import oOo0oooO.InterfaceC34588OooO0oO;
import oOoo0.InterfaceC34602OooOO0o;

/* JADX INFO: renamed from: oO0OoOO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C33260OooO00o implements InterfaceC34588OooO0oO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC34602OooOO0o<Object>[] f120391OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InterfaceC33370OooOO0 f120392OooOo0o;

    static {
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        f120391OooOo = new InterfaceC34602OooOO0o[]{oooo0.OooO0oO(new C24028OooOoO0(oooo0.OooO0O0(C33260OooO00o.class), "annotations", "getAnnotations()Ljava/util/List;"))};
    }

    public C33260OooO00o(C33361OooO0Oo storageManager, oO0O000o.OooO00o oooO00o) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(storageManager, "storageManager");
        this.f120392OooOo0o = storageManager.OooO00o(oooO00o);
    }

    @Override // oOo0oooO.InterfaceC34588OooO0oO
    public final oOo0oooO.OooO0OO OooOOO0(C33477OooO0OO c33477OooO0OO) {
        return InterfaceC34588OooO0oO.OooO0O0.OooO00o(this, c33477OooO0OO);
    }

    @Override // oOo0oooO.InterfaceC34588OooO0oO
    public final boolean Oooo000(C33477OooO0OO c33477OooO0OO) {
        return InterfaceC34588OooO0oO.OooO0O0.OooO0O0(this, c33477OooO0OO);
    }

    @Override // oOo0oooO.InterfaceC34588OooO0oO
    public boolean isEmpty() {
        return ((List) C25515Oooo0O0.OooO00o(this.f120392OooOo0o, f120391OooOo[0])).isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator<oOo0oooO.OooO0OO> iterator() {
        return ((List) C25515Oooo0O0.OooO00o(this.f120392OooOo0o, f120391OooOo[0])).iterator();
    }
}
