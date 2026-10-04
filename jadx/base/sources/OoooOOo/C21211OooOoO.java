package OoooOOo;

import Oooo0oO.C21038OooOo;
import com.google.common.net.HttpHeaders;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import oO00O0o.C32181OooOOOo;
import oO00O0o0.C32190OooOOo0;
import oO00Oo0.C32269OooO0oo;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32508OooOOOo;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: OoooOOo.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21211OooOoO extends kotlin.jvm.internal.OooOOOO implements InterfaceC32508OooOOOo {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ Object f61526OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ int f61527OooOo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21211OooOoO(Object obj, int i) {
        super(2);
        this.f61527OooOo0o = i;
        this.f61526OooOo = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(Object obj, Object obj2) throws C32269OooO0oo {
        List listOooooOO;
        Object obj3 = this.f61526OooOo;
        switch (this.f61527OooOo0o) {
            case 0:
                Set set = (Set) obj;
                while (true) {
                    C21212OooOoO0 c21212OooOoO0 = (C21212OooOoO0) obj3;
                    AtomicReference<Object> atomicReference = c21212OooOoO0.f61530OooO0O0;
                    Object obj4 = atomicReference.get();
                    if (obj4 == null) {
                        listOooooOO = set;
                    } else if (obj4 instanceof Set) {
                        listOooooOO = C34429OooOOo0.OooOO0o(obj4, set);
                    } else {
                        if (!(obj4 instanceof List)) {
                            C21038OooOo.OooO0Oo("Unexpected notification");
                            throw null;
                        }
                        listOooooOO = oOo000Oo.OooOo.OooooOO((Collection) obj4, com.facebook.soloader.OooOo.OooO0oO(set));
                    }
                    while (!atomicReference.compareAndSet(obj4, listOooooOO)) {
                        if (atomicReference.get() != obj4) {
                        }
                        break;
                    }
                    if (C21212OooOoO0.OooO00o(c21212OooOoO0)) {
                        c21212OooOoO0.f61529OooO00o.invoke(new C21215OooOoo0(c21212OooOoO0));
                    }
                    return C32460OooOooO.f116667OooO00o;
                }
                break;
            default:
                String key = (String) obj;
                String value = (String) obj2;
                kotlin.jvm.internal.OooOOO0.OooO0oO(key, "key");
                kotlin.jvm.internal.OooOOO0.OooO0oO(value, "value");
                List<String> list = C32190OooOOo0.f115537OooO00o;
                if (!key.equals("Content-Length") && !key.equals(HttpHeaders.EXPECT)) {
                    ((C32181OooOOOo) obj3).OooO00o(key, value);
                }
                return C32460OooOooO.f116667OooO00o;
        }
    }
}
