package oOo000Oo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32484OooO0oo;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0O0O.AbstractC33570OooOO0;

/* JADX INFO: renamed from: oOo000Oo.Oooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", m80623f = "SlidingWindow.kt", m80624l = {34, 40, 49, 55, 58}, m80625m = "invokeSuspend")
public final class C34441Oooo extends AbstractC32484OooO0oo implements InterfaceC32508OooOOOo<AbstractC33570OooOO0<? super List<Object>>, Continuation<? super C32460OooOooO>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public Iterator f123462OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Object f123463OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f123464OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f123465OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public /* synthetic */ Object f123466OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final /* synthetic */ int f123467OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final /* synthetic */ int f123468OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final /* synthetic */ Iterator<Object> f123469OooOooO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34441Oooo(int i, int i2, Iterator it, Continuation continuation) {
        super(2, continuation);
        this.f123468OooOoo0 = i;
        this.f123467OooOoo = i2;
        this.f123469OooOooO = it;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C34441Oooo c34441Oooo = new C34441Oooo(this.f123468OooOoo0, this.f123467OooOoo, this.f123469OooOooO, continuation);
        c34441Oooo.f123466OooOoOO = obj;
        return c34441Oooo;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(AbstractC33570OooOO0<? super List<Object>> abstractC33570OooOO0, Continuation<? super C32460OooOooO> continuation) {
        return ((C34441Oooo) create(abstractC33570OooOO0, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0149  */
    @Override // oO00ooo.AbstractC32477OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        C34448Oooo0oO c34448Oooo0oO;
        AbstractC33570OooOO0 abstractC33570OooOO0;
        Iterator<Object> it;
        ArrayList arrayList;
        AbstractC33570OooOO0 abstractC33570OooOO02;
        Iterator<Object> it2;
        int i2;
        C34448Oooo0oO c34448Oooo0oO2;
        AbstractC33570OooOO0 abstractC33570OooOO03;
        Object[] array;
        boolean z = true;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i3 = this.f123464OooOoO;
        int i4 = this.f123467OooOoo;
        int i5 = this.f123468OooOoo0;
        if (i3 == 0) {
            C32446OooOOOo.OooO0O0(obj);
            AbstractC33570OooOO0 abstractC33570OooOO04 = (AbstractC33570OooOO0) this.f123466OooOoOO;
            int i6 = i5 <= 1024 ? i5 : 1024;
            i = i4 - i5;
            Iterator<Object> it3 = this.f123469OooOooO;
            if (i >= 0) {
                arrayList = new ArrayList(i6);
                abstractC33570OooOO02 = abstractC33570OooOO04;
                it2 = it3;
                i2 = 0;
                while (it2.hasNext()) {
                }
                if (!arrayList.isEmpty()) {
                }
            } else {
                c34448Oooo0oO = new C34448Oooo0oO(new Object[i6], 0);
                abstractC33570OooOO0 = abstractC33570OooOO04;
                it = it3;
                while (it.hasNext()) {
                }
                c34448Oooo0oO2 = c34448Oooo0oO;
                abstractC33570OooOO03 = abstractC33570OooOO0;
                if (c34448Oooo0oO2.f123475OooOoO > i4) {
                }
            }
        } else if (i3 != 1) {
            if (i3 != 2) {
                if (i3 == 3) {
                    it = this.f123462OooOo;
                    c34448Oooo0oO = (C34448Oooo0oO) this.f123463OooOo0o;
                    abstractC33570OooOO0 = (AbstractC33570OooOO0) this.f123466OooOoOO;
                    C32446OooOOOo.OooO0O0(obj);
                    c34448Oooo0oO.OooO0Oo(i4);
                    while (it.hasNext()) {
                        Object next = it.next();
                        int iOooO0O0 = c34448Oooo0oO.OooO0O0();
                        int i7 = c34448Oooo0oO.f123473OooOo;
                        if (iOooO0O0 == i7) {
                            throw new IllegalStateException("ring buffer is full");
                        }
                        int i8 = c34448Oooo0oO.f123476OooOoO0;
                        int i9 = c34448Oooo0oO.f123475OooOoO;
                        boolean z2 = z;
                        Object[] objArr = c34448Oooo0oO.f123474OooOo0o;
                        objArr[(i8 + i9) % i7] = next;
                        c34448Oooo0oO.f123475OooOoO = i9 + 1;
                        if (c34448Oooo0oO.OooO0O0() == i7) {
                            if (c34448Oooo0oO.f123475OooOoO >= i5) {
                                ArrayList arrayList2 = new ArrayList(c34448Oooo0oO);
                                this.f123466OooOoOO = abstractC33570OooOO0;
                                this.f123463OooOo0o = c34448Oooo0oO;
                                this.f123462OooOo = it;
                                this.f123464OooOoO = 3;
                                abstractC33570OooOO0.OooO00o(arrayList2, this);
                                EnumC32485OooO00o enumC32485OooO00o2 = EnumC32485OooO00o.f116726OooOo0o;
                                return enumC32485OooO00o;
                            }
                            int i10 = i7 + (i7 >> 1) + 1;
                            if (i10 > i5) {
                                i10 = i5;
                            }
                            if (c34448Oooo0oO.f123476OooOoO0 == 0) {
                                array = Arrays.copyOf(objArr, i10);
                                kotlin.jvm.internal.OooOOO0.OooO0o(array, "copyOf(...)");
                            } else {
                                array = c34448Oooo0oO.toArray(new Object[i10]);
                            }
                            c34448Oooo0oO = new C34448Oooo0oO(array, c34448Oooo0oO.f123475OooOoO);
                        }
                        z = z2;
                    }
                    c34448Oooo0oO2 = c34448Oooo0oO;
                    abstractC33570OooOO03 = abstractC33570OooOO0;
                    if (c34448Oooo0oO2.f123475OooOoO > i4) {
                    }
                } else if (i3 == 4) {
                    c34448Oooo0oO2 = (C34448Oooo0oO) this.f123463OooOo0o;
                    abstractC33570OooOO03 = (AbstractC33570OooOO0) this.f123466OooOoOO;
                    C32446OooOOOo.OooO0O0(obj);
                    c34448Oooo0oO2.OooO0Oo(i4);
                    if (c34448Oooo0oO2.f123475OooOoO > i4) {
                        ArrayList arrayList3 = new ArrayList(c34448Oooo0oO2);
                        this.f123466OooOoOO = abstractC33570OooOO03;
                        this.f123463OooOo0o = c34448Oooo0oO2;
                        this.f123462OooOo = null;
                        this.f123464OooOoO = 4;
                        abstractC33570OooOO03.OooO00o(arrayList3, this);
                        EnumC32485OooO00o enumC32485OooO00o3 = EnumC32485OooO00o.f116726OooOo0o;
                        return enumC32485OooO00o;
                    }
                    if (!c34448Oooo0oO2.isEmpty()) {
                        this.f123466OooOoOO = null;
                        this.f123463OooOo0o = null;
                        this.f123462OooOo = null;
                        this.f123464OooOoO = 5;
                        abstractC33570OooOO03.OooO00o(c34448Oooo0oO2, this);
                        EnumC32485OooO00o enumC32485OooO00o4 = EnumC32485OooO00o.f116726OooOo0o;
                        return enumC32485OooO00o;
                    }
                } else if (i3 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            C32446OooOOOo.OooO0O0(obj);
        } else {
            i2 = this.f123465OooOoO0;
            it2 = this.f123462OooOo;
            abstractC33570OooOO02 = (AbstractC33570OooOO0) this.f123466OooOoOO;
            C32446OooOOOo.OooO0O0(obj);
            arrayList = new ArrayList(i5);
            i = i2;
            while (it2.hasNext()) {
                Object next2 = it2.next();
                if (i2 > 0) {
                    i2--;
                } else {
                    arrayList.add(next2);
                    if (arrayList.size() == i5) {
                        this.f123466OooOoOO = abstractC33570OooOO02;
                        this.f123463OooOo0o = arrayList;
                        this.f123462OooOo = it2;
                        this.f123465OooOoO0 = i;
                        this.f123464OooOoO = 1;
                        abstractC33570OooOO02.OooO00o(arrayList, this);
                        EnumC32485OooO00o enumC32485OooO00o5 = EnumC32485OooO00o.f116726OooOo0o;
                        return enumC32485OooO00o;
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                this.f123466OooOoOO = null;
                this.f123463OooOo0o = null;
                this.f123462OooOo = null;
                this.f123464OooOoO = 2;
                abstractC33570OooOO02.OooO00o(arrayList, this);
                EnumC32485OooO00o enumC32485OooO00o6 = EnumC32485OooO00o.f116726OooOo0o;
                return enumC32485OooO00o;
            }
        }
        return C32460OooOooO.f116667OooO00o;
    }
}
