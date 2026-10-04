package oO0O0O;

import java.util.Collection;
import kotlin.jvm.internal.C24028OooOoO0;
import kotlin.jvm.internal.C24035Oooo00o;
import kotlin.jvm.internal.Oooo0;
import o00oO0O.C25515Oooo0O0;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O0O0o.OooOOO;
import oO0O0OO.InterfaceC32596OooO0o0;
import oO0O0OO.InterfaceC32615OooOoo;
import oO0O0Oo0.C32672OooOOOo;
import oO0O0Oo0.C32692Oooo0o0;
import oO0Ooo0.C33361OooO0Oo;
import oO0Ooo0.InterfaceC33370OooOO0;
import oO0OooO0.C33476OooO0O0;
import oO0OooO0.C33477OooO0OO;
import oO0OooO0.C33478OooO0Oo;
import oO0OooO0.C33479OooO0o;
import oOo000Oo.C34438OooOoo0;
import oOo000Oo.C34449Oooo0oo;
import oOoo0.InterfaceC34602OooOO0o;
import ooOOOoOo.InterfaceC35102OooO0O0;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO0o implements InterfaceC35102OooO0O0 {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final OooO00o f116838OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final C33477OooO0OO f116839OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC34602OooOO0o<Object>[] f116840OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final C33479OooO0o f116841OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final C33476OooO0O0 f116842OooO0oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C32692Oooo0o0 f116843OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final InterfaceC32507OooOO0o<InterfaceC32615OooOoo, oO0O0OO.OooOO0O> f116844OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final InterfaceC33370OooOO0 f116845OooO0OO;

    public static final class OooO00o {
    }

    static {
        Oooo0 oooo0 = C24035Oooo00o.f80943OooO00o;
        f116840OooO0o0 = new InterfaceC34602OooOO0o[]{oooo0.OooO0oO(new C24028OooOoO0(oooo0.OooO0O0(OooO0o.class), "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"))};
        f116838OooO0Oo = new OooO00o();
        f116839OooO0o = oO0O0O0o.OooOOO.f117143OooOO0O;
        C33478OooO0Oo c33478OooO0Oo = OooOOO.OooO00o.f117152OooO0OO;
        C33479OooO0o c33479OooO0oOooO0o = c33478OooO0Oo.OooO0o();
        kotlin.jvm.internal.OooOOO0.OooO0o(c33479OooO0oOooO0o, "cloneable.shortName()");
        f116841OooO0oO = c33479OooO0oOooO0o;
        f116842OooO0oo = C33476OooO0O0.OooOO0(c33478OooO0Oo.OooO0oO());
    }

    public OooO0o() {
        throw null;
    }

    public OooO0o(C33361OooO0Oo c33361OooO0Oo, C32692Oooo0o0 c32692Oooo0o0) {
        C32522OooO0o0 computeContainingDeclaration = C32522OooO0o0.f116846OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(computeContainingDeclaration, "computeContainingDeclaration");
        this.f116843OooO00o = c32692Oooo0o0;
        this.f116844OooO0O0 = computeContainingDeclaration;
        this.f116845OooO0OO = c33361OooO0Oo.OooO00o(new C32523OooO0oO(this, c33361OooO0Oo));
    }

    @Override // ooOOOoOo.InterfaceC35102OooO0O0
    public final Collection<InterfaceC32596OooO0o0> OooO00o(C33477OooO0OO packageFqName) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(packageFqName, "packageFqName");
        if (!packageFqName.equals(f116839OooO0o)) {
            return C34438OooOoo0.f123458OooOo0o;
        }
        return C34449Oooo0oo.OooOO0((C32672OooOOOo) C25515Oooo0O0.OooO00o(this.f116845OooO0OO, f116840OooO0o0[0]));
    }

    @Override // ooOOOoOo.InterfaceC35102OooO0O0
    public final boolean OooO0O0(C33477OooO0OO packageFqName, C33479OooO0o name) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(packageFqName, "packageFqName");
        kotlin.jvm.internal.OooOOO0.OooO0oO(name, "name");
        return name.equals(f116841OooO0oO) && packageFqName.equals(f116839OooO0o);
    }

    @Override // ooOOOoOo.InterfaceC35102OooO0O0
    public final InterfaceC32596OooO0o0 OooO0OO(C33476OooO0O0 classId) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(classId, "classId");
        if (!classId.equals(f116842OooO0oo)) {
            return null;
        }
        return (C32672OooOOOo) C25515Oooo0O0.OooO00o(this.f116845OooO0OO, f116840OooO0o0[0]);
    }
}
