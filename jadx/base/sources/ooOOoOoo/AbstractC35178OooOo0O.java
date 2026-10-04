package ooOOoOoo;

import oO0O000o.InterfaceC32507OooOO0o;
import oO0O0oOo.C32776OooO0o0;
import oO0Oo00.C33194OooO0O0;
import ooOOoOoo.InterfaceC35161OooO0o;

/* JADX INFO: renamed from: ooOOoOoo.OooOo0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC35178OooOo0O implements InterfaceC35161OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final kotlin.jvm.internal.OooOOOO f126283OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f126284OooO0O0;

    /* JADX INFO: renamed from: ooOOoOoo.OooOo0O$OooO00o */
    public static final class OooO00o extends AbstractC35178OooOo0O {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final OooO00o f126285OooO0OO = new OooO00o("Boolean", C35176OooOo0.f126259OooOo0o);
    }

    /* JADX INFO: renamed from: ooOOoOoo.OooOo0O$OooO0O0 */
    public static final class OooO0O0 extends AbstractC35178OooOo0O {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final OooO0O0 f126286OooO0OO = new OooO0O0("Int", C35179OooOo0o.f126288OooOo0o);
    }

    /* JADX INFO: renamed from: ooOOoOoo.OooOo0O$OooO0OO */
    public static final class OooO0OO extends AbstractC35178OooOo0O {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public static final OooO0OO f126287OooO0OO = new OooO0OO("Unit", C35175OooOo.f126258OooOo0o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC35178OooOo0O(String str, InterfaceC32507OooOO0o interfaceC32507OooOO0o) {
        this.f126283OooO00o = (kotlin.jvm.internal.OooOOOO) interfaceC32507OooOO0o;
        this.f126284OooO0O0 = "must return ".concat(str);
    }

    @Override // ooOOoOoo.InterfaceC35161OooO0o
    public final String OooO00o(C32776OooO0o0 c32776OooO0o0) {
        return InterfaceC35161OooO0o.OooO00o.OooO00o(this, c32776OooO0o0);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.internal.OooOOOO, oO0O000o.OooOO0o] */
    @Override // ooOOoOoo.InterfaceC35161OooO0o
    public final boolean OooO0O0(C32776OooO0o0 c32776OooO0o0) {
        return kotlin.jvm.internal.OooOOO0.OooO0O0(c32776OooO0o0.f117441OooOoo, this.f126283OooO00o.invoke(C33194OooO0O0.OooO0o0(c32776OooO0o0)));
    }

    @Override // ooOOoOoo.InterfaceC35161OooO0o
    public final String getDescription() {
        return this.f126284OooO0O0;
    }
}
