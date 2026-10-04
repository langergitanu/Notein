package oO00OOoO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C24039Oooo0o0;
import oO00OOoO.AbstractC32247OooO0oO;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO0O000o.InterfaceC32510OooOOo0;
import oOo0000O.InterfaceC34415OooO0oo;
import oOo000Oo.C34429OooOOo0;
import oOo000Oo.C34434OooOoO;
import oOo000Oo.OooOo;
import oOo00Oo0.OooOOO0;

/* JADX INFO: renamed from: oO00OOoO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C32244OooO0Oo<TSubject, TContext> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final ArrayList f115812OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f115813OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f115814OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public o00O00o0.OooO0O0 f115815OooO0Oo;
    private volatile /* synthetic */ Object _interceptors;

    public C32244OooO0Oo(o00O00o0.OooO0O0... oooO0O0Arr) {
        new OooOOO0();
        this.f115812OooO00o = C34429OooOOo0.OooOOO(Arrays.copyOf(oooO0O0Arr, oooO0O0Arr.length));
        this._interceptors = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object OooO00o(Object context, Object subject, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        int iOooOO0O;
        int iOooOO0O2;
        InterfaceC34415OooO0oo coroutineContext = abstractC32479OooO0OO.getContext();
        if (((List) this._interceptors) == null) {
            int i = this.f115813OooO0O0;
            if (i == 0) {
                this._interceptors = C34434OooOoO.f123453OooOo0o;
                this.f115814OooO0OO = false;
                this.f115815OooO0Oo = null;
            } else {
                ArrayList arrayList = this.f115812OooO00o;
                if (i != 1 || (iOooOO0O2 = C34429OooOOo0.OooOO0O(arrayList)) < 0) {
                    ArrayList arrayList2 = new ArrayList();
                    iOooOO0O = C34429OooOOo0.OooOO0O(arrayList);
                    if (iOooOO0O >= 0) {
                        int i2 = 0;
                        while (true) {
                            Object obj = arrayList.get(i2);
                            C32243OooO0OO c32243OooO0OO = obj instanceof C32243OooO0OO ? (C32243OooO0OO) obj : null;
                            if (c32243OooO0OO != null) {
                                List<InterfaceC32510OooOOo0<AbstractC32246OooO0o0<TSubject, Call>, TSubject, Continuation<? super C32460OooOooO>, Object>> list = c32243OooO0OO.f115810OooO0OO;
                                arrayList2.ensureCapacity(list.size() + arrayList2.size());
                                int size = list.size();
                                for (int i3 = 0; i3 < size; i3++) {
                                    arrayList2.add(list.get(i3));
                                }
                            }
                            if (i2 == iOooOO0O) {
                                break;
                            }
                            i2++;
                        }
                    }
                    this._interceptors = arrayList2;
                    this.f115814OooO0OO = false;
                    this.f115815OooO0Oo = null;
                } else {
                    int i4 = 0;
                    while (true) {
                        Object obj2 = arrayList.get(i4);
                        C32243OooO0OO c32243OooO0OO2 = obj2 instanceof C32243OooO0OO ? (C32243OooO0OO) obj2 : null;
                        if (c32243OooO0OO2 != null && !c32243OooO0OO2.f115810OooO0OO.isEmpty()) {
                            Collection collection = c32243OooO0OO2.f115810OooO0OO;
                            c32243OooO0OO2.f115811OooO0Oo = true;
                            this._interceptors = collection;
                            this.f115814OooO0OO = false;
                            this.f115815OooO0Oo = c32243OooO0OO2.f115808OooO00o;
                            break;
                        }
                        if (i4 == iOooOO0O2) {
                            break;
                        }
                        i4++;
                    }
                    ArrayList arrayList22 = new ArrayList();
                    iOooOO0O = C34429OooOOo0.OooOO0O(arrayList);
                    if (iOooOO0O >= 0) {
                    }
                    this._interceptors = arrayList22;
                    this.f115814OooO0OO = false;
                    this.f115815OooO0Oo = null;
                }
            }
        }
        this.f115814OooO0OO = true;
        List list2 = (List) this._interceptors;
        kotlin.jvm.internal.OooOOO0.OooO0Oo(list2);
        boolean zOooO0Oo = OooO0Oo();
        kotlin.jvm.internal.OooOOO0.OooO0oO(context, "context");
        kotlin.jvm.internal.OooOOO0.OooO0oO(subject, "subject");
        kotlin.jvm.internal.OooOOO0.OooO0oO(coroutineContext, "coroutineContext");
        return ((C32245OooO0o.f115816OooO00o || zOooO0Oo) ? new C32241OooO00o(context, list2, subject, coroutineContext) : new OooOO0(subject, context, list2)).OooO00o(subject, abstractC32479OooO0OO);
    }

    public final C32243OooO0OO<TSubject, TContext> OooO0O0(o00O00o0.OooO0O0 oooO0O0) {
        ArrayList arrayList = this.f115812OooO00o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            if (obj == oooO0O0) {
                C32243OooO0OO<TSubject, TContext> c32243OooO0OO = new C32243OooO0OO<>(oooO0O0, AbstractC32247OooO0oO.OooO0OO.f115819OooO00o);
                arrayList.set(i, c32243OooO0OO);
                return c32243OooO0OO;
            }
            if (obj instanceof C32243OooO0OO) {
                C32243OooO0OO<TSubject, TContext> c32243OooO0OO2 = (C32243OooO0OO) obj;
                if (c32243OooO0OO2.f115808OooO00o == oooO0O0) {
                    return c32243OooO0OO2;
                }
            }
        }
        return null;
    }

    public final int OooO0OO(o00O00o0.OooO0O0 oooO0O0) {
        ArrayList arrayList = this.f115812OooO00o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            if (obj == oooO0O0 || ((obj instanceof C32243OooO0OO) && ((C32243OooO0OO) obj).f115808OooO00o == oooO0O0)) {
                return i;
            }
        }
        return -1;
    }

    public boolean OooO0Oo() {
        return false;
    }

    public final void OooO0o(o00O00o0.OooO0O0 phase, InterfaceC32510OooOOo0<? super AbstractC32246OooO0o0<TSubject, TContext>, ? super TSubject, ? super Continuation<? super C32460OooOooO>, ? extends Object> interfaceC32510OooOOo0) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(phase, "phase");
        C32243OooO0OO<TSubject, TContext> c32243OooO0OOOooO0O0 = OooO0O0(phase);
        if (c32243OooO0OOOooO0O0 == null) {
            throw new C32242OooO0O0("Phase " + phase + " was not registered for this pipeline");
        }
        C24039Oooo0o0.OooO0o0(3, interfaceC32510OooOOo0);
        List list = (List) this._interceptors;
        if (!this.f115812OooO00o.isEmpty() && list != null && !this.f115814OooO0OO && C24039Oooo0o0.OooO0oO(list)) {
            if (kotlin.jvm.internal.OooOOO0.OooO0O0(this.f115815OooO0Oo, phase)) {
                list.add(interfaceC32510OooOOo0);
            } else if (phase.equals(OooOo.OoooOOo(this.f115812OooO00o)) || OooO0OO(phase) == C34429OooOOo0.OooOO0O(this.f115812OooO00o)) {
                C32243OooO0OO<TSubject, TContext> c32243OooO0OOOooO0O02 = OooO0O0(phase);
                kotlin.jvm.internal.OooOOO0.OooO0Oo(c32243OooO0OOOooO0O02);
                c32243OooO0OOOooO0O02.OooO00o(interfaceC32510OooOOo0);
                list.add(interfaceC32510OooOOo0);
            }
            this.f115813OooO0O0++;
            return;
        }
        c32243OooO0OOOooO0O0.OooO00o(interfaceC32510OooOOo0);
        this.f115813OooO0O0++;
        this._interceptors = null;
        this.f115814OooO0OO = false;
        this.f115815OooO0Oo = null;
    }

    public final boolean OooO0o0(o00O00o0.OooO0O0 oooO0O0) {
        ArrayList arrayList = this.f115812OooO00o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            if (obj == oooO0O0) {
                return true;
            }
            if ((obj instanceof C32243OooO0OO) && ((C32243OooO0OO) obj).f115808OooO00o == oooO0O0) {
                return true;
            }
        }
        return false;
    }
}
