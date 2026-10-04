package o0OoO0o;

import androidx.ink.brush.behavior.NodeNative;
import com.orion.penkit.tools.DrawToolFactory;
import java.util.List;
import kotlin.jvm.internal.C24019OooOO0o;
import kotlin.jvm.internal.C24028OooOoO0;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;
import oOoo0.InterfaceC34602OooOO0o;

/* JADX INFO: renamed from: o0OoO0o.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC28656OooOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final List<AbstractC28667OooOoO> f101555OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o000OOoO.OooO0O0 f101556OooO0O0;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final /* synthetic */ InterfaceC34602OooOO0o<Object>[] f101554OooO0Oo = {new C24028OooOoO0(AbstractC28656OooOOO0.class, "nativePointer", "getNativePointer()J", 0)};

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final OooO00o f101553OooO0OO = new OooO00o();

    /* JADX INFO: renamed from: o0OoO0o.OooOOO0$OooO00o */
    public static final class OooO00o {
    }

    /* JADX INFO: renamed from: o0OoO0o.OooOOO0$OooO0O0 */
    public static final /* synthetic */ class OooO0O0 extends C24019OooOO0o implements InterfaceC32507OooOO0o<Long, C32460OooOooO> {
        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final C32460OooOooO invoke(Long l) {
            ((NodeNative) this.receiver).free(l.longValue());
            return C32460OooOooO.f116667OooO00o;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC28656OooOOO0(oO0O000o.OooO00o<Long> nativeAlloc, List<? extends AbstractC28667OooOoO> list) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(nativeAlloc, "nativeAlloc");
        this.f101555OooO00o = list;
        this.f101556OooO0O0 = new o000OOoO.OooO0O0(nativeAlloc, new OooO0O0(1, NodeNative.f65363OooO00o, NodeNative.class, DrawToolFactory.LASSO_TYPE_FREE, "free(J)V", 0));
    }

    public final long OooO00o() {
        return this.f101556OooO0O0.OooO00o(this, f101554OooO0Oo[0]);
    }
}
