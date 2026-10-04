package oO0o0OO;

import androidx.fragment.app.C21904OooOoo0;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Ooo.C33839OooOo0;

/* JADX INFO: renamed from: oO0o0OO.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33604OooO0OO<T> {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f121274OooO0O0 = AtomicIntegerFieldUpdater.newUpdater(C33604OooO0OO.class, "notCompletedCount$volatile");

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final InterfaceC33642Oooo0oo<T>[] f121275OooO00o;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    /* JADX INFO: renamed from: oO0o0OO.OooO0OO$OooO00o */
    public final class OooO00o extends AbstractC33673o0ooOO0 {

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f121276OooOooO = AtomicReferenceFieldUpdater.newUpdater(OooO00o.class, Object.class, "_disposer$volatile");

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public final C33614OooOOO0 f121277OooOoOO;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public InterfaceC33651OoooOoO f121279OooOoo0;
        private volatile /* synthetic */ Object _disposer$volatile;

        public OooO00o(C33614OooOOO0 c33614OooOOO0) {
            this.f121277OooOoOO = c33614OooOOO0;
        }

        @Override // oO0o0OO.AbstractC33673o0ooOO0
        public final boolean OooO() {
            return false;
        }

        @Override // oO0o0OO.AbstractC33673o0ooOO0
        public final void OooOO0(Throwable th) {
            C33614OooOOO0 c33614OooOOO0 = this.f121277OooOoOO;
            if (th != null) {
                c33614OooOOO0.getClass();
                C33839OooOo0 c33839OooOo0Oooo000 = c33614OooOOO0.Oooo000(new C33620OooOo(false, th), null);
                if (c33839OooOo0Oooo000 != null) {
                    c33614OooOOO0.OooOOOO(c33839OooOo0Oooo000);
                    OooO0O0 oooO0O0 = (OooO0O0) f121276OooOooO.get(this);
                    if (oooO0O0 != null) {
                        oooO0O0.OooO0O0();
                        return;
                    }
                    return;
                }
                return;
            }
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C33604OooO0OO.f121274OooO0O0;
            C33604OooO0OO<T> c33604OooO0OO = C33604OooO0OO.this;
            if (atomicIntegerFieldUpdater.decrementAndGet(c33604OooO0OO) == 0) {
                InterfaceC33642Oooo0oo<T>[] interfaceC33642Oooo0ooArr = c33604OooO0OO.f121275OooO00o;
                ArrayList arrayList = new ArrayList(interfaceC33642Oooo0ooArr.length);
                for (InterfaceC33642Oooo0oo<T> interfaceC33642Oooo0oo : interfaceC33642Oooo0ooArr) {
                    arrayList.add(interfaceC33642Oooo0oo.getCompleted());
                }
                c33614OooOOO0.resumeWith(arrayList);
            }
        }
    }

    /* JADX INFO: renamed from: oO0o0OO.OooO0OO$OooO0O0 */
    public final class OooO0O0 implements InterfaceC33610OooOO0 {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final C33604OooO0OO<T>.OooO00o[] f121280OooOo0o;

        public OooO0O0(OooO00o[] oooO00oArr) {
            this.f121280OooOo0o = oooO00oArr;
        }

        @Override // oO0o0OO.InterfaceC33610OooOO0
        public final void OooO00o(Throwable th) {
            OooO0O0();
        }

        public final void OooO0O0() {
            for (C33604OooO0OO<T>.OooO00o oooO00o : this.f121280OooOo0o) {
                InterfaceC33651OoooOoO interfaceC33651OoooOoO = oooO00o.f121279OooOoo0;
                if (interfaceC33651OoooOoO == null) {
                    kotlin.jvm.internal.OooOOO0.OooOOOO("handle");
                    throw null;
                }
                interfaceC33651OoooOoO.dispose();
            }
        }

        public final String toString() {
            return "DisposeHandlersOnCancel[" + this.f121280OooOo0o + ']';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C33604OooO0OO(InterfaceC33642Oooo0oo<? extends T>[] interfaceC33642Oooo0ooArr) {
        this.f121275OooO00o = interfaceC33642Oooo0ooArr;
        this.notCompletedCount$volatile = interfaceC33642Oooo0ooArr.length;
    }

    public final Object OooO00o(AbstractC32476OooO abstractC32476OooO) throws Throwable {
        C33614OooOOO0 c33614OooOOO0 = new C33614OooOOO0(1, C21904OooOoo0.OooO0o0(abstractC32476OooO));
        c33614OooOOO0.OooOOoo();
        InterfaceC33642Oooo0oo<T>[] interfaceC33642Oooo0ooArr = this.f121275OooO00o;
        int length = interfaceC33642Oooo0ooArr.length;
        OooO00o[] oooO00oArr = new OooO00o[length];
        for (int i = 0; i < length; i++) {
            InterfaceC33642Oooo0oo<T> interfaceC33642Oooo0oo = interfaceC33642Oooo0ooArr[i];
            interfaceC33642Oooo0oo.start();
            OooO00o oooO00o = new OooO00o(c33614OooOOO0);
            oooO00o.f121279OooOoo0 = oO00o00.OooO0OO.OooO0o0(interfaceC33642Oooo0oo, oooO00o);
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            oooO00oArr[i] = oooO00o;
        }
        OooO0O0 oooO0O0 = new OooO0O0(oooO00oArr);
        for (int i2 = 0; i2 < length; i2++) {
            OooO00o oooO00o2 = oooO00oArr[i2];
            oooO00o2.getClass();
            OooO00o.f121276OooOooO.set(oooO00o2, oooO0O0);
        }
        if (C33614OooOOO0.f121295OooOoo.get(c33614OooOOO0) instanceof o000000O) {
            c33614OooOOO0.OooOo0O(oooO0O0);
        } else {
            oooO0O0.OooO0O0();
        }
        Object objOooOOo = c33614OooOOO0.OooOOo();
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        return objOooOOo;
    }
}
