package androidx.room;

import androidx.lifecycle.Oooo0;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.OooOOO0;
import o000oo0.AbstractC24673OooOo0O;
import o000oo0.C24660OooO0o0;
import o000oo0.C24683OooOooo;
import o000oo0o.OooOo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.InterfaceC33636Oooo00o;
import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: renamed from: androidx.room.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC22083OooO0oo<T> extends Oooo0<T> {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final AbstractC24673OooOo0O f66220OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final C22082OooO0oO f66221OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final C24660OooO0o0 f66222OooOOO0;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final InterfaceC34415OooO0oo f66225OooOOo;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final AtomicBoolean f66223OooOOOO = new AtomicBoolean(true);

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final AtomicBoolean f66224OooOOOo = new AtomicBoolean(false);

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final AtomicBoolean f66226OooOOo0 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: androidx.room.OooO0oo$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "androidx.room.RoomTrackingLiveData$onActive$1", m80623f = "RoomTrackingLiveData.android.kt", m80624l = {123}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ AbstractC22083OooO0oo<T> f66227OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f66228OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(AbstractC22083OooO0oo<T> abstractC22083OooO0oo, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f66227OooOo = abstractC22083OooO0oo;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f66227OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f66228OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f66228OooOo0o = 1;
                if (AbstractC22083OooO0oo.OooOO0O(this.f66227OooOo, this) == enumC32485OooO00o) {
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

    public AbstractC22083OooO0oo(AbstractC24673OooOo0O abstractC24673OooOo0O, C24660OooO0o0 c24660OooO0o0, String[] strArr) {
        InterfaceC34415OooO0oo interfaceC34415OooO0oo;
        this.f66220OooOO0o = abstractC24673OooOo0O;
        this.f66222OooOOO0 = c24660OooO0o0;
        this.f66221OooOOO = new C22082OooO0oO(strArr, this);
        if (abstractC24673OooOo0O.OooOOO()) {
            interfaceC34415OooO0oo = abstractC24673OooOo0O.f83579OooO0O0;
            if (interfaceC34415OooO0oo == null) {
                OooOOO0.OooOOOO("transactionContext");
                throw null;
            }
        } else {
            interfaceC34415OooO0oo = oOo0000O.OooO.f123416OooOo0o;
        }
        this.f66225OooOOo = interfaceC34415OooO0oo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007b A[Catch: all -> 0x0030, Exception -> 0x0033, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0033, blocks: (B:12:0x002c, B:30:0x007b), top: B:50:0x002c, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0094 A[Catch: all -> 0x0030, TRY_LEAVE, TryCatch #0 {all -> 0x0030, blocks: (B:12:0x002c, B:28:0x0073, B:30:0x007b, B:37:0x0094, B:34:0x008a, B:35:0x0091), top: B:49:0x0024, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.room.OooO0oo] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.room.OooO0oo] */
    /* JADX WARN: Type inference failed for: r2v8, types: [androidx.lifecycle.Oooo0, androidx.room.OooO0oo] */
    /* JADX WARN: Type inference failed for: r2v9, types: [androidx.room.OooO0oo] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v3, types: [androidx.room.OooO0oo] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0071 -> B:28:0x0073). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00a3 -> B:42:0x00a4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object OooOO0O(AbstractC22083OooO0oo abstractC22083OooO0oo, AbstractC32479OooO0OO abstractC32479OooO0OO) {
        C24683OooOooo c24683OooOooo;
        ?? r7;
        ?? r2;
        abstractC22083OooO0oo.getClass();
        if (abstractC32479OooO0OO instanceof C24683OooOooo) {
            c24683OooOooo = (C24683OooOooo) abstractC32479OooO0OO;
            int i = c24683OooOooo.f83646OooOoOO;
            if ((i & Integer.MIN_VALUE) != 0) {
                c24683OooOooo.f83646OooOoOO = i - Integer.MIN_VALUE;
            } else {
                c24683OooOooo = new C24683OooOooo(abstractC22083OooO0oo, abstractC32479OooO0OO);
            }
        }
        Object objOooOO0o = c24683OooOooo.f83645OooOoO0;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        ?? r22 = c24683OooOooo.f83646OooOoOO;
        try {
            if (r22 != 0) {
                if (r22 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i2 = c24683OooOooo.f83642OooOo;
                r22 = c24683OooOooo.f83643OooOo0o;
                try {
                    C32446OooOOOo.OooO0O0(objOooOO0o);
                    r22 = r22;
                    while (r22.f66223OooOOOO.compareAndSet(true, false)) {
                        c24683OooOooo.f83643OooOo0o = r22;
                        c24683OooOooo.f83642OooOo = 1;
                        c24683OooOooo.f83646OooOoOO = 1;
                        objOooOO0o = r22.OooOO0o();
                        if (objOooOO0o == enumC32485OooO00o) {
                            return enumC32485OooO00o;
                        }
                        i2 = 1;
                    }
                    if (i2 != 0) {
                        r22.OooO0oo(objOooOO0o);
                    }
                    if (i2 != 0 || !r2.f66223OooOOOO.get()) {
                        return C32460OooOooO.f116667OooO00o;
                    }
                    r7 = r2;
                    ?? r23 = r7;
                    if (r7.f66224OooOOOo.compareAndSet(false, true)) {
                        i2 = 0;
                        r2 = r23;
                        if (i2 != 0) {
                        }
                        return C32460OooOooO.f116667OooO00o;
                    }
                    objOooOO0o = null;
                    i2 = 0;
                    r22 = r23;
                    while (r22.f66223OooOOOO.compareAndSet(true, false)) {
                    }
                    if (i2 != 0) {
                    }
                    if (i2 != 0) {
                    }
                    return C32460OooOooO.f116667OooO00o;
                } catch (Exception e) {
                    throw new RuntimeException("Exception while computing database live data.", e);
                }
            }
            C32446OooOOOo.OooO0O0(objOooOO0o);
            boolean zCompareAndSet = abstractC22083OooO0oo.f66226OooOOo0.compareAndSet(false, true);
            r7 = abstractC22083OooO0oo;
            if (zCompareAndSet) {
                OooO0OO oooO0OOOooOO0 = abstractC22083OooO0oo.f66220OooOO0o.OooOO0();
                C22082OooO0oO observer = abstractC22083OooO0oo.f66221OooOOO;
                OooOOO0.OooO0oO(observer, "observer");
                r7 = abstractC22083OooO0oo;
                if (oooO0OOOooOO0.OooO00o(new OooO(oooO0OOOooOO0, observer))) {
                    OooOo.OooO00o(new C22080OooO0Oo(oooO0OOOooOO0, null));
                    r7 = abstractC22083OooO0oo;
                }
            }
            ?? r232 = r7;
            if (r7.f66224OooOOOo.compareAndSet(false, true)) {
            }
        } finally {
            r22.f66224OooOOOo.set(false);
        }
    }

    @Override // androidx.lifecycle.Oooo0
    public final void OooO0o() {
        C24660OooO0o0 c24660OooO0o0 = this.f66222OooOOO0;
        c24660OooO0o0.getClass();
        c24660OooO0o0.f83541OooO0O0.add(this);
        C33609OooO0oo.OooO0OO(this.f66220OooOO0o.OooO(), this.f66225OooOOo, null, new OooO00o(this, null), 2);
    }

    @Override // androidx.lifecycle.Oooo0
    public final void OooO0oO() {
        C24660OooO0o0 c24660OooO0o0 = this.f66222OooOOO0;
        c24660OooO0o0.getClass();
        c24660OooO0o0.f83541OooO0O0.remove(this);
    }

    public abstract Object OooOO0o();
}
