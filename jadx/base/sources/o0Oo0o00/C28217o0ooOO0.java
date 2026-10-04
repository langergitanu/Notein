package o0Oo0o00;

import OooooOO.C21355Ooooooo;
import com.aspose.slides.C22201OooO0oO;
import com.huawei.hms.network.embedded.C18250l0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0oOoOo.C31035OooO0o0;
import oO00ooO.C32445OooOOOO;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32476OooO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0O000o.InterfaceC32508OooOOOo;
import oO0o0OO.C33609OooO0oo;
import oO0o0OO.C33633Oooo0;
import oO0o0OO.InterfaceC33636Oooo00o;
import oO0o0OO.o00000OO;
import oO0o0Oo.C33729OooOOO0;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0OoO.C33804OooOOOo;
import oO0o0OoO.C33805OooOOo;
import oOO00oo.C34406OooO00o;

/* JADX INFO: renamed from: o0Oo0o00.o0ooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.datasync.CloudSyncViewModel$syncAndMonitorNoteOnce$2", m80623f = "CloudSyncViewModel.kt", m80624l = {632}, m80625m = "invokeSuspend")
public final class C28217o0ooOO0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32445OooOOOO<? extends C32460OooOooO>>, Object> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public /* synthetic */ Object f100027OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f100028OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f100029OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ C28201OooooO0 f100030OooOoO0;

    /* JADX INFO: renamed from: o0Oo0o00.o0ooOO0$OooO00o */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.datasync.CloudSyncViewModel$syncAndMonitorNoteOnce$2$1$2", m80623f = "CloudSyncViewModel.kt", m80624l = {633}, m80625m = "invokeSuspend")
    public static final class OooO00o extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ o00000OO f100031OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f100032OooOo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(o00000OO o00000oo2, Continuation continuation) {
            super(2, continuation);
            this.f100031OooOo = o00000oo2;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            return new OooO00o(this.f100031OooOo, continuation);
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO00o) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f100032OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                this.f100032OooOo0o = 1;
                if (this.f100031OooOo.join(this) == enumC32485OooO00o) {
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

    /* JADX INFO: renamed from: o0Oo0o00.o0ooOO0$OooO0O0 */
    @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.datasync.CloudSyncViewModel$syncAndMonitorNoteOnce$2$1$monitorJob$1", m80623f = "CloudSyncViewModel.kt", m80624l = {619}, m80625m = "invokeSuspend")
    public static final class OooO0O0 extends AbstractC32476OooO implements InterfaceC32508OooOOOo<InterfaceC33636Oooo00o, Continuation<? super C32460OooOooO>, Object> {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public /* synthetic */ Object f100033OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public int f100034OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ String f100035OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ C28201OooooO0 f100036OooOoO0;

        /* JADX INFO: renamed from: o0Oo0o00.o0ooOO0$OooO0O0$OooO00o */
        public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public final /* synthetic */ InterfaceC33636Oooo00o f100037OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public final /* synthetic */ String f100038OooOo0o;

            public OooO00o(String str, InterfaceC33636Oooo00o interfaceC33636Oooo00o) {
                this.f100038OooOo0o = str;
                this.f100037OooOo = interfaceC33636Oooo00o;
            }

            @Override // oO0o0Oo.InterfaceC33723OooO0oO
            public final Object emit(Object obj, Continuation continuation) {
                List list = (List) obj;
                boolean z = list instanceof Collection;
                String str = this.f100038OooOo0o;
                if (z && list.isEmpty()) {
                    C34406OooO00o.C20358OooO00o c20358OooO00o = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o.OooO0o0(C22201OooO0oO.OooO0O0(c20358OooO00o, "CloudSyncDetailsVM", "Note ", str, " sync completed"), new Object[0]);
                    C33633Oooo0.OooO0Oo(this.f100037OooOo, null);
                } else {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (kotlin.jvm.internal.OooOOO0.OooO0O0(((C31035OooO0o0) it.next()).f110805OooO00o, str)) {
                            break;
                        }
                    }
                    C34406OooO00o.C20358OooO00o c20358OooO00o2 = C34406OooO00o.f123390OooO00o;
                    c20358OooO00o2.OooO0o0(C22201OooO0oO.OooO0O0(c20358OooO00o2, "CloudSyncDetailsVM", "Note ", str, " sync completed"), new Object[0]);
                    C33633Oooo0.OooO0Oo(this.f100037OooOo, null);
                }
                return C32460OooOooO.f116667OooO00o;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(C28201OooooO0 c28201OooooO0, String str, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f100036OooOoO0 = c28201OooooO0;
            this.f100035OooOoO = str;
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
            OooO0O0 oooO0O0 = new OooO0O0(this.f100036OooOoO0, this.f100035OooOoO, continuation);
            oooO0O0.f100033OooOo = obj;
            return oooO0O0;
        }

        @Override // oO0O000o.InterfaceC32508OooOOOo
        public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32460OooOooO> continuation) {
            return ((OooO0O0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
        }

        @Override // oO00ooo.AbstractC32477OooO00o
        public final Object invokeSuspend(Object obj) {
            Object obj2 = EnumC32485OooO00o.f116726OooOo0o;
            int i = this.f100034OooOo0o;
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f100033OooOo;
                C33729OooOOO0 c33729OooOOO0 = new C33729OooOOO0(new o0ooOOo(0), this.f100036OooOoO0.f99966Oooo00o, null);
                OooO00o oooO00o = new OooO00o(this.f100035OooOoO, interfaceC33636Oooo00o);
                this.f100034OooOo0o = 1;
                C33805OooOOo c33805OooOOo = new C33805OooOOo(c33729OooOOO0, oooO00o, null);
                C33804OooOOOo c33804OooOOOo = new C33804OooOOOo(this, getContext());
                Object objOooO0o0 = o00OO00O.OooO0O0.OooO0o0(c33804OooOOOo, c33804OooOOOo, c33805OooOOo);
                if (objOooO0o0 != EnumC32485OooO00o.f116726OooOo0o) {
                    objOooO0o0 = C32460OooOooO.f116667OooO00o;
                }
                if (objOooO0o0 == obj2) {
                    return obj2;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28217o0ooOO0(C28201OooooO0 c28201OooooO0, String str, Continuation<? super C28217o0ooOO0> continuation) {
        super(2, continuation);
        this.f100030OooOoO0 = c28201OooooO0;
        this.f100029OooOoO = str;
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Continuation<C32460OooOooO> create(Object obj, Continuation<?> continuation) {
        C28217o0ooOO0 c28217o0ooOO0 = new C28217o0ooOO0(this.f100030OooOoO0, this.f100029OooOoO, continuation);
        c28217o0ooOO0.f100027OooOo = obj;
        return c28217o0ooOO0;
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(InterfaceC33636Oooo00o interfaceC33636Oooo00o, Continuation<? super C32445OooOOOO<? extends C32460OooOooO>> continuation) {
        return ((C28217o0ooOO0) create(interfaceC33636Oooo00o, continuation)).invokeSuspend(C32460OooOooO.f116667OooO00o);
    }

    @Override // oO00ooo.AbstractC32477OooO00o
    public final Object invokeSuspend(Object obj) {
        Object objOooO00o;
        EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
        int i = this.f100028OooOo0o;
        try {
            if (i == 0) {
                C32446OooOOOo.OooO0O0(obj);
                InterfaceC33636Oooo00o interfaceC33636Oooo00o = (InterfaceC33636Oooo00o) this.f100027OooOo;
                C28201OooooO0 c28201OooooO0 = this.f100030OooOoO0;
                String str = this.f100029OooOoO;
                c28201OooooO0.OooOO0();
                c28201OooooO0.OooOO0o(str);
                o00000OO o00000ooOooO0OO = C33609OooO0oo.OooO0OO(interfaceC33636Oooo00o, null, null, new OooO0O0(c28201OooooO0, str, null), 3);
                o00000ooOooO0OO.invokeOnCompletion(new C28213o00oO0O(str, 0));
                OooO00o oooO00o = new OooO00o(o00000ooOooO0OO, null);
                this.f100028OooOo0o = 1;
                if (C21355Ooooooo.OooO(C18250l0.g.f55491e, oooO00o, this) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj);
            }
            objOooO00o = C32460OooOooO.f116667OooO00o;
        } catch (Throwable th) {
            objOooO00o = C32446OooOOOo.OooO00o(th);
        }
        return new C32445OooOOOO(objOooO00o);
    }
}
