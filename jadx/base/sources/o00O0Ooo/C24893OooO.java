package o00O0Ooo;

import androidx.lifecycle.C21995Oooo0O0;
import androidx.lifecycle.InterfaceC21998Oooo0o0;
import java.util.List;
import o00O0O0o.C24841OooOOo0;
import o00O0OoO.C24880OooOOoo;
import o00oOOo.C25591OooO0O0;

/* JADX INFO: renamed from: o00O0Ooo.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24893OooO implements InterfaceC21998Oooo0o0<Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ C25591OooO0O0 f84497OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f84498OooOo0o = null;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ C24880OooOOoo.OooO00o f84499OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Object f84500OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final /* synthetic */ C21995Oooo0O0 f84501OooOoOO;

    /* JADX INFO: renamed from: o00O0Ooo.OooO$OooO00o */
    public class OooO00o implements Runnable {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Object f84503OooOo0o;

        public OooO00o(Object obj) {
            this.f84503OooOo0o = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            synchronized (C24893OooO.this.f84500OooOoO0) {
                try {
                    List<C24841OooOOo0> listApply = C24893OooO.this.f84499OooOoO.apply(this.f84503OooOo0o);
                    C24893OooO c24893OooO = C24893OooO.this;
                    Object obj = c24893OooO.f84498OooOo0o;
                    if (obj == null && listApply != null) {
                        c24893OooO.f84498OooOo0o = listApply;
                        c24893OooO.f84501OooOoOO.OooO0oo(listApply);
                    } else if (obj != null && !obj.equals(listApply)) {
                        C24893OooO c24893OooO2 = C24893OooO.this;
                        c24893OooO2.f84498OooOo0o = listApply;
                        c24893OooO2.f84501OooOoOO.OooO0oo(listApply);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public C24893OooO(C25591OooO0O0 c25591OooO0O0, Object obj, C24880OooOOoo.OooO00o oooO00o, C21995Oooo0O0 c21995Oooo0O0) {
        this.f84497OooOo = c25591OooO0O0;
        this.f84500OooOoO0 = obj;
        this.f84499OooOoO = oooO00o;
        this.f84501OooOoOO = c21995Oooo0O0;
    }

    @Override // androidx.lifecycle.InterfaceC21998Oooo0o0
    public final void OooO0O0(Object obj) {
        this.f84497OooOo.OooO00o(new OooO00o(obj));
    }
}
