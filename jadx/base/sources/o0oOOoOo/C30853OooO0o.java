package o0oOOoOo;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import o0OO00o0.o000Oo0;
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
import oOo000Oo.C34428OooOOo;

/* JADX INFO: renamed from: o0oOOoOo.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30853OooO0o implements InterfaceC33721OooO0o<C31080OoooOoo> {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final /* synthetic */ int f110279OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final /* synthetic */ o000Oo0 f110280OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ String f110281OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ List f110282OooOoO0;

    /* JADX INFO: renamed from: o0oOOoOo.OooO0o$OooO00o */
    public static final class OooO00o<T> implements InterfaceC33723OooO0oO {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public final /* synthetic */ int f110283OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC33723OooO0oO f110284OooOo0o;

        /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
        public final /* synthetic */ String f110285OooOoO;

        /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
        public final /* synthetic */ List f110286OooOoO0;

        /* JADX INFO: renamed from: o0oOOoOo.OooO0o$OooO00o$OooO00o, reason: collision with other inner class name */
        @InterfaceC32482OooO0o0(m80622c = "com.orion.notein.ui.settings.stylus.GlobalStylusShortcutViewModel$stylusGestureOptionsFlow$$inlined$map$1$2", m80623f = "GlobalStylusShortcutViewModel.kt", m80624l = {50}, m80625m = "emit")
        public static final class C20136OooO00o extends AbstractC32479OooO0OO {

            /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
            public int f110287OooOo;

            /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
            public /* synthetic */ Object f110288OooOo0o;

            public C20136OooO00o(Continuation continuation) {
                super(continuation);
            }

            @Override // oO00ooo.AbstractC32477OooO00o
            public final Object invokeSuspend(Object obj) {
                this.f110288OooOo0o = obj;
                this.f110287OooOo |= Integer.MIN_VALUE;
                return OooO00o.this.emit(null, this);
            }
        }

        public OooO00o(InterfaceC33723OooO0oO interfaceC33723OooO0oO, int i, List list, String str) {
            this.f110284OooOo0o = interfaceC33723OooO0oO;
            this.f110283OooOo = i;
            this.f110286OooOoO0 = list;
            this.f110285OooOoO = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // oO0o0Oo.InterfaceC33723OooO0oO
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C20136OooO00o c20136OooO00o;
            if (continuation instanceof C20136OooO00o) {
                c20136OooO00o = (C20136OooO00o) continuation;
                int i = c20136OooO00o.f110287OooOo;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c20136OooO00o.f110287OooOo = i - Integer.MIN_VALUE;
                } else {
                    c20136OooO00o = new C20136OooO00o(continuation);
                }
            }
            Object obj2 = c20136OooO00o.f110288OooOo0o;
            EnumC32485OooO00o enumC32485OooO00o = EnumC32485OooO00o.f116726OooOo0o;
            int i2 = c20136OooO00o.f110287OooOo;
            if (i2 == 0) {
                C32446OooOOOo.OooO0O0(obj2);
                String str = (String) obj;
                List<C30849OooO0O0.OooO00o> list = this.f110286OooOoO0;
                ArrayList arrayList = new ArrayList(C34428OooOOo.OooOOoo(list, 10));
                for (C30849OooO0O0.OooO00o oooO00o : list) {
                    int i3 = oooO00o.f110261OooO00o;
                    String str2 = oooO00o.f110262OooO0O0;
                    arrayList.add(new C31062Oooo000(i3, str2.equals(str), new AbstractC31059OooOooo.OooO0O0(this.f110285OooOoO, str2)));
                }
                C31080OoooOoo c31080OoooOoo = new C31080OoooOoo(this.f110283OooOo, arrayList);
                c20136OooO00o.f110287OooOo = 1;
                if (this.f110284OooOo0o.emit(c31080OoooOoo, c20136OooO00o) == enumC32485OooO00o) {
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

    public C30853OooO0o(o000Oo0 o000oo02, int i, List list, String str) {
        this.f110280OooOo0o = o000oo02;
        this.f110279OooOo = i;
        this.f110282OooOoO0 = list;
        this.f110281OooOoO = str;
    }

    @Override // oO0o0Oo.InterfaceC33721OooO0o
    public final Object collect(InterfaceC33723OooO0oO<? super C31080OoooOoo> interfaceC33723OooO0oO, Continuation continuation) {
        Object objCollect = this.f110280OooOo0o.collect(new OooO00o(interfaceC33723OooO0oO, this.f110279OooOo, this.f110282OooOoO0, this.f110281OooOoO), continuation);
        return objCollect == EnumC32485OooO00o.f116726OooOo0o ? objCollect : C32460OooOooO.f116667OooO00o;
    }
}
