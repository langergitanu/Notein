package o0oOOoOo;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0000oOO.AbstractC24338OooO0o0;
import o0OOOoo.C27204OooO0O0;
import o0oOOoOo.C30849OooO0O0;
import o0oOoOo.AbstractC31059OooOooo;
import o0oOoOo.C31062Oooo000;
import o0oOoOo.C31080OoooOoo;
import oO00ooO.C32446OooOOOo;
import oO00ooO.C32460OooOooO;
import oO00ooo.AbstractC32479OooO0OO;
import oO00ooo.InterfaceC32482OooO0o0;
import oO00ooo0.EnumC32485OooO00o;
import oO0o0Oo.InterfaceC33721OooO0o;
import oO0o0Oo.InterfaceC33723OooO0oO;
import oO0o0OoO.C33799OooOO0O;
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0oOOoOo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30854OooO0o0 implements InterfaceC33721OooO0o<C31080OoooOoo> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ int f110290OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ C33799OooOO0O f110291OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ AbstractC24338OooO0o0.OooO00o f110292OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ List f110293OooOoO0;

    /* JADX INFO: renamed from: o0oOOoOo.OooO0o0$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ int f110294OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f110295OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ AbstractC24338OooO0o0.OooO00o f110296OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ List f110297OooOoO0;

        /* JADX INFO: renamed from: o0oOOoOo.OooO0o0$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.stylus.GlobalStylusShortcutViewModel$penShortcutOptionsFlow$$inlined$map$1$2", m80623f = "GlobalStylusShortcutViewModel.kt", m80624l = {50}, m80625m = "emit")
        public static final class C20137OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f110298OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f110299OooOo0o;

            public C20137OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f110299OooOo0o = obj;
                this.f110298OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, int i, List list, AbstractC24338OooO0o0.OooO00o oooO00o) {
            this.f110295OooOo0o = interfaceC33723OooO0oO;
            this.f110294OooOo = i;
            this.f110297OooOoO0 = list;
            this.f110296OooOoO = oooO00o;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C20137OooO00o c20137OooO00o;
            if (continuation instanceof C20137OooO00o) {
                c20137OooO00o = (C20137OooO00o) continuation;
                int i = c20137OooO00o.f110298OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c20137OooO00o.f110298OooOo = i - Integer.MIN_VALUE;
                } else {
                    c20137OooO00o = new C20137OooO00o(continuation);
                }
            }
            Object obj2 = c20137OooO00o.f110299OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c20137OooO00o.f110298OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                C27204OooO0O0 c27204OooO0O0 = (C27204OooO0O0) obj;
                List<C30849OooO0O0.OooO0OO> list = this.f110297OooOoO0;
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                for (C30849OooO0O0.OooO0OO oooO0OO : list) {
                    int i3 = oooO0OO.f110265OooO00o;
                    int i4 = c27204OooO0O0.f95000OooO0O0;
                    int i5 = oooO0OO.f110266OooO0O0;
                    arrayList.add(new C31062Oooo000(i3, i5 == i4, new AbstractC31059OooOooo.OooO00o(i5, this.f110296OooOoO)));
                }
                C31080OoooOoo c31080OoooOoo = new C31080OoooOoo(this.f110294OooOo, arrayList);
                c20137OooO00o.f110298OooOo = 1;
                if (this.f110295OooOo0o.emit(c31080OoooOoo, c20137OooO00o) == enumC32485OooO00o) {
                    return enumC32485OooO00o;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C32446OooOOOo.OooO0O0(obj2);
            }
            return C32460OooOooO.f116667OooO00o;
        }
    }

    public C30854OooO0o0(C33799OooOO0O c33799OooOO0O, int i, List list, AbstractC24338OooO0o0.OooO00o oooO00o) {
        this.f110291OooOo0o = c33799OooOO0O;
        this.f110290OooOo = i;
        this.f110293OooOoO0 = list;
        this.f110292OooOoO = oooO00o;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super C31080OoooOoo> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f110291OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO, this.f110290OooOo, this.f110293OooOoO0, this.f110292OooOoO), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}
