package androidx.room;

import android.content.Intent;
import com.aspose.words.StyleIdentifier;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o000O0oO.C24412OooO0oO;
import o000oo0.AbstractC24673OooOo0O;
import o000oo0.C24659OooO0o;
import o000oo0.C24660OooO0o0;
import o000oo0.C24662OooO0oo;
import o000oo0.C24695OoooO00;
import o000oo0o.OooOo;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo000Oo.C34444Oooo0O0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public Intent f66181OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final AbstractC24673OooOo0O f66182OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String[] f66183OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C24695OoooO00 f66184OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final LinkedHashMap f66185OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C24412OooO0oO f66186OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final ReentrantLock f66187OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final C24659OooO0o f66188OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final C24660OooO0o0 f66189OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public C22081OooO0o0 f66190OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final Object f66191OooOO0O;

    public static abstract class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String[] f66192OooO00o;

        public OooO00o(String[] strArr) {
            this.f66192OooO00o = strArr;
        }

        public abstract void OooO00o(Set<String> set);
    }

    @InterfaceC32482OooO0o0(m80622c = "androidx.room.InvalidationTracker$removeObserver$1", m80623f = "InvalidationTracker.android.kt", m80624l = {StyleIdentifier.GRID_TABLE_3_ACCENT_5}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f66194OooOo0o;

        public OooO0O0(Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return OooO0OO.this.new OooO0O0(continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f66194OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                C24695OoooO00 c24695OoooO00 = OooO0OO.this.f66184OooO0OO;
                this.f66194OooOo0o = 1;
                if (c24695OoooO00.OooO0o(this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public OooO0OO(AbstractC24673OooOo0O abstractC24673OooOo0O, HashMap map, HashMap map2, String... strArr) {
        this.f66182OooO00o = abstractC24673OooOo0O;
        this.f66183OooO0O0 = strArr;
        C24695OoooO00 c24695OoooO00 = new C24695OoooO00(abstractC24673OooOo0O, map, map2, strArr, abstractC24673OooOo0O.f83587OooOO0O, new C24662OooO0oo(1, this, OooO0OO.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0));
        this.f66184OooO0OO = c24695OoooO00;
        this.f66185OooO0Oo = new LinkedHashMap();
        this.f66187OooO0o0 = new ReentrantLock();
        this.f66186OooO0o = new C24412OooO0oO(this, 1);
        this.f66188OooO0oO = new C24659OooO0o(this, 0);
        this.f66189OooO0oo = new C24660OooO0o0(abstractC24673OooOo0O);
        this.f66191OooOO0O = new Object();
        c24695OoooO00.f83683OooOO0O = new oO0O000o.OooO00o() { // from class: o000oo0.OooO0oO
            @Override // oO0O000o.OooO00o
            public final Object invoke() {
                androidx.room.OooO0OO oooO0OO = this.f83542OooOo0o;
                return Boolean.valueOf(!oooO0OO.f66182OooO00o.OooOOO() || oooO0OO.f66182OooO00o.OooOOo());
            }
        };
    }

    public final boolean OooO00o(OooO00o oooO00o) {
        String[] strArr = oooO00o.f66192OooO00o;
        C24695OoooO00 c24695OoooO00 = this.f66184OooO0OO;
        C32443OooOOO<String[], int[]> c32443OooOOOOooO0oO = c24695OoooO00.OooO0oO(strArr);
        String[] strArr2 = c32443OooOOOOooO0oO.f116638OooOo0o;
        int[] iArr = c32443OooOOOOooO0oO.f116637OooOo;
        OooO0o oooO0o = new OooO0o(oooO00o, iArr, strArr2);
        ReentrantLock reentrantLock = this.f66187OooO0o0;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.f66185OooO0Oo;
        try {
            OooO0o oooO0o2 = linkedHashMap.containsKey(oooO00o) ? (OooO0o) C34444Oooo0O0.OooO0oO(oooO00o, linkedHashMap) : (OooO0o) linkedHashMap.put(oooO00o, oooO0o);
            reentrantLock.unlock();
            return oooO0o2 == null && c24695OoooO00.f83681OooO0oo.OooO00o(iArr);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void OooO0O0(OooO00o observer) {
        OooOOO0.OooO0oO(observer, "observer");
        ReentrantLock reentrantLock = this.f66187OooO0o0;
        reentrantLock.lock();
        try {
            OooO0o oooO0o = (OooO0o) this.f66185OooO0Oo.remove(observer);
            if (oooO0o != null) {
                C24695OoooO00 c24695OoooO00 = this.f66184OooO0OO;
                c24695OoooO00.getClass();
                int[] tableIds = oooO0o.f66198OooO0O0;
                OooOOO0.OooO0oO(tableIds, "tableIds");
                if (c24695OoooO00.f83681OooO0oo.OooO0O0(tableIds)) {
                    OooOo.OooO00o(new OooO0O0(null));
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final Object OooO0OO(AbstractC32476OooO abstractC32476OooO) {
        Object objOooO0o;
        AbstractC24673OooOo0O abstractC24673OooOo0O = this.f66182OooO00o;
        return ((!abstractC24673OooOo0O.OooOOO() || abstractC24673OooOo0O.OooOOo()) && (objOooO0o = this.f66184OooO0OO.OooO0o(abstractC32476OooO)) == EnumC32485OooO00o.f116726OooOo0o) ? objOooO0o : C32460OooOooO.f116667OooO00o;
    }
}
