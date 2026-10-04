package androidx.ink.geometry;

import com.orion.penkit.tools.DrawToolFactory;
import kotlin.jvm.internal.C24019OooOO0o;
import kotlin.jvm.internal.C24028OooOoO0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oOoo0.InterfaceC34602OooOO0o;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000OOoO.OooO0O0 f65420OooO00o;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC34602OooOO0o<Object>[] f65419OooO0OO = {new C24028OooOoO0(OooOOO.class, "nativePointer", "getNativePointer()J", 0)};

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final OooO00o f65418OooO0O0 = new OooO00o();

    public static final class OooO00o {
    }

    public static final /* synthetic */ class OooO0O0 extends C24019OooOO0o implements InterfaceC32507OooOO0o<Long, C32460OooOooO> {
        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C32460OooOooO invoke(Long l) {
            ((MeshFormatNative) this.receiver).free(l.longValue());
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public OooOOO() {
        throw null;
    }

    public OooOOO(oO0O000o.OooO00o oooO00o) {
        this.f65420OooO00o = new o000OOoO.OooO0O0(oooO00o, new OooO0O0(1, MeshFormatNative.f65387OooO00o, MeshFormatNative.class, DrawToolFactory.LASSO_TYPE_FREE, "free(J)V", 0));
    }

    public final long OooO00o() {
        return this.f65420OooO00o.OooO00o(this, f65419OooO0OO[0]);
    }
}
