package OoooOOo;

import Oooo0oO.o000000O;
import OoooO00.InterfaceC21151OooO0OO;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.C24017OooO0oO;
import oO00ooO.C32460OooOooO;
import oO0O000o.InterfaceC32507OooOO0o;

/* JADX INFO: renamed from: OoooOOo.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21207OooOo0<T> implements InterfaceC21222Oooo0O0, List<T>, RandomAccess, oO0O00.OooO0OO {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public OooO00o f61512OooOo0o;

    /* JADX INFO: renamed from: OoooOOo.OooOo0$OooO00o */
    public static final class OooO00o<T> extends AbstractC21225Oooo0o0 {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public InterfaceC21151OooO0OO<? extends T> f61513OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f61514OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public int f61515OooO0o0;

        public OooO00o(InterfaceC21151OooO0OO<? extends T> interfaceC21151OooO0OO) {
            this.f61513OooO0OO = interfaceC21151OooO0OO;
        }

        @Override // OoooOOo.AbstractC21225Oooo0o0
        public final void OooO00o(AbstractC21225Oooo0o0 abstractC21225Oooo0o0) {
            synchronized (C21209OooOo0O.f61519OooO00o) {
                kotlin.jvm.internal.OooOOO0.OooO0o0(abstractC21225Oooo0o0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord.assign$lambda$0>");
                this.f61513OooO0OO = ((OooO00o) abstractC21225Oooo0o0).f61513OooO0OO;
                this.f61514OooO0Oo = ((OooO00o) abstractC21225Oooo0o0).f61514OooO0Oo;
                this.f61515OooO0o0 = ((OooO00o) abstractC21225Oooo0o0).f61515OooO0o0;
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            }
        }

        @Override // OoooOOo.AbstractC21225Oooo0o0
        public final AbstractC21225Oooo0o0 OooO0O0() {
            return new OooO00o(this.f61513OooO0OO);
        }
    }

    /* JADX INFO: renamed from: OoooOOo.OooOo0$OooO0O0 */
    public static final class OooO0O0 extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<List<T>, Boolean> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ Collection<T> f61516OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ int f61517OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0O0(int i, Collection<? extends T> collection) {
            super(1);
            this.f61517OooOo0o = i;
            this.f61516OooOo = collection;
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(((List) obj).addAll(this.f61517OooOo0o, this.f61516OooOo));
        }
    }

    /* JADX INFO: renamed from: OoooOOo.OooOo0$OooO0OO */
    public static final class OooO0OO extends kotlin.jvm.internal.OooOOOO implements InterfaceC32507OooOO0o<List<T>, Boolean> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ Collection<T> f61518OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public OooO0OO(Collection<? extends T> collection) {
            super(1);
            this.f61518OooOo0o = collection;
        }

        @Override // oO0O000o.InterfaceC32507OooOO0o
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(((List) obj).retainAll(this.f61518OooOo0o));
        }
    }

    public C21207OooOo0() {
        OoooO0.OooOO0 oooOO02 = OoooO0.OooOO0.f61367OooOo;
        OooO00o oooO00o = new OooO00o(oooOO02);
        if (C21200OooOOO0.f61495OooO0O0.OooO0o0() != null) {
            OooO00o oooO00o2 = new OooO00o(oooOO02);
            oooO00o2.f61574OooO00o = 1;
            oooO00o.f61575OooO0O0 = oooO00o2;
        }
        this.f61512OooOo0o = oooO00o;
    }

    public final OooO00o<T> OooO0O0() {
        OooO00o oooO00o = this.f61512OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0o0(oooO00o, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (OooO00o) C21200OooOOO0.OooOo00(oooO00o, this);
    }

    @Override // OoooOOo.InterfaceC21222Oooo0O0
    public final void OooO0Oo(AbstractC21225Oooo0o0 abstractC21225Oooo0o0) {
        abstractC21225Oooo0o0.f61575OooO0O0 = this.f61512OooOo0o;
        this.f61512OooOo0o = (OooO00o) abstractC21225Oooo0o0;
    }

    @Override // OoooOOo.InterfaceC21222Oooo0O0
    public final AbstractC21225Oooo0o0 OooO0o0() {
        return this.f61512OooOo0o;
    }

    public final int OooO0oO() {
        OooO00o oooO00o = this.f61512OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0o0(oooO00o, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((OooO00o) C21200OooOOO0.OooO(oooO00o)).f61515OooO0o0;
    }

    public final boolean OooO0oo(InterfaceC32507OooOO0o<? super List<T>, Boolean> interfaceC32507OooOO0o) {
        int i;
        InterfaceC21151OooO0OO<? extends T> interfaceC21151OooO0OO;
        Boolean boolInvoke;
        AbstractC21194OooO0oO abstractC21194OooO0oOOooOO0O;
        boolean z;
        do {
            Object obj = C21209OooOo0O.f61519OooO00o;
            synchronized (obj) {
                OooO00o oooO00o = this.f61512OooOo0o;
                kotlin.jvm.internal.OooOOO0.OooO0o0(oooO00o, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                OooO00o oooO00o2 = (OooO00o) C21200OooOOO0.OooO(oooO00o);
                i = oooO00o2.f61514OooO0Oo;
                interfaceC21151OooO0OO = oooO00o2.f61513OooO0OO;
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            }
            kotlin.jvm.internal.OooOOO0.OooO0Oo(interfaceC21151OooO0OO);
            OoooO0.OooO0o oooO0oBuilder = interfaceC21151OooO0OO.builder();
            boolInvoke = interfaceC32507OooOO0o.invoke(oooO0oBuilder);
            InterfaceC21151OooO0OO<? extends T> interfaceC21151OooO0OOOooO0o0 = oooO0oBuilder.OooO0o0();
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(interfaceC21151OooO0OOOooO0o0, interfaceC21151OooO0OO)) {
                break;
            }
            OooO00o oooO00o3 = this.f61512OooOo0o;
            kotlin.jvm.internal.OooOOO0.OooO0o0(oooO00o3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (C21200OooOOO0.f61496OooO0OO) {
                abstractC21194OooO0oOOooOO0O = C21200OooOOO0.OooOO0O();
                OooO00o oooO00o4 = (OooO00o) C21200OooOOO0.OooOo0o(oooO00o3, this, abstractC21194OooO0oOOooOO0O);
                synchronized (obj) {
                    int i2 = oooO00o4.f61514OooO0Oo;
                    if (i2 == i) {
                        oooO00o4.f61513OooO0OO = interfaceC21151OooO0OOOooO0o0;
                        oooO00o4.f61514OooO0Oo = i2 + 1;
                        oooO00o4.f61515OooO0o0++;
                        z = true;
                    } else {
                        z = false;
                    }
                }
            }
            C21200OooOOO0.OooOOO(abstractC21194OooO0oOOooOO0O, this);
        } while (!z);
        return boolInvoke.booleanValue();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(T t) {
        int i;
        InterfaceC21151OooO0OO<? extends T> interfaceC21151OooO0OO;
        boolean z;
        AbstractC21194OooO0oO abstractC21194OooO0oOOooOO0O;
        do {
            Object obj = C21209OooOo0O.f61519OooO00o;
            synchronized (obj) {
                OooO00o oooO00o = this.f61512OooOo0o;
                kotlin.jvm.internal.OooOOO0.OooO0o0(oooO00o, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                OooO00o oooO00o2 = (OooO00o) C21200OooOOO0.OooO(oooO00o);
                i = oooO00o2.f61514OooO0Oo;
                interfaceC21151OooO0OO = oooO00o2.f61513OooO0OO;
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            }
            kotlin.jvm.internal.OooOOO0.OooO0Oo(interfaceC21151OooO0OO);
            InterfaceC21151OooO0OO<? extends T> interfaceC21151OooO0OOAdd = interfaceC21151OooO0OO.add(t);
            z = false;
            if (interfaceC21151OooO0OOAdd.equals(interfaceC21151OooO0OO)) {
                return false;
            }
            OooO00o oooO00o3 = this.f61512OooOo0o;
            kotlin.jvm.internal.OooOOO0.OooO0o0(oooO00o3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (C21200OooOOO0.f61496OooO0OO) {
                abstractC21194OooO0oOOooOO0O = C21200OooOOO0.OooOO0O();
                OooO00o oooO00o4 = (OooO00o) C21200OooOOO0.OooOo0o(oooO00o3, this, abstractC21194OooO0oOOooOO0O);
                synchronized (obj) {
                    int i2 = oooO00o4.f61514OooO0Oo;
                    if (i2 == i) {
                        oooO00o4.f61513OooO0OO = interfaceC21151OooO0OOAdd;
                        oooO00o4.f61515OooO0o0++;
                        oooO00o4.f61514OooO0Oo = i2 + 1;
                        z = true;
                    }
                }
            }
            C21200OooOOO0.OooOOO(abstractC21194OooO0oOOooOO0O, this);
        } while (!z);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends T> collection) {
        return OooO0oo(new OooO0O0(i, collection));
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        AbstractC21194OooO0oO abstractC21194OooO0oOOooOO0O;
        OooO00o oooO00o = this.f61512OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0o0(oooO00o, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        synchronized (C21200OooOOO0.f61496OooO0OO) {
            abstractC21194OooO0oOOooOO0O = C21200OooOOO0.OooOO0O();
            OooO00o oooO00o2 = (OooO00o) C21200OooOOO0.OooOo0o(oooO00o, this, abstractC21194OooO0oOOooOO0O);
            synchronized (C21209OooOo0O.f61519OooO00o) {
                oooO00o2.f61513OooO0OO = OoooO0.OooOO0.f61367OooOo;
                oooO00o2.f61514OooO0Oo++;
                oooO00o2.f61515OooO0o0++;
            }
        }
        C21200OooOOO0.OooOOO(abstractC21194OooO0oOOooOO0O, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return OooO0O0().f61513OooO0OO.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        return OooO0O0().f61513OooO0OO.containsAll(collection);
    }

    @Override // java.util.List
    public final T get(int i) {
        return OooO0O0().f61513OooO0OO.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return OooO0O0().f61513OooO0OO.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return OooO0O0().f61513OooO0OO.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return OooO0O0().f61513OooO0OO.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator() {
        return new C21216OooOooO(this, 0);
    }

    @Override // java.util.List
    public final T remove(int i) {
        int i2;
        InterfaceC21151OooO0OO<? extends T> interfaceC21151OooO0OO;
        AbstractC21194OooO0oO abstractC21194OooO0oOOooOO0O;
        boolean z;
        T t = get(i);
        do {
            Object obj = C21209OooOo0O.f61519OooO00o;
            synchronized (obj) {
                OooO00o oooO00o = this.f61512OooOo0o;
                kotlin.jvm.internal.OooOOO0.OooO0o0(oooO00o, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                OooO00o oooO00o2 = (OooO00o) C21200OooOOO0.OooO(oooO00o);
                i2 = oooO00o2.f61514OooO0Oo;
                interfaceC21151OooO0OO = oooO00o2.f61513OooO0OO;
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            }
            kotlin.jvm.internal.OooOOO0.OooO0Oo(interfaceC21151OooO0OO);
            InterfaceC21151OooO0OO<? extends T> interfaceC21151OooO0OORemoveAt = interfaceC21151OooO0OO.removeAt(i);
            if (interfaceC21151OooO0OORemoveAt.equals(interfaceC21151OooO0OO)) {
                break;
            }
            OooO00o oooO00o3 = this.f61512OooOo0o;
            kotlin.jvm.internal.OooOOO0.OooO0o0(oooO00o3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (C21200OooOOO0.f61496OooO0OO) {
                abstractC21194OooO0oOOooOO0O = C21200OooOOO0.OooOO0O();
                OooO00o oooO00o4 = (OooO00o) C21200OooOOO0.OooOo0o(oooO00o3, this, abstractC21194OooO0oOOooOO0O);
                synchronized (obj) {
                    int i3 = oooO00o4.f61514OooO0Oo;
                    if (i3 == i2) {
                        oooO00o4.f61513OooO0OO = interfaceC21151OooO0OORemoveAt;
                        oooO00o4.f61515OooO0o0++;
                        oooO00o4.f61514OooO0Oo = i3 + 1;
                        z = true;
                    } else {
                        z = false;
                    }
                }
            }
            C21200OooOOO0.OooOOO(abstractC21194OooO0oOOooOO0O, this);
        } while (!z);
        return t;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        int i;
        InterfaceC21151OooO0OO<? extends T> interfaceC21151OooO0OO;
        boolean z;
        AbstractC21194OooO0oO abstractC21194OooO0oOOooOO0O;
        do {
            Object obj = C21209OooOo0O.f61519OooO00o;
            synchronized (obj) {
                OooO00o oooO00o = this.f61512OooOo0o;
                kotlin.jvm.internal.OooOOO0.OooO0o0(oooO00o, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                OooO00o oooO00o2 = (OooO00o) C21200OooOOO0.OooO(oooO00o);
                i = oooO00o2.f61514OooO0Oo;
                interfaceC21151OooO0OO = oooO00o2.f61513OooO0OO;
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            }
            kotlin.jvm.internal.OooOOO0.OooO0Oo(interfaceC21151OooO0OO);
            InterfaceC21151OooO0OO<? extends T> interfaceC21151OooO0OORemoveAll = interfaceC21151OooO0OO.removeAll((Collection<? extends Object>) collection);
            z = false;
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(interfaceC21151OooO0OORemoveAll, interfaceC21151OooO0OO)) {
                return false;
            }
            OooO00o oooO00o3 = this.f61512OooOo0o;
            kotlin.jvm.internal.OooOOO0.OooO0o0(oooO00o3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (C21200OooOOO0.f61496OooO0OO) {
                abstractC21194OooO0oOOooOO0O = C21200OooOOO0.OooOO0O();
                OooO00o oooO00o4 = (OooO00o) C21200OooOOO0.OooOo0o(oooO00o3, this, abstractC21194OooO0oOOooOO0O);
                synchronized (obj) {
                    int i2 = oooO00o4.f61514OooO0Oo;
                    if (i2 == i) {
                        oooO00o4.f61513OooO0OO = interfaceC21151OooO0OORemoveAll;
                        oooO00o4.f61515OooO0o0++;
                        oooO00o4.f61514OooO0Oo = i2 + 1;
                        z = true;
                    }
                }
            }
            C21200OooOOO0.OooOOO(abstractC21194OooO0oOOooOO0O, this);
        } while (!z);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        return OooO0oo(new OooO0OO(collection));
    }

    @Override // java.util.List
    public final T set(int i, T t) {
        int i2;
        InterfaceC21151OooO0OO<? extends T> interfaceC21151OooO0OO;
        AbstractC21194OooO0oO abstractC21194OooO0oOOooOO0O;
        boolean z;
        T t2 = get(i);
        do {
            Object obj = C21209OooOo0O.f61519OooO00o;
            synchronized (obj) {
                OooO00o oooO00o = this.f61512OooOo0o;
                kotlin.jvm.internal.OooOOO0.OooO0o0(oooO00o, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                OooO00o oooO00o2 = (OooO00o) C21200OooOOO0.OooO(oooO00o);
                i2 = oooO00o2.f61514OooO0Oo;
                interfaceC21151OooO0OO = oooO00o2.f61513OooO0OO;
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            }
            kotlin.jvm.internal.OooOOO0.OooO0Oo(interfaceC21151OooO0OO);
            InterfaceC21151OooO0OO<? extends T> interfaceC21151OooO0OO2 = interfaceC21151OooO0OO.set(i, t);
            if (interfaceC21151OooO0OO2.equals(interfaceC21151OooO0OO)) {
                break;
            }
            OooO00o oooO00o3 = this.f61512OooOo0o;
            kotlin.jvm.internal.OooOOO0.OooO0o0(oooO00o3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (C21200OooOOO0.f61496OooO0OO) {
                abstractC21194OooO0oOOooOO0O = C21200OooOOO0.OooOO0O();
                OooO00o oooO00o4 = (OooO00o) C21200OooOOO0.OooOo0o(oooO00o3, this, abstractC21194OooO0oOOooOO0O);
                synchronized (obj) {
                    int i3 = oooO00o4.f61514OooO0Oo;
                    if (i3 == i2) {
                        oooO00o4.f61513OooO0OO = interfaceC21151OooO0OO2;
                        oooO00o4.f61514OooO0Oo = i3 + 1;
                        z = true;
                    } else {
                        z = false;
                    }
                }
            }
            C21200OooOOO0.OooOOO(abstractC21194OooO0oOOooOO0O, this);
        } while (!z);
        return t2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return OooO0O0().f61513OooO0OO.size();
    }

    @Override // java.util.List
    public final List<T> subList(int i, int i2) {
        if (i >= 0 && i <= i2 && i2 <= size()) {
            return new C21224Oooo0o(this, i, i2);
        }
        o000000O.OooO0O0("fromIndex or toIndex are out of bounds");
        throw null;
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return C24017OooO0oO.OooO00o(this);
    }

    public final String toString() {
        OooO00o oooO00o = this.f61512OooOo0o;
        kotlin.jvm.internal.OooOOO0.OooO0o0(oooO00o, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return "SnapshotStateList(value=" + ((OooO00o) C21200OooOOO0.OooO(oooO00o)).f61513OooO0OO + ")@" + hashCode();
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        int i;
        InterfaceC21151OooO0OO<? extends T> interfaceC21151OooO0OO;
        boolean z;
        AbstractC21194OooO0oO abstractC21194OooO0oOOooOO0O;
        do {
            Object obj = C21209OooOo0O.f61519OooO00o;
            synchronized (obj) {
                OooO00o oooO00o = this.f61512OooOo0o;
                kotlin.jvm.internal.OooOOO0.OooO0o0(oooO00o, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                OooO00o oooO00o2 = (OooO00o) C21200OooOOO0.OooO(oooO00o);
                i = oooO00o2.f61514OooO0Oo;
                interfaceC21151OooO0OO = oooO00o2.f61513OooO0OO;
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            }
            kotlin.jvm.internal.OooOOO0.OooO0Oo(interfaceC21151OooO0OO);
            InterfaceC21151OooO0OO<? extends T> interfaceC21151OooO0OOAddAll = interfaceC21151OooO0OO.addAll((Collection<? extends Object>) collection);
            z = false;
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(interfaceC21151OooO0OOAddAll, interfaceC21151OooO0OO)) {
                return false;
            }
            OooO00o oooO00o3 = this.f61512OooOo0o;
            kotlin.jvm.internal.OooOOO0.OooO0o0(oooO00o3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (C21200OooOOO0.f61496OooO0OO) {
                abstractC21194OooO0oOOooOO0O = C21200OooOOO0.OooOO0O();
                OooO00o oooO00o4 = (OooO00o) C21200OooOOO0.OooOo0o(oooO00o3, this, abstractC21194OooO0oOOooOO0O);
                synchronized (obj) {
                    int i2 = oooO00o4.f61514OooO0Oo;
                    if (i2 == i) {
                        oooO00o4.f61513OooO0OO = interfaceC21151OooO0OOAddAll;
                        oooO00o4.f61515OooO0o0++;
                        oooO00o4.f61514OooO0Oo = i2 + 1;
                        z = true;
                    }
                }
            }
            C21200OooOOO0.OooOOO(abstractC21194OooO0oOOooOO0O, this);
        } while (!z);
        return true;
    }

    @Override // java.util.List
    public final ListIterator<T> listIterator(int i) {
        return new C21216OooOooO(this, i);
    }

    @Override // java.util.List, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) C24017OooO0oO.OooO0O0(this, tArr);
    }

    @Override // java.util.List
    public final void add(int i, T t) {
        int i2;
        InterfaceC21151OooO0OO<? extends T> interfaceC21151OooO0OO;
        AbstractC21194OooO0oO abstractC21194OooO0oOOooOO0O;
        boolean z;
        do {
            Object obj = C21209OooOo0O.f61519OooO00o;
            synchronized (obj) {
                OooO00o oooO00o = this.f61512OooOo0o;
                kotlin.jvm.internal.OooOOO0.OooO0o0(oooO00o, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                OooO00o oooO00o2 = (OooO00o) C21200OooOOO0.OooO(oooO00o);
                i2 = oooO00o2.f61514OooO0Oo;
                interfaceC21151OooO0OO = oooO00o2.f61513OooO0OO;
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            }
            kotlin.jvm.internal.OooOOO0.OooO0Oo(interfaceC21151OooO0OO);
            InterfaceC21151OooO0OO<? extends T> interfaceC21151OooO0OOAdd = interfaceC21151OooO0OO.add(i, t);
            if (interfaceC21151OooO0OOAdd.equals(interfaceC21151OooO0OO)) {
                return;
            }
            OooO00o oooO00o3 = this.f61512OooOo0o;
            kotlin.jvm.internal.OooOOO0.OooO0o0(oooO00o3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (C21200OooOOO0.f61496OooO0OO) {
                abstractC21194OooO0oOOooOO0O = C21200OooOOO0.OooOO0O();
                OooO00o oooO00o4 = (OooO00o) C21200OooOOO0.OooOo0o(oooO00o3, this, abstractC21194OooO0oOOooOO0O);
                synchronized (obj) {
                    int i3 = oooO00o4.f61514OooO0Oo;
                    if (i3 == i2) {
                        oooO00o4.f61513OooO0OO = interfaceC21151OooO0OOAdd;
                        oooO00o4.f61515OooO0o0++;
                        oooO00o4.f61514OooO0Oo = i3 + 1;
                        z = true;
                    } else {
                        z = false;
                    }
                }
            }
            C21200OooOOO0.OooOOO(abstractC21194OooO0oOOooOO0O, this);
        } while (!z);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        InterfaceC21151OooO0OO<? extends T> interfaceC21151OooO0OO;
        boolean z;
        AbstractC21194OooO0oO abstractC21194OooO0oOOooOO0O;
        do {
            Object obj2 = C21209OooOo0O.f61519OooO00o;
            synchronized (obj2) {
                OooO00o oooO00o = this.f61512OooOo0o;
                kotlin.jvm.internal.OooOOO0.OooO0o0(oooO00o, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                OooO00o oooO00o2 = (OooO00o) C21200OooOOO0.OooO(oooO00o);
                i = oooO00o2.f61514OooO0Oo;
                interfaceC21151OooO0OO = oooO00o2.f61513OooO0OO;
                C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
            }
            kotlin.jvm.internal.OooOOO0.OooO0Oo(interfaceC21151OooO0OO);
            InterfaceC21151OooO0OO<? extends T> interfaceC21151OooO0OORemove = interfaceC21151OooO0OO.remove(obj);
            z = false;
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(interfaceC21151OooO0OORemove, interfaceC21151OooO0OO)) {
                return false;
            }
            OooO00o oooO00o3 = this.f61512OooOo0o;
            kotlin.jvm.internal.OooOOO0.OooO0o0(oooO00o3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            synchronized (C21200OooOOO0.f61496OooO0OO) {
                abstractC21194OooO0oOOooOO0O = C21200OooOOO0.OooOO0O();
                OooO00o oooO00o4 = (OooO00o) C21200OooOOO0.OooOo0o(oooO00o3, this, abstractC21194OooO0oOOooOO0O);
                synchronized (obj2) {
                    int i2 = oooO00o4.f61514OooO0Oo;
                    if (i2 == i) {
                        oooO00o4.f61513OooO0OO = interfaceC21151OooO0OORemove;
                        oooO00o4.f61515OooO0o0++;
                        oooO00o4.f61514OooO0Oo = i2 + 1;
                        z = true;
                    }
                }
            }
            C21200OooOOO0.OooOOO(abstractC21194OooO0oOOooOO0O, this);
        } while (!z);
        return true;
    }
}
