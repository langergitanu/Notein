package OooOoo;

import OooOoo0.o00000O;
import OooOoo0.o00000OO;
import Oooo0oO.C21105o000OoO;
import Oooo0oO.o000O0O0;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33633Oooo0;

/* JADX INFO: renamed from: OooOoo.OooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20598OooOO0 implements InterfaceC20643OoooooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final kotlin.jvm.internal.OooOOOO f58909OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f58910OooO0O0 = new OooO00o();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final o00000OO f58911OooO0OO = new o00000OO();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f58912OooO0Oo = C21105o000OoO.OooO0OO(Boolean.FALSE, o000O0O0.f61218OooO00o);

    /* JADX INFO: renamed from: OooOoo.OooOO0$OooO00o */
    public static final class OooO00o implements InterfaceC20633OoooOo0 {
        public OooO00o() {
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.internal.OooOOOO, oO0O000o.OooOO0o] */
        @Override // OooOoo.InterfaceC20633OoooOo0
        public final float OooO00o(float f) {
            return ((Number) C20598OooOO0.this.f58909OooO00o.invoke(Float.valueOf(f))).floatValue();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C20598OooOO0(InterfaceC32507OooOO0o<? super Float, Float> interfaceC32507OooOO0o) {
        this.f58909OooO00o = (kotlin.jvm.internal.OooOOOO) interfaceC32507OooOO0o;
    }

    @Override // OooOoo.InterfaceC20643OoooooO
    public final Object OooO00o(o00000O o00000o, InterfaceC32508OooOOOo interfaceC32508OooOOOo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        Object objOooO0o0 = C33633Oooo0.OooO0o0(new C20589OooO(this, o00000o, interfaceC32508OooOOOo, null), abstractC32479OooO0OO);
        return objOooO0o0 == EnumC32485OooO00o.f116726OooOo0o ? objOooO0o0 : C32460OooOooO.f116667OooO00o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // OooOoo.InterfaceC20643OoooooO
    public final boolean OooO0O0() {
        return ((Boolean) this.f58912OooO0Oo.getValue()).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.internal.OooOOOO, oO0O000o.OooOO0o] */
    @Override // OooOoo.InterfaceC20643OoooooO
    public final float OooO0Oo(float f) {
        return ((Number) this.f58909OooO00o.invoke(Float.valueOf(f))).floatValue();
    }
}
