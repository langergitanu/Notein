package Oooo;

import OooOo.Oooo000;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24017OooO0oO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32484OooO0oo;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0O.AbstractC33570OooOO0;

/* JADX INFO: renamed from: Oooo.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20812OooO0Oo<T> implements Set<T>, oO0O00.OooO00o {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Oooo000<T> f59754OooOo0o;

    /* JADX INFO: renamed from: Oooo.OooO0Oo$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "androidx.compose.runtime.collection.ScatterSetWrapper$iterator$1", m80623f = "ScatterSetWrapper.kt", m80624l = {34}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32484OooO0oo implements InterfaceC32508OooOOOo<AbstractC33570OooOO0<? super T>, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public long[] f59755OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public Object[] f59756OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public int f59757OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public int f59758OooOoO0;

        /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
        public int f59759OooOoOO;

        /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
        public long f59760OooOoo;

        /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
        public int f59761OooOoo0;

        /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
        public int f59762OooOooO;

        /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
        public /* synthetic */ Object f59763OooOooo;

        /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
        public final /* synthetic */ C20812OooO0Oo<T> f59764Oooo000;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(C20812OooO0Oo<T> c20812OooO0Oo, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f59764Oooo000 = c20812OooO0Oo;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f59764Oooo000, continuation);
            oooO00o.f59763OooOooo = obj;
            return oooO00o;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(Object obj, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create((AbstractC33570OooOO0) obj, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0095  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004f -> B:22:0x0093). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0051 -> B:14:0x0062). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006b -> B:19:0x008a). Please report as a decompilation issue!!! */
        @Override // oO00ooo.AbstractC32477OooO00o
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            AbstractC33570OooOO0 abstractC33570OooOO0;
            Object[] objArr;
            long[] jArr;
            int length;
            int i;
            long j;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = this.f59762OooOooO;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj);
                abstractC33570OooOO0 = (AbstractC33570OooOO0) this.f59763OooOooo;
                Oooo000<T> oooo000 = this.f59764Oooo000.f59754OooOo0o;
                objArr = oooo000.f58542OooO0O0;
                jArr = oooo000.f58541OooO00o;
                length = jArr.length - 2;
                if (length >= 0) {
                    i = 0;
                    j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    }
                    if (i != length) {
                    }
                }
                return C32460OooOooO.f116667OooO00o;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i3 = this.f59761OooOoo0;
            int i4 = this.f59759OooOoOO;
            long j2 = this.f59760OooOoo;
            i = this.f59757OooOoO;
            int i5 = this.f59758OooOoO0;
            long[] jArr2 = this.f59755OooOo;
            Object[] objArr2 = this.f59756OooOo0o;
            AbstractC33570OooOO0 abstractC33570OooOO02 = (AbstractC33570OooOO0) this.f59763OooOooo;
            C32446OooOOOo.OooO0O0(obj);
            j2 >>= 8;
            i3++;
            if (i3 < i4) {
                if (i4 == 8) {
                    length = i5;
                    jArr = jArr2;
                    objArr = objArr2;
                    abstractC33570OooOO0 = abstractC33570OooOO02;
                    if (i != length) {
                        i++;
                        j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            abstractC33570OooOO02 = abstractC33570OooOO0;
                            i3 = 0;
                            jArr2 = jArr;
                            i5 = length;
                            i4 = 8 - ((~(i - length)) >>> 31);
                            objArr2 = objArr;
                            j2 = j;
                            if (i3 < i4) {
                                if ((255 & j2) < 128) {
                                    Object obj2 = objArr2[(i << 3) + i3];
                                    this.f59763OooOooo = abstractC33570OooOO02;
                                    this.f59756OooOo0o = objArr2;
                                    this.f59755OooOo = jArr2;
                                    this.f59758OooOoO0 = i5;
                                    this.f59757OooOoO = i;
                                    this.f59760OooOoo = j2;
                                    this.f59759OooOoOO = i4;
                                    this.f59761OooOoo0 = i3;
                                    this.f59762OooOooO = 1;
                                    abstractC33570OooOO02.OooO00o(obj2, this);
                                    EnumC32485OooO00o enumC32485OooO00o2 = EnumC32485OooO00o.f116726OooOo0o;
                                    return enumC32485OooO00o;
                                }
                                j2 >>= 8;
                                i3++;
                                if (i3 < i4) {
                                }
                            }
                        }
                        if (i != length) {
                        }
                    }
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }
    }

    public C20812OooO0Oo(Oooo000<T> oooo000) {
        this.f59754OooOo0o = oooo000;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f59754OooOo0o.OooO00o(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        Collection<? extends Object> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!this.f59754OooOo0o.OooO00o(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f59754OooOo0o.OooO0O0();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return OooO0O0.OooO0O0.OooO0o0(new OooO00o(this, null));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f59754OooOo0o.f58544OooO0Oo;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return C24017OooO0oO.OooO00o(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) C24017OooO0oO.OooO0O0(this, tArr);
    }
}
