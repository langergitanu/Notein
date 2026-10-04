package oO0o0oO0;

import androidx.datastore.preferences.protobuf.o000oOoO;
import androidx.fragment.app.C21904OooOoo0;
import com.facebook.soloader.OooOo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooO.InterfaceC32437OooO0o0;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32507OooOO0o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0O000o.InterfaceC32510OooOOo0;
import oO0o0OO.C33614OooOOO0;
import oO0o0OO.InterfaceC33610OooOO0;
import oO0o0OO.InterfaceC33611OooOO0O;
import oO0o0OO.InterfaceC33651OoooOoO;
import oO0o0OO.o000OO;
import oO0o0Ooo.AbstractC33837OooOOoo;
import oO0o0Ooo.C33839OooOo0;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: oO0o0oO0.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C33890OooO0oO<R> implements InterfaceC33610OooOO0, InterfaceC33883OooO, o000OO {

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f122065OooOoo0 = AtomicReferenceFieldUpdater.newUpdater(C33890OooO0oO.class, Object.class, "state$volatile");

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final InterfaceC34415OooO0oo f122067OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public Object f122069OooOoO0;
    private volatile /* synthetic */ Object state$volatile = C33892OooOO0.f122084OooO00o;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public ArrayList f122066OooOo = new ArrayList(2);

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f122068OooOoO = -1;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public Object f122070OooOoOO = C33892OooOO0.f122087OooO0Oo;

    /* JADX INFO: renamed from: oO0o0oO0.OooO0oO$OooO00o */
    public final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Object f122072OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final InterfaceC32510OooOOo0<Object, InterfaceC33883OooO<?>, Object, C32460OooOooO> f122073OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final InterfaceC32510OooOOo0<Object, Object, Object, Object> f122074OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final C33839OooOo0 f122075OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final InterfaceC32510OooOOo0<InterfaceC33883OooO<?>, Object, Object, InterfaceC32510OooOOo0<Throwable, Object, InterfaceC34415OooO0oo, C32460OooOooO>> f122076OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final InterfaceC32437OooO0o0 f122077OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public Object f122078OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f122079OooO0oo = -1;

        public OooO00o(Object obj, InterfaceC32510OooOOo0 interfaceC32510OooOOo0, InterfaceC32510OooOOo0 interfaceC32510OooOOo02, C33839OooOo0 c33839OooOo0, InterfaceC32437OooO0o0 interfaceC32437OooO0o0, InterfaceC32510OooOOo0 interfaceC32510OooOOo03) {
            this.f122072OooO00o = obj;
            this.f122073OooO0O0 = interfaceC32510OooOOo0;
            this.f122074OooO0OO = interfaceC32510OooOOo02;
            this.f122075OooO0Oo = c33839OooOo0;
            this.f122077OooO0o0 = interfaceC32437OooO0o0;
            this.f122076OooO0o = interfaceC32510OooOOo03;
        }

        public final void OooO00o() {
            Object obj = this.f122078OooO0oO;
            if (obj instanceof AbstractC33837OooOOoo) {
                ((AbstractC33837OooOOoo) obj).OooO0oo(this.f122079OooO0oo, C33890OooO0oO.this.f122067OooOo0o);
                return;
            }
            InterfaceC33651OoooOoO interfaceC33651OoooOoO = obj instanceof InterfaceC33651OoooOoO ? (InterfaceC33651OoooOoO) obj : null;
            if (interfaceC33651OoooOoO != null) {
                interfaceC33651OoooOoO.dispose();
            }
        }
    }

    public C33890OooO0oO(InterfaceC34415OooO0oo interfaceC34415OooO0oo) {
        this.f122067OooOo0o = interfaceC34415OooO0oo;
    }

    public final <Q> void OooO(InterfaceC33889OooO0o0<? extends Q> interfaceC33889OooO0o0, InterfaceC32508OooOOOo<? super Q, ? super Continuation<? super R>, ? extends Object> interfaceC32508OooOOOo) {
        OooOO0(new OooO00o(interfaceC33889OooO0o0.OooO0Oo(), interfaceC33889OooO0o0.OooO0OO(), interfaceC33889OooO0o0.OooO0O0(), null, interfaceC32508OooOOOo, interfaceC33889OooO0o0.OooO00o()), false);
    }

    @Override // oO0o0OO.InterfaceC33610OooOO0
    public final void OooO00o(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f122065OooOoo0;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == C33892OooOO0.f122085OooO0O0) {
                return;
            }
            C33839OooOo0 c33839OooOo0 = C33892OooOO0.f122086OooO0OO;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c33839OooOo0)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            ArrayList arrayList = this.f122066OooOo;
            if (arrayList == null) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((OooO00o) it.next()).OooO00o();
            }
            this.f122070OooOoOO = C33892OooOO0.f122087OooO0Oo;
            this.f122066OooOo = null;
            return;
        }
    }

    @Override // oO0o0oO0.InterfaceC33883OooO
    public final void OooO0O0(InterfaceC33651OoooOoO interfaceC33651OoooOoO) {
        this.f122069OooOoO0 = interfaceC33651OoooOoO;
    }

    @Override // oO0o0OO.o000OO
    public final void OooO0OO(AbstractC33837OooOOoo<?> abstractC33837OooOOoo, int i) {
        this.f122069OooOoO0 = abstractC33837OooOOoo;
        this.f122068OooOoO = i;
    }

    @Override // oO0o0oO0.InterfaceC33883OooO
    public final void OooO0Oo(Object obj) {
        this.f122070OooOoOO = obj;
    }

    public final Object OooO0o(AbstractC32479OooO0OO abstractC32479OooO0OO) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f122065OooOoo0;
        Object obj = atomicReferenceFieldUpdater.get(this);
        OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        OooO00o oooO00o = (OooO00o) obj;
        Object obj2 = this.f122070OooOoOO;
        ArrayList<OooO00o> arrayList = this.f122066OooOo;
        if (arrayList != null) {
            for (OooO00o oooO00o2 : arrayList) {
                if (oooO00o2 != oooO00o) {
                    oooO00o2.OooO00o();
                }
            }
            atomicReferenceFieldUpdater.set(this, C33892OooOO0.f122085OooO0O0);
            this.f122070OooOoOO = C33892OooOO0.f122087OooO0Oo;
            this.f122066OooOo = null;
        }
        Object objInvoke = oooO00o.f122074OooO0OO.invoke(oooO00o.f122072OooO00o, oooO00o.f122075OooO0Oo, obj2);
        C33839OooOo0 c33839OooOo0 = C33892OooOO0.f122088OooO0o0;
        InterfaceC32437OooO0o0 interfaceC32437OooO0o0 = oooO00o.f122077OooO0o0;
        return oooO00o.f122075OooO0Oo == c33839OooOo0 ? ((InterfaceC32507OooOO0o) interfaceC32437OooO0o0).invoke(abstractC32479OooO0OO) : ((InterfaceC32508OooOOOo) interfaceC32437OooO0o0).invoke(objInvoke, abstractC32479OooO0OO);
    }

    @Override // oO0o0oO0.InterfaceC33883OooO
    public final boolean OooO0o0(Object obj, Object obj2) {
        return OooOO0O(obj, obj2) == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO0oO(AbstractC32479OooO0OO abstractC32479OooO0OO) throws Throwable {
        C33891OooO0oo c33891OooO0oo;
        C33890OooO0oO<R> c33890OooO0oO;
        if (abstractC32479OooO0OO instanceof C33891OooO0oo) {
            c33891OooO0oo = (C33891OooO0oo) abstractC32479OooO0OO;
            int i = c33891OooO0oo.f122082OooOoO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c33891OooO0oo.f122082OooOoO = i - Integer.MIN_VALUE;
            } else {
                c33891OooO0oo = new C33891OooO0oo(this, abstractC32479OooO0OO);
            }
        }
        Object obj = c33891OooO0oo.f122080OooOo;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i2 = c33891OooO0oo.f122082OooOoO;
        if (i2 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            c33891OooO0oo.f122081OooOo0o = this;
            c33891OooO0oo.f122082OooOoO = 1;
            C33614OooOOO0 c33614OooOOO0 = new C33614OooOOO0(1, C21904OooOoo0.OooO0o0(c33891OooO0oo));
            c33614OooOOO0.OooOOoo();
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f122065OooOoo0;
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                C33839OooOo0 c33839OooOo0 = C33892OooOO0.f122084OooO00o;
                if (obj2 == c33839OooOo0) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c33614OooOOO0)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    c33614OooOOO0.OooOo0O(this);
                    break loop0;
                }
                if (obj2 instanceof List) {
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, c33839OooOo0)) {
                            Iterator it = ((Iterable) obj2).iterator();
                            while (it.hasNext()) {
                                C33890OooO0oO<R>.OooO00o oooO00oOooO0oo = OooO0oo(it.next());
                                OooOOO0.OooO0Oo(oooO00oOooO0oo);
                                oooO00oOooO0oo.f122078OooO0oO = null;
                                oooO00oOooO0oo.f122079OooO0oo = -1;
                                OooOO0(oooO00oOooO0oo, true);
                            }
                        } else if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                } else {
                    if (!(obj2 instanceof OooO00o)) {
                        throw new IllegalStateException(("unexpected state: " + obj2).toString());
                    }
                    C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
                    OooO00o oooO00o = (OooO00o) obj2;
                    Object obj3 = this.f122070OooOoOO;
                    InterfaceC32510OooOOo0<InterfaceC33883OooO<?>, Object, Object, InterfaceC32510OooOOo0<Throwable, Object, InterfaceC34415OooO0oo, C32460OooOooO>> interfaceC32510OooOOo0 = oooO00o.f122076OooO0o;
                    c33614OooOOO0.OooOOOo(c32460OooOooO, interfaceC32510OooOOo0 != null ? interfaceC32510OooOOo0.invoke(this, oooO00o.f122075OooO0Oo, obj3) : null);
                }
            }
            Object objOooOOo = c33614OooOOO0.OooOOo();
            if (objOooOOo != EnumC32485OooO00o.f116726OooOo0o) {
                objOooOOo = C32460OooOooO.f116667OooO00o;
            }
            if (objOooOOo != enumC32485OooO00o) {
                c33890OooO0oO = this;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C32446OooOOOo.OooO0O0(obj);
            return obj;
        }
        c33890OooO0oO = c33891OooO0oo.f122081OooOo0o;
        C32446OooOOOo.OooO0O0(obj);
        c33891OooO0oo.f122081OooOo0o = null;
        c33891OooO0oo.f122082OooOoO = 2;
        Object objOooO0o = c33890OooO0oO.OooO0o(c33891OooO0oo);
        return objOooO0o == enumC32485OooO00o ? enumC32485OooO00o : objOooO0o;
    }

    public final C33890OooO0oO<R>.OooO00o OooO0oo(Object obj) {
        ArrayList arrayList = this.f122066OooOo;
        Object obj2 = null;
        if (arrayList == null) {
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((OooO00o) next).f122072OooO00o == obj) {
                obj2 = next;
                break;
            }
        }
        C33890OooO0oO<R>.OooO00o oooO00o = (OooO00o) obj2;
        if (oooO00o != null) {
            return oooO00o;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    public final void OooOO0(C33890OooO0oO<R>.OooO00o oooO00o, boolean z) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f122065OooOoo0;
        if (atomicReferenceFieldUpdater.get(this) instanceof OooO00o) {
            return;
        }
        Object obj = oooO00o.f122072OooO00o;
        if (!z) {
            ArrayList arrayList = this.f122066OooOo;
            OooOOO0.OooO0Oo(arrayList);
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((OooO00o) it.next()).f122072OooO00o == obj) {
                        throw new IllegalStateException(o000oOoO.OooO00o(obj, "Cannot use select clauses on the same object: ").toString());
                    }
                }
            }
        }
        oooO00o.f122073OooO0O0.invoke(obj, this, oooO00o.f122075OooO0Oo);
        if (this.f122070OooOoOO != C33892OooOO0.f122087OooO0Oo) {
            atomicReferenceFieldUpdater.set(this, oooO00o);
            return;
        }
        if (!z) {
            ArrayList arrayList2 = this.f122066OooOo;
            OooOOO0.OooO0Oo(arrayList2);
            arrayList2.add(oooO00o);
        }
        oooO00o.f122078OooO0oO = this.f122069OooOoO0;
        oooO00o.f122079OooO0oo = this.f122068OooOoO;
        this.f122069OooOoO0 = null;
        this.f122068OooOoO = -1;
    }

    public final int OooOO0O(Object obj, Object obj2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f122065OooOoo0;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof InterfaceC33611OooOO0O)) {
                if (OooOOO0.OooO0O0(obj3, C33892OooOO0.f122085OooO0O0) || (obj3 instanceof OooO00o)) {
                    return 3;
                }
                if (OooOOO0.OooO0O0(obj3, C33892OooOO0.f122086OooO0OO)) {
                    return 2;
                }
                if (OooOOO0.OooO0O0(obj3, C33892OooOO0.f122084OooO00o)) {
                    List listOooO0oO = OooOo.OooO0oO(obj);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, listOooO0oO)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                            break;
                        }
                    }
                    return 1;
                }
                if (!(obj3 instanceof List)) {
                    throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                }
                ArrayList arrayListOooooOo = oOo000Oo.OooOo.OooooOo((Collection) obj3, obj);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, arrayListOooooOo)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        break;
                    }
                }
                return 1;
            }
            C33890OooO0oO<R>.OooO00o oooO00oOooO0oo = OooO0oo(obj);
            if (oooO00oOooO0oo != null) {
                InterfaceC32510OooOOo0<InterfaceC33883OooO<?>, Object, Object, InterfaceC32510OooOOo0<Throwable, Object, InterfaceC34415OooO0oo, C32460OooOooO>> interfaceC32510OooOOo0 = oooO00oOooO0oo.f122076OooO0o;
                InterfaceC32510OooOOo0<Throwable, Object, InterfaceC34415OooO0oo, C32460OooOooO> interfaceC32510OooOOo0Invoke = interfaceC32510OooOOo0 != null ? interfaceC32510OooOOo0.invoke(this, oooO00oOooO0oo.f122075OooO0Oo, obj2) : null;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, oooO00oOooO0oo)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        break;
                    }
                }
                InterfaceC33611OooOO0O interfaceC33611OooOO0O = (InterfaceC33611OooOO0O) obj3;
                this.f122070OooOoOO = obj2;
                C33839OooOo0 c33839OooOo0OooO0O0 = interfaceC33611OooOO0O.OooO0O0(C32460OooOooO.f116667OooO00o, interfaceC32510OooOOo0Invoke);
                if (c33839OooOo0OooO0O0 == null) {
                    this.f122070OooOoOO = C33892OooOO0.f122087OooO0Oo;
                    return 2;
                }
                interfaceC33611OooOO0O.OooOOOO(c33839OooOo0OooO0O0);
                return 0;
            }
            continue;
        }
    }
}
