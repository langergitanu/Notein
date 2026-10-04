package o0Oo0oo;

import java.util.concurrent.atomic.AtomicInteger;
import o00O0oOo.AbstractC24958OooOO0o;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: o0Oo0oo.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C28391OooOOO0 extends AbstractC24958OooOO0o implements InterfaceC28389OooOO0o {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final AtomicInteger f100647OooOoO = new AtomicInteger(0);

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final C28387OooOO0 f100648OooOoO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28391OooOOO0(InterfaceC32507OooOO0o properties, InterfaceC32507OooOO0o inspectorInfo, boolean z) {
        super(inspectorInfo);
        kotlin.jvm.internal.OooOOO0.OooO0oO(properties, "properties");
        kotlin.jvm.internal.OooOOO0.OooO0oO(inspectorInfo, "inspectorInfo");
        C28387OooOO0 c28387OooOO0 = new C28387OooOO0();
        c28387OooOO0.f100642OooOo = z;
        c28387OooOO0.f100644OooOoO0 = false;
        properties.invoke(c28387OooOO0);
        this.f100648OooOoO0 = c28387OooOO0;
    }

    @Override // o0Oo0oo.InterfaceC28389OooOO0o
    public final C28387OooOO0 OooOoO() {
        return this.f100648OooOoO0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C28391OooOOO0) {
            return kotlin.jvm.internal.OooOOO0.OooO0O0(this.f100648OooOoO0, ((C28391OooOOO0) obj).f100648OooOoO0);
        }
        return false;
    }

    public final int hashCode() {
        return this.f100648OooOoO0.hashCode();
    }
}
